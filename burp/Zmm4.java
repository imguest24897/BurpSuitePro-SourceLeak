package burp;

import java.util.ArrayList;
import java.util.EnumSet;

public class Zmm4 extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmm4() {
    super(EnumSet.of(Zzqz.FLAGS));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    String str = Zm6_.Zb();
    ArrayList<String> arrayList = new ArrayList();
    if ((paramInt & 0x1000000) == 16777216)
      arrayList.add(a(21420, -19807)); 
    if ((paramInt & 0x10000) == 65536)
      arrayList.add(a(21409, -15387)); 
    if ((paramInt & 0x100) == 256)
      arrayList.add(a(21410, 11437)); 
    if ((paramInt & 0x10) == 16)
      arrayList.add(a(21414, -29547)); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(21412, -13289));
    byte b = 0;
    while (b < arrayList.size()) {
      if (b > 0)
        stringBuilder.append(a(21415, -15772)); 
      if (arrayList.size() > 1 && b + 1 == arrayList.size())
        stringBuilder.append(a(21413, 2759)); 
      stringBuilder.append(arrayList.get(b));
      b++;
      if (str == null) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
    stringBuilder.append(".");
    if ((paramInt & 0x1000000) == 16777216)
      stringBuilder.append(a(21408, -14201)); 
    if ((paramInt & 0x10000) == 65536)
      stringBuilder.append(a(21411, -9567)); 
    if ((paramInt & 0x100) == 256 || (paramInt & 0x10) == 16)
      stringBuilder.append(a(21421, 10625)); 
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
    //   9: ldc '³Bj´BÑk´WÇÄV¤ë#'æºÚSÏ×t7ZZQCÐnýÊß2æ=l¾\\rkB¨lÂ Åu]¸°='&!p,^]ýÈè\\fg&Zg_(ºW&ñÑ»úÙ\\n[±EmajzfÚÚèO§£4Ìyé¨(*F[CzxI=hgR¹0©¯Ö«#ñúûdh7äøeÁÑ¦AûNè5r_¯±Ë}ÙÕLVñ+Ôð$J}#k`Â³úÄ"Æ|'WO?u»`ï¾jE\\fÒç¤'ôãàpEùFL¹H¨püzsÃøa\\be_5ºý8^.ü»@däÞþÓ²®$°C\\tEE\\r[L(Îÿ»VMä(¥±¤2I©¹äI!àÙc¯kFªó%k[.ºI¾Vâ¨_þÔLö\;ðyáJkÔ<]_ÿ½áIY\\rõ\zÞã¢.÷q¥×*\\rRi:èrd×¾éßó{÷Fý7¯ø5æ¼³ßÿù´\\r8UÒį«È"Cz7ð¸Óbu~¢Eã¾²ÒýRæYrO·æ¨Ê«m\\t4bÇC@³<f2upÅð\\rb °ß'í)"3_QÔ\\r ÔÚc7O±(ãýÃ÷.2¬Ñ¦äÁÙV¯?Ïî¯²ÏÌÕ¸/vOå3Ï%ðÛQDØ³jyÅ`EosôËvOÎÑsZª#ÑÈ)W~ï^yµWí8b[j°.LIoÝ±ò\\fÍû~Õ?g¥:ñt7ðºEjúÌò'È¬x\\faKú0Á,+±½Õæ¤¢*~\\n\\b*yS÷ÊÐ;·Cä£ê7OÙ8ÓáêCSnÐ¨©Ãã¢b.¤öÇ\\b×ËâÞI4º|5&Ön/~IpaXÉüö\\bí/¦¿5ó<)0A-£&ß~`aYLÛ§ =ÃñS«|¡<ÃÉæ#2÷¥n'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #7
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 143
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'b]1E^È¦ÈõâH1ð~øE }||Õî×S|Ô-Ó0IxØ\\t¢\+8mFg¨ï×ÇýpQå¼:¡÷L¨HÏîïôªÅ)â×iMòM2¸"X1£gctú£ºó%\\bt¥¥}1g®o¸H¥âY*ø¦8½~B¤ì3yÖ9`B=ù*z+Û;!ì<ÓIkÐ@ÓHåÈXòcô[èýµH´Ò¯¢iÓk­Ç¡oaßZ?·Öë¥DCï·!Ì:5øãíq\\bD°áÆ©¨ÛÐ0êÉxÝÛZ\\näÆ+CQî ë¿ñ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: sipush #233
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #34
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
    //   129: putstatic burp/Zmm4.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmm4.b : [Ljava/lang/String;
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
    //   212: bipush #7
    //   214: goto -> 244
    //   217: bipush #62
    //   219: goto -> 244
    //   222: bipush #50
    //   224: goto -> 244
    //   227: bipush #95
    //   229: goto -> 244
    //   232: bipush #88
    //   234: goto -> 244
    //   237: bipush #118
    //   239: goto -> 244
    //   242: bipush #127
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
    //   283: tableswitch default -> 39, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x53A5) & 0xFFFF;
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
      byte b1 = 49;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmm4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */