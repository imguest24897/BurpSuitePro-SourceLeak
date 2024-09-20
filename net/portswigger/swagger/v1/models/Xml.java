package net.portswigger.swagger.v1.models;

public class Xml {
  private String name;
  
  private String namespace;
  
  private String prefix;
  
  private Boolean attribute;
  
  private Boolean wrapped;
  
  public Xml name(String paramString) {
    setName(paramString);
    return this;
  }
  
  public Xml namespace(String paramString) {
    setNamespace(paramString);
    return this;
  }
  
  public Xml prefix(String paramString) {
    setPrefix(paramString);
    return this;
  }
  
  public Xml attribute(Boolean paramBoolean) {
    setAttribute(paramBoolean);
    return this;
  }
  
  public Xml wrapped(Boolean paramBoolean) {
    setWrapped(paramBoolean);
    return this;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public void setNamespace(String paramString) {
    this.namespace = paramString;
  }
  
  public String getPrefix() {
    return this.prefix;
  }
  
  public void setPrefix(String paramString) {
    this.prefix = paramString;
  }
  
  public Boolean getAttribute() {
    return this.attribute;
  }
  
  public void setAttribute(Boolean paramBoolean) {
    this.attribute = paramBoolean;
  }
  
  public Boolean getWrapped() {
    return this.wrapped;
  }
  
  public void setWrapped(Boolean paramBoolean) {
    this.wrapped = paramBoolean;
  }
  
  public int hashCode() {
    byte b = 31;
    null = 1;
    null = 31 * null + ((this.attribute == null) ? 0 : this.attribute.hashCode());
    null = 31 * null + ((this.name == null) ? 0 : this.name.hashCode());
    null = 31 * null + ((this.namespace == null) ? 0 : this.namespace.hashCode());
    null = 31 * null + ((this.prefix == null) ? 0 : this.prefix.hashCode());
    return 31 * null + ((this.wrapped == null) ? 0 : this.wrapped.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    Xml xml = (Xml)paramObject;
    if (this.attribute == null) {
      if (xml.attribute != null)
        return false; 
    } else if (!this.attribute.equals(xml.attribute)) {
      return false;
    } 
    if (this.name == null) {
      if (xml.name != null)
        return false; 
    } else if (!this.name.equals(xml.name)) {
      return false;
    } 
    if (this.namespace == null) {
      if (xml.namespace != null)
        return false; 
    } else if (!this.namespace.equals(xml.namespace)) {
      return false;
    } 
    if (this.prefix == null) {
      if (xml.prefix != null)
        return false; 
    } else if (!this.prefix.equals(xml.prefix)) {
      return false;
    } 
    if (this.wrapped == null) {
      if (xml.wrapped != null)
        return false; 
    } else if (!this.wrapped.equals(xml.wrapped)) {
      return false;
    } 
    return true;
  }
  
  public Object clone() {
    return (new Xml()).attribute((this.attribute == null) ? null : Boolean.valueOf(this.attribute.booleanValue())).name(this.name).namespace(this.namespace).prefix(this.prefix).wrapped((this.wrapped == null) ? null : Boolean.valueOf(this.wrapped.booleanValue()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\Xml.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */