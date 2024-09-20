package burp;

public class Zxop implements Zbf1, Ze60 {
  private static final Zrzd Zr = new Ztek();
  
  public final Zeny Za;
  
  private final Zrzd ZR;
  
  private final Zrzd ZV;
  
  public final Zrzd Zg;
  
  private final Zlqi ZH;
  
  private boolean Zv = false;
  
  private boolean Zc = false;
  
  public Zxop(Zeny paramZeny) {
    this.Za = paramZeny;
    this.ZR = new Zk9g(this);
    this.ZV = new Zeiw(this);
    int[] arrayOfInt = Zmra.Zd();
    this.Zg = new Zmra(new Zrzd[] { this.ZR, this.ZV });
    this.ZH = new Zlqi(this, new Ze60[] { this });
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public boolean ZV() {
    return this.Za.Zw();
  }
  
  public boolean Zz() {
    return this.Za.ZN();
  }
  
  public boolean Zx() {
    return this.Za.Zy();
  }
  
  public boolean Zo() {
    return this.Zv;
  }
  
  public boolean Zf() {
    return this.Zc;
  }
  
  public void ZT() {
    this.Zv = true;
  }
  
  public void ZO() {
    this.Zc = true;
  }
  
  public int ZO(Zstu paramZstu, int paramInt) {
    int i = 0;
    i += this.ZR.Zo(paramZstu, paramInt + i);
    i += this.ZV.Zo(paramZstu, paramInt + i);
    int[] arrayOfInt = Zmra.Zd();
    i += Zr.Zo(paramZstu, paramInt + i);
    if (Zbqc.Zwu() == null)
      Zmra.Zk(new int[4]); 
    return i;
  }
  
  public void Ze(byte paramByte) {
    this.ZH.Zp(paramByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxop.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */