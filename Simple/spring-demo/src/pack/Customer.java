package pack;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
private Identifier id;


@Autowired
private Address address;

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public Customer(Identifier id) {
	super();
	this.id = id;
}

public Identifier getId() {
	return id;
}

public void setId(Identifier id) {
	this.id = id;
}
public void getInformation()
{
	id.display();
	address.display();
	
	
}
}
