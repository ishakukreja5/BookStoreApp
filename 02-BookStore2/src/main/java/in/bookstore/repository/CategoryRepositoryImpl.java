package in.bookstore.repository;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.bookstore.session.SessionManager;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository{
   @Autowired
	private SessionManager manager;
    private Session ses;
    public CategoryRepositoryImpl() {
    	ses=manager.getSession();
    }

}
