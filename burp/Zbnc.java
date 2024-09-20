package burp;

import java.util.Iterator;

class Zbnc implements Runnable {
  private float Zc = 0.0F;
  
  final Zt7u Zq;
  
  final Ze3h Zv;
  
  final Zgxf ZS;
  
  Zbnc(Zgxf paramZgxf, Zt7u paramZt7u, Ze3h paramZe3h) {}
  
  public void run() {
    Zboe zboe = this.ZS.Ze();
    this.Zq.ZT(this.Zv);
    this.Zq.Zr();
    Iterator<Zz_1> iterator = this.Zv.iterator();
    int[] arrayOfInt = Zgxf.ZV();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      if (!zboe.Zq(this.Zc, null))
        return; 
      this.Zq.Zg(zz_1);
      this.Zc += this.Zq.Zs(zz_1);
      if (arrayOfInt != null)
        break; 
    } 
    if (!zboe.ZS())
      this.Zq.ZL(); 
    this.ZS.Zv(zboe);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbnc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */