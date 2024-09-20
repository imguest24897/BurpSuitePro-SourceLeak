package burp;

import java.io.IOException;
import net.portswigger.Zsy;

public class Zsbb implements Zkm {
  private final Zemd Zu;
  
  private final Zggf ZI;
  
  private final boolean Zb;
  
  public Zsbb(Zmzk paramZmzk1, Zmzk paramZmzk2, Zrgd paramZrgd, Zkjm paramZkjm1, Zkjm paramZkjm2, Zsy paramZsy) {
    this.Zu = Zemd.Zm(paramZsy, paramZrgd, paramZkjm1);
    this.ZI = Zggf.ZZ(paramZsy, paramZrgd, paramZmzk2, paramZmzk1, paramZkjm2);
    int i = Zggf.ZL();
    this.Zb = (paramZkjm1 != null && paramZkjm1.Zx());
    if (Zbqc.Zwu() == null)
      Zggf.ZF(++i); 
  }
  
  public Zefx Z_(Zkbo paramZkbo, Zefx paramZefx) throws IOException, Zryo, Zxt3, Zryj {
    Zefx zefx = this.ZI.Zd(paramZkbo, paramZefx, this.Zb);
    return this.Zu.Zq(paramZkbo, zefx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsbb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */