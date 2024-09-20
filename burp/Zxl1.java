package burp;

class Zxl1 {
  private static final String[] a;
  
  private static final String[] b;
  
  static RuntimeException ZA(Throwable paramThrowable) {
    return Zk(paramThrowable, null, null);
  }
  
  static RuntimeException Zk(Throwable paramThrowable, Zeu1 paramZeu1, Zskh paramZskh) {
    // Byte code:
    //   0: invokestatic Ze : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: instanceof burp/Zxgy
    //   8: ifeq -> 28
    //   11: new java/lang/IllegalArgumentException
    //   14: dup
    //   15: aload_0
    //   16: invokevirtual getMessage : ()Ljava/lang/String;
    //   19: invokespecial <init> : (Ljava/lang/String;)V
    //   22: astore #4
    //   24: iload_3
    //   25: ifeq -> 339
    //   28: aload_0
    //   29: instanceof burp/Zxg5
    //   32: ifeq -> 59
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   41: athrow
    //   42: new java/lang/IllegalArgumentException
    //   45: dup
    //   46: aload_0
    //   47: invokevirtual getMessage : ()Ljava/lang/String;
    //   50: invokespecial <init> : (Ljava/lang/String;)V
    //   53: astore #4
    //   55: iload_3
    //   56: ifeq -> 339
    //   59: aload_0
    //   60: instanceof java/lang/NullPointerException
    //   63: ifeq -> 90
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   72: athrow
    //   73: new java/lang/NullPointerException
    //   76: dup
    //   77: aload_0
    //   78: invokevirtual getMessage : ()Ljava/lang/String;
    //   81: invokespecial <init> : (Ljava/lang/String;)V
    //   84: astore #4
    //   86: iload_3
    //   87: ifeq -> 339
    //   90: aload_0
    //   91: instanceof java/lang/IllegalArgumentException
    //   94: ifeq -> 121
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   103: athrow
    //   104: new java/lang/IllegalArgumentException
    //   107: dup
    //   108: aload_0
    //   109: invokevirtual getMessage : ()Ljava/lang/String;
    //   112: invokespecial <init> : (Ljava/lang/String;)V
    //   115: astore #4
    //   117: iload_3
    //   118: ifeq -> 339
    //   121: aload_0
    //   122: instanceof java/lang/IndexOutOfBoundsException
    //   125: ifeq -> 152
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   134: athrow
    //   135: new java/lang/IndexOutOfBoundsException
    //   138: dup
    //   139: aload_0
    //   140: invokevirtual getMessage : ()Ljava/lang/String;
    //   143: invokespecial <init> : (Ljava/lang/String;)V
    //   146: astore #4
    //   148: iload_3
    //   149: ifeq -> 339
    //   152: aload_0
    //   153: instanceof java/lang/UnsupportedOperationException
    //   156: ifeq -> 183
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   165: athrow
    //   166: new java/lang/UnsupportedOperationException
    //   169: dup
    //   170: aload_0
    //   171: invokevirtual getMessage : ()Ljava/lang/String;
    //   174: invokespecial <init> : (Ljava/lang/String;)V
    //   177: astore #4
    //   179: iload_3
    //   180: ifeq -> 339
    //   183: aload_0
    //   184: instanceof java/net/UnknownHostException
    //   187: ifeq -> 214
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   196: athrow
    //   197: new java/lang/RuntimeException
    //   200: dup
    //   201: aload_0
    //   202: invokevirtual getMessage : ()Ljava/lang/String;
    //   205: invokespecial <init> : (Ljava/lang/String;)V
    //   208: astore #4
    //   210: iload_3
    //   211: ifeq -> 339
    //   214: aload_0
    //   215: instanceof java/lang/NoClassDefFoundError
    //   218: ifeq -> 238
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   227: athrow
    //   228: aload_0
    //   229: invokestatic ZW : (Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    //   232: astore #4
    //   234: iload_3
    //   235: ifeq -> 339
    //   238: aload_0
    //   239: instanceof java/lang/RuntimeException
    //   242: ifeq -> 262
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   251: athrow
    //   252: aload_0
    //   253: invokestatic ZW : (Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    //   256: astore #4
    //   258: iload_3
    //   259: ifeq -> 339
    //   262: aload_0
    //   263: instanceof java/lang/OutOfMemoryError
    //   266: ifeq -> 286
    //   269: goto -> 276
    //   272: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   275: athrow
    //   276: aload_0
    //   277: invokestatic ZW : (Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    //   280: astore #4
    //   282: iload_3
    //   283: ifeq -> 339
    //   286: aload_0
    //   287: instanceof burp/Zgum
    //   290: ifeq -> 322
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   299: athrow
    //   300: new java/lang/RuntimeException
    //   303: dup
    //   304: sipush #23688
    //   307: sipush #26452
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: astore #4
    //   318: iload_3
    //   319: ifeq -> 339
    //   322: iconst_0
    //   323: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   326: aload_0
    //   327: invokevirtual toString : ()Ljava/lang/String;
    //   330: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   333: aload_0
    //   334: invokestatic ZW : (Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    //   337: astore #4
    //   339: aload #4
    //   341: invokevirtual getStackTrace : ()[Ljava/lang/StackTraceElement;
    //   344: astore #5
    //   346: aload #5
    //   348: ifnull -> 393
    //   351: aload #5
    //   353: arraylength
    //   354: ifle -> 393
    //   357: goto -> 364
    //   360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   363: athrow
    //   364: aload #5
    //   366: arraylength
    //   367: iconst_1
    //   368: isub
    //   369: anewarray java/lang/StackTraceElement
    //   372: astore #6
    //   374: aload #5
    //   376: iconst_1
    //   377: aload #6
    //   379: iconst_0
    //   380: aload #6
    //   382: arraylength
    //   383: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   386: aload #4
    //   388: aload #6
    //   390: invokevirtual setStackTrace : ([Ljava/lang/StackTraceElement;)V
    //   393: aload_1
    //   394: ifnull -> 411
    //   397: aload_1
    //   398: aload #4
    //   400: aload_2
    //   401: invokevirtual ZN : (Ljava/lang/Throwable;Lburp/Zskh;)V
    //   404: goto -> 411
    //   407: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   410: athrow
    //   411: aload #4
    //   413: areturn
    //   414: astore #4
    //   416: aload #4
    //   418: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   421: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   424: new java/lang/RuntimeException
    //   427: dup
    //   428: aload_0
    //   429: invokevirtual getMessage : ()Ljava/lang/String;
    //   432: invokespecial <init> : (Ljava/lang/String;)V
    //   435: areturn
    // Exception table:
    //   from	to	target	type
    //   4	413	414	java/lang/Throwable
    //   24	35	38	java/lang/Throwable
    //   55	66	69	java/lang/Throwable
    //   86	97	100	java/lang/Throwable
    //   117	128	131	java/lang/Throwable
    //   148	159	162	java/lang/Throwable
    //   179	190	193	java/lang/Throwable
    //   210	221	224	java/lang/Throwable
    //   234	245	248	java/lang/Throwable
    //   258	269	272	java/lang/Throwable
    //   282	293	296	java/lang/Throwable
    //   346	357	360	java/lang/Throwable
    //   393	404	407	java/lang/Throwable
  }
  
  private static RuntimeException ZW(Throwable paramThrowable) {
    String str1 = paramThrowable.getClass().getName();
    String str2 = paramThrowable.getMessage();
    if (str2 != null)
      str1 = str1 + str1 + a(23689, -1687); 
    return new RuntimeException(str1);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'kn²\\tV`pB§åã|D+Íe¤À¨ÒE¦í¸ä:'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #32
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #19
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
    //   69: putstatic burp/Zxl1.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zxl1.b : [Ljava/lang/String;
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
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 156, 2 -> 161, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: iconst_4
    //   153: goto -> 183
    //   156: bipush #73
    //   158: goto -> 183
    //   161: bipush #29
    //   163: goto -> 183
    //   166: bipush #53
    //   168: goto -> 183
    //   171: bipush #76
    //   173: goto -> 183
    //   176: bipush #35
    //   178: goto -> 183
    //   181: bipush #69
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
    int i = (paramInt1 ^ 0x5C88) & 0xFFFF;
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
      byte b1 = 6;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxl1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */