package burp;

import java.awt.Component;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public final class Zt5w {
  private static final char[] ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static String ZP(Zz1p paramZz1p, Zstu paramZstu, Component paramComponent, Zskh paramZskh) {
    return Zc(paramZz1p, paramZstu.ZiD(), true, true, true, paramComponent, paramZskh);
  }
  
  static String Zc(Zz1p paramZz1p, byte[] paramArrayOfbyte, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Component paramComponent, Zskh paramZskh) {
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    Zuh.Zb((paramZskh != null), Zqf.Zv);
    Zm2.ZC(Zrrh.SUITE_MESSAGE_EDITOR_COPY_AS_CURL_COMMAND);
    try {
      StringBuilder stringBuilder = new StringBuilder(a(-32374, -26214));
      try {
        if (paramBoolean1)
          stringBuilder.append(a(-32384, 5892)); 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (paramBoolean2)
          stringBuilder.append(a(-32383, 11562)); 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (paramBoolean3)
          stringBuilder.append(a(-32371, -13284)); 
      } catch (Exception exception) {
        throw a(null);
      } 
      stringBuilder.append(Zu(paramZz1p, paramZskh));
      stringBuilder.append(Zf(paramZz1p.ZG(), paramComponent, paramZskh));
      stringBuilder.append(ZY(paramZz1p.ZV, paramZskh));
      stringBuilder.append(Zj(paramArrayOfbyte, paramZskh));
      stringBuilder.append(a(-32373, 407)).append(ZR(paramZz1p.Zo.toString(), paramZskh)).append("'");
      return stringBuilder.toString();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      return "";
    } 
  }
  
  private static String Zu(Zz1p paramZz1p, Zskh paramZskh) {
    return String.format(a(-32381, 12051), new Object[] { ZR(paramZz1p.Zb, paramZskh), a(-32369, 13566) });
  }
  
  private static String Zf(List<String> paramList, Component paramComponent, Zskh paramZskh) {
    try {
      if (paramList != null)
        try {
          if (!paramList.isEmpty())
            try {
              if (paramList.size() != 1) {
                StringBuilder stringBuilder = new StringBuilder();
                ArrayList<String> arrayList = new ArrayList<>(paramList);
                arrayList.remove(0);
                String str = null;
                for (String str1 : arrayList) {
                  if (str1.startsWith("@")) {
                    str = str1;
                    break;
                  } 
                  try {
                    if (!str1.toLowerCase(Locale.US).startsWith(a(-32372, 9383)))
                      stringBuilder.append(String.format(a(-32380, 12469), new Object[] { ZR(str1, paramZskh) })); 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  } 
                } 
                try {
                  if (str != null)
                    ZT(str, paramComponent, paramZskh); 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                try {
                  if (stringBuilder.length() > 0)
                    stringBuilder.append(a(-32366, -22360)); 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                return stringBuilder.toString();
              } 
              return "";
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return "";
  }
  
  private static void ZT(String paramString, Component paramComponent, Zskh paramZskh) {
    int i = paramString.indexOf(':');
    if (i == -1) {
      i = paramString.indexOf(' ');
      if (i == -1)
        i = paramString.length(); 
    } 
    String str1 = paramString.substring(0, i);
    String str2 = Zmgc.WARNING_HEADER_STARTING_WITH_AT.ZK(paramZskh.Zz(), new Object[] { str1 });
    try {
      if (Zx6o.Zc(paramComponent, a(-32382, 17123), str2, new String[] { a(-32378, -24625), a(-32375, -28170) }0) == 0)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static String ZY(List<Zt8g> paramList, Zskh paramZskh) {
    boolean bool = Zsba.Zu();
    try {
      if (paramList != null)
        try {
          if (!paramList.isEmpty()) {
            ArrayList<Zt8g> arrayList = new ArrayList();
            for (Zt8g zt8g : paramList) {
              try {
                if (Zrdu.COOKIE == zt8g.ZbQ())
                  arrayList.add(zt8g); 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              if (bool)
                break; 
            } 
            try {
              if (arrayList.isEmpty())
                return ""; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            StringBuilder stringBuilder = new StringBuilder(a(-32365, 20812));
            for (Zt8g zt8g : arrayList) {
              stringBuilder.append(String.format(a(-32367, -24147), new Object[] { ZR(zt8g.Zns(), paramZskh), ZR(zt8g.Zbn(), paramZskh) }));
              if (bool)
                break; 
            } 
            int i = stringBuilder.lastIndexOf(";");
            stringBuilder.replace(i, i + 1, "'");
            stringBuilder.append(a(-32366, -22360));
            return stringBuilder.toString();
          } 
          return "";
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return "";
  }
  
  private static String Zj(byte[] paramArrayOfbyte, Zskh paramZskh) {
    boolean bool = Zsba.Zu();
    int i = Zsbj.Zc(paramArrayOfbyte);
    try {
      if (i > -1 && i < paramArrayOfbyte.length) {
        byte[] arrayOfByte = new byte[paramArrayOfbyte.length - i];
        try {
          System.arraycopy(paramArrayOfbyte, i, arrayOfByte, 0, arrayOfByte.length);
          if (!bool) {
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            String str = (arrayOfByte[0] == 64) ? a(-32377, 24281) : a(-32376, 24738);
            StringBuilder stringBuilder = new StringBuilder();
            try {
              stringBuilder.append(str);
              stringBuilder.append(a(-32370, 28486));
              stringBuilder.append(ZM(arrayOfByte, paramZskh));
              stringBuilder.append(a(-32379, -24521));
              if (stringBuilder.length() > 0)
                stringBuilder.append(a(-32366, -22360)); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return stringBuilder.toString();
          } 
          return "";
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return "";
  }
  
  private static String ZR(String paramString, Zskh paramZskh) {
    return ZM(Zkb.Zy(paramString), paramZskh);
  }
  
  private static String ZM(byte[] paramArrayOfbyte, Zskh paramZskh) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    boolean bool = Zsba.Zt();
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      switch (b1) {
        case 34:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(34);
          bool1 = true;
        case 39:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(39);
          bool1 = true;
        case 92:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(92);
          bool1 = true;
        default:
        
      } 
      b++;
      continue;
      if (!bool)
        break; 
    } 
    try {
      if (bool2)
        Zmgc.SELECTED_REQUEST_NULL_BYTE.ZK(paramZskh.Zz(), new Object[0]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (bool3)
        Zmgc.SELECTED_REQUEST_EXCLAMATION_MARK.ZK(paramZskh.Zz(), new Object[0]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (bool1)
        return Zkb.ZG(byteArrayOutputStream.toByteArray()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zkb.ZG(paramArrayOfbyte);
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Iãè"±\\tFùm'0X&þ¥AÀ¿íÉ@1eâox1\\n·Zü8"Métj²SøÕX\\tÒ_Ü+¢a-ËUoUþOý/3ðVsM\\bî\\fÈ_\\rþ¥ûëØÝAþÍÞñº¶Yðþ\Yµ°\\fà4&QúÃ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #74
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
    //   68: ldc 'þÓ=ÝsBJª+'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #67
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
    //   129: putstatic burp/Zt5w.a : [Ljava/lang/String;
    //   132: bipush #19
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zt5w.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #86
    //   214: goto -> 243
    //   217: bipush #101
    //   219: goto -> 243
    //   222: bipush #95
    //   224: goto -> 243
    //   227: bipush #76
    //   229: goto -> 243
    //   232: bipush #43
    //   234: goto -> 243
    //   237: iconst_1
    //   238: goto -> 243
    //   241: bipush #17
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: bipush #16
    //   302: newarray char
    //   304: dup
    //   305: iconst_0
    //   306: bipush #48
    //   308: castore
    //   309: dup
    //   310: iconst_1
    //   311: bipush #49
    //   313: castore
    //   314: dup
    //   315: iconst_2
    //   316: bipush #50
    //   318: castore
    //   319: dup
    //   320: iconst_3
    //   321: bipush #51
    //   323: castore
    //   324: dup
    //   325: iconst_4
    //   326: bipush #52
    //   328: castore
    //   329: dup
    //   330: iconst_5
    //   331: bipush #53
    //   333: castore
    //   334: dup
    //   335: bipush #6
    //   337: bipush #54
    //   339: castore
    //   340: dup
    //   341: bipush #7
    //   343: bipush #55
    //   345: castore
    //   346: dup
    //   347: bipush #8
    //   349: bipush #56
    //   351: castore
    //   352: dup
    //   353: bipush #9
    //   355: bipush #57
    //   357: castore
    //   358: dup
    //   359: bipush #10
    //   361: bipush #97
    //   363: castore
    //   364: dup
    //   365: bipush #11
    //   367: bipush #98
    //   369: castore
    //   370: dup
    //   371: bipush #12
    //   373: bipush #99
    //   375: castore
    //   376: dup
    //   377: bipush #13
    //   379: bipush #100
    //   381: castore
    //   382: dup
    //   383: bipush #14
    //   385: bipush #101
    //   387: castore
    //   388: dup
    //   389: bipush #15
    //   391: bipush #102
    //   393: castore
    //   394: putstatic burp/Zt5w.ZH : [C
    //   397: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8183) & 0xFFFF;
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
      byte b1 = 49;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt5w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */