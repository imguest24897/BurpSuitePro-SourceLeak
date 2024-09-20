package com.fasterxml.Zs;

import burp.Zbqc;
import com.fasterxml.Zc.Zs;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zvv;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.IllformedLocaleException;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Zup extends Zub<Object> {
  private static final long serialVersionUID = 1L;
  
  protected final int Zj;
  
  private static final String[] g;
  
  private static final String[] h;
  
  protected Zup(Class<?> paramClass, int paramInt) {
    super(paramClass);
    this.Zj = paramInt;
  }
  
  protected Object ZV(String paramString, Zyg paramZyg) throws IOException {
    try {
      int i;
      switch (this.Zj) {
        case 1:
          return new File(paramString);
        case 2:
          return new URL(paramString);
        case 3:
          return URI.create(paramString);
        case 4:
          try {
            return paramZyg.ZP(paramString);
          } catch (Exception exception) {
            return paramZyg.Zs(this.ZC, paramString, Zx.Zs(exception));
          } 
        case 5:
          return paramZyg.ZL().Ze(paramString);
        case 6:
          try {
            return Currency.getInstance(paramString);
          } catch (IllegalArgumentException illegalArgumentException) {
            return paramZyg.ZN(this.ZC, paramString, d(26673, -22200), new Object[0]);
          } 
        case 7:
          try {
            return Pattern.compile(paramString);
          } catch (PatternSyntaxException patternSyntaxException) {
            return paramZyg.ZN(this.ZC, paramString, d(26674, -26661) + patternSyntaxException.getDescription(), new Object[0]);
          } 
        case 8:
          return ZO(paramString, paramZyg);
        case 9:
          return Charset.forName(paramString);
        case 10:
          return TimeZone.getTimeZone(paramString);
        case 11:
          return InetAddress.getByName(paramString);
        case 12:
          if (paramString.startsWith("[")) {
            int j = paramString.lastIndexOf(']');
            try {
              if (j == -1)
                throw new Zvv(paramZyg.Zu(), d(26675, 2456), paramString, InetSocketAddress.class); 
            } catch (Exception exception) {
              throw b(null);
            } 
            int k = paramString.indexOf(':', j);
            try {
            
            } catch (Exception exception) {
              throw b(null);
            } 
            boolean bool = (k > -1) ? Integer.parseInt(paramString.substring(k + 1)) : false;
            return new InetSocketAddress(paramString.substring(0, j + 1), bool);
          } 
          i = paramString.indexOf(':');
          try {
            if (i >= 0 && paramString.indexOf(':', i + 1) < 0) {
              int j = Integer.parseInt(paramString.substring(i + 1));
              return new InetSocketAddress(paramString.substring(0, i), j);
            } 
          } catch (Exception exception) {
            throw b(null);
          } 
          return new InetSocketAddress(paramString, 0);
      } 
    } catch (Exception exception) {
      throw b(null);
    } 
    Zs.ZP();
    return null;
  }
  
  public Object Zy(Zyg paramZyg) throws Zy_ {
    try {
      switch (this.Zj) {
        case 3:
          return URI.create("");
        case 8:
          return Locale.ROOT;
      } 
    } catch (Zy_ zy_) {
      throw b(null);
    } 
    return super.Zy(paramZyg);
  }
  
  protected Object ZG(Zyg paramZyg) throws IOException {
    return Zy(paramZyg);
  }
  
  protected boolean ZR() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return (this.Zj != 7);
  }
  
  protected int ZV(String paramString) {
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zl.Zn();
    int i = paramString.length();
    while (b < i) {
      char c = paramString.charAt(b);
      try {
        if (c != '_')
          try {
            if (c != '-') {
              b++;
              if (arrayOfZbqc != null)
                break; 
              continue;
            } 
            return b;
          } catch (IllegalArgumentException illegalArgumentException) {
            throw b(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      return b;
    } 
    return -1;
  }
  
  private Locale ZO(String paramString, Zyg paramZyg) throws IOException {
    int i = ZV(paramString);
    try {
      if (i < 0)
        return new Locale(paramString); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    String str1 = paramString.substring(0, i);
    paramString = paramString.substring(i + 1);
    i = ZV(paramString);
    try {
      if (i < 0)
        return new Locale(str1, paramString); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    String str2 = paramString.substring(0, i);
    int j = paramString.indexOf(d(26672, -21311));
    try {
      if (j < 0)
        return new Locale(str1, str2, paramString.substring(i + 1)); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    return ZG(paramString, i, str1, str2, j);
  }
  
  private Locale ZG(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2) {
    String str = "";
    try {
      try {
        if (paramInt2 > 0 && paramInt2 > paramInt1)
          str = paramString1.substring(paramInt1 + 1, paramInt2); 
      } catch (IllformedLocaleException illformedLocaleException) {
        throw b(null);
      } 
      paramString1 = paramString1.substring(paramInt2 + 2);
      int i = paramString1.indexOf('_');
      if (i < 0) {
        int k = paramString1.indexOf('-');
        return (k < 0) ? (new Locale.Builder()).setLanguage(paramString2).setRegion(paramString3).setVariant(str).setScript(paramString1).build() : (new Locale.Builder()).setLanguage(paramString2).setRegion(paramString3).setVariant(str).setExtension(paramString1.charAt(0), paramString1.substring(k + 1)).build();
      } 
      int j = paramString1.length();
      Locale.Builder builder = (new Locale.Builder()).setLanguage(paramString2).setRegion(paramString3).setVariant(str).setScript(paramString1.substring(0, i));
      if (i + 1 < j)
        builder = builder.setExtension(paramString1.charAt(i + 1), paramString1.substring(Math.min(j, i + 3))); 
      return builder.build();
    } catch (IllformedLocaleException illformedLocaleException) {
      return new Locale(paramString2, paramString3, str);
    } 
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc ' 9æ©\\t~ÏbO%±×ú©mó¼%§9'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_2
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #121
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 140
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: ldc 'Àøè#ÞÛÀñO%¤Ü&Cæù0ðÇoöy3gÚàÖT\\t&ÚP[û=AÆù­úº=3`.#ÀTlE÷¤·ÈGâgÉð,^'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #26
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #67
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 140
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
    //   127: putstatic com/fasterxml/Zs/Zup.g : [Ljava/lang/String;
    //   130: iconst_4
    //   131: anewarray java/lang/String
    //   134: putstatic com/fasterxml/Zs/Zup.h : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 256
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #24
    //   210: goto -> 240
    //   213: bipush #91
    //   215: goto -> 240
    //   218: bipush #58
    //   220: goto -> 240
    //   223: bipush #117
    //   225: goto -> 240
    //   228: bipush #24
    //   230: goto -> 240
    //   233: bipush #98
    //   235: goto -> 240
    //   238: bipush #18
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 163
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 159
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 97
    //   296: return
  }
  
  private static String d(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6830) & 0xFFFF;
    if (h[i] == null) {
      char[] arrayOfChar = g[i].toCharArray();
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
      byte b1 = 25;
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
      h[i] = (new String(arrayOfChar)).intern();
    } 
    return h[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */