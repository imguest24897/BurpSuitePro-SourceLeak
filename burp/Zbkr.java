package burp;

import java.awt.GridLayout;
import java.awt.Window;
import java.util.function.Supplier;
import javax.swing.border.EmptyBorder;

public class Zbkr extends Zbqc {
  private final Zm2o Zh = new Zm2o();
  
  private final Zm2f Zt = new Zm2f();
  
  public Zbkr() {
    this(Zxc2.VERTICAL);
  }
  
  public Zbkr(Zxc2 paramZxc2) {
    GridLayout gridLayout = (paramZxc2 == Zxc2.VERTICAL) ? new GridLayout(2, 1, 0, 5) : new GridLayout(1, 2, 5, 0);
    setLayout(gridLayout);
    add(this.Zh);
    add(this.Zt);
    setBorder(new EmptyBorder(0, 0, 0, 5));
  }
  
  Zxwy ZV() {
    return Zr1m::ZC;
  }
  
  public void ZP(String paramString, Zk97 paramZk97, Zr1m paramZr1m, String... paramVarArgs) {
    ZM(paramString, paramZk97, paramZr1m, Zbo5.ZT(), true, paramVarArgs);
  }
  
  public void Za(String paramString, Zk97 paramZk97, Zr1m paramZr1m, boolean paramBoolean, String... paramVarArgs) {
    ZM(paramString, paramZk97, paramZr1m, Zbo5.ZT(), paramBoolean, paramVarArgs);
  }
  
  public void ZM(String paramString, Zk97 paramZk97, Zr1m paramZr1m, Zedo paramZedo, boolean paramBoolean, String... paramVarArgs) {
    Zm6c zm6c = new Zm6c(paramZr1m, paramVarArgs, paramZedo, ZV());
    Zl(paramString, paramZk97, zm6c, paramBoolean);
  }
  
  public void Zl(String paramString, Zk97 paramZk97, Zvoj paramZvoj, boolean paramBoolean) {
    Supplier<Window> supplier = this::lambda$configure$0;
    this.Zh.Zi(paramZk97);
    Zgcy zgcy = new Zgcy(paramZvoj, supplier, paramString, paramBoolean);
    Zlp_ zlp_ = new Zlp_(paramZvoj, supplier, paramString);
    Zkcq zkcq = new Zkcq(paramZvoj, supplier, paramString);
    this.Zt.ZK(zgcy, zlp_, zkcq);
  }
  
  public void ZV(boolean paramBoolean) {
    this.Zt.setEnabled(paramBoolean);
  }
  
  private Window lambda$configure$0() {
    return Zt2m.ZF(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbkr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */