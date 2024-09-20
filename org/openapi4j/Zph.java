package org.openapi4j;

public class Zph extends Zc<Zph> {
  private String name;
  
  private String namespace;
  
  private String prefix;
  
  private Boolean attribute;
  
  private Boolean wrapped;
  
  public String getName() {
    return this.name;
  }
  
  public Zph setName(String paramString) {
    this.name = paramString;
    return this;
  }
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public Zph setNamespace(String paramString) {
    this.namespace = paramString;
    return this;
  }
  
  public String getPrefix() {
    return this.prefix;
  }
  
  public Zph setPrefix(String paramString) {
    this.prefix = paramString;
    return this;
  }
  
  public Boolean getAttribute() {
    return this.attribute;
  }
  
  public boolean isAttribute() {
    return Boolean.TRUE.equals(this.attribute);
  }
  
  public Zph setAttribute(Boolean paramBoolean) {
    this.attribute = paramBoolean;
    return this;
  }
  
  public Boolean getWrapped() {
    return this.wrapped;
  }
  
  public boolean isWrapped() {
    return Boolean.TRUE.equals(this.wrapped);
  }
  
  public Zph setWrapped(Boolean paramBoolean) {
    this.wrapped = paramBoolean;
    return this;
  }
  
  public Zph copy() {
    Zph zph = new Zph();
    zph.setName(getName());
    zph.setNamespace(getNamespace());
    zph.setPrefix(getPrefix());
    zph.setAttribute(getAttribute());
    zph.setWrapped(getWrapped());
    zph.setExtensions(copySimpleMap(getExtensions()));
    return zph;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zph.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */