package net.portswigger.swagger.v2.util;

import burp.Zbqc;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import net.portswigger.swagger.v3.parser.core.models.AuthorizationValue;

public class RemoteUrl {
  private static final String TRUST_ALL;
  
  private static final RemoteUrl$ConnectionConfigurator CONNECTION_CONFIGURATOR;
  
  private static final Charset UTF_8;
  
  private static final String ACCEPT_HEADER_VALUE;
  
  private static final String USER_AGENT_HEADER_VALUE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private static RemoteUrl$ConnectionConfigurator createConnectionConfigurator() {
    if (Boolean.parseBoolean(System.getProperty(TRUST_ALL)))
      try {
        TrustManager[] arrayOfTrustManager = { new RemoteUrl$1() };
        SSLContext sSLContext = SSLContext.getInstance(a(-5870, -6326));
        sSLContext.init(null, arrayOfTrustManager, new SecureRandom());
        SSLSocketFactory sSLSocketFactory = sSLContext.getSocketFactory();
        RemoteUrl$2 remoteUrl$2 = new RemoteUrl$2();
        return new RemoteUrl$3(sSLSocketFactory, remoteUrl$2);
      } catch (NoSuchAlgorithmException|java.security.KeyManagementException noSuchAlgorithmException) {} 
    return new RemoteUrl$4();
  }
  
  public static String cleanUrl(String paramString) {
    String str = null;
    try {
      str = paramString.replaceAll(a(-5859, 22553), a(-5872, -7929)).replaceAll(a(-5861, 23995), a(-5867, 10251)).replaceAll(" ", a(-5868, -24181));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return str;
  }
  
  public static String urlToString(String paramString, List<AuthorizationValue> paramList) throws Exception {
    InputStream inputStream = null;
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    BufferedReader bufferedReader = null;
    try {
      while (true) {
        while (true) {
          URL uRL = new URL(cleanUrl(paramString));
          ArrayList arrayList1 = new ArrayList();
          ArrayList arrayList2 = new ArrayList();
          break;
        } 
        if (301 != ((HttpURLConnection)SYNTHETIC_LOCAL_VARIABLE_5).getResponseCode() && 302 != ((HttpURLConnection)SYNTHETIC_LOCAL_VARIABLE_5).getResponseCode() && 307 != ((HttpURLConnection)SYNTHETIC_LOCAL_VARIABLE_5).getResponseCode() && 308 != ((HttpURLConnection)SYNTHETIC_LOCAL_VARIABLE_5).getResponseCode()) {
          InputStream inputStream1 = SYNTHETIC_LOCAL_VARIABLE_5.getInputStream();
          StringBuilder stringBuilder = new StringBuilder();
          BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(inputStream1, UTF_8));
          int i = 0;
          while (i != -1) {
            char c = (char)i;
            try {
              if (!Character.isISOControl(c))
                stringBuilder.append((char)i); 
            } catch (SSLProtocolException sSLProtocolException) {
              throw a(null);
            } 
            try {
              if (c == '\n')
                stringBuilder.append('\n'); 
            } catch (SSLProtocolException sSLProtocolException) {
              throw a(null);
            } 
            i = bufferedReader1.read();
            if (arrayOfZbqc == null)
              break; 
          } 
          inputStream1.close();
          return stringBuilder.toString();
        } 
      } 
      throw a(paramList != null && paramList.size() > 0);
    } catch (SSLProtocolException sSLProtocolException) {
      throw sSLProtocolException;
    } catch (Exception exception) {
      throw exception;
    } finally {
      try {
        if (inputStream != null)
          inputStream.close(); 
      } catch (SSLProtocolException sSLProtocolException) {
        throw a(null);
      } 
      try {
        if (bufferedReader != null)
          bufferedReader.close(); 
      } catch (SSLProtocolException sSLProtocolException) {
        throw a(null);
      } 
    } 
  }
  
  private static void appendValue(URL paramURL, AuthorizationValue paramAuthorizationValue, Collection<AuthorizationValue> paramCollection) {
    if (paramAuthorizationValue instanceof ManagedValue && !((ManagedValue)paramAuthorizationValue).process(paramURL))
      return; 
    paramCollection.add(paramAuthorizationValue);
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'hÇÀ)5Ö¶;ÇçíÐp}Î·'=Ç»GzOZ!\\b!GÂÛ\\nqL:²ÀèÒLÛ¹Rùg>\\n¹ð´Rdúû9rÃWo=jD\]ÔKhÝ\\n>GtxvþÈZÉ#ÚuÆ³'pëO7là>|é_'õ3Þd®öÕÖrKu®@?h<oîÖy¸~H¬à/³³Z®6KR6Åt\\báªÇß+P¯['
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #122
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 165
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
    //   67: ldc 'ÄÅS¢Ûë'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_3
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #34
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 165
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic net/portswigger/swagger/v2/util/RemoteUrl.a : [Ljava/lang/String;
    //   130: bipush #16
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/swagger/v2/util/RemoteUrl.b : [Ljava/lang/String;
    //   138: sipush #-5860
    //   141: sipush #-2750
    //   144: invokestatic a : (II)Ljava/lang/String;
    //   147: putstatic net/portswigger/swagger/v2/util/RemoteUrl.USER_AGENT_HEADER_VALUE : Ljava/lang/String;
    //   150: sipush #-5871
    //   153: sipush #-10950
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: putstatic net/portswigger/swagger/v2/util/RemoteUrl.ACCEPT_HEADER_VALUE : Ljava/lang/String;
    //   162: goto -> 324
    //   165: dup_x2
    //   166: pop
    //   167: invokevirtual toCharArray : ()[C
    //   170: dup_x1
    //   171: arraylength
    //   172: dup_x2
    //   173: pop
    //   174: iconst_0
    //   175: istore #6
    //   177: dup2_x1
    //   178: pop2
    //   179: dup_x2
    //   180: iconst_1
    //   181: if_icmpgt -> 284
    //   184: dup2
    //   185: swap
    //   186: iload #6
    //   188: dup2_x1
    //   189: caload
    //   190: swap
    //   191: iload #6
    //   193: bipush #7
    //   195: irem
    //   196: tableswitch default -> 266, 0 -> 236, 1 -> 241, 2 -> 246, 3 -> 251, 4 -> 256, 5 -> 261
    //   236: bipush #96
    //   238: goto -> 268
    //   241: bipush #16
    //   243: goto -> 268
    //   246: bipush #100
    //   248: goto -> 268
    //   251: bipush #94
    //   253: goto -> 268
    //   256: bipush #17
    //   258: goto -> 268
    //   261: bipush #113
    //   263: goto -> 268
    //   266: bipush #72
    //   268: ixor
    //   269: ixor
    //   270: i2c
    //   271: castore
    //   272: iinc #6, 1
    //   275: dup
    //   276: ifne -> 284
    //   279: dup2
    //   280: dup_x1
    //   281: goto -> 188
    //   284: dup2_x1
    //   285: pop2
    //   286: dup_x2
    //   287: iload #6
    //   289: if_icmpgt -> 184
    //   292: pop
    //   293: new java/lang/String
    //   296: dup_x1
    //   297: swap
    //   298: invokespecial <init> : ([C)V
    //   301: invokevirtual intern : ()Ljava/lang/String;
    //   304: swap
    //   305: pop
    //   306: swap
    //   307: tableswitch default -> 39, 0 -> 97
    //   324: sipush #-5862
    //   327: sipush #14666
    //   330: invokestatic a : (II)Ljava/lang/String;
    //   333: iconst_1
    //   334: anewarray java/lang/Object
    //   337: dup
    //   338: iconst_0
    //   339: ldc net/portswigger/swagger/v2/util/RemoteUrl
    //   341: invokevirtual getName : ()Ljava/lang/String;
    //   344: aastore
    //   345: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   348: putstatic net/portswigger/swagger/v2/util/RemoteUrl.TRUST_ALL : Ljava/lang/String;
    //   351: invokestatic createConnectionConfigurator : ()Lnet/portswigger/swagger/v2/util/RemoteUrl$ConnectionConfigurator;
    //   354: putstatic net/portswigger/swagger/v2/util/RemoteUrl.CONNECTION_CONFIGURATOR : Lnet/portswigger/swagger/v2/util/RemoteUrl$ConnectionConfigurator;
    //   357: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   360: putstatic net/portswigger/swagger/v2/util/RemoteUrl.UTF_8 : Ljava/nio/charset/Charset;
    //   363: return
  }
  
  private static SSLProtocolException a(SSLProtocolException paramSSLProtocolException) {
    return paramSSLProtocolException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE91B) & 0xFFFF;
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
      byte b1 = 0;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\RemoteUrl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */