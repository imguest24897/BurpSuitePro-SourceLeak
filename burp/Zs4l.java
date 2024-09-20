package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zs4l<T, U> implements Zzl0, Ztbz {
  private final Zm51 Zv;
  
  private final Zxok<T, U> ZC;
  
  private final Zex3<T, U> Zm;
  
  private final List<Zklo> Zu;
  
  private final List<Zzkg> Zp;
  
  private Zesa<T, U> Zn;
  
  private String Zr;
  
  private boolean Zs;
  
  private static int[] ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zs4l(String paramString, Zm51 paramZm51, Zex3<T, U> paramZex3, long paramLong) {
    this(paramString, paramZm51, paramZex3, new Zxok<>(paramLong));
  }
  
  private Zs4l(String paramString, Zm51 paramZm51, Zex3<T, U> paramZex3, Zxok<T, U> paramZxok) {
    this.Zr = paramString;
    this.Zv = paramZm51;
    this.Zm = paramZex3;
    this.ZC = paramZxok;
    this.Zs = true;
    this.Zp = new CopyOnWriteArrayList<>();
    this.Zu = new CopyOnWriteArrayList<>();
  }
  
  public void ZC(String paramString) {
    if (this.Zr == null || !this.Zr.equals(paramString)) {
      this.Zr = paramString;
      this.Zs = true;
    } 
  }
  
  public U ZQ(T paramT, long paramLong, U paramU) {
    if (this.Zs) {
      this.Zn = ZA(this.Zr);
      this.Zs = false;
      if (this.Zn == null && paramU instanceof Throwable) {
        Throwable throwable = (Throwable)paramU;
        Zl(throwable, paramLong, this.Zr);
      } 
    } 
    return this.ZC.Zh(this.Zn, paramT, paramLong, paramU);
  }
  
  public void Zf(Zklo paramZklo) {
    this.Zu.add(paramZklo);
  }
  
  public void Zm(Zzkg paramZzkg) {
    this.Zp.add(paramZzkg);
  }
  
  private Zesa<T, U> ZA(String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 10
    //   4: aconst_null
    //   5: areturn
    //   6: invokestatic a : (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
    //   9: athrow
    //   10: aload_0
    //   11: getfield Zv : Lburp/Zm51;
    //   14: sipush #-10133
    //   17: sipush #-7567
    //   20: invokestatic a : (II)Ljava/lang/String;
    //   23: aload_1
    //   24: invokeinterface compile : (Ljava/lang/String;Ljava/lang/String;)Lnet/portswigger/javatooling/api/CompilationResult;
    //   29: astore_2
    //   30: aload_2
    //   31: invokevirtual errors : ()Ljava/util/Set;
    //   34: invokeinterface isEmpty : ()Z
    //   39: ifeq -> 215
    //   42: aload_2
    //   43: invokevirtual compiledClasses : ()Ljava/util/Set;
    //   46: astore_3
    //   47: new burp/Zxx9
    //   50: dup
    //   51: aload_3
    //   52: invokespecial <init> : (Ljava/util/Set;)V
    //   55: astore #4
    //   57: aload #4
    //   59: sipush #-10134
    //   62: sipush #-10633
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: invokevirtual loadClass : (Ljava/lang/String;)Ljava/lang/Class;
    //   71: astore #5
    //   73: aload #5
    //   75: aload_0
    //   76: getfield Zm : Lburp/Zex3;
    //   79: invokeinterface Za : ()Ljava/util/List;
    //   84: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   89: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   94: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   99: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   104: invokeinterface toArray : (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    //   109: checkcast [Ljava/lang/Class;
    //   112: invokevirtual getConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   115: astore #6
    //   117: aload_0
    //   118: getfield Zm : Lburp/Zex3;
    //   121: invokeinterface Za : ()Ljava/util/List;
    //   126: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   131: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   136: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   141: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   146: invokeinterface toArray : (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    //   151: astore #7
    //   153: new burp/Zesa
    //   156: dup
    //   157: aload #6
    //   159: aload #7
    //   161: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   164: aload #5
    //   166: aload_0
    //   167: getfield Zm : Lburp/Zex3;
    //   170: invokeinterface ZM : ()Ljava/lang/String;
    //   175: iconst_1
    //   176: anewarray java/lang/Class
    //   179: dup
    //   180: iconst_0
    //   181: aload_0
    //   182: getfield Zm : Lburp/Zex3;
    //   185: invokeinterface ZF : ()Ljava/lang/Class;
    //   190: aastore
    //   191: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   194: aload_0
    //   195: aload_1
    //   196: <illegal opcode> accept : (Lburp/Zs4l;Ljava/lang/String;)Ljava/util/function/BiConsumer;
    //   201: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V
    //   204: areturn
    //   205: astore #5
    //   207: aload #5
    //   209: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   212: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   215: aconst_null
    //   216: areturn
    // Exception table:
    //   from	to	target	type
    //   0	6	6	java/lang/ClassNotFoundException
    //   57	204	205	java/lang/ClassNotFoundException
    //   57	204	205	java/lang/NoSuchMethodException
    //   57	204	205	java/lang/InstantiationException
    //   57	204	205	java/lang/IllegalAccessException
    //   57	204	205	java/lang/reflect/InvocationTargetException
  }
  
  private void Zl(Throwable paramThrowable, long paramLong, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp : Ljava/util/List;
    //   4: aload_1
    //   5: lload_2
    //   6: aload #4
    //   8: <illegal opcode> accept : (Ljava/lang/Throwable;JLjava/lang/String;)Ljava/util/function/Consumer;
    //   13: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   18: return
  }
  
  private static void lambda$postUserErrorBambdaException$4(Throwable paramThrowable, long paramLong, String paramString, Zzkg paramZzkg) {
    paramZzkg.Zn(new Zsij(paramThrowable, paramLong, paramString));
  }
  
  private void lambda$compileBambda$3(String paramString, Throwable paramThrowable, Long paramLong) {
    Zl(paramThrowable, paramLong.longValue(), paramString);
  }
  
  private static Object[] lambda$compileBambda$2(int paramInt) {
    return new Object[paramInt];
  }
  
  private static Object lambda$compileBambda$1(Zxfr paramZxfr) {
    return paramZxfr.Zr().get();
  }
  
  private static Class[] lambda$compileBambda$0(int paramInt) {
    return new Class[paramInt];
  }
  
  public static void Z_(int[] paramArrayOfint) {
    ZL = paramArrayOfint;
  }
  
  public static int[] Zz() {
    return ZL;
  }
  
  private static ClassNotFoundException a(ClassNotFoundException paramClassNotFoundException) {
    return paramClassNotFoundException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Ú!0"q4ªH\\b\\f?·7C}(É'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: newarray int
    //   20: bipush #11
    //   22: istore_1
    //   23: invokestatic Z_ : ([I)V
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #14
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
    //   75: putstatic burp/Zs4l.a : [Ljava/lang/String;
    //   78: iconst_2
    //   79: anewarray java/lang/String
    //   82: putstatic burp/Zs4l.b : [Ljava/lang/String;
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
    //   156: bipush #71
    //   158: goto -> 188
    //   161: bipush #12
    //   163: goto -> 188
    //   166: bipush #43
    //   168: goto -> 188
    //   171: bipush #103
    //   173: goto -> 188
    //   176: bipush #121
    //   178: goto -> 188
    //   181: bipush #28
    //   183: goto -> 188
    //   186: bipush #16
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
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD86B) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs4l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */