package burp;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.Position;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zr6_ implements Transferable {
  private Position ZC;
  
  private Position ZK;
  
  private JTextComponent Zy;
  
  protected String Zx;
  
  private static DataFlavor[] ZA;
  
  private static DataFlavor[] ZD;
  
  Zr6_(JTextComponent paramJTextComponent, int paramInt1, int paramInt2) {
    this.Zy = paramJTextComponent;
    Document document = paramJTextComponent.getDocument();
    try {
      this.ZC = document.createPosition(paramInt1);
      this.ZK = document.createPosition(paramInt2);
      this.Zx = paramJTextComponent.getSelectedText();
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
  }
  
  protected String ZO() {
    return this.Zx;
  }
  
  public Object getTransferData(DataFlavor paramDataFlavor) throws UnsupportedFlavorException, IOException {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual ZU : (Ljava/awt/datatransfer/DataFlavor;)Z
    //   9: ifeq -> 104
    //   12: aload_0
    //   13: invokevirtual ZO : ()Ljava/lang/String;
    //   16: astore_3
    //   17: aload_3
    //   18: ifnonnull -> 30
    //   21: ldc ''
    //   23: goto -> 31
    //   26: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   29: athrow
    //   30: aload_3
    //   31: astore_3
    //   32: ldc java/lang/String
    //   34: aload_1
    //   35: invokevirtual getRepresentationClass : ()Ljava/lang/Class;
    //   38: invokevirtual equals : (Ljava/lang/Object;)Z
    //   41: ifeq -> 50
    //   44: aload_3
    //   45: areturn
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: ldc java/io/Reader
    //   52: aload_1
    //   53: invokevirtual getRepresentationClass : ()Ljava/lang/Class;
    //   56: invokevirtual equals : (Ljava/lang/Object;)Z
    //   59: ifeq -> 75
    //   62: new java/io/StringReader
    //   65: dup
    //   66: aload_3
    //   67: invokespecial <init> : (Ljava/lang/String;)V
    //   70: areturn
    //   71: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: ldc java/io/InputStream
    //   77: aload_1
    //   78: invokevirtual getRepresentationClass : ()Ljava/lang/Class;
    //   81: invokevirtual equals : (Ljava/lang/Object;)Z
    //   84: ifeq -> 100
    //   87: new java/io/StringBufferInputStream
    //   90: dup
    //   91: aload_3
    //   92: invokespecial <init> : (Ljava/lang/String;)V
    //   95: areturn
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: iload_2
    //   101: ifne -> 141
    //   104: aload_0
    //   105: aload_1
    //   106: invokevirtual ZN : (Ljava/awt/datatransfer/DataFlavor;)Z
    //   109: ifeq -> 141
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   118: athrow
    //   119: aload_0
    //   120: invokevirtual ZO : ()Ljava/lang/String;
    //   123: astore_3
    //   124: aload_3
    //   125: ifnonnull -> 137
    //   128: ldc ''
    //   130: goto -> 138
    //   133: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   136: athrow
    //   137: aload_3
    //   138: astore_3
    //   139: aload_3
    //   140: areturn
    //   141: new java/awt/datatransfer/UnsupportedFlavorException
    //   144: dup
    //   145: aload_1
    //   146: invokespecial <init> : (Ljava/awt/datatransfer/DataFlavor;)V
    //   149: athrow
    // Exception table:
    //   from	to	target	type
    //   17	26	26	java/awt/datatransfer/UnsupportedFlavorException
    //   32	46	46	java/awt/datatransfer/UnsupportedFlavorException
    //   50	71	71	java/awt/datatransfer/UnsupportedFlavorException
    //   75	96	96	java/awt/datatransfer/UnsupportedFlavorException
    //   100	112	115	java/awt/datatransfer/UnsupportedFlavorException
    //   124	133	133	java/awt/datatransfer/UnsupportedFlavorException
  }
  
  public DataFlavor[] getTransferDataFlavors() {
    byte b1 = ZC() ? ZD.length : 0;
    byte b2 = ZC() ? ZA.length : 0;
    int i = b1 + b2;
    DataFlavor[] arrayOfDataFlavor = new DataFlavor[i];
    int j = 0;
    if (b1 > 0) {
      System.arraycopy(ZD, 0, arrayOfDataFlavor, j, b1);
      j += b1;
    } 
    if (b2 > 0)
      System.arraycopy(ZA, 0, arrayOfDataFlavor, j, b2); 
    return arrayOfDataFlavor;
  }
  
  public boolean isDataFlavorSupported(DataFlavor paramDataFlavor) {
    DataFlavor[] arrayOfDataFlavor = getTransferDataFlavors();
    byte b = 0;
    int i = Zz85.Zm();
    while (b < arrayOfDataFlavor.length) {
      if (arrayOfDataFlavor[b].equals(paramDataFlavor))
        return true; 
      b++;
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  protected boolean ZU(DataFlavor paramDataFlavor) {
    DataFlavor[] arrayOfDataFlavor = ZD;
    byte b = 0;
    int i = Zz85.Zm();
    while (b < arrayOfDataFlavor.length) {
      if (arrayOfDataFlavor[b].equals(paramDataFlavor))
        return true; 
      b++;
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  protected boolean ZC() {
    return (this.Zx != null);
  }
  
  protected boolean ZN(DataFlavor paramDataFlavor) {
    DataFlavor[] arrayOfDataFlavor = ZA;
    byte b = 0;
    int i = Zz85.ZT();
    while (b < arrayOfDataFlavor.length) {
      if (arrayOfDataFlavor[b].equals(paramDataFlavor))
        return true; 
      b++;
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  void Zm() {
    try {
      if (this.ZC != null)
        try {
          if (this.ZK != null && this.ZC.getOffset() != this.ZK.getOffset())
            try {
              Document document = this.Zy.getDocument();
              document.remove(this.ZC.getOffset(), this.ZK.getOffset() - this.ZC.getOffset());
            } catch (BadLocationException badLocationException) {
              Zah.Zl(badLocationException, Zk_.UNEXPECTED);
            }  
        } catch (BadLocationException badLocationException) {
          throw a(null);
        }  
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'im{/j|\\n{4cvn(eal3\\nz!Ryg=|eciyi\\nza/bVwcn-p\\rpNy`c{0\\fweeyos4cvn(eal3tag4(i|ag'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #31
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #56
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 129
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: ldc 'nGb\rxU}h\\rIpjUrjS\Z{\\b;aj!nGb\rx@\\r\\tr[g\\t\@y\\t'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #52
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #80
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 248
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #37
    //   202: goto -> 232
    //   205: bipush #91
    //   207: goto -> 232
    //   210: bipush #45
    //   212: goto -> 232
    //   215: bipush #55
    //   217: goto -> 232
    //   220: bipush #56
    //   222: goto -> 232
    //   225: bipush #34
    //   227: goto -> 232
    //   230: bipush #67
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 39, 0 -> 98
    //   288: iconst_3
    //   289: anewarray java/awt/datatransfer/DataFlavor
    //   292: putstatic burp/Zr6_.ZD : [Ljava/awt/datatransfer/DataFlavor;
    //   295: getstatic burp/Zr6_.ZD : [Ljava/awt/datatransfer/DataFlavor;
    //   298: iconst_0
    //   299: new java/awt/datatransfer/DataFlavor
    //   302: dup
    //   303: aload_0
    //   304: iconst_3
    //   305: aaload
    //   306: invokespecial <init> : (Ljava/lang/String;)V
    //   309: aastore
    //   310: getstatic burp/Zr6_.ZD : [Ljava/awt/datatransfer/DataFlavor;
    //   313: iconst_1
    //   314: new java/awt/datatransfer/DataFlavor
    //   317: dup
    //   318: aload_0
    //   319: iconst_0
    //   320: aaload
    //   321: invokespecial <init> : (Ljava/lang/String;)V
    //   324: aastore
    //   325: getstatic burp/Zr6_.ZD : [Ljava/awt/datatransfer/DataFlavor;
    //   328: iconst_2
    //   329: new java/awt/datatransfer/DataFlavor
    //   332: dup
    //   333: aload_0
    //   334: iconst_2
    //   335: aaload
    //   336: invokespecial <init> : (Ljava/lang/String;)V
    //   339: aastore
    //   340: iconst_2
    //   341: anewarray java/awt/datatransfer/DataFlavor
    //   344: putstatic burp/Zr6_.ZA : [Ljava/awt/datatransfer/DataFlavor;
    //   347: getstatic burp/Zr6_.ZA : [Ljava/awt/datatransfer/DataFlavor;
    //   350: iconst_0
    //   351: new java/awt/datatransfer/DataFlavor
    //   354: dup
    //   355: aload_0
    //   356: iconst_1
    //   357: aaload
    //   358: invokespecial <init> : (Ljava/lang/String;)V
    //   361: aastore
    //   362: getstatic burp/Zr6_.ZA : [Ljava/awt/datatransfer/DataFlavor;
    //   365: iconst_1
    //   366: getstatic java/awt/datatransfer/DataFlavor.stringFlavor : Ljava/awt/datatransfer/DataFlavor;
    //   369: aastore
    //   370: goto -> 383
    //   373: astore #7
    //   375: aload #7
    //   377: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   380: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   383: return
    // Exception table:
    //   from	to	target	type
    //   288	370	373	java/lang/ClassNotFoundException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr6_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */