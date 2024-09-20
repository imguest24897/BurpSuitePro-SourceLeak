package burp;

import net.portswigger.Zmw;

public class Zsh7 extends Zshh {
  private final Zsat ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zsh7(Zs66 paramZs661, Zs66 paramZs662, Ztwr paramZtwr, String paramString1, String paramString2, Zs54 paramZs541, Zs54 paramZs542, Zro0 paramZro0, Zxtl paramZxtl, Ztr2 paramZtr2) {
    super(paramZs661, paramZs662, paramZtwr, paramString1, paramString2, paramZs542, paramZro0, paramZxtl, paramZtr2);
    this.ZT = Zj(Zmw.Zz(paramZtwr.Zj(), paramZs541.ZS(), paramZs542.ZD()), paramZs541.ZS());
  }
  
  public int Za() {
    return this.ZT.ZLZ();
  }
  
  public int Zi() {
    return this.ZT.ZLr();
  }
  
  public int ZP() {
    return this.ZT.ZLt();
  }
  
  public int ZO() {
    return this.ZT.ZLc();
  }
  
  public <T> T Z_(Zktv<T> paramZktv) {
    return paramZktv.Zq(this);
  }
  
  private Zsat Zj(byte[] paramArrayOfbyte, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic ZG : ([B)Ljava/lang/String;
    //   4: sipush #-21142
    //   7: sipush #17503
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   16: astore #4
    //   18: invokestatic ZR : ()Ljava/lang/String;
    //   21: iconst_1
    //   22: istore #5
    //   24: astore_3
    //   25: iconst_m1
    //   26: istore #6
    //   28: iconst_m1
    //   29: istore #7
    //   31: aload #4
    //   33: astore #8
    //   35: aload #8
    //   37: arraylength
    //   38: istore #9
    //   40: iconst_0
    //   41: istore #10
    //   43: iload #10
    //   45: iload #9
    //   47: if_icmpge -> 267
    //   50: aload #8
    //   52: iload #10
    //   54: aaload
    //   55: astore #11
    //   57: iload #5
    //   59: ifeq -> 134
    //   62: aload #11
    //   64: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   67: sipush #-21141
    //   70: sipush #-27853
    //   73: invokestatic a : (II)Ljava/lang/String;
    //   76: invokevirtual indexOf : (Ljava/lang/String;)I
    //   79: istore #12
    //   81: iload #12
    //   83: iconst_m1
    //   84: if_icmpeq -> 130
    //   87: aload_0
    //   88: aload #11
    //   90: iload #12
    //   92: invokevirtual ZM : (Ljava/lang/String;I)I
    //   95: istore #13
    //   97: iload #13
    //   99: iconst_m1
    //   100: if_icmpeq -> 130
    //   103: aload #11
    //   105: bipush #34
    //   107: iload #12
    //   109: invokevirtual indexOf : (II)I
    //   112: istore #14
    //   114: iload_2
    //   115: iload #14
    //   117: iadd
    //   118: iconst_1
    //   119: iadd
    //   120: istore #6
    //   122: iload_2
    //   123: iload #13
    //   125: iadd
    //   126: iconst_1
    //   127: isub
    //   128: istore #7
    //   130: aload_3
    //   131: ifnonnull -> 257
    //   134: aload #11
    //   136: sipush #-21144
    //   139: sipush #-3942
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   148: ifeq -> 257
    //   151: aload_1
    //   152: aload #11
    //   154: invokestatic Zy : (Ljava/lang/String;)[B
    //   157: invokestatic ZR : ([B[B)I
    //   160: istore #12
    //   162: aload #11
    //   164: sipush #-21143
    //   167: sipush #14049
    //   170: invokestatic a : (II)Ljava/lang/String;
    //   173: invokevirtual indexOf : (Ljava/lang/String;)I
    //   176: sipush #-21143
    //   179: sipush #14049
    //   182: invokestatic a : (II)Ljava/lang/String;
    //   185: invokevirtual length : ()I
    //   188: iadd
    //   189: istore #13
    //   191: iload #13
    //   193: aload #11
    //   195: invokevirtual length : ()I
    //   198: if_icmpge -> 220
    //   201: aload #11
    //   203: iload #13
    //   205: invokevirtual charAt : (I)C
    //   208: bipush #32
    //   210: if_icmpne -> 220
    //   213: iinc #13, 1
    //   216: aload_3
    //   217: ifnonnull -> 191
    //   220: iload_2
    //   221: iload #12
    //   223: iadd
    //   224: iload #13
    //   226: iadd
    //   227: istore #14
    //   229: iload_2
    //   230: iload #12
    //   232: iadd
    //   233: aload #11
    //   235: invokevirtual length : ()I
    //   238: iadd
    //   239: istore #15
    //   241: new burp/Zsat
    //   244: dup
    //   245: iload #6
    //   247: iload #7
    //   249: iload #14
    //   251: iload #15
    //   253: invokespecial <init> : (IIII)V
    //   256: areturn
    //   257: iconst_0
    //   258: istore #5
    //   260: iinc #10, 1
    //   263: aload_3
    //   264: ifnonnull -> 43
    //   267: new burp/Zsat
    //   270: dup
    //   271: iload #6
    //   273: iload #7
    //   275: iconst_m1
    //   276: iconst_m1
    //   277: invokespecial <init> : (IIII)V
    //   280: areturn
  }
  
  private int ZM(String paramString, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: invokestatic ZR : ()Ljava/lang/String;
    //   6: iconst_0
    //   7: istore #5
    //   9: astore_3
    //   10: iload_2
    //   11: istore #6
    //   13: iload #6
    //   15: aload_1
    //   16: invokevirtual length : ()I
    //   19: if_icmpge -> 96
    //   22: aload_1
    //   23: iload #6
    //   25: invokevirtual charAt : (I)C
    //   28: istore #7
    //   30: iload #7
    //   32: bipush #34
    //   34: if_icmpne -> 56
    //   37: iload #5
    //   39: ifne -> 56
    //   42: iinc #4, 1
    //   45: iload #4
    //   47: iconst_2
    //   48: if_icmpne -> 89
    //   51: iload #6
    //   53: iconst_1
    //   54: iadd
    //   55: ireturn
    //   56: iload #7
    //   58: bipush #34
    //   60: if_icmpne -> 70
    //   63: iconst_0
    //   64: istore #5
    //   66: aload_3
    //   67: ifnonnull -> 89
    //   70: iload #7
    //   72: bipush #92
    //   74: if_icmpne -> 89
    //   77: iload #5
    //   79: ifne -> 86
    //   82: iconst_1
    //   83: goto -> 87
    //   86: iconst_0
    //   87: istore #5
    //   89: iinc #6, 1
    //   92: aload_3
    //   93: ifnonnull -> 13
    //   96: iconst_m1
    //   97: ireturn
  }
  
  public boolean Zk() {
    return (this.ZT.ZLZ != -1);
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'TòkDâJ,Ç¬'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #8
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #40
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
    //   67: ldc 'eÕQèÔÓ3¨©\\f\\rÛ)Õì,ÔÓJµP'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #13
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #52
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zsh7.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zsh7.b : [Ljava/lang/String;
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
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #88
    //   214: goto -> 243
    //   217: bipush #17
    //   219: goto -> 243
    //   222: iconst_1
    //   223: goto -> 243
    //   226: bipush #52
    //   228: goto -> 243
    //   231: bipush #110
    //   233: goto -> 243
    //   236: bipush #105
    //   238: goto -> 243
    //   241: bipush #84
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
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAD6B) & 0xFFFF;
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
      byte b1 = 41;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsh7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */