package burp;

import java.util.EnumSet;

public class Zmmc extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmmc() {
    super(EnumSet.of(Zzqz.VARIANT));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #12
    //   9: invokestatic ZA : ()Z
    //   12: aload #12
    //   14: sipush #30517
    //   17: sipush #-5510
    //   20: invokestatic a : (II)Ljava/lang/String;
    //   23: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: pop
    //   27: aload #12
    //   29: aload #6
    //   31: iconst_1
    //   32: iconst_1
    //   33: invokestatic ZM : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: istore #11
    //   42: aload #12
    //   44: sipush #30516
    //   47: sipush #-10283
    //   50: invokestatic a : (II)Ljava/lang/String;
    //   53: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: iload_2
    //   58: lookupswitch default -> 126, 0 -> 84, 1 -> 111
    //   84: aload #12
    //   86: sipush #30515
    //   89: sipush #-17210
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: iload #11
    //   101: ifne -> 126
    //   104: iconst_3
    //   105: anewarray burp/Zbqc
    //   108: invokestatic Zr : ([Lburp/Zbqc;)V
    //   111: aload #12
    //   113: sipush #30525
    //   116: sipush #-8100
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: aload #12
    //   128: sipush #30498
    //   131: sipush #17556
    //   134: invokestatic a : (II)Ljava/lang/String;
    //   137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload #12
    //   143: sipush #30523
    //   146: sipush #9038
    //   149: invokestatic a : (II)Ljava/lang/String;
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: pop
    //   156: aload #4
    //   158: getstatic burp/Ztz3.MATCH : Lburp/Ztz3;
    //   161: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   164: astore #13
    //   166: aload_1
    //   167: getstatic burp/Zzu2.FORM_ACTION_HIJACKING_REFLECTED : Lburp/Zzu2;
    //   170: if_acmpne -> 238
    //   173: aload #5
    //   175: invokevirtual Zd : ()Lburp/Zkcp;
    //   178: invokeinterface Zub : ()Lburp/Zll7;
    //   183: invokeinterface Zsf : ()Lburp/Zstu;
    //   188: invokeinterface Zis : ()Ljava/lang/String;
    //   193: astore #14
    //   195: aload #12
    //   197: aload #14
    //   199: invokestatic ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   202: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   205: aload #12
    //   207: sipush #30513
    //   210: sipush #-32227
    //   213: invokestatic a : (II)Ljava/lang/String;
    //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: aload #12
    //   222: aload #6
    //   224: iconst_1
    //   225: iconst_0
    //   226: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: pop
    //   233: iload #11
    //   235: ifne -> 359
    //   238: aload_1
    //   239: getstatic burp/Zzu2.FORM_ACTION_HIJACKING_STORED : Lburp/Zzu2;
    //   242: if_acmpne -> 348
    //   245: aload #5
    //   247: invokevirtual Zx : ()Lburp/Zrp9;
    //   250: invokeinterface Zub : ()Lburp/Zll7;
    //   255: invokeinterface Zsf : ()Lburp/Zstu;
    //   260: invokeinterface Zis : ()Ljava/lang/String;
    //   265: astore #14
    //   267: aload #12
    //   269: aload #14
    //   271: invokestatic ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   274: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   277: aload #12
    //   279: sipush #30521
    //   282: sipush #32199
    //   285: invokestatic a : (II)Ljava/lang/String;
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: aload #12
    //   294: aload #5
    //   296: invokevirtual Zx : ()Lburp/Zrp9;
    //   299: invokeinterface Zvs : ()[B
    //   304: invokestatic ZG : ([B)Ljava/lang/String;
    //   307: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   310: aload #12
    //   312: sipush #30512
    //   315: sipush #-30690
    //   318: invokestatic a : (II)Ljava/lang/String;
    //   321: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: pop
    //   325: aload #12
    //   327: aload #5
    //   329: invokevirtual Zx : ()Lburp/Zrp9;
    //   332: invokeinterface ZvM : ()[B
    //   337: invokestatic ZG : ([B)Ljava/lang/String;
    //   340: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   343: iload #11
    //   345: ifne -> 359
    //   348: iconst_0
    //   349: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   352: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   355: ldc ''
    //   357: astore #14
    //   359: aload #12
    //   361: sipush #30524
    //   364: sipush #-24479
    //   367: invokestatic a : (II)Ljava/lang/String;
    //   370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: pop
    //   374: aload #14
    //   376: aload #13
    //   378: invokevirtual equals : (Ljava/lang/Object;)Z
    //   381: ifeq -> 404
    //   384: aload #12
    //   386: sipush #30522
    //   389: sipush #-25057
    //   392: invokestatic a : (II)Ljava/lang/String;
    //   395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: pop
    //   399: iload #11
    //   401: ifne -> 441
    //   404: aload #12
    //   406: sipush #30527
    //   409: sipush #-8996
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: pop
    //   419: aload #12
    //   421: aload #13
    //   423: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   426: aload #12
    //   428: sipush #30519
    //   431: sipush #8894
    //   434: invokestatic a : (II)Ljava/lang/String;
    //   437: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: pop
    //   441: aload #12
    //   443: sipush #30518
    //   446: sipush #-13186
    //   449: invokestatic a : (II)Ljava/lang/String;
    //   452: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   455: pop
    //   456: aload #12
    //   458: sipush #30526
    //   461: sipush #-8072
    //   464: invokestatic a : (II)Ljava/lang/String;
    //   467: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: pop
    //   471: iload_2
    //   472: lookupswitch default -> 535, 0 -> 500, 1 -> 520
    //   500: aload #12
    //   502: sipush #30514
    //   505: sipush #-32192
    //   508: invokestatic a : (II)Ljava/lang/String;
    //   511: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: pop
    //   515: iload #11
    //   517: ifne -> 535
    //   520: aload #12
    //   522: sipush #30520
    //   525: sipush #12753
    //   528: invokestatic a : (II)Ljava/lang/String;
    //   531: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   534: pop
    //   535: aload #12
    //   537: invokevirtual toString : ()Ljava/lang/String;
    //   540: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÀÆ æ\\núãÊ`4²(þë)Èx@Ë£,.^ï© ,^}'å¿"Öm£hî.ò&g­u'x)sF:×p­nDg ÐaMÝÆ¿µÎ&Çóµ;Þcf¸RÑF1¿|MÑ Ù#ë³)(¼ÎUrÿt j@ù\\tÓk!ó±ä's3Þ%]_ïç¿ÃgÄ/- \\nb¹ô[ïVýÎBl­áîz\\të i÷¨ÿÅ,WÜ¦poñµDÚ\\b~·°z'¦#d±\\tÚQ³µauVæüMÂí"f¸Öú&À(¹õÒò\\næÊMÈúi<¤nÖö­uJ-¾¤ìùìEBUN~ý[q4ð<»Q8ã¸N%R.=\\fÉ;I(Ó|¼¥ê|ÒòcMw&ÆzöûÌ£ö_qpJÂø´}îÇÂwXËaôÑ!Do'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #106
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc '\\tc%pÎ aðúÃÿËßì\\nÚYEÏ¹æ÷i/Ò½'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #94
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
    //   128: putstatic burp/Zmmc.a : [Ljava/lang/String;
    //   131: bipush #17
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmmc.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #105
    //   214: goto -> 243
    //   217: bipush #46
    //   219: goto -> 243
    //   222: iconst_4
    //   223: goto -> 243
    //   226: bipush #66
    //   228: goto -> 243
    //   231: bipush #114
    //   233: goto -> 243
    //   236: bipush #113
    //   238: goto -> 243
    //   241: bipush #76
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
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
    int i = (paramInt1 ^ 0x7732) & 0xFFFF;
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
      char c = '·';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmmc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */