package burp;

import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import net.portswigger.Zlz;

public class Zr7j extends Zrh7 {
  private final Window Zz;
  
  private Zzdy ZM;
  
  private Zt3 ZY;
  
  private static String[] Zc;
  
  private static final String[] b;
  
  private static final String[] c;
  
  private Zr7j(Zlvz paramZlvz) {
    super(paramZlvz.ZM, paramZlvz.ZD, Zzv7.CONFIRMATION_DIALOG);
    this.Zz = paramZlvz.ZM;
    this.ZY = new Zt3("", false, false);
    if (Zlz.Zu(paramZlvz.ZT))
      setTitle(paramZlvz.ZT); 
    Zm(paramZlvz);
    setName(a(22435, 27945));
    setResizable(false);
    ZB(paramZlvz);
  }
  
  private void ZB(Zlvz paramZlvz) {
    InputMap inputMap = getRootPane().getInputMap(2);
    ActionMap actionMap = getRootPane().getActionMap();
    if (paramZlvz.Zx.stream().filter(Zr7j::lambda$setupHotkeys$0).count() == 1L && paramZlvz.Zx.stream().filter(Zr7j::lambda$setupHotkeys$1).count() == 1L) {
      KeyStroke keyStroke1 = KeyStroke.getKeyStroke(a(22440, -10735));
      inputMap.put(keyStroke1, a(22433, 6522));
      actionMap.put(a(22437, 2086), new Zsly(this));
      KeyStroke keyStroke2 = KeyStroke.getKeyStroke(a(22438, 19024));
      inputMap.put(keyStroke2, a(22441, 6449));
      actionMap.put(a(22442, 13563), new Zzlu(this));
    } 
  }
  
  private void Zm(String paramString, boolean paramBoolean) {
    this.ZY = new Zt3(paramString, paramBoolean, (this.ZM != null && this.ZM.isSelected()));
    dispose();
  }
  
  public Zt3 Zj() {
    pack();
    setLocationRelativeTo(this.Zz);
    String[] arrayOfString = Zg();
    setVisible(true);
    if (Zbqc.Zwu() == null)
      Zu(new String[1]); 
    return this.ZY;
  }
  
  private void Zm(Zlvz paramZlvz) {
    // Byte code:
    //   0: new burp/Zbqc
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: invokestatic Zg : ()[Ljava/lang/String;
    //   12: new burp/Zm99
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore #5
    //   21: new burp/Zbqc
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: astore #6
    //   30: aload_0
    //   31: new burp/Zzdy
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: putfield ZM : Lburp/Zzdy;
    //   41: aload_0
    //   42: iconst_2
    //   43: invokevirtual setDefaultCloseOperation : (I)V
    //   46: aload #4
    //   48: bipush #30
    //   50: bipush #30
    //   52: bipush #20
    //   54: bipush #30
    //   56: invokestatic createEmptyBorder : (IIII)Ljavax/swing/border/Border;
    //   59: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   62: new java/awt/GridBagLayout
    //   65: dup
    //   66: invokespecial <init> : ()V
    //   69: astore #7
    //   71: astore_2
    //   72: aload #7
    //   74: aload_1
    //   75: getfield ZJ : Lburp/Ze9n;
    //   78: ifnonnull -> 100
    //   81: iconst_3
    //   82: newarray int
    //   84: dup
    //   85: iconst_0
    //   86: iconst_0
    //   87: iastore
    //   88: dup
    //   89: iconst_1
    //   90: bipush #10
    //   92: iastore
    //   93: dup
    //   94: iconst_2
    //   95: iconst_0
    //   96: iastore
    //   97: goto -> 125
    //   100: iconst_5
    //   101: newarray int
    //   103: dup
    //   104: iconst_0
    //   105: iconst_0
    //   106: iastore
    //   107: dup
    //   108: iconst_1
    //   109: bipush #10
    //   111: iastore
    //   112: dup
    //   113: iconst_2
    //   114: iconst_0
    //   115: iastore
    //   116: dup
    //   117: iconst_3
    //   118: bipush #10
    //   120: iastore
    //   121: dup
    //   122: iconst_4
    //   123: iconst_0
    //   124: iastore
    //   125: putfield columnWidths : [I
    //   128: aload #4
    //   130: aload #7
    //   132: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   135: aload_1
    //   136: getfield ZJ : Lburp/Ze9n;
    //   139: ifnonnull -> 146
    //   142: iconst_0
    //   143: goto -> 147
    //   146: iconst_2
    //   147: istore #8
    //   149: aload_1
    //   150: getfield ZJ : Lburp/Ze9n;
    //   153: ifnull -> 202
    //   156: new java/awt/GridBagConstraints
    //   159: dup
    //   160: invokespecial <init> : ()V
    //   163: astore_3
    //   164: aload_3
    //   165: iconst_0
    //   166: putfield gridx : I
    //   169: aload_3
    //   170: iconst_0
    //   171: putfield gridy : I
    //   174: aload_3
    //   175: iconst_2
    //   176: putfield fill : I
    //   179: aload_3
    //   180: bipush #23
    //   182: putfield anchor : I
    //   185: aload #4
    //   187: new burp/Zm99
    //   190: dup
    //   191: aload_1
    //   192: getfield ZJ : Lburp/Ze9n;
    //   195: invokespecial <init> : (Ljavax/swing/Icon;)V
    //   198: aload_3
    //   199: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   202: aload_1
    //   203: getfield Zm : Ljava/lang/String;
    //   206: invokestatic Zu : (Ljava/lang/String;)Z
    //   209: ifeq -> 280
    //   212: aload #5
    //   214: aload_1
    //   215: getfield Zm : Ljava/lang/String;
    //   218: invokevirtual setText : (Ljava/lang/String;)V
    //   221: aload #5
    //   223: getstatic burp/Zt00.TITLE_BOLD_FONT : Lburp/Zt00;
    //   226: invokevirtual ZE : (Lburp/Zt00;)V
    //   229: aload #5
    //   231: getstatic burp/Zlkk.BURP_TITLE : Lburp/Zlkk;
    //   234: invokevirtual Ze : (Lburp/Zlkk;)V
    //   237: new java/awt/GridBagConstraints
    //   240: dup
    //   241: invokespecial <init> : ()V
    //   244: astore_3
    //   245: aload_3
    //   246: iload #8
    //   248: putfield gridx : I
    //   251: aload_3
    //   252: iconst_0
    //   253: putfield gridy : I
    //   256: aload_3
    //   257: iconst_2
    //   258: putfield fill : I
    //   261: aload_3
    //   262: bipush #21
    //   264: putfield anchor : I
    //   267: aload_3
    //   268: dconst_1
    //   269: putfield weightx : D
    //   272: aload #4
    //   274: aload #5
    //   276: aload_3
    //   277: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   280: new java/awt/GridBagConstraints
    //   283: dup
    //   284: invokespecial <init> : ()V
    //   287: astore #9
    //   289: aload #9
    //   291: iconst_1
    //   292: putfield gridy : I
    //   295: aload #9
    //   297: bipush #23
    //   299: putfield anchor : I
    //   302: aload #4
    //   304: bipush #10
    //   306: invokestatic createVerticalStrut : (I)Ljava/awt/Component;
    //   309: aload #9
    //   311: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   314: iconst_2
    //   315: istore #10
    //   317: aload_1
    //   318: getfield Zk : Ljava/util/List;
    //   321: invokeinterface iterator : ()Ljava/util/Iterator;
    //   326: astore #11
    //   328: aload #11
    //   330: invokeinterface hasNext : ()Z
    //   335: ifeq -> 433
    //   338: aload #11
    //   340: invokeinterface next : ()Ljava/lang/Object;
    //   345: checkcast java/lang/String
    //   348: astore #12
    //   350: new burp/Zm99
    //   353: dup
    //   354: invokespecial <init> : ()V
    //   357: astore #13
    //   359: aload #13
    //   361: aload #12
    //   363: invokevirtual setText : (Ljava/lang/String;)V
    //   366: new java/awt/GridBagConstraints
    //   369: dup
    //   370: invokespecial <init> : ()V
    //   373: astore_3
    //   374: aload_3
    //   375: iload #8
    //   377: putfield gridx : I
    //   380: aload_3
    //   381: iload #10
    //   383: iinc #10, 1
    //   386: putfield gridy : I
    //   389: aload_3
    //   390: iconst_2
    //   391: putfield fill : I
    //   394: aload_3
    //   395: bipush #23
    //   397: putfield anchor : I
    //   400: aload_3
    //   401: dconst_1
    //   402: putfield weightx : D
    //   405: aload_3
    //   406: new java/awt/Insets
    //   409: dup
    //   410: bipush #10
    //   412: iconst_0
    //   413: iconst_0
    //   414: iconst_0
    //   415: invokespecial <init> : (IIII)V
    //   418: putfield insets : Ljava/awt/Insets;
    //   421: aload #4
    //   423: aload #13
    //   425: aload_3
    //   426: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   429: aload_2
    //   430: ifnonnull -> 328
    //   433: aload #6
    //   435: new java/awt/GridLayout
    //   438: dup
    //   439: iconst_1
    //   440: iconst_2
    //   441: bipush #10
    //   443: iconst_0
    //   444: invokespecial <init> : (IIII)V
    //   447: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   450: aload_1
    //   451: getfield Zf : Z
    //   454: ifeq -> 534
    //   457: aload_0
    //   458: getfield ZM : Lburp/Zzdy;
    //   461: sipush #22434
    //   464: sipush #17588
    //   467: invokestatic a : (II)Ljava/lang/String;
    //   470: invokevirtual setText : (Ljava/lang/String;)V
    //   473: aload_0
    //   474: getfield ZM : Lburp/Zzdy;
    //   477: bipush #9
    //   479: invokevirtual setIconTextGap : (I)V
    //   482: new java/awt/GridBagConstraints
    //   485: dup
    //   486: invokespecial <init> : ()V
    //   489: astore_3
    //   490: aload_3
    //   491: iload #8
    //   493: putfield gridx : I
    //   496: aload_3
    //   497: iload #10
    //   499: putfield gridy : I
    //   502: aload_3
    //   503: bipush #23
    //   505: putfield anchor : I
    //   508: aload_3
    //   509: new java/awt/Insets
    //   512: dup
    //   513: bipush #40
    //   515: iconst_0
    //   516: iconst_0
    //   517: iconst_0
    //   518: invokespecial <init> : (IIII)V
    //   521: putfield insets : Ljava/awt/Insets;
    //   524: aload #4
    //   526: aload_0
    //   527: getfield ZM : Lburp/Zzdy;
    //   530: aload_3
    //   531: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   534: aload_1
    //   535: getfield Zx : Ljava/util/List;
    //   538: invokeinterface isEmpty : ()Z
    //   543: ifeq -> 557
    //   546: aload_0
    //   547: aload_1
    //   548: aload #6
    //   550: invokevirtual ZL : (Lburp/Zlvz;Lburp/Zbqc;)V
    //   553: aload_2
    //   554: ifnonnull -> 564
    //   557: aload_0
    //   558: aload_1
    //   559: aload #6
    //   561: invokevirtual Zj : (Lburp/Zlvz;Lburp/Zbqc;)V
    //   564: new java/awt/GridBagConstraints
    //   567: dup
    //   568: invokespecial <init> : ()V
    //   571: astore_3
    //   572: aload_3
    //   573: iload #8
    //   575: putfield gridx : I
    //   578: aload_3
    //   579: iload #10
    //   581: putfield gridy : I
    //   584: aload_3
    //   585: bipush #24
    //   587: putfield anchor : I
    //   590: aload_3
    //   591: new java/awt/Insets
    //   594: dup
    //   595: bipush #40
    //   597: iconst_0
    //   598: iconst_0
    //   599: iconst_0
    //   600: invokespecial <init> : (IIII)V
    //   603: putfield insets : Ljava/awt/Insets;
    //   606: aload #4
    //   608: aload #6
    //   610: aload_3
    //   611: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   614: aload_0
    //   615: invokevirtual getContentPane : ()Ljava/awt/Container;
    //   618: aload #4
    //   620: sipush #22439
    //   623: sipush #21437
    //   626: invokestatic a : (II)Ljava/lang/String;
    //   629: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   632: aload_0
    //   633: invokevirtual pack : ()V
    //   636: return
  }
  
  private void Zj(Zlvz paramZlvz, Zbqc paramZbqc) {
    // Byte code:
    //   0: invokestatic Zg : ()[Ljava/lang/String;
    //   3: iconst_0
    //   4: istore #4
    //   6: astore_3
    //   7: iload #4
    //   9: aload_1
    //   10: getfield Zx : Ljava/util/List;
    //   13: invokeinterface size : ()I
    //   18: if_icmpge -> 140
    //   21: aload_1
    //   22: getfield Zx : Ljava/util/List;
    //   25: iload #4
    //   27: invokeinterface get : (I)Ljava/lang/Object;
    //   32: checkcast burp/Ztjb
    //   35: astore #5
    //   37: aload #5
    //   39: getfield Zp : Z
    //   42: ifeq -> 58
    //   45: new burp/Ze0q
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: astore #6
    //   54: aload_3
    //   55: ifnonnull -> 67
    //   58: new burp/Ze01
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: astore #6
    //   67: aload #5
    //   69: getfield Zz : Lburp/Ze9n;
    //   72: ifnull -> 85
    //   75: aload #6
    //   77: aload #5
    //   79: getfield Zz : Lburp/Ze9n;
    //   82: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   85: aload #5
    //   87: getfield Ze : Lburp/Zlkk;
    //   90: ifnull -> 103
    //   93: aload #6
    //   95: aload #5
    //   97: getfield Ze : Lburp/Zlkk;
    //   100: invokevirtual Zj : (Lburp/Zlkk;)V
    //   103: aload #6
    //   105: aload_0
    //   106: aload #5
    //   108: <illegal opcode> actionPerformed : (Lburp/Zr7j;Lburp/Ztjb;)Ljava/awt/event/ActionListener;
    //   113: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   116: aload #6
    //   118: aload #5
    //   120: getfield Za : Ljava/lang/String;
    //   123: invokevirtual setText : (Ljava/lang/String;)V
    //   126: aload_2
    //   127: aload #6
    //   129: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   132: pop
    //   133: iinc #4, 1
    //   136: aload_3
    //   137: ifnonnull -> 7
    //   140: return
  }
  
  private void ZL(Zlvz paramZlvz, Zbqc paramZbqc) {
    Ze0q ze0q = new Ze0q();
    ze0q.setText(paramZlvz.Zz);
    ze0q.addActionListener(this::lambda$createConfirmAndCancelButtons$3);
    ze0q.setName(a(22436, -19797));
    paramZbqc.add(ze0q);
    if (paramZlvz.Ze) {
      Ze01 ze01 = new Ze01();
      ze01.addActionListener(this::lambda$createConfirmAndCancelButtons$4);
      ze01.setText(paramZlvz.Zc);
      ze01.setName(a(22432, 3916));
      paramZbqc.add(ze01);
    } 
  }
  
  private void lambda$createConfirmAndCancelButtons$4(ActionEvent paramActionEvent) {
    Zm("", false);
  }
  
  private void lambda$createConfirmAndCancelButtons$3(ActionEvent paramActionEvent) {
    Zm("", true);
  }
  
  private void lambda$createCustomButtons$2(Ztjb paramZtjb, ActionEvent paramActionEvent) {
    Zm(paramZtjb.Za, paramZtjb.Zp);
  }
  
  private static boolean lambda$setupHotkeys$1(Ztjb paramZtjb) {
    return !paramZtjb.Zp;
  }
  
  private static boolean lambda$setupHotkeys$0(Ztjb paramZtjb) {
    return paramZtjb.Zp;
  }
  
  public static void Zu(String[] paramArrayOfString) {
    Zc = paramArrayOfString;
  }
  
  public static String[] Zg() {
    return Zc;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÌÉ¾844\\n§\ë2¾_]Ù]\\bADã·ßQ'ÑA\\rV¥ÏìW¶Lc[ÎÝ]±ºÖm GKþªGÆ;¥\Øg+®¶^}.f1³|E\\n$`¡H¾;ïÿ4¯{ô5­#9E:·þ5Æ,ês`Xð ]¦Bpt\\r!æ|rµôØ+ÉÇÊÓÐ|ÖÃ/,RÀf­ÝÃ '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_1
    //   19: anewarray java/lang/String
    //   22: bipush #30
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: invokestatic Zu : ([Ljava/lang/String;)V
    //   30: bipush #7
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc 'çÏx=7k·âut~Cì4¢îRñbî'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #14
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #34
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic burp/Zr7j.b : [Ljava/lang/String;
    //   139: bipush #11
    //   141: anewarray java/lang/String
    //   144: putstatic burp/Zr7j.c : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 268
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #11
    //   222: goto -> 252
    //   225: bipush #16
    //   227: goto -> 252
    //   230: bipush #46
    //   232: goto -> 252
    //   235: bipush #81
    //   237: goto -> 252
    //   240: bipush #21
    //   242: goto -> 252
    //   245: bipush #20
    //   247: goto -> 252
    //   250: bipush #54
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 173
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 169
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 47, 0 -> 106
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x57A0) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      char c = '­';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr7j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */