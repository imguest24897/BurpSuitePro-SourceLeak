package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class Zbrt extends Zbg2 {
  private Zmps ZD;
  
  private Zk70 Zr;
  
  private Zm2o Zw;
  
  private Zm99 Za;
  
  private Zedd ZI;
  
  private Zedd Zk;
  
  private Zedd Zu;
  
  private Zedd ZF;
  
  private Zedd ZE;
  
  private Zm99 Zo;
  
  private Zm99 ZG;
  
  private Zm99 ZC;
  
  private Zm99 ZU;
  
  private Zm9v Zv;
  
  private Zm9v Zz;
  
  private Zl8w Zy;
  
  private Zgff Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbrt(Zmps paramZmps, Zk70 paramZk70) {
    this.ZD = paramZmps;
    this.Zr = paramZk70;
    int[] arrayOfInt = Zte.Zj();
    Z_();
    this.Zv.setVisible(false);
    this.Zz.setVisible(false);
    this.ZB = new String[] { a(21980, 14383), a(21955, -28413) };
    this.ZA = new boolean[] { true, true };
    this.Zh = 1;
    byte b = 0;
    while (b < 10) {
      this.Zk.addItem("0" + b);
      b++;
      if (arrayOfInt == null) {
        Zbqc.Zr(new Zbqc[3]);
        break;
      } 
    } 
    b = 10;
    while (b < 24) {
      this.Zk.addItem(Integer.toString(b));
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    b = 0;
    while (b < 10) {
      this.Zu.addItem("0" + b);
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    b = 10;
    while (b < 60) {
      this.Zu.addItem(Integer.toString(b));
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    b = 1;
    while (b < 32) {
      this.ZI.addItem(Integer.toString(b));
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    this.ZF.addItem(a(21954, 12983));
    this.ZF.addItem(a(21956, 6360));
    this.ZF.addItem(a(21957, -26835));
    this.ZF.addItem(a(21953, -12754));
    this.ZF.addItem(a(21959, 26763));
    this.ZF.addItem(a(21970, -978));
    this.ZF.addItem(a(21952, -2450));
    this.ZF.addItem(a(21979, -25211));
    this.ZF.addItem(a(21983, -21239));
    this.ZF.addItem(a(21976, -31224));
    this.ZF.addItem(a(21972, -25285));
    this.ZF.addItem(a(21978, -13101));
    this.ZE.addItem("");
    this.ZE.addItem(a(21974, -31362));
    this.ZE.addItem(a(21968, 23006));
    this.ZE.addItem(a(21975, 906));
    long l1 = paramZk70.ZG();
    long l2 = System.currentTimeMillis();
    if (l1 < l2)
      l1 = Zte.Zm(); 
    Calendar calendar = Calendar.getInstance(Locale.US);
    calendar.setTime(new Date(l1));
    this.Zk.setSelectedIndex(calendar.get(11));
    this.Zu.setSelectedIndex(calendar.get(12));
    this.ZI.setSelectedIndex(calendar.get(5) - 1);
    this.ZF.setSelectedIndex(calendar.get(2));
    if (paramZk70.ZA > 0L) {
      this.Zc.setText(Integer.toString(paramZk70.ZQ()));
      this.ZE.setSelectedIndex(paramZk70.Zl() + 1);
    } 
  }
  
  public Zsic Zn(int paramInt) {
    // Byte code:
    //   0: invokestatic Zj : ()[I
    //   3: astore_2
    //   4: iload_1
    //   5: lookupswitch default -> 399, 0 -> 32, 1 -> 61
    //   32: aload_0
    //   33: getfield Zv : Lburp/Zm9v;
    //   36: iconst_0
    //   37: invokevirtual setVisible : (Z)V
    //   40: aload_0
    //   41: getfield Zz : Lburp/Zm9v;
    //   44: iconst_0
    //   45: invokevirtual setVisible : (Z)V
    //   48: aload_0
    //   49: getfield ZD : Lburp/Zmps;
    //   52: aload_0
    //   53: invokevirtual ZW : (Lburp/Zsic;)Lburp/Zsic;
    //   56: areturn
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: iconst_1
    //   62: istore_3
    //   63: invokestatic getInstance : ()Ljava/util/Calendar;
    //   66: astore #4
    //   68: aload #4
    //   70: iconst_1
    //   71: invokevirtual get : (I)I
    //   74: istore #5
    //   76: aload #4
    //   78: iconst_2
    //   79: invokevirtual get : (I)I
    //   82: istore #6
    //   84: aload_0
    //   85: getfield ZF : Lburp/Zedd;
    //   88: invokevirtual getSelectedIndex : ()I
    //   91: istore #7
    //   93: aload_0
    //   94: getfield ZI : Lburp/Zedd;
    //   97: invokevirtual getSelectedIndex : ()I
    //   100: iconst_1
    //   101: iadd
    //   102: istore #8
    //   104: iload #7
    //   106: iload #6
    //   108: if_icmplt -> 143
    //   111: iload #7
    //   113: iload #6
    //   115: if_icmpne -> 153
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: iload #8
    //   127: aload #4
    //   129: iconst_5
    //   130: invokevirtual get : (I)I
    //   133: if_icmpge -> 153
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: iinc #5, 1
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   152: athrow
    //   153: aload #4
    //   155: iload #5
    //   157: iload #7
    //   159: iload #8
    //   161: aload_0
    //   162: getfield Zk : Lburp/Zedd;
    //   165: invokevirtual getSelectedIndex : ()I
    //   168: aload_0
    //   169: getfield Zu : Lburp/Zedd;
    //   172: invokevirtual getSelectedIndex : ()I
    //   175: iconst_0
    //   176: invokevirtual set : (IIIIII)V
    //   179: aload #4
    //   181: bipush #14
    //   183: iconst_0
    //   184: invokevirtual set : (II)V
    //   187: aload_0
    //   188: getfield Zr : Lburp/Zk70;
    //   191: aload #4
    //   193: invokevirtual getTimeInMillis : ()J
    //   196: invokevirtual Zq : (J)V
    //   199: aload_0
    //   200: getfield Zv : Lburp/Zm9v;
    //   203: iconst_0
    //   204: invokevirtual setVisible : (Z)V
    //   207: goto -> 230
    //   210: astore #4
    //   212: aload #4
    //   214: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   217: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   220: aload_0
    //   221: getfield Zv : Lburp/Zm9v;
    //   224: iconst_1
    //   225: invokevirtual setVisible : (Z)V
    //   228: iconst_0
    //   229: istore_3
    //   230: aload_0
    //   231: getfield ZE : Lburp/Zedd;
    //   234: invokevirtual getSelectedIndex : ()I
    //   237: iconst_1
    //   238: isub
    //   239: i2b
    //   240: istore #4
    //   242: iload #4
    //   244: ifge -> 282
    //   247: aload_0
    //   248: getfield Zr : Lburp/Zk70;
    //   251: iconst_0
    //   252: invokevirtual ZB : (I)V
    //   255: aload_0
    //   256: getfield Zr : Lburp/Zk70;
    //   259: iconst_0
    //   260: invokevirtual Zv : (I)V
    //   263: aload_0
    //   264: getfield Zr : Lburp/Zk70;
    //   267: lconst_0
    //   268: putfield ZA : J
    //   271: aload_2
    //   272: ifnonnull -> 337
    //   275: goto -> 282
    //   278: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   281: athrow
    //   282: aload_0
    //   283: getfield Zr : Lburp/Zk70;
    //   286: aload_0
    //   287: getfield Zc : Lburp/Zgff;
    //   290: invokevirtual getText : ()Ljava/lang/String;
    //   293: invokestatic parseInt : (Ljava/lang/String;)I
    //   296: invokevirtual Zv : (I)V
    //   299: aload_0
    //   300: getfield Zr : Lburp/Zk70;
    //   303: iload #4
    //   305: invokevirtual ZB : (I)V
    //   308: aload_0
    //   309: getfield Zr : Lburp/Zk70;
    //   312: aload_0
    //   313: getfield Zr : Lburp/Zk70;
    //   316: invokevirtual ZQ : ()I
    //   319: i2l
    //   320: getstatic burp/Zk70.Zg : [J
    //   323: iload #4
    //   325: laload
    //   326: lmul
    //   327: putfield ZA : J
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   336: athrow
    //   337: aload_0
    //   338: getfield Zz : Lburp/Zm9v;
    //   341: iconst_0
    //   342: invokevirtual setVisible : (Z)V
    //   345: goto -> 368
    //   348: astore #4
    //   350: aload #4
    //   352: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   355: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   358: aload_0
    //   359: getfield Zz : Lburp/Zm9v;
    //   362: iconst_1
    //   363: invokevirtual setVisible : (Z)V
    //   366: iconst_0
    //   367: istore_3
    //   368: iload_3
    //   369: ifeq -> 397
    //   372: aload_0
    //   373: getfield Zr : Lburp/Zk70;
    //   376: iconst_0
    //   377: invokevirtual ZE : (B)V
    //   380: aload_0
    //   381: getfield ZD : Lburp/Zmps;
    //   384: aload_0
    //   385: getfield Zr : Lburp/Zk70;
    //   388: invokevirtual Zb : (Lburp/Zk70;)V
    //   391: aconst_null
    //   392: areturn
    //   393: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   396: athrow
    //   397: aload_0
    //   398: areturn
    //   399: iconst_0
    //   400: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   403: iload_1
    //   404: i2l
    //   405: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   408: aload_0
    //   409: areturn
    // Exception table:
    //   from	to	target	type
    //   4	57	57	java/lang/Exception
    //   63	207	210	java/lang/Exception
    //   104	118	121	java/lang/Exception
    //   111	136	139	java/lang/Exception
    //   125	146	149	java/lang/Exception
    //   230	345	348	java/lang/Exception
    //   242	275	278	java/lang/Exception
    //   247	330	333	java/lang/Exception
    //   368	393	393	java/lang/Exception
  }
  
  private void Z_() {
    this.Zo = new Zm99();
    this.ZG = new Zm99();
    this.ZF = new Zedd();
    this.ZE = new Zedd();
    this.Zk = new Zedd();
    this.ZI = new Zedd();
    this.Zc = new Zgff();
    this.Zu = new Zedd();
    this.ZC = new Zm99();
    this.ZU = new Zm99();
    this.Zv = new Zm9v();
    this.Zz = new Zm9v();
    this.Zy = new Zl8w();
    this.Zw = new Zm2o();
    this.Za = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zo.setText(a(21977, -7697));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Zo, gridBagConstraints);
    this.ZG.setText(a(21982, -20308));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.ZG, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZF, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZE, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zk, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZI, gridBagConstraints);
    this.Zc.setColumns(5);
    this.Zc.ZH(Zlw9.NUMBER);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zc, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zu, gridBagConstraints);
    this.ZC.setText(a(21973, -8026));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.ZC, gridBagConstraints);
    this.ZU.setText(a(21971, 1086));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZU, gridBagConstraints);
    this.Zv.setText(a(21969, 1651));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.Zv, gridBagConstraints);
    this.Zz.setText(a(21958, 21765));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.Zz, gridBagConstraints);
    this.Zy.setText(a(21981, 7403));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zy, gridBagConstraints);
    this.Zw.Zi(Zk97.DESKTOP_SETTINGS_PROJECT_TASKS_SCHEDULED_TASKS);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zw, gridBagConstraints);
    this.Za.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weighty = 1.0D;
    add(this.Za, gridBagConstraints);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ýÛ0(6]aè.\\bëpç:ÄÊûOÆÙÓÖüå·W\\f#~ýä\\b1¢_yt)­Kô\\tqÔ¨\8Ä[²\\næ)é°õaÄLã+ßÛôûÊ«bºÁ²Êï©ø#[ 3°×]q)P;K4õØEgì¡,óZkéÝPØ4É D¦ñ°À9´^æ.Nqöy'íQÏÄÅ~Û«ìcáÐìp>N È£·2Bg«LdËrÊÙÁ¬2CÎõèÔdîæîXl©Ê~(å-\\t¨âPïîù^]b"Ô:P  ¯´+pä× ;_8Fo,`Æ»öjãðFÀ¦ EqªRí\\b,á'¡Ü¹ ÉûÔ\\bgsYÊåØOÁ\\rØ>pÌ­òüXçØS°º'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #16
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
    //   68: ldc '¡5Ndïaq÷þ).'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #85
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
    //   129: putstatic burp/Zbrt.a : [Ljava/lang/String;
    //   132: bipush #24
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbrt.b : [Ljava/lang/String;
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
    //   212: bipush #17
    //   214: goto -> 244
    //   217: bipush #9
    //   219: goto -> 244
    //   222: bipush #60
    //   224: goto -> 244
    //   227: bipush #61
    //   229: goto -> 244
    //   232: bipush #106
    //   234: goto -> 244
    //   237: bipush #38
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
    int i = (paramInt1 ^ 0x55D5) & 0xFFFF;
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
      char c = 'ð';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbrt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */