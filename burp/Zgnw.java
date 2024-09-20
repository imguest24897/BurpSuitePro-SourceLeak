package burp;

import java.util.List;
import java.util.stream.Collectors;

public class Zgnw {
  private static final Zti_ ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static String Zq(Zefg<Zsdr> paramZefg) {
    return ZY(paramZefg, Zec.ZJ);
  }
  
  public static String ZY(Zefg<Zsdr> paramZefg, List<Zko7> paramList) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Zd : ()I
    //   11: iconst_0
    //   12: istore #4
    //   14: istore_2
    //   15: iload #4
    //   17: aload_0
    //   18: invokeinterface size : ()I
    //   23: if_icmpge -> 301
    //   26: aload_0
    //   27: iload #4
    //   29: invokeinterface get : (I)Ljava/lang/Object;
    //   34: checkcast burp/Zsdr
    //   37: invokeinterface toString : ()Ljava/lang/String;
    //   42: sipush #-30136
    //   45: sipush #-26093
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   54: astore #5
    //   56: aload #5
    //   58: iconst_0
    //   59: aaload
    //   60: astore #6
    //   62: aload #5
    //   64: iconst_1
    //   65: aaload
    //   66: astore #7
    //   68: getstatic burp/Zgnw.ZC : Lburp/Zti_;
    //   71: aload #6
    //   73: aload #7
    //   75: aload_1
    //   76: invokevirtual Zm : (Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    //   79: astore #8
    //   81: aload_3
    //   82: aload #8
    //   84: invokeinterface size : ()I
    //   89: iconst_1
    //   90: if_icmple -> 105
    //   93: sipush #-30130
    //   96: sipush #-29927
    //   99: invokestatic a : (II)Ljava/lang/String;
    //   102: goto -> 114
    //   105: sipush #-30116
    //   108: sipush #-9984
    //   111: invokestatic a : (II)Ljava/lang/String;
    //   114: iconst_3
    //   115: anewarray java/lang/Object
    //   118: dup
    //   119: iconst_0
    //   120: iload #4
    //   122: ifne -> 130
    //   125: ldc ''
    //   127: goto -> 139
    //   130: sipush #-30118
    //   133: sipush #16220
    //   136: invokestatic a : (II)Ljava/lang/String;
    //   139: aastore
    //   140: dup
    //   141: iconst_1
    //   142: aload #6
    //   144: aastore
    //   145: dup
    //   146: iconst_2
    //   147: aload #7
    //   149: aastore
    //   150: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: aload_3
    //   158: sipush #-30121
    //   161: sipush #-12857
    //   164: invokestatic a : (II)Ljava/lang/String;
    //   167: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: pop
    //   171: aload #8
    //   173: invokeinterface iterator : ()Ljava/util/Iterator;
    //   178: astore #9
    //   180: aload #9
    //   182: invokeinterface hasNext : ()Z
    //   187: ifeq -> 280
    //   190: aload #9
    //   192: invokeinterface next : ()Ljava/lang/Object;
    //   197: checkcast burp/Zsje
    //   200: astore #10
    //   202: aload #10
    //   204: invokevirtual ZE : ()Lburp/Zmd3;
    //   207: astore #11
    //   209: aload_3
    //   210: sipush #-30144
    //   213: sipush #12428
    //   216: invokestatic a : (II)Ljava/lang/String;
    //   219: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: pop
    //   223: aload #11
    //   225: invokevirtual ZY : ()Ljava/util/Map;
    //   228: sipush #-30120
    //   231: sipush #17098
    //   234: invokestatic a : (II)Ljava/lang/String;
    //   237: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   242: ifeq -> 255
    //   245: aload #11
    //   247: aload_3
    //   248: invokestatic ZL : (Lburp/Zmd3;Ljava/lang/StringBuilder;)V
    //   251: iload_2
    //   252: ifne -> 262
    //   255: aload #11
    //   257: aload_3
    //   258: invokestatic ZA : (Lburp/Zmd3;Ljava/lang/StringBuilder;)I
    //   261: pop
    //   262: aload_3
    //   263: sipush #-30124
    //   266: sipush #-13287
    //   269: invokestatic a : (II)Ljava/lang/String;
    //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: pop
    //   276: iload_2
    //   277: ifne -> 180
    //   280: aload_3
    //   281: sipush #-30113
    //   284: sipush #11524
    //   287: invokestatic a : (II)Ljava/lang/String;
    //   290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: pop
    //   294: iinc #4, 1
    //   297: iload_2
    //   298: ifne -> 15
    //   301: aload_0
    //   302: invokeinterface size : ()I
    //   307: iconst_1
    //   308: if_icmpne -> 330
    //   311: aload_3
    //   312: iconst_0
    //   313: sipush #-30132
    //   316: sipush #-17436
    //   319: invokestatic a : (II)Ljava/lang/String;
    //   322: invokevirtual insert : (ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   325: pop
    //   326: iload_2
    //   327: ifne -> 364
    //   330: aload_3
    //   331: iconst_0
    //   332: sipush #-30133
    //   335: sipush #25650
    //   338: invokestatic a : (II)Ljava/lang/String;
    //   341: iconst_1
    //   342: anewarray java/lang/Object
    //   345: dup
    //   346: iconst_0
    //   347: aload_0
    //   348: invokeinterface size : ()I
    //   353: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   356: aastore
    //   357: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   360: invokevirtual insert : (ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   363: pop
    //   364: aload_3
    //   365: invokevirtual toString : ()Ljava/lang/String;
    //   368: areturn
  }
  
  private static boolean ZP(Zmd3 paramZmd3, StringBuilder paramStringBuilder, boolean paramBoolean) {
    if (paramZmd3.ZY().containsKey(a(-30129, 16618))) {
      List<? extends CharSequence> list = (List)paramZmd3.ZY().get(a(-30114, 10480));
      if (!list.isEmpty()) {
        paramStringBuilder.append(paramBoolean ? a(-30126, -12744) : "");
        paramStringBuilder.append(String.join(a(-30115, -20899), list)).append(a(-30117, -358));
      } 
      return true;
    } 
    return false;
  }
  
  private static int ZA(Zmd3 paramZmd3, StringBuilder paramStringBuilder) {
    int i = Zmd3.Zd();
    boolean bool = ZP(paramZmd3, paramStringBuilder, false);
    if (!paramZmd3.Zl().isEmpty()) {
      list = (List)paramZmd3.Zl().stream().filter(Zec::Zl).collect(Collectors.toList());
      if (list.isEmpty()) {
        paramStringBuilder.append(bool ? a(-30134, -7638) : a(-30128, 25725)).append(a(-30119, 22749));
        list = paramZmd3.Zl();
        if (i == 0) {
          if (!bool)
            paramStringBuilder.append(a(-30127, 32535)); 
          list = (List<String>)list.stream().map(Zgnw::lambda$buildURLDescription$0).collect(Collectors.toList());
          paramStringBuilder.append(String.join("\n", (Iterable)list)).append("\n");
          return 1;
        } 
        list = (List<String>)list.stream().map(Zgnw::lambda$buildURLDescription$0).collect(Collectors.toList());
        paramStringBuilder.append(String.join("\n", (Iterable)list)).append("\n");
        return 1;
      } 
    } else {
      return 0;
    } 
    if (!bool)
      paramStringBuilder.append(a(-30127, 32535)); 
    List<String> list = (List<String>)list.stream().map(Zgnw::lambda$buildURLDescription$0).collect(Collectors.toList());
    paramStringBuilder.append(String.join("\n", (Iterable)list)).append("\n");
    return 1;
  }
  
  private static void ZL(Zmd3 paramZmd3, StringBuilder paramStringBuilder) {
    List<? extends CharSequence> list = (List)((List)paramZmd3.ZY().get(a(-30123, 15066))).stream().map(Zgnw::lambda$buildCVEDescription$1).collect(Collectors.toList());
    paramStringBuilder.append(String.join(a(-30135, 24211), list));
    ZP(paramZmd3, paramStringBuilder, true);
  }
  
  private static String lambda$buildCVEDescription$1(String paramString) {
    a(-30122, 20858);
    return a(-30122, 20858) + a(-30122, 20858) + paramString + a(-30131, 30327) + paramString;
  }
  
  private static String lambda$buildURLDescription$0(String paramString) {
    a(-30142, 30197);
    return a(-30142, 30197) + a(-30142, 30197) + paramString + a(-30141, 26364) + paramString;
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ô¦ú;n`7äMrÊ×°~cåi7bSWÉ)öñÚ ÝáÕ5p¨®êd¼ÿûGúÅ\1úì­ômëlò3XHèÏþåJh-¤OLLë^äê?bf.O¼üßÒÿ¡Xy¦9SmBB¥ªLÚCfµ´&õ»±@ø¢FæNLxüõtð²c?Ú\\n pkZîáô¾CG<,ÐsQÈ¼½4Ñ\\bC°ß\\nB¨#8ì;9Tb­ÑFr2ñÍ ?Þë5wV¹q\\tHp19¹)¬P*{§<¿?ú¬X/4³nÊbrm#³Ð¦u@Ñ¸¯,½ÕºÝñÀÍ§Èl\\nqù#ÖCHúÞÏó U¬ÀAv-xÎ*DW\»ÅMî¸`d{¢²~K¯³öA5}K¬Xp0¨&¨¹¦dõr+Öcª7.\\r¥÷Ùúïl¶ÜÙþÃ*ÌRÔ\¢¢ð^¯º~¾5ÔR¢xy.Å:úº\\b¼É«Ã¶äs𦴉XOy.9or»joîÓº°jË{óq§à^E½@ãù×Ì\\f¾´N|ü_)~ñ¤1£èÞD¦¿D£yßÜ\\røEô6u@/x,kÃgÁ ¶,Ü!¨a2±µ~L>ýù9áEmã+Øm?R54«ú7»sÚ·¦J\¸t þÑùwØt\a*\\r{þåôxNpSþ<äTzÇ\Yãës\\tzÆ®èq'xõ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #64
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
    //   68: ldc '<ÍN9Ï'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #51
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
    //   128: putstatic burp/Zgnw.a : [Ljava/lang/String;
    //   131: bipush #28
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zgnw.b : [Ljava/lang/String;
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
    //   212: bipush #107
    //   214: goto -> 244
    //   217: bipush #92
    //   219: goto -> 244
    //   222: bipush #106
    //   224: goto -> 244
    //   227: bipush #7
    //   229: goto -> 244
    //   232: bipush #99
    //   234: goto -> 244
    //   237: bipush #12
    //   239: goto -> 244
    //   242: bipush #68
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
    //   300: new burp/Zti_
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zgnw.ZC : Lburp/Zti_;
    //   310: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8A5B) & 0xFFFF;
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
      byte b1 = 36;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgnw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */