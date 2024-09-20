package burp;

import java.util.HashMap;
import java.util.Map;

public class Zxml extends Zxsr implements Zz1i {
  private final Map<String, Zzuq> Zw = new HashMap<>();
  
  Zxml(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zefg<Zbza> ZHU() {
    return (Zefg<Zbza>)this.Za.ZJ(this, Zkpr.Zv);
  }
  
  public Ze93<Zrte<Zs37>> ZH8() {
    return this.Za.<Ze93<Zrte<Zs37>>>ZJ(this, Zkpr.ZN);
  }
  
  public Zt7v<Zmg> ZHj() {
    return this.Za.<Zt7v<Zmg>>ZJ(this, Zkpr.Zq);
  }
  
  public Zb97 ZH1() {
    return this.Za.<Zb97>ZJ(this, Zkpr.Zm);
  }
  
  public Zkmo ZHd() {
    return this.Za.<Zkmo>ZJ(this, Zkpr.ZR);
  }
  
  public Zxz8 ZHl() {
    return this.Za.<Zxz8>ZJ(this, Zkpr.Zk);
  }
  
  public Zz8z ZHE() {
    return this.Za.<Zz8z>ZJ(this, Zkpr.ZK);
  }
  
  public Zkcw ZHK() {
    return this.Za.<Zkcw>ZJ(this, Zkpr.ZG);
  }
  
  public Zb_b Zpm() {
    Zb_b zb_b1 = this.Za.<Zb_b>ZJ(this, Zkpr.Zi);
    if (zb_b1 != null)
      return zb_b1; 
    Zb_b zb_b2 = this.Za.<Zb_b>ZH(new Zkqe());
    this.Za.Zq(this, Zkpr.Zi, zb_b2);
    return zb_b2;
  }
  
  public Zx56 ZH3() {
    Zx56 zx561 = this.Za.<Zx56>ZJ(this, Zkpr.Z_);
    if (zx561 != null)
      return zx561; 
    Zx56 zx562 = this.Za.<Zx56>ZH(new Zt6e());
    this.Za.Zq(this, Zkpr.Z_, zx562);
    return zx562;
  }
  
  public Zmj1 ZHB() {
    Zmj1 zmj1 = this.Za.<Zmj1>ZJ(this, Zkpr.ZM);
    return (zmj1 == null) ? this.Za.<Zmj1>ZH(new Zmo1(Zz5.ZO.Zf())) : zmj1;
  }
  
  public Zefk ZHD() {
    return this.Za.<Zefk>ZJ(this, Zkpr.ZV);
  }
  
  public synchronized void ZV(long paramLong) {
    this.Za.ZV(this, Zkpr.ZO, paramLong);
  }
  
  public synchronized long ZHo() {
    return this.Za.ZL(this, Zkpr.ZO);
  }
  
  public synchronized Zltc ZHL() {
    Zltc zltc = this.Za.<Zltc>ZJ(this, Zkpr.ZS);
    if (zltc == null) {
      zltc = Zbuf.Zo(this.Za);
      this.Za.Zq(this, Zkpr.ZS, zltc);
    } 
    return zltc;
  }
  
  public void Zc(long paramLong) {
    ((Ze68)this.Za.<Ze68>ZJ(this, Zkpr.ZZ)).add(Long.valueOf(paramLong));
  }
  
  public boolean ZZ(long paramLong) {
    return ((Ze68)this.Za.<Ze68>ZJ(this, Zkpr.ZZ)).contains(Long.valueOf(paramLong));
  }
  
  public void Zf(long paramLong) {
    Ze68 ze68 = this.Za.<Ze68>ZJ(this, Zkpr.Zp);
    ze68.add(Long.valueOf(paramLong));
  }
  
  public boolean ZH(long paramLong) {
    Ze68 ze68 = this.Za.<Ze68>ZJ(this, Zkpr.Zp);
    return ze68.contains(Long.valueOf(paramLong));
  }
  
  public int ZH_() {
    return this.Za.Zx(this, Zkpr.ZX);
  }
  
  public void Zq9(int paramInt) {
    this.Za.ZM(this, Zkpr.ZX, paramInt);
  }
  
  public int ZH9() {
    return this.Za.Zx(this, Zkpr.ZW);
  }
  
  public void Zqo(int paramInt) {
    this.Za.ZM(this, Zkpr.ZW, paramInt);
  }
  
  public Zbom Zc(Zmzk paramZmzk) {
    synchronized (Zz6()) {
      Zzwo<Zmzk, Zbom> zzwo = this.Za.<Zzwo>ZJ(this, (Zekb)Zkpr.Zl);
      return zzwo.Zt(paramZmzk, this::lambda$getHostScanCheckHistory$0);
    } 
  }
  
  public Zzuq ZDT(String paramString) {
    synchronized (this.Zw) {
      Zzuq zzuq = this.Zw.get(paramString);
      if (zzuq == null) {
        zzuq = new Zzuq();
        this.Zw.put(paramString, zzuq);
      } 
      return zzuq;
    } 
  }
  
  public void Zz(Zl5x paramZl5x) {
    this.Za.Zc(this, Zkpr.ZJ, paramZl5x.Zn());
  }
  
  public void ZZ(Zl5x paramZl5x) {
    this.Za.Zc(this, Zkpr.ZF, paramZl5x.Zn());
  }
  
  public Object ZH0() {
    return ZHU().Zz6();
  }
  
  public Zeu4<? extends Zz1i> ZF() {
    return ZK;
  }
  
  private Zbom lambda$getHostScanCheckHistory$0(Zmzk paramZmzk) {
    return this.Za.<Zbom>ZH(new Zmyh());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxml.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */