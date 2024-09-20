package burp;

import java.util.Iterator;

class Zl_m implements Runnable {
  final Ze3h Zz;
  
  final Zmai ZQ;
  
  Zl_m(Zmai paramZmai, Ze3h paramZe3h) {}
  
  public void run() {
    Zboe zboe = this.ZQ.Za.Ze();
    Ze3h ze3h = this.Zz.Zd();
    this.ZQ.Za.ZJ(false);
    float f1 = 0.0F;
    float f2 = 100.0F / ze3h.Zw();
    Iterator<Zz_1> iterator = ze3h.iterator();
    int[] arrayOfInt = Zgxf.ZV();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      if (!this.ZQ.Zh(zz_1, zboe, f1, f2))
        break; 
      f1 += f2;
      if (arrayOfInt != null) {
        Zbqc.Zr(new Zbqc[4]);
        break;
      } 
    } 
    if (this.ZQ.ZW > 0)
      this.ZQ.ZP(); 
    this.ZQ.Za.ZJ(true);
    this.ZQ.Za.Zv(zboe);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl_m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */