package String;

public class A3RemoveVowels {

	public static void main(String[] args) {
		A3RemoveVowels rv=new A3RemoveVowels();
        System.out.println(rv.removeVowels("Vedanti"));
            
    }
    private String removeVowels(String str) {
        
        char[] charArray = str.toCharArray();
        String returnStr = "";
        
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
                    || charArray[i] == 'u') {
                charArray[i] = ' ';    
            }
        }
        for (char c : charArray) {
            if (c != ' ')
                returnStr += c;
        }
        return returnStr;

	}

}
