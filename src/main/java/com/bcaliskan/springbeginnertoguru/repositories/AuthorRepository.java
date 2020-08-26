package com.bcaliskan.springbeginnertoguru.repositories;

import com.bcaliskan.springbeginnertoguru.models.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}