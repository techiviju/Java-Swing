import java.util.Scanner;
class PassGuess
{  
  static void max(int a,int pass)
 {
    switch(a)
    { 
       case 2:for(int i=0;i<=9;i++)
                   {
                           for(int j=0;j<=9;j++)
                          { 
                               int o[]={i,j};
                               StringBuilder m =new StringBuilder();
                               for(int number:o)
                               {
                                    m.append(number);
                               }
     
                                int y;
                                y=Integer.parseInt(m.toString());
                                if(pass==y)
                                {
                                       System.out.println("password is cr@ck");
                                       System.out.println("password is :- "+y);
                                }
                         }
                     }
             break;
 
      case 3:for(int k=0;k<=9;k++)
                 {
                     for(int i=0;i<=9;i++)
                     {
                           for(int j=0;j<=9;j++)
                          { 
                               int o[]={k,i,j};
                               StringBuilder m =new StringBuilder();
                               for(int number:o)
                               {
                                    m.append(number);
                               }
     
                                int y;
                                y=Integer.parseInt(m.toString());
                                if(pass==y)
                                {
                                       System.out.println("password is cr@ck");
                                       System.out.println("password is :- "+y);
                                }
                         }
                     }
              }
             break;
       case 4:
               for(int l=0;l<=9;l++)
               {  
                 for(int k=0;k<=9;k++)
                 {
                     for(int i=0;i<=9;i++)
                     {
                           for(int j=0;j<=9;j++)
                          { 
                               int o[]={l,k,i,j};
                               StringBuilder m =new StringBuilder();
                               for(int number:o)
                               {
                                    m.append(number);
                               }
     
                                int y;
                                y=Integer.parseInt(m.toString());
                                if(pass==y)
                                {
                                       System.out.println("password is cr@ck");
                                       System.out.println("password is :- "+y);
                                }
                         }
                    }
                  }
              }
             break;
   }
}
public static void main(String str[])
{  
  int a,p;
  Scanner s=new Scanner(System.in);
  System.out.print("Enter your password :- ");
  p=s.nextInt();
  System.out.println("Enter how many digit of password you have to cr@ck :- ");
  a=s.nextInt();
  max(a,p);
  
}  
}  