package com.camp.service;

import com.camp.dao.MemberDao;
import com.camp.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberDao memberDao;

    public MemberDto selectMember(String id) {

        MemberDto memberDto = memberDao.selectMember(id);
        return memberDto;
    }
}
