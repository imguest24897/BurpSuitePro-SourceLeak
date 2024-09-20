package burp;

import java.awt.Component;
import java.util.Collections;
import java.util.List;

public class Zl7e implements Zll9 {
  private final Zzme Zd;
  
  private final Zstu Zh;
  
  public Zl7e(Zzme paramZzme, Zey9 paramZey9) {
    this.Zd = paramZzme;
    this.Zh = ZW(paramZzme, paramZey9);
  }
  
  private static Zstu ZW(Zzme paramZzme, Zey9 paramZey9) {
    Zefx zefx1 = paramZzme.ZQ(paramZey9);
    Zefx zefx2 = zefx1.Zb();
    return Zyf.Zy(zefx2.ZD());
  }
  
  public Zlit ZlL() {
    return this.Zd.ZHm();
  }
  
  public Zeew Ze2() {
    return Zeew.ORGANISER;
  }
  
  public short Zl7() {
    return (short)this.Zd.ZHI();
  }
  
  public int Zlq() {
    return this.Zd.ZHY();
  }
  
  public String ZIx() {
    return this.Zd.ZAs();
  }
  
  public Zmzk Zod() {
    return this.Zd.ZHC();
  }
  
  public Zstu Zos() {
    return this.Zh;
  }
  
  public Zstu ZoO() {
    return this.Zd.ZHh();
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public long ZoB() {
    return this.Zd.ZHP();
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return new Zs9t(this.Zd, this.Zh);
  }
  
  public List<Component> Zof() {
    return Collections.emptyList();
  }
  
  public Zepe Zl(Component paramComponent) {
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl7e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */