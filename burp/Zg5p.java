package burp;

import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;
import java.util.List;
import net.portswigger.Zsy;

public class Zg5p extends Zg54 {
  private static final Duration ZC;
  
  private final Zsy ZP;
  
  private final Zspe ZZ;
  
  private final Zrqh ZY;
  
  private static final String c;
  
  Zg5p(Zmzk paramZmzk, Ztwv paramZtwv, Ztf5 paramZtf5, Zl6g paramZl6g, Zgz4 paramZgz4, Ztv4 paramZtv4, Ze6i paramZe6i, Ztjd paramZtjd, OutputStream paramOutputStream, Zbfh paramZbfh, long paramLong1, Zlm7 paramZlm7, Zx86 paramZx86, Zmi4 paramZmi4, long paramLong2, int paramInt, Zl7q paramZl7q, Zlfd paramZlfd, Zsy paramZsy) {
    super(paramZmzk, paramZtwv, paramZtf5, paramZl6g, paramZgz4, paramZtv4, paramZe6i, paramZtjd, paramOutputStream, paramZbfh, paramLong1, paramZlm7, paramZx86, paramZmi4, paramLong2, paramInt);
    this.ZP = paramZsy;
    this.ZZ = paramZlfd.Z_(paramZl7q, paramInt);
    this.ZY = new Zrqh(paramZl7q.Zs(), paramZl7q.ZE(), paramZx86, paramZtjd, paramZsy);
  }
  
  public void ZN() throws IOException {
    super.ZN();
    this.Za.ZE(new Zsi(this.ZP.ZU().Zz(8)));
    Zsk5.Ze(ZC);
  }
  
  public Zzvv Zm(Zefx paramZefx, boolean paramBoolean, Ztuf paramZtuf, int paramInt) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : Lburp/Zx86;
    //   4: dup
    //   5: astore #6
    //   7: monitorenter
    //   8: aload_0
    //   9: getfield Zc : Lburp/Zgz4;
    //   12: invokevirtual ZU : ()Z
    //   15: ifeq -> 26
    //   18: new burp/Zsl_
    //   21: dup
    //   22: invokespecial <init> : ()V
    //   25: athrow
    //   26: aload_0
    //   27: getfield ZE : Lburp/Zbfh;
    //   30: aload_3
    //   31: invokevirtual Z_ : (Lburp/Ztuf;)Lburp/Zzvv;
    //   34: astore #5
    //   36: aload_0
    //   37: getfield ZH : Lburp/Ze6i;
    //   40: aload #5
    //   42: invokeinterface ZS : ()I
    //   47: aload_1
    //   48: iload_2
    //   49: invokeinterface Zm : (ILburp/Zefx;Z)Ljava/util/List;
    //   54: astore #7
    //   56: aload #7
    //   58: iconst_0
    //   59: aload #7
    //   61: invokeinterface size : ()I
    //   66: iconst_1
    //   67: isub
    //   68: invokeinterface subList : (II)Ljava/util/List;
    //   73: astore #8
    //   75: aload #7
    //   77: aload #7
    //   79: invokeinterface size : ()I
    //   84: iconst_1
    //   85: isub
    //   86: aload #7
    //   88: invokeinterface size : ()I
    //   93: invokeinterface subList : (II)Ljava/util/List;
    //   98: astore #9
    //   100: aload_0
    //   101: getfield ZY : Lburp/Zrqh;
    //   104: aload #5
    //   106: aload #8
    //   108: <illegal opcode> run : (Lburp/Zzvv;Ljava/util/List;)Ljava/lang/Runnable;
    //   113: aload #5
    //   115: aload #9
    //   117: <illegal opcode> run : (Lburp/Zzvv;Ljava/util/List;)Ljava/lang/Runnable;
    //   122: invokevirtual ZG : (Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    //   125: aload #6
    //   127: monitorexit
    //   128: goto -> 139
    //   131: astore #10
    //   133: aload #6
    //   135: monitorexit
    //   136: aload #10
    //   138: athrow
    //   139: aload_0
    //   140: getfield ZZ : Lburp/Zspe;
    //   143: invokeinterface ZL : ()V
    //   148: goto -> 174
    //   151: astore #6
    //   153: aload #6
    //   155: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   158: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   161: new java/io/IOException
    //   164: dup
    //   165: getstatic burp/Zg5p.c : Ljava/lang/String;
    //   168: aload #6
    //   170: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   173: athrow
    //   174: aload #5
    //   176: areturn
    // Exception table:
    //   from	to	target	type
    //   8	128	131	finally
    //   131	136	131	finally
    //   139	148	151	burp/Zs92
  }
  
  private static void lambda$createOpenStream$0(Zzvv paramZzvv, List<Zsp> paramList) {
    paramZzvv.ZB(paramList);
  }
  
  static {
    // Byte code:
    //   0: bipush #75
    //   2: ldc '@ayqKv;a}lRv$U3kdIp?S|vt]r#H|v=Ar>Mv|'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zg5p.c : Ljava/lang/String;
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
    //   80: bipush #28
    //   82: goto -> 112
    //   85: bipush #106
    //   87: goto -> 112
    //   90: bipush #88
    //   92: goto -> 112
    //   95: bipush #83
    //   97: goto -> 112
    //   100: bipush #86
    //   102: goto -> 112
    //   105: bipush #108
    //   107: goto -> 112
    //   110: bipush #88
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
    //   154: ldc2_w 10
    //   157: getstatic java/time/temporal/ChronoUnit.MILLIS : Ljava/time/temporal/ChronoUnit;
    //   160: invokestatic of : (JLjava/time/temporal/TemporalUnit;)Ljava/time/Duration;
    //   163: putstatic burp/Zg5p.ZC : Ljava/time/Duration;
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg5p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */