import java.until.*;

public class Reader {
    int i;
    int k;
    public void Scan(){
        System.out.println("Введите первое число: ");
        Scanner scn = new Scanner(System.in);
        i = scn.nextInt();
        System.out.println("Введите второе число: ");
        k = scn.nextInt();
    }
}