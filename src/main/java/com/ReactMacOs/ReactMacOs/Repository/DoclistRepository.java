package com.ReactMacOs.ReactMacOs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ReactMacOs.ReactMacOs.Entity.DoclistEntity;

public interface DoclistRepository
        extends JpaRepository<DoclistEntity, Long>, JpaSpecificationExecutor<DoclistEntity>, DoclistRepositoryCustom {

}
