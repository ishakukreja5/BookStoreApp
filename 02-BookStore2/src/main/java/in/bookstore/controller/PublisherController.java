package in.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.bookstore.services.BookService;
import in.bookstore.services.PublisherService;

@Controller
public class PublisherController {
	@Autowired
  private PublisherService service;
}
