package com.wizarot.studyspringboot.controller;


import com.wizarot.studyspringboot.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {

    //增加一篇Article ，使用POST方法
    @RequestMapping(value = "/articles", method = RequestMethod.POST, produces = "application/json")
    public AjaxResponse saveArticle(@RequestBody Article article) {
        log.info("saveArticle: {}", article);
        return AjaxResponse.success(article);
    }

    //删除Article Delete方法
    @RequestMapping(value = "/articles/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public AjaxResponse deleteArticle(@PathVariable Long id) {
        log.info("deleteArticle:{}", id);
        return AjaxResponse.success(id);
    }

    //修改article方法PUT
    @RequestMapping(value = "/articles/{id}", method = RequestMethod.PUT, produces = "application/json")
    public AjaxResponse putArticle(@PathVariable Long id, @RequestBody Article article) {
        article.setId(id);
        log.info("updateArticle:{},{}", id, article);
        return AjaxResponse.success(id);
    }

    // 获取id对应GET
    @RequestMapping(value = "/articles/{id}", method = RequestMethod.GET, produces = "application/json")
    public AjaxResponse getArticle(@PathVariable Long id) {
        return AjaxResponse.success(Article.builder().id(id).author("Wizarot").title("游戏制作123").content("深入浅出进行游戏制作").createTime(new Date().toString()).build());
    }

}
