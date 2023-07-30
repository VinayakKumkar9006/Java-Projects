package maccess;

public class DemoException3 {

	@SuppressWarnings({"RawTypes","Deprecation"})
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,IllegalAccessException {
		Class c = Class.forName("test.Display");
		//loading class at runtime
		test.Display ob = (test.Display)c.newInstance();
		//created object for class loaded at runtime
        ob.dis(123);
	}

}
