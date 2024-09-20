package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.math.BigDecimal;

@Zl
public class Zuh extends Zuy<BigDecimal> {
  public static final Zuh ZN;
  
  private static final String e;
  
  public Zuh() {
    super(BigDecimal.class);
  }
  
  public Object Zy(Zyg paramZyg) {
    return BigDecimal.ZERO;
  }
  
  public final Zd Zb() {
    return Zd.Float;
  }
  
  public BigDecimal Zv(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: invokevirtual Zy : ()I
    //   8: tableswitch default -> 155, 1 -> 125, 2 -> 155, 3 -> 141, 4 -> 155, 5 -> 155, 6 -> 115, 7 -> 56, 8 -> 110
    //   56: aload_0
    //   57: aload_1
    //   58: aload_2
    //   59: aload_0
    //   60: getfield ZC : Ljava/lang/Class;
    //   63: invokevirtual Zk : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/Class;)Lcom/fasterxml/Zj/Zx;
    //   66: astore #5
    //   68: aload #5
    //   70: getstatic com/fasterxml/Zj/Zx.AsNull : Lcom/fasterxml/Zj/Zx;
    //   73: if_acmpne -> 89
    //   76: aload_0
    //   77: aload_2
    //   78: invokevirtual Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   81: checkcast java/math/BigDecimal
    //   84: areturn
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: aload #5
    //   91: getstatic com/fasterxml/Zj/Zx.AsEmpty : Lcom/fasterxml/Zj/Zx;
    //   94: if_acmpne -> 110
    //   97: aload_0
    //   98: aload_2
    //   99: invokevirtual Zy : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   102: checkcast java/math/BigDecimal
    //   105: areturn
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload_1
    //   111: invokevirtual ZT : ()Ljava/math/BigDecimal;
    //   114: areturn
    //   115: aload_1
    //   116: invokevirtual ZR : ()Ljava/lang/String;
    //   119: astore #4
    //   121: aload_3
    //   122: ifnull -> 169
    //   125: aload_2
    //   126: aload_1
    //   127: aload_0
    //   128: aload_0
    //   129: getfield ZC : Ljava/lang/Class;
    //   132: invokevirtual Zc : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyo;Ljava/lang/Class;)Ljava/lang/String;
    //   135: astore #4
    //   137: aload_3
    //   138: ifnull -> 169
    //   141: aload_0
    //   142: aload_1
    //   143: aload_2
    //   144: invokevirtual ZF : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   147: checkcast java/math/BigDecimal
    //   150: areturn
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: aload_2
    //   156: aload_0
    //   157: aload_2
    //   158: invokevirtual Zq : (Lcom/fasterxml/Zor/Zyg;)Lcom/fasterxml/Zor/Zk;
    //   161: aload_1
    //   162: invokevirtual ZE : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zb/Zg;)Ljava/lang/Object;
    //   165: checkcast java/math/BigDecimal
    //   168: areturn
    //   169: aload_0
    //   170: aload_2
    //   171: aload #4
    //   173: invokevirtual ZR : (Lcom/fasterxml/Zor/Zyg;Ljava/lang/String;)Lcom/fasterxml/Zj/Zx;
    //   176: astore #5
    //   178: aload #5
    //   180: getstatic com/fasterxml/Zj/Zx.AsNull : Lcom/fasterxml/Zj/Zx;
    //   183: if_acmpne -> 199
    //   186: aload_0
    //   187: aload_2
    //   188: invokevirtual Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   191: checkcast java/math/BigDecimal
    //   194: areturn
    //   195: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   198: athrow
    //   199: aload #5
    //   201: getstatic com/fasterxml/Zj/Zx.AsEmpty : Lcom/fasterxml/Zj/Zx;
    //   204: if_acmpne -> 220
    //   207: aload_0
    //   208: aload_2
    //   209: invokevirtual Zy : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   212: checkcast java/math/BigDecimal
    //   215: areturn
    //   216: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   219: athrow
    //   220: aload #4
    //   222: invokevirtual trim : ()Ljava/lang/String;
    //   225: astore #4
    //   227: aload_0
    //   228: aload #4
    //   230: invokevirtual Zo : (Ljava/lang/String;)Z
    //   233: ifeq -> 249
    //   236: aload_0
    //   237: aload_2
    //   238: invokevirtual Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   241: checkcast java/math/BigDecimal
    //   244: areturn
    //   245: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   248: athrow
    //   249: aload #4
    //   251: invokestatic ZA : (Ljava/lang/String;)Z
    //   254: ifeq -> 288
    //   257: aload_1
    //   258: invokevirtual ZG : ()Lcom/fasterxml/Zb/Z_;
    //   261: aload #4
    //   263: invokevirtual length : ()I
    //   266: invokevirtual Z_ : (I)V
    //   269: aload #4
    //   271: aload_1
    //   272: getstatic com/fasterxml/Zb/Zmv.USE_FAST_BIG_NUMBER_PARSER : Lcom/fasterxml/Zb/Zmv;
    //   275: invokevirtual Zt : (Lcom/fasterxml/Zb/Zmv;)Z
    //   278: invokestatic Zu : (Ljava/lang/String;Z)Ljava/math/BigDecimal;
    //   281: areturn
    //   282: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   285: athrow
    //   286: astore #6
    //   288: aload_2
    //   289: aload_0
    //   290: getfield ZC : Ljava/lang/Class;
    //   293: aload #4
    //   295: getstatic com/fasterxml/Zs/Zuh.e : Ljava/lang/String;
    //   298: iconst_0
    //   299: anewarray java/lang/Object
    //   302: invokevirtual ZN : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   305: checkcast java/math/BigDecimal
    //   308: areturn
    // Exception table:
    //   from	to	target	type
    //   68	85	85	java/lang/IllegalArgumentException
    //   89	106	106	java/lang/IllegalArgumentException
    //   137	151	151	java/lang/IllegalArgumentException
    //   178	195	195	java/lang/IllegalArgumentException
    //   199	216	216	java/lang/IllegalArgumentException
    //   227	245	245	java/lang/IllegalArgumentException
    //   249	282	282	java/io/IOException
    //   269	281	286	java/lang/IllegalArgumentException
  }
  
  static {
    // Byte code:
    //   0: bipush #57
    //   2: ldc 'G|C2[\\nZH^vXIYaRa_DXHg^}T'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zs/Zuh.e : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #16
    //   82: goto -> 111
    //   85: bipush #42
    //   87: goto -> 111
    //   90: bipush #14
    //   92: goto -> 111
    //   95: bipush #43
    //   97: goto -> 111
    //   100: iconst_3
    //   101: goto -> 111
    //   104: bipush #19
    //   106: goto -> 111
    //   109: bipush #21
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
    //   153: new com/fasterxml/Zs/Zuh
    //   156: dup
    //   157: invokespecial <init> : ()V
    //   160: putstatic com/fasterxml/Zs/Zuh.ZN : Lcom/fasterxml/Zs/Zuh;
    //   163: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zuh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */