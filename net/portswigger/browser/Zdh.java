package net.portswigger.browser;

import burp.Zbqc;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zdh implements Iterator<Zh> {
  private final Queue<Zh> Zj = new LinkedList<>();
  
  private int ZN = 0;
  
  final Zdc Zo;
  
  private Zdh(Zdc paramZdc) {}
  
  public boolean hasNext() {
    Zh();
    String[] arrayOfString = Zdc.Zj();
    if (Zbqc.Zwu() == null)
      Zdc.Zw(new String[3]); 
    return !this.Zj.isEmpty();
  }
  
  public Zh ZH() {
    Zh();
    return this.Zj.poll();
  }
  
  private void Zh() {
    String[] arrayOfString = Zdc.Zj();
    try {
      if (this.Zo.Zs == null)
        return; 
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    while (this.Zj.isEmpty()) {
      try {
        if (this.ZN <= this.Zo.ZS.ZE()) {
          if (this.ZN > 0)
            try {
              Thread.sleep(10L * (1L << this.ZN));
            } catch (InterruptedException interruptedException) {
              Zah.Zl(interruptedException, Zk_.UNEXPECTED);
              Thread.currentThread().interrupt();
              return;
            }  
          try {
          
          } catch (InterruptedException interruptedException) {
            throw a(null);
          } 
          this.Zj.addAll(Zt((this.ZN < this.Zo.ZS.ZE())));
          this.ZN++;
          if (arrayOfString != null)
            break; 
        } 
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
    } 
  }
  
  private List<Zh> Zt(boolean paramBoolean) {
    Iterator<Zeo> iterator = Zeo.ZJ.iterator();
    String[] arrayOfString = Zdc.Zj();
    while (iterator.hasNext()) {
      Zeo zeo = iterator.next();
      if (zeo.Zj(this.Zo.Zs)) {
        List<Zh> list = zeo.Zn(this.Zo.Zs, this.Zo.ZN, this.Zo.Zg, this.Zo.ZE);
        if (!list.isEmpty() || paramBoolean)
          return list; 
      } 
      if (arrayOfString != null)
        break; 
    } 
    return Collections.emptyList();
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zdh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */