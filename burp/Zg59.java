package burp;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Zg59 implements Zgte {
  private final Zr_4 ZW;
  
  private final Zbnt Zq;
  
  private final Zxa ZK;
  
  private final Set<Zzqc> Zx;
  
  private final Zllh Zv;
  
  public Zg59(Zr_4 paramZr_4, Zbnt paramZbnt, Zxa paramZxa, Zllh paramZllh) {
    this.Zv = paramZllh;
    this.ZW = paramZr_4;
    this.Zq = paramZbnt;
    this.ZK = paramZxa;
    this.Zx = new HashSet<>();
  }
  
  public boolean ZH(Zer0 paramZer0) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Zi : ()Ljava/lang/String;
    //   6: invokestatic ZO : (Ljava/lang/String;)Lburp/Zrp_;
    //   9: astore_2
    //   10: aload_2
    //   11: ifnonnull -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: aload_0
    //   17: aload_2
    //   18: invokevirtual ZYG : ()I
    //   21: invokevirtual ZA : (I)Ljava/util/Optional;
    //   24: astore_3
    //   25: aload_3
    //   26: aload_0
    //   27: aload_2
    //   28: aload_1
    //   29: <illegal opcode> accept : (Lburp/Zg59;Lburp/Zrp_;Lburp/Zer0;)Ljava/util/function/Consumer;
    //   34: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   37: iconst_1
    //   38: ireturn
  }
  
  private Optional<Zzys> ZA(int paramInt) {
    return this.Zv.ZT().stream().filter(paramInt::lambda$findAttackTask$2).findFirst();
  }
  
  private static Optional<Zgxp> Zv(Zzys paramZzys, int paramInt) {
    return paramZzys.ZNH().ZeF().Z_N(paramInt);
  }
  
  private void Zt(Zzys paramZzys, Zgxp paramZgxp, Zer0 paramZer0) {
    Zswk zswk = new Zswk(paramZgxp.Zod(), this.Zq);
    Zsjh<? extends Ztkk> zsjh = zswk.Zj(paramZer0);
    Zefg<Ztkk> zefg = paramZgxp.Zed();
    zefg.add(this.ZW.<Ztkk>ZH((Zsqx)zsjh));
    this.Zx.add(new Zzqc(paramZzys, paramZgxp));
  }
  
  public void ZQ() {
    this.Zx.forEach(this::Zj);
    this.Zx.clear();
  }
  
  private void Zj(Zzqc paramZzqc) {
    int i = paramZzqc.Zbu();
    this.ZK.ZS(i, new Zxr8(Zt1l.Zd));
    if (paramZzqc.ZbW().getAsBoolean())
      this.ZK.ZS(i, new Zxr8(Zt1l.Ze, paramZzqc)); 
  }
  
  private static boolean lambda$findAttackTask$2(int paramInt, Zzys paramZzys) {
    return (paramZzys.ZPo() == paramInt || paramZzys.ZNT() == paramInt);
  }
  
  private void lambda$handleInteraction$1(Zrp_ paramZrp_, Zer0 paramZer0, Zzys paramZzys) {
    // Byte code:
    //   0: aload_3
    //   1: aload_1
    //   2: invokevirtual ZY3 : ()I
    //   5: invokestatic Zv : (Lburp/Zzys;I)Ljava/util/Optional;
    //   8: aload_0
    //   9: aload_3
    //   10: aload_2
    //   11: <illegal opcode> accept : (Lburp/Zg59;Lburp/Zzys;Lburp/Zer0;)Ljava/util/function/Consumer;
    //   16: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   19: return
  }
  
  private void lambda$handleInteraction$0(Zzys paramZzys, Zer0 paramZer0, Zgxp paramZgxp) {
    Zt(paramZzys, paramZgxp, paramZer0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg59.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */