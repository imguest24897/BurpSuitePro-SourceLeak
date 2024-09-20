package burp;

import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ze_m implements HostnameVerifier {
  private static int Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public boolean verify(String paramString, SSLSession paramSSLSession) {
    Certificate[] arrayOfCertificate;
    try {
      arrayOfCertificate = paramSSLSession.getPeerCertificates();
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      Zah.Zl(sSLPeerUnverifiedException, Zk_.COMMON_RUNTIME_FAILURE);
      return false;
    } 
    try {
      if (arrayOfCertificate != null) {
        try {
          if (!(arrayOfCertificate[0] instanceof X509Certificate))
            return false; 
        } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
    X509Certificate x509Certificate = (X509Certificate)arrayOfCertificate[0];
    String str1 = x509Certificate.getSubjectDN().getName();
    try {
      if (str1 != null) {
        try {
          if (!str1.toUpperCase(Locale.ENGLISH).contains(a(29351, 13188)))
            return false; 
        } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
    int i = str1.toUpperCase(Locale.ENGLISH).indexOf(a(29351, 13188));
    int j = str1.indexOf(",", i);
    try {
    
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
    String str2 = (j != -1) ? str1.substring(i + 3, j) : str1.substring(i + 3);
    List<String> list = ZY(x509Certificate);
    try {
      if (!Zr(paramString, list)) {
        try {
          if (paramString.equals(str2));
        } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
  }
  
  private static boolean Zr(String paramString, List<String> paramList) {
    int i = ZW();
    for (String str : paramList) {
      if (ZQ(paramString, str))
        return true; 
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  private static boolean ZQ(String paramString1, String paramString2) {
    if (paramString1 == null || paramString1.length() == 0 || paramString2 == null || paramString2.length() == 0)
      return false; 
    paramString2 = paramString2.trim();
    paramString1 = paramString1.trim();
    if (paramString2.equalsIgnoreCase(paramString1))
      return true; 
    int i = paramString2.indexOf(a(29344, -22574));
    if (i == -1)
      return false; 
    String str1 = paramString2.substring(i + 1);
    String str2 = paramString2.substring(0, i);
    String str3 = paramString1.replace(str1, "");
    boolean bool = str3.contains(".");
    return (!bool && !str2.contains(".") && paramString1.indexOf(str2) == 0 && paramString1.endsWith(str1) && paramString1.length() >= paramString2.length());
  }
  
  private static List<String> ZY(X509Certificate paramX509Certificate) {
    int i = ZW();
    ArrayList<String> arrayList = new ArrayList();
    try {
      Collection<List<?>> collection = paramX509Certificate.getSubjectAlternativeNames();
      if (collection != null) {
        for (List<Integer> list : collection) {
          if (((Integer)list.get(0)).intValue() == 2) {
            String str1 = (String)list.get(1);
            arrayList.add(str1);
          } 
          if (i == 0)
            break; 
        } 
        if (arrayList.size() > 0)
          return arrayList; 
      } 
    } catch (CertificateException certificateException) {
      Zah.Zl(certificateException, Zk_.IGNORED);
    } 
    String str = ZP(paramX509Certificate);
    arrayList.add(str);
    return arrayList;
  }
  
  private static String ZX(String paramString1, String paramString2) {
    // Byte code:
    //   0: invokestatic ZW : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: ifnonnull -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual indexOf : (Ljava/lang/String;)I
    //   15: istore_3
    //   16: iload_3
    //   17: iflt -> 82
    //   20: iload_3
    //   21: aload_1
    //   22: invokevirtual length : ()I
    //   25: iadd
    //   26: istore_3
    //   27: aload_0
    //   28: iload_3
    //   29: invokevirtual charAt : (I)C
    //   32: bipush #34
    //   34: if_icmpne -> 54
    //   37: iload_3
    //   38: iconst_1
    //   39: iadd
    //   40: istore_3
    //   41: aload_0
    //   42: bipush #34
    //   44: iload_3
    //   45: invokevirtual indexOf : (II)I
    //   48: istore #4
    //   50: iload_2
    //   51: ifne -> 63
    //   54: aload_0
    //   55: bipush #44
    //   57: iload_3
    //   58: invokevirtual indexOf : (II)I
    //   61: istore #4
    //   63: iload #4
    //   65: ifge -> 74
    //   68: aload_0
    //   69: iload_3
    //   70: invokevirtual substring : (I)Ljava/lang/String;
    //   73: areturn
    //   74: aload_0
    //   75: iload_3
    //   76: iload #4
    //   78: invokevirtual substring : (II)Ljava/lang/String;
    //   81: areturn
    //   82: aconst_null
    //   83: areturn
  }
  
  private static String ZP(X509Certificate paramX509Certificate) {
    String str = a(29348, 10763);
    try {
      Principal principal = paramX509Certificate.getSubjectDN();
      String str1 = principal.getName();
      str = ZX(str1, a(29349, 18580));
      if (str == null)
        str = a(29350, 19513); 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
    return str;
  }
  
  public static void Zt(int paramInt) {
    Za = paramInt;
  }
  
  public static int ZW() {
    return Za;
  }
  
  public static int ZS() {
    int i = ZW();
    return (i == 0) ? 45 : 0;
  }
  
  private static SSLPeerUnverifiedException a(SSLPeerUnverifiedException paramSSLPeerUnverifiedException) {
    return paramSSLPeerUnverifiedException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: bipush #7
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc '¤ß~»k¶ÈXAV½ÆrØÒÂ_çáXý®1{$cA'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #15
    //   21: istore_1
    //   22: invokestatic Zt : (I)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #105
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 145
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc '»F\\t'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_3
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #46
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 145
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
    //   132: putstatic burp/Ze_m.a : [Ljava/lang/String;
    //   135: iconst_5
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Ze_m.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #126
    //   218: goto -> 248
    //   221: bipush #24
    //   223: goto -> 248
    //   226: bipush #84
    //   228: goto -> 248
    //   231: bipush #68
    //   233: goto -> 248
    //   236: bipush #34
    //   238: goto -> 248
    //   241: bipush #18
    //   243: goto -> 248
    //   246: bipush #72
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x72A4) & 0xFFFF;
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
      byte b1 = 125;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */