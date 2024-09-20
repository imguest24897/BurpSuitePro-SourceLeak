package com.fasterxml.Zm;

import com.fasterxml.Zb.Zl;
import java.util.TreeMap;

public final class Ze5 {
  private static final Zl[] ZZ = new Zl[16];
  
  protected Ze5 Zd;
  
  protected long Zz;
  
  protected final Object[] Zo = new Object[16];
  
  protected TreeMap<Integer, Object> ZJ;
  
  public Zl ZQ(int paramInt) {
    long l = this.Zz;
    if (paramInt > 0)
      l >>= paramInt << 2; 
    int i = (int)l & 0xF;
    return ZZ[i];
  }
  
  public Object Z_(int paramInt) {
    return this.Zo[paramInt];
  }
  
  public Ze5 Zw() {
    return this.Zd;
  }
  
  public boolean ZV() {
    return (this.ZJ != null);
  }
  
  public Ze5 Zk(int paramInt, Zl paramZl) {
    if (paramInt < 16) {
      Zy(paramInt, paramZl);
      return null;
    } 
    this.Zd = new Ze5();
    this.Zd.Zy(0, paramZl);
    return this.Zd;
  }
  
  public Ze5 ZC(int paramInt, Zl paramZl, Object paramObject1, Object paramObject2) {
    if (paramInt < 16) {
      ZT(paramInt, paramZl, paramObject1, paramObject2);
      return null;
    } 
    this.Zd = new Ze5();
    this.Zd.ZT(0, paramZl, paramObject1, paramObject2);
    return this.Zd;
  }
  
  public Ze5 Zj(int paramInt, Zl paramZl, Object paramObject) {
    if (paramInt < 16) {
      Zy(paramInt, paramZl, paramObject);
      return null;
    } 
    this.Zd = new Ze5();
    this.Zd.Zy(0, paramZl, paramObject);
    return this.Zd;
  }
  
  public Ze5 ZW(int paramInt, Zl paramZl, Object paramObject1, Object paramObject2, Object paramObject3) {
    if (paramInt < 16) {
      ZL(paramInt, paramZl, paramObject1, paramObject2, paramObject3);
      return null;
    } 
    this.Zd = new Ze5();
    this.Zd.ZL(0, paramZl, paramObject1, paramObject2, paramObject3);
    return this.Zd;
  }
  
  private void Zy(int paramInt, Zl paramZl) {
    long l = paramZl.ordinal();
    if (paramInt > 0)
      l <<= paramInt << 2; 
    this.Zz |= l;
  }
  
  private void ZT(int paramInt, Zl paramZl, Object paramObject1, Object paramObject2) {
    long l = paramZl.ordinal();
    if (paramInt > 0)
      l <<= paramInt << 2; 
    this.Zz |= l;
    Zt(paramInt, paramObject1, paramObject2);
  }
  
  private void Zy(int paramInt, Zl paramZl, Object paramObject) {
    this.Zo[paramInt] = paramObject;
    long l = paramZl.ordinal();
    if (paramInt > 0)
      l <<= paramInt << 2; 
    this.Zz |= l;
  }
  
  private void ZL(int paramInt, Zl paramZl, Object paramObject1, Object paramObject2, Object paramObject3) {
    this.Zo[paramInt] = paramObject1;
    long l = paramZl.ordinal();
    if (paramInt > 0)
      l <<= paramInt << 2; 
    this.Zz |= l;
    Zt(paramInt, paramObject2, paramObject3);
  }
  
  private final void Zt(int paramInt, Object paramObject1, Object paramObject2) {
    if (this.ZJ == null)
      this.ZJ = new TreeMap<>(); 
    if (paramObject1 != null)
      this.ZJ.put(Integer.valueOf(Zg(paramInt)), paramObject1); 
    if (paramObject2 != null)
      this.ZJ.put(Integer.valueOf(ZO(paramInt)), paramObject2); 
  }
  
  Object Zs(int paramInt) {
    return (this.ZJ == null) ? null : this.ZJ.get(Integer.valueOf(Zg(paramInt)));
  }
  
  Object Zj(int paramInt) {
    return (this.ZJ == null) ? null : this.ZJ.get(Integer.valueOf(ZO(paramInt)));
  }
  
  private final int ZO(int paramInt) {
    return paramInt + paramInt;
  }
  
  private final int Zg(int paramInt) {
    return paramInt + paramInt + 1;
  }
  
  static {
    Zl[] arrayOfZl = Zl.values();
    System.arraycopy(arrayOfZl, 1, ZZ, 1, Math.min(15, arrayOfZl.length - 1));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Ze5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */