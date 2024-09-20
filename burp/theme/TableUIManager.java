package burp.theme;

import java.awt.Component;
import java.awt.Window;
import java.util.Arrays;

public class TableUIManager {
  public static void setZebraStriping(boolean paramBoolean) {
    BurpTableBackgroundModifier.MODIFIER.setZebraStripeEnabled(paramBoolean);
    Arrays.<Window>stream(Window.getWindows()).forEach(Component::repaint);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\TableUIManager.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */