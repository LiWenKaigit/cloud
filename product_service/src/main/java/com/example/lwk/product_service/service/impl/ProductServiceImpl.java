package com.example.lwk.product_service.service.impl;

import com.example.lwk.product_service.domain.Product;
import com.example.lwk.product_service.service.ProductSercive;
import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements ProductSercive {

    private  static  final Map<Integer,Product> daoMap = new HashMap<>();

    static  {

        Product p1 = new Product(1,"洗衣机",3000,10);
        Product p2 = new Product(2,"冰箱",2000,20);
        Product p3 = new Product(3,"电话",300,10);
        Product p4 = new Product(4,"电视机",3500,10);
        Product p5 = new Product(5,"iPhone",9000,10);
        Product p6 = new Product(6,"空调",4000,10);
        Product p7 = new Product(7,"扫地机",500,10);
        Product p8 = new Product(8,"衣柜",1000,10);
        Product p9 = new Product(1,"书柜",200,10);
        Product p10 = new Product(1,"书桌",150,10);
        daoMap.put(p1.getId(),p1);
        daoMap.put(p2.getId(),p2);
        daoMap.put(p3.getId(),p3);
        daoMap.put(p4.getId(),p4);
        daoMap.put(p5.getId(),p5);
        daoMap.put(p6.getId(),p6);
        daoMap.put(p7.getId(),p7);
        daoMap.put(p8.getId(),p8);
        daoMap.put(p9.getId(),p9);
        daoMap.put(p10.getId(),p10);
    }

    @Override
    public List<Product> listProduct() {
        Collection<Product> collection =  daoMap.values();
        List<Product> list = new ArrayList<>(collection);
        return list;
    }

    @Override
    public Product findById(int id) {

        return daoMap.get(id);
    }
}
