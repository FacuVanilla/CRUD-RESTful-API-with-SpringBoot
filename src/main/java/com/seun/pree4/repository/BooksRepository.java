package com.seun.pree4.repository;


import com.seun.pree4.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
