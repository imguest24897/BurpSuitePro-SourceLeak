package burp;

class Za1 extends Zni implements Zr_8 {
  @Zzvo(0)
  private byte ZE;
  
  @Zzvo(1)
  private boolean ZT = true;
  
  @Zzvo(32)
  private boolean ZK = true;
  
  @Zzvo(33)
  private byte ZG;
  
  @Zzvo(34)
  private final Zefg<Zsdr> Zz;
  
  @Zzvo(35)
  private final Zefg<Zsdr> Zp;
  
  @Zzvo(36)
  private Zmk5 Zq;
  
  @Zzvo(37)
  private boolean ZB;
  
  Za1() {
    int[] arrayOfInt = Zeja.ZG();
    this.ZG = 0;
    this.Zz = new Zyu<>(Zsdr.Zo, 0);
    this.Zp = new Zyu<>(Zsdr.Zo, 0);
    this.ZB = true;
    if (Zbqc.Zwu() == null)
      Zeja.ZZ(new int[5]); 
  }
  
  public boolean Zka() {
    return this.ZK;
  }
  
  public void Zes(boolean paramBoolean) {
    this.ZK = paramBoolean;
  }
  
  public byte Zkl() {
    return this.ZG;
  }
  
  public void Zo(byte paramByte) {
    this.ZG = paramByte;
  }
  
  public Zefg<Zsdr> ZkB() {
    return this.Zz;
  }
  
  public Zefg<Zsdr> ZkZ() {
    return this.Zp;
  }
  
  public boolean ZkA() {
    return this.ZB;
  }
  
  public void Zed(boolean paramBoolean) {
    this.ZB = paramBoolean;
  }
  
  public Zmk5 Zk1() {
    return this.Zq;
  }
  
  public void Ze(Zmk5 paramZmk5) {
    this.Zq = paramZmk5;
  }
  
  public boolean ZGq() {
    return this.ZT;
  }
  
  public void ZNm(boolean paramBoolean) {
    this.ZT = paramBoolean;
  }
  
  public Zeu4<? extends Zr_8> ZF() {
    return ZZ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Za1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */