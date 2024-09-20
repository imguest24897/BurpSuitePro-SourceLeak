package burp;

public class Zeft {
  private final Zli8 ZX;
  
  private final Zbnt ZF;
  
  private final Ze73 Zw;
  
  private final Zeu9 ZU;
  
  private Zbj6 Zv;
  
  private Zmno Zl;
  
  public Zeft(Zli8 paramZli8, Zbnt paramZbnt, Ze73 paramZe73, Zeu9 paramZeu9) {
    this.ZX = paramZli8;
    this.ZF = paramZbnt;
    this.Zw = paramZe73;
    this.ZU = paramZeu9;
    Zh();
  }
  
  public void ZD(Zzl1 paramZzl1, Zsxd paramZsxd) {
    Zw(paramZzl1);
    ZU(paramZsxd);
  }
  
  public void Zh() {
    this.Zv = new Zmht(Zsup.Zs(this.ZX, this.Zw, this.ZU));
    this.Zl = new Zxm(new Zt5x(this.ZF));
  }
  
  private void Zw(Zzl1 paramZzl1) {
    this.Zv.ZJ(paramZzl1);
  }
  
  private void ZU(Zsxd paramZsxd) {
    this.Zl.ZT(paramZsxd);
  }
  
  public boolean ZZ(Zs2l paramZs2l, boolean paramBoolean) {
    return ZM(paramZs2l.ZYW(), paramZs2l.ZYe(), paramBoolean);
  }
  
  public boolean Zb(Zsxd paramZsxd, boolean paramBoolean) {
    return ZM(null, paramZsxd, paramBoolean);
  }
  
  public boolean ZM(Zzl1 paramZzl1, Zsxd paramZsxd, boolean paramBoolean) {
    return (paramBoolean && paramZsxd.ZG().Zb() == Zvom.TIMED_OUT) ? true : ((paramZzl1 != null) ? this.Zv.ZY(paramZzl1) : this.Zl.ZJ(paramZsxd));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeft.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */