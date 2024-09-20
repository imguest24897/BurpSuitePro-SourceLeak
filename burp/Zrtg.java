package burp;

import java.util.ArrayList;
import java.util.List;

public class Zrtg extends Zrtd {
  private final int ZO;
  
  private final int Za;
  
  private int ZV = Integer.MAX_VALUE;
  
  private List<int[]> Zi;
  
  private List<int[]> Zg;
  
  private boolean ZW;
  
  protected List<Ztsm> Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrtg(Zstu paramZstu1, int paramInt1, int paramInt2, Zstu paramZstu2, int paramInt3, int paramInt4, Zlc8 paramZlc8) {
    super(paramZstu1, paramInt1, paramZstu2, paramInt3, paramZlc8);
    this.ZO = paramInt2;
    this.Za = paramInt4;
  }
  
  public void ZE(int paramInt) {
    this.ZV = paramInt;
  }
  
  public void Zz(List<int[]> paramList1, List<int[]> paramList2) {
    this.Zi = paramList1;
    this.Zg = paramList2;
  }
  
  public void Zm(boolean paramBoolean) {
    this.ZW = paramBoolean;
  }
  
  protected void Za(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.Zc.size() >= this.ZV)
      return; 
    super.Za(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public List<Ztsm> ZT() {
    int i = Zrtd.ZH();
    if (this.Zc != null)
      return this.Zc; 
    this.Zc = new ArrayList<>();
    if (this.Zb != null)
      this.Zb.Zq(0.0F, a(-31707, -13640)); 
    this.ZA = ZY(this.Zk, this.Zz, this.ZO, this.Zi);
    this.ZK = ZY(this.ZR, this.ZH, this.Za, this.Zg);
    ZZ();
    if (this.Zb != null && !this.Zb.Zq(90.0F, a(-31708, -29762)))
      return new ArrayList<>(); 
    for (Ztsm ztsm : this.Zc) {
      int[] arrayOfInt = ztsm.Zz;
      switch (ztsm.ZK) {
        case 2:
          arrayOfInt[0] = this.ZA[arrayOfInt[0]][1];
          arrayOfInt[1] = this.ZA[arrayOfInt[1]][1];
          arrayOfInt[2] = this.ZK[arrayOfInt[2]][0];
          arrayOfInt[3] = this.ZK[arrayOfInt[3]][1];
        case 1:
          arrayOfInt[0] = this.ZA[arrayOfInt[0]][0];
          arrayOfInt[1] = this.ZA[arrayOfInt[1]][1];
          arrayOfInt[2] = this.ZK[arrayOfInt[2]][1];
          arrayOfInt[3] = this.ZK[arrayOfInt[3]][1];
        case 3:
          arrayOfInt[0] = this.ZA[arrayOfInt[0]][0];
          arrayOfInt[1] = this.ZA[arrayOfInt[1]][1];
          arrayOfInt[2] = this.ZK[arrayOfInt[2]][0];
          arrayOfInt[3] = this.ZK[arrayOfInt[3]][1];
          break;
      } 
      continue;
      if (i == 0)
        break; 
    } 
    return this.Zc;
  }
  
  protected boolean ZL() {
    return this.Zb.Zq((this.Zc.size() % 100), a(-31708, -29762));
  }
  
  protected void Ze(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Zc.add(new Ztsm((byte)3, paramInt1, paramInt2 - 1, paramInt3, paramInt4 - 1));
  }
  
  protected void Zi(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Zc.add(new Ztsm((byte)1, paramInt1, paramInt2 - 1, paramInt3 - 1, paramInt4 - 1));
  }
  
  protected void Zj(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Zc.add(new Ztsm((byte)2, paramInt1 - 1, paramInt2 - 1, paramInt3, paramInt4 - 1));
  }
  
  protected int[][] ZY(Zstu paramZstu, int paramInt1, int paramInt2, List<int[]> paramList) {
    // Byte code:
    //   0: invokestatic Zj : ()I
    //   3: istore #5
    //   5: aconst_null
    //   6: astore #6
    //   8: aload #4
    //   10: ifnull -> 22
    //   13: aload #4
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore #6
    //   22: aconst_null
    //   23: astore #7
    //   25: aload #6
    //   27: ifnull -> 52
    //   30: aload #6
    //   32: invokeinterface hasNext : ()Z
    //   37: ifeq -> 52
    //   40: aload #6
    //   42: invokeinterface next : ()Ljava/lang/Object;
    //   47: checkcast [I
    //   50: astore #7
    //   52: new java/util/ArrayList
    //   55: dup
    //   56: bipush #10
    //   58: aload_1
    //   59: invokeinterface Zpu : ()I
    //   64: bipush #10
    //   66: idiv
    //   67: iadd
    //   68: invokespecial <init> : (I)V
    //   71: astore #8
    //   73: aload #8
    //   75: iconst_2
    //   76: newarray int
    //   78: dup
    //   79: iconst_0
    //   80: iload_2
    //   81: iastore
    //   82: dup
    //   83: iconst_1
    //   84: iload_2
    //   85: iastore
    //   86: invokeinterface add : (Ljava/lang/Object;)Z
    //   91: pop
    //   92: iload_2
    //   93: istore #9
    //   95: iload #9
    //   97: iload_3
    //   98: if_icmpge -> 499
    //   101: aload #7
    //   103: ifnull -> 154
    //   106: iload #9
    //   108: aload #7
    //   110: iconst_0
    //   111: iaload
    //   112: if_icmpne -> 154
    //   115: aload #7
    //   117: iconst_1
    //   118: iaload
    //   119: istore #9
    //   121: aload #6
    //   123: invokeinterface hasNext : ()Z
    //   128: ifeq -> 148
    //   131: aload #6
    //   133: invokeinterface next : ()Ljava/lang/Object;
    //   138: checkcast [I
    //   141: astore #7
    //   143: iload #5
    //   145: ifeq -> 95
    //   148: aconst_null
    //   149: astore #7
    //   151: goto -> 95
    //   154: iload #9
    //   156: istore_2
    //   157: aload_1
    //   158: iload #9
    //   160: invokeinterface Zp : (I)B
    //   165: istore #10
    //   167: iinc #9, 1
    //   170: iload #10
    //   172: iflt -> 245
    //   175: iload #10
    //   177: bipush #32
    //   179: if_icmpgt -> 245
    //   182: iload #9
    //   184: iload_3
    //   185: if_icmpge -> 474
    //   188: aload #7
    //   190: ifnull -> 205
    //   193: iload #9
    //   195: aload #7
    //   197: iconst_0
    //   198: iaload
    //   199: if_icmpne -> 205
    //   202: goto -> 474
    //   205: aload_1
    //   206: iload #9
    //   208: invokeinterface Zp : (I)B
    //   213: istore #10
    //   215: iload #10
    //   217: iflt -> 227
    //   220: iload #10
    //   222: bipush #32
    //   224: if_icmple -> 237
    //   227: aload_0
    //   228: getfield ZW : Z
    //   231: ifeq -> 474
    //   234: goto -> 95
    //   237: iinc #9, 1
    //   240: iload #5
    //   242: ifeq -> 182
    //   245: iload #10
    //   247: bipush #65
    //   249: if_icmplt -> 259
    //   252: iload #10
    //   254: bipush #90
    //   256: if_icmple -> 287
    //   259: iload #10
    //   261: bipush #97
    //   263: if_icmplt -> 273
    //   266: iload #10
    //   268: bipush #122
    //   270: if_icmple -> 287
    //   273: iload #10
    //   275: bipush #48
    //   277: if_icmplt -> 373
    //   280: iload #10
    //   282: bipush #57
    //   284: if_icmpgt -> 373
    //   287: iload #9
    //   289: iload_3
    //   290: if_icmpge -> 474
    //   293: aload #7
    //   295: ifnull -> 310
    //   298: iload #9
    //   300: aload #7
    //   302: iconst_0
    //   303: iaload
    //   304: if_icmpne -> 310
    //   307: goto -> 474
    //   310: aload_1
    //   311: iload #9
    //   313: invokeinterface Zp : (I)B
    //   318: istore #10
    //   320: iload #10
    //   322: bipush #65
    //   324: if_icmplt -> 334
    //   327: iload #10
    //   329: bipush #90
    //   331: if_icmple -> 365
    //   334: iload #10
    //   336: bipush #97
    //   338: if_icmplt -> 348
    //   341: iload #10
    //   343: bipush #122
    //   345: if_icmple -> 365
    //   348: iload #10
    //   350: bipush #48
    //   352: if_icmplt -> 474
    //   355: iload #10
    //   357: bipush #57
    //   359: if_icmple -> 365
    //   362: goto -> 474
    //   365: iinc #9, 1
    //   368: iload #5
    //   370: ifeq -> 287
    //   373: iload #9
    //   375: iload_3
    //   376: if_icmpge -> 474
    //   379: aload #7
    //   381: ifnull -> 396
    //   384: iload #9
    //   386: aload #7
    //   388: iconst_0
    //   389: iaload
    //   390: if_icmpne -> 396
    //   393: goto -> 474
    //   396: aload_1
    //   397: iload #9
    //   399: invokeinterface Zp : (I)B
    //   404: istore #10
    //   406: iload #10
    //   408: iflt -> 421
    //   411: iload #10
    //   413: bipush #32
    //   415: if_icmpgt -> 421
    //   418: goto -> 474
    //   421: iload #10
    //   423: bipush #65
    //   425: if_icmplt -> 435
    //   428: iload #10
    //   430: bipush #90
    //   432: if_icmple -> 474
    //   435: iload #10
    //   437: bipush #97
    //   439: if_icmplt -> 449
    //   442: iload #10
    //   444: bipush #122
    //   446: if_icmple -> 474
    //   449: iload #10
    //   451: bipush #48
    //   453: if_icmplt -> 466
    //   456: iload #10
    //   458: bipush #57
    //   460: if_icmpgt -> 466
    //   463: goto -> 474
    //   466: iinc #9, 1
    //   469: iload #5
    //   471: ifeq -> 373
    //   474: aload #8
    //   476: iconst_2
    //   477: newarray int
    //   479: dup
    //   480: iconst_0
    //   481: iload_2
    //   482: iastore
    //   483: dup
    //   484: iconst_1
    //   485: iload #9
    //   487: iastore
    //   488: invokeinterface add : (Ljava/lang/Object;)Z
    //   493: pop
    //   494: iload #5
    //   496: ifeq -> 95
    //   499: aload #8
    //   501: iconst_2
    //   502: newarray int
    //   504: dup
    //   505: iconst_0
    //   506: iload_3
    //   507: iastore
    //   508: dup
    //   509: iconst_1
    //   510: iload_3
    //   511: iastore
    //   512: invokeinterface add : (Ljava/lang/Object;)Z
    //   517: pop
    //   518: aload #8
    //   520: invokeinterface size : ()I
    //   525: anewarray [I
    //   528: astore #10
    //   530: aload #8
    //   532: aload #10
    //   534: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   539: pop
    //   540: aload #10
    //   542: invokestatic Zwu : ()[Lburp/Zbqc;
    //   545: ifnonnull -> 556
    //   548: iinc #5, 1
    //   551: iload #5
    //   553: invokestatic ZX : (I)V
    //   556: areturn
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '<­¡:A5¼1ôÅ\\f5w¢"Ì¶{h59kâU.>R¤©¸6\\núpÛ°!'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #21
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #64
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
    //   69: putstatic burp/Zrtg.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zrtg.b : [Ljava/lang/String;
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
    //   152: bipush #41
    //   154: goto -> 184
    //   157: bipush #97
    //   159: goto -> 184
    //   162: bipush #13
    //   164: goto -> 184
    //   167: bipush #25
    //   169: goto -> 184
    //   172: bipush #41
    //   174: goto -> 184
    //   177: bipush #19
    //   179: goto -> 184
    //   182: bipush #75
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
    int i = (paramInt1 ^ 0xFFFF8424) & 0xFFFF;
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
      byte b1 = 43;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrtg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */