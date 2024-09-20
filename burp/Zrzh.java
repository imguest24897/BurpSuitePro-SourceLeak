package burp;

public class Zrzh {
  private final Zzh2 ZD;
  
  private final Zbp5 ZJ;
  
  private static String Zo;
  
  public Zrzh(Zzh2 paramZzh2, Zbp5 paramZbp5) {
    this.ZD = paramZzh2;
    this.ZJ = paramZbp5;
  }
  
  public byte[] ZI() {
    String str = Zy();
    Zstu zstu = this.ZD.ZGU();
    if (str != null)
      Zbqc.Zr(new Zbqc[5]); 
    return (zstu != null) ? zstu.ZiD() : new byte[0];
  }
  
  public Zstu Z_() {
    return this.ZD.ZGy();
  }
  
  public Ze3o Zd() {
    return this.ZD.ZGf() ? Ze3o.CLIENT_TO_SERVER : Ze3o.SERVER_TO_CLIENT;
  }
  
  public String Zv() {
    return this.ZD.ZIx();
  }
  
  public void ZI(String paramString) {
    this.ZD.Zxg(paramString);
  }
  
  public Zmtd ZA() {
    return Zmtd.ZC(this.ZD.ZaP());
  }
  
  public void ZQ(Zmtd paramZmtd) {
    this.ZD.ZB(paramZmtd.index);
  }
  
  public Zefx Ze() {
    return this.ZJ.ZO(this.ZD.ZGx());
  }
  
  public int ZB() {
    return this.ZD.ZEe();
  }
  
  public long ZE() {
    return this.ZD.ZoB();
  }
  
  public int ZO() {
    return this.ZD.ZGx();
  }
  
  public static void Zp(String paramString) {
    Zo = paramString;
  }
  
  public static String Zy() {
    return Zo;
  }
  
  static {
    if (Zy() != null)
      Zp("n4CHfb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrzh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */