abstract class A
{
	abstract void cat();
	abstract void dog();
}
class Cats extends A
{
	public void cat()
	{ 
		System.out.println("hii");
		
	}

	public void dog()
	{ 
		System.out.println("hello");
		
	}
}

 class Dogs extends A
{
	 public void cat()
		{ 
			System.out.println("welcome");
			
		}

		public void dog()
		{ 
			System.out.println("back");
			
		}



}



public class Yash {

	public static void main(String[] args) {
	A obj=new Cats();
	obj.cat();
	obj.dog();
	A obj2=new Dogs();
	obj2.cat();
	obj2.dog();
	}

}
