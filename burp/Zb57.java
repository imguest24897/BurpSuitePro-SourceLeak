package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.util.Objects;
import java.util.Optional;

public class Zb57 extends Zb5h {
  private final Zg85 Zd;
  
  private final Zg85 Zh;
  
  private final Zmis ZG;
  
  private final Zedd<Zi2> ZD;
  
  private final Zg85 Zm;
  
  private final String Zq;
  
  private final String Zn;
  
  private final String ZB;
  
  private final Zi2 ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb57(Zmis paramZmis, Component paramComponent, Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: aload_3
    //   3: invokespecial <init> : (Ljava/awt/Component;Ljava/lang/Runnable;)V
    //   6: aload_0
    //   7: aload_1
    //   8: putfield ZG : Lburp/Zmis;
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual Zo : ()Ljava/lang/String;
    //   16: putfield Zq : Ljava/lang/String;
    //   19: invokestatic ZX : ()[Ljava/lang/String;
    //   22: aload_0
    //   23: aload_1
    //   24: invokevirtual ZL : ()Ljava/lang/String;
    //   27: putfield Zn : Ljava/lang/String;
    //   30: aload_0
    //   31: aload_1
    //   32: invokevirtual Zk : ()Ljava/lang/String;
    //   35: putfield ZB : Ljava/lang/String;
    //   38: aload_0
    //   39: aload_1
    //   40: invokevirtual ZZ : ()Lburp/Zi2;
    //   43: putfield ZF : Lburp/Zi2;
    //   46: new java/awt/GridBagLayout
    //   49: dup
    //   50: invokespecial <init> : ()V
    //   53: astore #5
    //   55: aload #5
    //   57: bipush #9
    //   59: newarray int
    //   61: dup
    //   62: iconst_0
    //   63: iconst_0
    //   64: iastore
    //   65: dup
    //   66: iconst_1
    //   67: bipush #10
    //   69: iastore
    //   70: dup
    //   71: iconst_2
    //   72: iconst_0
    //   73: iastore
    //   74: dup
    //   75: iconst_3
    //   76: bipush #10
    //   78: iastore
    //   79: dup
    //   80: iconst_4
    //   81: iconst_0
    //   82: iastore
    //   83: dup
    //   84: iconst_5
    //   85: bipush #10
    //   87: iastore
    //   88: dup
    //   89: bipush #6
    //   91: iconst_0
    //   92: iastore
    //   93: dup
    //   94: bipush #7
    //   96: bipush #10
    //   98: iastore
    //   99: dup
    //   100: bipush #8
    //   102: iconst_0
    //   103: iastore
    //   104: putfield rowHeights : [I
    //   107: aload #5
    //   109: iconst_5
    //   110: newarray int
    //   112: dup
    //   113: iconst_0
    //   114: iconst_0
    //   115: iastore
    //   116: dup
    //   117: iconst_1
    //   118: bipush #20
    //   120: iastore
    //   121: dup
    //   122: iconst_2
    //   123: iconst_0
    //   124: iastore
    //   125: dup
    //   126: iconst_3
    //   127: bipush #20
    //   129: iastore
    //   130: dup
    //   131: iconst_4
    //   132: iconst_0
    //   133: iastore
    //   134: putfield columnWidths : [I
    //   137: aload_0
    //   138: aload #5
    //   140: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   143: aload_0
    //   144: new javax/swing/border/EmptyBorder
    //   147: dup
    //   148: bipush #10
    //   150: iconst_0
    //   151: iconst_0
    //   152: iconst_0
    //   153: invokespecial <init> : (IIII)V
    //   156: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   159: new java/awt/GridBagConstraints
    //   162: dup
    //   163: invokespecial <init> : ()V
    //   166: astore #6
    //   168: aload #6
    //   170: iconst_0
    //   171: putfield gridx : I
    //   174: aload #6
    //   176: iconst_0
    //   177: putfield gridy : I
    //   180: aload #6
    //   182: bipush #21
    //   184: putfield anchor : I
    //   187: astore #4
    //   189: new burp/Zm99
    //   192: dup
    //   193: sipush #-4521
    //   196: sipush #32217
    //   199: invokestatic a : (II)Ljava/lang/String;
    //   202: invokespecial <init> : (Ljava/lang/String;)V
    //   205: astore #7
    //   207: aload_0
    //   208: aload #7
    //   210: aload #6
    //   212: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   215: new java/awt/GridBagConstraints
    //   218: dup
    //   219: invokespecial <init> : ()V
    //   222: astore #6
    //   224: aload #6
    //   226: iconst_2
    //   227: putfield gridx : I
    //   230: aload #6
    //   232: iconst_0
    //   233: putfield gridy : I
    //   236: aload #6
    //   238: bipush #23
    //   240: putfield anchor : I
    //   243: new burp/Zm99
    //   246: dup
    //   247: sipush #-4527
    //   250: sipush #-32308
    //   253: invokestatic a : (II)Ljava/lang/String;
    //   256: invokespecial <init> : (Ljava/lang/String;)V
    //   259: astore #8
    //   261: aload_0
    //   262: new burp/Zedd
    //   265: dup
    //   266: invokespecial <init> : ()V
    //   269: putfield ZD : Lburp/Zedd;
    //   272: aload_0
    //   273: getfield ZD : Lburp/Zedd;
    //   276: sipush #-4517
    //   279: sipush #-7084
    //   282: invokestatic a : (II)Ljava/lang/String;
    //   285: invokevirtual setName : (Ljava/lang/String;)V
    //   288: invokestatic values : ()[Lburp/Zi2;
    //   291: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   294: aload_0
    //   295: getfield ZD : Lburp/Zedd;
    //   298: dup
    //   299: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   302: pop
    //   303: <illegal opcode> accept : (Lburp/Zedd;)Ljava/util/function/Consumer;
    //   308: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   313: aload_0
    //   314: getfield ZD : Lburp/Zedd;
    //   317: aload_0
    //   318: aload #8
    //   320: <illegal opcode> itemStateChanged : (Lburp/Zb57;Lburp/Zm99;)Ljava/awt/event/ItemListener;
    //   325: invokevirtual addItemListener : (Ljava/awt/event/ItemListener;)V
    //   328: aload_0
    //   329: aload_0
    //   330: getfield ZD : Lburp/Zedd;
    //   333: aload #6
    //   335: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   338: aload_0
    //   339: getfield ZD : Lburp/Zedd;
    //   342: aload_1
    //   343: invokevirtual ZZ : ()Lburp/Zi2;
    //   346: invokevirtual setSelectedItem : (Ljava/lang/Object;)V
    //   349: aload_0
    //   350: getfield ZD : Lburp/Zedd;
    //   353: aload_1
    //   354: invokevirtual ZS : ()Z
    //   357: ifne -> 368
    //   360: iconst_1
    //   361: goto -> 369
    //   364: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   367: athrow
    //   368: iconst_0
    //   369: invokevirtual setEnabled : (Z)V
    //   372: new java/awt/GridBagConstraints
    //   375: dup
    //   376: invokespecial <init> : ()V
    //   379: astore #6
    //   381: aload #6
    //   383: iconst_0
    //   384: putfield gridx : I
    //   387: aload #6
    //   389: iconst_2
    //   390: putfield gridy : I
    //   393: aload #6
    //   395: bipush #21
    //   397: putfield anchor : I
    //   400: new burp/Zm99
    //   403: dup
    //   404: sipush #-4518
    //   407: sipush #11775
    //   410: invokestatic a : (II)Ljava/lang/String;
    //   413: invokespecial <init> : (Ljava/lang/String;)V
    //   416: astore #9
    //   418: aload_0
    //   419: aload #9
    //   421: aload #6
    //   423: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   426: new java/awt/GridBagConstraints
    //   429: dup
    //   430: invokespecial <init> : ()V
    //   433: astore #6
    //   435: aload #6
    //   437: iconst_2
    //   438: putfield gridx : I
    //   441: aload #6
    //   443: iconst_2
    //   444: putfield gridy : I
    //   447: aload #6
    //   449: bipush #23
    //   451: putfield anchor : I
    //   454: aload_0
    //   455: new burp/Zg85
    //   458: dup
    //   459: bipush #30
    //   461: invokespecial <init> : (I)V
    //   464: putfield Zm : Lburp/Zg85;
    //   467: aload_0
    //   468: getfield Zm : Lburp/Zg85;
    //   471: sipush #-4525
    //   474: sipush #1923
    //   477: invokestatic a : (II)Ljava/lang/String;
    //   480: invokevirtual setName : (Ljava/lang/String;)V
    //   483: aload_0
    //   484: getfield Zm : Lburp/Zg85;
    //   487: aload_1
    //   488: invokevirtual ZS : ()Z
    //   491: ifne -> 502
    //   494: iconst_1
    //   495: goto -> 503
    //   498: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   501: athrow
    //   502: iconst_0
    //   503: invokevirtual setEnabled : (Z)V
    //   506: aload_0
    //   507: getfield Zm : Lburp/Zg85;
    //   510: aload_1
    //   511: invokevirtual ZS : ()Z
    //   514: ifne -> 525
    //   517: iconst_1
    //   518: goto -> 526
    //   521: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   524: athrow
    //   525: iconst_0
    //   526: invokevirtual setEditable : (Z)V
    //   529: aload_0
    //   530: getfield Zm : Lburp/Zg85;
    //   533: aload_1
    //   534: invokevirtual Zo : ()Ljava/lang/String;
    //   537: invokevirtual setText : (Ljava/lang/String;)V
    //   540: aload_0
    //   541: aload_0
    //   542: getfield Zm : Lburp/Zg85;
    //   545: aload #6
    //   547: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   550: new java/awt/GridBagConstraints
    //   553: dup
    //   554: invokespecial <init> : ()V
    //   557: astore #6
    //   559: aload #6
    //   561: iconst_0
    //   562: putfield gridx : I
    //   565: aload #6
    //   567: iconst_4
    //   568: putfield gridy : I
    //   571: aload #6
    //   573: bipush #21
    //   575: putfield anchor : I
    //   578: aload_0
    //   579: aload #8
    //   581: aload #6
    //   583: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   586: new java/awt/GridBagConstraints
    //   589: dup
    //   590: invokespecial <init> : ()V
    //   593: astore #6
    //   595: aload #6
    //   597: iconst_2
    //   598: putfield gridx : I
    //   601: aload #6
    //   603: iconst_4
    //   604: putfield gridy : I
    //   607: aload #6
    //   609: bipush #23
    //   611: putfield anchor : I
    //   614: aload_0
    //   615: new burp/Zg85
    //   618: dup
    //   619: bipush #30
    //   621: invokespecial <init> : (I)V
    //   624: putfield Zd : Lburp/Zg85;
    //   627: aload_0
    //   628: getfield Zd : Lburp/Zg85;
    //   631: sipush #-4520
    //   634: sipush #7774
    //   637: invokestatic a : (II)Ljava/lang/String;
    //   640: invokevirtual setName : (Ljava/lang/String;)V
    //   643: aload_0
    //   644: getfield Zd : Lburp/Zg85;
    //   647: aload_1
    //   648: invokevirtual ZL : ()Ljava/lang/String;
    //   651: invokevirtual setText : (Ljava/lang/String;)V
    //   654: aload_0
    //   655: getfield Zd : Lburp/Zg85;
    //   658: aload_1
    //   659: invokevirtual ZS : ()Z
    //   662: ifne -> 673
    //   665: iconst_1
    //   666: goto -> 674
    //   669: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   672: athrow
    //   673: iconst_0
    //   674: invokevirtual setEditable : (Z)V
    //   677: aload_0
    //   678: getfield Zd : Lburp/Zg85;
    //   681: aload_1
    //   682: invokevirtual ZS : ()Z
    //   685: ifne -> 696
    //   688: iconst_1
    //   689: goto -> 697
    //   692: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   695: athrow
    //   696: iconst_0
    //   697: invokevirtual setEnabled : (Z)V
    //   700: aload_0
    //   701: aload_0
    //   702: getfield Zd : Lburp/Zg85;
    //   705: aload #6
    //   707: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   710: new java/awt/GridBagConstraints
    //   713: dup
    //   714: invokespecial <init> : ()V
    //   717: astore #6
    //   719: aload #6
    //   721: iconst_0
    //   722: putfield gridx : I
    //   725: aload #6
    //   727: bipush #6
    //   729: putfield gridy : I
    //   732: aload #6
    //   734: bipush #21
    //   736: putfield anchor : I
    //   739: new burp/Zm99
    //   742: dup
    //   743: sipush #-4524
    //   746: sipush #29636
    //   749: invokestatic a : (II)Ljava/lang/String;
    //   752: invokespecial <init> : (Ljava/lang/String;)V
    //   755: astore #10
    //   757: aload_0
    //   758: aload #10
    //   760: aload #6
    //   762: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   765: new java/awt/GridBagConstraints
    //   768: dup
    //   769: invokespecial <init> : ()V
    //   772: astore #6
    //   774: aload #6
    //   776: iconst_2
    //   777: putfield gridx : I
    //   780: aload #6
    //   782: bipush #6
    //   784: putfield gridy : I
    //   787: aload #6
    //   789: bipush #23
    //   791: putfield anchor : I
    //   794: aload_0
    //   795: new burp/Zg85
    //   798: dup
    //   799: bipush #30
    //   801: invokespecial <init> : (I)V
    //   804: putfield Zh : Lburp/Zg85;
    //   807: aload_0
    //   808: getfield Zh : Lburp/Zg85;
    //   811: sipush #-4522
    //   814: sipush #-20113
    //   817: invokestatic a : (II)Ljava/lang/String;
    //   820: invokevirtual setName : (Ljava/lang/String;)V
    //   823: aload_0
    //   824: getfield Zh : Lburp/Zg85;
    //   827: aload_1
    //   828: invokevirtual Zk : ()Ljava/lang/String;
    //   831: invokevirtual setText : (Ljava/lang/String;)V
    //   834: aload_0
    //   835: aload_0
    //   836: getfield Zh : Lburp/Zg85;
    //   839: aload #6
    //   841: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   844: new java/awt/GridBagConstraints
    //   847: dup
    //   848: invokespecial <init> : ()V
    //   851: astore #6
    //   853: aload #6
    //   855: iconst_4
    //   856: putfield gridx : I
    //   859: aload #6
    //   861: iconst_0
    //   862: putfield gridy : I
    //   865: aload #6
    //   867: dconst_1
    //   868: putfield weightx : D
    //   871: aload #6
    //   873: iconst_2
    //   874: putfield fill : I
    //   877: aload_0
    //   878: invokestatic createHorizontalGlue : ()Ljava/awt/Component;
    //   881: aload #6
    //   883: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   886: new java/awt/GridBagConstraints
    //   889: dup
    //   890: invokespecial <init> : ()V
    //   893: astore #6
    //   895: aload #6
    //   897: iconst_0
    //   898: putfield gridx : I
    //   901: aload #6
    //   903: bipush #8
    //   905: putfield gridy : I
    //   908: aload #6
    //   910: dconst_1
    //   911: putfield weighty : D
    //   914: aload #6
    //   916: iconst_3
    //   917: putfield fill : I
    //   920: aload_0
    //   921: invokestatic createVerticalGlue : ()Ljava/awt/Component;
    //   924: aload #6
    //   926: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   929: aload #4
    //   931: ifnonnull -> 948
    //   934: iconst_4
    //   935: anewarray burp/Zbqc
    //   938: invokestatic Zr : ([Lburp/Zbqc;)V
    //   941: goto -> 948
    //   944: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   947: athrow
    //   948: return
    // Exception table:
    //   from	to	target	type
    //   261	364	364	java/lang/MatchException
    //   435	498	498	java/lang/MatchException
    //   503	521	521	java/lang/MatchException
    //   595	669	669	java/lang/MatchException
    //   674	692	692	java/lang/MatchException
    //   895	941	944	java/lang/MatchException
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = getMinimumSize();
    return new Dimension(dimension.width + 450, dimension.height + 178);
  }
  
