package com.ReactMacOs.ReactMacOs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

    @PostMapping("selectList")
    public List<DoclistEntity> docListSelect() {
        return doclistService.selectList();
    }
}
