package burp;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class Zwg extends Zni implements Zz4g {
  @Zzvo(0)
  public boolean Zx;
  
  @Zzvo(1)
  public boolean Zh;
  
  @Zzvo(2)
  public boolean ZZ;
  
  @Zzvo(3)
  public boolean ZF;
  
  @Zzvo(4)
  public Zrte<Zl8c> ZG;
  
  @Zzvo(5)
  public boolean Za;
  
  @Zzvo(6)
  public short ZM;
  
  @Zzvo(7)
  public Zrte<Zg05> Zr;
  
  @Zzvo(8)
  public boolean[] Zn;
  
  @Zzvo(9)
  public boolean ZA;
  
  @Zzvo(10)
  public boolean ZK;
  
  @Zzvo(11)
  public boolean Zc;
  
  @Zzvo(12)
  public boolean ZC;
  
  private final Zr_4 ZE;
  
  public Zwg(Zr_4 paramZr_4) {
    this.ZE = paramZr_4;
  }
  
  public boolean Zvz() {
    return this.Zx;
  }
  
  public void ZVW(boolean paramBoolean) {
    this.Zx = paramBoolean;
  }
  
  public boolean Zvd() {
    return this.Zh;
  }
  
  public void ZVm(boolean paramBoolean) {
    this.Zh = paramBoolean;
  }
  
  public boolean Zvg() {
    return this.ZZ;
  }
  
  public void ZV_(boolean paramBoolean) {
    this.ZZ = paramBoolean;
  }
  
  public boolean Zvc() {
    return this.ZF;
  }
  
  public void ZVC(boolean paramBoolean) {
    this.ZF = paramBoolean;
  }
  
  public Zl8c[] Zvb() {
    return (this.ZG == null) ? null : this.ZG.ZbF();
  }
  
  public void Zz(Zl8c[] paramArrayOfZl8c) {
    if (paramArrayOfZl8c == null)
      return; 
    if (this.ZG == null || this.ZG.Zpu() != paramArrayOfZl8c.length)
      this.ZG = new Zyp<>(Zl8c.Zl, paramArrayOfZl8c.length); 
    this.ZG.ZP(paramArrayOfZl8c);
  }
  
  public boolean Zv_() {
    return this.Za;
  }
  
  public void ZVu(boolean paramBoolean) {
    this.Za = paramBoolean;
  }
  
  public short Zvf() {
    return this.ZM;
  }
  
  public void Zv(short paramShort) {
    this.ZM = paramShort;
  }
  
  public Zkk3[] ZvZ() {
    return (this.Zr == null) ? null : (Zkk3[])Arrays.<Zg05>stream(this.Zr.ZbF()).map(this::lambda$extractors$0).toArray(Zwg::lambda$extractors$1);
  }
  
  public void ZQ(Zg05[] paramArrayOfZg05) {
    if (paramArrayOfZg05 == null)
      return; 
    if (this.Zr == null || this.Zr.Zpu() != paramArrayOfZg05.length)
      this.Zr = new Zyp<>(Zg05.ZP, paramArrayOfZg05.length); 
    this.Zr.ZP(paramArrayOfZg05);
  }
  
  public boolean[] ZvW() {
    return this.Zn;
  }
  
  public void Zd(boolean[] paramArrayOfboolean) {
    this.Zn = paramArrayOfboolean;
  }
  
  public boolean ZvO() {
    return this.ZA;
  }
  
  public void ZVx(boolean paramBoolean) {
    this.ZA = paramBoolean;
  }
  
  public boolean Zvp() {
    return this.ZK;
  }
  
  public void ZV5(boolean paramBoolean) {
    this.ZK = paramBoolean;
  }
  
  public boolean Zva() {
    return this.Zc;
  }
  
  public void ZVG(boolean paramBoolean) {
    this.Zc = paramBoolean;
  }
  
  public boolean ZvF() {
    return this.ZC;
  }
  
  public void ZVa(boolean paramBoolean) {
    this.ZC = paramBoolean;
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    Ztwm.ZW(this, paramZs4f);
  }
  
  public boolean equals(Object paramObject) {
    return Ztwm.Zy(this, paramObject);
  }
  
  public int hashCode() {
    String str = Zrrq.Zq();
    int i = Objects.hash(new Object[] { Boolean.valueOf(this.Zx), Boolean.valueOf(this.Zh), Boolean.valueOf(this.ZZ), Boolean.valueOf(this.ZF), Boolean.valueOf(this.Za), Short.valueOf(this.ZM), Boolean.valueOf(this.ZA), Boolean.valueOf(this.ZK), Boolean.valueOf(this.Zc), Boolean.valueOf(this.ZC) });
    i = 31 * i + Arrays.hashCode((this.ZG == null) ? null : this.ZG.ZbF());
    i = 31 * i + Arrays.hashCode((this.Zr == null) ? null : this.Zr.ZbF());
    i = 31 * i + Arrays.hashCode(this.Zn);
    if (str != null)
      Zbqc.Zr(new Zbqc[3]); 
    return i;
  }
  
  private static Zkk3[] lambda$extractors$1(int paramInt) {
    return new Zkk3[paramInt];
  }
  
  private Zkk3 lambda$extractors$0(Zg05 paramZg05) {
    return new Zkk3(paramZg05, this.ZE);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */