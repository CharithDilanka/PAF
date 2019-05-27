package shanka.springframework.services;

import java.util.List;

import shanka.springframework.commands.ProductForm;
import shanka.springframework.domain.Cart;
import shanka.springframework.domain.Product;

public interface CartService {
	List<Cart> listAll();

    Cart getById(Long id);

    Cart saveOrUpdate(Cart cart);

    void delete(Long id);

    Cart saveOrUpdateProductForm(Cart cart);
}
