package in.bookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bookstore.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
	private BookRepository repo;
}
