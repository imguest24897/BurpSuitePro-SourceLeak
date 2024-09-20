package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbf4 implements Zzwz {
  private final Zk7g Ze;
  
  private final int ZG;
  
  private final int ZK;
  
  private final Zxs7 Zf;
  
  private final Zlk4 Zb;
  
  private final Zbjl ZA;
  
  private final Zrr2 ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbf4(Zk7g paramZk7g, int paramInt1, int paramInt2, Zxs7 paramZxs7, Zlk4 paramZlk4, Zbjl paramZbjl) {
    this.Ze = paramZk7g;
    this.ZG = paramInt1;
    this.ZK = paramInt2;
    this.Zf = paramZxs7;
    this.Zb = paramZlk4;
    this.ZA = paramZbjl;
    this.ZB = (new Zr4e()).ZP(paramZxs7.ZI());
  }
  
  public List<Zewx> ZK() {
    ArrayList<Zewx> arrayList = new ArrayList();
    if (this.ZB.ZU() == null && !Zlht.ZF(this.Zf.ZI()))
      arrayList.add(Zp(Zlp9.NON_SCHEMA_URL_PAYLOAD)); 
    if (this.ZB.ZU() != null)
      arrayList.add(Zp(Zlp9.OWN_SCHEMA_URL_PAYLOAD)); 
    if (!a(-13478, 26215).equalsIgnoreCase(this.ZB.Zj()))
      arrayList.add(Zp(Zlp9.HTTP_PREFIXED_URL_PAYLOAD)); 
    if (this.Zb == Zlk4.THOROUGH) {
      arrayList.add(Zp(Zlp9.HTTP_MIXED_CASE_PREFIXED_URL_PAYLOAD));
      if (!a(-13473, 9967).equalsIgnoreCase(this.ZB.Zj()))
        arrayList.add(Zp(Zlp9.HTTPS_PREFIXED_URL_PAYLOAD)); 
    } 
    return arrayList;
  }
  
  public Zewx ZK(Zlp9 paramZlp9, Zen paramZen) {
    return ZJ(paramZlp9) ? Zo(paramZen, paramZlp9) : null;
  }
  
  public Zewx Zt(Zlp9 paramZlp9) {
    return ZJ(paramZlp9) ? Zp(paramZlp9) : null;
  }
  
  public Zkfj ZZ(Zewx paramZewx) {
    switch (Zsfl.Zn[this.Ze.ordinal()]) {
      case 1:
      
      case 2:
      
    } 
    Zuh.Zb(false, Zqf.Zk);
    return new Zmit(null);
  }
  
  private Zewx Zp(Zlp9 paramZlp9) {
    Zen zen = this.ZA.ZK(1, (new Ztt6(this.ZG, this.ZK, paramZlp9, this.Zf.Zl())).toString());
    return Zo(zen, paramZlp9);
  }
  
  private Zewx Zo(Zen paramZen, Zlp9 paramZlp9) {
    Zzi5 zzi5 = this.ZA.ZB();
    String str = Ze(paramZen, zzi5);
    byte[] arrayOfByte = Zkb.Zy(ZQ(str, paramZlp9, this.ZB));
    return new Zewx(paramZen, arrayOfByte, paramZlp9, ZB(str, paramZlp9, zzi5), (byte)0, Zewx.ZP);
  }
  
  private String ZQ(String paramString, Zlp9 paramZlp9, Zrr2 paramZrr2) {
    String str;
    switch (Zsfl.Zf[paramZlp9.ordinal()]) {
      case 1:
        str = (paramZrr2.Zj() == null) ? paramZrr2.ZU() : (paramZrr2.Zj() + paramZrr2.Zj());
        return Zb(str, paramString);
      case 2:
        return Zb(Zt(paramZrr2, a(-13477, -9238)), paramString);
      case 3:
        return Zb(a(-13480, 10269), paramString);
      case 4:
        return Zb(Zt(paramZrr2, a(-13474, 7831)), paramString);
      case 5:
        return Zb(null, paramString);
    } 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  private String Ze(Zen paramZen, Zzi5 paramZzi5) {
    return paramZzi5.Zi() ? (paramZzi5.ZJ() + "/" + paramZzi5.ZJ()) : paramZzi5.ZU(paramZen);
  }
  
  private String Zb(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    if (paramString1 != null)
      stringBuilder.append(paramString1); 
    if (this.ZB.Zv() != null)
      stringBuilder.append(this.ZB.Zv()); 
    stringBuilder.append(paramString2);
    if (paramString1 != null) {
      if (this.ZB.ZW() != null)
        stringBuilder.append(this.ZB.ZW()); 
      if (this.ZB.Zh() != null)
        stringBuilder.append(this.ZB.Zh()); 
      if (this.ZB.ZW() == null && this.ZB.Zh() == null && this.ZB.ZU() == null)
        stringBuilder.append(a(-13475, -12114)).append(this.ZB.Zz()); 
    } 
    return stringBuilder.toString();
  }
  
  private String Zt(Zrr2 paramZrr2, String paramString) {
    return (paramZrr2.ZU() == null) ? (paramString + paramString) : (paramString + paramString);
  }
  
  private boolean ZJ(Zlp9 paramZlp9) {
    if (paramZlp9 != Zlp9.HTTP_PREFIXED_URL_PAYLOAD && paramZlp9 != Zlp9.HTTPS_PREFIXED_URL_PAYLOAD && paramZlp9 != Zlp9.HTTP_MIXED_CASE_PREFIXED_URL_PAYLOAD && paramZlp9 != Zlp9.NON_SCHEMA_URL_PAYLOAD && paramZlp9 != Zlp9.OWN_SCHEMA_URL_PAYLOAD) {
      Zuh.Zb(false, Zqf.Zr);
      return false;
    } 
    return true;
  }
  
  private Zmhr ZB(String paramString, Zlp9 paramZlp9, Zzi5 paramZzi5) {
    boolean bool1 = (paramZlp9 == Zlp9.HTTPS_PREFIXED_URL_PAYLOAD) ? true : false;
    boolean bool2 = bool1 ? true : true;
    String str = paramZzi5.Zi() ? paramZzi5.ZJ() : paramString;
    return new Zmhr(str, bool2, bool1);
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'õ<ºþ@+ÇÉ\\f~$~'Và³'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #66
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
    //   67: ldc 'gR©~¸Þ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #86
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zbf4.a : [Ljava/lang/String;
    //   130: bipush #7
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zbf4.b : [Ljava/lang/String;
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
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_2
    //   213: goto -> 243
    //   216: bipush #110
    //   218: goto -> 243
    //   221: bipush #95
    //   223: goto -> 243
    //   226: bipush #52
    //   228: goto -> 243
    //   231: bipush #127
    //   233: goto -> 243
    //   236: bipush #90
    //   238: goto -> 243
    //   241: bipush #52
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
    //   282: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCB5E) & 0xFFFF;
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
      char c = 'Ð';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbf4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */