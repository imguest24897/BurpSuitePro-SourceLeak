package burp;

import java.io.IOException;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public interface Zemd {
  Zefx Zq(Zkbo paramZkbo, Zefx paramZefx) throws IOException, Zryo, Zxt3, Zryj;
  
  static Zemd Zm(Zsy paramZsy, Zrgd paramZrgd, Zkjm paramZkjm) {
    boolean bool = (paramZkjm == null) ? false : paramZkjm.Zn();
    switch (bool) {
      case false:
      case true:
        return new Zl8q();
      case true:
        return new Zllz(paramZkjm);
      case true:
        return new Zss7(new Ztqb(paramZkjm));
      case true:
        return new Zss7(new Ztqk(paramZrgd, paramZsy, paramZkjm));
    } 
    Zuh.Zv(false, Zqf.Zr, bool);
    return new Zl8q();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zemd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */