package burp;

import burp.api.montoya.core.ToolSource;
import burp.api.montoya.core.ToolType;
import java.util.Arrays;

public class Zz10 implements ToolSource {
  private final ToolType Zl;
  
  public Zz10(ToolType paramToolType) {
    this.Zl = paramToolType;
  }
  
  public ToolType toolType() {
    return this.Zl;
  }
  
  public boolean isFromTool(ToolType... paramVarArgs) {
    return Arrays.<ToolType>stream(paramVarArgs).anyMatch(this::lambda$isFromTool$0);
  }
  
  private boolean lambda$isFromTool$0(ToolType paramToolType) {
    return (paramToolType == this.Zl);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz10.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */