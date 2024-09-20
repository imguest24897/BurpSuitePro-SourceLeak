package net.portswigger;

import java.util.Random;

public class Zsy extends Zs6<Random> {
  private static boolean Zj;
  
  public Zsy() {
    super(new Random());
  }
  
  public Zsy(String paramString) {
    super(new Random(ZP(paramString.getBytes())));
  }
  
  public static void Zl(boolean paramBoolean) {
    Zj = paramBoolean;
  }
  
  public static boolean Z_() {
    return Zj;
  }
  
  public static boolean ZD() {
    boolean bool = Z_();
    return !bool;
  }
  
  static {
    if (Z_())
      Zl(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zsy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */