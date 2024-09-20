package net.portswigger.devtools.client.impl.connection.local.process.chrome.binary;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zjb;
import net.portswigger.browser.Zts;

public class Zd {
  private static final int Zb = 4096;
  
  private final URL ZL;
  
  private final Path ZX;
  
  private final Zjb Zs = Zjb.Zr();
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zd(URL paramURL, Path paramPath) {
    this.ZL = paramURL;
    this.ZX = paramPath;
  }
  
  public void ZF() throws Zts {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZL : Ljava/net/URL;
    //   4: invokevirtual toExternalForm : ()Ljava/lang/String;
    //   7: invokestatic Ze : (Ljava/lang/String;)Ljava/lang/String;
    //   10: astore_2
    //   11: invokestatic ZW : ()Ljava/lang/String;
    //   14: aload_2
    //   15: sipush #-7394
    //   18: sipush #-13530
    //   21: invokestatic a : (II)Ljava/lang/String;
    //   24: invokestatic ZK : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   27: astore_3
    //   28: astore_1
    //   29: aload_2
    //   30: aload_3
    //   31: sipush #-7399
    //   34: sipush #-8816
    //   37: invokestatic a : (II)Ljava/lang/String;
    //   40: swap
    //   41: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   46: invokestatic ZV : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   49: astore #4
    //   51: aload_3
    //   52: aload #4
    //   54: invokevirtual equals : (Ljava/lang/Object;)Z
    //   57: ifne -> 68
    //   60: iconst_1
    //   61: goto -> 69
    //   64: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   67: athrow
    //   68: iconst_0
    //   69: istore #5
    //   71: iload #5
    //   73: ifeq -> 139
    //   76: aload_0
    //   77: aload #4
    //   79: invokevirtual ZT : (Ljava/lang/String;)Ljava/io/File;
    //   82: astore #8
    //   84: new java/util/zip/ZipFile
    //   87: dup
    //   88: aload #8
    //   90: invokespecial <init> : (Ljava/io/File;)V
    //   93: astore #9
    //   95: aload_0
    //   96: aload #9
    //   98: aload_3
    //   99: invokevirtual Zg : (Ljava/util/zip/ZipFile;Ljava/lang/String;)Lnet/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zp;
    //   102: astore #6
    //   104: aload #9
    //   106: aload_3
    //   107: invokevirtual getEntry : (Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   110: astore #10
    //   112: aload #9
    //   114: aload #10
    //   116: invokevirtual getInputStream : (Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   119: astore #7
    //   121: aload_1
    //   122: ifnonnull -> 161
    //   125: iconst_1
    //   126: anewarray burp/Zbqc
    //   129: invokestatic Zr : ([Lburp/Zbqc;)V
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   138: athrow
    //   139: aload_0
    //   140: aload #4
    //   142: invokevirtual Z_ : (Ljava/lang/String;)Lnet/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zp;
    //   145: astore #6
    //   147: new java/net/URL
    //   150: dup
    //   151: aload #4
    //   153: invokespecial <init> : (Ljava/lang/String;)V
    //   156: invokevirtual openStream : ()Ljava/io/InputStream;
    //   159: astore #7
    //   161: new java/util/zip/ZipInputStream
    //   164: dup
    //   165: aload #7
    //   167: invokespecial <init> : (Ljava/io/InputStream;)V
    //   170: astore #8
    //   172: aload #8
    //   174: invokevirtual getNextEntry : ()Ljava/util/zip/ZipEntry;
    //   177: dup
    //   178: astore #9
    //   180: ifnull -> 334
    //   183: aload #9
    //   185: invokevirtual getName : ()Ljava/lang/String;
    //   188: astore #10
    //   190: aload #6
    //   192: aload #10
    //   194: invokevirtual ZE : (Ljava/lang/String;)Ljava/util/Optional;
    //   197: astore #11
    //   199: aload #11
    //   201: invokevirtual isPresent : ()Z
    //   204: ifeq -> 330
    //   207: aload #11
    //   209: invokevirtual get : ()Ljava/lang/Object;
    //   212: checkcast net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Ze
    //   215: astore #12
    //   217: aload #12
    //   219: invokevirtual Zl : ()Z
    //   222: ifeq -> 282
    //   225: aload_0
    //   226: getfield ZX : Ljava/nio/file/Path;
    //   229: aload #10
    //   231: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   236: astore #13
    //   238: aload #13
    //   240: invokeinterface toFile : ()Ljava/io/File;
    //   245: invokevirtual getParentFile : ()Ljava/io/File;
    //   248: invokevirtual mkdirs : ()Z
    //   251: pop
    //   252: aload #12
    //   254: invokevirtual Zn : ()Ljava/lang/String;
    //   257: iconst_0
    //   258: anewarray java/lang/String
    //   261: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   264: astore #14
    //   266: aload #13
    //   268: aload #14
    //   270: iconst_0
    //   271: anewarray java/nio/file/attribute/FileAttribute
    //   274: invokestatic createSymbolicLink : (Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
    //   277: pop
    //   278: aload_1
    //   279: ifnonnull -> 330
    //   282: aload_0
    //   283: getfield ZX : Ljava/nio/file/Path;
    //   286: aload #10
    //   288: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   293: invokeinterface toFile : ()Ljava/io/File;
    //   298: astore #13
    //   300: aload #8
    //   302: aload #13
    //   304: invokestatic ZS : (Ljava/io/InputStream;Ljava/io/File;)V
    //   307: aload #12
    //   309: invokevirtual ZH : ()Z
    //   312: ifeq -> 330
    //   315: aload #13
    //   317: iconst_1
    //   318: iconst_0
    //   319: invokevirtual setExecutable : (ZZ)Z
    //   322: pop
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   329: athrow
    //   330: aload_1
    //   331: ifnonnull -> 172
    //   334: aload #8
    //   336: invokevirtual close : ()V
    //   339: goto -> 364
    //   342: astore #9
    //   344: aload #8
    //   346: invokevirtual close : ()V
    //   349: goto -> 361
    //   352: astore #10
    //   354: aload #9
    //   356: aload #10
    //   358: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   361: aload #9
    //   363: athrow
    //   364: goto -> 396
    //   367: astore #8
    //   369: aload #8
    //   371: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   374: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   377: new net/portswigger/browser/Zts
    //   380: dup
    //   381: sipush #-7396
    //   384: sipush #28796
    //   387: invokestatic a : (II)Ljava/lang/String;
    //   390: aload #8
    //   392: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   395: athrow
    //   396: goto -> 428
    //   399: astore #6
    //   401: aload #6
    //   403: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   406: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   409: new net/portswigger/browser/Zts
    //   412: dup
    //   413: sipush #-7400
    //   416: sipush #-31507
    //   419: invokestatic a : (II)Ljava/lang/String;
    //   422: aload #6
    //   424: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   427: athrow
    //   428: return
    // Exception table:
    //   from	to	target	type
    //   51	64	64	java/lang/Throwable
    //   71	396	399	java/io/IOException
    //   121	132	135	java/lang/Throwable
    //   161	364	367	java/io/IOException
    //   172	334	342	java/lang/Throwable
    //   300	323	326	java/lang/Throwable
    //   344	349	352	java/lang/Throwable
  }
  
  private Zp Z_(String paramString) throws Zts {
    File file = this.ZX.resolve(a(-7408, -2017)).toFile();
    try {
      try {
        if (ZL(file, (new URL(paramString)).openStream()))
          return new Zp(file); 
      } catch (IOException|net.portswigger.devtools.client.impl.connection.local.Zd iOException) {
        Zah.Zl(iOException, Zk_.RETHROWN);
        throw new Zts(String.format(a(-7402, -4041), new Object[] { paramString }), iOException);
      } 
    } catch (Zts zts) {
      throw a(null);
    } 
  }
  
  private Zp Zg(ZipFile paramZipFile, String paramString) throws Zts {
    try {
      File file = this.ZX.resolve(a(-7408, -2017)).toFile();
      ZipEntry zipEntry = paramZipFile.getEntry(paramString);
      InputStream inputStream = paramZipFile.getInputStream(zipEntry);
      if (ZL(file, inputStream))
        return new Zp(file); 
    } catch (IOException|net.portswigger.devtools.client.impl.connection.local.Zd iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      throw new Zts(String.format(a(-7407, -379), new Object[] { paramString }), iOException);
    } 
    throw new Zts(String.format(a(-7407, -379), new Object[] { paramString }));
  }
  
  private boolean ZL(File paramFile, InputStream paramInputStream) throws IOException {
    ZipInputStream zipInputStream = new ZipInputStream(paramInputStream);
    String str = DevtoolsBinariesInfo.ZW();
    try {
      ZipEntry zipEntry;
      while ((zipEntry = zipInputStream.getNextEntry()) != null) {
        String str1 = zipEntry.getName();
        if (a(-7395, -10530).equals(str1)) {
          ZS(zipInputStream, paramFile);
          boolean bool = true;
          zipInputStream.close();
          return bool;
        } 
        if (str == null)
          break; 
      } 
      zipInputStream.close();
    } catch (Throwable throwable) {
      try {
        zipInputStream.close();
      } catch (Throwable throwable1) {
        throwable.addSuppressed(throwable1);
      } 
      throw throwable;
    } 
    return false;
  }
  
  private static void ZS(InputStream paramInputStream, File paramFile) throws IOException {
    paramFile.getParentFile().mkdirs();
    FileOutputStream fileOutputStream = new FileOutputStream(paramFile);
    try {
      ZG(paramInputStream, fileOutputStream);
      fileOutputStream.close();
    } catch (Throwable throwable) {
      try {
        fileOutputStream.close();
      } catch (Throwable throwable1) {
        throwable.addSuppressed(throwable1);
      } 
      throw throwable;
    } 
  }
  
  private static void ZG(InputStream paramInputStream, OutputStream paramOutputStream) throws IOException {
    byte[] arrayOfByte = new byte[4096];
    String str = DevtoolsBinariesInfo.ZW();
    int i;
    while ((i = paramInputStream.read(arrayOfByte)) >= 0) {
      paramOutputStream.write(arrayOfByte, 0, i);
      if (str == null)
        break; 
    } 
  }
  
  private static String ZK(String paramString1, String paramString2) {
    int i = paramString1.indexOf(paramString2);
    try {
      if (i >= 0)
        return paramString1.substring(i + paramString2.length()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramString1;
  }
  
  private static String ZV(String paramString1, String paramString2) {
    int i = paramString1.indexOf(paramString2);
    try {
      if (i >= 0)
        return paramString1.substring(0, i); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramString1;
  }
  
  private static String Ze(String paramString) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramString.endsWith("/") ? paramString.substring(0, paramString.length() - 1) : paramString;
  }
  
  private File ZT(String paramString) throws Zts {
    String str = paramString;
    if (str.startsWith(a(-7393, -29649)))
      str = str.substring(4); 
    try {
      try {
        if (this.Zs.ZF() && str.matches(a(-7398, 10459)))
          str = a(-7397, -19223) + a(-7397, -19223); 
      } catch (MalformedURLException malformedURLException) {
        throw a(null);
      } 
      return new File((new URL(str)).toURI());
    } catch (MalformedURLException|java.net.URISyntaxException|IllegalArgumentException malformedURLException) {
      Zah.Zl(malformedURLException, Zk_.IGNORED);
      try {
        if (str.startsWith(a(-7401, -23556))) {
          str = str.substring(5);
          return new File(str);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        Zah.Zl(illegalArgumentException, Zk_.RETHROWN);
        throw new Zts(String.format(a(-7403, -19144), new Object[] { paramString }), illegalArgumentException);
      } 
      throw new Zts(String.format(a(-7404, -7940), new Object[] { paramString }));
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'z9DÑ´ÎG<,?_\\bH-3µª~õ}&o¦x+w®AVø>y³5²!Iñg(ô¬Õ5gæÇÔl0n÷¬:'õÁü0ôÂÄ4á7ÚVBþ^ÃÙÖÔy¶Æn~æYæÄDXê¢Á°ì2¦´ mlÀ-/A[QÇVôÄÉgæÔ<uÿ¿MÄ¢½ßHæ^Ð(R!EÈ\\f´DÖ/übowûÂNrYùîM½lâ;Z+¢å%¬m($ö2Õë=xìÃSÿÄE´¼£ ±:¦Ú÷M¦¯¡wu+êüÆ`$?pþNiÆéÐ´5Ïé_Ôÿ2MTö:44OüDAµ|6g¸ õ]Ýk£#ü¯z»{Ï³ýNØÇq@` XÂVÿ³]0jÚHw÷?Þª¹±`:R'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #52
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #47
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
    //   68: ldc '|ãh­ª·ÍÁzTø[6ÒÚ01`U¢°¼×6³´AíÜ_SÿÖs°¤ü jïû%:°&EP0³°àF- XSú?ÔC¿ýUËÐ}»þB¤ð?b¡kÊU^X\\ncX·ª[_'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #19
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #16
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
    //   129: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zd.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zd.b : [Ljava/lang/String;
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
    //   212: bipush #18
    //   214: goto -> 244
    //   217: bipush #126
    //   219: goto -> 244
    //   222: bipush #25
    //   224: goto -> 244
    //   227: bipush #40
    //   229: goto -> 244
    //   232: bipush #108
    //   234: goto -> 244
    //   237: bipush #41
    //   239: goto -> 244
    //   242: bipush #67
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE31C) & 0xFFFF;
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
      char c = 'Ò';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\local\process\chrome\binary\Zd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */