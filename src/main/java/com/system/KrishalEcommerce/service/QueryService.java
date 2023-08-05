package com.system.KrishalEcommerce.service;

import com.system.KrishalEcommerce.entity.Queries;
import com.system.KrishalEcommerce.pojo.QueriesPojo;

import java.util.List;

public interface QueryService {
    List<Queries> fetchAll();

    String save(QueriesPojo queriesPojo);
}
