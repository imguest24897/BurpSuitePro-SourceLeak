package burp;

import java.time.Duration;

public interface Zmu3 extends Zgpi<Zmu3>, Zgr0, Zm3g {
  public static final Zeu4<Zmu3> Ze;
  
  public static final String[] a;
  
  public static final String[] b;
  
  void Zt(boolean paramBoolean);
  
  void ZI(boolean paramBoolean);
  
  void ZK(String paramString);
  
  void Zf(boolean paramBoolean);
  
  void Zj(boolean paramBoolean);
  
  void ZZ(int paramInt);
  
  void ZL(boolean paramBoolean);
  
  void Zo(int paramInt);
  
  void Zb(boolean paramBoolean);
  
  void ZF(boolean paramBoolean);
  
  void Zk(boolean paramBoolean);
  
  void Zn(boolean paramBoolean);
  
  void Zl(Zszj paramZszj);
  
  void Zr(boolean paramBoolean);
  
  void Zb(Zt4o paramZt4o);
  
  void Zp(boolean paramBoolean);
  
  void ZA(int paramInt);
  
  default void Zd(Zmf_ paramZmf_) {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: sipush #30680
    //   8: sipush #22558
    //   11: invokestatic a : (II)Ljava/lang/String;
    //   14: aload_0
    //   15: invokeinterface ZtJ : ()Lburp/Zt4o;
    //   20: ifnonnull -> 28
    //   23: ldc ''
    //   25: goto -> 37
    //   28: aload_0
    //   29: invokeinterface ZtJ : ()Lburp/Zt4o;
    //   34: invokevirtual ZH : ()Ljava/lang/String;
    //   37: invokeinterface Zm : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   42: astore_3
    //   43: aload_3
    //   44: invokestatic ZE : (Ljava/lang/String;)Lburp/Zt4o;
    //   47: astore #4
    //   49: aload_1
    //   50: getstatic burp/Zk74.CRAWLER__CUSTOMIZATION__BROWSER_BASED_NAVIGATION : Lburp/Zk74;
    //   53: invokevirtual ZE : ()Ljava/lang/String;
    //   56: invokeinterface Zh : (Ljava/lang/String;)Z
    //   61: ifeq -> 111
    //   64: aload_0
    //   65: aload_1
    //   66: getstatic burp/Zk74.CRAWLER__CUSTOMIZATION__BROWSER_BASED_NAVIGATION : Lburp/Zk74;
    //   69: invokevirtual ZE : ()Ljava/lang/String;
    //   72: aload_0
    //   73: invokeinterface Ztk : ()Z
    //   78: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   83: invokeinterface Zr : (Z)V
    //   88: aload_0
    //   89: invokeinterface Ztk : ()Z
    //   94: ifeq -> 106
    //   97: getstatic burp/Zt4o.USE : Lburp/Zt4o;
    //   100: astore #4
    //   102: iload_2
    //   103: ifne -> 111
    //   106: getstatic burp/Zt4o.DONT_USE : Lburp/Zt4o;
    //   109: astore #4
    //   111: aload_0
    //   112: aload_1
    //   113: sipush #30660
    //   116: sipush #14155
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: aload_0
    //   123: invokeinterface Zto : ()Z
    //   128: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   133: invokeinterface Zt : (Z)V
    //   138: aload_0
    //   139: aload_1
    //   140: sipush #30674
    //   143: sipush #13725
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: aload_0
    //   150: invokeinterface ZtY : ()Z
    //   155: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   160: invokeinterface ZI : (Z)V
    //   165: aload_0
    //   166: aload_1
    //   167: sipush #30663
    //   170: sipush #27813
    //   173: invokestatic a : (II)Ljava/lang/String;
    //   176: aload_0
    //   177: invokeinterface Zt1 : ()Ljava/lang/String;
    //   182: invokeinterface Zm : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   187: invokeinterface ZK : (Ljava/lang/String;)V
    //   192: aload_0
    //   193: aload_1
    //   194: sipush #30657
    //   197: sipush #-26800
    //   200: invokestatic a : (II)Ljava/lang/String;
    //   203: aload_0
    //   204: invokeinterface ZtR : ()Z
    //   209: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   214: invokeinterface Zf : (Z)V
    //   219: aload_0
    //   220: aload_1
    //   221: sipush #30661
    //   224: sipush #30905
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: aload_0
    //   231: invokeinterface ZtI : ()Z
    //   236: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   241: invokeinterface Zj : (Z)V
    //   246: aload_0
    //   247: aload_1
    //   248: sipush #30667
    //   251: sipush #27402
    //   254: invokestatic a : (II)Ljava/lang/String;
    //   257: aload_0
    //   258: invokeinterface Ztm : ()I
    //   263: invokeinterface ZA : (Ljava/lang/String;I)I
    //   268: invokeinterface ZZ : (I)V
    //   273: aload_0
    //   274: aload_1
    //   275: sipush #30662
    //   278: sipush #-25114
    //   281: invokestatic a : (II)Ljava/lang/String;
    //   284: aload_0
    //   285: invokeinterface ZtW : ()Z
    //   290: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   295: invokeinterface ZL : (Z)V
    //   300: aload_0
    //   301: aload_1
    //   302: sipush #30668
    //   305: sipush #20050
    //   308: invokestatic a : (II)Ljava/lang/String;
    //   311: aload_0
    //   312: invokeinterface ZtM : ()I
    //   317: invokeinterface ZA : (Ljava/lang/String;I)I
    //   322: invokeinterface Zo : (I)V
    //   327: aload_0
    //   328: aload_1
    //   329: sipush #30675
    //   332: sipush #11835
    //   335: invokestatic a : (II)Ljava/lang/String;
    //   338: aload_0
    //   339: invokeinterface ZtN : ()Z
    //   344: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   349: invokeinterface Zb : (Z)V
    //   354: aload_0
    //   355: aload_1
    //   356: sipush #30672
    //   359: sipush #-7303
    //   362: invokestatic a : (II)Ljava/lang/String;
    //   365: aload_0
    //   366: invokeinterface Ztj : ()Z
    //   371: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   376: invokeinterface Zn : (Z)V
    //   381: aload_0
    //   382: aload_1
    //   383: sipush #30679
    //   386: sipush #-28824
    //   389: invokestatic a : (II)Ljava/lang/String;
    //   392: aload_0
    //   393: invokeinterface ZtD : ()Lburp/Zszj;
    //   398: ifnonnull -> 410
    //   401: getstatic burp/Zszj.DEFAULT : Lburp/Zszj;
    //   404: invokevirtual ZB : ()Ljava/lang/String;
    //   407: goto -> 419
    //   410: aload_0
    //   411: invokeinterface ZtD : ()Lburp/Zszj;
    //   416: invokevirtual ZB : ()Ljava/lang/String;
    //   419: invokeinterface Zm : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   424: invokestatic ZW : (Ljava/lang/String;)Lburp/Zszj;
    //   427: invokeinterface Zl : (Lburp/Zszj;)V
    //   432: aload_0
    //   433: aload_1
    //   434: sipush #30684
    //   437: sipush #-16999
    //   440: invokestatic a : (II)Ljava/lang/String;
    //   443: aload_0
    //   444: invokeinterface ZtA : ()Z
    //   449: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   454: invokeinterface Zp : (Z)V
    //   459: aload_0
    //   460: aload_1
    //   461: sipush #30665
    //   464: sipush #2629
    //   467: invokestatic a : (II)Ljava/lang/String;
    //   470: aload_0
    //   471: invokeinterface Zt9 : ()I
    //   476: invokeinterface ZA : (Ljava/lang/String;I)I
    //   481: invokeinterface ZA : (I)V
    //   486: aload_0
    //   487: aload #4
    //   489: invokeinterface Zb : (Lburp/Zt4o;)V
    //   494: aload_0
    //   495: aload_1
    //   496: sipush #30682
    //   499: sipush #19484
    //   502: invokestatic a : (II)Ljava/lang/String;
    //   505: aload_0
    //   506: invokeinterface Ztv : ()Z
    //   511: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   516: invokeinterface ZF : (Z)V
    //   521: aload_0
    //   522: aload_1
    //   523: sipush #30670
    //   526: sipush #-7027
    //   529: invokestatic a : (II)Ljava/lang/String;
    //   532: aload_0
    //   533: invokeinterface Ztn : ()Z
    //   538: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   543: invokeinterface Zk : (Z)V
    //   548: return
  }
  
  default void Zl(Zg4j paramZg4j) {
    paramZg4j.Zh(a(30673, 4683), Zto());
    paramZg4j.Zh(a(30664, -29884), ZtY());
    paramZg4j.Za(a(30676, 56), Zt1());
    paramZg4j.Zh(a(30659, 25549), ZtR());
    paramZg4j.Zh(a(30656, -3577), ZtI());
    paramZg4j.ZD(a(30666, 32161), Ztm());
    paramZg4j.Zh(a(30687, 8745), ZtW());
    paramZg4j.ZD(a(30671, 12894), ZtM());
    paramZg4j.Zh(a(30681, 1516), ZtN());
    paramZg4j.Zh(a(30658, 30055), Ztj());
    paramZg4j.Za(a(30678, -14089), (ZtD() == null) ? Zszj.DEFAULT.ZB() : ZtD().ZB());
    paramZg4j.Zh(a(30677, -8370), ZtA());
    paramZg4j.ZD(a(30683, 31251), Zt9());
    paramZg4j.Za(a(30669, -17438), (ZtJ() == null) ? "" : ZtJ().ZH());
    paramZg4j.Zh(a(30685, -30188), Ztv());
    paramZg4j.Zh(a(30686, 11874), Ztn());
  }
  
  default void Z_(Ze72 paramZe72) {
    paramZe72.Zd(Zto());
    if (ZtY())
      paramZe72.ZQ(Zt1()); 
    paramZe72.ZH(ZtR());
    paramZe72.Zz(ZtI());
    paramZe72.Zy(Ztm());
    paramZe72.Zy(ZtW());
    paramZe72.Zp(ZtM());
    paramZe72.Zi(ZtN());
    paramZe72.ZF(Ztj());
    paramZe72.Z_(ZtD());
    Zt4o zt4o = ZtJ();
    if (zt4o == null)
      zt4o = Ztk() ? Zt4o.USE : Zt4o.DONT_USE; 
    paramZe72.ZB(zt4o);
    paramZe72.Zj(ZtA());
    paramZe72.Z_(Duration.ofSeconds(Zt9()));
    paramZe72.ZW(Ztv());
    paramZe72.ZO(Ztn());
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '½0gsÄ©ss8³¡\\tÜÉÍxuu0øaÑÂt36ê\\táÖq<Ò*¿A±{òS<Þ!ª Þ®}¯"ªO©«[V^¢ÇÔ¬ú#7½(\\b·ó¥VÁû(9SúÌ.¤0im{ì£çêª:©=^ª¤_­W ãæ%¯CÓ;R{R)ø%n8ÎlÌ=ã9*@æ?·ê§ªï jn æj±¶òÆÞwªÓ ¦®¯µÇ«ºÎR¾w@)7©PTY¢^eÛê-a]ÙVPK_u4ÉH×GåcRfÅ'õê@¨%æw½½ÂÂH_M²£o»¢».éZ¼¥Ùß6ª1NÓ¸è"âÑê[C´Ympvó(&D\\bòÇCª¥·"kß061ÇðèXKÖÏ«Äe{ú.¿ó¥ìâSºS½9ô{×[ä¿¢8rþó0!\\fE°¸PA×ì`ûZ>½qå¼êYP{¹<tÛÇOæÿÉª2s¿Ó-?Ã«Îª$dÊÄ>áúÉ¢R\\t9tèÔ=QãÛÖriByCÃ÷wÆîºµJ³à;èõ6:@ql>W®b*y`yr?\\b±Üê/¨~Uf«C3>»a5ÛæµÏî@yë&/9ò?aÏYÈ;_16·-X] g~m?å)k^¦ :dÆÁÖÆ/Ù©04è$|×§Åáþjë1@ÓõècÑ±òJ0í¥/mïR¯:çÎÎ¿,>S\\fh¬dHó3a!E u!¾bCï ØVZ1Ng¢Õq ÍtF¡4«Æ¼Õhì^é p¡\\ta/¤Gõ»ãP:\-"±î]ê½'6¶TDÇó3¨ØO®íD¼û(¥§+t!Ý\\fÎ°ÉPo×KTwû¸>Û½çåÚðÖº¤Üh_ûg³º*¤;"è,âÃ\\n¥çÅÁMÅÂîY­mãpÚf5hsU×sµÃí"ï±KW:Â2iVk°5gHH<s(VÁYjæß!f¿*åï2 vÝhÊ0¬ûþ)é©°j±á\\r6»RFpn%÷ï<ööh¿^ß¾ÊÇ®>s¶S#¤ XnÇ±;R~npñ¡.íªÑ¾>jM7é^ïÂ<`6º§Üõª®¿Öç%Ïv¸mÍî®½Ó1NÚvÇPéûÃxj"À+.á\\n8ªÔUm¢}tRÂC2.¸sv=æÒíJû¢E%QOA¿i;WêµVJr1À\\b¶æÐçd\\bÙÎÏÞù¥}6ÃyÒ ý\\t1r;ðwX¸Ö±«{Å.t¿·vëÆ¿¯`?*GtøÈIÄéÌÈdrÚj)ðveYÕÚR±FbÃ uK®½|²&&ãìî¶Y,sá~æ¦T32%ðÅMÜ#"'BBu½SÜ<ÚK!õrL«¥\\nXÙø«Y­Õù Íi9nB+¥½Öòoò«\\b¨§dÉyÄDÎÉC>:á±ÅH3õmì¨õc5[l*Ab3\\fe7ÍµÃh&[ÍR¿mûÒ³ øEt«(ÌÜdÌpN\\tÄÞÎÐ3(+Êºd%$)¼æööï»Fªn$ðqãE*éG¯¾¼mü ÎúÓ gñ¡0Êó4Ì×/¶[£Zd\\rÚ|ýþ*­.ã°êw¹³à¯\\n1 ¯2©Íãr~Énj<wøæ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #40
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #21
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
    //   68: ldc 'Å|ì\\f,Kº°ó¢A»Ý`¤ *ú;ë£Bù\¢.Êäb8vGîE|JGùe´Î7^2:y¬Ó_í8O£]Kïú"H[ß³ÕîÕ`SÊ¿¯òÏ±æAË¢Úm'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #51
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #51
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
    //   129: putstatic burp/Zmu3.a : [Ljava/lang/String;
    //   132: bipush #32
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmu3.b : [Ljava/lang/String;
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
    //   212: bipush #64
    //   214: goto -> 244
    //   217: bipush #118
    //   219: goto -> 244
    //   222: bipush #103
    //   224: goto -> 244
    //   227: bipush #83
    //   229: goto -> 244
    //   232: bipush #41
    //   234: goto -> 244
    //   237: bipush #9
    //   239: goto -> 244
    //   242: bipush #116
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
    //   300: new burp/Zklm
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zmu3.Ze : Lburp/Zeu4;
    //   310: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x77C3) & 0xFFFF;
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
      byte b1 = 102;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmu3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */