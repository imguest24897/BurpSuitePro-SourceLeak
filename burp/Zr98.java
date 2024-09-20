package burp;

import java.awt.Component;
import java.awt.Container;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;
import java.util.function.Function;
import java.util.function.IntFunction;
import javax.swing.Icon;
import javax.swing.KeyStroke;

public class Zr98 implements KeyEventDispatcher {
  private static Zr98 ZA;
  
  private final Function<KeyStroke, Integer> ZS;
  
  private final IntFunction<KeyStroke> Zt;
  
  private boolean Zl;
  
  private Zr98(Function<KeyStroke, Integer> paramFunction, IntFunction<KeyStroke> paramIntFunction) {
    this.ZS = paramFunction;
    this.Zt = paramIntFunction;
  }
  
  public static void Zr(Function<String, Integer> paramFunction, IntFunction<KeyStroke> paramIntFunction) {
    if (ZA == null)
      ZA = new Zr98(paramFunction::lambda$initialise$0, paramIntFunction); 
  }
  
  public static void ZF(boolean paramBoolean) {
    if (ZA != null)
      ZA.Zl = paramBoolean; 
  }
  
  public static Zepk Zt(Zzyl paramZzyl, int paramInt, String paramString) {
    return Zi(paramZzyl, paramInt, paramString, null);
  }
  
  public static Zepk Zi(Zzyl paramZzyl, int paramInt, String paramString, Icon paramIcon) {
    Zepk zepk = new Zepk(paramString, paramIcon, ZX(paramInt), paramZzyl, paramInt);
    zepk.setEnabled(true);
    return zepk;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    Zbqc[] arrayOfZbqc = Ztsr.Zb();
    if (this.Zl)
      return false; 
    KeyStroke keyStroke = KeyStroke.getKeyStrokeForEvent(paramKeyEvent);
    if (paramKeyEvent.getID() != 401 || !ZE(keyStroke))
      return false; 
    Integer integer = this.ZS.apply(keyStroke);
    if (integer == null)
      return false; 
    Object object = paramKeyEvent.getSource();
    if (object instanceof Component) {
      Component component = (Component)object;
      while (component != null) {
        Container container = component.getParent();
        if (component instanceof Zzyl) {
          Zzyl zzyl = (Zzyl)component;
          if (zzyl.ZI(integer.intValue(), object)) {
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
  
  private static KeyStroke ZX(int paramInt) {
    return ZA.Zt.apply(paramInt);
  }
  
  private static boolean ZE(KeyStroke paramKeyStroke) {
    int i = paramKeyStroke.getModifiers();
    if ((i & Zsqw.Zz) == 0)
      return false; 
    int j = paramKeyStroke.getKeyCode();
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
  
  private static Integer lambda$initialise$0(Function<String, Integer> paramFunction, KeyStroke paramKeyStroke) {
    return paramFunction.apply(Zsqw.ZO(paramKeyStroke.getModifiers(), paramKeyStroke.getKeyCode()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr98.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */