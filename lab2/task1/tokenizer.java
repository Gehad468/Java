import java.util.StringTokenizer;
public class tokenizer {
    private String ip;
    //constructor
    public tokenizer(String ip) {
        this.ip = ip;
    }
   //method
   public void splt()
   {
    StringTokenizer st = new StringTokenizer(ip,".");
    while(st.hasMoreTokens())
    {
        System.out.println("part "+st.nextToken());
    }
   }

   public static void main(String[] args) {
    tokenizer tk=new tokenizer("163.121.12.30");
    tk.splt();
   }
}


