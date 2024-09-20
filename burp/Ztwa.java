package burp;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Ztwa {
  private static final Ztt4 Zn;
  
  private final List<String> Zu;
  
  private final Zl9f Zl;
  
  private final Zk5o Zg;
  
  private final Zs29 ZR;
  
  private static final String a;
  
  public Ztwa(Ztog paramZtog1, List<String> paramList, Ztog paramZtog2, Zl9f paramZl9f, Collection<Zm3o> paramCollection, int paramInt1, int paramInt2) {
    this.Zu = paramList;
    this.Zl = paramZl9f;
    this.Zg = new Zk5o();
    this.ZR = new Zs29(paramZtog1, paramZtog2, paramZl9f, this.Zg, paramInt1, paramInt2);
    Objects.requireNonNull(this.Zg);
    paramCollection.forEach(this.Zg::Zh);
  }
  
  public byte[] ZR(Zbjt paramZbjt) {
    // Byte code:
    //   0: invokestatic Zg : ()Z
    //   3: new burp/Ztgm
    //   6: dup
    //   7: aload_1
    //   8: aload_0
    //   9: getfield Zl : Lburp/Zl9f;
    //   12: invokespecial <init> : (Lburp/Zbjt;Lburp/Zl9f;)V
    //   15: astore_3
    //   16: istore_2
    //   17: aload_0
    //   18: getfield Zu : Ljava/util/List;
    //   21: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   26: aload_1
    //   27: dup
    //   28: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   31: pop
    //   32: <illegal opcode> test : (Lburp/Zbjt;)Ljava/util/function/Predicate;
    //   37: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   42: invokeinterface findFirst : ()Ljava/util/Optional;
    //   47: astore #4
    //   49: aload #4
    //   51: invokevirtual isPresent : ()Z
    //   54: ifeq -> 498
    //   57: aload_1
    //   58: invokevirtual ZU : ()Ljava/lang/String;
    //   61: astore #5
    //   63: aload_0
    //   64: getfield ZR : Lburp/Zs29;
    //   67: aload #5
    //   69: aload_1
    //   70: invokevirtual ZF : ()I
    //   73: invokevirtual ZV : (Ljava/lang/String;I)Lburp/Zm4w;
    //   76: astore #6
    //   78: aload #6
    //   80: getfield ZV : Ljava/util/List;
    //   83: astore #7
    //   85: aload #6
    //   87: getfield ZQ : I
    //   90: istore #8
    //   92: aload_3
    //   93: invokevirtual Zr : ()V
    //   96: aload_1
    //   97: aload #4
    //   99: invokevirtual get : ()Ljava/lang/Object;
    //   102: checkcast java/lang/String
    //   105: invokevirtual ZO : (Ljava/lang/String;)I
    //   108: istore #9
    //   110: aload #6
    //   112: getfield ZE : I
    //   115: lookupswitch default -> 468, 1 -> 252, 2 -> 264, 5 -> 374, 6 -> 285, 12 -> 464, 13 -> 464, 15 -> 274, 16 -> 350, 28 -> 297, 33 -> 464, 35 -> 464, 43 -> 464, 48 -> 464, 65 -> 464, 255 -> 309, 257 -> 442
    //   252: aload_3
    //   253: aload #7
    //   255: iload #8
    //   257: invokevirtual Zg : (Ljava/util/List;I)V
    //   260: iload_2
    //   261: ifne -> 494
    //   264: aload_3
    //   265: iload #9
    //   267: invokevirtual Zl : (I)V
    //   270: iload_2
    //   271: ifne -> 494
    //   274: aload_3
    //   275: aload_1
    //   276: iload #8
    //   278: invokevirtual ZT : (Lburp/Zbjt;I)V
    //   281: iload_2
    //   282: ifne -> 494
    //   285: aload_3
    //   286: iload #8
    //   288: iload #9
    //   290: invokevirtual Zk : (II)V
    //   293: iload_2
    //   294: ifne -> 494
    //   297: aload_3
    //   298: aload #7
    //   300: iload #8
    //   302: invokevirtual ZR : (Ljava/util/List;I)V
    //   305: iload_2
    //   306: ifne -> 494
    //   309: aload_3
    //   310: iload #8
    //   312: iload #9
    //   314: invokevirtual Zk : (II)V
    //   317: aload_3
    //   318: iload #9
    //   320: invokevirtual Zl : (I)V
    //   323: aload_3
    //   324: aload #7
    //   326: iload #8
    //   328: invokevirtual Zg : (Ljava/util/List;I)V
    //   331: aload_3
    //   332: aload #7
    //   334: iload #8
    //   336: invokevirtual ZR : (Ljava/util/List;I)V
    //   339: aload_3
    //   340: aload_1
    //   341: iload #8
    //   343: invokevirtual ZT : (Lburp/Zbjt;I)V
    //   346: iload_2
    //   347: ifne -> 494
    //   350: aload_0
    //   351: getfield Zg : Lburp/Zk5o;
    //   354: aload #5
    //   356: invokevirtual Zl : (Ljava/lang/String;)Ljava/util/List;
    //   359: aload_3
    //   360: <illegal opcode> accept : (Lburp/Ztgm;)Ljava/util/function/Consumer;
    //   365: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   370: iload_2
    //   371: ifne -> 494
    //   374: aload_0
    //   375: getfield Zg : Lburp/Zk5o;
    //   378: aload #5
    //   380: invokevirtual Zg : (Ljava/lang/String;)Lburp/Zm3o;
    //   383: astore #10
    //   385: aload #10
    //   387: ifnull -> 416
    //   390: aload_1
    //   391: invokevirtual ZF : ()I
    //   394: iconst_5
    //   395: if_icmpne -> 416
    //   398: aload_3
    //   399: aload #10
    //   401: invokevirtual Zf : ()Ljava/lang/String;
    //   404: aload #10
    //   406: invokevirtual Zc : ()I
    //   409: invokevirtual ZR : (Ljava/lang/String;I)V
    //   412: iload_2
    //   413: ifne -> 494
    //   416: aload #6
    //   418: invokevirtual ZA : ()Z
    //   421: ifeq -> 494
    //   424: aload_3
    //   425: aload #6
    //   427: getfield ZS : Ljava/lang/String;
    //   430: aload #6
    //   432: getfield ZQ : I
    //   435: invokevirtual ZR : (Ljava/lang/String;I)V
    //   438: iload_2
    //   439: ifne -> 494
    //   442: aload_0
    //   443: getfield Zg : Lburp/Zk5o;
    //   446: invokevirtual Zw : ()Ljava/util/List;
    //   449: aload_3
    //   450: <illegal opcode> accept : (Lburp/Ztgm;)Ljava/util/function/Consumer;
    //   455: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   460: iload_2
    //   461: ifne -> 494
    //   464: iload_2
    //   465: ifne -> 494
    //   468: getstatic burp/Ztwa.Zn : Lburp/Ztt4;
    //   471: aload_1
    //   472: invokevirtual ZF : ()I
    //   475: getstatic burp/Ztwa.a : Ljava/lang/String;
    //   478: swap
    //   479: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   484: invokeinterface Zj : (Ljava/lang/String;)V
    //   489: aload_3
    //   490: iconst_4
    //   491: invokevirtual ZY : (I)V
    //   494: iload_2
    //   495: ifne -> 503
    //   498: aload_3
    //   499: iconst_5
    //   500: invokevirtual ZY : (I)V
    //   503: aload_3
    //   504: invokevirtual ZX : ()[B
    //   507: areturn
  }
  
  private static void lambda$create$1(Ztgm paramZtgm, Zm3o paramZm3o) {
    paramZtgm.ZP(paramZm3o.Zu(), paramZm3o.Zf(), paramZm3o.Zc());
  }
  
  private static void lambda$create$0(Ztgm paramZtgm, Zm3o paramZm3o) {
    paramZtgm.ZB(paramZm3o.Zf(), paramZm3o.Zc());
  }
  
  static {
    // Byte code:
    //   0: bipush #107
    //   2: ldc 'ghG_ZXQ-`t`OOP|Q_@SbVFN@}TUAXQ-PCC\\n'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztwa.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #94
    //   82: goto -> 111
    //   85: bipush #102
    //   87: goto -> 111
    //   90: bipush #79
    //   92: goto -> 111
    //   95: bipush #81
    //   97: goto -> 111
    //   100: bipush #88
    //   102: goto -> 111
    //   105: iconst_4
    //   106: goto -> 111
    //   109: bipush #86
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
    //   153: invokestatic Zr : ()Lburp/Ztt4;
    //   156: putstatic burp/Ztwa.Zn : Lburp/Ztt4;
    //   159: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztwa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */