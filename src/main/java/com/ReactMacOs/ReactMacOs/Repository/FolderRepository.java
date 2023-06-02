package com.ReactMacOs.ReactMacOs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ReactMacOs.ReactMacOs.Entity.FolderEntity;

public interface FolderRepository extends JpaRepository<FolderEntity, Long>, JpaSpecificationExecutor<FolderEntity> {

}
