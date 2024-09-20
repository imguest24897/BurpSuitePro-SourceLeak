package burp;

import java.io.ByteArrayOutputStream;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zris {
  private final Zmzk Zm;
  
  private final boolean ZH;
  
  private final Zzen ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zris(Zmzk paramZmzk, boolean paramBoolean, Zzen paramZzen) {
    this.Zm = paramZmzk;
    this.ZH = paramBoolean;
    this.ZU = paramZzen;
  }
  
  Zm7u Zg(Zm1i paramZm1i) {
    // Byte code:
    //   0: new burp/Zmh6
    //   3: dup
    //   4: aload_0
    //   5: getfield ZH : Z
    //   8: invokespecial <init> : (Z)V
    //   11: astore_2
    //   12: new burp/Zg7b
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore_3
    //   20: new java/util/ArrayList
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore #4
    //   29: new burp/Zto
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: astore #5
    //   38: aload #5
    //   40: aload_1
    //   41: invokevirtual Zx : ()Ljava/lang/String;
    //   44: invokeinterface ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   49: astore #6
    //   51: aload #6
    //   53: invokestatic ZB : (Ljava/lang/String;)S
    //   56: istore #7
    //   58: aload_1
    //   59: invokevirtual Za : ()Z
    //   62: ifne -> 118
    //   65: aload #4
    //   67: sipush #-5738
    //   70: sipush #-24736
    //   73: invokestatic a : (II)Ljava/lang/String;
    //   76: iconst_3
    //   77: anewarray java/lang/Object
    //   80: dup
    //   81: iconst_0
    //   82: getstatic burp/Zxk3.HTTP_V2 : Lburp/Zxk3;
    //   85: invokevirtual ZK : ()Ljava/lang/String;
    //   88: aastore
    //   89: dup
    //   90: iconst_1
    //   91: aload #6
    //   93: aastore
    //   94: dup
    //   95: iconst_2
    //   96: iload #7
    //   98: invokestatic Zn : (I)Ljava/lang/String;
    //   101: aastore
    //   102: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   105: invokeinterface add : (Ljava/lang/Object;)Z
    //   110: pop
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   117: athrow
    //   118: aload_1
    //   119: invokevirtual Zq : ()Z
    //   122: istore #8
    //   124: aload_1
    //   125: invokevirtual Zd : ()Ljava/util/stream/Stream;
    //   128: iload #8
    //   130: <illegal opcode> test : (Z)Ljava/util/function/Predicate;
    //   135: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   140: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   145: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   150: aload #5
    //   152: <illegal opcode> apply : (Lburp/Ztyb;)Ljava/util/function/Function;
    //   157: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   162: aload #4
    //   164: aload_2
    //   165: aload_3
    //   166: <illegal opcode> accept : (Ljava/util/List;Lburp/Zmh6;Lburp/Zg7b;)Ljava/util/function/Consumer;
    //   171: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   176: new java/io/ByteArrayOutputStream
    //   179: dup
    //   180: invokespecial <init> : ()V
    //   183: astore #9
    //   185: aload_1
    //   186: aload #9
    //   188: <illegal opcode> accept : (Ljava/io/ByteArrayOutputStream;)Ljava/util/function/Consumer;
    //   193: invokevirtual Zh : (Ljava/util/function/Consumer;)V
    //   196: aload_2
    //   197: aload #4
    //   199: aload #9
    //   201: invokevirtual toByteArray : ()[B
    //   204: invokevirtual ZE : (Ljava/util/List;[B)[B
    //   207: astore #10
    //   209: new burp/Zt6x
    //   212: dup
    //   213: aload #4
    //   215: aload #10
    //   217: invokespecial <init> : (Ljava/util/List;[B)V
    //   220: astore #11
    //   222: aload #5
    //   224: invokeinterface ZH : ()Z
    //   229: ifne -> 246
    //   232: aload_1
    //   233: invokevirtual Ze : ()Z
    //   236: ifeq -> 266
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   245: athrow
    //   246: aload_0
    //   247: getfield ZU : Lburp/Zzen;
    //   250: aload_0
    //   251: getfield Zm : Lburp/Zmzk;
    //   254: invokeinterface ZA : (Lburp/Zmzk;)V
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   265: athrow
    //   266: new burp/Zrt4
    //   269: dup
    //   270: aload #11
    //   272: invokevirtual Zk : ()[B
    //   275: iload #7
    //   277: aload #4
    //   279: aload_3
    //   280: invokevirtual Zu : ()Ljava/util/List;
    //   283: aload #11
    //   285: invokevirtual Zx : ()I
    //   288: aload_1
    //   289: invokevirtual Zc : ()Ljava/time/Instant;
    //   292: aload_1
    //   293: invokevirtual Z_ : ()Ljava/time/Instant;
    //   296: aload_1
    //   297: invokevirtual Zo : ()Z
    //   300: aload_1
    //   301: invokevirtual Zh : ()Lburp/Zlxi;
    //   304: aload_1
    //   305: invokevirtual Zg : ()Z
    //   308: invokespecial <init> : ([BSLjava/util/List;Ljava/util/List;ILjava/time/Instant;Ljava/time/Instant;ZLburp/Zlxi;Z)V
    //   311: areturn
    // Exception table:
    //   from	to	target	type
    //   58	111	114	java/lang/NumberFormatException
    //   222	239	242	java/lang/NumberFormatException
    //   232	259	262	java/lang/NumberFormatException
  }
  
  static short ZB(String paramString) {
    try {
      return Short.parseShort(paramString);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      return 0;
    } 
  }
  
  private static void lambda$create$4(ByteArrayOutputStream paramByteArrayOutputStream, byte[] paramArrayOfbyte) {
    paramByteArrayOutputStream.write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  private static void lambda$create$3(List<String> paramList, Zmh6 paramZmh6, Zg7b paramZg7b, String paramString) {
    paramList.add(paramString);
    paramZmh6.ZJ(paramString);
    paramZg7b.ZF(paramString);
  }
  
  private static String lambda$create$2(Ztyb paramZtyb, Zges paramZges) {
    return paramZges.Za(paramZtyb);
  }
  
  private static boolean lambda$create$1(Zges paramZges) {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return !a(-5737, 7489).equals(paramZges.ZN());
  }
  
  private static boolean lambda$create$0(boolean paramBoolean, Zges paramZges) {
    try {
      if (paramBoolean) {
        try {
          if (!a(-5740, -4531).equals(paramZges.ZN()));
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '²Ù³{ÉpmÃt¡Ü±.Õ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #8
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #77
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
    //   69: putstatic burp/Zris.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zris.b : [Ljava/lang/String;
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
    //   152: bipush #92
    //   154: goto -> 184
    //   157: bipush #100
    //   159: goto -> 184
    //   162: bipush #23
    //   164: goto -> 184
    //   167: bipush #122
    //   169: goto -> 184
    //   172: bipush #19
    //   174: goto -> 184
    //   177: bipush #74
    //   179: goto -> 184
    //   182: bipush #93
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
    int i = (paramInt1 ^ 0xFFFFE996) & 0xFFFF;
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
      byte b1 = 99;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zris.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */