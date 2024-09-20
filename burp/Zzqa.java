package burp;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zzqa implements Closeable {
  private final FileStore ZW;
  
  private final File Zw;
  
  private final String Zd;
  
  private final long Zi;
  
  private final int ZQ;
  
  private final int Zj;
  
  private final Zlyr Zu;
  
  private final Zlrc ZR;
  
  private final Object ZB = new Object();
  
  private final List<Zsbh> ZZ = new ArrayList<>();
  
  private final Closeable ZD;
  
  private int Zo;
  
  private short Zp;
  
  private short ZX;
  
  private Zsbh Zt;
  
  private MappedByteBuffer Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static Zzqa ZM(Zrnb paramZrnb, File paramFile, long paramLong, int paramInt1, int paramInt2, int paramInt3, Zlrc paramZlrc, Zk9w paramZk9w) throws Zev3 {
    try {
      if (paramInt1 >= 72)
        try {
          if (paramInt2 >= paramInt1)
            try {
              if (paramLong >= paramInt1)
                try {
                  if (paramInt3 <= paramLong)
                    try {
                      Zzqa zzqa = new Zzqa(paramFile, paramLong, paramInt2, paramInt3, paramZk9w, paramZlrc);
                      zzqa.Zk(paramInt1, paramZrnb);
                      return zzqa;
                    } catch (Zkfw zkfw) {
                      Zah.Zl(zkfw, Zk_.IGNORED);
                      throw new Zev3(zkfw, a(-4172, -31466).formatted(new Object[] { paramFile.getAbsolutePath() }));
                    }  
                  throw new IllegalArgumentException();
                } catch (Zkfw zkfw) {
                  throw a(null);
                }  
            } catch (Zkfw zkfw) {
              throw a(null);
            }  
        } catch (Zkfw zkfw) {
          throw a(null);
        }  
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    throw new IllegalArgumentException();
  }
  
  static Zzqa Zg(Zrnb paramZrnb, File paramFile, int paramInt1, int paramInt2, int paramInt3, Zlrc paramZlrc, Zk9w paramZk9w) throws Zev3 {
    Zbix zbix = new Zbix(paramZrnb, paramFile, paramInt2, paramInt3, paramZlrc, paramZk9w);
    return Zx(paramFile, paramInt1, paramInt2, paramInt3, zbix, paramZlrc);
  }
  
  static Zzqa ZJ(File paramFile, int paramInt1, int paramInt2, int paramInt3) throws Zev3 {
    Zm8r zm8r = new Zm8r(paramFile, paramInt2, paramInt3);
    return Zx(paramFile, paramInt1, paramInt2, paramInt3, zm8r, Zlrc.Za);
  }
  
  private static Zzqa Zx(File paramFile, int paramInt1, int paramInt2, int paramInt3, Zggw paramZggw, Zlrc paramZlrc) throws Zev3 {
    // Byte code:
    //   0: invokestatic ZXP : ()[Lburp/Zbqc;
    //   3: astore #6
    //   5: iload_1
    //   6: bipush #72
    //   8: if_icmplt -> 23
    //   11: iload_2
    //   12: iload_1
    //   13: if_icmpge -> 35
    //   16: goto -> 23
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: new java/lang/IllegalArgumentException
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: athrow
    //   31: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: aload_0
    //   36: invokevirtual exists : ()Z
    //   39: ifne -> 54
    //   42: new java/io/FileNotFoundException
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: athrow
    //   50: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   53: athrow
    //   54: new java/io/RandomAccessFile
    //   57: dup
    //   58: aload_0
    //   59: sipush #-4174
    //   62: sipush #-2202
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   71: astore #7
    //   73: aload #7
    //   75: invokevirtual getChannel : ()Ljava/nio/channels/FileChannel;
    //   78: astore #8
    //   80: aload #8
    //   82: getstatic java/nio/channels/FileChannel$MapMode.READ_WRITE : Ljava/nio/channels/FileChannel$MapMode;
    //   85: lconst_0
    //   86: ldc2_w 72
    //   89: invokevirtual map : (Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   92: astore #9
    //   94: goto -> 140
    //   97: astore #10
    //   99: aload #10
    //   101: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   104: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   107: new burp/Zev3
    //   110: dup
    //   111: aload #10
    //   113: sipush #-4171
    //   116: sipush #9141
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: iconst_1
    //   123: anewarray java/lang/Object
    //   126: dup
    //   127: iconst_0
    //   128: aload_0
    //   129: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   132: aastore
    //   133: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   136: invokespecial <init> : (Ljava/lang/Exception;Ljava/lang/String;)V
    //   139: athrow
    //   140: aload #4
    //   142: aload #9
    //   144: invokeinterface Zj : (Ljava/nio/MappedByteBuffer;)Lburp/Zzt5;
    //   149: astore #10
    //   151: aload #10
    //   153: getfield ZW : Lburp/Zzqa;
    //   156: astore #11
    //   158: aconst_null
    //   159: astore #9
    //   161: iconst_0
    //   162: istore #12
    //   164: iload #12
    //   166: aload #10
    //   168: getfield Zj : I
    //   171: if_icmpge -> 286
    //   174: iload #12
    //   176: ifne -> 195
    //   179: aload_0
    //   180: astore #13
    //   182: aload #7
    //   184: astore #14
    //   186: aload #8
    //   188: astore #15
    //   190: aload #6
    //   192: ifnull -> 238
    //   195: new java/io/File
    //   198: dup
    //   199: aload #11
    //   201: iload #12
    //   203: invokevirtual ZN : (I)Ljava/lang/String;
    //   206: invokespecial <init> : (Ljava/lang/String;)V
    //   209: astore #13
    //   211: new java/io/RandomAccessFile
    //   214: dup
    //   215: aload #13
    //   217: sipush #-4174
    //   220: sipush #-2202
    //   223: invokestatic a : (II)Ljava/lang/String;
    //   226: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   229: astore #14
    //   231: aload #14
    //   233: invokevirtual getChannel : ()Ljava/nio/channels/FileChannel;
    //   236: astore #15
    //   238: aload #11
    //   240: aload #15
    //   242: aload #13
    //   244: aload #14
    //   246: aload #10
    //   248: getfield Zg : J
    //   251: iload_1
    //   252: iload_2
    //   253: iload_3
    //   254: aload #5
    //   256: invokestatic Zu : (Ljava/nio/channels/FileChannel;Ljava/io/File;Ljava/io/RandomAccessFile;JIIILburp/Zlrc;)Lburp/Zsbh;
    //   259: putfield Zt : Lburp/Zsbh;
    //   262: aload #11
    //   264: getfield ZZ : Ljava/util/List;
    //   267: aload #11
    //   269: getfield Zt : Lburp/Zsbh;
    //   272: invokeinterface add : (Ljava/lang/Object;)Z
    //   277: pop
    //   278: iinc #12, 1
    //   281: aload #6
    //   283: ifnull -> 164
    //   286: aload #11
    //   288: aload #11
    //   290: getfield ZZ : Ljava/util/List;
    //   293: invokeinterface getFirst : ()Ljava/lang/Object;
    //   298: checkcast burp/Zsbh
    //   301: invokevirtual Zf : ()Ljava/nio/MappedByteBuffer;
    //   304: putfield Za : Ljava/nio/MappedByteBuffer;
    //   307: aload #11
    //   309: getfield Za : Ljava/nio/MappedByteBuffer;
    //   312: bipush #16
    //   314: invokevirtual getInt : (I)I
    //   317: ifne -> 355
    //   320: aload #11
    //   322: getfield Za : Ljava/nio/MappedByteBuffer;
    //   325: bipush #16
    //   327: new burp/Zlyr
    //   330: dup
    //   331: new java/security/SecureRandom
    //   334: dup
    //   335: invokespecial <init> : ()V
    //   338: invokespecial <init> : (Ljava/security/SecureRandom;)V
    //   341: invokevirtual ZE : ()I
    //   344: invokevirtual putInt : (II)Ljava/nio/ByteBuffer;
    //   347: pop
    //   348: goto -> 355
    //   351: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   354: athrow
    //   355: aload #11
    //   357: areturn
    //   358: astore #10
    //   360: aload #10
    //   362: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   365: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   368: new burp/Zev3
    //   371: dup
    //   372: aload #10
    //   374: sipush #-4169
    //   377: sipush #21600
    //   380: invokestatic a : (II)Ljava/lang/String;
    //   383: iconst_1
    //   384: anewarray java/lang/Object
    //   387: dup
    //   388: iconst_0
    //   389: aload_0
    //   390: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   393: aastore
    //   394: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   397: invokespecial <init> : (Ljava/lang/Exception;Ljava/lang/String;)V
    //   400: athrow
    // Exception table:
    //   from	to	target	type
    //   5	16	19	java/io/IOException
    //   11	31	31	java/io/IOException
    //   35	50	50	java/io/IOException
    //   35	94	97	java/io/IOException
    //   140	357	358	java/io/IOException
    //   286	348	351	java/io/IOException
  }
  
  private void Zk(int paramInt, Zrnb paramZrnb) throws Zev3 {
    this.Zt = Zh(this.Zw, paramInt);
    this.Za = this.Zt.Zf();
    this.Za.putInt(0, paramZrnb.ZG);
    this.Za.putInt(4, paramZrnb.ZK);
    this.Za.putInt(8, paramZrnb.ZF);
    this.Za.putShort(14, paramZrnb.ZD);
    this.Za.putInt(16, this.Zu.ZE());
    this.Za.putShort(12, paramZrnb.ZU);
    this.Za.putLong(48, this.Zi);
    this.Za.putLong(56, 72L);
    this.Zo = paramZrnb.ZK;
    this.Zp = paramZrnb.ZD;
    this.ZX = paramZrnb.ZU;
  }
  
  void ZK(MappedByteBuffer paramMappedByteBuffer, Zrnb paramZrnb) {
    try {
      this.Zo = paramMappedByteBuffer.getInt(4);
      this.Zp = paramMappedByteBuffer.getShort(14);
      this.ZX = paramMappedByteBuffer.getShort(12);
      if (this.ZX == 0)
        this.ZX = this.Zp; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    ZO(paramMappedByteBuffer, paramZrnb);
  }
  
  private void ZO(MappedByteBuffer paramMappedByteBuffer, Zrnb paramZrnb) {
    try {
      if (this.Zp < paramZrnb.ZD) {
        paramMappedByteBuffer.putShort(14, paramZrnb.ZD);
        paramMappedByteBuffer.putShort(12, paramZrnb.ZU);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  Zzqa(File paramFile, long paramLong, int paramInt1, int paramInt2, Zk9w paramZk9w, Zlrc paramZlrc) {
    this.Zw = paramFile;
    this.Zd = paramFile.getAbsolutePath();
    this.Zi = paramLong;
    this.ZQ = paramInt1;
    this.Zj = paramInt2;
    this.ZR = paramZlrc;
    this.ZD = paramZk9w.Zv(this);
    FileStore fileStore = null;
    try {
      fileStore = Files.getFileStore(paramFile.toPath().getParent().normalize());
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    this.ZW = fileStore;
    this.Zu = new Zlyr(new SecureRandom());
  }
  
  FileStore Zw() {
    return this.ZW;
  }
  
  public File Zy() {
    return this.Zw;
  }
  
  public String Ze() {
    return this.Zd;
  }
  
  int Zr() {
    return this.Zo;
  }
  
  short Zs() {
    return this.Zp;
  }
  
  int Zn() {
    return this.ZX;
  }
  
  int ZJ() {
    return this.Za.getInt(16);
  }
  
  public void close() {
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    try {
      this.ZD.close();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
    } 
    synchronized (this.ZB) {
      for (Zsbh zsbh : this.ZZ) {
        zsbh.Zb();
        if (arrayOfZbqc != null)
          break; 
      } 
    } 
  }
  
  public long Zk(int paramInt) throws Zl4t {
    try {
      if (paramInt > this.Zj)
        throw new IllegalArgumentException(String.format(a(-4173, -1205), new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.Zj) })); 
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    synchronized (this.ZB) {
      long l1 = this.Za.getLong(56);
      if (l1 % 2L == 1L)
        l1++; 
      long l2 = l1 + paramInt;
      if (l2 > this.Zi * this.ZZ.size()) {
        String str = ZN(this.ZZ.size());
        File file = new File(str);
        try {
          this.Zt = Zh(file, this.ZQ);
        } catch (Zev3 zev3) {
          Zah.Zl(zev3, Zk_.IGNORED);
          throw new Zl4t(zev3.getMessage());
        } 
        l1 = l2 / this.Zi * this.Zi;
        l2 = l1 + paramInt;
      } 
      this.Zt.ZA(ZY(l1), paramInt);
      this.Za.putLong(56, l2);
      return l1;
    } 
  }
  
  boolean Za() {
    try {
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      return !this.Zt.ZP(ZO());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      return true;
    } 
  }
  
  long ZO() {
    synchronized (this.ZB) {
      return this.Za.getLong(56);
    } 
  }
  
  private String ZN(int paramInt) {
    return String.format(a(-4176, 2557), new Object[] { this.Zd, Integer.valueOf(paramInt) });
  }
  
  private Zsbh Zh(File paramFile, int paramInt) throws Zev3 {
    try {
      try {
        if (paramFile.exists())
          throw new IOException(a(-4170, 12757) + a(-4170, 12757)); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      RandomAccessFile randomAccessFile = new RandomAccessFile(paramFile, a(-4175, 22003));
      FileChannel fileChannel = randomAccessFile.getChannel();
      Zsbh zsbh = Zsbh.Zo(fileChannel, paramFile, randomAccessFile, this.Zi, paramInt, this.ZQ, this.Zj, this.ZR);
      this.ZZ.add(zsbh);
      return zsbh;
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
      throw new Zkfw(iOException);
    } 
  }
  
  private Zsbh ZZ(long paramLong) {
    return this.ZZ.get((int)(paramLong / this.Zi));
  }
  
  private long ZY(long paramLong) {
    return paramLong % this.Zi;
  }
  
  void Zf(long paramLong, boolean paramBoolean) {
    ZZ(paramLong).ZM(ZY(paramLong), paramBoolean);
  }
  
  boolean Zv(long paramLong) {
    return ZZ(paramLong).Zj(ZY(paramLong));
  }
  
  void ZO(long paramLong, byte paramByte) {
    ZZ(paramLong).Zb(ZY(paramLong), paramByte);
  }
  
  byte Zk(long paramLong) {
    return ZZ(paramLong).ZW(ZY(paramLong));
  }
  
  void ZY(long paramLong, char paramChar) {
    ZZ(paramLong).ZI(ZY(paramLong), paramChar);
  }
  
  char ZF(long paramLong) {
    return ZZ(paramLong).Ze(ZY(paramLong));
  }
  
  void Zx(long paramLong, short paramShort) {
    ZZ(paramLong).Zj(ZY(paramLong), paramShort);
  }
  
  short ZB(long paramLong) {
    return ZZ(paramLong).Zw(ZY(paramLong));
  }
  
  void ZG(long paramLong, int paramInt) {
    ZZ(paramLong).Zq(ZY(paramLong), paramInt);
  }
  
  int ZO(long paramLong) {
    return ZZ(paramLong).ZY(ZY(paramLong));
  }
  
  void Z_(long paramLong1, long paramLong2) {
    ZZ(paramLong1).ZD(ZY(paramLong1), paramLong2);
  }
  
  long ZT(long paramLong) {
    return ZZ(paramLong).Zd(ZY(paramLong));
  }
  
  void Za(long paramLong, float paramFloat) {
    ZZ(paramLong).Zk(ZY(paramLong), paramFloat);
  }
  
  float Zr(long paramLong) {
    return ZZ(paramLong).ZI(ZY(paramLong));
  }
  
  void Zs(long paramLong, double paramDouble) {
    ZZ(paramLong).Zl(ZY(paramLong), paramDouble);
  }
  
  double Zi(long paramLong) {
    return ZZ(paramLong).ZA(ZY(paramLong));
  }
  
  Zso4 ZW(long paramLong, int paramInt) {
    return ZZ(paramLong).ZF(ZY(paramLong), paramInt);
  }
  
  void Zf() {
    // Byte code:
    //   0: invokestatic ZXP : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: getfield ZB : Ljava/lang/Object;
    //   7: dup
    //   8: astore_3
    //   9: monitorenter
    //   10: astore_1
    //   11: new java/util/ArrayList
    //   14: dup
    //   15: aload_0
    //   16: getfield ZZ : Ljava/util/List;
    //   19: invokespecial <init> : (Ljava/util/Collection;)V
    //   22: astore_2
    //   23: aload_3
    //   24: monitorexit
    //   25: goto -> 35
    //   28: astore #4
    //   30: aload_3
    //   31: monitorexit
    //   32: aload #4
    //   34: athrow
    //   35: aload_2
    //   36: invokeinterface iterator : ()Ljava/util/Iterator;
    //   41: astore_3
    //   42: aload_3
    //   43: invokeinterface hasNext : ()Z
    //   48: ifeq -> 71
    //   51: aload_3
    //   52: invokeinterface next : ()Ljava/lang/Object;
    //   57: checkcast burp/Zsbh
    //   60: astore #4
    //   62: aload #4
    //   64: invokevirtual Zn : ()V
    //   67: aload_1
    //   68: ifnull -> 42
    //   71: return
    // Exception table:
    //   from	to	target	type
    //   11	25	28	finally
    //   28	32	28	finally
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Fäñs´´Ìûtº4³íò ðxÃòç5²¹yíuÐCßüc£\\f^Fß\\bÎ´Ò`ß,6ußÁ®9Èº4AÝóZÞ×âÖxbý+PÆü'µ#¢¤aêA\\n [ÌR#þ3}=>ÿa'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #25
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #114
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc ' $Ì¨°Ñê±tÙKêZjý5nÝã¬g#m\\rtõ ã g¥'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_2
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #120
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zzqa.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zzqa.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #27
    //   214: goto -> 244
    //   217: bipush #34
    //   219: goto -> 244
    //   222: bipush #56
    //   224: goto -> 244
    //   227: bipush #121
    //   229: goto -> 244
    //   232: bipush #14
    //   234: goto -> 244
    //   237: bipush #8
    //   239: goto -> 244
    //   242: bipush #33
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEFB4) & 0xFFFF;
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
      char c = 'á';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzqa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */