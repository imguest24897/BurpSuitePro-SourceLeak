package burp;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zgfu implements FocusListener, CaretListener, DocumentListener {
  final Zgk7 Ze;
  
  private Zgfu(Zgk7 paramZgk7) {}
  
  public void caretUpdate(CaretEvent paramCaretEvent) {
    if (this.Ze.ZS == null) {
      this.Ze.Zz();
      return;
    } 
    int i = paramCaretEvent.getDot();
    if (i < this.Ze.Ze || i > this.Ze.ZS.getOffset()) {
      this.Ze.Zz();
      return;
    } 
    this.Ze.ZI();
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {}
  
  public void focusLost(FocusEvent paramFocusEvent) {
    this.Ze.Zz();
  }
  
  private void Zk(DocumentEvent paramDocumentEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Ze : Lburp/Zgk7;
    //   4: getfield ZE : Z
    //   7: ifne -> 28
    //   10: aload_0
    //   11: getfield Ze : Lburp/Zgk7;
    //   14: iconst_1
    //   15: putfield ZE : Z
    //   18: aload_0
    //   19: aload_1
    //   20: <illegal opcode> run : (Lburp/Zgfu;Ljavax/swing/event/DocumentEvent;)Ljava/lang/Runnable;
    //   25: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   28: return
  }
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    Zk(paramDocumentEvent);
  }
  
  public void Zi(JTextComponent paramJTextComponent) {
    Zeks zeks = this.Ze.Zn.Zd(paramJTextComponent, false);
    paramJTextComponent.replaceSelection(zeks.ZC());
    int[] arrayOfInt = Zghd.ZM();
    int i = zeks.Zl();
    byte b = 0;
    while (b < i) {
      Zzxu zzxu = zeks.Zj(b);
      Zbuk zbuk = new Zbuk(zzxu.Zc(), zzxu.ZU(), this.Ze.Zo);
      this.Ze.ZP.ZD(zbuk);
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    b = 0;
    while (b < zeks.Z_()) {
      Zxtx zxtx = zeks.Zk(b);
      Zbuk zbuk = new Zbuk(zxtx.Za(), zxtx.ZX(), this.Ze.ZM);
      this.Ze.ZP.ZD(zbuk);
      this.Ze.ZT.add(new Ztdr(zxtx.Ze(), zbuk));
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    try {
      paramJTextComponent.setCaretPosition(zeks.Zw());
      if (zeks.ZN())
        paramJTextComponent.moveCaretPosition(zeks.ZD()); 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    this.Ze.Ze = zeks.Zd();
    this.Ze.ZS = zeks.Zq();
    try {
      Document document = paramJTextComponent.getDocument();
      try {
        if (this.Ze.ZS.getOffset() == 0)
          this.Ze.ZS = document.createPosition(zeks.ZC().length()); 
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
      this.Ze.ZA = document.createPosition(zeks.Zy());
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
    paramJTextComponent.getDocument().addDocumentListener(this);
    paramJTextComponent.addCaretListener(this);
    paramJTextComponent.addFocusListener(this);
    this.Ze.ZR();
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    Zk(paramDocumentEvent);
  }
  
  public void ZI() {
    JTextComponent jTextComponent = this.Ze.Zg.Zr();
    jTextComponent.removeCaretListener(this);
    jTextComponent.removeFocusListener(this);
    jTextComponent.getDocument().removeDocumentListener(this);
    this.Ze.ZZ.ZP();
    this.Ze.ZS = null;
    this.Ze.Ze = -1;
    this.Ze.ZH();
  }
  
  private void lambda$handleDocumentEvent$0(DocumentEvent paramDocumentEvent) {
    this.Ze.Zr(paramDocumentEvent.getDocument());
    this.Ze.ZE = false;
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgfu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */