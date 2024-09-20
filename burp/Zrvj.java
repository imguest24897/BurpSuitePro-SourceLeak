package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.util.Optional;

public class Zrvj extends Zrh7 {
  private final Zt8_ ZR;
  
  private final Zm99 ZH;
  
  private Zb5a ZG;
  
  private Zsd0<?> Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrvj(Window paramWindow, Zsd0<?> paramZsd0, Zt8_ paramZt8_) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_1
    //   3: getstatic burp/Zzv7.RECORDED_LOGIN_EDIT_EVENT_DIALOG : Lburp/Zzv7;
    //   6: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   9: invokestatic ZX : ()[Ljava/lang/String;
    //   12: aload_0
    //   13: aload_3
    //   14: putfield ZR : Lburp/Zt8_;
    //   17: aload_0
    //   18: new burp/Zm99
    //   21: dup
    //   22: ldc ' '
    //   24: invokespecial <init> : (Ljava/lang/String;)V
    //   27: putfield ZH : Lburp/Zm99;
    //   30: astore #4
    //   32: aload_0
    //   33: new java/awt/BorderLayout
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   43: aload_0
    //   44: new java/awt/Dimension
    //   47: dup
    //   48: sipush #500
    //   51: sipush #400
    //   54: invokespecial <init> : (II)V
    //   57: invokevirtual setMinimumSize : (Ljava/awt/Dimension;)V
    //   60: aload_2
    //   61: ifnonnull -> 68
    //   64: iconst_1
    //   65: goto -> 69
    //   68: iconst_0
    //   69: istore #5
    //   71: aload_0
    //   72: iload #5
    //   74: ifeq -> 87
    //   77: new burp/Ztiz
    //   80: dup
    //   81: invokespecial <init> : ()V
    //   84: goto -> 88
    //   87: aload_2
    //   88: putfield Zb : Lburp/Zsd0;
    //   91: aload_0
    //   92: iload #5
    //   94: ifeq -> 109
    //   97: sipush #-3724
    //   100: sipush #29766
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: goto -> 118
    //   109: sipush #-3719
    //   112: sipush #-16628
    //   115: invokestatic a : (II)Ljava/lang/String;
    //   118: invokevirtual setTitle : (Ljava/lang/String;)V
    //   121: new java/awt/GridBagLayout
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: astore #6
    //   130: aload #6
    //   132: bipush #7
    //   134: newarray int
    //   136: dup
    //   137: iconst_0
    //   138: iconst_0
    //   139: iastore
    //   140: dup
    //   141: iconst_1
    //   142: bipush #10
    //   144: iastore
    //   145: dup
    //   146: iconst_2
    //   147: iconst_0
    //   148: iastore
    //   149: dup
    //   150: iconst_3
    //   151: bipush #10
    //   153: iastore
    //   154: dup
    //   155: iconst_4
    //   156: iconst_0
    //   157: iastore
    //   158: dup
    //   159: iconst_5
    //   160: bipush #20
    //   162: iastore
    //   163: dup
    //   164: bipush #6
    //   166: iconst_0
    //   167: iastore
    //   168: putfield rowHeights : [I
    //   171: new burp/Zbqc
    //   174: dup
    //   175: invokespecial <init> : ()V
    //   178: astore #7
    //   180: new burp/Zbup
    //   183: dup
    //   184: aload #7
    //   186: invokespecial <init> : (Ljava/awt/Component;)V
    //   189: astore #8
    //   191: aload #8
    //   193: new javax/swing/border/EmptyBorder
    //   196: dup
    //   197: iconst_0
    //   198: iconst_0
    //   199: iconst_0
    //   200: iconst_0
    //   201: invokespecial <init> : (IIII)V
    //   204: invokevirtual setViewportBorder : (Ljavax/swing/border/Border;)V
    //   207: aload #7
    //   209: aload #6
    //   211: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   214: aload #7
    //   216: new javax/swing/border/EmptyBorder
    //   219: dup
    //   220: bipush #20
    //   222: bipush #20
    //   224: bipush #20
    //   226: bipush #20
    //   228: invokespecial <init> : (IIII)V
    //   231: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   234: aload_0
    //   235: aload_0
    //   236: aload_0
    //   237: getfield Zb : Lburp/Zsd0;
    //   240: invokestatic ZK : (Lburp/Zrvj;Lburp/Zsd0;)Lburp/Zb5a;
    //   243: putfield ZG : Lburp/Zb5a;
    //   246: new burp/Zedd
    //   249: dup
    //   250: invokespecial <init> : ()V
    //   253: astore #9
    //   255: aload #9
    //   257: sipush #-3722
    //   260: sipush #29880
    //   263: invokestatic a : (II)Ljava/lang/String;
    //   266: invokevirtual setName : (Ljava/lang/String;)V
    //   269: aload #9
    //   271: getstatic burp/Zt00.TITLE_PLAIN_FONT : Lburp/Zt00;
    //   274: invokevirtual ZA : (Lburp/Zt00;)V
    //   277: invokestatic values : ()[Lburp/Zm_e;
    //   280: astore #10
    //   282: aload #10
    //   284: arraylength
    //   285: istore #11
    //   287: iconst_0
    //   288: istore #12
    //   290: iload #12
    //   292: iload #11
    //   294: if_icmpge -> 326
    //   297: aload #10
    //   299: iload #12
    //   301: aaload
    //   302: astore #13
    //   304: aload #9
    //   306: aload #13
    //   308: invokevirtual addItem : (Ljava/lang/Object;)V
    //   311: iinc #12, 1
    //   314: aload #4
    //   316: ifnull -> 290
    //   319: iconst_1
    //   320: anewarray burp/Zbqc
    //   323: invokestatic Zr : ([Lburp/Zbqc;)V
    //   326: aload #9
    //   328: aload_0
    //   329: getfield Zb : Lburp/Zsd0;
    //   332: invokestatic ZF : (Lburp/Zsd0;)Lburp/Zm_e;
    //   335: invokevirtual setSelectedItem : (Ljava/lang/Object;)V
    //   338: aload #9
    //   340: iload #5
    //   342: invokevirtual setEnabled : (Z)V
    //   345: aload #9
    //   347: aload_0
    //   348: aload #9
    //   350: aload #7
    //   352: <illegal opcode> itemStateChanged : (Lburp/Zrvj;Lburp/Zedd;Lburp/Zbqc;)Ljava/awt/event/ItemListener;
    //   357: invokevirtual addItemListener : (Ljava/awt/event/ItemListener;)V
    //   360: new java/awt/GridBagConstraints
    //   363: dup
    //   364: invokespecial <init> : ()V
    //   367: astore #10
    //   369: aload #10
    //   371: iconst_0
    //   372: putfield gridx : I
    //   375: aload #10
    //   377: iconst_0
    //   378: putfield gridy : I
    //   381: aload #10
    //   383: bipush #23
    //   385: putfield anchor : I
    //   388: aload #7
    //   390: aload #9
    //   392: aload #10
    //   394: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   397: new java/awt/GridBagConstraints
    //   400: dup
    //   401: invokespecial <init> : ()V
    //   404: astore #10
    //   406: aload #10
    //   408: iconst_0
    //   409: putfield gridx : I
    //   412: aload #10
    //   414: iconst_2
    //   415: putfield gridy : I
    //   418: aload #10
    //   420: iconst_2
    //   421: putfield fill : I
    //   424: aload #10
    //   426: bipush #23
    //   428: putfield anchor : I
    //   431: new burp/Zem9
    //   434: dup
    //   435: iconst_0
    //   436: invokespecial <init> : (I)V
    //   439: astore #11
    //   441: aload #7
    //   443: aload #11
    //   445: aload #10
    //   447: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   450: aload #7
    //   452: aload_0
    //   453: getfield ZG : Lburp/Zb5a;
    //   456: invokestatic Zr : ()Ljava/awt/GridBagConstraints;
    //   459: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   462: aload_0
    //   463: invokevirtual ZY : ()Lburp/Zbqc;
    //   466: astore #12
    //   468: aload_0
    //   469: aload #12
    //   471: sipush #-3717
    //   474: sipush #9499
    //   477: invokestatic a : (II)Ljava/lang/String;
    //   480: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   483: aload_0
    //   484: aload #8
    //   486: sipush #-3721
    //   489: sipush #-11604
    //   492: invokestatic a : (II)Ljava/lang/String;
    //   495: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   498: aload_0
    //   499: invokevirtual pack : ()V
    //   502: aload #7
    //   504: iconst_1
    //   505: invokevirtual getInputMap : (I)Ljavax/swing/InputMap;
    //   508: sipush #-3723
    //   511: sipush #-1535
    //   514: invokestatic a : (II)Ljava/lang/String;
    //   517: invokestatic getKeyStroke : (Ljava/lang/String;)Ljavax/swing/KeyStroke;
    //   520: sipush #-3720
    //   523: sipush #11146
    //   526: invokestatic a : (II)Ljava/lang/String;
    //   529: invokevirtual put : (Ljavax/swing/KeyStroke;Ljava/lang/Object;)V
    //   532: aload #7
    //   534: invokevirtual getActionMap : ()Ljavax/swing/ActionMap;
    //   537: sipush #-3727
    //   540: sipush #-22482
    //   543: invokestatic a : (II)Ljava/lang/String;
    //   546: new burp/Ze_3
    //   549: dup
    //   550: aload_0
    //   551: invokespecial <init> : (Lburp/Zrvj;)V
    //   554: invokevirtual put : (Ljava/lang/Object;Ljavax/swing/Action;)V
    //   557: aload #7
    //   559: iconst_1
    //   560: invokevirtual getInputMap : (I)Ljavax/swing/InputMap;
    //   563: sipush #-3713
    //   566: sipush #-23028
    //   569: invokestatic a : (II)Ljava/lang/String;
    //   572: invokestatic getKeyStroke : (Ljava/lang/String;)Ljavax/swing/KeyStroke;
    //   575: sipush #-3714
    //   578: sipush #-22169
    //   581: invokestatic a : (II)Ljava/lang/String;
    //   584: invokevirtual put : (Ljavax/swing/KeyStroke;Ljava/lang/Object;)V
    //   587: aload #7
    //   589: invokevirtual getActionMap : ()Ljavax/swing/ActionMap;
    //   592: sipush #-3725
    //   595: sipush #8486
    //   598: invokestatic a : (II)Ljava/lang/String;
    //   601: new burp/Ztxl
    //   604: dup
    //   605: aload_0
    //   606: invokespecial <init> : (Lburp/Zrvj;)V
    //   609: invokevirtual put : (Ljava/lang/Object;Ljavax/swing/Action;)V
    //   612: aload_0
    //   613: aload_1
    //   614: invokevirtual Zq : (Ljava/awt/Window;)V
    //   617: return
  }
  
  private Zbqc ZY() {
    Zbqc zbqc = new Zbqc();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 10, 0, 10, 0, 20 };
    gridBagLayout.rowHeights = new int[] { 0, 10, 0, 20 };
    zbqc.setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.fill = 1;
    zbqc.add(new Zm99(), gridBagConstraints);
    this.ZH.Ze(Zlkk.TEXT_ERROR);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.gridwidth = 5;
    zbqc.add(this.ZH, gridBagConstraints);
    Ze01 ze011 = new Ze01(a(-3718, -23199));
    ze011.setName(a(-3728, 1369));
    ze011.addActionListener(this::lambda$createActionPanel$1);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    zbqc.add(ze011, gridBagConstraints);
    Ze01 ze012 = new Ze01(a(-3726, -24187));
    ze012.addActionListener(this::lambda$createActionPanel$2);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    zbqc.add(ze012, gridBagConstraints);
    return zbqc;
  }
  
  private void Za() {
    this.ZG.ZB();
    Optional<String> optional = this.Zb.Zx();
    String[] arrayOfString = Zb5b.ZX();
    if (optional.isEmpty()) {
      this.ZR.ZQ(this.Zb);
      this.ZH.setText(" ");
      this.ZG.ZS();
      dispose();
      if (arrayOfString != null) {
        this.ZH.setText(optional.get());
        return;
      } 
      return;
    } 
    this.ZH.setText(optional.get());
  }
  
  private static GridBagConstraints Zr() {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    return gridBagConstraints;
  }
  
  private void lambda$createActionPanel$2(ActionEvent paramActionEvent) {
    dispose();
  }
  
  private void lambda$createActionPanel$1(ActionEvent paramActionEvent) {
    Za();
  }
  
  private void lambda$new$0(Zedd paramZedd, Zbqc paramZbqc, ItemEvent paramItemEvent) {
    if (paramZedd.getSelectedItem() != null) {
      Zsd0<?> zsd0 = ((Zm_e)paramZedd.getSelectedItem()).ZQ();
      this.Zb = zsd0;
      paramZbqc.remove(this.ZG);
      this.ZG = Zb5a.ZK(this, zsd0);
      paramZbqc.add(this.ZG, Zr());
      this.ZH.setText(" ");
      pack();
      Zmse.ZF(paramZbqc);
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '"©G²³%ß24(oÁíÂ%Î/ÍØhÕß*%@dÝÿÜ`3r)ÑiÀÎg)&*`|vÝÚ\\fDBØW+¤Óç#¯ ø?"ð'è«¿ÝPVj·3ßÑXuKL\íø&ø\\råRy¡æ(÷7á1$\\ndX¡lté°TKé#)YXÓ­Fd'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #12
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #29
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
    //   68: ldc ')¾v\\f\\fFòÇÕ¯eªÏÏ:E'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #52
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
    //   129: putstatic burp/Zrvj.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrvj.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #91
    //   214: goto -> 243
    //   217: bipush #59
    //   219: goto -> 243
    //   222: bipush #124
    //   224: goto -> 243
    //   227: bipush #34
    //   229: goto -> 243
    //   232: bipush #21
    //   234: goto -> 243
    //   237: iconst_1
    //   238: goto -> 243
    //   241: bipush #112
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF173) & 0xFFFF;
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
      char c = 'Ú';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrvj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */