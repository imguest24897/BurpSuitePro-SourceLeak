package burp;

public class Za9 extends Zni implements Zz9d {
  @Zzvo(0)
  private byte ZE;
  
  @Zzvo(1)
  private boolean ZG = true;
  
  @Zzvo(32)
  private byte ZH;
  
  @Zzvo(33)
  private final Zefg<Zsdr> Zu;
  
  @Zzvo(34)
  private final Zefg<Zsdr> ZU;
  
  public Za9() {
    int[] arrayOfInt = Zr5q.ZN();
    this.ZH = 0;
    this.Zu = new Zyu<>(Zsdr.Zo, 0);
    this.ZU = new Zyu<>(Zsdr.Zo, 0);
    if (Zbqc.Zwu() == null)
      Zr5q.ZY(new int[5]); 
  }
  
  public byte ZiY() {
    return this.ZH;
  }
  
  public void Zp(byte paramByte) {
    this.ZH = paramByte;
  }
  
  public Zefg<Zsdr> Zi5() {
    return this.Zu;
  }
  
  public Zefg<Zsdr> Zic() {
    return this.ZU;
  }
  
  public boolean ZGq() {
    return this.ZG;
  }
  
  public void ZNm(boolean paramBoolean) {
    this.ZG = paramBoolean;
  }
  
  public Zeu4<Zz9d> ZF() {
    return Z_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Za9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */