package burp;

import java.util.Iterator;
import java.util.List;

public abstract class Zrbe {
  public abstract List<Zbzg> ZF();
  
  public Zl4m Zy(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    double d1 = ZD(paramZrdb1);
    double d2 = ZD(paramZrdb2);
    return (d1 > d2) ? Zl4m.Zh : ((d1 < d2) ? Zl4m.Zf : Zl4m.ZX);
  }
  
  private double ZD(Zrdb paramZrdb) {
    double d = 0.0D;
    Iterator<Zbzg> iterator = ZF().iterator();
    Zbqc[] arrayOfZbqc = Zxll.ZT();
    while (iterator.hasNext()) {
      Zbzg zbzg = iterator.next();
      d += zbzg.Zp(paramZrdb.Zam());
      if (arrayOfZbqc == null)
        break; 
    } 
    return d;
  }
  
  protected static Zbzg ZM(int paramInt, double paramDouble) {
    return new Zbzg(paramInt, paramDouble);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrbe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */