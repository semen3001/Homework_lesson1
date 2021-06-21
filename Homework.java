package Homework_lesson1;

public class Homework {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 100;
        int d = 14;
        System.out.println(a * (b + (c / d)));
    }
    public static float homework1(float a , float b , float c , float d){
        return  a * (b + (c / d));
    }
    public static boolean homework2(int e, int f){
        return ((e + f) >= 10 & (e + f) <= 20);
    }
    public static void homework3(int g){
        System.out.println(g < 0 ? "-" : "+");
    }
    public static boolean homework4(int i){
        return i < 0;
    }
    public static void homework5(String name){
        System.out.println("Привет,"+ name + "!");
    }

}




