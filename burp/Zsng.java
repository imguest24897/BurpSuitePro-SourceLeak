package burp;

import java.io.File;
import net.portswigger.Zl0;

class Zsng {
  void Zp(Zkit paramZkit, Zk8l paramZk8l, Ztg4 paramZtg4, Zl0 paramZl0, String paramString) {
    File file = Zp(paramZkit, paramZl0);
    System.out.println(Zrgs.AUTO_REPAIRING_TO_FILE.ZN(new Object[] { file.getAbsolutePath() }));
    Zw(paramZkit, paramZk8l, paramZtg4, file, file.getName(), paramString);
  }
  
  private File Zp(Zkit paramZkit, Zl0 paramZl0) {
    return paramZl0.Zg(Zg1o.ZC(paramZkit.Zd()));
  }
  
  private void Zw(Zkit paramZkit, Zk8l paramZk8l, Ztg4 paramZtg4, File paramFile, String paramString1, String paramString2) {
    // Byte code:
    //   0: invokestatic ZL : ()I
    //   3: istore #7
    //   5: aconst_null
    //   6: astore #8
    //   8: aload_1
    //   9: aload_3
    //   10: invokestatic Zh : (Lburp/Zr_4;Lburp/Ztg4;)Lburp/Zlu6;
    //   13: astore #8
    //   15: aload_2
    //   16: aload_1
    //   17: aload #4
    //   19: aload #8
    //   21: aload #5
    //   23: aload #6
    //   25: invokevirtual ZX : (Lburp/Zr_4;Ljava/io/File;Lburp/Zlu6;Ljava/lang/String;Ljava/lang/String;)V
    //   28: aload #8
    //   30: invokevirtual Zj : ()Z
    //   33: ifeq -> 64
    //   36: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   39: getstatic burp/Zrgs.REPAIR_INCOMPLETE : Lburp/Zrgs;
    //   42: iconst_0
    //   43: anewarray java/lang/Object
    //   46: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   49: invokevirtual println : (Ljava/lang/String;)V
    //   52: iload #7
    //   54: ifeq -> 87
    //   57: goto -> 64
    //   60: invokestatic a : (Lburp/Zev3;)Lburp/Zev3;
    //   63: athrow
    //   64: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   67: getstatic burp/Zrgs.REPAIR_COMPLETED : Lburp/Zrgs;
    //   70: iconst_0
    //   71: anewarray java/lang/Object
    //   74: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   77: invokevirtual println : (Ljava/lang/String;)V
    //   80: goto -> 87
    //   83: invokestatic a : (Lburp/Zev3;)Lburp/Zev3;
    //   86: athrow
    //   87: aload #8
    //   89: ifnull -> 272
    //   92: aload #8
    //   94: invokevirtual Zn : ()V
    //   97: goto -> 272
    //   100: invokestatic a : (Lburp/Zev3;)Lburp/Zev3;
    //   103: athrow
    //   104: astore #9
    //   106: aload #9
    //   108: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   111: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   114: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   117: getstatic burp/Zrgs.REPAIR_FAILED : Lburp/Zrgs;
    //   120: iconst_1
    //   121: anewarray java/lang/Object
    //   124: dup
    //   125: iconst_0
    //   126: aload #9
    //   128: invokevirtual getMessage : ()Ljava/lang/String;
    //   131: aastore
    //   132: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   135: invokevirtual println : (Ljava/lang/String;)V
    //   138: aload #8
    //   140: ifnull -> 272
    //   143: aload #8
    //   145: invokevirtual Zn : ()V
    //   148: goto -> 272
    //   151: astore #9
    //   153: aload #9
    //   155: aload #9
    //   157: invokevirtual ZN : ()Z
    //   160: ifeq -> 173
    //   163: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   166: goto -> 176
    //   169: invokestatic a : (Lburp/Zev3;)Lburp/Zev3;
    //   172: athrow
    //   173: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   176: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   179: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   182: aload #9
    //   184: invokevirtual getMessage : ()Ljava/lang/String;
    //   187: invokevirtual println : (Ljava/lang/String;)V
    //   190: aload #8
    //   192: ifnull -> 272
    //   195: aload #8
    //   197: invokevirtual Zn : ()V
    //   200: goto -> 272
    //   203: astore #9
    //   205: aload #9
    //   207: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   210: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   213: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   216: getstatic burp/Zrgs.REPAIR_FAILED : Lburp/Zrgs;
    //   219: iconst_1
    //   220: anewarray java/lang/Object
    //   223: dup
    //   224: iconst_0
    //   225: aload #9
    //   227: invokevirtual toString : ()Ljava/lang/String;
    //   230: aastore
    //   231: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   234: invokevirtual println : (Ljava/lang/String;)V
    //   237: aload #8
    //   239: ifnull -> 272
    //   242: aload #8
    //   244: invokevirtual Zn : ()V
    //   247: goto -> 272
    //   250: astore #10
    //   252: aload #8
    //   254: ifnull -> 269
    //   257: aload #8
    //   259: invokevirtual Zn : ()V
    //   262: goto -> 269
    //   265: invokestatic a : (Lburp/Zev3;)Lburp/Zev3;
    //   268: athrow
    //   269: aload #10
    //   271: athrow
    //   272: return
    // Exception table:
    //   from	to	target	type
    //   8	87	104	burp/Zev3
    //   8	87	151	burp/Ztgq
    //   8	87	203	java/lang/Throwable
    //   8	87	250	finally
    //   15	57	60	burp/Zev3
    //   36	80	83	burp/Zev3
    //   87	100	100	burp/Zev3
    //   104	138	250	finally
    //   151	190	250	finally
    //   153	169	169	burp/Zev3
    //   203	237	250	finally
    //   250	252	250	finally
    //   252	262	265	burp/Zev3
  }
  
  private static Zev3 a(Zev3 paramZev3) {
    return paramZev3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsng.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */