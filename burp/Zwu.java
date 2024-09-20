package burp;

public class Zwu extends Zni implements Zmkf {
  @Zzvo(1)
  private String Zx;
  
  @Zzvo(2)
  private String Zv;
  
  @Zzvo(3)
  private String Zb;
  
  @Zzvo(4)
  private boolean ZI;
  
  private static Zbqc[] Zk;
  
  public String ZiQ() {
    return this.Zx;
  }
  
  public void Zc(String paramString) {
    this.Zx = (paramString == null) ? "" : paramString;
  }
  
  public String Zir() {
    return this.Zv;
  }
  
  public void ZO(String paramString) {
    Zbqc[] arrayOfZbqc = ZRj();
    this.Zv = (paramString == null) ? "" : paramString;
    this.Zb = "";
    if (Zbqc.Zwu() == null)
      Z_(new Zbqc[1]); 
  }
  
  public String Ziu() {
    return this.Zb;
  }
  
  public void Zg(String paramString) {
    Zbqc[] arrayOfZbqc = ZRj();
    this.Zb = (paramString == null) ? "" : paramString;
    this.Zv = "";
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public void ZC(boolean paramBoolean) {
    this.ZI = paramBoolean;
  }
  
  public Zeu4<Zmkf> ZF() {
    return Zmkf.ZE;
  }
  
  public static void Z_(Zbqc[] paramArrayOfZbqc) {
    Zk = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZRj() {
    return Zk;
  }
  
  static {
    if (ZRj() == null)
      Z_(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */