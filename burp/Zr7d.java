package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.regex.PatternSyntaxException;
import javax.swing.BorderFactory;

class Zr7d extends Zrh7 {
  private final Zbe2 ZW;
  
  private final Zku8 Zf;
  
  private final Zs2p Zp;
  
  private final Runnable ZV;
  
  private boolean Zo = true;
  
  private Zm99 Zv;
  
  private Zm99 Zs;
  
  private Zbqc ZB;
  
  private Zzdy ZH;
  
  private Ze01 Zn;
  
  private Ze01 ZU;
  
  private Zedd<Zl25> Zu;
  
  private Zl8w ZJ;
  
  private Zm2o ZR;
  
  private Zm99 ZD;
  
  private Zm99 ZE;
  
  private Zbqc Z_;
  
  private Zm9v ZT;
  
  private Zgff ZA;
  
  private Zgff Zw;
  
  private Zgff ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zr7d(Zbe2 paramZbe2, Zku8 paramZku8, Zs2p paramZs2p, Runnable paramRunnable) {
    super(Zt2m.ZF(paramZbe2), true, Zzv7.CONFIG_PANEL_MATCH_REPLACE_POPUP);
    this.ZW = paramZbe2;
    this.Zf = paramZku8;
    int[] arrayOfInt = Zr7c.Zv();
    try {
      this.Zp = paramZs2p;
      this.ZV = paramRunnable;
      ZG();
      ZT();
      this.ZR.Zi(Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_MATCH_AND_REPLACE);
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    setTitle((paramZku8 == null) ? a(3351, -13701) : a(3343, 8812));
    this.Zw.ZM(a(3353, -26407));
    this.ZN.ZM(a(3345, 11120));
    Zl25[] arrayOfZl25 = Zl25.ZM();
    int i = arrayOfZl25.length;
    byte b = 0;
    while (b < i) {
      Zl25 zl25 = arrayOfZl25[b];
      this.Zu.addItem(zl25);
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    try {
      if (paramZku8 != null)
        ZL(paramZku8); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    addWindowListener(new Zsig(this));
    pack();
    Zq(Zt2m.ZF(paramZbe2));
  }
  
  private void ZT() {
    setName(a(3354, -15051));
    this.Zu.setName(a(3336, -2585));
    this.ZA.setName(a(3339, -21151));
    this.Zw.setName(a(3341, -22392));
    this.ZN.setName(a(3357, -10884));
    this.ZH.setName(a(3359, 3623));
    this.Zn.setName(a(3338, -10281));
  }
  
  private void ZL(Zku8 paramZku8) {
    try {
      this.Zu.setSelectedItem(paramZku8.ZIu());
      this.Zw.setText(paramZku8.ZIG());
      this.ZN.setText(paramZku8.ZIX());
      this.ZA.setText(paramZku8.ZIt());
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.ZH.setSelected(!paramZku8.ZIr());
    this.Zo = paramZku8.ZIp();
  }
  
  private void ZG() {
    this.ZB = new Zbqc();
    this.ZJ = new Zl8w();
    this.ZR = new Zm2o();
    this.ZD = new Zm99();
    this.ZE = new Zm99();
    this.Z_ = new Zbqc();
    this.Zn = new Ze01();
    this.ZU = new Ze01();
    this.Zv = new Zm99();
    this.Zu = new Zedd<>();
    this.Zw = new Zgff();
    this.ZN = new Zgff();
    this.ZT = new Zm9v();
    this.Zs = new Zm99();
    this.ZA = new Zgff();
    this.ZH = new Zzdy();
    setDefaultCloseOperation(2);
    this.ZB.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    this.ZB.setLayout(gridBagLayout);
    this.ZJ.setText(a(3355, -20218));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    this.ZB.add(this.ZJ, gridBagConstraints);
    this.ZR.Zi(Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_MATCH_AND_REPLACE);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZB.add(this.ZR, gridBagConstraints);
    this.ZD.setText(a(3347, -13847));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 2048;
    this.ZB.add(this.ZD, gridBagConstraints);
    this.ZE.setText(a(3346, -7047));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 2048;
    this.ZB.add(this.ZE, gridBagConstraints);
    this.Z_.setLayout(new GridLayout(1, 2, 5, 0));
    this.Zn.setText(a(3344, 18404));
    this.Zn.addActionListener(new Zz_g(this));
    this.Z_.add(this.Zn);
    this.ZU.setText(a(3340, -19769));
    this.ZU.addActionListener(new Ztqr(this));
    this.Z_.add(this.ZU);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 12;
    gridBagConstraints.weighty = 1.0D;
    this.ZB.add(this.Z_, gridBagConstraints);
    this.Zv.setText(a(3358, 12950));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 2048;
    this.ZB.add(this.Zv, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 2048;
    this.ZB.add(this.Zu, gridBagConstraints);
    this.Zw.setColumns(35);
    this.Zw.ZH(Zlw9.SEARCH_TERM);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 2048;
    this.ZB.add(this.Zw, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 2048;
    this.ZB.add(this.ZN, gridBagConstraints);
    this.ZT.setText(a(3349, -1298));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZB.add(this.ZT, gridBagConstraints);
    this.Zs.setText(a(3348, 30695));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    this.ZB.add(this.Zs, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    this.ZB.add(this.ZA, gridBagConstraints);
    this.ZH.setText(a(3352, -32028));
    this.ZH.setToolTipText(a(3342, -1771));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 0;
    gridBagConstraints.anchor = 2048;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    this.ZB.add(this.ZH, gridBagConstraints);
    getContentPane().add(this.ZB, a(3350, -31244));
    pack();
  }
  
  private void ZV(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zv : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZH : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 23
    //   14: bipush #34
    //   16: goto -> 25
    //   19: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   22: athrow
    //   23: bipush #18
    //   25: istore_3
    //   26: aload_0
    //   27: getfield Zw : Lburp/Zgff;
    //   30: invokevirtual getText : ()Ljava/lang/String;
    //   33: iload_3
    //   34: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   37: pop
    //   38: aload_0
    //   39: getfield Zf : Lburp/Zku8;
    //   42: ifnonnull -> 114
    //   45: aload_0
    //   46: getfield Zp : Lburp/Zs2p;
    //   49: aload_0
    //   50: invokevirtual Zz : ()Lburp/Zl25;
    //   53: getfield projectPersistedId : B
    //   56: aload_0
    //   57: getfield Zo : Z
    //   60: aload_0
    //   61: getfield Zw : Lburp/Zgff;
    //   64: invokevirtual getText : ()Ljava/lang/String;
    //   67: aload_0
    //   68: getfield ZN : Lburp/Zgff;
    //   71: invokevirtual getText : ()Ljava/lang/String;
    //   74: aload_0
    //   75: getfield ZH : Lburp/Zzdy;
    //   78: invokevirtual isSelected : ()Z
    //   81: ifne -> 99
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   90: athrow
    //   91: iconst_1
    //   92: goto -> 100
    //   95: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   98: athrow
    //   99: iconst_0
    //   100: aload_0
    //   101: getfield ZA : Lburp/Zgff;
    //   104: invokevirtual getText : ()Ljava/lang/String;
    //   107: invokevirtual Zg : (IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    //   110: aload_2
    //   111: ifnull -> 183
    //   114: aload_0
    //   115: getfield Zp : Lburp/Zs2p;
    //   118: aload_0
    //   119: getfield Zf : Lburp/Zku8;
    //   122: aload_0
    //   123: invokevirtual Zz : ()Lburp/Zl25;
    //   126: getfield projectPersistedId : B
    //   129: aload_0
    //   130: getfield Zo : Z
    //   133: aload_0
    //   134: getfield Zw : Lburp/Zgff;
    //   137: invokevirtual getText : ()Ljava/lang/String;
    //   140: aload_0
    //   141: getfield ZN : Lburp/Zgff;
    //   144: invokevirtual getText : ()Ljava/lang/String;
    //   147: aload_0
    //   148: getfield ZH : Lburp/Zzdy;
    //   151: invokevirtual isSelected : ()Z
    //   154: ifne -> 172
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   163: athrow
    //   164: iconst_1
    //   165: goto -> 173
    //   168: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   171: athrow
    //   172: iconst_0
    //   173: aload_0
    //   174: getfield ZA : Lburp/Zgff;
    //   177: invokevirtual getText : ()Ljava/lang/String;
    //   180: invokevirtual ZK : (Lburp/Zku8;IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    //   183: aload_0
    //   184: getfield ZV : Ljava/lang/Runnable;
    //   187: invokeinterface run : ()V
    //   192: aload_0
    //   193: iconst_0
    //   194: invokevirtual setVisible : (Z)V
    //   197: aload_0
    //   198: invokevirtual dispose : ()V
    //   201: goto -> 241
    //   204: astore_3
    //   205: aload_3
    //   206: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   209: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   212: aload_0
    //   213: getfield ZT : Lburp/Zm9v;
    //   216: aload_0
    //   217: getfield Zw : Lburp/Zgff;
    //   220: invokevirtual getText : ()Ljava/lang/String;
    //   223: sipush #3356
    //   226: sipush #12909
    //   229: invokestatic a : (II)Ljava/lang/String;
    //   232: swap
    //   233: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   238: invokevirtual setText : (Ljava/lang/String;)V
    //   241: return
    // Exception table:
    //   from	to	target	type
    //   4	19	19	java/util/regex/PatternSyntaxException
    //   4	201	204	java/util/regex/PatternSyntaxException
    //   26	84	87	java/util/regex/PatternSyntaxException
    //   45	95	95	java/util/regex/PatternSyntaxException
    //   100	157	160	java/util/regex/PatternSyntaxException
    //   114	168	168	java/util/regex/PatternSyntaxException
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    setVisible(false);
    dispose();
    this.ZW.Ze();
  }
  
  private Zl25 Zz() {
    return (Zl25)this.Zu.getSelectedItem();
  }
  
  private static PatternSyntaxException a(PatternSyntaxException paramPatternSyntaxException) {
    return paramPatternSyntaxException;
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 't¯ºL#ðt'7HÈxØwBÒHÞS¤¯UGª?Öû4^ëåÕýr±%Þií²Ñ¤Î=ÒÍ }mn¤\\fì1û"RéÎª©rÖ °Ð¯¶#;gË=¤µèêsHÉmå1oÍ.ô ã\\bäQ¿¤eñÂbtybPaÇ¬ø#«Ð¼ö.ÎÕ_j*5Fx÷?Òÿ ^RR¦º$?ÉõèËL\\r>QÇÉOrVÑÅ~ëh<"Tv$z]Èç_xVÇ|Öy¿AÊ?\\bxI§$³1\\nè`}×Û¶pê;L\\nÇAvÁ,eOÃ2ÛF'öjKõÊðsMû¤µ<ÛrLÑ¹lÁÕç·¹@%å!úèãFJrg¤Î\ð!h9kmMIí*" Ã¹;&°²=ÔKo|YV¬ô!ræÎüåê&3 ^fãÑþvòþÓ\&YÀa$Õ3Lý]R9X>aÎßòÂ&[hºÐEfô¢óÿË/ÞTZÜñ\Jº/Iô`àO.\\n¯KzÉ&'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #115
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
    //   68: ldc '1»ül¢ügÃöaqÓoíµóÀDÊZSkb_Þj=¾Iä·»ªÛ6vÓç±ûc]'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_2
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
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic burp/Zr7d.a : [Ljava/lang/String;
    //   131: bipush #23
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zr7d.b : [Ljava/lang/String;
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
    //   212: bipush #29
    //   214: goto -> 244
    //   217: bipush #87
    //   219: goto -> 244
    //   222: bipush #96
    //   224: goto -> 244
    //   227: bipush #13
    //   229: goto -> 244
    //   232: bipush #58
    //   234: goto -> 244
    //   237: bipush #77
    //   239: goto -> 244
    //   242: bipush #55
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
    int i = (paramInt1 ^ 0xD1E) & 0xFFFF;
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
      byte b1 = 105;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr7d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */