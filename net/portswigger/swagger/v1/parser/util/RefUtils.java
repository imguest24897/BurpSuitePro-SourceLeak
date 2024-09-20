package net.portswigger.swagger.v1.parser.util;

import java.nio.file.Path;
import java.util.List;
import net.portswigger.swagger.v1.models.auth.AuthorizationValue;
import net.portswigger.swagger.v1.models.refs.RefFormat;
import net.portswigger.swagger.v1.parser.processors.ExternalRefProcessor;

public class RefUtils {
  private static final String[] a;
  
  private static final String[] b;
  
  public static String computeDefinitionName(String paramString) {
    String[] arrayOfString1 = paramString.split(a(-4449, -4347));
    int[] arrayOfInt = RemoteUrl.ZS();
    try {
      if (arrayOfString1.length > 2)
        throw new RuntimeException(a(-4463, 6279) + a(-4463, 6279)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str1 = arrayOfString1[0];
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str2 = (arrayOfString1.length == 2) ? arrayOfString1[1] : null;
    if (str2 != null) {
      String[] arrayOfString = str2.split("/");
      String str = arrayOfString[arrayOfString.length - 1];
      if (arrayOfInt == null) {
        arrayOfString = str1.split("/");
        str = arrayOfString[arrayOfString.length - 1];
        String[] arrayOfString4 = str.split(a(-4455, 10606));
        return arrayOfString4[0];
      } 
      return str;
    } 
    String[] arrayOfString2 = str1.split("/");
    null = arrayOfString2[arrayOfString2.length - 1];
    String[] arrayOfString3 = null.split(a(-4455, 10606));
    return arrayOfString3[0];
  }
  
  public static boolean isAnExternalRefFormat(RefFormat paramRefFormat) {
    try {
      if (paramRefFormat != RefFormat.URL) {
        try {
          if (paramRefFormat == RefFormat.RELATIVE);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static String readExternalUrlRef(String paramString1, RefFormat paramRefFormat, List<AuthorizationValue> paramList, String paramString2) {
    int[] arrayOfInt = RemoteUrl.ZS();
    try {
      if (!isAnExternalRefFormat(paramRefFormat))
        throw new RuntimeException(a(-4462, 21297)); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (paramRefFormat == RefFormat.URL) {
        String str1 = RemoteUrl.urlToString(paramString1, paramList);
        if (arrayOfInt != null)
          return str1; 
      } 
      String str = buildUrl(paramString2, paramString1);
      return readExternalRef(str, RefFormat.URL, paramList, null);
    } catch (Exception exception) {
      String str1 = paramString2;
      String str2 = paramString1;
      String str3 = String.valueOf(paramRefFormat);
      throw new RuntimeException(a(-4452, -24849) + a(-4452, -24849) + str3 + a(-4450, 5111) + str2 + a(-4453, 14397), exception);
    } 
  }
  
  public static String buildUrl(String paramString1, String paramString2) {
    return ExternalRefProcessor.join(paramString1, paramString2);
  }
  
  public static String readExternalRef(String paramString, RefFormat paramRefFormat, List<AuthorizationValue> paramList, Path paramPath) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v1/models/refs/RefFormat;)Z
    //   9: ifne -> 33
    //   12: new java/lang/RuntimeException
    //   15: dup
    //   16: sipush #-4454
    //   19: sipush #-7459
    //   22: invokestatic a : (II)Ljava/lang/String;
    //   25: invokespecial <init> : (Ljava/lang/String;)V
    //   28: athrow
    //   29: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   32: athrow
    //   33: aconst_null
    //   34: astore #5
    //   36: aload_1
    //   37: getstatic net/portswigger/swagger/v1/models/refs/RefFormat.URL : Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   40: if_acmpne -> 53
    //   43: aload_0
    //   44: aload_2
    //   45: invokestatic urlToString : (Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    //   48: astore #5
    //   50: goto -> 204
    //   53: aload_3
    //   54: aload_0
    //   55: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   60: invokeinterface normalize : ()Ljava/nio/file/Path;
    //   65: astore #6
    //   67: aload #6
    //   69: iconst_0
    //   70: anewarray java/nio/file/LinkOption
    //   73: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
    //   76: ifeq -> 92
    //   79: aload #6
    //   81: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   84: invokestatic readFileToString : (Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
    //   87: astore #5
    //   89: goto -> 204
    //   92: aload_0
    //   93: astore #7
    //   95: aload #7
    //   97: sipush #-4456
    //   100: sipush #-9421
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   109: ifeq -> 142
    //   112: aload_3
    //   113: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   116: aload #7
    //   118: aload #7
    //   120: ldc '.'
    //   122: invokevirtual indexOf : (Ljava/lang/String;)I
    //   125: iconst_2
    //   126: iadd
    //   127: invokevirtual substring : (I)Ljava/lang/String;
    //   130: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   135: astore #7
    //   137: aload #4
    //   139: ifnonnull -> 167
    //   142: aload_3
    //   143: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   146: aload #7
    //   148: aload #7
    //   150: ldc '.'
    //   152: invokevirtual indexOf : (Ljava/lang/String;)I
    //   155: iconst_1
    //   156: iadd
    //   157: invokevirtual substring : (I)Ljava/lang/String;
    //   160: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   165: astore #7
    //   167: aload_3
    //   168: aload #7
    //   170: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   175: invokeinterface normalize : ()Ljava/nio/file/Path;
    //   180: astore #8
    //   182: aload #8
    //   184: iconst_0
    //   185: anewarray java/nio/file/LinkOption
    //   188: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
    //   191: ifeq -> 204
    //   194: aload #8
    //   196: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   199: invokestatic readFileToString : (Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
    //   202: astore #5
    //   204: goto -> 272
    //   207: astore #6
    //   209: new java/lang/RuntimeException
    //   212: dup
    //   213: aload_1
    //   214: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   217: aload_0
    //   218: aload_3
    //   219: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   222: astore #9
    //   224: astore #10
    //   226: astore #11
    //   228: sipush #-4451
    //   231: sipush #-10475
    //   234: invokestatic a : (II)Ljava/lang/String;
    //   237: aload #11
    //   239: sipush #-4461
    //   242: sipush #-12843
    //   245: invokestatic a : (II)Ljava/lang/String;
    //   248: aload #10
    //   250: sipush #-4464
    //   253: sipush #16880
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: aload #9
    //   261: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   266: aload #6
    //   268: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   271: athrow
    //   272: aload #5
    //   274: areturn
    // Exception table:
    //   from	to	target	type
    //   5	29	29	java/lang/Exception
    //   36	204	207	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'rR§ø\\tÂá Zï2Í-hÂ8øW.ÄòbjÿªÝº1Ê°IhÄÒAxô¡§?G¿m\\nf!Ä\\rBhRf]TÜÐ3cÃ:³hbÊÃê·EúÑ\\b'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #39
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc ' |>ðPlÃc7&ëÐðõ\\rÿuË\\b:'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #21
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
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic net/portswigger/swagger/v1/parser/util/RefUtils.a : [Ljava/lang/String;
    //   131: bipush #12
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/swagger/v1/parser/util/RefUtils.b : [Ljava/lang/String;
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
    //   212: bipush #85
    //   214: goto -> 244
    //   217: bipush #36
    //   219: goto -> 244
    //   222: bipush #32
    //   224: goto -> 244
    //   227: bipush #52
    //   229: goto -> 244
    //   232: bipush #63
    //   234: goto -> 244
    //   237: bipush #44
    //   239: goto -> 244
    //   242: bipush #57
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEE99) & 0xFFFF;
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
      byte b1 = 41;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parse\\util\RefUtils.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */