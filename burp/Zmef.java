package burp;

import java.util.EnumSet;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmef extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmef() {
    super(EnumSet.of(Zzqz.VARIANT));
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    return (new Zxll(new Zt97(new Zxn2(new Zg1f(new Zt6_(new Zr0q(new Zgq9(new Zlet(new Zs7y()))))))))).Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic Z_ : ()Z
    //   3: istore #11
    //   5: new java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #12
    //   14: aload #4
    //   16: invokevirtual Zm : ()Lburp/Zlt9;
    //   19: getstatic burp/Zlt9.MERGE_MULTIPLE_IDENTIFIERS : Lburp/Zlt9;
    //   22: if_acmpne -> 172
    //   25: aload #5
    //   27: invokevirtual Zs : ()Z
    //   30: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   33: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   36: aload #12
    //   38: sipush #21353
    //   41: sipush #-20004
    //   44: invokestatic a : (II)Ljava/lang/String;
    //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: pop
    //   51: aload #12
    //   53: iload_2
    //   54: invokestatic Zk : (B)Ljava/lang/String;
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: aload #12
    //   63: sipush #21350
    //   66: sipush #21104
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload #5
    //   78: invokevirtual Zt : ()Lburp/Zt38;
    //   81: invokeinterface ZCr : ()Lburp/Zefg;
    //   86: astore #13
    //   88: aload #13
    //   90: invokeinterface iterator : ()Ljava/util/Iterator;
    //   95: astore #14
    //   97: aload #14
    //   99: invokeinterface hasNext : ()Z
    //   104: ifeq -> 167
    //   107: aload #14
    //   109: invokeinterface next : ()Ljava/lang/Object;
    //   114: checkcast burp/Zsdr
    //   117: astore #15
    //   119: aload #12
    //   121: sipush #21347
    //   124: sipush #-31115
    //   127: invokestatic a : (II)Ljava/lang/String;
    //   130: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: pop
    //   134: aload #12
    //   136: aload #15
    //   138: invokeinterface toString : ()Ljava/lang/String;
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: pop
    //   147: aload #12
    //   149: sipush #21356
    //   152: sipush #14703
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: iload #11
    //   164: ifeq -> 97
    //   167: iload #11
    //   169: ifeq -> 233
    //   172: aload #12
    //   174: sipush #21344
    //   177: sipush #-21401
    //   180: invokestatic a : (II)Ljava/lang/String;
    //   183: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload #12
    //   189: aload #4
    //   191: getstatic burp/Ztz3.PARAMETER_NAME : Lburp/Ztz3;
    //   194: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   197: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   200: aload #12
    //   202: sipush #21352
    //   205: sipush #28459
    //   208: invokestatic a : (II)Ljava/lang/String;
    //   211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: pop
    //   215: aload #12
    //   217: iload_2
    //   218: invokestatic Zk : (B)Ljava/lang/String;
    //   221: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: pop
    //   225: aload #12
    //   227: ldc '.'
    //   229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: pop
    //   233: aload #12
    //   235: aload #4
    //   237: aload #5
    //   239: sipush #21346
    //   242: sipush #-17155
    //   245: invokestatic a : (II)Ljava/lang/String;
    //   248: invokestatic ZE : (Ljava/lang/StringBuilder;Lburp/Ztlj;Lburp/Ztub;Ljava/lang/String;)V
    //   251: aload #12
    //   253: invokevirtual toString : ()Ljava/lang/String;
    //   256: invokestatic Zwu : ()[Lburp/Zbqc;
    //   259: ifnonnull -> 275
    //   262: iload #11
    //   264: ifeq -> 271
    //   267: iconst_0
    //   268: goto -> 272
    //   271: iconst_1
    //   272: invokestatic ZC : (Z)V
    //   275: areturn
  }
  
  private static String Zk(byte paramByte) {
    switch (paramByte) {
      case 0:
        return a(21357, 2451);
      case 1:
        return a(21349, -2351);
      case 2:
        return a(21348, -27914);
      case 3:
        return a(21345, 29070);
      case 4:
        return a(21354, -20084);
      case 5:
        return a(21355, 2682);
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    return a(21351, -24815);
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'qÛ0r¦4l\\bÌuâ\\nIËVvêüq²hBm¬ÕÔ_íÆÇÚch]f{1kIß¶ÇâkÕa/Ev7¸rnâÅòV p²(|û#ÒnÝÀ+É\\nqÙ+brGÚ³êKsÛYC¢çó{õ-¢â4¥ÝÑ£xX»µj\\r®AçÑ.·à"^ãj+p!»ËØcuk_*s.¢Fl°z{g%ðöWÍß\Wcã½ÆF«¨|{ÝBq÷¥3 k\\n4D8¬¾zQF7Î±q\\r²1.\\tEðßåzdÀíÆ£:[A0ÖïN¡ìeôZð ~5|U|çí-x«Å{âÙ§gêÑ ÓuK{!R­_uNA¼pAZJæ5¨9£Ü<Õ(#ô?\\r'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #17
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #70
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'ÆzÊÌGÂgÇ96¿U»dÇ®Ë±ªä'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #123
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
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
    //   128: putstatic burp/Zmef.a : [Ljava/lang/String;
    //   131: bipush #14
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmef.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #26
    //   214: goto -> 244
    //   217: bipush #75
    //   219: goto -> 244
    //   222: bipush #93
    //   224: goto -> 244
    //   227: bipush #91
    //   229: goto -> 244
    //   232: bipush #12
    //   234: goto -> 244
    //   237: bipush #112
    //   239: goto -> 244
    //   242: bipush #119
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5360) & 0xFFFF;
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
      char c = 'û';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmef.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */