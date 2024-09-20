package burp;

import java.util.List;

public class Zmmp extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: istore #11
    //   5: aload #5
    //   7: invokevirtual Zs : ()Z
    //   10: ifne -> 22
    //   13: iconst_0
    //   14: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   17: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   20: aconst_null
    //   21: areturn
    //   22: new java/lang/StringBuilder
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore #12
    //   31: aload #4
    //   33: invokevirtual Zm : ()Lburp/Zlt9;
    //   36: getstatic burp/Zlt9.MERGE_MULTIPLE_IDENTIFIERS : Lburp/Zlt9;
    //   39: if_acmpne -> 62
    //   42: aload #12
    //   44: sipush #16993
    //   47: sipush #11650
    //   50: invokestatic a : (II)Ljava/lang/String;
    //   53: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: iload #11
    //   59: ifne -> 164
    //   62: aload #4
    //   64: invokevirtual Zm : ()Lburp/Zlt9;
    //   67: getstatic burp/Zlt9.MERGE_SINGLE_IDENTIFIER : Lburp/Zlt9;
    //   70: if_acmpne -> 121
    //   73: aload #12
    //   75: sipush #16998
    //   78: sipush #1502
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: aload #12
    //   90: aload #4
    //   92: getstatic burp/Ztz3.ACTION_URL_HOST : Lburp/Ztz3;
    //   95: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   98: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   101: aload #12
    //   103: sipush #17004
    //   106: sipush #26505
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: iload #11
    //   118: ifne -> 164
    //   121: aload #12
    //   123: sipush #17001
    //   126: sipush #20787
    //   129: invokestatic a : (II)Ljava/lang/String;
    //   132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: aload #12
    //   138: aload #4
    //   140: getstatic burp/Ztz3.ACTION_URL_HOST : Lburp/Ztz3;
    //   143: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   146: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   149: aload #12
    //   151: sipush #17003
    //   154: sipush #-3588
    //   157: invokestatic a : (II)Ljava/lang/String;
    //   160: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: aload #4
    //   166: invokevirtual Zm : ()Lburp/Zlt9;
    //   169: getstatic burp/Zlt9.MERGE_SINGLE_IDENTIFIER : Lburp/Zlt9;
    //   172: if_acmpeq -> 295
    //   175: aload #5
    //   177: invokevirtual Zt : ()Lburp/Zt38;
    //   180: astore #13
    //   182: aload #12
    //   184: sipush #17005
    //   187: sipush #-25304
    //   190: invokestatic a : (II)Ljava/lang/String;
    //   193: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: pop
    //   197: aload #13
    //   199: invokeinterface ZCr : ()Lburp/Zefg;
    //   204: invokeinterface iterator : ()Ljava/util/Iterator;
    //   209: astore #14
    //   211: aload #14
    //   213: invokeinterface hasNext : ()Z
    //   218: ifeq -> 280
    //   221: aload #14
    //   223: invokeinterface next : ()Ljava/lang/Object;
    //   228: checkcast burp/Zsdr
    //   231: astore #15
    //   233: aload #12
    //   235: sipush #17000
    //   238: sipush #-12426
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: aload #12
    //   250: aload #15
    //   252: invokeinterface toString : ()Ljava/lang/String;
    //   257: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   260: aload #12
    //   262: sipush #16995
    //   265: sipush #2963
    //   268: invokestatic a : (II)Ljava/lang/String;
    //   271: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: pop
    //   275: iload #11
    //   277: ifne -> 211
    //   280: aload #12
    //   282: sipush #16997
    //   285: sipush #-5568
    //   288: invokestatic a : (II)Ljava/lang/String;
    //   291: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: pop
    //   295: aload #12
    //   297: aload #4
    //   299: aload #5
    //   301: sipush #16992
    //   304: sipush #15415
    //   307: invokestatic a : (II)Ljava/lang/String;
    //   310: invokestatic ZE : (Ljava/lang/StringBuilder;Lburp/Ztlj;Lburp/Ztub;Ljava/lang/String;)V
    //   313: aload #12
    //   315: invokevirtual toString : ()Ljava/lang/String;
    //   318: areturn
  }
  
  public String Z_(List<Zrdb> paramList) {
    // Byte code:
    //   0: new java/util/TreeSet
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZE : ()I
    //   11: aload_1
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #4
    //   19: istore_2
    //   20: aload #4
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 64
    //   30: aload #4
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast burp/Zrdb
    //   40: astore #5
    //   42: aload_3
    //   43: aload #5
    //   45: invokeinterface ZaT : ()Lburp/Ztlj;
    //   50: getstatic burp/Ztz3.ACTION_URL : Lburp/Ztz3;
    //   53: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   56: invokevirtual add : (Ljava/lang/Object;)Z
    //   59: pop
    //   60: iload_2
    //   61: ifeq -> 20
    //   64: new java/lang/StringBuilder
    //   67: dup
    //   68: invokespecial <init> : ()V
    //   71: astore #4
    //   73: aload #4
    //   75: aload_1
    //   76: invokeinterface size : ()I
    //   81: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   84: pop
    //   85: aload #4
    //   87: sipush #17007
    //   90: sipush #32285
    //   93: invokestatic a : (II)Ljava/lang/String;
    //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: aload_3
    //   101: invokevirtual size : ()I
    //   104: istore #5
    //   106: iload #5
    //   108: iconst_1
    //   109: if_icmpne -> 131
    //   112: aload #4
    //   114: sipush #16999
    //   117: sipush #12465
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: iload_2
    //   128: ifeq -> 154
    //   131: aload #4
    //   133: iload #5
    //   135: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: aload #4
    //   141: sipush #17006
    //   144: sipush #-2956
    //   147: invokestatic a : (II)Ljava/lang/String;
    //   150: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: aload_3
    //   155: invokevirtual iterator : ()Ljava/util/Iterator;
    //   158: astore #6
    //   160: aload #6
    //   162: invokeinterface hasNext : ()Z
    //   167: ifeq -> 223
    //   170: aload #6
    //   172: invokeinterface next : ()Ljava/lang/Object;
    //   177: checkcast java/lang/String
    //   180: astore #7
    //   182: aload #4
    //   184: sipush #16996
    //   187: sipush #-17591
    //   190: invokestatic a : (II)Ljava/lang/String;
    //   193: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: pop
    //   197: aload #4
    //   199: aload #7
    //   201: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   204: aload #4
    //   206: sipush #16994
    //   209: sipush #18742
    //   212: invokestatic a : (II)Ljava/lang/String;
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: pop
    //   219: iload_2
    //   220: ifeq -> 160
    //   223: aload #4
    //   225: sipush #17002
    //   228: sipush #-17642
    //   231: invokestatic a : (II)Ljava/lang/String;
    //   234: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: pop
    //   238: aload #4
    //   240: invokevirtual toString : ()Ljava/lang/String;
    //   243: invokestatic Zwu : ()[Lburp/Zbqc;
    //   246: ifnonnull -> 256
    //   249: iinc #2, 1
    //   252: iload_2
    //   253: invokestatic ZW : (I)V
    //   256: areturn
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    return (new Zxll(new Zgq9(new Zid(new Zkc1())))).Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'áï×Çó:\\n¦TÆ*]@oæý-ñ7;/3Âc;[V)t©Ééå¥ÏYZOdî8fÂÑ<5IPÀbÏN!zcÁinØ©=cÊ´ÑÄ¹ ©cÅ=Oì)yaÚ~0vqgj\\tPøû3ÓKc;Í¦`K{vHJ%§`0\\nåj`ûéD¬öc×oqÿcÄÝÂf:vY&ÝÑyCKI­¦¤¶¿¡#l\\f-òOÏZ@\\bàqÇ"t«È¥é!<ÉÊ2'$-,hØ<êì ³¶Ë ÀÖàë£!;°¬\\t÷¾ÈÌßÞ?{ïüYÅçE·g\\f@x7J7(Ùç_::êÿäÞXTèÓt[\\bFd¶3<UæÇaÆ¸é&â¨¢Èöæ;í,ÁrpÖ«t8[È0n_Â'ÖàÑ¢ï¹Õ9¯(DËCçsì0u±¢GZÆåÓ­âhÂ'ªj,"mCxø}Ø¬<Nv\\r\\n=M4\\rÜ¶¶!"²ºUÜ¸Ö,.ÀÅàv÷°/|HÌ©ýWvBj¥µ¸ß_L/Ív'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #21
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
    //   67: ldc 'ZY1¦Ö~(Bõ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_5
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #29
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zmmp.a : [Ljava/lang/String;
    //   130: bipush #16
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zmmp.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #113
    //   214: goto -> 244
    //   217: bipush #118
    //   219: goto -> 244
    //   222: bipush #61
    //   224: goto -> 244
    //   227: bipush #94
    //   229: goto -> 244
    //   232: bipush #54
    //   234: goto -> 244
    //   237: bipush #78
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
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x426C) & 0xFFFF;
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
      char c = '´';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmmp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */