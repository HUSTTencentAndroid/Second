package tttt.demo;

import java.util.Scanner;

public class LearningTest2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


        System.out.println("请输入一个十六进制数");
        String s1=input.nextLine();

        int n=s1.length();
        int i,t,m,s2,j;
        int x=0;
        char key;
        s1=s1.toUpperCase();

        for (i=0;i<=n-1;i++){
            key=s1.charAt(i);
            if (key <='F' && key>='A')
               t=(int)key-55;
            else
               t=(int)key-48;

            m=n-i-1;s2=1;
            for (j=1;j<=m;j++)
                s2*=16;
            x=x+s2*t;
        }

        System.out.println(x);


    }
}
