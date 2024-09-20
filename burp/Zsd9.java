package burp;

import java.awt.Component;
import java.util.function.Supplier;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zsd9 implements DocumentListener {
  private final boolean Zk;
  
  private final Zepx ZV;
  
  private final DocumentListener ZY;
  
  private final Document Zj;
  
  private final Zbup Zp;
  
  private final Zbc9 Zu;
  
  private final Zx0x ZP;
  
  private final Zbw2 ZT;
  
  private byte[] Zg;
  
  private boolean ZX;
  
  private boolean Zd;
  
  public Zsd9(Supplier<Component> paramSupplier, boolean paramBoolean1, boolean paramBoolean2, Zepx paramZepx, DocumentListener paramDocumentListener, Zb0h paramZb0h) {
    this.Zk = paramBoolean1;
    this.ZV = paramZepx;
    this.ZY = paramDocumentListener;
    this.ZP = new Zx0x();
    this.ZP.setEditable(paramBoolean1);
    this.Zj = this.ZP.getDocument();
    this.ZT = new Zbw2(paramSupplier, paramBoolean1, true, paramBoolean2, paramZepx, paramDocumentListener, paramZb0h);
    this.Zu = new Zbc9(new Component[] { this.ZP, this.ZT });
    this.Zp = new Zbu1(this, paramBoolean1);
    this.Zp.setViewportView(this.Zu);
    if (paramBoolean1 && paramDocumentListener != null)
      this.Zj.addDocumentListener(this); 
    this.ZX = true;
    this.Zu.Zv(0);
  }
  
  public Component ZO() {
    return this.Zp;
  }
  
  public void ZM(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: invokestatic ZvS : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Zg : [B
    //   9: aload_0
    //   10: getfield ZX : Z
    //   13: ifeq -> 246
    //   16: aload_0
    //   17: iconst_1
    //   18: putfield Zd : Z
    //   21: aload_1
    //   22: invokestatic ZG : ([B)Ljava/lang/String;
    //   25: astore_3
    //   26: aload_0
    //   27: getfield Zj : Ljavax/swing/text/Document;
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield Zj : Ljavax/swing/text/Document;
    //   35: invokeinterface getLength : ()I
    //   40: invokeinterface remove : (II)V
    //   45: aload_3
    //   46: invokevirtual length : ()I
    //   49: istore #4
    //   51: iconst_0
    //   52: istore #5
    //   54: iload #5
    //   56: iload #4
    //   58: if_icmpge -> 210
    //   61: iload #5
    //   63: istore #6
    //   65: iload #5
    //   67: istore #7
    //   69: aload_0
    //   70: getfield ZV : Lburp/Zepx;
    //   73: iload #5
    //   75: invokeinterface ZT : (I)Lburp/Zr4_;
    //   80: astore #8
    //   82: iload #5
    //   84: iload #4
    //   86: if_icmpge -> 136
    //   89: aload_0
    //   90: getfield ZV : Lburp/Zepx;
    //   93: iload #5
    //   95: invokeinterface ZT : (I)Lburp/Zr4_;
    //   100: aload #8
    //   102: if_acmpeq -> 119
    //   105: iinc #5, -1
    //   108: aload_2
    //   109: ifnonnull -> 136
    //   112: goto -> 119
    //   115: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   118: athrow
    //   119: iinc #5, 1
    //   122: iinc #7, 1
    //   125: aload_2
    //   126: ifnonnull -> 82
    //   129: goto -> 136
    //   132: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   135: athrow
    //   136: aload #8
    //   138: getstatic burp/Zr4_.ZZ : Lburp/Zr4_;
    //   141: if_acmpne -> 179
    //   144: aload #8
    //   146: getfield ZU : Ljavax/swing/text/SimpleAttributeSet;
    //   149: getstatic burp/Zlkk.SOLID_FOREGROUND : Lburp/Zlkk;
    //   152: invokevirtual ZS : ()Ljava/awt/Color;
    //   155: invokestatic setForeground : (Ljavax/swing/text/MutableAttributeSet;Ljava/awt/Color;)V
    //   158: aload #8
    //   160: getfield ZU : Ljavax/swing/text/SimpleAttributeSet;
    //   163: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   166: invokevirtual ZS : ()Ljava/awt/Color;
    //   169: invokestatic setBackground : (Ljavax/swing/text/MutableAttributeSet;Ljava/awt/Color;)V
    //   172: goto -> 179
    //   175: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   178: athrow
    //   179: aload_0
    //   180: getfield Zj : Ljavax/swing/text/Document;
    //   183: iload #6
    //   185: aload_3
    //   186: iload #6
    //   188: iload #7
    //   190: invokevirtual substring : (II)Ljava/lang/String;
    //   193: aload #8
    //   195: getfield ZU : Ljavax/swing/text/SimpleAttributeSet;
    //   198: invokeinterface insertString : (ILjava/lang/String;Ljavax/swing/text/AttributeSet;)V
    //   203: iinc #5, 1
    //   206: aload_2
    //   207: ifnonnull -> 54
    //   210: aload_0
    //   211: getfield ZP : Lburp/Zx0x;
    //   214: iconst_0
    //   215: invokevirtual setSelectionStart : (I)V
    //   218: aload_0
    //   219: getfield ZP : Lburp/Zx0x;
    //   222: iconst_0
    //   223: invokevirtual setSelectionEnd : (I)V
    //   226: goto -> 237
    //   229: astore_3
    //   230: aload_3
    //   231: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   234: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   237: aload_0
    //   238: iconst_0
    //   239: putfield Zd : Z
    //   242: aload_2
    //   243: ifnonnull -> 261
    //   246: aload_0
    //   247: getfield ZT : Lburp/Zbw2;
    //   250: aload_1
    //   251: invokevirtual Zn : ([B)V
    //   254: goto -> 261
    //   257: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   260: athrow
    //   261: return
    // Exception table:
    //   from	to	target	type
    //   21	226	229	javax/swing/text/BadLocationException
    //   89	112	115	javax/swing/text/BadLocationException
    //   105	129	132	javax/swing/text/BadLocationException
    //   136	172	175	javax/swing/text/BadLocationException
    //   237	254	257	javax/swing/text/BadLocationException
  }
  
  public int ZY() {
    return this.ZX ? this.Zj.getLength() : this.ZT.ZJ();
  }
  
  public byte[] Zk() {
    return this.ZX ? Zkb.Zy(ZD()) : this.ZT.Zg();
  }
  
  public void ZC(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: invokestatic ZvS : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_0
    //   5: iload_1
    //   6: putfield ZX : Z
    //   9: aload_0
    //   10: getfield ZX : Z
    //   13: ifeq -> 62
    //   16: aload_0
    //   17: getfield Zk : Z
    //   20: ifne -> 35
    //   23: aload_0
    //   24: aload_0
    //   25: getfield Zg : [B
    //   28: invokevirtual ZM : ([B)V
    //   31: aload_3
    //   32: ifnonnull -> 50
    //   35: iload_2
    //   36: ifeq -> 50
    //   39: aload_0
    //   40: aload_0
    //   41: getfield ZT : Lburp/Zbw2;
    //   44: invokevirtual Zg : ()[B
    //   47: invokevirtual ZM : ([B)V
    //   50: aload_0
    //   51: getfield Zu : Lburp/Zbc9;
    //   54: iconst_0
    //   55: invokevirtual Zv : (I)V
    //   58: aload_3
    //   59: ifnonnull -> 110
    //   62: aload_0
    //   63: getfield Zk : Z
    //   66: ifne -> 84
    //   69: aload_0
    //   70: getfield ZT : Lburp/Zbw2;
    //   73: aload_0
    //   74: getfield Zg : [B
    //   77: invokevirtual Zn : ([B)V
    //   80: aload_3
    //   81: ifnonnull -> 102
    //   84: iload_2
    //   85: ifeq -> 102
    //   88: aload_0
    //   89: getfield ZT : Lburp/Zbw2;
    //   92: aload_0
    //   93: invokevirtual ZD : ()Ljava/lang/String;
    //   96: invokestatic Zy : (Ljava/lang/String;)[B
    //   99: invokevirtual Zn : ([B)V
    //   102: aload_0
    //   103: getfield Zu : Lburp/Zbc9;
    //   106: iconst_1
    //   107: invokevirtual Zv : (I)V
    //   110: return
  }
  
  public boolean Zu() {
    return this.ZX;
  }
  
  public void ZO(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZvS : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZX : Z
    //   8: ifeq -> 183
    //   11: aload_0
    //   12: iconst_1
    //   13: putfield Zd : Z
    //   16: aload_0
    //   17: getfield Zj : Ljavax/swing/text/Document;
    //   20: iload_1
    //   21: iload_2
    //   22: invokeinterface getText : (II)Ljava/lang/String;
    //   27: astore #4
    //   29: aload_0
    //   30: getfield Zj : Ljavax/swing/text/Document;
    //   33: iload_1
    //   34: iload_2
    //   35: invokeinterface remove : (II)V
    //   40: iconst_0
    //   41: istore #5
    //   43: iload #5
    //   45: iload_2
    //   46: if_icmpge -> 161
    //   49: iload #5
    //   51: istore #6
    //   53: iload #5
    //   55: istore #7
    //   57: aload_0
    //   58: getfield ZV : Lburp/Zepx;
    //   61: iload_1
    //   62: iload #5
    //   64: iadd
    //   65: invokeinterface ZT : (I)Lburp/Zr4_;
    //   70: astore #8
    //   72: iload #5
    //   74: iload_2
    //   75: if_icmpge -> 127
    //   78: aload_0
    //   79: getfield ZV : Lburp/Zepx;
    //   82: iload_1
    //   83: iload #5
    //   85: iadd
    //   86: invokeinterface ZT : (I)Lburp/Zr4_;
    //   91: aload #8
    //   93: if_acmpeq -> 110
    //   96: iinc #5, -1
    //   99: aload_3
    //   100: ifnonnull -> 127
    //   103: goto -> 110
    //   106: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   109: athrow
    //   110: iinc #5, 1
    //   113: iinc #7, 1
    //   116: aload_3
    //   117: ifnonnull -> 72
    //   120: goto -> 127
    //   123: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   126: athrow
    //   127: aload_0
    //   128: getfield Zj : Ljavax/swing/text/Document;
    //   131: iload_1
    //   132: iload #6
    //   134: iadd
    //   135: aload #4
    //   137: iload #6
    //   139: iload #7
    //   141: invokevirtual substring : (II)Ljava/lang/String;
    //   144: aload #8
    //   146: getfield ZU : Ljavax/swing/text/SimpleAttributeSet;
    //   149: invokeinterface insertString : (ILjava/lang/String;Ljavax/swing/text/AttributeSet;)V
    //   154: iinc #5, 1
    //   157: aload_3
    //   158: ifnonnull -> 43
    //   161: goto -> 174
    //   164: astore #4
    //   166: aload #4
    //   168: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   171: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   174: aload_0
    //   175: iconst_0
    //   176: putfield Zd : Z
    //   179: aload_3
    //   180: ifnonnull -> 204
    //   183: aload_0
    //   184: getfield ZT : Lburp/Zbw2;
    //   187: invokevirtual clearSelection : ()V
    //   190: aload_0
    //   191: getfield ZT : Lburp/Zbw2;
    //   194: invokevirtual Zu : ()V
    //   197: goto -> 204
    //   200: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   203: athrow
    //   204: return
    // Exception table:
    //   from	to	target	type
    //   16	161	164	javax/swing/text/BadLocationException
    //   78	103	106	javax/swing/text/BadLocationException
    //   96	120	123	javax/swing/text/BadLocationException
    //   174	197	200	javax/swing/text/BadLocationException
  }
  
  public boolean ZX() {
    return this.ZX ? ((this.ZP.getSelectionStart() != this.ZP.getSelectionEnd())) : this.ZT.ZM();
  }
  
  public int Z_() {
    return this.ZX ? this.ZP.getSelectionStart() : this.ZT.Zl();
  }
  
  public int Zo() {
    return this.ZX ? this.ZP.getSelectionEnd() : this.ZT.ZC();
  }
  
  private String ZD() {
    try {
      return this.Zj.getText(0, this.Zj.getLength());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return "";
    } 
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {
    if (!this.Zd)
      this.ZY.changedUpdate(paramDocumentEvent); 
  }
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    if (!this.Zd)
      this.ZY.insertUpdate(paramDocumentEvent); 
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    if (!this.Zd)
      this.ZY.removeUpdate(paramDocumentEvent); 
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsd9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */