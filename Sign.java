package Sample;

public class Sign {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		if(args.length==0)
		{
			System.out.println("Zero");
		}
		a=Integer.parseInt(args[0]);
		if(a<0)
		{
			System.out.println("Negative");
		}
		else if(a>0)
		{
			System.out.println("Positive");
		}
		else if(args.length!=0)
		{
			System.out.println("Please enter an integer");
		}

	}

}
