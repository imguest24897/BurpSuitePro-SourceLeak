package burp;

public class Zle {
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zr27 ZP(String paramString, Zzct paramZzct) {
    return ZY(paramString).ZF(paramZzct);
  }
  
  private static Zlmh ZY(String paramString) {
    // Byte code:
    //   0: invokestatic Zm : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: ifnonnull -> 35
    //   8: iconst_0
    //   9: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   12: sipush #-8457
    //   15: sipush #19955
    //   18: invokestatic a : (II)Ljava/lang/String;
    //   21: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   24: new burp/Zgx3
    //   27: dup
    //   28: getstatic burp/Zr27.NONE : Lburp/Zr27;
    //   31: invokespecial <init> : (Lburp/Zr27;)V
    //   34: areturn
    //   35: aload_0
    //   36: astore_2
    //   37: iconst_m1
    //   38: istore_3
    //   39: aload_2
    //   40: invokevirtual hashCode : ()I
    //   43: lookupswitch default -> 569, -1759619338 -> 276, -1666783060 -> 550, -1414043869 -> 232, -1238513605 -> 366, -828784136 -> 435, -195416303 -> 320, -195323276 -> 343, 3125404 -> 188, 3213227 -> 504, 13085340 -> 481, 80814319 -> 389, 230796440 -> 527, 260214870 -> 458, 772670093 -> 298, 820289069 -> 210, 1186311622 -> 412, 1970356908 -> 254
    //   188: aload_2
    //   189: sipush #-8464
    //   192: sipush #15776
    //   195: invokestatic a : (II)Ljava/lang/String;
    //   198: invokevirtual equals : (Ljava/lang/Object;)Z
    //   201: ifeq -> 569
    //   204: iconst_0
    //   205: istore_3
    //   206: iload_1
    //   207: ifeq -> 569
    //   210: aload_2
    //   211: sipush #-8450
    //   214: sipush #16082
    //   217: invokestatic a : (II)Ljava/lang/String;
    //   220: invokevirtual equals : (Ljava/lang/Object;)Z
    //   223: ifeq -> 569
    //   226: iconst_1
    //   227: istore_3
    //   228: iload_1
    //   229: ifeq -> 569
    //   232: aload_2
    //   233: sipush #-8463
    //   236: sipush #30772
    //   239: invokestatic a : (II)Ljava/lang/String;
    //   242: invokevirtual equals : (Ljava/lang/Object;)Z
    //   245: ifeq -> 569
    //   248: iconst_2
    //   249: istore_3
    //   250: iload_1
    //   251: ifeq -> 569
    //   254: aload_2
    //   255: sipush #-8469
    //   258: sipush #21026
    //   261: invokestatic a : (II)Ljava/lang/String;
    //   264: invokevirtual equals : (Ljava/lang/Object;)Z
    //   267: ifeq -> 569
    //   270: iconst_3
    //   271: istore_3
    //   272: iload_1
    //   273: ifeq -> 569
    //   276: aload_2
    //   277: sipush #-8449
    //   280: sipush #6603
    //   283: invokestatic a : (II)Ljava/lang/String;
    //   286: invokevirtual equals : (Ljava/lang/Object;)Z
    //   289: ifeq -> 569
    //   292: iconst_4
    //   293: istore_3
    //   294: iload_1
    //   295: ifeq -> 569
    //   298: aload_2
    //   299: sipush #-8454
    //   302: sipush #20397
    //   305: invokestatic a : (II)Ljava/lang/String;
    //   308: invokevirtual equals : (Ljava/lang/Object;)Z
    //   311: ifeq -> 569
    //   314: iconst_5
    //   315: istore_3
    //   316: iload_1
    //   317: ifeq -> 569
    //   320: aload_2
    //   321: sipush #-8455
    //   324: sipush #-4020
    //   327: invokestatic a : (II)Ljava/lang/String;
    //   330: invokevirtual equals : (Ljava/lang/Object;)Z
    //   333: ifeq -> 569
    //   336: bipush #6
    //   338: istore_3
    //   339: iload_1
    //   340: ifeq -> 569
    //   343: aload_2
    //   344: sipush #-8470
    //   347: sipush #-15680
    //   350: invokestatic a : (II)Ljava/lang/String;
    //   353: invokevirtual equals : (Ljava/lang/Object;)Z
    //   356: ifeq -> 569
    //   359: bipush #7
    //   361: istore_3
    //   362: iload_1
    //   363: ifeq -> 569
    //   366: aload_2
    //   367: sipush #-8452
    //   370: sipush #11917
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: invokevirtual equals : (Ljava/lang/Object;)Z
    //   379: ifeq -> 569
    //   382: bipush #8
    //   384: istore_3
    //   385: iload_1
    //   386: ifeq -> 569
    //   389: aload_2
    //   390: sipush #-8451
    //   393: sipush #-18356
    //   396: invokestatic a : (II)Ljava/lang/String;
    //   399: invokevirtual equals : (Ljava/lang/Object;)Z
    //   402: ifeq -> 569
    //   405: bipush #9
    //   407: istore_3
    //   408: iload_1
    //   409: ifeq -> 569
    //   412: aload_2
    //   413: sipush #-8453
    //   416: sipush #21688
    //   419: invokestatic a : (II)Ljava/lang/String;
    //   422: invokevirtual equals : (Ljava/lang/Object;)Z
    //   425: ifeq -> 569
    //   428: bipush #10
    //   430: istore_3
    //   431: iload_1
    //   432: ifeq -> 569
    //   435: aload_2
    //   436: sipush #-8460
    //   439: sipush #10694
    //   442: invokestatic a : (II)Ljava/lang/String;
    //   445: invokevirtual equals : (Ljava/lang/Object;)Z
    //   448: ifeq -> 569
    //   451: bipush #11
    //   453: istore_3
    //   454: iload_1
    //   455: ifeq -> 569
    //   458: aload_2
    //   459: sipush #-8462
    //   462: sipush #17206
    //   465: invokestatic a : (II)Ljava/lang/String;
    //   468: invokevirtual equals : (Ljava/lang/Object;)Z
    //   471: ifeq -> 569
    //   474: bipush #12
    //   476: istore_3
    //   477: iload_1
    //   478: ifeq -> 569
    //   481: aload_2
    //   482: sipush #-8459
    //   485: sipush #26339
    //   488: invokestatic a : (II)Ljava/lang/String;
    //   491: invokevirtual equals : (Ljava/lang/Object;)Z
    //   494: ifeq -> 569
    //   497: bipush #13
    //   499: istore_3
    //   500: iload_1
    //   501: ifeq -> 569
    //   504: aload_2
    //   505: sipush #-8458
    //   508: sipush #6407
    //   511: invokestatic a : (II)Ljava/lang/String;
    //   514: invokevirtual equals : (Ljava/lang/Object;)Z
    //   517: ifeq -> 569
    //   520: bipush #14
    //   522: istore_3
    //   523: iload_1
    //   524: ifeq -> 569
    //   527: aload_2
    //   528: sipush #-8461
    //   531: sipush #1216
    //   534: invokestatic a : (II)Ljava/lang/String;
    //   537: invokevirtual equals : (Ljava/lang/Object;)Z
    //   540: ifeq -> 569
    //   543: bipush #15
    //   545: istore_3
    //   546: iload_1
    //   547: ifeq -> 569
    //   550: aload_2
    //   551: sipush #-8456
    //   554: sipush #-14429
    //   557: invokestatic a : (II)Ljava/lang/String;
    //   560: invokevirtual equals : (Ljava/lang/Object;)Z
    //   563: ifeq -> 569
    //   566: bipush #16
    //   568: istore_3
    //   569: iload_3
    //   570: tableswitch default -> 723, 0 -> 652, 1 -> 660, 2 -> 671, 3 -> 671, 4 -> 671, 5 -> 671, 6 -> 671, 7 -> 671, 8 -> 671, 9 -> 671, 10 -> 671, 11 -> 671, 12 -> 671, 13 -> 682, 14 -> 690, 15 -> 701, 16 -> 712
    //   652: new burp/Zz0r
    //   655: dup
    //   656: invokespecial <init> : ()V
    //   659: areturn
    //   660: new burp/Zgx3
    //   663: dup
    //   664: getstatic burp/Zr27.CLIENT_SIDE_JSON_INJECTION : Lburp/Zr27;
    //   667: invokespecial <init> : (Lburp/Zr27;)V
    //   670: areturn
    //   671: new burp/Zgx3
    //   674: dup
    //   675: getstatic burp/Zr27.LINK_MANIPULATION_AND_OPEN_REDIRECTION : Lburp/Zr27;
    //   678: invokespecial <init> : (Lburp/Zr27;)V
    //   681: areturn
    //   682: new burp/Zmy6
    //   685: dup
    //   686: invokespecial <init> : ()V
    //   689: areturn
    //   690: new burp/Zgx3
    //   693: dup
    //   694: getstatic burp/Zr27.DOM_XSS_HTML : Lburp/Zr27;
    //   697: invokespecial <init> : (Lburp/Zr27;)V
    //   700: areturn
    //   701: new burp/Zgx3
    //   704: dup
    //   705: getstatic burp/Zr27.CLIENT_SIDE_SQL_INJECTION : Lburp/Zr27;
    //   708: invokespecial <init> : (Lburp/Zr27;)V
    //   711: areturn
    //   712: new burp/Zgx3
    //   715: dup
    //   716: getstatic burp/Zr27.JQUERY_SELECTOR : Lburp/Zr27;
    //   719: invokespecial <init> : (Lburp/Zr27;)V
    //   722: areturn
    //   723: iconst_1
    //   724: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   727: aload_0
    //   728: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   731: new burp/Zgx3
    //   734: dup
    //   735: getstatic burp/Zr27.NONE : Lburp/Zr27;
    //   738: invokespecial <init> : (Lburp/Zr27;)V
    //   741: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'OÞmôM8(ý²à¶Òm:Æç®<Ô¯\\tð«W@ÂøûÁø ¢öqMíVê±\\bUíòDÈ5\\nÇÑ5Ø:Qg4\\t.õå\á-\\tu¶ñé¸oì[Qu(q½$<Ð\\nhRÌ¡(.¿J¬¦%ÔF_ï4ò²ÕkTÇPÜÇí8F\\t¹¤¦x4 ,e\\f¯\\fóÕ0Óâ­¥Üó×Èý&9«Ó]é¯£Í\\tJ±ñ+¹HËr'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #104
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
    //   68: ldc '*[s¯­raEG/Ôë76@Ë'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #92
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
    //   129: putstatic burp/Zle.a : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zle.b : [Ljava/lang/String;
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
    //   212: bipush #118
    //   214: goto -> 244
    //   217: bipush #21
    //   219: goto -> 244
    //   222: bipush #42
    //   224: goto -> 244
    //   227: bipush #82
    //   229: goto -> 244
    //   232: bipush #52
    //   234: goto -> 244
    //   237: bipush #92
    //   239: goto -> 244
    //   242: bipush #127
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
    int i = (paramInt1 ^ 0xFFFFDEFA) & 0xFFFF;
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
      byte b1 = 113;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zle.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */