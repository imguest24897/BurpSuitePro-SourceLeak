package burp;

import java.awt.Font;
import javax.swing.event.DocumentEvent;

public class Zzn5 implements Zr5s {
  private final Zgb6 ZW;
  
  private static int Zi;
  
  public Zzn5(Zgb6 paramZgb6) {
    this.ZW = paramZgb6;
  }
  
  public void Ze(int paramInt1, int paramInt2) {}
  
  public void ZI(DocumentEvent paramDocumentEvent) {}
  
  public void ZO(DocumentEvent paramDocumentEvent) {}
  
  public void Zt(String paramString) {}
  
  public Font ZM() {
    String str = this.ZW.Zf8();
    int j = this.ZW.ZfF();
    int i = Zu();
    if (i != 0)
      Zbqc.Zr(new Zbqc[5]); 
    return new Font(str, 0, j);
  }
  
  public boolean Zs() {
    return this.ZW.Zf2();
  }
  
  public static void ZW(int paramInt) {
    Zi = paramInt;
  }
  
  public static int Zl() {
    return Zi;
  }
  
  public static int Zu() {
    int i = Zl();
    return (i == 0) ? 118 : 0;
  }
  
  static {
    if (Zu() != 0)
      ZW(65); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzn5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */