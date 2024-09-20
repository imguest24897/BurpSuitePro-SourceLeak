package burp;

import java.util.List;

public class Zmmn extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic Zv : ()Z
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
    //   91: invokestatic ZE : (Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    //   94: iload #11
    //   96: ifeq -> 58
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
    //   133: sipush #-19916
    //   136: sipush #-28773
    //   139: invokestatic a : (II)Ljava/lang/String;
    //   142: goto -> 154
    //   145: sipush #-19932
    //   148: sipush #-31195
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
    //   179: sipush #-19931
    //   182: sipush #-25757
    //   185: invokestatic a : (II)Ljava/lang/String;
    //   188: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: pop
    //   192: aload #15
    //   194: aload #17
    //   196: invokeinterface next : ()Ljava/lang/Object;
    //   201: checkcast java/lang/String
    //   204: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   207: aload #15
    //   209: sipush #-19917
    //   212: sipush #-8375
    //   215: invokestatic a : (II)Ljava/lang/String;
    //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: pop
    //   222: iload #11
    //   224: ifeq -> 167
    //   227: aload #14
    //   229: invokeinterface iterator : ()Ljava/util/Iterator;
    //   234: astore #17
    //   236: aload #17
    //   238: invokeinterface hasNext : ()Z
    //   243: ifeq -> 296
    //   246: aload #15
    //   248: sipush #-19907
    //   251: sipush #4823
    //   254: invokestatic a : (II)Ljava/lang/String;
    //   257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: pop
    //   261: aload #15
    //   263: aload #17
    //   265: invokeinterface next : ()Ljava/lang/Object;
    //   270: checkcast java/lang/String
    //   273: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   276: aload #15
    //   278: sipush #-19905
    //   281: sipush #11974
    //   284: invokestatic a : (II)Ljava/lang/String;
    //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: pop
    //   291: iload #11
    //   293: ifeq -> 236
    //   296: aload #15
    //   298: sipush #-19906
    //   301: sipush #-22709
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
    //   333: sipush #-19914
    //   336: sipush #-954
    //   339: invokestatic a : (II)Ljava/lang/String;
    //   342: goto -> 354
    //   345: sipush #-19913
    //   348: sipush #17888
    //   351: invokestatic a : (II)Ljava/lang/String;
    //   354: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: pop
    //   358: aload #15
    //   360: aload #13
    //   362: invokeinterface size : ()I
    //   367: iconst_1
    //   368: if_icmpne -> 383
    //   371: sipush #-19910
    //   374: sipush #23005
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: goto -> 392
    //   383: sipush #-19920
    //   386: sipush #-4504
    //   389: invokestatic a : (II)Ljava/lang/String;
    //   392: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   395: pop
    //   396: aload #15
    //   398: sipush #-19933
    //   401: sipush #-8471
    //   404: invokestatic a : (II)Ljava/lang/String;
    //   407: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   410: pop
    //   411: iload #11
    //   413: ifeq -> 463
    //   416: aload #15
    //   418: iload #16
    //   420: ifeq -> 435
    //   423: sipush #-19929
    //   426: sipush #-3478
    //   429: invokestatic a : (II)Ljava/lang/String;
    //   432: goto -> 444
    //   435: sipush #-19915
    //   438: sipush #-25300
    //   441: invokestatic a : (II)Ljava/lang/String;
    //   444: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   447: pop
    //   448: aload #15
    //   450: sipush #-19930
    //   453: sipush #-1245
    //   456: invokestatic a : (II)Ljava/lang/String;
    //   459: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   462: pop
    //   463: aload #15
    //   465: sipush #-19918
    //   468: sipush #-11089
    //   471: invokestatic a : (II)Ljava/lang/String;
    //   474: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   477: pop
    //   478: aload #15
    //   480: iload #16
    //   482: ifeq -> 497
    //   485: sipush #-19912
    //   488: sipush #-21838
    //   491: invokestatic a : (II)Ljava/lang/String;
    //   494: goto -> 506
    //   497: sipush #-19909
    //   500: sipush #-13462
    //   503: invokestatic a : (II)Ljava/lang/String;
    //   506: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   509: pop
    //   510: aload #15
    //   512: aload #4
    //   514: aload #5
    //   516: sipush #-19919
    //   519: sipush #-12509
    //   522: invokestatic a : (II)Ljava/lang/String;
    //   525: invokestatic ZE : (Ljava/lang/StringBuilder;Lburp/Ztlj;Lburp/Ztub;Ljava/lang/String;)V
    //   528: aload #15
    //   530: invokevirtual toString : ()Ljava/lang/String;
    //   533: areturn
  }
  
  public String Z_(List<Zrdb> paramList) {
    return Zmey.ZC(paramList, a(-19908, -7454), a(-19911, 13911), Zmey.ZN);
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '<ÕºaÜ\ÁGÝ!íÏK;Ú.\\tÏ3tÉÜ3Kë{â¯ÖIÅM qY\\b`1úÒHÔ06Ìd· òásX`på\\n½\\n/p²Hâg»%»qúÇöz}ª^Ë«ðÓßç3ep¢íqëÍÞÖÑ\\b¨NqõEÔ©xÒSÓA{ªtÜ\\t)Ë°Ô×Zö=ÉW^Â°©õ\õ&¸l0u![àÉÖ µE¾6Y\\täC¬Óýj·&®kàÙ7µ1øðéÄù\\f\\f #.èÅûs]­ÑÞ o¬k ãÌ¢ø½¢ÌT¼±ºè=£6\\r7KZp'ÆÕ,å<Rº»L}ÿAßãS gØô%wÊ§A¹1.\\be0ï"úÉÒ\\tµÐ\}ý¥m4ý¨sd ßz%`sd;R\\n \\nG/Ñúö(|è»QÒoÅº%Á}ñ´]4>J°ÉÿCvdý.ø±{RÈD>Hvãð»µ¤_$/¿u¯½|$+ÃÂÝ$á&©X²åÜùOØÐdlÏL[¡LÛØã/¸?)ßArßtíPÂÞ\\f¾üõ1³ûÿë®&£6ÌrÁÄñF£fe%t5+ã!ÒøÓ¹ëk\\r \\b;[¹¸öU,±4É'tëÅ58 \\rÐ,\\bÁÉîï"zÕÔþýwM¾h|7²^æÐìªx]&.<öOnÔþâxR(8»q@-eõâªU·Ø¤yez×q@0\\n3¨)YWîïÁ»; Áå³#,}±FæÞÞ§Ó¢IÏ"$íßJ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_3
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
    //   64: goto -> 23
    //   67: ldc 'î£à¦Àï+í®__u¡¥ýJuc^B\\f8Åºö$0Ü¬Û?\\nC-âIédD¿{ôROækUKg¹ä>2+ºPÉ»í'ÑHÃ\\fÍÖ²ø£6m³À½SM1ëËØ'EøT:{\\n¤Ï¥Ïø:?F°ö2\\ré  «\\ræ³ê¼¼\\tôÓ´ÌÀ&±nÌÉ|·Öâ­~tªbø'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #106
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #41
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
    //   128: putstatic burp/Zmmn.a : [Ljava/lang/String;
    //   131: bipush #21
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmmn.b : [Ljava/lang/String;
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
    //   212: bipush #20
    //   214: goto -> 244
    //   217: bipush #10
    //   219: goto -> 244
    //   222: bipush #8
    //   224: goto -> 244
    //   227: bipush #109
    //   229: goto -> 244
    //   232: bipush #24
    //   234: goto -> 244
    //   237: bipush #8
    //   239: goto -> 244
    //   242: bipush #18
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB237) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmmn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */