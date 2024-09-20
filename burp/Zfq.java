package burp;

public abstract class Zfq extends Zni implements Zz_b {
  private final Zz_4 ZU;
  
  @Zzvo(4)
  private final String Za;
  
  @Zzvo(5)
  private final String ZR;
  
  @Zzvo(6)
  private final String Zp;
  
  @Zzvo(11)
  private final Zefg<Zsdr> Zx;
  
  protected Zfq(Zz_4 paramZz_4, String paramString1, String paramString2, String paramString3, Zefg<Zsdr> paramZefg) {
    this.ZU = paramZz_4;
    this.Za = paramString1;
    String str = Zx9w.Zjz();
    this.ZR = paramString2;
    this.Zp = paramString3;
    this.Zx = paramZefg;
    if (str != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public Zz_4 ZML() {
    return this.ZU;
  }
  
  public String ZMm() {
    return this.Za;
  }
  
  public String ZMp() {
    return this.ZR;
  }
  
  public String ZMg() {
    return this.Zp;
  }
  
  public Zefg<Zsdr> ZMo() {
    return this.Zx;
  }
  
  @Zzvo(2)
  private int ZEg() {
    return this.ZU.id;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zfq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */