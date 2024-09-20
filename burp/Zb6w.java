package burp;

public class Zb6w implements Zlza {
  final String Zx;
  
  final String Zz;
  
  final int Zk;
  
  final int ZT;
  
  static Zb6w Zk(Zt8g paramZt8g) {
    return new Zb6w(paramZt8g.Zns(), paramZt8g.Zbn(), paramZt8g.Zba(), paramZt8g.Zb2());
  }
  
  static Zb6w ZL(String paramString1, String paramString2, int paramInt) {
    return new Zb6w(paramString1, paramString2, paramInt, paramInt + paramString1.length() + paramString2.length() + 1);
  }
  
  private Zb6w(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    this.Zx = paramString1;
    this.Zz = paramString2;
    this.Zk = paramInt1;
    this.ZT = paramInt2;
  }
  
  public String Zp() {
    return this.Zx;
  }
  
  public String ZP() {
    return this.Zz;
  }
  
  public Zb6u Zc() {
    return new Zb6u(Zeup.QUERY_PARAM, this.Zx, this.Zz);
  }
  
  int ZH() {
    return this.ZT - this.Zk;
  }
  
  public String toString() {
    return this.Zx + "=" + this.Zx;
  }
  
  Zb6w ZA(int paramInt) {
    return new Zb6w(this.Zx, this.Zz, this.Zk + paramInt, this.ZT + paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb6w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */