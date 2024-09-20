package burp;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.browser.Zel;
import net.portswigger.browser.Zt3;

class Zmy9 implements Zsgp {
  private final Zel ZX;
  
  private final boolean Zj;
  
  private final List<Zr1q> ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zmy9(Zel paramZel, boolean paramBoolean, List<Zr1q> paramList) {
    this.ZX = paramZel;
    this.Zj = paramBoolean;
    this.ZC = paramList;
  }
  
  static Zmy9 ZY(Zel paramZel, List<Zel> paramList, Zt3 paramZt3) {
    AtomicBoolean atomicBoolean = new AtomicBoolean();
    paramZt3.ZA(paramZel, atomicBoolean::lambda$createFormElement$0);
    List<Zr1q> list = Zr1q.ZT(paramList, true, paramZt3);
    return new Zmy9(paramZel, atomicBoolean.get(), list);
  }
  
  public Zel ZG() {
    return this.ZX;
  }
  
  public Optional<String> Zh() {
    return Optional.ofNullable(Zo().get(a(14900, 8156)));
  }
  
  public Optional<String> ZB() {
    return Optional.ofNullable(Zo().get(a(14901, 2073)));
  }
  
  public Optional<String> ZZ() {
    return Optional.ofNullable(Zo().get(a(14902, -24056)));
  }
  
  private Map<String, String> Zo() {
    return this.ZX.ZM();
  }
  
  boolean ZN() {
    return this.Zj;
  }
  
  public List<Zrtj> Zm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZC : Ljava/util/List;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   14: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   19: istore_1
    //   20: aload_0
    //   21: invokevirtual ZZ : ()Ljava/util/Optional;
    //   24: sipush #14903
    //   27: sipush #-19380
    //   30: invokestatic a : (II)Ljava/lang/String;
    //   33: <illegal opcode> test : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   38: invokevirtual filter : (Ljava/util/function/Predicate;)Ljava/util/Optional;
    //   41: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   46: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   49: getstatic burp/Zz_4.URL : Lburp/Zz_4;
    //   52: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   55: checkcast burp/Zz_4
    //   58: astore_2
    //   59: aload_0
    //   60: getfield ZC : Ljava/util/List;
    //   63: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   68: aload_2
    //   69: iload_1
    //   70: <illegal opcode> apply : (Lburp/Zz_4;Z)Ljava/util/function/Function;
    //   75: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   80: invokeinterface toList : ()Ljava/util/List;
    //   85: areturn
  }
  
  private static Zrtj lambda$getInputs$2(Zz_4 paramZz_4, boolean paramBoolean, Zr1q paramZr1q) {
    Zv5 zv5 = paramZr1q.ZI().ZP(paramZz_4);
    if (paramBoolean && !paramZr1q.ZR())
      zv5.ZG(true); 
    return zv5.Zd();
  }
  
  private static Zz_4 lambda$getInputs$1(String paramString) {
    return Zz_4.BODY;
  }
  
  private static void lambda$createFormElement$0(AtomicBoolean paramAtomicBoolean, Zel paramZel) {
    if (Zr1q.Zj(paramZel, true))
      paramAtomicBoolean.set(true); 
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'wÉö`ìgÎY|!'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: iconst_1
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 140
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 22
    //   66: ldc 'ÉðõT~;W½/'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #6
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #20
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 140
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
    //   127: putstatic burp/Zmy9.a : [Ljava/lang/String;
    //   130: iconst_4
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zmy9.b : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 255
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 237, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 222, 4 -> 227, 5 -> 232
    //   208: bipush #68
    //   210: goto -> 239
    //   213: bipush #84
    //   215: goto -> 239
    //   218: iconst_5
    //   219: goto -> 239
    //   222: bipush #83
    //   224: goto -> 239
    //   227: bipush #38
    //   229: goto -> 239
    //   232: bipush #33
    //   234: goto -> 239
    //   237: bipush #110
    //   239: ixor
    //   240: ixor
    //   241: i2c
    //   242: castore
    //   243: iinc #6, 1
    //   246: dup
    //   247: ifne -> 255
    //   250: dup2
    //   251: dup_x1
    //   252: goto -> 163
    //   255: dup2_x1
    //   256: pop2
    //   257: dup_x2
    //   258: iload #6
    //   260: if_icmpgt -> 159
    //   263: pop
    //   264: new java/lang/String
    //   267: dup_x1
    //   268: swap
    //   269: invokespecial <init> : ([C)V
    //   272: invokevirtual intern : ()Ljava/lang/String;
    //   275: swap
    //   276: pop
    //   277: swap
    //   278: tableswitch default -> 38, 0 -> 97
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3A36) & 0xFFFF;
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
      byte b1 = 127;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmy9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */