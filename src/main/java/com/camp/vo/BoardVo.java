package com.camp.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BoardVo {
    private Integer bno;
    private String title;
    private String content;
    private String writer;
    private Date create_date;
    private int viewcnt;
}
