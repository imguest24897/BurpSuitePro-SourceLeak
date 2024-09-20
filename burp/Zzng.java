package burp;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzng implements Ztu3 {
  private final Ztwv Zf;
  
  private final Supplier<String> ZB;
  
  private final AtomicInteger Zv;
  
  private final AtomicBoolean ZQ;
  
  private Zgrn ZR;
  
  private ScheduledFuture<?> Zb;
  
  private static final String a;
  
  public Zzng(Ztwv paramZtwv, Supplier<String> paramSupplier) {
    this.Zf = paramZtwv;
    this.ZB = paramSupplier;
    this.Zv = new AtomicInteger();
    this.ZQ = new AtomicBoolean();
  }
  
  public void ZY() {
    if (this.ZR != null)
      this.ZR.ZZ(); 
    if (this.Zb != null)
      this.Zb.cancel(true); 
  }
  
  public void ZP(Zlli<Zt11> paramZlli) {
    this.ZR = paramZlli.ZE(Zt11.ZD, this::lambda$subscribeTo$0);
  }
  
  private void ZL(Ztj1 paramZtj1) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Zl : ()Lburp/Zkcl;
    //   4: getstatic burp/Zkcl.SCAN_CRAWL_AND_AUDIT : Lburp/Zkcl;
    //   7: if_acmpne -> 149
    //   10: aload_0
    //   11: getfield Zb : Ljava/util/concurrent/ScheduledFuture;
    //   14: ifnull -> 25
    //   17: iconst_0
    //   18: getstatic net/portswigger/Zqf.Zs : Lnet/portswigger/Zqf;
    //   21: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   24: return
    //   25: aload_1
    //   26: invokevirtual Zi : ()Lburp/Zrbm;
    //   29: checkcast burp/Zxn8
    //   32: astore_2
    //   33: aload_2
    //   34: invokevirtual Z_ : ()Lburp/Zezo;
    //   37: invokevirtual ZV : ()Lburp/Ztos;
    //   40: astore_3
    //   41: aload_2
    //   42: invokevirtual ZH : ()Lburp/Zriy;
    //   45: invokevirtual ZO : ()Lburp/Ztos;
    //   48: astore #4
    //   50: aload_1
    //   51: invokevirtual Zr : ()Lburp/Ztos;
    //   54: astore #5
    //   56: aload_0
    //   57: aload_0
    //   58: getfield Zf : Lburp/Ztwv;
    //   61: invokeinterface Ze : ()Ljava/util/concurrent/ScheduledExecutorService;
    //   66: aload_0
    //   67: aload_1
    //   68: <illegal opcode> run : (Lburp/Zzng;Lburp/Ztj1;)Ljava/lang/Runnable;
    //   73: ldc2_w 10
    //   76: ldc2_w 10
    //   79: getstatic java/util/concurrent/TimeUnit.MINUTES : Ljava/util/concurrent/TimeUnit;
    //   82: invokeinterface scheduleAtFixedRate : (Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   87: putfield Zb : Ljava/util/concurrent/ScheduledFuture;
    //   90: invokestatic Zr : ()Lburp/Zts2;
    //   93: aload_3
    //   94: getstatic burp/Zt18.ZS : Lburp/Zlnb;
    //   97: aload_0
    //   98: <illegal opcode> accept : (Lburp/Zzng;)Ljava/util/function/Consumer;
    //   103: invokevirtual Zz : (Lburp/Zlli;Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zts2;
    //   106: aload #4
    //   108: getstatic burp/Zt1o.ZH : Lburp/Zlnb;
    //   111: aload_0
    //   112: <illegal opcode> accept : (Lburp/Zzng;)Ljava/util/function/Consumer;
    //   117: invokevirtual Zv : (Lburp/Zlli;Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zts2;
    //   120: aload #4
    //   122: getstatic burp/Zt1o.Zx : Lburp/Zlnb;
    //   125: aload_0
    //   126: <illegal opcode> accept : (Lburp/Zzng;)Ljava/util/function/Consumer;
    //   131: invokevirtual Zv : (Lburp/Zlli;Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zts2;
    //   134: aload #5
    //   136: getstatic burp/Zt13.Zd : Lburp/Zlnb;
    //   139: aload_0
    //   140: <illegal opcode> accept : (Lburp/Zzng;)Ljava/util/function/Consumer;
    //   145: invokevirtual Zv : (Lburp/Zlli;Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zts2;
    //   148: pop
    //   149: return
  }
  
  private void lambda$monitorRequestsFor$2(Zxr8 paramZxr8) {
    this.Zb.cancel(false);
  }
  
  private void lambda$monitorRequestsFor$1(Ztj1 paramZtj1) {
    Zen5 zen5 = paramZtj1.ZY().get();
    int i = zen5.Zd();
    Zbqc[] arrayOfZbqc = Zz9t.Zh();
    if (i <= this.Zv.get() && !this.ZQ.getAndSet(true)) {
      Zuh.Zb((i == this.Zv.get()), Zqf.Zr);
      System.out.printf(a, new Object[] { Integer.valueOf(10) });
      System.out.println(this.ZB.get());
      if (arrayOfZbqc == null) {
        this.ZQ.set(false);
        this.Zv.set(i);
        return;
      } 
      return;
    } 
    this.ZQ.set(false);
    this.Zv.set(i);
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZL);
  }
  
  static {
    // Byte code:
    //   0: bipush #118
    //   2: ldc 'a0$\\b*ZXX}!F=Og65z(=Da*@\\tN)I5TG|-[lY@i#[I@k75ra0,F'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzng.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #58
    //   82: goto -> 112
    //   85: bipush #107
    //   87: goto -> 112
    //   90: bipush #127
    //   92: goto -> 112
    //   95: bipush #94
    //   97: goto -> 112
    //   100: bipush #18
    //   102: goto -> 112
    //   105: bipush #99
    //   107: goto -> 112
    //   110: bipush #41
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzng.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */