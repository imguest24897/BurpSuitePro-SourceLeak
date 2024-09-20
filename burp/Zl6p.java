package burp;

import burp.api.montoya.utilities.json.JsonArrayNode;
import burp.api.montoya.utilities.json.JsonNumberNode;
import burp.api.montoya.utilities.json.JsonObjectNode;
import java.util.Objects;

public class Zl6p extends Zl6n implements JsonNumberNode {
  private final Number Zx;
  
  Zl6p(Number paramNumber) {
    this.Zx = paramNumber;
  }
  
  public Number getValue() {
    return this.Zx;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zl6p zl6p = (Zl6p)paramObject;
    return Objects.equals(this.Zx, zl6p.Zx);
  }
  
  public Number asNumber() {
    return getValue();
  }
  
  public Long asLong() {
    return Long.valueOf(getValue().longValue());
  }
  
  public Double asDouble() {
    return Double.valueOf(getValue().doubleValue());
  }
  
  public int hashCode() {
    return Objects.hashCode(this.Zx);
  }
  
  Zlre ZI() {
    return Zlre.NUMBER;
  }
  
  public static JsonNumberNode Zh(Number paramNumber) {
    return new Zl6p(paramNumber);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl6p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */