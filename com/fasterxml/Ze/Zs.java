package com.fasterxml.Ze;

import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zoz.Zif;
import com.fasterxml.Zoz.Zin;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zoz.Zp;
import com.fasterxml.Zz6;

public final class Zs {
  protected final Zt Zk;
  
  protected final Zif ZZ;
  
  protected final int Zd;
  
  protected final Zo5[] ZV;
  
  protected Zs(Zt paramZt, Zif paramZif, Zo5[] paramArrayOfZo5, int paramInt) {
    this.Zk = paramZt;
    this.ZZ = paramZif;
    this.ZV = paramArrayOfZo5;
    this.Zd = paramInt;
  }
  
  public static Zs ZK(Zt paramZt, Zif paramZif, Zp[] paramArrayOfZp) {
    int i = paramZif.ZL();
    Zo5[] arrayOfZo5 = new Zo5[i];
    String[] arrayOfString = Z_.ZI();
    byte b = 0;
    while (b < i) {
      Zin zin = paramZif.Zz(b);
      Zz6 zz6 = paramZt.ZU((Ziz)zin);
      arrayOfZo5[b] = new Zo5(zin, (paramArrayOfZp == null) ? null : paramArrayOfZp[b], zz6);
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return new Zs(paramZt, paramZif, arrayOfZo5, i);
  }
  
  public Zif ZC() {
    return this.ZZ;
  }
  
  public int ZD() {
    return this.Zd;
  }
  
  public Zz6 ZR(int paramInt) {
    return (this.ZV[paramInt]).ZC;
  }
  
  public Zin Zg(int paramInt) {
    return (this.ZV[paramInt]).Zk;
  }
  
  public Zp ZL(int paramInt) {
    return (this.ZV[paramInt]).ZS;
  }
  
  public Zr ZT(int paramInt) {
    Zp zp = (this.ZV[paramInt]).ZS;
    return (zp != null) ? zp.ZU() : null;
  }
  
  public Zr Zy(int paramInt) {
    Zp zp = (this.ZV[paramInt]).ZS;
    return (zp != null && zp.ZF()) ? zp.ZU() : null;
  }
  
  public Zr ZA(int paramInt) {
    String str = this.Zk.ZW((Ziz)(this.ZV[paramInt]).Zk);
    return (str != null && !str.isEmpty()) ? Zr.Zf(str) : null;
  }
  
  public int ZL() {
    byte b = -1;
    String[] arrayOfString = Z_.ZI();
    byte b1 = 0;
    while (b1 < this.Zd) {
      if ((this.ZV[b1]).ZC == null) {
        if (b >= 0)
          return -1; 
        b = b1;
      } 
      b1++;
      if (arrayOfString != null)
        break; 
    } 
    return b;
  }
  
  public String toString() {
    return this.ZZ.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */