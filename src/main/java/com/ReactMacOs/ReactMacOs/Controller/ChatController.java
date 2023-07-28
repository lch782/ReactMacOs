package com.ReactMacOs.ReactMacOs.Controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ReactMacOs.ReactMacOs.Service.ChatService;

import com.ReactMacOs.ReactMacOs.Entity.ChattingRoomEntity;
import com.ReactMacOs.ReactMacOs.Entity.ChatEntity;

@RestController
@RequestMapping("/api/chat")
public class ChatController {
    @Autowired
    ChatService chatService;

    // @PostMapping
    // 새파일 생성 및 업데이트
    @RequestMapping("/selectList")
    public List<Map<String, Object>> selectList() {
        return chatService.selectList();
    }

}
