package burp;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zg2_ extends Zg2n {
  private final Zen Zh;
  
  private final Zen ZR;
  
  private final Ztai ZV;
  
  private static int[] ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zg2_(Ztai paramZtai, Zzow paramZzow, Zbjl paramZbjl) {
    super(a(-19350, 25891), a(-19352, 19530), null, paramZbjl);
    this.Zh = (paramZzow.Zd() > 0) ? paramZzow.Zb(0) : null;
    this.ZR = (paramZzow.Zd() > 1) ? paramZzow.Zb(1) : null;
    this.ZV = paramZtai;
  }
  
  public void ZS(Zlvf paramZlvf, byte[] paramArrayOfbyte1, Zxs7 paramZxs7, Zz4_ paramZz4_, Ze3n paramZe3n, byte[] paramArrayOfbyte2, List<Zl1r> paramList, Zbnt paramZbnt) {
    ZX(paramArrayOfbyte1, paramZlvf, paramZxs7, paramZz4_, paramZe3n, paramArrayOfbyte2, paramList, this.ZV);
    Zb6q zb6q = paramZlvf.ZM().ZT();
    byte[] arrayOfByte = zb6q.Za().ZiD();
    int i = zb6q.Zs();
    boolean bool = Zlep.ZZ(paramZlvf, paramArrayOfbyte2, i);
    if (this.ZV.ZS(Zzu2.XSS_REFLECTED, Zr3z.CLIENT_SIDE_BREAKOUT) && bool) {
      String str = Zlep.Zj(Zgyj.ZB(paramZlvf.ZM().ZR(), a(-19345, -15790), false));
      Zefx zefx = paramZlvf.ZM().ZL();
      EnumSet<Zklf> enumSet = Zlep.ZI(str, zefx.ZF().Zd4());
      ArrayList<Zl1r> arrayList = new ArrayList();
      Zl8v.Zm(a(-19348, 22467), arrayOfByte, i, arrayOfByte.length, arrayList, false);
      Zl8v.ZG(arrayOfByte, i, arrayList, new String[] { a(-19347, -17796) });
      paramZz4_.Zz(Zx_r.ZP(enumSet, str, paramZe3n.Za(), paramZe3n.ZN(), paramZlvf, ZG(paramArrayOfbyte1, paramList), arrayList, paramZxs7));
    } 
  }
  
  public void Zu(Zlvf paramZlvf, byte[] paramArrayOfbyte1, Zxs7 paramZxs7, Zz4_ paramZz4_, Ze3n paramZe3n, byte[] paramArrayOfbyte2, List<Zl1r> paramList) {
    ZX(paramArrayOfbyte1, paramZlvf, paramZxs7, paramZz4_, paramZe3n, paramArrayOfbyte2, paramList, this.ZV);
    Zb6q zb6q = paramZlvf.ZM().ZT();
    byte[] arrayOfByte = zb6q.Za().ZiD();
    if (this.ZV.ZS(Zzu2.XSS_REFLECTED, Zr3z.CLIENT_SIDE_BREAKOUT) && Zlep.Zs(arrayOfByte, a(-19349, -445))) {
      int i = zb6q.Zs();
      boolean bool = Zlep.ZZ(paramZlvf, paramArrayOfbyte2, i);
      if (bool) {
        ArrayList<Zl1r> arrayList = new ArrayList();
        Zl8v.Zm(a(-19346, 22240), arrayOfByte, i, arrayOfByte.length, arrayList, false);
        Zl8v.ZG(arrayOfByte, i, arrayList, new String[] { a(-19351, -1873) });
        paramZz4_.Zz(Zx_r.Zd(paramZe3n.Za(), paramZe3n.ZN(), paramZlvf, ZG(paramArrayOfbyte1, paramList), arrayList, paramZxs7));
      } 
    } 
  }
  
  protected String ZP(String paramString) {
    Zuh.Zb(false, Zqf.ZC);
    return "";
  }
  
  public String ZJ() {
    String str1 = Zb(this.Zh);
    String str2 = Zb(this.ZR);
    return Zr3f.ZR(str1, str2);
  }
  
  protected boolean ZL() {
    return false;
  }
  
  protected List<Zl1r> ZO(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, List<Zl1r> paramList) {
    ArrayList<Zl1r> arrayList = new ArrayList<>(paramList);
    Zl8v.Zx(paramArrayOfbyte1, paramArrayOfbyte2, 0, paramArrayOfbyte2.length, arrayList, false);
    return arrayList;
  }
  
  private List<Zl1r> ZG(byte[] paramArrayOfbyte, List<Zl1r> paramList) {
    ArrayList<Zl1r> arrayList = new ArrayList<>(paramList);
    Zl8v.Zm(a(-19346, 22240), paramArrayOfbyte, 0, paramArrayOfbyte.length, arrayList, false);
    return arrayList;
  }
  
  public static Zsqx<Zrdb> ZF(Ze3n paramZe3n, Zxs7 paramZxs7, byte paramByte, Zbll paramZbll) {
    Zs2i zs2i = paramZbll.Zk.Zu(paramZxs7);
    Zvow zvow = paramZe3n.ZI().Zp(zs2i.ZE()).ZK(paramZbll.Zk.Zn(paramZbll, paramZxs7));
    return Zx_r.ZQ(paramZe3n.Za(), paramZe3n.ZN(), paramByte, zvow, paramZbll.ZP, paramZxs7);
  }
  
  public static void Zv(int[] paramArrayOfint) {
    ZX = paramArrayOfint;
  }
  
  public static int[] Zn() {
    return ZX;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: aconst_null
    //   10: ldc 'é=$zH:Ëî?~ºnÐé4R)ÓË>\âªñÒ>ôê¯.)û³èåÎ_òÍÌ0TµÇxÒþwßÞt¥\\tÁ|V@[¿Å4´ªíO<.èÝ½<f'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #21
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic Zv : ([I)V
    //   27: iconst_2
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 146
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
    //   68: goto -> 27
    //   71: ldc 'ëá[{]Ë*Üt\ÎA³QÕ¸ÿ77f@Øx6dî\\rÌ­²È'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #13
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #15
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zg2_.a : [Ljava/lang/String;
    //   135: bipush #8
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zg2_.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #49
    //   218: goto -> 248
    //   221: bipush #69
    //   223: goto -> 248
    //   226: bipush #89
    //   228: goto -> 248
    //   231: bipush #86
    //   233: goto -> 248
    //   236: bipush #83
    //   238: goto -> 248
    //   241: bipush #59
    //   243: goto -> 248
    //   246: bipush #126
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB469) & 0xFFFF;
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
      byte b1 = 51;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */