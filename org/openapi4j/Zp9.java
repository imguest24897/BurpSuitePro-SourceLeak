package org.openapi4j;

import burp.Zbqc;
import com.fasterxml.Zyx;
import java.util.HashMap;
import java.util.Map;

public class Zp9 extends Zc<Zp9> {
  private String url;
  
  private String description;
  
  private Map<String, Zpo> variables;
  
  public String getUrl() {
    return this.url;
  }
  
  public Zp9 setUrl(String paramString) {
    this.url = paramString;
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public Zp9 setDescription(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public Map<String, Zpo> getVariables() {
    return this.variables;
  }
  
  public Zp9 setVariables(Map<String, Zpo> paramMap) {
    this.variables = paramMap;
    return this;
  }
  
  public boolean hasVariable(String paramString) {
    return mapHas(this.variables, paramString);
  }
  
  public Zpo getVariable(String paramString) {
    return (Zpo)mapGet(this.variables, paramString);
  }
  
  public Zp9 setVariable(String paramString, Zpo paramZpo) {
    if (this.variables == null)
      this.variables = new HashMap<>(); 
    this.variables.put(paramString, paramZpo);
    return this;
  }
  
  public Zp9 removeVariable(String paramString) {
    mapRemove(this.variables, paramString);
    return this;
  }
  
  @Zyx
  public String getDefaultUrl() {
    String str = this.url;
    Zbqc[] arrayOfZbqc = Zc.ZL();
    if (getVariables() != null)
      for (Map.Entry<String, Zpo> entry : getVariables().entrySet()) {
        str = str.replace("{" + (String)entry.getKey() + "}", ((Zpo)entry.getValue()).getDefault());
        if (arrayOfZbqc != null)
          break; 
      }  
    return str;
  }
  
  public Zp9 copy() {
    Zp9 zp9 = new Zp9();
    zp9.setUrl(getUrl());
    zp9.setDescription(getDescription());
    zp9.setVariables(copyMap(getVariables()));
    zp9.setExtensions(copySimpleMap(getExtensions()));
    return zp9;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zp9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */