package burp;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

class Zmzs implements Zxoq, Zsoa {
  private final Map<Integer, Zli3> Zj;
  
  private final Map<Integer, Long> Zz;
  
  private final Supplier<Ztjd> ZJ;
  
  private final List<Zlv7> Zw;
  
  private final long Zi;
  
  private final Zlan ZL;
  
  private final Ztf5 Zl;
  
  private final Ze_w Zc;
  
  private final Zbip Zv;
  
  private final Zx86 Zx;
  
  private final Zryu ZB;
  
  private final Zst8 Zp;
  
  private final Zs5t Ze;
  
  private final AtomicInteger ZZ;
  
  private final Ze8l ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zmzs(Supplier<Ztjd> paramSupplier, List<Zlv7> paramList, long paramLong, Zlan paramZlan, Ztf5 paramZtf5, Zbip paramZbip, Zx86 paramZx86, Zryu paramZryu, Zst8 paramZst8, Zs5t paramZs5t, Ze_w paramZe_w, Ze8l paramZe8l) {
    this.ZJ = paramSupplier;
    this.Zw = paramList;
    this.Zi = paramLong;
    this.ZL = paramZlan;
    this.Zl = paramZtf5;
    this.Zv = paramZbip;
    this.Zx = paramZx86;
    this.ZB = paramZryu;
    this.Zp = paramZst8;
    this.Ze = paramZs5t;
    this.Zc = paramZe_w;
    this.ZM = paramZe8l;
    this.Zj = new ConcurrentHashMap<>();
    this.Zz = new ConcurrentHashMap<>();
    this.ZZ = new AtomicInteger();
  }
  
  public Zli3 ZC(int paramInt) throws Zzt7 {
    // Byte code:
    //   0: iload_1
    //   1: iconst_2
    //   2: irem
    //   3: ifne -> 21
    //   6: new burp/Zzt7
    //   9: dup
    //   10: getstatic burp/Zlxi.PROTOCOL_ERROR : Lburp/Zlxi;
    //   13: invokespecial <init> : (Lburp/Zlxi;)V
    //   16: athrow
    //   17: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   20: athrow
    //   21: aload_0
    //   22: getfield Zj : Ljava/util/Map;
    //   25: iload_1
    //   26: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   29: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   34: checkcast burp/Zli3
    //   37: astore_2
    //   38: aload_2
    //   39: ifnonnull -> 174
    //   42: aload_0
    //   43: getfield ZZ : Ljava/util/concurrent/atomic/AtomicInteger;
    //   46: invokevirtual get : ()I
    //   49: iload_1
    //   50: if_icmplt -> 75
    //   53: goto -> 60
    //   56: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   59: athrow
    //   60: new burp/Zzt7
    //   63: dup
    //   64: getstatic burp/Zlxi.PROTOCOL_ERROR : Lburp/Zlxi;
    //   67: invokespecial <init> : (Lburp/Zlxi;)V
    //   70: athrow
    //   71: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   74: athrow
    //   75: aload_0
    //   76: getfield Ze : Lburp/Zs5t;
    //   79: iload_1
    //   80: invokevirtual ZQ : (I)Lburp/Zst8;
    //   83: astore_3
    //   84: new burp/Zli3
    //   87: dup
    //   88: aload_0
    //   89: getfield Zi : J
    //   92: iload_1
    //   93: aload_3
    //   94: aload_0
    //   95: getfield ZJ : Ljava/util/function/Supplier;
    //   98: invokeinterface get : ()Ljava/lang/Object;
    //   103: checkcast burp/Ztjd
    //   106: aload_0
    //   107: getfield ZL : Lburp/Zlan;
    //   110: aload_0
    //   111: getfield Zc : Lburp/Ze_w;
    //   114: aload_0
    //   115: getfield Zx : Lburp/Zx86;
    //   118: aload_0
    //   119: getfield Zl : Lburp/Ztf5;
    //   122: aload_0
    //   123: getfield Zv : Lburp/Zbip;
    //   126: aload_0
    //   127: iload_1
    //   128: aload_3
    //   129: <illegal opcode> Zb : (Lburp/Zmzs;ILburp/Zst8;)Lburp/Ze19;
    //   134: aload_0
    //   135: getfield ZB : Lburp/Zryu;
    //   138: aload_0
    //   139: getfield ZM : Lburp/Ze8l;
    //   142: invokespecial <init> : (JILburp/Zst8;Lburp/Ztjd;Lburp/Zlan;Lburp/Ze_w;Lburp/Zx86;Lburp/Ztf5;Lburp/Zbip;Lburp/Ze19;Lburp/Zryu;Lburp/Ze8l;)V
    //   145: astore_2
    //   146: aload_0
    //   147: getfield Zj : Ljava/util/Map;
    //   150: iload_1
    //   151: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   154: aload_2
    //   155: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   160: pop
    //   161: aload_0
    //   162: getfield ZZ : Ljava/util/concurrent/atomic/AtomicInteger;
    //   165: iload_1
    //   166: invokevirtual set : (I)V
    //   169: aload_0
    //   170: iload_1
    //   171: invokevirtual Z_ : (I)V
    //   174: aload_2
    //   175: areturn
    // Exception table:
    //   from	to	target	type
    //   0	17	17	burp/Zzt7
    //   38	53	56	burp/Zzt7
    //   42	71	71	burp/Zzt7
  }
  
