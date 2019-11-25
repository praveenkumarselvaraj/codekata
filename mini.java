import java.util.*;
class mini
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
       // String s=sc.nextLine();
        int a[]=new int[arv.length];
        for(int i=0;i<arv.length;i++)
        {
            a[i]=Integer.parseInt(arv[i]);
        }
       Arrays.sort(a);
       System.out.print(a[0]);
    }
}

