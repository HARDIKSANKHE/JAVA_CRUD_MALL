package com.hardik.mall.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hardik.mall.entity.shop;
@Repository
public interface shoprepository extends JpaRepository<shop,Integer> {

}





