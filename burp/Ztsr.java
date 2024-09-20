package burp;

import java.awt.Component;
import java.awt.Container;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.swing.Icon;
import javax.swing.KeyStroke;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztsr implements KeyEventDispatcher, Zm3g {
  public static final Zr0t Zg = Zr0t.Zy();
  
  private static Ztsr Zd;
  
  private final Zeef Z_;
  
  private boolean ZF;
  
  private static Zbqc[] Zo;
  
  private Ztsr(Zeef paramZeef) {
    this.Z_ = paramZeef;
  }
  
  public static Ztsr ZP(Zeef paramZeef) {
    if (Zd == null) {
      Objects.requireNonNull(paramZeef);
      Objects.requireNonNull(paramZeef);
      Zr98.Zr(paramZeef::Z_, paramZeef::ZO);
      Zd = new Ztsr(paramZeef);
    } 
    return Zd;
  }
  
  public static KeyStroke ZW(int paramInt1, int paramInt2) {
    return KeyStroke.getKeyStroke(paramInt2, Zsqw.Zz | paramInt1);
  }
  
  public void Zu(Map<Integer, KeyStroke> paramMap) {
    this.Z_.Ze(paramMap);
  }
  
  public List<Zl1c> Zm(boolean paramBoolean) {
    return this.Z_.ZU(paramBoolean);
  }
  
  public void ZM(boolean paramBoolean) {
    Zr98.ZF(paramBoolean);
    this.ZF = paramBoolean;
  }
  
  public static Zepk ZW(Zzyl paramZzyl, int paramInt) {
    return Zu(paramZzyl, paramInt, null, null, true);
  }
  
  public static Zepk Zx(Zzyl paramZzyl, int paramInt, String paramString) {
    return Zu(paramZzyl, paramInt, paramString, null, true);
  }
  
  public static Zepk ZY(Zzyl paramZzyl, int paramInt, boolean paramBoolean) {
    return Zu(paramZzyl, paramInt, null, null, paramBoolean);
  }
  
  public static Zepk ZP(Zzyl paramZzyl, int paramInt, String paramString, boolean paramBoolean) {
    return Zu(paramZzyl, paramInt, paramString, null, paramBoolean);
  }
  
  public static Zepk ZO(Zzyl paramZzyl, int paramInt, String paramString, Icon paramIcon) {
    return Zu(paramZzyl, paramInt, paramString, paramIcon, true);
  }
  
  public static Zepk Zu(Zzyl paramZzyl, int paramInt, String paramString, Icon paramIcon, boolean paramBoolean) {
    Ztde ztde = Zg.Zo(paramInt);
    Zuh.Zv((ztde != null), Zqf.Zk, paramInt);
    Zepk zepk = new Zepk((paramString == null) ? ztde.Zb() : paramString, paramIcon, ZO(paramInt), paramZzyl, paramInt);
    zepk.setEnabled(paramBoolean);
    return zepk;
  }
  
  public static Zsu5 Zt(Zzyl paramZzyl, int paramInt, String paramString) {
    Ztde ztde = Zg.Zo(paramInt);
    Zuh.Zv((ztde != null), Zqf.Zk, paramInt);
    return new Zsu5((paramString == null) ? ztde.Zb() : paramString, ZO(paramInt), paramZzyl, paramInt);
  }
  
  public static Ze77 ZS(Zzyl paramZzyl, int paramInt, String paramString) {
    Ztde ztde = Zg.Zo(paramInt);
    Zuh.Zv((ztde != null), Zqf.Zk, paramInt);
    return new Ze77((paramString == null) ? ztde.Zb() : paramString, ZO(paramInt), paramZzyl, paramInt);
  }
  
  public static KeyStroke ZO(int paramInt) {
    return Zd.Z_.ZO(paramInt);
  }
  
  public static boolean Zz(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getID() != 401)
      return false; 
    int i = paramKeyEvent.getModifiers();
    if ((i & Zsqw.Zz) == 0)
      return false; 
    int j = paramKeyEvent.getKeyCode();
    switch (j) {
      case 0:
      case 16:
      case 17:
      case 18:
      case 157:
      case 65406:
      
    } 
    return true;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    Zbqc[] arrayOfZbqc = Zb();
    if (this.ZF)
      return false; 
    if (!Zz(paramKeyEvent))
      return false; 
    Ztde ztde = this.Z_.ZS(Zsqw.ZO(paramKeyEvent.getModifiers(), paramKeyEvent.getKeyCode()));
    if (ztde == null)
      return false; 
    int i = ztde.ZH();
    Object object = paramKeyEvent.getSource();
    if (object instanceof Component) {
      Component component = (Component)object;
      while (component != null) {
        Container container = component.getParent();
        if (component instanceof Zzyl) {
          Zzyl zzyl = (Zzyl)component;
          if (zzyl.ZI(i, object)) {
            paramKeyEvent.consume();
            return true;
          } 
        } 
        component = container;
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    return false;
  }
  
  public void Zd(Zmf_ paramZmf_) {
    this.Z_.Zd(paramZmf_);
  }
  
  public void Zl(Zg4j paramZg4j) {
    this.Z_.Zl(paramZg4j);
  }
  
  public static void ZJ(Zbqc[] paramArrayOfZbqc) {
    Zo = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zb() {
    return Zo;
  }
  
  static {
    if (Zb() == null)
      ZJ(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztsr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */