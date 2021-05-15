package com.company.domain.store.inventory.fetchers;

import com.company.domain.store.inventory.model.Store;
import com.company.domain.store.inventory.repository.ProductRepository;
import com.company.domain.store.inventory.repository.StoreRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GraphQLDataFetcher {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    ProductRepository productRepository;

    public DataFetcher getStores() {
        return dataFetchingEnvironment -> {
            List<Store> storeList = new ArrayList<>();
            storeRepository.findAll().forEach(storeList::add);
            return storeList;
        };
    }

    public DataFetcher getProductsInStores() {
        return dataFetchingEnvironment -> {
          Store store = dataFetchingEnvironment.getSource();
          return productRepository.getProductsByStoreId(store.getId());
        };
    }
}
