package com.dimonick.Repository;


import com.dimonick.Entities.Purchase;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PurchaseRepository extends PagingAndSortingRepository<Purchase, Long> {
}
