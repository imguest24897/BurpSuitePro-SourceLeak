package burp;

public class Zkqb {
  private static String[] ZL;
  
  public static boolean Zq(float paramFloat1, float paramFloat2) {
    String[] arrayOfString = Zg();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[4]); 
    return (Math.abs(paramFloat1 - paramFloat2) < 0.01F);
  }
  
  public static void Zj(String[] paramArrayOfString) {
    ZL = paramArrayOfString;
  }
  
  public static String[] Zg() {
    return ZL;
  }
  
  static {
    if (Zg() == null)
      Zj(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkqb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */