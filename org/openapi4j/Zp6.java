package org.openapi4j;

import java.util.Map;

public class Zp6 extends Zt<Zp6> {
  private Map<String, String> mapping;
  
  private String propertyName;
  
  public String getPropertyName() {
    return this.propertyName;
  }
  
  public Zp6 setPropertyName(String paramString) {
    this.propertyName = paramString;
    return this;
  }
  
  public Map<String, String> getMapping() {
    return this.mapping;
  }
  
  public Zp6 setMapping(Map<String, String> paramMap) {
    this.mapping = paramMap;
    return this;
  }
  
  public Zp6 copy() {
    Zp6 zp6 = new Zp6();
    zp6.setPropertyName(getPropertyName());
    zp6.setMapping(copySimpleMap(getMapping()));
    return zp6;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zp6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */