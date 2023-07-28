package com.ReactMacOs.ReactMacOs.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "chat")
public class ChatEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /*
     * @GeneratedValue = 기본 키를 자동 생성해주는 어노테이션
     * strategy 속성으로 자동 생성 전략을 지정
     * IDENTITY 전략 - 기본 키 생성을 데이터베이스에 위임
     * SEQUENCE 전략 - 유일한 값을 순서대로 생성
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chatno", nullable = false)
    private long chatno;

    @Column(name = "roomid", nullable = false)
    private long roomid;

    @Column(name = "chat", nullable = false)
    private String chat;

    @Column(name = "user_id", nullable = false)
    private String user_id;

    @Column(name = "user_name", nullable = false)
    private String user_name;

    @Column(name = "chat_time", nullable = false)
    private Date chat_time;

}
