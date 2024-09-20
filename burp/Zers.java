package burp;

import java.util.Collections;

public class Zers implements Zm65 {
  private final Zxs7 Zr;
  
  private final Zlvf Zz;
  
  private final byte[] ZW;
  
  private final Ztbx Zn;
  
  private final Zkv7 Ze;
  
  Zers(Zxs7 paramZxs7, Zlvf paramZlvf, byte[] paramArrayOfbyte, Ztbx paramZtbx, Zkv7 paramZkv7) {
    this.Zr = paramZxs7;
    this.Zz = paramZlvf;
    this.ZW = paramArrayOfbyte;
    this.Zn = paramZtbx;
    this.Ze = paramZkv7;
  }
  
  public Zx4o ZN(Zgtq paramZgtq) {
    int i = Zgtq.ZT();
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zzun zzun = this.Ze.Zi(paramZgtq) ? new Zzun(this.Zn, paramZgtq.Zg, paramZgtq.ZU) : null;
    if (Zbqc.Zwu() == null)
      Zgtq.ZS(++i); 
    return new Zx4o(new Zx_5(paramZgtq.ZO, (byte)0, paramZgtq.ZK, Collections.emptyMap(), Collections.singletonList(new Zbn0(this.Zz.Zq(new Zz25(this.ZW, 0), this.Zz.ZY().ZO(), Collections.emptyList()), Collections.emptyList(), paramZgtq.Zd, paramZgtq.ZD, paramZgtq.ZM, paramZgtq.Za, paramZgtq.Zj, paramZgtq.ZW, paramZgtq.ZQ, paramZgtq.Zm, paramZgtq.Zf, paramZgtq.ZT, paramZgtq.Zr, paramZgtq.Ze, paramZgtq.ZL, paramZgtq.Zp, paramZgtq.Zx, paramZgtq.ZF, paramZgtq.Zu, paramZgtq.ZE, paramZgtq.ZP)), Zmmq.Ze(paramZgtq.ZK, paramZgtq.ZO), Zmmq.Zm(paramZgtq.ZK, paramZgtq.ZO), this.Zz.ZB(), this.Zz.ZD(), this.Zr), this.Zn, zzun);
  }
  
  public Zx4o Zz(Zskx paramZskx) {
    throw new UnsupportedOperationException();
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zers.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */