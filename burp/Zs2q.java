package burp;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Zs2q {
  private static int[] ZE;
  
  private static final String a;
  
  static void Zp(Zrp0 paramZrp0, Zszw paramZszw, Zlru paramZlru, Zeu9 paramZeu9, Zkmk paramZkmk, Ztk0 paramZtk0, Zt1i paramZt1i, Zr_4 paramZr_4, Zz1m<Zt35> paramZz1m, Zr69 paramZr69) {
    paramZr69.ZD().Zy(Zrp6.TRACE, Zlq7.IS_SIGNPOST_FINGERPRINT_THRESHOLD_BREACHED, new Object[0]);
    Objects.requireNonNull(Zl_.class);
    Objects.requireNonNull(Zl_.class);
    List<Zm6i> list = paramZkmk.ZEN().stream().filter(Zl_.class::isInstance).map(Zl_.class::cast).filter(paramZszw::lambda$performFingerprintingIfThresholdBreached$0).map(Zl_::Zfy).toList();
    int[] arrayOfInt = ZE();
    Objects.requireNonNull(Zr5n.class);
    boolean bool = list.stream().anyMatch(Zr5n.class::isInstance);
    int i = bool ? paramZr69.Zj() : paramZr69.Zz();
    if (list.size() >= i) {
      Zszy zszy = paramZtk0.Zq(paramZkmk);
      if (zszy == null || !paramZrp0.Zd(zszy))
        Zq(paramZrp0, paramZszw, paramZlru, paramZeu9, paramZkmk, list, paramZt1i, paramZtk0, paramZr_4, paramZz1m, paramZr69.ZD(), i); 
    } 
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  private static void Zq(Zrp0 paramZrp0, Zszw paramZszw, Zlru paramZlru, Zeu9 paramZeu9, Zkmk paramZkmk, List<Zm6i> paramList, Zt1i paramZt1i, Ztk0 paramZtk0, Zr_4 paramZr_4, Zz1m<Zt35> paramZz1m, Zmv7 paramZmv7, int paramInt) {
    paramZmv7.Zy(Zrp6.TRACE, Zlq7.NEW_SIGNPOST_FINGERPRINT, new Object[] { paramList });
    Zti9 zti9 = Ze2a.Zh(paramList);
    paramZmv7.Zy(Zrp6.DEBUG, Zlq7.NOT_IN_DEBUG_LOG, new Object[] { a });
    int i = ZY(zti9, paramZt1i, Collections.emptySet());
    paramZmv7.Zy(Zrp6.DEBUG, Zlq7.REACHABLE_ROOM_COUNT_IS, new Object[] { Integer.valueOf(i) });
    int j = Zy(paramInt, i);
    if (paramList.size() >= j)
      paramZtk0.Zm(paramZkmk, paramZr_4.<Zszy>Zo(zti9), paramZrp0, paramZszw, paramZlru, paramZeu9, paramZz1m, paramZmv7); 
  }
  
  public static int ZY(Zszy paramZszy, Iterable<Zeu9> paramIterable, Set<Zm6i> paramSet) {
    // Byte code:
    //   0: invokestatic ZE : ()[I
    //   3: astore_3
    //   4: aload_1
    //   5: invokeinterface spliterator : ()Ljava/util/Spliterator;
    //   10: iconst_0
    //   11: invokestatic stream : (Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;
    //   14: ldc burp/Zzbs
    //   16: dup
    //   17: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   20: pop
    //   21: <illegal opcode> test : (Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   26: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   31: aload_2
    //   32: aload_0
    //   33: <illegal opcode> test : (Ljava/util/Set;Lburp/Zszy;)Ljava/util/function/Predicate;
    //   38: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   43: invokeinterface count : ()J
    //   48: l2i
    //   49: invokestatic Zwu : ()[Lburp/Zbqc;
    //   52: ifnonnull -> 61
    //   55: iconst_1
    //   56: newarray int
    //   58: invokestatic ZG : ([I)V
    //   61: ireturn
  }
  
  private static int Zy(int paramInt1, int paramInt2) {
    return Math.max(paramInt1, paramInt1 * paramInt2);
  }
  
  private static boolean lambda$roomsMatchingFingerprint$2(Set paramSet, Zszy paramZszy, Zeu9 paramZeu9) {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface ZSA : ()Ljava/util/Collection;
    //   6: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   11: ldc burp/Zl_
    //   13: dup
    //   14: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   17: pop
    //   18: <illegal opcode> test : (Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   23: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   28: ldc burp/Zl_
    //   30: dup
    //   31: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   34: pop
    //   35: <illegal opcode> apply : (Ljava/lang/Class;)Ljava/util/function/Function;
    //   40: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   45: aload_0
    //   46: aload_1
    //   47: <illegal opcode> test : (Ljava/util/Set;Lburp/Zszy;)Ljava/util/function/Predicate;
    //   52: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   57: ireturn
  }
  
  private static boolean lambda$roomsMatchingFingerprint$1(Set paramSet, Zszy paramZszy, Zl_ paramZl_) {
    return (!paramSet.contains(paramZl_.Zfy()) && paramZl_.Zd(paramZszy));
  }
  
  private static boolean lambda$performFingerprintingIfThresholdBreached$0(Zszw paramZszw, Zl_ paramZl_) {
    return paramZl_.ZfD().ZB(paramZszw);
  }
  
  public static void ZG(int[] paramArrayOfint) {
    ZE = paramArrayOfint;
  }
  
  public static int[] ZE() {
    return ZE;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZE : ()[I
    //   3: ifnonnull -> 12
    //   6: iconst_5
    //   7: newarray int
    //   9: invokestatic ZG : ([I)V
    //   12: bipush #26
    //   14: ldc 'af_x[3`(\cT3vxHcTvbzUg9keoT$efYo?cfJeI%'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic burp/Zs2q.a : Ljava/lang/String;
    //   23: goto -> 166
    //   26: dup_x2
    //   27: pop
    //   28: invokevirtual toCharArray : ()[C
    //   31: dup_x1
    //   32: arraylength
    //   33: dup_x2
    //   34: pop
    //   35: iconst_0
    //   36: istore_0
    //   37: dup2_x1
    //   38: pop2
    //   39: dup_x2
    //   40: iconst_1
    //   41: if_icmpgt -> 140
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #76
    //   94: goto -> 124
    //   97: bipush #30
    //   99: goto -> 124
    //   102: bipush #18
    //   104: goto -> 124
    //   107: bipush #32
    //   109: goto -> 124
    //   112: bipush #16
    //   114: goto -> 124
    //   117: bipush #32
    //   119: goto -> 124
    //   122: bipush #122
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 47
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 44
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 20
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs2q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */