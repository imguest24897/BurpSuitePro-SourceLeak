package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.ui.Selection;
import burp.api.montoya.ui.editor.WebSocketMessageEditor;
import java.awt.Component;
import java.util.Optional;
import javax.swing.JComponent;
import net.portswigger.Zah;
import net.portswigger.Zdo;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zegi implements WebSocketMessageEditor {
  private final Zbdf ZQ;
  
  private final Zskl ZX;
  
  public Zegi(Zbdf paramZbdf, Zskl paramZskl) {
    this.ZQ = paramZbdf;
    this.ZX = paramZskl;
    setContents(null);
  }
  
  public ByteArray getContents() {
    Zsmh zsmh = this.ZQ.Zi();
    if (zsmh instanceof Zxpe) {
      Zxpe zxpe = (Zxpe)zsmh;
      return this.ZX.ZI(zxpe.ZS().ZiD());
    } 
    Zuh.ZT(false, Zqf.Zr, zsmh.getClass().getName());
    return this.ZX.ZI(Zdo.ZQ);
  }
  
  public void setContents(ByteArray paramByteArray) {
    try {
      if (paramByteArray == null)
        paramByteArray = this.ZX.ZI(new byte[0]); 
      this.ZQ.ZE(Zblx.Zw(paramByteArray), Zgu3.WS_MESSAGE);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void setSearchExpression(String paramString) {
    try {
      if (paramString == null)
        paramString = ""; 
      this.ZQ.ZN(paramString, false, false);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public boolean isModified() {
    return this.ZQ.Ze();
  }
  
  public int caretPosition() {
    int[] arrayOfInt = this.ZQ.ZG();
    return arrayOfInt[1];
  }
  
  public Optional<Selection> selection() {
    byte[] arrayOfByte = this.ZQ.Zd();
    if (arrayOfByte == null || arrayOfByte.length == 0)
      return Optional.empty(); 
    Selection selection = this.ZX.Zp(arrayOfByte, this.ZQ.ZG());
    return Optional.of(selection);
  }
  
  public JComponent Zj() {
    return this.ZQ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zegi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */