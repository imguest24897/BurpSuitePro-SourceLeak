package burp;

import java.awt.event.ActionEvent;
import java.util.Optional;
import javax.swing.event.ListSelectionEvent;

public class Zb53 extends Zbqc {
  private final Ze01 Zn;
  
  private final Ze01 Za;
  
  private final Zl04 ZX;
  
  private final Zmil ZR;
  
  private final Zx_k ZZ;
  
  private final Zbws Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb53(Zl04 paramZl04, Zx_k paramZx_k) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZX : Lburp/Zl04;
    //   9: aload_0
    //   10: new burp/Zmil
    //   13: dup
    //   14: aload_2
    //   15: invokespecial <init> : (Lburp/Zx_k;)V
    //   18: putfield ZR : Lburp/Zmil;
    //   21: invokestatic Zu : ()[I
    //   24: aload_0
    //   25: aload_2
    //   26: putfield ZZ : Lburp/Zx_k;
    //   29: new java/awt/GridBagLayout
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: astore #4
    //   38: aload #4
    //   40: iconst_3
    //   41: newarray int
    //   43: dup
    //   44: iconst_0
    //   45: iconst_0
    //   46: iastore
    //   47: dup
    //   48: iconst_1
    //   49: bipush #10
    //   51: iastore
    //   52: dup
    //   53: iconst_2
    //   54: iconst_0
    //   55: iastore
    //   56: putfield columnWidths : [I
    //   59: aload #4
    //   61: iconst_3
    //   62: newarray int
    //   64: dup
    //   65: iconst_0
    //   66: iconst_0
    //   67: iastore
    //   68: dup
    //   69: iconst_1
    //   70: bipush #10
    //   72: iastore
    //   73: dup
    //   74: iconst_2
    //   75: iconst_0
    //   76: iastore
    //   77: putfield rowHeights : [I
    //   80: aload_0
    //   81: new javax/swing/border/EmptyBorder
    //   84: dup
    //   85: bipush #10
    //   87: iconst_0
    //   88: bipush #10
    //   90: iconst_0
    //   91: invokespecial <init> : (IIII)V
    //   94: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   97: astore_3
    //   98: aload_0
    //   99: aload #4
    //   101: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   104: new java/awt/GridBagConstraints
    //   107: dup
    //   108: invokespecial <init> : ()V
    //   111: astore #5
    //   113: aload #5
    //   115: iconst_0
    //   116: putfield gridy : I
    //   119: aload #5
    //   121: iconst_0
    //   122: putfield gridx : I
    //   125: aload #5
    //   127: iconst_3
    //   128: putfield gridwidth : I
    //   131: aload #5
    //   133: dconst_1
    //   134: putfield weightx : D
    //   137: aload #5
    //   139: bipush #23
    //   141: putfield anchor : I
    //   144: aload #5
    //   146: iconst_2
    //   147: putfield fill : I
    //   150: new burp/Zl8w
    //   153: dup
    //   154: sipush #7128
    //   157: sipush #-9027
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: invokespecial <init> : (Ljava/lang/String;)V
    //   166: astore #6
    //   168: aload_0
    //   169: aload #6
    //   171: aload #5
    //   173: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   176: new java/awt/GridBagConstraints
    //   179: dup
    //   180: invokespecial <init> : ()V
    //   183: astore #5
    //   185: aload #5
    //   187: iconst_2
    //   188: putfield gridy : I
    //   191: aload #5
    //   193: iconst_0
    //   194: putfield gridx : I
    //   197: aload #5
    //   199: dconst_1
    //   200: putfield weighty : D
    //   203: aload #5
    //   205: dconst_1
    //   206: putfield weightx : D
    //   209: aload #5
    //   211: iconst_1
    //   212: putfield fill : I
    //   215: new burp/Zbup
    //   218: dup
    //   219: invokespecial <init> : ()V
    //   222: astore #7
    //   224: aload_0
    //   225: aload #7
    //   227: aload #5
    //   229: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   232: aload_0
    //   233: new burp/Zbw7
    //   236: dup
    //   237: aload_0
    //   238: aload_0
    //   239: getfield ZR : Lburp/Zmil;
    //   242: invokespecial <init> : (Lburp/Zb53;Lburp/Zztu;)V
    //   245: putfield Zv : Lburp/Zbws;
    //   248: aload_0
    //   249: getfield Zv : Lburp/Zbws;
    //   252: sipush #7134
    //   255: sipush #-30796
    //   258: invokestatic a : (II)Ljava/lang/String;
    //   261: invokevirtual setName : (Ljava/lang/String;)V
    //   264: aload_0
    //   265: new burp/Ze01
    //   268: dup
    //   269: sipush #7135
    //   272: sipush #3018
    //   275: invokestatic a : (II)Ljava/lang/String;
    //   278: invokespecial <init> : (Ljava/lang/String;)V
    //   281: putfield Zn : Lburp/Ze01;
    //   284: aload_0
    //   285: getfield Zn : Lburp/Ze01;
    //   288: sipush #7129
    //   291: sipush #11475
    //   294: invokestatic a : (II)Ljava/lang/String;
    //   297: invokevirtual setName : (Ljava/lang/String;)V
    //   300: aload_0
    //   301: getfield Zn : Lburp/Ze01;
    //   304: iconst_0
    //   305: invokevirtual setEnabled : (Z)V
    //   308: aload_0
    //   309: getfield Zn : Lburp/Ze01;
    //   312: aload_0
    //   313: <illegal opcode> actionPerformed : (Lburp/Zb53;)Ljava/awt/event/ActionListener;
    //   318: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   321: aload_0
    //   322: new burp/Ze01
    //   325: dup
    //   326: sipush #7130
    //   329: sipush #-23300
    //   332: invokestatic a : (II)Ljava/lang/String;
    //   335: invokespecial <init> : (Ljava/lang/String;)V
    //   338: putfield Za : Lburp/Ze01;
    //   341: aload_0
    //   342: getfield Za : Lburp/Ze01;
    //   345: sipush #7133
    //   348: sipush #7903
    //   351: invokestatic a : (II)Ljava/lang/String;
    //   354: invokevirtual setName : (Ljava/lang/String;)V
    //   357: aload_0
    //   358: getfield Za : Lburp/Ze01;
    //   361: iconst_0
    //   362: invokevirtual setEnabled : (Z)V
    //   365: aload_0
    //   366: getfield Za : Lburp/Ze01;
    //   369: aload_0
    //   370: aload_2
    //   371: <illegal opcode> actionPerformed : (Lburp/Zb53;Lburp/Zx_k;)Ljava/awt/event/ActionListener;
    //   376: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   379: aload_0
    //   380: getfield Zv : Lburp/Zbws;
    //   383: iconst_0
    //   384: invokevirtual setSelectionMode : (I)V
    //   387: aload_0
    //   388: getfield Zv : Lburp/Zbws;
    //   391: new burp/Ztzl
    //   394: dup
    //   395: aload_0
    //   396: invokespecial <init> : (Lburp/Zb53;)V
    //   399: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   402: aload_0
    //   403: getfield Zv : Lburp/Zbws;
    //   406: new burp/Zewl
    //   409: dup
    //   410: aload_0
    //   411: invokespecial <init> : (Lburp/Zb53;)V
    //   414: invokevirtual addMouseMotionListener : (Ljava/awt/event/MouseMotionListener;)V
    //   417: aload_0
    //   418: getfield Zv : Lburp/Zbws;
    //   421: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   424: aload_0
    //   425: <illegal opcode> valueChanged : (Lburp/Zb53;)Ljavax/swing/event/ListSelectionListener;
    //   430: invokeinterface addListSelectionListener : (Ljavax/swing/event/ListSelectionListener;)V
    //   435: aload_0
    //   436: getfield Zv : Lburp/Zbws;
    //   439: invokestatic Zx : ()F
    //   442: f2d
    //   443: ldc2_w 1.2
    //   446: dmul
    //   447: d2i
    //   448: invokevirtual setRowHeight : (I)V
    //   451: aload_0
    //   452: getfield Zv : Lburp/Zbws;
    //   455: iconst_1
    //   456: invokevirtual setAutoCreateRowSorter : (Z)V
    //   459: aload #7
    //   461: aload_0
    //   462: getfield Zv : Lburp/Zbws;
    //   465: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   468: new java/awt/GridLayout
    //   471: dup
    //   472: iconst_4
    //   473: iconst_1
    //   474: iconst_0
    //   475: iconst_5
    //   476: invokespecial <init> : (IIII)V
    //   479: astore #8
    //   481: new burp/Zbqc
    //   484: dup
    //   485: aload #8
    //   487: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   490: astore #9
    //   492: new burp/Ze01
    //   495: dup
    //   496: sipush #7132
    //   499: sipush #-7643
    //   502: invokestatic a : (II)Ljava/lang/String;
    //   505: invokespecial <init> : (Ljava/lang/String;)V
    //   508: astore #10
    //   510: aload #10
    //   512: sipush #7131
    //   515: sipush #12024
    //   518: invokestatic a : (II)Ljava/lang/String;
    //   521: invokevirtual setName : (Ljava/lang/String;)V
    //   524: aload #9
    //   526: aload #10
    //   528: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   531: pop
    //   532: aload #10
    //   534: aload_0
    //   535: <illegal opcode> actionPerformed : (Lburp/Zb53;)Ljava/awt/event/ActionListener;
    //   540: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   543: aload #9
    //   545: aload_0
    //   546: getfield Zn : Lburp/Ze01;
    //   549: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   552: pop
    //   553: aload #9
    //   555: aload_0
    //   556: getfield Za : Lburp/Ze01;
    //   559: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   562: pop
    //   563: new java/awt/GridBagConstraints
    //   566: dup
    //   567: invokespecial <init> : ()V
    //   570: astore #5
    //   572: aload #5
    //   574: iconst_2
    //   575: putfield gridy : I
    //   578: aload #5
    //   580: iconst_2
    //   581: putfield gridx : I
    //   584: aload #5
    //   586: bipush #23
    //   588: putfield anchor : I
    //   591: aload_0
    //   592: aload #9
    //   594: aload #5
    //   596: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   599: invokestatic Zwu : ()[Lburp/Zbqc;
    //   602: ifnonnull -> 611
    //   605: iconst_4
    //   606: newarray int
    //   608: invokestatic ZQ : ([I)V
    //   611: return
  }
  
  private void Zl(Zx_k paramZx_k) {
    int i = this.Zv.convertRowIndexToModel(this.Zv.getSelectedRow());
    if (!paramZx_k.Zd(i).ZS())
      paramZx_k.Zs(i); 
  }
  
  private void ZX(Zmil paramZmil, Zrrh paramZrrh) {
    int i = this.Zv.convertRowIndexToModel(this.Zv.getSelectedRow());
    Zgi zgi = paramZmil.ZW(i);
    if (zgi.ZY())
      Zt(i, zgi, paramZrrh); 
  }
  
  private void Zh() {
    Zr75 zr75 = new Zr75(this.ZX, true, this::lambda$showNewAuthenticationDialog$4);
    Zt2m.Zy(zr75, Zt2m.ZF(this));
    zr75.setVisible(true);
  }
  
  private void Zt(int paramInt, Zgi paramZgi, Zrrh paramZrrh) {
    // Byte code:
    //   0: aload_3
    //   1: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   4: new burp/Zr75
    //   7: dup
    //   8: aload_0
    //   9: getfield ZX : Lburp/Zl04;
    //   12: iconst_0
    //   13: aload_2
    //   14: aload_0
    //   15: iload_1
    //   16: <illegal opcode> ZW : (Lburp/Zb53;I)Lburp/Zsqp;
    //   21: invokespecial <init> : (Lburp/Zl04;ZLburp/Zgi;Lburp/Zsqp;)V
    //   24: astore #4
    //   26: aload #4
    //   28: aload_0
    //   29: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   32: invokestatic Zy : (Ljava/awt/Window;Ljava/awt/Window;)V
    //   35: aload #4
    //   37: iconst_1
    //   38: invokevirtual setVisible : (Z)V
    //   41: return
  }
  
  private Zlja lambda$showEditAuthenticationDialog$5(int paramInt, Zgi paramZgi) {
    this.ZZ.Zb(paramInt, paramZgi);
    return Zlja.ZwE();
  }
  
  private Zlja lambda$showNewAuthenticationDialog$4(Zgi paramZgi) {
    Optional<Zgi> optional = this.ZZ.Zp(paramZgi);
    if (optional.isPresent()) {
      ((Zgi)optional.get()).ZL(paramZgi);
      this.ZR.fireTableDataChanged();
      return Zlja.ZwE();
    } 
    return this.ZZ.ZX(paramZgi).<Zlja>map(Zlja::Z_).orElse(Zlja.ZwE());
  }
  
  private void lambda$new$3(ActionEvent paramActionEvent) {
    Zh();
  }
  
  private void lambda$new$2(ListSelectionEvent paramListSelectionEvent) {
    if (this.Zv.getSelectedRow() == -1) {
      this.Zn.setEnabled(false);
      this.Za.setEnabled(false);
      return;
    } 
    Zgi zgi = this.ZR.ZW(this.Zv.convertRowIndexToModel(this.Zv.getSelectedRow()));
    this.Zn.setEnabled((zgi != null && zgi.ZY()));
    this.Za.setEnabled((zgi != null && !zgi.ZS()));
  }
  
  private void lambda$new$1(Zx_k paramZx_k, ActionEvent paramActionEvent) {
    Zl(paramZx_k);
  }
  
  private void lambda$new$0(ActionEvent paramActionEvent) {
    ZX(this.ZR, Zrrh.SCANNER_API_SCAN_LAUNCHER_EDIT_AUTHENTICATION_EDIT_BUTTON);
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\tne?«éþéÊßÀ¸çûJ,[°¿8eÖ>t#@.Q2õÀ[åè T»ååÉwo[*'¤M¤¿£9ÙäqÅÙg½Íô¯n¡¾}lÀèAéØEjMô'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: iconst_2
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 141
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
    //   63: goto -> 22
    //   66: ldc 'Ýæ=xmLýwiaf¿5ªÜ)ÄIÈ«Ú+Ã¹©ãá+ÝSv·G¾hÛÞ)RFkqÝ\\bÔ±a[7<hõ[¸l*Ûg B:=ÏNª%ø®NýÒ_p"K\\nñ\\bå³ÌOZk+<Á \\b2,OXÂãÇqS¾j}¶(nÀr:LÊ²RK(ËÁ´¼xIm§ÜS_'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #28
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #10
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zb53.a : [Ljava/lang/String;
    //   130: bipush #8
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zb53.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #124
    //   214: goto -> 244
    //   217: bipush #123
    //   219: goto -> 244
    //   222: bipush #13
    //   224: goto -> 244
    //   227: bipush #67
    //   229: goto -> 244
    //   232: bipush #25
    //   234: goto -> 244
    //   237: bipush #63
    //   239: goto -> 244
    //   242: bipush #10
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 38, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1BDF) & 0xFFFF;
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
      byte b1 = 25;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb53.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */