package burp;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zgf1 implements Zx80 {
  private final Supplier<Zzk7> ZP;
  
  private final Zlli<Zt1s> Zt;
  
  private final Function<Integer, Optional<Zr5_>> Zi;
  
  public Zgf1(Supplier<Zzk7> paramSupplier, Zlli<Zt1s> paramZlli, Function<Integer, Optional<Zr5_>> paramFunction) {
    this.ZP = paramSupplier;
    this.Zt = paramZlli;
    this.Zi = paramFunction;
  }
  
  public void Zs() {
    ((Zzk7)this.ZP.get()).ZP();
  }
  
  public void Zw(int paramInt) {
    ((Zzk7)this.ZP.get()).ZT(paramInt);
  }
  
  public void Zh() {
    ((Zzk7)this.ZP.get()).ZQ();
  }
  
  public void Zt(String paramString) {
    ((Zzk7)this.ZP.get()).ZU(paramString);
  }
  
  public void ZM(boolean paramBoolean) {
    ((Zzk7)this.ZP.get()).ZG(paramBoolean);
  }
  
  public void Zl(int paramInt) {
    ((Zzk7)this.ZP.get()).Zm(paramInt);
  }
  
  public void Zt(boolean paramBoolean) {
    ((Zzk7)this.ZP.get()).ZI(paramBoolean);
  }
  
  public void ZU(boolean paramBoolean) {
    ((Zzk7)this.ZP.get()).ZD(paramBoolean);
  }
  
  public void ZR(boolean paramBoolean) {
    ((Zzk7)this.ZP.get()).Zg(paramBoolean);
  }
  
  public void ZS(boolean paramBoolean) {
    ((Zzk7)this.ZP.get()).Zr(paramBoolean);
  }
  
  public void ZI(String paramString) {
    ((Zzk7)this.ZP.get()).Zm(paramString);
  }
  
  public void Zj(boolean paramBoolean) {
    ((Zzk7)this.ZP.get()).Zf(paramBoolean);
  }
  
  public void Zr(int paramInt) {
    ((Zzk7)this.ZP.get()).Zz(paramInt);
  }
  
  public void Zb() {
    ((Zzk7)this.ZP.get()).Zn();
  }
  
  public void Zg() {
    ((Zzk7)this.ZP.get()).ZA();
  }
  
  public void ZN() {
    ((Zzk7)this.ZP.get()).Zs();
  }
  
  public void Zb(int paramInt) {
    ((Zzk7)this.ZP.get()).ZH(paramInt);
  }
  
  public Zip Ze() {
    Zzk7 zzk7 = this.ZP.get();
    String str = zzk7.ZN();
    Zb2y zb2y = zzk7.Zl();
    return new Zip(zb2y, str);
  }
  
  public Zip Zo() {
    Zzk7 zzk7 = this.ZP.get();
    String str = zzk7.ZN();
    Zb2y zb2y = zzk7.Zl();
    Zz(zb2y);
    return new Zip(zb2y, str);
  }
  
  public void Zd(Zip paramZip) {
    ((Zzk7)this.ZP.get()).ZK(paramZip.ZU);
  }
  
  private void Zz(Zb2y paramZb2y) {
    paramZb2y.ZA().ifPresent(this::lambda$setupSelectNewlyCreatedResourcePoolIfSpecified$1);
  }
  
  public void Zt() {
    ((Zzk7)this.ZP.get()).Zv();
  }
  
  public void Zn() {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zu() {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  private void lambda$setupSelectNewlyCreatedResourcePoolIfSpecified$1(Ztwh paramZtwh) {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicReference
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: getfield Zt : Lburp/Zlli;
    //   12: getstatic burp/Zt1s.ZX : Lburp/Zlnb;
    //   15: aload_0
    //   16: aload_1
    //   17: aload_2
    //   18: <illegal opcode> accept : (Lburp/Zgf1;Lburp/Ztwh;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   23: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   28: astore_3
    //   29: aload_2
    //   30: aload_3
    //   31: invokevirtual set : (Ljava/lang/Object;)V
    //   34: return
  }
  
  private void lambda$setupSelectNewlyCreatedResourcePoolIfSpecified$0(Ztwh paramZtwh, AtomicReference<Zgrn> paramAtomicReference, Zxr8 paramZxr8) {
    Zzk7 zzk7 = this.ZP.get();
    zzk7.Zv();
    zzk7.ZJ(paramZtwh.Zz());
    ((Zgrn)paramAtomicReference.get()).ZZ();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgf1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */