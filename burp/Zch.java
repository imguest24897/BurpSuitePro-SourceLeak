package burp;

public class Zch extends Zni implements Zx8_ {
  @Zzvo(0)
  private final Zlit Ze;
  
  @Zzvo(1)
  private final Ztu8 ZH;
  
  @Zzvo(2)
  private final byte Zg;
  
  @Zzvo(3)
  private final byte ZL;
  
  @Zzvo(4)
  private final Zefg<Zmwr> Zm;
  
  public Zch(Zlit paramZlit, Ztu8 paramZtu8) {
    this.Ze = paramZlit;
    this.ZH = paramZtu8;
    Zbqc[] arrayOfZbqc = Zef_.Zw();
    this.Zg = Zef_.Zv(paramZtu8);
    this.ZL = Zef_.ZT(paramZtu8);
    this.Zm = new Zyu<>(Zmwr.Zr, 0);
    if (Zbqc.Zwu() == null)
      Zef_.ZB(new Zbqc[3]); 
  }
  
  public Zlit ZZa() {
    return this.Ze;
  }
  
  public Ztu8 ZZh() {
    return this.ZH;
  }
  
  public Zefg<Zmwr> ZZp() {
    return this.Zm;
  }
  
  public byte ZZT() {
    return this.Zg;
  }
  
  public byte ZZ7() {
    return this.ZL;
  }
  
  public String toString() {
    return Zef_.ZT(this);
  }
  
  public Zeu4<Zx8_> ZF() {
    return ZW;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zch.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */