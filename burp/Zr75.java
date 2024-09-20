package burp;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import net.portswigger.Zfe;

public class Zr75 extends Zrh7 {
  private final Zsqp ZK;
  
  private Zb5h Ze;
  
  private final Ze01 ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zr75(Zl04 paramZl04, boolean paramBoolean, Zsqp paramZsqp) {
    this(paramZl04, paramBoolean, Zgi.Za(Zfe.BEARER, null, a(-7973, -7882), ""), paramZsqp);
  }
  
  public Zr75(Zl04 paramZl04, boolean paramBoolean, Zgi paramZgi, Zsqp paramZsqp) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_1
    //   3: getstatic burp/Zzv7.EDIT_API_AUTHENTICATION_DIALOG : Lburp/Zzv7;
    //   6: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   9: invokestatic ZX : ()[Ljava/lang/String;
    //   12: aload_0
    //   13: aload #4
    //   15: putfield ZK : Lburp/Zsqp;
    //   18: aload_0
    //   19: new burp/Ze0q
    //   22: dup
    //   23: sipush #-7970
    //   26: sipush #10502
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: invokespecial <init> : (Ljava/lang/String;)V
    //   35: putfield ZB : Lburp/Ze01;
    //   38: astore #5
    //   40: aload_0
    //   41: getfield ZB : Lburp/Ze01;
    //   44: sipush #-7983
    //   47: sipush #-32723
    //   50: invokestatic a : (II)Ljava/lang/String;
    //   53: invokevirtual setName : (Ljava/lang/String;)V
    //   56: iload_2
    //   57: ifeq -> 76
    //   60: sipush #-7984
    //   63: sipush #24557
    //   66: invokestatic a : (II)Ljava/lang/String;
    //   69: goto -> 85
    //   72: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   75: athrow
    //   76: sipush #-7981
    //   79: sipush #-14128
    //   82: invokestatic a : (II)Ljava/lang/String;
    //   85: astore #6
    //   87: aload_0
    //   88: aload #6
    //   90: invokevirtual setTitle : (Ljava/lang/String;)V
    //   93: new java/awt/GridBagLayout
    //   96: dup
    //   97: invokespecial <init> : ()V
    //   100: astore #7
    //   102: aload #7
    //   104: bipush #13
    //   106: newarray int
    //   108: dup
    //   109: iconst_0
    //   110: iconst_0
    //   111: iastore
    //   112: dup
    //   113: iconst_1
    //   114: bipush #15
    //   116: iastore
    //   117: dup
    //   118: iconst_2
    //   119: iconst_0
    //   120: iastore
    //   121: dup
    //   122: iconst_3
    //   123: bipush #20
    //   125: iastore
    //   126: dup
    //   127: iconst_4
    //   128: iconst_0
    //   129: iastore
    //   130: dup
    //   131: iconst_5
    //   132: bipush #10
    //   134: iastore
    //   135: dup
    //   136: bipush #6
    //   138: iconst_0
    //   139: iastore
    //   140: dup
    //   141: bipush #7
    //   143: bipush #15
    //   145: iastore
    //   146: dup
    //   147: bipush #8
    //   149: iconst_0
    //   150: iastore
    //   151: dup
    //   152: bipush #9
    //   154: bipush #15
    //   156: iastore
    //   157: dup
    //   158: bipush #10
    //   160: iconst_0
    //   161: iastore
    //   162: dup
    //   163: bipush #11
    //   165: bipush #15
    //   167: iastore
    //   168: dup
    //   169: bipush #12
    //   171: iconst_0
    //   172: iastore
    //   173: putfield rowHeights : [I
    //   176: aload #7
    //   178: iconst_5
    //   179: newarray int
    //   181: dup
    //   182: iconst_0
    //   183: iconst_0
    //   184: iastore
    //   185: dup
    //   186: iconst_1
    //   187: bipush #10
    //   189: iastore
    //   190: dup
    //   191: iconst_2
    //   192: iconst_0
    //   193: iastore
    //   194: dup
    //   195: iconst_3
    //   196: bipush #10
    //   198: iastore
    //   199: dup
    //   200: iconst_4
    //   201: iconst_0
    //   202: iastore
    //   203: putfield columnWidths : [I
    //   206: new burp/Zbqc
    //   209: dup
    //   210: invokespecial <init> : ()V
    //   213: astore #8
    //   215: aload #8
    //   217: aload #7
    //   219: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   222: aload #8
    //   224: new javax/swing/border/EmptyBorder
    //   227: dup
    //   228: bipush #40
    //   230: bipush #25
    //   232: bipush #25
    //   234: bipush #25
    //   236: invokespecial <init> : (IIII)V
    //   239: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   242: aload_0
    //   243: aload #8
    //   245: invokevirtual setContentPane : (Ljava/awt/Container;)V
    //   248: new java/awt/GridBagConstraints
    //   251: dup
    //   252: invokespecial <init> : ()V
    //   255: astore #9
    //   257: aload #9
    //   259: iconst_0
    //   260: putfield gridx : I
    //   263: aload #9
    //   265: iconst_0
    //   266: putfield gridy : I
    //   269: aload #9
    //   271: iconst_5
    //   272: putfield gridwidth : I
    //   275: aload #9
    //   277: bipush #23
    //   279: putfield anchor : I
    //   282: new burp/Zm99
    //   285: dup
    //   286: aload #6
    //   288: invokespecial <init> : (Ljava/lang/String;)V
    //   291: astore #10
    //   293: aload #10
    //   295: getstatic burp/Zt00.TITLE_BOLD_FONT : Lburp/Zt00;
    //   298: invokevirtual ZE : (Lburp/Zt00;)V
    //   301: aload #8
    //   303: aload #10
    //   305: aload #9
    //   307: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   310: new java/awt/GridBagConstraints
    //   313: dup
    //   314: invokespecial <init> : ()V
    //   317: astore #9
    //   319: aload #9
    //   321: iconst_0
    //   322: putfield gridx : I
    //   325: aload #9
    //   327: iconst_2
    //   328: putfield gridy : I
    //   331: aload #9
    //   333: iconst_5
    //   334: putfield gridwidth : I
    //   337: aload #9
    //   339: dconst_1
    //   340: putfield weightx : D
    //   343: aload #9
    //   345: iconst_2
    //   346: putfield fill : I
    //   349: aload #9
    //   351: bipush #10
    //   353: putfield anchor : I
    //   356: new burp/Zem9
    //   359: dup
    //   360: invokespecial <init> : ()V
    //   363: astore #11
    //   365: aload #8
    //   367: aload #11
    //   369: aload #9
    //   371: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   374: new java/awt/GridBagConstraints
    //   377: dup
    //   378: invokespecial <init> : ()V
    //   381: astore #9
    //   383: aload #9
    //   385: iconst_0
    //   386: putfield gridx : I
    //   389: aload #9
    //   391: iconst_4
    //   392: putfield gridy : I
    //   395: aload #9
    //   397: iconst_5
    //   398: putfield gridwidth : I
    //   401: aload #9
    //   403: bipush #23
    //   405: putfield anchor : I
    //   408: new burp/Zm99
    //   411: dup
    //   412: sipush #-7980
    //   415: sipush #-26844
    //   418: invokestatic a : (II)Ljava/lang/String;
    //   421: invokespecial <init> : (Ljava/lang/String;)V
    //   424: astore #12
    //   426: aload #8
    //   428: aload #12
    //   430: aload #9
    //   432: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   435: new java/awt/GridBagConstraints
    //   438: dup
    //   439: invokespecial <init> : ()V
    //   442: astore #9
    //   444: aload #9
    //   446: iconst_0
    //   447: putfield gridx : I
    //   450: aload #9
    //   452: bipush #6
    //   454: putfield gridy : I
    //   457: aload #9
    //   459: iconst_5
    //   460: putfield gridwidth : I
    //   463: aload #9
    //   465: bipush #23
    //   467: putfield anchor : I
    //   470: new burp/Zedd
    //   473: dup
    //   474: invokespecial <init> : ()V
    //   477: astore #13
    //   479: aload #13
    //   481: sipush #-7974
    //   484: sipush #-24765
    //   487: invokestatic a : (II)Ljava/lang/String;
    //   490: invokevirtual setName : (Ljava/lang/String;)V
    //   493: invokestatic values : ()[Lburp/Ztbo;
    //   496: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   499: aload #13
    //   501: dup
    //   502: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   505: pop
    //   506: <illegal opcode> accept : (Lburp/Zedd;)Ljava/util/function/Consumer;
    //   511: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   516: aload #13
    //   518: aload_3
    //   519: invokeinterface ZF : ()Lburp/Ztbo;
    //   524: invokevirtual setSelectedItem : (Ljava/lang/Object;)V
    //   527: aload #13
    //   529: iload_2
    //   530: invokevirtual setEnabled : (Z)V
    //   533: aload #8
    //   535: aload #13
    //   537: aload #9
    //   539: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   542: new java/awt/GridBagConstraints
    //   545: dup
    //   546: invokespecial <init> : ()V
    //   549: astore #9
    //   551: aload #9
    //   553: iconst_0
    //   554: putfield gridx : I
    //   557: aload #9
    //   559: bipush #8
    //   561: putfield gridy : I
    //   564: aload #9
    //   566: iconst_5
    //   567: putfield gridwidth : I
    //   570: aload #9
    //   572: dconst_1
    //   573: putfield weightx : D
    //   576: aload #9
    //   578: iconst_2
    //   579: putfield fill : I
    //   582: aload #9
    //   584: bipush #10
    //   586: putfield anchor : I
    //   589: new burp/Zem9
    //   592: dup
    //   593: invokespecial <init> : ()V
    //   596: astore #14
    //   598: aload #8
    //   600: aload #14
    //   602: aload #9
    //   604: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   607: new java/awt/GridBagConstraints
    //   610: dup
    //   611: invokespecial <init> : ()V
    //   614: astore #15
    //   616: aload #15
    //   618: iconst_0
    //   619: putfield gridx : I
    //   622: aload #15
    //   624: bipush #10
    //   626: putfield gridy : I
    //   629: aload #15
    //   631: iconst_5
    //   632: putfield gridwidth : I
    //   635: aload #15
    //   637: bipush #23
    //   639: putfield anchor : I
    //   642: aload #15
    //   644: dconst_1
    //   645: putfield weighty : D
    //   648: aload_0
    //   649: aload_0
    //   650: aload_3
    //   651: invokevirtual ZB : (Lburp/Zgi;)Lburp/Zb5h;
    //   654: putfield Ze : Lburp/Zb5h;
    //   657: aload #8
    //   659: aload_0
    //   660: getfield Ze : Lburp/Zb5h;
    //   663: aload #15
    //   665: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   668: aload #13
    //   670: aload_0
    //   671: aload #13
    //   673: aload #8
    //   675: aload #15
    //   677: <illegal opcode> itemStateChanged : (Lburp/Zr75;Lburp/Zedd;Lburp/Zbqc;Ljava/awt/GridBagConstraints;)Ljava/awt/event/ItemListener;
    //   682: invokevirtual addItemListener : (Ljava/awt/event/ItemListener;)V
    //   685: new java/awt/GridBagConstraints
    //   688: dup
    //   689: invokespecial <init> : ()V
    //   692: astore #9
    //   694: aload #9
    //   696: iconst_0
    //   697: putfield gridx : I
    //   700: aload #9
    //   702: bipush #12
    //   704: putfield gridy : I
    //   707: aload #9
    //   709: iconst_1
    //   710: putfield gridwidth : I
    //   713: aload #9
    //   715: dconst_1
    //   716: putfield weightx : D
    //   719: aload #9
    //   721: bipush #24
    //   723: putfield anchor : I
    //   726: aload #8
    //   728: invokestatic createHorizontalGlue : ()Ljava/awt/Component;
    //   731: aload #9
    //   733: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   736: new java/awt/GridBagConstraints
    //   739: dup
    //   740: invokespecial <init> : ()V
    //   743: astore #9
    //   745: aload #9
    //   747: iconst_2
    //   748: putfield gridx : I
    //   751: aload #9
    //   753: bipush #12
    //   755: putfield gridy : I
    //   758: aload #9
    //   760: iconst_1
    //   761: putfield gridwidth : I
    //   764: aload #9
    //   766: bipush #24
    //   768: putfield anchor : I
    //   771: new burp/Ze01
    //   774: dup
    //   775: sipush #-7971
    //   778: sipush #-4210
    //   781: invokestatic a : (II)Ljava/lang/String;
    //   784: invokespecial <init> : (Ljava/lang/String;)V
    //   787: astore #16
    //   789: aload #16
    //   791: sipush #-7978
    //   794: sipush #-559
    //   797: invokestatic a : (II)Ljava/lang/String;
    //   800: invokevirtual setName : (Ljava/lang/String;)V
    //   803: aload #16
    //   805: aload_0
    //   806: <illegal opcode> actionPerformed : (Lburp/Zr75;)Ljava/awt/event/ActionListener;
    //   811: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   814: aload #8
    //   816: aload #16
    //   818: aload #9
    //   820: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   823: new java/awt/GridBagConstraints
    //   826: dup
    //   827: invokespecial <init> : ()V
    //   830: astore #9
    //   832: aload #9
    //   834: iconst_4
    //   835: putfield gridx : I
    //   838: aload #9
    //   840: bipush #12
    //   842: putfield gridy : I
    //   845: aload #9
    //   847: iconst_1
    //   848: putfield gridwidth : I
    //   851: aload #9
    //   853: bipush #24
    //   855: putfield anchor : I
    //   858: aload_0
    //   859: invokevirtual ZB : ()V
    //   862: aload_0
    //   863: getfield ZB : Lburp/Ze01;
    //   866: aload_0
    //   867: <illegal opcode> actionPerformed : (Lburp/Zr75;)Ljava/awt/event/ActionListener;
    //   872: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   875: aload #8
    //   877: aload_0
    //   878: getfield ZB : Lburp/Ze01;
    //   881: aload #9
    //   883: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   886: aload_0
    //   887: invokevirtual pack : ()V
    //   890: aload_0
    //   891: aload #8
    //   893: invokevirtual getMinimumSize : ()Ljava/awt/Dimension;
    //   896: invokevirtual setMinimumSize : (Ljava/awt/Dimension;)V
    //   899: aload_0
    //   900: new burp/Zz3n
    //   903: dup
    //   904: aload_0
    //   905: invokespecial <init> : (Lburp/Zr75;)V
    //   908: invokevirtual addKeyListener : (Ljava/awt/event/KeyListener;)V
    //   911: invokestatic Zwu : ()[Lburp/Zbqc;
    //   914: ifnonnull -> 931
    //   917: iconst_3
    //   918: anewarray java/lang/String
    //   921: invokestatic Zv : ([Ljava/lang/String;)V
    //   924: goto -> 931
    //   927: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   930: athrow
    //   931: return
    // Exception table:
    //   from	to	target	type
    //   40	72	72	java/lang/MatchException
    //   832	924	927	java/lang/MatchException
  }
  
  private void Zi() {
    this.Ze.ZI().ifPresentOrElse(this::lambda$handleSave$3, this::Zu);
  }
  
  private void Zu() {
    this.Ze.Ze();
    Zlja zlja = this.ZK.ZW(this.Ze.ZN());
    String[] arrayOfString = Zb5h.ZX();
    try {
      if (zlja.ZwT()) {
        try {
          dispose();
          if (arrayOfString == null) {
            (new Zlvz(this)).Zf().Zv().ZS().ZC(a(-7975, -15423)).Zs((new Ze3m(Zeuf.WARNING, Zlkk.FOREGROUND)).ZU(Zmcx.EXTRA_LARGE_LINE_SIZE).Z_()).ZN(a(-7977, -15153)).ZM(a(-7982, 1007)).Z_(zlja.Zwi().Z_(Zra1.EXECUTION_MODE_DESKTOP).split("\n")).Zc().Zj();
            return;
          } 
        } catch (MatchException matchException) {
          throw a(null);
        } 
        return;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    (new Zlvz(this)).Zf().Zv().ZS().ZC(a(-7975, -15423)).Zs((new Ze3m(Zeuf.WARNING, Zlkk.FOREGROUND)).ZU(Zmcx.EXTRA_LARGE_LINE_SIZE).Z_()).ZN(a(-7977, -15153)).ZM(a(-7982, 1007)).Z_(zlja.Zwi().Z_(Zra1.EXECUTION_MODE_DESKTOP).split("\n")).Zc().Zj();
  }
  
  private Zb5h ZB(Zgi paramZgi) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5: pop
    //   6: astore_2
    //   7: iconst_0
    //   8: istore_3
    //   9: aload_2
    //   10: iload_3
    //   11: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   16: tableswitch default -> 48, 0 -> 62, 1 -> 87, 2 -> 112, 3 -> 137
    //   48: new java/lang/MatchException
    //   51: dup
    //   52: aconst_null
    //   53: aconst_null
    //   54: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   57: athrow
    //   58: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   61: athrow
    //   62: aload_2
    //   63: checkcast burp/Zmi1
    //   66: astore #4
    //   68: new burp/Zb5m
    //   71: dup
    //   72: aload #4
    //   74: aload_0
    //   75: aload_0
    //   76: <illegal opcode> run : (Lburp/Zr75;)Ljava/lang/Runnable;
    //   81: invokespecial <init> : (Lburp/Zmi1;Ljava/awt/Component;Ljava/lang/Runnable;)V
    //   84: goto -> 160
    //   87: aload_2
    //   88: checkcast burp/Zmi3
    //   91: astore #5
    //   93: new burp/Zb5v
    //   96: dup
    //   97: aload #5
    //   99: aload_0
    //   100: aload_0
    //   101: <illegal opcode> run : (Lburp/Zr75;)Ljava/lang/Runnable;
    //   106: invokespecial <init> : (Lburp/Zmi3;Ljava/awt/Component;Ljava/lang/Runnable;)V
    //   109: goto -> 160
    //   112: aload_2
    //   113: checkcast burp/Zmis
    //   116: astore #6
    //   118: new burp/Zb57
    //   121: dup
    //   122: aload #6
    //   124: aload_0
    //   125: aload_0
    //   126: <illegal opcode> run : (Lburp/Zr75;)Ljava/lang/Runnable;
    //   131: invokespecial <init> : (Lburp/Zmis;Ljava/awt/Component;Ljava/lang/Runnable;)V
    //   134: goto -> 160
    //   137: aload_2
    //   138: checkcast burp/Zmiu
    //   141: astore #7
    //   143: new java/lang/IllegalArgumentException
    //   146: dup
    //   147: sipush #-7972
    //   150: sipush #2297
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: invokespecial <init> : (Ljava/lang/String;)V
    //   159: athrow
    //   160: areturn
    // Exception table:
    //   from	to	target	type
    //   9	58	58	java/lang/MatchException
  }
  
  private void ZB() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZB : Lburp/Ze01;
    //   4: aload_0
    //   5: getfield Ze : Lburp/Zb5h;
    //   8: ifnull -> 36
    //   11: aload_0
    //   12: getfield Ze : Lburp/Zb5h;
    //   15: invokevirtual ZM : ()Z
    //   18: ifeq -> 36
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   27: athrow
    //   28: iconst_1
    //   29: goto -> 37
    //   32: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   35: athrow
    //   36: iconst_0
    //   37: invokevirtual setEnabled : (Z)V
    //   40: return
    // Exception table:
    //   from	to	target	type
    //   0	21	24	java/lang/MatchException
    //   11	32	32	java/lang/MatchException
  }
  
  private void lambda$handleSave$3(String paramString) {
    Object[] arrayOfObject = { a(-7969, 343), a(-7976, -28505) };
    int i = JOptionPane.showOptionDialog(this, paramString, a(-7979, 1638), 0, 2, null, arrayOfObject, arrayOfObject[0]);
    try {
      if (i == 0)
        Zu(); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  private void lambda$new$2(ActionEvent paramActionEvent) {
    Zi();
  }
  
  private void lambda$new$1(ActionEvent paramActionEvent) {
    dispose();
  }
  
  private void lambda$new$0(Zedd paramZedd, Zbqc paramZbqc, GridBagConstraints paramGridBagConstraints, ItemEvent paramItemEvent) {
    Object object = paramZedd.getSelectedItem();
    try {
      if (object == null)
        return; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zgi zgi = Zgi.Za(((Ztbo)object).ZN(), null, null, "");
    try {
      if (!zgi.ZY())
        return; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (this.Ze != null)
        paramZbqc.remove(this.Ze); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    this.Ze = ZB(zgi);
    ZB();
    paramZbqc.add(this.Ze, paramGridBagConstraints);
    Zmse.ZF(paramZbqc);
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '}ëiÚWâ¬~7v­@,4HÈ~FZ$5Fo)æc´P\\fóný$Ý<'«f\\te1¿Î"¤¬°Éjf¯à²ßP¹&kÁÑJP,¾Þåc\\nr¯8BõÞ'ÐÃkOÜ° 9üRHn)MQü¾]5ãÑLøÕfÆÇ^37"[¦~HÞFo´3Ò§Ç;²¾áÐß·G'ßlú¥bnbaÓF0´aâ\\r"Jö{;Arñ\_æbR,<{\\f÷½ Ø-}Lçé@"zñàì.%ÛÖg²×àÒ°ÎÁ§<K(!QâÛèY©0ëÑXAÁ%\\bÜ¢|òREfû(¾¾'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #28
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #22
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
    //   68: ldc 'ÞYðÈBÃ ²T«´újE^_D>1ÒMúËÌðã*\\r)|ÅÝW}VjöÚ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #40
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #109
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
    //   129: putstatic burp/Zr75.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zr75.b : [Ljava/lang/String;
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
    //   212: bipush #121
    //   214: goto -> 244
    //   217: bipush #67
    //   219: goto -> 244
    //   222: bipush #18
    //   224: goto -> 244
    //   227: bipush #73
    //   229: goto -> 244
    //   232: bipush #43
    //   234: goto -> 244
    //   237: bipush #84
    //   239: goto -> 244
    //   242: bipush #86
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
    int i = (paramInt1 ^ 0xFFFFE0D4) & 0xFFFF;
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
      byte b1 = 112;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr75.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */