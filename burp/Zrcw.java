package burp;

import java.util.ArrayList;
import java.util.List;

public class Zrcw implements Zb3n {
  private final List<Zgfi> ZY = new ArrayList<>();
  
  private static boolean Zo;
  
  public Zrcw(String... paramVarArgs) {
    String[] arrayOfString = paramVarArgs;
    boolean bool = ZZ();
    int i = arrayOfString.length;
    byte b = 0;
    while (b < i) {
      String str = arrayOfString[b];
      this.ZY.add(new Zlbm(str));
      b++;
      if (!bool) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
  }
  
  public void ZF(Zgfi paramZgfi) {
    this.ZY.add(paramZgfi);
  }
  
  public List<Zgfi> Zl() {
    return this.ZY;
  }
  
  public static void ZA(boolean paramBoolean) {
    Zo = paramBoolean;
  }
  
  public static boolean ZZ() {
    return Zo;
  }
  
  public static boolean Ze() {
    boolean bool = ZZ();
    return !bool;
  }
  
  static {
    if (!ZZ())
      ZA(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrcw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */