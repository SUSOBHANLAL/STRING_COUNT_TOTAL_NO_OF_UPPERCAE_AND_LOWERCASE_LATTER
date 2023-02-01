package find_the_no_of_uppercase_and_lower_case_latter;

public class susobhan {
	public static void main(String args[]) {
		String s = "SusOBhan";
		int n= s.length();
		int arr1[]= new int[90];
		int j=0;
		for(int i =0;i<n;i++) {
			arr1[j]= s.charAt(i);
			j++;
			
		}
//		int finalcount=0;
//		int finalno=0;
		int count=0;
		int no=0;
		for(int k=0;k<j;k++) {
			
			if(arr1[k]>=65 && arr1[k]<=90 ) {
				count++;
			}
			if(arr1[k]>=97 && arr1[k]<=122 ) {
				no++;// count gradually incrase 1 then when loop end it will be 0, then again 1 end of the lop it 
			}
//			finalcount+=count;
//			finalno+=no;
			
		}
		System.out.print("totalno of upper case  "+count+"  "+"total no of lowercase lower  "+no);
		
	}

}
