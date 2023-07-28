package com.ReactMacOs.ReactMacOs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ReactMacOs.ReactMacOs.Entity.ChattingRoomEntity;

public interface ChatRepository
        extends JpaRepository<ChattingRoomEntity, Long>, JpaSpecificationExecutor<ChattingRoomEntity>,
        ChatRepositoryCustom {

}
