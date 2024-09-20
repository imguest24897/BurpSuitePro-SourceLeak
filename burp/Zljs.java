package burp;

import net.portswigger.Zzc;

public class Zljs implements Zre8 {
  private static String ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static boolean Zq(String paramString) {
    String str = ZM();
    byte b = 0;
    while (b < paramString.length()) {
      char c = paramString.charAt(b);
      if (c == '+')
        return true; 
      if (c == '%' && paramString.length() > b + 2 && Zt4w.Zv(paramString.charAt(b + 1)) && Zt4w.Zv(paramString.charAt(b + 2)))
        return true; 
      b++;
      if (str == null)
        break; 
    } 
    return false;
  }
  
  public String Zq() {
    return a(-18309, -26631);
  }
  
  public String ZM(String paramString) {
    return Zzc.ZL(paramString);
  }
  
  public String ZI(String paramString) {
    // Byte code:
    //   0: invokestatic ZM : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnull -> 15
    //   8: aload_1
    //   9: invokevirtual length : ()I
    //   12: ifne -> 17
    //   15: aload_1
    //   16: areturn
    //   17: new java/lang/StringBuilder
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: astore_3
    //   25: iconst_0
    //   26: istore #4
    //   28: iconst_0
    //   29: istore #5
    //   31: iload #5
    //   33: aload_1
    //   34: invokevirtual length : ()I
    //   37: if_icmpge -> 550
    //   40: aload_1
    //   41: iload #5
    //   43: invokevirtual charAt : (I)C
    //   46: istore #6
    //   48: iload #6
    //   50: bipush #32
    //   52: if_icmplt -> 62
    //   55: iload #6
    //   57: bipush #127
    //   59: if_icmpne -> 102
    //   62: aload_3
    //   63: sipush #-18310
    //   66: sipush #11950
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: iconst_1
    //   73: anewarray java/lang/Object
    //   76: dup
    //   77: iconst_0
    //   78: sipush #255
    //   81: iload #6
    //   83: iand
    //   84: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   87: aastore
    //   88: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: iconst_1
    //   96: istore #4
    //   98: aload_2
    //   99: ifnonnull -> 543
    //   102: iload #6
    //   104: tableswitch default -> 536, 32 -> 496, 33 -> 536, 34 -> 496, 35 -> 496, 36 -> 496, 37 -> 496, 38 -> 496, 39 -> 536, 40 -> 536, 41 -> 536, 42 -> 536, 43 -> 496, 44 -> 496, 45 -> 536, 46 -> 536, 47 -> 496, 48 -> 536, 49 -> 536, 50 -> 536, 51 -> 536, 52 -> 536, 53 -> 536, 54 -> 536, 55 -> 536, 56 -> 536, 57 -> 536, 58 -> 496, 59 -> 496, 60 -> 496, 61 -> 496, 62 -> 496, 63 -> 496, 64 -> 496, 65 -> 536, 66 -> 536, 67 -> 536, 68 -> 536, 69 -> 536, 70 -> 536, 71 -> 536, 72 -> 536, 73 -> 536, 74 -> 536, 75 -> 536, 76 -> 536, 77 -> 536, 78 -> 536, 79 -> 536, 80 -> 536, 81 -> 536, 82 -> 536, 83 -> 536, 84 -> 536, 85 -> 536, 86 -> 536, 87 -> 536, 88 -> 536, 89 -> 536, 90 -> 536, 91 -> 496, 92 -> 496, 93 -> 496, 94 -> 496, 95 -> 536, 96 -> 496, 97 -> 536, 98 -> 536, 99 -> 536, 100 -> 536, 101 -> 536, 102 -> 536, 103 -> 536, 104 -> 536, 105 -> 536, 106 -> 536, 107 -> 536, 108 -> 536, 109 -> 536, 110 -> 536, 111 -> 536, 112 -> 536, 113 -> 536, 114 -> 536, 115 -> 536, 116 -> 536, 117 -> 536, 118 -> 536, 119 -> 536, 120 -> 536, 121 -> 536, 122 -> 536, 123 -> 496, 124 -> 496, 125 -> 496
    //   496: aload_3
    //   497: sipush #-18312
    //   500: sipush #1508
    //   503: invokestatic a : (II)Ljava/lang/String;
    //   506: iconst_1
    //   507: anewarray java/lang/Object
    //   510: dup
    //   511: iconst_0
    //   512: sipush #255
    //   515: iload #6
    //   517: iand
    //   518: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   521: aastore
    //   522: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   525: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   528: pop
    //   529: iconst_1
    //   530: istore #4
    //   532: aload_2
    //   533: ifnonnull -> 543
    //   536: aload_3
    //   537: iload #6
    //   539: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   542: pop
    //   543: iinc #5, 1
    //   546: aload_2
    //   547: ifnonnull -> 31
    //   550: iload #4
    //   552: ifeq -> 560
    //   555: aload_3
    //   556: invokevirtual toString : ()Ljava/lang/String;
    //   559: areturn
    //   560: aload_1
    //   561: areturn
  }
  
  public static void Zb(String paramString) {
    ZM = paramString;
  }
  
  public static String ZM() {
    return ZM;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'FkPUIb'
    //   10: ldc 'ß|D.z\\f¢üv-8Í2à¶ç@`·³W'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zb : (Ljava/lang/String;)V
    //   22: bipush #6
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #60
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 87
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: aload #5
    //   74: putstatic burp/Zljs.a : [Ljava/lang/String;
    //   77: iconst_3
    //   78: anewarray java/lang/String
    //   81: putstatic burp/Zljs.b : [Ljava/lang/String;
    //   84: goto -> 231
    //   87: dup_x2
    //   88: pop
    //   89: invokevirtual toCharArray : ()[C
    //   92: dup_x1
    //   93: arraylength
    //   94: dup_x2
    //   95: pop
    //   96: iconst_0
    //   97: istore #6
    //   99: dup2_x1
    //   100: pop2
    //   101: dup_x2
    //   102: iconst_1
    //   103: if_icmpgt -> 204
    //   106: dup2
    //   107: swap
    //   108: iload #6
    //   110: dup2_x1
    //   111: caload
    //   112: swap
    //   113: iload #6
    //   115: bipush #7
    //   117: irem
    //   118: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #103
    //   158: goto -> 188
    //   161: bipush #38
    //   163: goto -> 188
    //   166: bipush #76
    //   168: goto -> 188
    //   171: bipush #113
    //   173: goto -> 188
    //   176: bipush #32
    //   178: goto -> 188
    //   181: bipush #41
    //   183: goto -> 188
    //   186: bipush #125
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 110
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 106
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 44
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB87A) & 0xFFFF;
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
      byte b1 = 31;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zljs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */