package shanka.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import shanka.springframework.domain.Product;

public interface CartRepository extends CrudRepository<Product, Long> {

}
