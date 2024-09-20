package burp;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.portswigger.browser.Zel;
import net.portswigger.browser.Zt3;

public interface Zr1q {
  public static final String[] a;
  
  public static final String[] b;
  
  private static Zl2w ZK(Zel paramZel, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface ZM : ()Ljava/util/Map;
    //   6: sipush #2423
    //   9: sipush #3265
    //   12: invokestatic a : (II)Ljava/lang/String;
    //   15: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   20: checkcast java/lang/String
    //   23: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   26: astore_3
    //   27: invokestatic ZB : ()Ljava/lang/String;
    //   30: aload_0
    //   31: invokeinterface ZD : ()Ljava/lang/String;
    //   36: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   39: astore #4
    //   41: iconst_m1
    //   42: istore #5
    //   44: astore_2
    //   45: aload #4
    //   47: invokevirtual hashCode : ()I
    //   50: lookupswitch default -> 184, -1852692228 -> 140, -220616902 -> 92, 69820330 -> 164, 1970608946 -> 116
    //   92: aload #4
    //   94: sipush #2417
    //   97: sipush #30431
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: invokevirtual equals : (Ljava/lang/Object;)Z
    //   106: ifeq -> 184
    //   109: iconst_0
    //   110: istore #5
    //   112: aload_2
    //   113: ifnonnull -> 184
    //   116: aload #4
    //   118: sipush #2429
    //   121: sipush #-28878
    //   124: invokestatic a : (II)Ljava/lang/String;
    //   127: invokevirtual equals : (Ljava/lang/Object;)Z
    //   130: ifeq -> 184
    //   133: iconst_1
    //   134: istore #5
    //   136: aload_2
    //   137: ifnonnull -> 184
    //   140: aload #4
    //   142: sipush #2422
    //   145: sipush #20686
    //   148: invokestatic a : (II)Ljava/lang/String;
    //   151: invokevirtual equals : (Ljava/lang/Object;)Z
    //   154: ifeq -> 184
    //   157: iconst_2
    //   158: istore #5
    //   160: aload_2
    //   161: ifnonnull -> 184
    //   164: aload #4
    //   166: sipush #2427
    //   169: sipush #27704
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: invokevirtual equals : (Ljava/lang/Object;)Z
    //   178: ifeq -> 184
    //   181: iconst_3
    //   182: istore #5
    //   184: iload #5
    //   186: tableswitch default -> 330, 0 -> 216, 1 -> 222, 2 -> 274, 3 -> 309
    //   216: getstatic burp/Zl2w.TEXTAREA : Lburp/Zl2w;
    //   219: goto -> 333
    //   222: aload_3
    //   223: invokevirtual isEmpty : ()Z
    //   226: ifeq -> 233
    //   229: iload_1
    //   230: ifne -> 262
    //   233: aload_3
    //   234: invokevirtual isPresent : ()Z
    //   237: ifeq -> 268
    //   240: sipush #2415
    //   243: sipush #-30942
    //   246: invokestatic a : (II)Ljava/lang/String;
    //   249: aload_3
    //   250: invokevirtual get : ()Ljava/lang/Object;
    //   253: checkcast java/lang/String
    //   256: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   259: ifeq -> 268
    //   262: getstatic burp/Zl2w.SUBMIT : Lburp/Zl2w;
    //   265: goto -> 333
    //   268: getstatic burp/Zl2w.NONE : Lburp/Zl2w;
    //   271: goto -> 333
    //   274: aload_0
    //   275: invokeinterface ZM : ()Ljava/util/Map;
    //   280: sipush #2420
    //   283: sipush #-12391
    //   286: invokestatic a : (II)Ljava/lang/String;
    //   289: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   294: ifeq -> 303
    //   297: getstatic burp/Zl2w.SELECT_MULTIPLE : Lburp/Zl2w;
    //   300: goto -> 333
    //   303: getstatic burp/Zl2w.SELECT : Lburp/Zl2w;
    //   306: goto -> 333
    //   309: aload_3
    //   310: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   315: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   318: getstatic burp/Zl2w.NONE : Lburp/Zl2w;
    //   321: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   324: checkcast burp/Zl2w
    //   327: goto -> 333
    //   330: getstatic burp/Zl2w.NONE : Lburp/Zl2w;
    //   333: areturn
  }
  
  static boolean Z_(Zel paramZel) {
    switch (Zmw2.Zz[ZK(paramZel, true).ordinal()]) {
      case 1:
      case 2:
      case 3:
      
    } 
    return true;
  }
  
  static boolean Zj(Zel paramZel, boolean paramBoolean) {
    switch (Zmw2.Zz[ZK(paramZel, paramBoolean).ordinal()]) {
      case 1:
      case 2:
      
    } 
    return false;
  }
  
  static List<Zr1q> ZT(List<Zel> paramList, boolean paramBoolean, Zt3 paramZt3) {
    LinkedList<Zr1q> linkedList = new LinkedList();
    Iterator<Zel> iterator = paramList.iterator();
    String str = Zlq3.ZB();
    while (iterator.hasNext()) {
      Zel zel = iterator.next();
      Zu(zel, paramBoolean, paramZt3).forEach(linkedList::lambda$createInputs$3);
      if (str == null)
        break; 
    } 
    return linkedList;
  }
  
  private static List<Zr1q> Zu(Zel paramZel, boolean paramBoolean, Zt3 paramZt3) {
    Zl2w zl2w = ZK(paramZel, paramBoolean);
    switch (Zmw2.Zz[zl2w.ordinal()]) {
      case 3:
      
      case 4:
      
      case 5:
      
    } 
    return Zl(paramZel, zl2w, paramZt3);
  }
  
  private static List<Zr1q> Zv(Zel paramZel, Zt3 paramZt3) {
    // Byte code:
    //   0: new burp/Zlip
    //   3: dup
    //   4: aload_0
    //   5: getstatic burp/Zl2w.SELECT : Lburp/Zl2w;
    //   8: invokespecial <init> : (Lnet/portswigger/browser/Zel;Lburp/Zl2w;)V
    //   11: astore_2
    //   12: aload_1
    //   13: aload_0
    //   14: aload_1
    //   15: aload_2
    //   16: <illegal opcode> accept : (Lnet/portswigger/browser/Zt3;Lburp/Zlip;)Ljava/util/function/Consumer;
    //   21: invokeinterface ZA : (Lnet/portswigger/browser/Zel;Ljava/util/function/Consumer;)V
    //   26: aload_2
    //   27: invokevirtual ZK : ()Z
    //   30: ifeq -> 39
    //   33: invokestatic emptyList : ()Ljava/util/List;
    //   36: goto -> 43
    //   39: aload_2
    //   40: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   43: areturn
  }
  
  private static List<Zr1q> ZY(Zel paramZel, Zt3 paramZt3) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_1
    //   9: aload_0
    //   10: aload_0
    //   11: aload_1
    //   12: aload_2
    //   13: <illegal opcode> accept : (Lnet/portswigger/browser/Zel;Lnet/portswigger/browser/Zt3;Ljava/util/List;)Ljava/util/function/Consumer;
    //   18: invokeinterface ZA : (Lnet/portswigger/browser/Zel;Ljava/util/function/Consumer;)V
    //   23: aload_2
    //   24: areturn
  }
  
  private static List<Zr1q> Zl(Zel paramZel, Zl2w paramZl2w, Zt3 paramZt3) {
    List<Zzjv> list = Zkg8.ZA(paramZel, paramZt3);
    return Collections.singletonList(new Ze8x(paramZel, list, paramZl2w));
  }
  
  boolean ZR();
  
  Zv5 ZI();
  
  private static void lambda$processMultiSelectField$5(Zel paramZel1, Zt3 paramZt3, List<Zlip> paramList, Zel paramZel2) {
    if (a(2416, 21894).equalsIgnoreCase(paramZel2.ZD())) {
      Zlip zlip = new Zlip(paramZel1, Zl2w.SELECT_MULTIPLE);
      List<Zzjv> list = Zkg8.ZA(paramZel2, paramZt3);
      Ze8x ze8x = new Ze8x(paramZel2, list, Zl2w.SELECT_MULTIPLE);
      zlip.Zc(ze8x);
      paramList.add(zlip);
    } 
  }
  
  private static void lambda$processSelectField$4(Zt3 paramZt3, Zlip paramZlip, Zel paramZel) {
    if (a(2430, 4195).equalsIgnoreCase(paramZel.ZD())) {
      List<Zzjv> list = Zkg8.ZA(paramZel, paramZt3);
      paramZlip.Zc(new Ze8x(paramZel, list, Zl2w.SELECT));
    } 
  }
  
  private static void lambda$createInputs$3(List paramList, Zr1q paramZr1q) {
    // Byte code:
    //   0: invokestatic ZB : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: instanceof burp/Ze8x
    //   8: ifeq -> 149
    //   11: aload_1
    //   12: checkcast burp/Ze8x
    //   15: astore_3
    //   16: aload_0
    //   17: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   22: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   27: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   32: ldc burp/Zlip
    //   34: dup
    //   35: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   38: pop
    //   39: <illegal opcode> apply : (Ljava/lang/Class;)Ljava/util/function/Function;
    //   44: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   49: aload_3
    //   50: <illegal opcode> test : (Lburp/Ze8x;)Ljava/util/function/Predicate;
    //   55: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   60: invokeinterface findFirst : ()Ljava/util/Optional;
    //   65: astore #4
    //   67: aload #4
    //   69: invokevirtual isPresent : ()Z
    //   72: ifeq -> 91
    //   75: aload #4
    //   77: invokevirtual get : ()Ljava/lang/Object;
    //   80: checkcast burp/Zlip
    //   83: aload_3
    //   84: invokevirtual Zc : (Lburp/Ze8x;)V
    //   87: aload_2
    //   88: ifnonnull -> 145
    //   91: aload_3
    //   92: invokevirtual ZV : ()Lburp/Zl2w;
    //   95: getstatic burp/Zl2w.RADIO : Lburp/Zl2w;
    //   98: if_acmpne -> 137
    //   101: new burp/Zlip
    //   104: dup
    //   105: aload_3
    //   106: invokevirtual Zr : ()Lnet/portswigger/browser/Zel;
    //   109: aload_3
    //   110: invokevirtual ZV : ()Lburp/Zl2w;
    //   113: invokespecial <init> : (Lnet/portswigger/browser/Zel;Lburp/Zl2w;)V
    //   116: astore #5
    //   118: aload #5
    //   120: aload_3
    //   121: invokevirtual Zc : (Lburp/Ze8x;)V
    //   124: aload_0
    //   125: aload #5
    //   127: invokeinterface add : (Ljava/lang/Object;)Z
    //   132: pop
    //   133: aload_2
    //   134: ifnonnull -> 145
    //   137: aload_0
    //   138: aload_3
    //   139: invokeinterface add : (Ljava/lang/Object;)Z
    //   144: pop
    //   145: aload_2
    //   146: ifnonnull -> 157
    //   149: aload_0
    //   150: aload_1
    //   151: invokeinterface add : (Ljava/lang/Object;)Z
    //   156: pop
    //   157: return
  }
  
  private static boolean lambda$createInputs$2(Ze8x paramZe8x, Zlip paramZlip) {
    return paramZlip.ZA(paramZe8x);
  }
  
  private static boolean lambda$createInputs$1(Zr1q paramZr1q) {
    return paramZr1q instanceof Zlip;
  }
  
  private static Zl2w lambda$mapToLegacyType$0(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   4: astore_2
    //   5: invokestatic ZB : ()Ljava/lang/String;
    //   8: iconst_m1
    //   9: istore_3
    //   10: astore_1
    //   11: aload_2
    //   12: invokevirtual hashCode : ()I
    //   15: lookupswitch default -> 324, -1377687758 -> 282, -1217487446 -> 214, -1034364087 -> 259, -891535336 -> 170, 3143036 -> 192, 100313435 -> 236, 108270587 -> 148, 108404047 -> 305, 1216985755 -> 104, 1536891843 -> 126
    //   104: aload_2
    //   105: sipush #2431
    //   108: sipush #12348
    //   111: invokestatic a : (II)Ljava/lang/String;
    //   114: invokevirtual equals : (Ljava/lang/Object;)Z
    //   117: ifeq -> 324
    //   120: iconst_0
    //   121: istore_3
    //   122: aload_1
    //   123: ifnonnull -> 324
    //   126: aload_2
    //   127: sipush #2426
    //   130: sipush #28945
    //   133: invokestatic a : (II)Ljava/lang/String;
    //   136: invokevirtual equals : (Ljava/lang/Object;)Z
    //   139: ifeq -> 324
    //   142: iconst_1
    //   143: istore_3
    //   144: aload_1
    //   145: ifnonnull -> 324
    //   148: aload_2
    //   149: sipush #2414
    //   152: sipush #-27378
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: invokevirtual equals : (Ljava/lang/Object;)Z
    //   161: ifeq -> 324
    //   164: iconst_2
    //   165: istore_3
    //   166: aload_1
    //   167: ifnonnull -> 324
    //   170: aload_2
    //   171: sipush #2418
    //   174: sipush #-29998
    //   177: invokestatic a : (II)Ljava/lang/String;
    //   180: invokevirtual equals : (Ljava/lang/Object;)Z
    //   183: ifeq -> 324
    //   186: iconst_3
    //   187: istore_3
    //   188: aload_1
    //   189: ifnonnull -> 324
    //   192: aload_2
    //   193: sipush #2428
    //   196: sipush #-31651
    //   199: invokestatic a : (II)Ljava/lang/String;
    //   202: invokevirtual equals : (Ljava/lang/Object;)Z
    //   205: ifeq -> 324
    //   208: iconst_4
    //   209: istore_3
    //   210: aload_1
    //   211: ifnonnull -> 324
    //   214: aload_2
    //   215: sipush #2421
    //   218: sipush #24737
    //   221: invokestatic a : (II)Ljava/lang/String;
    //   224: invokevirtual equals : (Ljava/lang/Object;)Z
    //   227: ifeq -> 324
    //   230: iconst_5
    //   231: istore_3
    //   232: aload_1
    //   233: ifnonnull -> 324
    //   236: aload_2
    //   237: sipush #2419
    //   240: sipush #-3229
    //   243: invokestatic a : (II)Ljava/lang/String;
    //   246: invokevirtual equals : (Ljava/lang/Object;)Z
    //   249: ifeq -> 324
    //   252: bipush #6
    //   254: istore_3
    //   255: aload_1
    //   256: ifnonnull -> 324
    //   259: aload_2
    //   260: sipush #2424
    //   263: sipush #-17702
    //   266: invokestatic a : (II)Ljava/lang/String;
    //   269: invokevirtual equals : (Ljava/lang/Object;)Z
    //   272: ifeq -> 324
    //   275: bipush #7
    //   277: istore_3
    //   278: aload_1
    //   279: ifnonnull -> 324
    //   282: aload_2
    //   283: sipush #2413
    //   286: sipush #-22903
    //   289: invokestatic a : (II)Ljava/lang/String;
    //   292: invokevirtual equals : (Ljava/lang/Object;)Z
    //   295: ifeq -> 324
    //   298: bipush #8
    //   300: istore_3
    //   301: aload_1
    //   302: ifnonnull -> 324
    //   305: aload_2
    //   306: sipush #2425
    //   309: sipush #-21668
    //   312: invokestatic a : (II)Ljava/lang/String;
    //   315: invokevirtual equals : (Ljava/lang/Object;)Z
    //   318: ifeq -> 324
    //   321: bipush #9
    //   323: istore_3
    //   324: iload_3
    //   325: tableswitch default -> 434, 0 -> 380, 1 -> 386, 2 -> 392, 3 -> 398, 4 -> 404, 5 -> 410, 6 -> 416, 7 -> 422, 8 -> 428, 9 -> 428
    //   380: getstatic burp/Zl2w.PASSWORD : Lburp/Zl2w;
    //   383: goto -> 437
    //   386: getstatic burp/Zl2w.CHECKBOX : Lburp/Zl2w;
    //   389: goto -> 437
    //   392: getstatic burp/Zl2w.RADIO : Lburp/Zl2w;
    //   395: goto -> 437
    //   398: getstatic burp/Zl2w.SUBMIT : Lburp/Zl2w;
    //   401: goto -> 437
    //   404: getstatic burp/Zl2w.FILE : Lburp/Zl2w;
    //   407: goto -> 437
    //   410: getstatic burp/Zl2w.HIDDEN : Lburp/Zl2w;
    //   413: goto -> 437
    //   416: getstatic burp/Zl2w.IMAGE : Lburp/Zl2w;
    //   419: goto -> 437
    //   422: getstatic burp/Zl2w.NUMBER : Lburp/Zl2w;
    //   425: goto -> 437
    //   428: getstatic burp/Zl2w.NONE : Lburp/Zl2w;
    //   431: goto -> 437
    //   434: getstatic burp/Zl2w.TEXT : Lburp/Zl2w;
    //   437: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÎçEÃ£Ðr1®è¶&%ÃkÒ²¸7J]èxr\\bÉÅúÛzf,(JUBõðz\\nZà25ïA·Õf /\\bÄü6v¯ADaZ¸¥ z\\b£écæ"Hhn=äÏ~xÄa'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #31
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'tÀl@o{\\rê~8'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #92
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
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
    //   128: putstatic burp/Zr1q.a : [Ljava/lang/String;
    //   131: bipush #19
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zr1q.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #24
    //   214: goto -> 244
    //   217: bipush #52
    //   219: goto -> 244
    //   222: bipush #110
    //   224: goto -> 244
    //   227: bipush #123
    //   229: goto -> 244
    //   232: bipush #80
    //   234: goto -> 244
    //   237: bipush #73
    //   239: goto -> 244
    //   242: bipush #27
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x97F) & 0xFFFF;
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
      byte b1 = 8;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr1q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */