package com.camp.service;

import com.camp.vo.BoardVo;

import java.util.List;

public interface BoardService {
    void regist(BoardVo board) throws Exception;
    BoardVo read(Integer bno) throws Exception;
    void modify(BoardVo board) throws Exception;
    void remove(Integer bno) throws Exception;
    List<BoardVo> listAll() throws Exception;
    int updateReviewCnt(Integer bno) throws Exception;
}
