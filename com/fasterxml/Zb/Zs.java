package com.fasterxml.Zb;

import com.fasterxml.Zyt;
import java.io.Serializable;

public class Zs implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected static final Zs Zk;
  
  protected final Zs ZP;
  
  protected final String Zt;
  
  protected final int ZD;
  
  protected final String Zj;
  
  protected final int ZI;
  
  protected int Za;
  
  private static final String a;
  
  protected Zs() {
    this.ZP = null;
    this.Zj = null;
    this.ZI = -1;
    this.Zt = "";
    this.ZD = 0;
  }
  
  protected Zs(String paramString1, int paramInt, String paramString2, Zs paramZs) {
    this.Zt = paramString1;
    this.ZD = paramInt;
    this.ZP = paramZs;
    this.Zj = paramString2;
    this.ZI = ZC(paramString2);
  }
  
  public static Zs Zl(String paramString) throws IllegalArgumentException {
    try {
      if (paramString != null)
        try {
          if (paramString.length() != 0) {
            try {
              if (paramString.charAt(0) != '/')
                throw new IllegalArgumentException(a + paramString + "\""); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return ZL(paramString);
          } 
          return Zk;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zk;
  }
  
  public boolean Zb() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZP == null);
  }
  
  public String ZB() {
    return this.Zj;
  }
  
  public int Zs() {
    return this.ZI;
  }
  
  public Zs ZC() {
    return this.ZP;
  }
  
  public String toString() {
    try {
      if (this.ZD <= 0)
        return this.Zt; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.Zt.substring(this.ZD);
  }
  
  public int hashCode() {
    int i = this.Za;
    if (i == 0) {
      i = toString().hashCode();
      if (i == 0)
        i = -1; 
      this.Za = i;
    } 
    return i;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject == this)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject == null)
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof Zs))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zs zs = (Zs)paramObject;
    return Zk(this.Zt, this.ZD, zs.Zt, zs.ZD);
  }
  
  private final boolean Zk(String paramString1, int paramInt1, String paramString2, int paramInt2) {
    int i = paramString1.length();
    try {
      if (i - paramInt1 != paramString2.length() - paramInt2)
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    while (paramInt1 < i) {
      if (paramString1.charAt(paramInt1++) != paramString2.charAt(paramInt2++))
        return false; 
    } 
    return true;
  }
  
  private static final int ZC(String paramString) {
    int i = paramString.length();
    boolean bool = Zd.Zm();
    try {
      if (i != 0)
        try {
          if (i <= 10) {
            char c = paramString.charAt(0);
            try {
              if (c <= '0') {
                try {
                  if (i == 1)
                    try {
                      if (c == '0');
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    }  
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                return -1;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (c > '9')
                return -1; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            byte b = 1;
            while (b < i) {
              c = paramString.charAt(b);
              try {
                if (c <= '9')
                  try {
                    if (c >= '0') {
                      b++;
                      if (!bool)
                        break; 
                      continue;
                    } 
                    return -1;
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              return -1;
            } 
            if (i == 10) {
              long l = Long.parseLong(paramString);
              try {
                if (l > 2147483647L)
                  return -1; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              return (int)l;
            } 
            return Zyt.ZC(paramString);
          } 
          return -1;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return -1;
  }
  
  protected static Zs ZL(String paramString) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: invokestatic ZR : ()Z
    //   5: iconst_1
    //   6: istore_3
    //   7: aload_0
    //   8: invokevirtual length : ()I
    //   11: istore #4
    //   13: iconst_0
    //   14: istore #5
    //   16: istore_1
    //   17: iload_3
    //   18: iload #4
    //   20: if_icmpge -> 165
    //   23: aload_0
    //   24: iload_3
    //   25: invokevirtual charAt : (I)C
    //   28: istore #6
    //   30: iload #6
    //   32: bipush #47
    //   34: if_icmpne -> 67
    //   37: new com/fasterxml/Zb/Zt
    //   40: dup
    //   41: aload_2
    //   42: iload #5
    //   44: aload_0
    //   45: iload #5
    //   47: iconst_1
    //   48: iadd
    //   49: iload_3
    //   50: invokevirtual substring : (II)Ljava/lang/String;
    //   53: invokespecial <init> : (Lcom/fasterxml/Zb/Zt;ILjava/lang/String;)V
    //   56: astore_2
    //   57: iload_3
    //   58: istore #5
    //   60: iinc #3, 1
    //   63: iload_1
    //   64: ifeq -> 17
    //   67: iinc #3, 1
    //   70: iload #6
    //   72: bipush #126
    //   74: if_icmpne -> 161
    //   77: iload_3
    //   78: iload #4
    //   80: if_icmpge -> 161
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   89: athrow
    //   90: new java/lang/StringBuilder
    //   93: dup
    //   94: bipush #32
    //   96: invokespecial <init> : (I)V
    //   99: astore #7
    //   101: aload_0
    //   102: iload #5
    //   104: iconst_1
    //   105: iadd
    //   106: iload_3
    //   107: aload #7
    //   109: invokestatic Zy : (Ljava/lang/String;IILjava/lang/StringBuilder;)I
    //   112: istore_3
    //   113: aload #7
    //   115: invokevirtual toString : ()Ljava/lang/String;
    //   118: astore #8
    //   120: iload_3
    //   121: ifge -> 138
    //   124: aload_0
    //   125: iload #5
    //   127: aload #8
    //   129: aload_2
    //   130: invokestatic ZY : (Ljava/lang/String;ILjava/lang/String;Lcom/fasterxml/Zb/Zt;)Lcom/fasterxml/Zb/Zs;
    //   133: areturn
    //   134: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   137: athrow
    //   138: new com/fasterxml/Zb/Zt
    //   141: dup
    //   142: aload_2
    //   143: iload #5
    //   145: aload #8
    //   147: invokespecial <init> : (Lcom/fasterxml/Zb/Zt;ILjava/lang/String;)V
    //   150: astore_2
    //   151: iload_3
    //   152: istore #5
    //   154: iinc #3, 1
    //   157: iload_1
    //   158: ifeq -> 17
    //   161: iload_1
    //   162: ifeq -> 17
    //   165: aload_0
    //   166: iload #5
    //   168: aload_0
    //   169: iload #5
    //   171: iconst_1
    //   172: iadd
    //   173: invokevirtual substring : (I)Ljava/lang/String;
    //   176: aload_2
    //   177: invokestatic ZY : (Ljava/lang/String;ILjava/lang/String;Lcom/fasterxml/Zb/Zt;)Lcom/fasterxml/Zb/Zs;
    //   180: areturn
    // Exception table:
    //   from	to	target	type
    //   67	83	86	java/lang/IllegalArgumentException
    //   120	134	134	java/lang/IllegalArgumentException
  }
  
  private static Zs ZY(String paramString1, int paramInt, String paramString2, Zt paramZt) {
    Zs zs = new Zs(paramString1, paramInt, paramString2, Zk);
    boolean bool = Zd.Zm();
    while (paramZt != null) {
      zs = new Zs(paramString1, paramZt.ZW, paramZt.ZI, zs);
      paramZt = paramZt.Zk;
      if (!bool)
        break; 
    } 
    return zs;
  }
  
  protected static int Zy(String paramString, int paramInt1, int paramInt2, StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: invokestatic Zm : ()Z
    //   3: aload_0
    //   4: invokevirtual length : ()I
    //   7: istore #5
    //   9: istore #4
    //   11: iload_2
    //   12: iconst_1
    //   13: isub
    //   14: iload_1
    //   15: isub
    //   16: istore #6
    //   18: iload #6
    //   20: ifle -> 40
    //   23: aload_3
    //   24: aload_0
    //   25: iload_1
    //   26: iload_2
    //   27: iconst_1
    //   28: isub
    //   29: invokevirtual append : (Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
    //   32: pop
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   39: athrow
    //   40: aload_3
    //   41: aload_0
    //   42: iload_2
    //   43: iinc #2, 1
    //   46: invokevirtual charAt : (I)C
    //   49: invokestatic Zr : (Ljava/lang/StringBuilder;C)V
    //   52: iload_2
    //   53: iload #5
    //   55: if_icmpge -> 137
    //   58: aload_0
    //   59: iload_2
    //   60: invokevirtual charAt : (I)C
    //   63: istore #7
    //   65: iload #7
    //   67: bipush #47
    //   69: if_icmpne -> 78
    //   72: iload_2
    //   73: ireturn
    //   74: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   77: athrow
    //   78: iinc #2, 1
    //   81: iload #7
    //   83: bipush #126
    //   85: if_icmpne -> 125
    //   88: iload_2
    //   89: iload #5
    //   91: if_icmpge -> 125
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   100: athrow
    //   101: aload_3
    //   102: aload_0
    //   103: iload_2
    //   104: iinc #2, 1
    //   107: invokevirtual charAt : (I)C
    //   110: invokestatic Zr : (Ljava/lang/StringBuilder;C)V
    //   113: iload #4
    //   115: ifne -> 52
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   124: athrow
    //   125: aload_3
    //   126: iload #7
    //   128: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   131: pop
    //   132: iload #4
    //   134: ifne -> 52
    //   137: iconst_m1
    //   138: ireturn
    // Exception table:
    //   from	to	target	type
    //   18	33	36	java/lang/IllegalArgumentException
    //   65	74	74	java/lang/IllegalArgumentException
    //   78	94	97	java/lang/IllegalArgumentException
    //   88	118	121	java/lang/IllegalArgumentException
  }
  
  private static void Zr(StringBuilder paramStringBuilder, char paramChar) {
    // Byte code:
    //   0: invokestatic ZR : ()Z
    //   3: istore_2
    //   4: iload_1
    //   5: bipush #48
    //   7: if_icmpne -> 17
    //   10: bipush #126
    //   12: istore_1
    //   13: iload_2
    //   14: ifeq -> 51
    //   17: iload_1
    //   18: bipush #49
    //   20: if_icmpne -> 37
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   29: athrow
    //   30: bipush #47
    //   32: istore_1
    //   33: iload_2
    //   34: ifeq -> 51
    //   37: aload_0
    //   38: bipush #126
    //   40: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   50: athrow
    //   51: aload_0
    //   52: iload_1
    //   53: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: return
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/IllegalArgumentException
    //   33	44	47	java/lang/IllegalArgumentException
  }
  
  private Object writeReplace() {
    return new Zo(toString());
  }
  
  static {
    // Byte code:
    //   0: bipush #93
    //   2: ldc '!uQ#h&dH>Dh [sj.'&`X8^-7fX9\\r! 4P?\\r<o `\8\\nh8`UjYghI4'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zb/Zs.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #21
    //   82: goto -> 112
    //   85: bipush #18
    //   87: goto -> 112
    //   90: bipush #46
    //   92: goto -> 112
    //   95: bipush #73
    //   97: goto -> 112
    //   100: bipush #96
    //   102: goto -> 112
    //   105: bipush #23
    //   107: goto -> 112
    //   110: bipush #35
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
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
    //   151: goto -> 8
    //   154: new com/fasterxml/Zb/Zs
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic com/fasterxml/Zb/Zs.Zk : Lcom/fasterxml/Zb/Zs;
    //   164: return
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */