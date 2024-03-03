package com.company;

public class CWH_PracticeSet5 {
    public static void main(String[] args) {
//      1. printing star pattern
//        for(int i=1;i<=5;i++){
//            for(int j=5;j>=i;j--) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        2. sum of first even natural no. using for & while loop
//        int n=10;
//        int sum=0;
//        for(int i=0;i<=n;i++)
//        {
//            if(i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//                        OR
        int n=10;
        int sum=0;
        int i=0;
        while(i<=n){
            if(i%2==0)
                sum+=i;
            i++;
        }
        System.out.println(sum);

//        3. Multiplication table of a number n
//        int n=2;
//        for(int i=1;i<=10;i++){
//            System.out.println("2*"+i +"="+2*i);
//        }

//        4. Multiplication table of 10 in reverse
//        int n=10;
//        for(int i=10;i>=1;i--){
//            System.out.println(10*i);
//        }

//        5. Factiorial of given no.
//        int n=10;
//        int fact=10;
//        for(int i=n-1;i>=1;i--){
//            fact=fact*i;
//        }
//        System.out.println(fact);
//                   OR
//        int n=5;
//        int i=1;
//        int fact=1;
//        while(i<=n){
//            fact*=i;
//            i++;
//        }
//        System.out.println(fact);

//        6. Repeat 5 using While loop
//        int n=5;
//        while(true){
//            System.out.println(n);
//        }

//        7. repeat 1 using for loop

//        8. Can you do the same thing of 'for' loop with 'while' loop--->true

//        9. write the sum of numbers occuring in the multiplication table of 8
//        int sum=0;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("8*" + i + "=" + 8 * i);
//            sum+=(8*i);
//        }
//        System.out.println("Sum of no. occuring in table 8 is:"+sum);
    }
}
