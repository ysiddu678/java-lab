package MyPack;
public class Balance 
{
	String name;
    double bal;
    public Balance(String n, double b)      //VJIT     100000
	{
		name = n;
        bal = b;
    }
    public void show()
		 {
		if(bal<0) 
			System.out.print("--> ");
		    System.out.println(name + ": $" + bal);
		}
}