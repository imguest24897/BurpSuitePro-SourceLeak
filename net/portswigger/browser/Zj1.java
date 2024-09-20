package net.portswigger.browser;

import java.io.FileNotFoundException;
import java.nio.file.Path;

public class Zj1 {
  private static final Zdx Zg = new Zj7();
  
  private static int[] Zn;
  
  public static Zdx Zr(Path paramPath) throws FileNotFoundException {
    return new Zj_(paramPath);
  }
  
  public static Zdx Zj() {
    return Zju.SINGLETON;
  }
  
  public static Zdx Zo() {
    return Zg;
  }
  
  static {
    ZX(null);
  }
  
  public static void ZX(int[] paramArrayOfint) {
    Zn = paramArrayOfint;
  }
  
  public static int[] Zl() {
    return Zn;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zj1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */