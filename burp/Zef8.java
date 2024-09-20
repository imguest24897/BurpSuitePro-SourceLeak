package burp;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import net.portswigger.Zsy;

public class Zef8 {
  private final Zgb6 Zv;
  
  private final Ztbb Zk;
  
  private final Zeew ZF;
  
  private final Zxg_ ZY;
  
  private final Zgg0 Zf;
  
  private final Zxy1 Zb;
  
  private final Zlg9 Za;
  
  private final Zxzh ZT;
  
  private final Zsw Zp;
  
  private final Ze6v ZM;
  
  public Zef8(Zrgd paramZrgd, Zsy paramZsy, Consumer<Duration> paramConsumer, Zgb6 paramZgb6, Zgzy paramZgzy, Zsw paramZsw, Zz28 paramZz28, Zkl6 paramZkl6, Zeew paramZeew, Ztwv paramZtwv, Zkc6 paramZkc6, Zgg0 paramZgg0, Zxy1 paramZxy1, Zlg9 paramZlg9, Zk86 paramZk86, Zkoq paramZkoq, Zg6h paramZg6h, Zsxe paramZsxe, Zlfd paramZlfd) {
    this.Zv = paramZgb6;
    this.Zk = paramZkl6.ZM();
    this.ZF = paramZeew;
    this.ZY = paramZgzy.Zq();
    this.Zf = paramZgg0;
    this.Zb = paramZxy1;
    this.Za = paramZlg9;
    this.ZT = paramZgzy.Zh();
    this.Zp = paramZsw;
    this.ZM = new Ze6v(paramZkl6, paramZgzy, paramZz28, paramZrgd, paramZsy, paramConsumer, paramZgb6, paramZeew, paramZtwv, paramZkc6, paramZk86, paramZkoq, paramZg6h, paramZsxe, paramZlfd);
  }
  
  public Zk7l Zm(Zzu paramZzu, Zgzx paramZgzx, Zxtb paramZxtb, Zsil paramZsil, Zzen paramZzen) {
    AtomicReference<Zs8z> atomicReference = new AtomicReference();
    Zxw2 zxw2 = new Zxw2(paramZzen);
    Zz9e zz9e = this.ZM.Zc(paramZzu, paramZgzx, paramZxtb, paramZsil, zxw2, this.Zp, this.Zf, this.Zb);
    Objects.requireNonNull(atomicReference);
    Ze_d ze_d = new Ze_d(this.Zv.ZfD(), this.Za, zz9e, atomicReference::get);
    Objects.requireNonNull(zxw2);
    Zln9 zln9 = new Zln9(this.ZY, zxw2::Zt, ze_d);
    int i = Zloq.ZW();
    Zb1g zb1g = new Zb1g(paramZzu, paramZgzx, paramZxtb, paramZsil, paramZzen, this.ZM, this.ZY, zxw2, this.Zv, this.Za, this.Zf, this.Zb, this.Zk);
    Zs8z zs8z = new Zs8z(this.ZF, zb1g, zln9, this.ZT, paramZzu.ZK(), zxw2);
    atomicReference.set(zs8z);
    if (i != 0)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zzo3(zs8z);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zef8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */