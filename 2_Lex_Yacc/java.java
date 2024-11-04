@ class GCD {
    public static void main(String[] args) {
        int a, b;

        // Input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two natural numbers:");
        a = in.nextInt();
        b = in.nextInt();

        // GCD Calculation using while loop
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        // Output
        System.out.println("The GCD is: " + a);
    }
}