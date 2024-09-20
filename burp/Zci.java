package burp;

import java.awt.image.BufferedImage;
import java.util.Collection;
import java.util.List;

class Zci extends Zni implements Zmnm {
  @Zzvo(1)
  private final Zrp0 ZO;
  
  @Zzvo(2)
  private final Zeu9 ZS;
  
  @Zzvo(3)
  private final Zszw ZJ;
  
  @Zzvo(4)
  private final String ZB;
  
  @Zzvo(5)
  private final Zefg<Zgnc> Zu;
  
  @Zzvo(6)
  private final Zefg<Zrdb> ZZ;
  
  @Zzvo(12)
  private final String Zc;
  
  @Zzvo(7)
  private final Zstu Zd;
  
  @Zzvo(8)
  private byte Ze = 0;
  
  @Zzvo(9)
  private byte ZR = 0;
  
  @Zzvo(10)
  private final Zefg<Zmnm> Zy;
  
  @Zzvo(11)
  private final Zl1g ZW;
  
  Zci(Zrp0 paramZrp0, Zeu9 paramZeu9, Zszw paramZszw, String paramString1, Zefg<Zgnc> paramZefg, Zefg<Zrdb> paramZefg1, String paramString2, Zstu paramZstu, Zefg<Zmnm> paramZefg2, Zl1g paramZl1g) {
    this.ZO = paramZrp0;
    this.ZS = paramZeu9;
    this.ZJ = paramZszw;
    this.ZB = paramString1;
    this.Zu = paramZefg;
    this.ZZ = paramZefg1;
    this.Zc = paramString2;
    this.Zd = paramZstu;
    this.Zy = paramZefg2;
    int[] arrayOfInt = Zlah.ZRg();
    this.ZW = paramZl1g;
    if (Zbqc.Zwu() == null)
      Zlah.ZK(new int[5]); 
  }
  
  public Zefg<Zmnm> ZO2() {
    return this.Zy;
  }
  
  public Zrp0 ZOe() {
    return this.ZO;
  }
  
  public Zeu9 ZOD() {
    return this.ZS;
  }
  
  public Zszw ZOK() {
    return this.ZJ;
  }
  
  public String ZOZ() {
    return this.ZB;
  }
  
  public List<Zgnc> ZOQ() {
    return this.Zu;
  }
  
  public List<Zrdb> ZO1() {
    return List.copyOf(this.ZZ);
  }
  
  public boolean ZON() {
    return !this.ZZ.isEmpty();
  }
  
  public Zebg ZVj(boolean paramBoolean) {
    return Zguc.ZY(this.ZZ, paramBoolean);
  }
  
  public String ZOM() {
    return this.Zc;
  }
  
  public BufferedImage ZO_() {
    return Zguc.Zp(this.Zd);
  }
  
  public void Zi(Collection<Zrdb> paramCollection) {
    this.ZZ.addAll(paramCollection);
  }
  
  public void ZA(Collection<Zrdb> paramCollection) {
    this.ZZ.removeAll(paramCollection);
  }
  
  public int ZVD(boolean paramBoolean) {
    return Zguc.ZL(this, Zb3i.Zs(this.ZZ, paramBoolean), paramBoolean);
  }
  
  public Zlah ZVZ(boolean paramBoolean) {
    return Zguc.ZQ(Zb3i.Zs(this.ZZ, paramBoolean), this.Ze, this.ZR, paramBoolean);
  }
  
  public int ZOg() {
    return Zguc.Zf(this.Ze, this.ZR);
  }
  
  public void ZB(Zlah paramZlah) {
    this.Ze = paramZlah.ZRb();
    this.ZR = paramZlah.ZRN();
  }
  
  public Zl1g ZOw() {
    return this.ZW;
  }
  
  public final boolean equals(Object paramObject) {
    return Zguc.ZI(this, paramObject);
  }
  
  public final int hashCode() {
    return Zguc.ZJ(this);
  }
  
  public Zeu4<? extends Zmnm> ZF() {
    return Zx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zci.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */