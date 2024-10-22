package burp;

import java.net.URL;
import java.util.List;
import net.portswigger.Zm2;

public class Zg2j implements IExtensionHelpers {
  private final IExtensionHelpers ZZ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg2j(IExtensionHelpers paramIExtensionHelpers) {
    this.ZZ = paramIExtensionHelpers;
  }
  
  public IRequestInfo analyzeRequest(IHttpRequestResponse paramIHttpRequestResponse) {
    Zm2.ZD(a(9597, -12579));
    return this.ZZ.analyzeRequest(paramIHttpRequestResponse);
  }
  
  public IRequestInfo analyzeRequest(IHttpService paramIHttpService, byte[] paramArrayOfbyte) {
    Zm2.ZD(a(9598, 31278));
    return this.ZZ.analyzeRequest(paramIHttpService, paramArrayOfbyte);
  }
  
  public IRequestInfo analyzeRequest(byte[] paramArrayOfbyte) {
    Zm2.ZD(a(9572, -12176));
    return this.ZZ.analyzeRequest(paramArrayOfbyte);
  }
  
  public IResponseInfo analyzeResponse(byte[] paramArrayOfbyte) {
    Zm2.ZD(a(9569, 23716));
    return this.ZZ.analyzeResponse(paramArrayOfbyte);
  }
  
  public IParameter getRequestParameter(byte[] paramArrayOfbyte, String paramString) {
    Zm2.ZD(a(9576, 11509));
    return this.ZZ.getRequestParameter(paramArrayOfbyte, paramString);
  }
  
  public String urlDecode(String paramString) {
    Zm2.ZD(a(9574, 25670));
    return this.ZZ.urlDecode(paramString);
  }
  
  public String urlEncode(String paramString) {
    Zm2.ZD(a(9599, -12529));
    return this.ZZ.urlEncode(paramString);
  }
  
  public byte[] urlDecode(byte[] paramArrayOfbyte) {
    Zm2.ZD(a(9568, 25318));
    return this.ZZ.urlDecode(paramArrayOfbyte);
  }
  
  public byte[] urlEncode(byte[] paramArrayOfbyte) {
    Zm2.ZD(a(9588, 32301));
    return this.ZZ.urlEncode(paramArrayOfbyte);
  }
  
  public byte[] base64Decode(String paramString) {
    Zm2.ZD(a(9582, 9748));
    return this.ZZ.base64Decode(paramString);
  }
  
  public byte[] base64Decode(byte[] paramArrayOfbyte) {
    Zm2.ZD(a(9595, -9184));
    return this.ZZ.base64Decode(paramArrayOfbyte);
  }
  
  public String base64Encode(String paramString) {
    Zm2.ZD(a(9570, -2819));
    return this.ZZ.base64Encode(paramString);
  }
  
  public String base64Encode(byte[] paramArrayOfbyte) {
    Zm2.ZD(a(9581, 26089));
    return this.ZZ.base64Encode(paramArrayOfbyte);
  }
  
  public byte[] stringToBytes(String paramString) {
    Zm2.ZD(a(9589, -8125));
    return this.ZZ.stringToBytes(paramString);
  }
  
  public String bytesToString(byte[] paramArrayOfbyte) {
    Zm2.ZD(a(9583, 25130));
    return this.ZZ.bytesToString(paramArrayOfbyte);
  }
  
  public int indexOf(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean, int paramInt1, int paramInt2) {
    Zm2.ZD(a(9577, 29192));
    return this.ZZ.indexOf(paramArrayOfbyte1, paramArrayOfbyte2, paramBoolean, paramInt1, paramInt2);
  }
  
  public byte[] buildHttpMessage(List<String> paramList, byte[] paramArrayOfbyte) {
    Zm2.ZD(a(9579, -16167));
    return this.ZZ.buildHttpMessage(paramList, paramArrayOfbyte);
  }
  
  public byte[] buildHttpRequest(URL paramURL) {
    Zm2.ZD(a(9591, -601));
    return this.ZZ.buildHttpRequest(paramURL);
  }
  
  public byte[] addParameter(byte[] paramArrayOfbyte, IParameter paramIParameter) {
    Zm2.ZD(a(9587, -28573));
    return this.ZZ.addParameter(paramArrayOfbyte, paramIParameter);
  }
  
  public byte[] removeParameter(byte[] paramArrayOfbyte, IParameter paramIParameter) {
    Zm2.ZD(a(9592, -9803));
    return this.ZZ.removeParameter(paramArrayOfbyte, paramIParameter);
  }
  
  public byte[] updateParameter(byte[] paramArrayOfbyte, IParameter paramIParameter) {
    Zm2.ZD(a(9573, -9814));
    return this.ZZ.updateParameter(paramArrayOfbyte, paramIParameter);
  }
  
  public byte[] toggleRequestMethod(byte[] paramArrayOfbyte) {
    Zm2.ZD(a(9594, 7277));
    return this.ZZ.toggleRequestMethod(paramArrayOfbyte);
  }
  
  public IHttpService buildHttpService(String paramString1, int paramInt, String paramString2) {
    Zm2.ZD(a(9578, 20072));
    return this.ZZ.buildHttpService(paramString1, paramInt, paramString2);
  }
  
  public IHttpService buildHttpService(String paramString, int paramInt, boolean paramBoolean) {
    Zm2.ZD(a(9590, -19750));
    return this.ZZ.buildHttpService(paramString, paramInt, paramBoolean);
  }
  
  public IParameter buildParameter(String paramString1, String paramString2, byte paramByte) {
    Zm2.ZD(a(9580, -6741));
    return this.ZZ.buildParameter(paramString1, paramString2, paramByte);
  }
  
  public IHttpHeader buildHeader(String paramString1, String paramString2) {
    Zm2.ZD(a(9593, 5919));
    return this.ZZ.buildHeader(paramString1, paramString2);
  }
  
  public IScannerInsertionPoint makeScannerInsertionPoint(String paramString, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    Zm2.ZD(a(9596, -1133));
    return this.ZZ.makeScannerInsertionPoint(paramString, paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public IResponseVariations analyzeResponseVariations(byte[]... paramVarArgs) {
    Zm2.ZD(a(9575, -28951));
    return this.ZZ.analyzeResponseVariations(paramVarArgs);
  }
  
  public IResponseKeywords analyzeResponseKeywords(List<String> paramList, byte[]... paramVarArgs) {
    Zm2.ZD(a(9571, -1924));
    return this.ZZ.analyzeResponseKeywords(paramList, paramVarArgs);
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '$øâ@icN³lj¢ 7ÊÁëÁ¬\\r{|t"6gºá\ e¡âjèl2ÀuÑV¹ ®4¡`ôªM{p!¨Giå& ÛuHàWÃOdÆÁ¾¦Õ,9ï¾Ü+sÃ½G{ Ðmf Ç\\bç`ÏB§Qî~©×Dn¹iÃ®­"X>ÌÜúã"ýá£9¼¡ñ"ÜXúÆWôè­Gk  .*¯9ø,`nRï^ÒVöÜ<æ=Ô}£¥¯u7òå+`zkÿeðÐ~=®Ì¬<¨|Ë\\t,è1ÿ£%!yX" XjÐD¿-ë0\\bòßSÓIZ1­üù'wDÿ6+¨pi&|ÛîHW­O©Æx¥<=ãÒýaÒX?Ô$ÁV×, ë¦Ù+'z|þÑ ÜÎE_Ùú)àZ.9ª5D'!i9Q*!Y;JTÔ??ûÈ2ÇÀ+Õ¸ö)odJå¢ àc`a0ÿgÌ¢Ç]màN¬^¯ö\\ny?+vê)µRÊGRôUÿ±mé\\b!.i«xIk\,,¡K&Z°.É0ù/@Ï"ð/î~Â®k3¬ÃW|4\\tà#äçöeÿiùDÿ.,ë\!:;?lûarnëÑRwh÷ wdsÔ¾ÌÅªÌ0F½ZËFrÔQû1}ù\\n#n)£epË$KöÌÀ\\rbA0%\\r¸¾väÂÏýåñÌ¸è/¨½gØþ\\n^J(ýjÃ@sqã2ý/l¨Shx¨¯191\ê¢U´nhüB§'U§è\\f|²Á\\bç¤à»Q©¬Pw\ÄG=[ükë/++[ é?"w°\\f³YþõY×)ô¦;yA¯ü¼$ÙÂîãç!·ZýTÞ¹im±>{éE?Pd`,l¢wAÑä%ÎÜ¥¿Îè¸.YôÖõ`%|¨·[Pá-D(ìúYÙ3?X§äº.H¤:ÚÿÜ!Bµªª4*ÖÈë!MÜ¢KZ|PÏ'wè¦#£¹^ó±"0)z(DBÁfiÿ²Ðµ\\fTë~uã¬q%|n>ø"7¬X±^h¨:UU¼Hh¼»¢{äeGm*OI$¹(r6 ß¶çù±á°K£gDuåðilÀ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #31
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #114
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
    //   68: ldc 'M¤ ÒQaC8lr;ÕãfW¢xÀ¿ßv³¸TôÛØ> ®ÑÅ¶ÍÁ=äÁÅq*8§é®'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #30
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
    //   129: putstatic burp/Zg2j.a : [Ljava/lang/String;
    //   132: bipush #29
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zg2j.b : [Ljava/lang/String;
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
    //   212: bipush #24
    //   214: goto -> 244
    //   217: bipush #119
    //   219: goto -> 244
    //   222: bipush #91
    //   224: goto -> 244
    //   227: bipush #70
    //   229: goto -> 244
    //   232: bipush #78
    //   234: goto -> 244
    //   237: bipush #124
    //   239: goto -> 244
    //   242: bipush #80
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
    int i = (paramInt1 ^ 0x256F) & 0xFFFF;
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
      byte b1 = 46;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */