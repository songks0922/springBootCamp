package com.camp.controller;

import com.camp.dto.BoardVo;
import com.camp.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;


@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/")
public class BoardController {


    private final BoardService service;

    @RequestMapping(value= "/listAll", method = RequestMethod.GET)
    public void listAll(Model model)throws Exception {
        model.addAttribute("list",service.listAll());
    }

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public String registPOST(BoardVo board, RedirectAttributes rttr) throws Exception {
        service.regist(board);
        return "redirect:/listAll";
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public void read(@RequestParam("bno")int bno, Model model) throws Exception{
        model.addAttribute(service.read(bno));
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public void modifyGET(int bno, Model model) throws Exception {
        model.addAttribute(service.read(bno));
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modifyPOST(BoardVo board, RedirectAttributes rttr) throws Exception {
        service.modify(board);
        return "redirect:/listAll";
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public String removePOST(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
        service.remove(bno);
        return "redirect:/listAll";
    }
}
