public class Main{



public static void main(String[] args) {
        // Создаем экземпляр класса Calculator через вызов статической переменной instance
        Calculator calc = Calculator.instance.get();

        // Производим несколько математических операций
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);

        // Выводим результат в консоль
        calc.println.accept(c);
        }
}