package burp;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import net.portswigger.Zaf;
import net.portswigger.Zhf;
import net.portswigger.Zlr;
import org.brotli.dec.BrotliInputStream;

public class Zmh6 {
  private boolean Zx;
  
  private boolean ZQ;
  
  private boolean Zc;
  
  private boolean Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmh6() {
    this(true);
  }
  
  public Zmh6(boolean paramBoolean) {
    this.Zx = paramBoolean;
  }
  
  public void Zu(boolean paramBoolean) {
    this.Zx = paramBoolean;
  }
  
  public InputStream ZZ(InputStream paramInputStream) throws IOException {
    try {
      if (!this.Zx)
        return paramInputStream; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZQ)
        return (InputStream)new BrotliInputStream(paramInputStream); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zc)
        return new GZIPInputStream(paramInputStream); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Za)
        return new InflaterInputStream(paramInputStream); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramInputStream;
  }
  
  public byte[] ZE(List<String> paramList, byte[] paramArrayOfbyte) {
    if (!this.Zx)
      return paramArrayOfbyte; 
    boolean bool = (paramArrayOfbyte != null && paramArrayOfbyte.length > 0) ? true : false;
    byte[] arrayOfByte = paramArrayOfbyte;
    if (bool && this.ZQ)
      arrayOfByte = Zaf.ZH(arrayOfByte); 
    if (bool && this.Zc)
      arrayOfByte = Zhf.ZX(arrayOfByte); 
    if (bool && this.Za)
      arrayOfByte = Zlr.ZY(arrayOfByte); 
    if (paramArrayOfbyte != arrayOfByte)
      Zgyj.ZF(paramList, a(-14579, 31145), false, a(-14582, -25852) + a(-14582, -25852), false, false); 
    if (this.Za || this.Zc || this.ZQ)
      Zgyj.ZF(paramList, a(-14583, 5387), false, null, false, false); 
    return arrayOfByte;
  }
  
  public void ZP(String paramString) {
    Zv(paramString.toLowerCase(Locale.ENGLISH), true);
  }
  
  public void ZJ(String paramString) {
    Zv(paramString.toLowerCase(Locale.ENGLISH), false);
  }
  
  private void Zv(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZW : ()I
    //   3: istore_3
    //   4: aload_1
    //   5: sipush #-14590
    //   8: sipush #-11484
    //   11: invokestatic a : (II)Ljava/lang/String;
    //   14: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   17: ifeq -> 91
    //   20: aload_1
    //   21: sipush #-14578
    //   24: sipush #30566
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   33: ifeq -> 45
    //   36: aload_0
    //   37: iconst_1
    //   38: putfield Zc : Z
    //   41: iload_3
    //   42: ifeq -> 91
    //   45: aload_1
    //   46: sipush #-14577
    //   49: sipush #14662
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   58: ifeq -> 70
    //   61: aload_0
    //   62: iconst_1
    //   63: putfield Za : Z
    //   66: iload_3
    //   67: ifeq -> 91
    //   70: aload_1
    //   71: sipush #-14581
    //   74: sipush #13483
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   83: ifeq -> 91
    //   86: aload_0
    //   87: iconst_1
    //   88: putfield ZQ : Z
    //   91: aload_1
    //   92: sipush #-14580
    //   95: sipush #-2905
    //   98: invokestatic a : (II)Ljava/lang/String;
    //   101: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   104: ifeq -> 155
    //   107: aload_1
    //   108: bipush #13
    //   110: invokevirtual substring : (I)Ljava/lang/String;
    //   113: invokevirtual trim : ()Ljava/lang/String;
    //   116: astore #4
    //   118: aload #4
    //   120: sipush #-14584
    //   123: sipush #7343
    //   126: invokestatic a : (II)Ljava/lang/String;
    //   129: invokevirtual equals : (Ljava/lang/Object;)Z
    //   132: ifeq -> 155
    //   135: getstatic burp/Zrrh.SUITE_NETWORK_LEGACY_COMPRESSION_HEADER : Lburp/Zrrh;
    //   138: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   141: aload_0
    //   142: iconst_1
    //   143: putfield Za : Z
    //   146: iload_2
    //   147: ifeq -> 155
    //   150: aload_0
    //   151: iconst_1
    //   152: putfield Zc : Z
    //   155: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Í3:.OüH\\bJúëYì(¢ûÿf¸Àf#ìéÁÓ0,~Ò+­e¨vÓ¦b;|÷ûñ7P\\r2\\tÏK¯|÷Þ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #42
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '_úèvþs!Ø=v-P>:·ðóýÃAßûôcuêÛ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #15
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_4
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic burp/Zmh6.a : [Ljava/lang/String;
    //   131: bipush #9
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmh6.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #62
    //   214: goto -> 244
    //   217: bipush #71
    //   219: goto -> 244
    //   222: bipush #82
    //   224: goto -> 244
    //   227: bipush #45
    //   229: goto -> 244
    //   232: bipush #13
    //   234: goto -> 244
    //   237: bipush #86
    //   239: goto -> 244
    //   242: bipush #37
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC70A) & 0xFFFF;
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
      char c = 'ä';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmh6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */