package burp;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class Zem3 extends TimerTask {
  private static final long Zs;
  
  private static final long ZK;
  
  private final Zz49 ZT;
  
  private final Zth4 ZB;
  
  private final Timer Zd;
  
  private static final String a;
  
  public Zem3(Zz49 paramZz49, Zth4 paramZth4) {
    this.ZT = paramZz49;
    this.ZB = paramZth4;
    this.Zd = new Timer(a);
  }
  
  public void run() {
    long l = (new Date()).getTime();
    this.ZT.Zb(l::lambda$run$0);
    this.ZB.Zz();
  }
  
  public void Zs() {
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    gregorianCalendar.setTime(new Date());
    gregorianCalendar.set(11, 23);
    int[] arrayOfInt = Zee7.Zb();
    gregorianCalendar.set(12, 59);
    gregorianCalendar.set(13, 59);
    this.Zd.scheduleAtFixedRate(this, gregorianCalendar.getTime(), Zs);
    if (Zbqc.Zwu() == null)
      Zee7.Zw(new int[2]); 
  }
  
  public boolean cancel() {
    this.Zd.cancel();
    return super.cancel();
  }
  
  private static boolean lambda$run$0(long paramLong, Zer0 paramZer0) {
    return (paramZer0.Zn() <= paramLong - ZK);
  }
  
  static {
    // Byte code:
    //   0: bipush #33
    //   2: ldc 'Ar<o^P|$\\f\\rN]G|>'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zem3.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_3
    //   81: goto -> 111
    //   84: bipush #60
    //   86: goto -> 111
    //   89: bipush #113
    //   91: goto -> 111
    //   94: bipush #66
    //   96: goto -> 111
    //   99: bipush #94
    //   101: goto -> 111
    //   104: bipush #44
    //   106: goto -> 111
    //   109: bipush #16
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: lconst_1
    //   154: invokestatic ofDays : (J)Ljava/time/Duration;
    //   157: invokevirtual toMillis : ()J
    //   160: putstatic burp/Zem3.Zs : J
    //   163: ldc2_w 14
    //   166: invokestatic ofDays : (J)Ljava/time/Duration;
    //   169: invokevirtual toMillis : ()J
    //   172: putstatic burp/Zem3.ZK : J
    //   175: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zem3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */