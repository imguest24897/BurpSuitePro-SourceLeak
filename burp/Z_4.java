package burp;

import java.io.IOException;

public class Z_4 extends Z_n implements Zbsq {
  @Zzvo(30)
  private Zefg<Zstu> Z_;
  
  @Zzvo(31)
  private boolean ZS;
  
  @Zzvo(32)
  private boolean ZI;
  
  @Zzvo(33)
  private boolean ZB;
  
  @Zzvo(34)
  private boolean Zy;
  
  @Zzvo(35)
  private boolean Zs;
  
  @Zzvo(36)
  private int Zn;
  
  @Zzvo(37)
  private Zefg<Zsdr> ZT;
  
  @Zzvo(38)
  private int ZA;
  
  public Z_4(Zr_4 paramZr_4, Zl83 paramZl83, Zefg<Zstu> paramZefg, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt1, Zefg<Zsdr> paramZefg1, int paramInt2) {
    super(paramZr_4, paramZl83);
    this.Z_ = paramZefg;
    this.ZS = paramBoolean1;
    this.ZI = paramBoolean2;
    this.ZB = paramBoolean3;
    this.Zy = paramBoolean4;
    this.Zs = paramBoolean5;
    this.Zn = paramInt1;
    this.ZT = paramZefg1;
    this.ZA = paramInt2;
  }
  
  public Zkq1 ZiB() {
    return new Zktc(this.ZL, this);
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    super.ZS(paramZs4f);
    Ze1r.ZY(this, paramZs4f);
  }
  
  public Zefg<Zstu> ZP7() {
    return this.Z_;
  }
  
  public void Zu(Zefg<Zstu> paramZefg) {
    this.Z_ = paramZefg;
  }
  
  public boolean ZPA() {
    return this.ZS;
  }
  
  public void ZR_(boolean paramBoolean) {
    this.ZS = paramBoolean;
  }
  
  public boolean ZPi() {
    return this.ZI;
  }
  
  public void ZR5(boolean paramBoolean) {
    this.ZI = paramBoolean;
  }
  
  public boolean ZP3() {
    return this.ZB;
  }
  
  public void ZRu(boolean paramBoolean) {
    this.ZB = paramBoolean;
  }
  
  public boolean ZPL() {
    return this.Zy;
  }
  
  public void ZRe(boolean paramBoolean) {
    this.Zy = paramBoolean;
  }
  
  public boolean ZP9() {
    return this.Zs;
  }
  
  public void ZRL(boolean paramBoolean) {
    this.Zs = paramBoolean;
  }
  
  public int ZP1() {
    return this.Zn;
  }
  
  public void Zhf(int paramInt) {
    this.Zn = paramInt;
  }
  
  public Zefg<Zsdr> ZPv() {
    return this.ZT;
  }
  
  public void ZX(Zefg<Zsdr> paramZefg) {
    this.ZT = paramZefg;
  }
  
  public void Zp(Zsdr paramZsdr) {
    this.ZT.add(paramZsdr);
  }
  
  public void Zhz(int paramInt) {
    this.ZT.remove(paramInt);
  }
  
  public int ZPV() {
    return this.ZA;
  }
  
  public void Zh2(int paramInt) {
    this.ZA = paramInt;
  }
  
  public int Zyv() {
    Ze1r.ZX(this);
    return super.Zyv();
  }
  
  public void Zy4() {
    Ze1r.Zm(this, this.ZL);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Z_4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */