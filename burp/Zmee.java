package burp;

import java.util.EnumSet;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmee extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmee() {
    super(EnumSet.of(Zzqz.VARIANT));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic ZP : ()[I
    //   3: astore #11
    //   5: new java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #12
    //   14: iload_2
    //   15: tableswitch default -> 421, 0 -> 200, 1 -> 40, 2 -> 393
    //   40: aload #5
    //   42: invokevirtual ZK : ()Z
    //   45: ifne -> 57
    //   48: iconst_0
    //   49: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   52: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   55: aconst_null
    //   56: areturn
    //   57: aload #5
    //   59: invokevirtual ZO : ()Lburp/Zg3y;
    //   62: astore #13
    //   64: aload #13
    //   66: invokeinterface Zub : ()Lburp/Zll7;
    //   71: invokeinterface Zsf : ()Lburp/Zstu;
    //   76: invokeinterface ZiD : ()[B
    //   81: astore #14
    //   83: aload #13
    //   85: invokeinterface ZXh : ()Lburp/Zll7;
    //   90: invokeinterface Zsf : ()Lburp/Zstu;
    //   95: invokeinterface ZiD : ()[B
    //   100: astore #15
    //   102: aload #12
    //   104: sipush #9872
    //   107: sipush #-20216
    //   110: invokestatic a : (II)Ljava/lang/String;
    //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload #12
    //   119: aload #14
    //   121: invokestatic Zn : ([B)Ljava/lang/String;
    //   124: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   127: aload #12
    //   129: sipush #9882
    //   132: sipush #-32492
    //   135: invokestatic a : (II)Ljava/lang/String;
    //   138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload #12
    //   144: aload #15
    //   146: invokestatic Zn : ([B)Ljava/lang/String;
    //   149: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   152: aload #12
    //   154: sipush #9878
    //   157: sipush #3064
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: pop
    //   167: aload #12
    //   169: aload #6
    //   171: iconst_1
    //   172: iconst_0
    //   173: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: pop
    //   180: aload #12
    //   182: sipush #9879
    //   185: sipush #-7666
    //   188: invokestatic a : (II)Ljava/lang/String;
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: aload #11
    //   197: ifnonnull -> 430
    //   200: aload #5
    //   202: invokevirtual Zg : ()Z
    //   205: ifne -> 217
    //   208: iconst_0
    //   209: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   212: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   215: aconst_null
    //   216: areturn
    //   217: aload #5
    //   219: invokevirtual Zd : ()Lburp/Zkcp;
    //   222: astore #16
    //   224: aload #16
    //   226: invokeinterface Zub : ()Lburp/Zll7;
    //   231: invokeinterface Zsf : ()Lburp/Zstu;
    //   236: invokeinterface ZiD : ()[B
    //   241: astore #14
    //   243: aload #12
    //   245: sipush #9881
    //   248: sipush #29378
    //   251: invokestatic a : (II)Ljava/lang/String;
    //   254: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: pop
    //   258: aload #12
    //   260: aload #6
    //   262: iconst_1
    //   263: iconst_1
    //   264: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: pop
    //   271: iload #9
    //   273: iconst_1
    //   274: if_icmpne -> 297
    //   277: aload #12
    //   279: sipush #9877
    //   282: sipush #4634
    //   285: invokestatic a : (II)Ljava/lang/String;
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: aload #11
    //   294: ifnonnull -> 312
    //   297: aload #12
    //   299: sipush #9876
    //   302: sipush #-1036
    //   305: invokestatic a : (II)Ljava/lang/String;
    //   308: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: pop
    //   312: aload #12
    //   314: sipush #9883
    //   317: sipush #21498
    //   320: invokestatic a : (II)Ljava/lang/String;
    //   323: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: pop
    //   327: aload #12
    //   329: aload #14
    //   331: invokestatic Zn : ([B)Ljava/lang/String;
    //   334: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   337: aload #12
    //   339: sipush #9875
    //   342: sipush #8588
    //   345: invokestatic a : (II)Ljava/lang/String;
    //   348: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   351: pop
    //   352: aload #12
    //   354: aload #6
    //   356: iconst_1
    //   357: iconst_0
    //   358: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   361: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: pop
    //   365: aload #12
    //   367: sipush #9885
    //   370: sipush #-25163
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   379: pop
    //   380: aload_0
    //   381: aload #4
    //   383: aload #12
    //   385: invokevirtual Zw : (Lburp/Ztlj;Ljava/lang/StringBuilder;)V
    //   388: aload #11
    //   390: ifnonnull -> 430
    //   393: aload #12
    //   395: sipush #9873
    //   398: sipush #31711
    //   401: invokestatic a : (II)Ljava/lang/String;
    //   404: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   407: pop
    //   408: aload_0
    //   409: aload #4
    //   411: aload #12
    //   413: invokevirtual Zw : (Lburp/Ztlj;Ljava/lang/StringBuilder;)V
    //   416: aload #11
    //   418: ifnonnull -> 430
    //   421: iconst_0
    //   422: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   425: iload_2
    //   426: i2l
    //   427: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   430: aload #5
    //   432: invokevirtual Zk : ()Z
    //   435: ifeq -> 443
    //   438: aload #12
    //   440: invokestatic ZO : (Ljava/lang/StringBuilder;)V
    //   443: aload #5
    //   445: aload #12
    //   447: invokestatic ZV : (Lburp/Ztub;Ljava/lang/StringBuilder;)V
    //   450: aload #12
    //   452: invokevirtual toString : ()Ljava/lang/String;
    //   455: areturn
  }
  
  private void Zw(Ztlj paramZtlj, StringBuilder paramStringBuilder) {
    int[] arrayOfInt = Zr1w.ZP();
    byte b = paramZtlj.Zo();
    switch (b) {
      case 0:
        if (arrayOfInt == null);
        return;
      case 1:
        paramStringBuilder.append(a(9874, 20729));
        if (arrayOfInt == null);
        return;
      case 2:
        paramStringBuilder.append(a(9880, -1980));
        if (arrayOfInt == null)
          break; 
        return;
    } 
    Zuh.Zv(false, Zqf.Zk, b);
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    return ZQ(paramZrdb1, paramZrdb2, new Zle1(), paramZz1h);
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'E¤|ÃCPþ2Y`ßAVnª³\\b§raWM£y7/©Òrk}B+ïPHl_ßÇáÝ 8@rµðÈÍdëUº|¸{MÛVÛ 4Å`ÒþÁÓº{tH[=+þKQ§C:áX×\\f)ÎñSåÄbÙKÁýoá¬ùlkÜc[ÖmtÌ ªÊøs0?%vr¶H¦´Ë\\r8ýrp\\bR\\nH,+0->Îi¸ûiPRi/õ¸©ïªƐÄ3Æ¹²EúØlY~Æ©v`·ß¬*Óþé·ðVÔ´#óP=×©4"¯EñüªYpÏ9æ*¾ÕE\ãÀOUß@Ëíí<pT¦Bå¯"a¢cPQ¤íeFIþÇõÍ2áO»C£©>ý·Ð4ÉÑb­ògÃ»üh7<O!ë@¥~M.*c&Æ°¦i+ R(Æ£¥¸öòuúÜëÞÔëUè)Ó³üøºê4Õ³®/i;õ/ÿÒA*¼¾xQæÞñ4çt¾éOçT¢Ø/6´°:PîHõÛyßA}Àj_C6B\\tü)sA÷]kúûºU¼®êÚ ]\\rd2ÀtÊS \\tÞWqwQñÿe\íÜmHðO9"\\tå"QK(JhÖpm%>\\nåïâ)?­Ò¦¿wPNÜ©ï¸åºõ \\\f¹$ýÉßPQTqyÈÆZhWg­Ý!øÿ*¯ õ 'ßq¤rÈ:D ýÜ\\t}K]ö¦§\\rÕwA'ÑÚWÑ[ìlh%·UBýË­@Îå¾0fðKàÀ=Ì-BX0Gtýr ~E\\nQ{¬b¢HR§+ZVgu>N<ðÚ½Áô²ï^èÕ+ª9¢6=¶qcÈ=b~{ËSâ7`§ª&ùöÄ*T\\b'C¹p1a÷£×%Ð±_sµn4vÒ/'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #60
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #15
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc 'Ào/4ÔÈw#;½u@ÑÝDm¥®¡2ã®Yý\\fN·æ«õì9êëÖÈRT^X­-\\t\ï.ixCCîLºz<|'ôcfG0\\r+R¶tLÞ0ùwé§æ"¶3Èrßz÷zëRÍ0ñm)´ý²ü­[^náïY:w#wB h­¸Mn®z¨ÆxA;fÉëQÿ ¦9 dÐ®\\bWEà/Mó¼8ZÆôªl¹l³%×l3_'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #12
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #42
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zmee.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmee.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #46
    //   214: goto -> 243
    //   217: bipush #15
    //   219: goto -> 243
    //   222: bipush #68
    //   224: goto -> 243
    //   227: bipush #29
    //   229: goto -> 243
    //   232: iconst_2
    //   233: goto -> 243
    //   236: bipush #49
    //   238: goto -> 243
    //   241: bipush #112
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2691) & 0xFFFF;
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
      char c = '×';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmee.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */