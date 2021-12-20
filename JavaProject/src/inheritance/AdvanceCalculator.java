package inheritance;

public class AdvanceCalculator extends Calculator {
@Override
public Integer Add(Integer a,Integer b) {
	if(a==null||b==null) {
		System.out.println("Argument cant be null");
		return 0;	
	}
	return a+b;
	
}
}
