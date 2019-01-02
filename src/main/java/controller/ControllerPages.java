package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.CategoryService;
import service.ProductService;

/**
 *
 * @author TVD
 */
@Controller
//@RequestMapping(value = "")
public class ControllerPages {

//	@Autowired
//	private CategoryService categoryService;
//	@Autowired
//	private ProductService productService;

	@RequestMapping(value = {"", "/index" }, method = RequestMethod.GET)
	public String viewHome(ModelMap mm) {
//		mm.put("listCategory", categoryService.getAll());
//		mm.put("listProductFeatured", productService.getListFeatured(4));
//		mm.put("listProductSale", productService.getListSale(4));
		return "client.index";
	}

	@RequestMapping(value = "shop", method = RequestMethod.GET)
	public String viewShop(ModelMap mm) {

		return "client.shop";
	}
	
	@RequestMapping(value = "checkout", method = RequestMethod.GET)
	public String viewCheckout(ModelMap mm) {

		return "client.checkout";
	}
	
	@RequestMapping(value = "success", method = RequestMethod.GET)
	public String viewSuccesst(ModelMap mm) {

		return "client.success";
	}
	
	@RequestMapping(value = "cart", method = RequestMethod.GET)
	public String viewCart(ModelMap mm) {

		return "client.cart";
	}

	@RequestMapping(value = "contact", method = RequestMethod.GET)
	public String viewContact(ModelMap mm) {

		return "client.contact";
	}

	@RequestMapping(value = "single", method = RequestMethod.GET)
	public String viewSingle(ModelMap mm) {

		return "client.single";
	}

	@RequestMapping(value = "content", method = RequestMethod.GET)
	public String viewContent(ModelMap mm) {

		return "client.content";
	}
	@RequestMapping(value = {"categorylist"}, method = RequestMethod.GET)
	public String viewProduct(ModelMap mm) {
		return "admin.categorylist";
	}
	
	@RequestMapping(value = {"categoryform"}, method = RequestMethod.GET)
	public String viewCategoryform(ModelMap mm) {
		return "admin.categoryform";
	}
	
	@RequestMapping(value = {"acontent"}, method = RequestMethod.GET)
	public String viewadminContent(ModelMap mm) {
		return "admin.content";
	}
	
	@RequestMapping(value = {"login"}, method = RequestMethod.GET)
	public String viewLogin(ModelMap mm) {
		return "admin.login";
	}
	
	@RequestMapping(value = {"productform"}, method = RequestMethod.GET)
	public String viewproductform(ModelMap mm) {
		return "admin.productform";
	}
	
	@RequestMapping(value = {"productlist"}, method = RequestMethod.GET)
	public String viewproductlist(ModelMap mm) {
		return "admin.productlist";
	}
	@RequestMapping(value = {"receiptitemlist"}, method = RequestMethod.GET)
	public String viewReceiptlist(ModelMap mm) {
		return "admin.receiptitemlist";
	}
}
