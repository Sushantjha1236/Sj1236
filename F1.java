import java .util.*;
class lc
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("enter sentence");
        String str= Sc.nextLine();
        String nstr="";
        str=str.toLowerCase();
        char st;
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch= str.charAt(i);
            if(ch==' ')
            {
                st=str.charAt(i+1);
                nstr=nstr+" "+Character.toUpperCase(st);
                i++;
                continue;
            }
            else
            {
                nstr=nstr+ch;
            }
        }
        System.out.println(str);
        System.out.println(nstr);
    }
}
