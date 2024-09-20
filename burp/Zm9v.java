package burp;

public class Zm9v extends Zm99 {
  private static int[] ZY;
  
  public Zm9v() {
    ZE(Zt00.BOLD_ITALIC_FONT);
    Ze(Zlkk.BURP_ERROR);
  }
  
  public Zm9v(String paramString) {
    this();
    setText(paramString);
  }
  
  public static void ZF(int[] paramArrayOfint) {
    ZY = paramArrayOfint;
  }
  
  public static int[] ZN() {
    return ZY;
  }
  
  static {
    if (ZN() != null)
      ZF(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */