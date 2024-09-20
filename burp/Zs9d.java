package burp;

import burp.api.montoya.websocket.Direction;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zs9d implements Zz2t {
  private final Zzdx Z_;
  
  private final Zg7q ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zs9d(Zzdx paramZzdx, Zg7q paramZg7q) {
    this.Z_ = paramZzdx;
    this.ZM = paramZg7q;
  }
  
  public String ZT() {
    Zlmu zlmu = new Zlmu();
    Zzup zzup = ZG(zlmu);
    zzup = ZO(zzup);
    zzup = ZF(zzup);
    zzup = Zs(zzup);
    zzup = new Zlmi(zzup);
    return this.ZM.Zz(zzup.Zg());
  }
  
  private Zzup Zs(Zzup paramZzup) {
    String str = this.Z_.Zdp();
    try {
      if (str != null && !str.isEmpty()) {
        int i = ZV(str);
        Zzup zzup = (new Zlm4(a(-31687, 3133), Zg3u.LISTENER_PORT.Zo)).Zt(new Zlm9(i));
        paramZzup = paramZzup.ZI().ZT(zzup);
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return paramZzup;
  }
  
  private Zzup ZF(Zzup paramZzup) {
    if (this.Z_.ZdO()) {
      Zlm4 zlm4 = new Zlm4(a(-31687, 3133), Zg3u.NOTES.Zo);
      paramZzup = paramZzup.ZI().ZT(zlm4);
    } 
    if (this.Z_.ZdE()) {
      Zlm4 zlm4 = new Zlm4(a(-31687, 3133), Zg3u.HIGHLIGHT_COLOUR.Zo);
      paramZzup = paramZzup.ZI().ZT(zlm4);
    } 
    return paramZzup;
  }
  
  private Zzup ZO(Zzup paramZzup) {
    // Byte code:
    //   0: invokestatic Zt : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: aload_0
    //   6: getfield Z_ : Lburp/Zzdx;
    //   9: invokeinterface Zd6 : ()Ljava/lang/String;
    //   14: invokevirtual ZY : (Ljava/lang/String;)Ljava/lang/String;
    //   17: astore_3
    //   18: aload_3
    //   19: ifnull -> 36
    //   22: aload_3
    //   23: invokevirtual isEmpty : ()Z
    //   26: ifeq -> 42
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   35: athrow
    //   36: aload_1
    //   37: areturn
    //   38: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   41: athrow
    //   42: aload_0
    //   43: getfield Z_ : Lburp/Zzdx;
    //   46: invokeinterface Zd8 : ()Z
    //   51: ifeq -> 175
    //   54: aload_0
    //   55: getfield Z_ : Lburp/Zzdx;
    //   58: invokeinterface ZdA : ()Z
    //   63: ifeq -> 89
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   72: athrow
    //   73: sipush #-31684
    //   76: sipush #26875
    //   79: invokestatic a : (II)Ljava/lang/String;
    //   82: goto -> 98
    //   85: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   88: athrow
    //   89: sipush #-31681
    //   92: sipush #-17088
    //   95: invokestatic a : (II)Ljava/lang/String;
    //   98: astore #4
    //   100: aload_0
    //   101: aload #4
    //   103: <illegal opcode> get : (Lburp/Zs9d;Ljava/lang/String;)Ljava/util/function/Supplier;
    //   108: astore #5
    //   110: new burp/Zlmx
    //   113: dup
    //   114: sipush #-31686
    //   117: sipush #5076
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: getstatic burp/Zg3u.SEARCH_TERM : Lburp/Zg3u;
    //   126: getfield Zo : Ljava/lang/String;
    //   129: aload #5
    //   131: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier;)V
    //   134: astore #6
    //   136: aload_0
    //   137: getfield Z_ : Lburp/Zzdx;
    //   140: invokeinterface ZdG : ()Z
    //   145: ifeq -> 157
    //   148: aload #6
    //   150: invokeinterface Zs : ()Lburp/Zzup;
    //   155: astore #6
    //   157: aload_1
    //   158: invokeinterface ZI : ()Lburp/Zzup;
    //   163: aload #6
    //   165: invokeinterface ZT : (Lburp/Zzup;)Lburp/Zzup;
    //   170: astore_1
    //   171: aload_2
    //   172: ifnull -> 253
    //   175: new burp/Zlmz
    //   178: dup
    //   179: sipush #-31687
    //   182: sipush #3133
    //   185: invokestatic a : (II)Ljava/lang/String;
    //   188: getstatic burp/Zg3u.SEARCH_TERM : Lburp/Zg3u;
    //   191: getfield Zo : Ljava/lang/String;
    //   194: new burp/Zrx1
    //   197: dup
    //   198: aload_0
    //   199: <illegal opcode> get : (Lburp/Zs9d;)Ljava/util/function/Supplier;
    //   204: invokespecial <init> : (Ljava/util/function/Supplier;)V
    //   207: aload_0
    //   208: <illegal opcode> get : (Lburp/Zs9d;)Ljava/util/function/Supplier;
    //   213: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V
    //   216: astore #4
    //   218: aload_0
    //   219: getfield Z_ : Lburp/Zzdx;
    //   222: invokeinterface ZdG : ()Z
    //   227: ifeq -> 239
    //   230: aload #4
    //   232: invokeinterface Zs : ()Lburp/Zzup;
    //   237: astore #4
    //   239: aload_1
    //   240: invokeinterface ZI : ()Lburp/Zzup;
    //   245: aload #4
    //   247: invokeinterface ZT : (Lburp/Zzup;)Lburp/Zzup;
    //   252: astore_1
    //   253: aload_1
    //   254: areturn
    // Exception table:
    //   from	to	target	type
    //   18	29	32	java/lang/NumberFormatException
    //   22	38	38	java/lang/NumberFormatException
    //   42	66	69	java/lang/NumberFormatException
    //   54	85	85	java/lang/NumberFormatException
  }
  
  private Zzup ZG(Zzup paramZzup) {
    if (this.Z_.ZdL()) {
      Zlm4 zlm4 = new Zlm4(a(-31687, 3133), Zg3u.SHOW_ONLY_IN_SCOPE_WEB_SOCKETS.Zo);
      paramZzup = paramZzup.ZI().ZT(zlm4);
    } 
    if (this.Z_.Zdb()) {
      Zlm4 zlm4 = new Zlm4(a(-31687, 3133), Zg3u.DIRECTION.Zo);
      Zlmw<Direction> zlmw = new Zlmw<>(Direction.CLIENT_TO_SERVER);
      paramZzup = paramZzup.ZI().ZT(zlm4.Zd(zlmw));
    } 
    if (this.Z_.Zdi()) {
      Zlm4 zlm4 = new Zlm4(a(-31687, 3133), Zg3u.DIRECTION.Zo);
      Zlmw<Direction> zlmw = new Zlmw<>(Direction.SERVER_TO_CLIENT);
      paramZzup = paramZzup.ZI().ZT(zlm4.Zd(zlmw));
    } 
    return paramZzup;
  }
  
  private static int ZV(String paramString) {
    try {
      return Integer.parseInt(paramString);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      return -1;
    } 
  }
  
  private String ZY(String paramString) {
    try {
      if (paramString != null) {
        try {
          if (paramString.isEmpty());
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return paramString.replace("\\", a(-31688, -22413)).replace("\"", a(-31683, -26502));
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private String lambda$convertSearchTermOptions$2() {
    return String.valueOf(this.Z_.ZdA());
  }
  
  private String lambda$convertSearchTermOptions$1() {
    return ZY(this.Z_.Zd6());
  }
  
  private String lambda$convertSearchTermOptions$0(String paramString) {
    return a(-31685, 30596).formatted(new Object[] { ZY(this.Z_.Zd6()), paramString });
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÄEç!l:#\\fm}éÊåQÊ¿1bê4'&©ä¢\\b+¦¸¬Ü'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #29
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
    //   68: ldc '¼uW2À´è¼ÏJÉ9)kØaâmv_>ÁA`<R>6¤]Ç~½Jew¤ÃZÓÍ@Th¨Qe+úâ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #14
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #60
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
    //   129: putstatic burp/Zs9d.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zs9d.b : [Ljava/lang/String;
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
    //   212: bipush #30
    //   214: goto -> 244
    //   217: bipush #19
    //   219: goto -> 244
    //   222: bipush #90
    //   224: goto -> 244
    //   227: bipush #25
    //   229: goto -> 244
    //   232: bipush #46
    //   234: goto -> 244
    //   237: bipush #58
    //   239: goto -> 244
    //   242: bipush #43
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
    int i = (paramInt1 ^ 0xFFFF8439) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs9d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */