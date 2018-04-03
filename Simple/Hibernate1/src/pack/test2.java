package pack;

import java.util.Iterator;
import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class test2 {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		String hibernateQuery ="select obj from pack.Employee obj where obj.salary>20000";
		Query q=s.createQuery(hibernateQuery);
	List l=q.list();
	Iterator it=l.iterator();
	while(it.hasNext())
	{
		Employee e=(Employee)it.next();
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		
	}
	System.out.println("retrieve");
	String second="select obj.name from pack.Employee obj";
	Query  q1=s.createQuery(second);
	List l1=q1.list();
	Iterator it2=l1.iterator();
	while(it2.hasNext())
	{
		String e1=(String)it2.next();
		System.out.println(e1);
	}
	sf.close();
	s.close();
	}
}
