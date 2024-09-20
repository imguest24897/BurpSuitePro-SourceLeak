package com.fasterxml.Zor;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zma;
import com.fasterxml.Zb.Zmi;
import com.fasterxml.Zb.Zmk;
import com.fasterxml.Zb.Zmt;
import com.fasterxml.Zb.Zp;
import com.fasterxml.Zb.Zu;
import com.fasterxml.Zc.Zf;
import com.fasterxml.Zc.Zo;
import com.fasterxml.Zj.Zv;
import com.fasterxml.Zk.Zl;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zy2;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

public class Zn implements Zu, Serializable {
  private static final long serialVersionUID = 1L;
  
  protected static final Zp ZW;
  
  protected final Zy7 Zo;
  
  protected final com.fasterxml.Zk.Zn Zh;
  
  protected final Zl ZI;
  
  protected final Zmi ZX;
  
  protected final Zg ZL;
  
  protected final Zyq ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zn(Zy6 paramZy6, Zy7 paramZy7, Zk paramZk, Zp paramZp) {
    // Byte code:
    //   0: invokestatic ZZ : ()I
    //   3: aload_0
    //   4: invokespecial <init> : ()V
    //   7: istore #5
    //   9: aload_0
    //   10: aload_2
    //   11: putfield Zo : Lcom/fasterxml/Zor/Zy7;
    //   14: aload_0
    //   15: aload_1
    //   16: getfield ZC : Lcom/fasterxml/Zk/Zn;
    //   19: putfield Zh : Lcom/fasterxml/Zk/Zn;
    //   22: aload_0
    //   23: aload_1
    //   24: getfield Zx : Lcom/fasterxml/Zk/Zl;
    //   27: putfield ZI : Lcom/fasterxml/Zk/Zl;
    //   30: aload_0
    //   31: aload_1
    //   32: getfield Zd : Lcom/fasterxml/Zb/Zmi;
    //   35: putfield ZX : Lcom/fasterxml/Zb/Zmi;
    //   38: aload_0
    //   39: aload #4
    //   41: ifnonnull -> 54
    //   44: getstatic com/fasterxml/Zor/Zg.Zh : Lcom/fasterxml/Zor/Zg;
    //   47: goto -> 66
    //   50: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   53: athrow
    //   54: new com/fasterxml/Zor/Zg
    //   57: dup
    //   58: aload #4
    //   60: aconst_null
    //   61: aconst_null
    //   62: aconst_null
    //   63: invokespecial <init> : (Lcom/fasterxml/Zb/Zp;Lcom/fasterxml/Zb/Zb;Lcom/fasterxml/Zyh;Lcom/fasterxml/Zb/Zj;)V
    //   66: putfield ZL : Lcom/fasterxml/Zor/Zg;
    //   69: aload_3
    //   70: ifnonnull -> 92
    //   73: aload_0
    //   74: getstatic com/fasterxml/Zor/Zyq.ZJ : Lcom/fasterxml/Zor/Zyq;
    //   77: putfield ZY : Lcom/fasterxml/Zor/Zyq;
    //   80: iload #5
    //   82: ifeq -> 154
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   91: athrow
    //   92: aload_3
    //   93: ldc java/lang/Object
    //   95: invokevirtual ZP : (Ljava/lang/Class;)Z
    //   98: ifeq -> 132
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   107: athrow
    //   108: aload_0
    //   109: getstatic com/fasterxml/Zor/Zyq.ZJ : Lcom/fasterxml/Zor/Zyq;
    //   112: aload_0
    //   113: aload_3
    //   114: invokevirtual Zo : (Lcom/fasterxml/Zor/Zn;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyq;
    //   117: putfield ZY : Lcom/fasterxml/Zor/Zyq;
    //   120: iload #5
    //   122: ifeq -> 154
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   131: athrow
    //   132: aload_0
    //   133: getstatic com/fasterxml/Zor/Zyq.ZJ : Lcom/fasterxml/Zor/Zyq;
    //   136: aload_0
    //   137: aload_3
    //   138: invokevirtual Zq : ()Lcom/fasterxml/Zor/Zk;
    //   141: invokevirtual Zo : (Lcom/fasterxml/Zor/Zn;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyq;
    //   144: putfield ZY : Lcom/fasterxml/Zor/Zyq;
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   153: athrow
    //   154: return
    // Exception table:
    //   from	to	target	type
    //   9	50	50	java/lang/IllegalArgumentException
    //   66	85	88	java/lang/IllegalArgumentException
    //   73	101	104	java/lang/IllegalArgumentException
    //   92	125	128	java/lang/IllegalArgumentException
    //   108	147	150	java/lang/IllegalArgumentException
  }
  
  protected Zn(Zy6 paramZy6, Zy7 paramZy7) {
    this.Zo = paramZy7;
    this.Zh = paramZy6.ZC;
    this.ZI = paramZy6.Zx;
    this.ZX = paramZy6.Zd;
    this.ZL = Zg.Zh;
    this.ZY = Zyq.ZJ;
  }
  
  protected Zn(Zn paramZn, Zy7 paramZy7, Zg paramZg, Zyq paramZyq) {
    this.Zo = paramZy7;
    this.Zh = paramZn.Zh;
    this.ZI = paramZn.ZI;
    this.ZX = paramZn.ZX;
    this.ZL = paramZg;
    this.ZY = paramZyq;
  }
  
