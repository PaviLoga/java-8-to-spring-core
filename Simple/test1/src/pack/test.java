package pack;
@FunctionalInterface
interface Add
{
public int getadd(int a,int b);	
}

public class test {
	public static void main(String[] args) {
		
		Add a1=(a,b)-> a+b;
		System.out.println(a1.getadd(5,6));
	}

}
