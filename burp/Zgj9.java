package burp;

import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.portswigger.Zkb;

class Zgj9 {
  private final Zefx ZM;
  
  private final Zlit Zi;
  
  private final boolean Zl;
  
  private final boolean Zr;
  
  private final boolean ZL;
  
  private final List<String> Zj;
  
  private final boolean ZF;
  
  private final Zey9 ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zgj9(Zefx paramZefx, Zlit paramZlit, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, List<String> paramList, boolean paramBoolean4, Zey9 paramZey9) {
    this.ZM = paramZefx;
    this.Zi = paramZlit;
    this.Zl = paramBoolean1;
    this.Zr = paramBoolean2;
    this.ZL = paramBoolean3;
    this.Zj = paramList;
    this.ZF = paramBoolean4;
    this.ZK = paramZey9;
  }
  
  Zefx ZA(Zr6h paramZr6h) {
    // Byte code:
    //   0: invokestatic Zk : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zl : Z
    //   8: ifeq -> 19
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual ZO : (Lburp/Zr6h;)Ljava/util/List;
    //   16: goto -> 24
    //   19: aload_0
    //   20: aload_1
    //   21: invokevirtual Zs : (Lburp/Zr6h;)Ljava/util/List;
    //   24: astore_3
    //   25: aload_0
    //   26: aload_1
    //   27: aload_3
    //   28: invokevirtual Zf : (Lburp/Zr6h;Ljava/util/List;)V
    //   31: aload_0
    //   32: getfield ZF : Z
    //   35: ifeq -> 53
    //   38: aload_0
    //   39: getfield ZM : Lburp/Zefx;
    //   42: invokeinterface Zw : ()[B
    //   47: astore #4
    //   49: aload_2
    //   50: ifnull -> 70
    //   53: aload_3
    //   54: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   59: invokeinterface removeIf : (Ljava/util/function/Predicate;)Z
    //   64: pop
    //   65: getstatic net/portswigger/Zdo.ZQ : [B
    //   68: astore #4
    //   70: aload_0
    //   71: getfield ZK : Lburp/Zey9;
    //   74: aload_0
    //   75: getfield Zi : Lburp/Zlit;
    //   78: invokeinterface Zdz : ()Lburp/Zmzk;
    //   83: aload_3
    //   84: aload #4
    //   86: invokevirtual ZR : (Lburp/Zmzk;Ljava/util/List;[B)Lburp/Zefx;
    //   89: astore #5
    //   91: aload_0
    //   92: getfield Zi : Lburp/Zlit;
    //   95: invokeinterface Zdr : ()Z
    //   100: ifne -> 113
    //   103: aload #5
    //   105: invokeinterface Zp : ()Lburp/Zefx;
    //   110: goto -> 115
    //   113: aload #5
    //   115: areturn
  }
  
  private List<Ztnz> ZO(Zr6h paramZr6h) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual ZN : (Lburp/Zr6h;)Ljava/util/List;
    //   5: astore_3
    //   6: aload_3
    //   7: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   12: invokestatic Zl : (Ljava/util/List;Ljava/util/function/Predicate;)I
    //   15: istore #4
    //   17: invokestatic Zk : ()[Ljava/lang/String;
    //   20: aload_0
    //   21: getfield Zi : Lburp/Zlit;
    //   24: invokeinterface Zdz : ()Lburp/Zmzk;
    //   29: invokestatic ZO : (Lburp/Zmzk;)Ljava/lang/String;
    //   32: astore #5
    //   34: astore_2
    //   35: iload #4
    //   37: iflt -> 80
    //   40: aload_3
    //   41: iload #4
    //   43: invokeinterface get : (I)Ljava/lang/Object;
    //   48: checkcast burp/Ztnz
    //   51: astore #6
    //   53: aload_3
    //   54: iload #4
    //   56: new burp/Ztnz
    //   59: dup
    //   60: aload #6
    //   62: getfield Ze : [B
    //   65: aload #5
    //   67: invokespecial <init> : ([BLjava/lang/String;)V
    //   70: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   75: pop
    //   76: aload_2
    //   77: ifnull -> 105
    //   80: aload_3
    //   81: iconst_0
    //   82: new burp/Ztnz
    //   85: dup
    //   86: sipush #8424
    //   89: sipush #-3770
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: aload #5
    //   97: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   100: invokeinterface add : (ILjava/lang/Object;)V
    //   105: aload_0
    //   106: invokevirtual Zo : ()Z
    //   109: ifne -> 157
    //   112: aload_0
    //   113: aload_3
    //   114: new burp/Ztnz
    //   117: dup
    //   118: sipush #8430
    //   121: sipush #-11371
    //   124: invokestatic a : (II)Ljava/lang/String;
    //   127: aload_0
    //   128: getfield ZM : Lburp/Zefx;
    //   131: invokeinterface ZF : ()Lburp/Zlit;
    //   136: invokeinterface Zdz : ()Lburp/Zmzk;
    //   141: invokeinterface toString : ()Ljava/lang/String;
    //   146: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   151: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   154: invokevirtual ZI : (Ljava/util/List;Lburp/Ztnz;)V
    //   157: aload_3
    //   158: areturn
  }
  
  private boolean Zo() {
    return (this.ZM.ZF().Zdr() && !this.Zi.Zdr());
  }
  
  private void ZI(List<Ztnz> paramList, Ztnz paramZtnz) {
    String[] arrayOfString = Zz3g.Zk();
    int i = Zl(paramList, paramZtnz::lambda$addOrReplaceHeader$1);
    if (i >= 0) {
      paramList.set(i, paramZtnz);
      if (arrayOfString != null) {
        paramList.add(paramZtnz);
        return;
      } 
      return;
    } 
    paramList.add(paramZtnz);
  }
  
  private List<Ztnz> ZN(Zr6h paramZr6h) {
    return (List<Ztnz>)paramZr6h.ZK().stream().filter(this::lambda$http2RequestHeaders$2).collect(Collectors.toList());
  }
  
  private List<Ztnz> Zs(Zr6h paramZr6h) {
    // Byte code:
    //   0: invokestatic Zk : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: new java/util/ArrayList
    //   7: dup
    //   8: aload_1
    //   9: invokevirtual ZK : ()Ljava/util/List;
    //   12: invokespecial <init> : (Ljava/util/Collection;)V
    //   15: astore_3
    //   16: aload_0
    //   17: getfield ZL : Z
    //   20: ifeq -> 134
    //   23: aload_1
    //   24: invokestatic Zv : (Lburp/Zr6h;)I
    //   27: istore #4
    //   29: iload #4
    //   31: iconst_m1
    //   32: if_icmpne -> 39
    //   35: aconst_null
    //   36: goto -> 53
    //   39: aload_1
    //   40: invokevirtual ZK : ()Ljava/util/List;
    //   43: iload #4
    //   45: invokeinterface get : (I)Ljava/lang/Object;
    //   50: checkcast burp/Ztnz
    //   53: astore #5
    //   55: aload #5
    //   57: ifnonnull -> 64
    //   60: aconst_null
    //   61: goto -> 72
    //   64: aload #5
    //   66: getfield ZM : [B
    //   69: invokestatic ZG : ([B)Ljava/lang/String;
    //   72: astore #6
    //   74: aload #6
    //   76: aload_0
    //   77: getfield Zj : Ljava/util/List;
    //   80: invokestatic ZQ : (Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    //   83: astore #7
    //   85: aload #5
    //   87: ifnonnull -> 119
    //   90: aload_3
    //   91: new burp/Ztnz
    //   94: dup
    //   95: sipush #8422
    //   98: sipush #-18748
    //   101: invokestatic a : (II)Ljava/lang/String;
    //   104: aload #7
    //   106: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   109: invokeinterface add : (Ljava/lang/Object;)Z
    //   114: pop
    //   115: aload_2
    //   116: ifnull -> 134
    //   119: aload_0
    //   120: getfield Zj : Ljava/util/List;
    //   123: aload_3
    //   124: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   129: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   134: aload_0
    //   135: invokevirtual Zo : ()Z
    //   138: ifne -> 176
    //   141: aload_0
    //   142: aload_3
    //   143: new burp/Ztnz
    //   146: dup
    //   147: sipush #8428
    //   150: sipush #4162
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: aload_0
    //   157: getfield ZM : Lburp/Zefx;
    //   160: invokeinterface ZF : ()Lburp/Zlit;
    //   165: invokeinterface toString : ()Ljava/lang/String;
    //   170: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   173: invokevirtual ZI : (Ljava/util/List;Lburp/Ztnz;)V
    //   176: aload_3
    //   177: areturn
  }
  
  private void Zf(Zr6h paramZr6h, List<Ztnz> paramList) {
    int i = Za(paramZr6h);
    if (i >= 0 && !this.ZF) {
      Ztnz ztnz = paramList.get(i);
      paramList.set(i, new Ztnz(ztnz.Ze, Zkb.Zy(a(8420, 5131))));
    } 
    int j = Zl(paramZr6h.ZK(), Zgj9::lambda$fixHttp2Headers$4);
    if (j >= 0)
      paramList.set(j, new Ztnz(a(8418, -32186), Zkb.ZG(this.Zi.ZdH()))); 
  }
  
  private boolean Zf(Ztnz paramZtnz) {
    return (paramZtnz.ZM == null || Zkqw.Zh(Zkb.ZG(paramZtnz.Ze), this.ZF, this.Zr));
  }
  
  private static boolean Zc(Ztnz paramZtnz) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Ze : [B
    //   4: invokestatic ZG : ([B)Ljava/lang/String;
    //   7: astore_2
    //   8: invokestatic Zk : ()[Ljava/lang/String;
    //   11: iconst_m1
    //   12: istore_3
    //   13: astore_1
    //   14: aload_2
    //   15: invokevirtual hashCode : ()I
    //   18: lookupswitch default -> 144, -1332238263 -> 104, -1141949029 -> 126, -972381601 -> 60, 56997727 -> 82
    //   60: aload_2
    //   61: sipush #8417
    //   64: sipush #931
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: invokevirtual equals : (Ljava/lang/Object;)Z
    //   73: ifeq -> 144
    //   76: iconst_0
    //   77: istore_3
    //   78: aload_1
    //   79: ifnull -> 144
    //   82: aload_2
    //   83: sipush #8418
    //   86: sipush #-32186
    //   89: invokestatic a : (II)Ljava/lang/String;
    //   92: invokevirtual equals : (Ljava/lang/Object;)Z
    //   95: ifeq -> 144
    //   98: iconst_1
    //   99: istore_3
    //   100: aload_1
    //   101: ifnull -> 144
    //   104: aload_2
    //   105: sipush #8419
    //   108: sipush #300
    //   111: invokestatic a : (II)Ljava/lang/String;
    //   114: invokevirtual equals : (Ljava/lang/Object;)Z
    //   117: ifeq -> 144
    //   120: iconst_2
    //   121: istore_3
    //   122: aload_1
    //   123: ifnull -> 144
    //   126: aload_2
    //   127: sipush #8426
    //   130: sipush #14531
    //   133: invokestatic a : (II)Ljava/lang/String;
    //   136: invokevirtual equals : (Ljava/lang/Object;)Z
    //   139: ifeq -> 144
    //   142: iconst_3
    //   143: istore_3
    //   144: iload_3
    //   145: tableswitch default -> 178, 0 -> 176, 1 -> 176, 2 -> 176, 3 -> 176
    //   176: iconst_1
    //   177: ireturn
    //   178: iconst_0
    //   179: ireturn
  }
  
  private static boolean ZV(Ztnz paramZtnz) {
    String str = Zkb.ZG(paramZtnz.Ze).toLowerCase(Locale.ENGLISH);
    return (str.equals(a(8425, 26438)) || str.equals(a(8427, 23261)) || str.equals(a(8421, 31240)));
  }
  
  private static int Zv(Zr6h paramZr6h) {
    return Zl(paramZr6h.ZK(), Zgj9::lambda$findIndexForFirstCookieHeader$5);
  }
  
  private static int Za(Zr6h paramZr6h) {
    return Zl(paramZr6h.ZK(), Zgj9::lambda$findIndexForMethodHeader$6);
  }
  
  private static int Zl(List<Ztnz> paramList, Predicate<Ztnz> paramPredicate) {
    // Byte code:
    //   0: iconst_0
    //   1: aload_0
    //   2: invokeinterface size : ()I
    //   7: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   10: aload_1
    //   11: aload_0
    //   12: <illegal opcode> test : (Ljava/util/function/Predicate;Ljava/util/List;)Ljava/util/function/IntPredicate;
    //   17: invokeinterface filter : (Ljava/util/function/IntPredicate;)Ljava/util/stream/IntStream;
    //   22: invokeinterface findFirst : ()Ljava/util/OptionalInt;
    //   27: iconst_m1
    //   28: invokevirtual orElse : (I)I
    //   31: ireturn
  }
  
  private static boolean lambda$findIndexForHeader$7(Predicate<Ztnz> paramPredicate, List<Ztnz> paramList, int paramInt) {
    return paramPredicate.test(paramList.get(paramInt));
  }
  
  private static boolean lambda$findIndexForMethodHeader$6(Ztnz paramZtnz) {
    return Zkb.ZG(paramZtnz.Ze).equals(a(8423, -20273));
  }
  
  private static boolean lambda$findIndexForFirstCookieHeader$5(Ztnz paramZtnz) {
    return Zkb.ZG(paramZtnz.Ze).toLowerCase(Locale.ENGLISH).equals(a(8416, -6502));
  }
  
  private static boolean lambda$fixHttp2Headers$4(Ztnz paramZtnz) {
    return Zkb.ZG(paramZtnz.Ze).equals(a(8429, 6970));
  }
  
  private static void lambda$sameDomainRedirectHeaders$3(List<Ztnz> paramList, String paramString) {
    paramList.add(new Ztnz(a(8416, -6502), paramString));
  }
  
  private boolean lambda$http2RequestHeaders$2(Ztnz paramZtnz) {
    return (Zc(paramZtnz) || Zf(paramZtnz));
  }
  
  private static boolean lambda$addOrReplaceHeader$1(Ztnz paramZtnz1, Ztnz paramZtnz2) {
    return Zkb.ZG(paramZtnz2.Ze).toLowerCase(Locale.ENGLISH).equals(Zkb.ZG(paramZtnz1.Ze).toLowerCase(Locale.ENGLISH));
  }
  
  private static boolean lambda$crossDomainRedirectHeaders$0(Ztnz paramZtnz) {
    return Zkb.ZG(paramZtnz.Ze).toLowerCase(Locale.ENGLISH).equals(a(8424, -3770).toLowerCase(Locale.ENGLISH));
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '3UxÔ³~ÏÀúÐ®¢H&\\n±ç@RìXè\\r;â)E?T"ãfõF¹Î|ÐòlýÙ¡ELf6ªå£®\\n¥ÇQö,øÆ\\fÉÂ&9U4uåN3Ôð4x¥ù¦\aö3¿÷ä!ÿÜlt ¹Zpí%'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #104
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
    //   68: ldc 'Xh~¥VxhàÉ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #12
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
    //   128: putstatic burp/Zgj9.a : [Ljava/lang/String;
    //   131: bipush #15
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zgj9.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #8
    //   214: goto -> 243
    //   217: bipush #46
    //   219: goto -> 243
    //   222: bipush #26
    //   224: goto -> 243
    //   227: bipush #55
    //   229: goto -> 243
    //   232: bipush #113
    //   234: goto -> 243
    //   237: iconst_4
    //   238: goto -> 243
    //   241: bipush #41
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x20E0) & 0xFFFF;
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
      char c = 'É';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgj9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */