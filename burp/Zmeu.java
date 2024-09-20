package burp;

import java.util.List;

public class Zmeu extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic Zc : ()I
    //   3: istore #11
    //   5: aload #5
    //   7: invokevirtual Zt : ()Lburp/Zt38;
    //   10: invokeinterface ZCr : ()Lburp/Zefg;
    //   15: astore #12
    //   17: aload #12
    //   19: ifnonnull -> 31
    //   22: iconst_0
    //   23: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   26: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   29: aconst_null
    //   30: areturn
    //   31: new java/util/ArrayList
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: astore #13
    //   40: new java/util/ArrayList
    //   43: dup
    //   44: invokespecial <init> : ()V
    //   47: astore #14
    //   49: aload #12
    //   51: invokeinterface iterator : ()Ljava/util/Iterator;
    //   56: astore #15
    //   58: aload #15
    //   60: invokeinterface hasNext : ()Z
    //   65: ifeq -> 99
    //   68: aload #15
    //   70: invokeinterface next : ()Ljava/lang/Object;
    //   75: checkcast burp/Zsdr
    //   78: astore #16
    //   80: aload #16
    //   82: invokeinterface toString : ()Ljava/lang/String;
    //   87: aload #13
    //   89: aload #14
    //   91: invokestatic ZP : (Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    //   94: iload #11
    //   96: ifne -> 58
    //   99: new java/lang/StringBuilder
    //   102: dup
    //   103: invokespecial <init> : ()V
    //   106: astore #15
    //   108: aload #12
    //   110: invokeinterface size : ()I
    //   115: iconst_1
    //   116: if_icmpne -> 123
    //   119: iconst_1
    //   120: goto -> 124
    //   123: iconst_0
    //   124: istore #16
    //   126: aload #15
    //   128: iload #16
    //   130: ifeq -> 145
    //   133: sipush #-22827
    //   136: sipush #-28919
    //   139: invokestatic a : (II)Ljava/lang/String;
    //   142: goto -> 154
    //   145: sipush #-22825
    //   148: sipush #-31534
    //   151: invokestatic a : (II)Ljava/lang/String;
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload #13
    //   160: invokeinterface iterator : ()Ljava/util/Iterator;
    //   165: astore #17
    //   167: aload #17
    //   169: invokeinterface hasNext : ()Z
    //   174: ifeq -> 227
    //   177: aload #15
    //   179: sipush #-22828
    //   182: sipush #8866
    //   185: invokestatic a : (II)Ljava/lang/String;
    //   188: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: pop
    //   192: aload #15
    //   194: aload #17
    //   196: invokeinterface next : ()Ljava/lang/Object;
    //   201: checkcast java/lang/String
    //   204: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   207: aload #15
    //   209: sipush #-22845
    //   212: sipush #12938
    //   215: invokestatic a : (II)Ljava/lang/String;
    //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: pop
    //   222: iload #11
    //   224: ifne -> 167
    //   227: aload #14
    //   229: invokeinterface iterator : ()Ljava/util/Iterator;
    //   234: astore #17
    //   236: aload #17
    //   238: invokeinterface hasNext : ()Z
    //   243: ifeq -> 296
    //   246: aload #15
    //   248: sipush #-22819
    //   251: sipush #-18813
    //   254: invokestatic a : (II)Ljava/lang/String;
    //   257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: pop
    //   261: aload #15
    //   263: aload #17
    //   265: invokeinterface next : ()Ljava/lang/Object;
    //   270: checkcast java/lang/String
    //   273: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   276: aload #15
    //   278: sipush #-22824
    //   281: sipush #-12048
    //   284: invokestatic a : (II)Ljava/lang/String;
    //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: pop
    //   291: iload #11
    //   293: ifne -> 236
    //   296: aload #15
    //   298: sipush #-22818
    //   301: sipush #-2354
    //   304: invokestatic a : (II)Ljava/lang/String;
    //   307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: pop
    //   311: aload #13
    //   313: invokeinterface isEmpty : ()Z
    //   318: ifne -> 416
    //   321: aload #15
    //   323: aload #14
    //   325: invokeinterface isEmpty : ()Z
    //   330: ifeq -> 345
    //   333: sipush #-22817
    //   336: sipush #-14387
    //   339: invokestatic a : (II)Ljava/lang/String;
    //   342: goto -> 354
    //   345: sipush #-22831
    //   348: sipush #-31820
    //   351: invokestatic a : (II)Ljava/lang/String;
    //   354: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: pop
    //   358: aload #15
    //   360: aload #13
    //   362: invokeinterface size : ()I
    //   367: iconst_1
    //   368: if_icmpne -> 383
    //   371: sipush #-22847
    //   374: sipush #15370
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: goto -> 392
    //   383: sipush #-22843
    //   386: sipush #4950
    //   389: invokestatic a : (II)Ljava/lang/String;
    //   392: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   395: pop
    //   396: aload #15
    //   398: sipush #-22823
    //   401: sipush #-8193
    //   404: invokestatic a : (II)Ljava/lang/String;
    //   407: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   410: pop
    //   411: iload #11
    //   413: ifne -> 463
    //   416: aload #15
    //   418: iload #16
    //   420: ifeq -> 435
    //   423: sipush #-22822
    //   426: sipush #-29009
    //   429: invokestatic a : (II)Ljava/lang/String;
    //   432: goto -> 444
    //   435: sipush #-22830
    //   438: sipush #-20423
    //   441: invokestatic a : (II)Ljava/lang/String;
    //   444: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   447: pop
    //   448: aload #15
    //   450: sipush #-22832
    //   453: sipush #-26446
    //   456: invokestatic a : (II)Ljava/lang/String;
    //   459: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   462: pop
    //   463: aload #15
    //   465: sipush #-22820
    //   468: sipush #12106
    //   471: invokestatic a : (II)Ljava/lang/String;
    //   474: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   477: pop
    //   478: aload #15
    //   480: iload #16
    //   482: ifeq -> 497
    //   485: sipush #-22829
    //   488: sipush #-31646
    //   491: invokestatic a : (II)Ljava/lang/String;
    //   494: goto -> 506
    //   497: sipush #-22821
    //   500: sipush #5119
    //   503: invokestatic a : (II)Ljava/lang/String;
    //   506: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   509: pop
    //   510: aload #15
    //   512: aload #4
    //   514: aload #5
    //   516: sipush #-22848
    //   519: sipush #-25903
    //   522: invokestatic a : (II)Ljava/lang/String;
    //   525: invokestatic ZE : (Ljava/lang/StringBuilder;Lburp/Ztlj;Lburp/Ztub;Ljava/lang/String;)V
    //   528: aload #15
    //   530: invokevirtual toString : ()Ljava/lang/String;
    //   533: areturn
  }
  
  public String Z_(List<Zrdb> paramList) {
    return Zmey.ZC(paramList, a(-22846, -27128), a(-22826, 13420), Zmey.ZN);
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '|Æ¤ÃºáM¡ëÜëæHO8¬0êcêu/¥2c¶N\\fÒU9Ò¯~SG£ô°ãÄ.HB,fóÖÞùJÌ´ÁJ!ìè³'SáR¨Âî§êJR°Ñö¸m¸°P÷%²3ÃZ`¡$Ï[hFT£ìâåD®´!CóC®NÆþy×:äÙ³ï¯±Úûª)ïå];£_GÃµ BÌÍÔùáa«u&`Âfô£D¼¡&b¤!XoÊªWI2¥b'¬óè¢¶þÿKbÞ\\bý{ZdwîÉý~âgA·ªùRvï]4¬V\\t{ãb]ü¼j¼X¿V/>=Bê\\bEßÕ´ëÑ\\r*®ÀÃgC%²÷ÜïðrkD^êè[ãyK¾þjäH:_o§y$þ$äþyÔûab¥²u¤³|qÆKöýõc¾À:ÈÎû{ØZi@úß*qî\\nîAYçú×^Ô¤Y­¯¤IWÎÝ8,e1\\tèYÎ :ÇÔ9`¾Á²$ª=ÒöZr]®ÁÒ¢¨¾.Ã`{:¾%Ö£ÝN¶xL5À·íÝ­N­X\\bÆAå\\rÑ`:n q ywË{ Ê]sÐ½ÀïØÇh!AYÃ~*Ù&ÚIÀÀ>6>æå\\r*8GPÇt-Â W@åDCÍ\I õ)/.e\\ró)+[Kì8ø-1ÖS²J|Zÿ\\n×»:Ï´7.îþýqp^V4^\\bâ¥¼TEM) éMä'ÔYO.X×jP|\\r"}TTå#_Ö4<á u¦X0d­Ð1åía©7ÓP¢@÷Xèj¹/º\\twæyF}¼:2'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #50
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
    //   68: ldc '[ó©£e(êÂ¤¯Â¿[G°ãt)j.5o6K½çTv^:aì&Ùk'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #32
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
    //   129: putstatic burp/Zmeu.a : [Ljava/lang/String;
    //   132: bipush #21
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmeu.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #105
    //   214: goto -> 244
    //   217: bipush #67
    //   219: goto -> 244
    //   222: bipush #23
    //   224: goto -> 244
    //   227: bipush #114
    //   229: goto -> 244
    //   232: bipush #44
    //   234: goto -> 244
    //   237: bipush #89
    //   239: goto -> 244
    //   242: bipush #106
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA6D1) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmeu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */