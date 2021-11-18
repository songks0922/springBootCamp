package com.camp.dao;

import com.camp.dto.MemberDto;
import com.camp.mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {

    // xml로  바로 처리 가능
    @Autowired
    private SqlSession sqlSession;

    public MemberDto selectMember(final String id){

        MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);

        MemberDto memberDto = mapper.selectMember(id);

        return  memberDto;
    }
}
