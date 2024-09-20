package burp;

import java.util.List;

public class Zs5l {
  private final List<Zzyu> Zg;
  
  private final Zsob Zo;
  
  public Zs5l(List<Zzyu> paramList, Zsob paramZsob) {
    this.Zg = paramList;
    this.Zo = paramZsob;
  }
  
  public Zsny Zq(Zr6e paramZr6e) {
    Zbqc[] arrayOfZbqc = Ztpl.ZC();
    Zsny zsny = new Zsny();
    if (paramZr6e == null)
      return zsny; 
    synchronized (this.Zg) {
      byte b = 0;
      while (b < this.Zo.Zh()) {
        Zggb zggb = this.Zo.ZE(b);
        if (!zggb.Zm()) {
          Zzyu zzyu = this.Zg.get(zggb.Zc());
          if (paramZr6e.ZF(zzyu.ZR()))
            zsny.Zx(zzyu); 
        } 
        b++;
        if (arrayOfZbqc == null)
          break; 
      } 
      return zsny;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs5l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */