package shopbanhang.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import shopbanhang.catalog.DienThoai.HangTypes;

@Controller
public class IndexController {
	private final DienThoaiCatalog catalog;
	@GetMapping("/")
	public String LoadIndex(Model model)
	{
		model.addAttribute("iphone", catalog.findByHang(HangTypes.IPHONE));		
		model.addAttribute("samsung", catalog.findByHang(HangTypes.SAMSUNG));
		model.addAttribute("nokia", catalog.findByHang(HangTypes.NOKIA));
		model.addAttribute("oppo", catalog.findByHang(HangTypes.OPPO));
		model.addAttribute("xiaomi", catalog.findByHang(HangTypes.XIAOMI));
		

		return "index";
		
	}
	public IndexController(DienThoaiCatalog catalog) {
		super();
		this.catalog = catalog;
	}
}
