import java.util.*;
class Palindrome{
	public static void main(String arg[]){
          
          Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();
          String temp = str;
          int strt =0;
          int end = str.length()-1;
          char ch[] = str.toCharArray();
          char cch[] = temp.toCharArray();
          while(strt<end){

          	char c = ch[strt];
          	ch[strt] = ch[end];
          	ch[end] = c;
          	strt++;
          	end--;
          }

          String res = (cch == ch )?"The Given String is Palindrome" : "The Given String is Not Palindrome";
          System.out.println(res);

	}
}