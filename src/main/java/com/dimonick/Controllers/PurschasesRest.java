package com.dimonick.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurschasesRest {

    @RequestMapping(value="/purchases", method= RequestMethod.GET)
    public String getAllPurchases(){
        return "test";
    }
}
