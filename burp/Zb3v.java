package burp;

public class Zb3v {
  private final Zr_4 ZO;
  
  private final Ztg8 ZG;
  
  private static final String a;
  
  public Zb3v(Zr_4 paramZr_4, Ztg8 paramZtg8) {
    this.ZO = paramZr_4;
    this.ZG = paramZtg8;
  }
  
  protected <U extends Zgpi<?>> U[] ZY(U[] paramArrayOfU) {
    boolean bool = Zkao.Zup();
    try {
      if (paramArrayOfU != null)
        try {
          if (paramArrayOfU.length != 0) {
            byte b = 0;
            while (b < paramArrayOfU.length) {
              paramArrayOfU[b] = Zc(paramArrayOfU[b]);
              b++;
              if (!bool)
                break; 
            } 
            return paramArrayOfU;
          } 
          return paramArrayOfU;
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return paramArrayOfU;
  }
  
  public <U extends Zgpi<?>> U Zc(U paramU) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZO : Lburp/Zr_4;
    //   4: invokeinterface Zi : ()Z
    //   9: istore_3
    //   10: invokestatic ZuF : ()Z
    //   13: aload_1
    //   14: instanceof burp/Zxsr
    //   17: istore #4
    //   19: istore_2
    //   20: aload_1
    //   21: instanceof burp/Zstu
    //   24: istore #5
    //   26: iload #4
    //   28: ifeq -> 60
    //   31: aload_1
    //   32: checkcast burp/Zxsr
    //   35: invokevirtual ZPz : ()Lburp/Zr_4;
    //   38: aload_0
    //   39: getfield ZO : Lburp/Zr_4;
    //   42: if_acmpne -> 60
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   51: athrow
    //   52: iconst_1
    //   53: goto -> 61
    //   56: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   59: athrow
    //   60: iconst_0
    //   61: istore #6
    //   63: iload #5
    //   65: ifeq -> 77
    //   68: iload #6
    //   70: goto -> 125
    //   73: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   76: athrow
    //   77: iload #4
    //   79: ifeq -> 93
    //   82: iload_3
    //   83: ifne -> 116
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   92: athrow
    //   93: iload_3
    //   94: ifne -> 124
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   103: athrow
    //   104: iload #4
    //   106: ifne -> 124
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   115: athrow
    //   116: iconst_1
    //   117: goto -> 125
    //   120: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   123: athrow
    //   124: iconst_0
    //   125: istore #7
    //   127: iload #4
    //   129: ifeq -> 170
    //   132: iload_3
    //   133: ifne -> 170
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   142: athrow
    //   143: iload #5
    //   145: ifne -> 170
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   154: athrow
    //   155: new java/lang/IllegalStateException
    //   158: dup
    //   159: getstatic burp/Zb3v.a : Ljava/lang/String;
    //   162: invokespecial <init> : (Ljava/lang/String;)V
    //   165: athrow
    //   166: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   169: athrow
    //   170: iload #7
    //   172: ifeq -> 183
    //   175: aload_1
    //   176: goto -> 193
    //   179: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   182: athrow
    //   183: aload_0
    //   184: getfield ZG : Lburp/Ztg8;
    //   187: aload_1
    //   188: invokeinterface Zw : (Lburp/Zgpi;)Lburp/Zgpi;
    //   193: iload_2
    //   194: ifeq -> 211
    //   197: iconst_2
    //   198: anewarray burp/Zbqc
    //   201: invokestatic Zr : ([Lburp/Zbqc;)V
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   210: athrow
    //   211: areturn
    // Exception table:
    //   from	to	target	type
    //   26	45	48	java/lang/IllegalStateException
    //   31	56	56	java/lang/IllegalStateException
    //   63	73	73	java/lang/IllegalStateException
    //   77	86	89	java/lang/IllegalStateException
    //   82	97	100	java/lang/IllegalStateException
    //   93	109	112	java/lang/IllegalStateException
    //   104	120	120	java/lang/IllegalStateException
    //   127	136	139	java/lang/IllegalStateException
    //   132	148	151	java/lang/IllegalStateException
    //   143	166	166	java/lang/IllegalStateException
    //   170	179	179	java/lang/IllegalStateException
    //   193	204	207	java/lang/IllegalStateException
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: ldc 'H{-J\\t`izlK\\n9=x-X$=s%D R/)KR4r5$M`pp!G`yt8I/opb'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zb3v.a : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #25
    //   82: goto -> 112
    //   85: bipush #17
    //   87: goto -> 112
    //   90: bipush #72
    //   92: goto -> 112
    //   95: bipush #44
    //   97: goto -> 112
    //   100: bipush #97
    //   102: goto -> 112
    //   105: bipush #118
    //   107: goto -> 112
    //   110: bipush #68
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb3v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */