package burp;

import java.io.IOException;
import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

class Zbfh implements Zxoq, Zsoa {
  private static final Zzvv Zf = new Zgb1();
  
  private final Supplier<Ztjd> Zw;
  
  private final Zlan Z_;
  
  private final Zqb Zl;
  
  private final Ztt7 Zz;
  
  private final Ztf5 ZG;
  
  private final Zx86 ZL;
  
  private final Zbip ZJ;
  
  private final Zzen ZI;
  
  private final Map<Integer, Zzvv> Zp;
  
  private final Zgup Zd;
  
  private final AtomicReference<Instant> Ze;
  
  private final Zryu Zh;
  
  private final Zmh1 Zm;
  
  private final Zs5t ZU;
  
  Zbfh(Supplier<Ztjd> paramSupplier, Zlan paramZlan, Zqb paramZqb, Ztt7 paramZtt7, Ztf5 paramZtf5, Zx86 paramZx86, Zbip paramZbip, Zzen paramZzen, Zryu paramZryu, Zlm7 paramZlm7, Zs5t paramZs5t) {
    this.Zw = paramSupplier;
    this.Z_ = paramZlan;
    this.Zl = paramZqb;
    this.Zz = paramZtt7;
    this.ZG = paramZtf5;
    this.ZL = paramZx86;
    this.ZJ = paramZbip;
    this.ZI = paramZzen;
    this.Zh = paramZryu;
    this.ZU = paramZs5t;
    this.Zp = new ConcurrentHashMap<>();
    this.Zd = new Zgup();
    this.Ze = new AtomicReference<>();
    this.Zm = new Zmh1(paramZlm7, paramZbip, paramZtf5, paramZx86);
  }
  
  Zzvv Z_(Ztuf paramZtuf) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zm : Lburp/Zmh1;
    //   4: aload_1
    //   5: invokevirtual ZT : (Lburp/Ztuf;)V
    //   8: aload_0
    //   9: getfield Zd : Lburp/Zgup;
    //   12: invokevirtual Zu : ()I
    //   15: istore_2
    //   16: aload_0
    //   17: getfield ZU : Lburp/Zs5t;
    //   20: iload_2
    //   21: invokevirtual ZQ : (I)Lburp/Zst8;
    //   24: astore_3
    //   25: new burp/Zt1m
    //   28: dup
    //   29: aload_0
    //   30: getfield ZG : Lburp/Ztf5;
    //   33: aload_0
    //   34: getfield Zl : Lburp/Zqb;
    //   37: aload_0
    //   38: getfield Zz : Lburp/Ztt7;
    //   41: aload_3
    //   42: invokespecial <init> : (Lburp/Ztf5;Lburp/Zqb;Lburp/Ztt7;Lburp/Zst8;)V
    //   45: astore #4
    //   47: new burp/Zxpk
    //   50: dup
    //   51: iload_2
    //   52: aload_3
    //   53: aload_0
    //   54: aload #4
    //   56: iload_2
    //   57: <illegal opcode> Zb : (Lburp/Zbfh;Lburp/Zt1m;I)Lburp/Ze19;
    //   62: aload #4
    //   64: aload_0
    //   65: getfield Zw : Ljava/util/function/Supplier;
    //   68: invokeinterface get : ()Ljava/lang/Object;
    //   73: checkcast burp/Ztjd
    //   76: aload_0
    //   77: getfield ZL : Lburp/Zx86;
    //   80: aload_0
    //   81: getfield ZG : Lburp/Ztf5;
    //   84: aload_0
    //   85: getfield ZJ : Lburp/Zbip;
    //   88: aload_0
    //   89: getfield Zh : Lburp/Zryu;
    //   92: invokespecial <init> : (ILburp/Zst8;Lburp/Ze19;Lburp/Zevl;Lburp/Ztjd;Lburp/Zx86;Lburp/Ztf5;Lburp/Zbip;Lburp/Zryu;)V
    //   95: astore #5
    //   97: new burp/Zthp
    //   100: dup
    //   101: aload #5
    //   103: aload_0
    //   104: getfield Z_ : Lburp/Zlan;
    //   107: aload_3
    //   108: aload #4
    //   110: aload_0
    //   111: getfield ZI : Lburp/Zzen;
    //   114: invokespecial <init> : (Lburp/Zxpk;Lburp/Zlan;Lburp/Zst8;Lburp/Zt1m;Lburp/Zzen;)V
    //   117: astore #6
    //   119: aload_0
    //   120: getfield Zp : Ljava/util/Map;
    //   123: aload #6
    //   125: invokeinterface ZS : ()I
    //   130: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   133: aload #6
    //   135: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   140: pop
    //   141: aload #6
    //   143: areturn
  }
  
  public Zzvv Zm(int paramInt) throws Zzt7 {
    try {
      if (paramInt % 2 == 0)
        throw new Zzt7(Zlxi.PROTOCOL_ERROR); 
    } catch (Zzt7 zzt7) {
      throw a(null);
    } 
    return this.Zp.getOrDefault(Integer.valueOf(paramInt), Zf);
  }
  
  public void Zn(int paramInt, Zlxi paramZlxi) {
    ((Zzvv)this.Zp.getOrDefault(Integer.valueOf(paramInt), Zf)).Zr(paramZlxi);
  }
  
  public void ZY() {
    this.Zp.forEach(Zbfh::lambda$closeAllStreams$1);
    this.Zp.clear();
    this.Ze.set(this.ZG.Zf());
  }
  
  Instant Zn() {
    return this.Ze.get();
  }
  
  public boolean ZR() {
    return (!this.Zp.isEmpty() && this.Zp.values().stream().anyMatch(Zbfh::lambda$hasActiveStreams$2));
  }
  
  private static boolean lambda$hasActiveStreams$2(Zzvv paramZzvv) {
    return !paramZzvv.Zq();
  }
  
  private static void lambda$closeAllStreams$1(Integer paramInteger, Zzvv paramZzvv) {
    paramZzvv.Zr(Zlxi.NO_ERROR);
  }
  
  private void lambda$create$0(Zt1m paramZt1m, int paramInt, Zrsv paramZrsv) {
    paramZt1m.Zb(paramZrsv);
    if (paramZrsv == Zrsv.CLOSED && this.Zp.remove(Integer.valueOf(paramInt)) != null) {
      this.Ze.set(this.ZG.Zf());
      this.Zm.Zd();
    } 
  }
  
  private static Zzt7 a(Zzt7 paramZzt7) {
    return paramZzt7;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbfh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */