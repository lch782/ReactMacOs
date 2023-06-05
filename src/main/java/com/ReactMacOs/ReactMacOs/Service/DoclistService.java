package com.ReactMacOs.ReactMacOs.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReactMacOs.ReactMacOs.Repository.DoclistRepository;
import com.ReactMacOs.ReactMacOs.Entity.DoclistEntity;

@Service
public class DoclistService {

    @Autowired
    DoclistRepository doclistRepository;

    /*
     * public void updateList(DoclistEntity doclistEntity) {
     * 
     * }
     */
    public List<DoclistEntity> selectList() {
        return doclistRepository.findAll();
    }
}
