package net.portswigger.browser;

import burp.Zbqc;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import net.portswigger.Zi7;

public abstract class Zd_ implements Zer {
  private final Zd3 ZO;
  
  private final long Zt;
  
  private final ZonedDateTime Zy;
  
  private final boolean Zv;
  
  private final boolean Zh;
  
  private final Integer ZY;
  
  private final Integer Zs;
  
  private final boolean Za;
  
  private final Integer Zq;
  
  private final boolean Zi;
  
  private final boolean ZF;
  
  private final Integer Zj;
  
  private static String ZV;
  
  private static final String[] c;
  
  private static final String[] d;
  
  protected Zd_(Zd3 paramZd3, long paramLong, ZonedDateTime paramZonedDateTime, boolean paramBoolean1, boolean paramBoolean2, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean3, Integer paramInteger3, boolean paramBoolean4, boolean paramBoolean5, Integer paramInteger4) {
    this.ZO = paramZd3;
    this.Zt = paramLong;
    this.Zy = paramZonedDateTime;
    this.Zv = paramBoolean1;
    this.Zh = paramBoolean2;
    this.ZY = paramInteger1;
    this.Zs = paramInteger2;
    this.Za = paramBoolean3;
    this.Zq = paramInteger3;
    this.Zi = paramBoolean4;
    this.ZF = paramBoolean5;
    this.Zj = paramInteger4;
  }
  
  protected Zd_(Zi7 paramZi7) {
    this.ZO = Zd3.ZR(paramZi7.Zo(b(-753, 6070)).ZW());
    String str = ZZ();
    this.Zt = paramZi7.Zm(b(-749, 18567)) ? paramZi7.Zo(b(-749, 18567)).Zk().longValue() : -1L;
    this.Zy = paramZi7.Zm(b(-759, 23287)) ? ZonedDateTime.parse(paramZi7.Zo(b(-759, 23287)).ZW(), DateTimeFormatter.ISO_ZONED_DATE_TIME) : null;
    this.Zv = (paramZi7.Zm(b(-746, 19512)) && paramZi7.Zo(b(-746, 19512)).Zm());
    this.Zh = (paramZi7.Zm(b(-760, -23414)) && paramZi7.Zo(b(-760, -23414)).Zm());
    this.ZY = (paramZi7.Zm(b(-765, -5366)) && paramZi7.Zo(b(-765, -5366)).Zb()) ? Integer.valueOf(paramZi7.Zo(b(-765, -5366)).ZR()) : null;
    this.Zs = (paramZi7.Zm(b(-758, -13823)) && paramZi7.Zo(b(-758, -13823)).Zb()) ? Integer.valueOf(paramZi7.Zo(b(-758, -13823)).ZR()) : null;
    this.Za = (paramZi7.Zm(b(-752, 27238)) && paramZi7.Zo(b(-752, 27238)).Zm());
    this.Zq = paramZi7.Zm(b(-763, 1102)) ? Integer.valueOf(paramZi7.Zo(b(-763, 1102)).ZR()) : null;
    this.Zi = (paramZi7.Zm(b(-751, 29779)) && paramZi7.Zo(b(-751, 29779)).Zm());
    this.ZF = (paramZi7.Zm(b(-764, -23137)) && paramZi7.Zo(b(-764, -23137)).Zm());
    this.Zj = paramZi7.Zm(b(-747, 17479)) ? Integer.valueOf(paramZi7.Zo(b(-747, 17479)).ZR()) : null;
    if (str == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public boolean ZH() {
    return (this.ZY != null && this.Zs != null);
  }
  
  public boolean ZL() {
    return this.Zv;
  }
  
  public int ZK() {
    return (this.ZY != null) ? this.ZY.intValue() : 1920;
  }
  
  public int Zi() {
    return (this.Zs != null) ? this.Zs.intValue() : 1080;
  }
  
  public boolean ZQ() {
    return this.Za;
  }
  
  public boolean ZT() {
    return this.Zi;
  }
  
  public boolean ZE() {
    return this.ZF;
  }
  
  public Zi7 ZA(Zi7 paramZi7) {
    paramZi7.Zg(b(-766, -14267), this.ZO.jsonName);
    String str = ZZ();
    paramZi7.Zg(b(-745, 28284), (this.Zy != null) ? this.Zy.format(DateTimeFormatter.ISO_ZONED_DATE_TIME) : ZonedDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
    paramZi7.Zy(b(-767, 7505), (int)this.Zt);
    paramZi7.ZI(b(-761, 15381), this.Zv);
    paramZi7.ZI(b(-757, -30194), this.Zh);
    if (this.ZY != null)
      paramZi7.Zy(b(-762, -12176), this.ZY.intValue()); 
    if (this.Zs != null)
      paramZi7.Zy(b(-748, 28139), this.Zs.intValue()); 
    paramZi7.ZI(b(-750, -6067), this.Za);
    if (this.Zq != null)
      paramZi7.Zy(b(-756, 12145), this.Zq.intValue()); 
    paramZi7.ZI(b(-768, 13109), this.Zi);
    paramZi7.ZI(b(-755, 4927), this.ZF);
    if (this.Zj != null)
      paramZi7.Zy(b(-754, 1448), this.Zj.intValue()); 
    if (Zbqc.Zwu() == null)
      ZV("DxPyRc"); 
    return paramZi7;
  }
  
  public abstract <T> T Zy(Zj<T> paramZj);
  
  public static void ZV(String paramString) {
    ZV = paramString;
  }
  
  public static String ZZ() {
    return ZV;
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: ldc 'DMbKmb'
    //   9: iconst_0
    //   10: istore_3
    //   11: ldc 'LD;\\rø¦kñk÷Ñô]¾W;<SpQèlÌ²:_ÆvnZ[®âö¸º÷½\\tlÁ~½Ã§¥ãGÛ§L­÷W\\fé±Ún#Z]nâî»ºøû½\\tæ!dEÄÊ¼\\r(qµ<æ\\b>p°iqq¢ë\\t¶nO=¹\\f":ÉËq0®âjuÛ1 ØoE_ì´õÐoÆÈÑ§3ä¡dæK©Ê: ^ö'\\bÐötæv\\rËRXËYÂì #ÓXòWÍP³UWI}êÇ~Û× Ü~$\\f%dÚf>òúyì\\nÝ¢,mÀh;.µ£Â÷~Î{<¸4ûPKýàZÀN3âoÝpLåz Tv®i7ßåç0\\bj#T¨mò|'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: invokestatic ZV : (Ljava/lang/String;)V
    //   23: iconst_5
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: iconst_1
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 146
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 27
    //   71: ldc '¿¾ªoJ\\bmÛ»¸\\t£Ò'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #9
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #98
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic net/portswigger/browser/Zd_.c : [Ljava/lang/String;
    //   135: bipush #24
    //   137: anewarray java/lang/String
    //   140: putstatic net/portswigger/browser/Zd_.d : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 263
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 245, 0 -> 216, 1 -> 221, 2 -> 225, 3 -> 230, 4 -> 235, 5 -> 240
    //   216: bipush #82
    //   218: goto -> 247
    //   221: iconst_5
    //   222: goto -> 247
    //   225: bipush #127
    //   227: goto -> 247
    //   230: bipush #54
    //   232: goto -> 247
    //   235: bipush #59
    //   237: goto -> 247
    //   240: bipush #61
    //   242: goto -> 247
    //   245: bipush #72
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 169
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 165
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFD05) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zd_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */