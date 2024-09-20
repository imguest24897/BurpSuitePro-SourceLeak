package com.fasterxml.Zg;

import com.fasterxml.Zm.Zj;
import com.fasterxml.Zor.Zb;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Zfc implements Serializable, Zfv {
  private static final long serialVersionUID = 1L;
  
  @Deprecated
  private final boolean ZJ;
  
  public static final Zfc Zc = new Zfc();
  
  public Zfc(boolean paramBoolean) {
    this.ZJ = paramBoolean;
  }
  
  protected Zfc() {
    this(false);
  }
  
  public boolean ZF() {
    return !this.ZJ;
  }
  
  public Zw Z_(boolean paramBoolean) {
    return paramBoolean ? Zw.ZU() : Zw.ZK();
  }
  
  public Zs ZW() {
    return Zs.Zx();
  }
  
  public Zb ZG() {
    return Zy.ZH();
  }
  
  public Zn Zm(int paramInt) {
    return Zu.Zi(paramInt);
  }
  
  public Zn Zp(long paramLong) {
    return Zm.ZI(paramLong);
  }
  
  public Zg Zp(BigInteger paramBigInteger) {
    return (Zg)((paramBigInteger == null) ? ZW() : Zz.Zc(paramBigInteger));
  }
  
  public Zn ZL(float paramFloat) {
    return Za.Zh(paramFloat);
  }
  
  public Zn ZO(double paramDouble) {
    return Zi.Zk(paramDouble);
  }
  
  public Zg ZO(BigDecimal paramBigDecimal) {
    return (Zg)((paramBigDecimal == null) ? ZW() : Zj.ZC(paramBigDecimal));
  }
  
  public Zb ZP(String paramString) {
    return Zb.ZV(paramString);
  }
  
  public Zt ZG(byte[] paramArrayOfbyte) {
    return Zt.ZB(paramArrayOfbyte);
  }
  
  public Zh Z_() {
    return new Zh(this);
  }
  
  public Zr Ze() {
    return new Zr(this);
  }
  
  public Zg Zs(Object paramObject) {
    return new Zl(paramObject);
  }
  
  public Zg Za(Zj paramZj) {
    return new Zl(paramZj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zfc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */