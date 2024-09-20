package burp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class Zteh {
  private final Zz0n ZY;
  
  private final Zee5 Zr;
  
  private final Zskh ZR;
  
  private final Ztg4 Zw;
  
  private final Zrn7 ZJ;
  
  private static final String a;
  
  Zteh(Zz0n paramZz0n, Zee5 paramZee5, Zskh paramZskh, Ztg4 paramZtg4, Zrn7 paramZrn7) {
    this.ZY = paramZz0n;
    this.Zr = paramZee5;
    this.ZR = paramZskh;
    this.Zw = paramZtg4;
    this.ZJ = paramZrn7;
  }
  
  URL[] Zv(File paramFile, Zeu1 paramZeu1) throws MalformedURLException {
    ArrayList<URL> arrayList = new ArrayList();
    try {
      if (paramFile != null)
        arrayList.add(paramFile.toURI().toURL()); 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    File file = ZX(paramZeu1);
    try {
      if (file != null)
        try {
          if (file.isDirectory())
            ZY(file, arrayList, paramZeu1.ZR()); 
        } catch (MalformedURLException malformedURLException) {
          throw a(null);
        }  
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    URL[] arrayOfURL = new URL[arrayList.size()];
    arrayList.toArray(arrayOfURL);
    return arrayOfURL;
  }
  
  private void ZY(File paramFile, List<URL> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_1
    //   6: invokevirtual listFiles : ()[Ljava/io/File;
    //   9: astore #5
    //   11: aload #5
    //   13: ifnonnull -> 17
    //   16: return
    //   17: aload #5
    //   19: astore #6
    //   21: aload #6
    //   23: arraylength
    //   24: istore #7
    //   26: iconst_0
    //   27: istore #8
    //   29: iload #8
    //   31: iload #7
    //   33: if_icmpge -> 137
    //   36: aload #6
    //   38: iload #8
    //   40: aaload
    //   41: astore #9
    //   43: aload #9
    //   45: invokevirtual isFile : ()Z
    //   48: ifeq -> 114
    //   51: aload #9
    //   53: invokevirtual getName : ()Ljava/lang/String;
    //   56: astore #10
    //   58: aload #10
    //   60: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   63: getstatic burp/Zteh.a : Ljava/lang/String;
    //   66: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   69: ifeq -> 109
    //   72: iload_3
    //   73: ifeq -> 94
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload_0
    //   84: getfield Zw : Lburp/Ztg4;
    //   87: aload #9
    //   89: invokevirtual ZX : (Ljava/io/File;)Ljava/io/File;
    //   92: astore #9
    //   94: aload_2
    //   95: aload #9
    //   97: invokevirtual toURI : ()Ljava/net/URI;
    //   100: invokevirtual toURL : ()Ljava/net/URL;
    //   103: invokeinterface add : (Ljava/lang/Object;)Z
    //   108: pop
    //   109: aload #4
    //   111: ifnonnull -> 129
    //   114: aload_0
    //   115: aload #9
    //   117: aload_2
    //   118: iload_3
    //   119: invokevirtual ZY : (Ljava/io/File;Ljava/util/List;Z)V
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: iinc #8, 1
    //   132: aload #4
    //   134: ifnonnull -> 29
    //   137: goto -> 150
    //   140: astore #5
    //   142: aload #5
    //   144: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   147: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   150: return
    // Exception table:
    //   from	to	target	type
    //   5	16	140	java/lang/Exception
    //   17	137	140	java/lang/Exception
    //   58	76	79	java/lang/Exception
    //   109	122	125	java/lang/Exception
  }
  
  private File ZX(Zeu1 paramZeu1) {
    return paramZeu1.ZR() ? this.Zr.Zq(paramZeu1.ZE()) : Zu();
  }
  
  private File Zu() {
    if (!this.ZJ.ZB())
      return null; 
    File file = this.ZY.ZM().Zg(this.ZJ.ZJ());
    if (!file.exists() || !file.isDirectory()) {
      Zmgc.UNABLE_TO_FIND_LIB_JAR.ZV(this.ZR, new Object[0]);
      return null;
    } 
    return file;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #58
    //   2: ldc 'aUB'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zteh.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #117
    //   82: goto -> 112
    //   85: bipush #67
    //   87: goto -> 112
    //   90: bipush #14
    //   92: goto -> 112
    //   95: bipush #10
    //   97: goto -> 112
    //   100: bipush #107
    //   102: goto -> 112
    //   105: bipush #70
    //   107: goto -> 112
    //   110: bipush #67
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zteh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */