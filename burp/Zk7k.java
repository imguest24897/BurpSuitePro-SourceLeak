package burp;

import java.awt.Window;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zk7k implements Zeg4 {
  private final Ztg8 Zn;
  
  private final BiConsumer<Zm0l, Zgna> Zd;
  
  private final Zzys Zo;
  
  private final Ztwv ZE;
  
  private final Supplier<Ztj1> ZN;
  
  private final Zrqq Zk;
  
  private final Zm0l ZH;
  
  private final Window ZZ;
  
  private final Zxwj ZA;
  
  private final Zggy Zv;
  
  private final AtomicBoolean ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zk7k(Ztg8 paramZtg8, BiConsumer<Zm0l, Zgna> paramBiConsumer, Zzys paramZzys, Ztwv paramZtwv, Supplier<Ztj1> paramSupplier, Zrqq paramZrqq, Zm0l paramZm0l, Window paramWindow, Zxwj paramZxwj, Zggy paramZggy, AtomicBoolean paramAtomicBoolean) {
    this.Zn = paramZtg8;
    int i = Zeql.ZV();
    try {
      this.Zd = paramBiConsumer;
      this.Zo = paramZzys;
      this.ZE = paramZtwv;
      this.ZN = paramSupplier;
      this.Zk = paramZrqq;
      this.ZH = paramZm0l;
      this.ZZ = paramWindow;
      this.ZA = paramZxwj;
      this.Zv = paramZggy;
      this.ZL = paramAtomicBoolean;
      if (i == 0)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (CancellationException cancellationException) {
      throw a(null);
    } 
  }
  
  public Future<?> ZF(Runnable paramRunnable1, Runnable paramRunnable2, Zssw paramZssw) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZE : Lburp/Ztwv;
    //   4: aload_0
    //   5: aload_1
    //   6: aload_2
    //   7: aload_3
    //   8: <illegal opcode> run : (Lburp/Zk7k;Ljava/lang/Runnable;Ljava/lang/Runnable;Lburp/Zssw;)Ljava/lang/Runnable;
    //   13: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   18: areturn
  }
  
  private void ZJ(Runnable paramRunnable1, Runnable paramRunnable2, Zssw paramZssw) {
    boolean bool;
    do {
      bool = ZH(paramRunnable1, paramRunnable2, paramZssw);
    } while (bool);
  }
  
  private boolean ZH(Runnable paramRunnable1, Runnable paramRunnable2, Zssw paramZssw) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : Lburp/Zggy;
    //   4: aload_0
    //   5: getfield ZZ : Ljava/awt/Window;
    //   8: aload_0
    //   9: <illegal opcode> run : (Lburp/Zk7k;)Ljava/lang/Runnable;
    //   14: invokeinterface ZC : (Ljava/awt/Window;Ljava/lang/Runnable;)Lburp/Ztrd;
    //   19: astore #4
    //   21: aload_0
    //   22: getfield ZE : Lburp/Ztwv;
    //   25: aload_0
    //   26: aload #4
    //   28: aload_3
    //   29: aload_2
    //   30: <illegal opcode> call : (Lburp/Zk7k;Lburp/Ztrd;Lburp/Zssw;Ljava/lang/Runnable;)Ljava/util/concurrent/Callable;
    //   35: sipush #-25222
    //   38: sipush #22526
    //   41: invokestatic a : (II)Ljava/lang/String;
    //   44: invokeinterface ZA : (Ljava/util/concurrent/Callable;Ljava/lang/String;)Ljava/util/concurrent/Future;
    //   49: astore #5
    //   51: iconst_0
    //   52: istore #6
    //   54: invokestatic now : ()Ljava/time/Instant;
    //   57: astore #7
    //   59: aload #5
    //   61: invokeinterface get : ()Ljava/lang/Object;
    //   66: checkcast java/lang/Boolean
    //   69: invokevirtual booleanValue : ()Z
    //   72: istore #6
    //   74: invokestatic now : ()Ljava/time/Instant;
    //   77: astore #8
    //   79: aload_1
    //   80: invokeinterface run : ()V
    //   85: aload_0
    //   86: aload #7
    //   88: aload #8
    //   90: invokevirtual Zv : (Ljava/time/Instant;Ljava/time/Instant;)V
    //   93: goto -> 124
    //   96: astore #7
    //   98: aload #7
    //   100: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   103: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   106: aload_0
    //   107: aload #4
    //   109: aload_2
    //   110: invokevirtual ZA : (Lburp/Ztrd;Ljava/lang/Runnable;)Z
    //   113: ireturn
    //   114: astore #7
    //   116: aload #7
    //   118: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   121: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   124: iload #6
    //   126: ireturn
    // Exception table:
    //   from	to	target	type
    //   54	93	96	java/util/concurrent/ExecutionException
    //   54	93	114	java/lang/InterruptedException
    //   54	93	114	java/util/concurrent/CancellationException
  }
  
  private boolean ZF(Ztrd paramZtrd, Zssw paramZssw, Runnable paramRunnable) {
    try {
      ZI(paramZssw);
      paramZtrd.ZK();
    } catch (Zeb zeb) {
      Zah.Zl(zeb, Zk_.IGNORED);
      paramRunnable.run();
      return false;
    } catch (Zzxy zzxy) {
      Zah.Zl(zzxy, Zk_.COMMON_RUNTIME_FAILURE);
      return ZA(paramZtrd, paramRunnable);
    } 
    return false;
  }
  
  private boolean ZA(Ztrd paramZtrd, Runnable paramRunnable) {
    paramZtrd.ZK();
    boolean bool = this.Zv.ZP(this.ZZ);
    try {
      if (!bool)
        paramRunnable.run(); 
    } catch (CancellationException cancellationException) {
      throw a(null);
    } 
    return bool;
  }
  
  private void Zv(Instant paramInstant1, Instant paramInstant2) {
    Duration duration = Duration.between(paramInstant1, paramInstant2);
    Zm2.Zi(Zv8r.INTRUDER_SAVE_ATTACK_TO_PROJECT_FILE_DURATION_MS, duration.toMillis());
    Zm2.Zi(Zv8r.INTRUDER_NUMBER_OF_RESULTS_SAVED_TO_PROJECT_FILE, this.Zo.ZNH().ZeF().Zv0());
  }
  
  private void ZI(Zssw paramZssw) {
    boolean bool = ZQ(paramZssw);
    Zzys zzys = ZN();
    ZY(zzys);
    ZT(paramZssw, bool, zzys);
  }
  
  private void ZT(Zssw paramZssw, boolean paramBoolean, Zzys paramZzys) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZL : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   4: invokevirtual get : ()Z
    //   7: istore #4
    //   9: iload #4
    //   11: ifeq -> 27
    //   14: aload_3
    //   15: invokeinterface ZPo : ()I
    //   20: goto -> 36
    //   23: invokestatic a : (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
    //   26: athrow
    //   27: aload_0
    //   28: getfield Zo : Lburp/Zzys;
    //   31: invokeinterface ZPo : ()I
    //   36: istore #5
    //   38: iload #4
    //   40: ifeq -> 59
    //   43: aload_0
    //   44: getfield Zo : Lburp/Zzys;
    //   47: invokeinterface ZPo : ()I
    //   52: goto -> 65
    //   55: invokestatic a : (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
    //   58: athrow
    //   59: aload_3
    //   60: invokeinterface ZPo : ()I
    //   65: istore #6
    //   67: aload_0
    //   68: iload #5
    //   70: invokevirtual Zq : (I)V
    //   73: aload_1
    //   74: getfield openWindowAfterSave : Z
    //   77: ifeq -> 98
    //   80: aload_0
    //   81: iload #6
    //   83: <illegal opcode> run : (Lburp/Zk7k;I)Ljava/lang/Runnable;
    //   88: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
    //   97: athrow
    //   98: iload_2
    //   99: ifeq -> 120
    //   102: aload_0
    //   103: getfield Zk : Lburp/Zrqq;
    //   106: iload #6
    //   108: invokeinterface Zy : (I)V
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
    //   119: athrow
    //   120: return
    // Exception table:
    //   from	to	target	type
    //   9	23	23	java/util/concurrent/CancellationException
    //   38	55	55	java/util/concurrent/CancellationException
    //   67	91	94	java/util/concurrent/CancellationException
    //   98	113	116	java/util/concurrent/CancellationException
  }
  
  private Zzys ZN() {
    ZF();
    Zzys zzys = this.Zn.<Zzys>Zw(this.Zo);
    try {
      if (zzys == null)
        throw new Zzxy(a(-25223, -15784)); 
    } catch (CancellationException cancellationException) {
      throw a(null);
    } 
    zzys.ZNH().ZeY().Zq(true);
    zzys.Zzv(this.ZA.ZL());
    return zzys;
  }
  
  private void ZY(Zzys paramZzys) {
    ZF();
    this.Zd.accept(this.ZH, paramZzys);
  }
  
  private boolean ZQ(Zssw paramZssw) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZN : Ljava/util/function/Supplier;
    //   4: invokeinterface get : ()Ljava/lang/Object;
    //   9: checkcast burp/Ztj1
    //   12: astore_2
    //   13: aload_2
    //   14: ifnonnull -> 38
    //   17: new burp/Zzxy
    //   20: dup
    //   21: sipush #-25224
    //   24: sipush #-8877
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokespecial <init> : (Ljava/lang/String;)V
    //   33: athrow
    //   34: invokestatic a : (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
    //   37: athrow
    //   38: aload_2
    //   39: invokevirtual ZE : ()Z
    //   42: ifne -> 53
    //   45: iconst_1
    //   46: goto -> 54
    //   49: invokestatic a : (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
    //   52: athrow
    //   53: iconst_0
    //   54: istore_3
    //   55: aload_0
    //   56: invokevirtual ZF : ()V
    //   59: iload_3
    //   60: ifeq -> 74
    //   63: aload_2
    //   64: invokevirtual Zv : ()V
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
    //   73: athrow
    //   74: aload_0
    //   75: invokevirtual ZF : ()V
    //   78: aload_1
    //   79: getfield closeWindowBeforeSave : Z
    //   82: ifeq -> 102
    //   85: aload_0
    //   86: aload_2
    //   87: <illegal opcode> run : (Lburp/Zk7k;Lburp/Ztj1;)Ljava/lang/Runnable;
    //   92: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
    //   101: athrow
    //   102: iload_3
    //   103: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	34	34	java/util/concurrent/CancellationException
    //   38	49	49	java/util/concurrent/CancellationException
    //   55	67	70	java/util/concurrent/CancellationException
    //   74	95	98	java/util/concurrent/CancellationException
  }
  
  private void ZF() {
    try {
      if (this.ZL.get()) {
        Zm2.ZC(Zrrh.INTRUDER_SAVE_TO_PROJECT_FILE_CANCELLED);
        throw new Zeb(a(-25221, 9269));
      } 
    } catch (CancellationException cancellationException) {
      throw a(null);
    } 
  }
  
  private void Zq(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: <illegal opcode> run : (Lburp/Zk7k;I)Ljava/lang/Runnable;
    //   7: invokestatic invokeAndWait : (Ljava/lang/Runnable;)V
    //   10: goto -> 30
    //   13: astore_2
    //   14: aload_2
    //   15: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   18: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   21: new java/lang/RuntimeException
    //   24: dup
    //   25: aload_2
    //   26: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   29: athrow
    //   30: return
    // Exception table:
    //   from	to	target	type
    //   0	10	13	java/lang/InterruptedException
    //   0	10	13	java/lang/reflect/InvocationTargetException
  }
  
  private void lambda$deleteAttackTaskAndAwaitCompletion$5(int paramInt) {
    this.Zk.Zo(paramInt);
  }
  
  private void lambda$performPreSaveActions$4(Ztj1 paramZtj1) {
    this.Zk.Zm(paramZtj1.Zh());
  }
  
  private void lambda$performPostSaveActions$3(int paramInt) {
    this.Zk.ZZ(paramInt);
  }
  
  private Boolean lambda$trySaveAttackToProjectFile$2(Ztrd paramZtrd, Zssw paramZssw, Runnable paramRunnable) throws Exception {
    return Boolean.valueOf(ZF(paramZtrd, paramZssw, paramRunnable));
  }
  
  private void lambda$trySaveAttackToProjectFile$1() {
    this.ZL.compareAndSet(false, true);
  }
  
  private void lambda$saveToProjectFile$0(Runnable paramRunnable1, Runnable paramRunnable2, Zssw paramZssw) {
    ZJ(paramRunnable1, paramRunnable2, paramZssw);
  }
  
  private static CancellationException a(CancellationException paramCancellationException) {
    return paramCancellationException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '\\t­¬Ó/ÉÍØ9¯õ\\nLaÄÖrCåülB±C%\\nEM¹\\tVLWLó ìB=GÚÛRrè¢Û:ÌÇñ\\fö ®1OÜ4å½b\\f\\nÍ:¯\\nx\\r¬`V'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #30
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #74
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc '&±å§Q½»ÏøgÛk£qì¡£#ÕkJ`°o7a~dÜzñg:1º9QØå£;Ñ`4Ä0µtJõoUî)Äux\\bzÉ!M8!¯ïïOø0NS°8=¨={ÐGF¸ú$&'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #72
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #125
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zk7k.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zk7k.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #93
    //   214: goto -> 244
    //   217: bipush #113
    //   219: goto -> 244
    //   222: bipush #6
    //   224: goto -> 244
    //   227: bipush #9
    //   229: goto -> 244
    //   232: bipush #74
    //   234: goto -> 244
    //   237: bipush #42
    //   239: goto -> 244
    //   242: bipush #123
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9D7A) & 0xFFFF;
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
      byte b1 = 31;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk7k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */