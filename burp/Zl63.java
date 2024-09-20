package burp;

import burp.api.montoya.utilities.json.JsonArrayNode;
import burp.api.montoya.utilities.json.JsonObjectNode;
import burp.api.montoya.utilities.json.JsonStringNode;
import java.util.Objects;

public class Zl63 extends Zl6n implements JsonStringNode {
  private final String ZO;
  
  Zl63(String paramString) {
    this.ZO = paramString;
  }
  
  public String getValue() {
    return this.ZO;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zl63 zl63 = (Zl63)paramObject;
    return Objects.equals(this.ZO, zl63.ZO);
  }
  
  public int hashCode() {
    return Objects.hashCode(this.ZO);
  }
  
  public String asString() {
    return getValue();
  }
  
  Zlre ZI() {
    return Zlre.STRING;
  }
  
  public static JsonStringNode ZK(String paramString) {
    return new Zl63(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl63.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */