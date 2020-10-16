package com.reviewsite.fullstack.reviewsite.repositories;

import com.reviewsite.fullstack.reviewsite.models.Reviews;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Reviews, Long> {
}
