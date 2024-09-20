package burp;

import java.util.function.Consumer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zs8z implements Zz9e {
  private final Zeew Zz;
  
  private final Zb1g ZN;
  
  private final Zz9e Zd;
  
  private final Zxzh Zv;
  
  private final Zrgq ZM;
  
  private final Consumer<Ze44> Zf;
  
  private Zs8z(Zeew paramZeew, Zb1g paramZb1g, Zz9e paramZz9e, Zxzh paramZxzh, Zrgq paramZrgq, Consumer<Ze44> paramConsumer) {
    this.Zz = paramZeew;
    this.ZN = paramZb1g;
    this.Zd = paramZz9e;
    this.Zv = paramZxzh;
    this.ZM = paramZrgq;
    this.Zf = paramConsumer;
    Zuh.Zb((paramZxzh != null), Zqf.Zr);
  }
  
  public Zsxd Zh(Zefx paramZefx, Zlhj paramZlhj) {
    Zsxd zsxd = this.Zv.ZZ(this.Zz, paramZefx, this.ZN, this.Zd, this.ZM.ZO(), this.Zf);
    Zvom zvom = zsxd.ZG().Zb();
    return (zvom != Zvom.NOT_ISSUED) ? zsxd : this.Zd.Zh(zsxd.ZG().ZR(), Zlhj.Zw(zsxd));
  }
  
  public void ZW(Zmzk paramZmzk) {
    this.ZN.ZJ(paramZmzk);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs8z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */