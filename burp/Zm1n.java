package burp;

import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zm1n implements Zgd8<Zt9r> {
  private final Zt9r Zn;
  
  private final Zr_4 Z_;
  
  private final Zr_4 ZU;
  
  private final Zz9f ZL;
  
  private final List<String> ZY;
  
  private final List<Zb81> Zs;
  
  private final Zm6z Zq;
  
  private final Zt4u Zk;
  
  private final Zslu Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zm1n(int paramInt, Zt4u paramZt4u, Zslu paramZslu, Zkl6 paramZkl6, Zr_4 paramZr_41, Zr_4 paramZr_42) {
    this(paramZr_42.<Zt9r>ZH((new Zgro(paramZr_42.<Zeek>ZH(new Zr1(3)))).ZX(paramInt)), paramZt4u, paramZslu, paramZkl6, paramZr_41, paramZr_42);
  }
  
  public Zm1n(Zt9r paramZt9r, Zt4u paramZt4u, Zslu paramZslu, Zkl6 paramZkl6, Zr_4 paramZr_41, Zr_4 paramZr_42) {
    this.Zn = paramZt9r;
    this.Zk = paramZt4u;
    this.Zg = paramZslu;
    this.Z_ = paramZr_41;
    this.ZU = paramZr_42;
    this.Zq = new Zm6z(paramZr_42, paramZkl6.ZB());
    this.ZL = new Zz9f(null, 3, paramZt9r.ZWH(), paramZr_41, paramZr_42, paramZslu, paramZkl6.Zq());
    Zl(Zbe_.Zd(this));
    this.ZY = new Zr5j(paramZt9r.ZW1(), paramZr_42);
    this.Zs = new Zbp8(this, paramZt9r.ZWZ());
  }
  
  public void ZH() {
    ZA(!ZU());
  }
  
  boolean Zv(Zlil paramZlil) {
    Zbqc[] arrayOfZbqc = Zxzh.Zs();
    byte b = 0;
    while (b < ZA().size()) {
      if (((Zb81)ZA().get(b)).Zr(paramZlil))
        return true; 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return false;
  }
  
  public Zm1n ZB(Zkl6 paramZkl6, Zxzh paramZxzh) {
    try {
      Zm1n zm1n = ZB(Zc().Zf(), this.Zk, this.Zg, paramZkl6, paramZxzh, this.Z_, this.ZU);
      try {
        if (!zm1n.Zq().endsWith(a(1724, -15000)))
          zm1n.Za(zm1n.Zq() + zm1n.Zq()); 
      } catch (Exception exception) {
        throw a(null);
      } 
      return zm1n;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public Zlwx Zc() {
    Zzqp zzqp = new Zzqp();
    zzqp.Zj(a(1719, 13495), ZU());
    zzqp.Zm(a(1726, 2210), Zq());
    Zbqc[] arrayOfZbqc = Zxzh.Zs();
    Zzqw zzqw1 = zzqp.Zm(a(1725, 19668));
    for (Zb81 zb81 : this.Zs) {
      zzqw1.Zx(zb81.ZC());
      if (arrayOfZbqc == null)
        break; 
    } 
    Zzqw zzqw2 = zzqp.Zm(a(1716, 29501));
    for (Zeew zeew : Zeew.ZK()) {
      if (ZR(zeew))
        zzqw2.Zx(new Zzqs(zeew.toolName)); 
      if (arrayOfZbqc == null)
        break; 
    } 
    this.ZL.Zi(zzqp);
    zzqp.Zj(a(1715, -12143), Zx());
    Zzqw zzqw3 = zzqp.Zm(a(1722, -31329));
    for (String str : this.ZY) {
      zzqw3.Zx(new Zzqs(str));
      if (arrayOfZbqc == null)
        break; 
    } 
    return zzqp;
  }
  
  static Zm1n ZB(Zvt paramZvt, Zt4u paramZt4u, Zslu paramZslu, Zkl6 paramZkl6, Zxzh paramZxzh, Zr_4 paramZr_41, Zr_4 paramZr_42) throws Zzam {
    Zeek zeek = Zz9f.ZT(paramZvt, paramZr_42);
    Zt9r zt9r = paramZr_42.<Zt9r>ZH(new Zgro(zeek));
    Zbqc[] arrayOfZbqc = Zxzh.Zs();
    zt9r.Zto(paramZvt.Zc(a(1713, 15584), false));
    zt9r.Ziq(paramZvt.ZC(a(1712, -15429)));
    List<?> list = paramZvt.Zg(a(1727, -2386), new Zlth(paramZxzh, paramZr_42, paramZkl6.ZB()));
    if (list != null)
      for (Zx_z zx_z : list) {
        zt9r.ZWZ().add(zx_z);
        if (arrayOfZbqc == null)
          break; 
      }  
    List<String> list1 = paramZvt.ZG(a(1723, 11196));
    if (list1 != null)
      for (Zeew zeew : Zeew.ZK()) {
        zt9r.Zw(zeew, list1.contains(zeew.toolName));
        if (arrayOfZbqc == null)
          break; 
      }  
    zt9r.Zt1(paramZvt.Zc(a(1718, -833), false));
    List<String> list2 = paramZvt.ZG(a(1714, 12447));
    if (list2 != null)
      for (String str : list2) {
        zt9r.ZW1().add(paramZr_42.Zz(str));
        if (arrayOfZbqc == null)
          break; 
      }  
    return new Zm1n(zt9r, paramZt4u, paramZslu, paramZkl6, paramZr_41, paramZr_42);
  }
  
  public boolean ZU() {
    return this.Zn.ZWX();
  }
  
  public void ZA(boolean paramBoolean) {
    this.Zn.Zto(paramBoolean);
  }
  
  public String Zq() {
    return this.Zn.ZW9();
  }
  
  public void Za(String paramString) {
    this.Zn.Ziq(paramString);
  }
  
  Zz9f Zk() {
    return this.ZL;
  }
  
  public boolean ZR(Zeew paramZeew) {
    return this.Zn.Zx(paramZeew);
  }
  
  public void ZS(Zeew paramZeew, boolean paramBoolean) {
    this.Zn.Zw(paramZeew, paramBoolean);
  }
  
  String Zt() {
    return this.Zn.ZWr();
  }
  
  void Zl(String paramString) {
    this.Zn.ZiX(paramString);
  }
  
  boolean Zx() {
    return this.Zn.ZWu();
  }
  
  void Zx(boolean paramBoolean) {
    this.Zn.Zt1(paramBoolean);
  }
  
  public List<String> ZY() {
    return this.ZY;
  }
  
  public List<Zb81> ZA() {
    return this.Zs;
  }
  
  public Zt9r ZQ() {
    return this.Zn;
  }
  
  public static boolean Zu(Zm1n paramZm1n) {
    return paramZm1n.ZA().stream().allMatch(Zm1n::lambda$isRuleSupportedInPathAwareScans$0);
  }
  
  private static boolean lambda$isRuleSupportedInPathAwareScans$0(Zb81 paramZb81) {
    return paramZb81.Zm().Z_();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '©á¶lT}Ö=ò¬|.biju\\t¿53YuRö,{wtä8"ö3ñp1Y$qmÒ«t1BzÚ\\nÉw¶P;¦AlÔ¥ÇÍÐt<R"\\fÓ~7¿eª;ú×:lóQô¥êðEU:\\r¬^ÓºÀÐpñõkÓu1<Á´§]ÑHx:ôX¡>'y'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #71
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
    //   68: ldc 'ùÓ<\\nì{qf\\f°JTÜ©bXì´Q'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #11
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #36
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
    //   129: putstatic burp/Zm1n.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zm1n.b : [Ljava/lang/String;
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
    //   212: bipush #106
    //   214: goto -> 244
    //   217: bipush #121
    //   219: goto -> 244
    //   222: bipush #97
    //   224: goto -> 244
    //   227: bipush #97
    //   229: goto -> 244
    //   232: bipush #126
    //   234: goto -> 244
    //   237: bipush #66
    //   239: goto -> 244
    //   242: bipush #106
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
    int i = (paramInt1 ^ 0x6B7) & 0xFFFF;
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
      char c = 'Ç';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm1n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */