package com.camp.service;

import com.camp.dto.BoardVo;

import java.util.List;

public interface BoardService {
    public void regist(BoardVo board) throws Exception;
    public BoardVo read(Integer bno) throws Exception;
    public void modify(BoardVo board) throws Exception;
    public void remove(Integer bno) throws Exception;
    public List<BoardVo> listAll() throws Exception;
}
