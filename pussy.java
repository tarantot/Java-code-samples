//class pussy {
//    public static void main(String[] args) { // доступность идентификатор тип_возвращения { действие }
//        System.out.println("Hello, World!");

//public class pussy { // присвоение значений переменным
//    public static void main(String[] args) {
//        Reder r = new Reader();
//        r.Scan();
//        int i = 3;
//        int k = 5;
//        i = count(i);
//        k = count(k);
//        System.out.println(i);
//        System.out.println(k);
//    }
//
//    private static int count(int x){ //увеличение переменной i на единицу с последующим выводом
//        x = x+1;
//        return x;
//    }
//}

public class pussy { // для файла Reader
    public static void main(String[] args) {
        Reader r = new Reader(); // привязка к файлу Reader
        r.Scan();
        r.i = count(r.i);
        r.k = count(r.k);
        
        System.out.println("Теперь Ваше первое число = " + r.i);
        System.out.println("Теперь Ваше второе число = " + r.k);
    }

    private static int count(int x){ //увеличение переменной i на единицу с последующим выводом
        x = x+1;
        return x;
    }
}