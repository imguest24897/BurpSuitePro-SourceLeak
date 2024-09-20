package burp;

import java.util.ArrayList;

public class Zse4 {
  private final Ztx4[] ZT;
  
  private final int Zi;
  
  private static boolean ZI;
  
  Zse4(Ze4y paramZe4y) {
    ArrayList<Zbop> arrayList = new ArrayList();
    arrayList.addAll(paramZe4y.Zp());
    arrayList.add(Zrl.EOF);
    arrayList.addAll(paramZe4y.Z_());
    this.ZT = arrayList.<Ztx4>toArray(new Ztx4[arrayList.size()]);
    this.Zi = paramZe4y.Zp().size() + 1;
  }
  
  public int ZE() {
    return this.Zi;
  }
  
  public int Zt() {
    return this.ZT.length;
  }
  
  int Zo(Ztx4 paramZtx4) {
    boolean bool = ZM();
    byte b = 0;
    while (b < this.ZT.length) {
      if (paramZtx4 == this.ZT[b])
        return b; 
      b++;
      if (!bool)
        break; 
    } 
    return -1;
  }
  
  public static void Zs(boolean paramBoolean) {
    ZI = paramBoolean;
  }
  
  public static boolean Zj() {
    return ZI;
  }
  
  public static boolean ZM() {
    boolean bool = Zj();
    return !bool;
  }
  
  static {
    if (!ZM())
      Zs(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zse4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */