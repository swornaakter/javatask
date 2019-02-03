package newpack;

public class MultiplicationTwoHeightNumber {

	 public static void main(String args[]) {
	        int integer[] = {10, 15, 7, 9, 12, 4}, i, first_max = integer[0],second_max = 0,result;
	       
	        for (i = 0; i < 6; i++) {
	            if (first_max < integer[i]) {
	                first_max = integer[i];
	            }
	        }
	        System.out.println("First maximum= " + first_max);
	        for (i = 0; i < 6; i++) {
	            if ((first_max > integer[i]) && (second_max < integer[i])) {
	                second_max = integer[i];
	            }
	        }
	        System.out.println("second maximum= " + second_max);
	        result=first_max*second_max;
	        System.out.println("Multiplication of two heighest number= " + result);
	        
	    }
	
	
}
