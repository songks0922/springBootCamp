package com.camp.mapper;

import com.camp.dto.BoardVo;

import java.util.List;

public interface BoardMapper {
    void create(BoardVo vo) throws Exception;
    BoardVo read(Integer bno) throws Exception;
    void update(BoardVo vo) throws Exception;
    void delete(Integer bno) throws Exception;
    List<BoardVo> listAll() throws Exception;
}
