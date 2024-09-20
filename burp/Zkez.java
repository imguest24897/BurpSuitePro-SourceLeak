package burp;

import java.text.SimpleDateFormat;
import java.util.Date;
import net.portswigger.Zah;
import net.portswigger.Zc1;
import net.portswigger.Zc5;
import net.portswigger.Zcg;
import net.portswigger.Zct;
import net.portswigger.Zg2;
import net.portswigger.Zk_;
import net.portswigger.Zlo;
import net.portswigger.Zqf;
import net.portswigger.Zrm1;
import net.portswigger.Zrme;
import net.portswigger.Zrzh;
import net.portswigger.Zsb;
import net.portswigger.Zsh;
import net.portswigger.Zuh;

public class Zkez {
  public static final SimpleDateFormat Zc;
  
  private final Zr18 Zt;
  
  private final Zsmj Zm = new Zsmj(Zrf1.Za);
  
  private final Zct ZD;
  
  protected final Zlrb ZS;
  
  private static Zbqc[] Zu;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private static String Zb(long paramLong) {
    return Zc.format(new Date(paramLong));
  }
  
  public Zkez(Zr18 paramZr18, Zlrb paramZlrb, Zct paramZct) {
    this.Zt = paramZr18;
    this.ZD = paramZct;
    this.ZS = paramZlrb;
  }
  
  protected void Zt() {
    this.Zt.Z_(Zmg9.DELETE_REQUEST_TO_ENTERPRISE_API);
  }
  
  @Zsb(ZL = "info")
  public Zct Zd() {
    return this.ZD;
  }
  
  @Zsb(ZL = "knowledgeBase")
  public Zsmj Z_() {
    return this.Zm;
  }
  
  @Zsb(ZL = "license", Zp = Zbpf.class)
  public Zrzh Zv() {
    return this.ZS.ZW();
  }
  
  @Zsb(ZH = "DELETE", ZL = "license", Zp = Zbpf.class)
  public void ZW() {
    this.ZS.Zn.Zr(Zxc8.REST_API);
  }
  
  @Zsb(ZH = "PUT", ZL = "licenseKey", Zp = Zbpf.class)
  public Zc1 ZT(@Zc5(Ze = "key") String paramString) {
    Zbqc[] arrayOfZbqc = ZR();
    Zlo zlo = this.ZS.Zn.Zi(paramString, Zxc8.REST_API);
    try {
      switch (Zrm0.Zr[zlo.ordinal()]) {
        case 1:
        case 2:
        case 3:
          try {
            if (arrayOfZbqc != null)
              return new Zc1(); 
          } catch (Zrme zrme) {
            throw a(null);
          } 
        case 4:
          throw new Zrme(Integer.valueOf(1002), a(26085, 1180));
        case 5:
          throw new Zrme(Integer.valueOf(1003), a(26082, -10847));
        case 6:
          throw new Zrme(Integer.valueOf(1004), a(26086, -21477));
      } 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    Zuh.ZT(false, Zqf.Zk, zlo.name());
    throw new Zrm1(a(26083, 32435));
  }
  
  @Zsb(ZL = "licenseActivationRequest", Zp = Zbpf.class)
  public Zsh Zb() {
    return this.ZS.ZX();
  }
  
  @Zsb(ZH = "PUT", ZL = "licenseActivation", Zp = Zbpf.class)
  public Zcg Zc(@Zc5(Ze = "licenseActivationRequest") Zsh paramZsh) {
    return this.ZS.ZE(paramZsh);
  }
  
  @Zsb(ZH = "PUT", ZL = "licenseActivationResponse", Zp = Zbpf.class)
  public Zc1 ZT(@Zc5(Ze = "licenseActivationResponse") Zcg paramZcg) {
    this.ZS.ZF(paramZcg);
    return new Zc1();
  }
  
  private static Zg2 Zn(Zlnv paramZlnv, Zlo paramZlo, Zkvo paramZkvo) {
    try {
      if (paramZkvo == null)
        return new Zg2(paramZlo, null, null, null, null, null, null, null, null, null); 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    String str1 = paramZlnv.ZB(paramZkvo.Zr());
    String str2 = Zkav.ZM(paramZkvo.ZF());
    try {
    
    } catch (Zrme zrme) {
      throw a(null);
    } 
    return new Zg2(paramZlo, (paramZkvo.Zc() == null) ? null : paramZkvo.Zc().toString(), paramZkvo.Zr(), paramZkvo.ZE(), Zb(paramZkvo.Zw()), (paramZkvo.Zy() == 0) ? null : Integer.valueOf(paramZkvo.Zy()), paramZkvo.ZI(), ZR(paramZkvo.ZW()), str1, str2);
  }
  
  private static String ZR(Zxje paramZxje) {
    try {
      if (paramZxje == null)
        return null; 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    try {
      if (paramZxje.ZL())
        return a(26087, 3676); 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    return Zb(paramZxje.ZE());
  }
  
  protected static int Za() {
    try {
      return Integer.parseInt(Zgkt.Zj());
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      return -1;
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_5
    //   8: anewarray burp/Zbqc
    //   11: iconst_0
    //   12: istore_3
    //   13: ldc '¢Ta^[:>\\rÿó0rCiÜ30Ïî9F·ÐyVÍáO$E¥D³¹ó8Óya°2 ª+Ý¸@G÷Y¡Kìkk+\¸ü×:<gáY¹ðöEòï-\\nÅ ÁPfÒ¶BÓ-â!ÐçÎ[j©%G.)þKÍK9&ìô~úñâ°Õ\\n'CxlËÞK`m"±7ñÖ6Ñ'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #7
    //   24: istore_1
    //   25: invokestatic Zr : ([Lburp/Zbqc;)V
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #85
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc 'T=Ù\\rÓ:*û6úJr²¾qÄ¹k¹óO|4('
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #36
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #28
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic burp/Zkez.a : [Ljava/lang/String;
    //   139: bipush #7
    //   141: anewarray java/lang/String
    //   144: putstatic burp/Zkez.b : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 268
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #18
    //   222: goto -> 252
    //   225: bipush #11
    //   227: goto -> 252
    //   230: bipush #53
    //   232: goto -> 252
    //   235: bipush #23
    //   237: goto -> 252
    //   240: bipush #35
    //   242: goto -> 252
    //   245: bipush #64
    //   247: goto -> 252
    //   250: bipush #54
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 173
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 169
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 47, 0 -> 106
    //   308: new java/text/SimpleDateFormat
    //   311: dup
    //   312: sipush #26084
    //   315: sipush #1782
    //   318: invokestatic a : (II)Ljava/lang/String;
    //   321: invokespecial <init> : (Ljava/lang/String;)V
    //   324: putstatic burp/Zkez.Zc : Ljava/text/SimpleDateFormat;
    //   327: getstatic burp/Zkez.Zc : Ljava/text/SimpleDateFormat;
    //   330: sipush #26081
    //   333: sipush #32104
    //   336: invokestatic a : (II)Ljava/lang/String;
    //   339: invokestatic getTimeZone : (Ljava/lang/String;)Ljava/util/TimeZone;
    //   342: invokevirtual setTimeZone : (Ljava/util/TimeZone;)V
    //   345: return
  }
  
  public static void Zr(Zbqc[] paramArrayOfZbqc) {
    Zu = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZR() {
    return Zu;
  }
  
  private static Zrme a(Zrme paramZrme) {
    return paramZrme;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x65E7) & 0xFFFF;
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
      byte b1 = 5;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkez.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */