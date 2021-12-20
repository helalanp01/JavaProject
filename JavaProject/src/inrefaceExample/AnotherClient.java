package inrefaceExample;

public class AnotherClient implements CallBack {


@Override
public void callBack(int p) {
	
	System.out.println("Another version off callback");
	System.out.println("P square is "+(p*p));
}
}
