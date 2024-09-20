package burp;

abstract class Zsv3 implements Zxj1 {
  private final int ZM;
  
  private final Zeo2 Zs;
  
  private final Zm6x ZY;
  
  private Zmzk Zd;
  
  public Zsv3(int paramInt, Zeo2 paramZeo2, Zmzk paramZmzk, Zm6x paramZm6x) {
    this.ZM = paramInt;
    this.Zs = paramZeo2;
    this.Zd = paramZmzk;
    this.ZY = paramZm6x;
  }
  
  public String ZV() {
    return this.Zs.ZIx();
  }
  
  public void ZP(String paramString) {
    this.Zs.Zxg(paramString);
    this.ZY.ZB(new Zluv(this.Zs, Zg9f.EXTENDER));
  }
  
  public String ZN() {
    return Zmtd.Zm(this.Zs.ZaP());
  }
  
  public void ZB(String paramString) {
    this.Zs.ZB(Zmtd.ZN(paramString));
  }
  
  public Zmzk Zs() {
    return this.Zd;
  }
  
  public void ZU(Zmzk paramZmzk) {
    this.Zd = paramZmzk;
  }
  
  public int Zk() {
    return this.ZM;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsv3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */