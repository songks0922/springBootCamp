package com.camp.service;

import com.camp.dao.BoardDao;
import com.camp.dto.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Component
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

//    @Inject
//    private BoardDao dao;
    private final BoardDao dao;

    @Override
    public void regist(BoardVo board) throws Exception {
        dao.create(board);
    }

    @Override
    public BoardVo read(Integer bno) throws Exception {
        return dao.read(bno);
    }

    @Override
    public void modify(BoardVo board) throws Exception {
        dao.update(board);
    }

    @Override
    public void remove(Integer bno) throws Exception {
        dao.delete(bno);
    }

    @Override
    public List<BoardVo> listAll() throws Exception {
        return dao.listAll();
    }
}
