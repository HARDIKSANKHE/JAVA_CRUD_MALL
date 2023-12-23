package com.hardik.mall.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hardik.mall.entity.shop;

import com.hardik.mall.repository.shoprepository;




@Service
public class shopservice {
	@Autowired
	
    shoprepository shoprepository;
    public shop save(shop shop) {
        return shoprepository.save(shop);
}
    public shop getshop(int Id) {
        return shoprepository.findById(Id).get();
    }
 

public shop updateshop(int id,shop shop) {
shop emps=shoprepository.findById(id).get();
emps.setshopname(shop.getshopname());
emps.setshopdet(shop.getshopdet()); 
emps.setshopowner(shop.getshopowner());
return shoprepository.save(emps); 
}
public String delete(int id)
{
shoprepository.deleteById(id);
return "Entity deleted" +id;
}
public List<shop> getshoplist()
{
return shoprepository.findAll();
}
public shoprepository getshopRepository() {
return shoprepository;
}
public void setshopRepository(shoprepository shoprepository) {
this.shoprepository = shoprepository;
}
}

