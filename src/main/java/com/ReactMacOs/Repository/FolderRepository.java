package com.ReactMacOs.Repository;

import com.ReactMacOs.entity.FolderEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FolderRepository extends JpaRepository<FolderEntity, Long>, JpaSpecificationExecutor<FolderEntity> {

}
