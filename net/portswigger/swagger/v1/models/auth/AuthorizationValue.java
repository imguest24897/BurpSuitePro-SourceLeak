package net.portswigger.swagger.v1.models.auth;

import burp.Zbqc;
import java.util.Objects;

public class AuthorizationValue {
  private String value;
  
  private String type;
  
  private String keyName;
  
  private UrlMatcher urlMatcher;
  
  public AuthorizationValue() {}
  
  public AuthorizationValue(String paramString1, String paramString2, String paramString3, UrlMatcher paramUrlMatcher) {
    setKeyName(paramString1);
    setValue(paramString2);
    setType(paramString3);
    setUrlMatcher(paramUrlMatcher);
  }
  
  public AuthorizationValue(String paramString1, String paramString2, String paramString3) {
    this(paramString1, paramString2, paramString3, new AuthorizationValue$1());
  }
  
  public AuthorizationValue value(String paramString) {
    this.value = paramString;
    return this;
  }
  
  public AuthorizationValue type(String paramString) {
    this.type = paramString;
    return this;
  }
  
  public AuthorizationValue keyName(String paramString) {
    this.keyName = paramString;
    return this;
  }
  
  public AuthorizationValue urlMatcher(UrlMatcher paramUrlMatcher) {
    setUrlMatcher(paramUrlMatcher);
    return this;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getKeyName() {
    return this.keyName;
  }
  
  public void setKeyName(String paramString) {
    this.keyName = paramString;
  }
  
  public UrlMatcher getUrlMatcher() {
    return this.urlMatcher;
  }
  
  public void setUrlMatcher(UrlMatcher paramUrlMatcher) {
    this.urlMatcher = Objects.<UrlMatcher>requireNonNull(paramUrlMatcher);
  }
  
  public int hashCode() {
    byte b = 31;
    Zbqc[] arrayOfZbqc = AbstractSecuritySchemeDefinition.ZS();
    int i = 1;
    i = 31 * i + ((this.keyName == null) ? 0 : this.keyName.hashCode());
    i = 31 * i + ((this.type == null) ? 0 : this.type.hashCode());
    i = 31 * i + ((this.value == null) ? 0 : this.value.hashCode());
    i = 31 * i + ((this.urlMatcher == null) ? 0 : this.urlMatcher.hashCode());
    if (Zbqc.Zwu() == null)
      AbstractSecuritySchemeDefinition.ZZ(new Zbqc[1]); 
    return i;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    AuthorizationValue authorizationValue = (AuthorizationValue)paramObject;
    if (this.keyName == null) {
      if (authorizationValue.keyName != null)
        return false; 
    } else if (!this.keyName.equals(authorizationValue.keyName)) {
      return false;
    } 
    if (this.type == null) {
      if (authorizationValue.type != null)
        return false; 
    } else if (!this.type.equals(authorizationValue.type)) {
      return false;
    } 
    if (this.value == null) {
      if (authorizationValue.value != null)
        return false; 
    } else if (!this.value.equals(authorizationValue.value)) {
      return false;
    } 
    if (this.urlMatcher == null) {
      if (authorizationValue.urlMatcher != null)
        return false; 
    } else if (!this.urlMatcher.equals(authorizationValue.urlMatcher) && !this.urlMatcher.equals(authorizationValue.urlMatcher)) {
      return false;
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\auth\AuthorizationValue.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */