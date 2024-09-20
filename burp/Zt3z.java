package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.InputEvent;
import java.util.List;

public class Zt3z {
  private final Zkkp ZN;
  
  private final Zerg Zz;
  
  private final Zz28 ZJ;
  
  private final Zbiv ZP;
  
  private final Zgso Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zt3z(Zkkp paramZkkp, Zerg paramZerg, Zz28 paramZz28, Zbiv paramZbiv, Zgso paramZgso) {
    this.ZN = paramZkkp;
    this.Zz = paramZerg;
    this.ZJ = paramZz28;
    this.ZP = paramZbiv;
    this.Zx = paramZgso;
  }
  
  void ZW(List<Zto7> paramList, InputEvent paramInputEvent, Component paramComponent, Point paramPoint) {
    // Byte code:
    //   0: invokestatic Z_ : ()I
    //   3: istore #5
    //   5: aload_1
    //   6: ifnull -> 18
    //   9: aload_1
    //   10: invokeinterface isEmpty : ()Z
    //   15: ifeq -> 19
    //   18: return
    //   19: aload_1
    //   20: iconst_0
    //   21: invokeinterface get : (I)Ljava/lang/Object;
    //   26: checkcast burp/Zto7
    //   29: astore #6
    //   31: new burp/Zlbs
    //   34: dup
    //   35: aload_0
    //   36: getfield ZN : Lburp/Zkkp;
    //   39: aload_1
    //   40: aload_3
    //   41: invokespecial <init> : (Lburp/Zkkp;Ljava/util/List;Ljava/awt/Component;)V
    //   44: astore #7
    //   46: aload_1
    //   47: invokeinterface size : ()I
    //   52: istore #8
    //   54: iload #8
    //   56: iconst_1
    //   57: if_icmple -> 64
    //   60: iconst_1
    //   61: goto -> 65
    //   64: iconst_0
    //   65: istore #9
    //   67: iload #9
    //   69: ifne -> 78
    //   72: aload #6
    //   74: ifnonnull -> 78
    //   77: return
    //   78: iload #9
    //   80: ifeq -> 91
    //   83: iload #8
    //   85: invokestatic ZA : (I)Lburp/Zkj9;
    //   88: goto -> 106
    //   91: aload #6
    //   93: invokeinterface ZlL : ()Lburp/Zlit;
    //   98: invokeinterface toString : ()Ljava/lang/String;
    //   103: invokestatic ZR : (Ljava/lang/String;)Lburp/Zkj9;
    //   106: astore #10
    //   108: iload #9
    //   110: ifeq -> 144
    //   113: aload #10
    //   115: aload #7
    //   117: ldc 133408
    //   119: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   122: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   125: pop
    //   126: aload #10
    //   128: aload #7
    //   130: ldc 133440
    //   132: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   135: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   138: pop
    //   139: iload #5
    //   141: ifeq -> 194
    //   144: aload_0
    //   145: getfield ZJ : Lburp/Zz28;
    //   148: aload #6
    //   150: invokeinterface ZlL : ()Lburp/Zlit;
    //   155: invokeinterface ZG : (Lburp/Zlit;)Z
    //   160: ifeq -> 181
    //   163: aload #10
    //   165: aload #7
    //   167: ldc 133440
    //   169: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   172: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   175: pop
    //   176: iload #5
    //   178: ifeq -> 194
    //   181: aload #10
    //   183: aload #7
    //   185: ldc 133408
    //   187: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   190: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   193: pop
    //   194: aload #10
    //   196: new javax/swing/JSeparator
    //   199: dup
    //   200: invokespecial <init> : ()V
    //   203: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   206: pop
    //   207: new burp/Zx_n
    //   210: dup
    //   211: aload_1
    //   212: invokespecial <init> : (Ljava/util/List;)V
    //   215: astore #11
    //   217: aload_0
    //   218: getfield ZP : Lburp/Zbiv;
    //   221: aload #10
    //   223: aload #11
    //   225: dup
    //   226: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   229: pop
    //   230: <illegal opcode> accept : (Lburp/Zx_n;)Ljava/util/function/Consumer;
    //   235: aload #7
    //   237: invokevirtual ZA : (Lburp/Zkj9;Ljava/util/function/Consumer;Lburp/Zzyl;)V
    //   240: aload #10
    //   242: new javax/swing/JSeparator
    //   245: dup
    //   246: invokespecial <init> : ()V
    //   249: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   252: pop
    //   253: iload #9
    //   255: ifne -> 577
    //   258: aload_0
    //   259: getfield Zz : Lburp/Zerg;
    //   262: invokevirtual Zg : ()Lburp/Zr00;
    //   265: ifnull -> 281
    //   268: aload #10
    //   270: aload #7
    //   272: ldc 131584
    //   274: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   277: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   280: pop
    //   281: aload_0
    //   282: getfield Zz : Lburp/Zerg;
    //   285: invokevirtual Zm : ()Lburp/Zx_a;
    //   288: ifnull -> 304
    //   291: aload #10
    //   293: aload #7
    //   295: ldc 131328
    //   297: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   300: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   303: pop
    //   304: aload_0
    //   305: getfield Zz : Lburp/Zerg;
    //   308: invokevirtual ZK : ()Lburp/Zbui;
    //   311: ifnull -> 327
    //   314: aload #10
    //   316: aload #7
    //   318: ldc 133120
    //   320: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   323: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   326: pop
    //   327: aload_0
    //   328: getfield Zz : Lburp/Zerg;
    //   331: invokevirtual Ze : ()Lburp/Zeu0;
    //   334: ifnull -> 350
    //   337: aload #10
    //   339: aload #7
    //   341: ldc 132992
    //   343: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   346: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   349: pop
    //   350: aload_0
    //   351: getfield Zz : Lburp/Zerg;
    //   354: invokevirtual ZM : ()Lburp/Zgvn;
    //   357: ifnull -> 388
    //   360: aload_0
    //   361: getfield Zz : Lburp/Zerg;
    //   364: invokevirtual ZM : ()Lburp/Zgvn;
    //   367: invokeinterface ZR : ()Z
    //   372: ifeq -> 388
    //   375: aload #10
    //   377: aload #7
    //   379: ldc 133008
    //   381: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   384: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   387: pop
    //   388: aload_0
    //   389: getfield Zz : Lburp/Zerg;
    //   392: invokevirtual ZH : ()Lburp/Zg_j;
    //   395: ifnull -> 479
    //   398: aload #6
    //   400: invokeinterface ZoO : ()Lburp/Zstu;
    //   405: ifnonnull -> 435
    //   408: aload #10
    //   410: aload #7
    //   412: ldc 132672
    //   414: sipush #11905
    //   417: sipush #-5476
    //   420: invokestatic a : (II)Ljava/lang/String;
    //   423: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   426: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   429: pop
    //   430: iload #5
    //   432: ifeq -> 479
    //   435: aload #10
    //   437: aload #7
    //   439: ldc 132672
    //   441: sipush #11918
    //   444: sipush #31205
    //   447: invokestatic a : (II)Ljava/lang/String;
    //   450: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   453: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   456: pop
    //   457: aload #10
    //   459: aload #7
    //   461: ldc 132736
    //   463: sipush #11912
    //   466: sipush #-18449
    //   469: invokestatic a : (II)Ljava/lang/String;
    //   472: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   475: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   478: pop
    //   479: aload #6
    //   481: invokeinterface ZoO : ()Lburp/Zstu;
    //   486: ifnull -> 502
    //   489: aload #10
    //   491: aload #7
    //   493: ldc 134912
    //   495: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   498: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   501: pop
    //   502: new burp/Zztv
    //   505: dup
    //   506: sipush #11914
    //   509: sipush #30582
    //   512: invokestatic a : (II)Ljava/lang/String;
    //   515: invokespecial <init> : (Ljava/lang/String;)V
    //   518: astore #12
    //   520: aload #12
    //   522: aload #7
    //   524: ldc 135168
    //   526: sipush #11913
    //   529: sipush #-8030
    //   532: invokestatic a : (II)Ljava/lang/String;
    //   535: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   538: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   541: pop
    //   542: aload #12
    //   544: aload #7
    //   546: ldc 135424
    //   548: sipush #11919
    //   551: sipush #1170
    //   554: invokestatic a : (II)Ljava/lang/String;
    //   557: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   560: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   563: pop
    //   564: aload #10
    //   566: aload #12
    //   568: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   571: pop
    //   572: iload #5
    //   574: ifeq -> 621
    //   577: aload #10
    //   579: aload #7
    //   581: ldc 132672
    //   583: sipush #11916
    //   586: sipush #-15444
    //   589: invokestatic a : (II)Ljava/lang/String;
    //   592: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   595: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   598: pop
    //   599: aload #10
    //   601: aload #7
    //   603: ldc 132736
    //   605: sipush #11917
    //   608: sipush #-25229
    //   611: invokestatic a : (II)Ljava/lang/String;
    //   614: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   617: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   620: pop
    //   621: aload_0
    //   622: getfield Zz : Lburp/Zerg;
    //   625: invokevirtual ZM : ()Lburp/Zgvn;
    //   628: invokeinterface ZY : ()Ljava/util/List;
    //   633: astore #12
    //   635: aload #12
    //   637: ifnull -> 728
    //   640: aload_0
    //   641: getfield Zx : Lburp/Zgso;
    //   644: getstatic burp/Zrpb.CONTEXT_LOGGER_TABLE : Lburp/Zrpb;
    //   647: aload_2
    //   648: aconst_null
    //   649: aload_1
    //   650: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   655: aload_3
    //   656: <illegal opcode> apply : (Ljava/awt/Component;)Ljava/util/function/Function;
    //   661: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   666: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   671: invokeinterface toArray : (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    //   676: checkcast [Lburp/Zmgv;
    //   679: invokevirtual ZU : (Lburp/Zrpb;Ljava/awt/event/InputEvent;[I[Lburp/Zmgv;)Ljava/util/List;
    //   682: astore #13
    //   684: aload #13
    //   686: invokeinterface iterator : ()Ljava/util/Iterator;
    //   691: astore #14
    //   693: aload #14
    //   695: invokeinterface hasNext : ()Z
    //   700: ifeq -> 728
    //   703: aload #14
    //   705: invokeinterface next : ()Ljava/lang/Object;
    //   710: checkcast java/awt/Component
    //   713: astore #15
    //   715: aload #10
    //   717: aload #15
    //   719: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   722: pop
    //   723: iload #5
    //   725: ifeq -> 693
    //   728: aload #10
    //   730: new javax/swing/JSeparator
    //   733: dup
    //   734: invokespecial <init> : ()V
    //   737: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   740: pop
    //   741: aload #6
    //   743: invokeinterface Zod : ()Lburp/Zmzk;
    //   748: aload #10
    //   750: aload #7
    //   752: sipush #11915
    //   755: sipush #-7125
    //   758: invokestatic a : (II)Ljava/lang/String;
    //   761: invokestatic Zn : (Lburp/Zmzk;Lburp/Zkj9;Lburp/Zzyl;Ljava/lang/String;)V
    //   764: aload #10
    //   766: aload #7
    //   768: ldc 536576
    //   770: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   773: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   776: pop
    //   777: iload #9
    //   779: ifeq -> 809
    //   782: aload #10
    //   784: aload #7
    //   786: ldc 134400
    //   788: sipush #11904
    //   791: sipush #32713
    //   794: invokestatic a : (II)Ljava/lang/String;
    //   797: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   800: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   803: pop
    //   804: iload #5
    //   806: ifeq -> 835
    //   809: aload #10
    //   811: aload #7
    //   813: ldc 134400
    //   815: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   818: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   821: pop
    //   822: aload #10
    //   824: aload #7
    //   826: ldc 134416
    //   828: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   831: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   834: pop
    //   835: iload #9
    //   837: ifeq -> 867
    //   840: aload #10
    //   842: aload #7
    //   844: ldc 134784
    //   846: sipush #11907
    //   849: sipush #-13866
    //   852: invokestatic a : (II)Ljava/lang/String;
    //   855: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   858: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   861: pop
    //   862: iload #5
    //   864: ifeq -> 889
    //   867: aload #10
    //   869: aload #7
    //   871: ldc 134784
    //   873: sipush #11909
    //   876: sipush #20523
    //   879: invokestatic a : (II)Ljava/lang/String;
    //   882: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   885: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   888: pop
    //   889: aload #10
    //   891: new javax/swing/JSeparator
    //   894: dup
    //   895: invokespecial <init> : ()V
    //   898: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   901: pop
    //   902: aload #10
    //   904: aload #7
    //   906: ldc 536592
    //   908: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   911: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   914: pop
    //   915: aload #10
    //   917: new javax/swing/JSeparator
    //   920: dup
    //   921: invokespecial <init> : ()V
    //   924: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   927: pop
    //   928: aload #10
    //   930: aload #7
    //   932: ldc 134864
    //   934: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   937: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   940: pop
    //   941: aload #10
    //   943: new javax/swing/JSeparator
    //   946: dup
    //   947: invokespecial <init> : ()V
    //   950: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   953: pop
    //   954: aload #10
    //   956: new burp/Zepa
    //   959: dup
    //   960: sipush #11906
    //   963: sipush #-29275
    //   966: invokestatic a : (II)Ljava/lang/String;
    //   969: getstatic burp/Zk97.DESKTOP_TOOLS_LOGGER : Lburp/Zk97;
    //   972: aload_3
    //   973: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   976: invokespecial <init> : (Ljava/lang/String;Lburp/Zk97;Ljava/awt/Window;)V
    //   979: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   982: pop
    //   983: aload #10
    //   985: aload_3
    //   986: aload #4
    //   988: getfield x : I
    //   991: aload #4
    //   993: getfield y : I
    //   996: invokevirtual show : (Ljava/awt/Component;II)V
    //   999: return
  }
  
  private static Zzee[] lambda$showPopup$2(int paramInt) {
    return new Zzee[paramInt];
  }
  
  private static Zzee lambda$showPopup$1(Component paramComponent, Zto7 paramZto7) {
    return new Zzee(paramComponent, paramZto7::lambda$showPopup$0);
  }
  
  private static Zto7 lambda$showPopup$0(Zto7 paramZto7) {
    return paramZto7;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'îNÞWÞ­$CÍ²R´ût×P~d!´^MS,Pi*yøqfÕ©y!åMúê%Pëµ Èá¬ê"Ä[9Ì.þë4©~+ÖÌãä¦¦D· ¢:Ù\\t8ÄS5]Îè]sàÃ8ÜØ!SGâ¼f@Rqh2-=Ûz¶ÜÕö'SY(¨KyMÓºâÒfÊ¯Ñ¡ ãñ¼ì½ay`«b>áãF§Pq0¾e_ø\\t¢MÜ\\r ¸f\\nBÔiÊ¼fA«'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #19
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #109
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
    //   68: ldc 'TÐÏ_RÑó)éÉGHÖäÉ\\tµ]>5OD'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #20
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #110
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
    //   129: putstatic burp/Zt3z.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zt3z.b : [Ljava/lang/String;
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
    //   212: bipush #75
    //   214: goto -> 244
    //   217: bipush #50
    //   219: goto -> 244
    //   222: bipush #122
    //   224: goto -> 244
    //   227: bipush #69
    //   229: goto -> 244
    //   232: bipush #71
    //   234: goto -> 244
    //   237: bipush #89
    //   239: goto -> 244
    //   242: bipush #71
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
    int i = (paramInt1 ^ 0x2E89) & 0xFFFF;
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
      char c = 'ë';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt3z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */