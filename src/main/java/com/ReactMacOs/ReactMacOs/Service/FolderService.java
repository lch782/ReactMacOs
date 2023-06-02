package com.ReactMacOs.ReactMacOs.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReactMacOs.ReactMacOs.Repository.FolderRepository;
import com.ReactMacOs.ReactMacOs.Entity.FolderEntity;

@Service
public class FolderService {

    @Autowired
    FolderRepository folderRepository;

    public void updateFolder(FolderEntity folderEntity) {
        folderRepository.saveAndFlush(folderEntity);
    }

}
