package main;

import java.util.Scanner;

public class Lesson1_12 {



    public static void main(String[] args){

        //1

//        0-100 intervalında sadə ədələrin tapılması(dünən qalan tapşırıq)



//        int num = 100;
//        int counter = 0;
//
//        for (int i = 3; i < num; i++) {
//            for (int j = 2; j <= i; j++) {
//                if(i % j == 0){
//                    counter++;
//                }
//            }
//            if(counter < 2){
//                System.out.println(i+" ");
//            }
//            counter=0;
//        }




        //2



        //        fibonacci rəqəmlərinin çap olunması



//         Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int number = scanner.nextInt();
//        int counter = 1;
//        for (int i = 1; i <= number; i++) {
//            counter = counter * i;
//        }
//        System.out.println("Fibonaccu result is -> "+ counter);

        //3


        //userin daxil etdiyi rəqəmin vurma cədvəlinin çap olunması



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int number = scanner.nextInt();
//
//        for (int i = 1; i < number; i++) {
//            for (int j = 1; j < number; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j));
//            }
//            System.out.print("\n");
//        }

        //4

//        0-100 intervalında tək ve cüt ədədlərin cəmini hesablamaq



//        int counter = 0;
//
//        int range = 100;
//
//
//        for (int i = 1; i < range; i++) {
//            counter+= i;
//        }
//        System.out.println("The total result is = "+counter);

        //Bashqa mentiqnen de yazmaq olardi eger sirf tek ve yaxud sirf cem regemini tapmaq lazimdi,
        // amma taskda sadece olaraq total isteyirdiz ona gore i % 2 ==0, !=0 yazmaqin menasini gormedim


        //5

//        əvvəlcədən 1 int dəyər seçirsiz, daha sonra user console-dan rəqəm daxil edir, əgər rəqəm seçilmiş rəqəmdən kiçikdirsə kiçik olduğunu,böyükdürsə böyük olduğunu çap edirsiz və user seçilmiş rəqəmi tapana qədər loop davam edir (Hint: keçən dərs göstərdiyim sonsuz for loop yaratma məntiqi istifadə edəcəysiz)



        int targetNumber = 29;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; ; i++) {

            System.out.println("Enter the number ");
            int number = scanner.nextInt();
            if(number==targetNumber){
                System.out.println("You find lucky number!!!It was "+targetNumber);
                break;
            }
            System.out.println("Try again");

        }



    }

}



