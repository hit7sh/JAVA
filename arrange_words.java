/*
    INPUT: coding is fun.
    OUTPUT: fun coding is
*/

import java.util.Scanner;
class alpodr
{
    static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER A SENTENCE");
        String st=in.nextLine()+" ",wd="",x="";
        int i,j,l=st.length();
        char ch;
        for(i=65;i<91;i++)
        {
            for(j=0;j<l;j++)
            {
            ch=st.charAt(j);
            if(ch!=' ')
            wd+=ch;
            else
            {
                if(wd.charAt(0)==i||wd.charAt(0)==(i+32))
                x+=" "+wd;
                wd="";
            }
        }
    }
        System.out.println(x+"");
    }
}
               
