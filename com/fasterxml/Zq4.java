package com.fasterxml;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zj.Zx;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zs.Zuy;
import java.io.IOException;
import java.time.DateTimeException;
import java.util.Arrays;

abstract class Zq4<T> extends Zuy<T> {
  private static final long serialVersionUID = 1L;
  
  protected final boolean Zb = true;
  
  private static final String[] e;
  
  private static final String[] f;
  
  protected Zq4(Class<T> paramClass) {
    super(paramClass);
  }
  
  protected Zq4(Class<T> paramClass, Boolean paramBoolean) {
    super(paramClass);
  }
  
  protected Zq4(Zq4<T> paramZq4) {
    super(paramZq4);
  }
  
  protected Zq4(Zq4<T> paramZq4, Boolean paramBoolean) {
    super(paramZq4);
  }
  
  protected boolean ZK() {
    return this.Zb;
  }
  
  protected T ZN(Zg paramZg, Zyg paramZyg, String paramString) throws IOException {
    Zx zx = ZR(paramZyg, paramString);
    try {
      switch (Zg6.Zg[zx.ordinal()]) {
        case 1:
          return (T)Zy(paramZyg);
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    try {
      if (!this.Zb)
        return Zn(paramZg, paramZyg, Zl.VALUE_STRING); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    return null;
  }
  
  public Zd Zb() {
    return Zd.DateTime;
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    return paramZt.Zy(paramZg, paramZyg);
  }
  
  protected boolean ZV(String paramString) {
    try {
      if (Ze(paramString)) {
        try {
        
        } catch (DateTimeException dateTimeException) {
          throw b(null);
        } 
        try {
          if (Zyt.ZG(paramString, (paramString.charAt(0) == '-')));
        } catch (DateTimeException dateTimeException) {
          throw b(null);
        } 
      } 
    } catch (DateTimeException dateTimeException) {
      throw b(null);
    } 
    return false;
  }
  
  protected <BOGUS> BOGUS Zc(Zyg paramZyg, Zl paramZl, String paramString) throws IOException {
    paramZyg.Zw((Zyo)this, paramZl, c(30950, 28713), new Object[] { paramZl.name(), paramString, ZX().getName() });
    return null;
  }
  
  protected <R> R Z_(Zyg paramZyg, DateTimeException paramDateTimeException, String paramString) throws Zy_ {
    try {
      return (R)paramZyg.ZN(ZX(), paramString, c(30949, -20696), new Object[] { ZX().getName(), paramDateTimeException.getClass().getName(), paramDateTimeException.getMessage() });
    } catch (Zy_ zy_) {
      zy_.initCause(paramDateTimeException);
      throw zy_;
    } catch (IOException iOException) {
      try {
        if (null == iOException.getCause())
          iOException.initCause(paramDateTimeException); 
      } catch (Zy_ zy_) {
        throw b(null);
      } 
      throw Zy_.ZG(iOException);
    } 
  }
  
  protected <R> R ZE(Zyg paramZyg, Zg paramZg, String paramString, Object... paramVarArgs) throws Zy_ {
    try {
      return (R)paramZyg.Zp(ZX(), paramZg.Zj(), paramZg, paramString, paramVarArgs);
    } catch (Zy_ zy_) {
      throw zy_;
    } catch (IOException iOException) {
      throw Zy_.ZG(iOException);
    } 
  }
  
  protected <R> R Zx(Zyg paramZyg, Zg paramZg, Zl... paramVarArgs) throws Zy_ {
    return ZE(paramZyg, paramZg, c(30948, 3950), new Object[] { paramZg.Zh(), Arrays.asList(paramVarArgs), ZX().getName() });
  }
  
  protected T Zn(Zg paramZg, Zyg paramZyg, Zl paramZl) throws IOException {
    return (T)paramZyg.Zp(ZX(), paramZl, paramZg, c(30951, -7123), new Object[] { Zx.Za(ZX()), paramZg.Zh() });
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '¨æÈw"¸ñàó-|õMÊ'Õ®÷î¨hâÀväôµSú6î@iéª½Ï\\nåh!ù\±ºâ+Ö26kLéö\\tÒ¨wq<±ÕÅÏµôL'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #54
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #25
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'XIbÆË)Þ.W#Fý²ýû;½óCÛ iõy°Ð×w¶è:7Kô©º©ó$ôÍ­:â\\r³}Yù9ý³KÓ!qÁXõå÷7ÇüÈü¥Òj <¡?Ùò/ÎÛ ÐÍÖ0´gZq1\\b¢©¸à®QKVS½x¬z§#Ö÷ [Ón\\tlê2º\\rëéÑ5QhÝWÂ×¤Ü-@ËöI´®o[dçtñ,Ò{MÍ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #32
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #104
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic com/fasterxml/Zq4.e : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zq4.f : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #57
    //   214: goto -> 243
    //   217: iconst_2
    //   218: goto -> 243
    //   221: bipush #116
    //   223: goto -> 243
    //   226: bipush #94
    //   228: goto -> 243
    //   231: bipush #25
    //   233: goto -> 243
    //   236: bipush #71
    //   238: goto -> 243
    //   241: bipush #63
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x78E4) & 0xFFFF;
    if (f[i] == null) {
      char[] arrayOfChar = e[i].toCharArray();
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
      byte b1 = 55;
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
      f[i] = (new String(arrayOfChar)).intern();
    } 
    return f[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */