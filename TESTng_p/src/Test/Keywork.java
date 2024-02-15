package Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywork {
@Test(invocationCount =5)
public static void M1() {
	System.out.println("run M1");
}
@Test(priority =1)
public static void M2() {
	System.out.println("run M2");
}
@Test(enabled=false)
public static void M3() {
	System.out.println("run M3");
}
@Test(enabled=true)
public static void M() {
	System.out.println("run M");
	Reporter.log("run m4",true);
}
}
