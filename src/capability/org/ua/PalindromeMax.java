package capability.org.ua;

public class PalindromeMax {

	public static void main(String[] args) {
		String str = "WW";
		Boolean isPo = isPalindrome_002(str); 
		System.out.println("str "+ str + " polindrom? " + isPo);

	}
	
	public static boolean isPalindrome_002(String str){
	 int left = 0,		 
	     right = str.length() - 1;
	
	 while(left <right){		 
	   if(str.charAt(left) != str.charAt(right) ){
	      return false;
	    }
	    left++;
	    right--;
	   }
	  return true;
	}
	
}
