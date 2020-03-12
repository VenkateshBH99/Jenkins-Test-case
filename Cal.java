import java.util.Scanner;
public class Cal{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		float n=5;
          float n1=0;
          int ch=0;
          float n2=0;
		
              /*System.out.println("enter ur next number:");
               n1=sc.nextInt();*/
			System.out.println("1.Addition '+'\n2.Substraction '-'\n3.Multiplication '*'\n4.Division '/'\n5.Exit");
            
            System.out.print("enter ur choice:");
             ch=1;
            switch(ch){
            	case 1: System.out.println("enter ur next number:");
               n1=8;
                       n2=n;
            	       n=n+n1;
            	       System.out.println(n2+"+"+n1+"="+n);
            	       break;
            	 case 2:System.out.println("enter ur next number:");
               n1=sc.nextFloat();
                         n2=n; 
                         n=n-n1;
                         System.out.println(n2+"-"+n1+"="+n);
            	         break;
            	  case 3: System.out.println("enter ur next number:");
               n1=sc.nextFloat();
                       n2=n;
                      n=n*n1;
                        System.out.println(n2+"*"+n1+"="+n);
            	        break;
            	   case 4: System.out.println("enter ur next number:");
               n1=sc.nextFloat();
                      n2=n;
                      n=n/n1;
                      System.out.println(n2+"/"+n1+"="+n);
            	        break;
            	    case 5: break;
            	    default: break;

            }
            
            
		
		System.out.println("ur Final answer is:"+n);

	}
}