// Directory path: IdeaProjects/programming-in-java/week-02/examples
// pushd /home/thina/teams/td/tech/app/release/apks
//# current directory now /home/thina/teams/td/tech/app/release/apks
//popd
//# current directory now what it was before pushd command
public class Ruler {
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        String ruler = " ";
        for (int i = 1; i <= N; i++)
            ruler = ruler + i + ruler;
        System.out.println(ruler);
    }
}