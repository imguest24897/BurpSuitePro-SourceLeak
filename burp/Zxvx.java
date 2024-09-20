package burp;

import java.awt.Component;
import java.time.Duration;
import java.util.List;
import java.util.Objects;

public abstract class Zxvx extends Zxsr implements Zeo2 {
  protected Zxvx(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public boolean ZXR() {
    return true;
  }
  
  public void Zc(Zs68 paramZs68, Zstu paramZstu) {
    this.Za.ZQ(this, Zkpo.Zm, paramZstu.Zp(this.Za));
    Zst6 zst6 = new Zst6(paramZs68);
    this.Za.ZE(this, Zkpo.Zx, zst6.Zg());
    this.Za.ZM(this, Zkpo.Zb, zst6.ZU());
    this.Za.Zi(this, Zkpo.ZE, zst6.ZG());
    this.Za.Zi(this, Zkpo.Zr, zst6.ZQ());
    short s = zst6.Zj();
    if (s != 0)
      this.Za.ZE(this, Zkpo.Zt, s); 
  }
  
  public String ZX4() {
    return this.Za.Zf(this, Zkpo.Zw);
  }
  
  public String ZXF() {
    return this.Za.Zf(this, Zkpo.ZO);
  }
  
  public String ZXE() {
    return this.Za.Zf(this, Zkpo.Zv);
  }
  
  public boolean ZXi() {
    return this.Za.Zi(this, Zkpo.ZC);
  }
  
  public short ZXy() {
    return this.Za.ZQ(this, Zkpo.Zt);
  }
  
  public String ZXw() {
    return this.Za.Zf(this, Zkpo.ZE);
  }
  
  public String ZXj() {
    return this.Za.Zf(this, Zkpo.Zr);
  }
  
  public int ZEe() {
    return this.Za.Zx(this, Zkpo.ZU);
  }
  
  public Zbr ZXD() {
    Zefg<Zk94> zefg = (Zefg)this.Za.ZJ(this, Zkpo.Za);
    Zstu zstu = this.Za.<Zstu>ZA(this, Zkpo.ZW);
    byte b = this.Za.ZL(this, Zkpo.Zh);
    return Zbr.ZK(zefg, zstu, Zkyt.Zf(b));
  }
  
  public Zbr ZXI() {
    Zefg<Zk94> zefg = (Zefg)this.Za.ZJ(this, Zkpo.Zk);
    Zstu zstu = this.Za.<Zstu>ZA(this, Zkpo.ZX);
    byte b = this.Za.ZL(this, Zkpo.ZI);
    return Zbr.ZK(zefg, zstu, Zkyt.Zf(b));
  }
  
  public Zbr ZX9() {
    Zefg<Zk94> zefg = (Zefg)this.Za.ZJ(this, Zkpo.ZL);
    Zstu zstu = this.Za.<Zstu>ZA(this, Zkpo.Zq);
    byte b = this.Za.ZL(this, Zkpo.Zl);
    return Zbr.ZK(zefg, zstu, Zkyt.Zf(b));
  }
  
  public void ZJ(Zbr paramZbr) {
    int[] arrayOfInt = Zmyr.ZL();
    if (paramZbr == null || paramZbr.Zd()) {
      this.Za.Zq(this, (Zekb<Zk94>)Zkpo.ZL, null);
      this.Za.ZQ(this, Zkpo.Zq, null);
      this.Za.Zc(this, Zkpo.Zl, Zkyt.UNKNOWN.persistedId);
      if (arrayOfInt != null) {
        this.Za.Zq(this, Zkpo.ZL, paramZbr.ZO());
        this.Za.ZQ(this, Zkpo.Zq, paramZbr.Zr());
        this.Za.Zc(this, Zkpo.Zl, (paramZbr.Zx()).persistedId);
        return;
      } 
      return;
    } 
    this.Za.Zq(this, Zkpo.ZL, paramZbr.ZO());
    this.Za.ZQ(this, Zkpo.Zq, paramZbr.Zr());
    this.Za.Zc(this, Zkpo.Zl, (paramZbr.Zx()).persistedId);
  }
  
  public Zstu ZX7() {
    return this.Za.<Zstu>ZA(this, Zkpo.Zm);
  }
  
  public void ZR(Zstu paramZstu) {
    this.Za.ZQ(this, Zkpo.Zm, paramZstu);
  }
  
  public Zstu ZX8() {
    return this.Za.<Zstu>ZA(this, Zkpo.ZN);
  }
  
  public void Zp(Zstu paramZstu) {
    this.Za.ZQ(this, Zkpo.ZN, paramZstu);
  }
  
  public Zstu ZXq() {
    return this.Za.<Zstu>ZA(this, Zkpo.ZQ);
  }
  
  public void Zh(Zstu paramZstu) {
    this.Za.ZQ(this, Zkpo.ZQ, paramZstu);
  }
  
  public boolean ZXo() {
    String str = ZAs();
    byte b = ZaP();
    return (Zsw8.ZS(str) || b > 0);
  }
  
  public void Zfs(int paramInt) {
    this.Za.ZM(this, Zkpo.Zb, paramInt);
  }
  
  public Zeo2 ZJ(Zr_4 paramZr_4) {
    if (paramZr_4.ZV(this))
      return this; 
    Zbr zbr1 = ZXD();
    Zbr zbr2 = ZXI();
    Zbr zbr3 = ZX9();
    Zstu zstu1 = ZX7();
    Zstu zstu2 = ZX8();
    Zstu zstu3 = ZXq();
    Zbr zbr4 = (zbr1 == null) ? null : zbr1.Zi(paramZr_4);
    Zbr zbr5 = (zbr2 == null) ? null : zbr2.Zi(paramZr_4);
    Zbr zbr6 = (zbr3 == null) ? null : zbr3.Zi(paramZr_4);
    Zstu zstu4 = (zstu1 == null) ? null : zstu1.Zp(paramZr_4);
    Zstu zstu5 = (zstu2 == null) ? null : zstu2.Zp(paramZr_4);
    Zstu zstu6 = (zstu3 == null) ? null : zstu3.Zp(paramZr_4);
    Zeo2 zeo2 = paramZr_4.<Zeo2>ZH(new Zmyt(ZoB(), ZEe(), ZX4(), ZlL(), ZXF(), ZXy(), ZXE(), ZXi(), zbr4, zbr5, Zl7(), ZXw(), ZXj(), ZXR()));
    zeo2.ZuP(ZEK());
    zeo2.Zfs(Zlq());
    zeo2.ZWK(ZAs());
    zeo2.ZB(ZaP());
    zeo2.ZR(zstu4);
    zeo2.Zp(zstu5);
    zeo2.Zh(zstu6);
    zeo2.ZJ(zbr6);
    zeo2.Zo(ZXV());
    zeo2.ZM(ZXp());
    zeo2.ZG(ZXm());
    return zeo2;
  }
  
  public Duration ZXp() {
    return Duration.ofMillis(this.Za.ZL(this, Zkpo.ZG));
  }
  
  public void ZM(Duration paramDuration) {
    this.Za.ZV(this, Zkpo.ZG, paramDuration.toMillis());
  }
  
  public Duration ZXm() {
    return Duration.ofMillis(this.Za.ZL(this, Zkpo.Zu));
  }
  
  public void ZG(Duration paramDuration) {
    this.Za.ZV(this, Zkpo.Zu, paramDuration.toMillis());
  }
  
  public long ZXV() {
    return this.Za.ZL(this, Zkpo.ZM);
  }
  
  public void Zo(long paramLong) {
    this.Za.ZV(this, Zkpo.ZM, paramLong);
  }
  
  public Zlit ZlL() {
    return this.Za.<Zlit>ZJ(this, Zkpo.Zz);
  }
  
  public Zmzk Zod() {
    return ZlL().Zdz();
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return null;
  }
  
  public Zbr Zo3() {
    return Zs_8.Zb(this);
  }
  
  public Zstu Zos() {
    return Zs_8.Zg(this);
  }
  
  public Zstu ZoO() {
    return ZX7();
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public long ZoB() {
    return this.Za.ZL(this, Zkpo.Z_);
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return new Zo8(this, paramZkl6.ZH(), paramZm6x);
  }
  
  public byte ZaP() {
    return this.Za.ZL(this, Zkpo.ZA);
  }
  
  public void ZB(byte paramByte) {
    this.Za.Zc(this, Zkpo.ZA, paramByte);
  }
  
  public Zeew Ze2() {
    return Zeew.PROXY;
  }
  
  public short Zl7() {
    return this.Za.ZQ(this, Zkpo.Zx);
  }
  
  public int Zlq() {
    return this.Za.Zx(this, Zkpo.Zb);
  }
  
  public String ZIx() {
    return ZAs();
  }
  
  public void Zxg(String paramString) {
    ZWK(paramString);
  }
  
  public String ZAs() {
    String str = this.Za.Zz(this, Zkpo.ZP);
    if (str == null && this.Za.ZQ(this, 12))
      str = Objects.toString(this.Za.Zg(this, Zkpo.ZZ, false), null); 
    return (str == null) ? "" : str;
  }
  
  public void ZWK(String paramString) {
    this.Za.ZR(this, Zkpo.ZP, paramString);
  }
  
  public void ZuP(int paramInt) {
    this.Za.ZM(this, Zkpo.ZK, paramInt);
  }
  
  public int ZEK() {
    return this.Za.Zx(this, Zkpo.ZK);
  }
  
  public boolean Zd(Zz28 paramZz28) {
    return paramZz28.ZG(ZlL());
  }
  
  public void ZHG() {
    this.Za.ZM(this, Zkpo.ZV, 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxvx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */