package burp;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Caret;

class Zmg0 extends Zmgn implements Zkgx {
  private final Supplier<Ze9f> Zh;
  
  public Zmg0(Supplier<Ze9f> paramSupplier, Zg4o paramZg4o, Zkjk paramZkjk, Zrf paramZrf) {
    super(paramSupplier.get(), paramZg4o, paramZkjk, paramZrf);
    this.Zh = paramSupplier;
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getSelectionStart : ()I
    //   4: istore_1
    //   5: aload_0
    //   6: invokevirtual getSelectionEnd : ()I
    //   9: istore_2
    //   10: aload_0
    //   11: invokevirtual Zb : ()Z
    //   14: istore_3
    //   15: aload_0
    //   16: invokevirtual ZY : ()Z
    //   19: istore #4
    //   21: aload_0
    //   22: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   25: checkcast burp/Ze9f
    //   28: astore #5
    //   30: aload_0
    //   31: invokevirtual Zp : ()Lburp/Zmtl;
    //   34: astore #6
    //   36: aload_0
    //   37: aload #5
    //   39: aload #6
    //   41: iload_1
    //   42: iload_2
    //   43: iload_3
    //   44: iload #4
    //   46: <illegal opcode> Zg : (Lburp/Zmg0;Lburp/Ze9f;Lburp/Zmtl;IIZZ)Lburp/Ztcw;
    //   51: areturn
  }
  
  public void ZU() {
    Ze9f ze9f = this.Zh.get();
    Zc(ze9f, Zl());
    setCaretPosition(0);
    setSelectionStart(0);
    setSelectionEnd(0);
  }
  
  void Zc(Ze9f paramZe9f, Zmtl paramZmtl) {
    Ze9f ze9f = (Ze9f)getDocument();
    Zg(paramZe9f, paramZmtl);
    DocumentListener[] arrayOfDocumentListener = ze9f.getDocumentListeners();
    Objects.requireNonNull(UndoableEditListener.class);
    Objects.requireNonNull(ze9f);
    Arrays.<DocumentListener>stream(arrayOfDocumentListener).filter(Predicate.not(UndoableEditListener.class::isInstance)).forEach(ze9f::removeDocumentListener);
    Objects.requireNonNull(UndoableEditListener.class);
    Objects.requireNonNull(paramZe9f);
    Arrays.<DocumentListener>stream(arrayOfDocumentListener).filter(Predicate.not(UndoableEditListener.class::isInstance)).forEach(paramZe9f::addDocumentListener);
  }
  
  private void lambda$checkpoint$1(Ze9f paramZe9f, Zmtl paramZmtl, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    Zc(paramZe9f, paramZmtl);
    setSelectionStart(paramInt1);
    setSelectionEnd(paramInt2);
    Zy(paramBoolean1);
    ZG(paramBoolean2);
    Caret caret = getCaret();
    if (caret instanceof Zz_j) {
      Zz_j zz_j = (Zz_j)caret;
      zz_j.ZN(false);
      SwingUtilities.invokeLater(zz_j::lambda$checkpoint$0);
    } 
  }
  
  private static void lambda$checkpoint$0(Zz_j paramZz_j) {
    paramZz_j.ZN(true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmg0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */