package burp;

import java.time.Duration;
import java.util.concurrent.ScheduledExecutorService;
import net.portswigger.Zgl;
import net.portswigger.Zm2;

public class Zsy7 extends Zsyh {
  private final Zr5h Zm;
  
  private final Zz1i ZQ;
  
  private final Zk2p ZU;
  
  private final Zz1m<Zt1o> ZA;
  
  private final boolean Zf;
  
  private final Object Zh;
  
  private static final String a;
  
  Zsy7(Zr5h paramZr5h, Zk2p paramZk2p, ScheduledExecutorService paramScheduledExecutorService, Zz1m<Zt1o> paramZz1m, Zrgd paramZrgd, boolean paramBoolean) {
    super(paramZr5h, paramScheduledExecutorService, new Zzob(paramZr5h, paramZrgd));
    this.Zm = paramZr5h;
    this.ZQ = paramZr5h.Zdm();
    this.ZU = paramZk2p;
    this.ZA = paramZz1m;
    this.Zf = paramBoolean;
    this.Zh = new Object();
  }
  
  public Zsy7 Zp(Zlli<Zt13> paramZlli, Zlli<Zt1o> paramZlli1) {
    ZU(paramZlli);
    paramZlli1.ZE(Zt1o.Zv, this::lambda$subscribingTo$0);
    paramZlli1.ZE(Zt1o.Zx, this::lambda$subscribingTo$1);
    paramZlli1.ZE(Zt1o.ZH, this::lambda$subscribingTo$1);
    paramZlli1.ZE(Zt1o.ZS, this::lambda$subscribingTo$3);
    paramZlli1.ZE(Zt1o.ZG, this::lambda$subscribingTo$4);
    return this;
  }
  
  public void Ze() {
    synchronized (this.Zh) {
      int i = this.ZU.Zw();
      this.ZQ.Zq9(this.ZQ.ZH_() + i);
    } 
    ZH();
  }
  
  public void Zh(Zbza paramZbza) {
    synchronized (this.Zh) {
      int i = this.ZU.Zz(paramZbza);
      this.ZQ.Zq9(this.ZQ.ZH_() - i);
    } 
    ZD();
  }
  
  private void Zz(Ze6e paramZe6e) {
    this.ZA.ZD(new Zxr8(Zt1o.Ze, Zski.Zf(paramZe6e.ZO())));
  }
  
  public void ZK(Zl5x paramZl5x) {
    synchronized (this.Zh) {
      int i = this.ZU.Zk(paramZl5x);
      this.ZQ.Zqo(this.ZQ.ZH9() + i);
      ZA(i);
    } 
    ZD();
  }
  
  private void Zk(Zl5x paramZl5x) {
    synchronized (this.Zh) {
      int i = this.ZU.Zk(paramZl5x);
      this.ZQ.Zq9(this.ZQ.ZH_() + i);
    } 
    ZD();
  }
  
  private void ZH() {
    Zn();
  }
  
  private void Zu() {
    Zm();
    ZD();
    synchronized (this.Zh) {
      Duration duration = this.Zm.ZPB().minus(this.Zm.Zd2());
      if (!this.Zf)
        Zm2.Ze(new Zgl(this.Zm.ZPy()), Zv8r.AUDIT_DURATION, duration.toSeconds()); 
    } 
  }
  
  protected String Zk() {
    return a;
  }
  
  protected void ZD(Zlj9 paramZlj9) {
    this.ZA.ZD(new Zxr8(Zt1o.Zu, paramZlj9));
  }
  
  private void lambda$subscribingTo$4(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zk);
  }
  
  private void lambda$subscribingTo$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zz);
  }
  
  private void lambda$subscribingTo$1(Zxr8 paramZxr8) {
    Zu();
  }
  
  private void lambda$subscribingTo$0(Zxr8 paramZxr8) {
    ZH();
  }
  
  static {
    // Byte code:
    //   0: bipush #49
    //   2: ldc 'uOkAS'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsy7.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 103
    //   80: iconst_5
    //   81: goto -> 110
    //   84: bipush #11
    //   86: goto -> 110
    //   89: bipush #94
    //   91: goto -> 110
    //   94: bipush #51
    //   96: goto -> 110
    //   99: iconst_4
    //   100: goto -> 110
    //   103: bipush #94
    //   105: goto -> 110
    //   108: bipush #80
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsy7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */