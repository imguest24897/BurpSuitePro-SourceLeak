package burp;

import java.util.ArrayList;
import java.util.EnumSet;

public class Zmm0 extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmm0() {
    super(EnumSet.of(Zzqz.FLAGS));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    String[] arrayOfString = Zsq1.ZS();
    ArrayList<String> arrayList = new ArrayList();
    if ((paramInt & 0x1000000) == 16777216)
      arrayList.add(a(22658, -29847)); 
    if ((paramInt & 0x10000) == 65536)
      arrayList.add(a(22660, 16917)); 
    if ((paramInt & 0x100) == 256)
      arrayList.add(a(22657, 10068)); 
    if ((paramInt & 0x10) == 16)
      arrayList.add(a(22663, -28960)); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(22659, 6606));
    byte b = 0;
    while (b < arrayList.size()) {
      if (b > 0)
        stringBuilder.append(a(22656, 20080)); 
      if (arrayList.size() > 1 && b + 1 == arrayList.size())
        stringBuilder.append(a(22661, -20840)); 
      stringBuilder.append(arrayList.get(b));
      b++;
      if (arrayOfString != null) {
        Zbqc.Zr(new Zbqc[3]);
        break;
      } 
    } 
    stringBuilder.append(".");
    if ((paramInt & 0x1000000) == 16777216)
      stringBuilder.append(a(22666, -28281)); 
    if ((paramInt & 0x10000) == 65536)
      stringBuilder.append(a(22662, -660)); 
    if ((paramInt & 0x100) == 256 || (paramInt & 0x10) == 16)
      stringBuilder.append(a(22667, -27463)); 
    return stringBuilder.toString();
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    return ZU.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\f]Ç#Í¬Ü·½xx¨­xî_kP8}{½@ <éá9mö$;åf¯R¦þ¹:q\\b\\rÓüø ¦zM)´z[ã±M$gqQãftÍXiÁiÏfê+)Ë÷?L.ùsv8KLÒFýjÒÏî>)ñ±³ªÍªÍÑ,àCįÃoTàÍ¸!úÕ¿>1_÷ïÃq6£{(* Z5>ùùù"u#Ï-áNKµ{øõûòÇÙKIgYË:Vü ø¾ÛT#½ÐÓMøÛf¢RÖþÞyíW§ÿø}ëÓ9DÓ)e\4Ó*dí½`E¤òÈ4¹º¼ëÔÉrÀRS¬(E§=ïÏ9¶u²X:Ðm-îæjvG¡ÐBÖñä!2kýdxjÑév<IÇùÚD9ÄðêX¢öyøÔAÀ³,:ªq"ÚD©CìD`Ï¼Ê<sÒ¶qíÖ×¬«ûÁ@áÝÈäNËäç§\\t[Þ_v1[tá´ÅU¸uâø³]!)!´îXÈîe¡HñJ»½éê&ûJ9ûH6'p­X0@½ÇZo¯Ð9öàÈIûáß$x<{âr*ò!vàCæoNñ²F­UXQ|\\tó=`È¨ÅNÌñ#Ü»Ë¥È\»ÅÈ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #29
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #39
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 144
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
    //   68: ldc '\\bNe/EvÆàâ¡ñ·jØQo?Ëåø,à¬IºÌk®j.Ág<T»µí¼u'üäz¶»xÞC«@`z<1K½ÍqhFxÑ µ]ìó­ÆôÓõ%äÑÆ®ÁL)}\\r­Î%=yÆ0àÚãHøb{Åi¼[jãÀk¶\\n§Ä6iäcÉ·pÅø¢â®@ÛÔ}®Mÿ­fÜ~6eÀü8ª]fõ¢qïÈÈ_må¹Ï¦oZ÷m0WWØ#T!ªYQUÊ&@ðÂÏØAÞóXÿx«Î`®éæ¸$.fý?JçÀä6²p¢Ä|ýq¢òÜ§Ú9~t=G:ù½è¯³jv¼Qè@B¾¤ÚN=È°2z¶w6:À¦-jëmNbÉ2õÝ^ÁéH:&ÈÛòôfø)t[×ùT¸Þð­¿ç@x¨"=FÈXý/Å\\rÝÍåÆõ.©óL«Êû£7z`OáÄõÆIÕé8ôvÁQ\\r2®\\r·\\\rm["Ëø\\rüâ*½,Á "ÝÛ¥$ã¬i5[Ul&cKiT4g/øX>Û\\t8;'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: sipush #251
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #8
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
    //   130: putstatic burp/Zmm0.a : [Ljava/lang/String;
    //   133: bipush #10
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zmm0.b : [Ljava/lang/String;
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
    //   212: bipush #117
    //   214: goto -> 244
    //   217: bipush #119
    //   219: goto -> 244
    //   222: bipush #10
    //   224: goto -> 244
    //   227: bipush #17
    //   229: goto -> 244
    //   232: bipush #123
    //   234: goto -> 244
    //   237: bipush #16
    //   239: goto -> 244
    //   242: bipush #42
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
    //   283: tableswitch default -> 40, 0 -> 100
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5882) & 0xFFFF;
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
      byte b1 = 126;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmm0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */