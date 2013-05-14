package name.felixbecker.brokenaop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BrokenAspect {
	
//	@Pointcut(value="execution(* name.felixbecker.brokenaop..*(..))")
	@Pointcut(value="execution(* *(..))")
	public void allMethods() {}
	
	@Before("allMethods()")
	public void logAllMethodEnters() {
		System.out.println("BrokenAspect: Method enter!");
	}


}
