package burp;

import java.awt.Component;
import java.util.function.Supplier;

public class Zt7d {
  private final Supplier<Component> ZB;
  
  private final Zg2g ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zt7d(Supplier<Component> paramSupplier, Zg2g paramZg2g) {
    this.ZB = paramSupplier;
    this.ZG = paramZg2g;
  }
  
  public void Zr(Zx59 paramZx59) {
    // Byte code:
    //   0: new burp/Zrhg
    //   3: dup
    //   4: aload_0
    //   5: getfield ZB : Ljava/util/function/Supplier;
    //   8: invokeinterface get : ()Ljava/lang/Object;
    //   13: checkcast java/awt/Component
    //   16: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   19: sipush #15716
    //   22: sipush #-20777
    //   25: invokestatic a : (II)Ljava/lang/String;
    //   28: iconst_1
    //   29: invokespecial <init> : (Ljava/awt/Window;Ljava/lang/String;Z)V
    //   32: astore_3
    //   33: invokestatic ZH : ()Ljava/lang/String;
    //   36: aload_3
    //   37: <illegal opcode> run : (Lburp/Zrhg;)Ljava/lang/Runnable;
    //   42: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   45: astore_2
    //   46: aload_1
    //   47: aload_0
    //   48: getfield ZG : Lburp/Zg2g;
    //   51: invokestatic ZT : (Lburp/Zx59;Lburp/Zg2g;)Lburp/Zria;
    //   54: astore #4
    //   56: aload #4
    //   58: aload_1
    //   59: invokevirtual ZV : ()Ljava/nio/file/Path;
    //   62: invokeinterface Zl : (Ljava/nio/file/Path;)V
    //   67: aload_1
    //   68: invokevirtual ZP : ()Ljava/util/Collection;
    //   71: astore #5
    //   73: aload #5
    //   75: invokeinterface size : ()I
    //   80: istore #6
    //   82: iload #6
    //   84: bipush #20
    //   86: if_icmpge -> 97
    //   89: iconst_1
    //   90: goto -> 102
    //   93: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   96: athrow
    //   97: iload #6
    //   99: bipush #20
    //   101: idiv
    //   102: istore #7
    //   104: iconst_0
    //   105: istore #8
    //   107: aload #5
    //   109: invokeinterface iterator : ()Ljava/util/Iterator;
    //   114: astore #9
    //   116: aload #9
    //   118: invokeinterface hasNext : ()Z
    //   123: ifeq -> 214
    //   126: aload #9
    //   128: invokeinterface next : ()Ljava/lang/Object;
    //   133: checkcast burp/Zto7
    //   136: astore #10
    //   138: aload_3
    //   139: invokevirtual ZS : ()Z
    //   142: ifeq -> 165
    //   145: aload #4
    //   147: ifnull -> 164
    //   150: aload #4
    //   152: invokeinterface close : ()V
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   163: athrow
    //   164: return
    //   165: aload #4
    //   167: aload #10
    //   169: invokeinterface ZT : (Lburp/Zto7;)V
    //   174: iinc #8, 1
    //   177: iload #8
    //   179: iload #7
    //   181: irem
    //   182: ifne -> 210
    //   185: fconst_1
    //   186: iload #8
    //   188: i2f
    //   189: fmul
    //   190: iload #6
    //   192: i2f
    //   193: fdiv
    //   194: ldc 100.0
    //   196: fmul
    //   197: fstore #11
    //   199: aload_3
    //   200: fload #11
    //   202: <illegal opcode> run : (Lburp/Zrhg;F)Ljava/lang/Runnable;
    //   207: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   210: aload_2
    //   211: ifnull -> 116
    //   214: aload #4
    //   216: ifnull -> 262
    //   219: aload #4
    //   221: invokeinterface close : ()V
    //   226: goto -> 262
    //   229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   232: athrow
    //   233: astore #5
    //   235: aload #4
    //   237: ifnull -> 259
    //   240: aload #4
    //   242: invokeinterface close : ()V
    //   247: goto -> 259
    //   250: astore #6
    //   252: aload #5
    //   254: aload #6
    //   256: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   259: aload #5
    //   261: athrow
    //   262: goto -> 275
    //   265: astore #4
    //   267: aload #4
    //   269: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   272: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   275: aload_3
    //   276: <illegal opcode> run : (Lburp/Zrhg;)Ljava/lang/Runnable;
    //   281: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   284: return
    // Exception table:
    //   from	to	target	type
    //   46	164	265	java/io/IOException
    //   56	145	233	java/lang/Throwable
    //   82	93	93	java/lang/Throwable
    //   145	157	160	java/lang/Throwable
    //   165	214	233	java/lang/Throwable
    //   165	262	265	java/io/IOException
    //   214	229	229	java/lang/Throwable
    //   240	247	250	java/lang/Throwable
  }
  
  private static void lambda$export$2(Zrhg paramZrhg) {
    paramZrhg.setVisible(false);
    paramZrhg.dispose();
  }
  
  private static void lambda$export$1(Zrhg paramZrhg, float paramFloat) {
    paramZrhg.Zq(paramFloat, a(15717, -20450));
  }
  
  private static void lambda$export$0(Zrhg paramZrhg) {
    paramZrhg.Zq(0.0F, a(15719, -19286));
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÝE¿i3Êc¾W\\t--|Èù³<'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #9
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #49
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
    //   69: putstatic burp/Zt7d.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zt7d.b : [Ljava/lang/String;
    //   79: goto -> 227
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
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #42
    //   154: goto -> 184
    //   157: bipush #25
    //   159: goto -> 184
    //   162: bipush #127
    //   164: goto -> 184
    //   167: bipush #22
    //   169: goto -> 184
    //   172: bipush #42
    //   174: goto -> 184
    //   177: bipush #24
    //   179: goto -> 184
    //   182: bipush #113
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3D65) & 0xFFFF;
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
      byte b1 = 45;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt7d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */