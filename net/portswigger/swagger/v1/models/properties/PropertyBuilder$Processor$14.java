package net.portswigger.swagger.v1.models.properties;

import java.util.Map;
import net.portswigger.swagger.v1.models.Model;

enum PropertyBuilder$Processor$14 {
  protected boolean isType(String paramString1, String paramString2) {
    return EmailProperty.isType(paramString1, paramString2);
  }
  
  protected EmailProperty create() {
    return new EmailProperty();
  }
  
  public Property merge(Property paramProperty, Map<PropertyBuilder$PropertyId, Object> paramMap) {
    super.merge(paramProperty, paramMap);
    if (paramProperty instanceof EmailProperty)
      mergeString((EmailProperty)paramProperty, paramMap); 
    return paramProperty;
  }
  
  public Model toModel(Property paramProperty) {
    return (Model)(isType(paramProperty) ? createStringModel((StringProperty)paramProperty) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder$Processor$14.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */