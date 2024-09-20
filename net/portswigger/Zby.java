package net.portswigger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zby<T> {
  public static final Consumer<Throwable> ZI;
  
  public final Zs_ ZX;
  
  public final Ztj ZA;
  
  private final BiFunction<Zl5, Ztj, T> Zb;
  
  private final Map<Zl5, Zmo> ZF;
  
  private final List<Zf7> ZR;
  
  private final List<Zd0> ZL;
  
  private final Zs3 Zl;
  
  private static final Pattern ZW;
  
  private static final Pattern Za;
  
  public static final Zrzj ZO;
  
  private static String Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public void Zt() {
    Iterator<Zmo> iterator = this.ZF.values().iterator();
    String str = Zf();
    while (iterator.hasNext()) {
      Zmo zmo = iterator.next();
      zmo.ZZ();
      if (str == null)
        break; 
    } 
  }
  
  private Zby(Consumer<Throwable> paramConsumer, Zrx7 paramZrx7, BiFunction<Zl5, Ztj, T> paramBiFunction, Zs_ paramZs_, List<Zcp> paramList, List<Zd0> paramList1, Class<T> paramClass, List<Class> paramList2) {
    // Byte code:
    //   0: invokestatic Zf : ()Ljava/lang/String;
    //   3: aload_0
    //   4: invokespecial <init> : ()V
    //   7: astore #9
    //   9: aload_0
    //   10: new java/util/concurrent/ConcurrentHashMap
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: putfield ZF : Ljava/util/Map;
    //   20: aload_0
    //   21: aload_3
    //   22: putfield Zb : Ljava/util/function/BiFunction;
    //   25: aload_0
    //   26: aload #4
    //   28: putfield ZX : Lnet/portswigger/Zs_;
    //   31: aload #7
    //   33: ifnonnull -> 57
    //   36: new java/lang/IllegalArgumentException
    //   39: dup
    //   40: sipush #-4269
    //   43: sipush #1872
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: invokespecial <init> : (Ljava/lang/String;)V
    //   52: athrow
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: new net/portswigger/Zas
    //   60: dup
    //   61: invokespecial <init> : ()V
    //   64: astore #10
    //   66: new net/portswigger/Zix
    //   69: dup
    //   70: aload_1
    //   71: invokespecial <init> : (Ljava/util/function/Consumer;)V
    //   74: astore #11
    //   76: aload #11
    //   78: iconst_2
    //   79: anewarray java/lang/reflect/Type
    //   82: dup
    //   83: iconst_0
    //   84: ldc net/portswigger/Zc2
    //   86: aastore
    //   87: dup
    //   88: iconst_1
    //   89: aload #7
    //   91: aastore
    //   92: invokestatic Zu : (Lnet/portswigger/Zix;[Ljava/lang/reflect/Type;)Lnet/portswigger/Zix;
    //   95: pop
    //   96: aload #11
    //   98: aload #8
    //   100: iconst_0
    //   101: anewarray java/lang/Class
    //   104: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   109: checkcast [Ljava/lang/reflect/Type;
    //   112: invokestatic Zu : (Lnet/portswigger/Zix;[Ljava/lang/reflect/Type;)Lnet/portswigger/Zix;
    //   115: pop
    //   116: aload_0
    //   117: aload #11
    //   119: invokevirtual ZN : ()Lnet/portswigger/Ztj;
    //   122: putfield ZA : Lnet/portswigger/Ztj;
    //   125: aload_0
    //   126: aload #10
    //   128: invokevirtual ZW : (Lnet/portswigger/Zas;)V
    //   131: aload #10
    //   133: invokevirtual Zz : ()V
    //   136: aload_0
    //   137: new net/portswigger/Zs3
    //   140: dup
    //   141: ldc ''
    //   143: aload_2
    //   144: invokespecial <init> : (Ljava/lang/String;Lnet/portswigger/Zrx7;)V
    //   147: putfield Zl : Lnet/portswigger/Zs3;
    //   150: aload_0
    //   151: getfield Zl : Lnet/portswigger/Zs3;
    //   154: aload_0
    //   155: getfield ZA : Lnet/portswigger/Ztj;
    //   158: invokevirtual Zw : (Lnet/portswigger/Ztj;)Lnet/portswigger/Zrz7;
    //   161: astore #12
    //   163: new java/util/ArrayList
    //   166: dup
    //   167: invokespecial <init> : ()V
    //   170: astore #13
    //   172: aload #5
    //   174: invokeinterface iterator : ()Ljava/util/Iterator;
    //   179: astore #14
    //   181: aload #14
    //   183: invokeinterface hasNext : ()Z
    //   188: ifeq -> 227
    //   191: aload #14
    //   193: invokeinterface next : ()Ljava/lang/Object;
    //   198: checkcast net/portswigger/Zcp
    //   201: astore #15
    //   203: aload #13
    //   205: aload #15
    //   207: aload_0
    //   208: getfield ZA : Lnet/portswigger/Ztj;
    //   211: invokeinterface Ze : (Lnet/portswigger/Ztj;)Lnet/portswigger/Zzj;
    //   216: invokeinterface add : (Ljava/lang/Object;)Z
    //   221: pop
    //   222: aload #9
    //   224: ifnonnull -> 181
    //   227: aload_0
    //   228: aload #6
    //   230: putfield ZL : Ljava/util/List;
    //   233: aload_0
    //   234: getfield ZA : Lnet/portswigger/Ztj;
    //   237: new net/portswigger/Zn9
    //   240: dup
    //   241: aload_0
    //   242: aload #12
    //   244: aload #13
    //   246: invokespecial <init> : (Lnet/portswigger/Zby;Lnet/portswigger/Zrz7;Ljava/util/List;)V
    //   249: invokevirtual ZI : (Lnet/portswigger/Zak;)V
    //   252: aload #12
    //   254: aload #13
    //   256: <illegal opcode> ZF : (Lnet/portswigger/Zrz7;Ljava/util/List;)Lnet/portswigger/Zrmu;
    //   261: invokestatic emptyList : ()Ljava/util/List;
    //   264: aload #7
    //   266: aload_0
    //   267: getfield ZA : Lnet/portswigger/Ztj;
    //   270: invokestatic Zh : (Lnet/portswigger/Zrmu;Ljava/util/List;Ljava/lang/reflect/Type;Lnet/portswigger/Ztj;)V
    //   273: new java/util/ArrayList
    //   276: dup
    //   277: invokespecial <init> : ()V
    //   280: astore #14
    //   282: aload #13
    //   284: invokeinterface iterator : ()Ljava/util/Iterator;
    //   289: astore #15
    //   291: aload #15
    //   293: invokeinterface hasNext : ()Z
    //   298: ifeq -> 362
    //   301: aload #15
    //   303: invokeinterface next : ()Ljava/lang/Object;
    //   308: checkcast net/portswigger/Zzj
    //   311: astore #16
    //   313: aload #16
    //   315: invokeinterface ZY : ()Lnet/portswigger/Zf7;
    //   320: astore #17
    //   322: aload #17
    //   324: instanceof net/portswigger/Zu8
    //   327: ifeq -> 347
    //   330: aload #12
    //   332: aload #17
    //   334: checkcast net/portswigger/Zu8
    //   337: invokevirtual Zy : (Lnet/portswigger/Zu8;)V
    //   340: goto -> 347
    //   343: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   346: athrow
    //   347: aload #14
    //   349: aload #17
    //   351: invokeinterface add : (Ljava/lang/Object;)Z
    //   356: pop
    //   357: aload #9
    //   359: ifnonnull -> 291
    //   362: aload #14
    //   364: aload #12
    //   366: invokevirtual ZY : ()Lnet/portswigger/Zf7;
    //   369: invokeinterface add : (Ljava/lang/Object;)Z
    //   374: pop
    //   375: aload_0
    //   376: aload #14
    //   378: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   381: putfield ZR : Ljava/util/List;
    //   384: return
    // Exception table:
    //   from	to	target	type
    //   9	53	53	java/lang/IllegalArgumentException
    //   322	340	343	java/lang/IllegalArgumentException
  }
  
  public Zb4<Zu0, Zzw> ZG(Zat paramZat, Znn paramZnn) {
    try {
      Zai zai = new Zai(paramZat);
      Zmo zmo = zai.<Zmo>ZA(new Zkj(this));
      Zrzj zrzj = zai.<Zrzj>ZA(new Zrmm(Zz0.Zg));
      return zmo.ZK(zrzj, zai.Zo, paramZnn);
    } catch (Zrml zrml) {
      Zah.Zl(zrml, Zk_.IGNORED);
      return Zb4.Zf(zrml.ZG);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      return Zb4.Zf(Zrxs.ZJ(throwable));
    } 
  }
  
  public Zu0 ZP(Zz0 paramZz0, Zat paramZat, Zsv paramZsv) {
    Iterator<Zd0> iterator = this.ZL.iterator();
    String str = Zf();
    while (iterator.hasNext()) {
      Zd0 zd0 = iterator.next();
      try {
        Zb4<Zu0, Zat> zb4 = zd0.Z_(paramZat);
        if (zb4.Za != null) {
          paramZat = (Zat)zb4.Za;
          if (str == null)
            return (Zu0)zb4.Zk; 
        } else {
          return (Zu0)zb4.Zk;
        } 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.IGNORED);
      } 
      if (str == null)
        break; 
    } 
    Zu0 zu0 = Zb(paramZz0, paramZat, paramZsv);
    for (Zd0 zd0 : this.ZL) {
      try {
        Zb4<Zu0, Zu0> zb4 = zd0.Zt(zu0);
        if (zb4.Za != null) {
          zu0 = (Zu0)zb4.Za;
          if (str == null)
            return (Zu0)zb4.Zk; 
        } else {
          return (Zu0)zb4.Zk;
        } 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.IGNORED);
      } 
      if (str == null)
        break; 
    } 
    return zu0;
  }
  
  private Zu0 Zb(Zz0 paramZz0, Zat paramZat, Zsv paramZsv) {
    Zat zat = paramZat;
    String str = Zf();
    try {
      if (zat.ZX.equals(a(-4270, -29123)))
        return this.Zl.ZL; 
      Zai zai = new Zai(zat);
      Zmo zmo = zai.<Zmo>ZA(new Zkj(this));
      Zrzj zrzj = zai.<Zrzj>ZA(new Zrmm(paramZz0));
      zat = zai.Zo;
      for (Zf7 zf7 : this.ZR) {
        Zu0 zu0 = zf7.Zl(paramZz0, zat, paramZsv);
        if (zu0 != null)
          return zu0; 
        if (str == null)
          break; 
      } 
      try {
        if (zat.ZX.startsWith(a(-4265, 17645)) || zat.ZX.equals(a(-4272, -31731)))
          zat = zat.Zm(zat.ZX.substring(4)); 
      } catch (Zrml zrml) {
        throw a(null);
      } 
      Matcher matcher = ZW.matcher(zat.ZX);
      if (matcher.matches()) {
        paramZz0 = new Zz0(matcher.group(1));
        zat = zat.Zm(zat.ZX.substring(matcher.group(1).length() + 1));
      } 
      return zmo.ZC(zrzj, paramZz0, zat, paramZsv);
    } catch (Zrml zrml) {
      Zah.Zl(zrml, Zk_.IGNORED);
      return zrml.ZG;
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      return Zrxs.ZJ(throwable);
    } 
  }
  
  private void ZW(Zas paramZas) {
    this.ZA.ZI(new Zn6(this, paramZas));
    Iterator<Map.Entry> iterator = this.ZA.Zx.entrySet().iterator();
    String str = Zf();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      for (Zo3 zo3 : ((Zcy)entry.getValue()).Zi.values()) {
        Za(zo3.Za, zo3.ZY, paramZas);
        if (str == null)
          break; 
      } 
      if (str == null)
        break; 
    } 
  }
  
  private void Za(String paramString, Iterable<Zm7> paramIterable, Zas paramZas) {
    Iterator<Zm7> iterator = paramIterable.iterator();
    String str = Zf();
    while (iterator.hasNext()) {
      Zm7 zm7 = iterator.next();
      try {
        if (zm7.ZN != null || str == null) {
          try {
            zm7.Za(this.ZA);
          } catch (Zqb zqb) {
            Zah.Zl(zqb, Zk_.IGNORED);
            paramZas.Zh((Function)Zqg.Zw(Zla.DEFAULT), a(-4271, 4455), new Object[] { zm7.ZF, paramString, zm7.ZN, zqb.getMessage() });
          } catch (Zlh zlh) {
            Zah.Zl(zlh, Zk_.IGNORED);
            paramZas.Zh((Function)Zqg.Zw(Zla.DEFAULT), a(-4266, 2988), new Object[] { zm7.ZF, paramString, zm7.ZN, zlh.getMessage() });
          } 
          if (str == null)
            break; 
        } 
      } catch (Zqb zqb) {
        throw a(null);
      } 
    } 
  }
  
  private static void lambda$new$1(Zrz7 paramZrz7, List paramList1, List<Zo3> paramList2) {
    paramZrz7.ZF(paramList2);
    Iterator<Zzj> iterator = paramList1.iterator();
    String str = Zf();
    while (iterator.hasNext()) {
      Zzj zzj = iterator.next();
      zzj.ZF(paramList2);
      if (str == null)
        break; 
    } 
  }
  
  private static void lambda$static$0(Throwable paramThrowable) {
    Zah.Zl(paramThrowable, Zk_.UNEXPECTED);
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: ldc 'ZEIvpb'
    //   9: iconst_0
    //   10: istore_3
    //   11: invokestatic Zi : (Ljava/lang/String;)V
    //   14: ldc '3òMqzxyPJPÆ¼þõj!\\fàìk#ÂÇ°i?Ô*:£Ê÷XÎe ¬ìÎûíÄnäRâÌÓ-Ôé .úQ]½ÜbzÉmL&\\n1Ô#éé¾<çé0¼"f>$ÞØ¤íKu3asÊ¹½1º'ñ­ç ßè©æFð'
    //   16: dup
    //   17: astore_2
    //   18: invokevirtual length : ()I
    //   21: istore #4
    //   23: bipush #25
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #110
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 148
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc '0×£OÃ(ê]®«ùRÈ'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #12
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #101
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic net/portswigger/Zby.a : [Ljava/lang/String;
    //   137: bipush #8
    //   139: anewarray java/lang/String
    //   142: putstatic net/portswigger/Zby.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #13
    //   218: goto -> 248
    //   221: bipush #106
    //   223: goto -> 248
    //   226: bipush #89
    //   228: goto -> 248
    //   231: bipush #79
    //   233: goto -> 248
    //   236: bipush #90
    //   238: goto -> 248
    //   241: bipush #99
    //   243: goto -> 248
    //   246: bipush #108
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 104
    //   304: sipush #-4267
    //   307: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   312: putstatic net/portswigger/Zby.ZI : Ljava/util/function/Consumer;
    //   315: sipush #18792
    //   318: invokestatic a : (II)Ljava/lang/String;
    //   321: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   324: putstatic net/portswigger/Zby.ZW : Ljava/util/regex/Pattern;
    //   327: sipush #-4268
    //   330: sipush #-11895
    //   333: invokestatic a : (II)Ljava/lang/String;
    //   336: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   339: putstatic net/portswigger/Zby.Za : Ljava/util/regex/Pattern;
    //   342: getstatic net/portswigger/Zrzj.V01 : Lnet/portswigger/Zrzj;
    //   345: putstatic net/portswigger/Zby.ZO : Lnet/portswigger/Zrzj;
    //   348: return
  }
  
  public static void Zi(String paramString) {
    Zd = paramString;
  }
  
  public static String Zf() {
    return Zd;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEF53) & 0xFFFF;
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
      char c = 'â';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zby.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */