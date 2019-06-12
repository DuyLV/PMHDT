package shopbanhang.order;

import java.util.Optional;

import org.salespointframework.order.Cart;
import org.salespointframework.order.Order;
import org.salespointframework.order.OrderManager;
import org.salespointframework.order.OrderStatus;
import org.salespointframework.payment.Cash;
import org.salespointframework.quantity.Quantity;
import org.salespointframework.useraccount.UserAccount;
import org.salespointframework.useraccount.web.LoggedIn;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import shopbanhang.catalog.DienThoai;



@Controller
@PreAuthorize("isAuthenticated()")
@SessionAttributes("cart")
public class OderController {
	private final OrderManager<Order> orderManager;

	

	public OderController(OrderManager<Order> orderManager) {

		Assert.notNull(orderManager, "OrderManager must not be null!");
		this.orderManager = orderManager;
	}


	@ModelAttribute("cart")
	Cart initializeCart() {
		return new Cart();
	}

	
	@PostMapping("/cart")
	String addDienThoai(@RequestParam("pid") DienThoai dt, @RequestParam("number") int number, @ModelAttribute Cart cart) {
		
		int amount = number <= 0 || number > 5 ? 1 : number;

		
		cart.addOrUpdateItem(dt, Quantity.of(amount));


		switch (dt.getHang()) {
		/*
		 * case IPHONE: return "redirect:/"; case SAMSUNG: return "redirect:samsungs";
		 * case OPPO: return "redirect:oppos"; case XIAOMI: return "redirect:xiaomis";
		 * case NOKIA:
		 */
			default:
				return "redirect:/";
		}
	}

	@GetMapping("/cart")
	String basket() {
		return "cart";
	}


	@PostMapping("/checkout")
	String buy(@ModelAttribute Cart cart, @LoggedIn Optional<UserAccount> userAccount) {

		return userAccount.map(account -> {

			
			Order order = new Order(account, Cash.CASH);

			cart.addItemsTo(order);

			orderManager.payOrder(order);
			orderManager.completeOrder(order);

			cart.clear();

			return "redirect:/";
		}).orElse("redirect:/cart");
	}

	@GetMapping("/orders")
	@PreAuthorize("hasRole('BOSS')")
	String orders(Model model) {

		model.addAttribute("ordersCompleted", orderManager.findBy(OrderStatus.COMPLETED));

		return "orders";
	}
	@GetMapping("/deleteCart/{id}")
	String delete(@ModelAttribute Cart cart,@PathVariable("id") String id) {
		cart.removeItem(id);
		
		return "redirect:/cart";
		
	}
	@PostMapping("/updateCart/{id}")
	String updateCart(@ModelAttribute Cart cart,@PathVariable("id") String id,@RequestParam("idProduct") DienThoai dt,@RequestParam("quantity") int number){
		cart.removeItem(id);
		int amount = number <= 0 || number > 5 ? 1 : number;
		cart.addOrUpdateItem(dt, amount);
		return "redirect:/cart";
		
	}

}
