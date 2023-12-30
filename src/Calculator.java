import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;



public class Calculator {
    // Статическая переменная instance типа Supplier для создания экземпляра Calculator
    static Supplier<Calculator> instance = Calculator::new;

    // Переменные для бинарных операций
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    // Предотвращение деления на ноль с помощью тернарного оператора
    BinaryOperator<Integer> divide = (x, y) -> y != 0 ? x / y : 0;

    // Переменные для унарных операций
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    // Переменная для проверки положительности числа
    Predicate<Integer> isPositive = x -> x > 0;

    // Переменная для вывода числа в консоль
    Consumer<Integer> println = System.out::println;

    // Конструктор класса Calculator (может быть приватным, так как создаем через Supplier)
    private Calculator() {
    }
}