  Optional<String> ZI() {
    try {
      if (this.Zh.getText().isEmpty())
        return Optional.of(a(-4519, 13354)); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return Optional.empty();
  }
  
  void Ze() {
    this.ZG.ZI((Zi2)this.ZD.getSelectedItem());
    this.ZG.ZF(this.Zm.getText());
    this.ZG.ZQ(this.Zd.getText());
    this.ZG.Zp(this.Zh.getText());
  }
  
  Zgi ZN() {
    return this.ZG;
  }
  
  boolean ZM() {
    try {
      if (this.Zm.getText().equals(this.Zq))
        try {
          if (this.Zd.getText().equals(this.Zn))
            try {
              if (this.Zh.getText().equals(this.ZB)) {
                try {
                  if (!Objects.equals(this.ZD.getSelectedItem(), this.ZF));
                } catch (MatchException matchException) {
                  throw a(null);
                } 
                return false;
              } 
            } catch (MatchException matchException) {
              throw a(null);
            }  
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  private void lambda$new$0(Zm99 paramZm99, ItemEvent paramItemEvent) {
    try {
      if (this.ZD.getSelectedItem() == null)
        return; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      switch (Zlxf.Zy[((Zi2)this.ZD.getSelectedItem()).ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    paramZm99.setText(a(-4528, -22111));
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'è§¤%/ðÞ ë£þó2<IM¾ÉK¡íÎ©(éîçxçodâVäôp]£Áö±¨5láU9X®û§lGzê½6iô?Ü>Uy*VïXk»b­öÆ «~÷Fü1Eñ*;øÇiD\\nãÀà¸m·|ºI¤~2\6+¿·ìÝzra\\bÀKPég\\tÌû,@ÐÅ§¿wpYµísüÅ+oÊZ×?BôækæWKÙT²uVÚ8@*)xS<\\b¶¸ ÛÙ\\bæÅY ±ty>òúÌÂÂì7¤'ßÂÉÓShs®³a4ÂAÁþ§÷!~*Æj¶¤¢è­|Àî§rÖAO'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #75
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
    //   68: ldc '&3WX.3Øvt$±A&+ é"ïÝDÀ ¤ú~O°_$Eî«oÔ¹Ð¨}õû¤É\\t'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #100
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
    //   128: putstatic burp/Zb57.a : [Ljava/lang/String;
    //   131: bipush #12
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zb57.b : [Ljava/lang/String;
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
    //   212: bipush #60
    //   214: goto -> 244
    //   217: bipush #86
    //   219: goto -> 244
    //   222: bipush #91
    //   224: goto -> 244
    //   227: bipush #119
    //   229: goto -> 244
    //   232: bipush #115
    //   234: goto -> 244
    //   237: bipush #20
    //   239: goto -> 244
    //   242: bipush #124
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
    int i = (paramInt1 ^ 0xFFFFEE50) & 0xFFFF;
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
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb57.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */