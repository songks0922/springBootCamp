package com.camp.dao;

import com.camp.dto.BoardVo;

import java.util.List;

public interface BoardDao {

    public void create(BoardVo vo) throws Exception;
    public BoardVo read(Integer bno) throws Exception;
    public void update(BoardVo vo) throws Exception;
    public void delete(Integer bno) throws Exception;
    public List<BoardVo> listAll() throws Exception;

}
