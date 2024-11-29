//QUESION


/*12.THERE ARE TWO CLASS CLS1 AND CLS2 WHICH IS SUBCLASS OF CLS1.
CLS1 HAVING A METHOD "ADD" WHICH ADD TWO NUMBERS. CREATE TWO METHOD INSIDE CLS2 WHICH WILL TAKE 2 PARAMETERS AS INPUT I.E. A AND B AND PRINT THE SUM , MULTIPLICATION AND SUM OF THEIR SQUARES I.E (A^2) + (B^2).
*/


/*
    TEST CASE:
        Input:
            3
            5
        Output:
            8
            15
            34
        
 */


//ANSWER


import java.util.Scanner;
class cls1
{
    void add(int p,int q)
    {
        System.out.println(p+q);
    }
}
class cls2 extends cls1
{
    void mul(int p,int q)
    {
        System.out.println(p*q);
    }
    void task(int p,int q)
    {
      System.out.print((p*p)+(q*q));   
    }
}
public class p12{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    
        cls2 obj=new cls2();
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        //String tilde=sc.next();
        obj.add(a,b);
        obj.mul(a,b);
        obj.task(a,b);
    
    }
}

