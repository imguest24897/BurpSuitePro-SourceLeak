package burp;

import java.util.List;
import net.portswigger.Zkb;

public class Zm3f implements Zkrr {
  private final Ze3n ZT;
  
  private static int[] ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zm3f(Ze3n paramZe3n) {
    this.ZT = paramZe3n;
  }
  
  public Zbsl Zp() {
    return Zbsl.APR_AspNetTracingEnabled;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    if (Zd() || Zr())
      return; 
    ZH(this.ZT, paramZz4_, this.ZT.ZA(), this.ZT.ZL(), (this.ZT.Zp()).Zd);
  }
  
  private boolean Zd() {
    return !a(-16829, -24261).equalsIgnoreCase(this.ZT.ZA().ZF().Zd_());
  }
  
  private boolean Zr() {
    return ((this.ZT.Zp()).Zd == null);
  }
  
  public static void Zz(Ze3n paramZe3n, Zefx paramZefx, Zb6q paramZb6q, List<Ztu8> paramList, int paramInt, int[] paramArrayOfint, Zz4_ paramZz4_) {
    int[] arrayOfInt = ZW();
    for (Ztu8 ztu8 : paramList) {
      if (ZN(ztu8)) {
        Zvow zvow = paramZe3n.ZI().ZC(paramZefx).Zz(Zrlp.Zh(paramArrayOfint)).Zo(paramZb6q).Zf(Zrlp.Zj(ztu8.ZlK(), ztu8.Zli()));
        paramZz4_.Zz(Zxzr.Zi(paramZe3n.Za(), Zkb.ZG(paramZefx.ZF().Zd4()), zvow, paramInt));
      } 
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private static void ZH(Ze3n paramZe3n, Zz4_ paramZz4_, Zefx paramZefx, Zb6q paramZb6q, List<Ztu8> paramList) {
    Zz(paramZe3n, paramZefx, paramZb6q, paramList, 2, null, paramZz4_);
  }
  
  private static boolean ZN(Ztu8 paramZtu8) {
    return (paramZtu8.ZlD() == 0 && a(-16832, 24508).equals(paramZtu8.ZlP().ZJ3()) && a(-16831, 6736).equals(paramZtu8.ZlP().ZI2(a(-16830, 14660))));
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public static void ZO(int[] paramArrayOfint) {
    ZE = paramArrayOfint;
  }
  
  public static int[] ZW() {
    return ZE;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'W$¢¤kbv;'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: invokestatic ZO : ([I)V
    //   21: iconst_5
    //   22: istore_1
    //   23: iconst_m1
    //   24: istore_0
    //   25: bipush #112
    //   27: iinc #0, 1
    //   30: aload_2
    //   31: iload_0
    //   32: dup
    //   33: iload_1
    //   34: iadd
    //   35: invokevirtual substring : (II)Ljava/lang/String;
    //   38: iconst_m1
    //   39: goto -> 143
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
    //   70: ldc 'S\\nê\\f½\\fNuµÿlB'
    //   72: dup
    //   73: astore_2
    //   74: invokevirtual length : ()I
    //   77: istore #4
    //   79: iconst_4
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #31
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 143
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Zm3f.a : [Ljava/lang/String;
    //   133: iconst_4
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zm3f.b : [Ljava/lang/String;
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
    //   212: bipush #112
    //   214: goto -> 244
    //   217: bipush #17
    //   219: goto -> 244
    //   222: bipush #86
    //   224: goto -> 244
    //   227: bipush #78
    //   229: goto -> 244
    //   232: bipush #122
    //   234: goto -> 244
    //   237: bipush #37
    //   239: goto -> 244
    //   242: bipush #57
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
    //   283: tableswitch default -> 42, 0 -> 100
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBE42) & 0xFFFF;
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
      byte b1 = 18;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm3f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */