package burp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Zems {
  private final Map<String, Zric> Zy = new HashMap<>();
  
  private final Zblz ZZ = new Zblz();
  
  private static Zbqc[] ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zems() {
    this.Zy.put(a(-16497, 16456), new Zg2w(new String[] { 
            a(-16495, -25), a(-16505, -2825), a(-16486, 31174), a(-16510, 20782), a(-16494, 21796), a(-16484, 25743), a(-16482, -7957), a(-16506, -14883), a(-16500, -3372), a(-16509, -2598), 
            a(-16489, -27216) }));
    this.Zy.put(a(-16485, 746), new Zzy0(new String[] { a(-16483, -3588) }));
    String[] arrayOfString = { 
        a(-16488, 3716), a(-16487, -31023), a(-16490, -14052), a(-16491, -5103), a(-16493, 13317), a(-16498, 28678), a(-16511, -9685), a(-16492, -10610), a(-16507, 17560), a(-16508, -18043), 
        a(-16496, -30512) };
    this.Zy.put(a(-16503, 8064), new Zzy0(arrayOfString));
    this.Zy.put(a(-16481, -10222), new Zzy0(arrayOfString));
    this.ZZ.ZL(a(-16499, -7110), new Zeq1());
    this.ZZ.ZL(a(-16512, -23301), new Zzbz());
  }
  
  public boolean Zy(Set<String> paramSet, String paramString) {
    Zric zric = this.Zy.get(paramString);
    return (zric == null) ? false : zric.Z_(paramSet);
  }
  
  public boolean ZQ(String paramString1, Zs_n paramZs_n, String paramString2) {
    if (paramString1 == null)
      return false; 
    boolean bool = ((Zric)this.Zy.get(paramString2)).Z_(paramString1);
    return bool ? this.ZZ.ZO(paramString2).Zm(paramZs_n) : false;
  }
  
  public static void Zx(Zbqc[] paramArrayOfZbqc) {
    ZH = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Ze() {
    return ZH;
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc '^^ØWÓæÌØ\\f5õ8A¥t2%\\rÃôºÆ\\t3ìãíú(47mäÝYz³CÀ8YH°Ý§:{ A´ú ÀGæñáûâÎGeùÁÅjzm¶Ûã ¦ìâÌ\\f\\b4BwdÇV#c¢)\\nYóA£¦©Þc@6³Ë§Ó<äÑo\\t xND97¿/EuF'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: iconst_5
    //   20: istore_1
    //   21: invokestatic Zx : ([Lburp/Zbqc;)V
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #104
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 145
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
    //   71: ldc '\\tû}R¼§åÒ'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: iconst_5
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #43
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 145
    //   101: aload #5
    //   103: swap
    //   104: iload_3
    //   105: iinc #3, 1
    //   108: swap
    //   109: aastore
    //   110: iload_0
    //   111: iload_1
    //   112: iadd
    //   113: dup
    //   114: istore_0
    //   115: iload #4
    //   117: if_icmpge -> 129
    //   120: aload_2
    //   121: iload_0
    //   122: invokevirtual charAt : (I)C
    //   125: istore_1
    //   126: goto -> 84
    //   129: aload #5
    //   131: putstatic burp/Zems.a : [Ljava/lang/String;
    //   134: bipush #29
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zems.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #105
    //   218: goto -> 248
    //   221: bipush #90
    //   223: goto -> 248
    //   226: bipush #114
    //   228: goto -> 248
    //   231: bipush #83
    //   233: goto -> 248
    //   236: bipush #42
    //   238: goto -> 248
    //   241: bipush #102
    //   243: goto -> 248
    //   246: bipush #87
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 101
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBF95) & 0xFFFF;
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
      char c = 'ù';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zems.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */