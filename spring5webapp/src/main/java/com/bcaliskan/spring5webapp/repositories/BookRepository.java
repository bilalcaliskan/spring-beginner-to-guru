package com.bcaliskan.spring5webapp.repositories;

import com.bcaliskan.spring5webapp.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}