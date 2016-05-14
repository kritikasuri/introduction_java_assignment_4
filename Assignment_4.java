
public class calculation {
	public static void main(String[] args) {
		 int x=5, y=10, expr_value1=0, expr_value2=0, expr_value3=0, expr_value4=0;
		 
		 expr_value1 = x + y * 2;
		 System.out.println("The value of the expression 1 is : "+expr_value1);
		 
		 expr_value2 = x - y + 2;
		 System.out.println("The value of the expression 2 is : "+expr_value2);
		 
		 expr_value3 = (x + y) * 2;
		 System.out.println("The value of the expression 3 is : "+expr_value3);
		 
		 expr_value4 = y % x;
		 System.out.println("The value of the expression 4 is : "+expr_value4);		 
	}
}
