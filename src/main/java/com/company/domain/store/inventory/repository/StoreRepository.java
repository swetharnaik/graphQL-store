package com.company.domain.store.inventory.repository;

import com.company.domain.store.inventory.model.Store;
import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends CrudRepository<Store, Integer> {

}
