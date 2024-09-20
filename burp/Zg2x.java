package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zg2x {
  private static final String[] a;
  
  private static final String[] b;
  
  public static String ZG(Zefg<Zxtl> paramZefg) {
    return Zt(paramZefg, false, false);
  }
  
  public static String Zt(Zefg<Zxtl> paramZefg, boolean paramBoolean1, boolean paramBoolean2) {
    return Zh(paramZefg, false, paramBoolean1, paramBoolean2);
  }
  
  public static String ZM(Zefg<Zxtl> paramZefg, boolean paramBoolean1, boolean paramBoolean2) {
    return Zh(paramZefg, true, paramBoolean1, paramBoolean2);
  }
  
  private static String Zh(Zefg<Zxtl> paramZefg, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    // Byte code:
    //   0: invokestatic Zi : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: new java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #5
    //   14: aload_0
    //   15: ifnull -> 32
    //   18: aload_0
    //   19: invokeinterface size : ()I
    //   24: iconst_1
    //   25: if_icmple -> 32
    //   28: iconst_1
    //   29: goto -> 33
    //   32: iconst_0
    //   33: istore #6
    //   35: aload_0
    //   36: ifnull -> 53
    //   39: aload_0
    //   40: invokeinterface size : ()I
    //   45: iconst_2
    //   46: if_icmple -> 53
    //   49: iconst_1
    //   50: goto -> 54
    //   53: iconst_0
    //   54: istore #7
    //   56: aload_0
    //   57: ifnonnull -> 64
    //   60: iconst_m1
    //   61: goto -> 72
    //   64: aload_0
    //   65: invokeinterface size : ()I
    //   70: iconst_1
    //   71: isub
    //   72: istore #8
    //   74: iload #8
    //   76: istore #9
    //   78: iload #9
    //   80: iflt -> 199
    //   83: aload_0
    //   84: iload #9
    //   86: invokeinterface get : (I)Ljava/lang/Object;
    //   91: checkcast burp/Zxtl
    //   94: astore #11
    //   96: iload_1
    //   97: ifeq -> 133
    //   100: iload #9
    //   102: iload #8
    //   104: if_icmpne -> 133
    //   107: aload #11
    //   109: invokeinterface ZTr : ()Lburp/Zs66;
    //   114: aload #11
    //   116: invokeinterface ZTs : ()Ljava/lang/String;
    //   121: iload_2
    //   122: iload_3
    //   123: invokestatic Zp : (Lburp/Zs66;Ljava/lang/String;ZZ)Ljava/lang/String;
    //   126: astore #10
    //   128: aload #4
    //   130: ifnull -> 154
    //   133: aload #11
    //   135: invokeinterface ZTr : ()Lburp/Zs66;
    //   140: aload #11
    //   142: invokeinterface ZTs : ()Ljava/lang/String;
    //   147: iload_2
    //   148: iload_3
    //   149: invokestatic Zz : (Lburp/Zs66;Ljava/lang/String;ZZ)Ljava/lang/String;
    //   152: astore #10
    //   154: aload #10
    //   156: ifnull -> 191
    //   159: aload #5
    //   161: aload #10
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: pop
    //   167: iload #6
    //   169: ifeq -> 191
    //   172: iload #9
    //   174: ifle -> 191
    //   177: aload #5
    //   179: aload #11
    //   181: invokeinterface ZTr : ()Lburp/Zs66;
    //   186: iload #7
    //   188: invokestatic Zp : (Ljava/lang/StringBuilder;Lburp/Zs66;Z)V
    //   191: iinc #9, -1
    //   194: aload #4
    //   196: ifnull -> 78
    //   199: aload #5
    //   201: invokevirtual length : ()I
    //   204: ifle -> 215
    //   207: aload #5
    //   209: invokevirtual toString : ()Ljava/lang/String;
    //   212: goto -> 216
    //   215: aconst_null
    //   216: areturn
  }
  
  private static void Zp(StringBuilder paramStringBuilder, Zs66 paramZs66, boolean paramBoolean) {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    if (paramZs66 == Zs66.BASE64_ENCODED || paramZs66 == Zs66.BASE64URL_ENCODED) {
      paramStringBuilder.append(a(2047, 11659));
      if (arrayOfZbqc != null) {
        if (paramBoolean)
          paramStringBuilder.append(","); 
        paramStringBuilder.append(a(2042, -29811));
        return;
      } 
      return;
    } 
    if (paramBoolean)
      paramStringBuilder.append(","); 
    paramStringBuilder.append(a(2042, -29811));
  }
  
  private static String Zz(Zs66 paramZs66, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    String str = Zi(paramString, paramBoolean1, paramBoolean2);
    switch (Zr84.ZI[paramZs66.ordinal()]) {
      case 1:
      case 2:
      case 3:
        return str + str;
      case 4:
        return str + str;
      case 5:
        return str + str;
      case 6:
        return str + str;
      case 7:
        return str + str;
      case 8:
        return str + str;
      case 9:
        return str + str;
      case 10:
        return a(1999, -8922);
      case 11:
      case 12:
        return a(2041, 11931);
      case 13:
        return a(1990, -19821) + a(1990, -19821);
      case 14:
        return a(1986, 1566);
      case 15:
        return a(1997, -29952) + a(1997, -29952);
      case 16:
        return str + str;
      case 17:
        return a(1991, -3499);
      case 18:
        return str + str;
      case 19:
        return a(2005, -25401);
      case 20:
        return a(2013, 14354);
    } 
    Zuh.ZT(false, Zqf.Zk, paramZs66.toString());
    return null;
  }
  
  private static String Zp(Zs66 paramZs66, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    String str = Zi(paramString, paramBoolean1, paramBoolean2);
    switch (Zr84.ZI[paramZs66.ordinal()]) {
      case 1:
      case 2:
      case 3:
        return a(2046, 26445) + a(2046, 26445) + str;
      case 4:
        return a(2011, -32405) + a(2011, -32405) + str;
      case 5:
        return a(2011, -32405) + a(2011, -32405) + str;
      case 6:
        return a(2011, -32405) + a(2011, -32405) + str;
      case 7:
        return a(2011, -32405) + a(2011, -32405) + str;
      case 8:
        return a(2011, -32405) + a(2011, -32405) + str;
      case 9:
        return a(2011, -32405) + a(2011, -32405) + str;
      case 10:
        return a(2007, 31809);
      case 11:
      case 12:
        return a(2045, -30438);
      case 13:
        return a(1989, -18821) + a(1989, -18821);
      case 14:
        return a(2014, 20008);
      case 15:
        return a(1984, 4982) + a(1984, 4982);
      case 16:
        return a(2011, -32405) + a(2011, -32405) + str;
      case 17:
        return a(2044, -1285);
      case 18:
        return a(2011, -32405) + a(2011, -32405) + str;
      case 19:
        return a(2043, -4715);
      case 20:
        return a(1988, 13723);
    } 
    Zuh.ZT(false, Zqf.Zk, paramZs66.toString());
    return null;
  }
  
  private static String Zi(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    return (paramBoolean2 ? a(2015, 30204) : "") + (paramBoolean2 ? a(2015, 30204) : "") + ZE(paramString, paramBoolean1);
  }
  
  private static String ZE(String paramString, boolean paramBoolean) {
    if (paramBoolean && paramString != null) {
      StringBuilder stringBuilder = new StringBuilder();
      Zrlp.Zn(stringBuilder, paramString);
      return stringBuilder.toString();
    } 
    return paramString;
  }
  
  static {
    // Byte code:
    //   0: bipush #40
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '@k§×[\¬â%¬9$µR9\\r²©hS÷P°]?Í~Ëûã6Oår\\nÉÏt\\fC\\nçÃÇm\\t0ØÚú®<S´$\\r4§å0W%aë)ÍÕ$\\fdKGM ³À?\\f'1üxE®ÁNÞP·b¥WùW£å g`I-¼îR¬%Ó\\nÐ]©#\\nå&8ÎÞ}I+3Zª%@v¦P\\bÚó«=ü¢ÏÆÒÐ;f®wl@äÞH,·èÊG]×\\n÷º\\fÖ³0`Øï°~ú¹ìô8 eòüÏt8çÔ»Cþ TG3ÝèÏá QßÆ5%m\\r1òÖÃÄ¢hÇ1í\\t\\n±ðÆÌC£`!=µyeíºK²¶ºõ?V®,^Tn-Öh£ÙûEî¬ ©7pÙ\Ðwg7Ht¤ç®4vÜGs Zi\ÝÆ\\n£ä-Ä!pÐrÖÁp·O©_kymJÕ8õfý\\rkGÜ]Ex*ÎU<ukYéÍébIé\\fÂv±/ú§>î()mÃý¸ï°<\\tÄ|¹Gw(-UaìWal03Ý\\nt"~Fåu,KYmïw`ÉÍ\\rg\\bÒ¨$\\f*2¿¢°ÄÏe4¦AüºhsûÈøý¦aIÕõ[CsªvÚhd#|ù>­:km¿¥ÉÒÅ`1PtáøVuy~sM ¡ K\\nvªíÞ:£§§{ËÙ!%fýüI~"©·¼qèdR"á8AÚÅ±Á¥\\r\\fKâ­·}thç½\\f*\\b[ÜÅb,þ$z,Dn«FÓQ·ÄS°aÐëmw.±EO|fñ£xÚòÊó×|K°èq<ÒúûâÒ^)ôÖMúLÌîpA·Ks\\fãØ\\n\\nTÁ8ÃdRj½óðY"q@©/Îñµb'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #30
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #30
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
    //   68: ldc 'ááãMg¤V+É:.~¨Ù®ÛÄ{±®¤+V§N¤'ª G¶#+¦\\bÈQ¤Hî!xTÍtovCmÖÙÁ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #15
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #52
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
    //   129: putstatic burp/Zg2x.a : [Ljava/lang/String;
    //   132: bipush #40
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zg2x.b : [Ljava/lang/String;
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
    //   212: bipush #48
    //   214: goto -> 244
    //   217: bipush #90
    //   219: goto -> 244
    //   222: bipush #108
    //   224: goto -> 244
    //   227: bipush #106
    //   229: goto -> 244
    //   232: bipush #63
    //   234: goto -> 244
    //   237: bipush #72
    //   239: goto -> 244
    //   242: bipush #23
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
    int i = (paramInt1 ^ 0x7DE) & 0xFFFF;
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
      char c = '¦';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */