package burp;

public class Zho extends Zni implements Zqu {
  private final Zr_4 Zs;
  
  @Zzvo(1)
  private boolean ZH;
  
  @Zzvo(2)
  private boolean ZM;
  
  @Zzvo(3)
  private boolean Za;
  
  @Zzvo(4)
  private boolean Zi;
  
  @Zzvo(5)
  private boolean Ze;
  
  @Zzvo(6)
  private boolean ZO;
  
  private Zmet Zc;
  
  @Zzvo(8)
  private Zl34 Zw;
  
  @Zzvo(9)
  private Zl34 Zl;
  
  Zho(Zl34 paramZl341, Zl34 paramZl342, Zr_4 paramZr_4) {
    this.Zw = paramZl341;
    this.Zl = paramZl342;
    this.Zs = paramZr_4;
  }
  
  public boolean Zoy() {
    return this.ZH;
  }
  
  public void ZJ(boolean paramBoolean) {
    this.ZH = paramBoolean;
  }
  
  public boolean Zo1() {
    return this.ZM;
  }
  
  public void Zm(boolean paramBoolean) {
    this.ZM = paramBoolean;
  }
  
  public boolean ZoR() {
    return this.Za;
  }
  
  public void ZT(boolean paramBoolean) {
    this.Za = paramBoolean;
  }
  
  public boolean ZoG() {
    return this.Zi;
  }
  
  public void Za(boolean paramBoolean) {
    this.Zi = paramBoolean;
  }
  
  public boolean Zo7() {
    return this.Ze;
  }
  
  public void ZW(boolean paramBoolean) {
    this.Ze = paramBoolean;
  }
  
  public boolean Zo6() {
    return this.ZO;
  }
  
  public void ZN(boolean paramBoolean) {
    this.ZO = paramBoolean;
  }
  
  public Zmet ZGk() {
    return this.Zc;
  }
  
  public void ZN(Zmet paramZmet) {
    this.Zc = paramZmet;
  }
  
  public Zl34 ZGY() {
    return this.Zw;
  }
  
  public Zl34 ZGp() {
    return this.Zl;
  }
  
  public void Zd(Zmf_ paramZmf_) {
    Zl_g.Za(this, paramZmf_, this.Zs);
  }
  
  public void Zl(Zg4j paramZg4j) {
    Zl_g.Zo(this, paramZg4j, this.Zs);
  }
  
  @Zzvo(7)
  private byte ZPd() {
    return (this.Zc == null) ? 0 : this.Zc.id;
  }
  
  public Zeu4<? extends Zqu> ZF() {
    return Zg;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zho.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */