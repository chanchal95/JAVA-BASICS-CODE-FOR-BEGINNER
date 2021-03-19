import java.util.*;
class Swap{
    public static void main(String arg[]){
        
    Scanner  sc = new Scanner(System.in);
    String str = sc.nextLine();
    char ch[] = str.toCharArray();
    int end = str.length()-1;
    int strt = 0;
    while(strt<end){
        
        char temp = ch[strt];
        ch[strt] = ch[end];
        ch[end] = temp;
        strt++; end--;
        
    }
    System.out.println(ch);
    
        
    }
}