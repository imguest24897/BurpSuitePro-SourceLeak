package burp;

import java.util.Iterator;

class Zj2 extends Zni implements Zt1i {
  @Zzvo(1)
  private final Zrfx<Zeu9> Zn;
  
  Zj2(Zrfx<Zeu9> paramZrfx) {
    this.Zn = paramZrfx;
  }
  
  public boolean ZF(Zeu9 paramZeu9) {
    return this.Zn.add(paramZeu9);
  }
  
  public boolean ZB(Zeu9 paramZeu9) {
    return this.Zn.contains(paramZeu9);
  }
  
  public int ZXY() {
    return this.Zn.size();
  }
  
  public Iterator<Zeu9> iterator() {
    return this.Zn.iterator();
  }
  
  public Zeu4<? extends Zt1i> ZF() {
    return Zt1i.Zp;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zj2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */