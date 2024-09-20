package net.portswigger.devtools.client.impl.connection.local.process.chrome.binary;

import java.io.IOException;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zts;

public class DevtoolsBinariesInfo$BuilderForArchiveUnpackingBinariesInfo {
  private final URL urlToBinariesWithinArchive;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public DevtoolsBinariesInfo$BuilderForArchiveUnpackingBinariesInfo(URL paramURL) {
    this.urlToBinariesWithinArchive = paramURL;
  }
  
  public DevtoolsBinariesInfo to(Path paramPath) throws Zts {
    // Byte code:
    //   0: invokestatic ZW : ()Ljava/lang/String;
    //   3: getstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/DevtoolsBinariesInfo.UNPACK_LOCK : Ljava/lang/Object;
    //   6: dup
    //   7: astore_3
    //   8: monitorenter
    //   9: astore_2
    //   10: aload_1
    //   11: getstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zl.ZN : Ljava/lang/String;
    //   14: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   19: astore #4
    //   21: aload_1
    //   22: sipush #-12263
    //   25: sipush #-3013
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   36: astore #5
    //   38: aload #5
    //   40: iconst_0
    //   41: anewarray java/nio/file/LinkOption
    //   44: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
    //   47: ifne -> 63
    //   50: aload_1
    //   51: aload #5
    //   53: invokestatic initialiseLockFile : (Ljava/nio/file/Path;Ljava/nio/file/Path;)V
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   62: athrow
    //   63: aload #5
    //   65: iconst_1
    //   66: anewarray java/nio/file/OpenOption
    //   69: dup
    //   70: iconst_0
    //   71: getstatic java/nio/file/StandardOpenOption.APPEND : Ljava/nio/file/StandardOpenOption;
    //   74: aastore
    //   75: invokestatic open : (Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/nio/channels/FileChannel;
    //   78: astore #6
    //   80: aload #6
    //   82: invokevirtual lock : ()Ljava/nio/channels/FileLock;
    //   85: astore #7
    //   87: aload #4
    //   89: invokeinterface toFile : ()Ljava/io/File;
    //   94: invokevirtual exists : ()Z
    //   97: ifne -> 182
    //   100: getstatic net/portswigger/browser/Zds.INFO : Lnet/portswigger/browser/Zds;
    //   103: aload #4
    //   105: invokeinterface toAbsolutePath : ()Ljava/nio/file/Path;
    //   110: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   113: sipush #-12261
    //   116: sipush #17602
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: swap
    //   123: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   128: iconst_0
    //   129: anewarray java/lang/Object
    //   132: invokestatic Zp : (Lnet/portswigger/browser/Zds;Ljava/lang/String;[Ljava/lang/Object;)V
    //   135: new net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zd
    //   138: dup
    //   139: aload_0
    //   140: getfield urlToBinariesWithinArchive : Ljava/net/URL;
    //   143: aload #4
    //   145: invokeinterface toFile : ()Ljava/io/File;
    //   150: invokevirtual toPath : ()Ljava/nio/file/Path;
    //   153: invokespecial <init> : (Ljava/net/URL;Ljava/nio/file/Path;)V
    //   156: astore #8
    //   158: aload #8
    //   160: invokevirtual ZF : ()V
    //   163: getstatic net/portswigger/browser/Zds.INFO : Lnet/portswigger/browser/Zds;
    //   166: sipush #-12264
    //   169: sipush #2138
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: iconst_0
    //   176: anewarray java/lang/Object
    //   179: invokestatic Zp : (Lnet/portswigger/browser/Zds;Ljava/lang/String;[Ljava/lang/Object;)V
    //   182: new net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/DevtoolsBinariesInfo
    //   185: dup
    //   186: aload #4
    //   188: aload_0
    //   189: getfield urlToBinariesWithinArchive : Ljava/net/URL;
    //   192: invokespecial <init> : (Ljava/nio/file/Path;Ljava/net/URL;)V
    //   195: astore #8
    //   197: aload #7
    //   199: ifnull -> 214
    //   202: aload #7
    //   204: invokevirtual close : ()V
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   213: athrow
    //   214: aload #6
    //   216: ifnull -> 231
    //   219: aload #6
    //   221: invokevirtual close : ()V
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   230: athrow
    //   231: aload_3
    //   232: monitorexit
    //   233: aload #8
    //   235: invokestatic Zwu : ()[Lburp/Zbqc;
    //   238: ifnonnull -> 246
    //   241: ldc 'QVEoZ'
    //   243: invokestatic ZN : (Ljava/lang/String;)V
    //   246: areturn
    //   247: astore #8
    //   249: aload #7
    //   251: ifnull -> 271
    //   254: aload #7
    //   256: invokevirtual close : ()V
    //   259: goto -> 271
    //   262: astore #9
    //   264: aload #8
    //   266: aload #9
    //   268: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   271: aload #8
    //   273: athrow
    //   274: astore #7
    //   276: aload #6
    //   278: ifnull -> 298
    //   281: aload #6
    //   283: invokevirtual close : ()V
    //   286: goto -> 298
    //   289: astore #8
    //   291: aload #7
    //   293: aload #8
    //   295: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   298: aload #7
    //   300: athrow
    //   301: astore #6
    //   303: aload #6
    //   305: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   308: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   311: new net/portswigger/browser/Zts
    //   314: dup
    //   315: aload #6
    //   317: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   320: athrow
    //   321: astore #10
    //   323: aload_3
    //   324: monitorexit
    //   325: aload #10
    //   327: athrow
    // Exception table:
    //   from	to	target	type
    //   10	233	321	finally
    //   38	56	59	java/lang/Throwable
    //   63	231	301	java/io/IOException
    //   80	214	274	java/lang/Throwable
    //   87	197	247	java/lang/Throwable
    //   197	207	210	java/lang/Throwable
    //   214	224	227	java/lang/Throwable
    //   247	274	274	java/lang/Throwable
    //   247	301	301	java/io/IOException
    //   247	325	321	finally
    //   254	259	262	java/lang/Throwable
    //   281	286	289	java/lang/Throwable
  }
  
  private static void initialiseLockFile(Path paramPath1, Path paramPath2) throws Zts {
    try {
      try {
        Files.createDirectories(paramPath1, (FileAttribute<?>[])new FileAttribute[0]);
      } catch (FileAlreadyExistsException fileAlreadyExistsException) {
        Zah.Zl(fileAlreadyExistsException, Zk_.IGNORED);
      } 
      try {
        Files.createFile(paramPath2, (FileAttribute<?>[])new FileAttribute[0]);
      } catch (FileAlreadyExistsException fileAlreadyExistsException) {
        Zah.Zl(fileAlreadyExistsException, Zk_.IGNORED);
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      throw new Zts(iOException);
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'h]®ô`Ñ'rçÈèC²9I¬Gy÷×·?ÉkÎ&^Ã+®C½QhÌëÃ¥øöoWqV²[Ø4.Uùæ)%@ÙÇá&-ÜL¡¡tþkþéáZ¼\\nc{9'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #32
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
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/DevtoolsBinariesInfo$BuilderForArchiveUnpackingBinariesInfo.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/DevtoolsBinariesInfo$BuilderForArchiveUnpackingBinariesInfo.b : [Ljava/lang/String;
    //   79: goto -> 226
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 161, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #125
    //   154: goto -> 183
    //   157: iconst_2
    //   158: goto -> 183
    //   161: bipush #28
    //   163: goto -> 183
    //   166: bipush #64
    //   168: goto -> 183
    //   171: bipush #88
    //   173: goto -> 183
    //   176: bipush #39
    //   178: goto -> 183
    //   181: bipush #109
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD019) & 0xFFFF;
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
      byte b1 = 65;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\local\process\chrome\binary\DevtoolsBinariesInfo$BuilderForArchiveUnpackingBinariesInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */