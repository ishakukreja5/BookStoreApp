package in.bookstore.repository;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.bookstore.session.SessionManager;

@Repository
public class BookRepositoryImpl implements BookRepository{
	@Autowired
	private SessionManager manager;
    private Session ses;
    public BookRepositoryImpl() {
    	ses=manager.getSession();
    }

}
