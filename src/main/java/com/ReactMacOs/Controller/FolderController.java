package com.ReactMacOs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ReactMacOs.Service.FolderService;
import com.ReactMacOs.entity.FolderEntity;

@RestController
public class FolderController {
    @Autowired
    FolderService folderService;

    @PostMapping("/test/test.do")
    public void createFolder(FolderEntity folderEntity) {
        System.out.println("Hi");
        folderEntity.setFile_name("test");
        folderEntity.setFile_extension("jpg");
        folderEntity.setTag("red");
        folderService.createFolder(folderEntity);
    }
}
