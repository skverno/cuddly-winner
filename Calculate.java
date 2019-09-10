public class Calculate{
    public static void main(String[] args){
			int firstOperand = Integer.valueOf(args[1]);
			int secondOperand = Integer.valueOf(args[2]);
        	switch (args[0]){
				case -a:

					int result = firstOperand+secondOperand;
					System.out.println("addition: " + firstOperand+" "+secondOperand);
					System.out.println("result: "+result);
					break;
				case -s:
					int result = firstOperand-secondOperand;
					System.out.println("subtraction: "+firstOperand+" "+secondOperand);
					System.out.println("result: "+result);
					break;
				case -m:
					int result = firstOperand*secondOperand;
					System.out.println("multiplication: " + firstOperand+" "+secondOperand);
					System.out.println("result: "+result);
					break;
				case -d:
					int result = firstOperand/secondOperand;
					System.out.println("division: " + firstOperand+" "+secondOperand);
					System.out.println("result: "+result);
					break;
			}
        
    }
}