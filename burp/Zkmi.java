package burp;

public class Zkmi {
  private static boolean ZC;
  
  static String Zx(Zs5n paramZs5n) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("\t");
    stringBuilder.append(paramZs5n.ZQd());
    stringBuilder.append("=");
    stringBuilder.append(paramZs5n.ZQG());
    boolean bool = Ze();
    stringBuilder.append("\n");
    if (bool)
      Zbqc.Zr(new Zbqc[2]); 
    return stringBuilder.toString();
  }
  
  public static void ZL(boolean paramBoolean) {
    ZC = paramBoolean;
  }
  
  public static boolean Zd() {
    return ZC;
  }
  
  public static boolean Ze() {
    boolean bool = Zd();
    return !bool;
  }
  
  static {
    if (Ze())
      ZL(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkmi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */