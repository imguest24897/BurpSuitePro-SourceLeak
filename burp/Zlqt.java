package burp;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zlqt {
  public static final String ZH;
  
  public static final List<String> ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static String ZT(List<String> paramList, List<Ztu8> paramList1) {
    String[] arrayOfString = Zbv5.ZvS();
    String str = null;
    if (paramList != null)
      for (String str1 : paramList) {
        if (str1.toLowerCase(Locale.ENGLISH).startsWith(a(14249, -22729))) {
          str = ZX(str1);
          if (str != null)
            break; 
        } 
        if (arrayOfString == null)
          break; 
      }  
    if (str == null && paramList1 != null)
      str = ZE(paramList1); 
    return ZD(str);
  }
  
  public static String ZX(String paramString) {
    if (paramString == null)
      return null; 
    int i = paramString.toLowerCase(Locale.ENGLISH).indexOf(a(14247, 25676));
    if (i == -1)
      return null; 
    i += 8;
    int j = paramString.indexOf(" ", i);
    if (j == -1)
      j = paramString.length(); 
    int k = paramString.indexOf(";", i);
    if (k != -1)
      j = Math.min(j, k); 
    String str = paramString.substring(i, j);
    return ZW(str);
  }
  
  private static String ZW(String paramString) {
    String[] arrayOfString = Zbv5.ZvS();
    if (paramString.contains("\"") || paramString.contains("'")) {
      byte b = 0;
      while (b < paramString.length()) {
        char c = paramString.charAt(b);
        if (c != '"' && c != '\'')
          break; 
        b++;
        if (arrayOfString == null)
          break; 
      } 
      if (b >= paramString.length())
        return null; 
      int i = paramString.length() - 1;
      while (i >= 0) {
        char c = paramString.charAt(b);
        if (c != '"' && c != '\'')
          break; 
        i--;
        if (arrayOfString == null)
          break; 
      } 
      return paramString.substring(b, i);
    } 
    return paramString;
  }
  
  private static String ZD(String paramString) {
    String str = null;
    if (paramString != null) {
      String str1 = ZW(paramString);
      try {
        Charset charset = Charset.forName(str1);
        str1 = charset.name();
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.IGNORED);
      } 
      for (String str2 : ZB) {
        if (str2.equalsIgnoreCase(str1)) {
          str = str2;
          break;
        } 
      } 
    } 
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    return (str == null) ? ZH : str;
  }
  
  private static String ZE(List<Ztu8> paramList) {
    // Byte code:
    //   0: invokestatic ZvS : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: invokeinterface iterator : ()Ljava/util/Iterator;
    //   10: astore_2
    //   11: aload_2
    //   12: invokeinterface hasNext : ()Z
    //   17: ifeq -> 385
    //   20: aload_2
    //   21: invokeinterface next : ()Ljava/lang/Object;
    //   26: checkcast burp/Ztu8
    //   29: astore_3
    //   30: aload_3
    //   31: invokeinterface ZlD : ()B
    //   36: iconst_1
    //   37: if_icmpne -> 69
    //   40: sipush #14250
    //   43: sipush #-14947
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: aload_3
    //   50: invokeinterface ZlP : ()Lburp/Zs_n;
    //   55: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   60: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   63: ifeq -> 69
    //   66: goto -> 385
    //   69: aload_3
    //   70: invokeinterface ZlD : ()B
    //   75: ifeq -> 91
    //   78: aload_3
    //   79: invokeinterface ZlD : ()B
    //   84: iconst_4
    //   85: if_icmpeq -> 91
    //   88: goto -> 11
    //   91: sipush #14246
    //   94: sipush #-28423
    //   97: invokestatic a : (II)Ljava/lang/String;
    //   100: aload_3
    //   101: invokeinterface ZlP : ()Lburp/Zs_n;
    //   106: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   111: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   114: ifeq -> 322
    //   117: aload_3
    //   118: invokeinterface ZlP : ()Lburp/Zs_n;
    //   123: sipush #14251
    //   126: sipush #-16961
    //   129: invokestatic a : (II)Ljava/lang/String;
    //   132: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   137: astore #4
    //   139: sipush #14244
    //   142: sipush #3710
    //   145: invokestatic a : (II)Ljava/lang/String;
    //   148: aload #4
    //   150: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   153: ifeq -> 193
    //   156: aload_3
    //   157: invokeinterface ZlP : ()Lburp/Zs_n;
    //   162: sipush #14241
    //   165: sipush #-2982
    //   168: invokestatic a : (II)Ljava/lang/String;
    //   171: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   176: astore #5
    //   178: aload #5
    //   180: ifnull -> 189
    //   183: aload #5
    //   185: invokevirtual trim : ()Ljava/lang/String;
    //   188: areturn
    //   189: aload_1
    //   190: ifnonnull -> 285
    //   193: sipush #14242
    //   196: sipush #14443
    //   199: invokestatic a : (II)Ljava/lang/String;
    //   202: aload #4
    //   204: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   207: ifeq -> 285
    //   210: aload_3
    //   211: invokeinterface ZlP : ()Lburp/Zs_n;
    //   216: sipush #14245
    //   219: sipush #15962
    //   222: invokestatic a : (II)Ljava/lang/String;
    //   225: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   230: astore #5
    //   232: aload #5
    //   234: ifnull -> 252
    //   237: aload #5
    //   239: invokestatic ZX : (Ljava/lang/String;)Ljava/lang/String;
    //   242: astore #6
    //   244: aload #6
    //   246: ifnull -> 252
    //   249: aload #6
    //   251: areturn
    //   252: aload_3
    //   253: invokeinterface ZlP : ()Lburp/Zs_n;
    //   258: sipush #14248
    //   261: sipush #-8975
    //   264: invokestatic a : (II)Ljava/lang/String;
    //   267: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   272: astore #6
    //   274: aload #6
    //   276: ifnull -> 285
    //   279: aload #6
    //   281: invokevirtual trim : ()Ljava/lang/String;
    //   284: areturn
    //   285: aload_3
    //   286: invokeinterface ZlP : ()Lburp/Zs_n;
    //   291: sipush #14248
    //   294: sipush #-8975
    //   297: invokestatic a : (II)Ljava/lang/String;
    //   300: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   305: astore #5
    //   307: aload #5
    //   309: ifnull -> 318
    //   312: aload #5
    //   314: invokevirtual trim : ()Ljava/lang/String;
    //   317: areturn
    //   318: aload_1
    //   319: ifnonnull -> 381
    //   322: sipush #14243
    //   325: sipush #10835
    //   328: invokestatic a : (II)Ljava/lang/String;
    //   331: aload_3
    //   332: invokeinterface ZlP : ()Lburp/Zs_n;
    //   337: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   342: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   345: ifeq -> 381
    //   348: aload_3
    //   349: invokeinterface ZlP : ()Lburp/Zs_n;
    //   354: sipush #14240
    //   357: sipush #-1439
    //   360: invokestatic a : (II)Ljava/lang/String;
    //   363: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   368: astore #4
    //   370: aload #4
    //   372: ifnull -> 381
    //   375: aload #4
    //   377: invokevirtual trim : ()Ljava/lang/String;
    //   380: areturn
    //   381: aload_1
    //   382: ifnonnull -> 11
    //   385: aconst_null
    //   386: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Å°#lHÝä]× üÍÒh\\b¸pGNiæûw+u³½Ä\\bQH¾ÏYe{*ûÞ«FLwuuÔÊ½zµ±\\nÿË¿0^Ò8\\r'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #12
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #44
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
    //   68: ldc '£m#õsà\\r­;\\f?go$(F'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #11
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
    //   129: putstatic burp/Zlqt.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zlqt.b : [Ljava/lang/String;
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
    //   212: bipush #73
    //   214: goto -> 244
    //   217: bipush #99
    //   219: goto -> 244
    //   222: bipush #122
    //   224: goto -> 244
    //   227: bipush #73
    //   229: goto -> 244
    //   232: bipush #12
    //   234: goto -> 244
    //   237: bipush #68
    //   239: goto -> 244
    //   242: bipush #120
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
    //   300: new java/util/ArrayList
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zlqt.ZB : Ljava/util/List;
    //   310: invokestatic defaultCharset : ()Ljava/nio/charset/Charset;
    //   313: invokevirtual displayName : ()Ljava/lang/String;
    //   316: putstatic burp/Zlqt.ZH : Ljava/lang/String;
    //   319: invokestatic availableCharsets : ()Ljava/util/SortedMap;
    //   322: invokeinterface keySet : ()Ljava/util/Set;
    //   327: invokeinterface iterator : ()Ljava/util/Iterator;
    //   332: astore #7
    //   334: aload #7
    //   336: invokeinterface hasNext : ()Z
    //   341: ifeq -> 385
    //   344: aload #7
    //   346: invokeinterface next : ()Ljava/lang/Object;
    //   351: checkcast java/lang/String
    //   354: astore #8
    //   356: aload #8
    //   358: invokestatic isSupported : (Ljava/lang/String;)Z
    //   361: ifeq -> 382
    //   364: getstatic burp/Zlqt.ZB : Ljava/util/List;
    //   367: aload #8
    //   369: invokeinterface add : (Ljava/lang/Object;)Z
    //   374: pop
    //   375: goto -> 382
    //   378: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   381: athrow
    //   382: goto -> 334
    //   385: goto -> 398
    //   388: astore #7
    //   390: aload #7
    //   392: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   395: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   398: return
    // Exception table:
    //   from	to	target	type
    //   319	385	388	java/lang/Exception
    //   356	375	378	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x37A2) & 0xFFFF;
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
      char c = 'î';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlqt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */