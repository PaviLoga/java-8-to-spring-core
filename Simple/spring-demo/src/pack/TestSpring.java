package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cxt=new ClassPathXmlApplicationContext("beans.xml");
		/*Identifier a=(Identifier)cxt.getBean("b1");
		Identifier id1=(Identifier)cxt.getBean("b2");
	a.display();
id1.display();*/
Customer c=(Customer)cxt.getBean("c1");
c.getInformation();
Bank b=(Bank)cxt.getBean("bank");
System.out.println(b.getLocatipon());
System.out.println(b.getBankName());
	}
}