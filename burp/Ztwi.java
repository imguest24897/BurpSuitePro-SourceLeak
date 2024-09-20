package burp;

class Ztwi implements Zmf {
  private static final Ztt4 ZW;
  
  private final String ZG;
  
  private final int ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Ztwi(Zlhe paramZlhe, Zgv1 paramZgv1, Zrti paramZrti, Zblk paramZblk) {
    // Byte code:
    //   0: invokestatic Zd : ()[I
    //   3: aload_0
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: aload_0
    //   10: aload_3
    //   11: getfield ZX : I
    //   14: putfield ZB : I
    //   17: new net/portswigger/Zz_
    //   20: dup
    //   21: aload_2
    //   22: invokevirtual ZM : ()[B
    //   25: invokespecial <init> : ([B)V
    //   28: astore #6
    //   30: aload #6
    //   32: invokevirtual Z_ : ()Ljava/util/List;
    //   35: astore #7
    //   37: getstatic burp/Ztwi.ZW : Lburp/Ztt4;
    //   40: invokeinterface Zc : ()Z
    //   45: ifeq -> 146
    //   48: getstatic burp/Ztwi.ZW : Lburp/Ztt4;
    //   51: sipush #12494
    //   54: sipush #-14974
    //   57: invokestatic a : (II)Ljava/lang/String;
    //   60: bipush #6
    //   62: anewarray java/lang/Object
    //   65: dup
    //   66: iconst_0
    //   67: aload_2
    //   68: invokevirtual ZC : ()Lburp/Zb25;
    //   71: aastore
    //   72: dup
    //   73: iconst_1
    //   74: aload_2
    //   75: invokevirtual ZQ : ()Ljava/lang/String;
    //   78: aastore
    //   79: dup
    //   80: iconst_2
    //   81: aload_2
    //   82: invokevirtual Zt : ()I
    //   85: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   88: aastore
    //   89: dup
    //   90: iconst_3
    //   91: aload_2
    //   92: invokevirtual Zp : ()Ljava/lang/String;
    //   95: aastore
    //   96: dup
    //   97: iconst_4
    //   98: aload #7
    //   100: invokeinterface isEmpty : ()Z
    //   105: ifeq -> 120
    //   108: sipush #12492
    //   111: sipush #-22447
    //   114: invokestatic a : (II)Ljava/lang/String;
    //   117: goto -> 129
    //   120: sipush #12493
    //   123: sipush #-8576
    //   126: invokestatic a : (II)Ljava/lang/String;
    //   129: aastore
    //   130: dup
    //   131: iconst_5
    //   132: aload #7
    //   134: invokestatic Zp : (Ljava/util/Collection;)Ljava/lang/String;
    //   137: aastore
    //   138: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   141: invokeinterface Zj : (Ljava/lang/String;)V
    //   146: aload #7
    //   148: invokeinterface isEmpty : ()Z
    //   153: ifeq -> 170
    //   156: aload_0
    //   157: aload #4
    //   159: invokevirtual Zd : ()Ljava/lang/String;
    //   162: putfield ZG : Ljava/lang/String;
    //   165: aload #5
    //   167: ifnonnull -> 322
    //   170: ldc ''
    //   172: astore #8
    //   174: aload #7
    //   176: invokeinterface iterator : ()Ljava/util/Iterator;
    //   181: astore #9
    //   183: aload #9
    //   185: invokeinterface hasNext : ()Z
    //   190: ifeq -> 227
    //   193: aload #9
    //   195: invokeinterface next : ()Ljava/lang/Object;
    //   200: checkcast net/portswigger/Zen
    //   203: astore #10
    //   205: aload #8
    //   207: aload #10
    //   209: invokevirtual ZZ : ()[B
    //   212: invokestatic ZG : ([B)Ljava/lang/String;
    //   215: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   220: astore #8
    //   222: aload #5
    //   224: ifnonnull -> 183
    //   227: aload_0
    //   228: sipush #12495
    //   231: sipush #14427
    //   234: invokestatic a : (II)Ljava/lang/String;
    //   237: iconst_1
    //   238: anewarray java/lang/Object
    //   241: dup
    //   242: iconst_0
    //   243: aload #8
    //   245: aastore
    //   246: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   249: putfield ZG : Ljava/lang/String;
    //   252: aload #7
    //   254: invokeinterface iterator : ()Ljava/util/Iterator;
    //   259: astore #9
    //   261: aload #9
    //   263: invokeinterface hasNext : ()Z
    //   268: ifeq -> 322
    //   271: aload #9
    //   273: invokeinterface next : ()Ljava/lang/Object;
    //   278: checkcast net/portswigger/Zen
    //   281: astore #10
    //   283: aload_1
    //   284: aload_2
    //   285: invokevirtual ZC : ()Lburp/Zb25;
    //   288: aload #10
    //   290: aload_2
    //   291: invokevirtual ZM : ()[B
    //   294: aload_0
    //   295: invokevirtual ZC : ()Lburp/Zken;
    //   298: invokevirtual toString : ()Ljava/lang/String;
    //   301: invokestatic Zy : (Ljava/lang/String;)[B
    //   304: aload_2
    //   305: invokevirtual ZQ : ()Ljava/lang/String;
    //   308: aload_2
    //   309: invokevirtual Zt : ()I
    //   312: invokeinterface Zg : (Lburp/Zb25;Lnet/portswigger/Zen;[B[BLjava/lang/String;I)V
    //   317: aload #5
    //   319: ifnonnull -> 261
    //   322: return
  }
  
  public Zken ZC() {
    return Zken.Zg().ZL().Zp(this.ZB).ZB(this.ZG);
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ôwJÝØ\\rÄgKæUÅzâ¦`YÝõäA>ü)kê'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #19
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #61
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 140
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
    //   67: ldc 'èHõs\\räcµ27ªUcù|"n¯ðrj'·|\\n}}iÍÙn5Íì2´âwQã)°®ÀóªmvSdï$>h®1Uô?ÅñøVZÂ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #58
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_3
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
    //   122: goto -> 81
    //   125: aload #5
    //   127: putstatic burp/Ztwi.a : [Ljava/lang/String;
    //   130: iconst_4
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Ztwi.b : [Ljava/lang/String;
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
    //   171: tableswitch default -> 237, 0 -> 208, 1 -> 213, 2 -> 217, 3 -> 222, 4 -> 227, 5 -> 232
    //   208: bipush #94
    //   210: goto -> 239
    //   213: iconst_4
    //   214: goto -> 239
    //   217: bipush #59
    //   219: goto -> 239
    //   222: bipush #53
    //   224: goto -> 239
    //   227: bipush #73
    //   229: goto -> 239
    //   232: bipush #25
    //   234: goto -> 239
    //   237: bipush #61
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
    //   278: tableswitch default -> 39, 0 -> 97
    //   296: invokestatic Zr : ()Lburp/Ztt4;
    //   299: putstatic burp/Ztwi.ZW : Lburp/Ztt4;
    //   302: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x30CC) & 0xFFFF;
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
      char c = '§';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztwi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */