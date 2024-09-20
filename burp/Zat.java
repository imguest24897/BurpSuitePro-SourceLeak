package burp;

import java.awt.Component;
import java.time.Duration;
import java.util.List;

public abstract class Zat extends Zni implements Zeo2 {
  @Zzvo(1)
  protected final String Zq;
  
  @Zzvo(2)
  protected final Zlit Zp;
  
  @Zzvo(3)
  protected final String ZG;
  
  @Zzvo(4)
  protected final String Zv;
  
  @Zzvo(5)
  protected final boolean Zu;
  
  @Zzvo(11)
  protected final long ZI;
  
  @Zzvo(14)
  protected final int Zt;
  
  protected final Zbr Zl;
  
  protected final Zbr Zy;
  
  protected final boolean ZK;
  
  @Zzvo(6)
  protected short Zd;
  
  @Zzvo(7)
  protected short Zk;
  
  @Zzvo(9)
  protected String ZH;
  
  @Zzvo(10)
  protected String Zo;
  
  @Zzvo(18)
  protected Zstu Zm;
  
  @Zzvo(0)
  private int ZW;
  
  @Zzvo(8)
  private int Ze;
  
  @Zzvo(13)
  private byte ZC;
  
  @Zzvo(27)
  private String Zh;
  
  @Zzvo(19)
  private Zstu Za;
  
  @Zzvo(20)
  private Zstu Zw;
  
  @Zzvo(28)
  private long ZQ;
  
  @Zzvo(29)
  private long Zr;
  
  @Zzvo(30)
  private long ZT;
  
  private Zbr ZE;
  
  public Zat(String paramString1, Zlit paramZlit, String paramString2, String paramString3, boolean paramBoolean1, short paramShort1, short paramShort2, String paramString4, String paramString5, long paramLong, int paramInt, Zbr paramZbr1, Zbr paramZbr2, boolean paramBoolean2) {
    this.Zq = paramString1;
    this.Zp = paramZlit;
    this.ZG = paramString2;
    this.Zv = paramString3;
    this.Zu = paramBoolean1;
    this.Zd = paramShort1;
    this.Zk = paramShort2;
    this.ZH = paramString4;
    this.Zo = paramString5;
    this.ZI = paramLong;
    this.Zt = paramInt;
    this.Zl = paramZbr1;
    this.Zy = paramZbr2;
    this.ZK = paramBoolean2;
  }
  
  public boolean ZXR() {
    return this.ZK;
  }
  
  public void Zc(Zs68 paramZs68, Zstu paramZstu) {
    this.Zm = paramZstu;
    Zst6 zst6 = new Zst6(paramZs68);
    this.Zd = zst6.Zg();
    this.Ze = zst6.ZU();
    this.ZH = zst6.ZG();
    this.Zo = zst6.ZQ();
    short s = zst6.Zj();
    if (s != 0)
      this.Zk = s; 
  }
  
  public String ZX4() {
    return this.Zq;
  }
  
  public int ZEK() {
    return this.ZW;
  }
  
  public void ZuP(int paramInt) {
    this.ZW = paramInt;
  }
  
  public String ZXF() {
    return this.ZG;
  }
  
  public String ZXE() {
    return this.Zv;
  }
  
  public boolean ZXi() {
    return this.Zu;
  }
  
  public short ZXy() {
    return this.Zk;
  }
  
  public String ZXw() {
    return this.ZH;
  }
  
  public String ZXj() {
    return this.Zo;
  }
  
  public byte ZaP() {
    return this.ZC;
  }
  
  public int ZEe() {
    return this.Zt;
  }
  
  public Zbr ZXD() {
    return this.Zl;
  }
  
  public Zbr ZXI() {
    return this.Zy;
  }
  
  public Zbr ZX9() {
    return this.ZE;
  }
  
  public void ZJ(Zbr paramZbr) {
    this.ZE = paramZbr;
  }
  
  public Zstu ZX7() {
    return this.Zm;
  }
  
  public void ZR(Zstu paramZstu) {
    this.Zm = paramZstu;
  }
  
  public Zstu ZX8() {
    return this.Za;
  }
  
  public void Zp(Zstu paramZstu) {
    this.Za = paramZstu;
  }
  
  public Zstu ZXq() {
    return this.Zw;
  }
  
  public void Zh(Zstu paramZstu) {
    this.Zw = paramZstu;
  }
  
  public boolean ZXo() {
    return (Zsw8.ZS(this.Zh) || this.ZC > 0);
  }
  
  public void ZB(byte paramByte) {
    this.ZC = paramByte;
  }
  
  public String ZIx() {
    return ZAs();
  }
  
  public void Zxg(String paramString) {
    ZWK(paramString);
  }
  
  public String ZAs() {
    return (this.Zh == null) ? "" : this.Zh;
  }
  
