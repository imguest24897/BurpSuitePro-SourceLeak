package burp;

import java.util.EnumSet;

public class Zmm1 extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmm1() {
    super(EnumSet.of(Zzqz.FLAGS));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #12
    //   9: invokestatic ZQ : ()Z
    //   12: aload #12
    //   14: sipush #-18863
    //   17: sipush #-21434
    //   20: invokestatic a : (II)Ljava/lang/String;
    //   23: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: pop
    //   27: istore #11
    //   29: aload_1
    //   30: getstatic burp/Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_ARBITRARY_ORIGIN : Lburp/Zzu2;
    //   33: if_acmpne -> 56
    //   36: aload #12
    //   38: sipush #-18855
    //   41: sipush #-2163
    //   44: invokestatic a : (II)Ljava/lang/String;
    //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: pop
    //   51: iload #11
    //   53: ifeq -> 125
    //   56: aload_1
    //   57: getstatic burp/Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_ALL_SUBDOMAINS_TRUSTED : Lburp/Zzu2;
    //   60: if_acmpne -> 83
    //   63: aload #12
    //   65: sipush #-18852
    //   68: sipush #11698
    //   71: invokestatic a : (II)Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: iload #11
    //   80: ifeq -> 125
    //   83: aload_1
    //   84: getstatic burp/Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_UNTRUSTED_ORIGIN_TRUSTED : Lburp/Zzu2;
    //   87: if_acmpne -> 110
    //   90: aload #12
    //   92: sipush #-18854
    //   95: sipush #28347
    //   98: invokestatic a : (II)Ljava/lang/String;
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: iload #11
    //   107: ifeq -> 125
    //   110: aload_1
    //   111: getstatic burp/Zzu2.CROSS_ORIGIN_RESOURCE_SHARING : Lburp/Zzu2;
    //   114: if_acmpne -> 125
    //   117: aload #12
    //   119: ldc '.'
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload #4
    //   127: getstatic burp/Ztz3.ORIGIN_SENT : Lburp/Ztz3;
    //   130: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   133: ifnull -> 193
    //   136: aload #4
    //   138: getstatic burp/Ztz3.ORIGIN_SENT : Lburp/Ztz3;
    //   141: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   144: invokevirtual isEmpty : ()Z
    //   147: ifne -> 193
    //   150: aload #12
    //   152: sipush #-18864
    //   155: sipush #-3114
    //   158: invokestatic a : (II)Ljava/lang/String;
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload #12
    //   167: aload #4
    //   169: getstatic burp/Ztz3.ORIGIN_SENT : Lburp/Ztz3;
    //   172: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   175: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   178: aload #12
    //   180: sipush #-18849
    //   183: sipush #9907
    //   186: invokestatic a : (II)Ljava/lang/String;
    //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: pop
    //   193: iload_3
    //   194: ldc 33554432
    //   196: iand
    //   197: ldc 33554432
    //   199: if_icmpne -> 217
    //   202: aload #12
    //   204: sipush #-18862
    //   207: sipush #17686
    //   210: invokestatic a : (II)Ljava/lang/String;
    //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: pop
    //   217: iload_3
    //   218: iconst_1
    //   219: iand
    //   220: iconst_1
    //   221: if_icmpeq -> 253
    //   224: iload_3
    //   225: ldc 65536
    //   227: iand
    //   228: ldc 65536
    //   230: if_icmpne -> 253
    //   233: aload #12
    //   235: sipush #-18856
    //   238: sipush #1814
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: iload #11
    //   250: ifeq -> 311
    //   253: iload_3
    //   254: iconst_1
    //   255: iand
    //   256: iconst_1
    //   257: if_icmpne -> 280
    //   260: aload #12
    //   262: sipush #-18851
    //   265: sipush #-27968
    //   268: invokestatic a : (II)Ljava/lang/String;
    //   271: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: pop
    //   275: iload #11
    //   277: ifeq -> 311
    //   280: iload_3
    //   281: iconst_1
    //   282: iand
    //   283: iconst_1
    //   284: if_icmpeq -> 311
    //   287: iload_3
    //   288: bipush #64
    //   290: iand
    //   291: bipush #64
    //   293: if_icmpne -> 311
    //   296: aload #12
    //   298: sipush #-18850
    //   301: sipush #11837
    //   304: invokestatic a : (II)Ljava/lang/String;
    //   307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: pop
    //   311: iload_3
    //   312: bipush #32
    //   314: iand
    //   315: bipush #32
    //   317: if_icmpne -> 335
    //   320: aload #12
    //   322: sipush #-18853
    //   325: sipush #-23838
    //   328: invokestatic a : (II)Ljava/lang/String;
    //   331: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: pop
    //   335: aload #12
    //   337: invokevirtual toString : ()Ljava/lang/String;
    //   340: invokestatic Zwu : ()[Lburp/Zbqc;
    //   343: ifnonnull -> 359
    //   346: iload #11
    //   348: ifeq -> 355
    //   351: iconst_0
    //   352: goto -> 356
    //   355: iconst_1
    //   356: invokestatic Zq : (Z)V
    //   359: areturn
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    return ZY(paramZrdb1, paramZrdb2, new Zrba(), paramZz1h);
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÌäÔLf/HéÒe\ã(J:jR{HvpÌÓàþÓÌvÈÝöQ¸ðæ¨UÔ1à9NËÐÿ$ÍËî«Þ\\rûýQJBCcOYÝÚz\\bU­xj<eÇ«¨PÉ¿®DMÈà,«T>¯ç<æÛ¨M¸lbgõøj6PðÌgó'`Ah(ÏÀkjÅ¨¥½p¼9o 3áXðqþÇÂfD«Ó'k¢Z®\\rÑ6W@âò^õ×ÔÍºòá|g¬jY&¾@ûÎí($s¦O*1]Q¡ªBÖ_¢>ÌT*ÖDnÿ)öe\\tAæ!ÂRÚ­µHïp=Ì>\\b èÙ¢Ãd¤fº1¨mì×¾Ð3Õ=aýØ\\nMøtÐú#DjÖì·oÍ:¿ü%Ò¢al+$Âì¿píîë6[¢;¦CT\\t\kÏúS:/,vÁkp0ºZ¯êéª ïÉÑñ³­c<sh4\\tbÖ ffÅ§´w|ÍÍØÔq©äm(}[¥ú@©^¹ÓA4ÅRY.P&á`I0è°Òaµ6ÆÍ)\\f,îlÆô%<Jy}õ¦ÌnÂ¯Ö¿g°ÌCÈ}#RÉÅ¶ßµe¾xøB(¦)ª.«=½*p]ÈÜEtûÝ×1I ºÑãMNÅ 5<Çòÿ¥V#áOÅ\\bÀUg|Ù{òt\\bãiýê{ä%é²OZðZo\\fu;´ß%ú´-ÿ=<Gnó3Q¥E®5à|-P)s~i@l\\rÞ\\b³¹­¶v)[¶~Ê\\nË3ÂËÀ©ñÌ¸IÝúÉBg¬l \\nød&Ç Ð<qãÈC»1»oGQ¥,b°MVß_hïÌqÛ¬¸DTôÂé·ñ@÷leÙqC­OÐâçïMª0B¼\\b0C-\o¨ðFª¶S§VÀìFyìÊ}MBfÎ\\t¼Mó\\bÛÅõÎZxË´:Ðøñ[Ä\\tb<ä>§]A`I¼Ú÷°¾(Â¨Ëåør½¤[Q\\f6I¥ï_ÏzÉqº}V[ú1Í±¨--Û"ËÆRwæiS6+ß¤¦gË'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #242
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #18
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 144
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc '¥pð&EíO¸?æÁÝ·ÒH#¡Ãµ)fXÃÄØ7G>n/·f¯áU¼@©dGuÍ¥Ë¶<÷V<]þ¥£z¾øÁ¿Þæ=ÿÊï ×ë@døE¥ZÒÚãýó.Ùþ~±Þ^<Ý¸Søâ±Ë~L`lø°¢Ê]¼ë£ÖkÚÿÄ|u*ùw«]Sªåot¡UBBÔ4j±vp@ÆU¤xumâ4áD^Åß%¹G¿{\\b</;×hêÂmAËR÷N\\bê«Ãu:Ã_°Zw«Pì M%¹{ÒjÐÇW@?ÇpÌñmïmÉ¹ÝÒÑ<4Dþs¿ùíIÏ`-#5pÜìÓ1Y¥sÄnÈ~7iÔL}ÿõemÐ·ï©µÁÖÌgEûÿ¯o¼\\by}rcç\\n¨E+BzsÂ\\fçägY'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #96
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #67
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 144
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Zmm1.a : [Ljava/lang/String;
    //   133: bipush #11
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zmm1.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 258
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 240, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 235
    //   212: bipush #70
    //   214: goto -> 242
    //   217: iconst_1
    //   218: goto -> 242
    //   221: bipush #28
    //   223: goto -> 242
    //   226: bipush #102
    //   228: goto -> 242
    //   231: iconst_5
    //   232: goto -> 242
    //   235: bipush #50
    //   237: goto -> 242
    //   240: bipush #56
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 167
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 163
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 41, 0 -> 100
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB658) & 0xFFFF;
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
      char c = 'Ó';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmm1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */