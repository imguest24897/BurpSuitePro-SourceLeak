package burp;

public class Zee7 {
  private final long Zg = Runtime.getRuntime().maxMemory();
  
  private static int[] ZY;
  
  public double Zx() {
    return 1.0D - Zj() / Runtime.getRuntime().maxMemory();
  }
  
  private long Zj() {
    return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
  }
  
  long ZV() {
    return this.Zg;
  }
  
  public long ZX() {
    return System.currentTimeMillis();
  }
  
  public static void Zw(int[] paramArrayOfint) {
    ZY = paramArrayOfint;
  }
  
  public static int[] Zb() {
    return ZY;
  }
  
  static {
    if (Zb() != null)
      Zw(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zee7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */