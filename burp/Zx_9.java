package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx_9 implements Zeu4<Ztrr> {
  public final Zekv ZM = new Zekv(0);
  
  public final Zeki<Zb0w> ZP = new Zeki<>(1, Zb0w.Ze);
  
  private final Zm31[] Zs = new Zm31[] { this.ZM, this.ZP };
  
  private final Zllo<Ztrr> Zz = new Zmxb();
  
  private final Zsqx<Ztrr> ZC = new Zzje(10);
  
  private static Zbqc[] Ze;
  
  public Zm31[] Zc() {
    return this.Zs;
  }
  
  public Zllo<Ztrr> ZI() {
    return this.Zz;
  }
  
  public Zeu4<? extends Ztrr> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public static void ZP(Zbqc[] paramArrayOfZbqc) {
    Ze = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zv() {
    return Ze;
  }
  
  static {
    if (Zv() != null)
      ZP(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx_9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */