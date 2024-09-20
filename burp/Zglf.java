package burp;

import java.awt.Component;
import java.awt.event.HierarchyEvent;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.swing.SwingUtilities;
import net.portswigger.Zm2;

public class Zglf implements Zr2e, Zmon {
  private final Zbd_ Zx;
  
  private final Zbd0 ZA;
  
  private final Zzwf ZB;
  
  private final Zkee ZP;
  
  private final Zb3j ZG;
  
  private final Map<Zgu3, List<Zt37>> ZN;
  
  private final Zguk Zp;
  
  private final Supplier<Zlcn> Zm;
  
  private volatile boolean ZC;
  
  private volatile Zlcn Zu;
  
  private Ztmh Zr;
  
  private boolean Zy;
  
  public Zglf(Zbps paramZbps, Zbnt paramZbnt, Zey9 paramZey9, Zb0h paramZb0h, ExecutorService paramExecutorService1, ExecutorService paramExecutorService2, ScheduledExecutorService paramScheduledExecutorService, Zkee paramZkee, Zb86 paramZb86) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload #8
    //   7: putfield ZP : Lburp/Zkee;
    //   10: aload_0
    //   11: new burp/Zguk
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: putfield Zp : Lburp/Zguk;
    //   21: aload_0
    //   22: aload_0
    //   23: aload_2
    //   24: aload_3
    //   25: aload #5
    //   27: aload #6
    //   29: aload #7
    //   31: <illegal opcode> get : (Lburp/Zglf;Lburp/Zbnt;Lburp/Zey9;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/function/Supplier;
    //   36: putfield Zm : Ljava/util/function/Supplier;
    //   39: aload_0
    //   40: aload_0
    //   41: getfield Zm : Ljava/util/function/Supplier;
    //   44: invokeinterface get : ()Ljava/lang/Object;
    //   49: checkcast burp/Zlcn
    //   52: putfield Zu : Lburp/Zlcn;
    //   55: new burp/Zt9u
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: astore #11
    //   64: new burp/Ztmb
    //   67: dup
    //   68: aload_0
    //   69: <illegal opcode> get : (Lburp/Zglf;)Lburp/Ztp8;
    //   74: aload #11
    //   76: dup
    //   77: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   80: pop
    //   81: <illegal opcode> run : (Lburp/Zt9u;)Ljava/lang/Runnable;
    //   86: invokespecial <init> : (Lburp/Ztp8;Ljava/lang/Runnable;)V
    //   89: astore #12
    //   91: aload #8
    //   93: invokevirtual ZR : ()Lburp/Zliz;
    //   96: astore #13
    //   98: aload_0
    //   99: new burp/Zb3j
    //   102: dup
    //   103: aload #11
    //   105: aload_0
    //   106: <illegal opcode> get : (Lburp/Zglf;)Lburp/Ztp8;
    //   111: aload #12
    //   113: aload #4
    //   115: aload_0
    //   116: <illegal opcode> get : (Lburp/Zglf;)Ljava/util/function/Supplier;
    //   121: aload #13
    //   123: aload #9
    //   125: invokespecial <init> : (Lburp/Ztz9;Lburp/Ztp8;Lburp/Ztmb;Lburp/Zb0h;Ljava/util/function/Supplier;Lburp/Zliz;Lburp/Zb86;)V
    //   128: putfield ZG : Lburp/Zb3j;
    //   131: aload_0
    //   132: aload_1
    //   133: invokevirtual Za : (Lburp/Zbps;)Ljava/util/List;
    //   136: astore #14
    //   138: aload_0
    //   139: aload_1
    //   140: invokevirtual Za : (Lburp/Zbps;)Ljava/util/List;
    //   143: astore #15
    //   145: aload_0
    //   146: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   149: aload #14
    //   151: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   154: aload #15
    //   156: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;
    //   159: putfield ZN : Ljava/util/Map;
    //   162: aload_0
    //   163: getfield ZN : Ljava/util/Map;
    //   166: invokeinterface values : ()Ljava/util/Collection;
    //   171: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   176: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   181: invokeinterface flatMap : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   186: invokestatic toList : ()Ljava/util/stream/Collector;
    //   189: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   194: checkcast java/util/List
    //   197: astore #16
    //   199: invokestatic Ze : ()[Ljava/lang/String;
    //   202: aload_0
    //   203: new burp/Zbd0
    //   206: dup
    //   207: aload #11
    //   209: aload_0
    //   210: <illegal opcode> get : (Lburp/Zglf;)Lburp/Ztp8;
    //   215: aload #4
    //   217: aload_0
    //   218: <illegal opcode> get : (Lburp/Zglf;)Ljava/util/function/Supplier;
    //   223: aload #12
    //   225: aload_1
    //   226: aload #13
    //   228: aload #16
    //   230: aload_0
    //   231: getfield ZG : Lburp/Zb3j;
    //   234: invokespecial <init> : (Lburp/Ztz9;Lburp/Ztp8;Lburp/Zb0h;Ljava/util/function/Supplier;Lburp/Ztmb;Lburp/Zbps;Lburp/Zliz;Ljava/util/List;Lburp/Zb3j;)V
    //   237: putfield ZA : Lburp/Zbd0;
    //   240: aload_0
    //   241: new burp/Zbd_
    //   244: dup
    //   245: aload_0
    //   246: getfield ZA : Lburp/Zbd0;
    //   249: aload_0
    //   250: <illegal opcode> get : (Lburp/Zglf;)Ljava/util/function/Supplier;
    //   255: invokespecial <init> : (Lburp/Zbd0;Ljava/util/function/Supplier;)V
    //   258: putfield Zx : Lburp/Zbd_;
    //   261: aload #11
    //   263: new burp/Zej9
    //   266: dup
    //   267: aload_0
    //   268: getfield ZA : Lburp/Zbd0;
    //   271: aload_0
    //   272: getfield Zx : Lburp/Zbd_;
    //   275: aload_0
    //   276: <illegal opcode> get : (Lburp/Zglf;)Lburp/Ztp8;
    //   281: aload_0
    //   282: <illegal opcode> run : (Lburp/Zglf;)Ljava/lang/Runnable;
    //   287: invokespecial <init> : (Lburp/Zbd0;Lburp/Zbd_;Lburp/Ztp8;Ljava/lang/Runnable;)V
    //   290: invokevirtual ZC : (Lburp/Ztz9;)V
    //   293: aload_0
    //   294: getstatic burp/Ztmh.Zy : Lburp/Ztmh;
    //   297: putfield Zr : Lburp/Ztmh;
    //   300: astore #10
    //   302: aload_0
    //   303: new burp/Zsi9
    //   306: dup
    //   307: aload_0
    //   308: getfield ZA : Lburp/Zbd0;
    //   311: aload_0
    //   312: getfield Zx : Lburp/Zbd_;
    //   315: aload_0
    //   316: getfield Zp : Lburp/Zguk;
    //   319: invokespecial <init> : (Lburp/Zbd0;Lburp/Zbd_;Lburp/Zxko;)V
    //   322: putfield ZB : Lburp/Zzwf;
    //   325: new java/util/concurrent/atomic/AtomicInteger
    //   328: dup
    //   329: aload #8
    //   331: invokevirtual ZG : ()I
    //   334: invokespecial <init> : (I)V
    //   337: astore #17
    //   339: new burp/Zsyj
    //   342: dup
    //   343: aload_0
    //   344: aload #17
    //   346: invokespecial <init> : (Lburp/Zglf;Ljava/util/concurrent/atomic/AtomicInteger;)V
    //   349: astore #18
    //   351: aload_0
    //   352: getfield ZA : Lburp/Zbd0;
    //   355: aload_0
    //   356: aload #8
    //   358: aload #18
    //   360: aload #17
    //   362: <illegal opcode> hierarchyChanged : (Lburp/Zglf;Lburp/Zkee;Lburp/Zsyj;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/awt/event/HierarchyListener;
    //   367: invokevirtual addHierarchyListener : (Ljava/awt/event/HierarchyListener;)V
    //   370: invokestatic Zwu : ()[Lburp/Zbqc;
    //   373: ifnonnull -> 383
    //   376: iconst_3
    //   377: anewarray java/lang/String
    //   380: invokestatic Zq : ([Ljava/lang/String;)V
    //   383: return
  }
  
  private Zlcn ZHu() {
    return this.Zu;
  }
  
  public Zs_i ZsO() {
    return this.Zx.ZsO();
  }
  
  public String Zsd() {
    return this.Zx.Zsd();
  }
  
  public List<Zm9t> ZC() {
    return this.Zx.ZC();
  }
  
  public Component ZE() {
    return this.Zx.ZE();
  }
  
  public Zbdr ZsQ() {
    return this.Zx.ZsQ();
  }
  
  public Zze0 Zsc() {
    return this.Zx.Zsc();
  }
  
  private List<Zt37> Za(Zbps paramZbps) {
    return List.of(this.ZG.Zs(paramZbps), this.ZG.ZT(Zmjk.REQUEST_QUERY_PARAMETERS), this.ZG.ZT(Zmjk.REQUEST_BODY_PARAMETERS), this.ZG.ZT(Zmjk.REQUEST_COOKIES), this.ZG.ZT(Zmjk.REQUEST_HEADERS), this.ZG.ZT(Zmjk.RESPONSE_HEADERS));
  }
  
  private void ZHV() {
    SwingUtilities.invokeLater(this::lambda$updatePositionAndExpandedState$11);
  }
  
  public void ZW() {
    this.Zu.Zr();
  }
  
  public void Zm(Zzxp paramZzxp) {
    this.Zu.Zk(paramZzxp);
  }
  
  public void Zl(Zzxp paramZzxp) {
    this.Zu.ZG(paramZzxp);
  }
  
  public void ZP(Zzxp paramZzxp) {
    this.Zu.Zn(paramZzxp);
  }
  
  public void ZU(Zzxp paramZzxp) {
    this.Zu.ZL(paramZzxp);
  }
  
  public void Zd(Zzxp paramZzxp) {
    this.Zu.ZF(paramZzxp);
  }
  
  public void ZC(Zzxp paramZzxp) {
    this.Zu.ZA(paramZzxp);
  }
  
  public void Zy() {
    this.Zu.Zm();
  }
  
  public void ZY() {
    this.Zu.ZJ();
  }
  
  public void Zh() {
    this.Zu.ZA();
  }
  
  public List<Zt37> ZP(Zgu3 paramZgu3) {
    return this.ZN.getOrDefault(paramZgu3, Collections.emptyList());
  }
  
  public void ZI(Zxko paramZxko) {
    this.Zp.ZU(paramZxko);
  }
  
  public void Zp(Zxko paramZxko) {
    this.Zp.Zo(paramZxko);
  }
  
  public void ZH() {
    this.Zu.ZX();
  }
  
  public void Zj(int paramInt1, int paramInt2, String paramString) {
    if (this.Zy)
      return; 
    this.Zu.Zj(paramInt1, paramInt2, paramString);
  }
  
  public void ZO(int paramInt1, int paramInt2, String paramString) {
    if (this.Zy)
      return; 
    this.Zu.ZO(paramInt1, paramInt2, paramString);
  }
  
  public void Zz(int paramInt1, int paramInt2, String paramString) {
    if (this.Zy)
      return; 
    this.Zu.Zz(paramInt1, paramInt2, paramString);
  }
  
  public void Zr(boolean paramBoolean) {
    String[] arrayOfString = Zbds.Ze();
    if (paramBoolean) {
      ZHt();
      if (arrayOfString == null) {
        ZHR();
        return;
      } 
      return;
    } 
    ZHR();
  }
  
  public void ZI(Ztmh paramZtmh) {
    this.Zr = paramZtmh;
  }
  
  public void Zt() {
    ZHR();
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_COLLAPSE);
  }
  
  private void ZHt() {
    this.ZC = true;
    this.Zr.ZU(true);
  }
  
  private void ZHR() {
    this.ZC = false;
    this.Zr.ZU(false);
  }
  
  private void Zt(Zrpp paramZrpp) {
    this.Zr.Zg(paramZrpp);
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zu : Lburp/Zlcn;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield ZA : Lburp/Zbd0;
    //   9: invokevirtual ZI : ()Lburp/Ztcw;
    //   12: astore_2
    //   13: aload_0
    //   14: aload_1
    //   15: aload_2
    //   16: <illegal opcode> Zg : (Lburp/Zglf;Lburp/Zlcn;Lburp/Ztcw;)Lburp/Ztcw;
    //   21: areturn
  }
  
  public void ZU() {
    this.Zu = this.Zm.get();
    SwingUtilities.invokeLater(this::lambda$resetState$14);
  }
  
  private Zzwf ZHi() {
    return this.ZB;
  }
  
  private void lambda$resetState$14() {
    this.ZA.ZU();
    this.ZA.Zi();
  }
  
  private void lambda$checkpoint$13(Zlcn paramZlcn, Ztcw paramZtcw) {
    this.Zu = paramZlcn;
    this.Zy = true;
    this.ZA.Zi();
    paramZtcw.Zg();
    this.Zu.Zl();
    SwingUtilities.invokeLater(this::lambda$checkpoint$12);
  }
  
  private void lambda$checkpoint$12() {
    this.Zy = false;
  }
  
  private void lambda$updatePositionAndExpandedState$11() {
    Zrpp zrpp = this.ZP.ZW();
    Zt(zrpp);
    String[] arrayOfString = Zbds.Ze();
    if (this.ZP.Z_() == Zmsv.COLLAPSED) {
      if (this.ZC) {
        Zt();
        if (arrayOfString == null) {
          if (!this.ZC)
            this.Zr.ZG(); 
          return;
        } 
      } 
      return;
    } 
    if (!this.ZC)
      this.Zr.ZG(); 
  }
  
  private void lambda$new$10(Zkee paramZkee, Zsyj paramZsyj, AtomicInteger paramAtomicInteger, HierarchyEvent paramHierarchyEvent) {
    String[] arrayOfString = Zbds.Ze();
    if ((paramHierarchyEvent.getChangeFlags() & 0x4L) > 0L) {
      if (this.ZA.isShowing()) {
        paramZkee.Zl(paramZsyj);
        if (paramZkee.Zz(paramAtomicInteger.get())) {
          paramZsyj.Ze(paramZkee.ZG());
          if (arrayOfString == null) {
            paramZkee.ZF(paramZsyj);
            return;
          } 
        } 
        return;
      } 
    } else {
      return;
    } 
    paramZkee.ZF(paramZsyj);
  }
  
  private void lambda$new$9() {
    ZHu().ZO();
  }
  
  private Boolean lambda$new$7() {
    return Boolean.valueOf(ZHu().ZK());
  }
  
  private Boolean lambda$new$4() {
    return Boolean.valueOf(ZHu().Zi());
  }
  
  private Zg3q lambda$new$2() {
    return ZHu().ZR();
  }
  
  private Zlcn lambda$new$1(Zbnt paramZbnt, Zey9 paramZey9, ExecutorService paramExecutorService1, ExecutorService paramExecutorService2, ScheduledExecutorService paramScheduledExecutorService) {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicReference
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #6
    //   9: aload #6
    //   11: new burp/Zlcn
    //   14: dup
    //   15: new burp/Zbjm
    //   18: dup
    //   19: aload_0
    //   20: aload #6
    //   22: <illegal opcode> get : (Lburp/Zglf;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   27: aload_0
    //   28: <illegal opcode> get : (Lburp/Zglf;)Ljava/util/function/Supplier;
    //   33: invokespecial <init> : (Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V
    //   36: aload_1
    //   37: aload_2
    //   38: aload_3
    //   39: aload #4
    //   41: aload #5
    //   43: invokespecial <init> : (Lburp/Zzwf;Lburp/Zbnt;Lburp/Zey9;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V
    //   46: invokevirtual set : (Ljava/lang/Object;)V
    //   49: aload #6
    //   51: invokevirtual get : ()Ljava/lang/Object;
    //   54: checkcast burp/Zlcn
    //   57: areturn
  }
  
  private Boolean lambda$new$0(AtomicReference<Zlcn> paramAtomicReference) {
    return Boolean.valueOf((paramAtomicReference.get() == this.Zu));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zglf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */