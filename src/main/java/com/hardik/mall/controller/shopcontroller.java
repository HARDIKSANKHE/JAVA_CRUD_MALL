package com.hardik.mall.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hardik.mall.entity.shop;
import com.hardik.mall.service.shopservice;

@RestController
@RequestMapping("/shopping")

public class shopcontroller {
	  @Autowired
	    shopservice shopservice;

	    public shopservice getshopservice() {
	        return shopservice;
	    }

	    public void setshopservice(shopservice shopservice) {
	        this.shopservice = shopservice;
	    }
	    @PostMapping("/create")
	    public shop addshop (@RequestBody shop shop) {
	    return shopservice.save(shop);
}
	   
	    @GetMapping(path="/{id}")
	    public shop getshop(@PathVariable int id)
	    {
	    return shopservice.getshop(id); 
	    }

	  //http://localhost:8071/shops/id -PUT
	    @PutMapping(path="/{id}") 
	    public shop updateshop(@RequestBody shop shop,@PathVariable int id)
	    {
	    return shopservice.updateshop(id,shop); 
	    }
	    //http://localhost:8071/shops/2 -DELETE
	    @DeleteMapping(path="/{id}")
	    public String deleteshop(@PathVariable int id)
	    {
	    return shopservice.delete(id); 
	    }
	    //http://localhost:8071/shops GET
	    @GetMapping
	    public List<shop> getAllshop()
	    {
	    return shopservice.getshoplist();
	    }
	  
}

