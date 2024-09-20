package burp;

import java.util.List;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zb_t implements Zm9n {
  private static final List<Zzu2> Zo = List.of(Zzu2.JWT_SIGNATURE_NOT_VERIFIED, Zzu2.JWT_NONE_ALG_SUPPORTED, Zzu2.JWT_JWK_HEADER_SUPPORTED);
  
  private final Zmhe ZU;
  
  private final Zkq4 ZE;
  
  private final Ze3n Zm;
  
  private final Zxs7 Zt;
  
  private final Zbnt Z_;
  
  private final Zxrc ZX;
  
  private final Zlx7 Zs;
  
  private final Zbjl Zh;
  
  public Zb_t(Zmhe paramZmhe, Zkq4 paramZkq4, Ze3n paramZe3n, Zxs7 paramZxs7, Zbnt paramZbnt, Zz1i paramZz1i, Zbjl paramZbjl) {
    this.ZU = paramZmhe;
    this.ZE = paramZkq4;
    this.Zm = paramZe3n;
    boolean bool = Zzrf.Zo();
    this.Zt = paramZxs7;
    this.Z_ = paramZbnt;
    this.ZX = paramZxs7.Zq(paramZkq4) ? null : Zt59.ZF(paramZxs7.ZI()).orElse(null);
    this.Zs = paramZz1i.Zc(paramZe3n.Za()).ZCP();
    this.Zh = paramZbjl;
    if (Zbqc.Zwu() == null)
      Zzrf.ZO(!bool); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_JsonWebTokens;
  }
  
  public boolean Zf() {
    return (this.ZX != null && this.ZX.Zz());
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    if (!Zf())
      return; 
    String str = this.ZX.ZP();
    synchronized (this.Zs.Zz6()) {
      if (!this.Zs.Zv0(str))
        return; 
    } 
    Zxrc zxrc = this.ZX.Zk();
    zxrc.Zw("{" + " ".repeat(this.ZX.Zx().length() - 2) + "}");
    Zstu zstu = ZK(zxrc);
    if (Zb(zstu))
      ZY(paramZz4_, zxrc, zstu, paramZrj.Zg()); 
  }
  
  private void ZY(Zz4_ paramZz4_, Zxrc paramZxrc, Zstu paramZstu, int paramInt) {
    String str = this.ZX.ZP();
    synchronized (this.Zs.Zz6()) {
      if (!this.Zs.Zv0(str))
        return; 
      this.Zs.Zv6(str);
    } 
    try {
      Zy(paramZz4_, paramZxrc, paramZstu);
      Zl(paramInt);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.RETHROWN);
      synchronized (this.Zs.Zz6()) {
        this.Zs.ZvO(str);
      } 
      throw throwable;
    } 
  }
  
  private void Zl(int paramInt) {
    boolean bool = Zzrf.ZA();
    if (!this.Zh.ZG())
      return; 
    Zzrf zzrf = new Zzrf(this.ZE, this.Zt, this.ZX, paramInt, this.Zm.ZM().Zgv(), this.Zh);
    for (Zewx zewx : zzrf.ZK()) {
      if (zewx.ZA(this.Zh))
        this.ZU.ZK(Zri7.ZJ(new Zrrb(zewx.Zh(), (byte)0)), Zlp5.Zc().Zd(true)); 
      if (bool)
        break; 
    } 
  }
  
  private void Zy(Zz4_ paramZz4_, Zxrc paramZxrc, Zstu paramZstu) {
    Zg39 zg39 = new Zg39(this.Z_, this.ZU, this.ZE, this.Zm, this.Zt, this.ZX, paramZxrc, paramZstu);
    Objects.requireNonNull(this.ZE);
    Objects.requireNonNull(zg39);
    Objects.requireNonNull(paramZz4_);
    Zo.stream().filter(this.ZE::Zr).map(zg39::Z_).filter(Objects::nonNull).findFirst().ifPresent(paramZz4_::Zz);
  }
  
  private Zstu ZK(Zxrc paramZxrc) {
    return ZQ(this.ZU.ZK(Zri7.ZJ(new Zrrb(Zkb.Zy(paramZxrc.ZP()), (byte)0)), Zlp5.Zc()));
  }
  
  private boolean Zb(Zstu paramZstu) {
    Zsb8 zsb8 = new Zsb8(this.Zm.ZA().ZF(), this.Zm.ZL().Za(), paramZstu, this.Z_);
    return zsb8.Zw();
  }
  
  private static Zstu ZQ(Zlvf paramZlvf) {
    return paramZlvf.ZM().Zl();
  }
  
  public String toString() {
    return Zp().name();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb_t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */