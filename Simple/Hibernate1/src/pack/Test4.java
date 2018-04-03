package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test4 {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Person p=new Person(101,"Raj");
		Customer c=new Customer(102,"Raja","HDFC");
		Student s1=new Student(103,"Rahul","A");
		s.save(p);
		s.save(c);
		s.save(s1);
		tx.commit();
		s.close();
		sf.close();
	}

}
