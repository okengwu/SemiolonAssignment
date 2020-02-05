// fig. 2.6 welcome. java 
/* my name is vincent and this was written in april. 
thank you */

public class Vincent1 {
    // heyy hey whats the formatting way
    public static void main(String[] args) {
        System.out.printf("%s%n%s%n","hello weirdo", "you are sleek");
        
        
        
    }

    
	public static String convertToBinary() {
		
		String binary = " ";
		int decimal = 13;
		
		while (decimal > 0) {
			int value = decimal % 2;
			binary = value + "" + binary;
			decimal /= 2 ;
		
		}
		System.out.print(binary);
		System.out.println();
		return binary;
	}

	public static void convertToOctal() {
		
		String store = " ";
		int  octal =  ;
		
		while (octal > 0) {
			int value = octal % 8;
			store = value + " " + store ;
			octal /= 8 ;
		}
		System.out.print(store);
		
	}
		
	}








}