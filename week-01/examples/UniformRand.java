// Uniform random numbers. Write a program that prints five uniform random numbers between 0 and 1, their average
// value, and their minimum and maximum values. Use Math.random(), Math.min(), and Math.max().

public class UniformRand {
    public static void main(String[] args)
    {
        //generate 5 different numbers
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        double avg = (a+b+c+d+e)/5;
        double min = Math.min(a, Math.min(b, Math.min(c, Math.min(d,e))));
        double max = Math.max(a, Math.max(b, Math.max(c, Math.max(d,e))));

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println("Average = " +avg);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}