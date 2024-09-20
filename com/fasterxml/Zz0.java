package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zk.Zh;
import com.fasterxml.Zk.Zx;
import com.fasterxml.Zm.Zv;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zoa.Zk;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zt.Z_;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

public abstract class Zz0<T> extends Zyd<T> implements Z_, Zk, Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final Object Zr;
  
  protected final Class<T> Zg;
  
  private static String ZB;
  
  private static final String[] b;
  
  private static final String[] c;
  
  protected Zz0(Class<T> paramClass) {
    this.Zg = paramClass;
  }
  
  protected Zz0(Zk paramZk) {
    this.Zg = paramZk.Zf();
  }
  
  protected Zz0(Class<?> paramClass, boolean paramBoolean) {
    this.Zg = (Class)paramClass;
  }
  
  protected Zz0(Zz0<?> paramZz0) {
    this.Zg = paramZz0.Zg;
  }
  
  public Class<T> Zz() {
    return this.Zg;
  }
  
  public abstract void serialize(T paramT, Zf paramZf, Zyi paramZyi) throws IOException;
  
  public void ZO(Zyi paramZyi, Throwable paramThrowable, Object paramObject, String paramString) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore #5
    //   5: aload_2
    //   6: instanceof java/lang/reflect/InvocationTargetException
    //   9: ifeq -> 29
    //   12: aload_2
    //   13: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   16: ifnull -> 29
    //   19: aload_2
    //   20: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   23: astore_2
    //   24: aload #5
    //   26: ifnull -> 5
    //   29: aload_2
    //   30: invokestatic Zo : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   33: pop
    //   34: aload_1
    //   35: ifnull -> 55
    //   38: aload_1
    //   39: getstatic com/fasterxml/Zor/Zy0.WRAP_EXCEPTIONS : Lcom/fasterxml/Zor/Zy0;
    //   42: invokevirtual ZW : (Lcom/fasterxml/Zor/Zy0;)Z
    //   45: ifeq -> 63
    //   48: goto -> 55
    //   51: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   54: athrow
    //   55: iconst_1
    //   56: goto -> 64
    //   59: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   62: athrow
    //   63: iconst_0
    //   64: istore #6
    //   66: aload_2
    //   67: instanceof java/io/IOException
    //   70: ifeq -> 108
    //   73: iload #6
    //   75: ifeq -> 99
    //   78: goto -> 85
    //   81: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   84: athrow
    //   85: aload_2
    //   86: instanceof com/fasterxml/Zb/Zd
    //   89: ifne -> 125
    //   92: goto -> 99
    //   95: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   98: athrow
    //   99: aload_2
    //   100: checkcast java/io/IOException
    //   103: athrow
    //   104: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   107: athrow
    //   108: iload #6
    //   110: ifne -> 125
    //   113: aload_2
    //   114: invokestatic Zq : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   117: pop
    //   118: goto -> 125
    //   121: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   124: athrow
    //   125: aload_2
    //   126: aload_3
    //   127: aload #4
    //   129: invokestatic ZF : (Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;)Lcom/fasterxml/Zor/Zy_;
    //   132: athrow
    // Exception table:
    //   from	to	target	type
    //   29	48	51	java/io/IOException
    //   38	59	59	java/io/IOException
    //   66	78	81	java/io/IOException
    //   73	92	95	java/io/IOException
    //   85	104	104	java/io/IOException
    //   108	118	121	java/io/IOException
  }
  
  public void ZQ(Zyi paramZyi, Throwable paramThrowable, Object paramObject, int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore #5
    //   5: aload_2
    //   6: instanceof java/lang/reflect/InvocationTargetException
    //   9: ifeq -> 29
    //   12: aload_2
    //   13: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   16: ifnull -> 29
    //   19: aload_2
    //   20: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   23: astore_2
    //   24: aload #5
    //   26: ifnull -> 5
    //   29: aload_2
    //   30: invokestatic Zo : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   33: pop
    //   34: aload_1
    //   35: ifnull -> 55
    //   38: aload_1
    //   39: getstatic com/fasterxml/Zor/Zy0.WRAP_EXCEPTIONS : Lcom/fasterxml/Zor/Zy0;
    //   42: invokevirtual ZW : (Lcom/fasterxml/Zor/Zy0;)Z
    //   45: ifeq -> 63
    //   48: goto -> 55
    //   51: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   54: athrow
    //   55: iconst_1
    //   56: goto -> 64
    //   59: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   62: athrow
    //   63: iconst_0
    //   64: istore #6
    //   66: aload_2
    //   67: instanceof java/io/IOException
    //   70: ifeq -> 108
    //   73: iload #6
    //   75: ifeq -> 99
    //   78: goto -> 85
    //   81: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   84: athrow
    //   85: aload_2
    //   86: instanceof com/fasterxml/Zb/Zd
    //   89: ifne -> 125
    //   92: goto -> 99
    //   95: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   98: athrow
    //   99: aload_2
    //   100: checkcast java/io/IOException
    //   103: athrow
    //   104: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   107: athrow
    //   108: iload #6
    //   110: ifne -> 125
    //   113: aload_2
    //   114: invokestatic Zq : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   117: pop
    //   118: goto -> 125
    //   121: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   124: athrow
    //   125: aload_2
    //   126: aload_3
    //   127: iload #4
    //   129: invokestatic ZR : (Ljava/lang/Throwable;Ljava/lang/Object;I)Lcom/fasterxml/Zor/Zy_;
    //   132: athrow
    // Exception table:
    //   from	to	target	type
    //   29	48	51	java/io/IOException
    //   38	59	59	java/io/IOException
    //   66	78	81	java/io/IOException
    //   73	92	95	java/io/IOException
    //   85	104	104	java/io/IOException
    //   108	118	121	java/io/IOException
  }
  
  protected Zyd<?> Za(Zyi paramZyi, Zo paramZo, Zyd<?> paramZyd) throws Zy_ {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: aload_1
    //   4: getstatic com/fasterxml/Zz0.Zr : Ljava/lang/Object;
    //   7: invokevirtual Zj : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast java/util/Map
    //   13: astore #5
    //   15: astore #4
    //   17: aload #5
    //   19: ifnull -> 48
    //   22: aload #5
    //   24: aload_2
    //   25: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   30: astore #6
    //   32: aload #6
    //   34: ifnull -> 43
    //   37: aload_3
    //   38: areturn
    //   39: invokestatic c : (Ljava/io/IOException;)Ljava/io/IOException;
    //   42: athrow
    //   43: aload #4
    //   45: ifnull -> 67
    //   48: new java/util/IdentityHashMap
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: astore #5
    //   57: aload_1
    //   58: getstatic com/fasterxml/Zz0.Zr : Ljava/lang/Object;
    //   61: aload #5
    //   63: invokevirtual ZX : (Ljava/lang/Object;Ljava/lang/Object;)Lcom/fasterxml/Zor/Zyi;
    //   66: pop
    //   67: aload #5
    //   69: aload_2
    //   70: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   73: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   78: pop
    //   79: aload_0
    //   80: aload_1
    //   81: aload_2
    //   82: aload_3
    //   83: invokevirtual Zj : (Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zyd;)Lcom/fasterxml/Zor/Zyd;
    //   86: astore #6
    //   88: aload #6
    //   90: ifnull -> 114
    //   93: aload_1
    //   94: aload #6
    //   96: aload_2
    //   97: invokevirtual ZR : (Lcom/fasterxml/Zor/Zyd;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   100: astore #7
    //   102: aload #5
    //   104: aload_2
    //   105: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   110: pop
    //   111: aload #7
    //   113: areturn
    //   114: aload #5
    //   116: aload_2
    //   117: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   122: pop
    //   123: goto -> 140
    //   126: astore #8
    //   128: aload #5
    //   130: aload_2
    //   131: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   136: pop
    //   137: aload #8
    //   139: athrow
    //   140: aload_3
    //   141: areturn
    // Exception table:
    //   from	to	target	type
    //   32	39	39	com/fasterxml/Zor/Zy_
    //   79	102	126	finally
    //   126	128	126	finally
  }
  
  @Deprecated
  protected Zyd<?> Zj(Zyi paramZyi, Zo paramZo, Zyd<?> paramZyd) throws Zy_ {
    Zt zt = paramZyi.Zv();
    if (ZB(zt, paramZo)) {
      Ziz ziz = paramZo.ZQ();
      if (ziz != null) {
        Object object = zt.Zl(ziz);
        if (object != null) {
          Zv<Object, ?> zv = paramZyi.ZS((Ziv)paramZo.ZQ(), object);
          Zk zk = zv.Zw(paramZyi.ZL());
          try {
            if (paramZyd == null && !zk.Zr())
              paramZyd = paramZyi.Zf(zk); 
          } catch (Zy_ zy_) {
            throw c(null);
          } 
          return new Zz3(zv, zk, paramZyd);
        } 
      } 
    } 
    return paramZyd;
  }
  
  protected Zh ZJ(Zyi paramZyi, Object paramObject1, Object paramObject2) throws Zy_ {
    Zx zx = paramZyi.ZE();
    try {
      if (zx == null)
        return (Zh)paramZyi.ZA(Zz(), a(-12318, -11512) + paramObject1 + a(-12317, -17127)); 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    return zx.ZO(paramObject1, paramObject2);
  }
  
  protected Zgy Z_(Zyi paramZyi, Zo paramZo, Class<?> paramClass) {
    return (paramZo != null) ? paramZo.ZN((Zf)paramZyi.ZH(), paramClass) : paramZyi.Zp(paramClass);
  }
  
  protected Boolean ZR(Zyi paramZyi, Zo paramZo, Class<?> paramClass, Zye paramZye) {
    Zgy zgy = Z_(paramZyi, paramZo, paramClass);
    return (zgy != null) ? zgy.Zq(paramZye) : null;
  }
  
  protected Zz_ ZW(Zyi paramZyi, Zo paramZo, Class<?> paramClass) {
    return (paramZo != null) ? paramZo.Zj((Zf)paramZyi.ZH(), paramClass) : paramZyi.ZD(paramClass);
  }
  
  protected Zyd<?> Zy(Zyi paramZyi, Zo paramZo) throws Zy_ {
    if (paramZo != null) {
      Ziz ziz = paramZo.ZQ();
      Zt zt = paramZyi.Zv();
      if (ziz != null) {
        Object object = zt.ZS((Ziv)ziz);
        try {
          if (object != null)
            return paramZyi.ZW((Ziv)ziz, object); 
        } catch (Zy_ zy_) {
          throw c(null);
        } 
      } 
    } 
    return null;
  }
  
  protected boolean Zv(Zyd<?> paramZyd) {
    return Zx.ZI(paramZyd);
  }
  
  protected static final boolean ZB(Object paramObject1, Object paramObject2) {
    return (paramObject1 != null && paramObject2 != null);
  }
  
  protected static final boolean ZS(Collection<?> paramCollection) {
    return (paramCollection != null && !paramCollection.isEmpty());
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: aconst_null
    //   9: ldc '= 3Ðn¼aeIã¢f}ñ&÷áJ9ê"?ÚI³³'ÅÁÜ¼õô±q»?B0ÜÒî/î«= é¬xêº-ñ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #31
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: invokestatic ZT : (Ljava/lang/String;)V
    //   26: bipush #110
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 86
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: aload #5
    //   73: putstatic com/fasterxml/Zz0.b : [Ljava/lang/String;
    //   76: iconst_2
    //   77: anewarray java/lang/String
    //   80: putstatic com/fasterxml/Zz0.c : [Ljava/lang/String;
    //   83: goto -> 231
    //   86: dup_x2
    //   87: pop
    //   88: invokevirtual toCharArray : ()[C
    //   91: dup_x1
    //   92: arraylength
    //   93: dup_x2
    //   94: pop
    //   95: iconst_0
    //   96: istore #6
    //   98: dup2_x1
    //   99: pop2
    //   100: dup_x2
    //   101: iconst_1
    //   102: if_icmpgt -> 204
    //   105: dup2
    //   106: swap
    //   107: iload #6
    //   109: dup2_x1
    //   110: caload
    //   111: swap
    //   112: iload #6
    //   114: bipush #7
    //   116: irem
    //   117: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #75
    //   158: goto -> 188
    //   161: bipush #40
    //   163: goto -> 188
    //   166: bipush #8
    //   168: goto -> 188
    //   171: bipush #71
    //   173: goto -> 188
    //   176: bipush #10
    //   178: goto -> 188
    //   181: bipush #24
    //   183: goto -> 188
    //   186: bipush #46
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 109
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 105
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 43
    //   231: new java/lang/Object
    //   234: dup
    //   235: invokespecial <init> : ()V
    //   238: putstatic com/fasterxml/Zz0.Zr : Ljava/lang/Object;
    //   241: return
  }
  
  public static void ZT(String paramString) {
    ZB = paramString;
  }
  
  public static String ZG() {
    return ZB;
  }
  
  private static IOException c(IOException paramIOException) {
    return paramIOException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCFE3) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      byte b1 = 71;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */