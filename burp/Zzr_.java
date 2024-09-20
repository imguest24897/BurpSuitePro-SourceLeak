package burp;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Zzr_ implements Ze73 {
  private final Zv0 Zt;
  
  public Zzr_(Zv0 paramZv0) {
    this.Zt = paramZv0;
  }
  
  public <T extends Zm9j> Zem4<T> Zc(Zbj5 paramZbj5, Zras<T> paramZras) {
    List<T> list = (List)paramZras.Zn().stream().filter(paramZbj5::lambda$findMatch$0).collect(Collectors.toList());
    return !list.isEmpty() ? ZJ(paramZbj5, list) : Zem4.Zy();
  }
  
  private <T extends Zm9j> Zem4<T> ZJ(Zbj5 paramZbj5, Collection<T> paramCollection) {
    Zem4<Zm9j> zem4 = Zem4.Zy();
    Iterator<T> iterator = paramCollection.iterator();
    int i = Zm9j.Zm();
    while (iterator.hasNext()) {
      Zm9j zm9j = (Zm9j)iterator.next();
      Zem4<Zm9j> zem41 = Zd(paramZbj5, zm9j);
      if (zem41.Zb(zem4))
        zem4 = zem41; 
      if (i == 0)
        break; 
    } 
    return (Zem4)zem4;
  }
  
  private <T extends Zm9j> Zem4<T> Zd(Zbj5 paramZbj5, T paramT) {
    Zbj5 zbj5 = ZW(paramZbj5, (Zm9j)paramT);
    if (zbj5 == null)
      return Zem4.Zy(); 
    int i = ZF(paramT.Zw(), zbj5);
    return Zem4.Zm(new Zt4r<>(paramT, zbj5, i));
  }
  
  private Zbj5 ZW(Zbj5 paramZbj5, Zm9j paramZm9j) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual Zj : ()Z
    //   4: istore #4
    //   6: aload_2
    //   7: invokevirtual Zw : ()Lburp/Zbj5;
    //   10: astore #5
    //   12: aload_1
    //   13: invokeinterface ZfJ : ()Lburp/Zlk0;
    //   18: invokevirtual ZE : ()Lburp/Zlk0;
    //   21: astore #6
    //   23: invokestatic Zm : ()I
    //   26: new java/util/ArrayList
    //   29: dup
    //   30: aload #5
    //   32: invokeinterface Zfz : ()Ljava/util/Collection;
    //   37: invokeinterface size : ()I
    //   42: invokespecial <init> : (I)V
    //   45: astore #7
    //   47: new java/util/PriorityQueue
    //   50: dup
    //   51: aload #5
    //   53: invokeinterface Zf4 : ()Ljava/util/Collection;
    //   58: invokespecial <init> : (Ljava/util/Collection;)V
    //   61: astore #8
    //   63: istore_3
    //   64: aload #5
    //   66: invokeinterface ZfG : ()I
    //   71: istore #9
    //   73: aload #8
    //   75: invokevirtual isEmpty : ()Z
    //   78: ifne -> 205
    //   81: aload #8
    //   83: invokevirtual poll : ()Ljava/lang/Object;
    //   86: checkcast burp/Zrho
    //   89: astore #10
    //   91: aload #7
    //   93: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   98: aload #10
    //   100: dup
    //   101: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   104: pop
    //   105: <illegal opcode> test : (Lburp/Zrho;)Ljava/util/function/Predicate;
    //   110: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   115: ifeq -> 121
    //   118: goto -> 73
    //   121: aload #6
    //   123: aload #10
    //   125: invokevirtual ZG : (Lburp/Zrho;)Z
    //   128: ifne -> 181
    //   131: iload #4
    //   133: ifne -> 140
    //   136: aconst_null
    //   137: goto -> 145
    //   140: aload #10
    //   142: invokestatic Zl : (Lburp/Zrho;)Lburp/Zrho;
    //   145: astore #10
    //   147: aload #10
    //   149: ifnull -> 164
    //   152: aload #8
    //   154: aload #10
    //   156: invokevirtual add : (Ljava/lang/Object;)Z
    //   159: pop
    //   160: iload_3
    //   161: ifne -> 73
    //   164: iinc #9, 1
    //   167: iload #9
    //   169: aload_0
    //   170: getfield Zt : Lburp/Zv0;
    //   173: invokevirtual Zn : ()I
    //   176: if_icmple -> 73
    //   179: aconst_null
    //   180: areturn
    //   181: aload #7
    //   183: aload #10
    //   185: invokeinterface add : (Ljava/lang/Object;)Z
    //   190: pop
    //   191: aload #6
    //   193: aload #10
    //   195: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   198: invokestatic Za : (Lburp/Zlk0;Ljava/util/Collection;)V
    //   201: iload_3
    //   202: ifne -> 73
    //   205: iload #4
    //   207: ifne -> 251
    //   210: aload #7
    //   212: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   217: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   222: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   227: invokeinterface count : ()J
    //   232: aload #5
    //   234: invokeinterface Zf4 : ()Ljava/util/Collection;
    //   239: invokeinterface size : ()I
    //   244: i2l
    //   245: lcmp
    //   246: ifeq -> 251
    //   249: aconst_null
    //   250: areturn
    //   251: aload #6
    //   253: aload_0
    //   254: getfield Zt : Lburp/Zv0;
    //   257: invokevirtual ZF : (Lburp/Zv0;)Z
    //   260: ifeq -> 265
    //   263: aconst_null
    //   264: areturn
    //   265: iload #9
    //   267: aload #6
    //   269: invokevirtual Zt : ()I
    //   272: invokestatic max : (II)I
    //   275: istore #9
    //   277: iload #9
    //   279: aload_0
    //   280: getfield Zt : Lburp/Zv0;
    //   283: invokevirtual Zn : ()I
    //   286: if_icmple -> 291
    //   289: aconst_null
    //   290: areturn
    //   291: aload_0
    //   292: aload #7
    //   294: invokevirtual ZT : (Ljava/util/List;)V
    //   297: aload_0
    //   298: aload #5
    //   300: invokeinterface Zf4 : ()Ljava/util/Collection;
    //   305: aload #7
    //   307: invokevirtual ZT : (Ljava/util/Collection;Ljava/util/List;)Lburp/Zlk0;
    //   310: astore #10
    //   312: aload #10
    //   314: aload_0
    //   315: getfield Zt : Lburp/Zv0;
    //   318: invokevirtual ZF : (Lburp/Zv0;)Z
    //   321: ifeq -> 326
    //   324: aconst_null
    //   325: areturn
    //   326: aload_0
    //   327: aload #5
    //   329: aload #6
    //   331: aload #10
    //   333: invokevirtual ZD : (Lburp/Zbj5;Lburp/Zlk0;Lburp/Zlk0;)I
    //   336: istore #11
    //   338: iload #11
    //   340: aload_1
    //   341: invokeinterface ZfG : ()I
    //   346: iadd
    //   347: aload_0
    //   348: getfield Zt : Lburp/Zv0;
    //   351: invokevirtual Zn : ()I
    //   354: if_icmple -> 359
    //   357: aconst_null
    //   358: areturn
    //   359: aload_0
    //   360: aload #7
    //   362: invokevirtual ZT : (Ljava/util/List;)V
    //   365: aload #7
    //   367: invokestatic sort : (Ljava/util/List;)V
    //   370: aload_1
    //   371: invokeinterface ZfU : ()Lburp/Zkmn;
    //   376: aload #5
    //   378: invokeinterface ZfU : ()Lburp/Zkmn;
    //   383: invokevirtual ZQ : (Lburp/Zkmn;)Lburp/Zkmn;
    //   386: aload_1
    //   387: invokeinterface Zf3 : ()Lburp/Zmvb;
    //   392: aload #5
    //   394: invokeinterface Zf3 : ()Lburp/Zmvb;
    //   399: invokevirtual ZK : (Lburp/Zmvb;)Lburp/Zmvb;
    //   402: aload #5
    //   404: invokeinterface ZfM : ()Lburp/Ze5n;
    //   409: aload #7
    //   411: iload #9
    //   413: invokestatic Zo : (Lburp/Zkmn;Lburp/Zmvb;Lburp/Ze5n;Ljava/util/List;I)Lburp/Zbj5;
    //   416: areturn
  }
  
  private int ZD(Zbj5 paramZbj5, Zlk0 paramZlk01, Zlk0 paramZlk02) {
    return (paramZbj5.Zfz().size() == 0) ? paramZlk01.Zt() : paramZlk02.Zt();
  }
  
  private Zlk0 ZT(Collection<Zrho> paramCollection, List<Zrho> paramList) {
    HashSet<Zeib> hashSet = new HashSet(paramList.size());
    Iterator<Zrho> iterator = paramList.iterator();
    int i = Zm9j.ZU();
    while (iterator.hasNext()) {
      Zrho zrho = iterator.next();
      hashSet.add(zrho.ZAl());
      if (i != 0)
        break; 
    } 
    List<Zeib> list = (List)paramCollection.stream().map(Zrho::ZAl).collect(Collectors.toList());
    Objects.requireNonNull(hashSet);
    list.removeIf(hashSet::contains);
    return Zlk0.Zn(list);
  }
  
  private int ZF(Zbj5 paramZbj51, Zbj5 paramZbj52) {
    return Integer.MAX_VALUE - Math.abs(Ze7v.ZV(paramZbj52) - Ze7v.ZV(paramZbj51));
  }
  
  private void ZT(List<Zrho> paramList) {
    LinkedHashSet<Zrho> linkedHashSet = new LinkedHashSet<>(paramList);
    paramList.clear();
    paramList.addAll(linkedHashSet);
  }
  
  private static boolean lambda$updateMatchingCriteriaToSupportMatchingDetails$1(Zrho paramZrho) {
    return (paramZrho.ZAA().Zm2() != Zz3o.SPECULATIVE);
  }
  
  private static boolean lambda$findMatch$0(Zbj5 paramZbj5, Zm9j paramZm9j) {
    return paramZm9j.Zw().ZfM().Zp(paramZbj5.ZfM());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzr_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */