package com.system.KrishalEcommerce.service;

import com.system.KrishalEcommerce.entity.Products;
import com.system.KrishalEcommerce.pojo.ProductsPojo;

import java.io.IOException;
import java.util.List;

public interface ProductsService {

    String save(ProductsPojo productsPojo) throws IOException;

    List<Products> fetchAll();

    Products fetchById(Integer id);

    void deleteById(Integer id);

}
