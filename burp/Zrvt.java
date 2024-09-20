package burp;

import burp.api.montoya.core.ToolSource;
import burp.api.montoya.core.ToolType;
import burp.api.montoya.ui.contextmenu.ComponentEvent;
import burp.api.montoya.ui.contextmenu.InvocationSource;
import burp.api.montoya.ui.contextmenu.InvocationType;
import java.awt.event.InputEvent;

public class Zrvt implements ComponentEvent, ToolSource, InvocationSource {
  private final Zezw ZB;
  
  private static String ZC;
  
  public Zrvt(Zezw paramZezw) {
    this.ZB = paramZezw;
  }
  
  public ToolType toolType() {
    Zeew zeew = this.ZB.ZQ();
    return (zeew == Zeew.SUITE) ? ToolType.SUITE : Zt6v.ZS(zeew.toolName);
  }
  
  public boolean isFromTool(ToolType... paramVarArgs) {
    return Zb99.<ToolType>Zh(paramVarArgs).contains(toolType());
  }
  
  public InputEvent inputEvent() {
    return this.ZB.ZZ();
  }
  
  public InvocationType invocationType() {
    return Zt6v.ZQ(this.ZB.ZR());
  }
  
  public boolean isFrom(InvocationType... paramVarArgs) {
    return Zb99.<InvocationType>Zh(paramVarArgs).contains(invocationType());
  }
  
  public static void ZH(String paramString) {
    ZC = paramString;
  }
  
  public static String ZJ() {
    return ZC;
  }
  
  static {
    if (ZJ() == null)
      ZH("ytUnlb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrvt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */