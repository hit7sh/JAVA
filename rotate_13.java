
/* 
    Rotate 13 is an encryption technique
    in this, 'a' will become 'a'+13 i.e 'n' and 'z' will become z+13 i.e 'm' and so on.
    */


import java.util.Scanner;
class rot13
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String st,st1="";
        char ch;
        int i,l;
        System.out.println("Enter String");
        st=in.nextLine();
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch<78&&ch>64)
            st1+=(char)(ch+13);
            else if(ch<110&&ch>96)
            st1+=(char)(ch+13);
            else if((ch>78&&ch<91)||(ch>110&&ch<124))
            st1+=(char)(ch-13);
            else
            st1+=ch;
        }
        System.out.println(st1);
    }
}
