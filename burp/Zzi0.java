package burp;

import java.io.InputStream;
import java.net.Socket;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public class Zzi0 {
  private final Ztpl ZV;
  
  private final Zbj4 Zz;
  
  private final Zltw ZX;
  
  private final int Zh;
  
  private final AtomicBoolean Zk;
  
  private final Zzaf Za;
  
  private final Zrtw Zf;
  
  private final Zgb6 Zr;
  
  private final boolean Zu;
  
  private final Zz_r Zc;
  
  private final Zkn Zs;
  
  private final Zbnt Zj;
  
  private final AtomicReference<Zx87> Zl;
  
  private final Zbwx ZK;
  
  private Zex_ ZT;
  
  private Zvo1 ZN;
  
  Zzi0(Ztpl paramZtpl, Zzaf paramZzaf, Zbj4 paramZbj4, Zltw paramZltw, int paramInt, AtomicBoolean paramAtomicBoolean, Zrtw paramZrtw, Zgb6 paramZgb6, boolean paramBoolean, Zz_r paramZz_r, Zkn paramZkn, Zbnt paramZbnt, Zbwx paramZbwx) {
    this.ZV = paramZtpl;
    this.Zz = paramZbj4;
    this.ZX = paramZltw;
    this.Zh = paramInt;
    this.Zk = paramAtomicBoolean;
    this.Za = paramZzaf;
    this.Zf = paramZrtw;
    this.Zr = paramZgb6;
    this.Zu = paramBoolean;
    this.Zc = paramZz_r;
    this.Zs = paramZkn;
    this.Zj = paramZbnt;
    this.ZK = paramZbwx;
    this.Zl = new AtomicReference<>();
  }
  
  boolean Zd() {
    this.ZT = Zex_.Zn().Zp(this.ZV.ZX()).ZS(this.ZV.Zl()).ZS(this.ZV.ZB()).Zw(this.ZV.Zp()).Zl();
    Zsjf zsjf = ZG();
    if (!zsjf.ZT() || !zsjf.Zq())
      return false; 
    this.ZV.ZC(Ztir.WAITING);
    this.ZT = this.ZX.ZW(this.ZT);
    return true;
  }
  
  private Zsjf ZG() {
    Zsjf zsjf = Ze_q.Zk(this.ZT);
    if (!zsjf.Zq())
      this.ZV.ZC(Ztir.NO_TARGET); 
    return zsjf;
  }
  
  boolean ZO() {
    Zefx zefx = ZC();
    boolean bool = (!this.Zu || this.Zf.ZTD()) ? true : false;
    Zgsq zgsq = bool ? this.ZT.ZU() : Zgsq.AUTO;
    Zts5 zts5 = this.ZK.Zm(zefx, zgsq, this.ZT.Zx(), this.Zh);
    Zsxd zsxd = this.Za.Zu(zefx, this.Zk, this::lambda$issueRequest$0, zts5, this.Zf);
    return ZI(zsxd);
  }
  
  private Zefx ZC() {
    this.ZT = this.ZT.ZY().Zu(System.currentTimeMillis()).Zl();
    return this.ZT.ZS().ZM(this.ZT.Zf());
  }
  
  boolean ZI(Zsxd paramZsxd) {
    return ZU(paramZsxd, null, null);
  }
  
  boolean ZU(Zsxd paramZsxd, String paramString1, String paramString2) {
    if (paramZsxd.ZG().Zx() instanceof java.net.UnknownHostException) {
      if (!this.Zk.get()) {
        this.ZV.ZC(Zgdp.Zw(this.ZT.Zf().ZJ1()));
        ZH();
      } 
      return false;
    } 
    if (this.Zl.get() == null) {
      long l = (paramZsxd.ZE() == Zsxd.ZG) ? 0L : paramZsxd.ZE().toMillis();
      this.ZT = this.ZT.ZY().Zp(((Zg3d)paramZsxd.ZX().getFirst()).ZR()).ZY(paramZsxd.ZG()).ZD(l).ZB(paramZsxd.ZG().ZI()).ZK(paramZsxd.ZG().Zx()).Zj(paramZsxd.Zg().size()).Zl();
    } 
    if (this.Zk.get())
      return false; 
    Zb(paramString1, paramString2);
    return true;
  }
  
  void ZB(Consumer<Zefx> paramConsumer) {
    paramConsumer.accept(ZC());
  }
  
  private void ZH() {
    this.ZV.Zp(this.ZT.ZS(), Zzg5.UPDATE_WITH_SELECTION);
    this.ZV.ZG(this.ZT.ZU());
  }
  
  private void Zb(String paramString1, String paramString2) {
    this.ZN = (this.Zl.get() != null) ? this.Zz.Zm(this.ZT, this.ZV.Zo()) : this.Zz.Zu(this.ZT, this.ZV.Zo(), paramString1, paramString2);
    this.ZV.ZT(this.ZN);
    this.ZV.ZS(this.ZN, Zzg5.UPDATE_WITH_SELECTION);
  }
  
  void ZQ() {
    Zbqc[] arrayOfZbqc = Ztpl.ZC();
    if (this.Zl.get() != null) {
      if (this.ZN instanceof Zg9m) {
        this.ZV.Zs((Zg9m)this.ZN, this.Zl.get());
        if (arrayOfZbqc == null) {
          ((Zx87)this.Zl.get()).ZU();
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    ((Zx87)this.Zl.get()).ZU();
  }
  
  void Zr() {
    Optional<Zg3d> optional = this.ZT.ZV();
    if (optional.isPresent() && ((Zg3d)optional.get()).Zb() == Zvom.RESPONSE_RECEIVED) {
      Zg3d zg3d = optional.get();
      Zs0d zs0d = Zb2q.ZE(zg3d, this.Zr.ZEn(), this.Zj);
      if (zs0d != null)
        this.ZV.ZF(new Zx0f(zg3d.ZL(), zg3d.Ze().Zg(), zs0d.ZM(), zs0d.Zs())); 
    } 
  }
  
  public void ZY() {
    this.ZV.ZC(Zf());
    this.Zc.Zg(Zeew.REPEATER, this.ZN);
    this.Zs.ZJ(this.ZN);
    Ztyh.Zc();
  }
  
  private Zgdp Zf() {
    return Zlw7.ZW(this.ZT, (this.Zl.get() != null), this::lambda$getStatus$1);
  }
  
  public void ZV() {
    this.ZV.ZC(Ztir.CANCELLED);
  }
  
  private boolean lambda$getStatus$1() {
    return this.ZV.Zc(this.ZN);
  }
  
  private void lambda$issueRequest$0(Socket paramSocket, InputStream paramInputStream) {
    this.Zl.set(new Zx87(paramSocket, paramInputStream));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzi0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */