package code;
import java.lang.reflect.Constructor;
public class RefectionDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		Class emp = Class.forName("code.Employee");
		Constructor[] cons = emp.getConstructors();
		for (Constructor con : cons) {
			System.out.println(con);
		}
	}
}
