package com.reviewsite.fullstack.reviewsite.repositories;

import com.reviewsite.fullstack.reviewsite.models.Categories;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Categories, Long> {
}