  public Zmk version() {
    return Zv.ZV;
  }
  
  protected Zn Zm(Zg paramZg, Zyq paramZyq) {
    try {
      if (this.ZL == paramZg)
        try {
          if (this.ZY == paramZyq)
            return this; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zn(this, this.Zo, paramZg, paramZyq);
  }
  
  public Zn Zz() {
    return ZU(this.Zo.ZU());
  }
  
  public Zn ZU(Zp paramZp) {
    return Zm(this.ZL.ZH(paramZp), this.ZY);
  }
  
  public Zf Zo(OutputStream paramOutputStream, Zma paramZma) throws IOException {
    Zb(a(-19958, -8880), paramOutputStream);
    return Zo(this.ZX.ZJ(paramOutputStream, paramZma));
  }
  
  public Zf Za(Writer paramWriter) throws IOException {
    Zb("w", paramWriter);
    return Zo(this.ZX.ZC(paramWriter));
  }
  
  public boolean Zt(Zy0 paramZy0) {
    return this.Zo.Zo(paramZy0);
  }
  
  public String ZP(Object paramObject) throws Zmt {
    Zo zo = this.ZX.ZG();
    int i = Zyo.ZZ();
    try {
      Exception exception;
      Zy2 zy2 = new Zy2(zo);
      Throwable throwable = null;
      try {
        Zx(Za((Writer)zy2), paramObject);
        String str = zy2.Zb();
        try {
          if (zy2 != null) {
            if (throwable != null)
              return str; 
          } else {
            return str;
          } 
        } catch (Throwable throwable1) {
          throw a(null);
        } 
        return str;
      } catch (Throwable throwable1) {
        throwable = throwable1;
        throw throwable1;
      } finally {
        exception = null;
      } 
      zy2.close();
      throw exception;
    } catch (Zmt zmt) {
      throw zmt;
    } catch (IOException iOException) {
      throw Zy_.ZG(iOException);
    } finally {
      zo.Zh();
    } 
  }
  
  public byte[] ZQ(Object paramObject) throws Zmt {
    Zo zo = this.ZX.ZG();
    int i = Zyo.ZZ();
    try {
      Exception exception;
      Zf zf = new Zf(zo);
      Throwable throwable = null;
      try {
        Zx(Zo((OutputStream)zf, Zma.UTF8), paramObject);
        byte[] arrayOfByte = zf.Zy();
        try {
          if (zf != null) {
            if (throwable != null)
              return arrayOfByte; 
          } else {
            return arrayOfByte;
          } 
        } catch (Throwable throwable1) {
          throw a(null);
        } 
        return arrayOfByte;
      } catch (Throwable throwable1) {
        throwable = throwable1;
        throw throwable1;
      } finally {
        exception = null;
      } 
      zf.close();
      throw exception;
    } catch (Zmt zmt) {
      throw zmt;
    } catch (IOException iOException) {
      throw Zy_.ZG(iOException);
    } finally {
      zo.Zh();
    } 
  }
  
  protected com.fasterxml.Zk.Zn Zm() {
    return this.Zh.ZE(this.Zo, this.ZI);
  }
  
  protected final void Zx(Zf paramZf, Object paramObject) throws IOException {
    try {
      if (this.Zo.Zo(Zy0.CLOSE_CLOSEABLE))
        try {
          if (paramObject instanceof Closeable) {
            Zf(paramZf, paramObject);
            return;
          } 
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      this.ZY.Zi(paramZf, paramObject, Zm());
    } catch (Exception exception) {
      Zx.Zm(paramZf, exception);
      return;
    } 
    paramZf.close();
  }
  
  private final void Zf(Zf paramZf, Object paramObject) throws IOException {
    Closeable closeable = (Closeable)paramObject;
    try {
      this.ZY.Zi(paramZf, paramObject, Zm());
      Closeable closeable1 = closeable;
      closeable = null;
      closeable1.close();
    } catch (Exception exception) {
      Zx.ZP(paramZf, closeable, exception);
      return;
    } 
    paramZf.close();
  }
  
  protected final Zf Zo(Zf paramZf) {
    this.Zo.Za(paramZf);
    this.ZL.Zi(paramZf);
    return paramZf;
  }
  
  protected final void Zb(String paramString, Object paramObject) {
    try {
      if (paramObject == null)
        throw new IllegalArgumentException(String.format(a(-19957, 10056), new Object[] { paramString })); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '²3Ì¸Qxk¡]KAuÁ|Ü\\tåQß'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_3
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #28
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic com/fasterxml/Zor/Zn.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic com/fasterxml/Zor/Zn.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #47
    //   154: goto -> 184
    //   157: bipush #33
    //   159: goto -> 184
    //   162: bipush #22
    //   164: goto -> 184
    //   167: bipush #90
    //   169: goto -> 184
    //   172: bipush #25
    //   174: goto -> 184
    //   177: bipush #107
    //   179: goto -> 184
    //   182: bipush #104
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 38
    //   227: new com/fasterxml/Zc/Zu
    //   230: dup
    //   231: invokespecial <init> : ()V
    //   234: putstatic com/fasterxml/Zor/Zn.ZW : Lcom/fasterxml/Zb/Zp;
    //   237: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB20A) & 0xFFFF;
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
      byte b1 = 87;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */