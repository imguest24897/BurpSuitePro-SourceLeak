package burp;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zte implements ActionListener, Zm3g {
  private final Ze5r<Zk70, Zzp3> Zx;
  
  private final Zt_e Zz;
  
  private final Zz0n Zl;
  
  private final Zr_4 ZS;
  
  private final Zrag ZZ;
  
  private final Zskh ZF;
  
  private final Ztwv ZA;
  
  private final Zra1 ZB;
  
  private final Zly5 ZU;
  
  private static int[] ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zte(Zz0n paramZz0n, Zrag paramZrag, Zgb6 paramZgb6, Zskh paramZskh, Ztwv paramZtwv, Zr_4 paramZr_4, Zra1 paramZra1) {
    // Byte code:
    //   0: invokestatic Zj : ()[I
    //   3: astore #8
    //   5: aload_0
    //   6: invokespecial <init> : ()V
    //   9: aconst_null
    //   10: aload_3
    //   11: if_acmpeq -> 18
    //   14: iconst_1
    //   15: goto -> 19
    //   18: iconst_0
    //   19: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   22: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   25: aconst_null
    //   26: aload_2
    //   27: if_acmpeq -> 34
    //   30: iconst_1
    //   31: goto -> 35
    //   34: iconst_0
    //   35: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   38: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   41: aconst_null
    //   42: aload #4
    //   44: if_acmpeq -> 51
    //   47: iconst_1
    //   48: goto -> 52
    //   51: iconst_0
    //   52: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   55: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   58: aconst_null
    //   59: aload #6
    //   61: if_acmpeq -> 68
    //   64: iconst_1
    //   65: goto -> 69
    //   68: iconst_0
    //   69: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   72: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   75: aload_0
    //   76: aload_1
    //   77: putfield Zl : Lburp/Zz0n;
    //   80: aload_0
    //   81: aload_2
    //   82: putfield ZZ : Lburp/Zrag;
    //   85: aload_0
    //   86: aload #4
    //   88: putfield ZF : Lburp/Zskh;
    //   91: aload_0
    //   92: aload #5
    //   94: putfield ZA : Lburp/Ztwv;
    //   97: aload_0
    //   98: aload #6
    //   100: putfield ZS : Lburp/Zr_4;
    //   103: aload_0
    //   104: aload #7
    //   106: putfield ZB : Lburp/Zra1;
    //   109: aload_3
    //   110: aload_0
    //   111: invokeinterface Zd : (Lburp/Zm3g;)V
    //   116: aload_3
    //   117: invokeinterface Zfx : ()Lburp/Zefg;
    //   122: astore #9
    //   124: aload #7
    //   126: getstatic burp/Zra1.EXECUTION_MODE_DESKTOP : Lburp/Zra1;
    //   129: if_acmpeq -> 144
    //   132: aload #9
    //   134: invokeinterface clear : ()V
    //   139: aload #8
    //   141: ifnonnull -> 157
    //   144: aload #9
    //   146: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   151: invokeinterface removeIf : (Ljava/util/function/Predicate;)Z
    //   156: pop
    //   157: aload #9
    //   159: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   164: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   169: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   174: invokestatic toList : ()Ljava/util/stream/Collector;
    //   177: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   182: checkcast java/util/List
    //   185: astore #10
    //   187: aload_0
    //   188: new burp/Ze5r
    //   191: dup
    //   192: aload #10
    //   194: aload #9
    //   196: invokespecial <init> : (Ljava/util/List;Lburp/Zefg;)V
    //   199: putfield Zx : Lburp/Ze5r;
    //   202: aload_0
    //   203: new burp/Zt_e
    //   206: dup
    //   207: aload_0
    //   208: getfield Zx : Lburp/Ze5r;
    //   211: invokespecial <init> : (Lburp/Ze5r;)V
    //   214: putfield Zz : Lburp/Zt_e;
    //   217: aload #7
    //   219: getstatic burp/Zra1.EXECUTION_MODE_DESKTOP : Lburp/Zra1;
    //   222: if_acmpne -> 282
    //   225: invokestatic getInstance : ()Ljava/util/Calendar;
    //   228: astore #11
    //   230: iconst_0
    //   231: sipush #1000
    //   234: bipush #60
    //   236: aload #11
    //   238: bipush #13
    //   240: invokevirtual get : (I)I
    //   243: isub
    //   244: imul
    //   245: aload #11
    //   247: bipush #14
    //   249: invokevirtual get : (I)I
    //   252: isub
    //   253: invokestatic max : (II)I
    //   256: istore #12
    //   258: new javax/swing/Timer
    //   261: dup
    //   262: iload #12
    //   264: aload_0
    //   265: invokespecial <init> : (ILjava/awt/event/ActionListener;)V
    //   268: astore #13
    //   270: aload #13
    //   272: ldc 60000
    //   274: invokevirtual setDelay : (I)V
    //   277: aload #13
    //   279: invokevirtual start : ()V
    //   282: aload_0
    //   283: new burp/Zly5
    //   286: dup
    //   287: invokespecial <init> : ()V
    //   290: putfield ZU : Lburp/Zly5;
    //   293: invokestatic Zwu : ()[Lburp/Zbqc;
    //   296: ifnonnull -> 305
    //   299: iconst_1
    //   300: newarray int
    //   302: invokestatic Zh : ([I)V
    //   305: return
  }
  
  public void ZS(Window paramWindow, Zlit paramZlit) {
    Zm2.ZC(Zrrh.SUITE_TOOLS_SCHEDULE_TASK);
    Zk70 zk70 = new Zk70(Zm(), (byte)0, 0, (byte)7, (paramZlit == null) ? "" : paramZlit.toString(), false, (byte)0, this.ZS);
    new Zmps(paramWindow, this, zk70);
  }
  
  static long Zm() {
    Calendar calendar = Calendar.getInstance();
    return calendar.getTimeInMillis() + Math.max(0, 1000 * (60 - calendar.get(13)) - calendar.get(14));
  }
  
  void Zj(Zk70 paramZk70) {
    ZZ(paramZk70);
  }
  
  public void Zd(int paramInt) {
    try {
      synchronized (this.Zx.ZB()) {
        this.Zx.Zf(paramInt);
        this.Zz.fireTableRowsDeleted(paramInt, paramInt);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void Zm(Window paramWindow, int paramInt) {
    try {
      new Zmps(paramWindow, this, this.Zx.ZV(paramInt));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public Ztn0 Zs() {
    return this.Zz;
  }
  
  private void ZZ(Zk70 paramZk70) {
    synchronized (this.Zx.ZB()) {
      int i = this.Zx.Zo(paramZk70);
      if (i >= 0) {
        this.Zx.Zf(i);
        this.Zz.fireTableRowsDeleted(i, i);
      } 
      int j = this.Zx.ZD(paramZk70, this.ZU);
      this.Zz.fireTableRowsInserted(j, j);
    } 
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic currentTimeMillis : ()J
    //   3: ldc2_w 30000
    //   6: ladd
    //   7: lstore_3
    //   8: invokestatic Zj : ()[I
    //   11: aload_0
    //   12: getfield Zx : Lburp/Ze5r;
    //   15: invokevirtual ZB : ()Ljava/lang/Object;
    //   18: dup
    //   19: astore #5
    //   21: monitorenter
    //   22: astore_2
    //   23: new java/util/ArrayList
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: astore #6
    //   32: aload_0
    //   33: getfield Zx : Lburp/Ze5r;
    //   36: invokevirtual iterator : ()Ljava/util/Iterator;
    //   39: astore #7
    //   41: aload #7
    //   43: invokeinterface hasNext : ()Z
    //   48: ifeq -> 171
    //   51: aload #7
    //   53: invokeinterface next : ()Ljava/lang/Object;
    //   58: checkcast burp/Zk70
    //   61: astore #8
    //   63: aload #8
    //   65: invokevirtual Zx : ()B
    //   68: ifeq -> 75
    //   71: aload_2
    //   72: ifnonnull -> 41
    //   75: aload #8
    //   77: invokevirtual ZG : ()J
    //   80: lload_3
    //   81: lcmp
    //   82: ifle -> 89
    //   85: aload_2
    //   86: ifnonnull -> 41
    //   89: aload_0
    //   90: aload #8
    //   92: invokevirtual ZG : (Lburp/Zk70;)V
    //   95: aload #8
    //   97: getfield ZA : J
    //   100: lconst_0
    //   101: lcmp
    //   102: ifle -> 126
    //   105: aload #6
    //   107: aload #8
    //   109: invokeinterface add : (Ljava/lang/Object;)Z
    //   114: pop
    //   115: aload_2
    //   116: ifnonnull -> 154
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   125: athrow
    //   126: aload #8
    //   128: iconst_1
    //   129: invokevirtual ZE : (B)V
    //   132: aload_0
    //   133: getfield Zx : Lburp/Ze5r;
    //   136: aload #8
    //   138: invokevirtual Zo : (Lburp/Zgd8;)I
    //   141: istore #9
    //   143: aload_0
    //   144: getfield Zz : Lburp/Zt_e;
    //   147: iload #9
    //   149: iload #9
    //   151: invokevirtual fireTableRowsUpdated : (II)V
    //   154: goto -> 167
    //   157: astore #9
    //   159: aload #9
    //   161: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   164: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   167: aload_2
    //   168: ifnonnull -> 41
    //   171: aload #6
    //   173: invokeinterface iterator : ()Ljava/util/Iterator;
    //   178: astore #7
    //   180: aload #7
    //   182: invokeinterface hasNext : ()Z
    //   187: ifeq -> 228
    //   190: aload #7
    //   192: invokeinterface next : ()Ljava/lang/Object;
    //   197: checkcast burp/Zk70
    //   200: astore #8
    //   202: aload #8
    //   204: aload #8
    //   206: invokevirtual ZG : ()J
    //   209: aload #8
    //   211: getfield ZA : J
    //   214: ladd
    //   215: invokevirtual Zq : (J)V
    //   218: aload_0
    //   219: aload #8
    //   221: invokevirtual ZZ : (Lburp/Zk70;)V
    //   224: aload_2
    //   225: ifnonnull -> 180
    //   228: aload #5
    //   230: monitorexit
    //   231: goto -> 242
    //   234: astore #10
    //   236: aload #5
    //   238: monitorexit
    //   239: aload #10
    //   241: athrow
    //   242: return
    // Exception table:
    //   from	to	target	type
    //   23	231	234	finally
    //   63	71	157	java/lang/Exception
    //   75	85	157	java/lang/Exception
    //   89	119	122	java/lang/Exception
    //   89	154	157	java/lang/Exception
    //   234	239	234	finally
  }
  
  private void ZG(Zk70 paramZk70) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZA : Lburp/Ztwv;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> run : (Lburp/Zte;Lburp/Zk70;)Ljava/lang/Runnable;
    //   11: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   16: pop
    //   17: return
  }
  
  private void Zg(List<Zk70> paramList) {
    // Byte code:
    //   0: invokestatic Zj : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zx : Lburp/Ze5r;
    //   8: invokevirtual ZB : ()Ljava/lang/Object;
    //   11: dup
    //   12: astore_3
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield Zl : Lburp/Zz0n;
    //   18: invokeinterface ZP : ()Lburp/Zrgd;
    //   23: invokevirtual ZX : ()J
    //   26: lstore #4
    //   28: aload_0
    //   29: getfield Zx : Lburp/Ze5r;
    //   32: invokevirtual ZF : ()V
    //   35: aload_1
    //   36: invokeinterface iterator : ()Ljava/util/Iterator;
    //   41: astore #6
    //   43: aload #6
    //   45: invokeinterface hasNext : ()Z
    //   50: ifeq -> 163
    //   53: aload #6
    //   55: invokeinterface next : ()Ljava/lang/Object;
    //   60: checkcast burp/Zk70
    //   63: astore #7
    //   65: aload #7
    //   67: ifnull -> 159
    //   70: getstatic burp/Zk70.Zk : Ljava/util/Set;
    //   73: aload #7
    //   75: invokevirtual Zf : ()B
    //   78: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   81: invokeinterface contains : (Ljava/lang/Object;)Z
    //   86: ifne -> 159
    //   89: aload #7
    //   91: invokevirtual Zx : ()B
    //   94: ifne -> 145
    //   97: aload #7
    //   99: invokevirtual ZG : ()J
    //   102: lload #4
    //   104: lcmp
    //   105: ifge -> 145
    //   108: aload #7
    //   110: getfield ZA : J
    //   113: lconst_0
    //   114: lcmp
    //   115: ifne -> 128
    //   118: aload #7
    //   120: iconst_2
    //   121: invokevirtual ZE : (B)V
    //   124: aload_2
    //   125: ifnonnull -> 145
    //   128: aload #7
    //   130: getfield ZA : J
    //   133: lconst_0
    //   134: lcmp
    //   135: ifle -> 145
    //   138: aload #7
    //   140: lload #4
    //   142: invokevirtual ZP : (J)V
    //   145: aload_0
    //   146: getfield Zx : Lburp/Ze5r;
    //   149: aload #7
    //   151: aload_0
    //   152: getfield ZU : Lburp/Zly5;
    //   155: invokevirtual ZD : (Lburp/Zgd8;Ljava/util/Comparator;)I
    //   158: pop
    //   159: aload_2
    //   160: ifnonnull -> 43
    //   163: aload_3
    //   164: monitorexit
    //   165: goto -> 175
    //   168: astore #8
    //   170: aload_3
    //   171: monitorexit
    //   172: aload #8
    //   174: athrow
    //   175: return
    // Exception table:
    //   from	to	target	type
    //   14	165	168	finally
    //   168	172	168	finally
  }
  
  public void Zd(Zmf_ paramZmf_) {
    if (this.ZB == Zra1.EXECUTION_MODE_DESKTOP) {
      List<?> list = paramZmf_.Zs(a(-23526, 1223), new Zzzc(this));
      if (list != null)
        Zg((List)list); 
    } 
  }
  
  public void Zl(Zg4j paramZg4j) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #-23525
    //   4: sipush #-29289
    //   7: invokestatic a : (II)Ljava/lang/String;
    //   10: invokeinterface ZP : (Ljava/lang/String;)Lburp/Zzqw;
    //   15: astore_3
    //   16: invokestatic Zj : ()[I
    //   19: aload_0
    //   20: getfield Zx : Lburp/Ze5r;
    //   23: invokevirtual ZB : ()Ljava/lang/Object;
    //   26: dup
    //   27: astore #4
    //   29: monitorenter
    //   30: astore_2
    //   31: aload_0
    //   32: getfield Zx : Lburp/Ze5r;
    //   35: invokevirtual iterator : ()Ljava/util/Iterator;
    //   38: astore #5
    //   40: aload #5
    //   42: invokeinterface hasNext : ()Z
    //   47: ifeq -> 83
    //   50: aload #5
    //   52: invokeinterface next : ()Ljava/lang/Object;
    //   57: checkcast burp/Zk70
    //   60: astore #6
    //   62: aload #6
    //   64: invokevirtual Zx : ()B
    //   67: ifne -> 79
    //   70: aload_3
    //   71: aload #6
    //   73: invokevirtual ZM : ()Lburp/Zlwx;
    //   76: invokevirtual Zx : (Lburp/Zlwx;)V
    //   79: aload_2
    //   80: ifnonnull -> 40
    //   83: aload #4
    //   85: monitorexit
    //   86: goto -> 97
    //   89: astore #7
    //   91: aload #4
    //   93: monitorexit
    //   94: aload #7
    //   96: athrow
    //   97: return
    // Exception table:
    //   from	to	target	type
    //   31	86	89	finally
    //   89	94	89	finally
  }
  
  private void lambda$performUserTask$1(Zk70 paramZk70) {
    // Byte code:
    //   0: invokestatic Zj : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual Zf : ()B
    //   8: tableswitch default -> 107, 0 -> 60, 1 -> 60, 2 -> 60, 3 -> 60, 4 -> 60, 5 -> 60, 6 -> 60, 7 -> 71, 8 -> 89
    //   60: aload_2
    //   61: ifnonnull -> 126
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   70: athrow
    //   71: aload_0
    //   72: getfield ZZ : Lburp/Zrag;
    //   75: invokevirtual ZO : ()V
    //   78: aload_2
    //   79: ifnonnull -> 126
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   88: athrow
    //   89: aload_0
    //   90: getfield ZZ : Lburp/Zrag;
    //   93: invokevirtual ZR : ()V
    //   96: aload_2
    //   97: ifnonnull -> 126
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   106: athrow
    //   107: iconst_0
    //   108: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   111: aload_1
    //   112: invokevirtual Zf : ()B
    //   115: i2l
    //   116: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   125: athrow
    //   126: getstatic burp/Zmgc.SCHEDULED_TASK : Lburp/Zmgc;
    //   129: aload_0
    //   130: getfield ZF : Lburp/Zskh;
    //   133: invokeinterface Zz : ()Lburp/Zskh;
    //   138: iconst_1
    //   139: anewarray java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: aload_1
    //   145: invokevirtual ZX : ()Ljava/lang/String;
    //   148: aastore
    //   149: invokevirtual ZK : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   152: pop
    //   153: goto -> 198
    //   156: astore_3
    //   157: aload_3
    //   158: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   161: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   164: getstatic burp/Zmgc.ERROR_IN_SCHEDULED_TASK : Lburp/Zmgc;
    //   167: aload_0
    //   168: getfield ZF : Lburp/Zskh;
    //   171: invokeinterface Zz : ()Lburp/Zskh;
    //   176: iconst_2
    //   177: anewarray java/lang/Object
    //   180: dup
    //   181: iconst_0
    //   182: aload_1
    //   183: invokevirtual ZX : ()Ljava/lang/String;
    //   186: aastore
    //   187: dup
    //   188: iconst_1
    //   189: aload_3
    //   190: invokevirtual getMessage : ()Ljava/lang/String;
    //   193: aastore
    //   194: invokevirtual ZV : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   197: pop
    //   198: return
    // Exception table:
    //   from	to	target	type
    //   4	64	67	java/lang/Throwable
    //   4	153	156	java/lang/Throwable
    //   60	82	85	java/lang/Throwable
    //   71	100	103	java/lang/Throwable
    //   89	119	122	java/lang/Throwable
  }
  
  private static boolean lambda$new$0(Zzp3 paramZzp3) {
    return Zk70.Zk.contains(Byte.valueOf(paramZzp3.Zog()));
  }
  
  public static void Zh(int[] paramArrayOfint) {
    ZY = paramArrayOfint;
  }
  
  public static int[] Zj() {
    return ZY;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_5
    //   7: newarray int
    //   9: iconst_0
    //   10: istore_3
    //   11: invokestatic Zh : ([I)V
    //   14: ldc 'Àçb<ç!=É~ãe´å\SH&´î©\\f$Óî;9ÝKú±­*GvOqðp?Ô&±9üÈ\UÚS#M:5ëç«¢É8x÷á`'
    //   16: dup
    //   17: astore_2
    //   18: invokevirtual length : ()I
    //   21: istore #4
    //   23: bipush #42
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #65
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 88
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: aload #5
    //   75: putstatic burp/Zte.a : [Ljava/lang/String;
    //   78: iconst_2
    //   79: anewarray java/lang/String
    //   82: putstatic burp/Zte.b : [Ljava/lang/String;
    //   85: goto -> 231
    //   88: dup_x2
    //   89: pop
    //   90: invokevirtual toCharArray : ()[C
    //   93: dup_x1
    //   94: arraylength
    //   95: dup_x2
    //   96: pop
    //   97: iconst_0
    //   98: istore #6
    //   100: dup2_x1
    //   101: pop2
    //   102: dup_x2
    //   103: iconst_1
    //   104: if_icmpgt -> 204
    //   107: dup2
    //   108: swap
    //   109: iload #6
    //   111: dup2_x1
    //   112: caload
    //   113: swap
    //   114: iload #6
    //   116: bipush #7
    //   118: irem
    //   119: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #120
    //   158: goto -> 188
    //   161: bipush #63
    //   163: goto -> 188
    //   166: bipush #99
    //   168: goto -> 188
    //   171: bipush #69
    //   173: goto -> 188
    //   176: bipush #124
    //   178: goto -> 188
    //   181: bipush #9
    //   183: goto -> 188
    //   186: bipush #22
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 111
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 107
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 45
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA41B) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 12;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zte.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */