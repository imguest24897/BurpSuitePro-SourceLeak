package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzkn implements Zeu4<Zerb> {
  static final Zek2 ZI = Zkx8.ZV;
  
  private static final Zm31[] ZV = new Zm31[] { ZI };
  
  private final byte ZB;
  
  private final Zlj_ Zj;
  
  public Zzkn(byte paramByte) {
    this.ZB = paramByte;
    boolean bool = Zxu9.ZIf();
    try {
      this.Zj = new Zlj_(this);
      if (bool)
        Zbqc.Zr(new Zbqc[2]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public Zm31[] Zc() {
    return ZV;
  }
  
  public Zllo<Zerb> ZI() {
    return this.Zj;
  }
  
  public Zeu4<? extends Zerb> Z_(byte paramByte) {
    Zuh.ZC(false, Zqf.ZC, paramByte, this.ZB);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return this.ZB;
  }
  
  public boolean Zs() {
    return false;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzkn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */