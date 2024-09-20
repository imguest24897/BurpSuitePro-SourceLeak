package burp;

import java.util.List;
import java.util.stream.Collectors;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zslr extends Zsld {
  private final Zxf2 Za;
  
  private final Zlas ZZ;
  
  private final Zr69 Zw;
  
  private final Zzs_ Zi;
  
  private final Ze73 Zo;
  
  private final Zg0y Zp;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zslr(Zxf2 paramZxf2, Zlas paramZlas, Zl7h paramZl7h, Zr69 paramZr69, Zzs_ paramZzs_, Ze73 paramZe73) {
    super(b(-29631, -31284));
    this.Za = paramZxf2;
    String[] arrayOfString = Zv87.Zg();
    this.ZZ = paramZlas;
    this.Zw = paramZr69;
    this.Zi = paramZzs_;
    this.Zo = paramZe73;
    this.Zp = Zg0y.ZF(paramZl7h, paramZr69, Zrp6.DEBUG);
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  protected Zk2f<Zg0z, Zvb> ZB(Zvb paramZvb) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof burp/Zx6j
    //   4: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   7: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   10: aload_1
    //   11: instanceof burp/Zx6j
    //   14: ifeq -> 284
    //   17: aload_1
    //   18: checkcast burp/Zx6j
    //   21: astore_2
    //   22: new burp/Zv8v
    //   25: dup
    //   26: aload_0
    //   27: getfield Za : Lburp/Zxf2;
    //   30: aload_0
    //   31: getfield Zi : Lburp/Zzs_;
    //   34: invokespecial <init> : (Lburp/Zxf2;Lburp/Zzs_;)V
    //   37: astore_3
    //   38: aload_0
    //   39: aload_2
    //   40: <illegal opcode> get : (Lburp/Zslr;Lburp/Zx6j;)Ljava/util/function/Supplier;
    //   45: sipush #-29632
    //   48: sipush #-30445
    //   51: invokestatic b : (II)Ljava/lang/String;
    //   54: aload_0
    //   55: getfield ZZ : Lburp/Zlas;
    //   58: aload_0
    //   59: getfield Zo : Lburp/Ze73;
    //   62: new burp/Zx6l
    //   65: dup
    //   66: aload_2
    //   67: invokevirtual Zl : ()Lburp/Zb0_;
    //   70: aload_2
    //   71: invokevirtual Zg : ()Lburp/Zzcs;
    //   74: invokespecial <init> : (Lburp/Zb0_;Lburp/Zzcs;)V
    //   77: new burp/Zx6w
    //   80: dup
    //   81: aload_2
    //   82: invokevirtual Zl : ()Lburp/Zb0_;
    //   85: aload_2
    //   86: invokevirtual Zg : ()Lburp/Zzcs;
    //   89: invokespecial <init> : (Lburp/Zb0_;Lburp/Zzcs;)V
    //   92: aload_0
    //   93: getfield Zw : Lburp/Zr69;
    //   96: invokeinterface ZD : ()Lburp/Zmv7;
    //   101: invokestatic ZY : (Ljava/util/function/Supplier;Ljava/lang/String;Lburp/Zlas;Lburp/Ze73;Lburp/Zvb;Lburp/Zvb;Lburp/Zmv7;)Lburp/Zslg;
    //   104: astore #4
    //   106: new burp/Zzsk
    //   109: dup
    //   110: aload_0
    //   111: getfield ZZ : Lburp/Zlas;
    //   114: aload_0
    //   115: getfield Zw : Lburp/Zr69;
    //   118: invokeinterface ZP : ()Lnet/portswigger/Zsy;
    //   123: invokespecial <init> : (Lburp/Zlas;Lnet/portswigger/Zsy;)V
    //   126: astore #5
    //   128: new burp/Zv8h
    //   131: dup
    //   132: aload_0
    //   133: getfield Za : Lburp/Zxf2;
    //   136: aload_0
    //   137: getfield Zi : Lburp/Zzs_;
    //   140: aload_2
    //   141: invokespecial <init> : (Lburp/Zxf2;Lburp/Zzs_;Lburp/Zx6j;)V
    //   144: astore #6
    //   146: new burp/Zv87
    //   149: dup
    //   150: aload_0
    //   151: getfield Za : Lburp/Zxf2;
    //   154: invokespecial <init> : (Lburp/Zxf2;)V
    //   157: astore #7
    //   159: new burp/Zg8h
    //   162: dup
    //   163: invokespecial <init> : ()V
    //   166: astore #8
    //   168: invokestatic ZM : ()Lburp/Zk2f;
    //   171: aload_0
    //   172: invokevirtual getClass : ()Ljava/lang/Class;
    //   175: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   178: invokevirtual ZQ : (Ljava/lang/String;)Lburp/Zk2f;
    //   181: bipush #6
    //   183: anewarray burp/Zg0z
    //   186: dup
    //   187: iconst_0
    //   188: aload_3
    //   189: aastore
    //   190: dup
    //   191: iconst_1
    //   192: aload #4
    //   194: aastore
    //   195: dup
    //   196: iconst_2
    //   197: aload #5
    //   199: aastore
    //   200: dup
    //   201: iconst_3
    //   202: aload #8
    //   204: aastore
    //   205: dup
    //   206: iconst_4
    //   207: aload #6
    //   209: aastore
    //   210: dup
    //   211: iconst_5
    //   212: aload #7
    //   214: aastore
    //   215: invokevirtual ZB : ([Lburp/Zg0z;)Lburp/Zk2f;
    //   218: aload_3
    //   219: invokevirtual Zz : (Lburp/Zg0z;)Lburp/Zk2f;
    //   222: aload_3
    //   223: ldc burp/Zx6n
    //   225: aload #4
    //   227: invokevirtual Zs : (Lburp/Zg0z;Ljava/lang/Class;Lburp/Zg0z;)Lburp/Zk2f;
    //   230: aload #4
    //   232: ldc burp/Zx6w
    //   234: aload #5
    //   236: invokevirtual Zs : (Lburp/Zg0z;Ljava/lang/Class;Lburp/Zg0z;)Lburp/Zk2f;
    //   239: aload #4
    //   241: ldc burp/Zx6l
    //   243: aload #7
    //   245: invokevirtual Zs : (Lburp/Zg0z;Ljava/lang/Class;Lburp/Zg0z;)Lburp/Zk2f;
    //   248: aload #5
    //   250: ldc burp/Zx6_
    //   252: aload #6
    //   254: invokevirtual Zs : (Lburp/Zg0z;Ljava/lang/Class;Lburp/Zg0z;)Lburp/Zk2f;
    //   257: aload #6
    //   259: ldc burp/Ze79
    //   261: aload #8
    //   263: invokevirtual Zs : (Lburp/Zg0z;Ljava/lang/Class;Lburp/Zg0z;)Lburp/Zk2f;
    //   266: aload #7
    //   268: ldc burp/Ze79
    //   270: aload #8
    //   272: invokevirtual Zs : (Lburp/Zg0z;Ljava/lang/Class;Lburp/Zg0z;)Lburp/Zk2f;
    //   275: aload_3
    //   276: ldc burp/Ze79
    //   278: aload #8
    //   280: invokevirtual Zs : (Lburp/Zg0z;Ljava/lang/Class;Lburp/Zg0z;)Lburp/Zk2f;
    //   283: areturn
    //   284: aconst_null
    //   285: areturn
  }
  
  protected Zvb Zn(Zg0z paramZg0z) {
    Zuh.Zb(paramZg0z instanceof Zg8h, Zqf.Zr);
    if (paramZg0z instanceof Zg8h) {
      Zg8h zg8h = (Zg8h)paramZg0z;
      return zg8h.ZK();
    } 
    return null;
  }
  
  private Ztc6 ZJ(Ztc6 paramZtc6) {
    Zrp0 zrp0 = paramZtc6.ZQ(paramZtc6.Zr() - 1).ZXL();
    Zlru zlru = paramZtc6.ZQ(paramZtc6.Zr() - 1).ZXa();
    Zszw zszw = paramZtc6.ZQ(paramZtc6.Zr() - 1).ZXq();
    return this.Zp.ZE(Ztiq.Zk().ZD(zrp0, zlru, zszw)).<Ztc6>map(Zslr::lambda$buildPathToExitForNotFoundDetection$1).orElseGet(paramZtc6::lambda$buildPathToExitForNotFoundDetection$2);
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
  
  private static Ztc6 lambda$buildPathToExitForNotFoundDetection$2(Ztc6 paramZtc6) {
    Zuh.ZT(false, Zqf.Zk, String.format(b(-29629, -29497), new Object[] { paramZtc6 }));
    return null;
  }
  
  private static Ztc6 lambda$buildPathToExitForNotFoundDetection$1(Ztc6 paramZtc6) {
    List<Zxs9> list = (List)paramZtc6.Zu().limit((paramZtc6.Zr() - 1)).collect(Collectors.toList());
    return Ztc6.ZD(paramZtc6.Zy(), list);
  }
  
  private Ztc6 lambda$constructSubMachine$0(Zx6j paramZx6j) {
    return ZJ(paramZx6j.Zz());
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'xOà¸çépñ 5t\\nè'¿{©*NezÌÚ&J¶¨±/R°+JYùb.A&3)^Ð\\n:Dï¤­ØÝ/Ù²²ìþ«ú Nè ò¹nÄV?^\\b"Ý ÁÖ»¸Hf q'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #28
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #112
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zslr.c : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zslr.d : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #61
    //   154: goto -> 184
    //   157: bipush #118
    //   159: goto -> 184
    //   162: bipush #59
    //   164: goto -> 184
    //   167: bipush #96
    //   169: goto -> 184
    //   172: bipush #100
    //   174: goto -> 184
    //   177: bipush #94
    //   179: goto -> 184
    //   182: bipush #23
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8C41) & 0xFFFF;
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
      char c = '';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zslr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */