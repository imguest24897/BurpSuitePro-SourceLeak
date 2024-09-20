package burp;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SplashScreen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.border.Border;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public final class Zgje extends Zgjb implements ActionListener {
  private static Zgje ZZ;
  
  private final Zxei Zf;
  
  private final SplashScreen ZN;
  
  private Graphics2D ZV;
  
  private long Zu;
  
  private Timer ZU;
  
  private boolean Zw;
  
  private static final Color ZH;
  
  private static final Color Zd;
  
  private static final Composite[] ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zgje(Zxei paramZxei) {
    this.Zf = paramZxei;
    this.ZN = SplashScreen.getSplashScreen();
    String[] arrayOfString = Zbv5.ZvS();
    if (this.ZN == null)
      return; 
    this.ZV = this.ZN.createGraphics();
    if (this.ZV == null)
      return; 
    this.ZV.setPaintMode();
    this.ZV.setPaint(Zd);
    byte b = 0;
    while (b < 8) {
      this.ZV.setComposite(AlphaComposite.getInstance(3, 1.0F / (b * b * b + 2)));
      this.ZV.fillRect(214 - b, 338 - b, 404 + b * 2, 16 + b * 2);
      b++;
      if (arrayOfString == null)
        break; 
    } 
    this.Zu = paramZxei.Zi().ZP().ZX();
    this.ZU = new Timer(2, this);
    this.ZU.start();
  }
  
  public static void Zn(Zxei paramZxei) {
    try {
      if (ZZ == null)
        ZZ = new Zgje(paramZxei); 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public static void ZI() {
    String[] arrayOfString = Zbv5.ZvS();
    try {
      try {
        if (ZZ != null) {
          try {
            ZZ.ZN.close();
            if (arrayOfString == null)
              SplashScreen.getSplashScreen().close(); 
          } catch (Exception exception) {
            throw a(null);
          } 
          return;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      SplashScreen.getSplashScreen().close();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZvS : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZN : Ljava/awt/SplashScreen;
    //   8: ifnull -> 28
    //   11: aload_0
    //   12: getfield ZN : Ljava/awt/SplashScreen;
    //   15: invokevirtual isVisible : ()Z
    //   18: ifne -> 57
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: aload_0
    //   29: getfield ZU : Ljavax/swing/Timer;
    //   32: ifnull -> 56
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: aload_0
    //   43: getfield ZU : Ljavax/swing/Timer;
    //   46: invokevirtual stop : ()V
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: return
    //   57: aload_0
    //   58: getfield ZV : Ljava/awt/Graphics2D;
    //   61: getstatic burp/Zgje.ZH : Ljava/awt/Color;
    //   64: invokevirtual setPaint : (Ljava/awt/Paint;)V
    //   67: aload_0
    //   68: getfield ZV : Ljava/awt/Graphics2D;
    //   71: sipush #215
    //   74: sipush #339
    //   77: sipush #402
    //   80: bipush #14
    //   82: invokevirtual fillRect : (IIII)V
    //   85: iconst_1
    //   86: istore_3
    //   87: iconst_1
    //   88: istore #4
    //   90: aload_0
    //   91: getfield Zf : Lburp/Zxei;
    //   94: invokeinterface Zi : ()Lburp/Zz0n;
    //   99: invokeinterface ZP : ()Lburp/Zrgd;
    //   104: invokevirtual ZX : ()J
    //   107: aload_0
    //   108: getfield Zu : J
    //   111: lsub
    //   112: ldc2_w 9
    //   115: ldiv
    //   116: l2i
    //   117: istore #5
    //   119: iload #5
    //   121: sipush #400
    //   124: if_icmple -> 130
    //   127: iconst_0
    //   128: istore #4
    //   130: iload #5
    //   132: sipush #796
    //   135: irem
    //   136: istore #6
    //   138: iload #6
    //   140: sipush #398
    //   143: if_icmple -> 156
    //   146: sipush #796
    //   149: iload #6
    //   151: isub
    //   152: istore #6
    //   154: iconst_0
    //   155: istore_3
    //   156: wide iinc #6 216
    //   162: aload_0
    //   163: getfield ZV : Ljava/awt/Graphics2D;
    //   166: getstatic burp/Zgje.Zd : Ljava/awt/Color;
    //   169: invokevirtual setPaint : (Ljava/awt/Paint;)V
    //   172: iconst_0
    //   173: istore #7
    //   175: iload #7
    //   177: bipush #100
    //   179: if_icmpge -> 383
    //   182: iload_3
    //   183: ifeq -> 203
    //   186: iload #6
    //   188: bipush #100
    //   190: iload #7
    //   192: isub
    //   193: iconst_2
    //   194: imul
    //   195: isub
    //   196: goto -> 213
    //   199: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   202: athrow
    //   203: iload #6
    //   205: bipush #100
    //   207: iload #7
    //   209: isub
    //   210: iconst_2
    //   211: imul
    //   212: iadd
    //   213: istore #8
    //   215: iconst_2
    //   216: istore #9
    //   218: iload #8
    //   220: sipush #216
    //   223: if_icmpge -> 253
    //   226: iload #4
    //   228: ifeq -> 245
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   237: athrow
    //   238: goto -> 376
    //   241: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   244: athrow
    //   245: sipush #432
    //   248: iload #8
    //   250: isub
    //   251: istore #8
    //   253: iload #4
    //   255: ifne -> 274
    //   258: iload #7
    //   260: iconst_1
    //   261: iadd
    //   262: bipush #100
    //   264: if_icmpge -> 307
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   273: athrow
    //   274: iload #8
    //   276: sipush #216
    //   279: isub
    //   280: iconst_2
    //   281: if_icmpge -> 307
    //   284: goto -> 291
    //   287: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   290: athrow
    //   291: iload #9
    //   293: iload #8
    //   295: sipush #216
    //   298: isub
    //   299: iadd
    //   300: istore #9
    //   302: sipush #216
    //   305: istore #8
    //   307: iload #8
    //   309: iconst_2
    //   310: iadd
    //   311: sipush #616
    //   314: if_icmple -> 347
    //   317: sipush #1232
    //   320: iload #8
    //   322: isub
    //   323: iconst_4
    //   324: isub
    //   325: istore #8
    //   327: sipush #616
    //   330: iload #8
    //   332: iconst_2
    //   333: iadd
    //   334: isub
    //   335: iconst_2
    //   336: if_icmpge -> 347
    //   339: sipush #616
    //   342: iload #8
    //   344: isub
    //   345: istore #9
    //   347: aload_0
    //   348: getfield ZV : Ljava/awt/Graphics2D;
    //   351: getstatic burp/Zgje.ZX : [Ljava/awt/Composite;
    //   354: iload #7
    //   356: aaload
    //   357: invokevirtual setComposite : (Ljava/awt/Composite;)V
    //   360: aload_0
    //   361: getfield ZV : Ljava/awt/Graphics2D;
    //   364: iload #8
    //   366: sipush #340
    //   369: iload #9
    //   371: bipush #12
    //   373: invokevirtual fillRect : (IIII)V
    //   376: iinc #7, 1
    //   379: aload_2
    //   380: ifnonnull -> 175
    //   383: aload_0
    //   384: getfield ZN : Ljava/awt/SplashScreen;
    //   387: invokevirtual update : ()V
    //   390: aload_0
    //   391: getfield Zf : Lburp/Zxei;
    //   394: invokeinterface Zi : ()Lburp/Zz0n;
    //   399: invokeinterface ZP : ()Lburp/Zrgd;
    //   404: invokevirtual ZX : ()J
    //   407: lstore #7
    //   409: lload #7
    //   411: aload_0
    //   412: getfield Zu : J
    //   415: lsub
    //   416: lstore #9
    //   418: aload_0
    //   419: getfield Zw : Z
    //   422: ifne -> 500
    //   425: lload #9
    //   427: ldc2_w 100
    //   430: lcmp
    //   431: ifle -> 500
    //   434: goto -> 441
    //   437: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   440: athrow
    //   441: iload #5
    //   443: bipush #20
    //   445: irem
    //   446: ifne -> 500
    //   449: goto -> 456
    //   452: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   455: athrow
    //   456: aload_0
    //   457: getfield Zf : Lburp/Zxei;
    //   460: invokeinterface Ze : ()Lburp/Zkvo;
    //   465: astore #11
    //   467: aload #11
    //   469: ifnull -> 500
    //   472: aload_0
    //   473: getfield ZV : Ljava/awt/Graphics2D;
    //   476: aload #11
    //   478: invokestatic Zy : (Ljava/awt/Graphics;Lburp/Zkvo;)V
    //   481: aload_0
    //   482: getfield ZN : Ljava/awt/SplashScreen;
    //   485: invokevirtual update : ()V
    //   488: aload_0
    //   489: iconst_1
    //   490: putfield Zw : Z
    //   493: goto -> 500
    //   496: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   499: athrow
    //   500: goto -> 518
    //   503: astore_3
    //   504: aload_3
    //   505: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   508: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   511: aload_0
    //   512: getfield ZU : Ljavax/swing/Timer;
    //   515: invokevirtual stop : ()V
    //   518: return
    // Exception table:
    //   from	to	target	type
    //   4	21	24	java/lang/Exception
    //   11	35	38	java/lang/Exception
    //   28	49	52	java/lang/Exception
    //   57	500	503	java/lang/Exception
    //   182	199	199	java/lang/Exception
    //   218	231	234	java/lang/Exception
    //   226	241	241	java/lang/Exception
    //   253	267	270	java/lang/Exception
    //   258	284	287	java/lang/Exception
    //   418	434	437	java/lang/Exception
    //   425	449	452	java/lang/Exception
    //   467	493	496	java/lang/Exception
  }
  
  static void Zy(Graphics paramGraphics, Zkvo paramZkvo) {
    String str = a(1973, 29893);
    str = str + str + a(1974, -7680);
    if (paramZkvo != null) {
      String str1 = paramZkvo.ZE();
      if (str1.length() > 0)
        str1 = "" + Character.toUpperCase(str1.charAt(0)) + Character.toUpperCase(str1.charAt(0)); 
      a(1975, 3061);
      str = str + str + a(1975, 3061) + str1 + a(1972, -30408);
    } 
    Zl86 zl86 = new Zl86();
    zl86.setColumns(25);
    zl86.setRows(8);
    zl86.setLineWrap(true);
    zl86.setWrapStyleWord(true);
    zl86.setOpaque(false);
    zl86.setBorder((Border)null);
    zl86.setFont(zl86.getFont().deriveFont(12.0F));
    zl86.setText(str);
    zl86.setSize(zl86.getPreferredSize());
    zl86.setForeground(Color.WHITE);
    zl86.setBackground(new Color(0, 0, 0, 0));
    paramGraphics.translate(500, 200);
    zl86.paint(paramGraphics);
    paramGraphics.translate(-500, -200);
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Ý,"¬ÛZíx5u îªoH®¦ð`q4XÓ,ÿÁ\\ry})¹_áóXøüð¡TmÅØ&b4ëÎ¼x2DÞézÏêí2úR¹cJ@â2sS«Ù'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #18
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #56
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
    //   67: ldc '»íñR4Çh]+'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #7
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #114
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
    //   128: putstatic burp/Zgje.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zgje.b : [Ljava/lang/String;
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
    //   212: bipush #12
    //   214: goto -> 243
    //   217: bipush #108
    //   219: goto -> 243
    //   222: iconst_5
    //   223: goto -> 243
    //   226: bipush #61
    //   228: goto -> 243
    //   231: bipush #33
    //   233: goto -> 243
    //   236: bipush #54
    //   238: goto -> 243
    //   241: bipush #55
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
    //   300: getstatic java/awt/Color.WHITE : Ljava/awt/Color;
    //   303: putstatic burp/Zgje.ZH : Ljava/awt/Color;
    //   306: new java/awt/Color
    //   309: dup
    //   310: bipush #116
    //   312: bipush #118
    //   314: bipush #120
    //   316: invokespecial <init> : (III)V
    //   319: putstatic burp/Zgje.Zd : Ljava/awt/Color;
    //   322: bipush #100
    //   324: anewarray java/awt/Composite
    //   327: putstatic burp/Zgje.ZX : [Ljava/awt/Composite;
    //   330: iconst_0
    //   331: istore #7
    //   333: iload #7
    //   335: bipush #100
    //   337: if_icmpge -> 364
    //   340: getstatic burp/Zgje.ZX : [Ljava/awt/Composite;
    //   343: iload #7
    //   345: iconst_3
    //   346: ldc 0.01
    //   348: iload #7
    //   350: iconst_1
    //   351: iadd
    //   352: i2f
    //   353: fmul
    //   354: invokestatic getInstance : (IF)Ljava/awt/AlphaComposite;
    //   357: aastore
    //   358: iinc #7, 1
    //   361: goto -> 333
    //   364: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7B4) & 0xFFFF;
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
      byte b1 = 108;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgje.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */