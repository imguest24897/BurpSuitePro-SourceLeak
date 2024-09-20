package burp;

import java.awt.event.ActionEvent;
import java.util.List;
import java.util.stream.Collectors;

class Zsu4 implements Zgkx {
  private final Ztz9 ZF;
  
  private final Ztp8 ZO;
  
  private final Zb0h ZT;
  
  private static final String c;
  
  Zsu4(Ztz9 paramZtz9, Ztp8 paramZtp8, Zb0h paramZb0h) {
    this.ZF = paramZtz9;
    this.ZO = paramZtp8;
    this.ZT = paramZb0h;
  }
  
  public List<Zb6u> ZN() {
    return (List<Zb6u>)this.ZO.get().Zl().stream().map(Zbin::Zx).collect(Collectors.toList());
  }
  
  public boolean ZS() {
    return false;
  }
  
  public boolean Zm(Zm0m paramZm0m) {
    try {
      if (this.ZO.get().ZG())
        try {
          if (paramZm0m == Zm0m.VALUE);
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  public void ZD(int paramInt) {
    this.ZF.ZO(paramInt);
  }
  
  public void ZT(String paramString1, String paramString2) {
    throw new UnsupportedOperationException();
  }
  
  public void Zl(List<Integer> paramList) {
    throw new UnsupportedOperationException();
  }
  
  public void ZY(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public void ZO(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public void ZH(int paramInt1, int paramInt2) {
    throw new UnsupportedOperationException();
  }
  
  public void Za(List<Integer> paramList) {
    String str = paramList.stream().map(this::lambda$copyItemsToClipboard$0).map(Zbin::ZR).collect(Collectors.joining(" "));
    try {
      if (str.length() > 0)
        this.ZT.ZR(str); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public List<Zepe> Zp(List<Integer> paramList) {
    // Byte code:
    //   0: invokestatic Ze : ()[I
    //   3: astore_2
    //   4: new java/util/ArrayList
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: new burp/Zepe
    //   15: dup
    //   16: aload_1
    //   17: invokeinterface size : ()I
    //   22: iconst_1
    //   23: if_icmple -> 35
    //   26: ldc 's'
    //   28: goto -> 37
    //   31: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   34: athrow
    //   35: ldc ''
    //   37: getstatic burp/Zsu4.c : Ljava/lang/String;
    //   40: swap
    //   41: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   46: invokespecial <init> : (Ljava/lang/String;)V
    //   49: astore #4
    //   51: aload #4
    //   53: aload_0
    //   54: aload_1
    //   55: <illegal opcode> actionPerformed : (Lburp/Zsu4;Ljava/util/List;)Ljava/awt/event/ActionListener;
    //   60: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   63: aload_3
    //   64: aload #4
    //   66: invokeinterface add : (Ljava/lang/Object;)Z
    //   71: pop
    //   72: aload_3
    //   73: aload_2
    //   74: ifnull -> 91
    //   77: iconst_2
    //   78: anewarray burp/Zbqc
    //   81: invokestatic Zr : ([Lburp/Zbqc;)V
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   90: athrow
    //   91: areturn
    // Exception table:
    //   from	to	target	type
    //   12	31	31	java/lang/UnsupportedOperationException
    //   51	84	87	java/lang/UnsupportedOperationException
  }
  
  private void lambda$popupMenuItems$1(List<Integer> paramList, ActionEvent paramActionEvent) {
    Za(paramList);
  }
  
  private Zbin lambda$copyItemsToClipboard$0(Integer paramInteger) {
    return this.ZO.get().Zl().get(paramInteger.intValue());
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #68
    //   2: ldc 'h@' Z"GZ'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsu4.c : Ljava/lang/String;
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
    //   80: bipush #111
    //   82: goto -> 112
    //   85: bipush #107
    //   87: goto -> 112
    //   90: bipush #59
    //   92: goto -> 112
    //   95: bipush #26
    //   97: goto -> 112
    //   100: bipush #68
    //   102: goto -> 112
    //   105: bipush #104
    //   107: goto -> 112
    //   110: bipush #7
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsu4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */