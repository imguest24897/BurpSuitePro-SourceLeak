package com.fasterxml;

import burp.Zbqc;
import java.math.BigDecimal;
import java.util.function.BiFunction;

public final class Zg4 {
  private static final BigDecimal ZX;
  
  private static Zbqc[] ZA;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static String Zp(long paramLong, int paramInt) {
    // Byte code:
    //   0: invokestatic Zf : ()[Lburp/Zbqc;
    //   3: new java/lang/StringBuilder
    //   6: dup
    //   7: bipush #20
    //   9: invokespecial <init> : (I)V
    //   12: lload_0
    //   13: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   16: bipush #46
    //   18: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   21: astore #4
    //   23: astore_3
    //   24: iload_2
    //   25: i2l
    //   26: lconst_0
    //   27: lcmp
    //   28: ifne -> 66
    //   31: lload_0
    //   32: lconst_0
    //   33: lcmp
    //   34: ifne -> 47
    //   37: sipush #16250
    //   40: sipush #-21326
    //   43: invokestatic a : (II)Ljava/lang/String;
    //   46: areturn
    //   47: aload #4
    //   49: sipush #16251
    //   52: sipush #-25537
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload_3
    //   63: ifnonnull -> 126
    //   66: new java/lang/StringBuilder
    //   69: dup
    //   70: bipush #9
    //   72: invokespecial <init> : (I)V
    //   75: astore #5
    //   77: aload #5
    //   79: iload_2
    //   80: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload #5
    //   86: invokevirtual length : ()I
    //   89: istore #6
    //   91: bipush #9
    //   93: iload #6
    //   95: isub
    //   96: istore #7
    //   98: iload #7
    //   100: ifle -> 118
    //   103: iinc #7, -1
    //   106: aload #4
    //   108: bipush #48
    //   110: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload_3
    //   115: ifnonnull -> 98
    //   118: aload #4
    //   120: aload #5
    //   122: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: aload #4
    //   128: invokevirtual toString : ()Ljava/lang/String;
    //   131: areturn
  }
  
  public static BigDecimal ZL(long paramLong, int paramInt) {
    return (paramInt == 0L) ? ((paramLong == 0L) ? BigDecimal.ZERO.setScale(1) : BigDecimal.valueOf(paramLong).setScale(9)) : Zyt.Zu(Zp(paramLong, paramInt), false);
  }
  
  public static <T> T ZX(BigDecimal paramBigDecimal, BiFunction<Long, Integer, T> paramBiFunction) {
    // Byte code:
    //   0: invokestatic Zf : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: bipush #9
    //   6: invokevirtual scaleByPowerOfTen : (I)Ljava/math/BigDecimal;
    //   9: astore #6
    //   11: astore_2
    //   12: aload #6
    //   14: invokevirtual precision : ()I
    //   17: aload #6
    //   19: invokevirtual scale : ()I
    //   22: isub
    //   23: ifgt -> 36
    //   26: iconst_0
    //   27: dup
    //   28: istore #5
    //   30: i2l
    //   31: lstore_3
    //   32: aload_2
    //   33: ifnonnull -> 103
    //   36: aload_0
    //   37: invokevirtual scale : ()I
    //   40: bipush #-63
    //   42: if_icmpge -> 55
    //   45: iconst_0
    //   46: dup
    //   47: istore #5
    //   49: i2l
    //   50: lstore_3
    //   51: aload_2
    //   52: ifnonnull -> 103
    //   55: aload_0
    //   56: invokevirtual longValue : ()J
    //   59: lstore_3
    //   60: aload #6
    //   62: lload_3
    //   63: invokestatic valueOf : (J)Ljava/math/BigDecimal;
    //   66: bipush #9
    //   68: invokevirtual scaleByPowerOfTen : (I)Ljava/math/BigDecimal;
    //   71: invokevirtual subtract : (Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
    //   74: invokevirtual intValue : ()I
    //   77: istore #5
    //   79: lload_3
    //   80: lconst_0
    //   81: lcmp
    //   82: ifge -> 103
    //   85: lload_3
    //   86: getstatic java/time/Instant.MIN : Ljava/time/Instant;
    //   89: invokevirtual getEpochSecond : ()J
    //   92: lcmp
    //   93: ifle -> 103
    //   96: iload #5
    //   98: invokestatic abs : (I)I
    //   101: istore #5
    //   103: aload_1
    //   104: lload_3
    //   105: invokestatic valueOf : (J)Ljava/lang/Long;
    //   108: iload #5
    //   110: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   113: invokeinterface apply : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   118: invokestatic Zwu : ()[Lburp/Zbqc;
    //   121: ifnonnull -> 131
    //   124: iconst_5
    //   125: anewarray burp/Zbqc
    //   128: invokestatic Zf : ([Lburp/Zbqc;)V
    //   131: areturn
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: iconst_2
    //   9: anewarray burp/Zbqc
    //   12: ldc 'mK\\tA\\fØK­\'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: iconst_3
    //   22: istore_1
    //   23: invokestatic Zf : ([Lburp/Zbqc;)V
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #102
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 88
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: aload #5
    //   75: putstatic com/fasterxml/Zg4.a : [Ljava/lang/String;
    //   78: iconst_2
    //   79: anewarray java/lang/String
    //   82: putstatic com/fasterxml/Zg4.b : [Ljava/lang/String;
    //   85: goto -> 231
    //   88: dup_x2
    //   89: pop
    //   90: invokevirtual toCharArray : ()[C
    //   93: dup_x1
    //   94: arraylength
    //   95: dup_x2
    //   96: pop
    //   97: iconst_0
    //   98: istore #6
    //   100: dup2_x1
    //   101: pop2
    //   102: dup_x2
    //   103: iconst_1
    //   104: if_icmpgt -> 204
    //   107: dup2
    //   108: swap
    //   109: iload #6
    //   111: dup2_x1
    //   112: caload
    //   113: swap
    //   114: iload #6
    //   116: bipush #7
    //   118: irem
    //   119: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #14
    //   158: goto -> 188
    //   161: bipush #44
    //   163: goto -> 188
    //   166: bipush #86
    //   168: goto -> 188
    //   171: bipush #112
    //   173: goto -> 188
    //   176: bipush #79
    //   178: goto -> 188
    //   181: bipush #20
    //   183: goto -> 188
    //   186: bipush #112
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 111
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 107
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
    //   228: goto -> 45
    //   231: new java/math/BigDecimal
    //   234: dup
    //   235: ldc2_w 1000000000
    //   238: invokespecial <init> : (J)V
    //   241: putstatic com/fasterxml/Zg4.ZX : Ljava/math/BigDecimal;
    //   244: return
  }
  
  public static void Zf(Zbqc[] paramArrayOfZbqc) {
    ZA = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zf() {
    return ZA;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3F7A) & 0xFFFF;
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
      char c = '¥';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */