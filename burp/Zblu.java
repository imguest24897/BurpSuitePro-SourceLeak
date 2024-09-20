package burp;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zfg;
import net.portswigger.Zrz_;

class Zblu implements Zfg {
  private final AtomicBoolean Zh = new AtomicBoolean();
  
  final Zrwh ZR;
  
  private Zblu(Zrwh paramZrwh) {}
  
  public void Zo(Zrz_ paramZrz_) {
    Zl36 zl36 = new Zl36(paramZrz_, Zt83.ZS);
    Iterator<Zlgo> iterator = this.ZR.Zh.iterator();
    Zbqc[] arrayOfZbqc = Zsg3.Zh();
    while (iterator.hasNext()) {
      Zlgo zlgo = iterator.next();
      if (zl36 != null)
        zl36 = zlgo.ZI(zl36); 
      if (arrayOfZbqc != null)
        break; 
    } 
    if (zl36 != null)
      for (Zlgo zlgo : this.ZR.Zh) {
        zlgo.ZF(zl36);
        if (arrayOfZbqc != null)
          break; 
      }  
    Zl3z zl3z = (zl36 == null) ? null : new Zl3z(zl36, false);
    for (Zlm zlm : this.ZR.ZR) {
      if (zl3z != null)
        zl3z = zlm.Ze(zl3z); 
      if (arrayOfZbqc != null)
        break; 
    } 
    if (zl3z != null)
      for (Zlm zlm : this.ZR.ZR) {
        zlm.ZM(zl3z);
        if (arrayOfZbqc != null)
          break; 
      }  
  }
  
  public void Zy(Throwable paramThrowable) {
    if (this.Zh.compareAndSet(false, true)) {
      this.ZR.Zk.run();
      this.ZR.Zh.forEach(Zr0l::ZP);
      this.ZR.Zh.clear();
      this.ZR.ZR.forEach(Zlm::ZI);
      this.ZR.ZR.clear();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zblu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */