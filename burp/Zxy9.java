package burp;

import java.awt.datatransfer.Transferable;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.event.DocumentListener;

public interface Zxy9 extends Zz0g, Zs7f, Zzyl, Transferable, Zkgx {
  void Zg(boolean paramBoolean);
  
  JComponent ZiB();
  
  void ZH(Zg90 paramZg90);
  
  boolean Zi3();
  
  void ZV(String paramString1, String paramString2, boolean paramBoolean);
  
  void Zz(String paramString, boolean paramBoolean);
  
  byte[] ZiD();
  
  int ZiO();
  
  void Zg(int paramInt);
  
  void ZZ(int paramInt);
  
  void Zu(int paramInt1, int paramInt2);
  
  byte[] ZiS();
  
  void ZY(byte[] paramArrayOfbyte);
  
  int[] Zif();
  
  boolean Zid();
  
  int Zi4();
  
  void ZS(boolean paramBoolean);
  
  void Zv(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  void ZW(String paramString, int paramInt1, int paramInt2);
  
  void Zv(boolean paramBoolean);
  
  void ZB(boolean paramBoolean);
  
  void ZH(boolean paramBoolean);
  
  void ZiK();
  
  void ZA(MouseListener paramMouseListener);
  
  void ZT(DocumentListener paramDocumentListener);
  
  void ZP(FocusListener paramFocusListener);
  
  void ZF(boolean paramBoolean);
  
  boolean Zi0();
  
  boolean Zip();
  
  String ZiW();
  
  default List<String> Zie() {
    return List.of(ZiW());
  }
  
  int Zi1();
  
  String Ziz();
  
  void ZP(int paramInt, char paramChar);
  
  default void Zt(boolean paramBoolean) {}
  
  default void ZY(boolean paramBoolean) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxy9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */