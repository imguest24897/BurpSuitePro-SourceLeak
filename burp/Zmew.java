package burp;

import java.util.Comparator;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmew extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmew() {
    super(EnumSet.of(Zzqz.FLAGS, Zzqz.VARIANT));
  }
  
  public Comparator<Zgkc> ZC() {
    return new Zma3();
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    if (paramByte1 == 1)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    ZA(paramZvs, paramZtub, paramZefg, paramArrayOfbyte, paramByte2, stringBuilder);
    Zr20 zr20 = (new Zek1(stringBuilder, paramZefg)).ZO(paramByte1, paramInt, paramZtlj);
    paramZtub.Zj(zr20::lambda$buildIssueDetail$0);
    Zr(stringBuilder, paramZtlj.Zs());
    ZD(stringBuilder, paramInt, Zmey.ZS(paramZefg));
    Ztsn.ZV(paramZtub, stringBuilder);
    return stringBuilder.toString();
  }
  
  private static void ZA(Zvs paramZvs, Ztub paramZtub, Zefg<Zxtl> paramZefg, byte[] paramArrayOfbyte, byte paramByte, StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: aload #5
    //   2: sipush #-13357
    //   5: sipush #3117
    //   8: invokestatic a : (II)Ljava/lang/String;
    //   11: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14: pop
    //   15: invokestatic Zm : ()[Ljava/lang/String;
    //   18: aload #5
    //   20: aload_2
    //   21: iconst_1
    //   22: iconst_1
    //   23: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   26: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: pop
    //   30: astore #6
    //   32: iload #4
    //   34: iconst_1
    //   35: if_icmpne -> 58
    //   38: aload #5
    //   40: sipush #-13359
    //   43: sipush #-31001
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload #6
    //   55: ifnonnull -> 73
    //   58: aload #5
    //   60: sipush #-13352
    //   63: sipush #264
    //   66: invokestatic a : (II)Ljava/lang/String;
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload #5
    //   75: sipush #-13360
    //   78: sipush #23955
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: aload_0
    //   89: getstatic burp/Zzu2.SQL_INJECTION_2ND_ORDER : Lburp/Zzu2;
    //   92: if_acmpne -> 322
    //   95: new burp/Zr28
    //   98: dup
    //   99: invokespecial <init> : ()V
    //   102: astore #7
    //   104: aload_1
    //   105: aload #7
    //   107: invokevirtual Zt : (Lburp/Zr9a;)V
    //   110: aload #7
    //   112: getfield Zz : Lburp/Zrp9;
    //   115: astore #8
    //   117: aload #8
    //   119: invokeinterface Zvh : ()Lburp/Zzi8;
    //   124: invokeinterface Zod : ()Lburp/Zmzk;
    //   129: astore #9
    //   131: aload #8
    //   133: invokeinterface ZvU : ()Lburp/Zzi8;
    //   138: invokeinterface Zod : ()Lburp/Zmzk;
    //   143: astore #10
    //   145: aload #5
    //   147: sipush #-13345
    //   150: sipush #13459
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: sipush #-13349
    //   162: sipush #-28038
    //   165: invokestatic a : (II)Ljava/lang/String;
    //   168: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: pop
    //   172: aload #9
    //   174: aload #10
    //   176: invokeinterface equals : (Ljava/lang/Object;)Z
    //   181: ifne -> 219
    //   184: aload #5
    //   186: sipush #-13353
    //   189: sipush #-11536
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: aload #9
    //   200: invokestatic Zh : (Lburp/Zmzk;)Ljava/lang/String;
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: sipush #-13348
    //   209: sipush #-287
    //   212: invokestatic a : (II)Ljava/lang/String;
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: pop
    //   219: aload #5
    //   221: aload #8
    //   223: invokeinterface Zvs : ()[B
    //   228: invokestatic ZG : ([B)Ljava/lang/String;
    //   231: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: sipush #-13372
    //   237: sipush #24108
    //   240: invokestatic a : (II)Ljava/lang/String;
    //   243: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: pop
    //   247: aload #9
    //   249: aload #10
    //   251: invokeinterface equals : (Ljava/lang/Object;)Z
    //   256: ifne -> 294
    //   259: aload #5
    //   261: sipush #-13367
    //   264: sipush #14764
    //   267: invokestatic a : (II)Ljava/lang/String;
    //   270: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: aload #10
    //   275: invokestatic Zh : (Lburp/Zmzk;)Ljava/lang/String;
    //   278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: sipush #-13376
    //   284: sipush #-32687
    //   287: invokestatic a : (II)Ljava/lang/String;
    //   290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: pop
    //   294: aload #5
    //   296: aload #8
    //   298: invokeinterface ZvM : ()[B
    //   303: invokestatic ZG : ([B)Ljava/lang/String;
    //   306: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: sipush #-13374
    //   312: sipush #-19136
    //   315: invokestatic a : (II)Ljava/lang/String;
    //   318: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: pop
    //   322: return
  }
  
  public String Zt(Zvs paramZvs, byte paramByte, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg) {
    if (paramByte == 1)
      return null; 
    paramInt |= Zgky.Zy(paramByte, paramZtlj);
    StringBuilder stringBuilder = new StringBuilder();
    if ((paramInt & 0x10) == 16 || (paramInt & 0x20) == 32)
      stringBuilder.append(a(-13355, -31156)); 
    if ((paramInt & 0x1) == 1) {
      stringBuilder.append(a(-13365, -27102));
      stringBuilder.append(Zg2x.ZM(paramZefg, true, false));
      if (Zmey.ZS(paramZefg))
        stringBuilder.append(a(-13361, 30290)); 
      stringBuilder.append(a(-13362, 23550));
    } 
    if ((paramInt & 0x2) == 2)
      stringBuilder.append(a(-13350, -31652)); 
    String str = stringBuilder.toString();
    if ("".equals(str))
      str = null; 
    return str;
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    Zl4m zl4m = ZR(paramZrdb1, paramZrdb2, paramZz1h);
    if (!Zl4m.ZJ(zl4m))
      return zl4m; 
    if (paramZrdb2.Zak() > paramZrdb1.Zak())
      paramZrdb1.Zq(paramZrdb2.Zak()); 
    if (paramZrdb2.Zaw() > paramZrdb1.Zaw())
      paramZrdb1.Zf(paramZrdb2.Zaw(), paramZrdb2.Zak()); 
    Zw(paramZrdb1, paramZrdb2);
    Zk(paramZrdb1, paramZrdb2);
    paramZrdb1.ZaH();
    return zl4m;
  }
  
  private static Zl4m ZR(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    return (paramZrdb2.Za6() != paramZrdb1.Za6() || Zmey.Zv(paramZrdb1, paramZrdb2)) ? Zl4m.ZX : ((Zs(paramZrdb1, paramZrdb2) && !ZR(paramZrdb1, paramZrdb2)) ? Zl4m.ZX : ZN(paramZrdb1, paramZrdb2, paramZz1h));
  }
  
  private static Zl4m ZN(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicBoolean
    //   3: dup
    //   4: iconst_0
    //   5: invokespecial <init> : (Z)V
    //   8: astore #4
    //   10: invokestatic Zm : ()[Ljava/lang/String;
    //   13: new java/util/concurrent/atomic/AtomicBoolean
    //   16: dup
    //   17: iconst_0
    //   18: invokespecial <init> : (Z)V
    //   21: astore #5
    //   23: new java/util/concurrent/atomic/AtomicBoolean
    //   26: dup
    //   27: iconst_0
    //   28: invokespecial <init> : (Z)V
    //   31: astore #6
    //   33: astore_3
    //   34: aload_1
    //   35: invokeinterface Za7 : ()Lburp/Ztub;
    //   40: aload_0
    //   41: aload_2
    //   42: aload #4
    //   44: aload #5
    //   46: aload #6
    //   48: <illegal opcode> accept : (Lburp/Zrdb;Lburp/Zz1h;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;)Ljava/util/function/Consumer;
    //   53: invokevirtual Zj : (Ljava/util/function/Consumer;)V
    //   56: aload #5
    //   58: invokevirtual get : ()Z
    //   61: ifeq -> 80
    //   64: aload_0
    //   65: invokeinterface ZaT : ()Lburp/Ztlj;
    //   70: aload_1
    //   71: invokeinterface ZaT : ()Lburp/Ztlj;
    //   76: aload_2
    //   77: invokevirtual Zd : (Lburp/Ztlj;Lburp/Zz1h;)V
    //   80: getstatic burp/Zl4m.Zh : Lburp/Zl4m;
    //   83: astore #7
    //   85: aload #6
    //   87: invokevirtual get : ()Z
    //   90: ifeq -> 116
    //   93: aload #5
    //   95: invokevirtual get : ()Z
    //   98: ifeq -> 107
    //   101: getstatic burp/Zl4m.Zu : Lburp/Zl4m;
    //   104: goto -> 110
    //   107: getstatic burp/Zl4m.ZY : Lburp/Zl4m;
    //   110: astore #7
    //   112: aload_3
    //   113: ifnonnull -> 171
    //   116: aload #4
    //   118: invokevirtual get : ()Z
    //   121: ifeq -> 141
    //   124: aload #5
    //   126: invokevirtual get : ()Z
    //   129: ifeq -> 141
    //   132: getstatic burp/Zl4m.ZU : Lburp/Zl4m;
    //   135: astore #7
    //   137: aload_3
    //   138: ifnonnull -> 171
    //   141: aload #4
    //   143: invokevirtual get : ()Z
    //   146: ifeq -> 158
    //   149: getstatic burp/Zl4m.Zw : Lburp/Zl4m;
    //   152: astore #7
    //   154: aload_3
    //   155: ifnonnull -> 171
    //   158: aload #5
    //   160: invokevirtual get : ()Z
    //   163: ifeq -> 171
    //   166: getstatic burp/Zl4m.Zu : Lburp/Zl4m;
    //   169: astore #7
    //   171: aload #7
    //   173: areturn
  }
  
  private static boolean Zo(Zrdb paramZrdb, int paramInt) {
    return ((paramZrdb.Zam() & paramInt) == paramInt);
  }
  
  private static boolean ZR(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    return ((Zo(paramZrdb1, 2048) && Zo(paramZrdb2, 4096)) || (Zo(paramZrdb1, 4096) && Zo(paramZrdb2, 2048)));
  }
  
  private static boolean Zs(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    return (Zm8m.Zo(paramZrdb1) && Zm8m.Zo(paramZrdb2) && paramZrdb1.Za7().Zr().Zub().Zsy() != paramZrdb2.Za7().Zr().Zub().Zsy());
  }
  
  private static void ZD(StringBuilder paramStringBuilder, int paramInt, boolean paramBoolean) {
    if ((paramInt & 0x1) == 1) {
      String str = paramBoolean ? a(-13347, 16395) : a(-13366, -25007);
      paramStringBuilder.append(a(-13364, 18857)).append(str).append(a(-13375, -11261));
    } 
    if ((paramInt & 0x2) == 2)
      paramStringBuilder.append(a(-13363, 6099)); 
    if ((paramInt & 0x4) == 4)
      paramStringBuilder.append(a(-13354, -24061)); 
  }
  
  private static void Zr(StringBuilder paramStringBuilder, byte paramByte) {
    String[] arrayOfString = Zgky.Zm();
    switch (paramByte) {
      case 0:
        if (arrayOfString == null);
        return;
      case 1:
        paramStringBuilder.append(a(-13368, 24879));
        if (arrayOfString == null);
        return;
      case 2:
        paramStringBuilder.append(a(-13373, -4685));
        if (arrayOfString == null);
        return;
      case 3:
        paramStringBuilder.append(a(-13346, -14573));
        if (arrayOfString == null);
        return;
      case 4:
        paramStringBuilder.append(a(-13351, -21147));
        if (arrayOfString == null);
        return;
      case 5:
        paramStringBuilder.append(a(-13356, -29326));
        if (arrayOfString == null);
        return;
      case 6:
        paramStringBuilder.append(a(-13358, 18741));
        if (arrayOfString == null);
        return;
      case 7:
        paramStringBuilder.append(a(-13371, 27991));
        if (arrayOfString == null)
          break; 
        return;
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
  }
  
  private static void Zw(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    int i = paramZrdb2.Za7().Zb(0);
    int j = paramZrdb2.Zam();
    if (paramZrdb1.Zam() != j && i != j) {
      int k = j ^ i;
      paramZrdb1.ZVD(k);
    } 
  }
  
  private static void Zk(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    byte b1 = paramZrdb1.ZaT().Zs();
    byte b2 = paramZrdb2.ZaT().Zs();
    if (b1 == 0 && b2 != 0)
      paramZrdb1.ZaT().ZJ(paramZrdb2.ZaT()); 
    if (b1 != b2 && b2 != 0 && b1 != 0)
      paramZrdb1.ZaT().ZR(); 
  }
  
  private static void lambda$mergeEvidence$1(Zrdb paramZrdb, Zz1h paramZz1h, AtomicBoolean paramAtomicBoolean1, AtomicBoolean paramAtomicBoolean2, AtomicBoolean paramAtomicBoolean3, Zgkc paramZgkc) {
    if (paramZgkc.Zub() != null && paramZgkc.Zub().Zsy() == 2048 && Zo(paramZrdb, 4096))
      paramZrdb.Za7().ZX(4096); 
    Zl4m zl4m = paramZrdb.Za7().Zd(paramZgkc, paramZz1h);
    paramAtomicBoolean1.compareAndSet(false, (zl4m == Zl4m.Zw));
    paramAtomicBoolean2.compareAndSet(false, (zl4m == Zl4m.Zu));
    paramAtomicBoolean3.compareAndSet(false, (zl4m == Zl4m.ZY));
  }
  
  private static void lambda$buildIssueDetail$0(Zr20 paramZr20, Zgkc paramZgkc) {
    paramZgkc.ZC(paramZr20);
  }
  
  static {
    // Byte code:
    //   0: bipush #30
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '+j°^?c]:9Ð_ÎX4ø¿S[|òÛd }ð­­û_ôÀÉ¬ ìØ"Á z²÷e»F)ð¾,à!Ç:¾5ðwyG{³J}YÉéUIjVJØÐ+(Õ.ŒòÞÙ¯bK¶,[¶ë$?CÑ ;æûù°Bße\\t{¸&ÀÛcÆïa¢íGÛ5+oô¬1Ú´x¬î4qjQcËõ08Õû«Óì@Ö¸.%ÕÛzNn/ *³W»}ãÑ#,MlïóÈÉwæ¿gÂñÅÇÊ¡{@Oj#6æ7]Ák¤ÖÞb<o?!÷îtÜS¨îû°Iµ\\n»Ê!§²ävé÷^£|s'\\tdtfð³Q0P5\\rÁË»Ê1Èh$üH°7>4}¼Ûq7ð¯k¤LUßm;¾(XäG6qëI@\\t¡¦\\r<Hài\\fM*½[°Ø ¶½{·Ío¦sÞ2ìÖÏ­êBâI\æ>%N×Q&ltêüzË:V\\fË¿ðÀ KrÚYgî\\r>kt|{\\bmRP(BÈ¼)â§¾\\tµi{Ùÿ©K£ Õ\\rAd¿.Hÿñn^úIÍ#ÙÁ§ÒãÜ\\n¬ó¨09G[QN%PÎõX2§ü-ÿ ©Ú Ö^l í6§?RÁâ**¾°¯Ú0j Ý¬+<!eÙÎséüçOSÖã~ÐÙìFõòFÏ¨ÎKø\\r§÷6K<©q, -Þ"â²³ÿ¾æ MÊó¢ßD8b\u m:f.õB xësÆæTðZ\\r[0X¨Ú½.\\r>éé«S¾Ì¦&¹Çefu»ùiÎ11t`7`¬MÅT:4"QÎéÔDûÌ²ÒÐZï}v4Ï=Zí-(ó" xt¼O¨,)×ÓÊºÈ7.dWeýw½r^ÑÅîV¤Ö\\t.ĉI#Ë{®EÉþ¤M|õ';Q5åVMÁ1æ!t6ü3õÖWø¨¹­ù%EfjûëÂ9q¹ÉµT·ÅV;÷bàéöö¢JiöHË&Ùãjè.àn»lÅr³{"+ÿ6©M=Ç:gÜMÈÇ¹¼ùUzÐé·I"!ÅÆºÇ\\r·2ÑôS»ÓR=e\\tk%VÊ\\b#Å²Ô Ï·¯áµ¬qîïzò^:w\\tÄ\\n\\ré\\tÔ:Ã;°4_¿É;¯ß7wpOóÑNÄ`£µUv´éñ/U!E{E\\rn|¾(FTéáûM/¡8hðrV>à}J7PÞ`3¸_[G}Ò«`Ñ¸ ¨¿ho¬© X`Y729øpåÀs¼ÝýÚÌÖ~r2îE 9ùg´£ÙJ1#Ç©xéÙ\\nÒ;ÿÐ.C¤yw°\\tY´(7:Ú¥8}åRÞ´R,¢øÆjä"Ûì[ì¹°éNðVþre81«ÆOóXóUÈd¦2hÐí)ËrµÎ@^r|×Ò²-¸êz"&a}\\tè³âÛÆý|£õeu¤5ÚÊ ñÇE9AFýL±èo¤ßkÏu  ëÜâñ¯ê8j¹µ¦Ñ¢Iê¶ïÊzDìOæ+yF~%A>äâ¹D-jX/C()äç%èrTæª­<ßµ-Qäµ|5Épîö SJÜÚbçÚw¬3ÄÎ¯ª -Â""óÝ#ó-9u^<è*Ã¸Ìy[Uzÿ\\rñºÔ{ÿ5!ýùâQ ~?¹b+ÕþÈÔ-ªý]Ñ6¢F·|^FPl Ì+\\nï®úgU\\fôeE<0[@ÊmZR~é.àä©¨ÉÃÚï+&Í;b~ÌÄa&FÒCÔ-âP{÷yïÿÅ³\\nÂ"¢ßý+{YpÇ_E3j\\f~¤0å´pøÁ·óe²dZ+itc^ÕJ¤²¡[\\fP¦q÷zÂ ¬Ãäªh¬÷ ®«bU[Úèh#éä}ôaËá0Qe2"#âF¶îÁë42ónJâà^q¶¬Z<sC¯óú\\b#¶éðÛ*àü|Õ©Á¬ÿëK?Sdß%g>CÝ\\b$H¥t¼ÆìeXEÉ7S¾ÖÒ;¹4At1*E"U&â\\t¨±¯`Òr6·u7ïÍëO :ÈÖyí­/¿YÀÓ´NÆx÷»Ü±ÅDk@\\n'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #46
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #74
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
    //   68: ldc '§¸E¹,­"v­ËÁT*¡ÂÔÊöñ´!ia*)îçî\\fÒØmÖøN!WôÊ;9´b'ªãµWËvU]ðÅuÔHåÄxø)ÄäÝ%wÓf+ØDyP0M8'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #48
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #18
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
    //   129: putstatic burp/Zmew.a : [Ljava/lang/String;
    //   132: bipush #30
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmew.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #73
    //   214: goto -> 243
    //   217: bipush #30
    //   219: goto -> 243
    //   222: iconst_1
    //   223: goto -> 243
    //   226: bipush #45
    //   228: goto -> 243
    //   231: bipush #65
    //   233: goto -> 243
    //   236: bipush #117
    //   238: goto -> 243
    //   241: bipush #47
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
    int i = (paramInt1 ^ 0xFFFFCBD9) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmew.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */