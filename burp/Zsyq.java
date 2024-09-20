package burp;

import java.util.function.Supplier;
import net.portswigger.Zkb;

public class Zsyq {
  private final Supplier<Zl1r> Zw;
  
  private final Zxrc Zc;
  
  private final String ZH;
  
  private static Zbqc[] ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zsyq(Zlou paramZlou, Zxrc paramZxrc) {
    this.Zw = paramZlou::lambda$new$0;
    this.Zc = paramZxrc;
    this.ZH = paramZxrc.ZW(a(21184, 16646));
  }
  
  private Zsyq(String paramString, Zxrc paramZxrc, Zstu paramZstu) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_3
    //   6: aload_1
    //   7: <illegal opcode> get : (Lburp/Zstu;Ljava/lang/String;)Ljava/util/function/Supplier;
    //   12: putfield Zw : Ljava/util/function/Supplier;
    //   15: aload_0
    //   16: aload_2
    //   17: putfield Zc : Lburp/Zxrc;
    //   20: aload_0
    //   21: aload_2
    //   22: sipush #21185
    //   25: sipush #29909
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: invokeinterface ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   36: putfield ZH : Ljava/lang/String;
    //   39: return
  }
  
  public Zl1r Zb() {
    return this.Zw.get();
  }
  
  public Zxrc Ze() {
    return this.Zc;
  }
  
  public String Zw() {
    return this.ZH;
  }
  
  public boolean Zy() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZH : Ljava/lang/String;
    //   4: astore_2
    //   5: invokestatic ZO : ()[Lburp/Zbqc;
    //   8: iconst_m1
    //   9: istore_3
    //   10: astore_1
    //   11: aload_2
    //   12: invokevirtual hashCode : ()I
    //   15: lookupswitch default -> 110, 69015912 -> 48, 69016964 -> 70, 69018667 -> 92
    //   48: aload_2
    //   49: sipush #21187
    //   52: sipush #1961
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: invokevirtual equals : (Ljava/lang/Object;)Z
    //   61: ifeq -> 110
    //   64: iconst_0
    //   65: istore_3
    //   66: aload_1
    //   67: ifnonnull -> 110
    //   70: aload_2
    //   71: sipush #21186
    //   74: sipush #-4398
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: invokevirtual equals : (Ljava/lang/Object;)Z
    //   83: ifeq -> 110
    //   86: iconst_1
    //   87: istore_3
    //   88: aload_1
    //   89: ifnonnull -> 110
    //   92: aload_2
    //   93: sipush #21190
    //   96: sipush #-28964
    //   99: invokestatic a : (II)Ljava/lang/String;
    //   102: invokevirtual equals : (Ljava/lang/Object;)Z
    //   105: ifeq -> 110
    //   108: iconst_2
    //   109: istore_3
    //   110: iload_3
    //   111: tableswitch default -> 140, 0 -> 136, 1 -> 136, 2 -> 136
    //   136: iconst_1
    //   137: goto -> 141
    //   140: iconst_0
    //   141: ireturn
  }
  
  public boolean ZR() {
    return Ze().ZN();
  }
  
  private static Zl1r lambda$new$1(Zstu paramZstu, String paramString) {
    int i = Zlt_.Zr(paramZstu, Zkb.Zy(paramString));
    int j = i + paramString.length();
    return Zrlp.Zh(new int[] { i, j });
  }
  
  private static Zl1r lambda$new$0(Zlou paramZlou) {
    return Zrlp.Zj(paramZlou.ZE, paramZlou.ZV);
  }
  
  public static void ZB(Zbqc[] paramArrayOfZbqc) {
    ZP = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZO() {
    return ZP;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_3
    //   7: anewarray burp/Zbqc
    //   10: iconst_0
    //   11: istore_3
    //   12: ldc '}\\fà±&Î¸\\tÞ'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: invokestatic ZB : ([Lburp/Zbqc;)V
    //   24: iconst_5
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #105
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 146
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
    //   73: ldc 'åV\\tM '
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: iconst_3
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #103
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 146
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
    //   133: putstatic burp/Zsyq.a : [Ljava/lang/String;
    //   136: iconst_5
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zsyq.b : [Ljava/lang/String;
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
    //   162: if_icmpgt -> 263
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 245, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 235, 5 -> 240
    //   216: bipush #89
    //   218: goto -> 247
    //   221: bipush #72
    //   223: goto -> 247
    //   226: bipush #96
    //   228: goto -> 247
    //   231: iconst_3
    //   232: goto -> 247
    //   235: bipush #25
    //   237: goto -> 247
    //   240: bipush #97
    //   242: goto -> 247
    //   245: bipush #91
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 169
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 165
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 45, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x52C2) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsyq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */