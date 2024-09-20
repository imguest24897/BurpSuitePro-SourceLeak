package burp;

import java.awt.Window;
import javax.swing.JSeparator;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zrzg;
import net.portswigger.Zuh;

public class Zztm extends Zztv {
  private final Zxei ZW;
  
  private final Zt90 ZE;
  
  private final Zrzg Zq;
  
  private final Zzxi Zk;
  
  private final Zt8u Zw;
  
  private final Zgb6 Zv;
  
  private final Zkl6 Zj;
  
  private final Zb_l Zx;
  
  private final Zmgs[] ZG;
  
  private final Zepe Zr;
  
  private final Zepe ZU;
  
  private final Zepe ZC;
  
  private final Zepe ZN;
  
  private final Zepe ZA;
  
  private final Zepe Zb;
  
  private final Zepe Zm;
  
  private final Zepe ZF;
  
  private final Zepe ZI;
  
  private final Zepe Zd;
  
  private final Zepe Zi;
  
  private final Zrud ZO;
  
  private Zepe ZQ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zztm(Zxei paramZxei, Zzxi paramZzxi, Zt90 paramZt90, Zrzg paramZrzg, Zt8u paramZt8u, Zgb6 paramZgb6, Zkl6 paramZkl6, Zb_l paramZb_l, Zrud paramZrud, Zmgs... paramVarArgs) {
    super(a(2477, -11607));
    Zuh.Zb((paramZxei.ZG() != null), Zqf.Zx);
    this.ZW = paramZxei;
    this.Zk = paramZzxi;
    this.ZE = paramZt90;
    this.Zq = paramZrzg;
    this.Zw = paramZt8u;
    this.Zv = paramZgb6;
    this.Zj = paramZkl6;
    this.Zx = paramZb_l;
    this.ZO = paramZrud;
    this.ZG = paramVarArgs;
    setName(a(2476, 19304));
    Zgsw zgsw = new Zgsw(this);
    this.Zr = new Zepe(a(2486, -380));
    this.Zr.addActionListener(zgsw);
    add(this.Zr);
    this.ZU = new Zepe(a(2482, 5701));
    this.ZU.addActionListener(zgsw);
    add(this.ZU);
    this.ZC = new Zepe(a(2484, -12331));
    this.ZC.addActionListener(zgsw);
    add(this.ZC);
    add(new JSeparator());
    this.ZN = new Zepe(a(2494, -9317));
    this.ZN.addActionListener(zgsw);
    add(this.ZN);
    this.ZA = new Zepe(a(2493, -12139));
    this.ZA.addActionListener(zgsw);
    add(this.ZA);
    this.Zb = new Zepe(a(2485, 4608));
    this.Zb.addActionListener(zgsw);
    add(this.Zb);
    this.Zm = new Zepe(a(2492, 14719));
    this.Zm.addActionListener(zgsw);
    add(this.Zm);
    this.ZF = new Zepe(a(2487, -10522));
    this.ZF.addActionListener(zgsw);
    add(this.ZF);
    add(new JSeparator());
    this.ZI = new Zepe(a(2491, 26202));
    this.ZI.addActionListener(zgsw);
    add(this.ZI);
    this.Zd = new Zepe(a(2488, -22325));
    this.Zd.addActionListener(zgsw);
    add(this.Zd);
    this.ZQ = new Zepe(a(2490, 18916));
    this.ZQ.addActionListener(zgsw);
    add(this.ZQ);
    this.Zi = new Zepe(a(2495, 31215));
    this.Zi.addActionListener(zgsw);
    add(this.Zi);
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public static void Zi(Window paramWindow, Zg1j paramZg1j, Zz0n paramZz0n) {
    Zm2.ZC(Zrrh.SUITE_HELP_MENU_REPORT_BUG_CLICKED);
    String str = String.format(a(2481, -28680), new Object[] { a(2480, 26885), paramZg1j.ZY() });
    Zziq.ZS(paramWindow, a(2489, -2930), str, true, paramZz0n.Zj());
  }
  
  private static void ZL(Zxei paramZxei) {
    Zm2.ZC(Zrrh.SUITE_HELP_MENU_RELEASE_NOTES_CLICKED);
    Zke4.Zt(paramZxei.ZF(), a(2483, 2294), true);
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'mUiæG¢V#\\rUì·^?ÕU|{­××ßrÛ#ù\\bØÎ3ó@6ÄáwÒ'!N*604Y,ÿOÛÂ-wT&kyD\\báê·§FZm}¶*±ÖÅF|'~c3"ûKhæ1beÙ1HÅÛ;ÇâüGq×Á<*¤fÌRAFò:¤fÎHÇUH#öx´(Å¯¶7¥A|\\nV2&%ãÔ"$O0[³à?\\b0Àò~JªA1go&éóÀDá·ëFÓkx±>Ö¼Ps¨ä!n¾ÜÎëÖÆ*ÿän,¸Õ§¢MPQUv9âËö×7¢âÀìýKâÃë°é&Uè?wO\;QWük¬\\fVä%DíðXÞësÔ¢V7u\\r¹.¿vAàÄ½@ð³ö\\f¾æóü­'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #92
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'V2´´mJ¤µðzE¥ºN?'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #12
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #65
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zztm.a : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zztm.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #6
    //   214: goto -> 244
    //   217: bipush #77
    //   219: goto -> 244
    //   222: bipush #126
    //   224: goto -> 244
    //   227: bipush #17
    //   229: goto -> 244
    //   232: bipush #81
    //   234: goto -> 244
    //   237: bipush #81
    //   239: goto -> 244
    //   242: bipush #103
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x9BC) & 0xFFFF;
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
      byte b1 = 92;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zztm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */