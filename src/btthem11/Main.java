package btthem11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chi so cu\n");
        int soCu = scanner.nextInt();
        System.out.println("nhap vao chi so moi\n");
        int soMoi = scanner.nextInt();
        int soDien = soCu-soMoi;
        if (soDien<50){
          System.out.println("so tien dien phai nop la :" +soDien*700);
        }else if (soDien<100){
            System.out.println("so tien dien phai nop la :"+ (soDien*700)+(soDien*900));
        }else if (soDien<150){
            System.out.println( "so tien dien phai nop la :"+ (soDien*700)+(soDien*900)+(soDien*1100) );
        }else{
            System.out.println("so tien dien phai nop la :" + (soDien*700)+(soDien*900)+(soDien*1100)+(soDien*1300));
        }
    }
}
