package in.bookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bookstore.repository.BookRepository;
import in.bookstore.repository.PublisherRepository;

@Service
public class PublisherServiceImpl implements PublisherService{
    @Autowired
	private PublisherRepository repo;
}
