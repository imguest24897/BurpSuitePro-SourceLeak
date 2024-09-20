package burp;

import java.awt.Window;

class Zqm implements Zzva {
  private static Zeck ZI;
  
  private static Zz18 ZJ;
  
  private final Window Zs;
  
  private final Zskh ZB;
  
  private final Zelf ZQ;
  
  private final Zs1q ZN;
  
  private final Zlr9 Zc;
  
  private final Zz9e Zd;
  
  private final Zxzh ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zqm(Window paramWindow, Zskh paramZskh, Zs1q paramZs1q, Zlr9 paramZlr9, Zz9e paramZz9e, Zxzh paramZxzh, Zelf paramZelf) {
    this.Zs = paramWindow;
    this.ZB = paramZskh;
    this.ZD = paramZxzh;
    this.ZQ = paramZelf;
    this.ZN = paramZs1q;
    this.Zc = paramZlr9;
    this.Zd = paramZz9e;
  }
  
  public Zsgw ZA(Ze44 paramZe44, int paramInt, Zsxd paramZsxd, Zlgm paramZlgm) {
    // Byte code:
    //   0: aload_3
    //   1: invokeinterface ZG : ()Lburp/Zg3d;
    //   6: invokeinterface ZR : ()Lburp/Zefx;
    //   11: astore #6
    //   13: invokestatic ZI : ()Z
    //   16: iconst_1
    //   17: istore #7
    //   19: istore #5
    //   21: getstatic burp/Zqm.ZJ : Lburp/Zz18;
    //   24: ifnull -> 131
    //   27: getstatic burp/Zqm.ZJ : Lburp/Zz18;
    //   30: dup
    //   31: astore #8
    //   33: monitorenter
    //   34: getstatic burp/Zqm.ZJ : Lburp/Zz18;
    //   37: ifnull -> 117
    //   40: aload #6
    //   42: invokeinterface ZT : ()Lburp/Zmzk;
    //   47: getstatic burp/Zqm.ZJ : Lburp/Zz18;
    //   50: invokeinterface Zj : ()Lburp/Zlit;
    //   55: invokeinterface Zdz : ()Lburp/Zmzk;
    //   60: invokestatic ZI : (Lburp/Zgpi;Lburp/Zgpi;)Z
    //   63: istore #9
    //   65: getstatic burp/Zqm.ZJ : Lburp/Zz18;
    //   68: invokeinterface ZC : ()V
    //   73: goto -> 86
    //   76: astore #10
    //   78: aload #10
    //   80: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   83: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   86: iload #9
    //   88: ifeq -> 99
    //   91: iconst_0
    //   92: istore #7
    //   94: iload #5
    //   96: ifne -> 112
    //   99: aload_0
    //   100: aload_1
    //   101: iload_2
    //   102: aload_3
    //   103: aload #4
    //   105: invokevirtual ZA : (Lburp/Ze44;ILburp/Zsxd;Lburp/Zlgm;)Lburp/Zsgw;
    //   108: aload #8
    //   110: monitorexit
    //   111: areturn
    //   112: iload #5
    //   114: ifne -> 34
    //   117: aload #8
    //   119: monitorexit
    //   120: goto -> 131
    //   123: astore #11
    //   125: aload #8
    //   127: monitorexit
    //   128: aload #11
    //   130: athrow
    //   131: iload #7
    //   133: ifeq -> 520
    //   136: getstatic burp/Zmgc.IN_BROWSER_SESSION_PROMPT : Lburp/Zmgc;
    //   139: aload_0
    //   140: getfield ZB : Lburp/Zskh;
    //   143: invokeinterface Zz : ()Lburp/Zskh;
    //   148: iconst_1
    //   149: anewarray java/lang/Object
    //   152: dup
    //   153: iconst_0
    //   154: aload #6
    //   156: invokeinterface ZF : ()Lburp/Zlit;
    //   161: invokeinterface Zdz : ()Lburp/Zmzk;
    //   166: aastore
    //   167: invokevirtual ZK : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   170: pop
    //   171: aload_1
    //   172: ifnull -> 210
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   181: athrow
    //   182: aload_1
    //   183: getstatic burp/Zgsg.INFO : Lburp/Zgsg;
    //   186: iload_2
    //   187: sipush #23479
    //   190: sipush #-30816
    //   193: invokestatic a : (II)Ljava/lang/String;
    //   196: aconst_null
    //   197: invokeinterface ZP : (Lburp/Zgsg;ILjava/lang/String;Ljava/lang/String;)Lburp/Zm3k;
    //   202: pop
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   209: athrow
    //   210: getstatic burp/Zqm.ZI : Lburp/Zeck;
    //   213: aload_0
    //   214: getfield Zs : Ljava/awt/Window;
    //   217: aload_0
    //   218: getfield ZD : Lburp/Zxzh;
    //   221: aload #6
    //   223: invokeinterface ZF : ()Lburp/Zlit;
    //   228: invokevirtual ZV : (Ljava/awt/Window;Lburp/Zxzh;Lburp/Zlit;)Lburp/Zr7h;
    //   231: putstatic burp/Zqm.ZJ : Lburp/Zz18;
    //   234: getstatic burp/Zqm.ZJ : Lburp/Zz18;
    //   237: iconst_1
    //   238: invokeinterface setVisible : (Z)V
    //   243: getstatic burp/Zqm.ZJ : Lburp/Zz18;
    //   246: dup
    //   247: astore #8
    //   249: monitorenter
    //   250: getstatic burp/Zqm.ZJ : Lburp/Zz18;
    //   253: invokeinterface ZC : ()V
    //   258: goto -> 271
    //   261: astore #9
    //   263: aload #9
    //   265: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   268: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   271: getstatic burp/Zqm.ZJ : Lburp/Zz18;
    //   274: invokeinterface ZU : ()Ljava/util/List;
    //   279: astore #9
    //   281: aload_0
    //   282: getfield ZD : Lburp/Zxzh;
    //   285: aload #9
    //   287: aconst_null
    //   288: iconst_0
    //   289: invokevirtual ZG : (Ljava/util/List;Lburp/Zmzk;Z)V
    //   292: aload_1
    //   293: ifnull -> 490
    //   296: aload #9
    //   298: invokeinterface size : ()I
    //   303: lookupswitch default -> 364, 0 -> 332, 1 -> 348
    //   328: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   331: athrow
    //   332: sipush #23478
    //   335: sipush #24597
    //   338: invokestatic a : (II)Ljava/lang/String;
    //   341: astore #10
    //   343: iload #5
    //   345: ifne -> 387
    //   348: sipush #23477
    //   351: sipush #-19936
    //   354: invokestatic a : (II)Ljava/lang/String;
    //   357: astore #10
    //   359: iload #5
    //   361: ifne -> 387
    //   364: aload #9
    //   366: invokeinterface size : ()I
    //   371: sipush #23476
    //   374: sipush #-26002
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: <illegal opcode> makeConcatWithConstants : (ILjava/lang/String;)Ljava/lang/String;
    //   385: astore #10
    //   387: new java/lang/StringBuilder
    //   390: dup
    //   391: invokespecial <init> : ()V
    //   394: astore #11
    //   396: aload #9
    //   398: invokeinterface iterator : ()Ljava/util/Iterator;
    //   403: astore #12
    //   405: aload #12
    //   407: invokeinterface hasNext : ()Z
    //   412: ifeq -> 454
    //   415: aload #12
    //   417: invokeinterface next : ()Ljava/lang/Object;
    //   422: checkcast burp/Ztbr
    //   425: astore #13
    //   427: aload #11
    //   429: aload #13
    //   431: invokeinterface toString : ()Ljava/lang/String;
    //   436: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   439: pop
    //   440: aload #11
    //   442: getstatic burp/Zlb0.Zp : Ljava/lang/String;
    //   445: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   448: pop
    //   449: iload #5
    //   451: ifne -> 405
    //   454: aload_1
    //   455: getstatic burp/Zgsg.INFO : Lburp/Zgsg;
    //   458: iload_2
    //   459: iconst_1
    //   460: iadd
    //   461: aload #10
    //   463: aload #11
    //   465: invokevirtual length : ()I
    //   468: ifne -> 479
    //   471: aconst_null
    //   472: goto -> 484
    //   475: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   478: athrow
    //   479: aload #11
    //   481: invokevirtual toString : ()Ljava/lang/String;
    //   484: invokeinterface ZP : (Lburp/Zgsg;ILjava/lang/String;Ljava/lang/String;)Lburp/Zm3k;
    //   489: pop
    //   490: getstatic burp/Zqm.ZJ : Lburp/Zz18;
    //   493: astore #10
    //   495: aconst_null
    //   496: putstatic burp/Zqm.ZJ : Lburp/Zz18;
    //   499: aload #10
    //   501: invokeinterface Zn : ()V
    //   506: aload #8
    //   508: monitorexit
    //   509: goto -> 520
    //   512: astore #14
    //   514: aload #8
    //   516: monitorexit
    //   517: aload #14
    //   519: athrow
    //   520: aload_0
    //   521: getfield ZN : Lburp/Zs1q;
    //   524: invokevirtual Zg : ()Lburp/Zs1b;
    //   527: astore #8
    //   529: aload_0
    //   530: getfield ZQ : Lburp/Zelf;
    //   533: aload #8
    //   535: aload_0
    //   536: getfield ZB : Lburp/Zskh;
    //   539: aload_0
    //   540: getfield Zc : Lburp/Zlr9;
    //   543: aload_0
    //   544: getfield Zd : Lburp/Zz9e;
    //   547: aload_0
    //   548: getfield ZD : Lburp/Zxzh;
    //   551: invokevirtual ZX : (Lburp/Zb81;Lburp/Zskh;Lburp/Zlr9;Lburp/Zz9e;Lburp/Zxzh;)Lburp/Zzva;
    //   554: astore #9
    //   556: aload #9
    //   558: aload_1
    //   559: iload_2
    //   560: iconst_1
    //   561: iadd
    //   562: aload_3
    //   563: aload #4
    //   565: invokeinterface ZA : (Lburp/Ze44;ILburp/Zsxd;Lburp/Zlgm;)Lburp/Zsgw;
    //   570: areturn
    // Exception table:
    //   from	to	target	type
    //   34	111	123	finally
    //   65	73	76	java/lang/InterruptedException
    //   112	120	123	finally
    //   123	128	123	finally
    //   131	175	178	java/lang/InterruptedException
    //   136	203	206	java/lang/InterruptedException
    //   250	258	261	java/lang/InterruptedException
    //   250	509	512	finally
    //   281	328	328	java/lang/InterruptedException
    //   454	475	475	java/lang/InterruptedException
    //   512	517	512	finally
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ùþ<ÄK@I>ÖM¡d1N1¿%\\rïÈöËMgûÄ~21õi'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #21
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #19
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
    //   67: ldc '"Õ¹Ç­¼i5KÞY()\\nZí<K\\r®.)Åã×¼Ó³X{Y»*àöíðÏíîè:jjùöF¼Jbj:\g'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #23
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #92
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Zqm.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zqm.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #116
    //   214: goto -> 243
    //   217: bipush #105
    //   219: goto -> 243
    //   222: iconst_3
    //   223: goto -> 243
    //   226: bipush #107
    //   228: goto -> 243
    //   231: bipush #108
    //   233: goto -> 243
    //   236: bipush #42
    //   238: goto -> 243
    //   241: bipush #111
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
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
    //   300: new burp/Zeck
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zqm.ZI : Lburp/Zeck;
    //   310: return
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5BB4) & 0xFFFF;
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
      byte b1 = 28;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zqm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */