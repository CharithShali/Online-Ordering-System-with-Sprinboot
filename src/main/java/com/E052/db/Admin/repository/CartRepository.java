package com.E052.db.Admin.repository;

import com.E052.db.Admin.model.cart;
import com.E052.db.Admin.model.category;
import com.E052.db.Admin.model.product;
import com.E052.db.client.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<cart, Integer> {
    @Query("select u from cart u where u.customer_id =:n")
    public List<cart> getAllByName(@Param("n") int id);
}
