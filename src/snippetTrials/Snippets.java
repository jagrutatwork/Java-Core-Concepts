
package snippetTrials;

public class Snippets {
	
	public static void foo(int a)
	{
		System.out.print(a%10);
		
		if(a%10 != 0) {
			foo(a/10);
		}
		
		System.out.print(a%10);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo(1234);

	}

}
