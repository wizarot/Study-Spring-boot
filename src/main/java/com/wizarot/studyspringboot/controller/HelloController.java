package com.wizarot.studyspringboot.controller;

import com.wizarot.studyspringboot.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {

        return "Hello world! 中文你好.";
    }

    @RequestMapping("/article")
    public Article article() {
        Article art1 = Article.builder().author("wiz").id(1L).title("Java学习").build();
//        Article art2 = Article.builder().author("字母哥1").id(2L).build();
//        log.info("测试article:{}",art2);
        return art1;
    }
}
