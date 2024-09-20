package burp;

import java.io.IOException;
import java.util.Arrays;

public class Zxqd extends Zxsr implements Zz4g {
  protected Zxqd(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public boolean Zvz() {
    return this.Za.Zi(this, Zk_h.Zu);
  }
  
  public void ZVW(boolean paramBoolean) {
    this.Za.ZH(this, Zk_h.Zu, paramBoolean);
  }
  
  public boolean Zvd() {
    return this.Za.Zi(this, Zk_h.Za);
  }
  
  public void ZVm(boolean paramBoolean) {
    this.Za.ZH(this, Zk_h.Za, paramBoolean);
  }
  
  public boolean Zvg() {
    return this.Za.Zi(this, Zk_h.ZS);
  }
  
  public void ZV_(boolean paramBoolean) {
    this.Za.ZH(this, Zk_h.ZS, paramBoolean);
  }
  
  public boolean Zvc() {
    return this.Za.Zi(this, Zk_h.ZV);
  }
  
  public void ZVC(boolean paramBoolean) {
    this.Za.ZH(this, Zk_h.ZV, paramBoolean);
  }
  
  public Zl8c[] Zvb() {
    Zrte<Zl8c> zrte = this.Za.<Zrte>ZA(this, (Zeki)Zk_h.Zi);
    return (zrte == null) ? null : zrte.ZbF();
  }
  
  public void Zz(Zl8c[] paramArrayOfZl8c) {
    Zrte<Zl8c> zrte = this.Za.<Zrte>Zv((Zllg)new Zguz<>(Zl8c.Zl), paramArrayOfZl8c.length);
    zrte.ZP(paramArrayOfZl8c);
    this.Za.ZQ(this, Zk_h.Zi, zrte);
  }
  
  public boolean Zv_() {
    return this.Za.Zi(this, Zk_h.Zx);
  }
  
  public void ZVu(boolean paramBoolean) {
    this.Za.ZH(this, Zk_h.Zx, paramBoolean);
  }
  
  public short Zvf() {
    return this.Za.ZQ(this, Zk_h.Z_);
  }
  
  public void Zv(short paramShort) {
    this.Za.ZE(this, Zk_h.Z_, paramShort);
  }
  
  public Zkk3[] ZvZ() {
    Zrte<Zg05> zrte = this.Za.<Zrte>ZA(this, (Zeki)Zk_h.ZE);
    return (zrte == null) ? null : ((zrte.Zpu() == 0) ? new Zkk3[0] : (Zkk3[])Arrays.<Zg05>stream(zrte.ZbF()).map(this::lambda$extractors$0).toArray(Zxqd::lambda$extractors$1));
  }
  
  public void ZQ(Zg05[] paramArrayOfZg05) {
    Zrte<Zg05> zrte = this.Za.<Zrte>Zv((Zllg)new Zguz<>(Zg05.ZP), paramArrayOfZg05.length);
    zrte.ZP(paramArrayOfZg05);
    this.Za.ZQ(this, Zk_h.ZE, zrte);
  }
  
  public boolean[] ZvW() {
    Zsqo zsqo = this.Za.<Zsqo>ZA(this, Zk_h.ZB);
    return (zsqo == null) ? null : zsqo.ZK4();
  }
  
  public void Zd(boolean[] paramArrayOfboolean) {
    Zsqo zsqo = this.Za.<Zsqo>Zv(Zsqo.ZR, paramArrayOfboolean.length);
    zsqo.ZU(paramArrayOfboolean);
    this.Za.ZQ(this, Zk_h.ZB, zsqo);
  }
  
  public boolean ZvO() {
    return this.Za.Zi(this, Zk_h.Zp);
  }
  
  public void ZVx(boolean paramBoolean) {
    this.Za.ZH(this, Zk_h.Zp, paramBoolean);
  }
  
  public boolean Zvp() {
    return this.Za.Zi(this, Zk_h.Ze);
  }
  
  public void ZV5(boolean paramBoolean) {
    this.Za.ZH(this, Zk_h.Ze, paramBoolean);
  }
  
  public boolean Zva() {
    return this.Za.Zi(this, Zk_h.Zb);
  }
  
  public void ZVG(boolean paramBoolean) {
    this.Za.ZH(this, Zk_h.Zb, paramBoolean);
  }
  
  public boolean ZvF() {
    return this.Za.Zi(this, Zk_h.ZU);
  }
  
  public void ZVa(boolean paramBoolean) {
    this.Za.ZH(this, Zk_h.ZU, paramBoolean);
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    Ztwm.ZW(this, paramZs4f);
  }
  
  public boolean equals(Object paramObject) {
    return super.equals(paramObject);
  }
  
  private static Zkk3[] lambda$extractors$1(int paramInt) {
    return new Zkk3[paramInt];
  }
  
  private Zkk3 lambda$extractors$0(Zg05 paramZg05) {
    return new Zkk3(paramZg05, this.Za);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxqd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */