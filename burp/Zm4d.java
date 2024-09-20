package burp;

import java.util.function.Consumer;

public class Zm4d extends Zm4c<Zm4d> {
  private final Consumer<Zlvj> ZD;
  
  private final Zz28 Zw;
  
  private final Zes1 Zf;
  
  public Zm4d(Zbnt paramZbnt, Consumer<Zlvj> paramConsumer, Zz28 paramZz28, Zes1 paramZes1) {
    super(paramZbnt);
    this.ZD = paramConsumer;
    this.Zw = paramZz28;
    this.Zf = paramZes1;
  }
  
  public Zm4d ZI(boolean paramBoolean, Ztdi paramZtdi) {
    if (paramBoolean)
      this.ZX.add(new Zrzk(paramZtdi, this.Zx, this.Zf)); 
    return this;
  }
  
  public Zli8 Zy() {
    return new Zli8(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm4d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */