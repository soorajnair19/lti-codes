package com.lti.misc;
import java.util.List;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class RunTestcalc {
public static void main(String args[])
{
Result result = JUnitCore.runClasses(TestCalc.class);
List<Failure> failures = result.getFailures();
System.out.println("list of failures");
for(Failure failure: failures)
{
System.out.println(failure);	
}


}
}
