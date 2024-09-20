package burp;

import java.util.Set;

public class Zrk0 {
  private static final String[] a;
  
  private static final String[] b;
  
  public static Set<Zs13> Zo(Zstu paramZstu) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: invokestatic ZM : ()I
    //   5: aload_0
    //   6: invokeinterface Zpu : ()I
    //   11: istore #4
    //   13: istore_1
    //   14: new java/util/LinkedHashSet
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: iconst_1
    //   24: istore #6
    //   26: iload_2
    //   27: iload #4
    //   29: bipush #12
    //   31: isub
    //   32: if_icmpge -> 203
    //   35: aload_0
    //   36: iload_2
    //   37: invokeinterface Zp : (I)B
    //   42: istore #7
    //   44: iload #7
    //   46: invokestatic isDigit : (I)Z
    //   49: ifeq -> 181
    //   52: iload #6
    //   54: ifeq -> 181
    //   57: iload_2
    //   58: iconst_1
    //   59: iadd
    //   60: istore_3
    //   61: iconst_1
    //   62: istore #8
    //   64: iconst_0
    //   65: istore #9
    //   67: iload_3
    //   68: iload #4
    //   70: if_icmpge -> 137
    //   73: iload #9
    //   75: iconst_3
    //   76: if_icmpgt -> 137
    //   79: iload #8
    //   81: bipush #16
    //   83: if_icmpge -> 137
    //   86: aload_0
    //   87: iload_3
    //   88: invokeinterface Zp : (I)B
    //   93: istore #7
    //   95: iload #7
    //   97: invokestatic isDigit : (I)Z
    //   100: ifeq -> 113
    //   103: iinc #8, 1
    //   106: iconst_0
    //   107: istore #9
    //   109: iload_1
    //   110: ifeq -> 130
    //   113: iload #7
    //   115: bipush #32
    //   117: if_icmpeq -> 127
    //   120: iload #7
    //   122: bipush #45
    //   124: if_icmpne -> 137
    //   127: iinc #9, 1
    //   130: iinc #3, 1
    //   133: iload_1
    //   134: ifeq -> 67
    //   137: iload #8
    //   139: invokestatic ZB : (I)Z
    //   142: ifeq -> 172
    //   145: iload_3
    //   146: iload #4
    //   148: if_icmpge -> 164
    //   151: aload_0
    //   152: iload_3
    //   153: invokeinterface Zp : (I)B
    //   158: invokestatic isLetterOrDigit : (I)Z
    //   161: ifne -> 172
    //   164: aload_0
    //   165: iload_2
    //   166: iload_3
    //   167: aload #5
    //   169: invokestatic ZY : (Lburp/Zstu;IILjava/util/Set;)V
    //   172: iload_3
    //   173: istore_2
    //   174: iconst_0
    //   175: istore #6
    //   177: iload_1
    //   178: ifeq -> 199
    //   181: iload #7
    //   183: invokestatic isLetterOrDigit : (I)Z
    //   186: ifne -> 193
    //   189: iconst_1
    //   190: goto -> 194
    //   193: iconst_0
    //   194: istore #6
    //   196: iinc #2, 1
    //   199: iload_1
    //   200: ifeq -> 26
    //   203: aload #5
    //   205: invokestatic Zwu : ()[Lburp/Zbqc;
    //   208: ifnonnull -> 218
    //   211: iinc #1, 1
    //   214: iload_1
    //   215: invokestatic ZY : (I)V
    //   218: areturn
  }
  
  private static void ZY(Zstu paramZstu, int paramInt1, int paramInt2, Set<Zs13> paramSet) {
    String str = Zruv.ZO(paramZstu, paramInt1, paramInt2 - paramInt1).replace(" ", "").replace("-", "");
    if (ZD(str))
      paramSet.add(new Zs13(str, paramInt1, paramInt2)); 
  }
  
  private static boolean ZB(int paramInt) {
    return (paramInt >= 13 && paramInt <= 16);
  }
  
  private static boolean ZD(String paramString) {
    return (ZB(paramString) && Ze(paramString));
  }
  
  private static boolean ZB(String paramString) {
    switch (paramString.length()) {
      case 13:
      
      case 14:
        return (paramString.startsWith(a(-10270, 8002)) || paramString.startsWith(a(-10254, -6046)) || paramString.startsWith(a(-10245, 15081)) || paramString.startsWith(a(-10252, 16780)) || paramString.startsWith(a(-10243, 32340)) || paramString.startsWith(a(-10241, -29889)) || paramString.startsWith(a(-10271, 144)) || paramString.startsWith(a(-10249, -13413)));
      case 15:
        return (paramString.startsWith(a(-10247, 24720)) || paramString.startsWith(a(-10269, -8550)) || paramString.startsWith(a(-10251, -6933)) || paramString.startsWith(a(-10246, 6447)));
      case 16:
        return (paramString.startsWith("4") || paramString.startsWith(a(-10256, 10696)) || paramString.startsWith(a(-10242, -13328)) || paramString.startsWith(a(-10250, -8098)) || paramString.startsWith(a(-10248, -30894)) || paramString.startsWith(a(-10255, 16921)) || paramString.startsWith("5") || paramString.startsWith(a(-10272, -31344)) || paramString.startsWith(a(-10253, 1122)) || paramString.startsWith(a(-10244, 11782)));
    } 
    return false;
  }
  
  private static boolean Ze(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: invokestatic ZM : ()I
    //   5: iconst_0
    //   6: istore_3
    //   7: istore_1
    //   8: iload_3
    //   9: aload_0
    //   10: invokevirtual length : ()I
    //   13: if_icmpge -> 77
    //   16: aload_0
    //   17: aload_0
    //   18: invokevirtual length : ()I
    //   21: iload_3
    //   22: isub
    //   23: iconst_1
    //   24: isub
    //   25: invokevirtual charAt : (I)C
    //   28: bipush #48
    //   30: isub
    //   31: istore #4
    //   33: iload_3
    //   34: iconst_2
    //   35: irem
    //   36: iconst_1
    //   37: if_icmpne -> 46
    //   40: iload #4
    //   42: iconst_2
    //   43: imul
    //   44: istore #4
    //   46: iload #4
    //   48: bipush #9
    //   50: if_icmple -> 65
    //   53: iload_2
    //   54: iload #4
    //   56: bipush #9
    //   58: isub
    //   59: iadd
    //   60: istore_2
    //   61: iload_1
    //   62: ifeq -> 70
    //   65: iload_2
    //   66: iload #4
    //   68: iadd
    //   69: istore_2
    //   70: iinc #3, 1
    //   73: iload_1
    //   74: ifeq -> 8
    //   77: iload_2
    //   78: bipush #10
    //   80: irem
    //   81: ifne -> 88
    //   84: iconst_1
    //   85: goto -> 89
    //   88: iconst_0
    //   89: ireturn
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'AÆ¼¥;´kêg=OeÂbPùïû\\f¼àÁZÚ´ üÈ_Î9ö©û®'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #100
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc ']½ã'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_3
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #77
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
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
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zrk0.a : [Ljava/lang/String;
    //   130: bipush #20
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zrk0.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #33
    //   214: goto -> 243
    //   217: iconst_1
    //   218: goto -> 243
    //   221: bipush #123
    //   223: goto -> 243
    //   226: bipush #65
    //   228: goto -> 243
    //   231: bipush #67
    //   233: goto -> 243
    //   236: bipush #101
    //   238: goto -> 243
    //   241: bipush #39
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD7F0) & 0xFFFF;
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
      char c = 'î';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrk0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */