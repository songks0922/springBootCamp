package com.camp.persistence;

import com.camp.dao.BoardDao;
import com.camp.dto.BoardVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class BoardDaoImpl  implements BoardDao {

    @Inject
    private SqlSession session;
    private static String namespace = "com.camp.BoardDao";

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
}