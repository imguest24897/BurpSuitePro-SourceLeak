package burp;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

class Zrt4 implements Zm7u, Zrnl {
  private final List<String> ZN;
  
  private final byte[] Zl;
  
  private final int Zb;
  
  private final short ZM;
  
  private final List<String> Zw;
  
  private final Instant ZC;
  
  private final Instant ZH;
  
  private final boolean Zo;
  
  private final Zlxi Zr;
  
  private final boolean Zt;
  
  public Zrt4(byte[] paramArrayOfbyte, short paramShort, List<String> paramList1, List<String> paramList2, int paramInt, Instant paramInstant1, Instant paramInstant2, boolean paramBoolean1, Zlxi paramZlxi, boolean paramBoolean2) {
    this.Zl = paramArrayOfbyte;
    this.ZM = paramShort;
    this.ZN = paramList1;
    this.Zw = paramList2;
    this.Zb = paramInt;
    this.ZC = paramInstant1;
    this.ZH = paramInstant2;
    this.Zo = paramBoolean1;
    this.Zr = paramZlxi;
    this.Zt = paramBoolean2;
  }
  
  public Instant ZR() {
    return this.ZC;
  }
  
  public Instant ZQ() {
    return this.ZH;
  }
  
  public Zl6b Zp() {
    return Zl6b.HTTP_2;
  }
  
  public List<String> Zm() {
    return this.ZN;
  }
  
  public short Ze() {
    return this.ZM;
  }
  
  public int Zs() {
    return this.Zb;
  }
  
  public int ZF() {
    return this.Zl.length;
  }
  
  public Zstu Za() {
    return Zyf.Zy(this.Zl);
  }
  
  public Zstu Zt() {
    return Zyf.Zy(Arrays.copyOfRange(this.Zl, this.Zb, this.Zl.length));
  }
  
  public List<String> Zg() {
    return this.Zw;
  }
  
  public boolean Zr() {
    return this.Zo;
  }
  
  public Zlxi ZN() {
    return this.Zr;
  }
  
  public boolean Z_() {
    return this.Zt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrt4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */