package com.bcaliskan.springbeginnertoguru.repositories;

import com.bcaliskan.springbeginnertoguru.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}