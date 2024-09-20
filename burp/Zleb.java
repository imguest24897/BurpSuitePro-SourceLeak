package burp;

import java.util.List;

class Zleb {
  private final Zmh6 Zo;
  
  private final boolean ZX;
  
  private final Zemj ZF;
  
  private final Zseo Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zleb() {
    this(new Zmh6(), false, Zseo.ZA);
  }
  
  Zleb(Zmh6 paramZmh6, boolean paramBoolean, Zseo paramZseo) {
    this.Zo = paramZmh6;
    this.ZX = paramBoolean;
    this.ZF = new Zemj(paramZseo);
    this.Zr = paramZseo;
  }
  
  Zeug ZQ(List<String> paramList) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: invokestatic ZW : ()I
    //   5: new burp/Zkl8
    //   8: dup
    //   9: aload_0
    //   10: getfield Zr : Lburp/Zseo;
    //   13: aload_0
    //   14: getfield ZX : Z
    //   17: invokespecial <init> : (Lburp/Zseo;Z)V
    //   20: astore #4
    //   22: istore_2
    //   23: iconst_0
    //   24: istore #5
    //   26: iload #5
    //   28: aload_1
    //   29: invokeinterface size : ()I
    //   34: if_icmpge -> 487
    //   37: aload_1
    //   38: iload #5
    //   40: invokeinterface get : (I)Ljava/lang/Object;
    //   45: checkcast java/lang/String
    //   48: astore #6
    //   50: aload #6
    //   52: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   55: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   58: astore #7
    //   60: iload #5
    //   62: ifne -> 152
    //   65: new java/util/StringTokenizer
    //   68: dup
    //   69: aload #7
    //   71: invokespecial <init> : (Ljava/lang/String;)V
    //   74: astore #8
    //   76: aload #8
    //   78: invokevirtual nextToken : ()Ljava/lang/String;
    //   81: astore #9
    //   83: aload #9
    //   85: sipush #1685
    //   88: sipush #4231
    //   91: invokestatic a : (II)Ljava/lang/String;
    //   94: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   97: ifne -> 117
    //   100: aload #4
    //   102: invokevirtual Zm : ()Lburp/Zkl8;
    //   105: pop
    //   106: aload #4
    //   108: iconst_0
    //   109: invokevirtual ZR : (I)Lburp/Zkl8;
    //   112: pop
    //   113: iload_2
    //   114: ifeq -> 487
    //   117: aload #4
    //   119: aload #9
    //   121: invokevirtual ZJ : (Ljava/lang/String;)Lburp/Zkl8;
    //   124: pop
    //   125: aload #4
    //   127: aload #8
    //   129: invokevirtual nextToken : ()Ljava/lang/String;
    //   132: invokestatic parseShort : (Ljava/lang/String;)S
    //   135: invokevirtual ZY : (S)Lburp/Zkl8;
    //   138: pop
    //   139: goto -> 152
    //   142: astore #8
    //   144: aload #8
    //   146: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   149: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   152: aload_0
    //   153: getfield Zo : Lburp/Zmh6;
    //   156: aload #7
    //   158: invokevirtual ZJ : (Ljava/lang/String;)V
    //   161: aload #7
    //   163: sipush #1684
    //   166: sipush #23102
    //   169: invokestatic a : (II)Ljava/lang/String;
    //   172: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   175: ifeq -> 201
    //   178: aload #4
    //   180: aload #7
    //   182: bipush #13
    //   184: invokevirtual substring : (I)Ljava/lang/String;
    //   187: invokevirtual trim : ()Ljava/lang/String;
    //   190: invokevirtual Zp : (Ljava/lang/String;)Lburp/Zkl8;
    //   193: pop
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   200: athrow
    //   201: aload #7
    //   203: sipush #1693
    //   206: sipush #-18363
    //   209: invokestatic a : (II)Ljava/lang/String;
    //   212: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   215: ifeq -> 244
    //   218: aload #7
    //   220: sipush #1681
    //   223: sipush #-26424
    //   226: invokestatic a : (II)Ljava/lang/String;
    //   229: invokevirtual indexOf : (Ljava/lang/String;)I
    //   232: ifle -> 244
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   241: athrow
    //   242: iconst_1
    //   243: istore_3
    //   244: aload #7
    //   246: sipush #1682
    //   249: sipush #10891
    //   252: invokestatic a : (II)Ljava/lang/String;
    //   255: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   258: ifeq -> 297
    //   261: aload #7
    //   263: bipush #15
    //   265: invokevirtual substring : (I)Ljava/lang/String;
    //   268: invokevirtual trim : ()Ljava/lang/String;
    //   271: invokestatic parseInt : (Ljava/lang/String;)I
    //   274: istore #8
    //   276: aload #4
    //   278: iload #8
    //   280: invokevirtual ZY : (I)Lburp/Zkl8;
    //   283: pop
    //   284: goto -> 297
    //   287: astore #8
    //   289: aload #8
    //   291: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   294: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   297: aload #7
    //   299: sipush #1692
    //   302: sipush #32208
    //   305: invokestatic a : (II)Ljava/lang/String;
    //   308: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   311: ifeq -> 337
    //   314: aload #4
    //   316: aload #6
    //   318: bipush #11
    //   320: invokevirtual substring : (I)Ljava/lang/String;
    //   323: invokevirtual trim : ()Ljava/lang/String;
    //   326: invokevirtual Z_ : (Ljava/lang/String;)Lburp/Zkl8;
    //   329: pop
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   336: athrow
    //   337: aload #7
    //   339: sipush #1680
    //   342: sipush #-32093
    //   345: invokestatic a : (II)Ljava/lang/String;
    //   348: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   351: ifeq -> 378
    //   354: aload_0
    //   355: getfield ZF : Lburp/Zemj;
    //   358: aload #6
    //   360: bipush #8
    //   362: invokevirtual substring : (I)Ljava/lang/String;
    //   365: invokevirtual trim : ()Ljava/lang/String;
    //   368: invokevirtual Zu : (Ljava/lang/String;)V
    //   371: goto -> 378
    //   374: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   377: athrow
    //   378: aload #7
    //   380: sipush #1687
    //   383: sipush #-4797
    //   386: invokestatic a : (II)Ljava/lang/String;
    //   389: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   392: ifeq -> 418
    //   395: aload #4
    //   397: aload #7
    //   399: bipush #11
    //   401: invokevirtual substring : (I)Ljava/lang/String;
    //   404: invokevirtual trim : ()Ljava/lang/String;
    //   407: invokevirtual Zl : (Ljava/lang/String;)Lburp/Zkl8;
    //   410: pop
    //   411: goto -> 418
    //   414: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   417: athrow
    //   418: aload #7
    //   420: sipush #1683
    //   423: sipush #6748
    //   426: invokestatic a : (II)Ljava/lang/String;
    //   429: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   432: ifeq -> 480
    //   435: sipush #1686
    //   438: sipush #17308
    //   441: invokestatic a : (II)Ljava/lang/String;
    //   444: aload #7
    //   446: bipush #8
    //   448: invokevirtual substring : (I)Ljava/lang/String;
    //   451: invokevirtual trim : ()Ljava/lang/String;
    //   454: invokevirtual equals : (Ljava/lang/Object;)Z
    //   457: ifeq -> 480
    //   460: goto -> 467
    //   463: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   466: athrow
    //   467: aload #4
    //   469: invokevirtual ZJ : ()Lburp/Zkl8;
    //   472: pop
    //   473: goto -> 480
    //   476: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   479: athrow
    //   480: iinc #5, 1
    //   483: iload_2
    //   484: ifeq -> 26
    //   487: iload_3
    //   488: ifeq -> 505
    //   491: aload #4
    //   493: iconst_2
    //   494: invokevirtual ZR : (I)Lburp/Zkl8;
    //   497: pop
    //   498: goto -> 505
    //   501: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   504: athrow
    //   505: aload #4
    //   507: invokevirtual Zi : ()Lburp/Zeug;
    //   510: areturn
    // Exception table:
    //   from	to	target	type
    //   65	113	142	java/lang/Exception
    //   117	139	142	java/lang/Exception
    //   152	194	197	java/lang/Exception
    //   201	235	238	java/lang/Exception
    //   261	284	287	java/lang/Exception
    //   297	330	333	java/lang/Exception
    //   337	371	374	java/lang/Exception
    //   378	411	414	java/lang/Exception
    //   418	460	463	java/lang/Exception
    //   435	473	476	java/lang/Exception
    //   487	498	501	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ßó£íî]UÆzÇ1\\t­J×ù¾hcÏìö|&iÄ Vgy^\\bÚ¨ûÓó­] ãáÉÓiÕïy@Ï.±68\\ro\\b\\tÇoK'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_3
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   64: goto -> 23
    //   67: ldc '·Hâ$J]ìVZzTóUvkZoû¦~hPS}'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #11
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #78
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zleb.a : [Ljava/lang/String;
    //   131: bipush #10
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zleb.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #14
    //   214: goto -> 243
    //   217: bipush #82
    //   219: goto -> 243
    //   222: bipush #59
    //   224: goto -> 243
    //   227: bipush #35
    //   229: goto -> 243
    //   232: iconst_1
    //   233: goto -> 243
    //   236: bipush #46
    //   238: goto -> 243
    //   241: bipush #30
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x694) & 0xFFFF;
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
      byte b1 = 32;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zleb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */