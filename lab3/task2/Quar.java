import java.util.function.Function;

public class Quar implements Function<Quar.param, Quar.Result> {

    static class param {
        double a;
        double b;
        double c;
    }

    static class Result {
        Double root1;
        Double root2;
    }

    public Result apply(param arg) {
        Result result = new Result();

        double d = arg.b * arg.b - 4 * arg.a * arg.c;
        if (d >= 0) {
            result.root1 = (-arg.b + Math.sqrt(d)) / (2 * arg.a);
            result.root2 = (-arg.b - Math.sqrt(d)) / (2 * arg.a);
        }

        return result;
    }

    public static void main(String[] args) {
        Quar qu = new Quar();

        param arg = new param();
        arg.a = 1;
        arg.b = 5;
        arg.c = 2;

        Result r1 = qu.apply(arg);

            System.out.println("Root 1: " + r1.root1);
            System.out.println("Root 2: " + r1.root2);
    }
}