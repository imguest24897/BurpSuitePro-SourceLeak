package burp;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;

public class Zb0h {
  private final Clipboard ZG = Toolkit.getDefaultToolkit().getSystemClipboard();
  
  private final Clipboard ZJ = Toolkit.getDefaultToolkit().getSystemSelection();
  
  private static final String a;
  
  public void ZR(String paramString) {
    StringSelection stringSelection = new StringSelection(paramString);
    this.ZG.setContents(stringSelection, null);
    if (this.ZJ != null)
      this.ZJ.setContents(stringSelection, null); 
  }
  
  public void Zt(String paramString) {
    Zkz zkz = new Zkz(paramString);
    this.ZG.setContents(zkz, null);
    if (this.ZJ != null)
      this.ZJ.setContents(zkz, null); 
  }
  
  public String Zp() {
    return ZE(false);
  }
  
  public String ZE(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZK : ()[I
    //   3: astore_2
    //   4: iload_1
    //   5: ifeq -> 35
    //   8: aload_0
    //   9: getfield ZJ : Ljava/awt/datatransfer/Clipboard;
    //   12: ifnull -> 35
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
    //   21: athrow
    //   22: aload_0
    //   23: getfield ZJ : Ljava/awt/datatransfer/Clipboard;
    //   26: aconst_null
    //   27: invokevirtual getContents : (Ljava/lang/Object;)Ljava/awt/datatransfer/Transferable;
    //   30: astore_3
    //   31: aload_2
    //   32: ifnonnull -> 44
    //   35: aload_0
    //   36: getfield ZG : Ljava/awt/datatransfer/Clipboard;
    //   39: aconst_null
    //   40: invokevirtual getContents : (Ljava/lang/Object;)Ljava/awt/datatransfer/Transferable;
    //   43: astore_3
    //   44: aload_3
    //   45: ifnonnull -> 50
    //   48: aconst_null
    //   49: areturn
    //   50: aconst_null
    //   51: astore #4
    //   53: aload_3
    //   54: getstatic java/awt/datatransfer/DataFlavor.stringFlavor : Ljava/awt/datatransfer/DataFlavor;
    //   57: invokeinterface isDataFlavorSupported : (Ljava/awt/datatransfer/DataFlavor;)Z
    //   62: ifeq -> 104
    //   65: aload_3
    //   66: getstatic java/awt/datatransfer/DataFlavor.stringFlavor : Ljava/awt/datatransfer/DataFlavor;
    //   69: invokeinterface getTransferData : (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object;
    //   74: astore #4
    //   76: goto -> 104
    //   79: astore #5
    //   81: aload #5
    //   83: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   86: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   89: goto -> 104
    //   92: astore #5
    //   94: aload #5
    //   96: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   99: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   102: aconst_null
    //   103: areturn
    //   104: aload #4
    //   106: ifnonnull -> 126
    //   109: aload_3
    //   110: aload_3
    //   111: invokeinterface getTransferDataFlavors : ()[Ljava/awt/datatransfer/DataFlavor;
    //   116: invokestatic selectBestTextFlavor : ([Ljava/awt/datatransfer/DataFlavor;)Ljava/awt/datatransfer/DataFlavor;
    //   119: invokeinterface getTransferData : (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object;
    //   124: astore #4
    //   126: aconst_null
    //   127: astore #5
    //   129: aload #4
    //   131: instanceof java/lang/String
    //   134: ifeq -> 147
    //   137: aload #4
    //   139: checkcast java/lang/String
    //   142: astore #5
    //   144: goto -> 337
    //   147: aload #4
    //   149: instanceof java/io/InputStreamReader
    //   152: ifeq -> 235
    //   155: aload #4
    //   157: checkcast java/io/InputStreamReader
    //   160: astore #6
    //   162: sipush #1024
    //   165: newarray char
    //   167: astore #8
    //   169: new java/io/ByteArrayOutputStream
    //   172: dup
    //   173: invokespecial <init> : ()V
    //   176: astore #9
    //   178: aload #6
    //   180: aload #8
    //   182: invokevirtual read : ([C)I
    //   185: dup
    //   186: istore #10
    //   188: ifle -> 222
    //   191: iconst_0
    //   192: istore #11
    //   194: iload #11
    //   196: iload #10
    //   198: if_icmpge -> 218
    //   201: aload #9
    //   203: aload #8
    //   205: iload #11
    //   207: caload
    //   208: invokevirtual write : (I)V
    //   211: iinc #11, 1
    //   214: aload_2
    //   215: ifnonnull -> 194
    //   218: aload_2
    //   219: ifnonnull -> 178
    //   222: aload #9
    //   224: invokevirtual toByteArray : ()[B
    //   227: invokestatic ZG : ([B)Ljava/lang/String;
    //   230: astore #5
    //   232: goto -> 337
    //   235: aload #4
    //   237: instanceof java/io/ByteArrayInputStream
    //   240: ifeq -> 306
    //   243: aload #4
    //   245: checkcast java/io/ByteArrayInputStream
    //   248: astore #7
    //   250: sipush #1024
    //   253: newarray byte
    //   255: astore #8
    //   257: new java/io/ByteArrayOutputStream
    //   260: dup
    //   261: invokespecial <init> : ()V
    //   264: astore #9
    //   266: aload #7
    //   268: aload #8
    //   270: invokevirtual read : ([B)I
    //   273: dup
    //   274: istore #10
    //   276: ifle -> 293
    //   279: aload #9
    //   281: aload #8
    //   283: iconst_0
    //   284: iload #10
    //   286: invokevirtual write : ([BII)V
    //   289: aload_2
    //   290: ifnonnull -> 266
    //   293: aload #9
    //   295: invokevirtual toByteArray : ()[B
    //   298: invokestatic ZG : ([B)Ljava/lang/String;
    //   301: astore #5
    //   303: goto -> 337
    //   306: iconst_0
    //   307: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   310: aconst_null
    //   311: aload #4
    //   313: if_acmpne -> 326
    //   316: getstatic burp/Zb0h.a : Ljava/lang/String;
    //   319: goto -> 334
    //   322: invokestatic a : (Ljava/awt/datatransfer/UnsupportedFlavorException;)Ljava/awt/datatransfer/UnsupportedFlavorException;
    //   325: athrow
    //   326: aload #4
    //   328: invokevirtual getClass : ()Ljava/lang/Class;
    //   331: invokevirtual toString : ()Ljava/lang/String;
    //   334: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   337: aload #5
    //   339: areturn
    //   340: astore_3
    //   341: aload_3
    //   342: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   345: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   348: goto -> 359
    //   351: astore_3
    //   352: aload_3
    //   353: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   356: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   359: aconst_null
    //   360: areturn
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/awt/datatransfer/UnsupportedFlavorException
    //   4	49	340	java/awt/datatransfer/UnsupportedFlavorException
    //   4	49	340	java/io/IOException
    //   4	49	351	java/lang/Exception
    //   50	103	340	java/awt/datatransfer/UnsupportedFlavorException
    //   50	103	340	java/io/IOException
    //   50	103	351	java/lang/Exception
    //   65	76	79	java/awt/datatransfer/UnsupportedFlavorException
    //   65	76	92	java/io/IOException
    //   104	339	340	java/awt/datatransfer/UnsupportedFlavorException
    //   104	339	340	java/io/IOException
    //   104	339	351	java/lang/Exception
    //   306	322	322	java/awt/datatransfer/UnsupportedFlavorException
  }
  
  private static UnsupportedFlavorException a(UnsupportedFlavorException paramUnsupportedFlavorException) {
    return paramUnsupportedFlavorException;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: ldc '\\rOq"'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zb0h.a : Ljava/lang/String;
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
    //   80: bipush #104
    //   82: goto -> 112
    //   85: bipush #49
    //   87: goto -> 112
    //   90: bipush #22
    //   92: goto -> 112
    //   95: bipush #69
    //   97: goto -> 112
    //   100: bipush #117
    //   102: goto -> 112
    //   105: bipush #69
    //   107: goto -> 112
    //   110: bipush #62
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb0h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */