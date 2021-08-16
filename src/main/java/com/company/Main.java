package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char choice;
        String inputString,ls,rs;
        Scanner sc=new Scanner(System.in);
        do{
            choice='!';
            inputString=sc.nextLine();
            int pos=inputString.indexOf('+');
            if(pos!=-1)
            {
                ls=inputString.substring(0,pos);
                rs=inputString.substring(pos+1,inputString.length());
                choice='+';
                System.out.println(IntegerAdd.add(Integer.valueOf(ls),Integer.valueOf(rs)));
            }
            pos=inputString.indexOf('-');
            if(pos!=-1)
            {
                ls=inputString.substring(0,pos);
                rs=inputString.substring(pos+1,inputString.length());
                choice='-';
                System.out.println(IntegerSubtract.subtract(Integer.valueOf(ls),Integer.valueOf(rs)));
            }
        }while (choice=='+'||choice=='-');
        System.out.println("Exiting from calculator");
    }
    public static int performOperationAndReturnResult(String inputString)
    {
        int pos=inputString.indexOf('+');
        String ls,rs;
        if(pos!=-1)
        {
            ls=inputString.substring(0,pos);
            rs=inputString.substring(pos+1,inputString.length());
            return IntegerAdd.add(Integer.valueOf(ls),Integer.valueOf(rs));
        }
        pos=inputString.indexOf('-');
        if(pos!=-1)
        {
            ls=inputString.substring(0,pos);
            rs=inputString.substring(pos+1,inputString.length());
            return IntegerSubtract.subtract(Integer.valueOf(ls),Integer.valueOf(rs));
        }
        return -1;
    }
}
