class EvenOddRunner {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        String input = System.console().readLine();
        int num = Integer.parseInt(input);
        String result = EvenOdd1.checkNumber(num);
        System.out.println(result);
    }
}

