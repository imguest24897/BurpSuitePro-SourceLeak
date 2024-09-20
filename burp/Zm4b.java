package burp;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.browser.Zc7;
import net.portswigger.browser.Zdn;
import net.portswigger.browser.Ze7;
import net.portswigger.browser.Zje;
import net.portswigger.browser.Zjq;
import net.portswigger.browser.Zjw;
import net.portswigger.browser.Zt;
import net.portswigger.browser.Ztk;

public class Zm4b implements Zlvj {
  private final Zz3o ZT;
  
  private final Zski Zh;
  
  private final Zsxd Zs;
  
  private final Zjq Zj;
  
  private static int[] ZU;
  
  private static final String[] c;
  
  private static final String[] d;
  
  private Zm4b(Zz3o paramZz3o, Zski paramZski, Zsxd paramZsxd, Zjq paramZjq) {
    this.ZT = paramZz3o;
    this.Zh = paramZski;
    this.Zs = paramZsxd;
    this.Zj = paramZjq;
  }
  
  public Zm4b Zv() {
    return new Zm4b(Zz3o.ANCHOR, this.Zh, new Zrbo(this.Zs.ZG()), this.Zj);
  }
  
  public int ZI() {
    return this.Zs.ZX().size();
  }
  
  static Zm4b ZY(Zzl1 paramZzl1) {
    return new Zm4b(paramZzl1.Z_i(), paramZzl1.Z_E(), paramZzl1.Z_O().Zj(), paramZzl1.Z_3().ZJ().ZA());
  }
  
  public Zjq Zi() {
    return this.Zj;
  }
  
  public Zz3o ZM() {
    return this.ZT;
  }
  
  public Zm6i Zw() {
    Zuh.Zb(false, Zqf.ZC);
    return (new Zlx3()).ZZ(ZM()).ZW(Zx()).ZN();
  }
  
  public String ZO() {
    return String.format(b(-2334, -22080), new Object[] { Zlvj.ZU(this) });
  }
  
  public boolean Zp(Zg8y paramZg8y) {
    return false;
  }
  
  private Optional<Zefx> ZC() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (ZI() == 0) ? Optional.<Zefx>empty() : Optional.<Zefx>ofNullable(this.Zs.Zz().ZR());
  }
  
  public List<? extends Ze7n> Zh() {
    return Collections.emptyList();
  }
  
  public Zski Zx() {
    return this.Zh;
  }
  
  public String ZY() {
    return ZC().<String>map(Zefx::Zr).orElse(b(-2333, -2698));
  }
  
  public String Zf() {
    return ((Zsba)ZC().<Zsba>map(Zefx::Zv).orElse(Zsba.NONE)).ZE();
  }
  
  public List<String> Z_() {
    return Zg().stream().map(Ztnz::ZK).toList();
  }
  
  private List<Ztnz> Zg() {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: invokevirtual ZC : ()Ljava/util/Optional;
    //   12: aload_0
    //   13: aload_1
    //   14: <illegal opcode> accept : (Lburp/Zm4b;Ljava/util/List;)Ljava/util/function/Consumer;
    //   19: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   22: aload_1
    //   23: areturn
  }
  
  private Zstu Zl() {
    return ZC().map(Zefx::Zw).map(Zyf::Zy).orElse(Zyf.Za(""));
  }
  
  public Zefx Zi(Zkl6 paramZkl6, List<Ztnz> paramList, Zkg3 paramZkg3, Zlit paramZlit) {
    return ZC().<Throwable>orElseThrow(NoSuchElementException::new);
  }
  
  public Ze7 ZA(Zkg3 paramZkg3, Zzmb paramZzmb) {
    Zski zski = Zx();
    Zstu zstu = Zl();
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Zdn zdn = new Zdn(ZY(), zski.ZyR().Zdw(), zski.Zyb(), (List)Zg().stream().map(Zm4b::lambda$navigate$1).collect(Collectors.toList()), (zstu == null) ? null : zstu.Zis());
    return Ze7.Zc(zdn::lambda$navigate$2).ZY((Zt)Zje.ZR(paramZzmb.Zi()));
  }
  
  public String toString() {
    return ZO();
  }
  
  private static void lambda$navigate$2(Zdn paramZdn, Zjw paramZjw) throws Ztk, InterruptedException {
    paramZjw.ZS().ZJ(paramZdn);
  }
  
  private static Zc7 lambda$navigate$1(Ztnz paramZtnz) {
    return new Zc7(Zkb.ZG(paramZtnz.Ze), Zkb.ZG(paramZtnz.ZM));
  }
  
  private void lambda$httpHeaders$0(List paramList, Zefx paramZefx) {
    paramZefx.Zi(new Zs4y(this, paramZefx, paramList));
  }
  
  public static void Zh(int[] paramArrayOfint) {
    ZU = paramArrayOfint;
  }
  
  public static int[] ZB() {
    return ZU;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'H\\rSüòP.F¿|ÐÕ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: invokestatic Zh : ([I)V
    //   21: iconst_3
    //   22: istore_1
    //   23: iconst_m1
    //   24: istore_0
    //   25: bipush #14
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
    //   72: putstatic burp/Zm4b.c : [Ljava/lang/String;
    //   75: iconst_2
    //   76: anewarray java/lang/String
    //   79: putstatic burp/Zm4b.d : [Ljava/lang/String;
    //   82: goto -> 231
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
    //   101: if_icmpgt -> 204
    //   104: dup2
    //   105: swap
    //   106: iload #6
    //   108: dup2_x1
    //   109: caload
    //   110: swap
    //   111: iload #6
    //   113: bipush #7
    //   115: irem
    //   116: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #71
    //   158: goto -> 188
    //   161: bipush #26
    //   163: goto -> 188
    //   166: bipush #79
    //   168: goto -> 188
    //   171: bipush #45
    //   173: goto -> 188
    //   176: bipush #65
    //   178: goto -> 188
    //   181: bipush #54
    //   183: goto -> 188
    //   186: bipush #38
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 108
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 104
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 42
    //   231: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF6E3) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      byte b1 = 25;
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm4b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */