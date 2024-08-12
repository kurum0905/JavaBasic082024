package anhtester.com.javabasic.variables;

public class LearnVariables {

    static int age = 26; //Biến toàn cục
    static int number = 22;

    public static void sayHello() {
        int n = 10;                     // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
        System.out.println(number);
    }

    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(number);
        //Cách thứ 1
        LearnVariables abc = new LearnVariables();
        abc.sayHello();

        //Cách thứ 2
        sayHello();
    }
    }

