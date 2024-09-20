package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbp5 implements Zswu {
  private final Zzzt Zr;
  
  private final Zr_4 Zv;
  
  public Zbp5(Zzzt paramZzzt, Zr_4 paramZr_4) {
    this.Zr = paramZzzt;
    this.Zv = paramZr_4;
  }
  
  public int ZF(Zlit paramZlit) {
    return this.Zr.ZL(paramZlit);
  }
  
  public int ZD(Zlit paramZlit, byte[] paramArrayOfbyte, Zxym paramZxym) {
    return this.Zr.Zd(paramZlit, paramArrayOfbyte, paramZxym, Zeew.PROXY);
  }
  
  public Zlit ZZ(Zzh2 paramZzh2) {
    try {
      if (paramZzh2.ZGx() == 0)
        return ZL(paramZzh2); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return this.Zr.Zy(paramZzh2.ZGx()).Zk();
  }
  
  public Zkod ZJ(Zzh2 paramZzh2) {
    if (paramZzh2.ZGx() == 0) {
      Zlit zlit = ZL(paramZzh2);
      int i = this.Zr.ZL(zlit);
      return new Zkod(i);
    } 
    return new Zkod(paramZzh2.ZGx());
  }
  
  public int Zp(Zzh2 paramZzh2) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (paramZzh2.ZGx() == 0) ? this.Zr.ZL(ZL(paramZzh2)) : paramZzh2.ZGx();
  }
  
  private Zlit ZL(Zzh2 paramZzh2) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      Zuh.Zb((paramZzh2.ZGx() == 0), Zqf.Zr);
      if (!this.Zv.Zi()) {
        Zuh.Zb(false, Zqf.Zr);
        throw new IllegalStateException();
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return this.Zv.Zl().<Zlit>ZJ(paramZzh2, Zkpz.Zz);
  }
  
  public Zefx ZO(int paramInt) {
    return this.Zr.ZT(paramInt);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbp5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */