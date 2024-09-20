package burp;

class Zktx {
  private final Ze3n Za;
  
  private final Zeko Zy;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zktx(Ze3n paramZe3n, Zeko paramZeko) {
    this.Za = paramZe3n;
    this.Zy = paramZeko;
  }
  
  Zgq<Zrdb> Zs(Zx8_ paramZx8_) {
    // Byte code:
    //   0: new burp/Zgq
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZJ : ()Z
    //   11: new burp/Zrq0
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #4
    //   20: istore_2
    //   21: new java/util/HashMap
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: astore #5
    //   30: aload_1
    //   31: invokeinterface ZZp : ()Lburp/Zefg;
    //   36: invokeinterface iterator : ()Ljava/util/Iterator;
    //   41: astore #6
    //   43: aload #6
    //   45: invokeinterface hasNext : ()Z
    //   50: ifeq -> 240
    //   53: aload #6
    //   55: invokeinterface next : ()Ljava/lang/Object;
    //   60: checkcast burp/Zmwr
    //   63: astore #7
    //   65: aload #7
    //   67: ifnull -> 229
    //   70: aload #7
    //   72: invokeinterface Zh1 : ()Ljava/lang/String;
    //   77: ifnull -> 229
    //   80: aload #7
    //   82: invokeinterface Zh1 : ()Ljava/lang/String;
    //   87: invokevirtual trim : ()Ljava/lang/String;
    //   90: invokevirtual isEmpty : ()Z
    //   93: ifne -> 229
    //   96: aload #4
    //   98: aload #4
    //   100: aload #7
    //   102: invokeinterface Zh1 : ()Ljava/lang/String;
    //   107: invokestatic Zy : (Ljava/lang/String;)[B
    //   110: invokevirtual Ze : ([B)[B
    //   113: invokestatic ZG : ([B)Ljava/lang/String;
    //   116: aload_0
    //   117: getfield Zy : Lburp/Zeko;
    //   120: invokevirtual Z_ : (Ljava/lang/String;Lburp/Zeko;)Lburp/Zkqp;
    //   123: astore #8
    //   125: aload_0
    //   126: aload #8
    //   128: invokevirtual ZM : (Lburp/Zkqp;)Z
    //   131: ifeq -> 229
    //   134: aload_0
    //   135: aload #7
    //   137: invokevirtual ZL : (Lburp/Zmwr;)Z
    //   140: ifeq -> 229
    //   143: aload #7
    //   145: invokeinterface ZhB : ()Lburp/Ztu8;
    //   150: invokeinterface ZlP : ()Lburp/Zs_n;
    //   155: sipush #-29607
    //   158: sipush #4574
    //   161: invokestatic a : (II)Ljava/lang/String;
    //   164: invokeinterface ZIm : (Ljava/lang/String;)Lburp/Zs5n;
    //   169: astore #9
    //   171: aload #5
    //   173: aload_0
    //   174: aload #7
    //   176: invokevirtual Zf : (Lburp/Zmwr;)Ljava/lang/String;
    //   179: aload_0
    //   180: aload #7
    //   182: aload #8
    //   184: aload #9
    //   186: <illegal opcode> apply : (Lburp/Zktx;Lburp/Zmwr;Lburp/Zkqp;Lburp/Zs5n;)Ljava/util/function/Function;
    //   191: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   196: checkcast burp/Zkfk
    //   199: astore #10
    //   201: aload #10
    //   203: getfield ZO : Ljava/util/Collection;
    //   206: aload #9
    //   208: invokeinterface ZQs : ()I
    //   213: aload #9
    //   215: invokeinterface ZQc : ()I
    //   220: invokestatic Zj : (II)Lburp/Zl1r;
    //   223: invokeinterface add : (Ljava/lang/Object;)Z
    //   228: pop
    //   229: iload_2
    //   230: ifne -> 43
    //   233: iconst_2
    //   234: anewarray burp/Zbqc
    //   237: invokestatic Zr : ([Lburp/Zbqc;)V
    //   240: aload #5
    //   242: invokeinterface values : ()Ljava/util/Collection;
    //   247: invokeinterface iterator : ()Ljava/util/Iterator;
    //   252: astore #6
    //   254: aload #6
    //   256: invokeinterface hasNext : ()Z
    //   261: ifeq -> 342
    //   264: aload #6
    //   266: invokeinterface next : ()Ljava/lang/Object;
    //   271: checkcast burp/Zkfk
    //   274: astore #7
    //   276: aload_3
    //   277: aload_0
    //   278: getfield Za : Lburp/Ze3n;
    //   281: invokevirtual Za : ()Lburp/Zmzk;
    //   284: aload_0
    //   285: getfield Za : Lburp/Ze3n;
    //   288: invokevirtual ZN : ()Ljava/lang/String;
    //   291: aload #7
    //   293: getfield Ze : Lburp/Zkqp;
    //   296: invokevirtual Ze : ()B
    //   299: aload #7
    //   301: getfield Ze : Lburp/Zkqp;
    //   304: invokevirtual ZO : ()B
    //   307: aload_0
    //   308: getfield Za : Lburp/Ze3n;
    //   311: invokevirtual Zt : ()Lburp/Zvow;
    //   314: aload #7
    //   316: getfield ZO : Ljava/util/Collection;
    //   319: invokevirtual Z_ : (Ljava/util/Collection;)Lburp/Zvow;
    //   322: aload #7
    //   324: getfield ZW : Ljava/lang/String;
    //   327: aload #7
    //   329: getfield Z_ : I
    //   332: invokestatic ZJ : (Lburp/Zmzk;Ljava/lang/String;BBLburp/Zvow;Ljava/lang/String;I)Lburp/Zsqx;
    //   335: invokevirtual Zu : (Lburp/Zsqx;)V
    //   338: iload_2
    //   339: ifne -> 254
    //   342: aload_3
    //   343: areturn
  }
  
  private String Zf(Zmwr paramZmwr) {
    Zs5n zs5n = paramZmwr.ZhB().ZlP().ZIm(a(-29608, 17168));
    return (zs5n != null && zs5n.ZQd() != null && !zs5n.ZQd().trim().isEmpty()) ? zs5n.ZQG() : a(-29606, 28279);
  }
  
  private boolean ZM(Zkqp paramZkqp) {
    return (paramZkqp != null);
  }
  
  private boolean ZL(Zmwr paramZmwr) {
    return (paramZmwr.ZhB() != null && paramZmwr.ZhB().ZlP() != null && paramZmwr.ZhB().ZlP().ZIm(a(-29606, 28279)) != null);
  }
  
  private Zkfk lambda$findIssues$0(Zmwr paramZmwr, Zkqp paramZkqp, Zs5n paramZs5n, String paramString) {
    return new Zkfk(Zf(paramZmwr), paramZkqp, paramZs5n.ZQD());
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '[õ«Ò½zí£g\\bµ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_4
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #67
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
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
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic burp/Zktx.a : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zktx.b : [Ljava/lang/String;
    //   78: goto -> 226
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 199
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #18
    //   154: goto -> 183
    //   157: bipush #64
    //   159: goto -> 183
    //   162: bipush #103
    //   164: goto -> 183
    //   167: bipush #103
    //   169: goto -> 183
    //   172: bipush #26
    //   174: goto -> 183
    //   177: bipush #45
    //   179: goto -> 183
    //   182: iconst_5
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 104
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 100
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
    //   223: goto -> 38
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8C58) & 0xFFFF;
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
      char c = 'ø';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zktx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */