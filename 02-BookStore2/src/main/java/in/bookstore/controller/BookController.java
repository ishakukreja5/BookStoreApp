package in.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import in.bookstore.services.BookService;

@Controller
public class BookController {
	@Autowired
  private BookService service;
	@RequestMapping("/")
	public String getHome() {
		return "home";
		
	}
}
