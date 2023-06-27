package com.ReactMacOs.ReactMacOs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ReactMacOs.ReactMacOs.Entity.DoclistEntity;
import com.ReactMacOs.ReactMacOs.Service.DoclistService;

@RestController
@RequestMapping("/api/doc")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DocController {
    @Autowired
    DoclistService doclistService;

    @GetMapping("TestList")
    public List<DoclistEntity> docListSelect2() {
        return doclistService.selectList();
    }

    @PostMapping("selectList")
    public List<DoclistEntity> docListSelect() {
        return doclistService.selectList();
    }

    @PostMapping("insertList")
    public void docListInsert(DoclistEntity doclistEntity) {
        doclistService.insertList(doclistEntity);
    }

}
