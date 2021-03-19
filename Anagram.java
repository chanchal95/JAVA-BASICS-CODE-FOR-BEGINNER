import java.util.*;
class Anagram{
	public static void main(String arg[]){

		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int n1 = str1.length();
		int n2 = str2.length();
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
           if(n1 != n2){
           	System.out.println("This Is Not Anagram");
           	return ;
           }
           int ascii1 =0;
           int ascii2 = 0;
		for(int i=0; i<n1; i++){
             
              ascii1 = ascii1^(ch1[i] - 0);
              ascii2 = ascii2^(ch2[i] - 0);

		}
		String res = (ascii2 == ascii1)?"Sting is Anagram":"String is Not Anagram";
        System.out.println(res);

	}
}