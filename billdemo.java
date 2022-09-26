package com.company;

import java.util.Scanner;

public class billdemo {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Total unit =  ");
        double unit = x.nextDouble();
        double bill = 0;
        double sum;
        if(unit<=50){
            bill= unit*3.75;
        }
        else if (unit<=75){
            bill= unit*4.91;
        }
        else {
            double c=0;
            c= unit-75;
            if(c<=125){
                bill= (c*5.72)+(75*4.91);
            }
            else {
                c=c-125;
                if(c<=100){
                    bill= (c*6.00)+ (125*5.72)+(75*4.91);
                }
                else{
                    c=c-100;
                    if(c<=100){
                        bill= (c*6.34)+(100*6.00)+ (125*5.72)+(75*4.91);

                    }
                    else {
                        c=c-100;
                        if(c<=200){
                            bill= (c*9.94)+(100*6.34)+(100*6.00)+ (125*5.72)+(75*4.91);

                        }
                                else{
                                    c=c-200;
                                    bill= (c*11.46)+(200*9.94)+(100*6.34)+(100*6.00)+ (125*5.72)+(75*4.91);

                                }

                            }
                        }
                    }
                }
        double netbill= bill+130;
        System.out.println("Total bill is "+netbill+" BTD" );
        double avg = netbill/unit;
        System.out.println("Average cost of electricity per unit is = "+avg+" BDT" );
    }

}
