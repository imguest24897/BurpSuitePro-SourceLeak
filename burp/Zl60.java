package burp;

import burp.api.montoya.utilities.json.JsonArrayNode;
import burp.api.montoya.utilities.json.JsonBooleanNode;
import burp.api.montoya.utilities.json.JsonObjectNode;
import java.util.Objects;

public class Zl60 extends Zl6n implements JsonBooleanNode {
  private final Boolean Ze;
  
  Zl60(Boolean paramBoolean) {
    this.Ze = paramBoolean;
  }
  
  public Boolean getValue() {
    return this.Ze;
  }
  
  public Boolean asBoolean() {
    return getValue();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zl60 zl60 = (Zl60)paramObject;
    return Objects.equals(this.Ze, zl60.Ze);
  }
  
  public int hashCode() {
    return Objects.hashCode(this.Ze);
  }
  
  Zlre ZI() {
    return Zlre.BOOLEAN;
  }
  
  public static JsonBooleanNode Zw(boolean paramBoolean) {
    return new Zl60(Boolean.valueOf(paramBoolean));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl60.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */