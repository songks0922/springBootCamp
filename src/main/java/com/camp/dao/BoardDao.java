package com.camp.dao;

import com.camp.vo.BoardVo;

import java.util.List;

public interface BoardDao {

    void create(BoardVo vo) throws Exception;
    BoardVo read(Integer bno) throws Exception;
    void update(BoardVo vo) throws Exception;
    void delete(Integer bno) throws Exception;
    List<BoardVo> listAll() throws Exception;
    int updateReviewCnt(Integer bno) throws Exception;
}
