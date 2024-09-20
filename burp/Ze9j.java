package burp;

import java.io.IOException;
import net.portswigger.Zkb;

public class Ze9j {
  private static String[] Ze;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public static void Zg(Zxgv paramZxgv, Zs4f paramZs4f) throws IOException {
    try {
      if (paramZxgv.ZKV() != null)
        paramZs4f.ZL(a(-18748, 13187), paramZxgv.ZKV()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZs4f.Zb(a(-18751, -24743), paramZxgv.ZKq());
    paramZs4f.Zb(a(-18752, -9909), paramZxgv.ZKK());
    paramZs4f.Zb("m", paramZxgv.ZKl());
    paramZs4f.Zk("h", paramZxgv.ZKx());
  }
  
  static int ZO(Zxgv paramZxgv, byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    return paramZxgv.ZKx() ? (i / 2) : i;
  }
  
  static void ZR(Zxgv paramZxgv, String paramString) {
    String[] arrayOfString = ZK();
    paramZxgv.ZlD(paramString);
    if (paramString == null) {
      paramZxgv.ZvH(-1);
      if (arrayOfString == null) {
        paramZxgv.ZvH(paramZxgv.Zz(Zkb.Zy(paramString)) * paramZxgv.ZKe());
        return;
      } 
      return;
    } 
    paramZxgv.ZvH(paramZxgv.Zz(Zkb.Zy(paramString)) * paramZxgv.ZKe());
  }
  
  static void Zc(Zxgv paramZxgv, int paramInt) {
    paramZxgv.Zd_(paramInt);
    paramZxgv.Zd9(0);
    byte b = 0;
    String[] arrayOfString = ZK();
    while (b < 8) {
      if ((paramInt & 1 << b) != 0)
        paramZxgv.Zd9(paramZxgv.ZKe() + 1); 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    String str = paramZxgv.ZKV();
    if (str == null) {
      paramZxgv.ZvH(-1);
      if (arrayOfString == null) {
        paramZxgv.ZvH(paramZxgv.Zz(Zkb.Zy(str)) * paramZxgv.ZKe());
        return;
      } 
      return;
    } 
    paramZxgv.ZvH(paramZxgv.Zz(Zkb.Zy(str)) * paramZxgv.ZKe());
  }
  
  public static void Zj(Zxgv paramZxgv, Zsh8 paramZsh8) throws Zs7w, Ztgu {
    // Byte code:
    //   0: invokestatic ZK : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: invokeinterface ZKV : ()Ljava/lang/String;
    //   10: astore_3
    //   11: aload_1
    //   12: invokeinterface ZPa : ()Lburp/Zejb;
    //   17: getstatic burp/Zejb.BATTERING_RAM : Lburp/Zejb;
    //   20: if_acmpne -> 55
    //   23: aload_3
    //   24: ifnonnull -> 55
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: new burp/Zs7w
    //   37: dup
    //   38: sipush #-18750
    //   41: sipush #-7761
    //   44: invokestatic a : (II)Ljava/lang/String;
    //   47: invokespecial <init> : (Ljava/lang/String;)V
    //   50: athrow
    //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   54: athrow
    //   55: aload_0
    //   56: invokeinterface ZKe : ()I
    //   61: ifne -> 85
    //   64: new burp/Zs7w
    //   67: dup
    //   68: sipush #-18749
    //   71: sipush #16879
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: invokespecial <init> : (Ljava/lang/String;)V
    //   80: athrow
    //   81: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: aload_3
    //   86: ifnonnull -> 107
    //   89: aload_0
    //   90: iconst_m1
    //   91: invokeinterface ZvH : (I)V
    //   96: aload_2
    //   97: ifnonnull -> 301
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: aload_0
    //   108: aload_3
    //   109: invokestatic Zy : (Ljava/lang/String;)[B
    //   112: invokeinterface Zz : ([B)I
    //   117: istore #4
    //   119: iload #4
    //   121: ifne -> 145
    //   124: new burp/Zs7w
    //   127: dup
    //   128: sipush #-18746
    //   131: sipush #13011
    //   134: invokestatic a : (II)Ljava/lang/String;
    //   137: invokespecial <init> : (Ljava/lang/String;)V
    //   140: athrow
    //   141: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   144: athrow
    //   145: aload_0
    //   146: iload #4
    //   148: aload_0
    //   149: invokeinterface ZKe : ()I
    //   154: imul
    //   155: invokeinterface ZvH : (I)V
    //   160: aload_0
    //   161: iconst_0
    //   162: invokeinterface ZcN : (Z)V
    //   167: aload_0
    //   168: invokeinterface ZKx : ()Z
    //   173: ifeq -> 301
    //   176: iconst_0
    //   177: istore #5
    //   179: iload #5
    //   181: aload_3
    //   182: invokevirtual length : ()I
    //   185: if_icmpge -> 301
    //   188: aload_3
    //   189: iload #5
    //   191: invokevirtual charAt : (I)C
    //   194: istore #6
    //   196: iload #6
    //   198: bipush #97
    //   200: if_icmplt -> 217
    //   203: iload #6
    //   205: bipush #102
    //   207: if_icmple -> 294
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   216: athrow
    //   217: iload #6
    //   219: bipush #65
    //   221: if_icmplt -> 245
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   230: athrow
    //   231: iload #6
    //   233: bipush #70
    //   235: if_icmple -> 294
    //   238: goto -> 245
    //   241: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   244: athrow
    //   245: iload #6
    //   247: bipush #48
    //   249: if_icmplt -> 273
    //   252: goto -> 259
    //   255: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   258: athrow
    //   259: iload #6
    //   261: bipush #57
    //   263: if_icmple -> 294
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   272: athrow
    //   273: new burp/Ztgu
    //   276: dup
    //   277: sipush #-18745
    //   280: sipush #-11563
    //   283: invokestatic a : (II)Ljava/lang/String;
    //   286: invokespecial <init> : (Ljava/lang/String;)V
    //   289: athrow
    //   290: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   293: athrow
    //   294: iinc #5, 1
    //   297: aload_2
    //   298: ifnonnull -> 179
    //   301: return
    // Exception table:
    //   from	to	target	type
    //   11	27	30	burp/Zs7w
    //   23	51	51	burp/Zs7w
    //   55	81	81	burp/Zs7w
    //   85	100	103	burp/Zs7w
    //   119	141	141	burp/Zs7w
    //   196	210	213	burp/Zs7w
    //   203	224	227	burp/Zs7w
    //   217	238	241	burp/Zs7w
    //   231	252	255	burp/Zs7w
    //   245	266	269	burp/Zs7w
    //   259	290	290	burp/Zs7w
  }
  
  public static void Zn(Zxgv paramZxgv) {
    paramZxgv.Zdp(0);
    paramZxgv.Zdg(1);
  }
  
  public static void ZT(String[] paramArrayOfString) {
    Ze = paramArrayOfString;
  }
  
  public static String[] ZK() {
    return Ze;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_4
    //   8: anewarray java/lang/String
    //   11: iconst_0
    //   12: istore_3
    //   13: ldc '¶bXÁ¤ \\rP8&ç\\bjñ0|Ð¸þío]Ü\\f(¦©!ÈXU\\r1ë\\n1éÔeÀoø!Ôj"¼èwY÷»¾4¾¸s?À¾¹LÄ¦J\\fºÃÎ{Ø4QgmS!`£4þÊ "NþÒ%Ô!bÜ,¿Ú`4$Å/u2åÈáRíýX¹©ÆÙ[\¦¥<g0n:ïÙ¥'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #118
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: invokestatic ZT : ([Ljava/lang/String;)V
    //   30: bipush #87
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc 'ÈÅüÓ,&¼!÷)ð4«®+ÈqÀ~¡ã%eÕûìÓ)Ê®6°raÉ%'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #45
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #70
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic burp/Ze9j.b : [Ljava/lang/String;
    //   139: bipush #7
    //   141: anewarray java/lang/String
    //   144: putstatic burp/Ze9j.c : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 267
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 249, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 239, 5 -> 244
    //   220: bipush #91
    //   222: goto -> 251
    //   225: bipush #118
    //   227: goto -> 251
    //   230: bipush #121
    //   232: goto -> 251
    //   235: iconst_3
    //   236: goto -> 251
    //   239: bipush #47
    //   241: goto -> 251
    //   244: bipush #8
    //   246: goto -> 251
    //   249: bipush #49
    //   251: ixor
    //   252: ixor
    //   253: i2c
    //   254: castore
    //   255: iinc #6, 1
    //   258: dup
    //   259: ifne -> 267
    //   262: dup2
    //   263: dup_x1
    //   264: goto -> 173
    //   267: dup2_x1
    //   268: pop2
    //   269: dup_x2
    //   270: iload #6
    //   272: if_icmpgt -> 169
    //   275: pop
    //   276: new java/lang/String
    //   279: dup_x1
    //   280: swap
    //   281: invokespecial <init> : ([C)V
    //   284: invokevirtual intern : ()Ljava/lang/String;
    //   287: swap
    //   288: pop
    //   289: swap
    //   290: tableswitch default -> 47, 0 -> 106
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB6C2) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      char c = 'Û';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze9j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */