import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Esercizio 1");
        int anno = 1601;

        if (anno % 4 == 0) {
System.out.println(anno + " e un anno bisestile");

    } else if (anno % 100 == 0 && anno % 400 == 0) {
            System.out.println(anno + " e un anno bisestile");
        } else {
            System.out.println(anno + " non e un anno bisestile");
        }
        System.out.println("Esercizio 2");
int numero =3;

        switch (numero) {
            default:
                System.out.println("Error") ;
            break;
            case 0 : {
                System.out.println("A");
                break;
            }
            case 1 : {
                System.out.println("B");
                break;
            }
            case 2 : {
                System.out.println("C");
                break;
            }
            case 3 : {
                System.out.println("D");
                break;
            }
        }
        System.out.println("Esercizio 4");

        Scanner input= new Scanner(System.in);
System.out.println("Insert countdown timer: ");
String timer = input.nextLine();
int time = Integer.parseInt(timer);

for (int i = 0; i < time;)  {
    System.out.println("CountDown: "+ (time-i) );
        i++;
}


    }
}
