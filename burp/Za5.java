package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Za5 extends Zat implements Zmwv {
  private final Zr_4 Zz;
  
  Za5(long paramLong, int paramInt, String paramString1, Zlit paramZlit, String paramString2, short paramShort1, String paramString3, boolean paramBoolean, Zbr paramZbr1, Zbr paramZbr2, short paramShort2, String paramString4, String paramString5, Zr_4 paramZr_4) {
    super(paramString1, paramZlit, paramString2, paramString3, paramBoolean, paramShort2, paramShort1, paramString4, paramString5, paramLong, paramInt, paramZbr1, paramZbr2, true);
    this.Zz = paramZr_4;
  }
  
  public void Zc(Zs68 paramZs68, Zstu paramZstu) {
    Zst6 zst6 = new Zst6(paramZs68);
    this.Zd = zst6.Zg();
    this.ZH = zst6.ZG();
    this.Zo = zst6.ZQ();
    short s = zst6.Zj();
    try {
      if (s != 0)
        this.Zk = s; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public void ZG(byte[] paramArrayOfbyte, int paramInt) {
    try {
      if (this.Zm == null)
        this.Zm = this.Zz.Zc(4096); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    ((Zmrq)this.Zm).Zj(paramArrayOfbyte, 0, paramInt);
  }
  
  public void ZJ(Zbr paramZbr) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    super.ZJ((paramZbr == null) ? null : Zbr.Zy(paramZbr.Zr(), Zkyt.HTTP1));
  }
  
  public boolean ZoZ() {
    return true;
  }
  
  public void ZR(Zstu paramZstu) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public Zstu ZX8() {
    return null;
  }
  
  public void Zp(Zstu paramZstu) {}
  
  public Zstu ZXq() {
    return null;
  }
  
  public void Zh(Zstu paramZstu) {}
  
  protected boolean ZP(Zm31 paramZm31, Zs7v paramZs7v) {
    return Zlua.Zd(paramZm31, paramZs7v, Zkpf.Zq, 481592017);
  }
  
  public Zeu4<Zmwv> ZF() {
    return Zmwv.ZC;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Za5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */