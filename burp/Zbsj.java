package burp;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.portswigger.Z_j;
import net.portswigger.Zf6;
import net.portswigger.Zh2;
import net.portswigger.Zkv;
import net.portswigger.Zms;
import net.portswigger.Zoj;
import net.portswigger.Zqf;
import net.portswigger.Zrm7;
import net.portswigger.Zrmr;
import net.portswigger.Zs7;
import net.portswigger.Zsj;
import net.portswigger.Zt0;
import net.portswigger.Zu3;
import net.portswigger.Zu7;
import net.portswigger.Zuh;
import net.portswigger.Zuo;
import net.portswigger.Zv7;
import net.portswigger.Zz5;
import net.portswigger.Zzx;
import net.portswigger.Zzz;

public class Zbsj extends Z_j {
  private final Zsba Zg;
  
  private final Zz_4 ZG;
  
  private final Zg1z Za;
  
  private final Stack<Zz__> Zj = new Stack<>();
  
  private final Map<String, Zio> Zm = new LinkedHashMap<>();
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zbsj(Zsba paramZsba, Zz_4 paramZz_4, Zg1z paramZg1z) {
    this.Zg = paramZsba;
    this.ZG = paramZz_4;
    this.Za = paramZg1z;
  }
  
  void Zz(Consumer<Zs3b> paramConsumer) {
    this.Zm.values().stream().map(Zio::Zb).forEach(paramConsumer);
  }
  
  private Zio Zw() {
    // Byte code:
    //   0: invokestatic Zp : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zj : Ljava/util/Stack;
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifne -> 22
    //   14: iconst_1
    //   15: goto -> 23
    //   18: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   21: athrow
    //   22: iconst_0
    //   23: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   26: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   29: aload_0
    //   30: iconst_0
    //   31: invokevirtual ZP : (I)Ljava/lang/String;
    //   34: astore_2
    //   35: aload_0
    //   36: getfield Zj : Ljava/util/Stack;
    //   39: invokevirtual size : ()I
    //   42: iconst_1
    //   43: isub
    //   44: istore_3
    //   45: iload_3
    //   46: ifle -> 80
    //   49: aload_0
    //   50: getfield Zj : Ljava/util/Stack;
    //   53: iload_3
    //   54: invokevirtual get : (I)Ljava/lang/Object;
    //   57: checkcast burp/Zz__
    //   60: invokevirtual Zd : ()Z
    //   63: ifeq -> 73
    //   66: goto -> 80
    //   69: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   72: athrow
    //   73: iinc #3, -1
    //   76: aload_1
    //   77: ifnonnull -> 45
    //   80: aload_0
    //   81: iload_3
    //   82: invokevirtual ZP : (I)Ljava/lang/String;
    //   85: astore #4
    //   87: aload_0
    //   88: getfield Zm : Ljava/util/Map;
    //   91: aload_2
    //   92: aload_0
    //   93: aload_2
    //   94: aload #4
    //   96: <illegal opcode> apply : (Lburp/Zbsj;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Function;
    //   101: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   106: checkcast burp/Zio
    //   109: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	18	java/lang/UnsupportedOperationException
    //   49	69	69	java/lang/UnsupportedOperationException
  }
  
  private Optional<Zio> Zb() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zuh.Zb(!this.Zj.isEmpty(), Zqf.Zr);
    String str = ZP(0);
    return Optional.ofNullable(this.Zm.get(str));
  }
  
  private String ZP(int paramInt) {
    return this.Zj.stream().skip(paramInt).map(Zz__::Zg).collect(Collectors.joining("."));
  }
  
  public void Zp(Zu3 paramZu3) {
    try {
      if (this.Zg != Zsba.URL_ENCODED)
        try {
          if (this.Zg != Zsba.NONE) {
            Zq(b(12007, 1428));
            return;
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    paramZu3.Zqi().forEach(this::lambda$visitKeyValues$1);
    paramZu3.ZqA().forEach(this::lambda$visitKeyValues$2);
  }
  
  public void Zt(Zv7 paramZv7) {
    int[] arrayOfInt = Zrc8.Zp();
    try {
      if (this.Zg != Zsba.URL_ENCODED)
        try {
          if (this.Zg != Zsba.NONE) {
            Zq(b(12001, 15587));
            return;
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zms zms = paramZv7.ZrU();
    if (zms instanceof Zrm7) {
      String str = ((Zrm7)zms).ZgH();
      try {
        this.Zj.push(Zz__.Zv(str));
        paramZv7.Zrf().ZF((Zuo)this);
        this.Zj.pop();
        if (arrayOfInt == null) {
          Zuh.Zb(false, Zqf.Zk);
          return;
        } 
      } catch (UnsupportedOperationException unsupportedOperationException) {
        throw a(null);
      } 
      return;
    } 
    Zuh.Zb(false, Zqf.Zk);
  }
  
  public void ZY(Zsj paramZsj) {
    try {
      if (!paramZsj.ZYQ().isEmpty())
        ((Zms)paramZsj.ZYQ().get(0)).ZF((Zuo)this); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public void ZL(Zz5 paramZz5) {}
  
  public void ZI(Zoj paramZoj) {
    // Byte code:
    //   0: invokestatic Zp : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual ZQK : ()Ljava/util/List;
    //   8: invokeinterface isEmpty : ()Z
    //   13: ifeq -> 21
    //   16: return
    //   17: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   20: athrow
    //   21: aload_1
    //   22: invokevirtual ZQe : ()I
    //   25: ifne -> 36
    //   28: iconst_1
    //   29: goto -> 40
    //   32: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   35: athrow
    //   36: aload_1
    //   37: invokevirtual ZQe : ()I
    //   40: istore_3
    //   41: aload_1
    //   42: invokevirtual ZQo : ()Ljava/lang/Boolean;
    //   45: ifnull -> 65
    //   48: aload_1
    //   49: invokevirtual ZQo : ()Ljava/lang/Boolean;
    //   52: invokevirtual booleanValue : ()Z
    //   55: ifeq -> 73
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   64: athrow
    //   65: iconst_1
    //   66: goto -> 74
    //   69: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   72: athrow
    //   73: iconst_0
    //   74: istore #4
    //   76: iload #4
    //   78: ifeq -> 91
    //   81: getstatic burp/Zb2c.NONE : Lburp/Zb2c;
    //   84: goto -> 98
    //   87: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   90: athrow
    //   91: aload_1
    //   92: invokevirtual ZQ8 : ()Ljava/lang/String;
    //   95: invokestatic ZX : (Ljava/lang/String;)Lburp/Zb2c;
    //   98: astore #5
    //   100: aload_0
    //   101: iconst_0
    //   102: invokevirtual ZP : (I)Ljava/lang/String;
    //   105: astore #6
    //   107: new burp/Zbso
    //   110: dup
    //   111: aload_0
    //   112: getfield Zj : Ljava/util/Stack;
    //   115: invokevirtual peek : ()Ljava/lang/Object;
    //   118: checkcast burp/Zz__
    //   121: invokevirtual Zg : ()Ljava/lang/String;
    //   124: aload #5
    //   126: aload_0
    //   127: getfield ZG : Lburp/Zz_4;
    //   130: aload_0
    //   131: getfield Za : Lburp/Zg1z;
    //   134: invokespecial <init> : (Ljava/lang/String;Lburp/Zb2c;Lburp/Zz_4;Lburp/Zg1z;)V
    //   137: astore #7
    //   139: aload_1
    //   140: invokevirtual ZQO : ()Ljava/util/List;
    //   143: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   148: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   153: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   158: invokeinterface findFirst : ()Ljava/util/Optional;
    //   163: astore #8
    //   165: iconst_0
    //   166: istore #9
    //   168: iload #9
    //   170: iload_3
    //   171: if_icmpge -> 201
    //   174: aload_1
    //   175: invokevirtual ZQK : ()Ljava/util/List;
    //   178: iconst_0
    //   179: invokeinterface get : (I)Ljava/lang/Object;
    //   184: checkcast net/portswigger/Zms
    //   187: aload #7
    //   189: invokeinterface ZF : (Lnet/portswigger/Zuo;)V
    //   194: iinc #9, 1
    //   197: aload_2
    //   198: ifnonnull -> 168
    //   201: aload #7
    //   203: invokevirtual ZW : ()Ljava/util/List;
    //   206: astore #9
    //   208: iconst_0
    //   209: istore #10
    //   211: iload #10
    //   213: aload #9
    //   215: invokeinterface size : ()I
    //   220: if_icmpge -> 356
    //   223: aload #9
    //   225: iload #10
    //   227: invokeinterface get : (I)Ljava/lang/Object;
    //   232: checkcast burp/Zio
    //   235: astore #11
    //   237: aload #11
    //   239: aload #6
    //   241: iload #10
    //   243: sipush #12008
    //   246: sipush #6991
    //   249: invokestatic b : (II)Ljava/lang/String;
    //   252: swap
    //   253: ldc ']'
    //   255: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   260: invokevirtual Zj : (Ljava/lang/String;)Lburp/Zvy;
    //   263: pop
    //   264: aload #8
    //   266: invokevirtual isPresent : ()Z
    //   269: ifeq -> 328
    //   272: aload #8
    //   274: invokevirtual get : ()Ljava/lang/Object;
    //   277: checkcast java/util/List
    //   280: invokeinterface size : ()I
    //   285: iload #10
    //   287: if_icmple -> 328
    //   290: goto -> 297
    //   293: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   296: athrow
    //   297: aload #11
    //   299: aload #8
    //   301: invokevirtual get : ()Ljava/lang/Object;
    //   304: checkcast java/util/List
    //   307: iload #10
    //   309: invokeinterface get : (I)Ljava/lang/Object;
    //   314: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   317: invokevirtual ZR : (Ljava/lang/String;)Lburp/Zvy;
    //   320: pop
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   327: athrow
    //   328: aload_0
    //   329: getfield Zm : Ljava/util/Map;
    //   332: aload #6
    //   334: iload #10
    //   336: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   341: aload #11
    //   343: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   348: pop
    //   349: iinc #10, 1
    //   352: aload_2
    //   353: ifnonnull -> 211
    //   356: return
    // Exception table:
    //   from	to	target	type
    //   4	17	17	java/lang/UnsupportedOperationException
    //   21	32	32	java/lang/UnsupportedOperationException
    //   41	58	61	java/lang/UnsupportedOperationException
    //   48	69	69	java/lang/UnsupportedOperationException
    //   76	87	87	java/lang/UnsupportedOperationException
    //   237	290	293	java/lang/UnsupportedOperationException
    //   272	321	324	java/lang/UnsupportedOperationException
  }
  
  public void Zh(Zf6 paramZf6) {
    try {
      if (this.Zg != Zsba.JSON)
        try {
          if (this.Zg != Zsba.NONE) {
            Zq(b(12002, 4488));
            return;
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (this.ZG != Zz_4.BODY) {
        Zq(b(12006, -14671));
        return;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    paramZf6.ZnW().forEach(this::lambda$visitJsonObject$4);
    paramZf6.Zn1().forEach(this::lambda$visitJsonObject$5);
  }
  
  public void ZI(Zh2 paramZh2) {
    int[] arrayOfInt = Zrc8.Zp();
    try {
      if (this.Zg != Zsba.JSON)
        try {
          if (this.Zg != Zsba.NONE) {
            Zq(b(12003, -14495));
            return;
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (this.ZG != Zz_4.BODY) {
        Zq(b(12005, -25488));
        return;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    byte b = 0;
    while (b < paramZh2.ZhO().size()) {
      this.Zj.push(Zz__.Zc(b));
      ((Zms)paramZh2.ZhO().get(b)).ZF((Zuo)this);
      this.Zj.pop();
      b++;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  public void ZY(Zs7 paramZs7) {
    ZQ((Zms)paramZs7);
  }
  
  public void ZC(Zrmr paramZrmr) {
    ZQ((Zms)paramZrmr);
  }
  
  public void Zz(Zzz paramZzz) {
    ZQ((Zms)paramZzz);
  }
  
  public void Zr(Zt0 paramZt0) {
    ZQ((Zms)paramZt0);
  }
  
  private void ZQ(Zms paramZms) {
    try {
      if (this.Zj.isEmpty()) {
        Zq(b(12000, -31041));
        return;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zio zio = Zw();
    paramZms.ZF(new Zrcz(zio));
    paramZms.ZF(new Zrc6(zio));
    paramZms.ZF(new Zrcl(zio));
    paramZms.ZF(new Zrcf(zio));
    paramZms.ZF(new Zrcj(zio));
  }
  
  public void Zc(Zrm7 paramZrm7) {
    Zv((Zu7<?>)paramZrm7);
  }
  
  public void ZE(Zzx paramZzx) {
    Zv((Zu7<?>)paramZzx);
  }
  
  public void ZT(Zkv paramZkv) {
    Zv((Zu7<?>)paramZkv);
  }
  
  private void Zv(Zu7<?> paramZu7) {
    try {
      if (this.Zj.isEmpty()) {
        Zq(b(12004, 22033));
        return;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Optional<Zio> optional = Zb();
    optional.ifPresent(paramZu7::lambda$visitValue$6);
  }
  
  protected void Zq(String paramString) {
    this.Za.Zc(this.ZG.ZW(), paramString);
    throw new UnsupportedOperationException();
  }
  
  private static void lambda$visitValue$6(Zu7 paramZu7, Zio paramZio) {
    paramZu7.ZF(new Zrcl(paramZio));
  }
  
  private void lambda$visitJsonObject$5(Zf6 paramZf6) {
    paramZf6.ZF((Zuo)this);
  }
  
  private void lambda$visitJsonObject$4(String paramString, Zms paramZms) {
    this.Zj.push(Zz__.Zv(paramString));
    paramZms.ZF((Zuo)this);
    this.Zj.pop();
  }
  
  private static boolean lambda$visitArray$3(List paramList) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return !paramList.isEmpty();
  }
  
  private void lambda$visitKeyValues$2(Zu3 paramZu3) {
    paramZu3.ZF((Zuo)this);
  }
  
  private void lambda$visitKeyValues$1(Zv7 paramZv7) {
    paramZv7.ZF((Zuo)this);
  }
  
  private Zio lambda$getOrCreateParameterBuilder$0(String paramString1, String paramString2, String paramString3) {
    return (new Zio()).Zj(paramString1).Zn(paramString2).ZP(this.ZG);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÎÇi 5;áÌëjÍV¡4úØ\\bS¡Ð¯=­å/µBÿQ=\\rPp°1êdñ©ª×\\råFSç2¾êDÊÁxº³®ªDõ¡6Z¸\\fJb&5ÏJ '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #22
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #68
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
    //   68: ldc 'ú¢)Ñ=ÌnUèÆVmYY|Ë/'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #18
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #20
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
    //   129: putstatic burp/Zbsj.c : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbsj.d : [Ljava/lang/String;
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
    //   212: bipush #47
    //   214: goto -> 244
    //   217: bipush #94
    //   219: goto -> 244
    //   222: bipush #28
    //   224: goto -> 244
    //   227: bipush #57
    //   229: goto -> 244
    //   232: bipush #34
    //   234: goto -> 244
    //   237: bipush #30
    //   239: goto -> 244
    //   242: bipush #71
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
    //   300: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2EE0) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      byte b1 = 14;
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbsj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */