package tw.Jacky.tags;

public class JackyFunctions {
	public static String sayHello(String name)
	{
		return "Hello,"+name;
	}
	
	public static String sayHello(String... names)
	{
		String ret = null;
		for(String name:names)
		{
			ret +=String.format("Hello %s <br>", name);
		}
		return ret;
	}
}
