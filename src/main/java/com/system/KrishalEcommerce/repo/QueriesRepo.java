package com.system.KrishalEcommerce.repo;

import com.system.KrishalEcommerce.entity.Queries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueriesRepo extends JpaRepository<Queries, Integer> {

}
