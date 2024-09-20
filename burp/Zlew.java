package burp;

import java.util.Collections;
import java.util.List;

public abstract class Zlew implements Zeni {
  protected final Zsiw Za;
  
  private static int Zy;
  
  protected Zlew(Zsiw paramZsiw) {
    this.Za = paramZsiw;
  }
  
  public final List<Zl1r> Zj(Zr6q paramZr6q) {
    return Collections.emptyList();
  }
  
  public static void Zb(int paramInt) {
    Zy = paramInt;
  }
  
  public static int Zj() {
    return Zy;
  }
  
  public static int ZW() {
    int i = Zj();
    return (i == 0) ? 89 : 0;
  }
  
  static {
    if (ZW() != 0)
      Zb(44); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlew.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */