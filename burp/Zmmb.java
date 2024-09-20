package burp;

import java.util.EnumSet;

public class Zmmb extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmmb() {
    super(EnumSet.of(Zzqz.VARIANT));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic ZD : ()Ljava/lang/String;
    //   3: astore #11
    //   5: aload #5
    //   7: invokevirtual Zm : ()Z
    //   10: ifne -> 30
    //   13: aload #5
    //   15: invokevirtual Zk : ()Z
    //   18: ifne -> 30
    //   21: iconst_0
    //   22: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   25: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   28: aconst_null
    //   29: areturn
    //   30: new java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: astore #12
    //   39: aload #12
    //   41: sipush #13865
    //   44: sipush #-10471
    //   47: invokestatic a : (II)Ljava/lang/String;
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: iload_2
    //   55: tableswitch default -> 208, 0 -> 108, 1 -> 217, 2 -> 128, 3 -> 148, 4 -> 168, 5 -> 188, 6 -> 96
    //   96: aload_1
    //   97: iload_2
    //   98: aload #12
    //   100: invokestatic ZD : (Lburp/Zvs;BLjava/lang/StringBuilder;)V
    //   103: aload #11
    //   105: ifnonnull -> 232
    //   108: aload #12
    //   110: sipush #13863
    //   113: sipush #23139
    //   116: invokestatic a : (II)Ljava/lang/String;
    //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: pop
    //   123: aload #11
    //   125: ifnonnull -> 232
    //   128: aload #12
    //   130: sipush #13869
    //   133: sipush #-18213
    //   136: invokestatic a : (II)Ljava/lang/String;
    //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload #11
    //   145: ifnonnull -> 232
    //   148: aload #12
    //   150: sipush #13858
    //   153: sipush #28726
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload #11
    //   165: ifnonnull -> 232
    //   168: aload #12
    //   170: sipush #13861
    //   173: sipush #-1398
    //   176: invokestatic a : (II)Ljava/lang/String;
    //   179: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: pop
    //   183: aload #11
    //   185: ifnonnull -> 232
    //   188: aload #12
    //   190: sipush #13866
    //   193: sipush #18079
    //   196: invokestatic a : (II)Ljava/lang/String;
    //   199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: pop
    //   203: aload #11
    //   205: ifnonnull -> 232
    //   208: iconst_0
    //   209: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   212: iload_2
    //   213: i2l
    //   214: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   217: aload #12
    //   219: sipush #13862
    //   222: sipush #32654
    //   225: invokestatic a : (II)Ljava/lang/String;
    //   228: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: pop
    //   232: aconst_null
    //   233: astore #13
    //   235: aload #5
    //   237: invokevirtual Zm : ()Z
    //   240: ifeq -> 292
    //   243: aload_0
    //   244: aload #4
    //   246: invokevirtual Zx : (Lburp/Ztlj;)Lburp/Zxwd;
    //   249: astore #13
    //   251: aload #5
    //   253: invokevirtual Zr : ()Lburp/Zzq1;
    //   256: astore #14
    //   258: aload #12
    //   260: aload #13
    //   262: aload #6
    //   264: aload #14
    //   266: invokeinterface Zub : ()Lburp/Zll7;
    //   271: invokeinterface Zsf : ()Lburp/Zstu;
    //   276: invokeinterface ZiD : ()[B
    //   281: invokestatic ZY : (Ljava/lang/StringBuilder;Lburp/Zxwd;Lburp/Zefg;[B)V
    //   284: aload #12
    //   286: ldc '.'
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: aload #12
    //   294: sipush #13860
    //   297: sipush #-5027
    //   300: invokestatic a : (II)Ljava/lang/String;
    //   303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: pop
    //   307: iload_2
    //   308: tableswitch default -> 464, 0 -> 364, 1 -> 404, 2 -> 384, 3 -> 404, 4 -> 424, 5 -> 444, 6 -> 352
    //   352: aload_1
    //   353: iload_2
    //   354: aload #12
    //   356: invokestatic ZL : (Lburp/Zvs;BLjava/lang/StringBuilder;)V
    //   359: aload #11
    //   361: ifnonnull -> 502
    //   364: aload #12
    //   366: sipush #13870
    //   369: sipush #606
    //   372: invokestatic a : (II)Ljava/lang/String;
    //   375: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: pop
    //   379: aload #11
    //   381: ifnonnull -> 502
    //   384: aload #12
    //   386: sipush #13864
    //   389: sipush #10569
    //   392: invokestatic a : (II)Ljava/lang/String;
    //   395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: pop
    //   399: aload #11
    //   401: ifnonnull -> 502
    //   404: aload #12
    //   406: sipush #13867
    //   409: sipush #27064
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: pop
    //   419: aload #11
    //   421: ifnonnull -> 502
    //   424: aload #12
    //   426: sipush #13859
    //   429: sipush #1051
    //   432: invokestatic a : (II)Ljava/lang/String;
    //   435: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   438: pop
    //   439: aload #11
    //   441: ifnonnull -> 502
    //   444: aload #12
    //   446: sipush #13871
    //   449: sipush #8437
    //   452: invokestatic a : (II)Ljava/lang/String;
    //   455: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   458: pop
    //   459: aload #11
    //   461: ifnonnull -> 502
    //   464: iconst_0
    //   465: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   468: aload #13
    //   470: ifnonnull -> 478
    //   473: iload_2
    //   474: i2l
    //   475: goto -> 484
    //   478: aload #13
    //   480: getfield typeIndex : I
    //   483: i2l
    //   484: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   487: aload #12
    //   489: sipush #13868
    //   492: sipush #27461
    //   495: invokestatic a : (II)Ljava/lang/String;
    //   498: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: pop
    //   502: aload #13
    //   504: ifnull -> 520
    //   507: aload #12
    //   509: aload #13
    //   511: aload_1
    //   512: invokestatic Zj : (Ljava/lang/StringBuilder;Lburp/Zxwd;Lburp/Zvs;)V
    //   515: aload #11
    //   517: ifnonnull -> 528
    //   520: aload #12
    //   522: ldc '.'
    //   524: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   527: pop
    //   528: aload #5
    //   530: aload #12
    //   532: invokestatic ZV : (Lburp/Ztub;Ljava/lang/StringBuilder;)V
    //   535: aload #5
    //   537: invokevirtual Zk : ()Z
    //   540: ifeq -> 548
    //   543: aload #12
    //   545: invokestatic ZO : (Ljava/lang/StringBuilder;)V
    //   548: aload #12
    //   550: invokevirtual toString : ()Ljava/lang/String;
    //   553: areturn
  }
  
  public String Zt(Zvs paramZvs, byte paramByte, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg) {
    return !paramZtub.Zm() ? null : Zxwd.ZU(Zx(paramZtlj));
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    if (paramZrdb1.Za6() != paramZrdb2.Za6() || Zmey.Zv(paramZrdb1, paramZrdb2))
      return super.Zc(paramZrdb1, paramZrdb2, paramZgvn, paramZz1h); 
    if (paramZrdb1.Za6() == Zzu2.EXTERNAL_SERVICE_INTERACTION_SMTP)
      return Zl4m.Zh; 
    Zl4m zl4m = ZW.Zi(paramZrdb1, paramZrdb2, paramZz1h);
    if (zl4m == Zl4m.ZY || zl4m == Zl4m.Zu)
      return zl4m; 
    if (paramZrdb1.Za7().Zm() && paramZrdb2.Za7().Zm()) {
      Zxwd zxwd1 = Zx(paramZrdb1.ZaT());
      Zxwd zxwd2 = Zx(paramZrdb2.ZaT());
      if (zxwd1 != zxwd2)
        return Zl4m.ZX; 
      if ((paramZrdb1.Za8() == 1 && paramZrdb2.Za8() == 2) || (paramZrdb1.Za8() == 2 && paramZrdb2.Za8() == 1)) {
        paramZrdb1.Zc((byte)3);
        return Zl4m.Zu;
      } 
      if (paramZrdb2.Za8() == 3 && (paramZrdb1.Za8() == 1 || paramZrdb1.Za8() == 2))
        return Zl4m.Zf; 
      if ((paramZrdb2.Za8() == 1 || paramZrdb2.Za8() == 2) && paramZrdb1.Za8() == 3)
        return Zl4m.Zh; 
    } 
    return Zp.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  public byte Zf(Ztlj paramZtlj, Ztub paramZtub, byte paramByte) {
    return (paramZtub.Za() == 4) ? 2 : 3;
  }
  
  public byte Zj(Ztlj paramZtlj, Ztub paramZtub, byte paramByte, int paramInt, Zs66 paramZs66, byte[] paramArrayOfbyte, Zrdb paramZrdb) {
    return (paramZtub.Za() == 4) ? 1 : Zog.ZV(paramZrdb.Za6());
  }
  
  public byte ZV(Ztlj paramZtlj, Ztub paramZtub, byte paramByte) {
    return ((paramZtub.Za() & 0x4) != 0) ? 6 : super.ZV(paramZtlj, paramZtub, paramByte);
  }
  
  private Zxwd Zx(Ztlj paramZtlj) {
    return Zxwd.ZZ(paramZtlj.ZY(Ztz3.DELIVERY_VECTOR));
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'L~-käÅ}Cc¼À´vwaÑ5|Ñ~¨ëÐIÓð$'ÿ£²³Å.¬BN0dYîáãØÒÿ[Ùé§d¹ñ\\f6²:òl3´´fË?:¼n³\\r8¶\\r²XcTKWÿèê©'êÅk¬æ°í]Æò8¡ BÖ¥£`^æÆR$aptB­ÖDXøà+ØìÁ 1?S<¨~ fØòÿ¾¤êÍÎ;u)Z0Üe`M2`©[Ñ(Ir-É©"×ØRÙ1õneUÔõøt!jÄÍÃòóbÒ±ÝbÄðÿÛdcfbHW+z·­j]ï-!ä¹üÎ\\fwµMT£Cp¯WÈ«:éðt¥Úº4³_ÚçuYgærÜ~,@àâÕÊà:e¼VDV?@áåÙÕy­¯vâv¦üÊª©ÕzÝ?2ÿU$h}8ðeÔ~²O\\r¢Ú\\r»qÑßL)dàÌMé¶øÜpÄ|[OòÞèÃ:Å´cT¿íÐ`uêq|V,t¶µiz50ÞÉS¢Ønµé!Uw8£´Ôy¹·¿7]p÷u¡é§?áSFµé) BK30õmÅùÇï<Ê^)Ô§"I6° ,ï;p@¾h,\/pÌn`^Ë=#Ìâd¾ÔÃÎmü èàø}GãËâÛj< gå»t"ê] rYe-ês²+²c*¬ªÃ×Ö¾¯'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #48
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #47
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
    //   68: ldc '¿ï`§7Cýl9Ã¦á5RåE\\b8ÃÚÌ0¤P%ãÂ\,8ßõV¾Äþ%Ì½AC3þékEÂ (í2/*ëÞ{í{c³¢%×NÏ Ô§#¹ÛwcÎrr8"8ÌÎóÈ¯¼ñà²'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #47
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #78
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
    //   129: putstatic burp/Zmmb.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmmb.b : [Ljava/lang/String;
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
    //   212: bipush #56
    //   214: goto -> 244
    //   217: bipush #103
    //   219: goto -> 244
    //   222: bipush #26
    //   224: goto -> 244
    //   227: bipush #75
    //   229: goto -> 244
    //   232: bipush #35
    //   234: goto -> 244
    //   237: bipush #78
    //   239: goto -> 244
    //   242: bipush #30
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
    int i = (paramInt1 ^ 0x362F) & 0xFFFF;
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
      char c = 'å';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmmb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */