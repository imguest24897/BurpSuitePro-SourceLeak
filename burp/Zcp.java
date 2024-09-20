package burp;

import java.util.Locale;

public class Zcp extends Zni implements Zrf_ {
  @Zzvo(0)
  private Zstu Zt;
  
  @Zzvo(1)
  private Zstu Zz;
  
  @Zzvo(3)
  private long Zb;
  
  @Zzvo(6)
  private short Zq;
  
  @Zzvo(5)
  private short Zx;
  
  @Zzvo(4)
  private String Zr;
  
  @Zzvo(2)
  private int Zw;
  
  @Zzvo(7)
  private String Z_;
  
  public void ZS(Zrf_ paramZrf_) {
    Zzps.Ze(this, paramZrf_);
  }
  
  public Zstu Z__() {
    return this.Zt;
  }
  
  public void ZY(Zstu paramZstu) {
    this.Zt = paramZstu;
  }
  
  public String Z_O() {
    return this.Zr;
  }
  
  public void Zlq(String paramString) {
    this.Zr = (paramString == null) ? null : paramString.toUpperCase(Locale.ENGLISH);
  }
  
  public Zstu Z_B() {
    return this.Zz;
  }
  
  public void Zm(Zstu paramZstu) {
    this.Zz = paramZstu;
  }
  
  public long Z_a() {
    return this.Zb;
  }
  
  public void ZE(long paramLong) {
    this.Zb = paramLong;
  }
  
  public short Z_F() {
    return this.Zq;
  }
  
  public void Zl(short paramShort) {
    this.Zq = paramShort;
  }
  
  public short Z_V() {
    return this.Zx;
  }
  
  public void ZT(short paramShort) {
    this.Zx = paramShort;
  }
  
  public int Z_z() {
    return this.Zw;
  }
  
  public void Zwr(int paramInt) {
    this.Zw = paramInt;
  }
  
  public String Z_I() {
    return this.Z_;
  }
  
  public void ZlI(String paramString) {
    this.Z_ = paramString;
  }
  
  public Zeu4<Zrf_> ZF() {
    return Zl;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zcp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */