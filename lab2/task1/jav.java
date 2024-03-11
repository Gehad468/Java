public class jav {
  private String ip;

  public jav(String ip) {
      this.ip = ip;
  }

  public void split() {
      String[] splt = ip.split("\\.");

      for (int i = 0; i < splt.length; i++) {
          System.out.println("part " + (i + 1) + ": " + splt[i]);
      }
  }

  public static void main(String[] args) {
      jav spl = new jav("192.168.1.1");
      spl.split();
  }

}