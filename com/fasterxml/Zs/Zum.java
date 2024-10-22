package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zm.Zee;
import com.fasterxml.Zm.Zq;
import com.fasterxml.Zm.Zv;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zo.Zi;
import com.fasterxml.Zo.Zq;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zp.Zt;
import java.io.IOException;
import java.util.Collection;

public class Zum<T> extends Zl<T> implements Zi, Zq {
  private static final long serialVersionUID = 1L;
  
  protected final Zv<Object, T> ZO;
  
  protected final Zk ZM;
  
  protected final Zyo<Object> ZB;
  
  private static final String[] e;
  
  private static final String[] f;
  
  public Zum(Zv<?, T> paramZv) {
    super(Object.class);
    this.ZO = (Zv)paramZv;
    this.ZM = null;
    this.ZB = null;
  }
  
  public Zum(Zv<Object, T> paramZv, Zk paramZk, Zyo<?> paramZyo) {
    super(paramZk);
    this.ZO = paramZv;
    this.ZM = paramZk;
    this.ZB = (Zyo)paramZyo;
  }
  
  protected Zum<T> ZL(Zv<Object, T> paramZv, Zk paramZk, Zyo<?> paramZyo) {
    Zx.ZW(Zum.class, this, c(-8181, -10223));
    return new Zum(paramZv, paramZk, paramZyo);
  }
  
  public Zyo<T> Zv(Zee paramZee) {
    Zx.ZW(Zum.class, this, c(-8183, -32553));
    return Zt(this.ZB.Zv(paramZee));
  }
  
  public Zyo<T> Zt(Zyo<?> paramZyo) {
    try {
      Zx.ZW(Zum.class, this, c(-8184, -2563));
      if (paramZyo == this.ZB)
        return this; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return new Zum(this.ZO, this.ZM, paramZyo);
  }
  
  public void Zs(Zyg paramZyg) throws Zy_ {
    try {
      if (this.ZB != null)
        try {
          if (this.ZB instanceof Zq)
            ((Zq)this.ZB).Zs(paramZyg); 
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
  }
  
  public Zyo<?> Zq(Zyg paramZyg, Zo paramZo) throws Zy_ {
    if (this.ZB != null) {
      Zyo<Object> zyo = paramZyg.Zm(this.ZB, paramZo, this.ZM);
      try {
        if (zyo != this.ZB)
          return ZL(this.ZO, this.ZM, zyo); 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
      return this;
    } 
    Zk zk = this.ZO.ZD(paramZyg.ZL());
    return ZL(this.ZO, zk, paramZyg.ZC(zk, paramZo));
  }
  
  public T deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    Object object = this.ZB.deserialize(paramZg, paramZyg);
    try {
      if (object == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZW(object);
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    Object object = this.ZB.deserialize(paramZg, paramZyg);
    try {
      if (object == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZW(object);
  }
  
  public T ZI(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    try {
      if (this.ZM.Zf().isAssignableFrom(paramObject.getClass()))
        return (T)this.ZB.ZI(paramZg, paramZyg, paramObject); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (T)Zb(paramZg, paramZyg, paramObject);
  }
  
  public Object ZY(Zg paramZg, Zyg paramZyg, Zt paramZt, T paramT) throws IOException, Zd {
    try {
      if (!this.ZM.Zf().isAssignableFrom(paramT.getClass()))
        return Zb(paramZg, paramZyg, paramT); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.ZB.ZI(paramZg, paramZyg, paramT);
  }
  
  protected Object Zb(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    throw new UnsupportedOperationException(String.format(c(-8182, 27563) + paramObject.getClass().getName(), new Object[] { this.ZM }));
  }
  
  public Class<?> ZX() {
    return this.ZB.ZX();
  }
  
  public Zd Zb() {
    return this.ZB.Zb();
  }
  
  public boolean Zs() {
    try {
      if (this.ZB != null)
        try {
          if (this.ZB.Zs());
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  public Zyo<?> Za() {
    return this.ZB;
  }
  
  public Collection<Object> Z_() {
    return this.ZB.Z_();
  }
  
  public T Zj(Zyg paramZyg) throws Zy_ {
    return Zf(this.ZB.Zj(paramZyg));
  }
  
  public Object Zk(Zyg paramZyg) throws Zy_ {
    return Zf(this.ZB.Zk(paramZyg));
  }
  
  public Object Zy(Zyg paramZyg) throws Zy_ {
    return Zf(this.ZB.Zy(paramZyg));
  }
  
  public Zq Zm() {
    return this.ZB.Zm();
  }
  
  public Boolean Zu(Zyc paramZyc) {
    return this.ZB.Zu(paramZyc);
  }
  
  protected T ZW(Object paramObject) {
    return (T)this.ZO.Zx(paramObject);
  }
  
  protected T Zf(Object paramObject) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (paramObject == null) ? null : (T)this.ZO.Zx(paramObject);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '< sAÔùw[âÝ½³Ì\\nMUØb!øåûN¶r×«ra£ôø'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #16
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #80
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
    //   67: ldc 'ô±ãw3;íÒ*Â|þÛ^Mßã·¦Ë® \\tQhÛ °fOÆ\\nXñ3OåÁD+ÙÛÇXº\\fe!+z9ë¬È%Û)±'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #64
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #45
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
    //   128: putstatic com/fasterxml/Zs/Zum.e : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zs/Zum.f : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #84
    //   214: goto -> 244
    //   217: bipush #87
    //   219: goto -> 244
    //   222: bipush #104
    //   224: goto -> 244
    //   227: bipush #16
    //   229: goto -> 244
    //   232: bipush #103
    //   234: goto -> 244
    //   237: bipush #46
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
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE008) & 0xFFFF;
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
      byte b1 = 8;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */