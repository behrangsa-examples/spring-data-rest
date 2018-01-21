package org.behrang.examples.springdatarest.repository;

import org.behrang.examples.springdatarest.model.Tag;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TagRepository extends PagingAndSortingRepository<Tag, Long> {
}
