package com.camp.controller;

import com.camp.dto.MemberDto;
import com.camp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/loginResultView/{id}")
    public String loginTestResult(@PathVariable String id, Model model){

        MemberDto dto = memberService.selectMember(id);

        model.addAttribute("member", dto);

        return "loginResultView";
    }
}