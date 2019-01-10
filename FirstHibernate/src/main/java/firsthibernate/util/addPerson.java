package firsthibernate.util;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lti.model.Person;
import com.lti.model.PersonData;

/**
 * Servlet implementation class addPerson
 */
public class addPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SessionFactory sf = HibernateUtil.getSessionFactory();
	private Session session;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public SessionFactory getSf() {
		return sf;
	}
	public Session getSession() {
		return session;
	}
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	public addPerson(SessionFactory sf, Session session) {
		super();
		this.sf = sf;
		this.session = session;
	}
	@Override
	public String toString() {
		return "addPerson [sf=" + sf + ", session=" + session + "]";
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addPerson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Person p2 = new Person();
		p2.setName(request.getParameter("name"));
		
		PersonData pd2 = new PersonData();
		pd2.setAadharnum(request.getParameter("aadharnum"));
		pd2.setSalary(Float.parseFloat(request.getParameter("salary")));
		
		p2.setPdetails(pd2); //transientstate-not attached to any session
		
		session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(p2); //persistentstate
		tx.commit();
		session.close();
		
		
	}

}
