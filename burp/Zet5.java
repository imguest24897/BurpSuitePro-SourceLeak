package burp;

import javax.swing.text.Segment;

public class Zet5 extends Zety implements Zsfb {
  private final Ziz Zm;
  
  private final Zmhz Za;
  
  private final Zl2o Zr;
  
  private final Zxnr ZQ;
  
  private final Zbqi Zf;
  
  private Zevi ZU;
  
  private int Zx;
  
  public static Zsfb Zt(Zmhz paramZmhz) {
    return new Zet5(new Zb3m(), paramZmhz);
  }
  
  public static Zsfb ZV(Zmhz paramZmhz) {
    return new Zet5(new Zefv(), paramZmhz);
  }
  
  private Zet5(Ziz paramZiz, Zmhz paramZmhz) {
    this.Zm = paramZiz;
    this.Zr = new Zl2o();
    this.ZQ = new Zkik(this);
    this.Za = paramZmhz;
    this.Zf = new Zbq9(this);
  }
  
  public Zbqi Zk() {
    return this.Zf;
  }
  
  public void ZA(Ze9f paramZe9f) {
    if (this.ZU != null)
      this.ZU.Zc(); 
    this.ZU = new Zevi(paramZe9f);
  }
  
  public int Zb(int paramInt) {
    return this.Za.Zb(paramInt);
  }
  
  public boolean ZA(int paramInt, char paramChar) {
    return this.Za.ZA(paramInt, paramChar);
  }
  
  public Ze7g Z_(int paramInt1, Segment paramSegment, Zska paramZska, int paramInt2) {
    return (this.ZU != null && this.ZU.ZU(paramInt1)) ? ZQ(paramInt1, paramSegment, paramInt2) : this.Za.ZE(paramInt1, paramSegment, paramZska, paramInt2);
  }
  
  private Ze7g ZQ(int paramInt1, Segment paramSegment, int paramInt2) {
    ZS();
    this.Zx = paramInt2 - paramSegment.offset;
    Zbqc[] arrayOfZbqc = Zl5i.ZtD();
    if (paramInt1 == 0) {
      this.Zm.Zh(paramSegment, this.ZQ);
      if (arrayOfZbqc == null) {
        this.Zr.Zh(paramSegment, this.ZQ);
        return this.Zz;
      } 
      return this.Zz;
    } 
    this.Zr.Zh(paramSegment, this.ZQ);
    return this.Zz;
  }
  
  static Zska Zi(Zet5 paramZet5, char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return paramZet5.Zq(paramArrayOfchar, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  static Zska ZN(Zet5 paramZet5, char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Zzzm paramZzzm) {
    return paramZet5.ZR(paramArrayOfchar, paramInt1, paramInt2, paramInt3, paramInt4, paramZzzm);
  }
  
  static Zska ZG(Zet5 paramZet5) {
    return paramZet5.Zf();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zet5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */