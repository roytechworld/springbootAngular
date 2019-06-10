package com.roytechworld.service;

import java.util.List;

import com.roytechworld.entity.Article;


public interface IArticleService {
     List<Article> getAllArticles();
     Article getArticleById(int articleId);
     boolean addArticle(Article article);
     void updateArticle(Article article);
     void deleteArticle(int articleId);
}
