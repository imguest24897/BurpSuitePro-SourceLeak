package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zrzt;

public class Zxar implements Zt9b {
  private final byte[] Zo;
  
  private final boolean Zc;
  
  private final boolean ZT;
  
  protected Zxar(byte[] paramArrayOfbyte, boolean paramBoolean1, boolean paramBoolean2) {
    this.Zo = paramArrayOfbyte;
    this.Zc = paramBoolean1;
    this.ZT = paramBoolean2;
  }
  
  public Ze6l ZL(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      if (this.Zo.length != 0) {
        try {
          if (paramInt1 >= paramArrayOfbyte.length)
            return null; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        return null;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Ze6l ze6l = Zr(paramArrayOfbyte, paramInt1, paramInt2);
    try {
      if (ze6l != null)
        return ze6l; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (!this.ZT)
        try {
          return !this.Zc ? null : Zs(paramArrayOfbyte, paramInt1, paramInt2);
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return Zs(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private Ze6l Zs(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = Zli.ZZ(paramArrayOfbyte, this.Zo, false, paramInt1, paramInt2);
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (i < 0) ? null : new Ze6l(i, i + this.Zo.length);
  }
  
  private Ze6l Zr(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #5
    //   3: invokestatic Zl : ()Ljava/lang/String;
    //   6: iconst_m1
    //   7: istore #6
    //   9: astore #4
    //   11: aload_0
    //   12: getfield Zc : Z
    //   15: istore #7
    //   17: iload_2
    //   18: iload_3
    //   19: aload_0
    //   20: getfield Zo : [B
    //   23: arraylength
    //   24: isub
    //   25: iload #5
    //   27: iadd
    //   28: if_icmpgt -> 345
    //   31: iload #6
    //   33: ifge -> 39
    //   36: iload_2
    //   37: istore #6
    //   39: aload_0
    //   40: getfield ZT : Z
    //   43: ifeq -> 86
    //   46: aload_0
    //   47: aload_1
    //   48: iload_2
    //   49: iload_3
    //   50: iload #5
    //   52: invokevirtual Zd : ([BIII)Lburp/Zgf7;
    //   55: astore #9
    //   57: aload #9
    //   59: ifnonnull -> 68
    //   62: aconst_null
    //   63: areturn
    //   64: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   67: athrow
    //   68: aload #9
    //   70: getfield ZM : B
    //   73: istore #8
    //   75: aload #9
    //   77: getfield ZC : I
    //   80: istore_2
    //   81: aload #4
    //   83: ifnull -> 94
    //   86: aload_1
    //   87: iload_2
    //   88: iinc #2, 1
    //   91: baload
    //   92: istore #8
    //   94: iload #7
    //   96: ifeq -> 259
    //   99: iload #8
    //   101: bipush #92
    //   103: if_icmpne -> 259
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   112: athrow
    //   113: aload_0
    //   114: aload_0
    //   115: getfield Zo : [B
    //   118: iload #5
    //   120: baload
    //   121: invokevirtual ZW : (B)Z
    //   124: ifeq -> 259
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   133: athrow
    //   134: iconst_0
    //   135: istore #9
    //   137: iload #9
    //   139: bipush #7
    //   141: if_icmpge -> 259
    //   144: iload_2
    //   145: iload #9
    //   147: iadd
    //   148: iload_3
    //   149: aload_0
    //   150: getfield Zo : [B
    //   153: arraylength
    //   154: isub
    //   155: iload #5
    //   157: iadd
    //   158: iconst_1
    //   159: iadd
    //   160: if_icmplt -> 169
    //   163: aconst_null
    //   164: areturn
    //   165: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   168: athrow
    //   169: aload_0
    //   170: aload_1
    //   171: iload_2
    //   172: iload #9
    //   174: iadd
    //   175: iload_3
    //   176: iload #5
    //   178: invokevirtual Zd : ([BIII)Lburp/Zgf7;
    //   181: astore #10
    //   183: aload #10
    //   185: ifnonnull -> 194
    //   188: aconst_null
    //   189: areturn
    //   190: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   193: athrow
    //   194: aload_0
    //   195: aload #10
    //   197: getfield ZM : B
    //   200: invokevirtual ZW : (B)Z
    //   203: ifeq -> 227
    //   206: aload #10
    //   208: getfield ZM : B
    //   211: istore #8
    //   213: aload #10
    //   215: getfield ZC : I
    //   218: istore_2
    //   219: iconst_0
    //   220: istore #7
    //   222: aload #4
    //   224: ifnull -> 259
    //   227: aload #10
    //   229: getfield ZM : B
    //   232: bipush #92
    //   234: if_icmpeq -> 251
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   243: athrow
    //   244: goto -> 259
    //   247: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   250: athrow
    //   251: iinc #9, 1
    //   254: aload #4
    //   256: ifnull -> 137
    //   259: iload #8
    //   261: invokestatic Zn : (B)B
    //   264: aload_0
    //   265: getfield Zo : [B
    //   268: iload #5
    //   270: baload
    //   271: invokestatic Zn : (B)B
    //   274: if_icmpne -> 292
    //   277: iinc #5, 1
    //   280: aload #4
    //   282: ifnull -> 315
    //   285: goto -> 292
    //   288: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   291: athrow
    //   292: iload #6
    //   294: iflt -> 309
    //   297: goto -> 304
    //   300: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   303: athrow
    //   304: iload #6
    //   306: iconst_1
    //   307: iadd
    //   308: istore_2
    //   309: iconst_0
    //   310: istore #5
    //   312: iconst_m1
    //   313: istore #6
    //   315: iload #5
    //   317: aload_0
    //   318: getfield Zo : [B
    //   321: arraylength
    //   322: if_icmpne -> 340
    //   325: new burp/Ze6l
    //   328: dup
    //   329: iload #6
    //   331: iload_2
    //   332: invokespecial <init> : (II)V
    //   335: areturn
    //   336: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   339: athrow
    //   340: aload #4
    //   342: ifnull -> 17
    //   345: aconst_null
    //   346: areturn
    // Exception table:
    //   from	to	target	type
    //   57	64	64	java/lang/NumberFormatException
    //   94	106	109	java/lang/NumberFormatException
    //   99	127	130	java/lang/NumberFormatException
    //   144	165	165	java/lang/NumberFormatException
    //   183	190	190	java/lang/NumberFormatException
    //   222	237	240	java/lang/NumberFormatException
    //   227	247	247	java/lang/NumberFormatException
    //   259	285	288	java/lang/NumberFormatException
    //   277	297	300	java/lang/NumberFormatException
    //   315	336	336	java/lang/NumberFormatException
  }
  
  private Zgf7 Zd(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    byte b = paramArrayOfbyte[paramInt1++];
    try {
      if (this.ZT && b == 38) {
        int i = Zli.ZU(paramArrayOfbyte, (byte)59, paramInt1 + 1, paramArrayOfbyte.length);
        if (i > -1) {
          byte b1 = ZT(paramArrayOfbyte, paramInt1, i);
          if (b1 >= 0) {
            b = b1;
            paramInt1 = i + 1;
            try {
              if (paramInt1 > paramInt2 - this.Zo.length + paramInt3 + 1)
                return null; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
          } 
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return new Zgf7(paramInt1, b);
  }
  
  private boolean ZW(byte paramByte) {
    try {
      if (paramByte != 39)
        try {
          if (paramByte != 34) {
            try {
              if (paramByte == 96);
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            return false;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private byte ZT(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    String str = Zkb.Zo(paramArrayOfbyte, paramInt1, paramInt2 - paramInt1);
    if (str.startsWith("#"))
      try {
        try {
          if (str.length() >= 2 && str.substring(1, 2).toLowerCase().equals("x"))
            return Byte.parseByte(str.substring(2), 16); 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return Byte.parseByte(str.substring(1));
      } catch (NumberFormatException numberFormatException) {
        Zah.Zl(numberFormatException, Zk_.IGNORED);
        return -1;
      }  
    Character character = (Character)Zrzt.Z_.get(str.toLowerCase());
    try {
      if (character != null)
        return (byte)character.charValue(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return -1;
  }
  
  public static Zxar Zg(byte[] paramArrayOfbyte) {
    return new Zxar(paramArrayOfbyte, false, false);
  }
  
  public static Zxar ZK(byte[] paramArrayOfbyte) {
    return new Zxar(paramArrayOfbyte, false, true);
  }
  
  public static Zxar ZP(byte[] paramArrayOfbyte) {
    return new Zxar(paramArrayOfbyte, true, true);
  }
  
  public static Zxar Zc(byte[] paramArrayOfbyte) {
    return new Zxar(paramArrayOfbyte, true, false);
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxar.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */