package burp;

class Zae extends Zni implements Zzme {
  @Zzvo(4)
  private final Zstu Zd;
  
  @Zzvo(5)
  private int ZF;
  
  @Zzvo(12)
  private final short Zh;
  
  private final Zeew ZT;
  
  private final Zbr Zv;
  
  @Zzvo(9)
  private final String Zk;
  
  @Zzvo(10)
  private final Zlit ZQ;
  
  @Zzvo(11)
  private final int Zy;
  
  @Zzvo(13)
  private final long Zb;
  
  @Zzvo(7)
  private String Zt;
  
  @Zzvo(8)
  private byte ZL;
  
  @Zzvo(15)
  private final short ZO;
  
  private Zzsm Zw;
  
  public Zae(Zbr paramZbr, Zstu paramZstu, int paramInt1, Zeew paramZeew, String paramString1, Zlit paramZlit, int paramInt2, short paramShort1, long paramLong, Zzsm paramZzsm, String paramString2, short paramShort2) {
    this.Zv = paramZbr;
    this.Zd = paramZstu;
    this.ZF = paramInt1;
    this.ZT = paramZeew;
    this.Zk = paramString1;
    this.ZQ = paramZlit;
    this.Zy = paramInt2;
    this.Zh = paramShort1;
    this.Zb = paramLong;
    this.Zw = paramZzsm;
    this.Zt = paramString2;
    this.ZO = paramShort2;
  }
  
  public Zeu4<? extends Zzme> ZF() {
    return Zzme.ZU;
  }
  
  public String ZAs() {
    return (this.Zt == null) ? "" : this.Zt;
  }
  
  public void ZWK(String paramString) {
    this.Zt = paramString;
  }
  
  public void ZB(byte paramByte) {
    this.ZL = paramByte;
  }
  
  public byte ZaP() {
    return this.ZL;
  }
  
  public Zmzk ZHC() {
    return Zx4b.Zu(this);
  }
  
  public Zbr ZH6() {
    return this.Zv;
  }
  
  public Zefx ZQ(Zey9 paramZey9) {
    return Zx4b.ZE(this, paramZey9);
  }
  
  public Zstu ZHh() {
    return this.Zd;
  }
  
  public int ZHa() {
    return this.ZF;
  }
  
  public void Zws(int paramInt) {
    this.ZF = paramInt;
  }
  
  public Zzsm ZHq() {
    return this.Zw;
  }
  
  public void Zh(Zzsm paramZzsm) {
    this.Zw = paramZzsm;
  }
  
  public Zeew ZH7() {
    return this.ZT;
  }
  
  public String ZHA() {
    return this.Zk;
  }
  
  public Zlit ZHm() {
    return this.ZQ;
  }
  
  public String ZHT() {
    return Zx4b.Zw(this);
  }
  
  public String ZHn() {
    return Zx4b.Zh(this);
  }
  
  public String ZHx() {
    return Zx4b.ZX(this);
  }
  
  public int ZH4() {
    return this.Zy;
  }
  
  public int ZHI() {
    return this.Zh;
  }
  
  public long ZHP() {
    return this.Zb;
  }
  
  public short ZHw() {
    return this.ZO;
  }
  
  @Zzvo(6)
  private byte Zsf() {
    return this.ZT.projectPersistedId;
  }
  
  @Zzvo(1)
  private Zstu ZsE() {
    return (this.Zv == null) ? null : this.Zv.Zr();
  }
  
  @Zzvo(2)
  private Zefg<Zk94> Zsq() {
    return (this.Zv == null) ? null : this.Zv.ZO();
  }
  
  @Zzvo(3)
  private byte Zsg() {
    return (this.Zv == null) ? Zkyt.UNKNOWN.persistedId : (this.Zv.Zx()).persistedId;
  }
  
  @Zzvo(14)
  private byte Zsk() {
    return (this.Zw == null) ? Zkyt.UNKNOWN.persistedId : this.Zw.projectPersistedId;
  }
  
  public boolean Zd(Zz28 paramZz28) {
    return paramZz28.ZG(this.ZQ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zae.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */