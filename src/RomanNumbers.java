import java.util.HashMap;

/**
 * Given a string with roman numbers, Convert it to int. 
 * @author chandru
 *
 */
public class RomanNumbers {
	
	static HashMap<Character, Integer > lookup= new HashMap<Character, Integer>(){{
        put('I',1);
        put('V',5);
        put('X',10);
        put('L',50);
        put('C',100);
        put('D',500);
        put('M',1000);
    }};
    
    public static void main(String[] args) {

    	int value = ToInteger("XC");
    	System.out.println(value);
    	
    	value = ToInteger("III");
    	System.out.println(value);

    	value = ToInteger("X");
    	System.out.println(value);

    	value = ToInteger("IX");
    	System.out.println(value);

    	value = ToInteger("CX");
    	System.out.println(value);

    	value = ToInteger("MCC");
    	System.out.println(value);

    	
    }

	private static int ToInteger(String input) {
		int result = 0;
		int previous = 0;
		if(input.length() == 0){
			return result;
		}
		if (input.length() == 1){
			return lookup.get(input.charAt(0));
		}
		
		result = lookup.get(input.charAt(input.length() -1));
		previous = result;
		
		
		for(int x = input.length() - 2 ; x >= 0; x--){
			int value = lookup.get(input.charAt(x));
			if (value < previous){
				result = result - value;
			} else {
				result = result + value;
			}
			previous = value;
		}
		 
		
		return result;
		
	}
	
	

}
