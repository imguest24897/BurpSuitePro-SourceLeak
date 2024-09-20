package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbrm extends Zbg2 {
  private final Zrm3 ZV;
  
  private final List<? extends Zll9> Za;
  
  private final Zz28 Zw;
  
  private final Zbnt Zd;
  
  private final Zkl6 Zf;
  
  private final List<Zkgi> Zu;
  
  private List<Zkgi> ZI;
  
  private boolean Zv = true;
  
  private Zm99 Zm;
  
  private Zzdy Zr;
  
  private Zzdy Zy;
  
  private Zzdy ZQ;
  
  private Zzdy Zs;
  
  private Zg85 Zn;
  
  private Zl8w ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbrm(Zrm3 paramZrm3, List<? extends Zll9> paramList, Zz28 paramZz28, Zbnt paramZbnt, Zkl6 paramZkl6) {
    this.ZV = paramZrm3;
    this.Za = paramList;
    this.Zw = paramZz28;
    this.Zd = paramZbnt;
    this.Zf = paramZkl6;
    int i = Zrm3.Zy();
    this.Zu = new ArrayList<>();
    Zt();
    this.ZB = new String[] { a(27679, -20865), a(27660, -21099) };
    this.ZA = new boolean[] { true, false };
    this.Zh = 1;
    a(27662, -32169);
    this.ZC.setText(a(27662, -32169) + a(27662, -32169) + paramList.size() + a(27661, -22756) + ((paramList.size() == 1) ? "" : "s"));
    this.Zr.setText(a(27648, -12144));
    this.Zr.setEnabled(false);
    this.ZQ.setText(a(27673, -29189));
    this.ZQ.setEnabled(false);
    this.Zy.setText(a(27658, -8264));
    this.Zy.setEnabled(false);
    if (Zbqc.Zwu() == null)
      Zrm3.Zn(++i); 
  }
  
  public void Z_() {
    ZK(this.Za);
    Zi();
    this.ZA[1] = true;
    this.ZV.Zr(1, true);
  }
  
  private void ZK(List<? extends Zll9> paramList) {
    int i = Zrm3.Zy();
    for (Zll9 zll9 : paramList) {
      try {
        this.Zu.add(new Zkgi(this, zll9, this.Zd));
      } catch (Zlrq zlrq) {
        Zah.Zl(zlrq, Zk_.IGNORED);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      } 
      if (i == 0)
        break; 
    } 
  }
  
  private void Zi() {
    // Byte code:
    //   0: new java/util/HashSet
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zy : ()I
    //   13: iconst_0
    //   14: istore #4
    //   16: istore_1
    //   17: iconst_0
    //   18: istore #5
    //   20: aload_0
    //   21: getfield Zu : Ljava/util/List;
    //   24: invokeinterface iterator : ()Ljava/util/Iterator;
    //   29: astore #6
    //   31: aload #6
    //   33: invokeinterface hasNext : ()Z
    //   38: ifeq -> 164
    //   41: aload #6
    //   43: invokeinterface next : ()Ljava/lang/Object;
    //   48: checkcast burp/Zkgi
    //   51: astore #7
    //   53: aload #7
    //   55: getfield ZK : Lburp/Zz1p;
    //   58: ifnonnull -> 65
    //   61: iload_1
    //   62: ifne -> 31
    //   65: aload #7
    //   67: getfield ZK : Lburp/Zz1p;
    //   70: getfield Zo : Lburp/Zlit;
    //   73: aload #7
    //   75: getfield ZK : Lburp/Zz1p;
    //   78: getfield ZV : Ljava/util/List;
    //   81: aload_2
    //   82: iconst_1
    //   83: invokestatic ZZ : (Lburp/Zlit;Ljava/util/List;Ljava/util/Set;Z)Z
    //   86: ifeq -> 99
    //   89: iinc #3, 1
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload_0
    //   100: getfield Zw : Lburp/Zz28;
    //   103: aload #7
    //   105: getfield ZK : Lburp/Zz1p;
    //   108: getfield Zo : Lburp/Zlit;
    //   111: invokeinterface ZG : (Lburp/Zlit;)Z
    //   116: ifne -> 129
    //   119: iinc #4, 1
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: aload #7
    //   131: getfield Zx : I
    //   134: ifne -> 147
    //   137: iinc #5, 1
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: goto -> 160
    //   150: astore #8
    //   152: aload #8
    //   154: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   157: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   160: iload_1
    //   161: ifne -> 31
    //   164: aload_0
    //   165: getfield Zr : Lburp/Zzdy;
    //   168: iload_3
    //   169: aload_0
    //   170: getfield Zu : Ljava/util/List;
    //   173: invokeinterface size : ()I
    //   178: if_icmpne -> 197
    //   181: sipush #27675
    //   184: sipush #-3900
    //   187: invokestatic a : (II)Ljava/lang/String;
    //   190: goto -> 199
    //   193: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   196: athrow
    //   197: ldc ''
    //   199: iload_3
    //   200: iload_3
    //   201: iconst_1
    //   202: if_icmpne -> 214
    //   205: ldc ''
    //   207: goto -> 216
    //   210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: ldc 's'
    //   216: astore #9
    //   218: istore #10
    //   220: astore #11
    //   222: sipush #27678
    //   225: sipush #2156
    //   228: invokestatic a : (II)Ljava/lang/String;
    //   231: aload #11
    //   233: iload #10
    //   235: sipush #27659
    //   238: sipush #-30831
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: aload #9
    //   246: ldc ']'
    //   248: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   253: invokevirtual setText : (Ljava/lang/String;)V
    //   256: aload_0
    //   257: getfield Zr : Lburp/Zzdy;
    //   260: iload_3
    //   261: ifle -> 292
    //   264: iload_3
    //   265: aload_0
    //   266: getfield Zu : Ljava/util/List;
    //   269: invokeinterface size : ()I
    //   274: if_icmpge -> 292
    //   277: goto -> 284
    //   280: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   283: athrow
    //   284: iconst_1
    //   285: goto -> 293
    //   288: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   291: athrow
    //   292: iconst_0
    //   293: invokevirtual setEnabled : (Z)V
    //   296: aload_0
    //   297: getfield ZQ : Lburp/Zzdy;
    //   300: iload #4
    //   302: aload_0
    //   303: getfield Zu : Ljava/util/List;
    //   306: invokeinterface size : ()I
    //   311: if_icmpne -> 330
    //   314: sipush #27675
    //   317: sipush #-3900
    //   320: invokestatic a : (II)Ljava/lang/String;
    //   323: goto -> 332
    //   326: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   329: athrow
    //   330: ldc ''
    //   332: iload #4
    //   334: iload #4
    //   336: iconst_1
    //   337: if_icmpne -> 349
    //   340: ldc ''
    //   342: goto -> 351
    //   345: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   348: athrow
    //   349: ldc 's'
    //   351: astore #12
    //   353: istore #13
    //   355: astore #14
    //   357: sipush #27653
    //   360: sipush #17473
    //   363: invokestatic a : (II)Ljava/lang/String;
    //   366: aload #14
    //   368: iload #13
    //   370: sipush #27659
    //   373: sipush #-30831
    //   376: invokestatic a : (II)Ljava/lang/String;
    //   379: aload #12
    //   381: ldc ']'
    //   383: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   388: invokevirtual setText : (Ljava/lang/String;)V
    //   391: aload_0
    //   392: getfield ZQ : Lburp/Zzdy;
    //   395: iload #4
    //   397: ifle -> 429
    //   400: iload #4
    //   402: aload_0
    //   403: getfield Zu : Ljava/util/List;
    //   406: invokeinterface size : ()I
    //   411: if_icmpge -> 429
    //   414: goto -> 421
    //   417: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   420: athrow
    //   421: iconst_1
    //   422: goto -> 430
    //   425: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   428: athrow
    //   429: iconst_0
    //   430: invokevirtual setEnabled : (Z)V
    //   433: aload_0
    //   434: getfield Zy : Lburp/Zzdy;
    //   437: iload #5
    //   439: aload_0
    //   440: getfield Zu : Ljava/util/List;
    //   443: invokeinterface size : ()I
    //   448: if_icmpne -> 467
    //   451: sipush #27675
    //   454: sipush #-3900
    //   457: invokestatic a : (II)Ljava/lang/String;
    //   460: goto -> 469
    //   463: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   466: athrow
    //   467: ldc ''
    //   469: iload #5
    //   471: iload #5
    //   473: iconst_1
    //   474: if_icmpne -> 486
    //   477: ldc ''
    //   479: goto -> 488
    //   482: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   485: athrow
    //   486: ldc 's'
    //   488: astore #15
    //   490: istore #16
    //   492: astore #17
    //   494: sipush #27655
    //   497: sipush #16547
    //   500: invokestatic a : (II)Ljava/lang/String;
    //   503: aload #17
    //   505: iload #16
    //   507: sipush #27659
    //   510: sipush #-30831
    //   513: invokestatic a : (II)Ljava/lang/String;
    //   516: aload #15
    //   518: ldc ']'
    //   520: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   525: invokevirtual setText : (Ljava/lang/String;)V
    //   528: aload_0
    //   529: getfield Zy : Lburp/Zzdy;
    //   532: iload #5
    //   534: ifle -> 566
    //   537: iload #5
    //   539: aload_0
    //   540: getfield Zu : Ljava/util/List;
    //   543: invokeinterface size : ()I
    //   548: if_icmpge -> 566
    //   551: goto -> 558
    //   554: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   557: athrow
    //   558: iconst_1
    //   559: goto -> 567
    //   562: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   565: athrow
    //   566: iconst_0
    //   567: invokevirtual setEnabled : (Z)V
    //   570: aload_0
    //   571: getfield Zr : Lburp/Zzdy;
    //   574: invokevirtual isEnabled : ()Z
    //   577: ifeq -> 595
    //   580: aload_0
    //   581: getfield Zr : Lburp/Zzdy;
    //   584: iconst_1
    //   585: invokevirtual setSelected : (Z)V
    //   588: goto -> 595
    //   591: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   594: athrow
    //   595: aload_0
    //   596: invokevirtual Zk : ()V
    //   599: return
    // Exception table:
    //   from	to	target	type
    //   53	61	150	java/lang/Exception
    //   65	92	95	java/lang/Exception
    //   65	147	150	java/lang/Exception
    //   99	122	125	java/lang/Exception
    //   129	140	143	java/lang/Exception
    //   164	193	193	java/lang/Exception
    //   199	210	210	java/lang/Exception
    //   222	277	280	java/lang/Exception
    //   264	288	288	java/lang/Exception
    //   293	326	326	java/lang/Exception
    //   332	345	345	java/lang/Exception
    //   357	414	417	java/lang/Exception
    //   400	425	425	java/lang/Exception
    //   430	463	463	java/lang/Exception
    //   469	482	482	java/lang/Exception
    //   494	551	554	java/lang/Exception
    //   537	562	562	java/lang/Exception
    //   567	588	591	java/lang/Exception
  }
  
  private void Zk() {
    byte b1 = 0;
    String str1 = "," + this.Zn.getText().replace(" ", "").replace(".", "") + ",";
    str1 = str1.toLowerCase();
    Iterator<Zkgi> iterator = this.Zu.iterator();
    int i = Zrm3.Zy();
    while (iterator.hasNext()) {
      Zkgi zkgi = iterator.next();
      String str = zkgi.Zj.ZlL().Zd_();
      if (str != null && str1.contains("," + str.toLowerCase() + ","))
        b1++; 
      if (i == 0)
        break; 
    } 
    String str2 = (b1 == 1) ? "" : "s";
    byte b2 = b1;
    String str3 = (b1 == this.Zu.size()) ? a(27650, -32347) : "";
    this.Zs.setText(a(27651, -18463) + a(27651, -18463) + str3 + b2 + a(27659, -30831) + str2);
  }
  
  public Zsic Zn(int paramInt) {
    switch (paramInt) {
      case 0:
        return Zx6o.ZY(this.ZV.Zc(), a(27657, -21697)) ? null : this;
      case 1:
        return this.ZV.Ze(this);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  List<Zkgi> Zw() {
    // Byte code:
    //   0: invokestatic Zy : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zv : Z
    //   8: ifne -> 20
    //   11: aload_0
    //   12: getfield ZI : Ljava/util/List;
    //   15: areturn
    //   16: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   19: athrow
    //   20: aload_0
    //   21: new java/util/ArrayList
    //   24: dup
    //   25: aload_0
    //   26: getfield Zu : Ljava/util/List;
    //   29: invokespecial <init> : (Ljava/util/Collection;)V
    //   32: putfield ZI : Ljava/util/List;
    //   35: new java/util/HashSet
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: astore_2
    //   43: aload_0
    //   44: getfield Zn : Lburp/Zg85;
    //   47: invokevirtual getText : ()Ljava/lang/String;
    //   50: ldc ' '
    //   52: ldc ''
    //   54: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   57: ldc '.'
    //   59: ldc ''
    //   61: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   64: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   69: astore_3
    //   70: aload_3
    //   71: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   74: astore_3
    //   75: aload_0
    //   76: getfield ZI : Ljava/util/List;
    //   79: invokeinterface iterator : ()Ljava/util/Iterator;
    //   84: astore #4
    //   86: aload #4
    //   88: invokeinterface hasNext : ()Z
    //   93: ifeq -> 341
    //   96: aload #4
    //   98: invokeinterface next : ()Ljava/lang/Object;
    //   103: checkcast burp/Zkgi
    //   106: astore #5
    //   108: aload #5
    //   110: getfield ZK : Lburp/Zz1p;
    //   113: ifnonnull -> 120
    //   116: iload_1
    //   117: ifne -> 86
    //   120: aload_0
    //   121: getfield Zr : Lburp/Zzdy;
    //   124: invokevirtual isSelected : ()Z
    //   127: ifeq -> 172
    //   130: aload #5
    //   132: getfield ZK : Lburp/Zz1p;
    //   135: getfield Zo : Lburp/Zlit;
    //   138: aload #5
    //   140: getfield ZK : Lburp/Zz1p;
    //   143: getfield ZV : Ljava/util/List;
    //   146: aload_2
    //   147: iconst_1
    //   148: invokestatic ZZ : (Lburp/Zlit;Ljava/util/List;Ljava/util/Set;Z)Z
    //   151: ifeq -> 172
    //   154: goto -> 161
    //   157: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   160: athrow
    //   161: aload #4
    //   163: invokeinterface remove : ()V
    //   168: iload_1
    //   169: ifne -> 86
    //   172: aload_0
    //   173: getfield ZQ : Lburp/Zzdy;
    //   176: invokevirtual isSelected : ()Z
    //   179: ifeq -> 220
    //   182: aload_0
    //   183: getfield Zw : Lburp/Zz28;
    //   186: aload #5
    //   188: getfield ZK : Lburp/Zz1p;
    //   191: getfield Zo : Lburp/Zlit;
    //   194: invokeinterface ZG : (Lburp/Zlit;)Z
    //   199: ifne -> 220
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   208: athrow
    //   209: aload #4
    //   211: invokeinterface remove : ()V
    //   216: iload_1
    //   217: ifne -> 86
    //   220: aload_0
    //   221: getfield Zy : Lburp/Zzdy;
    //   224: invokevirtual isSelected : ()Z
    //   227: ifeq -> 256
    //   230: aload #5
    //   232: getfield Zx : I
    //   235: ifne -> 256
    //   238: goto -> 245
    //   241: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   244: athrow
    //   245: aload #4
    //   247: invokeinterface remove : ()V
    //   252: iload_1
    //   253: ifne -> 86
    //   256: aload_0
    //   257: getfield Zs : Lburp/Zzdy;
    //   260: invokevirtual isSelected : ()Z
    //   263: ifeq -> 324
    //   266: aload #5
    //   268: getfield ZK : Lburp/Zz1p;
    //   271: getfield Zo : Lburp/Zlit;
    //   274: invokeinterface Zd_ : ()Ljava/lang/String;
    //   279: astore #6
    //   281: aload #6
    //   283: ifnull -> 324
    //   286: aload_3
    //   287: aload #6
    //   289: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   292: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   297: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   300: ifeq -> 324
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   309: athrow
    //   310: aload #4
    //   312: invokeinterface remove : ()V
    //   317: goto -> 324
    //   320: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   323: athrow
    //   324: goto -> 337
    //   327: astore #6
    //   329: aload #6
    //   331: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   334: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   337: iload_1
    //   338: ifne -> 86
    //   341: aload_0
    //   342: iconst_0
    //   343: putfield Zv : Z
    //   346: aload_0
    //   347: getfield ZI : Ljava/util/List;
    //   350: areturn
    // Exception table:
    //   from	to	target	type
    //   4	16	16	java/lang/Exception
    //   108	116	327	java/lang/Exception
    //   120	154	157	java/lang/Exception
    //   120	168	327	java/lang/Exception
    //   172	202	205	java/lang/Exception
    //   172	216	327	java/lang/Exception
    //   220	238	241	java/lang/Exception
    //   220	252	327	java/lang/Exception
    //   256	324	327	java/lang/Exception
    //   281	303	306	java/lang/Exception
    //   286	317	320	java/lang/Exception
  }
  
  private void Zt() {
    this.Zr = new Zzdy();
    this.ZQ = new Zzdy();
    this.Zs = new Zzdy();
    this.Zn = new Zg85();
    this.ZC = new Zl8w();
    this.Zm = new Zm99();
    this.Zy = new Zzdy();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.Zr.setText(a(27663, 8046));
    this.Zr.addActionListener(this::Zw);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zr, gridBagConstraints);
    this.ZQ.setText(a(27656, -7545));
    this.ZQ.addActionListener(this::Zw);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    add(this.ZQ, gridBagConstraints);
    this.Zs.setText(a(27674, -18421));
    this.Zs.addActionListener(this::Zw);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    add(this.Zs, gridBagConstraints);
    this.Zn.setColumns(30);
    this.Zn.setText(a(27652, -14113));
    this.Zn.addKeyListener(new Zmvz(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zn, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZC, gridBagConstraints);
    this.Zm.setText(a(27654, 12087));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    add(this.Zm, gridBagConstraints);
    this.Zy.setText(a(27672, 23284));
    this.Zy.addActionListener(this::Zw);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    add(this.Zy, gridBagConstraints);
  }
  
  private void ZL(KeyEvent paramKeyEvent) {
    Zk();
    this.Zv = true;
  }
  
  private void Zw(ActionEvent paramActionEvent) {
    this.Zv = true;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'à¿bd*0\\rªµìfu¡¯9ðÃyô$N¦WtQõ\\tjÌf¾vè(Á/òGU)ç\\fÞ/Ì8nÚú\\¡*T*f ¤u^å¦*í½¿²]Vst82RæìEÔÌÉ¨³I»?ûWèâ\\fÔ{;Õ¬¢¯¢|Ëkx´ìÿcLI.s.01}7è¼9røêùb¦õ¬Â\\tsÓao¦EAð)×<\\fæj°Cû\\bÂb;äéÜÀ·Qg¾WòÔ«ùÅdEõÖ-¼Ö¹8,ñ|eë)YÍr¶k0eHba¬Ý¶¶p³zi|,ò¿À­!È§¹xmè¢nª0 jîVm·óL3¿,u±{rñ}ÝvÞ_îèôyfÊÙq?¸\\n-:)¤å:2»¸¿NM®åÜät6Ïgj/þ=Wë¿çç6_òÝÎ¥RíEãBýÝýOâ]J?'^Z1\\rÕ®Ïhh}d½é·+Wdç\\røJX ª1TAtÏDXu\\nkA7¬½ðj:¨£æãËOX¿k»uÊcÍÄ,ÀÑÌP¼j# ©Ià6R¹èZÂ¹Ä=¾uç·qI!åYç?»½S_3äC×5,£avD4~¹u{ñ1«.D¦&c.Jïÿ\\b:2nÙäa¸ÂO­tæMQõç¨\\tû\\tÆ)É­Ã±,0Nó5oí"å RáÀûömC?Û»_- ^uÇfÉím\\rM«ÓÐ½ûC±Õàµo*W¿±ãq&\\n,&6VÄ¢x¥,¹#RU1î½ì¨|Õ.FäIÊ´MÑóÊ7=µ´'t¸C<i¯ý7âZkSW Z·t{ÈÒHrÍRÐsaü¿·ÜE >aYÆo@°MM½îíùUf¥éÿ`)\\tÁ#Püì%Ñ¤pÄA\\f'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #94
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'æû Tã2t-CHû[j ­#¡Á"Ø'EHú%C»JÿmQìü T¬iB'}iS2\î'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #75
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
    //   128: putstatic burp/Zbrm.a : [Ljava/lang/String;
    //   131: bipush #22
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbrm.b : [Ljava/lang/String;
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
    //   212: bipush #92
    //   214: goto -> 244
    //   217: bipush #48
    //   219: goto -> 244
    //   222: bipush #48
    //   224: goto -> 244
    //   227: bipush #33
    //   229: goto -> 244
    //   232: bipush #98
    //   234: goto -> 244
    //   237: bipush #12
    //   239: goto -> 244
    //   242: bipush #101
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6C0B) & 0xFFFF;
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
      byte b1 = 110;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbrm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */