package burp;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.List;
import javax.swing.text.JTextComponent;

public class Ztsw extends Ztsl implements Zefy {
  private Zlqb Z_;
  
  private Zlqb Zm;
  
  private Zlqb ZC;
  
  private Zlqb ZX;
  
  private static final String c;
  
  public Ztsw(Zlqb paramZlqb) {
    ZG(paramZlqb);
  }
  
  public void Zs() {
    throw new UnsupportedOperationException();
  }
  
  public String ZN(JTextComponent paramJTextComponent) {
    try {
      if (!(paramJTextComponent instanceof Zmgn))
        return ""; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zlqb zlqb = ZD(paramJTextComponent);
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (zlqb != null) ? zlqb.ZN(paramJTextComponent) : null;
  }
  
  public Zlqb Zh() {
    return this.ZC;
  }
  
  public List<Zmy1> ZZ(JTextComponent paramJTextComponent, Point paramPoint) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (this.Z_ == null) ? null : this.Z_.ZZ(paramJTextComponent, paramPoint);
  }
  
  protected List<Zmy1> ZI(JTextComponent paramJTextComponent) {
    if (paramJTextComponent instanceof Zmgn) {
      Zlqb zlqb = ZD(paramJTextComponent);
      try {
        if (zlqb != null)
          return zlqb.Zk(paramJTextComponent); 
      } catch (UnsupportedOperationException unsupportedOperationException) {
        throw a(null);
      } 
    } 
    return Collections.emptyList();
  }
  
  public Zlqb Zf() {
    return this.Z_;
  }
  
  public Zlqb Zz() {
    return this.ZX;
  }
  
  public char ZC() {
    return this.Z_.ZC();
  }
  
  public String ZK() {
    return this.Z_.ZK();
  }
  
  public char Za() {
    return this.Z_.Za();
  }
  
  private Zlqb ZD(JTextComponent paramJTextComponent) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast burp/Zmgn
    //   4: astore_3
    //   5: aload_3
    //   6: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   9: checkcast burp/Ze9f
    //   12: astore #4
    //   14: invokestatic ZM : ()[I
    //   17: aload_3
    //   18: invokevirtual ZM : ()I
    //   21: istore #5
    //   23: astore_2
    //   24: aload #4
    //   26: iload #5
    //   28: invokevirtual Zw : (I)Lburp/Ze7g;
    //   31: astore #6
    //   33: aload #6
    //   35: ifnonnull -> 47
    //   38: aload_0
    //   39: invokevirtual Zf : ()Lburp/Zlqb;
    //   42: areturn
    //   43: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   46: athrow
    //   47: aload_3
    //   48: invokevirtual getCaretPosition : ()I
    //   51: istore #7
    //   53: aload #6
    //   55: iload #7
    //   57: invokestatic ZU : (Lburp/Ze7g;I)Lburp/Zska;
    //   60: astore #8
    //   62: aload #8
    //   64: ifnonnull -> 210
    //   67: aload #4
    //   69: iload #5
    //   71: invokevirtual Zk : (I)Lburp/Zska;
    //   74: invokevirtual ZX : ()I
    //   77: istore #9
    //   79: iload #9
    //   81: ifne -> 116
    //   84: aload #6
    //   86: invokevirtual Zb : ()Lburp/Zska;
    //   89: astore #10
    //   91: aload #10
    //   93: ifnonnull -> 105
    //   96: aload_0
    //   97: invokevirtual Zf : ()Lburp/Zlqb;
    //   100: areturn
    //   101: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   104: athrow
    //   105: aload #10
    //   107: invokevirtual ZX : ()I
    //   110: istore #9
    //   112: aload_2
    //   113: ifnonnull -> 137
    //   116: iload #9
    //   118: ifge -> 137
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   127: athrow
    //   128: aload #4
    //   130: iload #9
    //   132: invokevirtual Zf : (I)I
    //   135: istore #9
    //   137: iload #9
    //   139: lookupswitch default -> 205, 1 -> 191, 2 -> 191, 3 -> 198, 38 -> 180
    //   180: aload_0
    //   181: invokevirtual Zc : ()Lburp/Zlqb;
    //   184: goto -> 209
    //   187: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   190: athrow
    //   191: aload_0
    //   192: invokevirtual Zh : ()Lburp/Zlqb;
    //   195: goto -> 209
    //   198: aload_0
    //   199: invokevirtual Zz : ()Lburp/Zlqb;
    //   202: goto -> 209
    //   205: aload_0
    //   206: invokevirtual Zf : ()Lburp/Zlqb;
    //   209: areturn
    //   210: iload #7
    //   212: aload #8
    //   214: invokevirtual ZJ : ()I
    //   217: if_icmpne -> 229
    //   220: aload_0
    //   221: invokevirtual Zf : ()Lburp/Zlqb;
    //   224: areturn
    //   225: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   228: athrow
    //   229: aload #8
    //   231: invokevirtual ZX : ()I
    //   234: tableswitch default -> 436, 0 -> 429, 1 -> 415, 2 -> 415, 3 -> 422, 4 -> 436, 5 -> 436, 6 -> 436, 7 -> 436, 8 -> 429, 9 -> 436, 10 -> 436, 11 -> 436, 12 -> 436, 13 -> 404, 14 -> 436, 15 -> 436, 16 -> 436, 17 -> 429, 18 -> 429, 19 -> 436, 20 -> 436, 21 -> 429, 22 -> 429, 23 -> 436, 24 -> 429, 25 -> 429, 26 -> 436, 27 -> 436, 28 -> 436, 29 -> 436, 30 -> 436, 31 -> 436, 32 -> 436, 33 -> 436, 34 -> 436, 35 -> 436, 36 -> 436, 37 -> 436, 38 -> 404
    //   404: aload_0
    //   405: invokevirtual Zc : ()Lburp/Zlqb;
    //   408: goto -> 437
    //   411: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   414: athrow
    //   415: aload_0
    //   416: invokevirtual Zh : ()Lburp/Zlqb;
    //   419: goto -> 437
    //   422: aload_0
    //   423: invokevirtual Zz : ()Lburp/Zlqb;
    //   426: goto -> 437
    //   429: aload_0
    //   430: invokevirtual Zf : ()Lburp/Zlqb;
    //   433: goto -> 437
    //   436: aconst_null
    //   437: areturn
    // Exception table:
    //   from	to	target	type
    //   33	43	43	java/lang/UnsupportedOperationException
    //   91	101	101	java/lang/UnsupportedOperationException
    //   112	121	124	java/lang/UnsupportedOperationException
    //   137	187	187	java/lang/UnsupportedOperationException
    //   210	225	225	java/lang/UnsupportedOperationException
    //   229	411	411	java/lang/UnsupportedOperationException
  }
  
  public Zlqb Zc() {
    return this.Zm;
  }
  
  public boolean Zo(JTextComponent paramJTextComponent) {
    Zlqb zlqb = ZD(paramJTextComponent);
    try {
      if (zlqb != null)
        try {
          if (zlqb.Zo(paramJTextComponent));
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  public void ZG(Zlqb paramZlqb) {
    try {
      if (paramZlqb == null)
        throw new IllegalArgumentException(c); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    this.Z_ = paramZlqb;
  }
  
  public void Zg(char paramChar1, String paramString, char paramChar2) {
    throw new UnsupportedOperationException();
  }
  
  public String ZD(Zmgw paramZmgw, MouseEvent paramMouseEvent) {
    String str = null;
    List<Zmy1> list = ZZ(paramZmgw, paramMouseEvent.getPoint());
    try {
      if (list != null && !list.isEmpty()) {
        Zmy1 zmy1 = list.get(0);
        str = zmy1.ZF();
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return str;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #84
    //   2: ldc '\\r3=5A)a1 2K#\\ta0|K9-'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztsw.c : Ljava/lang/String;
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
    //   80: bipush #41
    //   82: goto -> 112
    //   85: bipush #21
    //   87: goto -> 112
    //   90: bipush #6
    //   92: goto -> 112
    //   95: bipush #53
    //   97: goto -> 112
    //   100: bipush #8
    //   102: goto -> 112
    //   105: bipush #113
    //   107: goto -> 112
    //   110: bipush #24
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztsw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */