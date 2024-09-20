package burp;

import java.awt.Component;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.prefs.Preferences;
import javax.swing.filechooser.FileFilter;
import net.portswigger.Zah;
import net.portswigger.Zc7;
import net.portswigger.Zk_;
import net.portswigger.Zl0;
import net.portswigger.Zvh;
import org.jetbrains.annotations.NotNull;

public class Zs6n {
  private static int Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static File ZP(Zg1m paramZg1m, Zmjm paramZmjm, Component paramComponent, int paramInt) {
    return Zo(paramZg1m, paramZmjm, paramComponent, paramInt, null, null, null, false, null);
  }
  
  public static File Zp(Zg1m paramZg1m, Zmjm paramZmjm, Component paramComponent, int paramInt, String paramString) {
    return Zo(paramZg1m, paramZmjm, paramComponent, paramInt, paramString, null, null, false, null);
  }
  
  public static File ZE(Zg1m paramZg1m, Zmjm paramZmjm, Component paramComponent, int paramInt, String paramString, File paramFile) {
    return Zo(paramZg1m, paramZmjm, paramComponent, paramInt, paramString, null, paramFile, false, null);
  }
  
  public static File Zc(Zg1m paramZg1m, Component paramComponent, int paramInt, String paramString) {
    return Zo(paramZg1m, Zmjm.ZW, paramComponent, paramInt, paramString, null, null, true, null);
  }
  
  public static File Zd(Zg1m paramZg1m, Component paramComponent, int paramInt, String paramString, Zskm paramZskm) {
    return Zo(paramZg1m, Zmjm.ZW, paramComponent, paramInt, paramString, paramZskm, null, true, null);
  }
  
  public static File ZA(Zg1m paramZg1m, Zmjm paramZmjm, Component paramComponent, int paramInt, String paramString, Zskm paramZskm) {
    return Zo(paramZg1m, paramZmjm, paramComponent, paramInt, paramString, paramZskm, null, false, null);
  }
  
  public static File ZG(Zg1m paramZg1m, Component paramComponent, int paramInt, String paramString, FileFilter paramFileFilter) {
    return Zo(paramZg1m, Zmjm.ZW, paramComponent, paramInt, paramString, null, null, false, paramFileFilter);
  }
  
  public static File Zo(Zg1m paramZg1m, Zmjm paramZmjm, Component paramComponent, int paramInt, String paramString, Zskm paramZskm, File paramFile, boolean paramBoolean, FileFilter paramFileFilter) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic ZK : (Lburp/Zg1m;)Ljava/lang/String;
    //   4: astore #9
    //   6: iconst_1
    //   7: anewarray burp/Zrvv
    //   10: astore #10
    //   12: iload #7
    //   14: ifeq -> 23
    //   17: getstatic burp/Zlfc.DIRECTORIES_ONLY : Lburp/Zlfc;
    //   20: goto -> 26
    //   23: getstatic burp/Zlfc.FILES_ONLY : Lburp/Zlfc;
    //   26: astore #11
    //   28: aload #10
    //   30: aload_2
    //   31: iload_3
    //   32: aload #4
    //   34: aload #5
    //   36: aload #9
    //   38: aload #6
    //   40: aload #11
    //   42: aload #8
    //   44: <illegal opcode> run : ([Lburp/Zrvv;Ljava/awt/Component;ILjava/lang/String;Lburp/Zskm;Ljava/lang/String;Ljava/io/File;Lburp/Zlfc;Ljavax/swing/filechooser/FileFilter;)Ljava/lang/Runnable;
    //   49: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   52: aload #10
    //   54: iconst_0
    //   55: aaload
    //   56: invokevirtual ZD : ()Ljava/io/File;
    //   59: astore #12
    //   61: aload #12
    //   63: ifnull -> 206
    //   66: iload #7
    //   68: ifeq -> 79
    //   71: aload #12
    //   73: invokevirtual getPath : ()Ljava/lang/String;
    //   76: goto -> 84
    //   79: aload #12
    //   81: invokevirtual getParent : ()Ljava/lang/String;
    //   84: aload_0
    //   85: invokestatic ZW : (Ljava/lang/String;Lburp/Zg1m;)V
    //   88: aload_1
    //   89: aload #12
    //   91: invokeinterface Zh : (Ljava/io/File;)Lburp/Zxs_;
    //   96: astore #13
    //   98: aload #13
    //   100: invokeinterface Ze : ()Z
    //   105: ifeq -> 146
    //   108: aload_2
    //   109: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   112: aload #13
    //   114: invokeinterface Zt : ()Ljava/lang/String;
    //   119: aload #13
    //   121: invokeinterface Zp : ()Ljava/lang/String;
    //   126: invokestatic Zv : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   129: aload_0
    //   130: aload_1
    //   131: aload_2
    //   132: iload_3
    //   133: aload #4
    //   135: aload #5
    //   137: aload #6
    //   139: iload #7
    //   141: aconst_null
    //   142: invokestatic Zo : (Lburp/Zg1m;Lburp/Zmjm;Ljava/awt/Component;ILjava/lang/String;Lburp/Zskm;Ljava/io/File;ZLjavax/swing/filechooser/FileFilter;)Ljava/io/File;
    //   145: areturn
    //   146: iload_3
    //   147: iconst_1
    //   148: if_icmpne -> 206
    //   151: aload #10
    //   153: iconst_0
    //   154: aaload
    //   155: invokevirtual Zk : ()I
    //   158: iconst_1
    //   159: if_icmpeq -> 206
    //   162: aload #12
    //   164: invokevirtual exists : ()Z
    //   167: ifeq -> 206
    //   170: aload_2
    //   171: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   174: sipush #-17623
    //   177: sipush #-19949
    //   180: invokestatic a : (II)Ljava/lang/String;
    //   183: invokestatic ZY : (Ljava/awt/Component;Ljava/lang/Object;)Z
    //   186: ifne -> 206
    //   189: aload_0
    //   190: aload_1
    //   191: aload_2
    //   192: iload_3
    //   193: aload #4
    //   195: aload #5
    //   197: aload #6
    //   199: iload #7
    //   201: aconst_null
    //   202: invokestatic Zo : (Lburp/Zg1m;Lburp/Zmjm;Ljava/awt/Component;ILjava/lang/String;Lburp/Zskm;Ljava/io/File;ZLjavax/swing/filechooser/FileFilter;)Ljava/io/File;
    //   205: areturn
    //   206: aload #12
    //   208: areturn
  }
  
  private static void ZW(String paramString, Zg1m paramZg1m) {
    Preferences preferences = Preferences.userNodeForPackage(StartBurp.class);
    preferences.put(ZE(paramZg1m), paramString);
    preferences.put(a(-17622, -11636), paramString);
  }
  
  public static String ZK(Zg1m paramZg1m) {
    Preferences preferences = Preferences.userNodeForPackage(StartBurp.class);
    String str = preferences.get(ZE(paramZg1m), null);
    return (str == null) ? preferences.get(a(-17624, -12893), null) : str;
  }
  
  @NotNull
  private static String ZE(Zg1m paramZg1m) {
    return a(-17617, -1740) + a(-17617, -1740);
  }
  
  public static File[] ZD(Zg1m paramZg1m, Zmjm paramZmjm, Component paramComponent, String paramString) {
    return ZT(paramZg1m, paramZmjm, paramComponent, paramString, new Zm56(), Zlfc.FILES_ONLY);
  }
  
  public static File[] ZL(Zg1m paramZg1m, Component paramComponent, String paramString, FileFilter paramFileFilter) {
    return ZT(paramZg1m, Zmjm.ZW, paramComponent, paramString, paramFileFilter, Zlfc.FILES_ONLY);
  }
  
  public static File[] Zp(Zg1m paramZg1m, Component paramComponent, String paramString, FileFilter paramFileFilter, Zlfc paramZlfc) {
    return ZT(paramZg1m, Zmjm.ZW, paramComponent, paramString, paramFileFilter, paramZlfc);
  }
  
  public static void ZL(Zg1m paramZg1m, Zmjm paramZmjm, Component paramComponent, int paramInt, String paramString, byte[] paramArrayOfbyte, Zl0 paramZl0, Zskh paramZskh) {
    if (paramArrayOfbyte == null)
      return; 
    File file = Zp(paramZg1m, paramZmjm, paramComponent, paramInt, paramString);
    if (file == null)
      return; 
    Zh(file, paramArrayOfbyte, paramZl0, paramZskh);
  }
  
  public static byte[] ZQ(Zg1m paramZg1m, Zmjm paramZmjm, Component paramComponent, int paramInt, String paramString, Zl0 paramZl0, Zskh paramZskh) {
    File file = Zp(paramZg1m, paramZmjm, paramComponent, paramInt, paramString);
    return (file == null) ? null : ZQ(file, paramZl0, paramZskh);
  }
  
  public static byte[] ZQ(File paramFile, Zl0 paramZl0, Zskh paramZskh) {
    try {
      return Zr(paramFile, paramZl0);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      try {
        Zmgc.ERROR_READING_FILE.ZV(paramZskh.Zz(), new Object[] { paramFile.getCanonicalFile() });
      } catch (Exception exception1) {
        Zah.Zl(exception1, Zk_.IGNORED);
      } 
      return null;
    } 
  }
  
  public static byte[] Zr(File paramFile, Zl0 paramZl0) throws IOException {
    InputStream inputStream = paramZl0.ZO(paramFile);
    try {
      byte[] arrayOfByte = Zc7.Zs(inputStream);
      try {
        if (inputStream != null)
          inputStream.close(); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return arrayOfByte;
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
  
  public static boolean Zh(File paramFile, byte[] paramArrayOfbyte, Zl0 paramZl0, Zskh paramZskh) {
    BufferedOutputStream bufferedOutputStream = null;
    try {
      bufferedOutputStream = new BufferedOutputStream(paramZl0.Zp(paramFile));
      bufferedOutputStream.write(paramArrayOfbyte);
      bufferedOutputStream.flush();
      bufferedOutputStream.close();
      return true;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      try {
        Zmgc.ERROR_WRITING_TO_FILE.ZV(paramZskh, new Object[] { paramFile.getCanonicalPath() });
        if (bufferedOutputStream != null)
          bufferedOutputStream.close(); 
      } catch (Exception exception1) {
        Zah.Zl(exception1, Zk_.IGNORED);
      } 
      return false;
    } 
  }
  
  public static List<String> ZJ(File paramFile, Zl0 paramZl0) throws IOException {
    ArrayList<String> arrayList = new ArrayList();
    BufferedReader bufferedReader = new BufferedReader(paramZl0.Za(paramFile));
    int i = Zd();
    try {
      String str;
      while ((str = bufferedReader.readLine()) != null) {
        arrayList.add(str);
        if (i == 0)
          break; 
      } 
      bufferedReader.close();
    } catch (Throwable throwable) {
      try {
        bufferedReader.close();
      } catch (Throwable throwable1) {
        throwable.addSuppressed(throwable1);
      } 
      throw throwable;
    } 
    return arrayList;
  }
  
  public static List<byte[]> Zu(File paramFile) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual length : ()J
    //   4: lstore_2
    //   5: invokestatic Zj : ()I
    //   8: lload_2
    //   9: l2d
    //   10: ldc2_w 2097152.0
    //   13: ddiv
    //   14: invokestatic ceil : (D)D
    //   17: d2i
    //   18: istore #4
    //   20: istore_1
    //   21: new java/util/concurrent/ConcurrentHashMap
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: astore #5
    //   30: iconst_0
    //   31: iload #4
    //   33: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   36: invokeinterface parallel : ()Ljava/util/stream/IntStream;
    //   41: lload_2
    //   42: aload_0
    //   43: aload #5
    //   45: <illegal opcode> accept : (JLjava/io/File;Ljava/util/Map;)Ljava/util/function/IntConsumer;
    //   50: invokeinterface forEach : (Ljava/util/function/IntConsumer;)V
    //   55: new java/util/ArrayList
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: astore #6
    //   64: iconst_0
    //   65: istore #7
    //   67: iload #7
    //   69: iload #4
    //   71: if_icmpge -> 104
    //   74: aload #6
    //   76: aload #5
    //   78: iload #7
    //   80: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   83: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   88: checkcast java/util/Collection
    //   91: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   96: pop
    //   97: iinc #7, 1
    //   100: iload_1
    //   101: ifeq -> 67
    //   104: aload #6
    //   106: invokestatic Zwu : ()[Lburp/Zbqc;
    //   109: ifnonnull -> 119
    //   112: iinc #1, 1
    //   115: iload_1
    //   116: invokestatic ZU : (I)V
    //   119: areturn
  }
  
  public static List<byte[]> Zj(ByteBuffer paramByteBuffer) {
    ArrayList<byte[]> arrayList = new ArrayList();
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    int i = Zj();
    while (paramByteBuffer.hasRemaining()) {
      byte b = paramByteBuffer.get();
      switch (b) {
        case 10:
          arrayList.add(byteArrayOutputStream.toByteArray());
          byteArrayOutputStream.reset();
        case 13:
        
        default:
          byteArrayOutputStream.write(b);
          break;
      } 
      continue;
      if (i != 0)
        break; 
    } 
    if (byteArrayOutputStream.size() > 0)
      arrayList.add(byteArrayOutputStream.toByteArray()); 
    return (List<byte[]>)arrayList;
  }
  
  public static boolean Zb(File paramFile) {
    if (!paramFile.isDirectory())
      return false; 
    File[] arrayOfFile = paramFile.listFiles();
    return (arrayOfFile == null || arrayOfFile.length == 0);
  }
  
  public static String ZG(InputStream paramInputStream, Charset paramCharset) throws IOException {
    int i = Zd();
    try {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(paramInputStream, paramCharset));
      StringBuilder stringBuilder = new StringBuilder();
      char[] arrayOfChar = new char[8192];
      int j;
      while ((j = bufferedReader.read(arrayOfChar, 0, arrayOfChar.length)) > 0) {
        stringBuilder.append(arrayOfChar, 0, j);
        if (i == 0)
          break; 
      } 
      return stringBuilder.toString();
    } finally {
      if (paramInputStream != null)
        try {
          paramInputStream.close();
        } catch (IOException iOException) {
          Zah.Zl(iOException, Zk_.IGNORED);
        }  
    } 
  }
  
  public static String Zr(File paramFile, Zl0 paramZl0, Charset paramCharset) throws IOException {
    return ZG(paramZl0.ZO(paramFile), paramCharset);
  }
  
  public static void Zu(String paramString, File paramFile, Zl0 paramZl0, Charset paramCharset) throws IOException {
    Zh(paramString, paramFile, paramZl0, paramCharset, false);
  }
  
  public static void Zh(String paramString, File paramFile, Zl0 paramZl0, Charset paramCharset, boolean paramBoolean) throws IOException {
    OutputStreamWriter outputStreamWriter = null;
    try {
      outputStreamWriter = new OutputStreamWriter(paramZl0.Zp(paramFile, paramBoolean), paramCharset);
      outputStreamWriter.write(paramString);
      outputStreamWriter.flush();
    } finally {
      if (outputStreamWriter != null)
        try {
          outputStreamWriter.close();
        } catch (IOException iOException) {
          Zah.Zl(iOException, Zk_.IGNORED);
        }  
    } 
  }
  
  public static long ZW(File paramFile, Zl0 paramZl0) {
    return ((Long)Zf(paramFile, paramZl0).<Long>map(File::getUsableSpace).orElse(Long.valueOf(-1L))).longValue();
  }
  
  public static Optional<File> Zf(File paramFile, Zl0 paramZl0) {
    if (Zvh.ZU.ZE()) {
      String str1 = paramFile.getAbsolutePath();
      if (str1.length() < 2)
        return Optional.empty(); 
      String str2 = str1.substring(0, 2);
      return !str2.endsWith(":") ? Optional.empty() : Optional.of(paramZl0.Zg(str2));
    } 
    while (true) {
      long l = paramFile.getTotalSpace();
      if (l > 0L)
        return Optional.of(paramFile); 
      paramFile = paramFile.getParentFile();
      if (paramFile == null)
        return Optional.empty(); 
    } 
  }
  
  public static void ZL(Path paramPath) throws IOException {
    Files.walkFileTree(paramPath, new Zz1n());
  }
  
  private static File[] ZT(Zg1m paramZg1m, Zmjm paramZmjm, Component paramComponent, String paramString, FileFilter paramFileFilter, Zlfc paramZlfc) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic ZK : (Lburp/Zg1m;)Ljava/lang/String;
    //   4: astore #7
    //   6: invokestatic Zj : ()I
    //   9: new java/util/concurrent/atomic/AtomicReference
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore #8
    //   18: aload #8
    //   20: aload_2
    //   21: aload_3
    //   22: aload #4
    //   24: aload #7
    //   26: aload #5
    //   28: <illegal opcode> run : (Ljava/util/concurrent/atomic/AtomicReference;Ljava/awt/Component;Ljava/lang/String;Ljavax/swing/filechooser/FileFilter;Ljava/lang/String;Lburp/Zlfc;)Ljava/lang/Runnable;
    //   33: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   36: istore #6
    //   38: aload #8
    //   40: invokevirtual get : ()Ljava/lang/Object;
    //   43: checkcast burp/Zrvv
    //   46: astore #9
    //   48: aload #9
    //   50: ifnonnull -> 55
    //   53: aconst_null
    //   54: areturn
    //   55: aload #9
    //   57: invokevirtual ZX : ()[Ljava/io/File;
    //   60: astore #10
    //   62: aload #10
    //   64: ifnonnull -> 69
    //   67: aconst_null
    //   68: areturn
    //   69: aload #10
    //   71: astore #11
    //   73: aload #11
    //   75: arraylength
    //   76: istore #12
    //   78: iconst_0
    //   79: istore #13
    //   81: iload #13
    //   83: iload #12
    //   85: if_icmpge -> 156
    //   88: aload #11
    //   90: iload #13
    //   92: aaload
    //   93: astore #14
    //   95: aload_1
    //   96: aload #14
    //   98: invokeinterface Zh : (Ljava/io/File;)Lburp/Zxs_;
    //   103: astore #15
    //   105: aload #15
    //   107: invokeinterface Ze : ()Z
    //   112: ifeq -> 148
    //   115: aload_2
    //   116: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   119: aload #15
    //   121: invokeinterface Zt : ()Ljava/lang/String;
    //   126: aload #15
    //   128: invokeinterface Zp : ()Ljava/lang/String;
    //   133: invokestatic Zv : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   136: aload_0
    //   137: aload_1
    //   138: aload_2
    //   139: aload_3
    //   140: aload #4
    //   142: aload #5
    //   144: invokestatic ZT : (Lburp/Zg1m;Lburp/Zmjm;Ljava/awt/Component;Ljava/lang/String;Ljavax/swing/filechooser/FileFilter;Lburp/Zlfc;)[Ljava/io/File;
    //   147: areturn
    //   148: iinc #13, 1
    //   151: iload #6
    //   153: ifeq -> 81
    //   156: aload #10
    //   158: iconst_0
    //   159: aaload
    //   160: invokevirtual getParent : ()Ljava/lang/String;
    //   163: aload_0
    //   164: invokestatic ZW : (Ljava/lang/String;Lburp/Zg1m;)V
    //   167: aload #10
    //   169: areturn
  }
  
  public static String Zc(String paramString1, String paramString2) {
    int i = paramString1.lastIndexOf(File.separator);
    String str = (paramString1.isEmpty() || i + 1 >= paramString1.length()) ? "" : paramString1.substring(i + 1);
    return (Zsw8.ZP(str) || str.matches(a(-17621, 24286))) ? paramString1 : (paramString1 + paramString1);
  }
  
  private static void lambda$promptUserForFiles$2(AtomicReference<Zrvv> paramAtomicReference, Component paramComponent, String paramString1, FileFilter paramFileFilter, String paramString2, Zlfc paramZlfc) {
    paramAtomicReference.set(Zx6o.Zp(paramComponent, paramString1, paramFileFilter, paramString2, null, paramZlfc));
  }
  
  private static void lambda$loadListFromFileB$1(long paramLong, File paramFile, Map<Integer, List<byte[]>> paramMap, int paramInt) {
    long l1 = paramInt * 2097152L;
    long l2 = Math.min(2097152L, paramLong - l1);
    try {
      FileChannel fileChannel = FileChannel.open(paramFile.toPath(), new OpenOption[] { StandardOpenOption.READ });
      try {
        MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, l1, l2);
        List<byte[]> list = Zj(mappedByteBuffer);
        paramMap.put(Integer.valueOf(paramInt), list);
        if (fileChannel != null)
          fileChannel.close(); 
      } catch (Throwable throwable) {
        if (fileChannel != null)
          try {
            fileChannel.close();
          } catch (Throwable throwable1) {
            throwable.addSuppressed(throwable1);
          }  
        throw throwable;
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
    } 
  }
  
  private static void lambda$promptUserForFile$0(Zrvv[] paramArrayOfZrvv, Component paramComponent, int paramInt, String paramString1, Zskm paramZskm, String paramString2, File paramFile, Zlfc paramZlfc, FileFilter paramFileFilter) {
    paramArrayOfZrvv[0] = Zx6o.ZM(paramComponent, (paramInt == 2) ? 1 : paramInt, paramString1, paramZskm, paramString2, paramFile, paramZlfc, paramFileFilter);
  }
  
  public static void ZU(int paramInt) {
    Zr = paramInt;
  }
  
  public static int Zj() {
    return Zr;
  }
  
  public static int Zd() {
    int i = Zj();
    return (i == 0) ? 79 : 0;
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
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'âskW ¦è¢pª;\\tÈaÍÊ<¹æ'ÕÂuoLVÎuñ¥6ñáTLæ#4§Ûj¡)²\\n!× Ãõ@ª'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: invokestatic ZU : (I)V
    //   21: bipush #7
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #14
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 145
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc '´ô ¤W4JñZ{f#ÿóº¦¹P·^»'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #16
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #109
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
    //   132: putstatic burp/Zs6n.a : [Ljava/lang/String;
    //   135: iconst_5
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zs6n.b : [Ljava/lang/String;
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
    //   161: if_icmpgt -> 262
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 245, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 240
    //   216: bipush #33
    //   218: goto -> 246
    //   221: bipush #53
    //   223: goto -> 246
    //   226: bipush #109
    //   228: goto -> 246
    //   231: bipush #126
    //   233: goto -> 246
    //   236: iconst_2
    //   237: goto -> 246
    //   240: bipush #52
    //   242: goto -> 246
    //   245: iconst_3
    //   246: ixor
    //   247: ixor
    //   248: i2c
    //   249: castore
    //   250: iinc #6, 1
    //   253: dup
    //   254: ifne -> 262
    //   257: dup2
    //   258: dup_x1
    //   259: goto -> 168
    //   262: dup2_x1
    //   263: pop2
    //   264: dup_x2
    //   265: iload #6
    //   267: if_icmpgt -> 164
    //   270: pop
    //   271: new java/lang/String
    //   274: dup_x1
    //   275: swap
    //   276: invokespecial <init> : ([C)V
    //   279: invokevirtual intern : ()Ljava/lang/String;
    //   282: swap
    //   283: pop
    //   284: swap
    //   285: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBB2B) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs6n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */