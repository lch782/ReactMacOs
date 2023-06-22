package com.ReactMacOs.ReactMacOs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ReactMacOs.ReactMacOs.Service.FolderService;

import com.ReactMacOs.ReactMacOs.Entity.FolderEntity;

@RestController
@RequestMapping("/api/folder")
public class FolderController {
    @Autowired
    FolderService folderService;

    // @PostMapping
    // 새파일 생성 및 업데이트
    @RequestMapping("/createFolder")
    public void createFolder(FolderEntity folderEntity) {
        folderEntity.setFile_name("test");
        folderEntity.setFile_extension("jpg");
        folderEntity.setTag("red");
        folderService.updateFolder(folderEntity);
    }

}
