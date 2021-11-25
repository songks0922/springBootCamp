package com.camp.service;

import com.camp.dao.MemberDao;
import com.camp.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberDao memberDao;

    public MemberDto selectMember(String id) {

        MemberDto memberDto = memberDao.selectMember(id);
        return memberDto;
    }
}
