package burp;

import java.util.Iterator;

class Zgur implements Runnable {
  final Ze3h ZR;
  
  final Zm7z ZX;
  
  Zgur(Zm7z paramZm7z, Ze3h paramZe3h) {}
  
  public void run() {
    Zboe zboe = this.ZX.Zn.Ze();
    Ze3h ze3h = this.ZR.Zd();
    float f1 = 0.0F;
    float f2 = 100.0F / ze3h.Zw();
    Iterator<Zz_1> iterator = ze3h.iterator();
    int[] arrayOfInt = Zgxf.ZV();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      if (!this.ZX.Zi(zz_1, zboe, this.ZX.ZL, f1, f2))
        break; 
      f1 += f2;
      if (arrayOfInt != null)
        break; 
    } 
    if (this.ZX.ZN > 0)
      this.ZX.Zg(); 
    this.ZX.Zn.Zv(zboe);
    if (Zbqc.Zwu() == null)
      Zgxf.ZJ(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgur.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */