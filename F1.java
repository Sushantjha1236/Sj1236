import java .util.*;
class lc
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("enter sentence");
        String str1= Sc.nextLine();
        String nstr="";
        str1=str1.toLowerCase();
        char st;
        int l=str1.length();
        for(int i=0;i<l;i++)
        {
            char ch= str1.charAt(i);
            if(ch==' ')
            {
                st=str1.charAt(i+1);
                nstr=nstr+" "+Character.toUpperCase(st);
                i++;
                continue;
            }
            else
            {
                nstr=nstr+ch;
            }
        }
        System.out.println(str1);
        System.out.println(nstr);
    }
}
