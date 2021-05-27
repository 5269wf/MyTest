package com.example.demo.dal.repository;

import com.example.demo.dal.entity.PrdPotentialUid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PrdPotentialUidRepository extends JpaRepository<PrdPotentialUid, Long>, JpaSpecificationExecutor<PrdPotentialUid> {

}