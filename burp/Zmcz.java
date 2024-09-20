package burp;

import java.util.EnumSet;
import java.util.Iterator;

public class Zmcz {
  private static final String[] a;
  
  private static final String[] b;
  
  public static void Zz(EnumSet<Zklf> paramEnumSet1, EnumSet<Zklf> paramEnumSet2, String paramString, int paramInt, byte[] paramArrayOfbyte, StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: invokestatic ZO : ()[I
    //   3: astore #6
    //   5: iload_3
    //   6: ldc 393216
    //   8: iand
    //   9: ldc 393216
    //   11: if_icmpeq -> 18
    //   14: iconst_1
    //   15: goto -> 19
    //   18: iconst_0
    //   19: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   22: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   25: aload_0
    //   26: ldc burp/Zklf
    //   28: invokestatic allOf : (Ljava/lang/Class;)Ljava/util/EnumSet;
    //   31: invokevirtual containsAll : (Ljava/util/Collection;)Z
    //   34: ifeq -> 69
    //   37: sipush #30970
    //   40: sipush #-10835
    //   43: invokestatic a : (II)Ljava/lang/String;
    //   46: aload_2
    //   47: invokevirtual equals : (Ljava/lang/Object;)Z
    //   50: ifne -> 68
    //   53: aload #5
    //   55: sipush #30973
    //   58: sipush #10621
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: return
    //   69: aload_0
    //   70: invokevirtual isEmpty : ()Z
    //   73: ifne -> 154
    //   76: aload #5
    //   78: sipush #30969
    //   81: sipush #-23224
    //   84: invokestatic a : (II)Ljava/lang/String;
    //   87: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: pop
    //   91: aload #4
    //   93: invokestatic ZG : ([B)Ljava/lang/String;
    //   96: sipush #30962
    //   99: sipush #-9086
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   108: ifeq -> 133
    //   111: aload_1
    //   112: aload #5
    //   114: invokestatic Zu : (Ljava/util/EnumSet;Ljava/lang/StringBuilder;)V
    //   117: aload #5
    //   119: sipush #30952
    //   122: sipush #-29738
    //   125: invokestatic a : (II)Ljava/lang/String;
    //   128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: pop
    //   132: return
    //   133: aload_0
    //   134: aload #5
    //   136: invokestatic Zu : (Ljava/util/EnumSet;Ljava/lang/StringBuilder;)V
    //   139: aload #5
    //   141: sipush #30972
    //   144: sipush #18055
    //   147: invokestatic a : (II)Ljava/lang/String;
    //   150: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: aload_1
    //   155: invokevirtual isEmpty : ()Z
    //   158: ifne -> 426
    //   161: aload_0
    //   162: aload_1
    //   163: invokevirtual equals : (Ljava/lang/Object;)Z
    //   166: ifne -> 426
    //   169: aload_0
    //   170: invokevirtual isEmpty : ()Z
    //   173: ifeq -> 196
    //   176: aload #5
    //   178: sipush #30965
    //   181: sipush #14270
    //   184: invokestatic a : (II)Ljava/lang/String;
    //   187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: pop
    //   191: aload #6
    //   193: ifnonnull -> 211
    //   196: aload #5
    //   198: sipush #30971
    //   201: sipush #-1146
    //   204: invokestatic a : (II)Ljava/lang/String;
    //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: pop
    //   211: aload #5
    //   213: sipush #30960
    //   216: sipush #26208
    //   219: invokestatic a : (II)Ljava/lang/String;
    //   222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: aload_1
    //   227: ldc burp/Zklf
    //   229: invokestatic allOf : (Ljava/lang/Class;)Ljava/util/EnumSet;
    //   232: invokevirtual containsAll : (Ljava/util/Collection;)Z
    //   235: ifeq -> 313
    //   238: iconst_0
    //   239: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   242: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   245: iload_3
    //   246: ldc 393216
    //   248: iand
    //   249: ifeq -> 293
    //   252: aload #5
    //   254: sipush #30953
    //   257: sipush #15335
    //   260: invokestatic a : (II)Ljava/lang/String;
    //   263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: iload_3
    //   268: aload #5
    //   270: invokestatic ZN : (ILjava/lang/StringBuilder;)V
    //   273: aload #5
    //   275: sipush #30955
    //   278: sipush #-26936
    //   281: invokestatic a : (II)Ljava/lang/String;
    //   284: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   287: pop
    //   288: aload #6
    //   290: ifnonnull -> 426
    //   293: aload #5
    //   295: sipush #30968
    //   298: sipush #-28044
    //   301: invokestatic a : (II)Ljava/lang/String;
    //   304: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: pop
    //   308: aload #6
    //   310: ifnonnull -> 426
    //   313: iload_3
    //   314: ldc 393216
    //   316: iand
    //   317: ifeq -> 386
    //   320: aload #5
    //   322: sipush #30958
    //   325: sipush #-32638
    //   328: invokestatic a : (II)Ljava/lang/String;
    //   331: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: pop
    //   335: iload_3
    //   336: aload #5
    //   338: invokestatic ZN : (ILjava/lang/StringBuilder;)V
    //   341: aload #5
    //   343: sipush #30966
    //   346: sipush #-28674
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   355: pop
    //   356: aload_1
    //   357: aload_0
    //   358: invokestatic ZN : (Ljava/util/EnumSet;Ljava/util/EnumSet;)Ljava/util/EnumSet;
    //   361: aload #5
    //   363: invokestatic Zu : (Ljava/util/EnumSet;Ljava/lang/StringBuilder;)V
    //   366: aload #5
    //   368: sipush #30972
    //   371: sipush #18055
    //   374: invokestatic a : (II)Ljava/lang/String;
    //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: pop
    //   381: aload #6
    //   383: ifnonnull -> 426
    //   386: aload #5
    //   388: sipush #30967
    //   391: sipush #-29324
    //   394: invokestatic a : (II)Ljava/lang/String;
    //   397: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   400: pop
    //   401: aload_1
    //   402: aload_0
    //   403: invokestatic ZN : (Ljava/util/EnumSet;Ljava/util/EnumSet;)Ljava/util/EnumSet;
    //   406: aload #5
    //   408: invokestatic Zu : (Ljava/util/EnumSet;Ljava/lang/StringBuilder;)V
    //   411: aload #5
    //   413: sipush #30972
    //   416: sipush #18055
    //   419: invokestatic a : (II)Ljava/lang/String;
    //   422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: pop
    //   426: return
  }
  
  public static String Zu(EnumSet<Zklf> paramEnumSet) {
    if (paramEnumSet.isEmpty())
      return a(30959, -23148); 
    if (paramEnumSet.containsAll(EnumSet.allOf(Zklf.class)))
      return a(30963, -25033); 
    StringBuilder stringBuilder = new StringBuilder(a(30974, -11951));
    Zu(paramEnumSet, stringBuilder);
    stringBuilder.append(a(30972, 18055));
    return stringBuilder.toString();
  }
  
  private static void ZN(int paramInt, StringBuilder paramStringBuilder) {
    int[] arrayOfInt = Zk8m.ZO();
    if ((paramInt & 0x20000) == 131072) {
      paramStringBuilder.append(a(30975, 20011));
      if (arrayOfInt == null) {
        if ((paramInt & 0x40000) == 262144)
          paramStringBuilder.append(a(30964, 29457)); 
        return;
      } 
      return;
    } 
    if ((paramInt & 0x40000) == 262144)
      paramStringBuilder.append(a(30964, 29457)); 
  }
  
  private static void Zu(EnumSet<Zklf> paramEnumSet, StringBuilder paramStringBuilder) {
    int[] arrayOfInt = Zk8m.ZO();
    for (Zklf zklf : paramEnumSet) {
      paramStringBuilder.append(a(30961, -22251)).append(zklf.Zf()).append(a(30954, 12067));
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private static EnumSet<Zklf> ZN(EnumSet<Zklf> paramEnumSet1, EnumSet<Zklf> paramEnumSet2) {
    EnumSet<Zklf> enumSet = EnumSet.noneOf(Zklf.class);
    Iterator<Zklf> iterator = paramEnumSet1.iterator();
    int[] arrayOfInt = Zk8m.ZO();
    while (iterator.hasNext()) {
      Zklf zklf = iterator.next();
      if (!paramEnumSet2.contains(zklf))
        enumSet.add(zklf); 
      if (arrayOfInt == null)
        break; 
    } 
    return enumSet;
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ehª§a´%¡m¹;Ç¼è¯-ÃQCÙ(2oÇ=4ê4BwQÏïWü#PúWÈNÔE IÈZëLà¹¤1Ëeø»{>x½4åEë`¢¨ØÀ_¤*ÈØñvs><øg~ªP²°ivð} @1&ZÃ\\bëøªel*yVþqÌ?k±Rm&¤ª\\r¯¼"*hyñ)¯èT·ôÊ~)ZÎ¡lÖ\\tO~~rpuf|ù[L°1iR¾ÿrw*&ïMø|¾^0éd¸ZøëÛÛo;ºººq)mE®¤ñ5h·¡ÛGm©ÜäÊÂuµµ<©}AUø×'çøÜv[Ël¸Ñ0»Anã à·Ëõî¤#°Þ\\f0zÍ9#uñ/d¢Dj/]0¢ðKÀî¼ºÖy\\rméWc÷Ëò¼Â\\nõö5Ô²´e)k²yÛu`Vº íïÔ5ÙÛa/\\nfb?²ô_ÔÌYÖx\\bÍøFÜ $Ä¡>õ¹0JÇ¢d3¥)\´&Ã 7ÏSà@ÙÈ.\\t\\n_y³.Õ0ÅÇ¯ª=A=ÒúcÌç³XõDËòâè¾§ÍH4)«.{ÃA­¶\\n7Ó­Úfy+\\nü¯¥Bzâ\\rñËéôD*è°;®ÏÂÞ7Å0Ôfùòùî\\bLL87³U;y"r\\brÅËúÌ*ã§¶e¬N/ÓQÆ¤¦Ò·5ÆéF&0ÕÈÕîph ³°ÄõÎÞJ¢ÅôþÐn7E³0$[Ì·ón!iÁ½ëd5Â&\Ô\\ry`K@Ñª©ÂAãÎ÷eÖýxÿ#'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #118
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
    //   68: ldc '?[]¾,v'àÇ+fÊê\\nÎ§AÎ÷ZëSÓ¢tÉÅH8Èh*ê¸¾¬iÈsp½±sÀµ¨yÜ­b$D~D|rÜÛV7Kh ÈtÅ Ïßý|ó;5ÐWWÎBØ6l³TxT ,üeÇòæ~°Ìj·mBl¹*RJàÅAtòü½êoà;NÄEL"Ö_`5[Ôûqq»5\\t^Ú³-WK½_Âýþ´Ü'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #55
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #67
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
    //   129: putstatic burp/Zmcz.a : [Ljava/lang/String;
    //   132: bipush #22
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmcz.b : [Ljava/lang/String;
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
    //   212: bipush #114
    //   214: goto -> 244
    //   217: bipush #38
    //   219: goto -> 244
    //   222: bipush #118
    //   224: goto -> 244
    //   227: bipush #107
    //   229: goto -> 244
    //   232: bipush #26
    //   234: goto -> 244
    //   237: bipush #35
    //   239: goto -> 244
    //   242: bipush #126
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
    int i = (paramInt1 ^ 0x78FA) & 0xFFFF;
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
      byte b1 = 45;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmcz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */