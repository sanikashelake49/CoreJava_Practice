class OverloadingExample {

    // Method 1
    void add(int a, int b) {
        System.out.println("Sum of two ints: " + (a + b));
    }

    // Method 2 — same name, different parameters
    void add(int a, int b, int c) {
        System.out.println("Sum of three ints: " + (a + b + c));
    }

    // Method 3 — same name, different data type
    void add(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        obj.add(10, 20);        // calls first method
        obj.add(10, 20, 30);    // calls second method
        obj.add(5.5, 4.5);      // calls third method
    }
}
