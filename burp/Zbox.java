package burp;

import burp.api.montoya.http.message.params.ParsedHttpParameter;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbox implements IParameter {
  private final ParsedHttpParameter ZI;
  
  public static IParameter ZT(ParsedHttpParameter paramParsedHttpParameter) {
    return new Zrlk(new Zbox(paramParsedHttpParameter));
  }
  
  private Zbox(ParsedHttpParameter paramParsedHttpParameter) {
    this.ZI = paramParsedHttpParameter;
  }
  
  public byte getType() {
    switch (Zx8y.Zf[this.ZI.type().ordinal()]) {
      case 1:
        return 0;
      case 2:
        return 1;
      case 3:
        return 2;
      case 4:
        return 3;
      case 5:
        return 4;
      case 6:
        return 5;
      case 7:
        return 6;
    } 
    Zuh.ZT(false, Zqf.Zk, this.ZI.type().toString());
    return 0;
  }
  
  public String getName() {
    return this.ZI.name();
  }
  
  public String getValue() {
    return this.ZI.value();
  }
  
  public int getNameStart() {
    return this.ZI.nameOffsets().startIndexInclusive();
  }
  
  public int getNameEnd() {
    return this.ZI.nameOffsets().endIndexExclusive();
  }
  
  public int getValueStart() {
    return this.ZI.valueOffsets().startIndexInclusive();
  }
  
  public int getValueEnd() {
    return this.ZI.valueOffsets().endIndexExclusive();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbox.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */