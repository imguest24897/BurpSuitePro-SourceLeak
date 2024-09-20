package burp;

import java.awt.Component;

class Zzn2 extends Zzn1 {
  final Zg80 Zi;
  
  Zzn2(Zg80 paramZg80) {}
  
  public void Zw(int paramInt) {
    int[] arrayOfInt = Ztpr.ZJx();
    Component component = this.Zi.ZI.getComponentAt(paramInt);
    if (component instanceof Zg8p) {
      Zg8p zg8p = (Zg8p)component;
      zg8p.Zc();
      if (arrayOfInt != null) {
        this.Zi.ZK.Zh();
        return;
      } 
      return;
    } 
    this.Zi.ZK.Zh();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzn2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */