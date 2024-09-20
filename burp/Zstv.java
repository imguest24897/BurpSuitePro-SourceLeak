package burp;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;

public class Zstv implements Transferable {
  public static final DataFlavor Zb;
  
  private final Zlfz ZA;
  
  public Zstv(Zlfz paramZlfz) {
    this.ZA = paramZlfz;
  }
  
  public DataFlavor[] getTransferDataFlavors() {
    return new DataFlavor[] { Zb };
  }
  
  public boolean isDataFlavorSupported(DataFlavor paramDataFlavor) {
    return Zb.equals(paramDataFlavor);
  }
  
  public Object getTransferData(DataFlavor paramDataFlavor) throws UnsupportedFlavorException {
    try {
      if (!isDataFlavorSupported(paramDataFlavor))
        throw new UnsupportedFlavorException(paramDataFlavor); 
    } catch (UnsupportedFlavorException unsupportedFlavorException) {
      throw a(null);
    } 
    return this.ZA;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'ZwNa?)\p]v\\f-&u_j1/jl@hw4WtdYgu&\\fs(Ci;-3jMl=/l`I'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #14
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #8
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 70
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
    //   67: goto -> 215
    //   70: dup_x2
    //   71: pop
    //   72: invokevirtual toCharArray : ()[C
    //   75: dup_x1
    //   76: arraylength
    //   77: dup_x2
    //   78: pop
    //   79: iconst_0
    //   80: istore #6
    //   82: dup2_x1
    //   83: pop2
    //   84: dup_x2
    //   85: iconst_1
    //   86: if_icmpgt -> 188
    //   89: dup2
    //   90: swap
    //   91: iload #6
    //   93: dup2_x1
    //   94: caload
    //   95: swap
    //   96: iload #6
    //   98: bipush #7
    //   100: irem
    //   101: tableswitch default -> 170, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 160, 5 -> 165
    //   140: bipush #22
    //   142: goto -> 172
    //   145: bipush #13
    //   147: goto -> 172
    //   150: bipush #39
    //   152: goto -> 172
    //   155: bipush #14
    //   157: goto -> 172
    //   160: bipush #80
    //   162: goto -> 172
    //   165: bipush #68
    //   167: goto -> 172
    //   170: bipush #114
    //   172: ixor
    //   173: ixor
    //   174: i2c
    //   175: castore
    //   176: iinc #6, 1
    //   179: dup
    //   180: ifne -> 188
    //   183: dup2
    //   184: dup_x1
    //   185: goto -> 93
    //   188: dup2_x1
    //   189: pop2
    //   190: dup_x2
    //   191: iload #6
    //   193: if_icmpgt -> 89
    //   196: pop
    //   197: new java/lang/String
    //   200: dup_x1
    //   201: swap
    //   202: invokespecial <init> : ([C)V
    //   205: invokevirtual intern : ()Ljava/lang/String;
    //   208: swap
    //   209: pop
    //   210: swap
    //   211: pop
    //   212: goto -> 39
    //   215: new java/awt/datatransfer/DataFlavor
    //   218: dup
    //   219: aload_0
    //   220: iconst_1
    //   221: aaload
    //   222: aload_0
    //   223: iconst_0
    //   224: aaload
    //   225: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   228: putstatic burp/Zstv.Zb : Ljava/awt/datatransfer/DataFlavor;
    //   231: return
  }
  
  private static UnsupportedFlavorException a(UnsupportedFlavorException paramUnsupportedFlavorException) {
    return paramUnsupportedFlavorException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zstv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */