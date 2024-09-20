package com.fasterxml.Zs;

import com.fasterxml.Zb.Zmw;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zvv;
import java.io.IOException;
import java.util.UUID;

public class Zuf extends Zub<UUID> {
  private static final long serialVersionUID = 1L;
  
  static final int[] ZU;
  
  private static final String[] g;
  
  private static final String[] h;
  
  public Zuf() {
    super(UUID.class);
  }
  
  public Object Zy(Zyg paramZyg) {
    return new UUID(0L, 0L);
  }
  
  protected UUID Zz(String paramString, Zyg paramZyg) throws IOException {
    try {
      if (paramString.length() != 36) {
        if (paramString.length() == 24) {
          paramString = ZR(paramString);
          byte[] arrayOfByte = Zmw.Zx().ZF(paramString);
          return Zp(arrayOfByte, paramZyg);
        } 
        if (paramString.length() == 22) {
          paramString = ZD(paramString);
          byte[] arrayOfByte = Zmw.ZR.ZF(paramString);
          return Zp(arrayOfByte, paramZyg);
        } 
        return Zu(paramString, paramZyg);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramString.charAt(8) == '-')
        try {
          if (paramString.charAt(13) == '-')
            try {
              if (paramString.charAt(18) == '-') {
                try {
                  if (paramString.charAt(23) != '-') {
                    Zu(paramString, paramZyg);
                    long l9 = ZI(paramString, 0, paramZyg);
                    l9 <<= 32L;
                    long l10 = ZQ(paramString, 9, paramZyg) << 16L;
                    l10 |= ZQ(paramString, 14, paramZyg);
                    long l11 = l9 + l10;
                    int k = ZQ(paramString, 19, paramZyg) << 16 | ZQ(paramString, 24, paramZyg);
                    l9 = k;
                    l9 <<= 32L;
                    l10 = ZI(paramString, 28, paramZyg);
                    l10 = l10 << 32L >>> 32L;
                    long l12 = l9 | l10;
                    return new UUID(l11, l12);
                  } 
                } catch (IOException iOException) {
                  throw a(null);
                } 
                long l5 = ZI(paramString, 0, paramZyg);
                l5 <<= 32L;
                long l6 = ZQ(paramString, 9, paramZyg) << 16L;
                l6 |= ZQ(paramString, 14, paramZyg);
                long l7 = l5 + l6;
                int j = ZQ(paramString, 19, paramZyg) << 16 | ZQ(paramString, 24, paramZyg);
                l5 = j;
                l5 <<= 32L;
                l6 = ZI(paramString, 28, paramZyg);
                l6 = l6 << 32L >>> 32L;
                long l8 = l5 | l6;
                return new UUID(l7, l8);
              } 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zu(paramString, paramZyg);
    long l1 = ZI(paramString, 0, paramZyg);
    l1 <<= 32L;
    long l2 = ZQ(paramString, 9, paramZyg) << 16L;
    l2 |= ZQ(paramString, 14, paramZyg);
    long l3 = l1 + l2;
    int i = ZQ(paramString, 19, paramZyg) << 16 | ZQ(paramString, 24, paramZyg);
    l1 = i;
    l1 <<= 32L;
    l2 = ZI(paramString, 28, paramZyg);
    l2 = l2 << 32L >>> 32L;
    long l4 = l1 | l2;
    return new UUID(l3, l4);
  }
  
  protected UUID ZU(Object paramObject, Zyg paramZyg) throws IOException {
    try {
      if (paramObject instanceof byte[])
        return Zp((byte[])paramObject, paramZyg); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return super.ZQ(paramObject, paramZyg);
  }
  
  private UUID Zu(String paramString, Zyg paramZyg) throws IOException {
    return (UUID)paramZyg.ZN(ZX(), paramString, d(18893, -27836), new Object[0]);
  }
  
  int ZI(String paramString, int paramInt, Zyg paramZyg) throws Zy_ {
    return (ZG(paramString, paramInt, paramZyg) << 24) + (ZG(paramString, paramInt + 2, paramZyg) << 16) + (ZG(paramString, paramInt + 4, paramZyg) << 8) + ZG(paramString, paramInt + 6, paramZyg);
  }
  
  int ZQ(String paramString, int paramInt, Zyg paramZyg) throws Zy_ {
    return (ZG(paramString, paramInt, paramZyg) << 8) + ZG(paramString, paramInt + 2, paramZyg);
  }
  
  int ZG(String paramString, int paramInt, Zyg paramZyg) throws Zy_ {
    char c1 = paramString.charAt(paramInt);
    char c2 = paramString.charAt(paramInt + 1);
    try {
      if (c1 <= '' && c2 <= '') {
        int i = ZU[c1] << 4 | ZU[c2];
        try {
          if (i >= 0)
            return i; 
        } catch (Zy_ zy_) {
          throw a(null);
        } 
      } 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (c1 <= '')
        try {
          return (ZU[c1] >= 0) ? ZY(paramString, paramInt + 1, paramZyg, c2) : ZY(paramString, paramInt, paramZyg, c1);
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return ZY(paramString, paramInt, paramZyg, c1);
  }
  
  int ZY(String paramString, int paramInt, Zyg paramZyg, char paramChar) throws Zy_ {
    throw paramZyg.ZR(paramString, ZX(), String.format(d(18894, 15437), new Object[] { Character.valueOf(paramChar), Integer.toHexString(paramChar) }));
  }
  
  private UUID Zp(byte[] paramArrayOfbyte, Zyg paramZyg) throws Zy_ {
    try {
      if (paramArrayOfbyte.length != 16)
        throw Zvv.Zh(paramZyg.Zu(), d(18895, -26551) + paramArrayOfbyte.length + d(18892, -9208), paramArrayOfbyte, ZX()); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return new UUID(ZJ(paramArrayOfbyte, 0), ZJ(paramArrayOfbyte, 8));
  }
  
  private String ZD(String paramString) {
    return paramString.replace('+', '-').replace('/', '_');
  }
  
  private String ZR(String paramString) {
    return paramString.replace('-', '+').replace('_', '/');
  }
  
  private static long ZJ(byte[] paramArrayOfbyte, int paramInt) {
    long l1 = Zr(paramArrayOfbyte, paramInt) << 32L;
    long l2 = Zr(paramArrayOfbyte, paramInt + 4);
    l2 = l2 << 32L >>> 32L;
    return l1 | l2;
  }
  
  private static int Zr(byte[] paramArrayOfbyte, int paramInt) {
    return paramArrayOfbyte[paramInt] << 24 | (paramArrayOfbyte[paramInt + 1] & 0xFF) << 16 | (paramArrayOfbyte[paramInt + 2] & 0xFF) << 8 | paramArrayOfbyte[paramInt + 3] & 0xFF;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'æúçØ¶1,ÂÐLÖ¤A [ð[¹ÕÚwg¸ÝK+!ýÂëNBÜ/xB8NÍõ/ie×èó´6-Ñ^'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #61
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #82
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
    //   67: ldc '!¹ì;q)y¶ü³jæ¤ÔFTÇ!Îå1ØtYþúè¹c¶«|°|oª>4oâ#·¬ÞÏtÑ?µoèV=bÁT?õåÂÈe*¬ª"þõ6\\rÀò±ºrÝBåmX½\\b´AÅÚÊ|'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #44
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #82
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
    //   128: putstatic com/fasterxml/Zs/Zuf.g : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zs/Zuf.h : [Ljava/lang/String;
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
    //   212: bipush #116
    //   214: goto -> 244
    //   217: bipush #25
    //   219: goto -> 244
    //   222: bipush #27
    //   224: goto -> 244
    //   227: bipush #90
    //   229: goto -> 244
    //   232: bipush #91
    //   234: goto -> 244
    //   237: bipush #87
    //   239: goto -> 244
    //   242: bipush #52
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
    //   300: bipush #127
    //   302: newarray int
    //   304: putstatic com/fasterxml/Zs/Zuf.ZU : [I
    //   307: getstatic com/fasterxml/Zs/Zuf.ZU : [I
    //   310: iconst_m1
    //   311: invokestatic fill : ([II)V
    //   314: iconst_0
    //   315: istore #7
    //   317: iload #7
    //   319: bipush #10
    //   321: if_icmpge -> 341
    //   324: getstatic com/fasterxml/Zs/Zuf.ZU : [I
    //   327: bipush #48
    //   329: iload #7
    //   331: iadd
    //   332: iload #7
    //   334: iastore
    //   335: iinc #7, 1
    //   338: goto -> 317
    //   341: iconst_0
    //   342: istore #7
    //   344: iload #7
    //   346: bipush #6
    //   348: if_icmpge -> 385
    //   351: getstatic com/fasterxml/Zs/Zuf.ZU : [I
    //   354: bipush #97
    //   356: iload #7
    //   358: iadd
    //   359: bipush #10
    //   361: iload #7
    //   363: iadd
    //   364: iastore
    //   365: getstatic com/fasterxml/Zs/Zuf.ZU : [I
    //   368: bipush #65
    //   370: iload #7
    //   372: iadd
    //   373: bipush #10
    //   375: iload #7
    //   377: iadd
    //   378: iastore
    //   379: iinc #7, 1
    //   382: goto -> 344
    //   385: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  private static String d(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x49CD) & 0xFFFF;
    if (h[i] == null) {
      char[] arrayOfChar = g[i].toCharArray();
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
      byte b1 = 2;
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
      h[i] = (new String(arrayOfChar)).intern();
    } 
    return h[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zuf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */