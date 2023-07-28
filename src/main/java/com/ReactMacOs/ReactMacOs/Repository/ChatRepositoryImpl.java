package com.ReactMacOs.ReactMacOs.Repository;

import com.querydsl.core.Tuple;
import java.util.*;
import com.ReactMacOs.ReactMacOs.Entity.QChattingRoomEntity;
import com.ReactMacOs.ReactMacOs.Entity.QChatEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;

public class ChatRepositoryImpl implements ChatRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public ChatRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<Map<String, Object>> selectList() {
        QChattingRoomEntity qChattingRoom = QChattingRoomEntity.chattingRoomEntity;
        QChatEntity qChat = QChatEntity.chatEntity;
        List<Map<String, Object>> chattingRoomList = new ArrayList<>();
        List<Tuple> selectChattingRoomList = jpaQueryFactory
                .select(qChattingRoom.roomid, qChattingRoom.roomname)
                .from(qChattingRoom)
                .fetch();

        for (Tuple row : selectChattingRoomList) {
            Map<String, Object> roomListMap = new HashMap<String, Object>();
            roomListMap.put("roomId", row.get(qChattingRoom.roomid));
            roomListMap.put("roomName", row.get(qChattingRoom.roomname));

            chattingRoomList.add(roomListMap);

            Tuple chatTuple = jpaQueryFactory
                    .select(qChat.chat, qChat.user_id, qChat.user_name, qChat.chat_time, qChat.chatno)
                    .from(qChat)
                    .where(qChat.roomid.eq(row.get(qChattingRoom.roomid)))
                    .orderBy(qChat.chat_time.desc())
                    .fetchFirst();
            if (chatTuple != null) {
                roomListMap.put("userId", chatTuple.get(1, String.class));
                roomListMap.put("userName", chatTuple.get(2, String.class));
                roomListMap.put("chatTime", chatTuple.get(3, Date.class));
                roomListMap.put("chat", chatTuple.get(0, String.class));
                roomListMap.put("chatNo", chatTuple.get(4, Long.class));
            } else {
                roomListMap.put("userId", "");
                roomListMap.put("userName", "");
                roomListMap.put("chatTime", "");
                roomListMap.put("chat", "");
                roomListMap.put("chatNo", "");
            }
        }

        return chattingRoomList;
    }

}
