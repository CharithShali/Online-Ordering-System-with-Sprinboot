package com.E052.db.Admin.repository;

import com.E052.db.Admin.model.customerorder;
import com.E052.db.Admin.model.order_customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<customerorder,Integer> {
    @Query("select u from customerorder u where u.customer_id =:n")
    public List<customerorder> getAllByCustom(@Param("n") int name);

    @Query("SELECT u.id,o.method,o.address,o.price,o.status from  customerorder o JOIN User u on o.customer_id=u.id" )
    public List<order_customer> getAllByJoin();
}
