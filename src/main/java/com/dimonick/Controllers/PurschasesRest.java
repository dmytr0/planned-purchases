package com.dimonick.Controllers;

import com.dimonick.Entities.Purchase;
import com.dimonick.Services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class PurschasesRest {

    @Autowired
    PurchaseService service;


    @RequestMapping(value="/purchases", method= RequestMethod.GET)
    public Page<Purchase> getAllPurchases(){
        return service.getAllPurchases();
    }


    @RequestMapping(value="/purchase/{id}", method= RequestMethod.GET)
    public Purchase getPurchase(@PathVariable long id){
        return service.getPurchaseById(id);
    }

    @RequestMapping(value="/purchase", method= RequestMethod.POST)
    public Purchase savePurchase(@RequestBody Purchase purchase){
        Purchase saved = service.save(purchase);
        return saved;
    }


    @RequestMapping(value="/purchase/{id}", method= RequestMethod.PUT)
    public Purchase updatePurchase(@PathVariable long id, @RequestBody Purchase purchase){
        return service.update(id, purchase);
    }

    @RequestMapping(value="/purchase/{id}", method= RequestMethod.DELETE)
    public void deletePurchase(@PathVariable long id){
        service.deleteById(id);
    }



}

