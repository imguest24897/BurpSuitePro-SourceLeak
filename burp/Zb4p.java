package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zsy;

class Zb4p implements Zzwz {
  private final int Zp;
  
  private final int Zt;
  
  private final Zbjl ZA;
  
  private final Zsy ZR;
  
  private final Zxs7 ZG;
  
  private Zen ZC;
  
  private String ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zb4p(int paramInt1, int paramInt2, Zbjl paramZbjl, Zsy paramZsy, Zxs7 paramZxs7) {
    this.Zp = paramInt1;
    this.Zt = paramInt2;
    this.ZA = paramZbjl;
    this.ZR = paramZsy;
    this.ZG = paramZxs7;
  }
  
  public Zewx Zt(Zlp9 paramZlp9) {
    int[] arrayOfInt = Ztok.ZS();
    for (Zewx zewx : ZB()) {
      if (zewx.ZG() == paramZlp9)
        return zewx; 
      if (arrayOfInt == null)
        break; 
    } 
    return null;
  }
  
  public Zewx ZK(Zlp9 paramZlp9, Zen paramZen) {
    this.ZC = paramZen;
    return Zt(paramZlp9);
  }
  
  public Zkfj ZZ(Zewx paramZewx) {
    return new Ztok(Zkb.Zy(this.ZW));
  }
  
  public List<Zewx> ZK() {
    this.ZW = Ze();
    ArrayList<Zewx> arrayList = new ArrayList(Arrays.asList((Object[])new Zewx[] { ZY(Zlp9.NUMERIC_ORACLE_SQLI_PAYLOAD, "", "", (byte)0), ZY(Zlp9.STRING_ORACLE_SQLI_PAYLOAD, a(22531, 27589), a(22532, 15679), (byte)1) }));
    if (ZM())
      arrayList.add(ZY(Zlp9.COMMA_ORACLE_SQLI_PAYLOAD, a(22530, -2631), "", (byte)0)); 
    return arrayList;
  }
  
  private List<Zewx> ZB() {
    this.ZW = Ze();
    return Arrays.asList(new Zewx[] { ZY(Zlp9.NUMERIC_ORACLE_SQLI_PAYLOAD, "", "", (byte)0), ZY(Zlp9.STRING_ORACLE_SQLI_PAYLOAD, a(22539, 32098), a(22528, -8941), (byte)1), ZY(Zlp9.COMMA_ORACLE_SQLI_PAYLOAD, a(22536, -6991), "", (byte)0) });
  }
  
  private boolean ZM() {
    return (this.ZG.ZI() != null && (a(22537, -19523).equalsIgnoreCase(this.ZG.ZI()) || a(22542, 21044).equalsIgnoreCase(this.ZG.ZI())));
  }
  
  private Zewx ZY(Zlp9 paramZlp9, String paramString1, String paramString2, byte paramByte) {
    Zen zen = Zh(paramZlp9);
    String str = paramString1 + paramString1 + Zz(zen);
    return Zg(zen, str, paramZlp9, paramByte);
  }
  
  private Zewx Zg(Zen paramZen, String paramString, Zlp9 paramZlp9, byte paramByte) {
    return new Zewx(paramZen, Zkb.Zy(paramString), paramZlp9, new Zmhr(this.ZA.ZB().ZU(paramZen), 80, false), paramByte, Zewx.ZP);
  }
  
  private Zen Zh(Zlp9 paramZlp9) {
    if (this.ZC != null)
      return this.ZC; 
    Ztt6 ztt6 = new Ztt6(this.Zp, this.Zt, paramZlp9, this.ZG.Zl());
    return this.ZA.ZK(1, ztt6.toString());
  }
  
  private String Zz(Zen paramZen) {
    String str1 = this.ZW;
    String str2 = this.ZA.ZB().Ze(a(22533, 4990), "'", paramZen);
    String str3 = this.ZW;
    return a(22534, -27986) + a(22534, -27986) + str3 + a(22538, 25634) + str2 + a(22529, 31534) + str1;
  }
  
  private String Ze() {
    return this.ZR.Zi().Zq().ZK(5);
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '_w¨õ6!l)ùMá`Âg´<³ªóËm¯ûW6®Ê¯þÂXqï,GÅq5OÔ±lÖPÌlb±+¦Q{jo9;×á¬GÜA!ÁÂÅåÔís}¡éQ¹ýù5°ª6Æ÷b½.}½!hOjKÝ±ÊcÆÆ~áâ=bÕtÆ¨]v'/¿í\\t\\fñSÃ#?A\\báC'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #104
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
    //   67: ldc '`h$®áH'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_3
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #85
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
    //   127: putstatic burp/Zb4p.a : [Ljava/lang/String;
    //   130: bipush #13
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zb4p.b : [Ljava/lang/String;
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
    //   212: bipush #22
    //   214: goto -> 244
    //   217: bipush #118
    //   219: goto -> 244
    //   222: bipush #59
    //   224: goto -> 244
    //   227: bipush #54
    //   229: goto -> 244
    //   232: bipush #126
    //   234: goto -> 244
    //   237: bipush #43
    //   239: goto -> 244
    //   242: bipush #35
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
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5802) & 0xFFFF;
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
      byte b1 = 36;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb4p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */