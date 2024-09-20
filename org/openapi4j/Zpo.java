package org.openapi4j;

import com.fasterxml.Zy1;
import java.util.List;

public class Zpo extends Zc<Zpo> {
  @Zy1("enum")
  private List<String> enums;
  
  @Zy1("default")
  private String defaultValue;
  
  private String description;
  
  public List<String> getEnums() {
    return this.enums;
  }
  
  public Zpo setEnums(List<String> paramList) {
    this.enums = paramList;
    return this;
  }
  
  public boolean hasEnums() {
    return (this.enums != null);
  }
  
  public Zpo addEnum(String paramString) {
    this.enums = listAdd(this.enums, paramString);
    return this;
  }
  
  public Zpo insertEnum(int paramInt, String paramString) {
    this.enums = listAdd(this.enums, paramInt, paramString);
    return this;
  }
  
  public Zpo removeEnum(String paramString) {
    listRemove(this.enums, paramString);
    return this;
  }
  
  public String getDefault() {
    return this.defaultValue;
  }
  
  public Zpo setDefault(String paramString) {
    this.defaultValue = paramString;
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public Zpo setDescription(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public Zpo copy() {
    Zpo zpo = new Zpo();
    zpo.setEnums(copySimpleList(getEnums()));
    zpo.setDefault(getDefault());
    zpo.setDescription(getDescription());
    zpo.setExtensions(copySimpleMap(getExtensions()));
    return zpo;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zpo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */