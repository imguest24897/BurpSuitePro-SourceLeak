package net.portswigger.devtools.client.impl.connection.local.process.chrome.binary;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public class DevtoolsBinariesInfo {
  private static final Object UNPACK_LOCK;
  
  private final Path pathToBinariesDirectory;
  
  private final URL urlToBinariesWithinArchive;
  
  private static String ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static DevtoolsBinariesInfo loadBinariesFrom(Path paramPath) {
    return new DevtoolsBinariesInfo(paramPath.resolve(Zl.ZN), null);
  }
  
  public static DevtoolsBinariesInfo$BuilderForArchiveUnpackingBinariesInfo unpackBinariesIfRequiredFrom(URL paramURL) {
    return new DevtoolsBinariesInfo$BuilderForArchiveUnpackingBinariesInfo(paramURL);
  }
  
  public DevtoolsBinariesInfo(Path paramPath, URL paramURL) {
    this.pathToBinariesDirectory = paramPath;
    this.urlToBinariesWithinArchive = paramURL;
  }
  
  public Path pathToBinariesDirectory() {
    return this.pathToBinariesDirectory;
  }
  
  public Optional<URL> urlToBinariesWithinArchive() {
    return Optional.ofNullable(this.urlToBinariesWithinArchive);
  }
  
  public List<String> checkPath() {
    // Byte code:
    //   0: aload_0
    //   1: getfield pathToBinariesDirectory : Ljava/nio/file/Path;
    //   4: ifnonnull -> 20
    //   7: sipush #28479
    //   10: sipush #-19685
    //   13: invokestatic a : (II)Ljava/lang/String;
    //   16: invokestatic of : (Ljava/lang/Object;)Ljava/util/List;
    //   19: areturn
    //   20: new java/util/ArrayList
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore_1
    //   28: aload_0
    //   29: getfield pathToBinariesDirectory : Ljava/nio/file/Path;
    //   32: aload_1
    //   33: dup
    //   34: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   37: pop
    //   38: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   43: invokestatic ZZ : (Ljava/nio/file/Path;Ljava/util/function/Consumer;)Ljava/util/Optional;
    //   46: aload_0
    //   47: aload_1
    //   48: <illegal opcode> accept : (Lnet/portswigger/devtools/client/impl/connection/local/process/chrome/binary/DevtoolsBinariesInfo;Ljava/util/List;)Ljava/util/function/Consumer;
    //   53: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   56: aload_1
    //   57: areturn
  }
  
  private void lambda$checkPath$0(List paramList, Zp paramZp) {
    // Byte code:
    //   0: invokestatic ZW : ()Ljava/lang/String;
    //   3: aload_2
    //   4: getfield Zv : Ljava/util/List;
    //   7: invokeinterface iterator : ()Ljava/util/Iterator;
    //   12: astore #4
    //   14: astore_3
    //   15: aload #4
    //   17: invokeinterface hasNext : ()Z
    //   22: ifeq -> 428
    //   25: aload #4
    //   27: invokeinterface next : ()Ljava/lang/Object;
    //   32: checkcast net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Ze
    //   35: astore #5
    //   37: aload_0
    //   38: getfield pathToBinariesDirectory : Ljava/nio/file/Path;
    //   41: aload #5
    //   43: invokevirtual Z_ : ()Ljava/lang/String;
    //   46: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   51: invokeinterface toFile : ()Ljava/io/File;
    //   56: astore #6
    //   58: aload #6
    //   60: invokevirtual exists : ()Z
    //   63: ifne -> 104
    //   66: aload_1
    //   67: aload #5
    //   69: invokevirtual Z_ : ()Ljava/lang/String;
    //   72: sipush #28476
    //   75: sipush #13524
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: swap
    //   82: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   87: invokeinterface add : (Ljava/lang/Object;)Z
    //   92: pop
    //   93: aload_3
    //   94: ifnonnull -> 424
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   103: athrow
    //   104: aload #5
    //   106: invokevirtual ZH : ()Z
    //   109: ifeq -> 172
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   118: athrow
    //   119: aload #6
    //   121: invokevirtual canExecute : ()Z
    //   124: ifne -> 172
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   133: athrow
    //   134: aload_1
    //   135: aload #5
    //   137: invokevirtual Z_ : ()Ljava/lang/String;
    //   140: sipush #28474
    //   143: sipush #10530
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: swap
    //   150: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   155: invokeinterface add : (Ljava/lang/Object;)Z
    //   160: pop
    //   161: aload_3
    //   162: ifnonnull -> 424
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   171: athrow
    //   172: aload #5
    //   174: invokevirtual ZX : ()Z
    //   177: ifeq -> 279
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   186: athrow
    //   187: aload #6
    //   189: invokevirtual length : ()J
    //   192: aload #5
    //   194: invokevirtual Zs : ()I
    //   197: i2l
    //   198: lcmp
    //   199: ifeq -> 279
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   208: athrow
    //   209: aload_1
    //   210: aload #5
    //   212: invokevirtual Z_ : ()Ljava/lang/String;
    //   215: aload #5
    //   217: invokevirtual Zs : ()I
    //   220: aload #6
    //   222: invokevirtual length : ()J
    //   225: lstore #8
    //   227: istore #10
    //   229: astore #11
    //   231: sipush #28470
    //   234: sipush #16558
    //   237: invokestatic a : (II)Ljava/lang/String;
    //   240: aload #11
    //   242: sipush #28478
    //   245: sipush #23769
    //   248: invokestatic a : (II)Ljava/lang/String;
    //   251: iload #10
    //   253: sipush #28477
    //   256: sipush #-32081
    //   259: invokestatic a : (II)Ljava/lang/String;
    //   262: lload #8
    //   264: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;J)Ljava/lang/String;
    //   269: invokeinterface add : (Ljava/lang/Object;)Z
    //   274: pop
    //   275: aload_3
    //   276: ifnonnull -> 424
    //   279: aload #5
    //   281: invokevirtual ZT : ()Z
    //   284: ifeq -> 344
    //   287: aload #6
    //   289: invokestatic Zz : (Ljava/io/File;)Ljava/lang/String;
    //   292: aload #5
    //   294: invokevirtual ZN : ()Ljava/lang/String;
    //   297: invokevirtual equals : (Ljava/lang/Object;)Z
    //   300: ifne -> 344
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   309: athrow
    //   310: aload_1
    //   311: aload #5
    //   313: invokevirtual Z_ : ()Ljava/lang/String;
    //   316: sipush #28473
    //   319: sipush #22572
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: swap
    //   326: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   331: invokeinterface add : (Ljava/lang/Object;)Z
    //   336: pop
    //   337: goto -> 344
    //   340: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   343: athrow
    //   344: goto -> 424
    //   347: astore #7
    //   349: aload #7
    //   351: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   354: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   357: aload_1
    //   358: aload #5
    //   360: invokevirtual Z_ : ()Ljava/lang/String;
    //   363: sipush #28472
    //   366: sipush #1399
    //   369: invokestatic a : (II)Ljava/lang/String;
    //   372: swap
    //   373: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   378: invokeinterface add : (Ljava/lang/Object;)Z
    //   383: pop
    //   384: goto -> 424
    //   387: astore #7
    //   389: aload #7
    //   391: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   394: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   397: aload_1
    //   398: aload #5
    //   400: invokevirtual Z_ : ()Ljava/lang/String;
    //   403: sipush #28475
    //   406: sipush #21011
    //   409: invokestatic a : (II)Ljava/lang/String;
    //   412: swap
    //   413: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   418: invokeinterface add : (Ljava/lang/Object;)Z
    //   423: pop
    //   424: aload_3
    //   425: ifnonnull -> 15
    //   428: return
    // Exception table:
    //   from	to	target	type
    //   58	97	100	java/io/IOException
    //   66	112	115	java/io/IOException
    //   104	127	130	java/io/IOException
    //   119	165	168	java/io/IOException
    //   134	180	183	java/io/IOException
    //   172	202	205	java/io/IOException
    //   279	303	306	java/io/IOException
    //   279	344	347	java/io/IOException
    //   279	344	387	java/security/NoSuchAlgorithmException
    //   287	337	340	java/io/IOException
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: ldc 'T65uZb'
    //   9: iconst_0
    //   10: istore_3
    //   11: invokestatic ZN : (Ljava/lang/String;)V
    //   14: ldc '­$-©ÂvY£2Y"rà4ù¶QaõBöu¶¾MMú³^[TïàtNÚL¦<ÎVFùÚµlgüQ¤º_(Ùí!1\\ns{ßÕ7¤¤Oz$1{4yÍÂ{nfà à!h¥xÉZm^ÐqÖ0¾2ÔWðã.¦Z'
    //   16: dup
    //   17: astore_2
    //   18: invokevirtual length : ()I
    //   21: istore #4
    //   23: bipush #10
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #13
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 148
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc 'ÔXïÙ¦6"ÿBÝH_¨éîüPÔOu µÝi'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #19
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #110
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/DevtoolsBinariesInfo.a : [Ljava/lang/String;
    //   137: bipush #9
    //   139: anewarray java/lang/String
    //   142: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/DevtoolsBinariesInfo.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #33
    //   218: goto -> 248
    //   221: bipush #104
    //   223: goto -> 248
    //   226: bipush #76
    //   228: goto -> 248
    //   231: bipush #53
    //   233: goto -> 248
    //   236: bipush #80
    //   238: goto -> 248
    //   241: bipush #84
    //   243: goto -> 248
    //   246: bipush #26
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 104
    //   304: new java/lang/Object
    //   307: dup
    //   308: invokespecial <init> : ()V
    //   311: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/DevtoolsBinariesInfo.UNPACK_LOCK : Ljava/lang/Object;
    //   314: return
  }
  
  public static void ZN(String paramString) {
    ZX = paramString;
  }
  
  public static String ZW() {
    return ZX;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6F3E) & 0xFFFF;
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
      byte b1 = 48;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\local\process\chrome\binary\DevtoolsBinariesInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */