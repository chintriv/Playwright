import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 122};
		
		for(int i=0; i<arr2.length;i++) {
			
			if(arr2[i] % 2 == 0) {
				//System.out.println(arr2[i]);
				//break;
			}
			else {
				//System.out.println(arr2[i] + " is not multiple of 2");
			
			}
		}
		
		ArrayList<String> a = new ArrayList();
		a.add("chinmay");
		a.add("trivedi");
		a.add("helo");
		//System.out.println(a.get(1));
		
		for(int i=0; i<a.size();i++) {
			//System.out.println(a.get(i) + " test");
		}
		for(String val : a) {
			//System.out.println(val);
		}
		System.out.println(a.contains("hello"));
		String[] name = {"chin", "triv", "test"};
		List<String> nameArrayList = Arrays.asList(name);
		//nameArraryList.
	}
}
