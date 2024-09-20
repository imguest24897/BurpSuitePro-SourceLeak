package burp;

import java.util.Iterator;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zrzt;
import net.portswigger.Zuh;
import net.portswigger.Zzc;

public class Zslx {
  private static final String ZT;
  
  static final String Zf;
  
  private final Zefx Zo;
  
  private final boolean ZN;
  
  private final StringBuilder Zb;
  
  private final StringBuilder ZQ;
  
  private Zl4c Zl;
  
  private boolean Zz;
  
  private Zl4c Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zslx(Zsmh paramZsmh, Zl4c paramZl4c, boolean paramBoolean, StringBuilder paramStringBuilder, Zey9 paramZey9) {
    this.Zo = paramZey9.Zy(paramZsmh);
    this.Zl = paramZl4c;
    this.ZN = paramBoolean;
    this.Zb = paramStringBuilder;
    this.ZQ = new StringBuilder();
    Zuh.Zb((this.Zo.ZT() != null), Zqf.Zr);
  }
  
  byte[] ZH() {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: invokevirtual Za : ()Lburp/Zl4c;
    //   5: putfield Za : Lburp/Zl4c;
    //   8: invokestatic ZN : ()Z
    //   11: aload_0
    //   12: sipush #-27292
    //   15: sipush #-19640
    //   18: invokestatic a : (II)Ljava/lang/String;
    //   21: aload_0
    //   22: getfield Zo : Lburp/Zefx;
    //   25: invokeinterface Zr : ()Ljava/lang/String;
    //   30: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   33: putfield Zz : Z
    //   36: istore_1
    //   37: aload_0
    //   38: getfield Zl : Lburp/Zl4c;
    //   41: getstatic burp/Zl4c.AUTO_DETECT : Lburp/Zl4c;
    //   44: if_acmpne -> 55
    //   47: aload_0
    //   48: aload_0
    //   49: invokevirtual ZW : ()Lburp/Zl4c;
    //   52: putfield Zl : Lburp/Zl4c;
    //   55: aload_0
    //   56: invokevirtual ZI : ()V
    //   59: aload_0
    //   60: getfield ZQ : Ljava/lang/StringBuilder;
    //   63: sipush #-27276
    //   66: sipush #7055
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload_0
    //   77: getfield ZN : Z
    //   80: ifne -> 94
    //   83: aload_0
    //   84: getfield ZQ : Ljava/lang/StringBuilder;
    //   87: getstatic burp/Zslx.ZT : Ljava/lang/String;
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: aload_0
    //   95: getfield Zl : Lburp/Zl4c;
    //   98: getstatic burp/Zl4c.XHR : Lburp/Zl4c;
    //   101: if_acmpne -> 112
    //   104: aload_0
    //   105: invokevirtual Zl : ()V
    //   108: iload_1
    //   109: ifne -> 116
    //   112: aload_0
    //   113: invokevirtual Zn : ()V
    //   116: aload_0
    //   117: getfield ZQ : Ljava/lang/StringBuilder;
    //   120: sipush #-27296
    //   123: sipush #-1126
    //   126: invokestatic a : (II)Ljava/lang/String;
    //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: aload_0
    //   134: getfield ZQ : Ljava/lang/StringBuilder;
    //   137: invokevirtual toString : ()Ljava/lang/String;
    //   140: invokestatic Zy : (Ljava/lang/String;)[B
    //   143: invokestatic Zwu : ()[Lburp/Zbqc;
    //   146: ifnonnull -> 161
    //   149: iload_1
    //   150: ifeq -> 157
    //   153: iconst_0
    //   154: goto -> 158
    //   157: iconst_1
    //   158: invokestatic ZO : (Z)V
    //   161: areturn
  }
  
  private Zl4c Za() {
    String str = Zgyj.ZZ(this.Zo.ZG(), a(-27301, 4087), false);
    if (str == null)
      return Zl4c.NONE; 
    str = str.toLowerCase();
    return str.contains(a(-27295, 1887)) ? Zl4c.URL : (str.contains(a(-27287, 10173)) ? Zl4c.MULTIPART : (str.contains(a(-27359, 22171)) ? Zl4c.PLAIN : Zl4c.UNKNOWN));
  }
  
  private Zl4c ZW() {
    switch (Zmfb.Zl[this.Za.ordinal()]) {
      case 1:
        return Zl4c.URL;
      case 2:
        return this.Zo.ZZ(Zslx::lambda$autoDetectPocEncoding$0).isEmpty() ? Zl4c.MULTIPART : Zl4c.XHR;
      case 3:
        return Zl4c.PLAIN;
      case 4:
      case 5:
        return ZG() ? Zl4c.URL : Zl4c.PLAIN;
    } 
    Zuh.ZT(false, Zqf.Zk, this.Za.toString());
    return Zl4c.URL;
  }
  
  private boolean ZG() {
    byte[] arrayOfByte = this.Zo.Zw();
    byte b = 0;
    boolean bool = Zl4q.ZC();
    while (b < arrayOfByte.length) {
      byte b1 = arrayOfByte[b];
      if (!Character.isLetter(b1))
        return false; 
      while (++b < arrayOfByte.length) {
        b1 = arrayOfByte[b];
        if (b1 >= 0 && b1 <= 32)
          return false; 
        if (b1 == 61)
          break; 
        if (b1 == 38)
          return false; 
        b++;
        if (bool)
          break; 
      } 
      if (b >= arrayOfByte.length)
        return false; 
      while (++b < arrayOfByte.length) {
        b1 = arrayOfByte[b];
        if (b1 >= 0 && b1 < 32)
          return false; 
        if (b1 == 38)
          break; 
        b++;
        if (bool)
          break; 
      } 
      b++;
      if (bool)
        break; 
    } 
    return true;
  }
  
  private void ZI() {
    if (this.Zl == Zl4c.XHR)
      return; 
    if (this.Za == Zl4c.NONE)
      return; 
    if (this.Za != this.Zl)
      this.Zb.append(a(-27282, 26602)); 
  }
  
  private void Zl() {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zb : Ljava/lang/StringBuilder;
    //   8: invokevirtual length : ()I
    //   11: ifle -> 24
    //   14: aload_0
    //   15: getfield Zb : Ljava/lang/StringBuilder;
    //   18: ldc ' '
    //   20: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: aload_0
    //   25: getfield Zb : Ljava/lang/StringBuilder;
    //   28: sipush #-27277
    //   31: sipush #3522
    //   34: invokestatic a : (II)Ljava/lang/String;
    //   37: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: pop
    //   41: aload_0
    //   42: getfield ZQ : Ljava/lang/StringBuilder;
    //   45: sipush #-27294
    //   48: sipush #-21455
    //   51: invokestatic a : (II)Ljava/lang/String;
    //   54: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: sipush #-27284
    //   60: sipush #3755
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: sipush #-27272
    //   72: sipush #11282
    //   75: invokestatic a : (II)Ljava/lang/String;
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: sipush #-27317
    //   84: sipush #18978
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: sipush #-27324
    //   96: sipush #13450
    //   99: invokestatic a : (II)Ljava/lang/String;
    //   102: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: aload_0
    //   106: getfield Zo : Lburp/Zefx;
    //   109: invokeinterface Zr : ()Ljava/lang/String;
    //   114: invokestatic ZU : (Ljava/lang/String;)Ljava/lang/String;
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: sipush #-27351
    //   123: sipush #-5748
    //   126: invokestatic a : (II)Ljava/lang/String;
    //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: aload_0
    //   133: getfield Zo : Lburp/Zefx;
    //   136: invokeinterface ZF : ()Lburp/Zlit;
    //   141: invokeinterface toString : ()Ljava/lang/String;
    //   146: invokestatic ZU : (Ljava/lang/String;)Ljava/lang/String;
    //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: sipush #-27350
    //   155: sipush #16658
    //   158: invokestatic a : (II)Ljava/lang/String;
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: iconst_0
    //   166: istore_2
    //   167: iconst_0
    //   168: istore_3
    //   169: iconst_1
    //   170: istore #4
    //   172: iload #4
    //   174: aload_0
    //   175: getfield Zo : Lburp/Zefx;
    //   178: invokeinterface ZG : ()Ljava/util/List;
    //   183: invokeinterface size : ()I
    //   188: if_icmpge -> 676
    //   191: aload_0
    //   192: getfield Zo : Lburp/Zefx;
    //   195: invokeinterface ZG : ()Ljava/util/List;
    //   200: iload #4
    //   202: invokeinterface get : (I)Ljava/lang/Object;
    //   207: checkcast java/lang/String
    //   210: astore #5
    //   212: aload #5
    //   214: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   217: astore #6
    //   219: aload #6
    //   221: sipush #-27310
    //   224: sipush #10451
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   233: ifne -> 497
    //   236: aload #6
    //   238: sipush #-27280
    //   241: sipush #-12862
    //   244: invokestatic a : (II)Ljava/lang/String;
    //   247: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   250: ifne -> 497
    //   253: aload #6
    //   255: sipush #-27325
    //   258: sipush #32704
    //   261: invokestatic a : (II)Ljava/lang/String;
    //   264: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   267: ifne -> 497
    //   270: aload #6
    //   272: sipush #-27347
    //   275: sipush #-20011
    //   278: invokestatic a : (II)Ljava/lang/String;
    //   281: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   284: ifne -> 497
    //   287: aload #6
    //   289: sipush #-27270
    //   292: sipush #31139
    //   295: invokestatic a : (II)Ljava/lang/String;
    //   298: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   301: ifne -> 669
    //   304: aload #6
    //   306: sipush #-27293
    //   309: sipush #-1526
    //   312: invokestatic a : (II)Ljava/lang/String;
    //   315: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   318: ifne -> 669
    //   321: aload #6
    //   323: sipush #-27297
    //   326: sipush #-9934
    //   329: invokestatic a : (II)Ljava/lang/String;
    //   332: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   335: ifne -> 669
    //   338: aload #6
    //   340: sipush #-27278
    //   343: sipush #-9880
    //   346: invokestatic a : (II)Ljava/lang/String;
    //   349: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   352: ifne -> 669
    //   355: aload #6
    //   357: sipush #-27314
    //   360: sipush #18778
    //   363: invokestatic a : (II)Ljava/lang/String;
    //   366: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   369: ifne -> 669
    //   372: aload #6
    //   374: sipush #-27346
    //   377: sipush #-17829
    //   380: invokestatic a : (II)Ljava/lang/String;
    //   383: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   386: ifne -> 669
    //   389: aload #6
    //   391: sipush #-27285
    //   394: sipush #1883
    //   397: invokestatic a : (II)Ljava/lang/String;
    //   400: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   403: ifne -> 669
    //   406: aload #6
    //   408: sipush #-27355
    //   411: sipush #-9826
    //   414: invokestatic a : (II)Ljava/lang/String;
    //   417: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   420: ifne -> 669
    //   423: aload #6
    //   425: sipush #-27298
    //   428: sipush #19206
    //   431: invokestatic a : (II)Ljava/lang/String;
    //   434: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   437: ifne -> 669
    //   440: aload #6
    //   442: sipush #-27357
    //   445: sipush #24877
    //   448: invokestatic a : (II)Ljava/lang/String;
    //   451: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   454: ifne -> 669
    //   457: aload #6
    //   459: sipush #-27319
    //   462: sipush #-24201
    //   465: invokestatic a : (II)Ljava/lang/String;
    //   468: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   471: ifne -> 669
    //   474: aload #6
    //   476: sipush #-27279
    //   479: sipush #-21988
    //   482: invokestatic a : (II)Ljava/lang/String;
    //   485: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   488: ifne -> 669
    //   491: iconst_1
    //   492: istore_2
    //   493: iload_1
    //   494: ifne -> 669
    //   497: aload #6
    //   499: sipush #-27352
    //   502: sipush #-16444
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   511: ifeq -> 579
    //   514: aload #6
    //   516: bipush #13
    //   518: invokevirtual substring : (I)Ljava/lang/String;
    //   521: invokevirtual trim : ()Ljava/lang/String;
    //   524: astore #7
    //   526: aload #7
    //   528: sipush #-27266
    //   531: sipush #-29899
    //   534: invokestatic a : (II)Ljava/lang/String;
    //   537: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   540: ifne -> 579
    //   543: aload #7
    //   545: sipush #-27309
    //   548: sipush #19209
    //   551: invokestatic a : (II)Ljava/lang/String;
    //   554: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   557: ifne -> 579
    //   560: aload #7
    //   562: sipush #-27286
    //   565: sipush #-19092
    //   568: invokestatic a : (II)Ljava/lang/String;
    //   571: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   574: ifne -> 579
    //   577: iconst_1
    //   578: istore_3
    //   579: aload #5
    //   581: bipush #58
    //   583: invokevirtual indexOf : (I)I
    //   586: istore #7
    //   588: iload #7
    //   590: ifle -> 669
    //   593: aload_0
    //   594: getfield ZQ : Ljava/lang/StringBuilder;
    //   597: sipush #-27354
    //   600: sipush #9753
    //   603: invokestatic a : (II)Ljava/lang/String;
    //   606: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   609: aload #5
    //   611: iconst_0
    //   612: iload #7
    //   614: invokevirtual substring : (II)Ljava/lang/String;
    //   617: invokevirtual trim : ()Ljava/lang/String;
    //   620: invokestatic ZU : (Ljava/lang/String;)Ljava/lang/String;
    //   623: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   626: sipush #-27300
    //   629: sipush #32197
    //   632: invokestatic a : (II)Ljava/lang/String;
    //   635: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   638: aload #5
    //   640: iload #7
    //   642: iconst_1
    //   643: iadd
    //   644: invokevirtual substring : (I)Ljava/lang/String;
    //   647: invokevirtual trim : ()Ljava/lang/String;
    //   650: invokestatic ZU : (Ljava/lang/String;)Ljava/lang/String;
    //   653: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   656: sipush #-27265
    //   659: sipush #-5694
    //   662: invokestatic a : (II)Ljava/lang/String;
    //   665: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   668: pop
    //   669: iinc #4, 1
    //   672: iload_1
    //   673: ifne -> 172
    //   676: iload_2
    //   677: ifeq -> 717
    //   680: aload_0
    //   681: getfield Zb : Ljava/lang/StringBuilder;
    //   684: invokevirtual length : ()I
    //   687: ifle -> 700
    //   690: aload_0
    //   691: getfield Zb : Ljava/lang/StringBuilder;
    //   694: ldc ' '
    //   696: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   699: pop
    //   700: aload_0
    //   701: getfield Zb : Ljava/lang/StringBuilder;
    //   704: sipush #-27273
    //   707: sipush #25842
    //   710: invokestatic a : (II)Ljava/lang/String;
    //   713: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   716: pop
    //   717: iload_3
    //   718: ifeq -> 758
    //   721: aload_0
    //   722: getfield Zb : Ljava/lang/StringBuilder;
    //   725: invokevirtual length : ()I
    //   728: ifle -> 741
    //   731: aload_0
    //   732: getfield Zb : Ljava/lang/StringBuilder;
    //   735: ldc ' '
    //   737: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   740: pop
    //   741: aload_0
    //   742: getfield Zb : Ljava/lang/StringBuilder;
    //   745: sipush #-27302
    //   748: sipush #-13827
    //   751: invokestatic a : (II)Ljava/lang/String;
    //   754: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   757: pop
    //   758: aload_0
    //   759: getfield ZQ : Ljava/lang/StringBuilder;
    //   762: sipush #-27308
    //   765: sipush #2503
    //   768: invokestatic a : (II)Ljava/lang/String;
    //   771: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   774: pop
    //   775: aload_0
    //   776: getfield ZQ : Ljava/lang/StringBuilder;
    //   779: sipush #-27303
    //   782: sipush #-22641
    //   785: invokestatic a : (II)Ljava/lang/String;
    //   788: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   791: aload_0
    //   792: getfield Zo : Lburp/Zefx;
    //   795: invokeinterface Zw : ()[B
    //   800: sipush #-27356
    //   803: sipush #23851
    //   806: invokestatic a : (II)Ljava/lang/String;
    //   809: invokestatic Zy : (Ljava/lang/String;)[B
    //   812: invokestatic Zb : ([B[B)[B
    //   815: invokestatic ZG : ([B)Ljava/lang/String;
    //   818: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   821: sipush #-27269
    //   824: sipush #-4466
    //   827: invokestatic a : (II)Ljava/lang/String;
    //   830: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   833: sipush #-27311
    //   836: sipush #23315
    //   839: invokestatic a : (II)Ljava/lang/String;
    //   842: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   845: sipush #-27305
    //   848: sipush #-5613
    //   851: invokestatic a : (II)Ljava/lang/String;
    //   854: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   857: sipush #-27291
    //   860: sipush #-14606
    //   863: invokestatic a : (II)Ljava/lang/String;
    //   866: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   869: sipush #-27348
    //   872: sipush #-24005
    //   875: invokestatic a : (II)Ljava/lang/String;
    //   878: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   881: pop
    //   882: aload_0
    //   883: getfield ZQ : Ljava/lang/StringBuilder;
    //   886: sipush #-27316
    //   889: sipush #25601
    //   892: invokestatic a : (II)Ljava/lang/String;
    //   895: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   898: aload_0
    //   899: getfield ZN : Z
    //   902: ifeq -> 917
    //   905: sipush #-27307
    //   908: sipush #31921
    //   911: invokestatic a : (II)Ljava/lang/String;
    //   914: goto -> 919
    //   917: ldc ''
    //   919: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   922: sipush #-27358
    //   925: sipush #23819
    //   928: invokestatic a : (II)Ljava/lang/String;
    //   931: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   934: pop
    //   935: aload_0
    //   936: getfield ZQ : Ljava/lang/StringBuilder;
    //   939: sipush #-27289
    //   942: sipush #-20205
    //   945: invokestatic a : (II)Ljava/lang/String;
    //   948: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   951: sipush #-27327
    //   954: sipush #-21228
    //   957: invokestatic a : (II)Ljava/lang/String;
    //   960: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   963: sipush #-27283
    //   966: sipush #28346
    //   969: invokestatic a : (II)Ljava/lang/String;
    //   972: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   975: pop
    //   976: return
  }
  
  private static String ZU(String paramString) {
    return paramString.replace("\\", a(-27322, 7741)).replace("\"", a(-27360, -17736)).replace("/", a(-27290, -17365));
  }
  
  private void Zn() {
    Zc();
    ZZ();
    ZY();
  }
  
  private void ZY() {
    this.ZQ.append(a(-27304, 18686));
    if (this.ZN)
      this.ZQ.append(Zf); 
  }
  
  private void ZZ() {
    // Byte code:
    //   0: invokestatic ZC : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zz : Z
    //   8: ifeq -> 90
    //   11: aload_0
    //   12: getfield Zo : Lburp/Zefx;
    //   15: invokeinterface Zw : ()[B
    //   20: arraylength
    //   21: ifeq -> 108
    //   24: getstatic burp/Zmfb.Zl : [I
    //   27: aload_0
    //   28: getfield Zl : Lburp/Zl4c;
    //   31: invokevirtual ordinal : ()I
    //   34: iaload
    //   35: tableswitch default -> 86, 1 -> 60, 2 -> 60, 3 -> 82
    //   60: aload_0
    //   61: aload_0
    //   62: getfield Zo : Lburp/Zefx;
    //   65: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   70: invokeinterface ZZ : (Ljava/util/function/Predicate;)Ljava/util/List;
    //   75: invokevirtual ZV : (Ljava/util/List;)V
    //   78: iload_1
    //   79: ifeq -> 86
    //   82: aload_0
    //   83: invokevirtual Zp : ()V
    //   86: iload_1
    //   87: ifeq -> 108
    //   90: aload_0
    //   91: aload_0
    //   92: getfield Zo : Lburp/Zefx;
    //   95: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   100: invokeinterface ZZ : (Ljava/util/function/Predicate;)Ljava/util/List;
    //   105: invokevirtual ZV : (Ljava/util/List;)V
    //   108: return
  }
  
  private void Zp() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zo : Lburp/Zefx;
    //   4: invokeinterface Zw : ()[B
    //   9: astore_2
    //   10: invokestatic ZC : ()Z
    //   13: aload_2
    //   14: bipush #61
    //   16: iconst_0
    //   17: aload_2
    //   18: arraylength
    //   19: invokestatic ZU : ([BBII)I
    //   22: istore #5
    //   24: istore_1
    //   25: iload #5
    //   27: iconst_m1
    //   28: if_icmpne -> 98
    //   31: aload_0
    //   32: getfield Zb : Ljava/lang/StringBuilder;
    //   35: aload_0
    //   36: getfield Zb : Ljava/lang/StringBuilder;
    //   39: invokevirtual length : ()I
    //   42: ifne -> 57
    //   45: sipush #-27275
    //   48: sipush #28423
    //   51: invokestatic a : (II)Ljava/lang/String;
    //   54: goto -> 66
    //   57: sipush #-27288
    //   60: sipush #-12184
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: sipush #-27267
    //   72: sipush #28030
    //   75: invokestatic a : (II)Ljava/lang/String;
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload_2
    //   83: invokestatic ZG : ([B)Ljava/lang/String;
    //   86: invokestatic Zn : (Ljava/lang/String;)Ljava/lang/String;
    //   89: astore_3
    //   90: ldc ''
    //   92: astore #4
    //   94: iload_1
    //   95: ifeq -> 129
    //   98: aload_2
    //   99: iconst_0
    //   100: iload #5
    //   102: invokestatic Zo : ([BII)Ljava/lang/String;
    //   105: invokestatic Zn : (Ljava/lang/String;)Ljava/lang/String;
    //   108: astore_3
    //   109: aload_2
    //   110: iload #5
    //   112: iconst_1
    //   113: iadd
    //   114: aload_2
    //   115: arraylength
    //   116: iload #5
    //   118: iconst_1
    //   119: iadd
    //   120: isub
    //   121: invokestatic Zo : ([BII)Ljava/lang/String;
    //   124: invokestatic Zn : (Ljava/lang/String;)Ljava/lang/String;
    //   127: astore #4
    //   129: aload_0
    //   130: aload_3
    //   131: aload #4
    //   133: invokevirtual Zz : (Ljava/lang/String;Ljava/lang/String;)V
    //   136: return
  }
  
  private void ZV(List<Zlou> paramList) {
    boolean bool1 = false;
    Iterator<Zlou> iterator = paramList.iterator();
    boolean bool = Zl4q.ZC();
    while (iterator.hasNext()) {
      String str1;
      String str2;
      Zlou zlou = iterator.next();
      switch (Zmfb.ZO[zlou.Zx.ordinal()]) {
        case 1:
        case 2:
          str1 = Zzc.Zn(Zrzt.ZJ(zlou.ZA));
          str2 = Zzc.Zn(Zrzt.ZJ(zlou.Zr));
          Zz(str1, str2);
        case 3:
          str1 = Zzc.Zn(zlou.ZA);
          str2 = Zzc.Zn(zlou.Zr);
          Zz(str1, str2);
        case 4:
          if (!bool1) {
            this.Zb.append((this.Zb.length() == 0) ? a(-27318, 10247) : a(-27323, -1205)).append(a(-27321, 25949)).append(zlou.ZA).append(a(-27306, -5525));
            bool1 = true;
          } 
          break;
      } 
      continue;
      if (bool)
        break; 
    } 
  }
  
  private void Zz(String paramString1, String paramString2) {
    this.ZQ.append(a(-27299, 2979)).append(paramString1).append(a(-27328, -30256)).append(paramString2).append(a(-27274, -30937));
  }
  
  private void Zc() {
    String str = this.Zz ? this.Zo.ZF().toString() : Zmg3.ZD(this.Zo.ZF());
    this.ZQ.append(a(-27320, -22831));
    this.ZQ.append(str.replace("\"", a(-27312, -6417)));
    this.ZQ.append("\"");
    if (this.Zz) {
      this.ZQ.append(a(-27345, 24164));
      this.ZQ.append(Zt(this.Zl));
    } 
    this.ZQ.append(a(-27271, -18749));
  }
  
  private static String Zt(Zl4c paramZl4c) {
    switch (Zmfb.Zl[paramZl4c.ordinal()]) {
      case 1:
        return "";
      case 2:
        return a(-27313, 16673);
      case 3:
        return a(-27353, -7254);
    } 
    Zuh.ZT(false, Zqf.Zk, paramZl4c.toString());
    return "";
  }
  
  private static boolean lambda$writeFormFields$2(Zlou paramZlou) {
    return (paramZlou.Zx == Zrdu.URL_PARAM);
  }
  
  private static boolean lambda$writeFormFields$1(Zlou paramZlou) {
    return (paramZlou.Zx == Zrdu.BODY_PARAM_URL_ENCODED || paramZlou.Zx == Zrdu.BODY_PARAM_MULTIPART || paramZlou.Zx == Zrdu.MULTIPART_PARAM_ATTR);
  }
  
  private static boolean lambda$autoDetectPocEncoding$0(Zlou paramZlou) {
    return (paramZlou.Zx == Zrdu.MULTIPART_PARAM_ATTR);
  }
  
  static {
    // Byte code:
    //   0: bipush #79
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ä`/I+À\\f¦6úØ¥ô¸èâ¾£fÁp-#&OØ×Ó4Ì}ÿ<þºøé¨ìoü¶6pÔÃe©°Ejd¥9U0ß=7¦k,/©¨ÞÛÁ]©Ï«¬×é8?Ý.«º×Ã,2 )iÉ\\rÏ"pH¹ìõZO¾O°@ îic¡oÃ?úå;Êýx)äéãB}ÝvhÁþ¨×£oîX\\r>Jyþþì·»h"¼@\ ±ÀãW°hõiÉ(gØÌ_(APê©Î¨õ,«mØx¶çß?fDrfß:×ËdäNi*åJOÙá Cí?\\bMlÿðâÉ'@yáï0ìà,òû¯Ñ0¨H,zß«}\\bÚ\\bâï[s1÷×ôßhpÄàúç¡:-å»áù£ÃáQ\\n7Âo¿ÒÉ.KßÏ¥ ­\\rFx#@djî¥³1Ñ\\t)«3i't|ñ\\n\\ts`²¾EKfð7«Pðì=PØ¨È&¹N¦¦¡ok+4Ls"¢êÉv´\Ö±¹i/(ÄñþÔ´ Énõ*\\tÞ\\t¶ÒOÍ}àpðÎÝàÔ¨°âÎnä÷( ½yÁ^HXì\\nUYK%¢ş¸Ö,°üî ¡:4æx>¿¿×õS¿ £=ëY3Â\\f4N\òp<.û?öwR½%2TÒ¡>þíáU»Âõ¸;íÆ0\\n×9ÐÄbd¼¶¼Ya*ûø3½åCrÎI­,MMó[¹êÔÅÍ­î¿cn&'ÅG(-$]pe÷°ý\p(" -ÅSÈ?!¿ÿä¤8ê¶s¸NsA \\nÉp+dï¥¼x jíàRåV¿éí{B¼7¶Ì9´¡#¯~ªwç<ÕÝ6YÆùCôy¤ÿþ& Ñéëõ'÷Où§{Ä¸ó¢>ùÞ@g·­¦G+¾ÎÂ0!|ÈÛ×lWçÀ:ÔPç\\n¦«s_ð£My0>wº:¹ÏÈäèfn=¶#_u±Ø¾ÒèÏXAÛ\ÊÕÌ.@s¤¾¡N+lÈzÐhÑî_@S@\\b>¸'\\bõEÂ~y¨.ã\\r9ªôÚ§:×Åªï¡KÀsÿµ@­:X§û©lÌQy-ÀïçÜtjc~­HYû©¶|:síà¼nÍ»O[eøOÝäðÓ¸«é»å£ú=ÁÏÇ±*-n=2ñ;0¥· /Í)Lýyýâuê®ä¸ý9d` ¿A¹¹WTü§D<ædîÖ½ëuÃÉÝ{Ñ·å;vÑÎgrwáSY'k2ÝÐ\p@zge%@ÒÐx¤Þa"Ìÿ°0Ïùñ·KÿÐ¬òæ¡¤º¡Ë/ ±änEYA z:\\nÖÐq¸¿ØÉ&»zR¹23Èq03Q#\\n/¿±\\n6££ªÐ¥êÃ;À¬IOùÒ~(äå>ÎH þë²k©xªÜ»5Ô9æw jVäÏ 1ojk;`m)[G{làu´`áYa$r:ÂÖúuF-äý!4³×þ@Oð1èBþ\úßXÍÔÔöÍÑðD²ÆÜ\\tÏdf*+÷ú\\tÌT`9TsU'PÐ8HÌ¬5DC¨â«ë¸A¦¯Îoâr´Í1µ£];ÍõÑM=i¬ó¸x9\$t;kðöôìÄ\\tð­`F[W\\tÉ,sonÜ¨6Q÷|Â"×\H02Ø¡pô¨GüÇ¸¬S`è;2´:ZÌ¿ä«¡·?ðnHePãú.Yß÷e¤vÓÍ¾K{EÏ,v®5ZÆÎ[7¦ø³3ÍÖ÷KMmÓÛÞ ÷R¤*\ü×µL\\bî¤mËèv±Æ;\\b4=eIóÉ\\tYm`¯à_JYÚìcò²  ¿õø¡ÅùD»%H5q!lÞuaät%°ñªS9còd~¼Ò®V!·pUQJ>;ÝÁåÁ>¬Esa{$WÁáCÙ\\ruÖGã­ã\\nj¸k8j£dÛ¾«iÂü"þvEÜ&E­ãàP\;É\\toVßÖºzß)]Uo\tq-¨#ßuÆ×¹°Áº]Þ+Òû«\\nw\Ðøsº¦9%¯IK¤ï%z¾¹aµ_Z³ïñ'¶¦Ë5ÒLÝæý½êðMÁ41A>Öºô}tU±µ;Ðò]²3«\\bÞÿçïñS;+Ü_@&åÔzËU»»\\ryb|~\\fã½¥H·ð<¥=OY)¤0º¡éðL¯ñ0UmJÅ4^KØxB£Î¹jðÕÃÝ¯'ß(wÑdûüÕ2Nl~@ó¹ù#À¼ÆDy nooÑ¬øL\\rZ$Sy'40\\t,«è%ÂTÆ§B¥¹±Ë eE8Lx  häW\\b.·¯ù\\t!ÃÆÄ¤ZrÅ+{¦T\\nFÈ8;ÍÝ;ÝP(j¸ã½^_¶N> K:ÆëCÑÆ]äRSÄ["PÆÚ(yÔfÁ1?f N7æ5 6\\tÊÕ$æ¹<ÅÙD±Ñ9SiÞó\<)?1zK#-å(»µºæÖÈ%` jþbâĩPüæúã#nj9æØxÏd/ó÷r=Ô\®íD;UQ§NäæöÑ)dÀn©JP¸tqfg3>õ¶íÇåÒ»¸¾JÝÖ\\r^TMëK@½·ÊøuÏäq#R7ÂÐTÏ×Ræg'ßKBÓeV\·Bq¬fÖ{jnc×\\foYaªôæ¥!Ýõz¸+è3`tÄÃ<±-²Ìe!X£àæ5üË}"7/AÞëÕ~RÍHb3µzµYGMÕÄ2«Q(  òG$Þú¼!4\\b#døïæ¤ç',úëiâH±\\b§*¶Á5\\n- y%mÅz\ó×5ZYr©3v#c¾zsWucñËË,HÊâ\\r±É÷6RÎG1£;7ul¸´ÿÔA-å\\r´ã*\£­U0L/WAIYEzø#Pã´ÓáAÖõÿdLïØÀ\\bÀc@q_ÞòÅ²õã*ÆMe| Î\\nÛ\\nü¶§Øe©¿©9¬Ì¾'`5?ÛÍReµUÎè©a4º%'»P\h×e÷&rÉðÓíË:c±Ú´,­u^þr3>L¹`zõ¾Ú%ézî\\rQèoAJ%ï\\t]çdW{Ø\\rÅTîÿÔzIYE)jt%#X{K¯£[\\rÕöa#ßlöEHN'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #81
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'ìg­ß²¨-5Þtò'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #21
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
    //   127: putstatic burp/Zslx.a : [Ljava/lang/String;
    //   130: bipush #79
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zslx.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 259
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
    //   212: bipush #61
    //   214: goto -> 243
    //   217: bipush #29
    //   219: goto -> 243
    //   222: bipush #102
    //   224: goto -> 243
    //   227: bipush #107
    //   229: goto -> 243
    //   232: bipush #126
    //   234: goto -> 243
    //   237: bipush #46
    //   239: goto -> 243
    //   242: iconst_1
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 97
    //   300: sipush #-27281
    //   303: sipush #23618
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: iconst_1
    //   310: anewarray java/lang/Object
    //   313: dup
    //   314: iconst_0
    //   315: sipush #-27326
    //   318: sipush #28105
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: aastore
    //   325: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   328: putstatic burp/Zslx.ZT : Ljava/lang/String;
    //   331: sipush #-27315
    //   334: sipush #20912
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: iconst_1
    //   341: anewarray java/lang/Object
    //   344: dup
    //   345: iconst_0
    //   346: sipush #-27268
    //   349: sipush #-28758
    //   352: invokestatic a : (II)Ljava/lang/String;
    //   355: aastore
    //   356: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   359: putstatic burp/Zslx.Zf : Ljava/lang/String;
    //   362: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9564) & 0xFFFF;
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
      byte b1 = 51;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zslx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */