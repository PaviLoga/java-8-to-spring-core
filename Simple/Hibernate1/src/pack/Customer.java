package pack;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

@DiscriminatorValue(value="c")

public class Customer  extends Person{
private String bankname;

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public Customer(int id, String name, String bankname) {
	super(id, name);
	this.bankname = bankname;
}

public String getBankname() {
	return bankname;
}

public void setBankname(String bankname) {
	this.bankname = bankname;
}

}
