package edu.wctc.fullstack.repository;


import edu.wctc.fullstack.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
