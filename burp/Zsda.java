package burp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import net.portswigger.Zd4;
import net.portswigger.Zfb;
import net.portswigger.Zi7;
import net.portswigger.Zv3;

public class Zsda implements Zehp {
  private final Zgyx ZJ;
  
  private final Map<String, Ze7n> Zy = new HashMap<>();
  
  private final Zi7 ZE = Zv3.ZU();
  
  private static final String a;
  
  public static Zsda ZW(List<Ze7n> paramList) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    paramList.forEach(hashMap::lambda$fromStoredInputs$0);
    return new Zsda(hashMap::lambda$fromStoredInputs$1);
  }
  
  public static Zsda ZF() {
    return new Zsda(Zsda::lambda$withEmptyValues$2);
  }
  
  private Zsda(Zgyx paramZgyx) {
    this.ZJ = paramZgyx;
  }
  
  public void ZG(Zsvv paramZsvv, Zrji paramZrji, String paramString1, String paramString2) {
    Objects.requireNonNull(this.ZE);
    ZO(paramZsvv, paramZrji, paramString1, paramString2, this.ZE::ZN, new HashSet<>());
  }
  
  private void ZO(Zsvv paramZsvv, Zrji paramZrji, String paramString1, String paramString2, BiConsumer<String, Zd4> paramBiConsumer, Set<Ztjl> paramSet) {
    // Byte code:
    //   0: invokestatic Zi : ()[I
    //   3: astore #7
    //   5: aload_2
    //   6: invokevirtual ZwK : ()Z
    //   9: ifne -> 29
    //   12: aload_2
    //   13: invokevirtual ZwF : ()Z
    //   16: ifne -> 57
    //   19: aload_2
    //   20: invokevirtual Zwz : ()Lburp/Zrji;
    //   23: invokevirtual ZwK : ()Z
    //   26: ifeq -> 57
    //   29: aload #5
    //   31: aload #4
    //   33: aload_0
    //   34: getfield ZJ : Lburp/Zgyx;
    //   37: aload_3
    //   38: aload_2
    //   39: aload_1
    //   40: aload #4
    //   42: invokeinterface ZV : (Ljava/lang/String;Lburp/Zrji;Lburp/Zsvv;Ljava/lang/String;)Lnet/portswigger/Zd4;
    //   47: invokeinterface accept : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   52: aload #7
    //   54: ifnull -> 272
    //   57: aload_2
    //   58: invokevirtual Zwe : ()Ljava/util/Optional;
    //   61: invokevirtual isPresent : ()Z
    //   64: ifeq -> 129
    //   67: invokestatic ZG : ()Lnet/portswigger/Zfb;
    //   70: astore #8
    //   72: aload_0
    //   73: aload_1
    //   74: aload_2
    //   75: invokevirtual Zwe : ()Ljava/util/Optional;
    //   78: invokevirtual get : ()Ljava/lang/Object;
    //   81: checkcast burp/Zrji
    //   84: aload_3
    //   85: getstatic burp/Zsda.a : Ljava/lang/String;
    //   88: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   93: aconst_null
    //   94: aload #8
    //   96: <illegal opcode> accept : (Lnet/portswigger/Zfb;)Ljava/util/function/BiConsumer;
    //   101: new java/util/HashSet
    //   104: dup
    //   105: aload #6
    //   107: invokespecial <init> : (Ljava/util/Collection;)V
    //   110: invokevirtual ZO : (Lburp/Zsvv;Lburp/Zrji;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/BiConsumer;Ljava/util/Set;)V
    //   113: aload #5
    //   115: aload #4
    //   117: aload #8
    //   119: invokeinterface accept : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   124: aload #7
    //   126: ifnull -> 272
    //   129: aload_2
    //   130: aload_1
    //   131: invokevirtual ZM : (Lburp/Zsvv;)Lburp/Zsk1;
    //   134: astore #8
    //   136: aload #8
    //   138: instanceof burp/Ztjl
    //   141: ifeq -> 156
    //   144: aload #8
    //   146: checkcast burp/Ztjl
    //   149: astore #9
    //   151: aload #7
    //   153: ifnull -> 157
    //   156: return
    //   157: aload #6
    //   159: aload #9
    //   161: invokeinterface add : (Ljava/lang/Object;)Z
    //   166: ifne -> 170
    //   169: return
    //   170: invokestatic ZU : ()Lnet/portswigger/Zi7;
    //   173: astore #10
    //   175: aload #9
    //   177: invokevirtual ZtK : ()Ljava/util/List;
    //   180: invokeinterface iterator : ()Ljava/util/Iterator;
    //   185: astore #11
    //   187: aload #11
    //   189: invokeinterface hasNext : ()Z
    //   194: ifeq -> 261
    //   197: aload #11
    //   199: invokeinterface next : ()Ljava/lang/Object;
    //   204: checkcast burp/Zzqr
    //   207: astore #12
    //   209: aload_0
    //   210: aload_1
    //   211: aload #12
    //   213: invokevirtual Zx3 : ()Lburp/Zrji;
    //   216: aload_3
    //   217: aload #12
    //   219: invokevirtual ZxH : ()Ljava/lang/String;
    //   222: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   227: aload #12
    //   229: invokevirtual ZxH : ()Ljava/lang/String;
    //   232: aload #10
    //   234: dup
    //   235: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   238: pop
    //   239: <illegal opcode> accept : (Lnet/portswigger/Zi7;)Ljava/util/function/BiConsumer;
    //   244: new java/util/HashSet
    //   247: dup
    //   248: aload #6
    //   250: invokespecial <init> : (Ljava/util/Collection;)V
    //   253: invokevirtual ZO : (Lburp/Zsvv;Lburp/Zrji;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/BiConsumer;Ljava/util/Set;)V
    //   256: aload #7
    //   258: ifnull -> 187
    //   261: aload #5
    //   263: aload #4
    //   265: aload #10
    //   267: invokeinterface accept : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   272: return
  }
  
  public Zi7 Zv() {
    return this.ZE;
  }
  
  private static Zd4 ZF(Zrji paramZrji, Zsvv paramZsvv, Ze7n paramZe7n) {
    return (Zd4)((paramZe7n == null || paramZe7n.Ze() == null) ? Zv3.ZE() : Zeu_.ZG(paramZrji.Zw(), paramZsvv).Zt(paramZe7n));
  }
  
  private static void lambda$storeInput$3(Zfb paramZfb, String paramString, Zd4 paramZd4) {
    paramZfb.Zh(paramZd4);
  }
  
  private static Zd4 lambda$withEmptyValues$2(String paramString1, Zrji paramZrji, Zsvv paramZsvv, String paramString2) {
    return Zeu_.ZG(paramZrji.Zw(), paramZsvv).Zl(paramZrji, paramZsvv);
  }
  
  private static Zd4 lambda$fromStoredInputs$1(Map paramMap, String paramString1, Zrji paramZrji, Zsvv paramZsvv, String paramString2) {
    return ZF(paramZrji, paramZsvv, (Ze7n)paramMap.get(paramString1));
  }
  
  private static void lambda$fromStoredInputs$0(Map<String, Ze7n> paramMap, Ze7n paramZe7n) {
    paramMap.put(paramZe7n.ZS(), paramZe7n);
  }
  
  static {
    // Byte code:
    //   0: bipush #68
    //   2: ldc '1\\tI'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsda.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #46
    //   82: goto -> 111
    //   85: bipush #125
    //   87: goto -> 111
    //   90: bipush #80
    //   92: goto -> 111
    //   95: bipush #122
    //   97: goto -> 111
    //   100: bipush #83
    //   102: goto -> 111
    //   105: bipush #79
    //   107: goto -> 111
    //   110: iconst_2
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
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsda.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */