package burp;

public abstract class Zn2 extends Zni implements Zzem {
  @Zzvo(0)
  private final int ZJ;
  
  @Zzvo(1)
  private final Ztkk Zh;
  
  @Zzvo(2)
  private byte ZF;
  
  @Zzvo(3)
  private String Zr;
  
  @Zzvo(4)
  private boolean Zy = true;
  
  public Zn2(int paramInt, Ztkk paramZtkk) {
    int i = Zxsy.ZH();
    this.ZJ = paramInt;
    this.Zh = paramZtkk;
    if (i == 0)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public int ZB() {
    return this.ZJ;
  }
  
  public Ztkk Zg() {
    return this.Zh;
  }
  
  public byte ZaP() {
    return this.ZF;
  }
  
  public void ZB(byte paramByte) {
    this.ZF = paramByte;
  }
  
  public String ZIx() {
    return this.Zr;
  }
  
  public void Zxg(String paramString) {
    this.Zr = paramString;
  }
  
  public boolean Zi() {
    return this.Zy;
  }
  
  public void Ze(boolean paramBoolean) {
    this.Zy = paramBoolean;
  }
  
  public Zeu4<? extends Zzem> ZF() {
    return Zp;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zn2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */