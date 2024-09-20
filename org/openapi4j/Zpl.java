package org.openapi4j;

import com.fasterxml.Zg.Zs;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zy6;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Zpl {
  private static final Pattern ZP;
  
  public static final Zy6 Zo;
  
  public static final Zy6 Zu;
  
  public static final Zz ZD;
  
  public static final Zz Ze;
  
  private static Zz Zy;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static void ZU(Zz paramZz) {
    Zy = paramZz;
  }
  
  public static Zb Zq(URL paramURL, List<Zpi> paramList) throws Zau, Zp0 {
    Objects.requireNonNull(paramURL, a(-10703, -27065));
    try {
      InputStream inputStream = Zy.ZU(paramURL, paramList);
      String str = Zad.ZK(inputStream, StandardCharsets.UTF_8.name());
      return ZA(str);
    } catch (Zp0 zp0) {
      throw zp0;
    } catch (Exception exception) {
      throw new Zau(String.format(a(-10701, -15038), new Object[] { exception.getMessage() }));
    } 
  }
  
  public static Zb ZX(byte[] paramArrayOfbyte) throws Zau {
    try {
      String str = Zad.ZC(paramArrayOfbyte, StandardCharsets.UTF_8);
      return ZA(str);
    } catch (Exception exception) {
      throw new Zau(String.format(a(-10702, -22348), new Object[] { exception.getMessage() }));
    } 
  }
  
  public static Zb ZW(String paramString) throws Zau {
    try {
      return ZA(paramString);
    } catch (Exception exception) {
      throw new Zau(String.format(a(-10701, -15038), new Object[] { exception.getMessage() }));
    } 
  }
  
  public static boolean Zd(String paramString) {
    Matcher matcher = ZP.matcher(paramString);
    return matcher.find();
  }
  
  private static Zb ZA(String paramString) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zb zb = Zd(paramString) ? Zo.Za(paramString) : Zu.Za(paramString);
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (zb == null) ? (Zb)Zs.Zx() : zb;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '·fmìÔÂõ!Å~h½Oo6Çþ7\\f{iã'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #13
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #82
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc '»Ô>ÌþeZ%M*r@<-$o«NË@h·ÀG«P]'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #20
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #126
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic org/openapi4j/Zpl.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic org/openapi4j/Zpl.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #65
    //   214: goto -> 244
    //   217: bipush #94
    //   219: goto -> 244
    //   222: bipush #69
    //   224: goto -> 244
    //   227: bipush #18
    //   229: goto -> 244
    //   232: bipush #110
    //   234: goto -> 244
    //   237: bipush #79
    //   239: goto -> 244
    //   242: bipush #105
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: sipush #-10704
    //   303: sipush #-6370
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   312: putstatic org/openapi4j/Zpl.ZP : Ljava/util/regex/Pattern;
    //   315: new com/fasterxml/Zor/Zy6
    //   318: dup
    //   319: invokespecial <init> : ()V
    //   322: putstatic org/openapi4j/Zpl.Zo : Lcom/fasterxml/Zor/Zy6;
    //   325: new com/fasterxml/Zor/Zy6
    //   328: dup
    //   329: new com/fasterxml/Zv/Zf
    //   332: dup
    //   333: invokespecial <init> : ()V
    //   336: invokespecial <init> : (Lcom/fasterxml/Zb/Zmi;)V
    //   339: putstatic org/openapi4j/Zpl.Zu : Lcom/fasterxml/Zor/Zy6;
    //   342: new org/openapi4j/Zp3
    //   345: dup
    //   346: invokespecial <init> : ()V
    //   349: putstatic org/openapi4j/Zpl.ZD : Lorg/openapi4j/Zz;
    //   352: new org/openapi4j/Zpd
    //   355: dup
    //   356: invokespecial <init> : ()V
    //   359: putstatic org/openapi4j/Zpl.Ze : Lorg/openapi4j/Zz;
    //   362: getstatic org/openapi4j/Zpl.ZD : Lorg/openapi4j/Zz;
    //   365: putstatic org/openapi4j/Zpl.Zy : Lorg/openapi4j/Zz;
    //   368: getstatic org/openapi4j/Zpl.Zo : Lcom/fasterxml/Zor/Zy6;
    //   371: iconst_3
    //   372: anewarray com/fasterxml/Zb/Zm
    //   375: dup
    //   376: iconst_0
    //   377: getstatic com/fasterxml/Zb/Zm.INCLUDE_SOURCE_IN_LOCATION : Lcom/fasterxml/Zb/Zm;
    //   380: aastore
    //   381: dup
    //   382: iconst_1
    //   383: getstatic com/fasterxml/Zb/Zm.ALLOW_COMMENTS : Lcom/fasterxml/Zb/Zm;
    //   386: aastore
    //   387: dup
    //   388: iconst_2
    //   389: getstatic com/fasterxml/Zb/Zm.ALLOW_TRAILING_COMMA : Lcom/fasterxml/Zb/Zm;
    //   392: aastore
    //   393: invokevirtual Z_ : ([Lcom/fasterxml/Zb/Zm;)Lcom/fasterxml/Zor/Zy6;
    //   396: pop
    //   397: getstatic org/openapi4j/Zpl.Zu : Lcom/fasterxml/Zor/Zy6;
    //   400: iconst_2
    //   401: anewarray com/fasterxml/Zb/Zm
    //   404: dup
    //   405: iconst_0
    //   406: getstatic com/fasterxml/Zb/Zm.INCLUDE_SOURCE_IN_LOCATION : Lcom/fasterxml/Zb/Zm;
    //   409: aastore
    //   410: dup
    //   411: iconst_1
    //   412: getstatic com/fasterxml/Zb/Zm.ALLOW_YAML_COMMENTS : Lcom/fasterxml/Zb/Zm;
    //   415: aastore
    //   416: invokevirtual Z_ : ([Lcom/fasterxml/Zb/Zm;)Lcom/fasterxml/Zor/Zy6;
    //   419: pop
    //   420: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD630) & 0xFFFF;
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
      char c = '¤';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zpl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */