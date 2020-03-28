import java.util.HashMap;
import java.util.Map;


public class Test {

static	{
		System.out.println("static");
	}

{
	System.out.println("init");
}
	Test() {
		System.out.println("const");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main");
new Test();

Map m = new HashMap();

System.out.println(10 + (4/2) - 1);

	}

}
