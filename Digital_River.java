// Subhankar Sen
import java.util.*;
class Digital_River
{
   public static void main(String args[])
   {
       Digital_River obj=new Digital_River();
       Scanner in=new Scanner(System.in);
       System.out.println("Enter a no.:");
       int n=in.nextInt();
       System.out.println("OUTPUT");
       if(obj.river(n,1)==true)
       System.out.println("Number "+n+" belongs to the river of 1");
       else
       if(obj.river(n,3)==true)
       System.out.println("Number "+n+" belongs to the river of 3");
       else
       if(obj.river(n,9)==true)
       System.out.println("Number "+n+" belongs to the river of 9");
       else
       System.out.println("Number "+n+" does not belong to any of the rivers!!!");

    }
    public boolean river(int n,int rv) // method to check whether a no. belongs of any of the 3 number rivers, ie , rivers of 1,3 or 9
    {
        int f=0;
        while(rv<=n)
        {
            rv=rv+sum(rv);
            if(rv==n)
            {
                f++;
                break;
            }
        }
        if(f>0)
        return true;
        else
        return false;
    }
    public int sum(int x)
    {
        int s=0;
        while(x!=0)
        {
            s=s+(x%10);
            x/=10;
        }
        return s;
    }
}

/* OUTPUT
Enter a no.:
620

OUTPUT
Number 620 belongs to the river of 1

 */
       