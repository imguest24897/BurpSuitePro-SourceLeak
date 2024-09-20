package burp;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

public class Zba_ extends Zbv5 implements Zrx6, Zt5e {
  private final Zz9f Zl;
  
  private final Zsy4 ZP;
  
  private boolean Z_;
  
  private int Zu;
  
  private final ButtonGroup ZC;
  
  private Zmg2 ZL;
  
  private Zmg2 ZQ;
  
  private Zmg2 ZK;
  
  private Zmg2 Zr;
  
  private final int ZU;
  
  private final ActionListener Zj;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zba_(Zz0n paramZz0n, Zt4u paramZt4u, Zskh paramZskh, Zk97 paramZk97, String paramString1, String paramString2, Zz9f paramZz9f, Zr1j paramZr1j, Zbnt paramZbnt, Zr_4 paramZr_4) {
    this(paramZz0n, paramZt4u, paramZskh, false, paramZk97, (String)null, (String)null, (String)null, (String)null, (String)null, paramString1, paramString2, paramZz9f, paramZr1j, paramZbnt, paramZr_4, (Zr1m)null, new String[0]);
  }
  
  public Zba_(Zz0n paramZz0n, Zt4u paramZt4u, Zskh paramZskh, boolean paramBoolean, Zk97 paramZk97, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, Zz9f paramZz9f, Zr1j paramZr1j, Zbnt paramZbnt, Zr_4 paramZr_4, Zr1m paramZr1m, String... paramVarArgs) {
    // Byte code:
    //   0: invokestatic Zt : ()I
    //   3: istore #19
    //   5: aload_0
    //   6: invokespecial <init> : ()V
    //   9: aload #13
    //   11: ifnull -> 18
    //   14: iconst_1
    //   15: goto -> 19
    //   18: iconst_0
    //   19: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   22: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   25: aload_0
    //   26: aload #13
    //   28: putfield Zl : Lburp/Zz9f;
    //   31: aload_0
    //   32: getfield Zl : Lburp/Zz9f;
    //   35: aload_0
    //   36: invokevirtual ZH : (Lburp/Zt5e;)V
    //   39: aload_0
    //   40: new burp/Zsy4
    //   43: dup
    //   44: aload_1
    //   45: aload_2
    //   46: aload_3
    //   47: aload #13
    //   49: invokevirtual Z_N : ()Lburp/Zlor;
    //   52: aload #5
    //   54: aload #14
    //   56: aload #15
    //   58: aload #16
    //   60: invokespecial <init> : (Lburp/Zz0n;Lburp/Zt4u;Lburp/Zskh;Lburp/Zlor;Lburp/Zk97;Lburp/Zr1j;Lburp/Zbnt;Lburp/Zr_4;)V
    //   63: putfield ZP : Lburp/Zsy4;
    //   66: aload_0
    //   67: iconst_2
    //   68: putfield ZU : I
    //   71: new java/awt/GridBagLayout
    //   74: dup
    //   75: invokespecial <init> : ()V
    //   78: astore #20
    //   80: aload #20
    //   82: iload #4
    //   84: ifeq -> 105
    //   87: iconst_3
    //   88: newarray int
    //   90: dup
    //   91: iconst_0
    //   92: iconst_0
    //   93: iastore
    //   94: dup
    //   95: iconst_1
    //   96: iconst_5
    //   97: iastore
    //   98: dup
    //   99: iconst_2
    //   100: iconst_0
    //   101: iastore
    //   102: goto -> 112
    //   105: iconst_1
    //   106: newarray int
    //   108: dup
    //   109: iconst_0
    //   110: iconst_0
    //   111: iastore
    //   112: putfield columnWidths : [I
    //   115: aload #20
    //   117: bipush #11
    //   119: newarray int
    //   121: dup
    //   122: iconst_0
    //   123: iconst_0
    //   124: iastore
    //   125: dup
    //   126: iconst_1
    //   127: iconst_5
    //   128: iastore
    //   129: dup
    //   130: iconst_2
    //   131: iconst_0
    //   132: iastore
    //   133: dup
    //   134: iconst_3
    //   135: iconst_5
    //   136: iastore
    //   137: dup
    //   138: iconst_4
    //   139: iconst_0
    //   140: iastore
    //   141: dup
    //   142: iconst_5
    //   143: iconst_5
    //   144: iastore
    //   145: dup
    //   146: bipush #6
    //   148: iconst_0
    //   149: iastore
    //   150: dup
    //   151: bipush #7
    //   153: iconst_5
    //   154: iastore
    //   155: dup
    //   156: bipush #8
    //   158: iconst_0
    //   159: iastore
    //   160: dup
    //   161: bipush #9
    //   163: iconst_5
    //   164: iastore
    //   165: dup
    //   166: bipush #10
    //   168: iconst_0
    //   169: iastore
    //   170: putfield rowHeights : [I
    //   173: aload_0
    //   174: aload #20
    //   176: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   179: iload #4
    //   181: ifeq -> 295
    //   184: aload #5
    //   186: ifnull -> 295
    //   189: new java/awt/GridBagConstraints
    //   192: dup
    //   193: invokespecial <init> : ()V
    //   196: astore #21
    //   198: aload #21
    //   200: iconst_0
    //   201: putfield gridx : I
    //   204: aload #21
    //   206: iconst_0
    //   207: putfield gridy : I
    //   210: aload #21
    //   212: bipush #9
    //   214: putfield gridheight : I
    //   217: aload #21
    //   219: bipush #23
    //   221: putfield anchor : I
    //   224: aload #6
    //   226: ifnull -> 271
    //   229: new burp/Zbkr
    //   232: dup
    //   233: invokespecial <init> : ()V
    //   236: astore #22
    //   238: aload #22
    //   240: aload #6
    //   242: aload #5
    //   244: aload #17
    //   246: aload #18
    //   248: invokevirtual ZP : (Ljava/lang/String;Lburp/Zk97;Lburp/Zr1m;[Ljava/lang/String;)V
    //   251: aload_0
    //   252: aload #22
    //   254: aload #21
    //   256: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   259: iload #19
    //   261: ifeq -> 295
    //   264: iconst_2
    //   265: anewarray burp/Zbqc
    //   268: invokestatic Zr : ([Lburp/Zbqc;)V
    //   271: new burp/Zm2o
    //   274: dup
    //   275: invokespecial <init> : ()V
    //   278: astore #22
    //   280: aload #22
    //   282: aload #5
    //   284: invokevirtual Zi : (Lburp/Zk97;)V
    //   287: aload_0
    //   288: aload #22
    //   290: aload #21
    //   292: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   295: iload #4
    //   297: ifne -> 350
    //   300: new java/awt/GridBagConstraints
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: astore #21
    //   309: aload #21
    //   311: iconst_0
    //   312: putfield gridx : I
    //   315: aload #21
    //   317: iconst_0
    //   318: putfield gridy : I
    //   321: aload #21
    //   323: bipush #23
    //   325: putfield anchor : I
    //   328: aload_0
    //   329: new burp/Zm99
    //   332: dup
    //   333: sipush #27482
    //   336: sipush #-1649
    //   339: invokestatic a : (II)Ljava/lang/String;
    //   342: invokespecial <init> : (Ljava/lang/String;)V
    //   345: aload #21
    //   347: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   350: aload #7
    //   352: ifnull -> 418
    //   355: new burp/Zbkc
    //   358: dup
    //   359: aload #7
    //   361: invokespecial <init> : (Ljava/lang/String;)V
    //   364: astore #21
    //   366: new java/awt/GridBagConstraints
    //   369: dup
    //   370: invokespecial <init> : ()V
    //   373: astore #22
    //   375: aload #22
    //   377: aload_0
    //   378: getfield ZU : I
    //   381: putfield gridx : I
    //   384: aload #22
    //   386: aload_0
    //   387: getfield Zu : I
    //   390: putfield gridy : I
    //   393: aload #22
    //   395: bipush #21
    //   397: putfield anchor : I
    //   400: aload_0
    //   401: aload #21
    //   403: aload #22
    //   405: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   408: aload_0
    //   409: dup
    //   410: getfield Zu : I
    //   413: iconst_2
    //   414: iadd
    //   415: putfield Zu : I
    //   418: aload #8
    //   420: ifnull -> 499
    //   423: new burp/Zl8w
    //   426: dup
    //   427: aload #8
    //   429: invokespecial <init> : (Ljava/lang/String;)V
    //   432: astore #21
    //   434: new java/awt/GridBagConstraints
    //   437: dup
    //   438: invokespecial <init> : ()V
    //   441: astore #22
    //   443: aload #22
    //   445: aload_0
    //   446: getfield ZU : I
    //   449: putfield gridx : I
    //   452: aload #22
    //   454: aload_0
    //   455: getfield Zu : I
    //   458: putfield gridy : I
    //   461: aload #22
    //   463: iconst_2
    //   464: putfield fill : I
    //   467: aload #22
    //   469: sipush #1280
    //   472: putfield anchor : I
    //   475: aload #22
    //   477: dconst_1
    //   478: putfield weightx : D
    //   481: aload_0
    //   482: aload #21
    //   484: aload #22
    //   486: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   489: aload_0
    //   490: dup
    //   491: getfield Zu : I
    //   494: iconst_2
    //   495: iadd
    //   496: putfield Zu : I
    //   499: aload_0
    //   500: new javax/swing/ButtonGroup
    //   503: dup
    //   504: invokespecial <init> : ()V
    //   507: putfield ZC : Ljavax/swing/ButtonGroup;
    //   510: aload_0
    //   511: aload_0
    //   512: <illegal opcode> actionPerformed : (Lburp/Zba_;)Ljava/awt/event/ActionListener;
    //   517: putfield Zj : Ljava/awt/event/ActionListener;
    //   520: aload #9
    //   522: ifnull -> 549
    //   525: aload_0
    //   526: aload_0
    //   527: aload #9
    //   529: aload_0
    //   530: getfield Zu : I
    //   533: invokevirtual Zb : (Ljava/lang/String;I)Lburp/Zmg2;
    //   536: putfield ZK : Lburp/Zmg2;
    //   539: aload_0
    //   540: dup
    //   541: getfield Zu : I
    //   544: iconst_2
    //   545: iadd
    //   546: putfield Zu : I
    //   549: aload #10
    //   551: ifnull -> 587
    //   554: aload_0
    //   555: aload_0
    //   556: aload #10
    //   558: aload_0
    //   559: getfield Zu : I
    //   562: sipush #27483
    //   565: sipush #13410
    //   568: invokestatic a : (II)Ljava/lang/String;
    //   571: invokevirtual ZU : (Ljava/lang/String;ILjava/lang/String;)Lburp/Zmg2;
    //   574: putfield ZQ : Lburp/Zmg2;
    //   577: aload_0
    //   578: dup
    //   579: getfield Zu : I
    //   582: iconst_2
    //   583: iadd
    //   584: putfield Zu : I
    //   587: aload #11
    //   589: ifnull -> 616
    //   592: aload_0
    //   593: aload_0
    //   594: aload #11
    //   596: aload_0
    //   597: getfield Zu : I
    //   600: invokevirtual Zb : (Ljava/lang/String;I)Lburp/Zmg2;
    //   603: putfield Zr : Lburp/Zmg2;
    //   606: aload_0
    //   607: dup
    //   608: getfield Zu : I
    //   611: iconst_2
    //   612: iadd
    //   613: putfield Zu : I
    //   616: aload #12
    //   618: ifnull -> 645
    //   621: aload_0
    //   622: aload_0
    //   623: aload #12
    //   625: aload_0
    //   626: getfield Zu : I
    //   629: invokevirtual Zb : (Ljava/lang/String;I)Lburp/Zmg2;
    //   632: putfield ZL : Lburp/Zmg2;
    //   635: aload_0
    //   636: dup
    //   637: getfield Zu : I
    //   640: iconst_2
    //   641: iadd
    //   642: putfield Zu : I
    //   645: aload_0
    //   646: aconst_null
    //   647: invokevirtual ZC : (Lburp/Zz28;)V
    //   650: return
  }
  
  private Zmg2 Zb(String paramString, int paramInt) {
    return ZU(paramString, paramInt, (String)null);
  }
  
  private Zmg2 ZU(String paramString1, int paramInt, String paramString2) {
    Zmg2 zmg2 = new Zmg2(paramString1);
    if (paramString2 != null)
      zmg2.setName(paramString2); 
    zmg2.addActionListener(this.Zj);
    this.ZC.add(zmg2);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = this.ZU;
    gridBagConstraints.gridy = paramInt;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    add(zmg2, gridBagConstraints);
    return zmg2;
  }
  
  private void ZT() {
    // Byte code:
    //   0: invokestatic ZM : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZK : Lburp/Zmg2;
    //   8: ifnull -> 33
    //   11: aload_0
    //   12: getfield ZK : Lburp/Zmg2;
    //   15: invokevirtual isSelected : ()Z
    //   18: ifeq -> 33
    //   21: aload_0
    //   22: getfield Zl : Lburp/Zz9f;
    //   25: iconst_0
    //   26: invokevirtual ZA : (I)V
    //   29: iload_1
    //   30: ifne -> 116
    //   33: aload_0
    //   34: getfield ZQ : Lburp/Zmg2;
    //   37: ifnull -> 62
    //   40: aload_0
    //   41: getfield ZQ : Lburp/Zmg2;
    //   44: invokevirtual isSelected : ()Z
    //   47: ifeq -> 62
    //   50: aload_0
    //   51: getfield Zl : Lburp/Zz9f;
    //   54: iconst_1
    //   55: invokevirtual ZA : (I)V
    //   58: iload_1
    //   59: ifne -> 116
    //   62: aload_0
    //   63: getfield Zr : Lburp/Zmg2;
    //   66: ifnull -> 91
    //   69: aload_0
    //   70: getfield Zr : Lburp/Zmg2;
    //   73: invokevirtual isSelected : ()Z
    //   76: ifeq -> 91
    //   79: aload_0
    //   80: getfield Zl : Lburp/Zz9f;
    //   83: iconst_2
    //   84: invokevirtual ZA : (I)V
    //   87: iload_1
    //   88: ifne -> 116
    //   91: aload_0
    //   92: getfield ZL : Lburp/Zmg2;
    //   95: ifnull -> 116
    //   98: aload_0
    //   99: getfield ZL : Lburp/Zmg2;
    //   102: invokevirtual isSelected : ()Z
    //   105: ifeq -> 116
    //   108: aload_0
    //   109: getfield Zl : Lburp/Zz9f;
    //   112: iconst_3
    //   113: invokevirtual ZA : (I)V
    //   116: return
  }
  
  public Zbqc Zz() {
    return this;
  }
  
  public void ZC(Zz28 paramZz28) {
    // Byte code:
    //   0: invokestatic ZM : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zl : Lburp/Zz9f;
    //   8: invokevirtual Z_x : ()I
    //   11: istore_3
    //   12: iload_3
    //   13: tableswitch default -> 120, 0 -> 44, 1 -> 63, 2 -> 82, 3 -> 101
    //   44: aload_0
    //   45: getfield ZK : Lburp/Zmg2;
    //   48: iconst_1
    //   49: invokevirtual setSelected : (Z)V
    //   52: iload_2
    //   53: ifne -> 132
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: aload_0
    //   64: getfield ZQ : Lburp/Zmg2;
    //   67: iconst_1
    //   68: invokevirtual setSelected : (Z)V
    //   71: iload_2
    //   72: ifne -> 132
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload_0
    //   83: getfield Zr : Lburp/Zmg2;
    //   86: iconst_1
    //   87: invokevirtual setSelected : (Z)V
    //   90: iload_2
    //   91: ifne -> 132
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   100: athrow
    //   101: aload_0
    //   102: getfield ZL : Lburp/Zmg2;
    //   105: iconst_1
    //   106: invokevirtual setSelected : (Z)V
    //   109: iload_2
    //   110: ifne -> 132
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: new java/lang/Exception
    //   123: dup
    //   124: invokespecial <init> : ()V
    //   127: athrow
    //   128: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   131: athrow
    //   132: iload_3
    //   133: iconst_3
    //   134: if_icmpne -> 166
    //   137: aload_0
    //   138: getfield Z_ : Z
    //   141: ifne -> 191
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload_0
    //   152: invokevirtual Zw : ()V
    //   155: iload_2
    //   156: ifne -> 191
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   165: athrow
    //   166: aload_0
    //   167: getfield Z_ : Z
    //   170: ifeq -> 191
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   179: athrow
    //   180: aload_0
    //   181: invokevirtual ZG : ()V
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   190: athrow
    //   191: goto -> 202
    //   194: astore_3
    //   195: aload_3
    //   196: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   199: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   202: return
    // Exception table:
    //   from	to	target	type
    //   4	191	194	java/lang/Exception
    //   12	56	59	java/lang/Exception
    //   44	75	78	java/lang/Exception
    //   63	94	97	java/lang/Exception
    //   82	113	116	java/lang/Exception
    //   101	128	128	java/lang/Exception
    //   132	144	147	java/lang/Exception
    //   137	159	162	java/lang/Exception
    //   151	173	176	java/lang/Exception
    //   166	184	187	java/lang/Exception
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    if (this.ZL != null)
      this.ZL.setEnabled(paramBoolean); 
    if (this.ZQ != null)
      this.ZQ.setEnabled(paramBoolean); 
    if (this.ZK != null)
      this.ZK.setEnabled(paramBoolean); 
    if (this.Zr != null)
      this.Zr.setEnabled(paramBoolean); 
    this.ZP.ZO(paramBoolean);
  }
  
  private void Zw() {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = this.ZU;
    gridBagConstraints.gridy = this.Zu;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.ZP.Zz(), gridBagConstraints);
    revalidate();
    this.Z_ = true;
  }
  
  private void ZG() {
    remove(this.ZP.Zz());
    revalidate();
    this.Z_ = false;
  }
  
  private void lambda$new$0(ActionEvent paramActionEvent) {
    ZT();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '}ð® ­ÂõyçpÏ¢ÆEáÇÔ?gúÖõ£5Ý1ÿÍo5'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_4
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #121
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic burp/Zba_.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zba_.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #98
    //   154: goto -> 184
    //   157: bipush #25
    //   159: goto -> 184
    //   162: bipush #31
    //   164: goto -> 184
    //   167: bipush #109
    //   169: goto -> 184
    //   172: bipush #115
    //   174: goto -> 184
    //   177: bipush #112
    //   179: goto -> 184
    //   182: bipush #88
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 38
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6B5A) & 0xFFFF;
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
      byte b1 = 7;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zba_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */