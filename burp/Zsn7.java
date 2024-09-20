package burp;

import java.nio.file.Path;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zsn7 {
  private final Path ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zsn7(Path paramPath) {
    this.ZU = paramPath;
  }
  
  public Path ZV() {
    return this.ZU.resolve(a(30989, 31988));
  }
  
  public Path ZM() {
    return this.ZU.resolve(a(30990, -2532));
  }
  
  public boolean ZP() throws Exception {
    // Byte code:
    //   0: invokestatic Zm : ()I
    //   3: istore_1
    //   4: ldc burp/Ze28
    //   6: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   9: sipush #30984
    //   12: sipush #2899
    //   15: invokestatic a : (II)Ljava/lang/String;
    //   18: invokevirtual getResource : (Ljava/lang/String;)Ljava/net/URL;
    //   21: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   24: checkcast java/net/URL
    //   27: invokevirtual toURI : ()Ljava/net/URI;
    //   30: astore_2
    //   31: aload_2
    //   32: invokevirtual getScheme : ()Ljava/lang/String;
    //   35: sipush #30988
    //   38: sipush #-28509
    //   41: invokestatic a : (II)Ljava/lang/String;
    //   44: invokevirtual equals : (Ljava/lang/Object;)Z
    //   47: ifeq -> 96
    //   50: aload_2
    //   51: invokestatic emptyMap : ()Ljava/util/Map;
    //   54: invokestatic newFileSystem : (Ljava/net/URI;Ljava/util/Map;)Ljava/nio/file/FileSystem;
    //   57: astore #4
    //   59: aload #4
    //   61: sipush #30991
    //   64: sipush #19993
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: iconst_0
    //   71: anewarray java/lang/String
    //   74: invokevirtual getPath : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   77: astore_3
    //   78: iload_1
    //   79: ifne -> 104
    //   82: iconst_3
    //   83: anewarray burp/Zbqc
    //   86: invokestatic Zr : ([Lburp/Zbqc;)V
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   95: athrow
    //   96: aconst_null
    //   97: astore #4
    //   99: aload_2
    //   100: invokestatic get : (Ljava/net/URI;)Ljava/nio/file/Path;
    //   103: astore_3
    //   104: aload #4
    //   106: astore #5
    //   108: aload_3
    //   109: iconst_0
    //   110: anewarray java/nio/file/FileVisitOption
    //   113: invokestatic walk : (Ljava/nio/file/Path;[Ljava/nio/file/FileVisitOption;)Ljava/util/stream/Stream;
    //   116: astore #6
    //   118: aload #6
    //   120: invokeinterface toList : ()Ljava/util/List;
    //   125: astore #7
    //   127: aload #7
    //   129: invokeinterface iterator : ()Ljava/util/Iterator;
    //   134: astore #8
    //   136: aload #8
    //   138: invokeinterface hasNext : ()Z
    //   143: ifeq -> 262
    //   146: aload #8
    //   148: invokeinterface next : ()Ljava/lang/Object;
    //   153: checkcast java/nio/file/Path
    //   156: astore #9
    //   158: aload_0
    //   159: getfield ZU : Ljava/nio/file/Path;
    //   162: aload_3
    //   163: aload #9
    //   165: invokeinterface relativize : (Ljava/nio/file/Path;)Ljava/nio/file/Path;
    //   170: invokeinterface toString : ()Ljava/lang/String;
    //   175: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   180: astore #10
    //   182: aload #10
    //   184: invokeinterface getParent : ()Ljava/nio/file/Path;
    //   189: iconst_0
    //   190: anewarray java/nio/file/LinkOption
    //   193: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
    //   196: ifne -> 221
    //   199: aload #10
    //   201: invokeinterface getParent : ()Ljava/nio/file/Path;
    //   206: iconst_0
    //   207: anewarray java/nio/file/attribute/FileAttribute
    //   210: invokestatic createDirectories : (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
    //   213: pop
    //   214: goto -> 221
    //   217: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   220: athrow
    //   221: aload #9
    //   223: iconst_0
    //   224: anewarray java/nio/file/LinkOption
    //   227: invokestatic isDirectory : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
    //   230: ifne -> 258
    //   233: aload #9
    //   235: aload #10
    //   237: iconst_1
    //   238: anewarray java/nio/file/CopyOption
    //   241: dup
    //   242: iconst_0
    //   243: getstatic java/nio/file/StandardCopyOption.REPLACE_EXISTING : Ljava/nio/file/StandardCopyOption;
    //   246: aastore
    //   247: invokestatic copy : (Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    //   250: pop
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   257: athrow
    //   258: iload_1
    //   259: ifne -> 136
    //   262: aload #6
    //   264: ifnull -> 310
    //   267: aload #6
    //   269: invokeinterface close : ()V
    //   274: goto -> 310
    //   277: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   280: athrow
    //   281: astore #7
    //   283: aload #6
    //   285: ifnull -> 307
    //   288: aload #6
    //   290: invokeinterface close : ()V
    //   295: goto -> 307
    //   298: astore #8
    //   300: aload #7
    //   302: aload #8
    //   304: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   307: aload #7
    //   309: athrow
    //   310: aload #5
    //   312: ifnull -> 354
    //   315: aload #5
    //   317: invokevirtual close : ()V
    //   320: goto -> 354
    //   323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   326: athrow
    //   327: astore #6
    //   329: aload #5
    //   331: ifnull -> 351
    //   334: aload #5
    //   336: invokevirtual close : ()V
    //   339: goto -> 351
    //   342: astore #7
    //   344: aload #6
    //   346: aload #7
    //   348: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   351: aload #6
    //   353: athrow
    //   354: aload_0
    //   355: invokevirtual ZV : ()Ljava/nio/file/Path;
    //   358: invokeinterface toFile : ()Ljava/io/File;
    //   363: invokevirtual exists : ()Z
    //   366: ifeq -> 399
    //   369: aload_0
    //   370: invokevirtual ZM : ()Ljava/nio/file/Path;
    //   373: invokeinterface toFile : ()Ljava/io/File;
    //   378: invokevirtual exists : ()Z
    //   381: ifeq -> 399
    //   384: goto -> 391
    //   387: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   390: athrow
    //   391: iconst_1
    //   392: goto -> 400
    //   395: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   398: athrow
    //   399: iconst_0
    //   400: ireturn
    // Exception table:
    //   from	to	target	type
    //   78	89	92	java/lang/Throwable
    //   108	310	327	java/lang/Throwable
    //   118	262	281	java/lang/Throwable
    //   182	214	217	java/lang/Throwable
    //   221	251	254	java/lang/Throwable
    //   262	277	277	java/lang/Throwable
    //   288	295	298	java/lang/Throwable
    //   310	323	323	java/lang/Throwable
    //   334	339	342	java/lang/Throwable
    //   354	384	387	java/lang/Throwable
    //   369	395	395	java/lang/Throwable
  }
  
  public void Ze() {
    try {
      ZV().toFile().delete();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
    try {
      ZM().toFile().delete();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'UK}O­Å¯ÉÂèáF¨%f+IõXÚEk`¥[vQ{ë<8Ï`'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_3
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #79
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
    //   66: ldc '¾«ñÂG0UüÙi÷Ì¬\\n<¥Å³6Iý>ÏÜ{¥Öm+ÅØ/M_î1tá'Ø¦Z¼p~'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #27
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #51
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
    //   127: putstatic burp/Zsn7.a : [Ljava/lang/String;
    //   130: iconst_5
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zsn7.b : [Ljava/lang/String;
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
    //   156: if_icmpgt -> 255
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 237, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 227, 5 -> 232
    //   208: bipush #34
    //   210: goto -> 239
    //   213: bipush #90
    //   215: goto -> 239
    //   218: bipush #96
    //   220: goto -> 239
    //   223: iconst_1
    //   224: goto -> 239
    //   227: bipush #23
    //   229: goto -> 239
    //   232: bipush #50
    //   234: goto -> 239
    //   237: bipush #118
    //   239: ixor
    //   240: ixor
    //   241: i2c
    //   242: castore
    //   243: iinc #6, 1
    //   246: dup
    //   247: ifne -> 255
    //   250: dup2
    //   251: dup_x1
    //   252: goto -> 163
    //   255: dup2_x1
    //   256: pop2
    //   257: dup_x2
    //   258: iload #6
    //   260: if_icmpgt -> 159
    //   263: pop
    //   264: new java/lang/String
    //   267: dup_x1
    //   268: swap
    //   269: invokespecial <init> : ([C)V
    //   272: invokevirtual intern : ()Ljava/lang/String;
    //   275: swap
    //   276: pop
    //   277: swap
    //   278: tableswitch default -> 38, 0 -> 97
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x790C) & 0xFFFF;
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
      char c = 'È';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsn7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */