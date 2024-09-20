package burp;

import java.awt.Component;
import javax.swing.SwingUtilities;

public class Zkyb extends Zkyq implements Zt0s {
  private final Ztr3 ZA;
  
  private final Zxsz ZL;
  
  public Zkyb(Ztj1 paramZtj1, Ztr3 paramZtr3, Zlli<Zt1o> paramZlli, Zxsz paramZxsz, Ztef paramZtef) {
    super(paramZtj1, paramZxsz, paramZtef);
    this.ZA = paramZtr3;
    this.ZL = paramZxsz;
    paramZlli.ZE(Zt1o.Zt, paramZxsz::lambda$new$1);
    paramZlli.ZE(Zt1o.Zc, this::lambda$new$2);
  }
  
  private void Zv(String paramString) {
    this.ZL.Zj(paramString);
  }
  
  public void Zj() {
    boolean bool = Zxsz.ZR();
    if (this.ZA.ZPp()) {
      this.ZA.ZKt(false);
      this.ZL.ZA(false);
      if (!bool) {
        this.ZA.ZKt(true);
        this.ZL.ZA(true);
        return;
      } 
      return;
    } 
    this.ZA.ZKt(true);
    this.ZL.ZA(true);
  }
  
  public void Zp(Component paramComponent) {
    this.ZL.ZQ(paramComponent, this.Ze, this.ZA);
  }
  
  public void Zq() {
    SwingUtilities.invokeLater(this::lambda$refreshDetails$3);
  }
  
  private void lambda$refreshDetails$3() {
    if (this.ZA.ZPw())
      this.ZL.Zs(); 
    this.ZL.ZA(this.ZA.ZPp());
    Zz1i zz1i = this.ZA.Zdm();
    this.ZL.ZV(zz1i.ZHf(), zz1i.ZHz(), zz1i.ZHt(), zz1i.ZHO());
    this.ZL.ZB(this.Ze.ZO(), this.Ze.ZM());
    this.ZL.ZL(this.Ze.Zs());
    this.ZL.ZB(this.Ze.Zz());
  }
  
  private void lambda$new$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zv);
  }
  
  private static void lambda$new$1(Zxsz paramZxsz, Zxr8 paramZxr8) {
    paramZxr8.ZP(paramZxsz::lambda$new$0);
  }
  
  private static void lambda$new$0(Zxsz paramZxsz, Zebg paramZebg) {
    paramZxsz.ZV(paramZebg.ZaK(), paramZebg.ZaU(), paramZebg.Za8(), paramZebg.Zab());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkyb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */