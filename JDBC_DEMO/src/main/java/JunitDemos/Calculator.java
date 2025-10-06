package JunitDemos;
import java.util.List;

public class Calculator {
	public int add(int x , int y) {
		return x + y;
	}
	public int sub(int x , int y) {
		return x - y;
		
	}
	public int mul(int x,int y)
	{
		return x*y;
	}
	public int div(int x,int y)
	{
		return x/y;
	}
	public int nameCount(List<String> names) {
		return names.size();
		
	}
	public String greetUsers(String msg) {
		return msg;
	}

}
