package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test5 {
public static void main(String[] args) {
	SessionFactory sf=HibernateUtility.getSessionFactory();
	Session s=sf.openSession();
	Criteria c=s.createCriteria(Person.class);
	List l=c.list();
	Iterator it=l.iterator();
	while(it.hasNext())
	{
		Person p=(Person)it.next();
		if(p instanceof Customer)
		{
			Customer c1=(Customer)p;
			System.out.println("Id= " +c1.getUid()+" Name= "+c1.getName()+" Bankname= "+c1.getBankname());
			
		}
		else if(p instanceof Student)
		{
			Student s1=(Student)p;
			System.out.println("Id= " +s1.getUid()+" Name= "+s1.getName()+" Grades= "+s1.getGrade());
			
		}
		else 
		{
			System.out.println("Id= " +p.getUid()+" Name= "+p.getName());
		}
	}
	s.close();
	sf.close();
}
}
