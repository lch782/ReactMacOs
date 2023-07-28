package com.ReactMacOs.ReactMacOs.Service;

import java.io.IOException;
import java.util.*;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.ReactMacOs.ReactMacOs.Repository.ChatRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.ReactMacOs.ReactMacOs.DTO.ChatRoom;
import com.ReactMacOs.ReactMacOs.Entity.ChattingRoomEntity;

@Slf4j
@RequiredArgsConstructor
@Service
public class ChatService {
    private final ObjectMapper objectMapper;
    private Map<String, ChatRoom> chatRooms;

    @PostConstruct
    private void init() {
        chatRooms = new LinkedHashMap<>();
        List<Map<String, Object>> test = selectList();
        for (Map<String, Object> map : test) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String roomId = "";
                String roomName = "";
                // 값에 대한 처리 로직을 작성합니다.
                if (key == "roomId") {
                    roomId = value.toString();
                }
                if (key == "roomName") {
                    roomName = (String) value;
                }
                ChatRoom chatRoom = ChatRoom.builder()
                        .roomId(roomId)
                        .name(roomName)
                        .build();
                chatRooms.put(roomId, chatRoom);
            }
        }
    }

    @Autowired
    ChatRepository chatRepository;

    public List<Map<String, Object>> selectList() {
        return chatRepository.selectList();
    }

    public ChatRoom findRoomById(String roomId) {
        return chatRooms.get(roomId);
    }

    public <T> void sendMessage(WebSocketSession session, T message) {
        try {
            session.sendMessage(new TextMessage(objectMapper.writeValueAsString(message)));
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
    }
}
