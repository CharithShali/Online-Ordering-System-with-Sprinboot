package com.E052.db.Admin.repository;

import com.E052.db.Admin.model.category;
import com.E052.db.Admin.model.product;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<category,Integer> {

    @Query("select u from product u where u.category_id =:n")
    public List<product> getAllBycategory(@Param("n") int name);

}
