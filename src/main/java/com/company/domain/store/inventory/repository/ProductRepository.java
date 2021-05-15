package com.company.domain.store.inventory.repository;

import com.company.domain.store.inventory.model.Product;
import graphql.schema.DataFetcher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> getProductsByStoreId(Integer storeId);
}
