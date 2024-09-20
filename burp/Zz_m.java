package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Zz_m implements Runnable {
  private final Collection<Zzhb> ZU;
  
  private final Ztdi ZW;
  
  private final Zl6 ZG;
  
  private final Zlc8 ZQ;
  
  private final String ZE;
  
  private final Zee3 Zv;
  
  private final Zbnt ZA;
  
  private final Zr_4 Zr;
  
  private final Ztwv Zh;
  
  private Iterator<Zez3> Zz;
  
  private int ZT;
  
  private int Zq;
  
  private int ZP;
  
  Zz_m(Collection<Zzhb> paramCollection, Ztdi paramZtdi, Zl6 paramZl6, Zlc8 paramZlc8, String paramString, Zbnt paramZbnt, Ztwv paramZtwv, Zr_4 paramZr_4, Zrzv paramZrzv, Zey9 paramZey9) {
    this.ZU = paramCollection;
    this.ZW = paramZtdi;
    this.ZG = paramZl6;
    this.ZQ = paramZlc8;
    this.ZE = paramString;
    this.ZA = paramZbnt;
    this.Zh = paramZtwv;
    this.Zr = paramZr_4;
    this.Zv = new Zee3(paramZrzv, paramZl6.Zk, paramZl6.Zw, paramZey9);
  }
  
  public void run() {
    ArrayList<Zez3> arrayList = new ArrayList();
    Iterator<Zzhb> iterator = this.ZU.iterator();
    Zbqc[] arrayOfZbqc = Zzlr.Zp();
    while (iterator.hasNext()) {
      Zzhb zzhb = iterator.next();
      if (!Zzyo.Zx(arrayList, zzhb, this.ZQ, 0.0F, 0.0F, this.ZE))
        return; 
      if (arrayOfZbqc != null)
        break; 
    } 
    this.Zz = arrayList.iterator();
    this.ZT = arrayList.size();
    this.ZP = this.ZG.ZH;
    byte b = 0;
    while (b < this.ZG.ZH) {
      this.Zh.Zx(new Zglx(this));
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private synchronized Zez3 ZM() {
    if (!this.ZQ.Zq(100.0F * this.Zq / this.ZT, this.ZE))
      return null; 
    if (this.Zz.hasNext()) {
      this.Zq++;
      return this.Zz.next();
    } 
    this.ZP--;
    if (this.ZP == 0)
      synchronized (this) {
        notifyAll();
      }  
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz_m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */