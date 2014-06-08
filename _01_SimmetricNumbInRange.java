import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class _01_SimmetricNumbInRange {

	public static ArrayList<Integer> myNumbers(int num)    {
	    ArrayList<Integer> digits = new ArrayList<Integer>();	    
			while (num>0) {
				digits.add(num%10);
				num/=10;				
			}		
	    return(digits);
	 }
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		List<Integer> dig = new ArrayList<Integer>();
		
		if(b<a){
			int mask=b;
			b=a;
			a=mask;
		}
		for (int i = a; i <=b; i++) {		
			dig=myNumbers(i);
			int count=dig.size()/2;
			boolean tr=true;
			
			for (int j = 0; j <=count; j++) {
				if(dig.get(j)!=dig.get(dig.size()-(j+1))){
					tr=false; break;
				}
			}
			if(tr==true) System.out.print(i+" ");
		}
		
		
	}

}
