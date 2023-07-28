package com.ReactMacOs.ReactMacOs.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "chattingroom")
public class ChattingRoomEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /*
     * @GeneratedValue = 기본 키를 자동 생성해주는 어노테이션
     * strategy 속성으로 자동 생성 전략을 지정
     * IDENTITY 전략 - 기본 키 생성을 데이터베이스에 위임
     * SEQUENCE 전략 - 유일한 값을 순서대로 생성
     */
    @Id
    @Column(name = "roomid", nullable = false)
    private long roomId;

    @Column(name = "roomname", nullable = false)
    private String roomName;

    @Column(name = "user_id")
    private String userId;
}
