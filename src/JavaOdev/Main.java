package JavaOdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int month,day;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter month of birth:");
        month = scanner.nextInt();
        System.out.println("Please enter your birthday: ");
        day = scanner.nextInt();

        if(month == 1){
           if(day < 22 && day >0){
               System.out.println("Burcunuz : oglak ");
           }
           else System.out.println("Burcunuz : kova");
        }
        else if (month == 2){
            if(day < 20 && day >0){
                System.out.println("Burcunuz : kova ");
            }
            else System.out.println("Burcunuz : balık");
        }
        else if (month == 3){
            if(day < 21 && day >0){
                System.out.println("Burcunuz : balık ");
            }
            else System.out.println("Burcunuz : koc");
        }

        else if (month == 4){
            if(day < 20 && day >0){
                System.out.println("Burcunuz : koc ");
            }
            else System.out.println("Burcunuz : boga");
        }
        else if (month == 5){
            if(day < 22 && day >0){
                System.out.println("Burcunuz : boga ");
            }
            else System.out.println("Burcunuz : ikizler");
        }

        else if (month == 6){
            if(day < 22 && day >0){
                System.out.println("Burcunuz : ikizler ");
            }
            else System.out.println("Burcunuz : yengec");
        }

        else if (month == 7){
            if(day < 23 && day >0){
                System.out.println("Burcunuz : yengec ");
            }
            else System.out.println("Burcunuz : aslan");
        }

        else if (month == 8){
            if(day < 23 && day >0){
                System.out.println("Burcunuz : aslan ");
            }
            else System.out.println("Burcunuz : basak");
        }

        else if (month == 9){
            if(day < 23 && day >0){
                System.out.println("Burcunuz : basak ");
            }
            else System.out.println("Burcunuz : terazi");
        }

        else if (month == 10){
            if(day < 22 && day >0){
                System.out.println("Burcunuz : terazi ");
            }
            else System.out.println("Burcunuz : akrep");
        }

        else if (month == 11){
            if(day < 23 && day >0){
                System.out.println("Burcunuz : akrep ");
            }
            else System.out.println("Burcunuz : yay");
        }
        else if (month == 12){
            if(day < 23 && day >0){
                System.out.println("Burcunuz : yay ");
            }
            else System.out.println("Burcunuz : oglak");
        }

        else System.out.println("Hatali secim yaptiniz");





    }
}
