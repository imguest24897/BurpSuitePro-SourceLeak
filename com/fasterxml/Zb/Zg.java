package com.fasterxml.Zb;

import com.fasterxml.Zc.Zh;
import com.fasterxml.Zc.Zz;
import com.fasterxml.Zi.Zx;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class Zg implements Closeable, Zu {
  protected static final Zz<Zq> ZH;
  
  protected int Zo = Zmi.Zk;
  
  protected transient Zh ZQ;
  
  private static int[] Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zg() {}
  
  protected Zg(int paramInt) {}
  
  public abstract Zmd Zv();
  
  public Z_ ZG() {
    return Z_.Zo();
  }
  
  public void ZQ(Zb paramZb) {
    throw new UnsupportedOperationException(a(7251, -7842) + getClass().getName() + a(7252, -21353) + paramZb.Zd() + "'");
  }
  
  public boolean Zf() {
    return false;
  }
  
  public Zz<Zq> ZN() {
    return ZH;
  }
  
  public abstract Zmk version();
  
  public abstract void close() throws IOException;
  
  public abstract Ze ZT1();
  
  public Zm5 Zz() {
    return Zl();
  }
  
  public Zm5 ZQ() {
    return ZK();
  }
  
  @Deprecated
  public abstract Zm5 Zl();
  
  @Deprecated
  public abstract Zm5 ZK();
  
  public void ZZ(Object paramObject) {
    Ze ze = ZT1();
    try {
      if (ze != null)
        ze.Z_(paramObject); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw b(null);
    } 
  }
  
  public boolean Zx(Zm paramZm) {
    return paramZm.Zi(this.Zo);
  }
  
  public boolean Zt(Zmv paramZmv) {
    return paramZmv.ZN().Zi(this.Zo);
  }
  
  @Deprecated
  public Zg ZC(int paramInt) {
    this.Zo = paramInt;
    return this;
  }
  
  public Zg ZG(int paramInt1, int paramInt2) {
    int i = this.Zo & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2;
    return ZC(i);
  }
  
  public Zg Zy(int paramInt1, int paramInt2) {
    return this;
  }
  
  public abstract Zl ZV() throws IOException;
  
  public String ZU() throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw b(null);
    } 
    return (ZV() == Zl.FIELD_NAME) ? ZS() : null;
  }
  
  public String ZF() throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw b(null);
    } 
    return (ZV() == Zl.VALUE_STRING) ? ZR() : null;
  }
  
  public int Zq(int paramInt) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw b(null);
    } 
    return (ZV() == Zl.VALUE_NUMBER_INT) ? Ze() : paramInt;
  }
  
  public abstract Zg Zc() throws IOException;
  
  public Zl Zh() {
    return Zj();
  }
  
  public int Zy() {
    return Zt();
  }
  
  public abstract Zl Zj();
  
  @Deprecated
  public abstract int Zt();
  
  public abstract boolean Zq();
  
  public abstract boolean Ze(int paramInt);
  
  public abstract boolean ZL(Zl paramZl);
  
  public boolean Zs() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw b(null);
    } 
    return (Zh() == Zl.START_ARRAY);
  }
  
  public boolean Zp() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw b(null);
    } 
    return (Zh() == Zl.START_OBJECT);
  }
  
  public boolean ZA() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw b(null);
    } 
    return (Zh() == Zl.VALUE_NUMBER_INT);
  }
  
  public boolean Zr() throws IOException {
    return false;
  }
  
  public abstract void Zo();
  
  @Deprecated
  public abstract String ZD() throws IOException;
  
  public String ZS() throws IOException {
    return ZD();
  }
  
  public abstract String ZR() throws IOException;
  
  public abstract char[] ZW() throws IOException;
  
  public abstract int Zn() throws IOException;
  
  public abstract int Zk() throws IOException;
  
  public abstract boolean Zi();
  
  public abstract Number Zb() throws IOException;
  
  public Object ZI() throws IOException {
    return Zb();
  }
  
  public abstract Zk ZL() throws IOException;
  
  public Zmm Z_() throws IOException {
    Zk zk = ZL();
    try {
      if (zk == Zk.BIG_DECIMAL)
        return Zmm.BIG_DECIMAL; 
    } catch (IOException iOException) {
      throw b(null);
    } 
    try {
      if (zk == Zk.DOUBLE)
        return Zmm.DOUBLE64; 
    } catch (IOException iOException) {
      throw b(null);
    } 
    try {
      if (zk == Zk.FLOAT)
        return Zmm.FLOAT32; 
    } catch (IOException iOException) {
      throw b(null);
    } 
    return Zmm.UNKNOWN;
  }
  
  public byte Zx() throws IOException {
    int i = Ze();
    try {
      if (i >= -128)
        try {
          if (i <= 255)
            return (byte)i; 
          throw new Zx(this, String.format(a(7250, -26565), new Object[] { ZR() }), Zl.VALUE_NUMBER_INT, byte.class);
        } catch (IOException iOException) {
          throw b(null);
        }  
    } catch (IOException iOException) {
      throw b(null);
    } 
    throw new Zx(this, String.format(a(7250, -26565), new Object[] { ZR() }), Zl.VALUE_NUMBER_INT, byte.class);
  }
  
  public short Zu() throws IOException {
    int i = Ze();
    try {
      if (i >= -32768)
        try {
          if (i <= 32767)
            return (short)i; 
          throw new Zx(this, String.format(a(7255, 23807), new Object[] { ZR() }), Zl.VALUE_NUMBER_INT, short.class);
        } catch (IOException iOException) {
          throw b(null);
        }  
    } catch (IOException iOException) {
      throw b(null);
    } 
    throw new Zx(this, String.format(a(7255, 23807), new Object[] { ZR() }), Zl.VALUE_NUMBER_INT, short.class);
  }
  
  public abstract int Ze() throws IOException;
  
  public abstract long ZE() throws IOException;
  
  public abstract BigInteger ZX() throws IOException;
  
  public abstract float Zg() throws IOException;
  
  public abstract double ZH() throws IOException;
  
  public abstract BigDecimal ZT() throws IOException;
  
  public boolean ZB() throws IOException {
    Zl zl = Zh();
    try {
      if (zl == Zl.VALUE_TRUE)
        return true; 
    } catch (IOException iOException) {
      throw b(null);
    } 
    try {
      if (zl == Zl.VALUE_FALSE)
        return false; 
    } catch (IOException iOException) {
      throw b(null);
    } 
    throw (new Zm0(this, String.format(a(7253, 17997), new Object[] { zl }))).ZS(this.ZQ);
  }
  
  public Object ZO() throws IOException {
    return null;
  }
  
  public abstract byte[] Zi(Zy paramZy) throws IOException;
  
  public byte[] Za() throws IOException {
    return Zi(Zmw.Zx());
  }
  
  public int Zh(Zy paramZy, OutputStream paramOutputStream) throws IOException {
    ZY();
    return 0;
  }
  
  public int ZC() throws IOException {
    return Zv(0);
  }
  
  public int Zv(int paramInt) throws IOException {
    return paramInt;
  }
  
  public long Zw() throws IOException {
    return ZE(0L);
  }
  
  public long ZE(long paramLong) throws IOException {
    return paramLong;
  }
  
  public String Zd() throws IOException {
    return Zd(null);
  }
  
  public abstract String Zd(String paramString) throws IOException;
  
  public boolean ZM() {
    return false;
  }
  
  public boolean ZP() {
    return false;
  }
  
  public Object ZZ() throws IOException {
    return null;
  }
  
  public Object ZJ() throws IOException {
    return null;
  }
  
  protected Zm0 Zh(String paramString) {
    return (new Zm0(this, paramString)).ZS(this.ZQ);
  }
  
  protected void ZY() {
    throw new UnsupportedOperationException(a(7254, 10480) + getClass().getName());
  }
  
  protected Zm0 ZE(String paramString) {
    return Zh(paramString);
  }
  
  protected Zm0 ZI(String paramString, Object paramObject) {
    return ZE(String.format(paramString, new Object[] { paramObject }));
  }
  
  protected Zm0 Zw(String paramString, Object paramObject1, Object paramObject2) {
    return ZE(String.format(paramString, new Object[] { paramObject1, paramObject2 }));
  }
  
  protected Zm0 ZU(String paramString, Throwable paramThrowable) {
    Zm0 zm0 = new Zm0(this, paramString, paramThrowable);
    if (this.ZQ != null)
      zm0 = zm0.ZS(this.ZQ); 
    return zm0;
  }
  
  protected Zm0 Zw(String paramString, Zm5 paramZm5) {
    Zm0 zm0 = new Zm0(this, paramString, paramZm5);
    if (this.ZQ != null)
      zm0 = zm0.ZS(this.ZQ); 
    return zm0;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_1
    //   8: newarray int
    //   10: iconst_0
    //   11: istore_3
    //   12: invokestatic ZN : ([I)V
    //   15: ldc 'aD©£NçÚ» îêÑÈa¯""ÏVBD$nü³#D ó*h,-í7C $(ö¯¥x;áßZßá(Yt(üä0sûAkf()~ "J¹Dª©¤Ñ:¸ñý,¾»K5ÑÿÔ8køß7vkû&$Wdùµñi3RÀAÂ0×èCamß~¾À«ÊÐþni-¢~!'
    //   17: dup
    //   18: astore_2
    //   19: invokevirtual length : ()I
    //   22: istore #4
    //   24: bipush #42
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #84
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 148
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc 'v°ô94Õ»2çbKBã¼éT ÕÕ¤Hì f 7÷èóÊRÅSKsá7^GzÐïxø'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #44
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: iconst_5
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 88
    //   132: aload #5
    //   134: putstatic com/fasterxml/Zb/Zg.a : [Ljava/lang/String;
    //   137: bipush #6
    //   139: anewarray java/lang/String
    //   142: putstatic com/fasterxml/Zb/Zg.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 263
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 245, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #76
    //   218: goto -> 247
    //   221: bipush #14
    //   223: goto -> 247
    //   226: bipush #17
    //   228: goto -> 247
    //   231: bipush #56
    //   233: goto -> 247
    //   236: bipush #47
    //   238: goto -> 247
    //   241: iconst_2
    //   242: goto -> 247
    //   245: bipush #12
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 171
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 167
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 46, 0 -> 104
    //   304: invokestatic values : ()[Lcom/fasterxml/Zb/Zq;
    //   307: invokestatic ZU : ([Lcom/fasterxml/Zc/Zm;)Lcom/fasterxml/Zc/Zz;
    //   310: putstatic com/fasterxml/Zb/Zg.ZH : Lcom/fasterxml/Zc/Zz;
    //   313: return
  }
  
  public static void ZN(int[] paramArrayOfint) {
    Zc = paramArrayOfint;
  }
  
  public static int[] Zm() {
    return Zc;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1C56) & 0xFFFF;
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
      char c = 'ú';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */