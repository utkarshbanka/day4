package masai;

public class Demo {

	String s;
	int i;
	float f;
	
	Demo(){
		System.out.println("Demo()");
	}
	
	Demo(String s){
		this();
		System.out.println("Demo(String s)");
	}
	
	Demo(int i){
		this("s");
		System.out.println("Demo(int i)");
	}
	
	Demo(float f){
		this(10);
		System.out.println("Demo(float f)");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Demo(10.2f);
	}

}
