/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{

    public static final int[] table = new int[60];

    static {
        table[0]=0;
        table[1]=1;
        for(int i=2;i<table.length;i++){
            table[i]=(table[i-1]+table[i-2])%10;
        }
    }

    public static void main(String[] args) throws java.lang.Exception {

        Scanner scanner = new Scanner(System.in);

        //ignore first line
        if(scanner.hasNext()) {
            scanner.next();
        }

        while (scanner.hasNext()) {
            final long input = scanner.nextLong();

            long i=1;
            while(i<=input){
                i *= 2;
            }
            i = i/2%60;
            System.out.println(table[((int)i) - 1]);
        }
    }
}