  public void ZWK(String paramString) {
    this.Zh = paramString;
  }
  
  public void Zfs(int paramInt) {
    this.Ze = paramInt;
  }
  
  public Zlit ZlL() {
    return this.Zp;
  }
  
  public Zbr Zo3() {
    return Zs_8.Zb(this);
  }
  
  public Zstu Zos() {
    return Zs_8.Zg(this);
  }
  
  public Zstu ZoO() {
    return this.Zm;
  }
  
  public long ZoB() {
    return this.ZI;
  }
  
  public Zeew Ze2() {
    return Zeew.PROXY;
  }
  
  public short Zl7() {
    return this.Zd;
  }
  
  public int Zlq() {
    return this.Ze;
  }
  
  public Zeo2 ZJ(Zr_4 paramZr_4) {
    int[] arrayOfInt = Zmyr.ZL();
    Zbr zbr1 = (this.Zl == null) ? null : this.Zl.Zi(paramZr_4);
    Zbr zbr2 = (this.Zy == null) ? null : this.Zy.Zi(paramZr_4);
    Zbr zbr3 = (this.ZE == null) ? null : this.ZE.Zi(paramZr_4);
    Zstu zstu1 = (this.Zm == null) ? null : this.Zm.Zp(paramZr_4);
    Zstu zstu2 = (this.Za == null) ? null : this.Za.Zp(paramZr_4);
    Zstu zstu3 = (this.Zw == null) ? null : this.Zw.Zp(paramZr_4);
    Zeo2 zeo2 = paramZr_4.<Zeo2>ZH(new Zmyt(this.ZI, this.Zt, this.Zq, this.Zp, this.ZG, this.Zk, this.Zv, this.Zu, zbr1, zbr2, this.Zd, this.ZH, this.Zo, this.ZK));
    zeo2.ZuP(this.ZW);
    zeo2.Zfs(this.Ze);
    zeo2.ZWK(this.Zh);
    zeo2.ZB(this.ZC);
    zeo2.ZR(zstu1);
    zeo2.Zp(zstu2);
    zeo2.Zh(zstu3);
    zeo2.ZJ(zbr3);
    zeo2.ZM(ZXp());
    zeo2.ZG(ZXm());
    zeo2.Zo(this.ZT);
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[1]); 
    return zeo2;
  }
  
  public Duration ZXp() {
    return Duration.ofMillis(this.ZQ);
  }
  
  public void ZM(Duration paramDuration) {
    this.ZQ = paramDuration.toMillis();
  }
  
  public Duration ZXm() {
    return Duration.ofMillis(this.Zr);
  }
  
  public void ZG(Duration paramDuration) {
    this.Zr = paramDuration.toMillis();
  }
  
  public long ZXV() {
    return this.ZT;
  }
  
  public void Zo(long paramLong) {
    this.ZT = paramLong;
  }
  
  public Zmzk Zod() {
    return this.Zp.Zdz();
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return null;
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public boolean Zd(Zz28 paramZz28) {
    return paramZz28.ZG(this.Zp);
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return new Zo8(this, paramZkl6.ZH(), paramZm6x);
  }
  
  public void ZHG() {}
  
  protected boolean ZP(Zm31 paramZm31, Zs7v paramZs7v) {
    return Zlua.Zd(paramZm31, paramZs7v, Zkpo.ZV, 2048079167);
  }
  
  @Zzvo(15)
  private Zstu ZLz() {
    return (this.Zl == null) ? null : this.Zl.Zr();
  }
  
  @Zzvo(16)
  private Zstu ZLr() {
    return (this.Zy == null) ? null : this.Zy.Zr();
  }
  
  @Zzvo(17)
  private Zstu ZLT() {
    return (this.ZE == null) ? null : this.ZE.Zr();
  }
  
  @Zzvo(21)
  private Zefg<Zk94> ZL9() {
    return (this.Zl == null) ? null : this.Zl.ZO();
  }
  
  @Zzvo(22)
  private Zefg<Zk94> ZLF() {
    return (this.Zy == null) ? null : this.Zy.ZO();
  }
  
  @Zzvo(23)
  private Zefg<Zk94> ZLo() {
    return (this.ZE == null) ? null : this.ZE.ZO();
  }
  
  @Zzvo(24)
  private byte ZLw() {
    return (this.Zl == null) ? Zkyt.UNKNOWN.persistedId : (this.Zl.Zx()).persistedId;
  }
  
  @Zzvo(25)
  private byte Zp() {
    return (this.Zy == null) ? Zkyt.UNKNOWN.persistedId : (this.Zy.Zx()).persistedId;
  }
  
  @Zzvo(26)
  private byte ZLc() {
    return (this.ZE == null) ? Zkyt.UNKNOWN.persistedId : (this.ZE.Zx()).persistedId;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zat.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */