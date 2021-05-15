package com.company.domain.store.inventory.service;

import com.company.domain.store.inventory.model.Product;
import com.company.domain.store.inventory.model.Store;
import com.company.domain.store.inventory.repository.ProductRepository;
import com.company.domain.store.inventory.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventoryService {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    ProductRepository productRepository;

    public List<Store> getAllStores() {
        List<Store> storeList = new ArrayList<>();
        storeRepository.findAll().forEach(storeList::add);
        return storeList;
    }

    public List<Product> getAllProductsInStore(Integer storeId) {
        return productRepository.getProductsByStoreId(storeId);
    }


}
