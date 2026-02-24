package com.kaizizhou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestParam {
    private String name;
    private String gender;
    private LocalDate begin;
    private LocalDate end;
    private Integer page;
    private Integer pageSize;
}
