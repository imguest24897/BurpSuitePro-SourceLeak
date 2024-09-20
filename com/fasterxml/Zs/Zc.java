package com.fasterxml.Zs;

import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zf;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zw.Zl;
import com.fasterxml.Zyt;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.UUID;

@Zl
public class Zc extends Zf implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final int ZT;
  
  protected final Class<?> ZE;
  
  protected final Zub<?> ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zc(int paramInt, Class<?> paramClass) {
    this(paramInt, paramClass, null);
  }
  
  protected Zc(int paramInt, Class<?> paramClass, Zub<?> paramZub) {
    this.ZT = paramInt;
    this.ZE = paramClass;
    this.ZI = paramZub;
  }
  
  public static Zc Zi(Class<?> paramClass) {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: ldc java/lang/String
    //   7: if_acmpeq -> 49
    //   10: aload_0
    //   11: ldc java/lang/Object
    //   13: if_acmpeq -> 49
    //   16: goto -> 23
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: aload_0
    //   24: ldc java/lang/CharSequence
    //   26: if_acmpeq -> 49
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_0
    //   37: ldc java/io/Serializable
    //   39: if_acmpne -> 58
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   48: athrow
    //   49: aload_0
    //   50: invokestatic Zx : (Ljava/lang/Class;)Lcom/fasterxml/Zs/Z_;
    //   53: areturn
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: aload_0
    //   59: ldc java/util/UUID
    //   61: if_acmpne -> 71
    //   64: bipush #12
    //   66: istore_2
    //   67: aload_1
    //   68: ifnull -> 400
    //   71: aload_0
    //   72: ldc java/lang/Integer
    //   74: if_acmpne -> 90
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: iconst_5
    //   85: istore_2
    //   86: aload_1
    //   87: ifnull -> 400
    //   90: aload_0
    //   91: ldc java/lang/Long
    //   93: if_acmpne -> 110
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: bipush #6
    //   105: istore_2
    //   106: aload_1
    //   107: ifnull -> 400
    //   110: aload_0
    //   111: ldc java/util/Date
    //   113: if_acmpne -> 130
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: bipush #10
    //   125: istore_2
    //   126: aload_1
    //   127: ifnull -> 400
    //   130: aload_0
    //   131: ldc java/util/Calendar
    //   133: if_acmpne -> 150
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: bipush #11
    //   145: istore_2
    //   146: aload_1
    //   147: ifnull -> 400
    //   150: aload_0
    //   151: ldc java/lang/Boolean
    //   153: if_acmpne -> 169
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   162: athrow
    //   163: iconst_1
    //   164: istore_2
    //   165: aload_1
    //   166: ifnull -> 400
    //   169: aload_0
    //   170: ldc java/lang/Byte
    //   172: if_acmpne -> 188
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   181: athrow
    //   182: iconst_2
    //   183: istore_2
    //   184: aload_1
    //   185: ifnull -> 400
    //   188: aload_0
    //   189: ldc java/lang/Character
    //   191: if_acmpne -> 207
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   200: athrow
    //   201: iconst_4
    //   202: istore_2
    //   203: aload_1
    //   204: ifnull -> 400
    //   207: aload_0
    //   208: ldc java/lang/Short
    //   210: if_acmpne -> 226
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   219: athrow
    //   220: iconst_3
    //   221: istore_2
    //   222: aload_1
    //   223: ifnull -> 400
    //   226: aload_0
    //   227: ldc java/lang/Float
    //   229: if_acmpne -> 246
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   238: athrow
    //   239: bipush #7
    //   241: istore_2
    //   242: aload_1
    //   243: ifnull -> 400
    //   246: aload_0
    //   247: ldc java/lang/Double
    //   249: if_acmpne -> 266
    //   252: goto -> 259
    //   255: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   258: athrow
    //   259: bipush #8
    //   261: istore_2
    //   262: aload_1
    //   263: ifnull -> 400
    //   266: aload_0
    //   267: ldc java/net/URI
    //   269: if_acmpne -> 286
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   278: athrow
    //   279: bipush #13
    //   281: istore_2
    //   282: aload_1
    //   283: ifnull -> 400
    //   286: aload_0
    //   287: ldc java/net/URL
    //   289: if_acmpne -> 306
    //   292: goto -> 299
    //   295: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   298: athrow
    //   299: bipush #14
    //   301: istore_2
    //   302: aload_1
    //   303: ifnull -> 400
    //   306: aload_0
    //   307: ldc java/lang/Class
    //   309: if_acmpne -> 326
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   318: athrow
    //   319: bipush #15
    //   321: istore_2
    //   322: aload_1
    //   323: ifnull -> 400
    //   326: aload_0
    //   327: ldc java/util/Locale
    //   329: if_acmpne -> 357
    //   332: goto -> 339
    //   335: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   338: athrow
    //   339: ldc java/util/Locale
    //   341: invokestatic Zb : (Ljava/lang/Class;)Lcom/fasterxml/Zs/Zub;
    //   344: astore_3
    //   345: new com/fasterxml/Zs/Zc
    //   348: dup
    //   349: bipush #9
    //   351: aload_0
    //   352: aload_3
    //   353: invokespecial <init> : (ILjava/lang/Class;Lcom/fasterxml/Zs/Zub;)V
    //   356: areturn
    //   357: aload_0
    //   358: ldc java/util/Currency
    //   360: if_acmpne -> 381
    //   363: ldc java/util/Currency
    //   365: invokestatic Zb : (Ljava/lang/Class;)Lcom/fasterxml/Zs/Zub;
    //   368: astore_3
    //   369: new com/fasterxml/Zs/Zc
    //   372: dup
    //   373: bipush #16
    //   375: aload_0
    //   376: aload_3
    //   377: invokespecial <init> : (ILjava/lang/Class;Lcom/fasterxml/Zs/Zub;)V
    //   380: areturn
    //   381: aload_0
    //   382: ldc [B
    //   384: if_acmpne -> 394
    //   387: bipush #17
    //   389: istore_2
    //   390: aload_1
    //   391: ifnull -> 400
    //   394: aconst_null
    //   395: areturn
    //   396: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   399: athrow
    //   400: new com/fasterxml/Zs/Zc
    //   403: dup
    //   404: iload_2
    //   405: aload_0
    //   406: invokespecial <init> : (ILjava/lang/Class;)V
    //   409: areturn
    // Exception table:
    //   from	to	target	type
    //   4	16	19	java/lang/IllegalArgumentException
    //   10	29	32	java/lang/IllegalArgumentException
    //   23	42	45	java/lang/IllegalArgumentException
    //   36	54	54	java/lang/IllegalArgumentException
    //   67	77	80	java/lang/IllegalArgumentException
    //   86	96	99	java/lang/IllegalArgumentException
    //   106	116	119	java/lang/IllegalArgumentException
    //   126	136	139	java/lang/IllegalArgumentException
    //   146	156	159	java/lang/IllegalArgumentException
    //   165	175	178	java/lang/IllegalArgumentException
    //   184	194	197	java/lang/IllegalArgumentException
    //   203	213	216	java/lang/IllegalArgumentException
    //   222	232	235	java/lang/IllegalArgumentException
    //   242	252	255	java/lang/IllegalArgumentException
    //   262	272	275	java/lang/IllegalArgumentException
    //   282	292	295	java/lang/IllegalArgumentException
    //   302	312	315	java/lang/IllegalArgumentException
    //   322	332	335	java/lang/IllegalArgumentException
    //   390	396	396	java/lang/IllegalArgumentException
  }
  
  public Object Z_(String paramString, Zyg paramZyg) throws IOException {
    try {
      if (paramString == null)
        return null; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      Object object = ZR(paramString, paramZyg);
      if (object != null)
        return object; 
    } catch (Exception exception) {
      return paramZyg.Zk(this.ZE, paramString, a(-25970, 4410), new Object[] { exception.getClass().getName(), Zx.Zr(exception) });
    } 
    try {
      if (Zx.Zb(this.ZE))
        try {
          if (paramZyg.Za().ZG(Zyp.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
            return null; 
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    return paramZyg.Zk(this.ZE, paramString, a(-25973, -12963), new Object[0]);
  }
  
  protected Object ZR(String paramString, Zyg paramZyg) throws Exception {
    try {
      int i;
      switch (this.ZT) {
        case 1:
          try {
            if (a(-25982, 12503).equals(paramString))
              return Boolean.TRUE; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          try {
            if (a(-25971, 20240).equals(paramString))
              return Boolean.FALSE; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          return paramZyg.Zk(this.ZE, paramString, a(-25975, -32618), new Object[0]);
        case 2:
          i = Zz(paramString);
          try {
            if (i >= -128)
              try {
                return (i <= 255) ? Byte.valueOf((byte)i) : paramZyg.Zk(this.ZE, paramString, a(-25972, -19081), new Object[0]);
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          return paramZyg.Zk(this.ZE, paramString, a(-25972, -19081), new Object[0]);
        case 3:
          i = Zz(paramString);
          try {
            if (i >= -32768)
              try {
                return (i <= 32767) ? Short.valueOf((short)i) : paramZyg.Zk(this.ZE, paramString, a(-25974, -14415), new Object[0]);
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          return paramZyg.Zk(this.ZE, paramString, a(-25974, -14415), new Object[0]);
        case 4:
          try {
            if (paramString.length() == 1)
              return Character.valueOf(paramString.charAt(0)); 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          return paramZyg.Zk(this.ZE, paramString, a(-25969, -9653), new Object[0]);
        case 5:
          return Integer.valueOf(Zz(paramString));
        case 6:
          return Long.valueOf(Zq(paramString));
        case 7:
          return Float.valueOf((float)Zr(paramString));
        case 8:
          return Double.valueOf(Zr(paramString));
        case 9:
          try {
            return this.ZI.ZV(paramString, paramZyg);
          } catch (IllegalArgumentException illegalArgumentException) {
            return ZR(paramZyg, paramString, illegalArgumentException);
          } 
        case 16:
          try {
            return this.ZI.ZV(paramString, paramZyg);
          } catch (IllegalArgumentException illegalArgumentException) {
            return ZR(paramZyg, paramString, illegalArgumentException);
          } 
        case 10:
          return paramZyg.ZG(paramString);
        case 11:
          return paramZyg.ZZ(paramZyg.ZG(paramString));
        case 12:
          try {
            return UUID.fromString(paramString);
          } catch (Exception exception) {
            return ZR(paramZyg, paramString, exception);
          } 
        case 13:
          try {
            return URI.create(paramString);
          } catch (Exception exception) {
            return ZR(paramZyg, paramString, exception);
          } 
        case 14:
          try {
            return new URL(paramString);
          } catch (MalformedURLException malformedURLException) {
            return ZR(paramZyg, paramString, malformedURLException);
          } 
        case 15:
          try {
            return paramZyg.ZP(paramString);
          } catch (Exception exception) {
            return paramZyg.Zk(this.ZE, paramString, a(-25984, -28742), new Object[0]);
          } 
        case 17:
          try {
            return paramZyg.Za().Zn().ZF(paramString);
          } catch (IllegalArgumentException illegalArgumentException) {
            return ZR(paramZyg, paramString, illegalArgumentException);
          } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalStateException(a(-25983, -12314) + this.ZE);
  }
  
  protected int Zz(String paramString) throws IllegalArgumentException {
    return Zyt.ZC(paramString);
  }
  
  protected long Zq(String paramString) throws IllegalArgumentException {
    return Zyt.ZO(paramString);
  }
  
  protected double Zr(String paramString) throws IllegalArgumentException {
    return Zyt.ZE(paramString, false);
  }
  
  protected Object ZR(Zyg paramZyg, String paramString, Exception paramException) throws IOException {
    return paramZyg.Zk(this.ZE, paramString, a(-25976, 21237), new Object[] { Zx.Zr(paramException) });
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ó°Ýìhò¸ý£¶°¯¯_!ÏsðüSÄbó¿\µI5Qp`}\\r±M+,.ºO¡µF\\t¤¿¾ä¨®âRõ¡/+¿Ç¬Õÿ yÕ/D\\rÉz\I-|íqU¸Nºû ø½ô&¼\\nîóKO~40ÉSWøë©P§Xt@±Ï.qBbjÝº<þlN¯BJe#2 'G± ¼¡¼ZãÑÅ,vh×E@)îA*¯ì\\fáOE[>ZÐ´êô7=tq{òûr Bk$)ºö/Èxxò±MÎ/íÀ.Íî'&àÿç­¯WD@ØcR@BmT·8ðpvX¶V(r«àÍXUZF§¿7º'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #95
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
    //   68: ldc '¸Ô{2zæñGÂÐÒuD¬Ã0Ýz%ù@o[F,§rÃ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #33
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #112
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
    //   129: putstatic com/fasterxml/Zs/Zc.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zs/Zc.b : [Ljava/lang/String;
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
    //   212: bipush #67
    //   214: goto -> 244
    //   217: bipush #97
    //   219: goto -> 244
    //   222: bipush #110
    //   224: goto -> 244
    //   227: bipush #60
    //   229: goto -> 244
    //   232: bipush #68
    //   234: goto -> 244
    //   237: bipush #98
    //   239: goto -> 244
    //   242: bipush #79
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
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9A88) & 0xFFFF;
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
      byte b1 = 18;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */