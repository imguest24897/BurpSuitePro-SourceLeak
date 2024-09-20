package net.portswigger.swagger.v1.models;

public class SecurityScope {
  private String name;
  
  private String description;
  
  public SecurityScope() {}
  
  public SecurityScope(String paramString1, String paramString2) {
    this.name = paramString1;
    this.description = paramString2;
  }
  
  public SecurityScope name(String paramString) {
    setName(paramString);
    return this;
  }
  
  public SecurityScope description(String paramString) {
    setDescription(paramString);
    return this;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public int hashCode() {
    byte b = 31;
    null = 1;
    null = 31 * null + ((this.description == null) ? 0 : this.description.hashCode());
    return 31 * null + ((this.name == null) ? 0 : this.name.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    SecurityScope securityScope = (SecurityScope)paramObject;
    if (this.description == null) {
      if (securityScope.description != null)
        return false; 
    } else if (!this.description.equals(securityScope.description)) {
      return false;
    } 
    if (this.name == null) {
      if (securityScope.name != null)
        return false; 
    } else if (!this.name.equals(securityScope.name)) {
      return false;
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\SecurityScope.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */