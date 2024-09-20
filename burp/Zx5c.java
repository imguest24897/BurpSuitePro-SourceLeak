package burp;

import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.Zkb;

public class Zx5c {
  public static Zx8r ZD(Zgu3 paramZgu3, Zsmh paramZsmh, Zrqo paramZrqo) {
    AtomicReference<Zx8r> atomicReference = new AtomicReference();
    paramZsmh.Zh(new Zebq(atomicReference, paramZrqo, paramZgu3));
    return atomicReference.get();
  }
  
  private static Zx8r ZB(Zefx paramZefx, Zrqo paramZrqo) {
    AtomicReference<Zx8r> atomicReference = new AtomicReference();
    paramZefx.Zi(new Zmjd(atomicReference, paramZrqo));
    return atomicReference.get();
  }
  
  private static Zx8r Zr(Zr6q paramZr6q, Zrqo paramZrqo) {
    int i = Zkb.ZG(paramZr6q.ZD()).indexOf('\n') + 1;
    if (paramZrqo.Zjv() <= i)
      return Zx8r.REQUEST_LINE; 
    int j = paramZr6q.ZN();
    return (paramZrqo.Zjv() <= j) ? Zx8r.REQUEST_HEADERS : ((paramZrqo.Zji() >= j) ? Zx8r.REQUEST_BODY : Zx8r.REQUEST);
  }
  
  private static Zx8r ZW(Zr6h paramZr6h, Zrqo paramZrqo) {
    return paramZr6h.ZH() ? Zx8r.REQUEST_BODY : ZB(paramZr6h.Zt(), paramZrqo);
  }
  
  private static Zx8r ZS(Zxpe paramZxpe, Zrqo paramZrqo) {
    int i = paramZxpe.ZS().Zis().indexOf('\n') + 1;
    if (paramZrqo.Zjv() <= i)
      return Zx8r.RESPONSE_STATUS_LINE; 
    int j = Zgyj.ZW(paramZxpe.ZS(), 0);
    return (paramZrqo.Zjv() <= j) ? Zx8r.RESPONSE_HEADERS : ((paramZrqo.Zji() >= j) ? Zx8r.RESPONSE_BODY : Zx8r.RESPONSE);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx5c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */