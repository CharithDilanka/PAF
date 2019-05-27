package shanka.springframework.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shanka.springframework.commands.ProductForm;
import shanka.springframework.converters.ProductToProductForm;
import shanka.springframework.domain.Cart;
import shanka.springframework.domain.Product;
import shanka.springframework.services.CartService;
import shanka.springframework.services.ProductService;

public class CartController {
	private CartService cartservice;

//    private ProductToProductForm productToProductForm;

//    @Autowired
//    public void setProductToProductForm(ProductToProductForm productToProductForm) {
//        this.productToProductForm = productToProductForm;
//    }

    @Autowired
    public void setCartService(CartService cartservice) {
        this.cartservice = cartservice;
    }

    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/cart/list";
    }

    @RequestMapping({"/cart/list", "/cart"})
    public String listProducts(Model model){
        model.addAttribute("carts", cartservice.listAll());
        return "cart/list";
    }

    @RequestMapping("/cart/show/{id}")
    public String getProduct(@PathVariable String id, Model model){
        model.addAttribute("cart", cartservice.getById(Long.valueOf(id)));
        return "cart/show";
    }

    @RequestMapping("cart/edit/{id}")
    public String edit(@PathVariable String id, Model model){
        Cart product = cartservice.getById(Long.valueOf(id));
//        ProductForm productForm = productToProductForm.convert(product);

//        model.addAttribute("productForm", productForm);
        return "cart/cartform";
    }

    @RequestMapping("/cart/new/")
    public String newCart(Model model){
        model.addAttribute("cart", new Cart());
        return "cart/";
    }

    @RequestMapping(value = "/cart", method = RequestMethod.POST)
    public String saveOrUpdateProduct(@Valid Cart cart, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "product/";
        }

        Cart savedCart = cartservice.saveOrUpdateProductForm(cart);

        return "redirect:/cart/show/" + savedCart.getcartID();
    }

    @RequestMapping("/cart/delete/{id}")
    public String delete(@PathVariable String id){
        cartservice.delete(Long.valueOf(id));
        return "redirect:/product/list";
    }
}
