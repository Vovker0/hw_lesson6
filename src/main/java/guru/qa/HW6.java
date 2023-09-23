package guru.qa;

public class HW6 {

    public static void main(String[] args) {

// 1) поупражняться с математическими и логическими операторами,
        int a = 10;
        int b = 20;
        int c = 25;
        System.out.println("\nInitial a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        // имеет значение с какой стороны переменной стоит инкремент/декремент
        System.out.println("a++ = " + (a++)); // здесь для вычислений используется переменная без инкремента, а потом уже работает инкремент
        System.out.println("a = " + a); // что мы и видим вот тут
        System.out.println("++a = " + (++a)); // а в таком варианте, наоборот, сначала переменная увеличивается на 1, а затем используется в вычислениях
        System.out.println("b-- = " + (b--)); // для декремента - такая же последовательность
        System.out.println("b = " + b);

        boolean m = true;
        boolean n = false;
        System.out.println("\nInitial m = " + m + ", n = " + n);
        System.out.println("m && n = " + (m && n));
        System.out.println("m || n = " + (m || n) );
        System.out.println("!(m && n) = " + !(m && n));

// добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
        byte x = 127;
        byte y = 1;
        System.out.println("\nOverflow demonstration for byte.");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x + y = " + (byte) (x + y));

// 2) попробовать вычисления комбинаций типов данных (int и double)
        double z = 100000000000000000000000000000000000000000000000000000000000000000000000000000000000000.0;
        System.out.println("\nz = " + z);
        System.out.println("z / a = " + (z / a));

        // Тернарный оператор
       z = (!m) ? 1 : 0;
        System.out.println("\nz = " + z);
    }
}
