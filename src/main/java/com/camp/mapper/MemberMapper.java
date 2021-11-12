package com.camp.mapper;

import com.camp.mydb.MemberDto;

public interface MemberMapper {

    MemberDto selectMember(String id);
}
