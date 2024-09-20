package net.portswigger.swagger.v3.parser.core.models;

import burp.Zbqc;
import java.net.URL;
import java.util.Objects;
import java.util.function.Predicate;

public class AuthorizationValue {
  private String value;
  
  private String type;
  
  private String keyName;
  
  private Predicate<URL> urlMatcher;
  
  private static int[] ZL;
  
  public AuthorizationValue() {}
  
  public AuthorizationValue(String paramString1, String paramString2, String paramString3, Predicate<URL> paramPredicate) {
    setKeyName(paramString1);
    setValue(paramString2);
    setType(paramString3);
    int[] arrayOfInt = ZA();
    setUrlMatcher(paramPredicate);
    if (Zbqc.Zwu() == null)
      Zb(new int[1]); 
  }
  
  public AuthorizationValue(String paramString1, String paramString2, String paramString3) {
    this(paramString1, paramString2, paramString3, AuthorizationValue::lambda$new$0);
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
  
  public AuthorizationValue urlMatcher(Predicate<URL> paramPredicate) {
    setUrlMatcher(paramPredicate);
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
  
  public Predicate<URL> getUrlMatcher() {
    return this.urlMatcher;
  }
  
  public void setUrlMatcher(Predicate<URL> paramPredicate) {
    this.urlMatcher = Objects.<Predicate<URL>>requireNonNull(paramPredicate);
  }
  
  public int hashCode() {
    byte b = 31;
    int i = 1;
    int[] arrayOfInt = ZA();
    i = 31 * i + ((this.keyName == null) ? 0 : this.keyName.hashCode());
    i = 31 * i + ((this.type == null) ? 0 : this.type.hashCode());
    i = 31 * i + ((this.value == null) ? 0 : this.value.hashCode());
    i = 31 * i + this.urlMatcher.hashCode();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[3]); 
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
    return !!this.urlMatcher.equals(authorizationValue.urlMatcher);
  }
  
  private static boolean lambda$new$0(URL paramURL) {
    return true;
  }
  
  public static void Zb(int[] paramArrayOfint) {
    ZL = paramArrayOfint;
  }
  
  public static int[] ZA() {
    return ZL;
  }
  
  static {
    if (ZA() == null)
      Zb(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\core\models\AuthorizationValue.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */