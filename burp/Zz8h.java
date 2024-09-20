package burp;

public class Zz8h extends Exception {
  private static int[] Zd;
  
  public Zz8h(String paramString) {
    super(paramString);
  }
  
  public static void ZY(int[] paramArrayOfint) {
    Zd = paramArrayOfint;
  }
  
  public static int[] ZU() {
    return Zd;
  }
  
  static {
    if (ZU() != null)
      ZY(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz8h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */