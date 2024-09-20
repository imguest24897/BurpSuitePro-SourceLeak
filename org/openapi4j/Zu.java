package org.openapi4j;

public class Zu extends Zc<Zu> {
  private String summary;
  
  private String description;
  
  private Object value;
  
  private String externalValue;
  
  public String getSummary() {
    return this.summary;
  }
  
  public Zu setSummary(String paramString) {
    this.summary = paramString;
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public Zu setDescription(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public Object getValue() {
    return this.value;
  }
  
  public Zu setValue(Object paramObject) {
    this.value = paramObject;
    return this;
  }
  
  public String getExternalValue() {
    return this.externalValue;
  }
  
  public Zu setExternalValue(String paramString) {
    this.externalValue = paramString;
    return this;
  }
  
  public Zu copy() {
    Zu zu = new Zu();
    zu.setSummary(getSummary());
    zu.setDescription(getDescription());
    zu.setValue(getValue());
    zu.setExternalValue(getExternalValue());
    zu.setExtensions(copySimpleMap(getExtensions()));
    return zu;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */