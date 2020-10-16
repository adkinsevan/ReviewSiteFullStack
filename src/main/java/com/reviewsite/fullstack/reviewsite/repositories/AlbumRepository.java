package com.reviewsite.fullstack.reviewsite.repositories;

import com.reviewsite.fullstack.reviewsite.models.Albums;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Albums, Long> {
}
