package com.fasterxml.Zoz;

import com.fasterxml.Zor.Zk;

public abstract class Zif extends Ziz {
  private static final long serialVersionUID = 1L;
  
  protected final Zih[] ZO;
  
  protected Zif(Zis paramZis, Zih paramZih, Zih[] paramArrayOfZih) {
    super(paramZis, paramZih);
    this.ZO = paramArrayOfZih;
  }
  
  protected Zin ZB(int paramInt, Zih paramZih) {
    this.ZO[paramInt] = paramZih;
    return Zz(paramInt);
  }
  
  public final Zih Zc(int paramInt) {
    return (this.ZO != null && paramInt >= 0 && paramInt < this.ZO.length) ? this.ZO[paramInt] : null;
  }
  
  public final Zin Zz(int paramInt) {
    return new Zin(this, ZV(paramInt), this.Zl, Zc(paramInt), paramInt);
  }
  
  public abstract int ZL();
  
  public abstract Class<?> ZP(int paramInt);
  
  public abstract Zk ZV(int paramInt);
  
  public abstract Object Zw() throws Exception;
  
  public abstract Object ZB(Object[] paramArrayOfObject) throws Exception;
  
  public abstract Object ZC(Object paramObject) throws Exception;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zif.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */