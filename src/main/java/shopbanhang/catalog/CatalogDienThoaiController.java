package shopbanhang.catalog;

import static org.salespointframework.core.Currencies.EURO;

import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.javamoney.moneta.Money;
import org.salespointframework.inventory.Inventory;
import org.salespointframework.inventory.InventoryItem;
import org.salespointframework.quantity.Quantity;
import org.salespointframework.time.BusinessTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import shopbanhang.catalog.DienThoai.HangTypes;
@Controller
public class CatalogDienThoaiController {
	private static final Quantity NONE = Quantity.of(0);
	private final DienThoaiCatalog catalog;

	private final Inventory<InventoryItem> inventory;

	public CatalogDienThoaiController(DienThoaiCatalog catalog, Inventory<InventoryItem> inventory,
			BusinessTime businessTime) {
		super();
		this.catalog = catalog;
		this.inventory = inventory;
	}
	@GetMapping("/iphones")
	String iphoneCatalog(Model model) {

		model.addAttribute("catalog", catalog.findByHang(HangTypes.IPHONE));
		model.addAttribute("title", "catalog.iphone.title");

		return "catalog";
	}

	@GetMapping("/samsungs")
	String samsungCatalog(Model model) {

		model.addAttribute("catalog", catalog.findByHang(HangTypes.SAMSUNG));
		model.addAttribute("title", "catalog.samsung.title");

		return "catalog";
	}
	
	@GetMapping("/nokias")
	String nokiaCatalog(Model model) {

		model.addAttribute("catalog", catalog.findByHang(HangTypes.NOKIA));
		model.addAttribute("title", "catalog.nokia.title");

		return "catalog";
	}
	@GetMapping("/oppos")
	String oppoCatalog(Model model) {

		model.addAttribute("catalog", catalog.findByHang(HangTypes.OPPO));
		

		return "catalog";
	}
	@GetMapping("/xiaomis")
	String xiaomiCatalog(Model model) {

		model.addAttribute("catalog", catalog.findByHang(HangTypes.XIAOMI));
		

		return "catalog";
	}
	@GetMapping("/dienthoai/{dienthoai}")
	String detail(@PathVariable DienThoai dienthoai, Model model) {

		Optional<InventoryItem> item = inventory.findByProductIdentifier(dienthoai.getId());
		Quantity quantity = item.map(InventoryItem::getQuantity).orElse(NONE);

		model.addAttribute("dienthoai", dienthoai);
		model.addAttribute("quantity", quantity);
		model.addAttribute("orderable", quantity.isGreaterThan(NONE));

		return "detail";
	}
	
	@GetMapping("/xoasp/{id}")
//	 @PreAuthorize("hasRole('boss')") 
	String xoa(@PathVariable("id")InventoryItem inven) {
		
//	catalog.xoaSP(dienthoai.getId().toString());

		inventory.delete(inven);
		catalog.delete((DienThoai)inven.getProduct());
		return "redirect:/stock";
	}
	@GetMapping("/edit/{id}")
	String edit(@PathVariable ("id") DienThoai dienthoai, Model model) {

		
		
		

		model.addAttribute("dienthoai", dienthoai);
		

		return "Edit";
	}
	@PostMapping("/edit/{id}")
	String editNew(@PathVariable("id") DienThoai dt , @Valid DienThoaiForm form, Errors result) {
		HangTypes a = null;
		if(form.getHang().toString().equals("IPHONE")) { a=HangTypes.IPHONE; }
		  if(form.getHang().toString().equals("SAMSUNG")) { a=HangTypes.SAMSUNG; }
		  if(form.getHang().toString().equals("OPPO")) { a=HangTypes.OPPO; }
		  if(form.getHang().toString().equals("XIAOMI")) { a=HangTypes.XIAOMI; }
		  if(form.getHang().toString().equals("NOKIA")) { a=HangTypes.NOKIA; }	
		  System.out.println(a.toString());
		dt.setHang(a);
		dt.setHinhAnh(form.getHinhAnh());
		dt.setName(form.getName());
		dt.setMoTa(form.getMoTa());
		dt.setPrice(Money.of(Integer.parseInt(form.getPrice()),EURO));
		catalog.save(dt);
		
		
		//InventoryItem iven=new InventoryItem(dt,Quantity.of(Integer.parseInt(form.getSoLuong())));
//		inventory.deleteById(iven.getId());
		//inventory.save(iven);

		return "redirect:/stock";
	}
	

	@PostMapping("/themdienthoai")
	String registerNew(@Valid DienThoaiForm form, Errors result) {

		
		
		  System.out.println(form.getHang()); HangTypes a = null;
		  if(form.getHang().toString().equals("IPHONE")) { a=HangTypes.IPHONE; }
		  if(form.getHang().toString().equals("SAMSUNG")) { a=HangTypes.SAMSUNG; }
		  if(form.getHang().toString().equals("OPPO")) { a=HangTypes.OPPO; }
		  if(form.getHang().toString().equals("XIAOMI")) { a=HangTypes.XIAOMI; }
		  if(form.getHang().toString().equals("NOKIA")) { a=HangTypes.NOKIA; }
		 
		DienThoai b = new DienThoai(form.getHinhAnh(), form.getMoTa(), form.getName(), Money.of(Integer.parseInt(form.getPrice()), EURO) ,a,Integer.parseInt(form.getSoLuong()));
		catalog.save(b);
		inventory.save(new InventoryItem(b,Quantity.of(Integer.parseInt(form.getSoLuong()))));

		return "redirect:/";
	}
	@GetMapping("/themdienthoai")
//	@PreAuthorize("hasRole('boss')") 
	String register(Model model, DienThoaiForm form) {
		model.addAttribute("form", form);
		return "Add";
	}
	
	
	

}
