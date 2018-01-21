package org.behrang.examples.springdatarest.repository;

import org.behrang.examples.springdatarest.model.Article;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {
}
