import java.util.Scanner;

public class StrBuiler{
    public static void main (String[] args) {
        
        // same as String and save time... 
        StringBuilder sb=new StringBuilder("Vijay");
        System.out.println(sb);
    
    /*
        // print chat in sb .. at index 0 // V
        System.out.println(sb.charAt(0));
        
        //set chat at index 0
        sb.setCharAt(0,'A');
        System.out.println(sb);
        
        //Insert first extra 
        sb.insert(0,'C');
        System.out.println(sb);
        */
        // insert extra
        sb.insert(1,'V');
        System.out.println(sb);
        
        
        
        // deteting extra StringBuilder
        sb.delete(1,3); // V i
        System.out.println(sb);
        
        // append means add lasrt ...
        sb.append(" A chaudhari");
        System.out.println(sb);
        System.out.println("length = "+sb.length());
        
    }
}


							// REVERCE STRING IN BUILDER
/*

public class StrBuilder{
    public static void main (String[] args) {
        StringBuilder sb=new StringBuilder("vijay");
       
								//EASY
				sb.reverse();
				System.out.println(sb);
 /*
              //		using array hard 
	int i;
        for(i=0;i<sb.length()/2;i++)
        {
            int front =i;
            int back=sb.length() -1 -i; //5-1-0
            
            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);
            
            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);
        }
        System.out.println(sb);
*/
    }
}
*/

//StringBuilder capacity() method check capacity default is 16
//StringBuilder ensureCapacity() method like (old capa)16*2+2=34