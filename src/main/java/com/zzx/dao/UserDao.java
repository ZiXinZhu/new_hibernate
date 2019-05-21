package com.zzx.dao;

import com.zzx.entity.GirlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao extends JpaRepository<GirlEntity, String>, JpaSpecificationExecutor<GirlEntity> {

    @Query(nativeQuery = true, value = "SELECT * FROM  girl where girl.age=?1 and girl.cup_size=?2")
    List<GirlEntity> all(int age,String cupSize);

    @Query(nativeQuery = true, value = "SELECT * FROM  girl where girl.age=?1")
    List<GirlEntity> one(int age);

}
