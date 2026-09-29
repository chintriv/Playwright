
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = "Chinmay";
		String s3 = "Chinmay";
		
		String s = new String("Hello Welcome Again");
		
		String[] splitstring = s.split("Welcome");
		//System.out.println(splitstring[0]);
		//System.out.println(splitstring[1].trim());
		//System.out.println(splitstring[2]);
		for(int i=0; i<s.length();i++) {
			//System.out.println(s.charAt(i)); //all letters vertically
			
		}
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i)); //all letters vertically in reverse
			
		}
	}

}
