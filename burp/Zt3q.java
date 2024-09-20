package burp;

import java.awt.Window;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zt3q {
  private final Zrq8 Zy;
  
  private List<String> ZH;
  
  private List<String> ZM;
  
  private List<String> ZU;
  
  private List<String> Zp;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zt3q(Zrq8 paramZrq8) {
    this.Zy = paramZrq8;
  }
  
  void ZZ(List<Zrve> paramList, Window paramWindow) {
    // Byte code:
    //   0: invokestatic Za : ()[I
    //   3: astore_3
    //   4: aload_1
    //   5: ifnonnull -> 13
    //   8: return
    //   9: invokestatic a : (Lburp/Zz6j;)Lburp/Zz6j;
    //   12: athrow
    //   13: aload_1
    //   14: invokeinterface size : ()I
    //   19: iconst_1
    //   20: if_icmple -> 31
    //   23: iconst_1
    //   24: goto -> 32
    //   27: invokestatic a : (Lburp/Zz6j;)Lburp/Zz6j;
    //   30: athrow
    //   31: iconst_0
    //   32: istore #4
    //   34: iload #4
    //   36: ifeq -> 55
    //   39: sipush #-32685
    //   42: sipush #-27087
    //   45: invokestatic a : (II)Ljava/lang/String;
    //   48: goto -> 64
    //   51: invokestatic a : (Lburp/Zz6j;)Lburp/Zz6j;
    //   54: athrow
    //   55: sipush #-32688
    //   58: sipush #-1517
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: astore #5
    //   66: aload_1
    //   67: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   72: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   77: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   82: ifeq -> 99
    //   85: new burp/Zm92
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: goto -> 100
    //   95: invokestatic a : (Lburp/Zz6j;)Lburp/Zz6j;
    //   98: athrow
    //   99: aconst_null
    //   100: astore #6
    //   102: getstatic burp/Zg1m.CONFIG : Lburp/Zg1m;
    //   105: aload_2
    //   106: iconst_1
    //   107: aload #5
    //   109: aload #6
    //   111: invokestatic Zd : (Lburp/Zg1m;Ljava/awt/Component;ILjava/lang/String;Lburp/Zskm;)Ljava/io/File;
    //   114: astore #7
    //   116: aload #7
    //   118: ifnonnull -> 126
    //   121: return
    //   122: invokestatic a : (Lburp/Zz6j;)Lburp/Zz6j;
    //   125: athrow
    //   126: aload_0
    //   127: new java/util/ArrayList
    //   130: dup
    //   131: invokespecial <init> : ()V
    //   134: putfield ZH : Ljava/util/List;
    //   137: aload_0
    //   138: new java/util/ArrayList
    //   141: dup
    //   142: invokespecial <init> : ()V
    //   145: putfield ZM : Ljava/util/List;
    //   148: aload_0
    //   149: new java/util/ArrayList
    //   152: dup
    //   153: invokespecial <init> : ()V
    //   156: putfield ZU : Ljava/util/List;
    //   159: aload_0
    //   160: new java/util/ArrayList
    //   163: dup
    //   164: invokespecial <init> : ()V
    //   167: putfield Zp : Ljava/util/List;
    //   170: aload_1
    //   171: invokeinterface iterator : ()Ljava/util/Iterator;
    //   176: astore #8
    //   178: aload #8
    //   180: invokeinterface hasNext : ()Z
    //   185: ifeq -> 305
    //   188: aload #8
    //   190: invokeinterface next : ()Ljava/lang/Object;
    //   195: checkcast burp/Zrve
    //   198: astore #9
    //   200: aload #9
    //   202: aload #7
    //   204: invokeinterface Zx : (Ljava/io/File;)V
    //   209: aload_0
    //   210: getfield ZH : Ljava/util/List;
    //   213: aload #9
    //   215: invokeinterface Zd : ()Ljava/lang/String;
    //   220: invokeinterface add : (Ljava/lang/Object;)Z
    //   225: pop
    //   226: goto -> 301
    //   229: astore #10
    //   231: aload #10
    //   233: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   236: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   239: aload_0
    //   240: getfield ZM : Ljava/util/List;
    //   243: aload #9
    //   245: invokeinterface Zd : ()Ljava/lang/String;
    //   250: invokeinterface add : (Ljava/lang/Object;)Z
    //   255: pop
    //   256: goto -> 301
    //   259: astore #10
    //   261: aload #10
    //   263: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   266: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   269: aload_0
    //   270: getfield ZU : Ljava/util/List;
    //   273: aload #9
    //   275: invokeinterface Zd : ()Ljava/lang/String;
    //   280: invokeinterface add : (Ljava/lang/Object;)Z
    //   285: pop
    //   286: aload_0
    //   287: getfield Zp : Ljava/util/List;
    //   290: aload #10
    //   292: invokevirtual getMessage : ()Ljava/lang/String;
    //   295: invokeinterface add : (Ljava/lang/Object;)Z
    //   300: pop
    //   301: aload_3
    //   302: ifnull -> 178
    //   305: aload_0
    //   306: getfield ZM : Ljava/util/List;
    //   309: invokeinterface isEmpty : ()Z
    //   314: ifeq -> 336
    //   317: aload_0
    //   318: getfield ZU : Ljava/util/List;
    //   321: invokeinterface isEmpty : ()Z
    //   326: ifne -> 405
    //   329: goto -> 336
    //   332: invokestatic a : (Lburp/Zz6j;)Lburp/Zz6j;
    //   335: athrow
    //   336: iload #4
    //   338: ifeq -> 384
    //   341: goto -> 348
    //   344: invokestatic a : (Lburp/Zz6j;)Lburp/Zz6j;
    //   347: athrow
    //   348: aload_0
    //   349: getfield Zy : Lburp/Zrq8;
    //   352: aload_2
    //   353: aload #5
    //   355: sipush #-32673
    //   358: sipush #-14725
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: aload_0
    //   365: invokevirtual Zv : ()Ljava/lang/String;
    //   368: invokeinterface ZT : (Ljava/awt/Window;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   373: aload_3
    //   374: ifnull -> 453
    //   377: goto -> 384
    //   380: invokestatic a : (Lburp/Zz6j;)Lburp/Zz6j;
    //   383: athrow
    //   384: aload_2
    //   385: aload #5
    //   387: aload_0
    //   388: invokevirtual ZM : ()Ljava/lang/String;
    //   391: invokestatic Zv : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   394: aload_3
    //   395: ifnull -> 453
    //   398: goto -> 405
    //   401: invokestatic a : (Lburp/Zz6j;)Lburp/Zz6j;
    //   404: athrow
    //   405: aload_2
    //   406: aload #5
    //   408: sipush #-32686
    //   411: sipush #6616
    //   414: invokestatic a : (II)Ljava/lang/String;
    //   417: iconst_1
    //   418: anewarray java/lang/Object
    //   421: dup
    //   422: iconst_0
    //   423: iload #4
    //   425: ifeq -> 444
    //   428: goto -> 435
    //   431: invokestatic a : (Lburp/Zz6j;)Lburp/Zz6j;
    //   434: athrow
    //   435: ldc 's'
    //   437: goto -> 446
    //   440: invokestatic a : (Lburp/Zz6j;)Lburp/Zz6j;
    //   443: athrow
    //   444: ldc ''
    //   446: aastore
    //   447: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   450: invokestatic Zf : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   453: return
    // Exception table:
    //   from	to	target	type
    //   4	9	9	burp/Zz6j
    //   13	27	27	burp/Zz6j
    //   34	51	51	burp/Zz6j
    //   66	95	95	burp/Zz6j
    //   116	122	122	burp/Zz6j
    //   200	226	229	burp/Zz6j
    //   200	226	259	java/io/IOException
    //   305	329	332	burp/Zz6j
    //   317	341	344	burp/Zz6j
    //   336	377	380	burp/Zz6j
    //   348	398	401	burp/Zz6j
    //   384	428	431	burp/Zz6j
    //   405	440	440	burp/Zz6j
  }
  
  private String Zv() {
    int[] arrayOfInt = Zmln.Za();
    StringBuilder stringBuilder = new StringBuilder();
    if (!this.ZM.isEmpty()) {
      stringBuilder.append(a(-32677, 26761));
      for (String str : this.ZM) {
        stringBuilder.append(a(-32678, -1623)).append(str).append("\n");
        if (arrayOfInt != null)
          break; 
      } 
    } 
    if (!this.ZU.isEmpty()) {
      if (stringBuilder.length() > 0)
        stringBuilder.append(a(-32676, 25375)); 
      stringBuilder.append(a(-32679, -22101));
      byte b = 0;
      while (b < this.ZU.size()) {
        stringBuilder.append(a(-32675, -22948)).append(this.ZU.get(b)).append(a(-32684, 26259)).append(this.Zp.get(b)).append("\n");
        b++;
        if (arrayOfInt != null)
          break; 
      } 
    } 
    if (!this.ZH.isEmpty()) {
      if (stringBuilder.length() > 0)
        stringBuilder.append(a(-32674, -6145)); 
      stringBuilder.append(a(-32683, -6454));
      for (String str : this.ZH) {
        stringBuilder.append(a(-32675, -22948)).append(str).append("\n");
        if (arrayOfInt != null)
          break; 
      } 
    } 
    return stringBuilder.toString();
  }
  
  private String ZM() {
    if (!this.ZM.isEmpty())
      return a(-32680, -27328); 
    if (!this.ZU.isEmpty())
      return a(-32687, -1387) + a(-32687, -1387); 
    Zuh.Zb(false, Zqf.Zr);
    return "";
  }
  
  private static Zz6j a(Zz6j paramZz6j) {
    return paramZz6j;
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' ãÖ¥ÿÆq7Ys\\b[>ßÉSôí°ª'í%¦wæ\\bP¾}I~5£2!ÂJ®¦fß# o\\t.v%¢Zco8A­Gw16g6:zý"&ëõ2Ó£'}¬\\ré!ô!JyÍÄÃÉ\\rHXrÕ¥ þÆß9þl ¹ÍÚ î$þyÞW`Îxò6})Ø°8#8(KÈî7Ê×á\\ræ\\rýÁ\\nÆ©ñt)¤u¢EnT,Á«§<3¦p@\\b:íñ}üSaDÊUÐ°­ô¸tAßÜ¡¬I\\r#Oþ/&¬LÕÎux!Ó¥+o`Ü´l¼ÔÊxµ§ç!8¯\\b4KL×*¤°²dB£M¶pOï.øÓ,,*´\\nû¤"\\f÷¾)@«FÈøso%ÎG,³yHB|TÐG¡\\r­´Ð0®¦\\tKYÁæ¿òào¤¾¥§0ðùPÙCê¥ÚLb1»\\f0&[KWBïÏÓîKeÂ×TûJ¤Q.1S);í\\bziECÈ]¯'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #69
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #13
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
    //   68: ldc '¶©E4e2jÅcãÉ¹,G¿{]ã®6B<¡ý±uEÚM'âG[iÅ^Õ®íµ\\ba\\bif}Í'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #58
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #90
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
    //   129: putstatic burp/Zt3q.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zt3q.b : [Ljava/lang/String;
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
    //   212: bipush #31
    //   214: goto -> 244
    //   217: bipush #98
    //   219: goto -> 244
    //   222: bipush #54
    //   224: goto -> 244
    //   227: bipush #124
    //   229: goto -> 244
    //   232: bipush #8
    //   234: goto -> 244
    //   237: bipush #35
    //   239: goto -> 244
    //   242: bipush #27
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
    int i = (paramInt1 ^ 0xFFFF8059) & 0xFFFF;
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
      byte b1 = 71;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt3q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */