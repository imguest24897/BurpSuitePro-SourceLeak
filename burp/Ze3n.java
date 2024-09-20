package burp;

import java.awt.Component;
import java.time.Duration;
import java.util.List;

public class Ze3n implements Zl_e, Zmgv {
  private final Zlg4 Zt;
  
  private final Zbza ZU;
  
  private final Zmzk ZT;
  
  private final String ZM;
  
  private final Zlox Zs;
  
  private final Zz1m<Zt1o> ZE;
  
  private final List<Zxs7> Zy;
  
  private final Zm03 Zb;
  
  private static String ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ze3n(Zmzk paramZmzk, String paramString, Zbza paramZbza, Zlg4 paramZlg4, List<Zxs7> paramList, Zm03 paramZm03, Zlox paramZlox, Zz1m<Zt1o> paramZz1m) {
    this.ZT = paramZmzk;
    this.ZM = paramString;
    this.ZU = paramZbza;
    this.Zt = paramZlg4;
    this.Zy = paramList;
    this.Zb = paramZm03;
    this.Zs = paramZlox;
    this.ZE = paramZz1m;
  }
  
  public Zvow ZI() {
    return this.Zt.ZB(this.ZT);
  }
  
  public Zvow Zv(Zmzk paramZmzk) {
    return this.Zt.ZB(paramZmzk);
  }
  
  public Zvow Zt() {
    return this.Zt.ZS();
  }
  
  public Zmzk Zod() {
    return Za();
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return null;
  }
  
  @Deprecated(since = "These methods come from the MessageSource interface, but aren't representative for AuditItem")
  public Zstu Zos() {
    return Zyf.Zy(ZA().ZD());
  }
  
  @Deprecated(since = "These methods come from the MessageSource interface, but aren't representative for AuditItem")
  public Zstu ZoO() {
    return ZL().Za();
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public long ZoB() {
    return 0L;
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Zsou.ZD(this, paramZkl6.ZH());
  }
  
  public Zefx ZA() {
    return this.Zt.ZH();
  }
  
  public Zb6q ZL() {
    return this.Zt.ZD();
  }
  
  public List<Zb6q> Zi() {
    return this.Zt.Zp();
  }
  
  public Zs68 Zp() {
    return this.Zt.ZJ();
  }
  
  public String ZN() {
    return this.ZM;
  }
  
  public Zmzk Za() {
    return this.ZT;
  }
  
  public Zgm Zs() {
    return new Zsq0(ZM());
  }
  
  public Zg44 ZS() {
    return new Zg44(this.Zy);
  }
  
  public List<Zxs7> Zo() {
    return this.Zy;
  }
  
  public void Zk(Zxs7 paramZxs7, Zecx paramZecx) {
    Zga zga = this.ZU.ZgT().Zd(paramZxs7.Zl());
    if (zga != null)
      zga.Zd(paramZecx, this.ZE); 
  }
  
  public int Za(Zs66 paramZs66) {
    return this.Zb.ZE(paramZs66) + this.Zb.Zq(paramZs66);
  }
  
  public Zlox Zh() {
    return this.Zs;
  }
  
  public Zbza ZM() {
    return this.ZU;
  }
  
  public Long[] Zc() {
    return (Long[])this.Zt.Zx().stream().map(Duration::toMillis).toArray(Ze3n::lambda$getResponseCompletedTimers$0);
  }
  
  public Zlyj Zr(Zlv5 paramZlv5) {
    return this.Zt.ZF(this.ZU, paramZlv5);
  }
  
  boolean Zu() {
    return this.Zt instanceof Zlub;
  }
  
  public Zsxd Zr() {
    return Zr((new Zlv5()).ZD(true)).ZBB();
  }
  
  public boolean ZR() {
    return this.Zt.ZI();
  }
  
  public boolean ZU() {
    return this.Zt.ZK();
  }
  
  public void ZC() {
    this.Zt.ZN();
  }
  
  public boolean Zz() {
    return (this.ZU.Zg3() != null && this.ZU.Zg3().Zl1().Zjx());
  }
  
  public void Z_() {
    this.Zt.Zs();
  }
  
  public String Zm() {
    return Ztt2.Zh(this.ZT) + Ztt2.Zh(this.ZT);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(a(-4842, -27928));
    stringBuilder.append(a(-4841, -19559)).append(this.ZM).append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  private static Long[] lambda$getResponseCompletedTimers$0(int paramInt) {
    return new Long[paramInt];
  }
  
  public static void ZU(String paramString) {
    ZJ = paramString;
  }
  
  public static String Zy() {
    return ZJ;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: ldc 'VnegBc'
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic ZU : (Ljava/lang/String;)V
    //   13: ldc 'MßÆ,61\\bphÿ'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #10
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #20
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 87
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: aload #5
    //   74: putstatic burp/Ze3n.a : [Ljava/lang/String;
    //   77: iconst_2
    //   78: anewarray java/lang/String
    //   81: putstatic burp/Ze3n.b : [Ljava/lang/String;
    //   84: goto -> 230
    //   87: dup_x2
    //   88: pop
    //   89: invokevirtual toCharArray : ()[C
    //   92: dup_x1
    //   93: arraylength
    //   94: dup_x2
    //   95: pop
    //   96: iconst_0
    //   97: istore #6
    //   99: dup2_x1
    //   100: pop2
    //   101: dup_x2
    //   102: iconst_1
    //   103: if_icmpgt -> 203
    //   106: dup2
    //   107: swap
    //   108: iload #6
    //   110: dup2_x1
    //   111: caload
    //   112: swap
    //   113: iload #6
    //   115: bipush #7
    //   117: irem
    //   118: tableswitch default -> 185, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #101
    //   158: goto -> 187
    //   161: bipush #84
    //   163: goto -> 187
    //   166: bipush #65
    //   168: goto -> 187
    //   171: bipush #96
    //   173: goto -> 187
    //   176: bipush #31
    //   178: goto -> 187
    //   181: iconst_4
    //   182: goto -> 187
    //   185: bipush #15
    //   187: ixor
    //   188: ixor
    //   189: i2c
    //   190: castore
    //   191: iinc #6, 1
    //   194: dup
    //   195: ifne -> 203
    //   198: dup2
    //   199: dup_x1
    //   200: goto -> 110
    //   203: dup2_x1
    //   204: pop2
    //   205: dup_x2
    //   206: iload #6
    //   208: if_icmpgt -> 106
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
    //   227: goto -> 44
    //   230: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFED16) & 0xFFFF;
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
      char c = 'ô';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze3n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */