package com.E052.db.Admin.repository;

import com.E052.db.Admin.model.category;
import com.E052.db.Admin.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<product,Integer> {
    @Query("select u from product u where u.category_id =:n")
    public List<product> getAllByName(@Param("n") int id);

    @Query("select p from product p where p.name like %?1%"+"or p.description like %?1%")
    public List<product> findAll(String keyword);

}