  public void Zn(int paramInt, Zlxi paramZlxi) {
    Zli3 zli3 = Ze(paramInt);
    if (zli3 != null)
      zli3.Z_(paramZlxi); 
  }
  
  public void ZY() {
    this.Zj.clear();
    this.Zz.clear();
    this.Zw.clear();
  }
  
  Zli3 Ze(int paramInt) {
    return this.Zj.get(Integer.valueOf(paramInt));
  }
  
  void Zy() {
    Objects.requireNonNull(this.Zj);
    this.Zz.entrySet().stream().filter(this::lambda$removeExpiredStreams$2).peek(this::lambda$removeExpiredStreams$3).map(Map.Entry::getKey).toList().forEach(this.Zj::remove);
  }
  
  public boolean ZR() {
    return !this.Zj.isEmpty();
  }
  
  private void Z_(int paramInt) {
    this.Zj.entrySet().stream().filter(Zmzs::lambda$closePreviousIdleStreams$4).filter(paramInt::lambda$closePreviousIdleStreams$5).forEach(this::lambda$closePreviousIdleStreams$6);
  }
  
  private void lambda$closePreviousIdleStreams$6(Map.Entry paramEntry) {
    ((Zli3)paramEntry.getValue()).Zw();
    this.Zj.remove(paramEntry.getKey());
  }
  
  private static boolean lambda$closePreviousIdleStreams$5(int paramInt, Map.Entry paramEntry) {
    return (((Integer)paramEntry.getKey()).intValue() < paramInt);
  }
  
  private static boolean lambda$closePreviousIdleStreams$4(Map.Entry paramEntry) {
    return ((Zli3)paramEntry.getValue()).ZN();
  }
  
  private void lambda$removeExpiredStreams$3(Map.Entry paramEntry) {
    this.Zp.Zb(a(-1190, -9774), new Object[] { paramEntry.getKey() });
  }
  
  private boolean lambda$removeExpiredStreams$2(Map.Entry paramEntry) {
    return (((Long)paramEntry.getValue()).longValue() + 23000L < this.Zl.Zo());
  }
  
  private void lambda$retrieveOrCreate$1(int paramInt, Zst8 paramZst8, Zrsv paramZrsv) {
    // Byte code:
    //   0: aload_3
    //   1: getstatic burp/Zrsv.HALF_CLOSED_REMOTE : Lburp/Zrsv;
    //   4: if_acmpne -> 23
    //   7: aload_0
    //   8: getfield Zw : Ljava/util/List;
    //   11: aload_0
    //   12: iload_1
    //   13: <illegal opcode> accept : (Lburp/Zmzs;I)Ljava/util/function/Consumer;
    //   18: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   23: aload_3
    //   24: getstatic burp/Zrsv.CLOSED : Lburp/Zrsv;
    //   27: if_acmpne -> 75
    //   30: aload_2
    //   31: sipush #-1189
    //   34: sipush #-5489
    //   37: invokestatic a : (II)Ljava/lang/String;
    //   40: iconst_0
    //   41: anewarray java/lang/Object
    //   44: invokeinterface Zb : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   49: aload_0
    //   50: getfield Zz : Ljava/util/Map;
    //   53: iload_1
    //   54: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   57: aload_0
    //   58: getfield Zl : Lburp/Ztf5;
    //   61: invokeinterface Zo : ()J
    //   66: invokestatic valueOf : (J)Ljava/lang/Long;
    //   69: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   74: pop
    //   75: return
  }
  
  private void lambda$retrieveOrCreate$0(int paramInt, Zlv7 paramZlv7) {
    paramZlv7.ZG(this.Zj.get(Integer.valueOf(paramInt)));
  }
  
  private static Zzt7 a(Zzt7 paramZzt7) {
    return paramZzt7;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc ' l¬5°ö Â~÷^¥Ñm\\nÙóiÅ"Ø]4Î¶qvÃp÷\\rJóÐÝDV¯\\br'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #27
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #83
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
    //   69: putstatic burp/Zmzs.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zmzs.b : [Ljava/lang/String;
    //   79: goto -> 226
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
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 176
    //   152: bipush #11
    //   154: goto -> 183
    //   157: bipush #78
    //   159: goto -> 183
    //   162: bipush #118
    //   164: goto -> 183
    //   167: bipush #95
    //   169: goto -> 183
    //   172: iconst_2
    //   173: goto -> 183
    //   176: bipush #32
    //   178: goto -> 183
    //   181: bipush #76
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFB5B) & 0xFFFF;
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
      byte b1 = 33;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmzs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */