package com.bcaliskan.spring5webapp.repositories;

import com.bcaliskan.spring5webapp.models.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}