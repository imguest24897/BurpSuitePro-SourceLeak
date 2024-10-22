package burp;

import burp.api.montoya.internal.MontoyaObjectFactory;
import burp.api.montoya.logger.LoggerCaptureHttpRequestResponse;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javafx.collections.FXCollections;

public class Zegl {
  private final Zz0n ZQ;
  
  private final Zerg Zo;
  
  private final Zslu Zb;
  
  private final Supplier<Zbiv> ZW;
  
  private final Zskh ZC;
  
  private final Ztyg Zx;
  
  private final Zgq7 Zd;
  
  private final Zmjm ZA;
  
  private final Zbnt ZL;
  
  private final Zkl6 Zk;
  
  private final Ztwv ZJ;
  
  private final Zey9 Zw;
  
  private final Zrid ZM;
  
  private final Zs0n Zp;
  
  private final MontoyaObjectFactory Ze;
  
  private final Zgb6 ZX;
  
  private final Zr_4 Zi;
  
  private final Zs6i ZV;
  
  private final Zm6x ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zegl(Zz0n paramZz0n, Zerg paramZerg, Zslu paramZslu, Supplier<Zbiv> paramSupplier, Zskh paramZskh, Ztyg paramZtyg, Zgq7 paramZgq7, Zmjm paramZmjm, Zbnt paramZbnt, Zkl6 paramZkl6, Ztwv paramZtwv, Zey9 paramZey9, Zrid paramZrid, Zs0n paramZs0n, MontoyaObjectFactory paramMontoyaObjectFactory, Zgb6 paramZgb6, Zr_4 paramZr_4, Zs6i paramZs6i, Zm6x paramZm6x) {
    this.ZQ = paramZz0n;
    this.Zo = paramZerg;
    this.Zb = paramZslu;
    this.ZW = paramSupplier;
    this.ZC = paramZskh;
    this.Zx = paramZtyg;
    this.Zd = paramZgq7;
    this.ZA = paramZmjm;
    this.ZL = paramZbnt;
    this.Zk = paramZkl6;
    this.ZJ = paramZtwv;
    this.Zw = paramZey9;
    this.ZM = paramZrid;
    this.Zp = paramZs0n;
    this.Ze = paramMontoyaObjectFactory;
    this.ZX = paramZgb6;
    this.Zi = paramZr_4;
    this.ZV = paramZs6i;
    this.ZO = paramZm6x;
  }
  
  public Zbyi ZK(Zskh paramZskh, Zl1k paramZl1k, Zsju paramZsju, Zbz6 paramZbz6, Zm6v paramZm6v, Consumer<Zs4l<LoggerCaptureHttpRequestResponse, Boolean>> paramConsumer) {
    return Zg(paramZskh, paramZl1k, paramZsju, paramZbz6, paramZm6v, true, paramConsumer);
  }
  
  public Zbyi Zz(Zskh paramZskh, Zl1k paramZl1k, Zsju paramZsju, Zbz6 paramZbz6, Zm6v paramZm6v, Consumer<Zs4l<LoggerCaptureHttpRequestResponse, Boolean>> paramConsumer) {
    return Zg(paramZskh, paramZl1k, paramZsju, paramZbz6, paramZm6v, false, paramConsumer);
  }
  
  private Zbyi Zg(Zskh paramZskh, Zl1k paramZl1k, Zsju paramZsju, Zbz6 paramZbz6, Zm6v paramZm6v, boolean paramBoolean, Consumer<Zs4l<LoggerCaptureHttpRequestResponse, Boolean>> paramConsumer) {
    Zm51 zm511 = Zp(a(-14182, 6872));
    Zg9z zg9z1 = new Zg9z(this.ZX, this.ZQ.ZD(), this.ZJ, this.ZM, zm511);
    AtomicReference<Zbyi> atomicReference = new AtomicReference();
    Zg2g zg2g = new Zg2g();
    Objects.requireNonNull(atomicReference);
    Objects.requireNonNull(atomicReference);
    Zbc zbc = new Zbc(this.ZJ, atomicReference::get, new Zt7d(atomicReference::get, zg2g));
    Zkf2 zkf2 = new Zkf2(a(-14181, -4829));
    Zx_w zx_w = new Zx_w(this.ZM, zkf2);
    Zx47 zx47 = new Zx47(zx_w, this.Zp);
    Zzss zzss = new Zzss(this.Ze);
    Zqg zqg = new Zqg(zzss);
    Zmu5 zmu5 = new Zmu5(paramZl1k, zbc, FXCollections.observableArrayList(), zg2g, zqg, zx47, 500L);
    Zg9z zg9z2 = new Zg9z(this.ZX, this.ZQ.ZD(), this.ZJ, this.ZM, zx_w);
    AtomicReference atomicReference1 = new AtomicReference();
    Objects.requireNonNull(atomicReference1);
    Zr6 zr6 = new Zr6(zmu5, null, atomicReference1::get);
    Zgtg<Zto7> zgtg = new Zgtg(this.ZX, zg9z2, zg2g, this.ZO, zr6.Zh(), zr6.ZJ(), zr6.Zr(), zx_w);
    Zm51 zm512 = Zp(a(-14183, -19879));
    Zg9z zg9z3 = new Zg9z(this.ZX, this.ZQ.ZD(), this.ZJ, this.ZM, zm512);
    Ze4n ze4n = new Ze4n(zzss);
    Zs4l<Object, Object> zs4l1 = new Zs4l<>(paramZsju.Z_W(), zm512, new Zeqh(ze4n), 60000L);
    paramConsumer.accept(zs4l1);
    Zz56 zz56 = new Zz56(paramZsju, paramBoolean, (Zs4l)zs4l1);
    Zs4l<Object, Object> zs4l2 = new Zs4l<>(paramZbz6.Zeu(), zm511, new Zz3x(ze4n), 60000L);
    Zeic zeic = new Zeic(paramZbz6, (Zs4l)zs4l2);
    Zkkp zkkp = new Zkkp(this.ZJ, paramZl1k, this.ZQ, this.Zb, this.ZW.get(), this.Zo, this.ZC, paramZskh, this.ZL, this.ZA, zbc, this.Zw);
    Zt3z zt3z = new Zt3z(zkkp, this.Zo, this.Zb, this.ZW.get(), new Zgso(this.ZL, this.Zk, this.Zo, Zeew.LOGGER, new Zsai(), this.ZO));
    Objects.requireNonNull(atomicReference1);
    Zbyi zbyi = new Zbyi(paramZl1k, this.Zx, this.Zd, paramZm6v, this.Zb, zt3z, zkkp, this.ZJ, zz56, zeic, (Zs4l)zs4l2, paramZsju, this.ZX, zg9z3, zg9z1, zm512, zm511, paramBoolean, this.Zw, this.Zp, this.Zi, this.ZV, zgtg, zmu5, this.ZO, atomicReference1::set);
    atomicReference.set(zbyi);
    return zbyi;
  }
  
  private Zm51 Zp(String paramString) {
    Zkf2 zkf2 = new Zkf2(paramString);
    return new Zx_w(this.ZM, zkf2);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '\\f£æÑ?FwZ½ í\\rKæ\Ë,´$@ÿ_¡A£'19fþÈ'§ð%qM£¼#)Àý®¶ Þ%íÃnÂÇvzòîD\\rÀ#~ý·Å!A½®ñ×î^¸ÁW`¼½LÅôßÞ f ½PÊ,àæS»õO/%Ú°ÛGÈÉÚ$|¯¥0½k÷\+x,µÇ©ãÚ]6¬Ôc?uø4½ªHÜ!C×ÅäMT|&ETË¬,¹Ò(À§4Nü¦nâ>ñÙËò@('üW0k´ÜíÌã3ëÌî 2YoeI¥KZ{& ßbÿhæ#döBdB¢»àQ0î«\\fM°±¬¦/Á6¸pOá¼%g`m¨ÙÇ È=úìó|¯£¢kÎÏõv]¡¬d"!ZÑ@æ½!:æµêy%Y Ë ¸\\rB¸¸Óhú_BeXyýg¾uxÜJÑ(uMu}öb\\r¸ÓÓW_÷ÓX¯ý½åuÜ'w3Í"³Ä/ÿY~?§ä?vÖÿ¨º\\fÄâ»µR¥eòâGë2ß-óP"08wêÐmðú>#­æCèô£4öH¤ï <¾ÈjýG§l\\fÖì@?$LæÔfc+Ìüèq kâ¸êÚZ1©s±yÊÏuLûà¦\\b{(þ+ù4á`h-Î¸ïÿ×:ó*>¥m Ýs\\tTR`L8/TõUe`*X?i¢¿c?êfq1éoêp2\\tüØx»<ýÂY|´åté\\n*½¥ÖR[æ®ÆõdÄé®dX¯F 1\¹Gaµ¾<èN\>µ÷\©«I«Òê"ÁÑ"-ÖvV ÝÞJnOpÿ Rj®é/¯IîÎý ÊO7ý$KµóàM¸\ü£'q^ûè(=yÍ­*iÙ¸2B¼@ðêë>xCVSZÙßáñª¦~öeºÏh£¹\\n!yQ'½ÈyâFÿ¦nR4<ÂÍeQ)qï¿L$#ÝlN ¦RM7¡PF]"ôh©ì@4\\tmH¡KV)Ãµ»#ï8¾×¯vY';pm¼U¡ÍÁKÈWEÔÍa;ûN£i¹r£,¥â?¨|v_·ü¾gáÉÓ\\fa6\\bµÃÈlÞ3½X¯dÌ\\rû¢<dË¯¨XAî9ë@ª/Í-àÂéúXíóÐÉèináÏháY(lÁ[ó«\\nøz#·Râºå+gâF¾eùx+4<¯$îÊòäZ§me#Ô¥|d)o@ôÇãUt!Å¤¤º_Ë"r÷ãö4\\n÷ÄÆQ¨Ã©Ïö#ww£a Hà¤¢¡`Qåøº¢@1ºÞa¼Ù5^3+ÇJ"m\\f§3\\fPæÿ.Ïo²·\\náaV3<º¾´sG\\tcÕ÷Ùû¹º¶»W ÝsÈ\\tìøÂçn8'¤kB8!N?3Þ0í½µB-0]mæ®°ÍÄԙ5¤w~iÉ \\tîvèÙºö]lö(¯¡ð¼V}®ÙÑñ­\\b¹áù5þUk] ÜÇ¡$0NÿG&Î=*²/v ~ðVa¬µÛ¾<ùl>5ãA¬ÏâÈAÕ¤È`7æÚ\\rÄ)-#i}NpRA-·F×&n±³¸_âX}È²Ä®çÿ9öJ©qè&º÷á¹Ó?_ùç=gnvoâßýünS`tùF>ôÕ]IêÅ\\bVP&\\f.îÂg©ýævå5jÙx1½Ì¥ÇoiZp'?@îjñ~¡ÿ0kpiÄº®ym½c\\rf?Eå"xéÞZ¹ÚÅ®«d¦\\fæ\\r3ôn+²µ°,|s²^]ïÈ å¸¾&Î^{ç4éö/H~ü¦ôô+cPr¼þËt$n.OðâÚ#2{oÀÈÍïñÏl="Õ£¸\\fXèå¬o´Å*Wóòº!>Óúg±ÁÎí/õ×ì>2µ¯ó];`auö1?#=\\rP}ÏW,Í±ëòÒ,pð-÷Kÿl¹Ã.¡Æ¶¾OáÆ×ðxM1<Ë¹IÝ~³ô:¼Òª×!#J°;.(M"Í¶fè½è8+ÄzílBEÕÇ½BN¯il\c¶)0ð°ÓÀWýo_Á^¹2îË03AÚ\óö*ÿâ\\r¤Þ¾Þ®5Ù¡ZS]Ys\\t¡a :¹×AXüD\\t;-Èÿàm+eã-PòÄ ´ÿ^b¤K."²Ý'UÙïÝ(\\rÈ¦s6;Bp´îºhòß6vP·¶Ú¢¶nIÜ\\nÖ8§k;þ¾×"l Þ*N¨÷%ó¢>ÂöÇ¦dA±\\r´oK[Ùwj¯xjXø\\rÓ\*öks¦m?ýüXÀ[µ^©n^Ù< î!§e¢ÊÍ±ÝÊ9\\nÔÎ¤é~jï1¤Ã ýÒ<*"Ë°âuY*­{ªÃîËI£#ÆÕ£í*ÒH>jø«XKi#Xl÷ì/,éV-î4[«éH¿Áç­m~ gnyãë¿ïÐÛÏ±d´#ä!³ÈÂK°+-8GOíãÝò/·ïD¾¹j&:äµh#Rß³óÖ\\tUxÍªN(È¾©Ð¨ôºX\\f¿@¹èq#¶¬òüå-Áö]Ý5;R0äÝÔÙo\fWïd_:õ\\tÐ°·¯{ ÍeT¸\\rôhá+ªìd.¦ÿ³Ï:ÚöÆéÇWç ºR¡><2%#¯Þ0cp8õò;e×\\r:?¹ã]c]°@\\rÔSÖAÚ7§  rÞÙí\H)lÊ_³ãìÞøiçËÃÃ®«g{VE@ÔqD¶æ©ÁÂLzUÕÚT¶µÿ¼²j@à TÔûÝE´p&å0wÂ_3v\\rôdÑÀÆ ð¹ÊEy´c'xg¾ä">!uÜÃÖ½ÒP¢<3rÄ+*ôþæð$(ã­ô\\fC^¥>¢ ù*ëóY{ÇÃ\W¦yôè?\\tºkHÏu¬?E¾Ï"[!Ù'§~Vªx­9ÒÒø?ÿZÉDP$qýtú¿àª*2íÎ.=ëêԠûGMàÕ(ÂNÄprY{<ÈJûÓ-ÞLKåá ´\àÖfìâ%ÎjcGBüÒ²àYE]¬anû_±Q<t4yË¼Qcú$Ýâ"L·bÞÎç¦3ÂX+:%òR@±üº¤vfC\\rÛ}NR7_Á¤_\\b@ÜÔWïsy&~wî-Àxàp6ËÏ¹bjÇµwÈK[vp!/axC¡®Ê!uÛfæ£ÛÎ*ü[j£iºBÖ¯p´âÃp/Ãï°`yA¿6y2Ð©ïøO®\\fúõ®ÉçäÌÅ°ö²×4ÖµEøxô9°=*­kFÙ?vÇ\\nUÍÞKãÎâIJÒøh±}c¶ì#~TUà àW,á¡_ià2@j_RqèâÁ~?u]oµ:<gYßåulÇ7Ê]ò<à\óÞg+(l´°ø\ç^\\ns"ªë'8ýÇ¼|tÊ?g\\b½âÊ¬êÚªfH"$¼QablÈK\\nr¨kçÜ/¼+o0ôöZ¡"ÃyeÁÀåîôïÌ96U³ã_KÎÜ6\\tj"Ï"`\\n´k¾ïÃ9`½t+XFèmoÖ¨ËZñTµr8ÏHY¤³¸!\\b¾£û·ìªÖõCÏÄ~gy!(NçxópR»ï|yó\\tmfâoÀ$±+ÿÕ:×Jqä#ïÍ¯`-.j}/©fËk'.Åß~±çó\#¼¬ÕÞ y(ÐÍÖ÷`ë@äyr¤´"[CuÕ¹F×äO9¦ªYb"øMW}èIA­¥ù«÷Õ¢%òuÇàðéõ<ñ¹«ÚKk:P;`å=#ßøn"èÆÓÌEà)MÏKÿä2ù½±ËãR-$mgn*|"[¸0yØÙr$²BZÞC.íòî`Há7\\f\\fÖ¡¦^VúU'6qûý¯{X¾l\yL\\rfå6ì}.;mQQÔt0¬Gö×NîäþêªUÂÐ'Ëÿ°ÆÅøi¸cyý©FC"¬g#îy#·ò¯9IÈ| Äñå¡)öÓHÍ¿Ë²`Át\\bBså6qÌn¯Na &¶6à¡ÂCË&}­mÅAÊÝñÑí,äâ9«Ztð>ZÍDJ¼u#o*ÿö/Ð¸Ñò¨9ày$?JüoÃuû ¤Höü¹Ã&é]ËxYÞÿ#lÅ'áìÉ?\UsÌ\t¨gä{YøØx+CF¹ec´¢§P%~åØ¢¡ÀQªÒ8Â/=W_Ün3¨¥±Á­öKÚDTëÜ"Grdï\\n(ùk§EÂÏ­[ÐÈzÕß¢bWìPKû)ìz|óVpõík%üUÒ¾Cò¥y;ØÝÆ>ÃD&¡ÎyEæ£oÙåshJÙFãxÒ~@ífpÊnhBË²\\rnÍ./bÅPô»jë9Ì/lGèZå&ñóEÌP¯m eSTÛÇù5Z³´>ª~X'l/GEÎ|o«è±Ã.K@úÓTÛHøã;Õöj*çÅNÕ4 $a6ÔðýëC¾\\b;"ïÄ\\bD2ÄoS-(`sôXù£·ç+Í'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: sipush #1268
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #100
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 83
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
    //   68: aload #5
    //   70: putstatic burp/Zegl.a : [Ljava/lang/String;
    //   73: iconst_3
    //   74: anewarray java/lang/String
    //   77: putstatic burp/Zegl.b : [Ljava/lang/String;
    //   80: goto -> 227
    //   83: dup_x2
    //   84: pop
    //   85: invokevirtual toCharArray : ()[C
    //   88: dup_x1
    //   89: arraylength
    //   90: dup_x2
    //   91: pop
    //   92: iconst_0
    //   93: istore #6
    //   95: dup2_x1
    //   96: pop2
    //   97: dup_x2
    //   98: iconst_1
    //   99: if_icmpgt -> 200
    //   102: dup2
    //   103: swap
    //   104: iload #6
    //   106: dup2_x1
    //   107: caload
    //   108: swap
    //   109: iload #6
    //   111: bipush #7
    //   113: irem
    //   114: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #93
    //   154: goto -> 184
    //   157: bipush #56
    //   159: goto -> 184
    //   162: bipush #32
    //   164: goto -> 184
    //   167: bipush #30
    //   169: goto -> 184
    //   172: bipush #74
    //   174: goto -> 184
    //   177: bipush #74
    //   179: goto -> 184
    //   182: bipush #23
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 106
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 102
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 40
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC89B) & 0xFFFF;
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
      byte b1 = 25;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zegl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */