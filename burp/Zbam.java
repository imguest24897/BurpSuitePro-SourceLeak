package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

class Zbam extends Zbv5 implements ActionListener, Zt3u {
  private final Zt4u ZS;
  
  private final Zgb6 Zf;
  
  private final Zr1m Zo;
  
  private final Zzdy[] ZF;
  
  private final Zzdy[] ZO;
  
  private final List<Zeew> ZB;
  
  private final Set<String> ZY;
  
  private Zzdy Zb;
  
  private Zzdy ZP;
  
  private Zm99 ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbam(Zt4u paramZt4u, Zerg paramZerg, Zgb6 paramZgb6, Zr1m paramZr1m) {
    this.ZS = paramZt4u;
    this.Zf = paramZgb6;
    String str = Zbk_.Zb();
    this.Zo = paramZr1m;
    ZR();
    this.ZY = Set.of(Zjd(), a(32759, 3584), a(32754, -20614), a(32758, -13457), a(32760, -18538));
    setName(a(32755, 29491));
    this.Zb.addActionListener(this);
    this.ZP.addActionListener(this);
    byte b1 = 4;
    Objects.requireNonNull(paramZerg);
    this.ZB = (List<Zeew>)Zeew.Zk().stream().filter(paramZerg::ZU).collect(Collectors.toList());
    this.ZF = new Zzdy[this.ZB.size()];
    this.ZO = new Zzdy[this.ZB.size()];
    byte b2 = 0;
    while (b2 < this.ZB.size()) {
      Zm99 zm99 = new Zm99(((Zeew)this.ZB.get(b2)).toolName + ":");
      GridBagConstraints gridBagConstraints = new GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = b1;
      gridBagConstraints.anchor = 21;
      add(zm99, gridBagConstraints);
      this.ZF[b2] = new Zzdy(a(32767, 3692));
      gridBagConstraints.gridx = 2;
      add(this.ZF[b2], gridBagConstraints);
      this.ZF[b2].addActionListener(this);
      this.ZO[b2] = new Zzdy(a(32761, -16612));
      gridBagConstraints.gridx = 4;
      add(this.ZO[b2], gridBagConstraints);
      this.ZO[b2].addActionListener(this);
      b1 += 2;
      b2++;
      if (str == null)
        break; 
    } 
  }
  
  public String Zjd() {
    return a(32765, 7636);
  }
  
  public String ZjS() {
    return a(32757, -18329);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(a(32762, -32571), Zk97.DESKTOP_SETTINGS_PROJECT_LOGGING_LOGGING, this.Zo, new String[] { a(32764, 7848) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZY;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zb : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual getSource : ()Ljava/lang/Object;
    //   8: astore_3
    //   9: aload_3
    //   10: aload_0
    //   11: getfield Zb : Lburp/Zzdy;
    //   14: if_acmpeq -> 32
    //   17: aload_3
    //   18: aload_0
    //   19: getfield ZP : Lburp/Zzdy;
    //   22: if_acmpne -> 347
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   31: athrow
    //   32: aload_3
    //   33: aload_0
    //   34: getfield Zb : Lburp/Zzdy;
    //   37: if_acmpne -> 197
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   46: athrow
    //   47: aload_0
    //   48: getfield Zb : Lburp/Zzdy;
    //   51: invokevirtual isSelected : ()Z
    //   54: ifeq -> 170
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   63: athrow
    //   64: aload_0
    //   65: getfield ZP : Lburp/Zzdy;
    //   68: invokevirtual isSelected : ()Z
    //   71: ifeq -> 101
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   80: athrow
    //   81: aload_0
    //   82: getfield Zf : Lburp/Zgb6;
    //   85: invokeinterface Zft : ()V
    //   90: aload_2
    //   91: ifnonnull -> 820
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   100: athrow
    //   101: aload_0
    //   102: sipush #32752
    //   105: sipush #-7737
    //   108: invokestatic a : (II)Ljava/lang/String;
    //   111: invokevirtual Zl : (Ljava/lang/String;)Ljava/lang/String;
    //   114: astore #4
    //   116: aload #4
    //   118: ifnonnull -> 134
    //   121: aload_0
    //   122: getfield Zb : Lburp/Zzdy;
    //   125: iconst_0
    //   126: invokevirtual setSelected : (Z)V
    //   129: return
    //   130: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   133: athrow
    //   134: aload_0
    //   135: getfield Zf : Lburp/Zgb6;
    //   138: aload #4
    //   140: invokeinterface ZX : (Ljava/lang/String;)V
    //   145: goto -> 166
    //   148: astore #5
    //   150: aload #5
    //   152: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   155: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   158: aload_0
    //   159: getfield Zb : Lburp/Zzdy;
    //   162: iconst_0
    //   163: invokevirtual setSelected : (Z)V
    //   166: aload_2
    //   167: ifnonnull -> 820
    //   170: aload_0
    //   171: getfield Zf : Lburp/Zgb6;
    //   174: aconst_null
    //   175: invokeinterface ZX : (Ljava/lang/String;)V
    //   180: goto -> 820
    //   183: astore #4
    //   185: aload #4
    //   187: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   190: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   193: aload_2
    //   194: ifnonnull -> 820
    //   197: aload_0
    //   198: getfield ZP : Lburp/Zzdy;
    //   201: invokevirtual isSelected : ()Z
    //   204: ifeq -> 320
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   213: athrow
    //   214: aload_0
    //   215: getfield Zb : Lburp/Zzdy;
    //   218: invokevirtual isSelected : ()Z
    //   221: ifeq -> 251
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   230: athrow
    //   231: aload_0
    //   232: getfield Zf : Lburp/Zgb6;
    //   235: invokeinterface Zfc : ()V
    //   240: aload_2
    //   241: ifnonnull -> 820
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   250: athrow
    //   251: aload_0
    //   252: sipush #32756
    //   255: sipush #27680
    //   258: invokestatic a : (II)Ljava/lang/String;
    //   261: invokevirtual Zl : (Ljava/lang/String;)Ljava/lang/String;
    //   264: astore #4
    //   266: aload #4
    //   268: ifnonnull -> 284
    //   271: aload_0
    //   272: getfield ZP : Lburp/Zzdy;
    //   275: iconst_0
    //   276: invokevirtual setSelected : (Z)V
    //   279: return
    //   280: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   283: athrow
    //   284: aload_0
    //   285: getfield Zf : Lburp/Zgb6;
    //   288: aload #4
    //   290: invokeinterface Zn : (Ljava/lang/String;)V
    //   295: goto -> 316
    //   298: astore #5
    //   300: aload #5
    //   302: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   305: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   308: aload_0
    //   309: getfield ZP : Lburp/Zzdy;
    //   312: iconst_0
    //   313: invokevirtual setSelected : (Z)V
    //   316: aload_2
    //   317: ifnonnull -> 820
    //   320: aload_0
    //   321: getfield Zf : Lburp/Zgb6;
    //   324: aconst_null
    //   325: invokeinterface Zn : (Ljava/lang/String;)V
    //   330: goto -> 820
    //   333: astore #4
    //   335: aload #4
    //   337: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   340: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   343: aload_2
    //   344: ifnonnull -> 820
    //   347: iconst_m1
    //   348: istore #4
    //   350: iconst_0
    //   351: istore #5
    //   353: iload #5
    //   355: aload_0
    //   356: getfield ZB : Ljava/util/List;
    //   359: invokeinterface size : ()I
    //   364: if_icmpge -> 415
    //   367: aload_3
    //   368: aload_0
    //   369: getfield ZF : [Lburp/Zzdy;
    //   372: iload #5
    //   374: aaload
    //   375: if_acmpeq -> 396
    //   378: aload_3
    //   379: aload_0
    //   380: getfield ZO : [Lburp/Zzdy;
    //   383: iload #5
    //   385: aaload
    //   386: if_acmpne -> 404
    //   389: goto -> 396
    //   392: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   395: athrow
    //   396: iload #5
    //   398: istore #4
    //   400: aload_2
    //   401: ifnonnull -> 415
    //   404: iload #5
    //   406: iconst_1
    //   407: iadd
    //   408: i2b
    //   409: istore #5
    //   411: aload_2
    //   412: ifnonnull -> 353
    //   415: aload_3
    //   416: aload_0
    //   417: getfield ZF : [Lburp/Zzdy;
    //   420: iload #4
    //   422: aaload
    //   423: if_acmpne -> 628
    //   426: aload_0
    //   427: getfield ZF : [Lburp/Zzdy;
    //   430: iload #4
    //   432: aaload
    //   433: invokevirtual isSelected : ()Z
    //   436: ifeq -> 588
    //   439: goto -> 446
    //   442: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   445: athrow
    //   446: aload_0
    //   447: getfield ZO : [Lburp/Zzdy;
    //   450: iload #4
    //   452: aaload
    //   453: invokevirtual isSelected : ()Z
    //   456: ifeq -> 500
    //   459: goto -> 466
    //   462: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   465: athrow
    //   466: aload_0
    //   467: getfield Zf : Lburp/Zgb6;
    //   470: aload_0
    //   471: getfield ZB : Ljava/util/List;
    //   474: iload #4
    //   476: invokeinterface get : (I)Ljava/lang/Object;
    //   481: checkcast burp/Zeew
    //   484: invokeinterface ZL : (Lburp/Zeew;)V
    //   489: aload_2
    //   490: ifnonnull -> 820
    //   493: goto -> 500
    //   496: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   499: athrow
    //   500: aload_0
    //   501: sipush #32756
    //   504: sipush #27680
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: invokevirtual Zl : (Ljava/lang/String;)Ljava/lang/String;
    //   513: astore #5
    //   515: aload #5
    //   517: ifnonnull -> 536
    //   520: aload_0
    //   521: getfield ZF : [Lburp/Zzdy;
    //   524: iload #4
    //   526: aaload
    //   527: iconst_0
    //   528: invokevirtual setSelected : (Z)V
    //   531: return
    //   532: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   535: athrow
    //   536: aload_0
    //   537: getfield Zf : Lburp/Zgb6;
    //   540: aload_0
    //   541: getfield ZB : Ljava/util/List;
    //   544: iload #4
    //   546: invokeinterface get : (I)Ljava/lang/Object;
    //   551: checkcast burp/Zeew
    //   554: aload #5
    //   556: invokeinterface ZM : (Lburp/Zeew;Ljava/lang/String;)V
    //   561: goto -> 585
    //   564: astore #6
    //   566: aload #6
    //   568: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   571: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   574: aload_0
    //   575: getfield ZF : [Lburp/Zzdy;
    //   578: iload #4
    //   580: aaload
    //   581: iconst_0
    //   582: invokevirtual setSelected : (Z)V
    //   585: goto -> 820
    //   588: aload_0
    //   589: getfield Zf : Lburp/Zgb6;
    //   592: aload_0
    //   593: getfield ZB : Ljava/util/List;
    //   596: iload #4
    //   598: invokeinterface get : (I)Ljava/lang/Object;
    //   603: checkcast burp/Zeew
    //   606: aconst_null
    //   607: invokeinterface ZM : (Lburp/Zeew;Ljava/lang/String;)V
    //   612: goto -> 820
    //   615: astore #5
    //   617: aload #5
    //   619: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   622: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   625: goto -> 820
    //   628: aload_0
    //   629: getfield ZO : [Lburp/Zzdy;
    //   632: iload #4
    //   634: aaload
    //   635: invokevirtual isSelected : ()Z
    //   638: ifeq -> 783
    //   641: aload_0
    //   642: getfield ZF : [Lburp/Zzdy;
    //   645: iload #4
    //   647: aaload
    //   648: invokevirtual isSelected : ()Z
    //   651: ifeq -> 695
    //   654: goto -> 661
    //   657: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   660: athrow
    //   661: aload_0
    //   662: getfield Zf : Lburp/Zgb6;
    //   665: aload_0
    //   666: getfield ZB : Ljava/util/List;
    //   669: iload #4
    //   671: invokeinterface get : (I)Ljava/lang/Object;
    //   676: checkcast burp/Zeew
    //   679: invokeinterface ZT : (Lburp/Zeew;)V
    //   684: aload_2
    //   685: ifnonnull -> 820
    //   688: goto -> 695
    //   691: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   694: athrow
    //   695: aload_0
    //   696: sipush #32756
    //   699: sipush #27680
    //   702: invokestatic a : (II)Ljava/lang/String;
    //   705: invokevirtual Zl : (Ljava/lang/String;)Ljava/lang/String;
    //   708: astore #5
    //   710: aload #5
    //   712: ifnonnull -> 731
    //   715: aload_0
    //   716: getfield ZO : [Lburp/Zzdy;
    //   719: iload #4
    //   721: aaload
    //   722: iconst_0
    //   723: invokevirtual setSelected : (Z)V
    //   726: return
    //   727: invokestatic a : (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
    //   730: athrow
    //   731: aload_0
    //   732: getfield Zf : Lburp/Zgb6;
    //   735: aload_0
    //   736: getfield ZB : Ljava/util/List;
    //   739: iload #4
    //   741: invokeinterface get : (I)Ljava/lang/Object;
    //   746: checkcast burp/Zeew
    //   749: aload #5
    //   751: invokeinterface ZU : (Lburp/Zeew;Ljava/lang/String;)V
    //   756: goto -> 780
    //   759: astore #6
    //   761: aload #6
    //   763: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   766: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   769: aload_0
    //   770: getfield ZO : [Lburp/Zzdy;
    //   773: iload #4
    //   775: aaload
    //   776: iconst_0
    //   777: invokevirtual setSelected : (Z)V
    //   780: goto -> 820
    //   783: aload_0
    //   784: getfield Zf : Lburp/Zgb6;
    //   787: aload_0
    //   788: getfield ZB : Ljava/util/List;
    //   791: iload #4
    //   793: invokeinterface get : (I)Ljava/lang/Object;
    //   798: checkcast burp/Zeew
    //   801: aconst_null
    //   802: invokeinterface ZU : (Lburp/Zeew;Ljava/lang/String;)V
    //   807: goto -> 820
    //   810: astore #5
    //   812: aload #5
    //   814: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   817: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   820: aload_0
    //   821: invokevirtual Zt2 : ()V
    //   824: return
    // Exception table:
    //   from	to	target	type
    //   9	25	28	java/io/FileNotFoundException
    //   17	40	43	java/io/FileNotFoundException
    //   32	57	60	java/io/FileNotFoundException
    //   47	74	77	java/io/FileNotFoundException
    //   64	94	97	java/io/FileNotFoundException
    //   116	130	130	java/io/FileNotFoundException
    //   134	145	148	java/io/FileNotFoundException
    //   170	180	183	java/io/FileNotFoundException
    //   185	207	210	java/io/FileNotFoundException
    //   197	224	227	java/io/FileNotFoundException
    //   214	244	247	java/io/FileNotFoundException
    //   266	280	280	java/io/FileNotFoundException
    //   284	295	298	java/io/FileNotFoundException
    //   320	330	333	java/io/FileNotFoundException
    //   367	389	392	java/io/FileNotFoundException
    //   415	439	442	java/io/FileNotFoundException
    //   426	459	462	java/io/FileNotFoundException
    //   446	493	496	java/io/FileNotFoundException
    //   515	532	532	java/io/FileNotFoundException
    //   536	561	564	java/io/FileNotFoundException
    //   588	612	615	java/io/FileNotFoundException
    //   628	654	657	java/io/FileNotFoundException
    //   641	688	691	java/io/FileNotFoundException
    //   710	727	727	java/io/FileNotFoundException
    //   731	756	759	java/io/FileNotFoundException
    //   783	807	810	java/io/FileNotFoundException
  }
  
  private String Zl(String paramString) {
    File file = Zs6n.Zp(Zg1m.DATA, this.ZS, this, 1, paramString);
    return (file == null) ? null : file.getAbsolutePath();
  }
  
  public void Zt2() {
    String str = Zbk_.Zb();
    boolean bool1 = (this.Zf.ZY(null) != null) ? true : false;
    boolean bool2 = (this.Zf.Zr((Zeew)null) != null) ? true : false;
    this.Zb.setSelected(bool1);
    this.ZP.setSelected(bool2);
    byte b = 0;
    while (b < this.ZB.size()) {
      this.ZF[b].setEnabled(!bool1);
      this.ZF[b].setSelected((this.Zf.ZY(this.ZB.get(b)) != null));
      b = (byte)(b + 1);
      if (str == null)
        break; 
    } 
    b = 0;
    while (b < this.ZB.size()) {
      this.ZO[b].setEnabled(!bool2);
      this.ZO[b].setSelected((this.Zf.Zr(this.ZB.get(b)) != null));
      b = (byte)(b + 1);
      if (str == null)
        break; 
    } 
  }
  
  private void ZR() {
    this.Zb = new Zzdy();
    this.ZP = new Zzdy();
    this.ZI = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zb.setText(a(32753, 27088));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 0, 0, 10);
    add(this.Zb, gridBagConstraints);
    this.ZP.setText(a(32766, 26681));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZP, gridBagConstraints);
    this.ZI.setText(a(32763, 10727));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 0, 0, 30);
    add(this.ZI, gridBagConstraints);
  }
  
  private static FileNotFoundException a(FileNotFoundException paramFileNotFoundException) {
    return paramFileNotFoundException;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Æñ&,æCÛçÆñëì\\ttý(b'ãéR£93\\nöæÃ¼BîêòJ¡@Ã@PwÖ¹bQ",%7Ð^^Ä{¨+X²\\t³È}iGñ\\b´^çÖi@§§\\n@£ý¡µ] ê{Íµ5Â\\båÍ,)#¸Ob×:tLä8ÂókXNç6ßí}Áæ´kÿß£P*ßO_kD°R>jRjÒÑHD¡_*Î^7l@«3bÛ0`U_j²®ôD;°2ÝeV<6DP×ËLñ9"æ¬iXå¿2Däaûí¤ã5h+?Þ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #53
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
    //   68: ldc 'Ö!ñLvb²ª²\\r+vZÓ\\brAô=uÍ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #15
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_5
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
    //   128: putstatic burp/Zbam.a : [Ljava/lang/String;
    //   131: bipush #16
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbam.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
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
    //   212: bipush #30
    //   214: goto -> 243
    //   217: bipush #97
    //   219: goto -> 243
    //   222: bipush #72
    //   224: goto -> 243
    //   227: bipush #30
    //   229: goto -> 243
    //   232: bipush #53
    //   234: goto -> 243
    //   237: bipush #98
    //   239: goto -> 243
    //   242: iconst_2
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7FF8) & 0xFFFF;
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
      byte b1 = 104;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbam.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */