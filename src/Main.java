import Bai1.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tinh nghiem phuong trinh bac 2");
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a=Double.parseDouble(sc.nextLine());
        System.out.println("Nhap b: ");
        double b=Double.parseDouble(sc.nextLine());
        System.out.println("Nhap c: ");
        double c=Double.parseDouble(sc.nextLine());
        QuadraticEquation pt1=new QuadraticEquation(a,b,c);
        System.out.println("Gia tri cua delta la : "+pt1.getDiscriminant());
        if (pt1.getDiscriminant()>=0){
            System.out.println("Nghiem r1 la : "+pt1.getRoot1());
            System.out.printf("Nghiem r2 la : "+pt1.getRoot2());
        } else if (pt1.getDiscriminant()==0) {
            System.out.println("Phuong trinh co 1 nghiem la : R = 0 ");
        } else {
            System.out.println("The equation has no roots");
        }
    }
}