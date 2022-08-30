package com.E052.db.Admin.repository;

import com.E052.db.Admin.model.brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface BrandRepository extends JpaRepository<brand,Integer> {
    @Transactional
    @Modifying
    @Query("update brand c set c.name = ?1,c.description=?2 where c.id = ?3")
    int updatebrand(String name, String descriprion,int id);

}
