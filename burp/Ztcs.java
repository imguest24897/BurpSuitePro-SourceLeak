package burp;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztcs implements Zx80 {
  private final Supplier<Zzk7> Zg;
  
  private final Function<Zb2y, Zr5_> Zq;
  
  private final Consumer<Zr5_> ZR;
  
  private final Zlli<Zt1s> ZG;
  
  private final Supplier<Integer> Zb;
  
  private final Function<Integer, Optional<Zr5_>> ZS;
  
  private List<Zgrn> ZO;
  
  public Ztcs(Supplier<Zzk7> paramSupplier, Function<Zb2y, Zr5_> paramFunction, Consumer<Zr5_> paramConsumer, Zlli<Zt1s> paramZlli, Supplier<Integer> paramSupplier1, Function<Integer, Optional<Zr5_>> paramFunction1) {
    this.Zg = paramSupplier;
    this.Zq = paramFunction;
    this.ZR = paramConsumer;
    this.ZG = paramZlli;
    this.Zb = paramSupplier1;
    this.ZS = paramFunction1;
  }
  
  public void Zs() {}
  
  public void Zw(int paramInt) {
    Zm2.ZC(Zrrh.INTRUDER_RESOURCE_POOLS_CONFIG_MODIFIED_DURING_ATTACK);
    ((Zzk7)this.Zg.get()).ZT(paramInt);
    Zb2y zb2y = Zb2y.Zs(paramInt);
    Zr5_ zr5_ = this.Zq.apply(zb2y);
    int i = Zip.ZG();
    this.ZR.accept(zr5_);
    if (Zbqc.Zwu() == null)
      Zip.ZR(++i); 
  }
  
  public void Zh() {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zt(String paramString) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZM(boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zl(int paramInt) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zj(boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zt(boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZU(boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZR(boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZS(boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZI(String paramString) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zr(int paramInt) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zb() {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zg() {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZN() {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zb(int paramInt) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public Zip Ze() {
    Zzk7 zzk7 = this.Zg.get();
    String str = zzk7.ZN();
    Zb2y zb2y = zzk7.Zl();
    return new Zip(zb2y, str);
  }
  
  public Zip Zo() {
    Zzk7 zzk7 = this.Zg.get();
    String str = zzk7.ZN();
    Zb2y zb2y = zzk7.Zl();
    return new Zip(zb2y, str);
  }
  
  public void Zd(Zip paramZip) {
    ((Zzk7)this.Zg.get()).ZK(paramZip.ZU);
  }
  
  public void Zt() {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zn() {
    Zr();
    ((Zzk7)this.Zg.get()).Zv();
    ((Zzk7)this.Zg.get()).ZT(((Integer)this.Zb.get()).intValue());
  }
  
  private void Zr() {
    Zgrn zgrn1 = this.ZG.ZE(Zt1s.ZX, this::lambda$subscribeToResourcePoolChangedEvents$0);
    Zgrn zgrn2 = this.ZG.ZE(Zt1s.Zr, this::lambda$subscribeToResourcePoolChangedEvents$0);
    this.ZO = List.of(zgrn1, zgrn2);
  }
  
  public void Zu() {
    if (this.ZO != null) {
      this.ZO.forEach(Zgrn::ZZ);
      this.ZO = null;
    } 
  }
  
  private void lambda$subscribeToResourcePoolChangedEvents$0(Zxr8 paramZxr8) {
    ((Zzk7)this.Zg.get()).Zv();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztcs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */