package burp;

public class Zp6 extends Zni implements Zga {
  @Zzvo(1)
  private final Zro0 ZA;
  
  private Zecx Zn;
  
  Zp6(Zro0 paramZro0, Zecx paramZecx) {
    this.ZA = paramZro0;
    this.Zn = paramZecx;
  }
  
  public Zro0 ZrE() {
    return this.ZA;
  }
  
  public Zecx ZrZ() {
    return this.Zn;
  }
  
  public void Zd(Zecx paramZecx, Zz1m<Zt1o> paramZz1m) {
    this.Zn = paramZecx;
    paramZz1m.ZD(Zt1o.Zy(this));
  }
  
  @Zzvo(2)
  private byte ZJl() {
    return this.Zn.permanentIndex;
  }
  
  public Zeu4<? extends Zga> ZF() {
    return ZU;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zp6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */