package com.camp.mapper;

import com.camp.dto.MemberDto;

public interface MemberMapper {

    MemberDto selectMember(String id);
}
