package net.portswigger.devtools.client.impl;

import java.util.Map;
import net.portswigger.browser.Zte;
import net.portswigger.devtools.protocol.types.input.MouseButton;

public class Zmq implements Zx4<MouseButton, Zte> {
  private static final Zmq ZM = new Zmq();
  
  private static final Map<MouseButton, Zte> ZW = Map.of(MouseButton.NONE, Zte.NONE, MouseButton.LEFT, Zte.LEFT, MouseButton.RIGHT, Zte.RIGHT, MouseButton.MIDDLE, Zte.MIDDLE, MouseButton.BACK, Zte.BACK, MouseButton.FORWARD, Zte.FORWARD);
  
  public static Zmq ZT() {
    return ZM;
  }
  
  public Map<MouseButton, Zte> Zp() {
    return ZW;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zmq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */