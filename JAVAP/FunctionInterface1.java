package com.shamanth.basic;

import java.util.function.*;  // Importing various functional interfaces

public class FunctionInterface1 { 
    public static void main(String[] args) {
        
        // BiConsumer: Accepts two input arguments and performs an operation, in this case, adding them
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> {
            System.out.println("The value is: " + (a + b));
        };
        biConsumer.accept(82, 20);

        // BiFunction: Takes two arguments, performs multiplication, and returns the result
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> {
            System.out.println("Multiplication " + (a * b));
            return a * b;
        };
        multiply.apply(3, 2);

        System.out.println("---------------------------------------------------");

        // BiPredicate: Tests whether the length of a string is greater than a given number
        BiPredicate<String, Integer> biPredicate = (s, n) -> s.length() > n;
        biPredicate.test("Fortune", 5);

        System.out.println("---------------------------------------------------");

        // BooleanSupplier: Returns a boolean value, always true in this case
        BooleanSupplier booleanSupplier = () -> true;
        System.out.println(booleanSupplier.getAsBoolean());

        // Consumer: Consumes an integer input, prints numbers from 0 to 10
        Consumer<Integer> consumer = (a) -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
        };
        consumer.accept(5);

        System.out.println("---------------------------------------------------");

        // DoubleBinaryOperator: Performs multiplication on two double values
        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> {
            System.out.println(a * b);
            return a * b;
        };
        doubleBinaryOperator.applyAsDouble(10, 20);

        System.out.println("---------------------------------------------------");

        // DoubleConsumer: Consumes a double value and prints it
        DoubleConsumer doubleConsumer = (value) -> {
            System.out.println("The value is: " + value);
        };
        doubleConsumer.accept(10);

        System.out.println("---------------------------------------------------");

        // DoubleFunction: Takes a double and returns a string representation
        DoubleFunction<String> doubleFunction = (value) -> {
            System.out.println("The value is: " + value);
            return "Value";
        };
        doubleFunction.apply(99.3);

        System.out.println("---------------------------------------------------");

        // DoublePredicate: Tests if a double is positive or negative
        DoublePredicate doublePredicate = (value) -> {
            if (value > 0) {
                System.out.println("The value is positive");
                return true;
            } else {
                System.out.println("The value is negative");
                return false;
            }
        };
        doublePredicate.test(2);

        System.out.println("---------------------------------------------------");

        // DoubleToIntFunction: Converts a double to an int
        DoubleToIntFunction doubleToIntFunction = (value) -> {
            return (int) Math.round(value);
        };
        doubleToIntFunction.applyAsInt(9.6);

        System.out.println("---------------------------------------------------");

        // DoubleToLongFunction: Converts a double to a long
        DoubleToLongFunction doubleToLongFunction = (value) -> {
            return (long) value;
        };
        doubleToLongFunction.applyAsLong(9.635);

        System.out.println("---------------------------------------------------");

        // DoubleUnaryOperator: Squares a double value
        DoubleUnaryOperator doubleUnaryOperator = (value) -> {
            System.out.println("The square is: " + value * value);
            return value * value;
        };
        doubleUnaryOperator.applyAsDouble(2.5);

        System.out.println("---------------------------------------------------");

        // Function: Converts a string to an integer
        Function<String, Integer> function = (str) -> Integer.parseInt(str);
        System.out.println(function.apply("123"));

        System.out.println("---------------------------------------------------");

        // IntBinaryOperator: Returns the maximum of two integers
        IntBinaryOperator intBinaryOperator = (value1, value2) -> {
            return Math.max(value1, value2);
        };
        intBinaryOperator.applyAsInt(20, 10);

        System.out.println("---------------------------------------------------");

        // IntConsumer: Consumes an integer and prints it
        IntConsumer intConsumer = (value) -> {
            System.out.println("Value is: " + value);
        };
        intConsumer.accept(100);

        System.out.println("---------------------------------------------------");

        // IntPredicate: Tests if an integer is even
        IntPredicate intPredicate = (value) -> value % 2 == 0;
        intPredicate.test(4);

        System.out.println("---------------------------------------------------");

        // IntSupplier: Supplies an integer value, here returning 5
        IntSupplier intSupplier = () -> 5;
        intSupplier.getAsInt();

        System.out.println("---------------------------------------------------");

        // IntToDoubleFunction: Converts an int to a double
        IntToDoubleFunction intToDoubleFunction = (value) -> (double) value;
        intToDoubleFunction.applyAsDouble(50);

        System.out.println("---------------------------------------------------");

        // IntToLongFunction: Converts an int to a long
        IntToLongFunction intToLongFunction = (value) -> (long) value;
        intToLongFunction.applyAsLong(25);

        System.out.println("---------------------------------------------------");

