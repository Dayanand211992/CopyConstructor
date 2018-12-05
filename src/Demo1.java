class Emp
{
   public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
int id;
   String name;
   Emp(Emp e)
   {
	   id=e.id;
	   name=e.name;
   }
   void Display()
   {
	   
	   System.out.println("id"+id);
	   System.out.println("nam="+name);
   }
   

}
public class Demo1 
{
  public static void main(String[] args) 
  {
	  Emp e=new Emp(1,"A");
	  e.Display();
	  Emp e1=new Emp(e);
	  e1.Display();
	  e1.id=2;
	  e1.name="B";
	  e1.Display();
}
}
