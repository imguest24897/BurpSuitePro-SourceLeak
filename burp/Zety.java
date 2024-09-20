package burp;

import javax.swing.text.Segment;

public abstract class Zety implements Zmhz {
  private final Zmpr Zq;
  
  protected Ze7g Zz;
  
  private int Zy;
  
  public Zety() {
    this(Zmpr.Zw);
  }
  
  public Zety(Zmpr paramZmpr) {
    this.Zq = paramZmpr;
  }
  
  protected abstract Ze7g Z_(int paramInt1, Segment paramSegment, Zska paramZska, int paramInt2);
  
  public final Ze7g ZE(int paramInt1, Segment paramSegment, Zska paramZska, int paramInt2) {
    this.Zq.ZT(paramZska);
    Ze7g ze7g = Z_(paramInt1, paramSegment, paramZska, paramInt2);
    this.Zq.ZY(ze7g);
    return ze7g;
  }
  
  public int Zb(int paramInt) {
    return paramInt;
  }
  
  public boolean Zh() {
    return false;
  }
  
  public boolean ZA(int paramInt, char paramChar) {
    return (Character.isLetterOrDigit(paramChar) || paramChar == '_' || paramChar == '$');
  }
  
  protected Zska Zf() {
    Zska zska = new Zska();
    zska.Zi(this.Zy);
    this.Zz.ZH(zska);
    return zska;
  }
  
  protected Zska Zq(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return ZR(paramArrayOfchar, paramInt1, paramInt2, paramInt3, paramInt4, null);
  }
  
  protected Zska ZR(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Zzzm paramZzzm) {
    Zska zska = new Zska(paramArrayOfchar, paramInt1, paramInt2, paramInt4, paramInt3);
    zska.Zi(this.Zy);
    zska.ZR(paramZzzm);
    this.Zz.ZH(zska);
    return zska;
  }
  
  protected void ZS() {
    this.Zz = new Ze7g();
  }
  
  protected void ZC(int paramInt) {
    this.Zy = Math.max(0, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zety.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */