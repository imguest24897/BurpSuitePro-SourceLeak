package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zr6d {
  public short ZM(Zstu paramZstu, int paramInt) {
    return ZO(paramZstu, new Zm7o(paramInt), new Zxop(new Zeny()));
  }
  
  short ZO(Zstu paramZstu, Zm7o paramZm7o, Zxop paramZxop) {
    Zekr zekr = new Zekr(paramZxop);
    Zrou zrou = new Zrou(paramZxop);
    Zk8x zk8x = (new Zr5l()).Zm(paramZxop);
    try {
      Short short_ = zekr.ZT(paramZstu, paramZm7o);
      if (ZK(short_))
        return short_.shortValue(); 
      short_ = zrou.ZT(paramZstu, paramZm7o);
      if (ZK(short_))
        return short_.shortValue(); 
      short_ = zk8x.ZT(paramZstu, paramZm7o);
      if (ZK(short_))
        return short_.shortValue(); 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return 1;
  }
  
  private boolean ZK(Short paramShort) {
    return (paramShort.shortValue() != 1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr6d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */