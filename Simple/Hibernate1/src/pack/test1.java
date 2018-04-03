package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class test1 {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		Criteria c=s.createCriteria(Employee.class);
		c.add(Restrictions.between("id", 101, 102));
		c.add(Restrictions.gt("salary", 20000.0));
		List l=c.list();
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Employee e=(Employee)it.next();
			System.out.println("id= "+e.getId()+" name= "+e.getName()+" salary= "+e.getSalary());
			s.close();
			sf.close();
		}
	}

}
