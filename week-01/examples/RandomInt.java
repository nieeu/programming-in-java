public class RandomInt {
    public static void main(String[] args) // simply understand this is just the entry point
    {
        int n = Integer.parseInt(args[0]);
        double r = Math.random();   // uniform between 0.0 and 1.0
        int value = (int) (r * n);  // uniform between 0 and n-1
        System.out.print(value);
    }
}