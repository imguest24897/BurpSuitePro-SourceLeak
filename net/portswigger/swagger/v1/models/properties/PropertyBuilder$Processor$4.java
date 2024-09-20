package net.portswigger.swagger.v1.models.properties;

enum PropertyBuilder$Processor$4 {
  protected boolean isType(String paramString1, String paramString2) {
    return DateProperty.isType(paramString1, paramString2);
  }
  
  protected DateProperty create() {
    return new DateProperty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder$Processor$4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */