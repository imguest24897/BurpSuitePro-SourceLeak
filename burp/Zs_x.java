package burp;

public class Zs_x implements Zv8a {
  private final Zbw_<?> ZB;
  
  private final Ze47 Zy;
  
  Zs_x(Zbw_<?> paramZbw_, Ze47 paramZe47) {
    this.ZB = paramZbw_;
    this.Zy = paramZe47;
  }
  
  public void Za(Zziw paramZziw, Zz2j paramZz2j) {
    Zmzk zmzk = paramZz2j.Zx();
    Zkyt zkyt = this.Zy.Zw(zmzk);
    Zbr zbr1 = Zbr.Zy(paramZz2j.ZN(), zkyt);
    Zbr zbr2 = Zbr.Zy(paramZz2j.Za(), zkyt);
    Zeo2 zeo2 = this.ZB.ZFN().Zq(paramZziw.ZR(), paramZz2j.ZH(), zbr1, zbr2);
    paramZziw.Zq(zeo2);
  }
  
  public void ZT(Zml3 paramZml3, Zstu paramZstu, Zkyt paramZkyt) {
    paramZml3.Zd().ZJ(Zbr.Zy(paramZstu, paramZkyt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */