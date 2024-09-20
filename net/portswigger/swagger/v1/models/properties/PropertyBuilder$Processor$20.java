package net.portswigger.swagger.v1.models.properties;

import java.util.Map;
import net.portswigger.swagger.v1.models.Model;

enum PropertyBuilder$Processor$20 {
  protected boolean isType(String paramString1, String paramString2) {
    return StringProperty.isType(paramString1, paramString2);
  }
  
  protected StringProperty create() {
    return new StringProperty();
  }
  
  public Property merge(Property paramProperty, Map<PropertyBuilder$PropertyId, Object> paramMap) {
    super.merge(paramProperty, paramMap);
    if (paramProperty instanceof StringProperty)
      mergeString((StringProperty)paramProperty, paramMap); 
    return paramProperty;
  }
  
  public Model toModel(Property paramProperty) {
    return (Model)(isType(paramProperty) ? createStringModel((StringProperty)paramProperty) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder$Processor$20.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */