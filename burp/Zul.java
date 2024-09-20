package burp;

import net.portswigger.Zo;

class Zul extends Zni implements Zzh2 {
  @Zzvo(4)
  private final long Zl;
  
  @Zzvo(7)
  private final int ZT;
  
  @Zzvo(9)
  private final Zstu Zy;
  
  @Zzvo(2)
  private final int ZZ;
  
  @Zzvo(8)
  private final boolean Zt;
  
  private final byte Zz;
  
  private final Zo ZQ;
  
  @Zzvo(11)
  private Zstu Ze;
  
  @Zzvo(10)
  private Zstu ZX;
  
  @Zzvo(0)
  private int ZW;
  
  @Zzvo(6)
  private byte Zn;
  
  @Zzvo(14)
  private int ZC;
  
  @Zzvo(15)
  private String ZV;
  
  Zul(int paramInt1, Zstu paramZstu1, Zstu paramZstu2, boolean paramBoolean, byte paramByte, Zo paramZo, long paramLong, int paramInt2) {
    this.ZT = paramInt1;
    this.Zy = paramZstu1;
    this.ZX = paramZstu2;
    this.Zt = paramBoolean;
    this.Zz = paramByte;
    this.ZQ = paramZo;
    String[] arrayOfString = Zzm1.Zy();
    this.Zl = paramLong;
    this.ZZ = paramZstu1.Zpu();
    this.ZC = paramInt2;
    if (Zbqc.Zwu() == null)
      Zzm1.ZO(new String[3]); 
  }
  
  public byte ZaP() {
    return this.Zn;
  }
  
  public void ZB(byte paramByte) {
    this.Zn = paramByte;
  }
  
  public void ZuP(int paramInt) {
    this.ZW = paramInt;
  }
  
  public int ZEK() {
    return this.ZW;
  }
  
  public void Zxg(String paramString) {
    ZWK(paramString);
  }
  
  public String ZIx() {
    return ZAs();
  }
  
  public String ZAs() {
    return (this.ZV == null) ? "" : this.ZV;
  }
  
  public void ZWK(String paramString) {
    this.ZV = paramString;
  }
  
  public long ZoB() {
    return this.Zl;
  }
  
  public int ZEe() {
    return this.ZT;
  }
  
  public boolean ZGf() {
    return this.Zt;
  }
  
  public Zstu ZGU() {
    return this.Zy;
  }
  
  public Zstu ZGD() {
    return this.ZX;
  }
  
  public void ZW(Zstu paramZstu) {
    this.ZX = paramZstu;
  }
  
  public Zstu ZGy() {
    return this.Ze;
  }
  
  public void ZO(Zstu paramZstu) {
    this.Ze = paramZstu;
  }
  
  public int ZGI() {
    return this.ZZ;
  }
  
  public byte ZGz() {
    return this.Zz;
  }
  
  public Zo ZGP() {
    return this.ZQ;
  }
  
  public int ZGx() {
    return this.ZC;
  }
  
  public void ZSp(int paramInt) {
    this.ZC = paramInt;
  }
  
  @Zzvo(3)
  private int ZGM() {
    return this.Zz;
  }
  
  @Zzvo(13)
  private byte ZGc() {
    return this.ZQ.Ze();
  }
  
  public boolean ZG(Zgi4 paramZgi4) {
    return paramZgi4.ZN(this);
  }
  
  public void ZHG() {}
  
  protected boolean ZP(Zm31 paramZm31, Zs7v paramZs7v) {
    return Zlua.Zd(paramZm31, paramZs7v, Zkpz.Zd, 698992465);
  }
  
  public Zeu4<Zzh2> ZF() {
    return ZH;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zul.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */