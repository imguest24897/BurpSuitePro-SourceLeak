package burp;

import java.io.IOException;
import java.math.BigDecimal;

public class Z_v extends Z_n implements Zkc7 {
  @Zzvo(30)
  private boolean ZM;
  
  @Zzvo(31)
  private Zmu9 ZZ;
  
  @Zzvo(32)
  private Zmu9 ZY;
  
  @Zzvo(33)
  private Zmu9 Zy;
  
  @Zzvo(34)
  private int Za;
  
  @Zzvo(35)
  private byte ZJ;
  
  @Zzvo(36)
  private byte Zd;
  
  @Zzvo(37)
  private byte ZV;
  
  @Zzvo(38)
  private byte ZU;
  
  @Zzvo(39)
  private boolean Zm;
  
  @Zzvo(40)
  private Zl_n ZF;
  
  @Zzvo(41)
  private Zmu9 ZD;
  
  @Zzvo(42)
  private Ztju Zg;
  
  @Zzvo(43)
  private int ZG;
  
  public Z_v(Zr_4 paramZr_4, Zl83 paramZl83) {
    super(paramZr_4, paramZl83);
  }
  
  public Zkq1 ZiB() {
    return new Zky6(this.ZL, this);
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    super.ZS(paramZs4f);
    Zmn3.ZE(this, paramZs4f);
  }
  
  public void ZWs(boolean paramBoolean) {
    this.ZM = paramBoolean;
  }
  
  public boolean ZvJ() {
    return this.ZM;
  }
  
  public void ZCS(String paramString) {
    Zmu9 zmu9 = Zlct.ZV(new BigDecimal(paramString), this.ZL);
    Zg(zmu9);
  }
  
  public void Zg(Zmu9 paramZmu9) {
    this.ZZ = paramZmu9;
  }
  
  public Zmu9 ZvG() {
    return this.ZZ;
  }
  
  public void ZCa(String paramString) {
    Zn(Zlct.ZV(new BigDecimal(paramString), this.ZL));
  }
  
  public void Zn(Zmu9 paramZmu9) {
    this.ZY = paramZmu9;
  }
  
  public Zmu9 ZvH() {
    return this.ZY;
  }
  
  public void ZCn(String paramString) {
    Zz(Zlct.ZV(new BigDecimal(paramString), this.ZL));
  }
  
  public void Zz(Zmu9 paramZmu9) {
    this.Zy = paramZmu9;
  }
  
  public Zmu9 Zv6() {
    return this.Zy;
  }
  
  public void ZNR(int paramInt) {
    this.Za = paramInt;
  }
  
  public int Zv3() {
    return this.Za;
  }
  
  public void ZH(byte paramByte) {
    this.ZJ = paramByte;
  }
  
  public byte ZvK() {
    return this.ZJ;
  }
  
  public void Zv(byte paramByte) {
    this.Zd = paramByte;
  }
  
  public byte Zv5() {
    return this.Zd;
  }
  
  public void ZL(byte paramByte) {
    this.ZV = paramByte;
  }
  
  public byte ZvP() {
    return this.ZV;
  }
  
  public void ZW(byte paramByte) {
    this.ZU = paramByte;
  }
  
  public byte Zvv() {
    return this.ZU;
  }
  
  public void ZW6(boolean paramBoolean) {
    this.Zm = paramBoolean;
  }
  
  public boolean ZvX() {
    return this.Zm;
  }
  
  public void Zj(Zmu9 paramZmu9) {
    this.ZD = paramZmu9;
  }
  
  public Zmu9 Zv8() {
    return this.ZD;
  }
  
  public void ZW(Ztju paramZtju) {
    this.Zg = paramZtju;
  }
  
  public Ztju Zv7() {
    return this.Zg;
  }
  
  public void ZNi(int paramInt) {
    this.ZG = paramInt;
  }
  
  public int ZvL() {
    return this.ZG;
  }
  
  public void ZE(Zl_n paramZl_n) {
    this.ZF = paramZl_n;
  }
  
  public Zl_n Zve() {
    return this.ZF;
  }
  
  public void ZyK() {
    Zmn3.ZX(this);
  }
  
  public void Zy4() {
    Zmn3.Zs(this.ZL, this);
  }
  
  public boolean equals(Object paramObject) {
    return Zmn3.ZS(this, paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Z_v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */