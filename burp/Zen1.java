package burp;

import java.awt.Window;
import java.util.List;
import net.portswigger.Zl0;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zen1 {
  private final Zr49 ZH;
  
  private final Zl0 Zt;
  
  private List<String> Zi;
  
  private List<String> Zf;
  
  private List<String> Zo;
  
  private List<String> ZM;
  
  private List<Zkbn> ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zen1(Zr49 paramZr49, Zl0 paramZl0) {
    this.ZH = paramZr49;
    this.Zt = paramZl0;
  }
  
  List<Zkbn> ZK(Window paramWindow, Zmln... paramVarArgs) {
    // Byte code:
    //   0: invokestatic ZH : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: getstatic burp/Zg1m.CONFIG : Lburp/Zg1m;
    //   7: aload_1
    //   8: sipush #-28995
    //   11: sipush #-17206
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: new burp/Zm08
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: invokestatic ZL : (Lburp/Zg1m;Ljava/awt/Component;Ljava/lang/String;Ljavax/swing/filechooser/FileFilter;)[Ljava/io/File;
    //   27: astore #4
    //   29: aload #4
    //   31: ifnonnull -> 42
    //   34: invokestatic emptyList : ()Ljava/util/List;
    //   37: areturn
    //   38: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   41: athrow
    //   42: aload #4
    //   44: arraylength
    //   45: iconst_1
    //   46: if_icmple -> 57
    //   49: iconst_1
    //   50: goto -> 58
    //   53: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   56: athrow
    //   57: iconst_0
    //   58: istore #5
    //   60: aload_0
    //   61: new java/util/ArrayList
    //   64: dup
    //   65: invokespecial <init> : ()V
    //   68: putfield Zi : Ljava/util/List;
    //   71: aload_0
    //   72: new java/util/ArrayList
    //   75: dup
    //   76: invokespecial <init> : ()V
    //   79: putfield Zf : Ljava/util/List;
    //   82: aload_0
    //   83: new java/util/ArrayList
    //   86: dup
    //   87: invokespecial <init> : ()V
    //   90: putfield Zo : Ljava/util/List;
    //   93: aload_0
    //   94: new java/util/ArrayList
    //   97: dup
    //   98: invokespecial <init> : ()V
    //   101: putfield ZM : Ljava/util/List;
    //   104: aload_0
    //   105: new java/util/ArrayList
    //   108: dup
    //   109: invokespecial <init> : ()V
    //   112: putfield ZD : Ljava/util/List;
    //   115: aload #4
    //   117: astore #6
    //   119: aload #6
    //   121: arraylength
    //   122: istore #7
    //   124: iconst_0
    //   125: istore #8
    //   127: iload #8
    //   129: iload #7
    //   131: if_icmpge -> 349
    //   134: aload #6
    //   136: iload #8
    //   138: aaload
    //   139: astore #9
    //   141: aload #9
    //   143: invokevirtual getName : ()Ljava/lang/String;
    //   146: astore #10
    //   148: aload #9
    //   150: aload_0
    //   151: getfield Zt : Lnet/portswigger/Zl0;
    //   154: getstatic net/portswigger/Zae.Z_ : Ljava/nio/charset/Charset;
    //   157: invokestatic Zr : (Ljava/io/File;Lnet/portswigger/Zl0;Ljava/nio/charset/Charset;)Ljava/lang/String;
    //   160: astore #11
    //   162: new burp/Zz0e
    //   165: dup
    //   166: aload #11
    //   168: invokespecial <init> : (Ljava/lang/String;)V
    //   171: invokevirtual ZO : ()Lburp/Zzkm;
    //   174: astore #12
    //   176: aload #12
    //   178: invokestatic Zo : (Lburp/Zmf_;)Ljava/util/Set;
    //   181: astore #13
    //   183: aload_2
    //   184: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   187: aload #13
    //   189: dup
    //   190: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   193: pop
    //   194: <illegal opcode> test : (Ljava/util/Set;)Ljava/util/function/Predicate;
    //   199: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   204: ifeq -> 258
    //   207: aload_0
    //   208: getfield ZD : Ljava/util/List;
    //   211: new burp/Zb8b
    //   214: dup
    //   215: aload_0
    //   216: aload #10
    //   218: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   221: iconst_0
    //   222: aload #12
    //   224: aload #13
    //   226: iconst_0
    //   227: anewarray burp/Zmln
    //   230: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   235: checkcast [Lburp/Zmln;
    //   238: invokespecial <init> : (Ljava/lang/String;ZLburp/Zmf_;[Lburp/Zmln;)V
    //   241: invokeinterface add : (Ljava/lang/Object;)Z
    //   246: pop
    //   247: aload_3
    //   248: ifnull -> 277
    //   251: goto -> 258
    //   254: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   257: athrow
    //   258: aload_0
    //   259: getfield Zi : Ljava/util/List;
    //   262: aload #10
    //   264: invokeinterface add : (Ljava/lang/Object;)Z
    //   269: pop
    //   270: goto -> 277
    //   273: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   276: athrow
    //   277: goto -> 342
    //   280: astore #11
    //   282: aload #11
    //   284: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   287: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   290: aload_0
    //   291: getfield Zf : Ljava/util/List;
    //   294: aload #10
    //   296: invokeinterface add : (Ljava/lang/Object;)Z
    //   301: pop
    //   302: goto -> 342
    //   305: astore #11
    //   307: aload #11
    //   309: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   312: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   315: aload_0
    //   316: getfield Zo : Ljava/util/List;
    //   319: aload #10
    //   321: invokeinterface add : (Ljava/lang/Object;)Z
    //   326: pop
    //   327: aload_0
    //   328: getfield ZM : Ljava/util/List;
    //   331: aload #11
    //   333: invokevirtual getMessage : ()Ljava/lang/String;
    //   336: invokeinterface add : (Ljava/lang/Object;)Z
    //   341: pop
    //   342: iinc #8, 1
    //   345: aload_3
    //   346: ifnull -> 127
    //   349: aload_0
    //   350: getfield Zi : Ljava/util/List;
    //   353: invokeinterface isEmpty : ()Z
    //   358: ifeq -> 399
    //   361: aload_0
    //   362: getfield Zo : Ljava/util/List;
    //   365: invokeinterface isEmpty : ()Z
    //   370: ifeq -> 399
    //   373: goto -> 380
    //   376: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   379: athrow
    //   380: aload_0
    //   381: getfield Zf : Ljava/util/List;
    //   384: invokeinterface isEmpty : ()Z
    //   389: ifne -> 476
    //   392: goto -> 399
    //   395: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   398: athrow
    //   399: iload #5
    //   401: ifeq -> 452
    //   404: goto -> 411
    //   407: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   410: athrow
    //   411: aload_0
    //   412: getfield ZH : Lburp/Zr49;
    //   415: aload_1
    //   416: sipush #-29008
    //   419: sipush #-26601
    //   422: invokestatic a : (II)Ljava/lang/String;
    //   425: sipush #-29004
    //   428: sipush #-23605
    //   431: invokestatic a : (II)Ljava/lang/String;
    //   434: aload_0
    //   435: invokevirtual ZO : ()Ljava/lang/String;
    //   438: invokevirtual Z_ : (Ljava/awt/Window;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   441: aload_3
    //   442: ifnull -> 476
    //   445: goto -> 452
    //   448: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   451: athrow
    //   452: aload_1
    //   453: sipush #-29008
    //   456: sipush #-26601
    //   459: invokestatic a : (II)Ljava/lang/String;
    //   462: aload_0
    //   463: invokevirtual Zq : ()Ljava/lang/String;
    //   466: invokestatic Zv : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   469: goto -> 476
    //   472: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   475: athrow
    //   476: aload_0
    //   477: getfield ZD : Ljava/util/List;
    //   480: areturn
    // Exception table:
    //   from	to	target	type
    //   29	38	38	burp/Ze0d
    //   42	53	53	burp/Ze0d
    //   148	277	280	burp/Ze0d
    //   148	277	305	java/io/IOException
    //   183	251	254	burp/Ze0d
    //   207	270	273	burp/Ze0d
    //   349	373	376	burp/Ze0d
    //   361	392	395	burp/Ze0d
    //   380	404	407	burp/Ze0d
    //   399	445	448	burp/Ze0d
    //   411	469	472	burp/Ze0d
  }
  
  private String ZO() {
    String[] arrayOfString = Zb8b.ZH();
    StringBuilder stringBuilder = new StringBuilder();
    if (!this.Zi.isEmpty()) {
      stringBuilder.append(a(-29001, 8024));
      for (String str : this.Zi) {
        stringBuilder.append(a(-29005, 19270)).append(str).append("\n");
        if (arrayOfString != null)
          break; 
      } 
    } 
    if (!this.Zf.isEmpty()) {
      if (stringBuilder.length() > 0)
        stringBuilder.append(a(-29007, 19204)); 
      stringBuilder.append(a(-28998, -28198));
      for (String str : this.Zf) {
        stringBuilder.append(a(-28994, 4335)).append(str).append("\n");
        if (arrayOfString != null)
          break; 
      } 
    } 
    if (!this.Zo.isEmpty()) {
      if (stringBuilder.length() > 0)
        stringBuilder.append(a(-28999, 27835)); 
      stringBuilder.append(a(-29006, 24440));
      byte b = 0;
      while (b < this.Zo.size()) {
        stringBuilder.append(a(-28994, 4335)).append(this.Zo.get(b)).append(a(-28996, -19168)).append(this.ZM.get(b)).append("\n");
        b++;
        if (arrayOfString != null)
          break; 
      } 
    } 
    if (!this.ZD.isEmpty()) {
      if (stringBuilder.length() > 0)
        stringBuilder.append(a(-28999, 27835)); 
      stringBuilder.append(a(-28993, 7288));
      for (Zkbn zkbn : this.ZD) {
        stringBuilder.append(a(-28994, 4335)).append(zkbn.Zd()).append("\n");
        if (arrayOfString != null)
          break; 
      } 
    } 
    return stringBuilder.toString();
  }
  
  private String Zq() {
    if (!this.Zi.isEmpty())
      return a(-29000, -25508); 
    if (!this.Zf.isEmpty())
      return a(-29003, -9559); 
    if (!this.ZM.isEmpty())
      return a(-29002, 5354) + a(-29002, 5354); 
    Zuh.Zb(false, Zqf.Zr);
    return "";
  }
  
  private String ZZ(String paramString) {
    int i = paramString.lastIndexOf('.');
    return (i != -1) ? paramString.substring(0, i) : paramString;
  }
  
  private static Ze0d a(Ze0d paramZe0d) {
    return paramZe0d;
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '³BÀËÙ»á½Çm\\f\Ò{4*d± Zì*Ë7NxA1×ªÛ¸ 4îPvíIºüáçg9¼c'ÀTY;+Kb¥¢YU^Ì¬1n0ÜJgþð3f!ºK² E$ÙB ÎÙpE?_KsH¸mÝ*FHïÔ\\fX$K0Ò[:æñ:¯\»±?ÝýÕÃÐ­"ÇØ_ægÙï~!6û]R=ÌÚÔ¨ÖØmL/?âÈôâËx¸¬ûPeÖÅÞC\\t«M¤.©U=ÓjEú&ôÝÀºT\\rCý9¸VUdYGu"J»Xæ\W\\fÎ@ÐsÏ=QÂ§4Ö-² Sx/í2gAÏ<òèÑÓÔ\\bIÇÏÑrñ©ÍysÒð#¾G(Ãaí«Òp§ÆÙK=0£;¨{.ã¥|+ *äL^þ.0þo²¾þ²R:hìe©p\\rú.\\t(a:3ÐQÔÄèUÊÏvÎÚT7¨M},ªùÝö4ùßsÖ£czÁ÷R¬UZ>K}7|GêémçÌMOËæú»%'àT°uZúsU¢DmÎÝo¼Â?£ñ­ä}`ïý¢É;Üôk&Ní¬ôùØ|ªBjÿÃºHÉW8¦]6xÏ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #47
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #43
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
    //   68: ldc 'a³M0Ú8EJ\\b"Ü"í\°vr\\t\\r0Ü@l×Õñ\¡Ú8ë £æëÉäÚHÚiÒ,uã ½³ì¯ì$»Mu¤SCGiÔgAï=Ï®Ð§àÂÓjB`¯É'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_2
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #29
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
    //   128: putstatic burp/Zen1.a : [Ljava/lang/String;
    //   131: bipush #15
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zen1.b : [Ljava/lang/String;
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
    //   212: bipush #90
    //   214: goto -> 244
    //   217: bipush #111
    //   219: goto -> 244
    //   222: bipush #8
    //   224: goto -> 244
    //   227: bipush #101
    //   229: goto -> 244
    //   232: bipush #46
    //   234: goto -> 244
    //   237: bipush #71
    //   239: goto -> 244
    //   242: bipush #63
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8EB4) & 0xFFFF;
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
      char c = 'È';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zen1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */