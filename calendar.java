
/**
 * This is a java program 
 * to print any year of the Gregorian Calendar.
 * By Hitesh Saini class XII
 * Now in B.Tech 1st sem
 */

import java.util.Scanner;
class calendar
{
    
    int l,yr;
    String[] mt={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String[][][]m=new String[12][6][7];
    
    calendar()
    {
        l=0;
        yr=0;
    }
    
    /*function to get starting day of calendar*/
    int getStart(int yr)
    {   
        int D=6;
        for(int i=1;i<yr;i++)
        {
            if(i==1752)
            D-=11;
            if(isLeapYear(i))
            D+=366;
            else
            D+=365;
        }  
        return D%7;
    }
    
    /*function to check for leap year*/
    boolean isLeapYear(int yr)
    {
        boolean b;

        if(yr%400==0)
        b=true;
        else if(yr%100==0)
        b=false;
        else if(yr%4==0)
        b=true;
        else
        b=false;
        if(yr%100==0&&yr<=1700)
        b=true;
        return b;
    }
    
    /*function to print first line of every month*/
    void printF(int n)
    {   
        System.out.println("____________________________________________________");
        System.out.println();System.out.println("___________( "+mt[n]+" )___________");
        System.out.println("Su\tMo\tTu\tWe\tTh\tFr\tSa");System.out.println();
    }
    
    /*function to fill month*/
    void fillM(String[]x[][],int s,int[]ml)
    {   
        int i=0,j=0,c=0,t=0;
        for(i=0;i<6;i++)
        {
            j=(++t==1)?s:0;
            for(;j<7;j++)
            {
                if(c>=ml[l])
                break;
                x[l][i][j]=++c+"\t";
            }
        }
        l++;
    }
    
    /*function for taking input from the user*/
    void input()
    {
        System.out.println("Hey there! Welcome to this Application :)");
        System.out.println("Please do as directed.");
        Scanner in=new Scanner(System.in);
        System.out.println("________________________");
        System.out.println("Enter any year: ");
        try
        {
            yr=in.nextInt();
        }
        catch(Exception e)
        {
            System.err.println("Error: "+e.getMessage());
        }
        System.out.println("________________________\n\n");
    }
    
    /*function to fill the calender*/
    void fillC()
    {
        int D=getStart(yr),i=1,k=0,c=0,j=0;l=0;
        int ml[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(isLeapYear(yr))
        ml[1]=29;
        c=D-1;
        for(i=0;i<12;i++)
        {
            fillM(m,(c%7)+1,ml);//filling the calendar
            c+=ml[i];
        }
    }
    
    /*function to print the calendar*/
    void printC()
    {
        int i=0,j=0,k=0;
        for(i=0;i<12;i++)
        {
            printF(i);
            for(j=0;j<6;j++)
            {
            for(k=0;k<7;k++)
                if(m[i][j][k]==null)
                System.out.println("\t");
                else 
                System.out.println(m[i][j][k]); 
            System.out.println("\n");
            }   
        } 
        
        System.out.println("___________________________________________________");
        if(isLeapYear(yr))
        {
            System.out.println("\n\nYear "+yr+" is a leap year !!!");
        if(yr%400==0)
        System.out.println("It's also a Century Leap Year !!!");
        }
        else 
        System.out.println("Not a Leap Year");
        System.out.println("Have a nice Day !!");
    }
    
    /*main function*/
    public static void main(String arrgs[])
    {
        calendar ob=new calendar();
        ob.input();
        ob.fillC();
        ob.printC();
    }
}
