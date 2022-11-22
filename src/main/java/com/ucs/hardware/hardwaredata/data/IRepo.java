package com.ucs.hardware.hardwaredata.data;

import com.ucs.hardware.hardwaredata.model.AmostragemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepo extends JpaRepository<AmostragemEntity, Long> {

    @Query(value = "SELECT * FROM amostragem", nativeQuery = true)
    List<AmostragemEntity> selectAll();

    @Query(value = "SELECT * FROM amostragem ORDER BY id DESC limit 1", nativeQuery = true)
    AmostragemEntity findLastOne();

}
