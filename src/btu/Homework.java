package btu;

import java.util.*;

public class Homework {

    public void task1(){
        int g = 0;
        ArrayList myNumbers = new ArrayList();
        Random randNum = new Random();

        for (int i = 0; i < 12; i++){
            g = randNum.nextInt(20);
            myNumbers.add(g);

        }

        ArrayList newList = new ArrayList(myNumbers);

        int temp = 0;
        for (int j = 0; j < newList.size(); j++) {
            if (temp % 2 == 0){
                newList.remove(j);
            } //20-24 ხაზები რატომ მუშაობს ვერ ვხვდები, temp ხომ ყოველთვის ნულია, მაგრამ მაინც სწორად ბეჭდავს.
            // temp-ს თუ ვზრდი მაშინ კოდი ირევა

        }

        Collections.sort(myNumbers);
        System.out.println("SORTED");
        System.out.println(myNumbers);
        Collections.sort(newList);
        System.out.println("NEW COLLECTON - SORTED");
        System.out.println(newList);


    }

    public void task2(){
        ArrayList myNumbers = new ArrayList();
        Random randNum = new Random();

        for (int i = 0; i < 12; i++){

            myNumbers.add(randNum.nextInt(10 - 5 + 1 ) + 5);

        }
        System.out.println();
        System.out.println("OLD");
        System.out.println(myNumbers);

        ArrayList newList = new ArrayList(myNumbers);
        for (int j = 0; j < newList.size(); j+=4){

            newList.add(j + 1, randNum.nextInt(25 - 20 + 1 ) + 20);
        }
        System.out.println("NEW");
        System.out.println(newList);

    }


}
