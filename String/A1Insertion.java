package String;

public class A1Insertion {

	public static void main(String[] args) {
		 String str1="VedantiBadre";
	        String str2= "Nitin";
	        int index = 6;
	        
	        String f=new String();
	        
	        for(int i=0;i<str1.length();i++) {
	            f=f+str1.charAt(i);
	            if(i==index) {
	                f=f+str2;
	            }
	        }
	        System.out.println(f);




	}

}
