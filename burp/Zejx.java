package burp;

import java.util.List;

public class Zejx {
  private static final Zges ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static List<Zges> ZV(List<String> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZJ : ()I
    //   11: aload_3
    //   12: getstatic burp/Zejx.ZN : Lburp/Zges;
    //   15: invokeinterface add : (Ljava/lang/Object;)Z
    //   20: pop
    //   21: istore_2
    //   22: aload_0
    //   23: invokeinterface isEmpty : ()Z
    //   28: ifne -> 119
    //   31: aload_0
    //   32: iconst_0
    //   33: invokeinterface get : (I)Ljava/lang/Object;
    //   38: checkcast java/lang/String
    //   41: invokestatic Zw : (Ljava/lang/String;)Lburp/Zz7s;
    //   44: invokeinterface Zy : ()Lburp/Zztf;
    //   49: astore #4
    //   51: aload_3
    //   52: new burp/Zges
    //   55: dup
    //   56: sipush #-20906
    //   59: sipush #-3225
    //   62: invokestatic a : (II)Ljava/lang/String;
    //   65: aload #4
    //   67: getfield ZY : Ljava/lang/String;
    //   70: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   73: invokeinterface add : (Ljava/lang/Object;)Z
    //   78: pop
    //   79: aload_3
    //   80: new burp/Zges
    //   83: dup
    //   84: sipush #-20905
    //   87: sipush #-24018
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: aload #4
    //   95: getfield Ze : Ljava/lang/String;
    //   98: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   101: invokeinterface add : (Ljava/lang/Object;)Z
    //   106: pop
    //   107: aload_0
    //   108: iconst_0
    //   109: invokeinterface remove : (I)Ljava/lang/Object;
    //   114: pop
    //   115: iload_2
    //   116: ifeq -> 169
    //   119: aload_3
    //   120: new burp/Zges
    //   123: dup
    //   124: sipush #-20911
    //   127: sipush #-22554
    //   130: invokestatic a : (II)Ljava/lang/String;
    //   133: ldc ''
    //   135: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   138: invokeinterface add : (Ljava/lang/Object;)Z
    //   143: pop
    //   144: aload_3
    //   145: new burp/Zges
    //   148: dup
    //   149: sipush #-20908
    //   152: sipush #-26130
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: ldc ''
    //   160: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   163: invokeinterface add : (Ljava/lang/Object;)Z
    //   168: pop
    //   169: iconst_0
    //   170: istore #4
    //   172: aload_0
    //   173: invokeinterface iterator : ()Ljava/util/Iterator;
    //   178: astore #5
    //   180: aload #5
    //   182: invokeinterface hasNext : ()Z
    //   187: ifeq -> 494
    //   190: aload #5
    //   192: invokeinterface next : ()Ljava/lang/Object;
    //   197: checkcast java/lang/String
    //   200: astore #6
    //   202: aload #6
    //   204: ldc ':'
    //   206: invokevirtual indexOf : (Ljava/lang/String;)I
    //   209: istore #7
    //   211: iload #7
    //   213: iconst_m1
    //   214: if_icmpeq -> 250
    //   217: iload #7
    //   219: iconst_1
    //   220: iadd
    //   221: aload #6
    //   223: invokevirtual length : ()I
    //   226: if_icmpge -> 250
    //   229: aload #6
    //   231: iload #7
    //   233: iconst_1
    //   234: iadd
    //   235: invokevirtual charAt : (I)C
    //   238: bipush #32
    //   240: if_icmpne -> 250
    //   243: iload #7
    //   245: iconst_2
    //   246: iadd
    //   247: goto -> 254
    //   250: iload #7
    //   252: iconst_1
    //   253: iadd
    //   254: istore #8
    //   256: iload #7
    //   258: iconst_m1
    //   259: if_icmpne -> 267
    //   262: aload #6
    //   264: goto -> 275
    //   267: aload #6
    //   269: iconst_0
    //   270: iload #7
    //   272: invokevirtual substring : (II)Ljava/lang/String;
    //   275: astore #9
    //   277: iload #7
    //   279: iconst_m1
    //   280: if_icmpne -> 288
    //   283: ldc ''
    //   285: goto -> 295
    //   288: aload #6
    //   290: iload #8
    //   292: invokevirtual substring : (I)Ljava/lang/String;
    //   295: astore #10
    //   297: sipush #-20902
    //   300: sipush #-21215
    //   303: invokestatic a : (II)Ljava/lang/String;
    //   306: aload #9
    //   308: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   311: ifeq -> 351
    //   314: iload #4
    //   316: ifne -> 351
    //   319: aload_3
    //   320: iconst_3
    //   321: new burp/Zges
    //   324: dup
    //   325: sipush #-20901
    //   328: sipush #-19655
    //   331: invokestatic a : (II)Ljava/lang/String;
    //   334: aload #10
    //   336: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   339: invokeinterface add : (ILjava/lang/Object;)V
    //   344: iconst_1
    //   345: istore #4
    //   347: iload_2
    //   348: ifeq -> 180
    //   351: iload_1
    //   352: ifeq -> 375
    //   355: sipush #-20904
    //   358: sipush #2551
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: aload #9
    //   366: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   369: ifeq -> 375
    //   372: goto -> 180
    //   375: sipush #-20910
    //   378: sipush #26335
    //   381: invokestatic a : (II)Ljava/lang/String;
    //   384: aload #9
    //   386: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   389: ifeq -> 466
    //   392: aload #10
    //   394: sipush #-20903
    //   397: sipush #20777
    //   400: invokestatic a : (II)Ljava/lang/String;
    //   403: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   406: astore #11
    //   408: aload #11
    //   410: arraylength
    //   411: istore #12
    //   413: iconst_0
    //   414: istore #13
    //   416: iload #13
    //   418: iload #12
    //   420: if_icmpge -> 462
    //   423: aload #11
    //   425: iload #13
    //   427: aaload
    //   428: astore #14
    //   430: aload_3
    //   431: new burp/Zges
    //   434: dup
    //   435: sipush #-20909
    //   438: sipush #14521
    //   441: invokestatic a : (II)Ljava/lang/String;
    //   444: aload #14
    //   446: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   449: invokeinterface add : (Ljava/lang/Object;)Z
    //   454: pop
    //   455: iinc #13, 1
    //   458: iload_2
    //   459: ifeq -> 416
    //   462: iload_2
    //   463: ifeq -> 490
    //   466: aload_3
    //   467: new burp/Zges
    //   470: dup
    //   471: aload #9
    //   473: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   476: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   479: aload #10
    //   481: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   484: invokeinterface add : (Ljava/lang/Object;)Z
    //   489: pop
    //   490: iload_2
    //   491: ifeq -> 180
    //   494: aload_3
    //   495: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '{¼AQ^Fé1e¦éw¯Ïþ°·¤oÀáQT%Ødþ(|uÆ¦/8Þ¯Þä;l\\nÞCÇ¬V\\rã'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #22
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
    //   68: ldc 'ÅzÔ=½4B©!'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #10
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #44
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
    //   129: putstatic burp/Zejx.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zejx.b : [Ljava/lang/String;
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
    //   212: bipush #94
    //   214: goto -> 244
    //   217: bipush #18
    //   219: goto -> 244
    //   222: bipush #11
    //   224: goto -> 244
    //   227: bipush #107
    //   229: goto -> 244
    //   232: bipush #124
    //   234: goto -> 244
    //   237: bipush #35
    //   239: goto -> 244
    //   242: bipush #8
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
    //   300: new burp/Zges
    //   303: dup
    //   304: sipush #-20912
    //   307: sipush #-30942
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: sipush #-20907
    //   316: sipush #27787
    //   319: invokestatic a : (II)Ljava/lang/String;
    //   322: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   325: putstatic burp/Zejx.ZN : Lburp/Zges;
    //   328: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAE52) & 0xFFFF;
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
      byte b1 = 5;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zejx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */