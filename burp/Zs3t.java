package burp;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zs3t {
  private final Zlvy ZG;
  
  private final Zenj ZI;
  
  private final Zmh Zu;
  
  private final List<Zgrn> ZO;
  
  private final AtomicReference<Zxr8<Zk1g>> Zf;
  
  private WeakReference<Ztj1> Zs;
  
  private static boolean ZQ;
  
  public Zs3t(Supplier<Ztwh> paramSupplier) {
    this(new Zlvy(), new Zenj(new Zzwb(paramSupplier)));
  }
  
  public Zs3t(Zlvy paramZlvy, Zenj paramZenj) {
    this.ZG = paramZlvy;
    this.ZI = paramZenj;
    this.Zu = new Zmh();
    this.ZO = new ArrayList<>();
    boolean bool = ZI();
    this.Zf = new AtomicReference<>();
    if (Zbqc.Zwu() == null)
      Zf(!bool); 
  }
  
  private synchronized void ZF() {
    this.ZG.Zr(true);
  }
  
  private synchronized void Ze() {
    this.ZG.Zr(false);
  }
  
  private synchronized void Zx() {
    this.ZG.Zr(false);
    List<Ztj1> list = this.Zu.Ze();
    if (Zepo.ZE(list)) {
      this.Zs = ZI(list, this.Zs);
      Ztj1 ztj1 = this.Zs.get();
      if (ztj1 != null)
        ztj1.Zx().ZD(); 
    } 
  }
  
  public synchronized void ZR(Ztj1 paramZtj1) {
    this.Zu.Zm(paramZtj1);
    paramZtj1.Zx().ZK(this.ZG);
  }
  
  public synchronized void Zq(Ztj1 paramZtj1) {
    this.Zu.ZC(paramZtj1);
    paramZtj1.Zx().Zs();
  }
  
  public void Zl(Zlli<Zt1p> paramZlli) {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray burp/Zlnb
    //   4: dup
    //   5: iconst_0
    //   6: getstatic burp/Zt1p.ZU : Lburp/Zlnb;
    //   9: aastore
    //   10: dup
    //   11: iconst_1
    //   12: getstatic burp/Zt1p.ZK : Lburp/Zlnb;
    //   15: aastore
    //   16: dup
    //   17: iconst_2
    //   18: getstatic burp/Zt1p.Zz : Lburp/Zlnb;
    //   21: aastore
    //   22: invokestatic of : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   25: aload_0
    //   26: aload_1
    //   27: <illegal opcode> accept : (Lburp/Zs3t;Lburp/Zlli;)Ljava/util/function/Consumer;
    //   32: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   37: invokestatic ZI : ()Z
    //   40: aload_0
    //   41: getfield ZO : Ljava/util/List;
    //   44: aload_1
    //   45: getstatic burp/Zt1p.Zd : Lburp/Zlnb;
    //   48: aload_0
    //   49: <illegal opcode> accept : (Lburp/Zs3t;)Ljava/util/function/Consumer;
    //   54: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   59: invokeinterface add : (Ljava/lang/Object;)Z
    //   64: pop
    //   65: aload_0
    //   66: getfield ZO : Ljava/util/List;
    //   69: aload_1
    //   70: getstatic burp/Zt1p.Zf : Lburp/Zlnb;
    //   73: aload_0
    //   74: <illegal opcode> accept : (Lburp/Zs3t;)Ljava/util/function/Consumer;
    //   79: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   84: invokeinterface add : (Ljava/lang/Object;)Z
    //   89: pop
    //   90: istore_2
    //   91: aload_0
    //   92: getfield ZO : Ljava/util/List;
    //   95: aload_1
    //   96: getstatic burp/Zt1p.ZG : Lburp/Zlnb;
    //   99: aload_0
    //   100: <illegal opcode> accept : (Lburp/Zs3t;)Ljava/util/function/Consumer;
    //   105: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   110: invokeinterface add : (Ljava/lang/Object;)Z
    //   115: pop
    //   116: iload_2
    //   117: ifne -> 127
    //   120: iconst_3
    //   121: anewarray burp/Zbqc
    //   124: invokestatic Zr : ([Lburp/Zbqc;)V
    //   127: return
  }
  
  private void Zu(Zxr8<Zk1g> paramZxr8) {
    boolean bool = Zk();
    Ztbt ztbt = this.ZI.ZS(paramZxr8);
    switch (Ze1b.ZZ[ztbt.ordinal()]) {
      case 1:
        ZF();
        if (bool);
        return;
      case 2:
        Ze();
        if (bool);
        return;
      case 3:
        Zx();
        if (bool)
          break; 
        return;
    } 
    Zuh.Zb(false, Zqf.Zr);
  }
  
  private static WeakReference<Ztj1> ZI(List<Ztj1> paramList, WeakReference<Ztj1> paramWeakReference) {
    byte b = (paramWeakReference == null || paramWeakReference.get() == null) ? -1 : paramList.indexOf(paramWeakReference.get());
    return new WeakReference<>(paramList.get((b + 1) % paramList.size()));
  }
  
  private void lambda$addSubscriptions$4(Zxr8 paramZxr8) {
    this.ZO.forEach(Zgrn::ZZ);
  }
  
  private void lambda$addSubscriptions$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zq);
  }
  
  private void lambda$addSubscriptions$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZR);
  }
  
  private void lambda$addSubscriptions$1(Zlli paramZlli, Zlnb paramZlnb) {
    this.ZO.add(paramZlli.ZE(paramZlnb, this::lambda$addSubscriptions$0));
  }
  
  private void lambda$addSubscriptions$0(Zxr8<Zk1g> paramZxr8) {
    this.Zf.set(paramZxr8);
    Zu(paramZxr8);
  }
  
  public static void Zf(boolean paramBoolean) {
    ZQ = paramBoolean;
  }
  
  public static boolean Zk() {
    return ZQ;
  }
  
  public static boolean ZI() {
    boolean bool = Zk();
    return !bool;
  }
  
  static {
    if (!ZI())
      Zf(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs3t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */