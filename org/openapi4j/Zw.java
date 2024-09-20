package org.openapi4j;

import burp.Zbqc;
import com.fasterxml.Zy1;
import java.util.HashMap;
import java.util.Map;

public class Zw extends Zk<Zw> {
  @Zy1("content")
  private Map<String, Zpj> contentMediaTypes;
  
  private String description;
  
  private Boolean required;
  
  public String getDescription() {
    return this.description;
  }
  
  public Zw setDescription(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public Map<String, Zpj> getContentMediaTypes() {
    return this.contentMediaTypes;
  }
  
  public Zw setContentMediaTypes(Map<String, Zpj> paramMap) {
    this.contentMediaTypes = paramMap;
    return this;
  }
  
  public boolean hasContentMediaType(String paramString) {
    return mapHas(this.contentMediaTypes, paramString);
  }
  
  public Zpj getContentMediaType(String paramString) {
    return (Zpj)mapGet(this.contentMediaTypes, paramString);
  }
  
  public Zw setContentMediaType(String paramString, Zpj paramZpj) {
    if (this.contentMediaTypes == null)
      this.contentMediaTypes = new HashMap<>(); 
    this.contentMediaTypes.put(paramString, paramZpj);
    return this;
  }
  
  public Zw removeContentMediaType(String paramString) {
    mapRemove(this.contentMediaTypes, paramString);
    return this;
  }
  
  public Boolean getRequired() {
    return this.required;
  }
  
  public boolean isRequired() {
    return Boolean.TRUE.equals(this.required);
  }
  
  public Zw setRequired(Boolean paramBoolean) {
    this.required = paramBoolean;
    return this;
  }
  
  public Zw copy() {
    Zw zw = new Zw();
    Zbqc[] arrayOfZbqc = Zc.ZL();
    if (isRef()) {
      zw.setRef(getRef());
      zw.setCanonicalRef(getCanonicalRef());
      if (arrayOfZbqc != null) {
        zw.setDescription(getDescription());
        zw.setContentMediaTypes(copyMap(getContentMediaTypes()));
        zw.setRequired(getRequired());
        zw.setExtensions(copySimpleMap(getExtensions()));
        return zw;
      } 
      return zw;
    } 
    zw.setDescription(getDescription());
    zw.setContentMediaTypes(copyMap(getContentMediaTypes()));
    zw.setRequired(getRequired());
    zw.setExtensions(copySimpleMap(getExtensions()));
    return zw;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */