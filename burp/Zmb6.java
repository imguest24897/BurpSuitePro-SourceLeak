package burp;

public class Zmb6 extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic ZC : ()[Ljava/lang/String;
    //   3: astore #11
    //   5: new java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #12
    //   14: aload_1
    //   15: getstatic burp/Zzu2.JWT_WEAK_HMAC_SECRET : Lburp/Zzu2;
    //   18: if_acmpne -> 129
    //   21: aload #5
    //   23: invokevirtual Zt : ()Lburp/Zt38;
    //   26: invokeinterface ZCr : ()Lburp/Zefg;
    //   31: astore #13
    //   33: aload #13
    //   35: ifnull -> 49
    //   38: aload #13
    //   40: invokeinterface size : ()I
    //   45: iconst_1
    //   46: if_icmpge -> 58
    //   49: iconst_0
    //   50: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   53: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   56: aconst_null
    //   57: areturn
    //   58: aload #12
    //   60: sipush #29810
    //   63: sipush #-23240
    //   66: invokestatic a : (II)Ljava/lang/String;
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload #12
    //   75: sipush #29820
    //   78: sipush #15217
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: aload #12
    //   90: aload #13
    //   92: iconst_0
    //   93: invokeinterface get : (I)Ljava/lang/Object;
    //   98: checkcast burp/Zsdr
    //   101: invokeinterface toString : ()Ljava/lang/String;
    //   106: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   109: aload #12
    //   111: sipush #29816
    //   114: sipush #-15820
    //   117: invokestatic a : (II)Ljava/lang/String;
    //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: pop
    //   124: aload #11
    //   126: ifnonnull -> 417
    //   129: aload_1
    //   130: getstatic burp/Zzu2.JWT_SIGNATURE_NOT_VERIFIED : Lburp/Zzu2;
    //   133: if_acmpne -> 184
    //   136: aload #12
    //   138: sipush #29821
    //   141: sipush #27534
    //   144: invokestatic a : (II)Ljava/lang/String;
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: pop
    //   151: aload #12
    //   153: aload #6
    //   155: iconst_1
    //   156: iconst_1
    //   157: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   160: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: aload #12
    //   166: sipush #29818
    //   169: sipush #30201
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: aload #11
    //   181: ifnonnull -> 417
    //   184: aload_1
    //   185: getstatic burp/Zzu2.JWT_NONE_ALG_SUPPORTED : Lburp/Zzu2;
    //   188: if_acmpne -> 239
    //   191: aload #12
    //   193: sipush #29814
    //   196: sipush #19949
    //   199: invokestatic a : (II)Ljava/lang/String;
    //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: aload #12
    //   208: aload #6
    //   210: iconst_1
    //   211: iconst_1
    //   212: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: pop
    //   219: aload #12
    //   221: sipush #29823
    //   224: sipush #-7688
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: pop
    //   234: aload #11
    //   236: ifnonnull -> 417
    //   239: aload_1
    //   240: getstatic burp/Zzu2.JWT_JWK_HEADER_SUPPORTED : Lburp/Zzu2;
    //   243: if_acmpne -> 294
    //   246: aload #12
    //   248: sipush #29808
    //   251: sipush #10124
    //   254: invokestatic a : (II)Ljava/lang/String;
    //   257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: pop
    //   261: aload #12
    //   263: aload #6
    //   265: iconst_1
    //   266: iconst_1
    //   267: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   270: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: pop
    //   274: aload #12
    //   276: sipush #29817
    //   279: sipush #26802
    //   282: invokestatic a : (II)Ljava/lang/String;
    //   285: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: pop
    //   289: aload #11
    //   291: ifnonnull -> 417
    //   294: aload_1
    //   295: getstatic burp/Zzu2.JWT_JKU_HEADER_SUPPORTED : Lburp/Zzu2;
    //   298: if_acmpne -> 349
    //   301: aload #12
    //   303: sipush #29819
    //   306: sipush #16748
    //   309: invokestatic a : (II)Ljava/lang/String;
    //   312: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: pop
    //   316: aload #12
    //   318: aload #6
    //   320: iconst_1
    //   321: iconst_1
    //   322: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: pop
    //   329: aload #12
    //   331: sipush #29822
    //   334: sipush #14507
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: pop
    //   344: aload #11
    //   346: ifnonnull -> 417
    //   349: aload_1
    //   350: getstatic burp/Zzu2.JWT_X5U_HEADER_SUPPORTED : Lburp/Zzu2;
    //   353: if_acmpne -> 404
    //   356: aload #12
    //   358: sipush #29809
    //   361: sipush #13587
    //   364: invokestatic a : (II)Ljava/lang/String;
    //   367: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: pop
    //   371: aload #12
    //   373: aload #6
    //   375: iconst_1
    //   376: iconst_1
    //   377: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   380: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: pop
    //   384: aload #12
    //   386: sipush #29811
    //   389: sipush #7068
    //   392: invokestatic a : (II)Ljava/lang/String;
    //   395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: pop
    //   399: aload #11
    //   401: ifnonnull -> 417
    //   404: iconst_0
    //   405: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   408: aload_1
    //   409: invokeinterface toString : ()Ljava/lang/String;
    //   414: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   417: aload #12
    //   419: invokevirtual toString : ()Ljava/lang/String;
    //   422: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '°ã<ÑÌgÉy@V+-÷¸4^ìôÒy¾MO:áÎyÑ_?X©ÌÌUíþ¾éªm(Êcåq?#(@JDTiÁ¨(ï<%¬òõólõä²Ãq;9!@B|voC'ïÁ½¡7Äý?>EÖÒÂö«ÖÒgðÅG\\br¥QüôfÕ\\tSÉéÃùþ\\fTøt½ì[XçüOð¯\\n &z3b^úÁSÜ~¾Ô ëGñø¿{&§ü-þ~¢Ü3Ð$æ§eÙ[Üëràå3»f0Ä¡% µ|]Pxû=ÊÉÚñ?Jóµj½_-è®+¤¡àZ!3ÜÉüe¬ªHÿ3Ú?#y¢­l¥hEh+éºÓU\\fh`oÌêÝY|'C!ñ°Î5¿f1ÑU¾8Nûº]°¬vçÅê)5ÛÓùyöä¨gKXg8Ú\ØM.¤´í`) ¤b\\fAá{\\tF:WgÅ´ó¼ÆùB3Ö¾G·ìÔ.B¿¾¼\\f=$å6½7¹JvãÍ¨NÓÅn×¡w"¦,·²>2:Ê¸ªhZ¬º"ôytÎÅV½¦»ÙÇoUJÕ~Ñ$9[Æ O\\r«s¶ãàÙæ¨Átãó$í9ëò©ädövÖig=¥kÛÜu>\\n¬¾ÏÚjÛD9ZàÖûjlÇòº\\n)8(õ¹Ûfë} !´L²<ó&+eT,ç]3yíÑA.#×þùe£áoM)Ø\Üq£n÷Ì~8´ÿwAÇ£ïÙWDøäýu6#ïÖ?\È*´ü$Ò\\tQ¯§ªPÜÛ>´2ÅGßVp5Ôwþ_h÷7¦ês;ð«§Ñ w²ñâ^bÙ^Å©>¦±×èT*å <dc[_÷è3u'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #61
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #21
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
    //   68: ldc 'tiï®ëÖâìqÍHÝÏ%¥²íwøÿ_K¹Á+Usf­éi8m¨0\\b\\n+TröPtÿ^«gZ³ýÊ°õØØKxªBÉ.Þs gfý)¸ô"¼ |'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #74
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #126
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
    //   129: putstatic burp/Zmb6.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmb6.b : [Ljava/lang/String;
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
    //   212: bipush #76
    //   214: goto -> 244
    //   217: bipush #55
    //   219: goto -> 244
    //   222: bipush #100
    //   224: goto -> 244
    //   227: bipush #95
    //   229: goto -> 244
    //   232: bipush #22
    //   234: goto -> 244
    //   237: bipush #24
    //   239: goto -> 244
    //   242: bipush #77
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
    int i = (paramInt1 ^ 0x747A) & 0xFFFF;
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
      byte b1 = 95;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmb6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */