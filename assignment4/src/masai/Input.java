package masai;

public class Input {

	
	
	
	void number(int n)
	{
		if(n<0)
		{
			System.out.println("Error");
		}
		else if(n%2!=0)
		{
			System.out.println(n);
		}
		else if(n%2==0)
		{
			if(n%10==0)
			{
				System.out.println(n+10);
			}
			else
			{
				while(n%10!=0)
				{
					n++;
				}
				System.out.println(n);
			}
		}

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Input d1 = new Input();
		d1.number(44);
		d1.number(45);
		d1.number(-5);
		
	}

}
