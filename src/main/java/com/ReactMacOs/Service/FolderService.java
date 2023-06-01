package com.ReactMacOs.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReactMacOs.Repository.FolderRepository;
import com.ReactMacOs.entity.FolderEntity;

@Service
public class FolderService {

    @Autowired
    FolderRepository folderRepository;

    public void createFolder(FolderEntity folderEntity) {
        folderRepository.saveAndFlush(folderEntity);
    }

}
