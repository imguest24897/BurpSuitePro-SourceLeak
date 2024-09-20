package burp;

import java.util.HashMap;
import java.util.Map;

public class Zue extends Zni implements Zz1i {
  @Zzvo(1)
  private final Zefg<Zbza> Zu;
  
  @Zzvo(2)
  private final Ze93<Zrte<Zs37>> ZL;
  
  @Zzvo(3)
  private final Zt7v<Zmg> ZD;
  
  @Zzvo(4)
  private final Zb97 Zi;
  
  @Zzvo(5)
  private final Zkmo ZH;
  
  @Zzvo(6)
  private final Zxz8 Zy;
  
  @Zzvo(7)
  private final Zz8z Zs;
  
  @Zzvo(8)
  private final Zkcw ZR;
  
  @Zzvo(22)
  private final Zb_b ZQ;
  
  @Zzvo(24)
  private final Zx56 ZI;
  
  @Zzvo(11)
  private byte Zz;
  
  @Zzvo(12)
  private byte ZZ;
  
  @Zzvo(13)
  private long ZJ;
  
  @Zzvo(14)
  private int ZX;
  
  @Zzvo(15)
  private int Zb;
  
  @Zzvo(16)
  private final Zefk Zg;
  
  @Zzvo(17)
  private final Ze68 Zt;
  
  @Zzvo(23)
  private final Ze68 Zp;
  
  @Zzvo(18)
  private final Zzwo<Zmzk, Zbom> Zc;
  
  @Zzvo(19)
  private final Zltc Zr;
  
  @Zzvo(25)
  private final Zmj1 Za;
  
  private final Map<String, Zzuq> Zo = new HashMap<>();
  
  Zue(Zefg<Zbza> paramZefg, Ze93<Zrte<Zs37>> paramZe93, Zt7v<Zmg> paramZt7v, Zb97 paramZb97, Zkmo paramZkmo, Zxz8 paramZxz8, Zz8z paramZz8z, Zkcw paramZkcw, Zb_b paramZb_b, Zx56 paramZx56, Zefk paramZefk, Ze68 paramZe681, Ze68 paramZe682, Zzwo<Zmzk, Zbom> paramZzwo, Zltc paramZltc, Zmj1 paramZmj1) {
    this.Zu = paramZefg;
    this.ZL = paramZe93;
    this.ZD = paramZt7v;
    this.Zi = paramZb97;
    this.ZH = paramZkmo;
    this.Zy = paramZxz8;
    String[] arrayOfString = Zbuf.ZY();
    this.Zs = paramZz8z;
    this.ZR = paramZkcw;
    this.ZQ = paramZb_b;
    this.ZI = paramZx56;
    this.Zg = paramZefk;
    this.Zt = paramZe681;
    this.Zp = paramZe682;
    this.Zc = paramZzwo;
    this.Zr = paramZltc;
    this.Za = paramZmj1;
    if (Zbqc.Zwu() == null)
      Zbuf.ZM(new String[1]); 
  }
  
  public Zefg<Zbza> ZHU() {
    return this.Zu;
  }
  
  public Ze93<Zrte<Zs37>> ZH8() {
    return this.ZL;
  }
  
  public Zt7v<Zmg> ZHj() {
    return this.ZD;
  }
  
  public Zb97 ZH1() {
    return this.Zi;
  }
  
  public Zkmo ZHd() {
    return this.ZH;
  }
  
  public Zxz8 ZHl() {
    return this.Zy;
  }
  
  public Zz8z ZHE() {
    return this.Zs;
  }
  
  public Zkcw ZHK() {
    return this.ZR;
  }
  
  public Zb_b Zpm() {
    return this.ZQ;
  }
  
  public Zx56 ZH3() {
    return this.ZI;
  }
  
  public Zmj1 ZHB() {
    return (this.Za == null) ? (new Zruo()).<Zmj1>ZH(new Zmo1(Zz5.ZO.Zf())) : this.Za;
  }
  
  public Zefk ZHD() {
    return this.Zg;
  }
  
  public synchronized void ZV(long paramLong) {
    this.ZJ = paramLong;
  }
  
  public synchronized long ZHo() {
    return this.ZJ;
  }
  
  public Zltc ZHL() {
    return this.Zr;
  }
  
  public void Zc(long paramLong) {
    this.Zt.add(Long.valueOf(paramLong));
  }
  
  public boolean ZZ(long paramLong) {
    return this.Zt.contains(Long.valueOf(paramLong));
  }
  
  public void Zf(long paramLong) {
    this.Zp.add(Long.valueOf(paramLong));
  }
  
  public boolean ZH(long paramLong) {
    return this.Zp.contains(Long.valueOf(paramLong));
  }
  
  public void Zz(Zl5x paramZl5x) {
    this.Zz = paramZl5x.Zn();
  }
  
  public void ZZ(Zl5x paramZl5x) {
    this.ZZ = paramZl5x.Zn();
  }
  
  public int ZH_() {
    return this.Zb;
  }
  
  public void Zq9(int paramInt) {
    this.Zb = paramInt;
  }
  
  public int ZH9() {
    return this.ZX;
  }
  
  public void Zqo(int paramInt) {
    this.ZX = paramInt;
  }
  
  public Zbom Zc(Zmzk paramZmzk) {
    synchronized (Zz6()) {
      return this.Zc.Zt(paramZmzk, Zue::lambda$getHostScanCheckHistory$0);
    } 
  }
  
  public Zzuq ZDT(String paramString) {
    synchronized (this.Zo) {
      Zzuq zzuq = this.Zo.get(paramString);
      if (zzuq == null) {
        zzuq = new Zzuq();
        this.Zo.put(paramString, zzuq);
      } 
      return zzuq;
    } 
  }
  
  public Object ZH0() {
    return this.Zu.Zz6();
  }
  
  public Zeu4<Zz1i> ZF() {
    return ZK;
  }
  
  private static Zbom lambda$getHostScanCheckHistory$0(Zmzk paramZmzk) {
    return (new Zruo()).<Zbom>ZH(new Zmyh());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zue.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */