package net.portswigger;

import burp.Zbqc;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;

public interface Z_1 {
  public static final String[] a;
  
  public static final String[] b;
  
  byte[] ZI(Zc9 paramZc9, Zvw paramZvw, InputStream paramInputStream) throws Zib;
  
  byte[] Zn(Zvw paramZvw, InputStream paramInputStream) throws IOException, Zib;
  
  static byte[] Zt(Zvw paramZvw, InputStream paramInputStream, Zve paramZve) throws Zib {
    try {
      try {
      
      } catch (SocketTimeoutException socketTimeoutException) {
        throw a(null);
      } 
      byte[] arrayOfByte = paramZvw.Zn(a(-28996, 13770), a(-29001, 30569)) ? Zg(paramInputStream) : Ze(paramZvw, paramInputStream);
      if (arrayOfByte == null)
        return arrayOfByte; 
      try {
      
      } catch (SocketTimeoutException socketTimeoutException) {
        throw a(null);
      } 
      return Zj.Zt(((Boolean)paramZvw.Zk(a(-28993, 12811)).<Boolean>map(a(-29002, 19525)::equalsIgnoreCase).orElse(Boolean.valueOf(false))).booleanValue() ? Zhf.ZX(arrayOfByte) : arrayOfByte, paramZve);
    } catch (SocketTimeoutException socketTimeoutException) {
      throw new Zrzz(a(-28998, 9008), socketTimeoutException);
    } catch (IOException iOException) {
      throw new Zrzz(a(-29008, -8162), iOException);
    } 
  }
  
  static byte[] Ze(Zvw paramZvw, InputStream paramInputStream) throws Zib, IOException {
    int i;
    String str = paramZvw.Zw(a(-29007, -6396), "0");
    Zbqc[] arrayOfZbqc = Zj.Zk();
    try {
      i = Integer.parseInt(str);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      throw new Zib(a(-28997, 7239) + a(-28997, 7239));
    } 
    try {
      if (i < 0)
        throw new Zib(a(-28999, 13609) + a(-28999, 13609)); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    if (i > 0) {
      byte[] arrayOfByte = new byte[i];
      try {
        ZA(paramInputStream, arrayOfByte, i);
        return (arrayOfZbqc == null) ? arrayOfByte : null;
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  static byte[] Zg(InputStream paramInputStream) throws IOException, Zib {
    // Byte code:
    //   0: new java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Zk : ()[Lburp/Zbqc;
    //   11: new java/io/ByteArrayOutputStream
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #4
    //   20: astore_1
    //   21: iconst_m1
    //   22: istore #6
    //   24: aload_0
    //   25: invokevirtual read : ()I
    //   28: dup
    //   29: istore #5
    //   31: iconst_m1
    //   32: if_icmpeq -> 81
    //   35: iload #5
    //   37: bipush #10
    //   39: if_icmpne -> 67
    //   42: iload #6
    //   44: bipush #13
    //   46: if_icmpne -> 67
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: aload_1
    //   57: ifnull -> 81
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aload_3
    //   68: iload #5
    //   70: invokevirtual write : (I)V
    //   73: iload #5
    //   75: istore #6
    //   77: aload_1
    //   78: ifnull -> 24
    //   81: aload_3
    //   82: invokevirtual size : ()I
    //   85: iconst_2
    //   86: if_icmpge -> 110
    //   89: new net/portswigger/Zib
    //   92: dup
    //   93: sipush #-29017
    //   96: sipush #-12028
    //   99: invokestatic a : (II)Ljava/lang/String;
    //   102: invokespecial <init> : (Ljava/lang/String;)V
    //   105: athrow
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload_3
    //   111: sipush #-28994
    //   114: sipush #-13969
    //   117: invokestatic a : (II)Ljava/lang/String;
    //   120: invokevirtual toString : (Ljava/lang/String;)Ljava/lang/String;
    //   123: astore #7
    //   125: aload_3
    //   126: invokevirtual reset : ()V
    //   129: aload #7
    //   131: iconst_0
    //   132: aload #7
    //   134: invokevirtual length : ()I
    //   137: iconst_1
    //   138: isub
    //   139: invokevirtual substring : (II)Ljava/lang/String;
    //   142: bipush #16
    //   144: invokestatic parseInt : (Ljava/lang/String;I)I
    //   147: istore #8
    //   149: goto -> 179
    //   152: astore #9
    //   154: aload #9
    //   156: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   159: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   162: new net/portswigger/Zib
    //   165: dup
    //   166: sipush #-29000
    //   169: sipush #909
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: invokespecial <init> : (Ljava/lang/String;)V
    //   178: athrow
    //   179: iload #8
    //   181: ifne -> 237
    //   184: aload_0
    //   185: invokevirtual read : ()I
    //   188: bipush #13
    //   190: if_icmpne -> 216
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   199: athrow
    //   200: aload_0
    //   201: invokevirtual read : ()I
    //   204: bipush #10
    //   206: if_icmpeq -> 308
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   215: athrow
    //   216: new net/portswigger/Zib
    //   219: dup
    //   220: sipush #-29006
    //   223: sipush #-4485
    //   226: invokestatic a : (II)Ljava/lang/String;
    //   229: invokespecial <init> : (Ljava/lang/String;)V
    //   232: athrow
    //   233: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   236: athrow
    //   237: iload #8
    //   239: newarray byte
    //   241: astore #9
    //   243: aload_0
    //   244: aload #9
    //   246: iload #8
    //   248: invokestatic ZA : (Ljava/io/InputStream;[BI)V
    //   251: aload #4
    //   253: aload #9
    //   255: invokevirtual write : ([B)V
    //   258: aload_0
    //   259: invokevirtual read : ()I
    //   262: bipush #13
    //   264: if_icmpne -> 283
    //   267: aload_0
    //   268: invokevirtual read : ()I
    //   271: bipush #10
    //   273: if_icmpeq -> 304
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   282: athrow
    //   283: new net/portswigger/Zib
    //   286: dup
    //   287: sipush #-29005
    //   290: sipush #28459
    //   293: invokestatic a : (II)Ljava/lang/String;
    //   296: invokespecial <init> : (Ljava/lang/String;)V
    //   299: athrow
    //   300: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   303: athrow
    //   304: aload_1
    //   305: ifnull -> 21
    //   308: aload #4
    //   310: invokevirtual toByteArray : ()[B
    //   313: astore_2
    //   314: aload_2
    //   315: areturn
    // Exception table:
    //   from	to	target	type
    //   35	49	52	java/lang/NumberFormatException
    //   42	60	63	java/lang/NumberFormatException
    //   81	106	106	java/lang/NumberFormatException
    //   129	149	152	java/lang/NumberFormatException
    //   179	193	196	java/lang/NumberFormatException
    //   184	209	212	java/lang/NumberFormatException
    //   200	233	233	java/lang/NumberFormatException
    //   243	276	279	java/lang/NumberFormatException
    //   267	300	300	java/lang/NumberFormatException
  }
  
  static void ZA(InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt) throws IOException, Zib {
    int i = 0;
    Zbqc[] arrayOfZbqc = Zj.Zk();
    int j;
    while ((j = paramInputStream.read(paramArrayOfbyte, i, paramInt - i)) != -1 && i < paramInt) {
      i += j;
      if (arrayOfZbqc != null)
        break; 
    } 
    try {
      if (i != paramInt) {
        a(-29003, 23344);
        throw new Zib(a(-29003, 23344) + a(-29003, 23344) + i + a(-29004, 21167) + paramInt);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'wd(4îXÂÜmïï:âMFHóð¨j_\\rrT°áL#PÂMÕ*;ùñ±ÄÂ6³Ñip½ÿ¶Õ\\tuÑg\\tòj.k­ì\\t¯×)NÎÞÆHÃ\\bùÏ8Ê\\tßÍ¬Äë©ì¨\\fÊãö§¸·nëþ`?Ís7ÿ³Æ<Ð /ý A.xìU ^Ñ«Æ\\bf0¢Í·=\\rö¼¡vÝÅÚÒDLõ»a³*¶H¢Ì/B¶"¥ýÎ/Së=fPÄ«ûãUÑÿêµ÷Q¾üi"^× \\fï'8úRm\\t 2"åôï.wË¹bÀÖ»Åù«ðþÎsU.îy`\@'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_4
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
    //   67: ldc 'çKÛñ9ï/>{Oå4gKp}øw5fË ^;ùÚ½I¬vx:±ûßk\\rµ>'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #27
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #72
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
    //   128: putstatic net/portswigger/Z_1.a : [Ljava/lang/String;
    //   131: bipush #17
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/Z_1.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #50
    //   214: goto -> 244
    //   217: bipush #56
    //   219: goto -> 244
    //   222: bipush #126
    //   224: goto -> 244
    //   227: bipush #48
    //   229: goto -> 244
    //   232: bipush #115
    //   234: goto -> 244
    //   237: bipush #44
    //   239: goto -> 244
    //   242: bipush #97
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8EB7) & 0xFFFF;
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
      byte b1 = 80;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_1.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */