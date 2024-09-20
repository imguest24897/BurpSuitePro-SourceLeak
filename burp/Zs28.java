package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zs28 implements Zzwz {
  private final Zk7g ZL;
  
  private final Zsy Zd;
  
  private final int ZQ;
  
  private final int ZH;
  
  private final Zxs7 ZD;
  
  private final Zbjl Zm;
  
  private Zen ZX;
  
  private Zldj Zk;
  
  private static Zbqc[] Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zs28(Zk7g paramZk7g, Zsy paramZsy, int paramInt1, int paramInt2, Zbjl paramZbjl, Zxs7 paramZxs7) {
    this.ZL = paramZk7g;
    this.Zd = paramZsy;
    this.ZQ = paramInt1;
    this.ZH = paramInt2;
    this.ZD = paramZxs7;
    this.Zm = paramZbjl;
  }
  
  public Zewx Zt(Zlp9 paramZlp9) {
    Zen zen = Zh();
    Zzi5 zzi5 = this.Zm.ZB();
    Zbqc[] arrayOfZbqc = ZT();
    this.Zk = (new Zsvz(this.Zd, this.ZD.ZI())).Zw(Zf(zen, zzi5)).Zd().Zp();
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zewx(zen, Zkb.Zy(this.Zk.toString()), this.Zk.Zy(), Zlp9.XML_DOC_TYPE_DTD_PAYLOAD, new Zmhr(zzi5.ZU(zen), 80, false), (byte)0, Zewx.ZP);
  }
  
  public List<Zewx> ZK() {
    return Collections.singletonList(Zt(Zlp9.NONE));
  }
  
  public Zkfj ZZ(Zewx paramZewx) {
    switch (Zkri.ZU[this.ZL.ordinal()]) {
      case 1:
      
      case 2:
      
    } 
    Zuh.ZT(false, Zqf.Zr, this.ZL.toString());
    return new Zmit(this.Zk);
  }
  
  public Zewx ZK(Zlp9 paramZlp9, Zen paramZen) {
    this.ZX = paramZen;
    return Zt(paramZlp9);
  }
  
  private Zen Zh() {
    if (this.ZX != null)
      return this.ZX; 
    Ztt6 ztt6 = new Ztt6(this.ZQ, this.ZH, Zlp9.XML_DOC_TYPE_DTD_PAYLOAD, this.ZD.Zl());
    return this.Zm.ZK(1, ztt6.toString());
  }
  
  private String Zf(Zen paramZen, Zzi5 paramZzi5) {
    return a(-11666, 18411) + a(-11666, 18411) + paramZzi5.Zq(paramZen);
  }
  
  public static void Zl(Zbqc[] paramArrayOfZbqc) {
    Zw = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZT() {
    return Zw;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '­)ÞP_àÀÈÏøé{çÖ¦· R¼ÀÇ'Êã6·GJò¶1LTÂ­©ÕÆ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: aconst_null
    //   18: iconst_2
    //   19: istore_1
    //   20: invokestatic Zl : ([Lburp/Zbqc;)V
    //   23: iconst_m1
    //   24: istore_0
    //   25: bipush #105
    //   27: iinc #0, 1
    //   30: aload_2
    //   31: iload_0
    //   32: dup
    //   33: iload_1
    //   34: iadd
    //   35: invokevirtual substring : (II)Ljava/lang/String;
    //   38: iconst_m1
    //   39: goto -> 85
    //   42: aload #5
    //   44: swap
    //   45: iload_3
    //   46: iinc #3, 1
    //   49: swap
    //   50: aastore
    //   51: iload_0
    //   52: iload_1
    //   53: iadd
    //   54: dup
    //   55: istore_0
    //   56: iload #4
    //   58: if_icmpge -> 70
    //   61: aload_2
    //   62: iload_0
    //   63: invokevirtual charAt : (I)C
    //   66: istore_1
    //   67: goto -> 25
    //   70: aload #5
    //   72: putstatic burp/Zs28.a : [Ljava/lang/String;
    //   75: iconst_2
    //   76: anewarray java/lang/String
    //   79: putstatic burp/Zs28.b : [Ljava/lang/String;
    //   82: goto -> 230
    //   85: dup_x2
    //   86: pop
    //   87: invokevirtual toCharArray : ()[C
    //   90: dup_x1
    //   91: arraylength
    //   92: dup_x2
    //   93: pop
    //   94: iconst_0
    //   95: istore #6
    //   97: dup2_x1
    //   98: pop2
    //   99: dup_x2
    //   100: iconst_1
    //   101: if_icmpgt -> 203
    //   104: dup2
    //   105: swap
    //   106: iload #6
    //   108: dup2_x1
    //   109: caload
    //   110: swap
    //   111: iload #6
    //   113: bipush #7
    //   115: irem
    //   116: tableswitch default -> 185, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 175, 5 -> 180
    //   156: bipush #88
    //   158: goto -> 187
    //   161: bipush #55
    //   163: goto -> 187
    //   166: bipush #52
    //   168: goto -> 187
    //   171: iconst_2
    //   172: goto -> 187
    //   175: bipush #37
    //   177: goto -> 187
    //   180: bipush #42
    //   182: goto -> 187
    //   185: bipush #42
    //   187: ixor
    //   188: ixor
    //   189: i2c
    //   190: castore
    //   191: iinc #6, 1
    //   194: dup
    //   195: ifne -> 203
    //   198: dup2
    //   199: dup_x1
    //   200: goto -> 108
    //   203: dup2_x1
    //   204: pop2
    //   205: dup_x2
    //   206: iload #6
    //   208: if_icmpgt -> 104
    //   211: pop
    //   212: new java/lang/String
    //   215: dup_x1
    //   216: swap
    //   217: invokespecial <init> : ([C)V
    //   220: invokevirtual intern : ()Ljava/lang/String;
    //   223: swap
    //   224: pop
    //   225: swap
    //   226: pop
    //   227: goto -> 42
    //   230: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD26F) & 0xFFFF;
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
      char c = 'Ë';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs28.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */