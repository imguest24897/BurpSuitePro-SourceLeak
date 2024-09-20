package burp;

import java.util.List;

public class Zz44 {
  private static boolean ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static void Zf(List<Ztu8> paramList, Ztsi paramZtsi) {
    // Byte code:
    //   0: invokestatic Za : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: ifnonnull -> 9
    //   8: return
    //   9: iconst_0
    //   10: istore_3
    //   11: aload_0
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #4
    //   19: aload #4
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 360
    //   29: aload #4
    //   31: invokeinterface next : ()Ljava/lang/Object;
    //   36: checkcast burp/Ztu8
    //   39: astore #5
    //   41: aload #5
    //   43: sipush #3868
    //   46: sipush #-18524
    //   49: invokestatic a : (II)Ljava/lang/String;
    //   52: invokestatic Za : (Lburp/Ztu8;Ljava/lang/String;)Z
    //   55: ifeq -> 70
    //   58: aload_1
    //   59: aload #5
    //   61: invokeinterface ZE : (Lburp/Ztu8;)V
    //   66: iload_2
    //   67: ifeq -> 356
    //   70: aload #5
    //   72: sipush #3865
    //   75: sipush #18336
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: invokestatic Za : (Lburp/Ztu8;Ljava/lang/String;)Z
    //   84: ifeq -> 99
    //   87: aload_1
    //   88: aload #5
    //   90: invokeinterface Zs : (Lburp/Ztu8;)V
    //   95: iload_2
    //   96: ifeq -> 356
    //   99: aload #5
    //   101: sipush #3869
    //   104: sipush #-16227
    //   107: invokestatic a : (II)Ljava/lang/String;
    //   110: invokestatic Za : (Lburp/Ztu8;Ljava/lang/String;)Z
    //   113: ifeq -> 159
    //   116: aload #5
    //   118: invokeinterface ZlP : ()Lburp/Zs_n;
    //   123: sipush #3871
    //   126: sipush #14574
    //   129: invokestatic a : (II)Ljava/lang/String;
    //   132: invokeinterface ZIm : (Ljava/lang/String;)Lburp/Zs5n;
    //   137: astore #6
    //   139: aload #6
    //   141: invokestatic Zg : (Lburp/Zs5n;)Z
    //   144: ifeq -> 155
    //   147: aload_1
    //   148: aload #5
    //   150: invokeinterface Zb : (Lburp/Ztu8;)V
    //   155: iload_2
    //   156: ifeq -> 356
    //   159: iload_3
    //   160: ifeq -> 338
    //   163: aload #5
    //   165: invokestatic ZY : (Lburp/Ztu8;)Z
    //   168: ifeq -> 183
    //   171: aload_1
    //   172: invokeinterface ZR : ()V
    //   177: iconst_0
    //   178: istore_3
    //   179: iload_2
    //   180: ifeq -> 356
    //   183: aload #5
    //   185: invokeinterface ZlD : ()B
    //   190: iconst_3
    //   191: if_icmpne -> 206
    //   194: aload_1
    //   195: aload #5
    //   197: invokeinterface ZS : (Lburp/Ztu8;)V
    //   202: iload_2
    //   203: ifeq -> 356
    //   206: aload #5
    //   208: sipush #3864
    //   211: sipush #1602
    //   214: invokestatic a : (II)Ljava/lang/String;
    //   217: invokestatic Za : (Lburp/Ztu8;Ljava/lang/String;)Z
    //   220: ifeq -> 312
    //   223: aload #5
    //   225: invokeinterface ZlP : ()Lburp/Zs_n;
    //   230: astore #6
    //   232: aload #6
    //   234: sipush #3866
    //   237: sipush #30872
    //   240: invokestatic a : (II)Ljava/lang/String;
    //   243: invokeinterface ZIm : (Ljava/lang/String;)Lburp/Zs5n;
    //   248: astore #7
    //   250: aload #7
    //   252: invokestatic Zg : (Lburp/Zs5n;)Z
    //   255: ifeq -> 272
    //   258: aload_1
    //   259: aload #5
    //   261: aload #7
    //   263: invokeinterface ZQ : (Lburp/Ztu8;Lburp/Zs5n;)V
    //   268: iload_2
    //   269: ifeq -> 308
    //   272: aload #6
    //   274: sipush #3870
    //   277: sipush #-18868
    //   280: invokestatic a : (II)Ljava/lang/String;
    //   283: invokeinterface ZIm : (Ljava/lang/String;)Lburp/Zs5n;
    //   288: astore #8
    //   290: aload #8
    //   292: invokestatic Zg : (Lburp/Zs5n;)Z
    //   295: ifeq -> 308
    //   298: aload_1
    //   299: aload #5
    //   301: aload #8
    //   303: invokeinterface ZP : (Lburp/Ztu8;Lburp/Zs5n;)V
    //   308: iload_2
    //   309: ifeq -> 356
    //   312: aload #5
    //   314: invokestatic ZJ : (Lburp/Ztu8;)Z
    //   317: ifeq -> 356
    //   320: aload_1
    //   321: invokeinterface ZR : ()V
    //   326: aload_1
    //   327: aload #5
    //   329: invokeinterface Ze : (Lburp/Ztu8;)V
    //   334: iload_2
    //   335: ifeq -> 356
    //   338: aload #5
    //   340: invokestatic ZJ : (Lburp/Ztu8;)Z
    //   343: ifeq -> 356
    //   346: aload_1
    //   347: aload #5
    //   349: invokeinterface Ze : (Lburp/Ztu8;)V
    //   354: iconst_1
    //   355: istore_3
    //   356: iload_2
    //   357: ifeq -> 19
    //   360: iload_3
    //   361: ifeq -> 370
    //   364: aload_1
    //   365: invokeinterface ZR : ()V
    //   370: return
  }
  
  private static boolean Zg(Zs5n paramZs5n) {
    return (paramZs5n != null && Zsw8.ZS(paramZs5n.ZQG()));
  }
  
  public static void Zs(boolean paramBoolean) {
    ZX = paramBoolean;
  }
  
  public static boolean ZT() {
    return ZX;
  }
  
  public static boolean Za() {
    boolean bool = ZT();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_1
    //   10: ldc 'ÒÓ\\r°©fn"b7ò¾U´Ñ'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zs : (Z)V
    //   22: iconst_5
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #68
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 146
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc 'Z¥b>\\t¡Zm'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #6
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #103
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zz44.a : [Ljava/lang/String;
    //   135: bipush #7
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zz44.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #77
    //   218: goto -> 248
    //   221: bipush #100
    //   223: goto -> 248
    //   226: bipush #61
    //   228: goto -> 248
    //   231: bipush #70
    //   233: goto -> 248
    //   236: bipush #56
    //   238: goto -> 248
    //   241: bipush #13
    //   243: goto -> 248
    //   246: bipush #79
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xF1C) & 0xFFFF;
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
      byte b1 = 82;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz44.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */