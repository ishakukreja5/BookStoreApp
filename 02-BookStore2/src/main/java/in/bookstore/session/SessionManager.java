package in.bookstore.session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
@Component
public class SessionManager {
     private SessionFactory factory;
    private Session ses;
    @Autowired
    public SessionManager(SessionFactory factory) {
	this.factory=factory;
	ses=this.factory.openSession();
    }
    public Session getSession() {
    	return ses;
    }
}
