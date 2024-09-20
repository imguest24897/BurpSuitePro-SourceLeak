package burp;

import java.util.Comparator;
import java.util.EnumSet;

public class Zmbi extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmbi() {
    super(EnumSet.of(Zzqz.VARIANT, Zzqz.FLAGS));
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    return ZW.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #12
    //   9: invokestatic Zk : ()[Ljava/lang/String;
    //   12: aload #12
    //   14: sipush #-21753
    //   17: sipush #-26130
    //   20: invokestatic a : (II)Ljava/lang/String;
    //   23: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: pop
    //   27: aload #12
    //   29: aload #6
    //   31: iconst_1
    //   32: iconst_1
    //   33: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: astore #11
    //   42: aload #12
    //   44: iload #9
    //   46: iconst_1
    //   47: if_icmpne -> 62
    //   50: sipush #-21729
    //   53: sipush #-30297
    //   56: invokestatic a : (II)Ljava/lang/String;
    //   59: goto -> 71
    //   62: sipush #-21731
    //   65: sipush #-28382
    //   68: invokestatic a : (II)Ljava/lang/String;
    //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload #12
    //   77: sipush #-21741
    //   80: sipush #-7582
    //   83: invokestatic a : (II)Ljava/lang/String;
    //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload #12
    //   92: sipush #-21733
    //   95: sipush #30787
    //   98: invokestatic a : (II)Ljava/lang/String;
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: iload_3
    //   106: lookupswitch default -> 291, 1 -> 164, 2 -> 191, 4 -> 211, 8 -> 231, 16 -> 251, 32 -> 271
    //   164: aload #12
    //   166: sipush #-21737
    //   169: sipush #26760
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: aload #11
    //   181: ifnonnull -> 306
    //   184: iconst_2
    //   185: anewarray burp/Zbqc
    //   188: invokestatic Zr : ([Lburp/Zbqc;)V
    //   191: aload #12
    //   193: sipush #-21742
    //   196: sipush #31996
    //   199: invokestatic a : (II)Ljava/lang/String;
    //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: aload #11
    //   208: ifnonnull -> 306
    //   211: aload #12
    //   213: sipush #-21738
    //   216: sipush #24817
    //   219: invokestatic a : (II)Ljava/lang/String;
    //   222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: aload #11
    //   228: ifnonnull -> 306
    //   231: aload #12
    //   233: sipush #-21757
    //   236: sipush #-719
    //   239: invokestatic a : (II)Ljava/lang/String;
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: pop
    //   246: aload #11
    //   248: ifnonnull -> 306
    //   251: aload #12
    //   253: sipush #-21734
    //   256: sipush #-27286
    //   259: invokestatic a : (II)Ljava/lang/String;
    //   262: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: pop
    //   266: aload #11
    //   268: ifnonnull -> 306
    //   271: aload #12
    //   273: sipush #-21756
    //   276: sipush #-30644
    //   279: invokestatic a : (II)Ljava/lang/String;
    //   282: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: pop
    //   286: aload #11
    //   288: ifnonnull -> 306
    //   291: aload #12
    //   293: sipush #-21739
    //   296: sipush #3784
    //   299: invokestatic a : (II)Ljava/lang/String;
    //   302: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: pop
    //   306: aload #12
    //   308: sipush #-21755
    //   311: sipush #-8747
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: pop
    //   321: aload #5
    //   323: invokevirtual Zg : ()Z
    //   326: ifeq -> 395
    //   329: aload #12
    //   331: sipush #-21744
    //   334: sipush #-17073
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: pop
    //   344: aload #5
    //   346: invokevirtual Zh : ()Z
    //   349: ifeq -> 367
    //   352: aload #12
    //   354: sipush #-21732
    //   357: sipush #21340
    //   360: invokestatic a : (II)Ljava/lang/String;
    //   363: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   366: pop
    //   367: aload #5
    //   369: invokevirtual Zm : ()Z
    //   372: ifeq -> 517
    //   375: aload #12
    //   377: sipush #-21740
    //   380: sipush #-16244
    //   383: invokestatic a : (II)Ljava/lang/String;
    //   386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: pop
    //   390: aload #11
    //   392: ifnonnull -> 517
    //   395: aload #5
    //   397: invokevirtual Zh : ()Z
    //   400: ifeq -> 446
    //   403: aload #5
    //   405: invokevirtual Zm : ()Z
    //   408: ifeq -> 446
    //   411: aload #12
    //   413: sipush #-21730
    //   416: sipush #-23073
    //   419: invokestatic a : (II)Ljava/lang/String;
    //   422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: pop
    //   426: aload #12
    //   428: sipush #-21754
    //   431: sipush #27698
    //   434: invokestatic a : (II)Ljava/lang/String;
    //   437: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: pop
    //   441: aload #11
    //   443: ifnonnull -> 517
    //   446: aload #5
    //   448: invokevirtual Zh : ()Z
    //   451: ifeq -> 474
    //   454: aload #12
    //   456: sipush #-21743
    //   459: sipush #4468
    //   462: invokestatic a : (II)Ljava/lang/String;
    //   465: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   468: pop
    //   469: aload #11
    //   471: ifnonnull -> 517
    //   474: aload #5
    //   476: invokevirtual Zm : ()Z
    //   479: ifeq -> 502
    //   482: aload #12
    //   484: sipush #-21735
    //   487: sipush #-26283
    //   490: invokestatic a : (II)Ljava/lang/String;
    //   493: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   496: pop
    //   497: aload #11
    //   499: ifnonnull -> 517
    //   502: aload #12
    //   504: sipush #-21736
    //   507: sipush #-32530
    //   510: invokestatic a : (II)Ljava/lang/String;
    //   513: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   516: pop
    //   517: aload #5
    //   519: invokevirtual Za : ()I
    //   522: istore #13
    //   524: iload #13
    //   526: iconst_4
    //   527: iand
    //   528: iconst_4
    //   529: if_icmpne -> 537
    //   532: aload #12
    //   534: invokestatic ZO : (Ljava/lang/StringBuilder;)V
    //   537: aload #5
    //   539: new burp/Zr2_
    //   542: dup
    //   543: aload #12
    //   545: aload #6
    //   547: invokespecial <init> : (Ljava/lang/StringBuilder;Lburp/Zefg;)V
    //   550: invokevirtual ZT : (Lburp/Zr9a;)V
    //   553: aload #5
    //   555: aload #12
    //   557: invokestatic ZV : (Lburp/Ztub;Ljava/lang/StringBuilder;)V
    //   560: aload #12
    //   562: invokevirtual toString : ()Ljava/lang/String;
    //   565: areturn
  }
  
  public byte Zf(Ztlj paramZtlj, Ztub paramZtub, byte paramByte) {
    return ((paramZtub.Za() & 0x2) == 2) ? 3 : 2;
  }
  
  public byte Zj(Ztlj paramZtlj, Ztub paramZtub, byte paramByte, int paramInt, Zs66 paramZs66, byte[] paramArrayOfbyte, Zrdb paramZrdb) {
    return (paramZtub.Za() == 4) ? 1 : 4;
  }
  
  public byte ZV(Ztlj paramZtlj, Ztub paramZtub, byte paramByte) {
    return paramZtub.Zg() ? 0 : 1;
  }
  
  public Comparator<Zgkc> ZC() {
    return new Zzuw();
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'nK\\f&N«rÈýÜ'©ïóüa\\t¿¶7ªD*{¾ú¸±/°E÷ÀcýÚSÇ´K\\bMTXu,cßML|Ï?eíwy3ú/\\tç&7´ÌMw9N aÃDËp&*áUc,²È¥¾®i£_â"ç5UåÏq5ºbLâ2Âï,²/i?£ï×­úõ>¿{&V)bëjF¥¸QðÜ7ö&êÇ×Ke°£ÿ>Ä,3ä« G),ç×´±_¼%\\bw¼únoÇ0Z$ïkÅà±<$è  ¶Þ_m>ó\\f"¾«t¡âß+e¿q¯Þ+NO¶îW{/""pD&Ðoøð­ñGzrKæý¤ e>á¾\\r8ý&1äþóK&1lªY"éøÛ©­Ié\\b¾ZqwÜ<Ì®ª/³R»¡{û\\b#ZÌ@÷Ðidév89¯3äLÕX¯ÑÙSÞ'Ð\\t\\rÏc H·?ãiPï&¨\\rT>C|-Î.2}é)ñà.1ßz¿ËÂgâñx½®§"=`K¨\\nªô8ÖµDÚ¨M»y³^f3WìùïZ5Nëfû !ÖxRûÑÓ·Ü+¬ª\\f¯ñd7ôÖr\\\n\\f{ÕA`U(¨§¶çwZ+¢àF4-ð¸¬ø·f~VËbí4¢w~£ö\\fÜ"`nñYfs\\r$«P¶.&Íx_¹=KûHÝ¶È[xWý8¨L*º¿±@ûÐérÛ)'~LÄçÒ)ÅlUè«\\r`\EZïÑ×§Ô-ßóZ÷M7«hYÏ¿7¦,Ä<Q<D%[ÇyÍ©uop,Vs×2¾\\bë ÆCbuh¿¼Ëå*uiktT0Ç²ËxÝðËÜUù«h(\üÓÜ³a0ûß&H¹ÞA5À[Ác]>øÚ×¦%pv8JýHÍ#@Þ 0%l¾37Û¾î\\fô8MÌ¡Úâ' Áª0é°&¿/!"á-û{´X:`ê3ãÇHäÂÊÛÂTbd¤qËo+¾dSç,.Ñj· ¡\\rHdæ5¯§¹jcÐMS¯¬2^JaØùíR3úü[7ÿà"6\\t£-¿<¦¿5Ä³\\f.Ùqú{¢gè\\n«\\t® w¿zÒs¨¼Ü¨ó³z¼;Øÿ~£öÜñõ'Omtrµ°8DïbU/e®5ò\\r¤U%wo~×µpËÍ4E@º%EïîM¦¬£Z·ÆJ7î q°ñ¸Éqk"xoMÉ'ûÈ\\t9qdm8Ñ§õÊ«®_-çÛ|zq'ff¹·¯Qâ;l¢ö#y>ùö´Ù×<1÷\\fi@ÖYz\\fçBûj iÚXÂLN$ns¥]:ê6ôïÑN¡ d"ZÚâ/O]¹s¤õmø=Z¯ÉRí)à½»ð)Ð±wöÚÁú}½\\n\\nE× kc??ú/¹¥­\\f)ÄXü "äÊ§ÄÛ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #22
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #9
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
    //   68: ldc ' w½Ä\\fägç4Cø¡¥õYÅ<_;¶ª3=^]àtS\k'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #20
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #26
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
    //   129: putstatic burp/Zmbi.a : [Ljava/lang/String;
    //   132: bipush #21
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmbi.b : [Ljava/lang/String;
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
    //   212: bipush #114
    //   214: goto -> 244
    //   217: bipush #38
    //   219: goto -> 244
    //   222: bipush #127
    //   224: goto -> 244
    //   227: bipush #101
    //   229: goto -> 244
    //   232: bipush #49
    //   234: goto -> 244
    //   237: bipush #6
    //   239: goto -> 244
    //   242: bipush #111
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
    int i = (paramInt1 ^ 0xFFFFAB17) & 0xFFFF;
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
      byte b1 = 29;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmbi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */