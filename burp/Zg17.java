package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zg17 extends Zg1q {
  private static final EnumSet<Zl2w> ZE;
  
  private static final Set<String> ZI;
  
  private final Zr69 Zg;
  
  Zg17(Zr69 paramZr69) {
    this.Zg = paramZr69;
  }
  
  public List<Zs49<?>> Zo(List<Ze7n> paramList) {
    try {
      if (paramList.stream().noneMatch(Zg17::Zm))
        return Collections.emptyList(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (paramList.stream().anyMatch(Ze7n::Zy))
        return Zb(this.Zg.ZF(), paramList); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return Zk(paramList);
  }
  
  private List<Zs49<?>> Zb(List<Zb9v> paramList, List<Ze7n> paramList1) {
    LinkedList<Zt8z> linkedList1 = new LinkedList();
    Iterator<Zb9v> iterator = paramList.iterator();
    String[] arrayOfString = Zg1q.Zp();
    while (iterator.hasNext()) {
      Zb9v zb9v = iterator.next();
      Zt8z zt8z = Zl4b.Zf(zb9v, this.Zg.ZP());
      linkedList1.add(zt8z);
      Objects.requireNonNull(linkedList1);
      ZD(paramList1, zt8z).ifPresent(linkedList1::add);
      if (arrayOfString != null)
        break; 
    } 
    try {
      if (linkedList1.isEmpty())
        return Collections.emptyList(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Zlxy<Zk28> zlxy = linkedList1.get(0);
    LinkedList<Zt8z> linkedList2 = new LinkedList<>(linkedList1);
    linkedList2.addAll((Collection)Zi(paramList1, zlxy));
    return (List)linkedList2;
  }
  
  private List<Zs49<?>> Zk(List<Ze7n> paramList) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_2
    //   9: invokestatic ZVr : ()Lburp/Zm3j;
    //   12: invokeinterface add : (Ljava/lang/Object;)Z
    //   17: pop
    //   18: aload_0
    //   19: getfield Zg : Lburp/Zr69;
    //   22: invokeinterface ZP : ()Lnet/portswigger/Zsy;
    //   27: invokestatic Zf : (Lnet/portswigger/Zsy;)Lburp/Zzci;
    //   30: astore_3
    //   31: aload_0
    //   32: aload_1
    //   33: invokevirtual Zb : (Ljava/util/List;)Z
    //   36: ifeq -> 54
    //   39: aload_2
    //   40: aload_3
    //   41: invokeinterface add : (Ljava/lang/Object;)Z
    //   46: pop
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   53: athrow
    //   54: aload_0
    //   55: aload_1
    //   56: invokevirtual Zp : (Ljava/util/List;)Z
    //   59: ifeq -> 89
    //   62: aload_0
    //   63: aload_1
    //   64: aload_3
    //   65: invokevirtual ZD : (Ljava/util/List;Lburp/Zlxy;)Ljava/util/Optional;
    //   68: aload_2
    //   69: dup
    //   70: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   73: pop
    //   74: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   79: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   88: athrow
    //   89: aload_1
    //   90: invokestatic ZX : (Ljava/util/Collection;)Ljava/util/Optional;
    //   93: invokevirtual isPresent : ()Z
    //   96: istore #4
    //   98: aload_0
    //   99: aload_1
    //   100: aload_3
    //   101: invokevirtual Zi : (Ljava/util/List;Lburp/Zlxy;)Ljava/util/List;
    //   104: aload_0
    //   105: iload #4
    //   107: aload_2
    //   108: <illegal opcode> accept : (Lburp/Zg17;ZLjava/util/List;)Ljava/util/function/Consumer;
    //   113: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   118: aload_2
    //   119: areturn
    // Exception table:
    //   from	to	target	type
    //   31	47	50	java/lang/NumberFormatException
    //   54	82	85	java/lang/NumberFormatException
  }
  
  private boolean Zb(List<Ze7n> paramList) {
    try {
      if (!Zc(paramList)) {
        try {
          if (ZU(paramList));
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private boolean Zp(List<Ze7n> paramList) {
    List<Ze7n> list = paramList.stream().filter(Predicate.not(this::Zj)).toList();
    return Zc(list);
  }
  
  private static boolean Zc(List<Ze7n> paramList) {
    return paramList.stream().filter(Zg17::Zm).filter(Zg1q::Zn).map(Ze7n::Ze).anyMatch(Zsw8::ZP);
  }
  
  private static boolean Zm(Ze7n paramZe7n) {
    Zzuz zzuz = paramZe7n.ZH();
    try {
      if (zzuz.Zh())
        try {
          if (!zzuz.Zu())
            try {
              if (!zzuz.Zd());
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            }  
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  protected boolean Zj(Ze7n paramZe7n) {
    try {
      if (Zm(paramZe7n))
        try {
          if (paramZe7n.ZH().Zl());
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  private static Optional<String> ZX(Collection<Ze7n> paramCollection) {
    List list = paramCollection.stream().filter(Zg17::lambda$extractNavigationalControlName$1).map(Zg17::lambda$extractNavigationalControlName$2).toList();
    try {
      if (!list.isEmpty())
        try {
          Objects.requireNonNull(ZE);
          if (list.stream().map(Zrtj::ZN).allMatch(ZE::contains) && list.stream().noneMatch(Zg17::ZT)) {
            List<String> list1 = list.stream().filter(Zg17::lambda$extractNavigationalControlName$3).map(Ze7n::ZW).filter(Objects::nonNull).distinct().toList();
            try {
              if (list1.size() == 1)
                return Optional.of(list1.get(0)); 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return Optional.empty();
  }
  
  private static boolean ZT(Ze7n paramZe7n) {
    return paramZe7n.ZX().stream().filter(Objects::nonNull).map(String::trim).filter(Zsw8::ZS).anyMatch(Zg17::lambda$isBoring$4);
  }
  
  private static boolean lambda$isBoring$4(String paramString) {
    try {
      try {
        if (!ZI.contains(paramString)) {
          try {
            if (Math.abs(Float.parseFloat(paramString)) > 5.0F);
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return false;
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      return false;
    } 
  }
  
  private static boolean lambda$extractNavigationalControlName$3(Zrtj paramZrtj) {
    try {
      if (paramZrtj.ZN() != Zl2w.SELECT) {
        try {
          if (paramZrtj.ZN() == Zl2w.RADIO);
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private static Zrtj lambda$extractNavigationalControlName$2(Ze7n paramZe7n) {
    return (Zrtj)paramZe7n;
  }
  
  private static boolean lambda$extractNavigationalControlName$1(Ze7n paramZe7n) {
    return paramZe7n instanceof Zrtj;
  }
  
  private void lambda$buildNonPasswordFormKeys$0(boolean paramBoolean, List<Zlxy> paramList, Zlxy paramZlxy) {
    try {
      if (paramBoolean) {
        try {
          if (paramList.size() < this.Zg.Zh()) {
            paramList.add(paramZlxy);
            return;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    paramList.add(paramZlxy);
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'd\\f'N-dc'Ei\\f\\to\\t\\r4]8gic'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #7
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #95
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 129
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc 'eu'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: iconst_2
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #81
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 248
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #81
    //   202: goto -> 232
    //   205: bipush #35
    //   207: goto -> 232
    //   210: bipush #39
    //   212: goto -> 232
    //   215: bipush #38
    //   217: goto -> 232
    //   220: bipush #25
    //   222: goto -> 232
    //   225: bipush #99
    //   227: goto -> 232
    //   230: bipush #11
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 98
    //   288: getstatic burp/Zl2w.SELECT : Lburp/Zl2w;
    //   291: getstatic burp/Zl2w.RADIO : Lburp/Zl2w;
    //   294: getstatic burp/Zl2w.SUBMIT : Lburp/Zl2w;
    //   297: getstatic burp/Zl2w.HIDDEN : Lburp/Zl2w;
    //   300: invokestatic of : (Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;
    //   303: putstatic burp/Zg17.ZE : Ljava/util/EnumSet;
    //   306: new java/util/HashSet
    //   309: dup
    //   310: bipush #9
    //   312: anewarray java/lang/String
    //   315: dup
    //   316: iconst_0
    //   317: aload_0
    //   318: iconst_4
    //   319: aaload
    //   320: aastore
    //   321: dup
    //   322: iconst_1
    //   323: aload_0
    //   324: bipush #7
    //   326: aaload
    //   327: aastore
    //   328: dup
    //   329: iconst_2
    //   330: aload_0
    //   331: iconst_5
    //   332: aaload
    //   333: aastore
    //   334: dup
    //   335: iconst_3
    //   336: aload_0
    //   337: iconst_0
    //   338: aaload
    //   339: aastore
    //   340: dup
    //   341: iconst_4
    //   342: aload_0
    //   343: iconst_1
    //   344: aaload
    //   345: aastore
    //   346: dup
    //   347: iconst_5
    //   348: aload_0
    //   349: iconst_3
    //   350: aaload
    //   351: aastore
    //   352: dup
    //   353: bipush #6
    //   355: aload_0
    //   356: bipush #8
    //   358: aaload
    //   359: aastore
    //   360: dup
    //   361: bipush #7
    //   363: aload_0
    //   364: iconst_2
    //   365: aaload
    //   366: aastore
    //   367: dup
    //   368: bipush #8
    //   370: aload_0
    //   371: bipush #6
    //   373: aaload
    //   374: aastore
    //   375: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   378: invokespecial <init> : (Ljava/util/Collection;)V
    //   381: putstatic burp/Zg17.ZI : Ljava/util/Set;
    //   384: return
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg17.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */