package burp;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zzc;

public class Zb49 {
  private final Socket ZP;
  
  private final Zbw_<?> ZF;
  
  private final Zzea Zg;
  
  private final Zzbm ZK;
  
  private Exception Zl;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb49(Socket paramSocket, Zbw_<?> paramZbw_) throws IOException {
    this(paramSocket, paramZbw_, new Zxc3());
  }
  
  public Zb49(Socket paramSocket, Zbw_<?> paramZbw_, Zzbm paramZzbm) throws IOException {
    this.ZP = paramSocket;
    this.ZF = paramZbw_;
    this.Zg = new Zzea(true);
    this.ZK = paramZzbm;
  }
  
  public boolean ZM(String paramString) throws IOException {
    // Byte code:
    //   0: invokestatic Zj : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZF : Lburp/Zbw_;
    //   8: invokeinterface ZFM : ()Lburp/Zekl;
    //   13: invokeinterface Zl9 : ()Z
    //   18: ifeq -> 27
    //   21: iconst_0
    //   22: ireturn
    //   23: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: getstatic burp/Zrrh.PROXY_IN_BROWSER_INTERFACE_ACCESSED : Lburp/Zrrh;
    //   30: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   33: aload_1
    //   34: ldc '/'
    //   36: invokevirtual equals : (Ljava/lang/Object;)Z
    //   39: ifeq -> 57
    //   42: aload_0
    //   43: invokevirtual Zr : ()V
    //   46: aload_2
    //   47: ifnonnull -> 846
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_1
    //   58: sipush #-20358
    //   61: sipush #7201
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: invokevirtual equals : (Ljava/lang/Object;)Z
    //   70: ifeq -> 95
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: aload_0
    //   81: invokevirtual Z_ : ()V
    //   84: aload_2
    //   85: ifnonnull -> 846
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   94: athrow
    //   95: aload_1
    //   96: sipush #-20371
    //   99: sipush #-14252
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: invokevirtual equals : (Ljava/lang/Object;)Z
    //   108: ifeq -> 139
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: getstatic burp/Zrrh.PROXY_IN_BROWSER_INTERFACE_CERTIFICATE_DOWNLOADED : Lburp/Zrrh;
    //   121: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   124: aload_0
    //   125: invokevirtual ZM : ()V
    //   128: aload_2
    //   129: ifnonnull -> 846
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: aload_1
    //   140: sipush #-20353
    //   143: sipush #-11032
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: invokevirtual equals : (Ljava/lang/Object;)Z
    //   152: ifeq -> 183
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   161: athrow
    //   162: getstatic burp/Zrrh.PROXY_IN_BROWSER_INTERFACE_CERTIFICATE_DOWNLOADED : Lburp/Zrrh;
    //   165: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   168: aload_0
    //   169: invokevirtual Zz : ()V
    //   172: aload_2
    //   173: ifnonnull -> 846
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: aload_1
    //   184: sipush #-20365
    //   187: sipush #31102
    //   190: invokestatic a : (II)Ljava/lang/String;
    //   193: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   196: ifeq -> 222
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   205: athrow
    //   206: aload_0
    //   207: aload_1
    //   208: invokevirtual Zq : (Ljava/lang/String;)V
    //   211: aload_2
    //   212: ifnonnull -> 846
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   221: athrow
    //   222: aload_1
    //   223: sipush #-20377
    //   226: sipush #-15825
    //   229: invokestatic a : (II)Ljava/lang/String;
    //   232: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   235: ifeq -> 261
    //   238: goto -> 245
    //   241: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   244: athrow
    //   245: aload_0
    //   246: aload_1
    //   247: invokevirtual ZX : (Ljava/lang/String;)V
    //   250: aload_2
    //   251: ifnonnull -> 846
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   260: athrow
    //   261: aload_1
    //   262: sipush #-20362
    //   265: sipush #-7035
    //   268: invokestatic a : (II)Ljava/lang/String;
    //   271: invokevirtual equals : (Ljava/lang/Object;)Z
    //   274: ifne -> 307
    //   277: goto -> 284
    //   280: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   283: athrow
    //   284: aload_1
    //   285: sipush #-20376
    //   288: sipush #-16992
    //   291: invokestatic a : (II)Ljava/lang/String;
    //   294: invokevirtual equals : (Ljava/lang/Object;)Z
    //   297: ifeq -> 322
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   306: athrow
    //   307: aload_0
    //   308: invokevirtual Zs : ()V
    //   311: aload_2
    //   312: ifnonnull -> 846
    //   315: goto -> 322
    //   318: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   321: athrow
    //   322: aload_1
    //   323: sipush #-20354
    //   326: sipush #-18563
    //   329: invokestatic a : (II)Ljava/lang/String;
    //   332: invokevirtual equals : (Ljava/lang/Object;)Z
    //   335: ifne -> 368
    //   338: goto -> 345
    //   341: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   344: athrow
    //   345: aload_1
    //   346: sipush #-20381
    //   349: sipush #-24176
    //   352: invokestatic a : (II)Ljava/lang/String;
    //   355: invokevirtual equals : (Ljava/lang/Object;)Z
    //   358: ifeq -> 383
    //   361: goto -> 368
    //   364: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   367: athrow
    //   368: aload_0
    //   369: invokevirtual Zs : ()V
    //   372: aload_2
    //   373: ifnonnull -> 846
    //   376: goto -> 383
    //   379: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   382: athrow
    //   383: aload_1
    //   384: sipush #-20414
    //   387: sipush #-4014
    //   390: invokestatic a : (II)Ljava/lang/String;
    //   393: invokevirtual equals : (Ljava/lang/Object;)Z
    //   396: ifne -> 429
    //   399: goto -> 406
    //   402: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   405: athrow
    //   406: aload_1
    //   407: sipush #-20408
    //   410: sipush #-26053
    //   413: invokestatic a : (II)Ljava/lang/String;
    //   416: invokevirtual equals : (Ljava/lang/Object;)Z
    //   419: ifeq -> 444
    //   422: goto -> 429
    //   425: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   428: athrow
    //   429: aload_0
    //   430: invokevirtual Zs : ()V
    //   433: aload_2
    //   434: ifnonnull -> 846
    //   437: goto -> 444
    //   440: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   443: athrow
    //   444: aload_1
    //   445: sipush #-20379
    //   448: sipush #8121
    //   451: invokestatic a : (II)Ljava/lang/String;
    //   454: invokevirtual equals : (Ljava/lang/Object;)Z
    //   457: ifne -> 490
    //   460: goto -> 467
    //   463: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   466: athrow
    //   467: aload_1
    //   468: sipush #-20372
    //   471: sipush #28089
    //   474: invokestatic a : (II)Ljava/lang/String;
    //   477: invokevirtual equals : (Ljava/lang/Object;)Z
    //   480: ifeq -> 505
    //   483: goto -> 490
    //   486: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   489: athrow
    //   490: aload_0
    //   491: invokevirtual Zs : ()V
    //   494: aload_2
    //   495: ifnonnull -> 846
    //   498: goto -> 505
    //   501: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   504: athrow
    //   505: aload_1
    //   506: sipush #-20370
    //   509: sipush #-12376
    //   512: invokestatic a : (II)Ljava/lang/String;
    //   515: invokevirtual equals : (Ljava/lang/Object;)Z
    //   518: ifne -> 551
    //   521: goto -> 528
    //   524: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   527: athrow
    //   528: aload_1
    //   529: sipush #-20409
    //   532: sipush #29308
    //   535: invokestatic a : (II)Ljava/lang/String;
    //   538: invokevirtual equals : (Ljava/lang/Object;)Z
    //   541: ifeq -> 566
    //   544: goto -> 551
    //   547: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   550: athrow
    //   551: aload_0
    //   552: invokevirtual Zs : ()V
    //   555: aload_2
    //   556: ifnonnull -> 846
    //   559: goto -> 566
    //   562: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   565: athrow
    //   566: aload_1
    //   567: sipush #-20357
    //   570: sipush #16126
    //   573: invokestatic a : (II)Ljava/lang/String;
    //   576: invokevirtual equals : (Ljava/lang/Object;)Z
    //   579: ifne -> 612
    //   582: goto -> 589
    //   585: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   588: athrow
    //   589: aload_1
    //   590: sipush #-20384
    //   593: sipush #20068
    //   596: invokestatic a : (II)Ljava/lang/String;
    //   599: invokevirtual equals : (Ljava/lang/Object;)Z
    //   602: ifeq -> 627
    //   605: goto -> 612
    //   608: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   611: athrow
    //   612: aload_0
    //   613: invokevirtual Zs : ()V
    //   616: aload_2
    //   617: ifnonnull -> 846
    //   620: goto -> 627
    //   623: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   626: athrow
    //   627: aload_1
    //   628: sipush #-20380
    //   631: sipush #1425
    //   634: invokestatic a : (II)Ljava/lang/String;
    //   637: invokevirtual equals : (Ljava/lang/Object;)Z
    //   640: ifeq -> 665
    //   643: goto -> 650
    //   646: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   649: athrow
    //   650: aload_0
    //   651: invokevirtual Zs : ()V
    //   654: aload_2
    //   655: ifnonnull -> 846
    //   658: goto -> 665
    //   661: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   664: athrow
    //   665: aload_1
    //   666: sipush #-20405
    //   669: sipush #25363
    //   672: invokestatic a : (II)Ljava/lang/String;
    //   675: invokevirtual equals : (Ljava/lang/Object;)Z
    //   678: ifeq -> 703
    //   681: goto -> 688
    //   684: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   687: athrow
    //   688: aload_0
    //   689: invokevirtual Zs : ()V
    //   692: aload_2
    //   693: ifnonnull -> 846
    //   696: goto -> 703
    //   699: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   702: athrow
    //   703: aload_1
    //   704: sipush #-20359
    //   707: sipush #-16569
    //   710: invokestatic a : (II)Ljava/lang/String;
    //   713: invokevirtual equals : (Ljava/lang/Object;)Z
    //   716: ifeq -> 741
    //   719: goto -> 726
    //   722: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   725: athrow
    //   726: aload_0
    //   727: invokevirtual Zs : ()V
    //   730: aload_2
    //   731: ifnonnull -> 846
    //   734: goto -> 741
    //   737: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   740: athrow
    //   741: aload_1
    //   742: sipush #-20416
    //   745: sipush #24308
    //   748: invokestatic a : (II)Ljava/lang/String;
    //   751: invokevirtual equals : (Ljava/lang/Object;)Z
    //   754: ifeq -> 779
    //   757: goto -> 764
    //   760: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   763: athrow
    //   764: aload_0
    //   765: invokevirtual Zs : ()V
    //   768: aload_2
    //   769: ifnonnull -> 846
    //   772: goto -> 779
    //   775: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   778: athrow
    //   779: aload_1
    //   780: sipush #-20413
    //   783: sipush #-11479
    //   786: invokestatic a : (II)Ljava/lang/String;
    //   789: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   792: ifne -> 825
    //   795: goto -> 802
    //   798: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   801: athrow
    //   802: aload_1
    //   803: sipush #-20360
    //   806: sipush #-11746
    //   809: invokestatic a : (II)Ljava/lang/String;
    //   812: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   815: ifeq -> 840
    //   818: goto -> 825
    //   821: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   824: athrow
    //   825: aload_0
    //   826: invokevirtual Zs : ()V
    //   829: aload_2
    //   830: ifnonnull -> 846
    //   833: goto -> 840
    //   836: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   839: athrow
    //   840: iconst_0
    //   841: ireturn
    //   842: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   845: athrow
    //   846: aload_0
    //   847: getfield ZP : Ljava/net/Socket;
    //   850: invokevirtual getOutputStream : ()Ljava/io/OutputStream;
    //   853: aload_0
    //   854: getfield Zg : Lburp/Zzea;
    //   857: invokevirtual ZZ : ()[B
    //   860: invokevirtual write : ([B)V
    //   863: aload_0
    //   864: getfield ZP : Ljava/net/Socket;
    //   867: invokevirtual close : ()V
    //   870: iconst_1
    //   871: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	23	23	java/io/IOException
    //   27	50	53	java/io/IOException
    //   42	73	76	java/io/IOException
    //   57	88	91	java/io/IOException
    //   80	111	114	java/io/IOException
    //   95	132	135	java/io/IOException
    //   118	155	158	java/io/IOException
    //   139	176	179	java/io/IOException
    //   162	199	202	java/io/IOException
    //   183	215	218	java/io/IOException
    //   206	238	241	java/io/IOException
    //   222	254	257	java/io/IOException
    //   245	277	280	java/io/IOException
    //   261	300	303	java/io/IOException
    //   284	315	318	java/io/IOException
    //   307	338	341	java/io/IOException
    //   322	361	364	java/io/IOException
    //   345	376	379	java/io/IOException
    //   368	399	402	java/io/IOException
    //   383	422	425	java/io/IOException
    //   406	437	440	java/io/IOException
    //   429	460	463	java/io/IOException
    //   444	483	486	java/io/IOException
    //   467	498	501	java/io/IOException
    //   490	521	524	java/io/IOException
    //   505	544	547	java/io/IOException
    //   528	559	562	java/io/IOException
    //   551	582	585	java/io/IOException
    //   566	605	608	java/io/IOException
    //   589	620	623	java/io/IOException
    //   612	643	646	java/io/IOException
    //   627	658	661	java/io/IOException
    //   650	681	684	java/io/IOException
    //   665	696	699	java/io/IOException
    //   688	719	722	java/io/IOException
    //   703	734	737	java/io/IOException
    //   726	757	760	java/io/IOException
    //   741	772	775	java/io/IOException
    //   764	795	798	java/io/IOException
    //   779	818	821	java/io/IOException
    //   802	833	836	java/io/IOException
    //   825	842	842	java/io/IOException
  }
  
  public boolean Z_(String paramString) throws IOException {
    try {
      if (paramString != null) {
        try {
          if (paramString.length() <= 1)
            return false; 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str1 = paramString.substring(1);
    try {
      if (!Zljs.Zq(str1))
        return false; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str2 = Zzc.ZL(str1);
    try {
      if (!str2.equals(a(-20375, -25987)))
        try {
          if (Zy(str2)) {
            this.ZK.ZX(str2);
            this.Zg.Zf(Zkb.Zy(a(-20363, -19389)));
            this.ZP.getOutputStream().write(this.Zg.ZZ());
            this.ZP.close();
            return true;
          } 
          return false;
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return false;
  }
  
  private void Zr() throws IOException {
    this.Zg.ZQ(Zxse.ZI);
  }
  
  private void Z_() throws IOException {
    byte[] arrayOfByte = Zgyo.ZJ(a(-20367, -19107));
    this.Zg.ZY(a(-20355, 16886), Objects.<byte[]>requireNonNull(arrayOfByte));
  }
  
  private void ZM() throws IOException {
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    try {
      arrayOfByte1 = Zbng.ZQ();
      arrayOfByte2 = Zkb.Zy(a(-20411, 16172) + a(-20411, 16172) + arrayOfByte1.length);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      ZG(exception);
      return;
    } 
    this.Zg.Zf(arrayOfByte2);
    this.Zg.Zf(arrayOfByte1);
  }
  
  private void Zz() throws IOException {
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    try {
      arrayOfByte1 = Zbng.Zf();
      arrayOfByte2 = Zkb.Zy(a(-20373, 7003) + a(-20373, 7003) + arrayOfByte1.length);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      ZG(exception);
      return;
    } 
    this.Zg.Zf(arrayOfByte2);
    this.Zg.Zf(arrayOfByte1);
  }
  
  private void ZX(String paramString) throws IOException {
    Zm_v zm_v;
    try {
      zm_v = this.ZF.ZFC().Zs(paramString, null);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      ZG(exception);
      return;
    } 
    try {
      if (zm_v.ZC == null) {
        this.Zg.ZQ(Zxse.ZA);
        return;
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    ArrayList<Zc7> arrayList = new ArrayList();
    arrayList.add(new Zc7(Zl2w.SUBMIT, a(-20364, -21318), a(-20361, 13251)));
    arrayList.add(new Zc7(Zl2w.HIDDEN, a(-20407, -11359), paramString));
    ZI(a(-20412, -28470), zm_v.ZC, (List)arrayList);
  }
  
  private void Zq(String paramString) throws IOException {
    Zruh zruh;
    String[] arrayOfString = Zmkr.Zj();
    try {
      zruh = this.ZF.ZFW().ZB(paramString, null);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      ZG(exception);
      return;
    } 
    try {
      if (zruh.ZB == null) {
        this.ZF.ZFW().ZP(this.ZP, paramString, null);
        if (arrayOfString == null) {
          ArrayList<Zc7> arrayList1 = new ArrayList();
          arrayList1.add(new Zc7(Zl2w.SUBMIT, a(-20382, 7919), a(-20383, 10309)));
          arrayList1.add(new Zc7(Zl2w.HIDDEN, a(-20415, -20041), paramString));
          ZI(a(-20368, 9421), zruh.ZB, (List)arrayList1);
          return;
        } 
        return;
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    ArrayList<Zc7> arrayList = new ArrayList();
    arrayList.add(new Zc7(Zl2w.SUBMIT, a(-20382, 7919), a(-20383, 10309)));
    arrayList.add(new Zc7(Zl2w.HIDDEN, a(-20415, -20041), paramString));
    ZI(a(-20368, 9421), zruh.ZB, (List)arrayList);
  }
  
  private void Zs() throws IOException {
    byte[] arrayOfByte = Zkb.Zy(a(-20369, -6072));
    this.Zg.Zf(arrayOfByte);
  }
  
  private void ZI(String paramString, Zlit paramZlit, List<Zmwr> paramList) throws IOException {
    String str = Zti5.ZJ((byte)1, paramZlit.toString(), paramList);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(-20374, -31625)).append(paramString).append(a(-20378, 7497));
    stringBuilder.append(a(-20406, 13359));
    stringBuilder.append(str);
    stringBuilder.append(a(-20356, 6452));
    byte[] arrayOfByte = Zkb.Zy(stringBuilder.toString());
    this.Zg.ZQ(arrayOfByte);
  }
  
  private void ZG(Exception paramException) {
    // Byte code:
    //   0: invokestatic Zj : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Zl : Ljava/lang/Exception;
    //   9: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   12: astore_3
    //   13: aload_1
    //   14: instanceof java/lang/NumberFormatException
    //   17: ifne -> 48
    //   20: aload_1
    //   21: instanceof java/io/IOException
    //   24: ifne -> 48
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: aload_1
    //   35: instanceof burp/Zg9k
    //   38: ifeq -> 56
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   51: astore_3
    //   52: aload_2
    //   53: ifnonnull -> 74
    //   56: aload_1
    //   57: instanceof java/lang/IndexOutOfBoundsException
    //   60: ifeq -> 74
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   73: astore_3
    //   74: aload_1
    //   75: aload_3
    //   76: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   79: aload_0
    //   80: getfield Zg : Lburp/Zzea;
    //   83: getstatic burp/Zxse.ZA : [B
    //   86: invokevirtual ZQ : ([B)V
    //   89: goto -> 100
    //   92: astore_3
    //   93: aload_3
    //   94: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   97: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   100: return
    // Exception table:
    //   from	to	target	type
    //   4	89	92	java/lang/Exception
    //   13	27	30	java/lang/Exception
    //   20	41	44	java/lang/Exception
    //   52	63	66	java/lang/Exception
  }
  
  private boolean Zy(String paramString) {
    return Zep6.ZC(paramString);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #44
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÓÌÔè:G¿z4ü{`#¾G,]!5[·ZôÍåxÿé.ê=XuöT]IÐ"î\\r@£XíFoM«'[6¢Bí(\\bívEÀ?¡É\\t=Ø\\f«CôN·+:Dë :çh¾ÁõÔS®9XÀá½hÈ ÷¥òß´7#±}ÏGÜ qÝSÉS&Y}Lw'¿ÌÚc¿\\nõ¾B¤OY,Fô!= 5õaª:ìË¶05Ý¦8+þ|/&bý:rÔ&!óqÒ IÛ£­ãJ5ì<(û#¼Î{<\\n¦éfÆX\\n4Ã\\f \®*~R\\bZ¡÷ÐóQ]Î[ï(ă,ÃÇ´2[1\\r2ÎÇÕ\\rDÑÕEÏþ¹Þg²¾;ûÇñî`ÞµÀ}XöCpj}£Ï&ßµ¤c{­J[º3O!hðÅß-äM@nmÖÇÝAõðú á."\\të\±AlÉÏ!¥4+.ô#û2ÊÍ½>LÎèÜ©Y×9+ üÚàYÛ:2ð¬¨á5ÂpÞ&æÿ ÎJyï_\\bkB«~KEñ1XF¢#j»XVÙ7Áeû×ÇÏ<Wö ù}¬yóÛÁ`æ~ÕNè®³Ïg¥£®Ù\\tðúÑ0CnFè¾ÈiÛ°Ów'SíoQÈ¾Ëè3Xz¶r©;áä6îî(í,¶\\r\\fÛ+(ã:5lÂçÊñÄðûlÙ¦¿úä5ê4ÃüÏ-çK\\rG\\bR[|ü©¶×h2}b´²Ôèãr\\f\\r]¶êZ\\bÝêÃÎcý#ý¨uØÙ÷·êF2I¿Ê\\tdÎkX\\füíc#sÖûªû§$6¨|FÚ^´PhÖ¸öÉ×áÿ[¯O\\f±7ÊùFçYP6m \\r¾Ü+àxÔýx¸¿*]ÿ\\tºÑ4#¡Q,:ZÐR\\bÚ0U\\rL Óý¬yuÓÛÍ°ýÁ:vÛ¾?+_Ä^5¼h! @¬IlÖ;àpÙ-.^¤ã` ÿÚ<ótqrý7½\\fâeO®Ëø£z.\\n sçh¦r\\t2ÈºbJ»rpÖ%#ÝÖËguxvÌõ£²Øwô¢YÀõT)ÄìÉk:Ð¨yÆ\\noç#³ôN¡'ÿü½!­Ú´U¸Ë;>­\\nÂ¬lÆÛ§ËÜä_\\b\\rÉKõÜéÄë&#«ÿô"ã6EÙc|ØÞ3¬%õãm|½ü°RvM¹ØÞ¸_\\nwUÐÅ´4½ÏTþñYÔèe¾Ð~öÅ+\\nÞvbÿ_$Å\ÙRãµìÊsãÏøV×ÜèCñ{ÃàMÉëë\\bÙç{}³Z&_KÝP[¹üûú\\tB§ù³[m[;ó.Läïÿî\\n© õ[òNPmé¦,5*¢ß_\\n?Âä8¦Þ&|Uô âÛ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #12
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #127
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
    //   68: ldc '¾M®(¦·BWÄûy¼ÓÏÏÀ!æÇ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #12
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #120
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
    //   129: putstatic burp/Zb49.a : [Ljava/lang/String;
    //   132: bipush #44
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb49.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #84
    //   214: goto -> 243
    //   217: bipush #7
    //   219: goto -> 243
    //   222: bipush #77
    //   224: goto -> 243
    //   227: bipush #50
    //   229: goto -> 243
    //   232: iconst_2
    //   233: goto -> 243
    //   236: bipush #112
    //   238: goto -> 243
    //   241: bipush #67
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
    int i = (paramInt1 ^ 0xFFFFB062) & 0xFFFF;
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
      byte b1 = 71;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb49.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */