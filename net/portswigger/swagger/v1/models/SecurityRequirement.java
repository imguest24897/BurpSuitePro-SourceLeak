package net.portswigger.swagger.v1.models;

import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import com.fasterxml.Zyx;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SecurityRequirement {
  private String name;
  
  private List<String> scopes;
  
  private Map<String, List<String>> requirements = new LinkedHashMap<>();
  
  public SecurityRequirement() {}
  
  @Deprecated
  public SecurityRequirement(String paramString) {
    setName(paramString);
  }
  
  public SecurityRequirement scope(String paramString) {
    addScope(paramString);
    return this;
  }
  
  public SecurityRequirement requirement(String paramString, List<String> paramList) {
    if (this.requirements == null)
      this.requirements = new LinkedHashMap<>(); 
    if (paramList == null)
      paramList = new ArrayList<>(); 
    this.requirements.put(paramString, paramList);
    return this;
  }
  
  public SecurityRequirement requirement(String paramString) {
    return requirement(paramString, null);
  }
  
  @Zyx
  @Deprecated
  public String getName() {
    return this.name;
  }
  
  @Deprecated
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  @Deprecated
  public List<String> getScopes() {
    return this.scopes;
  }
  
  @Deprecated
  public void setScopes(List<String> paramList) {
    this.scopes = paramList;
  }
  
  public void addScope(String paramString) {
    if (this.scopes == null)
      this.scopes = new ArrayList<>(); 
    this.scopes.add(paramString);
  }
  
  @Zyi
  public Map<String, List<String>> getRequirements() {
    return this.requirements;
  }
  
  @Zv8
  public void setRequirements(String paramString, List<String> paramList) {
    this.requirements.put(paramString, paramList);
  }
  
  public int hashCode() {
    byte b = 31;
    null = 1;
    null = 31 * null + ((this.name == null) ? 0 : this.name.hashCode());
    null = 31 * null + ((this.scopes == null) ? 0 : this.scopes.hashCode());
    return 31 * null + ((this.requirements == null) ? 0 : this.requirements.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    SecurityRequirement securityRequirement = (SecurityRequirement)paramObject;
    if (this.name == null) {
      if (securityRequirement.name != null)
        return false; 
    } else if (!this.name.equals(securityRequirement.name)) {
      return false;
    } 
    if (this.scopes == null) {
      if (securityRequirement.scopes != null)
        return false; 
    } else if (!this.scopes.equals(securityRequirement.scopes)) {
      return false;
    } 
    if (this.requirements == null) {
      if (securityRequirement.requirements != null)
        return false; 
    } else if (!this.requirements.equals(securityRequirement.requirements)) {
      return false;
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\SecurityRequirement.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */