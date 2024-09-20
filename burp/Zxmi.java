package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxmi extends Zxsr implements Zbza {
  private final Object ZG = new Object();
  
  private final Object Zr = new Object();
  
  private Zz1p ZO;
  
  Zxmi(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Ze3n Zv(Zbnt paramZbnt, Zlg4 paramZlg4, Zxdk paramZxdk, Zlox paramZlox, Zz1m<Zt1o> paramZz1m) {
    return Ztcb.Zk(this, paramZlg4, paramZxdk, paramZlox, paramZz1m);
  }
  
  public Zbza ZP(Zr_4 paramZr_4, boolean paramBoolean) {
    return Ztcb.ZU(this, paramZr_4, paramBoolean);
  }
  
  public String Zgu() {
    return Ztcb.ZO(this);
  }
  
  public boolean ZgL() {
    return (Zgz() != null);
  }
  
  public long Zgd() {
    return this.Za.ZL(this, Zks_.ZW);
  }
  
  public void ZF(long paramLong) {
    this.Za.ZV(this, Zks_.ZW, paramLong);
  }
  
  public void ZR(Zstu paramZstu, long paramLong) {
    this.Za.ZQ(this, Zks_.Zc, paramZstu);
    Zl(paramLong);
  }
  
  public byte[] ZgC() {
    Zstu zstu = Zgy();
    return (zstu == null) ? null : zstu.ZiD();
  }
  
  public byte[] ZgV() {
    Zstu zstu = Zgz();
    return (zstu == null) ? null : zstu.ZiD();
  }
  
  public Zstu Zgy() {
    return this.Za.<Zstu>ZA(this, Zks_.ZS);
  }
  
  public Zstu Zgz() {
    return this.Za.<Zstu>ZA(this, Zks_.Zc);
  }
  
  public Zz1p ZU(Zbnt paramZbnt) {
    synchronized (Zz6()) {
      if (Zgy() != null && this.ZO == null)
        this.ZO = Zghc.ZY(Zg0(), Zgy(), (byte)3, paramZbnt); 
      return this.ZO;
    } 
  }
  
  public int hashCode() {
    return Ztcb.ZY(this);
  }
  
  public Zmzk Zg0() {
    return this.Za.<Zmzk>ZJ(this, Zks_.Zh);
  }
  
  public String ZgY() {
    return this.Za.Zf(this, Zks_.Zq);
  }
  
  public int Zgv() {
    return this.Za.Zx(this, Zks_.ZZ);
  }
  
  public void ZgZ(int paramInt) {
    this.Za.ZM(this, Zks_.ZZ, paramInt);
  }
  
  public byte Zg6() {
    return this.Za.ZL(this, Zks_.Z_);
  }
  
  public void ZN(byte paramByte) {
    this.Za.Zc(this, Zks_.Z_, paramByte);
  }
  
  public int ZgR() {
    return this.Za.Zx(this, Zks_.Zk);
  }
  
  public void ZgM() {
    this.Za.ZM(this, Zks_.Zk, ZgR() + 1);
  }
  
  public int Zgx() {
    return this.Za.Zx(this, Zks_.Zx);
  }
  
  public void Zgq() {
    this.Za.ZM(this, Zks_.Zx, Zgx() + 1);
  }
  
  public void Zg9(int paramInt) {
    this.Za.ZM(this, Zks_.Zb, paramInt);
  }
  
  public Zrdb ZgI() {
    return this.Za.<Zrdb>ZJ(this, Zks_.Zu);
  }
  
  public void ZU(Zrdb paramZrdb) {
    this.Za.Zq(this, Zks_.Zu, paramZrdb);
    Zuh.Zb(ZZz(), Zqf.Zr);
  }
  
  public void Ze(List<Zrdb> paramList) {
    String[] arrayOfString = Zlby.ZL();
    synchronized (this.ZG) {
      if (ZZz())
        ((Zefg<Zrdb>)this.Za.ZJ(this, Zks_.Ze)).addAll(paramList); 
      for (Zrdb zrdb : paramList) {
        if (ZZz() && (ZgI() == null || Zb3i.ZZ(ZgI(), zrdb) == 1))
          ZU(zrdb); 
        Zm(zrdb.Zaw());
        if (arrayOfString != null)
          break; 
      } 
    } 
  }
  
  public List<Zrdb> Zgr() {
    synchronized (this.ZG) {
      return List.copyOf((Collection<? extends Zrdb>)this.Za.ZJ(this, Zks_.Ze));
    } 
  }
  
  public int ZgS() {
    return this.Za.Zx(this, Zks_.ZX);
  }
  
  public int Zg9() {
    return this.Za.Zx(this, Zks_.ZK);
  }
  
  public int ZgH() {
    return this.Za.Zx(this, Zks_.ZL);
  }
  
  public int ZgJ() {
    return this.Za.Zx(this, Zks_.ZC);
  }
  
  public long Zgw() {
    return this.Za.ZL(this, Zks_.Zl);
  }
  
  public void Zl(long paramLong) {
    this.Za.ZV(this, Zks_.Zl, paramLong);
  }
  
  public long ZgK() {
    return this.Za.ZL(this, Zks_.ZG);
  }
  
  public void Zt(long paramLong) {
    this.Za.ZV(this, Zks_.ZG, paramLong);
  }
  
  public long Zg5() {
    return this.Za.ZL(this, Zks_.ZI);
  }
  
  public void Zp(long paramLong) {
    this.Za.ZV(this, Zks_.ZI, paramLong);
  }
  
  public Zefg<Zrrc> Zgf() {
    return (Zefg<Zrrc>)this.Za.ZJ(this, Zks_.ZQ);
  }
  
  public Zmfj ZgW() {
    return Zsou.ZY(this);
  }
  
  public boolean ZO(Zl5x paramZl5x) {
    return Ztcb.Zf(this.Za.ZL(this, Zks_.ZU), paramZl5x);
  }
  
  public void ZR(Zl5x paramZl5x) {
    long l = this.Za.ZL(this, Zks_.ZU);
    this.Za.ZV(this, Zks_.ZU, Ztcb.ZI(l, paramZl5x));
  }
  
  public void Zy(Zl5x paramZl5x) {
    this.Za.ZV(this, Zks_.ZU, Ztcb.Za(this.Za.ZL(this, Zks_.ZU), paramZl5x));
  }
  
  public Collection<Zb09> ZgA() {
    Zefg<Zb09> zefg = (Zefg)this.Za.ZJ(this, Zks_.Zv);
    return (zefg == null) ? Collections.<Zb09>emptySet() : zefg;
  }
  
  public void Zq(Zb09 paramZb09) {
    Zefg<Zb09> zefg = (Zefg)this.Za.ZJ(this, Zks_.Zv);
    if (zefg == null) {
      zefg = Zkk.ZV(this.Za, Zb09.Zh);
      this.Za.Zq(this, Zks_.Zv, zefg);
    } 
    zefg.add(this.Za.<Zb09>ZH(new Zssj(paramZb09)));
  }
  
  public Zlby ZW(Zl5x paramZl5x) {
    return Ztcb.Zv(this.Za.ZL(this, Zks_.ZU), paramZl5x);
  }
  
  public void Zu(Zl5x paramZl5x, Zlby paramZlby) {
    long l = this.Za.ZL(this, Zks_.ZU);
    this.Za.ZV(this, Zks_.ZU, Ztcb.ZH(l, paramZl5x, paramZlby));
  }
  
  public boolean Zge() {
    return (Zg3() != null);
  }
  
  public Zzg0 Zg3() {
    return this.Za.<Zzg0>ZJ(this, Zks_.Za);
  }
  
  public List<Zrdb> Zgc() {
    synchronized (this.Zr) {
      Zefg<? extends Zrdb> zefg = (Zefg)this.Za.ZJ(this, Zks_.Zm);
      return (zefg == null) ? Collections.<Zrdb>emptyList() : List.<Zrdb>copyOf(zefg);
    } 
  }
  
  public void Zi(Zrdb paramZrdb) {
    synchronized (this.Zr) {
      Zefg<Zrdb> zefg = (Zefg)this.Za.ZJ(this, Zks_.Zm);
      if (zefg == null) {
        zefg = Zkk.Zl(this.Za, Zrdb.ZW, 2);
        this.Za.Zq(this, Zks_.Zm, zefg);
      } 
      zefg.add(paramZrdb);
    } 
  }
  
  public void Zo(Zro0 paramZro0, boolean paramBoolean) {
    if (this.Za.ZJ(this, (Zekb<Zsdr>)Zks_.ZM) == null)
      this.Za.Zq(this, (Zekb<Zsdr>)Zks_.ZM, (Zsdr)Zkk.Zl(this.Za, Zsdr.Zo, 0)); 
    String str = paramBoolean ? (paramZro0.toString() + "|") : paramZro0.toString();
    ((Zefg<Zsdr>)this.Za.ZJ(this, Zks_.ZM)).add(this.Za.Zz(str));
  }
  
  public void Zq(Zro0 paramZro0, boolean paramBoolean) {
    if (this.Za.ZJ(this, (Zekb<Zsdr>)Zks_.ZM) != null) {
      String str = paramBoolean ? (paramZro0.toString() + "|") : paramZro0.toString();
      ((Zefg)this.Za.ZJ(this, Zks_.ZM)).remove(new Zw_(str));
    } 
  }
  
  public boolean ZM(Zro0 paramZro0) {
    return (this.Za.ZJ(this, (Zekb<Zsdr>)Zks_.ZM) != null && ((Zefg)this.Za.ZJ(this, Zks_.ZM)).contains(new Zw_(paramZro0.toString())));
  }
  
  public boolean Zm(Zro0 paramZro0) {
    return (this.Za.ZJ(this, (Zekb<Zsdr>)Zks_.ZM) != null && ((Zefg)this.Za.ZJ(this, Zks_.ZM)).contains(new Zw_(paramZro0.toString() + "|")));
  }
  
  public String ZIx() {
    return this.Za.Zf(this, Zks_.ZN);
  }
  
  public void Zxg(String paramString) {
    this.Za.Zi(this, Zks_.ZN, paramString);
  }
  
  public void ZB(byte paramByte) {
    this.Za.Zc(this, Zks_.ZE, paramByte);
  }
  
  public byte ZaP() {
    return this.Za.ZL(this, Zks_.ZE);
  }
  
  public boolean Zd(Zz28 paramZz28) {
    return Ztcb.ZK(this, paramZz28);
  }
  
  public Zeu4<Zbza> ZF() {
    return Zp;
  }
  
  public Zkv9 Zgh() {
    Zkv9 zkv9 = this.Za.<Zkv9>ZJ(this, Zks_.Zp);
    if (zkv9 == null) {
      zkv9 = this.Za.<Zkv9>ZH(new Zsnp(Zgv()));
      this.Za.Zq(this, Zks_.Zp, zkv9);
    } 
    return zkv9;
  }
  
  public boolean ZgD() {
    return (this.Za.ZJ(this, Zks_.Zp) != null);
  }
  
  public int Zgo() {
    Zefg zefg = (Zefg)this.Za.ZJ(this, Zks_.ZV);
    return (zefg == null) ? 0 : zefg.size();
  }
  
  public void Zi(int paramInt, Zro0 paramZro0) {
    Zefg<Zgpi> zefg = (Zefg)this.Za.ZJ(this, Zks_.ZV);
    if (zefg == null) {
      zefg = Zkk.Zl(this.Za, Zsdr.Zo, 10);
      this.Za.Zq(this, Zks_.ZV, zefg);
    } 
    Zw_ zw_ = new Zw_(Ztcb.Zi(paramInt, paramZro0));
    if (!zefg.contains(zw_))
      zefg.add(this.Za.Zz(zw_.toString())); 
  }
  
  public void ZgX() {
    synchronized (Zz6()) {
      this.Za.Zc(this, Zks_.ZA, Ztcb.Zm(this.Za.ZL(this, Zks_.ZA)));
    } 
  }
  
  public boolean Zgt() {
    return Ztcb.Zq(this.Za.ZL(this, Zks_.ZA));
  }
  
  public void Zg2() {
    synchronized (Zz6()) {
      this.Za.Zc(this, Zks_.ZA, Ztcb.Zo(this.Za.ZL(this, Zks_.ZA)));
    } 
  }
  
  public boolean Zga() {
    return Ztcb.Zn(this.Za.ZL(this, Zks_.ZA));
  }
  
  public Zzwo<Zro0, Zga> ZgT() {
    Zzwo<Zro0, Zga> zzwo = this.Za.<Zzwo>ZJ(this, (Zekb)Zks_.ZJ);
    if (zzwo == null) {
      zzwo = this.Za.<Zzwo>ZH((Zsqx)Zks_.Zo);
      this.Za.Zq(this, Zks_.ZJ, zzwo);
    } 
    return zzwo;
  }
  
  private boolean ZZz() {
    return this.Za.Zi(this, Zks_.Zz);
  }
  
  private void Zm(byte paramByte) {
    String[] arrayOfString = Zlby.ZL();
    switch (paramByte) {
      case 4:
        this.Za.ZM(this, Zks_.ZX, ZgS() + 1);
        if (arrayOfString != null);
        return;
      case 3:
        this.Za.ZM(this, Zks_.ZK, Zg9() + 1);
        if (arrayOfString != null);
        return;
      case 2:
        this.Za.ZM(this, Zks_.ZL, ZgH() + 1);
        if (arrayOfString != null);
        return;
      case 1:
        this.Za.ZM(this, Zks_.ZC, ZgJ() + 1);
        if (arrayOfString != null)
          break; 
        return;
    } 
    Zuh.Zv(false, Zqf.Zr, paramByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxmi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */