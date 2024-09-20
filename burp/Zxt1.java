package burp;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Zxt1 {
  public static boolean Zy(Component paramComponent, Object paramObject, String paramString, int paramInt) {
    return ZQ(paramComponent, paramObject, paramString, paramInt, null);
  }
  
  public static boolean ZQ(Component paramComponent, Object paramObject, String paramString, int paramInt, Icon paramIcon) {
    int i = JOptionPane.showOptionDialog(paramComponent, paramObject, paramString, 0, paramInt, paramIcon, null, null);
    return (i == 0);
  }
  
  private static Dimension Zo(Dimension paramDimension, int paramInt) {
    paramDimension.width = Math.max(paramDimension.width, paramInt);
    return paramDimension;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxt1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */