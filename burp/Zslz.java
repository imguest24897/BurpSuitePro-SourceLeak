package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Zm2;

class Zslz {
  private final Zml3 Zr;
  
  private final Zekl Zc;
  
  private final Zrt_ Zk;
  
  private final Zz1p ZL;
  
  private final Zkl6 ZZ;
  
  private final List<String> ZD;
  
  private final Zt12 Zt;
  
  private byte[] ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zslz(Zml3 paramZml3, Zbw_<? extends Zmw9<?>> paramZbw_, Zkl6 paramZkl6, Zgb6 paramZgb6) {
    this.ZD = new ArrayList<>(paramZml3.Zi().ZG());
    this.Zr = paramZml3;
    this.Zc = paramZbw_.ZFM();
    this.ZZ = paramZkl6;
    this.Zk = paramZkl6.Zt().ZG(paramZml3.ZZ().ZJ1());
    this.ZL = paramZml3.Zi();
    this.Zt = new Zt12(paramZml3.ZZ(), this.ZL, this.Zc, paramZkl6, paramZgb6);
  }
  
  void ZE() {
    Zm();
    ZZ();
    ZU();
    this.Zt.Zo(this.ZD, (this.ZZ.ZM().ZP(this.Zr.ZZ()) == Zxk3.HTTP_V2));
    Zj();
    ZB();
  }
  
  byte[] ZW() {
    return this.ZF;
  }
  
  private void Zm() {
    String str2 = Zkb.ZG(this.ZL.Zo.ZdH());
    String str3 = Ztt2.ZO(this.Zr.ZZ());
    String str1 = ZM() ? (a(297, 4439) + a(297, 4439) + str3) : Zkb.ZG(this.ZL.Zo.ZdH());
    Zt(str1);
  }
  
  private String Zx() {
    if (this.Zc.ZlJ()) {
      Zm2.ZC(Zrrh.PROXY_OPTIONS_MISC_USE_HTTP_1_0_IN_REQUESTS);
      return a(303, 26867);
    } 
    return this.ZL.Zh;
  }
  
  private void Zt(String paramString) {
    this.ZD.set(0, this.ZL.Zb + " " + this.ZL.Zb + " " + paramString);
  }
  
  private boolean ZM() {
    return (Zd() && !this.Zr.ZZ().ZJZ());
  }
  
  private boolean Zd() {
    return (this.Zk != null);
  }
  
  private void ZZ() {
    if (!ZM() && a(298, 9031).equalsIgnoreCase(this.ZL.Zb)) {
      byte[] arrayOfByte = this.ZL.Zo.ZdH();
      if (arrayOfByte.length == 2 && arrayOfByte[0] == 47 && arrayOfByte[1] == 42)
        Zt("*"); 
    } 
  }
  
  private void ZU() {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zc : Lburp/Zekl;
    //   8: invokeinterface Zl2 : ()Z
    //   13: ifeq -> 40
    //   16: aload_0
    //   17: getfield ZD : Ljava/util/List;
    //   20: sipush #299
    //   23: sipush #13288
    //   26: invokestatic a : (II)Ljava/lang/String;
    //   29: iconst_0
    //   30: aconst_null
    //   31: iconst_0
    //   32: iconst_0
    //   33: invokestatic ZF : (Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ZZ)V
    //   36: aload_1
    //   37: ifnonnull -> 46
    //   40: getstatic burp/Zrrh.PROXY_OPTIONS_MISC_STRIP_PROXY_HEADERS_DISABLED : Lburp/Zrrh;
    //   43: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   46: aload_0
    //   47: getfield Zc : Lburp/Zekl;
    //   50: invokeinterface Zl1 : ()Z
    //   55: ifeq -> 86
    //   58: aload_0
    //   59: getfield ZD : Ljava/util/List;
    //   62: sipush #300
    //   65: sipush #1088
    //   68: invokestatic a : (II)Ljava/lang/String;
    //   71: iconst_0
    //   72: sipush #292
    //   75: sipush #-25619
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: iconst_0
    //   82: iconst_0
    //   83: invokestatic ZF : (Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ZZ)V
    //   86: aload_0
    //   87: getfield Zc : Lburp/Zekl;
    //   90: invokeinterface ZlV : ()Z
    //   95: ifeq -> 118
    //   98: aload_0
    //   99: getfield ZD : Ljava/util/List;
    //   102: sipush #301
    //   105: sipush #-6074
    //   108: invokestatic a : (II)Ljava/lang/String;
    //   111: iconst_0
    //   112: aconst_null
    //   113: iconst_0
    //   114: iconst_0
    //   115: invokestatic ZF : (Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ZZ)V
    //   118: return
  }
  
  private void Zj() {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZD : Ljava/util/List;
    //   8: ifnonnull -> 12
    //   11: return
    //   12: aload_0
    //   13: getfield ZD : Ljava/util/List;
    //   16: invokeinterface iterator : ()Ljava/util/Iterator;
    //   21: astore_2
    //   22: aload_2
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 117
    //   31: aload_2
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast java/lang/String
    //   40: astore_3
    //   41: aload_3
    //   42: ifnull -> 84
    //   45: aload_3
    //   46: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   49: sipush #295
    //   52: sipush #14304
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   61: ifeq -> 84
    //   64: aload_3
    //   65: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   68: invokestatic ZY : (Ljava/lang/String;)Z
    //   71: ifeq -> 84
    //   74: aload_2
    //   75: invokeinterface remove : ()V
    //   80: aload_1
    //   81: ifnonnull -> 113
    //   84: aload_3
    //   85: ifnull -> 113
    //   88: aload_3
    //   89: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   92: sipush #294
    //   95: sipush #27214
    //   98: invokestatic a : (II)Ljava/lang/String;
    //   101: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   104: ifeq -> 113
    //   107: aload_2
    //   108: invokeinterface remove : ()V
    //   113: aload_1
    //   114: ifnonnull -> 22
    //   117: return
  }
  
  private static boolean ZY(String paramString) {
    return (paramString.contains(a(296, 30283)) || paramString.contains(a(302, -17115)));
  }
  
  private void ZB() {
    byte[] arrayOfByte = this.Zr.ZC();
    this.ZF = Zljl.Zw(this.ZD, arrayOfByte, this.ZL.ZP);
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'µK{=b\\bÑJC?¯;=Ð´èåp×~Î¹âÛÅ¯Áoþ¬VYr5£x¨7ÂvªS­GõvLMçÄ1+ZEÈ:6»¨Óñ·C¹\\bðº3üéwc'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #47
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
    //   68: ldc '½(7í"Þò`Yâ¿ó<ÓCiÐl)9­5ðm½äAj$ÈìÑ.?'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #122
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
    //   129: putstatic burp/Zslz.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zslz.b : [Ljava/lang/String;
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
    //   212: bipush #32
    //   214: goto -> 244
    //   217: bipush #122
    //   219: goto -> 244
    //   222: bipush #18
    //   224: goto -> 244
    //   227: bipush #114
    //   229: goto -> 244
    //   232: bipush #15
    //   234: goto -> 244
    //   237: bipush #40
    //   239: goto -> 244
    //   242: bipush #19
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
    int i = (paramInt1 ^ 0x12E) & 0xFFFF;
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
      byte b1 = 27;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zslz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */