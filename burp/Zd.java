package burp;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zd {
  private static final Set<String> Zt;
  
  private static final Set<String> Zy;
  
  private static final Set<String> ZE;
  
  private static final Set<String> ZJ;
  
  private final List<Map<String, String>> ZC;
  
  private final List<Zzub> Zo;
  
  private final List<Zl1r> ZB;
  
  private boolean ZK;
  
  private boolean Zd;
  
  private boolean ZT;
  
  private boolean ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zd(Zs68 paramZs68) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZK : ()Z
    //   7: aload_0
    //   8: new java/util/ArrayList
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: putfield ZC : Ljava/util/List;
    //   18: aload_0
    //   19: new java/util/ArrayList
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: putfield Zo : Ljava/util/List;
    //   29: istore_2
    //   30: aload_0
    //   31: new java/util/ArrayList
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: putfield ZB : Ljava/util/List;
    //   41: aload_0
    //   42: iconst_0
    //   43: putfield ZK : Z
    //   46: aload_0
    //   47: iconst_0
    //   48: putfield Zd : Z
    //   51: aload_0
    //   52: iconst_0
    //   53: putfield ZT : Z
    //   56: aload_0
    //   57: iconst_0
    //   58: putfield ZS : Z
    //   61: aload_1
    //   62: getfield Zd : Ljava/util/List;
    //   65: ifnonnull -> 74
    //   68: invokestatic emptyList : ()Ljava/util/List;
    //   71: goto -> 118
    //   74: aload_1
    //   75: getfield Zd : Ljava/util/List;
    //   78: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   83: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   88: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   93: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   98: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   103: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   108: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   113: invokeinterface toList : ()Ljava/util/List;
    //   118: astore_3
    //   119: aload_3
    //   120: invokeinterface iterator : ()Ljava/util/Iterator;
    //   125: astore #4
    //   127: aload #4
    //   129: invokeinterface hasNext : ()Z
    //   134: ifeq -> 183
    //   137: aload #4
    //   139: invokeinterface next : ()Ljava/lang/Object;
    //   144: checkcast burp/Zs_e
    //   147: astore #5
    //   149: aload_0
    //   150: aload #5
    //   152: invokevirtual ZdP : ()Ljava/lang/String;
    //   155: invokevirtual Zy : (Ljava/lang/String;)V
    //   158: aload_0
    //   159: aload #5
    //   161: invokevirtual Zdx : ()I
    //   164: aload #5
    //   166: invokevirtual ZdW : ()I
    //   169: invokevirtual ZG : (II)V
    //   172: iload_2
    //   173: ifeq -> 127
    //   176: iconst_2
    //   177: anewarray burp/Zbqc
    //   180: invokestatic Zr : ([Lburp/Zbqc;)V
    //   183: iconst_0
    //   184: istore #4
    //   186: iload #4
    //   188: aload_1
    //   189: invokevirtual Zy : ()Ljava/util/List;
    //   192: invokeinterface size : ()I
    //   197: if_icmpge -> 452
    //   200: aload_1
    //   201: invokevirtual Zy : ()Ljava/util/List;
    //   204: iload #4
    //   206: invokeinterface get : (I)Ljava/lang/Object;
    //   211: checkcast java/lang/String
    //   214: astore #5
    //   216: aload_1
    //   217: getfield ZR : Ljava/util/List;
    //   220: iload #4
    //   222: invokeinterface get : (I)Ljava/lang/Object;
    //   227: checkcast java/lang/Integer
    //   230: astore #6
    //   232: iload #4
    //   234: aload_1
    //   235: invokevirtual Zy : ()Ljava/util/List;
    //   238: invokeinterface size : ()I
    //   243: iconst_1
    //   244: isub
    //   245: if_icmpge -> 270
    //   248: aload_1
    //   249: getfield ZR : Ljava/util/List;
    //   252: iload #4
    //   254: iconst_1
    //   255: iadd
    //   256: invokeinterface get : (I)Ljava/lang/Object;
    //   261: checkcast java/lang/Integer
    //   264: invokevirtual intValue : ()I
    //   267: goto -> 274
    //   270: aload_1
    //   271: invokevirtual Zh : ()I
    //   274: istore #7
    //   276: sipush #27388
    //   279: aload #5
    //   281: ldc ':'
    //   283: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   286: astore #8
    //   288: sipush #230
    //   291: aload #8
    //   293: iconst_0
    //   294: aaload
    //   295: invokevirtual strip : ()Ljava/lang/String;
    //   298: astore #9
    //   300: invokestatic a : (II)Ljava/lang/String;
    //   303: aload #9
    //   305: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   308: ifeq -> 316
    //   311: aload_0
    //   312: iconst_1
    //   313: putfield ZK : Z
    //   316: sipush #27269
    //   319: sipush #-26725
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: aload #9
    //   327: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   330: ifeq -> 342
    //   333: aload_0
    //   334: iconst_1
    //   335: putfield ZT : Z
    //   338: iload_2
    //   339: ifeq -> 445
    //   342: aload #8
    //   344: arraylength
    //   345: iconst_1
    //   346: if_icmple -> 445
    //   349: sipush #27326
    //   352: sipush #-30110
    //   355: invokestatic a : (II)Ljava/lang/String;
    //   358: aload #9
    //   360: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   363: ifeq -> 445
    //   366: aload #5
    //   368: aload #5
    //   370: ldc ':'
    //   372: invokevirtual indexOf : (Ljava/lang/String;)I
    //   375: iconst_1
    //   376: iadd
    //   377: invokevirtual substring : (I)Ljava/lang/String;
    //   380: invokevirtual trim : ()Ljava/lang/String;
    //   383: astore #10
    //   385: aload_0
    //   386: dup
    //   387: getfield Zd : Z
    //   390: aload #10
    //   392: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   395: sipush #27311
    //   398: sipush #29222
    //   401: invokestatic a : (II)Ljava/lang/String;
    //   404: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   407: ior
    //   408: putfield Zd : Z
    //   411: aload_0
    //   412: aload #10
    //   414: invokevirtual Zy : (Ljava/lang/String;)V
    //   417: aload_0
    //   418: aload #6
    //   420: invokevirtual intValue : ()I
    //   423: sipush #27377
    //   426: sipush #13810
    //   429: invokestatic a : (II)Ljava/lang/String;
    //   432: invokevirtual length : ()I
    //   435: iadd
    //   436: iconst_2
    //   437: iadd
    //   438: iload #7
    //   440: iconst_2
    //   441: isub
    //   442: invokevirtual ZG : (II)V
    //   445: iinc #4, 1
    //   448: iload_2
    //   449: ifeq -> 186
    //   452: return
  }
  
  public List<Zl1r> ZP() {
    return this.ZB;
  }
  
  public boolean ZY() {
    return this.ZC.isEmpty();
  }
  
  public boolean Zc() {
    return this.ZS;
  }
  
  public boolean ZZ() {
    return this.ZT;
  }
  
  public boolean Zx() {
    return !this.Zo.isEmpty();
  }
  
  public List<Zzub> Zh() {
    return this.Zo;
  }
  
  public boolean ZT() {
    return (Zy(Zc(a(27387, 7942)), a(27359, 2982)) || Zy(Zc(a(27356, -25814)), a(27359, 2982)) || Zy(Zc(a(27293, 3315)), a(27359, 2982)));
  }
  
  public boolean ZB() {
    return ZW(Zd::Zo);
  }
  
  public boolean Zi() {
    return ZW(Zd::ZW);
  }
  
  public boolean ZL() {
    return this.ZK;
  }
  
  public boolean ZQ() {
    return !ZF(a(27335, 3104)).isEmpty();
  }
  
  public boolean Zn() {
    return this.Zd;
  }
  
  public boolean Zu() {
    return Zo(Zc(a(27335, 3104)));
  }
  
  public boolean Zs() {
    return (Zu() || ZH(Zc(a(27335, 3104))));
  }
  
  public boolean ZF() {
    return Zo(Zc(a(27353, -5712)));
  }
  
  public boolean Zr() {
    return !Zc(a(27309, -7069)).isEmpty();
  }
  
  public boolean Zg() {
    boolean bool = Zxzx.ZK();
    for (Map<String, String> map : this.ZC) {
      for (Map.Entry entry : map.entrySet()) {
        if (((String)entry.getKey()).equalsIgnoreCase(a(27330, 11061))) {
          String[] arrayOfString = ((String)entry.getValue()).split(a(27380, 16709));
          int i = arrayOfString.length;
          byte b = 0;
          while (b < i) {
            String str1 = arrayOfString[b];
            String str2 = str1.replace("'", "").trim();
            if (str2.startsWith(a(27332, -30245)) && str2.length() < 14)
              return true; 
            b++;
            if (bool)
              break; 
          } 
        } 
        if (bool)
          break; 
      } 
      if (bool)
        break; 
    } 
    return false;
  }
  
  public boolean ZD() {
    boolean bool = Zxzx.Zk();
    for (Map<String, String> map : this.ZC) {
      for (Map.Entry entry : map.entrySet()) {
        if (((String)entry.getKey()).equalsIgnoreCase(a(27387, 7942))) {
          String[] arrayOfString = ((String)entry.getValue()).split(a(27380, 16709));
          int i = arrayOfString.length;
          byte b = 0;
          while (b < i) {
            String str1 = arrayOfString[b];
            String str2 = str1.replace("'", "").trim();
            if (str2.startsWith(a(27297, 9198)) && str2.length() < 14)
              return true; 
            b++;
            if (!bool)
              break; 
          } 
        } 
        if (!bool)
          break; 
      } 
      if (!bool)
        break; 
    } 
    return false;
  }
  
  private void ZG(int paramInt1, int paramInt2) {
    this.ZB.add(new Zl1r(paramInt1, paramInt2));
  }
  
  private static boolean Zy(List<String> paramList, String paramString) {
    return (!paramList.isEmpty() && paramList.stream().anyMatch(paramString::lambda$isUnsafeWithoutMitigation$3));
  }
  
  private static boolean Zb(String paramString1, String paramString2) {
    String[] arrayOfString = paramString1.trim().split(a(27380, 16709));
    return Arrays.<String>stream(arrayOfString).anyMatch(paramString2::lambda$hasValue$4);
  }
  
  public boolean Zl() {
    return (Zy(Zc(a(27329, 29106)), a(27271, -26134)) || Zy(Zc(a(27327, -7667)), a(27359, 2982)) || Zy(Zc(a(27277, 20441)), a(27359, 2982)));
  }
  
  public boolean ZM() {
    return (Zy(Zc(a(27329, 29106)), a(27312, 27638)) || Zy(Zc(a(27327, -7667)), a(27312, 27638)) || Zy(Zc(a(27277, 20441)), a(27312, 27638)));
  }
  
  public boolean Zo() {
    return (ZW() || Zs(Zd::ZH));
  }
  
  public boolean ZW() {
    return Zs(Zd::Zo);
  }
  
  public boolean Zb() {
    return Zs(Zd::ZW);
  }
  
  private boolean Zs(Predicate<List<String>> paramPredicate) {
    if (ZY())
      return false; 
    List<String> list1 = Zc(a(27329, 29106));
    boolean bool = !list1.isEmpty() ? true : false;
    List<String> list2 = Zc(a(27277, 20441));
    List<String> list3 = Zc(a(27327, -7667));
    return (bool && paramPredicate.test(list1)) ? true : (((!bool && (list2.isEmpty() || list3.isEmpty())) || (!list2.isEmpty() && paramPredicate.test(list2)) || (!list3.isEmpty() && paramPredicate.test(list3))));
  }
  
  private boolean ZW(Predicate<List<String>> paramPredicate) {
    if (ZY())
      return false; 
    List<String> list1 = Zc(a(27387, 7942));
    boolean bool = !list1.isEmpty() ? true : false;
    List<String> list2 = Zc(a(27293, 3315));
    List<String> list3 = Zc(a(27356, -25814));
    return (bool && paramPredicate.test(list1)) ? true : (((!bool && (list2.isEmpty() || list3.isEmpty())) || (!list2.isEmpty() && paramPredicate.test(list2)) || (!list3.isEmpty() && paramPredicate.test(list3))));
  }
  
  private List<String> Zc(String paramString) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<Map<String, String>> iterator = this.ZC.iterator();
    boolean bool = Zxzx.ZK();
    while (iterator.hasNext()) {
      Map map = iterator.next();
      String str = (String)map.get(paramString.toLowerCase());
      if (str == null)
        str = (String)map.get(a(27317, -7647)); 
      if (str != null)
        arrayList.add(str); 
      if (bool)
        break; 
    } 
    return arrayList;
  }
  
  private List<String> ZF(String paramString) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<Map<String, String>> iterator = this.ZC.iterator();
    boolean bool = Zxzx.Zk();
    while (iterator.hasNext()) {
      Map map = iterator.next();
      String str = (String)map.get(paramString.toLowerCase());
      if (str != null)
        arrayList.add(str); 
      if (!bool)
        break; 
    } 
    return arrayList;
  }
  
  private static boolean Zo(List<String> paramList) {
    return paramList.stream().allMatch(Zd::ZO);
  }
  
  private static boolean ZW(List<String> paramList) {
    return paramList.stream().allMatch(Zd::ZA);
  }
  
  private static boolean ZH(List<String> paramList) {
    return paramList.stream().allMatch(Zd::ZJ);
  }
  
  private static boolean ZO(String paramString) {
    String[] arrayOfString = paramString.trim().split(a(27380, 16709));
    return Arrays.<String>stream(arrayOfString).map(Zd::lambda$isAnyHost$5).anyMatch(Zd::lambda$isAnyHost$6);
  }
  
  private static boolean ZA(String paramString) {
    String[] arrayOfString = paramString.trim().split(a(27337, 3579));
    return Arrays.<String>stream(arrayOfString).map(Zd::lambda$isAnyHost$5).anyMatch(Zd::lambda$isDataPermitted$8);
  }
  
  private static boolean ZJ(String paramString) {
    String[] arrayOfString = paramString.trim().split(a(27380, 16709));
    return Arrays.<String>stream(arrayOfString).map(Zd::lambda$isAnyHost$5).anyMatch(Zd::ZE);
  }
  
  private static boolean Zp(String paramString) {
    return (paramString.contains(a(27325, -14478)) || paramString.contains(a(27275, 16649)) || paramString.contains(a(27305, 5079)) || paramString.contains(a(27307, 27473)));
  }
  
  private void Zy(String paramString) {
    boolean bool = Zxzx.ZK();
    if (paramString.isBlank()) {
      this.ZS = true;
      return;
    } 
    HashMap<Object, Object> hashMap = new HashMap<>();
    String[] arrayOfString = paramString.split(";");
    int i = arrayOfString.length;
    byte b = 0;
    while (b < i) {
      String str1 = arrayOfString[b];
      String[] arrayOfString1 = str1.trim().split(" ", 2);
      String str2 = arrayOfString1[0].trim().toLowerCase();
      String str3 = (arrayOfString1.length > 1) ? arrayOfString1[1].trim() : null;
      if (Zv(paramString, str2) && ZY(paramString, str2, str3) && str3 != null)
        hashMap.put(str2, str3); 
      b++;
      if (bool)
        break; 
    } 
    this.ZC.add(hashMap);
  }
  
  private boolean ZY(String paramString1, String paramString2, String paramString3) {
    // Byte code:
    //   0: invokestatic Zk : ()Z
    //   3: istore #4
    //   5: getstatic burp/Zd.Zy : Ljava/util/Set;
    //   8: aload_2
    //   9: invokeinterface contains : (Ljava/lang/Object;)Z
    //   14: ifeq -> 55
    //   17: aload_3
    //   18: ifnull -> 53
    //   21: aload_0
    //   22: aload_1
    //   23: aload_2
    //   24: sipush #27375
    //   27: sipush #15134
    //   30: invokestatic a : (II)Ljava/lang/String;
    //   33: swap
    //   34: sipush #27360
    //   37: sipush #-25894
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   48: invokevirtual Zq : (Ljava/lang/String;Ljava/lang/String;)V
    //   51: iconst_0
    //   52: ireturn
    //   53: iconst_1
    //   54: ireturn
    //   55: aload_3
    //   56: ifnonnull -> 105
    //   59: getstatic burp/Zd.ZE : Ljava/util/Set;
    //   62: aload_2
    //   63: invokeinterface contains : (Ljava/lang/Object;)Z
    //   68: ifeq -> 73
    //   71: iconst_1
    //   72: ireturn
    //   73: aload_0
    //   74: aload_1
    //   75: aload_2
    //   76: sipush #27375
    //   79: sipush #15134
    //   82: invokestatic a : (II)Ljava/lang/String;
    //   85: swap
    //   86: sipush #27383
    //   89: sipush #21045
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   100: invokevirtual Zq : (Ljava/lang/String;Ljava/lang/String;)V
    //   103: iconst_0
    //   104: ireturn
    //   105: aload_2
    //   106: astore #5
    //   108: iconst_m1
    //   109: istore #6
    //   111: aload #5
    //   113: invokevirtual hashCode : ()I
    //   116: lookupswitch default -> 255, -353376844 -> 210, 1715926455 -> 185, 1865400007 -> 235, 1930220883 -> 160
    //   160: aload #5
    //   162: sipush #27278
    //   165: sipush #26544
    //   168: invokestatic a : (II)Ljava/lang/String;
    //   171: invokevirtual equals : (Ljava/lang/Object;)Z
    //   174: ifeq -> 255
    //   177: iconst_0
    //   178: istore #6
    //   180: iload #4
    //   182: ifne -> 255
    //   185: aload #5
    //   187: sipush #27298
    //   190: sipush #-27096
    //   193: invokestatic a : (II)Ljava/lang/String;
    //   196: invokevirtual equals : (Ljava/lang/Object;)Z
    //   199: ifeq -> 255
    //   202: iconst_1
    //   203: istore #6
    //   205: iload #4
    //   207: ifne -> 255
    //   210: aload #5
    //   212: sipush #27368
    //   215: sipush #27357
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: invokevirtual equals : (Ljava/lang/Object;)Z
    //   224: ifeq -> 255
    //   227: iconst_2
    //   228: istore #6
    //   230: iload #4
    //   232: ifne -> 255
    //   235: aload #5
    //   237: sipush #27336
    //   240: sipush #-16460
    //   243: invokestatic a : (II)Ljava/lang/String;
    //   246: invokevirtual equals : (Ljava/lang/Object;)Z
    //   249: ifeq -> 255
    //   252: iconst_3
    //   253: istore #6
    //   255: iload #6
    //   257: tableswitch default -> 420, 0 -> 288, 1 -> 297, 2 -> 354, 3 -> 411
    //   288: aload_0
    //   289: aload_1
    //   290: aload_3
    //   291: invokevirtual Zh : (Ljava/lang/String;Ljava/lang/String;)Z
    //   294: goto -> 577
    //   297: aload_3
    //   298: sipush #27350
    //   301: sipush #27981
    //   304: invokestatic a : (II)Ljava/lang/String;
    //   307: invokevirtual equals : (Ljava/lang/Object;)Z
    //   310: ifne -> 350
    //   313: aload_0
    //   314: aload_1
    //   315: aload_2
    //   316: aload_3
    //   317: sipush #27375
    //   320: sipush #15134
    //   323: invokestatic a : (II)Ljava/lang/String;
    //   326: dup_x2
    //   327: pop
    //   328: sipush #27323
    //   331: sipush #-24236
    //   334: invokestatic a : (II)Ljava/lang/String;
    //   337: swap
    //   338: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   343: invokevirtual Zq : (Ljava/lang/String;Ljava/lang/String;)V
    //   346: iconst_0
    //   347: goto -> 577
    //   350: iconst_1
    //   351: goto -> 577
    //   354: aload_3
    //   355: sipush #27266
    //   358: sipush #10938
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: invokevirtual matches : (Ljava/lang/String;)Z
    //   367: ifne -> 407
    //   370: aload_0
    //   371: aload_1
    //   372: aload_2
    //   373: aload_3
    //   374: sipush #27375
    //   377: sipush #15134
    //   380: invokestatic a : (II)Ljava/lang/String;
    //   383: dup_x2
    //   384: pop
    //   385: sipush #27291
    //   388: sipush #2020
    //   391: invokestatic a : (II)Ljava/lang/String;
    //   394: swap
    //   395: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   400: invokevirtual Zq : (Ljava/lang/String;Ljava/lang/String;)V
    //   403: iconst_0
    //   404: goto -> 577
    //   407: iconst_1
    //   408: goto -> 577
    //   411: aload_0
    //   412: aload_1
    //   413: aload_3
    //   414: invokevirtual ZB : (Ljava/lang/String;Ljava/lang/String;)Z
    //   417: goto -> 577
    //   420: iconst_1
    //   421: istore #7
    //   423: aload_3
    //   424: invokevirtual trim : ()Ljava/lang/String;
    //   427: sipush #27380
    //   430: sipush #16709
    //   433: invokestatic a : (II)Ljava/lang/String;
    //   436: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   439: astore #8
    //   441: aload #8
    //   443: astore #9
    //   445: aload #9
    //   447: arraylength
    //   448: istore #10
    //   450: iconst_0
    //   451: istore #11
    //   453: iload #11
    //   455: iload #10
    //   457: if_icmpge -> 572
    //   460: aload #9
    //   462: iload #11
    //   464: aaload
    //   465: astore #12
    //   467: iconst_0
    //   468: istore #13
    //   470: aload #12
    //   472: ldc '''
    //   474: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   477: ifeq -> 551
    //   480: aload #12
    //   482: sipush #27351
    //   485: sipush #-3111
    //   488: invokestatic a : (II)Ljava/lang/String;
    //   491: invokevirtual matches : (Ljava/lang/String;)Z
    //   494: ifne -> 534
    //   497: aload_0
    //   498: aload_1
    //   499: aload_2
    //   500: aload #12
    //   502: sipush #27375
    //   505: sipush #15134
    //   508: invokestatic a : (II)Ljava/lang/String;
    //   511: dup_x2
    //   512: pop
    //   513: sipush #27391
    //   516: sipush #-31977
    //   519: invokestatic a : (II)Ljava/lang/String;
    //   522: swap
    //   523: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   528: invokevirtual Zq : (Ljava/lang/String;Ljava/lang/String;)V
    //   531: iconst_0
    //   532: istore #7
    //   534: aload #12
    //   536: ldc '''
    //   538: ldc ''
    //   540: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   543: invokevirtual trim : ()Ljava/lang/String;
    //   546: astore #12
    //   548: iconst_1
    //   549: istore #13
    //   551: aload_0
    //   552: aload_1
    //   553: aload_2
    //   554: aload #12
    //   556: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   559: iload #13
    //   561: invokevirtual ZF : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //   564: iinc #11, 1
    //   567: iload #4
    //   569: ifne -> 453
    //   572: iload #7
    //   574: goto -> 577
    //   577: ireturn
  }
  
  private boolean ZB(String paramString1, String paramString2) {
    String[] arrayOfString1 = paramString2.trim().split(a(27380, 16709));
    String[] arrayOfString2 = arrayOfString1;
    int i = arrayOfString2.length;
    boolean bool = Zxzx.ZK();
    byte b = 0;
    while (b < i) {
      String str = arrayOfString2[b];
      if (!ZJ.contains(str)) {
        Zq(paramString1, a(27272, -15545) + a(27272, -15545));
        return false;
      } 
      b++;
      if (bool)
        break; 
    } 
    return true;
  }
  
  private boolean Zh(String paramString1, String paramString2) {
    try {
      new URI(paramString2);
    } catch (URISyntaxException uRISyntaxException) {
      Zah.Zl(uRISyntaxException, Zk_.IGNORED);
      Zq(paramString1, a(27384, -32590) + a(27384, -32590));
      return false;
    } 
    return true;
  }
  
  private void ZF(String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    if (!ZV(paramString1, paramString2, paramString3, paramBoolean) && !Z_(paramString3) && !ZE(paramString3) && !ZX(paramString1, paramString2, paramString3, paramBoolean) && !Zs(paramString1, paramString2, paramString3, paramBoolean)) {
      a(27333, -29012);
      Zq(paramString1, a(27333, -29012) + a(27333, -29012) + paramString2 + a(27302, 17317));
    } 
  }
  
  private boolean Zs(String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    if (paramString3.matches(a(27369, -18842)) || paramString3.matches(a(27324, 28937)) || paramString3.matches(a(27345, -2491))) {
      if (paramBoolean)
        return true; 
      a(27375, 15134);
      Zq(paramString1, a(27375, 15134) + a(27375, 15134) + paramString2 + a(27304, 26460) + paramString3);
    } 
    return false;
  }
  
  private boolean ZX(String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    if (paramString3.startsWith(a(27297, 9198))) {
      if (paramBoolean)
        return true; 
      a(27375, 15134);
      Zq(paramString1, a(27375, 15134) + a(27375, 15134) + paramString2 + a(27344, -25884) + paramString3);
    } 
    return false;
  }
  
  private static boolean ZE(String paramString) {
    String str1 = a(27367, -13134);
    String str2 = a(27379, -7086);
    "(";
    String str3 = "(" + "(" + str1 + a(27361, -3991) + str2;
    return (paramString.equals("*") || paramString.matches(str3));
  }
  
  private boolean Z_(String paramString) {
    if (paramString.endsWith(a(27265, -17910)))
      paramString = paramString.replace(a(27355, 21009), ""); 
    return paramString.matches(a(27300, 7233)) ? true : Set.<String>of(a(27365, 8210), a(27371, 12840), a(27331, -8545), a(27294, 11567), a(27342, -28330), a(27319, -5414), a(27273, 8841), a(27320, -12810), a(27341, 3763)).contains(paramString);
  }
  
  private boolean ZV(String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    if (Set.<String>of(a(27354, 1030), a(27378, 29403), a(27359, 2982), a(27292, 9543), a(27301, 27112), a(27310, 645), a(27321, -30697), a(27276, 13600)).contains(paramString3)) {
      if (paramBoolean)
        return true; 
      a(27375, 15134);
      Zq(paramString1, a(27375, 15134) + a(27375, 15134) + paramString2 + a(27304, 26460) + paramString3);
    } 
    return false;
  }
  
  private boolean Zv(String paramString1, String paramString2) {
    if (!Zt.contains(paramString2.toLowerCase())) {
      Zq(paramString1, a(27339, -12197) + a(27339, -12197));
      return false;
    } 
    return true;
  }
  
  private void Zq(String paramString1, String paramString2) {
    this.Zo.add(new Zzub(paramString1, paramString2));
  }
  
  private static boolean lambda$isDataPermitted$8(String paramString) {
    return paramString.startsWith(a(27315, -7050));
  }
  
  private static boolean lambda$isAnyHost$6(String paramString) {
    return paramString.matches(a(27382, 3160));
  }
  
  private static String lambda$isAnyHost$5(String paramString) {
    return paramString.replace("'", "");
  }
  
  private static boolean lambda$hasValue$4(String paramString1, String paramString2) {
    return paramString1.equalsIgnoreCase(paramString2.replace("'", "").trim());
  }
  
  private static boolean lambda$isUnsafeWithoutMitigation$3(String paramString1, String paramString2) {
    return (Zb(paramString2, paramString1) && !Zp(paramString2));
  }
  
  private static Zs_e lambda$new$2(Ztu8 paramZtu8) {
    Zs5n zs5n = paramZtu8.ZlP().ZIm(a(27343, 21687));
    return new Zs_e(zs5n.ZQG().trim(), zs5n.ZQs(), zs5n.ZQc());
  }
  
  private static boolean lambda$new$1(Ztu8 paramZtu8) {
    return a(27377, 13810).equalsIgnoreCase(paramZtu8.ZlP().ZI2(a(27322, 5857)));
  }
  
  private static boolean lambda$new$0(Ztu8 paramZtu8) {
    return paramZtu8.ZJG(a(27338, 19728));
  }
  
  static {
    // Byte code:
    //   0: bipush #120
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'KÕ¾øzF¿Iq!¨>yTß\\ncUÛ\\t¡6ä3!Ã_\\ffXô \\t£k¨6i'L©ln:T ^~¯¸dSçÙ «ÿTÂ¾M\\neXÜ­æÚÇ\\n¹òE°úÁqm*]\\r|åÏä¡óç>b´`Æ¡¬.%oZ|®ÒÔTù~æE¾9 O¤"G·Ýd§þ +>lµ­éîD6\¼ïàlRèÇõ¤ïBÀwPcÓõ.G°õlÕÐ£¦¬6In2^A6|I\\f ,w@¬3üÞ½E Õ=¥7/9.g\\fÐxÌ³ßy¤\\b³Ù.úµj(½\B\fÞÈ3éÅ*ÇO$¢Ùùµ<ÿBZË+ÙÝínÌ9ïkåßä\\t{n\\bp"ª¦Â,ëJwÄÓÕ¬\\n´á¸ÔÏ|wm×­w=è³yÓ ªSlýTúVÄ1Bp ¾ôê|e×aHÄía«[¡-¾ötú¢4#ýhð3mô®tÅæî!¹N<ßÎ-ð£Á$o\öCÇÎ*Û\\nLUôR«¿*ü '1Ù\\bâmÁ\\fÀª\\foÚÖZq²Zrÿ0º»PQi.{$zÞ¶¯\\rÚ,\\n¤ÁM¿ ý&,N¾íª¡¶ë\\nøHî¹prz.AÇköîIW¸ÜÅ]@zÁß÷ÕöË¡óºF>à<|=\\n°WyY¡ÉOõ²²E\\fÚ¢ }\\nB¤»¡ë³Vø(àM¡tÎ:$ãç4.ÑK\\n·&]IH§ë\\n|âý²íevsrÜ9VwB¹J®KÌ-ÃÿWówG½M»K§=Z5fG2¬ú5ü¹>ÈÁµèªaËAýkà=l¸cü@Må\\b-ìY\\r#ówbðÛ1=ÎÊ Ûâñ°ÆÓZY@sãy)l\\r:q°¼¢j,­¾ñð8@çà ú¾¤D,tüx¶Ï³}RÎe91#¹®½¾,£fÍlî=!jjÆÀeÌkJëSùÒ¿¦§½µÝÑæã ·àP\\b¢ðNÉEÔã²¼r4ùE¡\\fmÂò\\b.)ð·õaÜiq¦îmfë-ìõÊ.èU\\nÚEma\\tÆ";ÕDÐ\\nJÇ\\r¸q: i|ZÝf¹Õ-÷\\bÝ\·'UeQ\\b>ðLùïÒU×s¿²s¢«xÑÜj@Á¼DÅ À\\b½æóñí.%\\fÍ2§±æÏvNý.x^ÂÚ\\t3^Qó¬ñÍ4_Ê¼[iØiAwâ}eü\\rZÉ¨%ÒYÏ¡ý\\bÏ¶¨dbAG9ÿ ¹^öì~Ppô¦#\\tCa/tzK6eëûÉGÙÛpcÓ½0ô-Ã¿·Ê³YÔF¾ØªmÍÛÊú\\bj·ªcò#TÄüØ§nÒr!c´Í(Ú%yó±Ãë_=¥â/¯L,ÌYÒÊªC®>Wá\\rDêÍ§yr\\rÕ¶Kx(ö±0é7:8r«ð}Y¡'=¥{/u$æóèõ2Yæ¡g\\nÔÍCß³4Vúnärs%¡ºÓ©/ÜvkN[r]%w¹^)Ø«ù7äí !ùHKE]Ù6BÅ¢ñKµì²Ô\\bfÐ\\ra OÿÉ|\\rk[áå»+õeÁÝ\\f´!ñ#4¼óh"±âNY§åêÒ <9ôìm¨PÊèr¬0N\\rÔ¡ \\fÍdÈÌAÜRð`øzk*\\b°sø<È©L1`ÒÂq«ä2:á Çþoæ'DÃ÷ Â5Í7·¾\\bÆý>(4\\t\\tU#3fm§©3 ßÐ¼øÕÀ©\\r~G^ºk|ðcpqúú&â{c3)P0Æ{\\fF¥\\rô\\n@«Ø¦\\tt\\f ¯"§8\\të¢­¡\\b-¡§\\r¨ÈäYÇbã¶cWM& mõÇ"Wt¢·Q¡º.  #WfÀÅ²±[¤h~DÝÆbl3t:\\tP|÷ØÛp\\fÄ~ª¸!ÙL$Íý\\rl¹£ý³t£:íysí®\\tÀîPáòùÜÛö:L\\f¯µü«®nå6Ú\\tÄ\AÎôBeØS4^\\räF<lPÝ\\fê)²_&#ÜX^è:EM%éD%i¼ØP-/´b'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #27
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #48
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'mOBÎ76ðÞóÎóY''
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #11
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #34
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zd.a : [Ljava/lang/String;
    //   132: bipush #120
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zd.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #63
    //   214: goto -> 244
    //   217: bipush #10
    //   219: goto -> 244
    //   222: bipush #77
    //   224: goto -> 244
    //   227: bipush #36
    //   229: goto -> 244
    //   232: bipush #46
    //   234: goto -> 244
    //   237: bipush #93
    //   239: goto -> 244
    //   242: bipush #66
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: bipush #30
    //   302: anewarray java/lang/String
    //   305: dup
    //   306: iconst_0
    //   307: sipush #27313
    //   310: sipush #6296
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: aastore
    //   317: dup
    //   318: iconst_1
    //   319: sipush #27346
    //   322: sipush #28788
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: aastore
    //   329: dup
    //   330: iconst_2
    //   331: sipush #27349
    //   334: sipush #19613
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: aastore
    //   341: dup
    //   342: iconst_3
    //   343: sipush #27295
    //   346: sipush #-23325
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: aastore
    //   353: dup
    //   354: iconst_4
    //   355: sipush #27334
    //   358: sipush #31687
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: aastore
    //   365: dup
    //   366: iconst_5
    //   367: sipush #27385
    //   370: sipush #-13029
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: aastore
    //   377: dup
    //   378: bipush #6
    //   380: sipush #27309
    //   383: sipush #-7069
    //   386: invokestatic a : (II)Ljava/lang/String;
    //   389: aastore
    //   390: dup
    //   391: bipush #7
    //   393: sipush #27335
    //   396: sipush #3104
    //   399: invokestatic a : (II)Ljava/lang/String;
    //   402: aastore
    //   403: dup
    //   404: bipush #8
    //   406: sipush #27274
    //   409: sipush #-27187
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: aastore
    //   416: dup
    //   417: bipush #9
    //   419: sipush #27270
    //   422: sipush #31792
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: aastore
    //   429: dup
    //   430: bipush #10
    //   432: sipush #27268
    //   435: sipush #7839
    //   438: invokestatic a : (II)Ljava/lang/String;
    //   441: aastore
    //   442: dup
    //   443: bipush #11
    //   445: sipush #27308
    //   448: sipush #-10788
    //   451: invokestatic a : (II)Ljava/lang/String;
    //   454: aastore
    //   455: dup
    //   456: bipush #12
    //   458: sipush #27390
    //   461: sipush #-3538
    //   464: invokestatic a : (II)Ljava/lang/String;
    //   467: aastore
    //   468: dup
    //   469: bipush #13
    //   471: sipush #27340
    //   474: sipush #26602
    //   477: invokestatic a : (II)Ljava/lang/String;
    //   480: aastore
    //   481: dup
    //   482: bipush #14
    //   484: sipush #27314
    //   487: sipush #11906
    //   490: invokestatic a : (II)Ljava/lang/String;
    //   493: aastore
    //   494: dup
    //   495: bipush #15
    //   497: sipush #27288
    //   500: sipush #14913
    //   503: invokestatic a : (II)Ljava/lang/String;
    //   506: aastore
    //   507: dup
    //   508: bipush #16
    //   510: sipush #27264
    //   513: sipush #8377
    //   516: invokestatic a : (II)Ljava/lang/String;
    //   519: aastore
    //   520: dup
    //   521: bipush #17
    //   523: sipush #27348
    //   526: sipush #-30167
    //   529: invokestatic a : (II)Ljava/lang/String;
    //   532: aastore
    //   533: dup
    //   534: bipush #18
    //   536: sipush #27296
    //   539: sipush #25020
    //   542: invokestatic a : (II)Ljava/lang/String;
    //   545: aastore
    //   546: dup
    //   547: bipush #19
    //   549: sipush #27366
    //   552: sipush #-4493
    //   555: invokestatic a : (II)Ljava/lang/String;
    //   558: aastore
    //   559: dup
    //   560: bipush #20
    //   562: sipush #27290
    //   565: sipush #15713
    //   568: invokestatic a : (II)Ljava/lang/String;
    //   571: aastore
    //   572: dup
    //   573: bipush #21
    //   575: sipush #27329
    //   578: sipush #29106
    //   581: invokestatic a : (II)Ljava/lang/String;
    //   584: aastore
    //   585: dup
    //   586: bipush #22
    //   588: sipush #27363
    //   591: sipush #9830
    //   594: invokestatic a : (II)Ljava/lang/String;
    //   597: aastore
    //   598: dup
    //   599: bipush #23
    //   601: sipush #27316
    //   604: sipush #4066
    //   607: invokestatic a : (II)Ljava/lang/String;
    //   610: aastore
    //   611: dup
    //   612: bipush #24
    //   614: sipush #27370
    //   617: sipush #8410
    //   620: invokestatic a : (II)Ljava/lang/String;
    //   623: aastore
    //   624: dup
    //   625: bipush #25
    //   627: sipush #27386
    //   630: sipush #-27165
    //   633: invokestatic a : (II)Ljava/lang/String;
    //   636: aastore
    //   637: dup
    //   638: bipush #26
    //   640: sipush #27289
    //   643: sipush #-3216
    //   646: invokestatic a : (II)Ljava/lang/String;
    //   649: aastore
    //   650: dup
    //   651: bipush #27
    //   653: sipush #27357
    //   656: sipush #-26571
    //   659: invokestatic a : (II)Ljava/lang/String;
    //   662: aastore
    //   663: dup
    //   664: bipush #28
    //   666: sipush #27362
    //   669: sipush #-11286
    //   672: invokestatic a : (II)Ljava/lang/String;
    //   675: aastore
    //   676: dup
    //   677: bipush #29
    //   679: sipush #27389
    //   682: sipush #-893
    //   685: invokestatic a : (II)Ljava/lang/String;
    //   688: aastore
    //   689: invokestatic of : ([Ljava/lang/Object;)Ljava/util/Set;
    //   692: putstatic burp/Zd.Zt : Ljava/util/Set;
    //   695: sipush #27373
    //   698: sipush #31967
    //   701: invokestatic a : (II)Ljava/lang/String;
    //   704: sipush #27376
    //   707: sipush #7270
    //   710: invokestatic a : (II)Ljava/lang/String;
    //   713: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   716: putstatic burp/Zd.Zy : Ljava/util/Set;
    //   719: sipush #27336
    //   722: sipush #-16460
    //   725: invokestatic a : (II)Ljava/lang/String;
    //   728: invokestatic of : (Ljava/lang/Object;)Ljava/util/Set;
    //   731: putstatic burp/Zd.ZE : Ljava/util/Set;
    //   734: bipush #11
    //   736: anewarray java/lang/String
    //   739: dup
    //   740: iconst_0
    //   741: sipush #27267
    //   744: sipush #-6051
    //   747: invokestatic a : (II)Ljava/lang/String;
    //   750: aastore
    //   751: dup
    //   752: iconst_1
    //   753: sipush #27303
    //   756: sipush #-16780
    //   759: invokestatic a : (II)Ljava/lang/String;
    //   762: aastore
    //   763: dup
    //   764: iconst_2
    //   765: sipush #27306
    //   768: sipush #-17354
    //   771: invokestatic a : (II)Ljava/lang/String;
    //   774: aastore
    //   775: dup
    //   776: iconst_3
    //   777: sipush #27299
    //   780: sipush #19188
    //   783: invokestatic a : (II)Ljava/lang/String;
    //   786: aastore
    //   787: dup
    //   788: iconst_4
    //   789: sipush #27328
    //   792: sipush #-399
    //   795: invokestatic a : (II)Ljava/lang/String;
    //   798: aastore
    //   799: dup
    //   800: iconst_5
    //   801: sipush #27318
    //   804: sipush #-14428
    //   807: invokestatic a : (II)Ljava/lang/String;
    //   810: aastore
    //   811: dup
    //   812: bipush #6
    //   814: sipush #27364
    //   817: sipush #-8785
    //   820: invokestatic a : (II)Ljava/lang/String;
    //   823: aastore
    //   824: dup
    //   825: bipush #7
    //   827: sipush #27374
    //   830: sipush #29515
    //   833: invokestatic a : (II)Ljava/lang/String;
    //   836: aastore
    //   837: dup
    //   838: bipush #8
    //   840: sipush #27279
    //   843: sipush #-13072
    //   846: invokestatic a : (II)Ljava/lang/String;
    //   849: aastore
    //   850: dup
    //   851: bipush #9
    //   853: sipush #27372
    //   856: sipush #22360
    //   859: invokestatic a : (II)Ljava/lang/String;
    //   862: aastore
    //   863: dup
    //   864: bipush #10
    //   866: sipush #27381
    //   869: sipush #-24044
    //   872: invokestatic a : (II)Ljava/lang/String;
    //   875: aastore
    //   876: invokestatic of : ([Ljava/lang/Object;)Ljava/util/Set;
    //   879: putstatic burp/Zd.ZJ : Ljava/util/Set;
    //   882: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6AE9) & 0xFFFF;
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
      char c = '';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */