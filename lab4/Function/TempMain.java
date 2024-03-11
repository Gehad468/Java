import java.util.function.Function;

/**
 * TempMain
 */
public class TempMain {
   
    public static void main(String[] args) {
       float x=24;
       float out=new Function<Float, Float>() {
        @Override
        public Float apply(Float f) {
            return (f * 9 / 5) + 32;
        }
    }.apply(x);
    System.out.println("Temp is = "+x+"C or "+out+"F");
    }
}