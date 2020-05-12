package com.wizarot.studyspringboot.model;

import com.oracle.tools.packager.Log;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j
public class Article {
    private Long id;
    private String author;
    private String title;
    private String content;
    private String createTime;
    private List<Reader> reader;



}
