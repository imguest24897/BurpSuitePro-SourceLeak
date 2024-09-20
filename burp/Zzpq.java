package burp;

public class Zzpq implements Zga5, Zt5e {
  private final Zmw1 Z_;
  
  private final Zmw3 Zw;
  
  private Zga5 Zd;
  
  private Zt5e ZF;
  
  public Zzpq(Zl34 paramZl34, Ztn0 paramZtn01, Ztn0 paramZtn02, Zr_4 paramZr_41, Zr_4 paramZr_42, Zr1j paramZr1j) {
    this.Z_ = new Zmw1(paramZl34, paramZtn01, paramZr_41, paramZr_42);
    this.Z_.ZV(this);
    this.Zw = new Zmw3(paramZl34, paramZtn02, paramZr_41, paramZr_42, paramZr1j);
    this.Zw.ZV(this);
    ZH();
  }
  
  private void ZH() {
    this.Zd = ZER() ? this.Z_ : this.Zw;
  }
  
  public Zli1 Zr() {
    return this.Z_;
  }
  
  public Zt9d Zb() {
    return this.Zw;
  }
  
  public void ZV(Zt5e paramZt5e) {
    this.ZF = paramZt5e;
  }
  
  public void ZC(Zz28 paramZz28) {
    if (this.ZF != null)
      this.ZF.ZC(paramZz28); 
  }
  
  public boolean ZER() {
    return this.Z_.ZER();
  }
  
  public void ZmL(boolean paramBoolean) {
    boolean bool = this.Zd.ZER();
    if (bool != paramBoolean) {
      this.Zd.ZmL(paramBoolean);
      ZH();
      ZC(null);
    } 
  }
  
  public boolean Zlz() {
    return this.Zd.Zlz();
  }
  
  public boolean ZI(Zmzk paramZmzk) {
    return this.Zd.ZI(paramZmzk);
  }
  
  public boolean Zm(Zlit paramZlit) {
    return this.Zd.Zm(paramZlit);
  }
  
  public boolean Zh(Zlit paramZlit) {
    return this.Zd.Zh(paramZlit);
  }
  
  public void ZI(Zlit paramZlit) {
    this.Zd.ZI(paramZlit);
  }
  
  public void Zg(Zlit paramZlit) {
    this.Zd.Zg(paramZlit);
  }
  
  public int ZAg() {
    return this.Zd.ZAg();
  }
  
  public boolean Zk(Zmf_ paramZmf_, String paramString1, String paramString2, String paramString3) {
    boolean bool = this.Zd.Zk(paramZmf_, paramString1, paramString2, paramString3);
    if (bool)
      ZH(); 
    return bool;
  }
  
  public void ZP(Zg4j paramZg4j, String paramString1, String paramString2, String paramString3) {
    this.Zd.ZP(paramZg4j, paramString1, paramString2, paramString3);
  }
  
  public void Zh(Zg4j paramZg4j, String paramString1, String paramString2) {
    this.Zd.Zh(paramZg4j, paramString1, paramString2);
  }
  
  public void Zk(Zzqp paramZzqp, String paramString1, String paramString2) {
    this.Zd.Zk(paramZzqp, paramString1, paramString2);
  }
  
  public void Zj(Zzqp paramZzqp, String paramString) {
    this.Zd.Zj(paramZzqp, paramString);
  }
  
  public void Zd(Zmf_ paramZmf_) {
    this.Zd.Zd(paramZmf_);
    ZH();
    ZC(null);
  }
  
  public void Zl(Zg4j paramZg4j) {
    this.Zd.Zl(paramZg4j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzpq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */