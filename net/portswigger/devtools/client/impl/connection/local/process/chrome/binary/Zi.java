package net.portswigger.devtools.client.impl.connection.local.process.chrome.binary;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zb;
import net.portswigger.browser.Zds;
import net.portswigger.browser.Zjb;

public class Zi {
  private static final Pattern ZB;
  
  private static final String Zo;
  
  private static final String Zh;
  
  private static final int Zi = 5;
  
  private static final byte[] ZX;
  
  private final Path ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zi(Path paramPath) {
    this.ZS = paramPath;
  }
  
  public List<String> ZU() {
    String str = DevtoolsBinariesInfo.ZW();
    if (!Zjb.Zr().ZC())
      return Collections.emptyList(); 
    ArrayList<String> arrayList1 = new ArrayList();
    Objects.requireNonNull(arrayList1);
    ArrayList<String> arrayList2 = new ArrayList<>(ZI(arrayList1::add));
    arrayList2.addAll(ZZ());
    for (String str1 : arrayList2) {
      if (Zg(str1) || str == null) {
        Zw zw = Zz(str1);
        if (zw.ZW())
          return Collections.singletonList(zw.ZU); 
        if (zw.Zg()) {
          arrayList1.add(a(13048, -16102) + a(13048, -16102) + str1);
          zw.ZR.forEach(arrayList1::lambda$check$0);
          arrayList1.add("\n");
        } 
        if (str == null)
          break; 
      } 
    } 
    return arrayList1;
  }
  
  public static boolean Zg(String paramString) {
    try {
      byte[] arrayOfByte = new byte[4];
      FileInputStream fileInputStream = new FileInputStream(paramString);
      int i = fileInputStream.read(arrayOfByte);
      try {
        if (i == 4)
          try {
            if (Arrays.equals(arrayOfByte, ZX));
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      return false;
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
      return false;
    } 
  }
  
  public static Zw Zz(String paramString) {
    ProcessBuilder processBuilder = new ProcessBuilder(Arrays.asList(new String[] { a(13046, 11433), paramString }));
    processBuilder.environment().put(a(13047, -26159), "C");
    try {
      Process process = processBuilder.start();
      process.waitFor(2L, TimeUnit.SECONDS);
      int i = process.exitValue();
      if (i == 0) {
        InputStream inputStream = process.getInputStream();
        try {
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
          Set<String> set = (Set)bufferedReader.lines().map(Zi::ZJ).filter(Objects::nonNull).filter(Zi::lambda$findMissingDependenciesFor$1).collect(Collectors.toSet());
          Zw zw = new Zw(set);
          try {
            if (inputStream != null)
              inputStream.close(); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return zw;
        } catch (Throwable throwable) {
          if (inputStream != null)
            try {
              inputStream.close();
            } catch (Throwable throwable1) {
              throwable.addSuppressed(throwable1);
            }  
          throw throwable;
        } 
      } 
      if (i == 1)
        return new Zw(Collections.emptyList()); 
      process.destroyForcibly();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
      Zb.Zp(Zds.DEBUG, a(13041, -11470), new Object[] { throwable });
    } 
    return new Zw(a(13042, 7977));
  }
  
  private List<String> ZI(Consumer<String> paramConsumer) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: getfield ZS : Ljava/nio/file/Path;
    //   12: aload_1
    //   13: invokestatic ZZ : (Ljava/nio/file/Path;Ljava/util/function/Consumer;)Ljava/util/Optional;
    //   16: aload_0
    //   17: aload_2
    //   18: <illegal opcode> accept : (Lnet/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zi;Ljava/util/List;)Ljava/util/function/Consumer;
    //   23: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   26: aload_2
    //   27: areturn
  }
  
  private String ZY(Ze paramZe) {
    return this.ZS.resolve(paramZe.Z_()).toAbsolutePath().toString();
  }
  
  private Set<String> ZZ() {
    try {
      return (Set<String>)Files.find(this.ZS, 5, Zi::lambda$sharedObjectFiles$4, new java.nio.file.FileVisitOption[0]).map(Path::toString).collect(Collectors.toSet());
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
      return Collections.emptySet();
    } 
  }
  
  private static String ZJ(String paramString) {
    Matcher matcher = ZB.matcher(paramString);
    return matcher.matches() ? matcher.group(1) : null;
  }
  
  private static boolean lambda$sharedObjectFiles$4(Path paramPath, BasicFileAttributes paramBasicFileAttributes) {
    return (paramBasicFileAttributes.isRegularFile() && paramPath.getFileName().toString().matches(a(13051, -3942)));
  }
  
  private void lambda$executableBinaryFiles$3(List paramList, Zp paramZp) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual Zi : ()Ljava/util/List;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> accept : (Lnet/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zi;Ljava/util/List;)Ljava/util/function/Consumer;
    //   11: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   16: return
  }
  
  private void lambda$executableBinaryFiles$2(List<String> paramList, Ze paramZe) {
    paramList.add(ZY(paramZe));
  }
  
  private static boolean lambda$findMissingDependenciesFor$1(String paramString) {
    return (!paramString.equals(a(13050, -5974)) && !paramString.equals(a(13049, -30042)));
  }
  
  private static void lambda$check$0(List<String> paramList, String paramString) {
    paramList.add("\t" + paramString + "\n");
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '³øG$t|¯\\rÉK-v"Øa¼\3Ýäº³°ì4¾²(v-éàyÂC¹HÓR.iU·°ðhÒPðpq4ÍO­é·GOÛ[îKÚF2UÃM5þº¤ÿ|-³ùÄ(<­^Ê"Wµü*ºÄ½kW\\bÏF¡¬ËY¿Ê bðö^>S7®Ó»D>a6:RcÖP\\fY|äA­^áv\\tß ãPZõ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #28
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #96
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 167
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
    //   68: ldc '0Ô³ã1åÍrÏ3xQ£gÀ'@àZZÁ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #10
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #56
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 167
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
    //   129: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zi.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zi.b : [Ljava/lang/String;
    //   140: sipush #13043
    //   143: sipush #12421
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zi.Zo : Ljava/lang/String;
    //   152: sipush #13045
    //   155: sipush #25855
    //   158: invokestatic a : (II)Ljava/lang/String;
    //   161: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zi.Zh : Ljava/lang/String;
    //   164: goto -> 324
    //   167: dup_x2
    //   168: pop
    //   169: invokevirtual toCharArray : ()[C
    //   172: dup_x1
    //   173: arraylength
    //   174: dup_x2
    //   175: pop
    //   176: iconst_0
    //   177: istore #6
    //   179: dup2_x1
    //   180: pop2
    //   181: dup_x2
    //   182: iconst_1
    //   183: if_icmpgt -> 284
    //   186: dup2
    //   187: swap
    //   188: iload #6
    //   190: dup2_x1
    //   191: caload
    //   192: swap
    //   193: iload #6
    //   195: bipush #7
    //   197: irem
    //   198: tableswitch default -> 266, 0 -> 236, 1 -> 241, 2 -> 246, 3 -> 251, 4 -> 256, 5 -> 261
    //   236: bipush #26
    //   238: goto -> 268
    //   241: bipush #57
    //   243: goto -> 268
    //   246: bipush #74
    //   248: goto -> 268
    //   251: bipush #79
    //   253: goto -> 268
    //   256: bipush #126
    //   258: goto -> 268
    //   261: bipush #31
    //   263: goto -> 268
    //   266: bipush #113
    //   268: ixor
    //   269: ixor
    //   270: i2c
    //   271: castore
    //   272: iinc #6, 1
    //   275: dup
    //   276: ifne -> 284
    //   279: dup2
    //   280: dup_x1
    //   281: goto -> 190
    //   284: dup2_x1
    //   285: pop2
    //   286: dup_x2
    //   287: iload #6
    //   289: if_icmpgt -> 186
    //   292: pop
    //   293: new java/lang/String
    //   296: dup_x1
    //   297: swap
    //   298: invokespecial <init> : ([C)V
    //   301: invokevirtual intern : ()Ljava/lang/String;
    //   304: swap
    //   305: pop
    //   306: swap
    //   307: tableswitch default -> 40, 0 -> 99
    //   324: sipush #13040
    //   327: sipush #31760
    //   330: invokestatic a : (II)Ljava/lang/String;
    //   333: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   336: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zi.ZB : Ljava/util/regex/Pattern;
    //   339: iconst_4
    //   340: newarray byte
    //   342: dup
    //   343: iconst_0
    //   344: bipush #127
    //   346: bastore
    //   347: dup
    //   348: iconst_1
    //   349: bipush #69
    //   351: bastore
    //   352: dup
    //   353: iconst_2
    //   354: bipush #76
    //   356: bastore
    //   357: dup
    //   358: iconst_3
    //   359: bipush #70
    //   361: bastore
    //   362: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zi.ZX : [B
    //   365: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x32F0) & 0xFFFF;
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
      byte b1 = 92;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\local\process\chrome\binary\Zi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */