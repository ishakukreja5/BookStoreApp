package in.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.bookstore.services.BookService;
import in.bookstore.services.CategoryService;

@Controller
public class CategoryController {
	@Autowired
  private CategoryService service;
}