        // IntUnaryOperator: Adds 10 to an integer
        IntUnaryOperator intUnaryOperator = (value) -> value + 10;
        intUnaryOperator.applyAsInt(20);

        System.out.println("---------------------------------------------------");

        // LongBinaryOperator: Multiplies two long values
        LongBinaryOperator longBinaryOperator = (a, b) -> a * b;
        longBinaryOperator.applyAsLong(12345L, 21034L);

        System.out.println("---------------------------------------------------");

        // LongConsumer: Consumes a long value and prints it
        LongConsumer longConsumer = (value) -> {
            System.out.println("Long value: " + value);
        };
        longConsumer.accept(12345678L);

        System.out.println("---------------------------------------------------");

        // LongFunction: Converts a long to a string
        LongFunction<String> longFunction = (value) -> Long.toString(value);
        longFunction.apply(1234567L);

        System.out.println("---------------------------------------------------");

        // LongPredicate: Tests if a long value is even
        LongPredicate longPredicate = (value) -> value % 2 == 0;
        longPredicate.test(1234567L);

        System.out.println("---------------------------------------------------");

        // LongToDoubleFunction: Converts a long to a double
        LongToDoubleFunction longToDoubleFunction = (value) -> (double) value;
        longToDoubleFunction.applyAsDouble(1234567L);

        System.out.println("---------------------------------------------------");

        // LongToIntFunction: Converts a long to an int
        LongToIntFunction longToIntFunction = (value) -> (int) value;
        longToIntFunction.applyAsInt(1234567L);

        System.out.println("---------------------------------------------------");

        // LongUnaryOperator: Adds 1 to a long value
        LongUnaryOperator longUnaryOperator = (value) -> value + 1;
        longUnaryOperator.applyAsLong(1234567L);

        System.out.println("---------------------------------------------------");

        // ObjDoubleConsumer: Consumes a string and a double, and prints them
        ObjDoubleConsumer<String> objDoubleConsumer = (str, value) -> {
            System.out.println("The string is: " + str + " and value is: " + value);
        };
        objDoubleConsumer.accept("Karnataka", 124.254);

        System.out.println("---------------------------------------------------");

        // ObjIntConsumer: Consumes a string and an integer, and prints them
        ObjIntConsumer<String> objIntConsumer = (str, value) -> {
            System.out.println("The string is: " + str + " and value: " + value);
        };
        objIntConsumer.accept("Nada Habba", 123);

        System.out.println("---------------------------------------------------");

        // ObjLongConsumer: Consumes a string and a long, and prints them
        ObjLongConsumer<String> objLongConsumer = (str, value) -> {
            System.out.println("The string is: " + str + " and value: " + value);
        };
        objLongConsumer.accept("Mysore", 123456L);

        System.out.println("---------------------------------------------------");

        // Predicate: Tests if a number is even
        Predicate<Integer> predicate = (value) -> value % 2 == 0;
        predicate.test(5);

        System.out.println("---------------------------------------------------");

        // Supplier: Supplies a default string value
        Supplier<String> supplier = () -> "Default value";
        supplier.get();

        System.out.println("---------------------------------------------------");

        // ToDoubleBiFunction: Averages two double values
        ToDoubleBiFunction<Double, Double> toDoubleBiFunction = (num1, num2) -> (num1 + num2) / 2.0;
        toDoubleBiFunction.applyAsDouble(20.36, 25.46);

        System.out.println("---------------------------------------------------");

        // ToDoubleFunction: Computes the square of a double value
        ToDoubleFunction<Double> toDoubleFunction = (radius) -> radius * radius;
        toDoubleFunction.applyAsDouble(2.3);

        System.out.println("---------------------------------------------------");

        // ToIntBiFunction: Adds two integers
        ToIntBiFunction<Integer, Integer> toIntBiFunction = (a, b) -> a + b;
        toIntBiFunction.applyAsInt(10000000, 100);

        System.out.println("---------------------------------------------------");

        // ToIntFunction: Converts a string to an integer
        ToIntFunction<String> toIntFunction = (value) -> Integer.parseInt(value);
        toIntFunction.applyAsInt("123456");

        System.out.println("---------------------------------------------------");

        // ToLongBiFunction: Multiplies two integers and returns the result as a long
        ToLongBiFunction<Integer, Integer> toLongBiFunction = (num1, num2) -> (long) num1 * num2;
        toLongBiFunction.applyAsLong(23, 32);

        System.out.println("---------------------------------------------------");

        // ToLongFunction: Converts a string to a long
        ToLongFunction<String> toLongFunction = (value) -> Long.parseLong(value);
        toLongFunction.applyAsLong("123456789");

        System.out.println("---------------------------------------------------");

        // UnaryOperator: Converts a string to uppercase
        UnaryOperator<String> unaryOperator = (value) -> value.toUpperCase();
        unaryOperator.apply("formula 1");
    }
}
