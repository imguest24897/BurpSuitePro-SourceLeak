package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zb1m<K extends Zgpi> implements Zeu4<Zr5a<K>> {
  private final Zllo<Zr5a<K>> Zr;
  
  final Zek7 ZR;
  
  final Zekv Zw;
  
  final Zekv ZM;
  
  public final Zeke<Zl5f> ZD;
  
  final Zekg ZG;
  
  private final Zm31[] ZN;
  
  private static boolean Zk;
  
  Zb1m(Zeu4<K> paramZeu4, Ztdo paramZtdo) {
    this.Zr = new Zrda<>(this, paramZeu4, paramZtdo);
    this.ZR = new Zek7(0);
    this.Zw = new Zekv(1);
    this.ZM = new Zekv(2);
    this.ZD = new Zeke<>(3, Zl5f.Zp);
    this.ZG = new Zekg(4);
    boolean bool = Zp();
    try {
      this.ZN = new Zm31[] { this.ZR, this.ZM, this.Zw, this.ZD, this.ZG };
      if (!bool)
        Zbqc.Zr(new Zbqc[1]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public Zm31[] Zc() {
    return this.ZN;
  }
  
  public Zllo<Zr5a<K>> ZI() {
    return this.Zr;
  }
  
  public Zeu4<? extends Zr5a<K>> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public static void Zk(boolean paramBoolean) {
    Zk = paramBoolean;
  }
  
  public static boolean Zp() {
    return Zk;
  }
  
  public static boolean Zh() {
    boolean bool = Zp();
    try {
      if (!bool)
        return true; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    if (Zh())
      Zk(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb1m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */