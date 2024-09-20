package burp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Zg2c extends Zg2b<Zgxp> {
  private static final Object Zp;
  
  private static final Comparator<Zlau<?>> ZH;
  
  private final List<Zlau<?>> Ze;
  
  private final List<Zmk7<Zgxp>> ZN;
  
  private final Zz1e Zg;
  
  private static final String a;
  
  public Zg2c(Zz1e paramZz1e) {
    super(new Zgjg<>(paramZz1e.Zu().stream().map(Zlau::Zp).toList()));
    this.Zg = paramZz1e;
    this.Ze = new ArrayList<>(paramZz1e.Zu());
    this.ZN = new ArrayList<>(this.Ze.stream().map(Zlau::Zp).toList());
    Zg();
  }
  
  private void Zg() {
    ZI();
  }
  
  private void ZI() {
    Zkjf.ZO(this::lambda$initialiseAttackResultsTableColumns$0);
  }
  
  public void ZB() {
    ZI();
  }
  
  public int Zu() {
    return this.Ze.size();
  }
  
  public String ZU(int paramInt) {
    return ZE(paramInt, this.Ze, Zlau::ZV, a);
  }
  
  public Object ZA(int paramInt, Zgxp paramZgxp, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: aload_0
    //   3: getfield Ze : Ljava/util/List;
    //   6: aload_2
    //   7: iload_3
    //   8: <illegal opcode> apply : (Lburp/Zgxp;Z)Ljava/util/function/Function;
    //   13: ldc ''
    //   15: invokevirtual ZE : (ILjava/util/List;Ljava/util/function/Function;Ljava/lang/Object;)Ljava/lang/Object;
    //   18: areturn
  }
  
  public Object Zu(int paramInt) {
    return ZE(paramInt, this.Ze, Zlau::Zs, Zp);
  }
  
  public List<Zmk7<Zgxp>> Zf() {
    return this.ZN;
  }
  
  private <T> T ZE(int paramInt, List<Zlau<?>> paramList, Function<Zlau<?>, T> paramFunction, T paramT) {
    Zlau<?> zlau = paramList.get(paramInt);
    return (zlau != null) ? paramFunction.apply(zlau) : paramT;
  }
  
  private static Object lambda$getRealValueForColumn$1(Zgxp paramZgxp, boolean paramBoolean, Zlau paramZlau) {
    return paramZlau.Zo(paramZgxp, paramBoolean);
  }
  
  private void lambda$initialiseAttackResultsTableColumns$0() {
    this.Ze.clear();
    this.Ze.addAll(this.Zg.Zu());
    this.Ze.addAll(this.Zg.ZD());
    this.Ze.sort(ZH);
    this.ZN.clear();
    this.ZN.addAll(this.Ze.stream().map(Zlau::Zp).toList());
    List<Zlau<?>> list = this.Zg.ZD();
    this.Zk.ZC(Zf());
    List<Zmk7<Zgxp>> list1 = list.stream().map(Zlau::Zp).toList();
    this.Zk.ZD(list1);
  }
  
  static {
    // Byte code:
    //   0: bipush #68
    //   2: ldc '4U[5'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zg2c.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #53
    //   82: goto -> 111
    //   85: bipush #99
    //   87: goto -> 111
    //   90: bipush #109
    //   92: goto -> 111
    //   95: bipush #44
    //   97: goto -> 111
    //   100: iconst_3
    //   101: goto -> 111
    //   104: bipush #88
    //   106: goto -> 111
    //   109: bipush #67
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
    //   153: aconst_null
    //   154: putstatic burp/Zg2c.Zp : Ljava/lang/Object;
    //   157: <illegal opcode> applyAsInt : ()Ljava/util/function/ToIntFunction;
    //   162: invokestatic comparingInt : (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
    //   165: <illegal opcode> applyAsInt : ()Ljava/util/function/ToIntFunction;
    //   170: invokeinterface thenComparingInt : (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
    //   175: putstatic burp/Zg2c.ZH : Ljava/util/Comparator;
    //   178: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */