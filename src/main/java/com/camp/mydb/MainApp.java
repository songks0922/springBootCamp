package com.camp.mydb;

import com.camp.service.MemberService;
import com.camp.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    @Autowired
    private static MemberService memberService;
    public static void main(String[] args) {

        MemberDto dto = memberService.selectMember("id1");

        System.out.println(dto.getName());
    }

}
