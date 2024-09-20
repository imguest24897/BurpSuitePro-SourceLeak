package net.portswigger.devtools.client.impl.connection.local.process.chrome.binary;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.devtools.client.impl.connection.local.Zd;

public class Ze {
  private static final String Zm;
  
  private static final String ZU;
  
  private final String ZB;
  
  private final int Zk;
  
  private final String ZI;
  
  private final boolean ZX;
  
  private final boolean Zn;
  
  private final String ZH;
  
  private final boolean Zd;
  
  private final boolean Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Ze Ze(String paramString1, String paramString2) throws Zd {
    String[] arrayOfString = paramString2.split(";");
    try {
      if (arrayOfString.length < 3)
        throw new Zd(a(22461, 9332) + a(22461, 9332)); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      return new Ze(paramString1, Integer.parseInt(arrayOfString[0]), arrayOfString[1], arrayOfString[2].equals(a(22459, 6976)), Boolean.parseBoolean(arrayOfString[3].toLowerCase()), arrayOfString[4]);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.RETHROWN);
      throw new Zd(a(22462, -1304) + a(22462, -1304));
    } 
  }
  
  private Ze(String paramString1, int paramInt, String paramString2, boolean paramBoolean1, boolean paramBoolean2, String paramString3) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZB : Ljava/lang/String;
    //   9: aload_0
    //   10: iload_2
    //   11: putfield Zk : I
    //   14: aload_0
    //   15: aload_3
    //   16: putfield ZI : Ljava/lang/String;
    //   19: aload_0
    //   20: iload #4
    //   22: putfield ZX : Z
    //   25: aload_0
    //   26: iload #5
    //   28: putfield Zn : Z
    //   31: aload_0
    //   32: aload #6
    //   34: putfield ZH : Ljava/lang/String;
    //   37: invokestatic Zr : ()Lnet/portswigger/browser/Zjb;
    //   40: invokevirtual ZW : ()Z
    //   43: ifeq -> 70
    //   46: sipush #22463
    //   49: sipush #31517
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: aload_1
    //   56: invokevirtual equals : (Ljava/lang/Object;)Z
    //   59: ifeq -> 70
    //   62: iconst_1
    //   63: goto -> 71
    //   66: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   69: athrow
    //   70: iconst_0
    //   71: istore #7
    //   73: aload_0
    //   74: iload #7
    //   76: ifne -> 101
    //   79: aload_0
    //   80: getfield Zn : Z
    //   83: ifne -> 101
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 102
    //   97: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   100: athrow
    //   101: iconst_0
    //   102: putfield Zd : Z
    //   105: aload_0
    //   106: iload #7
    //   108: ifne -> 133
    //   111: aload_0
    //   112: getfield Zn : Z
    //   115: ifne -> 133
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   124: athrow
    //   125: iconst_1
    //   126: goto -> 134
    //   129: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   132: athrow
    //   133: iconst_0
    //   134: putfield Zg : Z
    //   137: return
    // Exception table:
    //   from	to	target	type
    //   46	66	66	java/lang/NumberFormatException
    //   73	86	89	java/lang/NumberFormatException
    //   79	97	97	java/lang/NumberFormatException
    //   102	118	121	java/lang/NumberFormatException
    //   111	129	129	java/lang/NumberFormatException
  }
  
  public String Z_() {
    return this.ZB;
  }
  
  public int Zs() {
    return this.Zk;
  }
  
  public String ZN() {
    return this.ZI;
  }
  
  public boolean ZH() {
    return this.ZX;
  }
  
  public boolean Zl() {
    return this.Zn;
  }
  
  public String Zn() {
    return this.ZH;
  }
  
  public boolean ZX() {
    return this.Zd;
  }
  
  public boolean ZT() {
    return this.Zg;
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '?Ð/Kvø³*F7ÿXS\\rL÷*­!yÎµ¨8Â3.7a:ANmXEÐ\\nÊ<õC6ËóNØ²ÈzÝrä«ìËA^®(×ofz5;jàÔ\\n Gy­û@ÓªOù-·¤JHè ÄÞP¤´¦r+ÛþöBëB¡ÜÆ.B´ÆAÛC'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #57
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 166
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
    //   68: ldc 'ü¢¿þÿ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_3
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #74
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 166
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
    //   128: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Ze.a : [Ljava/lang/String;
    //   131: bipush #6
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Ze.b : [Ljava/lang/String;
    //   139: sipush #22458
    //   142: sipush #16766
    //   145: invokestatic a : (II)Ljava/lang/String;
    //   148: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Ze.Zm : Ljava/lang/String;
    //   151: sipush #22460
    //   154: sipush #-32406
    //   157: invokestatic a : (II)Ljava/lang/String;
    //   160: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Ze.ZU : Ljava/lang/String;
    //   163: goto -> 324
    //   166: dup_x2
    //   167: pop
    //   168: invokevirtual toCharArray : ()[C
    //   171: dup_x1
    //   172: arraylength
    //   173: dup_x2
    //   174: pop
    //   175: iconst_0
    //   176: istore #6
    //   178: dup2_x1
    //   179: pop2
    //   180: dup_x2
    //   181: iconst_1
    //   182: if_icmpgt -> 284
    //   185: dup2
    //   186: swap
    //   187: iload #6
    //   189: dup2_x1
    //   190: caload
    //   191: swap
    //   192: iload #6
    //   194: bipush #7
    //   196: irem
    //   197: tableswitch default -> 266, 0 -> 236, 1 -> 241, 2 -> 246, 3 -> 251, 4 -> 256, 5 -> 261
    //   236: bipush #30
    //   238: goto -> 268
    //   241: bipush #56
    //   243: goto -> 268
    //   246: bipush #76
    //   248: goto -> 268
    //   251: bipush #66
    //   253: goto -> 268
    //   256: bipush #85
    //   258: goto -> 268
    //   261: bipush #72
    //   263: goto -> 268
    //   266: bipush #55
    //   268: ixor
    //   269: ixor
    //   270: i2c
    //   271: castore
    //   272: iinc #6, 1
    //   275: dup
    //   276: ifne -> 284
    //   279: dup2
    //   280: dup_x1
    //   281: goto -> 189
    //   284: dup2_x1
    //   285: pop2
    //   286: dup_x2
    //   287: iload #6
    //   289: if_icmpgt -> 185
    //   292: pop
    //   293: new java/lang/String
    //   296: dup_x1
    //   297: swap
    //   298: invokespecial <init> : ([C)V
    //   301: invokevirtual intern : ()Ljava/lang/String;
    //   304: swap
    //   305: pop
    //   306: swap
    //   307: tableswitch default -> 40, 0 -> 98
    //   324: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x57BF) & 0xFFFF;
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
      char c = 'ë';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\local\process\chrome\binary\Ze.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */