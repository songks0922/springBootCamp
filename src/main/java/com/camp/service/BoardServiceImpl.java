package com.camp.service;

import com.camp.dao.BoardDao;
import com.camp.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

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

    @Override
    public int updateReviewCnt(Integer bno) throws Exception {
        return dao.updateReviewCnt(bno);
    }
}
