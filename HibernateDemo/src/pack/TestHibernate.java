package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

public static void main(String[] args) {
	Configuration c=new Configuration();
	c.configure();
	SessionFactory sf=c.buildSessionFactory();
	Session s=sf.openSession();
	/*Transaction tx=s.beginTransaction();
	Employee e=new Employee(1111, "Vikram", 35000);
	s.save(e);
	tx.commit();*/
	Employee e=(Employee)s.get(Employee.class,1111);
	System.out.println("Id="+e.getId()+",name ="+e.getName()+",salary="+e.getSalary());
	s.close();
	sf.close();
	System.out.println("DONE");
	
	
}
}
