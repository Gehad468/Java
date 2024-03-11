package packtem;

import java.util.function.Function;

public class Tem implements Function<Float, Float> {
    @Override
    public Float apply(Float f) {
        return (f * 9 / 5) + 32;
    }

    public static void main(String[] args) {

    }
}
