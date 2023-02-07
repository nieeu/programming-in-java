public class GreatCircle {
    public static void main(String[] args)
    {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double difx = Math.toRadians(x2 - x1);
        double dify = Math.toRadians(y2 - y1);
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);

        double a = Math.pow(Math.sin(difx/2), 2) + Math.cos(x1)*Math.cos(x2)*Math.pow(Math.sin(dify/2),2);

        double r = 6371.0;

        double dist = 2*r*Math.asin(Math.sqrt(a));

        System.out.println(dist + " kilometers");
    }
}