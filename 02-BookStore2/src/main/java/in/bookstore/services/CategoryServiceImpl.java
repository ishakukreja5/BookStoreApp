package in.bookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bookstore.repository.BookRepository;
import in.bookstore.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
	private CategoryRepository repo;
}
