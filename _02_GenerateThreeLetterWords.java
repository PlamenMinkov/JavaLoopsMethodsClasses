import java.util.Scanner;


public class _02_GenerateThreeLetterWords {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] letters = input.next().toCharArray();
        int len=letters.length;
        
                for(int a = 0;a<len;a++){
                    for(int b = 0;b<len;b++){
                        for (int c = 0; c < len; c++) {
                             System.out.printf("%s%s%s ",letters[a],letters[b],letters[c]);
                         }
                     }
                }
        
       
        
        System.out.println();
	}
}
