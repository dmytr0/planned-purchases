package com.dimonick.Services;

import com.dimonick.Entities.Purchase;
import com.dimonick.Repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PurchaseService {
    @Autowired
    private PurchaseRepository repository;


    public Purchase getPurchaseById(long id){
        return repository.findOne(id);
    }

    public Page<Purchase> getAllPurchases(){
        Iterable<Purchase> all = repository.findAll();
        List<Purchase> list = new ArrayList<Purchase>();
        for (Purchase purchase : all) {
            list.add(purchase);
        }
        Page<Purchase> result = new PageImpl<Purchase>(list);
        return result;
    }

    public Page<Purchase> getPageblePositions(Pageable pageable){
        if(pageable == null || (pageable.getPageNumber()== 0 && pageable.getPageSize()==20 && pageable.getSort() == null)){
            return getAllPurchases();
        }
        Page<Purchase> all = repository.findAll(pageable);
        return all;
    }

    public Purchase save(Purchase purchase){
        return repository.save(purchase);
    }

    public Purchase update(Long id, Purchase purchase){
        if(id == null || id <= 0) return null;
        Purchase purchaseById = getPurchaseById(id);
        if(purchaseById == null) return null;
        return repository.save(purchase);
    }

    public void deleteById(long id){
        repository.delete(id);
    }
}
