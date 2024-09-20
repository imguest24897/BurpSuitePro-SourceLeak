package burp;

import java.util.Set;

class Zz1w {
  private final Zs66 Zv;
  
  private final Znf Zl;
  
  private final Zsd ZI;
  
  Zz1w(Zs66 paramZs66, Znf paramZnf, Zsd paramZsd) {
    this.Zv = paramZs66;
    this.Zl = paramZnf;
    this.ZI = paramZsd;
  }
  
  void Zj(String paramString, Set<Integer> paramSet) {
    if (this.ZI.ZJ(this.Zv) || ZG() || ZU(paramString, paramSet))
      return; 
    this.Zl.Zl(paramString, paramSet);
  }
  
  void Zu(Set<Integer> paramSet) {
    if (this.ZI.ZJ(this.Zv) || ZG())
      return; 
    this.Zl.Zs(paramSet);
  }
  
  boolean Zu() {
    if (Zp(this.Zv))
      return false; 
    int i = this.ZI.ZT(this.Zv);
    int j = this.ZI.Zv(this.Zv) ? Zw(i) : i;
    return (ZD() >= j);
  }
  
  boolean Za(String paramString) {
    if (Zc(this.Zv))
      return false; 
    int i = this.ZI.ZU(this.Zv);
    int j = this.ZI.Za(this.Zv) ? Zw(i) : i;
    Integer integer = Zr(paramString);
    return (integer != null && integer.intValue() >= j);
  }
  
  private boolean ZU(String paramString, Set<Integer> paramSet) {
    return ((paramSet == null || paramSet.isEmpty()) && (Zu() || Za(paramString)));
  }
  
  private int Zw(int paramInt) {
    int i = paramInt;
    if (this.Zl.Zh())
      i *= 2; 
    if (this.Zl.Zn())
      i *= 2; 
    return i;
  }
  
  private int ZD() {
    return this.Zl.Zz();
  }
  
  private Integer Zr(String paramString) {
    return this.Zl.ZE(paramString);
  }
  
  private boolean ZG() {
    return (Zp(this.Zv) || Zc(this.Zv));
  }
  
  private boolean Zp(Zs66 paramZs66) {
    return (this.ZI.Zv(paramZs66) && this.Zl.ZM() >= 3);
  }
  
  private boolean Zc(Zs66 paramZs66) {
    return (this.ZI.Za(paramZs66) && this.Zl.ZM() >= 3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz1w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */