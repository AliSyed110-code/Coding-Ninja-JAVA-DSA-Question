package Recursion_2;

public class Replace_Character_Recursively {

 public static String replaceCharacter(String input, char c1, char c2) {
	 if(input.length()==0) {
		 return input;
	 }
	 if(input.length() == 0){
         return "";
     }
     
     char c;
     if(input.charAt(0)==c1){
         c=c2;
     }
     else{
         c= input.charAt(0);
     }
     
     String ans = replaceCharacter(input.substring(1), c1, c2);
     return (c+ans); 
 }
 
	
	public static void main(String[] args) {
		

		String input = "abcad";
		char c1 = 'a';
		char c2 = 'x';
		System.out.println(replaceCharacter(input, c1, c2));
				
		
	}

}
