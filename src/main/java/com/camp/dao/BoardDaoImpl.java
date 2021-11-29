package com.camp.dao;

import com.camp.dao.BoardDao;
import com.camp.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardDaoImpl  implements BoardDao {

    private final SqlSessionTemplate session;
    private static String namespace = "com.camp.mapper.BoardMapper";

    @Override
    public void create(BoardVo vo) throws Exception {
        session.insert(namespace+".create", vo);
    }

    @Override
    public BoardVo read(Integer bno) throws Exception {
        return session.selectOne(namespace + ".read", bno);
    }

    @Override
    public void update(BoardVo vo) throws Exception {
        session.update(namespace+".update", vo);
    }


    @Override
    public void delete(Integer bno) throws Exception {
        session.delete(namespace+".delete", bno);
    }

    @Override
    public List<BoardVo> listAll() throws Exception {
        return session.selectList(namespace + ".listAll");
    }

    @Override
    public int updateReviewCnt(Integer bno) throws Exception {
        return session.update(namespace + ".updateReviewCnt", bno);
    }
}