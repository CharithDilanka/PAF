package shanka.springframework.services;

import shanka.springframework.commands.ProductForm;
import shanka.springframework.domain.Product;

import java.util.List;


public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
