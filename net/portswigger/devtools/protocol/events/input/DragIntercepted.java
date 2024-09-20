package net.portswigger.devtools.protocol.events.input;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.input.DragData;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.input.DragIntercepted")
public class DragIntercepted implements Zl {
  @Zvd(Zp = "data")
  public final DragData data;
  
  private static boolean ZC;
  
  @Zox
  public DragIntercepted(@Zc5(Ze = "data") DragData paramDragData) {
    boolean bool = ZK();
    this.data = paramDragData;
    if (!bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public static void ZL(boolean paramBoolean) {
    ZC = paramBoolean;
  }
  
  public static boolean ZK() {
    return ZC;
  }
  
  public static boolean Zh() {
    boolean bool = ZK();
    return !bool;
  }
  
  static {
    if (!ZK())
      ZL(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\input\DragIntercepted.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */