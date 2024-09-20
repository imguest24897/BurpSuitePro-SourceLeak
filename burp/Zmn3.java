package burp;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Zmn3 {
  private static int[] ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static void ZE(Zkc7 paramZkc7, Zs4f paramZs4f) throws IOException {
    int[] arrayOfInt = ZU();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str1 = (null == paramZkc7.Zv6()) ? BigDecimal.ZERO.toString() : paramZkc7.Zv6().Z_s().toPlainString();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str2 = (null == paramZkc7.Zv8()) ? BigDecimal.ZERO.toString() : paramZkc7.Zv8().Z_s().toPlainString();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str3 = (null == paramZkc7.Zv7()) ? BigInteger.ZERO.toString() : paramZkc7.Zv7().ZtG().toString();
    try {
      paramZs4f.Zk("r", paramZkc7.ZvJ());
      paramZs4f.ZL(a(13049, 27848), paramZkc7.ZvG().Z_s().toPlainString());
      paramZs4f.ZL(a(13052, 14759), paramZkc7.ZvH().Z_s().toPlainString());
      paramZs4f.ZL(a(13048, 29200), str1);
      paramZs4f.Zb("h", paramZkc7.Zv3());
      paramZs4f.Zb("m", paramZkc7.ZvK());
      paramZs4f.Zb("a", paramZkc7.Zv5());
      paramZs4f.Zb("n", paramZkc7.ZvP());
      paramZs4f.Zb("f", paramZkc7.Zvv());
      paramZs4f.Zk("h", paramZkc7.ZvX());
      paramZs4f.ZL(a(13053, 32221), str2);
      paramZs4f.ZL(a(13051, 14011), str3);
      paramZs4f.Zb("n", paramZkc7.ZvL());
      if (Zbqc.Zwu() == null)
        ZP(new int[5]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public static void ZX(Zkc7 paramZkc7) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface ZvX : ()Z
    //   6: istore_2
    //   7: invokestatic ZU : ()[I
    //   10: aload_0
    //   11: invokeinterface ZvJ : ()Z
    //   16: istore_3
    //   17: aload_0
    //   18: invokeinterface ZvH : ()Lburp/Zmu9;
    //   23: invokeinterface Z_s : ()Ljava/math/BigDecimal;
    //   28: astore #4
    //   30: astore_1
    //   31: aload_0
    //   32: invokeinterface ZvG : ()Lburp/Zmu9;
    //   37: invokeinterface Z_s : ()Ljava/math/BigDecimal;
    //   42: astore #5
    //   44: aload_0
    //   45: invokeinterface Zv6 : ()Lburp/Zmu9;
    //   50: invokeinterface Z_s : ()Ljava/math/BigDecimal;
    //   55: astore #6
    //   57: iload_3
    //   58: ifeq -> 70
    //   61: aload_0
    //   62: invokeinterface Zv3 : ()I
    //   67: iflt -> 163
    //   70: iload_3
    //   71: ifne -> 85
    //   74: aload #6
    //   76: getstatic java/math/BigDecimal.ZERO : Ljava/math/BigDecimal;
    //   79: invokevirtual equals : (Ljava/lang/Object;)Z
    //   82: ifne -> 163
    //   85: iload_3
    //   86: ifne -> 113
    //   89: iload_2
    //   90: ifeq -> 113
    //   93: aload #6
    //   95: new java/math/BigDecimal
    //   98: dup
    //   99: aload #6
    //   101: invokevirtual toBigInteger : ()Ljava/math/BigInteger;
    //   104: invokespecial <init> : (Ljava/math/BigInteger;)V
    //   107: invokevirtual equals : (Ljava/lang/Object;)Z
    //   110: ifeq -> 163
    //   113: iload_3
    //   114: ifne -> 138
    //   117: aload #5
    //   119: aload #4
    //   121: invokevirtual compareTo : (Ljava/math/BigDecimal;)I
    //   124: ifle -> 138
    //   127: aload #6
    //   129: getstatic java/math/BigDecimal.ZERO : Ljava/math/BigDecimal;
    //   132: invokevirtual compareTo : (Ljava/math/BigDecimal;)I
    //   135: ifgt -> 163
    //   138: iload_3
    //   139: ifne -> 174
    //   142: aload #4
    //   144: aload #5
    //   146: invokevirtual compareTo : (Ljava/math/BigDecimal;)I
    //   149: ifle -> 174
    //   152: aload #6
    //   154: getstatic java/math/BigDecimal.ZERO : Ljava/math/BigDecimal;
    //   157: invokevirtual compareTo : (Ljava/math/BigDecimal;)I
    //   160: ifge -> 174
    //   163: aload_0
    //   164: iconst_0
    //   165: invokeinterface ZvH : (I)V
    //   170: aload_1
    //   171: ifnonnull -> 256
    //   174: iload_3
    //   175: ifeq -> 194
    //   178: aload_0
    //   179: aload_0
    //   180: invokeinterface Zv3 : ()I
    //   185: invokeinterface ZvH : (I)V
    //   190: aload_1
    //   191: ifnonnull -> 256
    //   194: aload #4
    //   196: aload #5
    //   198: invokevirtual subtract : (Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
    //   201: aload #6
    //   203: getstatic java/math/RoundingMode.HALF_UP : Ljava/math/RoundingMode;
    //   206: invokevirtual divide : (Ljava/math/BigDecimal;Ljava/math/RoundingMode;)Ljava/math/BigDecimal;
    //   209: getstatic java/math/BigDecimal.ONE : Ljava/math/BigDecimal;
    //   212: invokevirtual add : (Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
    //   215: astore #7
    //   217: aload #7
    //   219: new java/math/BigDecimal
    //   222: dup
    //   223: ldc 2147483647
    //   225: invokespecial <init> : (I)V
    //   228: invokevirtual compareTo : (Ljava/math/BigDecimal;)I
    //   231: ifle -> 245
    //   234: aload_0
    //   235: iconst_m1
    //   236: invokeinterface ZvH : (I)V
    //   241: aload_1
    //   242: ifnonnull -> 256
    //   245: aload_0
    //   246: aload #7
    //   248: invokevirtual intValue : ()I
    //   251: invokeinterface ZvH : (I)V
    //   256: return
  }
  
  public static void Zs(Zr_4 paramZr_4, Zkc7 paramZkc7) {
    // Byte code:
    //   0: invokestatic ZU : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokeinterface ZvX : ()Z
    //   10: ifeq -> 43
    //   13: aload_1
    //   14: invokeinterface ZvG : ()Lburp/Zmu9;
    //   19: invokeinterface Z_s : ()Ljava/math/BigDecimal;
    //   24: invokevirtual toBigInteger : ()Ljava/math/BigInteger;
    //   27: astore_3
    //   28: aload_1
    //   29: aload_3
    //   30: aload_0
    //   31: invokestatic Z_ : (Ljava/math/BigInteger;Lburp/Zr_4;)Lburp/Ztju;
    //   34: invokeinterface ZW : (Lburp/Ztju;)V
    //   39: aload_2
    //   40: ifnonnull -> 55
    //   43: aload_1
    //   44: aload_1
    //   45: invokeinterface ZvG : ()Lburp/Zmu9;
    //   50: invokeinterface Zj : (Lburp/Zmu9;)V
    //   55: aload_1
    //   56: iconst_0
    //   57: invokeinterface ZNi : (I)V
    //   62: return
  }
  
  public static void Zy(Zkc7 paramZkc7) throws Zs7w, Ztku {
    try {
      paramZkc7.ZyK();
      if (paramZkc7.Zyv() == 0)
        throw new Zs7w(a(13050, -9468)); 
    } catch (Zs7w zs7w) {
      throw a(null);
    } 
    paramZkc7.Zy4();
  }
  
  public static boolean ZS(Zkc7 paramZkc7, Object paramObject) {
    if (!(paramObject instanceof Zkc7))
      return false; 
    Zkc7 zkc7 = (Zkc7)paramObject;
    return (paramZkc7.ZvX() != zkc7.ZvX()) ? false : ((paramZkc7.Zv3() != zkc7.Zv3()) ? false : ((paramZkc7.Zvv() != zkc7.Zvv()) ? false : ((paramZkc7.Zv5() != zkc7.Zv5()) ? false : ((paramZkc7.ZvP() != zkc7.ZvP()) ? false : ((paramZkc7.ZvK() != zkc7.ZvK()) ? false : ((paramZkc7.ZvL() != zkc7.ZvL()) ? false : ((paramZkc7.ZvJ() != zkc7.ZvJ()) ? false : (((paramZkc7.ZvG() != null) ? !paramZkc7.ZvG().equals(zkc7.ZvG()) : (zkc7.ZvG() != null)) ? false : ((!paramZkc7.ZvX() && ((paramZkc7.Zv8() != null) ? !paramZkc7.Zv8().equals(zkc7.Zv8()) : (zkc7.Zv8() != null))) ? false : ((paramZkc7.ZvX() && ((paramZkc7.Zv7() != null) ? !paramZkc7.Zv7().equals(zkc7.Zv7()) : (zkc7.Zv7() != null))) ? false : ((!paramZkc7.ZvJ() && ((paramZkc7.Zv6() != null) ? !paramZkc7.Zv6().equals(zkc7.Zv6()) : (zkc7.Zv6() != null))) ? false : ((paramZkc7.ZvH() != null) ? paramZkc7.ZvH().equals(zkc7.ZvH()) : ((zkc7.ZvH() == null))))))))))))));
  }
  
  public static void ZP(int[] paramArrayOfint) {
    ZB = paramArrayOfint;
  }
  
  public static int[] ZU() {
    return ZB;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Jö1V§oç|(ÖÚTº@c/Ù#wªìô'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: newarray int
    //   21: iconst_2
    //   22: istore_1
    //   23: iconst_m1
    //   24: istore_0
    //   25: invokestatic ZP : ([I)V
    //   28: bipush #53
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 147
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
    //   73: ldc 'µ§È'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: iconst_2
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #52
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zmn3.a : [Ljava/lang/String;
    //   136: bipush #6
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zmn3.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #17
    //   218: goto -> 248
    //   221: bipush #101
    //   223: goto -> 248
    //   226: bipush #54
    //   228: goto -> 248
    //   231: bipush #26
    //   233: goto -> 248
    //   236: bipush #38
    //   238: goto -> 248
    //   241: bipush #65
    //   243: goto -> 248
    //   246: bipush #13
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x32F9) & 0xFFFF;
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
      byte b1 = 22;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmn3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */