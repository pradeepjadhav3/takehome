import org.testng.annotations.Test;

public class day1 {

	
	@Test(priority=10)
	public void DemoTest()
	
	{
		System.out.println("good");
	}
	
	@Test (priority=1)
	public void DemoTest2()
	{
		System.out.println("Bye");
		
	}
}