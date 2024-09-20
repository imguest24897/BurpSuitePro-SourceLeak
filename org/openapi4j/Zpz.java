package org.openapi4j;

import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Zpz extends Zt<Zpz> {
  private Map<String, List<String>> requirements;
  
  @Zyi
  public Map<String, List<String>> getRequirements() {
    return this.requirements;
  }
  
  public Zpz setRequirements(Map<String, List<String>> paramMap) {
    this.requirements = paramMap;
    return this;
  }
  
  public boolean hasRequirement(String paramString) {
    return mapHas(this.requirements, paramString);
  }
  
  public boolean hasRequirementScopes(String paramString) {
    List list = (List)mapGet(this.requirements, paramString);
    return (list != null && !list.isEmpty());
  }
  
  public List<String> getRequirement(String paramString) {
    return (List<String>)mapGet(this.requirements, paramString);
  }
  
  @Zv8
  public Zpz setRequirement(String paramString, List<String> paramList) {
    if (this.requirements == null)
      this.requirements = new HashMap<>(); 
    this.requirements.put(paramString, paramList);
    return this;
  }
  
  public Zpz removeRequirement(String paramString) {
    mapRemove(this.requirements, paramString);
    return this;
  }
  
  public Zpz copy() {
    Zpz zpz = new Zpz();
    zpz.setRequirements(copySimpleMap(getRequirements()));
    return zpz;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zpz zpz = (Zpz)paramObject;
    return Objects.equals(this.requirements, zpz.requirements);
  }
  
  public int hashCode() {
    return (this.requirements != null) ? this.requirements.hashCode() : 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zpz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */