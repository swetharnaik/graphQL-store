package com.company.domain.store.inventory;

import com.company.domain.store.inventory.model.Product;
import com.company.domain.store.inventory.model.Store;
import com.company.domain.store.inventory.service.GraphQLService;
import com.company.domain.store.inventory.service.InventoryService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Controller {

    @Autowired
    InventoryService inventoryService;

    @Autowired
    GraphQLService graphQLService;

    @GetMapping("stores")
    public ResponseEntity<List<Store>> getAllStores() {
        return new ResponseEntity<>(inventoryService.getAllStores(), HttpStatus.OK);
    }

    @GetMapping("store/{storeId}")
    public ResponseEntity<List<Product>> getProductsInStore(@PathVariable Integer storeId) {
        return new ResponseEntity<>(inventoryService.getAllProductsInStore(storeId), HttpStatus.OK);
    }

    @PostMapping("graphql")
    public ResponseEntity<?> getAllData(@RequestBody String query) {
        ExecutionResult executionResult = graphQLService.graphQL().execute(query);
        return new ResponseEntity<>(executionResult, HttpStatus.OK);
    }
}
