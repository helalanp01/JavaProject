package inrefaceExample;

public class Client implements CallBack {
public void callBack(int p) {
	System.out.println("Called back Call with "+p);
}
void nonifacemth() {
	System.out.println("Classes that implements interface"+"may also define other members,too.");
}
}
