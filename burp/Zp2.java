package burp;

public class Zp2 extends Zni implements Zl2_ {
  @Zzvo(0)
  private final Zrp0 Zs;
  
  @Zzvo(1)
  private final Zeu9 ZM;
  
  Zp2(Zrp0 paramZrp0, Zeu9 paramZeu9) {
    this.Zs = paramZrp0;
    this.ZM = paramZeu9;
  }
  
  public Ztpr ZB6() {
    return Zl0.ZJ(this.Zs);
  }
  
  public String ZBq() {
    return this.ZM.ZHk().<String>map(Zski::toString).orElse("");
  }
  
  public Zeu4<? extends Zl2_> ZF() {
    return Zl2_.ZI;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zp2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */