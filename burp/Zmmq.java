package burp;

import java.util.EnumSet;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmmq extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public static byte Zm(int paramInt, Zvs paramZvs) {
    if (ZA(paramZvs))
      return ZT((byte)4, paramInt); 
    if (paramZvs == Zzu2.CLIENT_SIDE_SQL_INJECTION_DOM_BASED || paramZvs == Zzu2.WEBSOCKET_URL_POISONING_DOM_BASED || paramZvs == Zzu2.LOCAL_FILE_PATH_MANIPULATION_DOM_BASED || paramZvs == Zzu2.XSS_REFLECTED_DOM_BASED || paramZvs == Zzu2.XSS_STORED_DOM_BASED || paramZvs == Zzu2.JAVASCRIPT_INJECTION_REFLECTED_DOM_BASED || paramZvs == Zzu2.JAVASCRIPT_INJECTION_STORED_DOM_BASED || paramZvs == Zzu2.CLIENT_SIDE_SQL_INJECTION_REFLECTED_DOM_BASED || paramZvs == Zzu2.CLIENT_SIDE_SQL_INJECTION_STORED_DOM_BASED || paramZvs == Zzu2.WEBSOCKET_URL_POISONING_REFLECTED_DOM_BASED || paramZvs == Zzu2.WEBSOCKET_URL_POISONING_STORED_DOM_BASED || paramZvs == Zzu2.LOCAL_FILE_PATH_MANIPULATION_REFLECTED_DOM_BASED || paramZvs == Zzu2.LOCAL_FILE_PATH_MANIPULATION_STORED_DOM_BASED)
      return Zzp0.Zc((byte)4, paramInt); 
    if (paramZvs == Zzu2.DOCUMENT_DOMAIN_MANIPULATION_DOM_BASED || paramZvs == Zzu2.DOCUMENT_DOMAIN_MANIPULATION_REFLECTED_DOM_BASED || paramZvs == Zzu2.DOCUMENT_DOMAIN_MANIPULATION_STORED_DOM_BASED || paramZvs == Zzu2.OPEN_REDIRECTION_STORED_DOM_BASED)
      return Zzp0.Zc((byte)3, paramInt); 
    if (paramZvs == Zzu2.OPEN_REDIRECTION_DOM_BASED || paramZvs == Zzu2.COOKIE_MANIPULATION_DOM_BASED || paramZvs == Zzu2.LINK_MANIPULATION_DOM_BASED || paramZvs == Zzu2.CLIENT_SIDE_XPATH_INJECTION_DOM_BASED || paramZvs == Zzu2.CLIENT_SIDE_JSON_INJECTION_DOM_BASED || paramZvs == Zzu2.COOKIE_MANIPULATION_REFLECTED_DOM_BASED || paramZvs == Zzu2.COOKIE_MANIPULATION_STORED_DOM_BASED || paramZvs == Zzu2.OPEN_REDIRECTION_REFLECTED_DOM_BASED || paramZvs == Zzu2.LINK_MANIPULATION_REFLECTED_DOM_BASED || paramZvs == Zzu2.LINK_MANIPULATION_STORED_DOM_BASED || paramZvs == Zzu2.CLIENT_SIDE_XPATH_INJECTION_REFLECTED_DOM_BASED || paramZvs == Zzu2.CLIENT_SIDE_XPATH_INJECTION_STORED_DOM_BASED || paramZvs == Zzu2.CLIENT_SIDE_JSON_INJECTION_REFLECTED_DOM_BASED || paramZvs == Zzu2.CLIENT_SIDE_JSON_INJECTION_STORED_DOM_BASED || paramZvs == Zzu2.DENIAL_OF_SERVICE_STORED_DOM_BASED)
      return Zzp0.Zc((byte)2, paramInt); 
    if (paramZvs == Zzu2.DENIAL_OF_SERVICE_DOM_BASED || paramZvs == Zzu2.HTML5_WEB_MESSAGE_MANIPULATION_DOM_BASED || paramZvs == Zzu2.HTML5_STORAGE_MANIPULATION_DOM_BASED || paramZvs == Zzu2.DOM_DATA_MANIPULATION_DOM_BASED || paramZvs == Zzu2.DENIAL_OF_SERVICE_REFLECTED_DOM_BASED || paramZvs == Zzu2.HTML5_WEB_MESSAGE_MANIPULATION_REFLECTED_DOM_BASED || paramZvs == Zzu2.HTML5_WEB_MESSAGE_MANIPULATION_STORED_DOM_BASED || paramZvs == Zzu2.HTML5_STORAGE_MANIPULATION_REFLECTED_DOM_BASED || paramZvs == Zzu2.HTML5_STORAGE_MANIPULATION_STORED_DOM_BASED || paramZvs == Zzu2.DOM_DATA_MANIPULATION_REFLECTED_DOM_BASED || paramZvs == Zzu2.DOM_DATA_MANIPULATION_STORED_DOM_BASED || paramZvs == Zzu2.AJAX_REQUEST_HEADER_MANIPULATION_DOM_BASED || paramZvs == Zzu2.AJAX_REQUEST_HEADER_REFLECTED_MANIPULATION_DOM_BASED || paramZvs == Zzu2.AJAX_REQUEST_HEADER_STORED_MANIPULATION_DOM_BASED)
      return Zzp0.Zc((byte)1, paramInt); 
    if (paramZvs == Zzu2.CLIENT_SIDE_PROTOTYPE_POLLUTION)
      return 1; 
    Zuh.Zv(false, Zqf.Zk, paramZvs.ZS());
    return Zzp0.Zc((byte)2, paramInt);
  }
  
  public Zmmq() {
    super(EnumSet.of(Zzqz.FLAGS));
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    return (new Zxll(new Zt97(new Zxn2(new Zzz0(new Zt6_(new Zg1f(new Zlet(new Zzzs(new Zs7y()))))))))).Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    if (paramZvs instanceof Zzu2) {
      Zzu2 zzu2 = (Zzu2)paramZvs;
      String str = ZT(zzu2);
      if (str != null) {
        String str1 = Zd(paramZtub, paramZefg, paramInt, str);
        if (Zzp0.ZI(paramInt, 8) && ZA(paramZvs))
          str1 = str1 + str1; 
        return str1;
      } 
    } 
    Zuh.Zv(false, Zqf.Zk, paramZvs.ZS());
    return null;
  }
  
  private String ZT(Zzu2 paramZzu2) {
    switch (Zkbr.Zn[paramZzu2.ordinal()]) {
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
      
    } 
    Zuh.Zv(false, Zqf.Zk, paramZzu2.ZS());
    return null;
  }
  
  private String Zd(Ztub paramZtub, Zefg<Zxtl> paramZefg, int paramInt, String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    Zr2x zr2x = new Zr2x(this, stringBuilder, paramString, paramZefg);
    int[] arrayOfInt = Zr2w.ZL();
    if (paramZtub.ZN() && (paramZtub.Zg() || paramZtub.ZU())) {
      paramZtub.Zd().ZC(zr2x);
      paramZtub.Zx().ZC(zr2x);
      stringBuilder.append(String.format(a(13873, 17740), new Object[] { paramZtub.Zc().Zmz() }));
      if (arrayOfInt == null) {
        paramZtub.ZT(zr2x);
        Zzp0.Zk(paramInt, stringBuilder);
        return stringBuilder.toString();
      } 
      Zzp0.Zk(paramInt, stringBuilder);
      return stringBuilder.toString();
    } 
    paramZtub.ZT(zr2x);
    Zzp0.Zk(paramInt, stringBuilder);
    return stringBuilder.toString();
  }
  
  public static byte Ze(int paramInt, Zvs paramZvs) {
    if (paramZvs == Zzu2.OPEN_REDIRECTION_DOM_BASED || paramZvs == Zzu2.OPEN_REDIRECTION_STORED_DOM_BASED || paramZvs == Zzu2.OPEN_REDIRECTION_REFLECTED_DOM_BASED)
      return 1; 
    boolean bool1 = Zzp0.ZI(paramInt, 4);
    if (bool1)
      return 1; 
    boolean bool2 = Zzp0.ZI(paramInt, 8);
    if (ZA(paramZvs) && bool2)
      return 1; 
    boolean bool3 = Zzp0.ZI(paramInt, 1);
    return (ZW(paramZvs) && bool3) ? 1 : 2;
  }
  
  private static boolean ZA(Zvs paramZvs) {
    return (paramZvs == Zzu2.JAVASCRIPT_INJECTION_DOM_BASED || paramZvs == Zzu2.XSS_DOM_BASED);
  }
  
  private static boolean ZW(Zvs paramZvs) {
    return (paramZvs == Zzu2.AJAX_REQUEST_HEADER_MANIPULATION_DOM_BASED || paramZvs == Zzu2.AJAX_REQUEST_HEADER_REFLECTED_MANIPULATION_DOM_BASED || paramZvs == Zzu2.AJAX_REQUEST_HEADER_STORED_MANIPULATION_DOM_BASED);
  }
  
  public static byte ZT(byte paramByte, int paramInt) {
    return Zzp0.ZI(paramInt, 8) ? 3 : Zzp0.Zc(paramByte, paramInt);
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'O«p]¿HQÊªs¡ñiUâwxIðCÁu×ÄV>bOê½¬è ¿~µ®d0yp¿a\Ö¾C®W¯&H>½ÐÖ2k¥Á2¼W\\fVcÄLG<í×5!pîÒÙi=°ÝTÚ¢ê·¨Ç´Jç6zìãE~&]ö6¤õ¸ôã\\r#@0DAÏ»L¥)òiâCZ±ö9è%\\th¼wÕ@±ýL3g_ÕyÂ\\n©d©äövsaûüM¨) 6\\bv\\n¹éÍs)ÑK&#ÃåÙþZ÷úªÙÙÕÊ\\t~³·S>±Ç_|t«±Âj ¢=Z'Ö²;ç\\tê®µIÄÐàOÏâ³÷xµ^+ð$p:0&.u&[ß6ü->Çô:,ðÐ<¢Íÿ·´§:ôΥ·21ú¯­xóÝ¥úú*Jebö8MØÿ<÷xµÀê*®°­ÖWßÕÑ\\t)Ü\\tÔ¹3d2±1XhQ/õ±kfÆ4êµ?msõ°|k]oòqñx¢¿£SG§u¨ÀÍ\\nWÜKÖL«Ñþ\\blèUQatPÞÜíôñÕlE@OwaùXôVâ/ø¥<'¿Ül-vHË³Mwâ¯^ûeoú¾O`ê7Þ öÑ÷NûR| ÝkÁfèG|ôZ=Ëô<aTÐ:Æsü]ìp«U´¨Èº±+¿ ®C^8¥ô=±?%Pÿ¯K(ÉÛ «xFÏiÉ29ñæº¾§åvBä©,m¡P\\tÅh58,5PiØ\\f<3ßXA3Ö2ÿÚúR¶Î\\fÃWz¶WÐÛ~¤\\b`U½Vý\\bK4¹ÿËÃÔå¼QÖOCè½ü°48®á¦ßqä~òNkýmÐm\\fÎàÿW°Ww*6MfïËI¤mJÎí©zc+ñ[Æ,åDi ­I|-¹óäá|Xgê½oèÖM<Dà(`LÒMÎb»Fd4TÇèºú?0ÔÉ?$Èe2ÃÏ)èË3Í{ °ã{õ(ã1)òwÑP¨|#YpóFI5`ñÞXë;i®-}S¿ôÑ* ÆÒ"êub7:nPý*`^Ü6U¯éØ ~k®ùe¶#*r9y!ð¢ïìî#ÚÞE´ ¦Á¯Ê(BÝÀ©ò Ðh-È%b¨òiùìÆkÝYßë³>×²zê{ÊO\\bbï&Mpú7Ï¾ 1ü@ýv9×ÖöèØÑs©ÖEÿÀ&ä´B\h¸µÆkâÀÂËì£(\\r¢ZNi¬¿ÁW"ØXÞ§&BÜi%*¦ae9¢³å®n%Äns×.\\fG\\n|F/ÓÇºÈËfgÔ¡E,_TÖ¸øãì,óI¸k½ÑBpÒ¹/ñûÊà¬ÓgoDoi_¨X§3 îê×ØÞÇß!÷ÓØ¡#öÙ¥iJ/|÷¼p<ì¹ïDñ_'/9û{¯-ÀôpO#ëP¢8[ÒxäØPÖrZÇI¬Ú¿$_Ö~[àÐfI «ávÝÞï\\t¨E·5äð´¯u Û|këÌÂ÷ÓÞó/c4þ¼ÇúiL;%\knùë_°0«OX\\nu\ÿO»kêËÁÍ)+Í_ÑAH8¤®;öº­À= ÅOH«h]¼HbZÍ¶à¤¨Ãðè5vÐù\\n@M¸!":Ù=yÆiØ.<G¤s"úå3üâ-µR­'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #42
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #66
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
    //   68: ldc '®Vá×ë{e%ðw;©?/iÞüWÇ RÂ^Blz÷RVae«hñ9íÌu¶IÝW°Ó`SxÝ"_SÎûk´ò'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #36
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
    //   129: putstatic burp/Zmmq.a : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmmq.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #19
    //   214: goto -> 243
    //   217: bipush #126
    //   219: goto -> 243
    //   222: bipush #116
    //   224: goto -> 243
    //   227: bipush #52
    //   229: goto -> 243
    //   232: bipush #64
    //   234: goto -> 243
    //   237: iconst_4
    //   238: goto -> 243
    //   241: bipush #119
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
    int i = (paramInt1 ^ 0x3637) & 0xFFFF;
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
      char c = 'ã';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmmq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */