package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zb67<K extends Zgpi> implements Zeu4<Zxsf<K>> {
  private final Zllo<Zxsf<K>> ZW;
  
  final Zek7 Zc;
  
  final Zekv Ze;
  
  final Zekv Zn;
  
  public final Zeke<Zm0z> Za;
  
  final Zekg Zf;
  
  private final Zm31[] Zs;
  
  private static String[] ZH;
  
  Zb67(Zeu4<K> paramZeu4, Ztdo paramZtdo) {
    this.ZW = new Zm4q<>(this, paramZeu4, paramZtdo);
    this.Zc = new Zek7(0);
    this.Ze = new Zekv(1);
    String[] arrayOfString = Zr();
    try {
      this.Zn = new Zekv(2);
      this.Za = new Zeke<>(3, Zm0z.ZI);
      this.Zf = new Zekg(4);
      this.Zs = new Zm31[] { this.Zc, this.Zn, this.Ze, this.Za, this.Zf };
      if (arrayOfString == null)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public Zm31[] Zc() {
    return this.Zs;
  }
  
  public Zllo<Zxsf<K>> ZI() {
    return this.ZW;
  }
  
  public Zeu4<? extends Zxsf<K>> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public static void ZG(String[] paramArrayOfString) {
    ZH = paramArrayOfString;
  }
  
  public static String[] Zr() {
    return ZH;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    if (Zr() == null)
      ZG(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb67.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */