package burp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.function.IntSupplier;
import javax.swing.table.TableColumn;

public final class Zb05<T, U> implements Zr6p<T> {
  private final String ZN;
  
  private final String ZX;
  
  private final String Zg;
  
  private final Zxlp<U> Zl;
  
  private final Zkoh<T, U> ZS;
  
  private final Zx6v<T> Zn;
  
  private final Set<T> ZL;
  
  private final ExecutorService ZC;
  
  private final Ztdp<Runnable> ZV;
  
  private final Zl6k Zb;
  
  private final Zsuf Zq;
  
  private Zzvl<T> ZE;
  
  private static final String a;
  
  public Zb05(String paramString1, String paramString2, String paramString3, Zxlp<U> paramZxlp, Zkoh<T, U> paramZkoh, Zri2 paramZri2, IntSupplier paramIntSupplier, Zx6v<T> paramZx6v, ExecutorService paramExecutorService, Zxr3 paramZxr3) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZN : Ljava/lang/String;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield ZX : Ljava/lang/String;
    //   14: aload_0
    //   15: aload_3
    //   16: putfield Zg : Ljava/lang/String;
    //   19: aload_0
    //   20: aload #4
    //   22: putfield Zl : Lburp/Zxlp;
    //   25: aload_0
    //   26: aload #5
    //   28: putfield ZS : Lburp/Zkoh;
    //   31: aload_0
    //   32: aload #8
    //   34: putfield Zn : Lburp/Zx6v;
    //   37: aload_0
    //   38: aload #9
    //   40: putfield ZC : Ljava/util/concurrent/ExecutorService;
    //   43: aload_0
    //   44: new java/util/concurrent/ConcurrentHashMap
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: invokestatic newSetFromMap : (Ljava/util/Map;)Ljava/util/Set;
    //   54: putfield ZL : Ljava/util/Set;
    //   57: aload_0
    //   58: new burp/Ztdp
    //   61: dup
    //   62: <illegal opcode> execute : ()Ljava/util/concurrent/Executor;
    //   67: aload #10
    //   69: aload #6
    //   71: <illegal opcode> accept : (Lburp/Zxr3;Lburp/Zri2;)Ljava/util/function/Consumer;
    //   76: aload #7
    //   78: <illegal opcode> getAsLong : (Ljava/util/function/IntSupplier;)Ljava/util/function/LongSupplier;
    //   83: invokespecial <init> : (Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;Ljava/util/function/LongSupplier;)V
    //   86: putfield ZV : Lburp/Ztdp;
    //   89: invokestatic ZR : ()I
    //   92: aload_0
    //   93: new burp/Zl6k
    //   96: dup
    //   97: invokespecial <init> : ()V
    //   100: putfield Zb : Lburp/Zl6k;
    //   103: istore #11
    //   105: aload_0
    //   106: new burp/Zsuf
    //   109: dup
    //   110: invokespecial <init> : ()V
    //   113: putfield Zq : Lburp/Zsuf;
    //   116: aload #8
    //   118: aload_0
    //   119: getfield Zb : Lburp/Zl6k;
    //   122: invokevirtual ZH : (Lburp/Zzkg;)V
    //   125: iload #11
    //   127: ifeq -> 137
    //   130: iconst_4
    //   131: anewarray burp/Zbqc
    //   134: invokestatic Zr : ([Lburp/Zbqc;)V
    //   137: return
  }
  
  public TableColumn ZP(int paramInt) {
    return new Zxps(this.Zg, paramInt);
  }
  
  public Zmk7<T> Zk() {
    Zex3<U, Object> zex3 = this.Zl.ZK();
    this.ZE = this.ZS.Zo(this.Zg, zex3, this.Zq);
    return Zx84.Zx(this::lambda$createBurpTableColumn$4, this.ZN, this.ZX);
  }
  
  private Ze9n Zu(T paramT) {
    Zs(paramT);
    return Zr6p.ZD;
  }
  
  public void Zo(int paramInt, Zmjx<T> paramZmjx) {
    paramZmjx.Zn(Zk());
    paramZmjx.ZE(this);
  }
  
  public void Zp(int paramInt, Zmjx<T> paramZmjx) {
    paramZmjx.ZL(this);
    paramZmjx.Zj(paramInt);
    Zz();
  }
  
  public void Zz() {
    this.ZC.shutdownNow();
  }
  
  public boolean ZC() {
    return !this.ZL.isEmpty();
  }
  
  public void Zl(int paramInt, T paramT) {}
  
  public void Zc(int paramInt, T paramT) {
    this.ZL.remove(paramT);
    this.Zn.remove(paramT);
  }
  
  public void ZO(int paramInt, T paramT) {
    this.ZL.remove(paramT);
    this.Zn.remove(paramT);
    Zs(paramT);
  }
  
  private void Zs(T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZC : Ljava/util/concurrent/ExecutorService;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> run : (Lburp/Zb05;Ljava/lang/Object;)Ljava/lang/Runnable;
    //   11: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   16: return
  }
  
  public String ZE() {
    return this.Zg;
  }
  
  public Zx6v<T> Zy() {
    return this.Zn;
  }
  
  public Zl6k ZO() {
    return this.Zb;
  }
  
  public Zsuf Zh() {
    return this.Zq;
  }
  
  private void lambda$scheduleUpdateToValueCache$6(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZE : Lburp/Zzvl;
    //   4: aload_1
    //   5: invokeinterface Zt : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: astore_2
    //   11: aload_2
    //   12: astore #4
    //   14: iconst_0
    //   15: istore #5
    //   17: aload #4
    //   19: iload #5
    //   21: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   26: lookupswitch default -> 81, -1 -> 75, 0 -> 52
    //   52: aload #4
    //   54: checkcast burp/Zsij
    //   57: astore #6
    //   59: aload_0
    //   60: getfield ZL : Ljava/util/Set;
    //   63: aload_1
    //   64: invokeinterface add : (Ljava/lang/Object;)Z
    //   69: pop
    //   70: aload #6
    //   72: goto -> 82
    //   75: getstatic burp/Zgnm.NULL_CELL_VALUE : Lburp/Zgnm;
    //   78: goto -> 82
    //   81: aload_2
    //   82: astore_3
    //   83: aload_0
    //   84: getfield ZV : Lburp/Ztdp;
    //   87: aload_0
    //   88: aload_1
    //   89: aload_3
    //   90: <illegal opcode> run : (Lburp/Zb05;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Runnable;
    //   95: invokevirtual ZB : (Ljava/lang/Object;)V
    //   98: aload_0
    //   99: getfield ZV : Lburp/Ztdp;
    //   102: invokevirtual Zv : ()V
    //   105: return
  }
  
  private void lambda$scheduleUpdateToValueCache$5(Object paramObject1, Object paramObject2) {
    this.Zn.put((T)paramObject1, paramObject2);
  }
  
  private Object lambda$createBurpTableColumn$4(Object paramObject) {
    return this.Zn.computeIfAbsent((T)paramObject, this::Zu);
  }
  
  private static Object lambda$createBurpTableColumn$3(Object paramObject) {
    return a;
  }
  
  private static long lambda$new$2(IntSupplier paramIntSupplier) {
    return (paramIntSupplier.getAsInt() / 100);
  }
  
  private static void lambda$new$1(Zxr3 paramZxr3, Zri2 paramZri2, List paramList) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: aload_1
    //   3: <illegal opcode> run : (Ljava/util/List;Lburp/Zri2;)Ljava/lang/Runnable;
    //   8: invokevirtual ZF : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  private static void lambda$new$0(List paramList, Zri2 paramZri2) {
    paramList.forEach(Runnable::run);
    paramZri2.ZX();
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: ldc '7Xb%7,XQ4\\r9(<'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zb05.a : Ljava/lang/String;
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
    //   80: bipush #73
    //   82: goto -> 112
    //   85: bipush #72
    //   87: goto -> 112
    //   90: bipush #58
    //   92: goto -> 112
    //   95: bipush #50
    //   97: goto -> 112
    //   100: bipush #25
    //   102: goto -> 112
    //   105: bipush #111
    //   107: goto -> 112
    //   110: bipush #90
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb05.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */