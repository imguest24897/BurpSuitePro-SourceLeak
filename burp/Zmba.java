package burp;

import java.util.EnumSet;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmba extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmba() {
    super(EnumSet.of(Zzqz.VARIANT));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    String str = Zq(paramZtub);
    str = str.replace(a(-25566, -4284), Zg2x.Zt(paramZefg, true, true));
    str = str.replace(a(-25561, 22302), Zg2x.Zt(paramZefg, true, false));
    if (paramZtub.Zg()) {
      str = str.replace(a(-25543, -10161), Zrlp.ZY(paramZtub.Zd().Zub().Zsf().Zis()));
      str = str.replace(a(-25557, 3740), Zrlp.ZY(paramZtlj.ZJ(Ztz3.REFLECTION)));
    } 
    if (paramZtub.Zh()) {
      str = str.replace(a(-25565, 26992), Zrlp.ZY(paramZtub.ZJ().Zub().Zsf().Zis()));
      str = str.replace(a(-25538, -29808), ZJ(paramByte1));
      StringBuilder stringBuilder = new StringBuilder();
      Zmey.Zz(stringBuilder, paramZtub.ZJ().ZKo(), paramZtub.ZJ().ZKk(), a(-25556, -1621));
      str = str.replace(a(-25553, -2370), stringBuilder.toString());
    } 
    if (paramZtub.Zm()) {
      str = str.replace(a(-25568, -5826), Zrlp.ZY(paramZtub.Zr().Zub().Zsf().Zis()));
      str = str.replace(a(-25540, 21104), Zz(paramZtlj));
      str = str.replace(a(-25554, 22047), ZB(paramZtlj));
      str = str + str;
    } 
    return str;
  }
  
  private static String ZB(Ztlj paramZtlj) {
    return paramZtlj.Zj(Ztz3.COLLABORAOR_IP_BASED) ? a(-25564, 26470) : a(-25560, 25660);
  }
  
  private String Zq(Ztub paramZtub) {
    boolean bool1 = paramZtub.Zg();
    boolean bool2 = paramZtub.Zh();
    boolean bool3 = paramZtub.Zm();
    if (bool2 && !bool1 && !bool3)
      return a(-25558, -18200); 
    if (!bool2 && bool1 && !bool3)
      return a(-25555, -25747); 
    if (!bool2 && !bool1 && bool3)
      return a(-25559, -3110); 
    if (!bool2 && bool1 && bool3)
      return a(-25539, 12306); 
    Zuh.Zb(false, Zqf.Zr);
    return "";
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    return ZE.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  private static String Zz(Ztlj paramZtlj) {
    return paramZtlj.Zj(Ztz3.COLLABORAOR_IP_BASED) ? a(-25562, 5802) : a(-25563, -19322);
  }
  
  private static String ZJ(byte paramByte) {
    switch (paramByte) {
      case 0:
      case 2:
        return a(-25537, -29956);
      case 1:
        return a(-25567, -26099);
      case 3:
        return a(-25544, -26593);
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    return "";
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'àºr â¦_fÒ?-£ÙGÞYÒßFN\\fÔðª¹zØlìZ!]QúQ\\b¬r; )ó\\t&¤<[6kþd#WôJ}¦¹~=~µÿAdé&\\nS\\tæ©Þ9/áñÍtn$/< Ú¯êHÉz@^ÈßRöUDo,J0þÖ '/~CÚ(áÃJ;?r~YóY¾çäS¯4é®Ò$©·§HÍ~JE,÷BÊ¢É$Þq¸­×Æ&~¿Éü?±+×6·3tïtÜUq'&À¸5eHdÎº§`§èvçÈ\\bS\\b}£/ßD5É9¬;¡x-7«\\bÇÙ;¾<­è³;/­-ü^%öö ôWÃ|LO­]ÚF'Û³p«/\\nÔ9¯ðõüçüOþW¾Dy{B7-Ë|T\\bo2dEef`52òÕ}ý¾±^wéðÊ(fÄUï½þqoéÛCW0oþ"ËkY~yNçË; +öP2Û§\\r´þdÃ¶M\\b7£E.cJ{]&mÛkÄ©u.]Fé®eDPÀ\\bñ®ØtŔã¸ni×DµC5éÈ»°Å/K%£TE'·¢:àÂ©ígz$ûiÊuþ0ñxùÜ)ît¦ÙRHØ|ûÁÉÁ/,¸/³±c»VÝêIÁ;\\bÓùMh»vûF}Ä[^©¸ÛÄNVõS)Û¨c4ÌÓß_5¨ð÷]*#y:<ËÅÆyÃbõ¢¤ZuqP<1îgìF©-¹?A!S¨âPÌwY&æ]Ù¢3°1UØâ£\\nwûÐÚÔHÍ4üö×Öl÷6a=¤üßÿ±Ë¦@[\\tQ1XWªîÎ¿÷|Ì}Õ?æÜmÏ+|éÉ ßAö/?Ò5Iùo-¼à´PCÊD­vP«LìØO&ñËÓßI?'\\n],íMhâoMº/$wñp2<Æq+ÕöâôwMÖu$¹¨ï0Ì@GÛ:È'¡Öó{@òXrËåLv£İo±,Ê¨Ú52E2µò|®¾xÈsvßÇO}\ÙóÛþ6µüÍ¼Nb×9«\"\\r73<#«<ðÑûgfÔÅfc\Ì­£6b±{a~C;wÖAî¿&¼¦´)²Fã_¼ÁÒ há)24ÚePìÂÕb¸¾¬üíU§¾'OÊlZö³~ÞÕ]É)WÒÍI¢Qq.] jûÊÒÙükú\\ruÃMR 'À\\røÈ§+Qß2>¦©|¾Úºì$èÉK#{ZçN²D»3ij\Ìßò[1r0:öºêvýYÖ0ÔäÙH³Åk³~úàpÑâúÑ±Ægø\\ry *Ftb±í¢<Úy#êL>63¡0®Ñ¾{ß÷ÄF¤þ)uYö5]?ð¾o-ÇwÖ%40ePæDÊ¤Z-Ú,.ã^z\\fðL\\r³Í¸=-Y·÷µÀã=ßÒZ8ú'*v½®JÜ [g½4B=î^ÿ c¤{T¸Xñk|ÝOÈ1ßYIä/yªKk"@>l®£¼Eóx9á£;è5ÇØJ,JÔª²ùMè*|éI"TRôº¦ãùô³~ãRÑî;©,ó¾`ÑDjð$-,ɗól\\fè½Ö4[èË¿zEv[¡1¿\\r¶Æcm>jEÅÂàÿ3Eõ²y9ÅvÃþ@M}IáÚ?ºùo6²CT¿AcÅ¿?9I=5ÞõQ.×q£í#'áàG+a¡Ëb%a}.ñ`lQ¸(@D[méHhÖW\\bçY3Â¡nJî°Ý\«õõD·ÅEÓ¦n¦ñka{=p'v@uYå¸ÏðZDþÑã hd[y¹\\r¦÷y¹0óû®Ô{¿«ä:bEiâ]ç¡¢ú(rR^5³«U¨Û¼é6dU«ÇünVÝwÞ<I]iÜÞÂEOô?ÐÈTºzÊù#\\tñÆN;Ãÿ@ê}DÑè«P[éS½£\\r¢èê¤ôý¾=°ÍÄçhÅíö<VSwªc»ô­Á%;¼75;Ê\\rw\\tAï!E?+RM`²&QÖ) xm×0åç#¼K*hô}RfN/XÄ«ÍIQ2lß¾ÏêáRÑ­/7P&*nJmñà\\\rÜ'èvh.C6Z\\na²×Å¢ÃLOU­T=ÃNjÄÃÓb}ôþÀëc^Í¬¼¼gB%øÅkÓd7²Ö~0çâf¹hþ³(õ"< ¸Ã"|c¾ Ú\\b³c@Ö©P\\nûçqù-Ü¾ÝN5\\t¬9Ê´ü\\f[4«ÿ²x«ÇÚ9ûEnÿKûäÒ hWL¹zÌÜÁ±§ÁÃä Eòr ü3T©ÖÑ=¼äºEí2ççÙ>bjØâ¾\\f4NÃI\\b8ó$pB²õ,UÊ`¿O"¨æþ³ê\\töa'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #407
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #62
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 144
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc 'Q¦?\ùäPG*å}KÁàÕZìRé«ËF9¢'¿'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #23
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #21
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 144
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Zmba.a : [Ljava/lang/String;
    //   133: bipush #22
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zmba.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #11
    //   214: goto -> 244
    //   217: bipush #117
    //   219: goto -> 244
    //   222: bipush #49
    //   224: goto -> 244
    //   227: bipush #108
    //   229: goto -> 244
    //   232: bipush #83
    //   234: goto -> 244
    //   237: bipush #102
    //   239: goto -> 244
    //   242: bipush #56
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 41, 0 -> 100
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9C2D) & 0xFFFF;
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
      byte b1 = 79;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmba.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */