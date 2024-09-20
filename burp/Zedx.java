package burp;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zedx {
  private final Zsiv ZC;
  
  private final Zr_4 Zp;
  
  private final Zz1m<Zt35> ZB;
  
  private final Zr69 ZX;
  
  Zedx(Zsiv paramZsiv, Zr_4 paramZr_4, Zz1m<Zt35> paramZz1m, Zr69 paramZr69) {
    this.ZC = paramZsiv;
    this.Zp = paramZr_4;
    this.ZB = paramZz1m;
    this.ZX = paramZr69;
  }
  
  void Zl(Zeu9 paramZeu9, Zbj5 paramZbj5, Set<Zgyy> paramSet) {
    this.ZX.ZD().Zy(Zrp6.DEBUG, Zlq7.UPDATE_DOORWAYS_ROOM, new Object[] { paramZeu9 });
    Set<Zgs_<Zrho>> set = (Set)paramZbj5.Zfz().stream().map(Zgs_::new).collect(Collectors.toCollection(java.util.LinkedHashSet::new));
    HashSet<Zrho> hashSet = new HashSet();
    LinkedList<Zl_> linkedList = new LinkedList<>(Zx(paramZeu9.ZHp(), set, hashSet));
    long l1 = linkedList.size();
    long l2 = paramZbj5.Zf4().size();
    Zbqc[] arrayOfZbqc = Zxf2.ZM();
    Zuh.Zb((l1 == l2), Zqf.Zr);
    paramZeu9.ZN(this.Zp.<Zttl>ZH(new Zev_(linkedList, new LinkedList<>(paramSet))));
    this.ZB.ZD(new Zxr8(Zt35.Ze, paramZeu9));
    if (Zbqc.Zwu() == null)
      Zxf2.ZH(new Zbqc[1]); 
  }
  
  private List<Zl_> Zx(Iterable<Zl_> paramIterable, Set<Zgs_<Zrho>> paramSet, Set<Zrho> paramSet1) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: invokestatic ZM : ()[Lburp/Zbqc;
    //   12: aload_1
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore #6
    //   20: astore #4
    //   22: aload #6
    //   24: invokeinterface hasNext : ()Z
    //   29: ifeq -> 238
    //   32: aload #6
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: checkcast burp/Zl_
    //   42: astore #7
    //   44: aload #7
    //   46: invokeinterface Zf2 : ()Lburp/Zxw8;
    //   51: invokeinterface ZaG : ()Lburp/Zrho;
    //   56: astore #8
    //   58: aload #8
    //   60: aload_2
    //   61: invokestatic Zf : (Lburp/Zrho;Ljava/util/Set;)Lburp/Zrho;
    //   64: astore #9
    //   66: aload #9
    //   68: ifnull -> 109
    //   71: aload #7
    //   73: invokeinterface Zf2 : ()Lburp/Zxw8;
    //   78: aload #9
    //   80: invokeinterface Zu : (Lburp/Zrho;)V
    //   85: aload #5
    //   87: aload #7
    //   89: invokeinterface add : (Ljava/lang/Object;)Z
    //   94: pop
    //   95: aload_3
    //   96: aload #9
    //   98: invokeinterface add : (Ljava/lang/Object;)Z
    //   103: pop
    //   104: aload #4
    //   106: ifnull -> 233
    //   109: aload_0
    //   110: getfield ZX : Lburp/Zr69;
    //   113: invokeinterface ZX : ()Lburp/Zv0;
    //   118: aload #7
    //   120: invokeinterface Zfy : ()Lburp/Zm6i;
    //   125: invokeinterface Zm2 : ()Lburp/Zz3o;
    //   130: invokevirtual Zr : (Lburp/Zz3o;)Z
    //   133: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   136: lconst_1
    //   137: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   140: aload_0
    //   141: getfield ZX : Lburp/Zr69;
    //   144: invokeinterface ZD : ()Lburp/Zmv7;
    //   149: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   152: getstatic burp/Zlq7.DELETE_DOORWAY : Lburp/Zlq7;
    //   155: iconst_1
    //   156: anewarray java/lang/Object
    //   159: dup
    //   160: iconst_0
    //   161: aload #7
    //   163: aastore
    //   164: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   169: aload_3
    //   170: aload #8
    //   172: invokeinterface contains : (Ljava/lang/Object;)Z
    //   177: ifeq -> 209
    //   180: aload_0
    //   181: getfield ZX : Lburp/Zr69;
    //   184: invokeinterface ZD : ()Lburp/Zmv7;
    //   189: getstatic burp/Zrp6.INFO : Lburp/Zrp6;
    //   192: getstatic burp/Zlq7.MATCHER_CLASH : Lburp/Zlq7;
    //   195: iconst_1
    //   196: anewarray java/lang/Object
    //   199: dup
    //   200: iconst_0
    //   201: aload #8
    //   203: aastore
    //   204: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   209: aload_0
    //   210: getfield ZC : Lburp/Zsiv;
    //   213: aload #7
    //   215: aload_0
    //   216: getfield ZB : Lburp/Zz1m;
    //   219: aload_0
    //   220: getfield ZX : Lburp/Zr69;
    //   223: invokeinterface ZD : ()Lburp/Zmv7;
    //   228: invokeinterface ZF : (Lburp/Zl_;Lburp/Zz1m;Lburp/Zmv7;)V
    //   233: aload #4
    //   235: ifnull -> 22
    //   238: aload #5
    //   240: areturn
  }
  
  private static Zrho Zf(Zrho paramZrho, Set<Zgs_<Zrho>> paramSet) {
    for (Zrho zrho = paramZrho;; zrho = Ztfy.Zl(zrho)) {
      if (zrho == null)
        return null; 
      if (paramSet.remove(new Zgs_<>(zrho)))
        return zrho; 
      Zrho zrho1 = zrho;
      Optional<Zrho> optional = paramSet.stream().map(Zgs_::Ze).filter(zrho1::lambda$findUpdatedMatcher$0).findFirst();
      if (optional.isPresent()) {
        paramSet.remove(new Zgs_<>(optional.get()));
        return optional.get();
      } 
    } 
  }
  
  private static boolean lambda$findUpdatedMatcher$0(Zrho paramZrho1, Zrho paramZrho2) {
    return (paramZrho2.ZE(paramZrho1) && paramZrho2.ZAA().Zm2() == paramZrho1.ZAA().Zm2());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zedx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */