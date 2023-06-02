package com.ReactMacOs.ReactMacOs.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocController {
    /*
     * 난수
     * 폴더 - 선택
     * 부모ID값 | ID | 파일명 | 확장자 | 수정된시간 | 태그
     * 0 | 112387213 | gradle | folder | |
     * 112387213 | 23687934 | bin | folder | |
     * 112387213 | 23784623 | build | txt | |
     * ------------------------------------------
     * 폴더 - Detail
     * ID | 파일명 | 확장자 | 수정된시간 | 태그
     * 태그 파일명 확장자 수정일 크기
     * MAC 기준 하위 작업표시줄 느낌
     */

    @RequestMapping(value = "/hellospring", method = RequestMethod.GET)
    public String helloSpring() {
        return "Hello Spring";
    }
}
