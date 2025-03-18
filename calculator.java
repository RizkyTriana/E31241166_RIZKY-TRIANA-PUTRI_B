class Calculator {
    // Menjumlahkan dua bilangan bulat
    int add(int a, int b) {
        return a + b;
    }

    // Menjumlahkan tiga bilangan bulat
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Menjumlahkan dua bilangan desimal
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Contoh penggunaan
        System.out.println(calc.add(2, 3));        // Output: 5 (Dua bilangan bulat)
        System.out.println(calc.add(1, 4, 5));     // Output: 10 (Tiga bilangan bulat)
        System.out.println(calc.add(2.5, 3.5));    // Output: 6.0 (Dua bilangan desimal)
    }
}
