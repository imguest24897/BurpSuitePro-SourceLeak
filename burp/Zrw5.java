package burp;

import java.awt.Window;

public class Zrw5 {
  private final Window Zy;
  
  private final Zgxf Zk;
  
  private final Zgbj ZZ;
  
  public Zrw5(Window paramWindow, Zgxf paramZgxf, Zgbj paramZgbj) {
    this.Zy = paramWindow;
    this.Zk = paramZgxf;
    this.ZZ = paramZgbj;
  }
  
  public boolean ZH(Ze3h paramZe3h) {
    Zbr zbr = this.Zk.Zv(paramZe3h.ZJ());
    Zgsq zgsq = Zxd9.ZT(zbr).<Zgsq>map(Zgsq::ZW).orElse(Zgsq.AUTO);
    this.ZZ.ZC(Zeew.TARGET, this.Zy, ((Zxya)paramZe3h.ZJ().Z_()).Zy(), zbr, zgsq);
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrw5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */