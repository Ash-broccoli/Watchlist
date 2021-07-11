import java.util.Scanner;

public class Einleser {
    static Scanner sc;
    public Einleser(){
        sc = new Scanner(System.in);
    }

    public String readString(){
        String s = sc.nextLine();
        return s;
    }

    public int readInt(){
        while(!sc.hasNextInt()) {
            System.out.print("Enter a number >");
            sc.next();
        }
        int i = sc.nextInt();
        sc.nextLine();
        return i;
    }
}
