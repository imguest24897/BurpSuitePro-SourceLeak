package burp;

import java.util.Iterator;

class Zbxh implements Zmu7 {
  private Zsdd ZN;
  
  final Zlik Zh;
  
  private Zbxh(Zlik paramZlik) {}
  
  public Zmv4 ZT() {
    while (true) {
      this.ZN = this.Zh.ZR.Zy();
      if (this.ZN == null) {
        if (!this.Zh.Zo.hasNext())
          return null; 
        this.Zh.ZR = new Zzzp(this.Zh.Zo.next(), this.Zh.ZJ, this.Zh.ZI, this.Zh.Zp, this.Zh.Zc);
      } 
      if (this.ZN != null) {
        this.Zh.ZH.Za(this.ZN.ZS());
        return this.Zh.ZH;
      } 
    } 
  }
  
  public Iterator<Zb3t> Zm() {
    return new Zsxz(this.Zh.ZZ, this.ZN);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbxh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */