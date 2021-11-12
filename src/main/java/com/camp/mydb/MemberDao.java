package com.camp.mydb;

import com.camp.mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class MemberDao {


    @Autowired
    private SqlSession sqlSession;

    public MemberDto selectMember(final String id){

        MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);

        MemberDto memberDto = mapper.selectMember(id);

        return  memberDto;
    }
}
