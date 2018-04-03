package pack;

import java.util.List;

public class Bank {
private String bankName;
private List<String> locatipon;
public Bank(String bankName, List<String> locatipon) {
	super();
	this.bankName = bankName;
	this.locatipon = locatipon;
}
public Bank() {
	super();
	// TODO Auto-generated constructor stub
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public List<String> getLocatipon() {
	return locatipon;
}
public void setLocatipon(List<String> locatipon) {
	this.locatipon = locatipon;
}

}
