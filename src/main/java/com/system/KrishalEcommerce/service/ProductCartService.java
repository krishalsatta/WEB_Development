package com.system.KrishalEcommerce.service;

import com.system.KrishalEcommerce.entity.ProductCart;
import com.system.KrishalEcommerce.pojo.ProductCartPojo;

import java.util.List;

public interface ProductCartService {
    List<ProductCart> fetchAll();

    ProductCartPojo save(ProductCartPojo productCartPojo);

    ProductCart fetchOne(Integer id);

    void deleteFromCart(Integer id);

    String updateQuantity(ProductCart productCart);

    List<ProductCart> fetchAll(Integer id);
}
