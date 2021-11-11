package com.camp.mydb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        MemberDAO memberDAO = (MemberDAO)context.getBean("memberDAO");
        System.out.println("The record count is " + memberDAO.getRowCount());
        context.close();
    }

}
