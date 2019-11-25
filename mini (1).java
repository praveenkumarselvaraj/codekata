import java.util.*;
class mini
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split(" ");
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        b[i]=Integer.parseInt(a[i]);
        Arrays.sort(b);
        for(int i=0;i<b.length;i++)
        System.out.println(b[i]);
    }
}

