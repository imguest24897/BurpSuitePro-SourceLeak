package burp;

import java.util.EnumSet;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmbb extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmbb() {
    super(EnumSet.of(Zzqz.FLAGS));
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    int[] arrayOfInt = Zsdj.ZH();
    if (Zbqc.Zwu() == null)
      Zsdj.Zt(new int[4]); 
    return (new Zxll(new Zt97(new Zxn2(new Zg1f(new Zt6_(new Zgq9(new Zxll(new Zkje(new Zs7y()))))))))).Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(24945, 1861));
    int[] arrayOfInt = Zsdj.ZH();
    if ((paramInt & 0x1) == 1) {
      stringBuilder.append(a(24947, 9018));
      stringBuilder.append(ZZ(paramInt));
      stringBuilder.append(a(24949, -15339));
      if (arrayOfInt != null) {
        stringBuilder.append(a(24944, -7681));
        stringBuilder.append(ZZ(paramInt));
        stringBuilder.append(a(24950, -20060));
        return stringBuilder.toString();
      } 
      return stringBuilder.toString();
    } 
    stringBuilder.append(a(24944, -7681));
    stringBuilder.append(ZZ(paramInt));
    stringBuilder.append(a(24950, -20060));
    return stringBuilder.toString();
  }
  
  private static String ZZ(int paramInt) {
    int i = paramInt & 0xFFFFFFFE;
    switch (i) {
      case 2:
        return a(24958, 21232);
      case 4:
        return a(24959, 4629);
      case 8:
        return a(24946, -17094);
      case 6:
        return a(24951, -28161);
      case 10:
        return a(24948, 12862);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return "";
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÙHW¹XH^£¡v mîÇK;«ä¸3<Å\¯pÛR>W¼,Çâ·R1«\\rjiÉ\\t_Dö]\\táóìD\mÙ\\r¼øÓr_±RPÂ Õrº%vBÈ\\rë3MSµ6h\Sz|2 H|éZwYÎnÞð£©LúgÎÁhò÷þ´Î0*ªÝÎÊ£i¨)PãÊÄ0âxuÎØØ¿îæþÝ¼pp£Ô,ªLdUÕèü3ä=(ÆB)0o\®»Æòó¸mU\\tb6z\´'¿i]@âÒUSd-ÓjöîTÜ,\\bÿ&g£ú&jÐøÝ |Ëý*ÈOA\\flîñÃøô»](vïU´{FQYÓc}éSeö¼ökµª:kì£Sq½búY½~gú$U0ÃõÎú&¥%kv¤-3ÑAtáy¬Á7sªXÑa8Ï6º0mðÝ$¨T¤T ¸$ÞûĀvÒu«Å®ûLuïIdÐ±b"·ìPý1¹ý,Àù?ëzQÞ¯5ÎhÍ^.ÕóÛÍc4øÓGÅés¸i7ì¿-ºát`ê´t·v³ANU³é 6¶ZOüß¥áÿ¥D¶ûOpRÝãO%M©Ëí0ô*?k®µÎßõ1XH²Ï+Ä\\n3Ñ©iKÝO¸`¡'OÆ×ðãÍèï¬Ý\\ro×1áoIþ~N«kÔþZ:iaÍé®®G[«()®¹hQ-ä*ëÂÒ öjÉ½iôz~6Áß­\\f2-äy}Ʈ©²òn)óõIýY/R0îÉygeM6Þq|©fDµÕéu©u¤õ?ÉL¹±Æsã°[I?ùqÆÂî1½ÌøÍuðôi«Æ]ßd¦6é9¨·û\Ãæ,üæ­~f&hÕFDÁhX·VÓ¡ÎÔ &ïdáöÐ¼fÙ».Uô×ªå\\r)¾:êCwçCFäAÂîñ$cò¶iCCÇÒÎ´"Ï\`¸ZZi²;ñÛJªjEl82 õ1Hû­r×³íÐ6ßÍ£|ëNsYÕÈKg\\nÇ\\bq·x»É%&º\;7´\\rÞ¦\\r[Ö;sÊsá¨s^j$&§ç´3EîwÌCØx¢m\\t»ZàÖÕºËm½µÇ®\y{iÿt$ÖKµÊëIîY^bâ¡ö\\t>Ïk5îv({;EUB ßè°¢¿«`÷êáÙ¿åñò¯<$dÊ°õÃò0^®Ï×7Ú\\b¢­Û¢¹Õ¸-ÕWO_¥èòÍK%4ÅƏZ $JÎûó<-\«¾$µó%°  PÏþg>eÅ4qr°Í/}ùa³?V\{\\bíçJ<Øæ´é½ßaÝ²W³©ÌÈ¾dte¶Uãôá5û¹¸ SMHå¿Oó¿\\t°%ívZSæ|9Ê5@0ÔLÞ¯(ô&4ô+¿1<Í¶þðgy¹ò]µï\¸Ädú°ÖÞÿþèÅm!4Uð!ÂE!Þ jÄ·²þ»rñÃ ÅêÕbìQá®³¹"ëæk_Ä¾­f×é´JÚAlûyFêyáôu¬?|\\t}\\fçyYkZâ¯SlwÿFLFh®7Ô1Ô~äW¯ð<\F\\tÚ3[³}8ÜF¡¡\\f \\r=Ùñß[OÄþîo¤G\ ²ØxpÊF~ÕMêþHìùá98îA.ÆMæ/ û¶ù6MÉMxÙ!#ÏýäÒVá°Ù$|Âû÷0°K zQÖÍ1¯sEryWqÄªǎR)¡|rü{?ìÆo*mDh¿">A£\QØ'°nß:@´Iÿ8Õ4%¢úâBq:x4¡Lº'U¸5ñ­kjUÔ¶>8É)¬&ÓÇzºª@uÓ¡ÖzÜE'ªvró<ØÇ\\tÙ°Ì&y§1fT\\b²)(Éhà`&\\tÄhê&zç?VAS°©D)Ââi»§ìì4ËB[¹}þ9%ÂÍé[àûÙLZh¨´$ æÒeZ"óFå#~¼mtÏÿ>µös¼Û)ñ+°$´j £ê²Ô/v\\bzc\\nåýþZ6÷Ö"öðpMÏ*Ld ârë¦®fCÈ|#ÌPÞJßªèr:¥*"ÂUöô£%\\n:½myiÖDKC\\nZJÝY´fA7$BTYØ§Ý&qTTbgDÎtu(S02å<½l%T}¶\\n¬CdZ ÌV¡½\\ngvª³ÙÀâ\\nE×tæ`÷ÃÞÔ%ÖÜóÁ:Iµ´\·´4¦¥7ÑÀûAÉ÷8)IÍ!aqål]R¡ÔjÐÿ0¼ü=^JZ,2® c @ÀüEâÄÄQvsMä?!¸W¬[é$ÊDÈé¶\\býãiZ³íw­­HÆt{}Æ]dõå½{ +OWPLá-sþøÏà+Øù0.j[é5_9¨Áúl«¢¦ÚB÷è/AßUõª÷'ÕÃ\\bÙ°¸2£Zí¬×p[j%¦]c{ð@ö¤¡/v`ÎÔ¥\\f9ÿçÕiHUNTSÊzx}æHz*;iû¬ëÁ¡1ÝóDÃ97½i9äïÇJtC§YÏ$ïoôÖ£fÂTóDò¸ÂSòì·ühZÈ\$Â'Ð§ ±Òòî·' c]KÛÑ%^$âË\\röáù¿Ç¼Õ¸´)8§±[A)6ÚY¯+²À ÙÕU`ÇNØi³¯aìºAb#|¼æ¥÷\\n&ã#ÃÇòéø`ÈQ ¹¸^\\f$!(ÚR6LÙ°/N¶ÖMf¦)ú'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #402
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #16
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
    //   69: ldc '7jà×_AÈbíïÞ\\n9¸©]Bæ!RîWôL¼#Ez0Ã-¾±¥ùí ÐibQKä¾RéqÐÜu÷ºã»4Ù_3;º¸ó¾Â|<ÊÂX7G 1´I×è³\\r\<£ŜwÖª».aÚç*¿^¹3F%éRÀiÒæY®$ÎÛE~¿éå^¤»¼O( ×3ÐgÏ%K.Ù ]ÒÀò6mX+ÕøÎãXËIÛk«rý<¶X§|ùE§oKIicº?¼WÒz\\fGÀ@°§Ï\r¦Oeªo3Éim¯¥XáLÑ;©.,í¾¡8G|\\ríÁ²äJm îG§ qtd³~ll}þ1nÑä\\tÑYÕ;9Ðs¤w´,E:þQ¶´¡Ìãi»WCª-ëz´ßâEnûFêD,,CÐÈÚPÔ ê:åqVDfOÜírqÞ¢[àqyK:Ò®æ?>|élyÑA]HþBÚoEñÉO6V9ÝÈh_`PyÁÄa2öáaâ\\röíWÓÍ*=?¿~mÜÃÍã)ZI'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #96
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #24
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
    //   130: putstatic burp/Zmbb.a : [Ljava/lang/String;
    //   133: bipush #10
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zmbb.b : [Ljava/lang/String;
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
    //   212: bipush #114
    //   214: goto -> 244
    //   217: bipush #28
    //   219: goto -> 244
    //   222: bipush #12
    //   224: goto -> 244
    //   227: bipush #112
    //   229: goto -> 244
    //   232: bipush #116
    //   234: goto -> 244
    //   237: bipush #19
    //   239: goto -> 244
    //   242: bipush #55
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
    int i = (paramInt1 ^ 0x6177) & 0xFFFF;
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
      byte b1 = 47;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmbb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */