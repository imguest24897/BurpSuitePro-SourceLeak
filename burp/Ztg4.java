package burp;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.Zvh;
import net.portswigger.Zze;

public class Ztg4 {
  private final Set<Integer> Zz = new HashSet<>();
  
  private final Zxei ZA;
  
  private final Zl0 Za;
  
  private final Zskh ZN;
  
  private final File ZH;
  
  private final AtomicInteger Zu;
  
  private final Zsxe ZQ;
  
  private boolean Zr;
  
  private boolean Zm = false;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Ztg4 ZI(Zxei paramZxei, Zl0 paramZl0, Zskh paramZskh) {
    try {
      return new Ztg4(paramZxei, paramZl0, paramZskh);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      Zmgc.TEMP_DIR_CREATION_FAILURE.ZV(paramZskh, new Object[0]);
      return null;
    } 
  }
  
  private Ztg4(Zxei paramZxei, Zl0 paramZl0, Zskh paramZskh) throws IOException {
    Zuh.Zb((paramZskh != null), Zqf.Zv);
    this.ZA = paramZxei;
    this.Za = paramZl0;
    this.ZN = paramZskh;
    this.ZQ = new Zsxe(paramZskh);
    this.Zu = new AtomicInteger();
    this.ZH = (new Zrge(paramZl0, paramZxei.Zc())).Z_();
    ZJ();
  }
  
  public String ZW(Zb_j paramZb_j) {
    int i = Zs6n.Zj();
    synchronized (this) {
      if (this.Zr)
        return null; 
      String str = null;
      try {
        byte b = 0;
        while (b < this.Zu.get()) {
          ZF(b);
          b++;
          if (i != 0)
            break; 
        } 
        String str1 = this.ZH.getCanonicalPath();
        try {
          if (!this.ZH.delete())
            str = Zmgc.TEMP_DIR_DELETION_FAILURE.ZV(this.ZN, new Object[] { str1 }); 
        } catch (Exception exception) {
          throw a(null);
        } 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
        str = Zmgc.TEMP_DIR_DELETION_FAILURE.ZV(this.ZN, new Object[] { this.ZH });
      } 
      try {
        if (str != null && paramZb_j != null) {
          Ztyx ztyx = new Ztyx(a(-21109, -24220), paramZb_j);
          List<String> list = ztyx.Zb();
          try {
            list.add(this.ZH.getCanonicalPath());
            ztyx.ZS(list);
          } catch (IOException iOException) {
            Zah.Zl(iOException, Zk_.IGNORED);
          } 
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      this.Zr = true;
      return str;
    } 
  }
  
  public File Zr() {
    return ZX(this.Zu.getAndIncrement());
  }
  
  public int Zp(byte[] paramArrayOfbyte) {
    try {
      if (!this.Zr)
        try {
          if (paramArrayOfbyte != null) {
            OutputStream outputStream = null;
            int i = -1;
            try {
              i = this.Zu.getAndIncrement();
              File file = ZX(i);
              outputStream = this.Za.Zp(file);
              Zze.Zd(file);
              outputStream.write(paramArrayOfbyte);
              outputStream.flush();
            } catch (Exception exception) {
              Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
              try {
                this.ZN.Zl(Zkqn.ERROR, a(-21107, 9600) + a(-21107, 9600));
              } catch (Exception exception1) {
                Zah.Zl(exception1, Zk_.IGNORED);
              } 
              ZA(i);
              i = -1;
            } finally {
              try {
                outputStream.close();
              } catch (Exception exception) {
                Zah.Zl(exception, Zk_.IGNORED);
              } 
            } 
            return i;
          } 
          return -1;
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    return -1;
  }
  
  public File ZX(File paramFile) {
    int i = Zs6n.Zj();
    try {
      InputStream inputStream = this.Za.ZO(paramFile);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte[4096];
      int j;
      while ((j = inputStream.read(arrayOfByte, 0, 4096)) != -1) {
        byteArrayOutputStream.write(arrayOfByte, 0, j);
        if (i != 0)
          break; 
      } 
      inputStream.close();
      int k = Zp(byteArrayOutputStream.toByteArray());
      return ZX(k);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return paramFile;
  }
  
  public File ZX(int paramInt) {
    return this.Za.Zh(this.ZH, Integer.toString(paramInt));
  }
  
  public List<File> Zn() {
    ArrayList<File> arrayList = new ArrayList();
    byte b = 0;
    int i = Zs6n.Zj();
    while (b < this.Zu.get()) {
      arrayList.add(this.Za.Zh(this.ZH, Integer.toString(b)));
      b++;
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
  
  public File ZH() {
    return this.ZH;
  }
  
  private void ZF(int paramInt) {
    if (this.Zr || paramInt < 0)
      return; 
    File file = ZX(paramInt);
    if (!file.exists())
      return; 
    if (file.delete());
  }
  
  public byte[] ZW(int paramInt) {
    int i = Zs6n.Zj();
    try {
      if (!this.Zr)
        try {
          if (paramInt >= 0) {
            Zxtp zxtp;
            InputStream inputStream = null;
            int j = (int)Zu(paramInt);
            if (j <= 0)
              j = 1024; 
            try {
              zxtp = this.ZQ.Ze(j);
            } catch (OutOfMemoryError outOfMemoryError) {
              Zah.Zl(outOfMemoryError, Zk_.COMMON_RUNTIME_FAILURE);
              Ztyh.ZR(this.ZN);
              zxtp = this.ZQ.Ze(j);
            } 
            try {
              File file = ZX(paramInt);
              try {
                if (!file.exists())
                  throw new Exception(); 
              } catch (IOException iOException) {
                throw a(null);
              } 
              inputStream = this.Za.ZO(file);
              byte[] arrayOfByte = new byte[4096];
              int k;
              while ((k = inputStream.read(arrayOfByte, 0, 4096)) != -1) {
                zxtp.write(arrayOfByte, 0, k);
                if (i != 0)
                  break; 
              } 
            } catch (Exception exception) {
              Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
              try {
                this.ZN.Zl(Zkqn.ERROR, a(-21115, 11500) + a(-21115, 11500));
              } catch (Exception exception1) {
                Zah.Zl(exception1, Zk_.IGNORED);
              } 
              ZA(paramInt);
              return null;
            } finally {
              try {
                inputStream.close();
              } catch (Exception exception) {
                Zah.Zl(exception, Zk_.IGNORED);
              } 
            } 
            return zxtp.toByteArray();
          } 
          try {
            this.ZN.Zl(Zkqn.ERROR, a(-21116, -2629) + a(-21116, -2629));
          } catch (IOException iOException) {
            Zah.Zl(iOException, Zk_.IGNORED);
          } 
        } catch (OutOfMemoryError outOfMemoryError) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.ZN.Zl(Zkqn.ERROR, a(-21116, -2629) + a(-21116, -2629));
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
  
  public InputStream Zo(int paramInt) {
    try {
      if (this.Zr || paramInt < 0) {
        try {
          this.ZN.Zl(Zkqn.ERROR, a(-21113, 19366) + a(-21113, 19366));
        } catch (IOException iOException) {
          Zah.Zl(iOException, Zk_.IGNORED);
        } 
        ZA(paramInt);
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      File file = ZX(paramInt);
      try {
        if (!file.exists())
          throw new Exception(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return this.Za.ZO(file);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      try {
        this.ZN.Zl(Zkqn.ERROR, a(-21114, -15590) + a(-21114, -15590));
      } catch (Exception exception1) {
        Zah.Zl(exception1, Zk_.IGNORED);
      } 
      ZA(paramInt);
      return null;
    } 
  }
  
  public OutputStream Zr(int paramInt) {
    try {
      if (this.Zr || paramInt < 0) {
        try {
          this.ZN.Zl(Zkqn.ERROR, a(-21108, 8306) + a(-21108, 8306));
        } catch (IOException iOException) {
          Zah.Zl(iOException, Zk_.IGNORED);
        } 
        ZA(paramInt);
        return Zx_f.Zw;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      File file = ZX(paramInt);
      try {
        if (!file.exists())
          throw new Exception(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return this.Za.Zp(file);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      try {
        this.ZN.Zl(Zkqn.ERROR, a(-21107, 9600) + a(-21107, 9600));
      } catch (Exception exception1) {
        Zah.Zl(exception1, Zk_.IGNORED);
      } 
      ZA(paramInt);
      return Zx_f.Zw;
    } 
  }
  
  private long Zu(int paramInt) {
    try {
      if (this.Zr || paramInt < 0) {
        try {
          this.ZN.Zl(Zkqn.ERROR, a(-21116, -2629) + a(-21116, -2629));
        } catch (IOException iOException) {
          Zah.Zl(iOException, Zk_.IGNORED);
        } 
        ZA(paramInt);
        return 0L;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      File file = ZX(paramInt);
      return !file.exists() ? 0L : file.length();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      try {
        this.ZN.Zl(Zkqn.ERROR, a(-21116, -2629) + a(-21116, -2629));
      } catch (Exception exception1) {
        Zah.Zl(exception1, Zk_.IGNORED);
      } 
      ZA(paramInt);
      return 0L;
    } 
  }
  
  private void ZJ() {
    int i = Calendar.getInstance().get(11);
    int j = (24 - i) * 60 * 60 * 1000;
    this.ZA.Zg(j, 86400000L, this::lambda$scheduleTaskToRefreshTimestamps$0);
  }
  
  private void ZA(int paramInt) {
    try {
      if (this.Zm)
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      try {
        this.Zz.add(Integer.valueOf(paramInt));
        if (this.ZH.exists())
          try {
            if (this.ZH.canRead())
              try {
                if (this.ZH.canWrite() && this.Zz.size() < 10)
                  return; 
              } catch (Exception exception) {
                throw a(null);
              }  
          } catch (Exception exception) {
            throw a(null);
          }  
      } catch (Exception exception) {
        throw a(null);
      } 
      if (this.Zm)
        return; 
      this.Zm = true;
      ZF();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZF() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZH : Ljava/io/File;
    //   4: invokevirtual getCanonicalPath : ()Ljava/lang/String;
    //   7: astore_1
    //   8: aload_0
    //   9: getfield ZA : Lburp/Zxei;
    //   12: aload_0
    //   13: aload_1
    //   14: <illegal opcode> run : (Lburp/Ztg4;Ljava/lang/String;)Ljava/lang/Runnable;
    //   19: invokeinterface ZY : (Ljava/lang/Runnable;)V
    //   24: return
  }
  
  private void lambda$showMissingTempDirectoryWarning$1(String paramString) {
    String str1 = Zvh.ZU.ZG() ? a(-21112, -24041) : "";
    String str2 = Zlb0.Zp;
    String str3 = Zlb0.Zp;
    String str4 = Zlb0.Zp;
    String str5 = Zlb0.Zp;
    String str6 = paramString;
    String str7 = Zlb0.Zp;
    String str8 = Zlb0.Zp;
    Zx6o.Zv(this.ZA.ZF(), a(-21106, -19967), a(-21105, 27586) + a(-21105, 27586) + str8 + str7 + str6 + str5 + str4 + a(-21111, 27043) + str3 + str2 + str1);
  }
  
  private void lambda$scheduleTaskToRefreshTimestamps$0() {
    int i = Zs6n.Zj();
    File[] arrayOfFile1 = this.ZH.listFiles();
    try {
      if (arrayOfFile1 == null)
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    File[] arrayOfFile2 = arrayOfFile1;
    int j = arrayOfFile2.length;
    byte b = 0;
    while (b < j) {
      File file = arrayOfFile2[b];
      try {
        file.setLastModified(this.ZA.Zi().ZP().ZX());
        InputStream inputStream = this.Za.ZO(file);
        inputStream.read();
        inputStream.close();
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.IGNORED);
      } 
      b++;
      if (i != 0)
        break; 
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'rØËÊÈ£sK9tì®Ç1»jOp-¼ÿqo¦e«þÐÎï ø)1®öCu¹Íç¾¦Ò­\\t\\n´r2ªL!àãFXÛ"%U0m8NevP²@)Çâ«©Ý`.ò± ´I$³×\2CLá8QN.ÖÃî¬[^T®cbÁäôÓ$]÷?xªÏÝ4@w´âyíY¸4 ëÆóô« IO[UczÌ»BºìºpSe`Ä¨eGß=£\\bFlÝî»¢%ñµªqk×!Wìp»1°|-ZYg·ÞÛpUWRPÑY4¯_ÚçIWîá°yJ-a^q:\\r,ñJá0IÐúí¶ú­#ù¯ÍEq-'VóIGrë]ü\\tî¡.*@¨·ýÚcÚ6SäÄèÀ ÁÈô"¨ñF;3¤ÖØÄ¦Ö»0&ñ÷ÏåP\æCEq|b}³+¬\WOËú¡üæõ\:}U:H\\bK{¨ÔÚ¸Ý=ZÀ 8KAùÎØõö3z\\fSyÆ¤\\tûëO½¾·ÄÏ±WRÌµUAKÜÞ \\bfä-q1ÆÞ>wFìïY8~¸&1Zq$¨Ü'\\f<ýæÛÃ¾¿O0ê¡[W+¶¾AkùÙÒ¸³t&÷\: $»¿:X£æ¯±¡3Dè¶qsCærðxÀ»õÞ\:èd£.þQí¨XÖGo3{'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #41
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #97
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
    //   68: ldc '<)òú:ÁjÑG·°Ä´õ2Ú?L\X+îCÁ2_[JgÏCeÝ!ÕbâÇWpÀ|òq/oÓ9ÛcKz'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #30
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #37
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
    //   129: putstatic burp/Ztg4.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztg4.b : [Ljava/lang/String;
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
    //   212: bipush #43
    //   214: goto -> 244
    //   217: bipush #94
    //   219: goto -> 244
    //   222: bipush #103
    //   224: goto -> 244
    //   227: bipush #67
    //   229: goto -> 244
    //   232: bipush #68
    //   234: goto -> 244
    //   237: bipush #86
    //   239: goto -> 244
    //   242: bipush #63
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
    int i = (paramInt1 ^ 0xFFFFAD8C) & 0xFFFF;
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
      byte b1 = 56;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztg4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */