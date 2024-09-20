package burp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Zx6k {
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZB(Zgyp paramZgyp, Zxxx paramZxxx, Consumer<Integer> paramConsumer) throws IOException, Ze27 {
    Zgyp zgyp = paramZgyp.Zm(a(-7860, 27742));
    try {
      if (zgyp == null)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZxxx.ZIU(zgyp.ZM(a(-7863, 30317)).intValue());
    int i = zgyp.ZM(a(-7869, 28932)).intValue();
    paramZxxx.ZID(i);
    paramConsumer.accept(Integer.valueOf(i));
    paramZxxx.ZIK(zgyp.ZM(a(-7856, -15775)).intValue());
    zgyp.Zq(a(-7864, 1767));
    zgyp.ZM(a(-7862, 30899));
    paramZxxx.Zby(zgyp.Zq("f").booleanValue());
    zgyp.Zv(a(-7848, -28308));
    boolean bool = zgyp.Zq(a(-7854, 32539)).booleanValue();
    try {
      if (bool)
        paramZxxx.ZhQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    zgyp.ZE();
  }
  
  public static Zgxp ZY(Zgyp paramZgyp, Zbnt paramZbnt, Zmzk paramZmzk, Zr_4 paramZr_4) throws IOException, Ze27 {
    // Byte code:
    //   0: invokestatic Zw : ()Z
    //   3: istore #4
    //   5: aload_0
    //   6: ldc 'r'
    //   8: invokeinterface Zm : (Ljava/lang/String;)Lburp/Zgyp;
    //   13: astore #5
    //   15: aload #5
    //   17: ifnonnull -> 26
    //   20: aconst_null
    //   21: areturn
    //   22: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   25: athrow
    //   26: aload_3
    //   27: new burp/Zeq6
    //   30: dup
    //   31: aload_2
    //   32: invokespecial <init> : (Lburp/Zmzk;)V
    //   35: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   40: checkcast burp/Zgxp
    //   43: astore #6
    //   45: aload #6
    //   47: aload #5
    //   49: sipush #-7852
    //   52: sipush #16013
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: invokeinterface ZM : (Ljava/lang/String;)Ljava/lang/Integer;
    //   63: invokevirtual intValue : ()I
    //   66: invokeinterface ZWu : (I)V
    //   71: aload #6
    //   73: aload #5
    //   75: sipush #-7847
    //   78: sipush #-31463
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: invokeinterface Zi : (Ljava/lang/String;)Lburp/Zstu;
    //   89: aload_3
    //   90: invokestatic Zj : (Lburp/Zstu;Lburp/Zr_4;)Lburp/Zstu;
    //   93: invokeinterface Zk : (Lburp/Zstu;)V
    //   98: aload_3
    //   99: new burp/Zsi_
    //   102: dup
    //   103: invokespecial <init> : ()V
    //   106: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   111: checkcast burp/Zxph
    //   114: astore #7
    //   116: iconst_0
    //   117: istore #8
    //   119: aload #5
    //   121: sipush #-7841
    //   124: sipush #-1846
    //   127: invokestatic a : (II)Ljava/lang/String;
    //   130: invokeinterface ZI : (Ljava/lang/String;)[B
    //   135: astore #9
    //   137: aload #9
    //   139: getstatic burp/Zgyp.Zm : [B
    //   142: if_acmpne -> 168
    //   145: aload #7
    //   147: iload #8
    //   149: iinc #8, 1
    //   152: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   155: aconst_null
    //   156: aconst_null
    //   157: aconst_null
    //   158: invokeinterface Zd : (Ljava/lang/Number;[B[B[B)V
    //   163: iload #4
    //   165: ifeq -> 119
    //   168: aload #5
    //   170: sipush #-7850
    //   173: sipush #8764
    //   176: invokestatic a : (II)Ljava/lang/String;
    //   179: invokeinterface ZI : (Ljava/lang/String;)[B
    //   184: astore #10
    //   186: aload #10
    //   188: ifnonnull -> 198
    //   191: goto -> 293
    //   194: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   197: athrow
    //   198: aload #5
    //   200: sipush #-7858
    //   203: sipush #30991
    //   206: invokestatic a : (II)Ljava/lang/String;
    //   209: invokeinterface ZI : (Ljava/lang/String;)[B
    //   214: astore #11
    //   216: aload #5
    //   218: sipush #-7870
    //   221: sipush #-20201
    //   224: invokestatic a : (II)Ljava/lang/String;
    //   227: invokeinterface ZI : (Ljava/lang/String;)[B
    //   232: astore #12
    //   234: aload #10
    //   236: getstatic burp/Zgyp.Zm : [B
    //   239: if_acmpne -> 245
    //   242: aconst_null
    //   243: astore #10
    //   245: aload #11
    //   247: getstatic burp/Zgyp.Zm : [B
    //   250: if_acmpne -> 256
    //   253: aconst_null
    //   254: astore #11
    //   256: aload #12
    //   258: getstatic burp/Zgyp.Zm : [B
    //   261: if_acmpne -> 267
    //   264: aconst_null
    //   265: astore #12
    //   267: aload #7
    //   269: iload #8
    //   271: iinc #8, 1
    //   274: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   277: aload #10
    //   279: aload #11
    //   281: aload #12
    //   283: invokeinterface Zd : (Ljava/lang/Number;[B[B[B)V
    //   288: iload #4
    //   290: ifeq -> 119
    //   293: aload #6
    //   295: aload #7
    //   297: invokeinterface Zw : (Lburp/Zxph;)V
    //   302: aload #6
    //   304: aload #5
    //   306: ldc 'p'
    //   308: invokeinterface ZM : (Ljava/lang/String;)Ljava/lang/Integer;
    //   313: invokevirtual shortValue : ()S
    //   316: invokeinterface ZWD : (I)V
    //   321: aload #6
    //   323: aload #5
    //   325: ldc 't'
    //   327: invokeinterface Zv : (Ljava/lang/String;)Ljava/lang/Long;
    //   332: invokevirtual longValue : ()J
    //   335: invokeinterface ZN : (J)V
    //   340: aload #6
    //   342: aload #5
    //   344: sipush #-7846
    //   347: sipush #5589
    //   350: invokestatic a : (II)Ljava/lang/String;
    //   353: invokeinterface Zi : (Ljava/lang/String;)Lburp/Zstu;
    //   358: aload_3
    //   359: invokestatic Zj : (Lburp/Zstu;Lburp/Zr_4;)Lburp/Zstu;
    //   362: invokeinterface Zj : (Lburp/Zstu;)V
    //   367: aload #6
    //   369: aload #5
    //   371: sipush #-7853
    //   374: sipush #-21657
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: invokeinterface ZM : (Ljava/lang/String;)Ljava/lang/Integer;
    //   385: invokevirtual intValue : ()I
    //   388: invokeinterface ZWs : (I)V
    //   393: aload #6
    //   395: aload #5
    //   397: sipush #-7872
    //   400: sipush #-5741
    //   403: invokestatic a : (II)Ljava/lang/String;
    //   406: invokeinterface ZM : (Ljava/lang/String;)Ljava/lang/Integer;
    //   411: invokevirtual intValue : ()I
    //   414: invokeinterface ZWb : (I)V
    //   419: aload #6
    //   421: aload #5
    //   423: ldc 's'
    //   425: invokeinterface ZM : (Ljava/lang/String;)Ljava/lang/Integer;
    //   430: invokevirtual shortValue : ()S
    //   433: invokeinterface Zq : (S)V
    //   438: aload #6
    //   440: aload #5
    //   442: sipush #-7844
    //   445: sipush #12198
    //   448: invokestatic a : (II)Ljava/lang/String;
    //   451: invokeinterface Zv : (Ljava/lang/String;)Ljava/lang/Long;
    //   456: invokevirtual longValue : ()J
    //   459: invokeinterface ZX : (J)V
    //   464: aload #6
    //   466: aload #5
    //   468: sipush #-7843
    //   471: sipush #-18427
    //   474: invokestatic a : (II)Ljava/lang/String;
    //   477: invokeinterface Zv : (Ljava/lang/String;)Ljava/lang/Long;
    //   482: invokevirtual longValue : ()J
    //   485: invokeinterface ZY : (J)V
    //   490: aload #6
    //   492: aload #5
    //   494: ldc 'e'
    //   496: invokeinterface Zq : (Ljava/lang/String;)Ljava/lang/Boolean;
    //   501: invokevirtual booleanValue : ()Z
    //   504: invokeinterface ZZb : (Z)V
    //   509: aload #6
    //   511: aload #5
    //   513: sipush #-7845
    //   516: sipush #-14552
    //   519: invokestatic a : (II)Ljava/lang/String;
    //   522: invokeinterface Zq : (Ljava/lang/String;)Ljava/lang/Boolean;
    //   527: invokevirtual booleanValue : ()Z
    //   530: invokeinterface ZZD : (Z)V
    //   535: aload #6
    //   537: aload #5
    //   539: ldc 'c'
    //   541: invokeinterface Zi : (Ljava/lang/String;)Lburp/Zstu;
    //   546: aload_3
    //   547: invokestatic Zj : (Lburp/Zstu;Lburp/Zr_4;)Lburp/Zstu;
    //   550: invokeinterface ZV : (Lburp/Zstu;)V
    //   555: aload #6
    //   557: ldc 'g'
    //   559: aload #5
    //   561: aload_3
    //   562: invokestatic ZR : (Ljava/lang/String;Lburp/Zgyp;Lburp/Zr_4;)Lburp/Zznf;
    //   565: invokeinterface ZB : (Lburp/Zznf;)V
    //   570: aload #6
    //   572: aload #5
    //   574: ldc 'r'
    //   576: invokeinterface ZM : (Ljava/lang/String;)Ljava/lang/Integer;
    //   581: invokevirtual byteValue : ()B
    //   584: invokeinterface ZK : (B)V
    //   589: aload_3
    //   590: new burp/Zrla
    //   593: dup
    //   594: invokespecial <init> : ()V
    //   597: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   602: checkcast burp/Zxo
    //   605: astore #9
    //   607: aload #5
    //   609: sipush #-7849
    //   612: sipush #15217
    //   615: invokestatic a : (II)Ljava/lang/String;
    //   618: invokeinterface Zi : (Ljava/lang/String;)Lburp/Zstu;
    //   623: aload_3
    //   624: invokestatic Zj : (Lburp/Zstu;Lburp/Zr_4;)Lburp/Zstu;
    //   627: astore #10
    //   629: aload #5
    //   631: sipush #-7859
    //   634: sipush #-26699
    //   637: invokestatic a : (II)Ljava/lang/String;
    //   640: invokeinterface Zi : (Ljava/lang/String;)Lburp/Zstu;
    //   645: aload_3
    //   646: invokestatic Zj : (Lburp/Zstu;Lburp/Zr_4;)Lburp/Zstu;
    //   649: astore #11
    //   651: aload #10
    //   653: ifnonnull -> 668
    //   656: aload #11
    //   658: ifnonnull -> 668
    //   661: goto -> 684
    //   664: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   667: athrow
    //   668: aload #9
    //   670: aload #11
    //   672: aload #10
    //   674: invokeinterface Zo : (Lburp/Zstu;Lburp/Zstu;)V
    //   679: iload #4
    //   681: ifeq -> 607
    //   684: aload #6
    //   686: aload #9
    //   688: invokeinterface ZD : (Lburp/Zxo;)V
    //   693: new java/util/ArrayList
    //   696: dup
    //   697: invokespecial <init> : ()V
    //   700: astore #10
    //   702: sipush #-7857
    //   705: sipush #-15460
    //   708: invokestatic a : (II)Ljava/lang/String;
    //   711: aload #5
    //   713: aload_1
    //   714: invokestatic Za : (Ljava/lang/String;Lburp/Zgyp;Lburp/Zbnt;)Lburp/Zmzk;
    //   717: astore #11
    //   719: aload #11
    //   721: ifnonnull -> 727
    //   724: goto -> 742
    //   727: aload #10
    //   729: aload #11
    //   731: invokeinterface add : (Ljava/lang/Object;)Z
    //   736: pop
    //   737: iload #4
    //   739: ifeq -> 702
    //   742: aload #10
    //   744: invokeinterface size : ()I
    //   749: ifle -> 811
    //   752: aload_3
    //   753: new burp/Zguz
    //   756: dup
    //   757: getstatic burp/Zmzk.Zj : Lburp/Zeu4;
    //   760: invokespecial <init> : (Lburp/Zeu4;)V
    //   763: aload #10
    //   765: invokeinterface size : ()I
    //   770: invokeinterface Zv : (Lburp/Zllg;I)Lburp/Ze34;
    //   775: checkcast burp/Zrte
    //   778: astore #11
    //   780: aload #11
    //   782: aload #10
    //   784: iconst_0
    //   785: anewarray burp/Zmzk
    //   788: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   793: checkcast [Lburp/Zmzk;
    //   796: invokeinterface ZP : ([Lburp/Zgpi;)Lburp/Zrte;
    //   801: pop
    //   802: aload #6
    //   804: aload #11
    //   806: invokeinterface ZH : (Lburp/Zrte;)V
    //   811: aload #6
    //   813: aload #5
    //   815: sipush #-7842
    //   818: sipush #26347
    //   821: invokestatic a : (II)Ljava/lang/String;
    //   824: invokeinterface ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   829: invokeinterface Zxg : (Ljava/lang/String;)V
    //   834: aload #5
    //   836: sipush #-7855
    //   839: sipush #-5710
    //   842: invokestatic a : (II)Ljava/lang/String;
    //   845: invokeinterface ZM : (Ljava/lang/String;)Ljava/lang/Integer;
    //   850: astore #11
    //   852: aload #11
    //   854: ifnull -> 909
    //   857: aload #11
    //   859: invokevirtual byteValue : ()B
    //   862: iflt -> 909
    //   865: goto -> 872
    //   868: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   871: athrow
    //   872: aload #11
    //   874: invokevirtual byteValue : ()B
    //   877: invokestatic ZB : ()I
    //   880: if_icmpge -> 909
    //   883: goto -> 890
    //   886: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   889: athrow
    //   890: aload #6
    //   892: aload #11
    //   894: invokevirtual byteValue : ()B
    //   897: invokeinterface ZB : (B)V
    //   902: goto -> 909
    //   905: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   908: athrow
    //   909: aload #5
    //   911: invokeinterface ZE : ()V
    //   916: aload #6
    //   918: areturn
    // Exception table:
    //   from	to	target	type
    //   15	22	22	java/io/IOException
    //   186	194	194	java/io/IOException
    //   656	664	664	java/io/IOException
    //   852	865	868	java/io/IOException
    //   857	883	886	java/io/IOException
    //   872	902	905	java/io/IOException
  }
  
  private static Zstu Zj(Zstu paramZstu, Zr_4 paramZr_4) {
    return (paramZstu != null) ? paramZstu.Zp(paramZr_4) : null;
  }
  
  public static Zznf ZR(String paramString, Zgyp paramZgyp, Zr_4 paramZr_4) throws IOException, Ze27 {
    boolean bool = Zs7w.ZX();
    Zgyp zgyp = paramZgyp.Zm(paramString);
    try {
      if (zgyp == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ArrayList<Boolean> arrayList1 = new ArrayList();
    do {
      Boolean bool1 = zgyp.Zq("g");
      if (bool1 == null)
        break; 
      arrayList1.add(bool1);
    } while (bool);
    boolean[] arrayOfBoolean1 = null;
    if (arrayList1.size() > 0) {
      arrayOfBoolean1 = new boolean[arrayList1.size()];
      byte b = 0;
      while (b < arrayOfBoolean1.length) {
        arrayOfBoolean1[b] = ((Boolean)arrayList1.get(b)).booleanValue();
        b++;
        if (!bool)
          break; 
      } 
    } 
    ArrayList<Zstu> arrayList = new ArrayList();
    do {
      byte[] arrayOfByte = zgyp.ZI("a");
      if (arrayOfByte == null)
        break; 
      if (arrayOfByte == Zgyp.Zm)
        arrayOfByte = null; 
      Zstu zstu = paramZr_4.ZZ(arrayOfByte);
      arrayList.add(zstu);
    } while (bool);
    Zrte<Zstu> zrte = paramZr_4.<Zrte>Zv((Zllg)new Zguz<>(Zstu.Zc), arrayList.size());
    try {
      if (arrayList.size() > 0)
        zrte.ZP(arrayList.<Zstu>toArray(new Zstu[0])); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ArrayList<Boolean> arrayList2 = new ArrayList();
    do {
      Boolean bool1 = zgyp.Zq("p");
      if (bool1 == null)
        break; 
      arrayList2.add(bool1);
    } while (bool);
    boolean[] arrayOfBoolean2 = null;
    if (arrayList2.size() > 0) {
      arrayOfBoolean2 = new boolean[arrayList2.size()];
      byte b = 0;
      while (b < arrayOfBoolean2.length) {
        arrayOfBoolean2[b] = ((Boolean)arrayList2.get(b)).booleanValue();
        b++;
        if (!bool)
          break; 
      } 
    } 
    Zznf zznf = paramZr_4.<Zznf>ZH(new Zeul());
    zznf.Zk(Zkv.Za(arrayOfBoolean1));
    zznf.ZV(zrte);
    zznf.ZY(Zkv.Zm(arrayOfBoolean2));
    zgyp.ZE();
    return zznf;
  }
  
  public static Zmuy Zs(String paramString, Zgyp paramZgyp, Zr_d paramZr_d, Zbnt paramZbnt, Zr_4 paramZr_4, Zefg<Zzrc> paramZefg, Zg2c paramZg2c, Zg03 paramZg03, Zb0h paramZb0h, Zeo4 paramZeo4, Zlee paramZlee, int paramInt, Zbws paramZbws) throws IOException, Ze27 {
    Integer integer;
    boolean bool = Zs7w.Zw();
    Zgyp zgyp = paramZgyp.Zm(paramString);
    try {
      if (zgyp == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zmuy zmuy = new Zmuy(paramZr_4, paramZefg, paramZg2c, paramZb0h, paramZg03, paramZeo4, paramZlee, paramInt, paramZbws);
    do {
      String str = "c";
      integer = zgyp.ZM(str);
      if (integer == null)
        break; 
      zgyp.ZM(str);
    } while (!bool);
    String str1 = "m";
    do {
      integer = zgyp.ZM(str1);
    } while (integer != null && !bool);
    ArrayList<Boolean> arrayList = new ArrayList();
    String str2 = "v";
    do {
      Boolean bool1 = zgyp.Zq(str2);
      if (bool1 == null)
        break; 
      arrayList.add(bool1);
    } while (!bool);
    String str3 = a(-7871, 62);
    zgyp.ZM(str3);
    do {
      Zgxp zgxp = ZY(zgyp, paramZbnt, paramZr_d.ZG(), paramZr_4);
      if (zgxp == null)
        break; 
      paramZg03.ZL(zgxp);
    } while (!bool);
    zgyp.ZM(a(-7861, 26800));
    zgyp.Zq(a(-7851, -10370));
    zgyp.ZE();
    zmuy.fireTableStructureChanged();
    return zmuy;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '{ÈÎê'UÝ½0+ZæP>« [C½×q\\ty­a5¸»êÔäÓkÜV£8ÉdO ZVB»Õ&òU4\\b0â%â\\rÏ-Õ5'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #25
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
    //   67: ldc 'iæ"'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_2
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #103
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
    //   127: putstatic burp/Zx6k.a : [Ljava/lang/String;
    //   130: bipush #28
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zx6k.b : [Ljava/lang/String;
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
    //   212: bipush #113
    //   214: goto -> 244
    //   217: bipush #109
    //   219: goto -> 244
    //   222: bipush #88
    //   224: goto -> 244
    //   227: bipush #59
    //   229: goto -> 244
    //   232: bipush #66
    //   234: goto -> 244
    //   237: bipush #76
    //   239: goto -> 244
    //   242: bipush #9
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
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE159) & 0xFFFF;
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
      byte b1 = 100;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx6k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */