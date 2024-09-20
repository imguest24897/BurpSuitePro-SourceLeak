package net.portswigger.swagger.v2.util;

import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathUtils {
  static final String SCHEME_FILE;
  
  static final String SCHEME_HTTP;
  
  static final String SCHEME_HTTPS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Path getParentDirectoryOfFile(String paramString) {
    Path path = null;
    try {
      paramString = paramString.replaceAll(a(18550, -31150), "/");
      if (paramString.toLowerCase().startsWith(a(18545, 7176))) {
        path = Paths.get(URI.create(paramString)).toAbsolutePath();
      } else {
        path = Paths.get(paramString, new String[0]).toAbsolutePath();
      } 
      if (!Files.exists(path, new java.nio.file.LinkOption[0]))
        return getParentDirectoryFromUrl(paramString); 
    } catch (Exception exception) {
      exception.getMessage();
    } 
    return path.toAbsolutePath().getParent();
  }
  
  private static Path getParentDirectoryFromUrl(String paramString) {
    try {
      URL uRL = PathUtils.class.getResource(paramString);
      if (uRL == null)
        uRL = PathUtils.class.getClassLoader().getResource(paramString); 
      if (uRL == null)
        uRL = ClassLoader.getSystemResource(paramString); 
      Path path = Paths.get(URI.create(uRL.toExternalForm()));
      return path.getParent();
    } catch (Exception exception) {
      exception.getMessage();
      return null;
    } 
  }
  
  public static String getAbsoluteUrl(String paramString) {
    Path path = null;
    try {
      paramString = paramString.replaceAll(a(18557, -1175), "/");
      try {
        if (paramString.toLowerCase().startsWith(a(18546, 23501)) || paramString.toLowerCase().startsWith(a(18547, -32176)))
          return paramString; 
      } catch (Exception exception) {
        throw a(null);
      } 
      if (paramString.toLowerCase().startsWith(a(18549, 19890))) {
        path = Paths.get(URI.create(paramString)).toAbsolutePath();
      } else {
        path = Paths.get(paramString, new String[0]).toAbsolutePath();
      } 
      if (!Files.exists(path, new java.nio.file.LinkOption[0]))
        return getClasspathUrl(paramString); 
    } catch (Exception exception) {
      try {
        if (path == null)
          return paramString; 
      } catch (Exception exception1) {
        throw a(null);
      } 
    } 
    return path.toAbsolutePath().toUri().toString();
  }
  
  private static String getClasspathUrl(String paramString) {
    try {
      URL uRL = PathUtils.class.getResource(paramString);
      if (uRL == null)
        uRL = PathUtils.class.getClassLoader().getResource(paramString); 
      if (uRL == null)
        uRL = ClassLoader.getSystemResource(paramString); 
      Path path = Paths.get(URI.create(uRL.toExternalForm()));
      return path.toAbsolutePath().toUri().toString();
    } catch (Exception exception) {
      return paramString;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¬ù±72­ÆF{t_óÝÇ¶}#luM>Ïµ8ëôÞÈÀ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #51
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 176
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
    //   67: ldc 'ÎöL÷yÖ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_5
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: iconst_3
    //   81: iinc #0, 1
    //   84: aload_2
    //   85: iload_0
    //   86: dup
    //   87: iload_1
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 176
    //   96: aload #5
    //   98: swap
    //   99: iload_3
    //   100: iinc #3, 1
    //   103: swap
    //   104: aastore
    //   105: iload_0
    //   106: iload_1
    //   107: iadd
    //   108: dup
    //   109: istore_0
    //   110: iload #4
    //   112: if_icmpge -> 124
    //   115: aload_2
    //   116: iload_0
    //   117: invokevirtual charAt : (I)C
    //   120: istore_1
    //   121: goto -> 80
    //   124: aload #5
    //   126: putstatic net/portswigger/swagger/v2/util/PathUtils.a : [Ljava/lang/String;
    //   129: bipush #9
    //   131: anewarray java/lang/String
    //   134: putstatic net/portswigger/swagger/v2/util/PathUtils.b : [Ljava/lang/String;
    //   137: sipush #18548
    //   140: sipush #22413
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: putstatic net/portswigger/swagger/v2/util/PathUtils.SCHEME_HTTPS : Ljava/lang/String;
    //   149: sipush #18551
    //   152: sipush #-14532
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: putstatic net/portswigger/swagger/v2/util/PathUtils.SCHEME_HTTP : Ljava/lang/String;
    //   161: sipush #18544
    //   164: sipush #-27563
    //   167: invokestatic a : (II)Ljava/lang/String;
    //   170: putstatic net/portswigger/swagger/v2/util/PathUtils.SCHEME_FILE : Ljava/lang/String;
    //   173: goto -> 332
    //   176: dup_x2
    //   177: pop
    //   178: invokevirtual toCharArray : ()[C
    //   181: dup_x1
    //   182: arraylength
    //   183: dup_x2
    //   184: pop
    //   185: iconst_0
    //   186: istore #6
    //   188: dup2_x1
    //   189: pop2
    //   190: dup_x2
    //   191: iconst_1
    //   192: if_icmpgt -> 292
    //   195: dup2
    //   196: swap
    //   197: iload #6
    //   199: dup2_x1
    //   200: caload
    //   201: swap
    //   202: iload #6
    //   204: bipush #7
    //   206: irem
    //   207: tableswitch default -> 274, 0 -> 244, 1 -> 249, 2 -> 254, 3 -> 259, 4 -> 264, 5 -> 269
    //   244: bipush #7
    //   246: goto -> 276
    //   249: bipush #58
    //   251: goto -> 276
    //   254: bipush #87
    //   256: goto -> 276
    //   259: bipush #59
    //   261: goto -> 276
    //   264: bipush #96
    //   266: goto -> 276
    //   269: bipush #109
    //   271: goto -> 276
    //   274: bipush #122
    //   276: ixor
    //   277: ixor
    //   278: i2c
    //   279: castore
    //   280: iinc #6, 1
    //   283: dup
    //   284: ifne -> 292
    //   287: dup2
    //   288: dup_x1
    //   289: goto -> 199
    //   292: dup2_x1
    //   293: pop2
    //   294: dup_x2
    //   295: iload #6
    //   297: if_icmpgt -> 195
    //   300: pop
    //   301: new java/lang/String
    //   304: dup_x1
    //   305: swap
    //   306: invokespecial <init> : ([C)V
    //   309: invokevirtual intern : ()Ljava/lang/String;
    //   312: swap
    //   313: pop
    //   314: swap
    //   315: tableswitch default -> 39, 0 -> 96
    //   332: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4875) & 0xFFFF;
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
      byte b1 = 6;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\PathUtils.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */