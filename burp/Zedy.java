package burp;

import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zkb;

public class Zedy {
  private final Zey9 Zd;
  
  private final AtomicInteger ZU;
  
  public Zedy(Zey9 paramZey9) {
    this.Zd = paramZey9;
    this.ZU = new AtomicInteger();
  }
  
  public Zsgq Zp(Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2) {
    Zbr zbr = Zbr.Zy(paramZstu1, Zkyt.AUTO);
    return Zx(paramZmzk, zbr, paramZstu2);
  }
  
  public Zsgq Zx(Zmzk paramZmzk, Zbr paramZbr, Zstu paramZstu) {
    int i = this.ZU.incrementAndGet();
    return Ze(paramZmzk, paramZbr, paramZstu, i, true);
  }
  
  public Zsgq ZX(Zsgq paramZsgq) {
    return Zp(paramZsgq.ZH(), paramZsgq.Zx(), paramZsgq.ZK());
  }
  
  public Zsgq Zv(Zsgq paramZsgq, Zefx paramZefx, Zstu paramZstu) {
    return Ze(paramZsgq.ZH(), Zbr.ZF(paramZefx, Zkyt.AUTO), paramZstu, paramZsgq.Zh(), paramZsgq.Zk());
  }
  
  private Zsgq Ze(Zmzk paramZmzk, Zbr paramZbr, Zstu paramZstu, int paramInt, boolean paramBoolean) {
    paramZstu = (paramZstu != null && paramZstu.Zpu() == 0) ? null : paramZstu;
    Zefx zefx = paramZbr.ZP(paramZmzk, this.Zd);
    String str1 = zefx.Zr();
    String str2 = (paramZmzk == null) ? "" : paramZmzk.ZJ1();
    String str3 = Zv(zefx);
    return new Zsgq(this.Zd, paramInt, paramBoolean, str1, str2, str3, paramZbr, paramZstu, paramZmzk);
  }
  
  private static String Zv(Zefx paramZefx) {
    Zlit zlit = paramZefx.ZF();
    return (zlit == null || zlit.Zd4() == null) ? "" : Zkb.ZG(zlit.Zd4());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zedy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */