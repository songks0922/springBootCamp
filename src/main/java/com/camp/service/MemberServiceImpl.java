package com.camp.service;

import com.camp.mydb.MemberDao;
import com.camp.mydb.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberDao memberDao;

    @Override
    public MemberDto selectMember(String id) {

        MemberDto memberDto = memberDao.selectMember(id);
        return memberDto;
    }
}
