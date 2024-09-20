package net.portswigger.swagger.v1.models;

import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import java.util.LinkedHashMap;
import java.util.Map;

public class Info {
  private String description;
  
  private String version;
  
  private String title;
  
  private String termsOfService;
  
  private Contact contact;
  
  private License license;
  
  private Map<String, Object> vendorExtensions = new LinkedHashMap<>();
  
  private static final String a;
  
  public Info version(String paramString) {
    setVersion(paramString);
    return this;
  }
  
  public Info title(String paramString) {
    setTitle(paramString);
    return this;
  }
  
  public Info description(String paramString) {
    setDescription(paramString);
    return this;
  }
  
  public Info termsOfService(String paramString) {
    setTermsOfService(paramString);
    return this;
  }
  
  public Info contact(Contact paramContact) {
    setContact(paramContact);
    return this;
  }
  
  public Info license(License paramLicense) {
    setLicense(paramLicense);
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public String getTitle() {
    return this.title;
  }
  
  public void setTitle(String paramString) {
    this.title = paramString;
  }
  
  public String getTermsOfService() {
    return this.termsOfService;
  }
  
  public void setTermsOfService(String paramString) {
    this.termsOfService = paramString;
  }
  
  public Contact getContact() {
    return this.contact;
  }
  
  public void setContact(Contact paramContact) {
    this.contact = paramContact;
  }
  
  public License getLicense() {
    return this.license;
  }
  
  public void setLicense(License paramLicense) {
    this.license = paramLicense;
  }
  
  public Info mergeWith(Info paramInfo) {
    if (paramInfo != null) {
      if (this.description == null)
        this.description = paramInfo.description; 
      if (this.version == null)
        this.version = paramInfo.version; 
      if (this.title == null)
        this.title = paramInfo.title; 
      if (this.termsOfService == null)
        this.termsOfService = paramInfo.termsOfService; 
      if (this.contact == null)
        this.contact = paramInfo.contact; 
      if (this.license == null)
        this.license = paramInfo.license; 
      if (this.vendorExtensions == null)
        this.vendorExtensions = paramInfo.vendorExtensions; 
    } 
    return this;
  }
  
  @Zyi
  public Map<String, Object> getVendorExtensions() {
    return this.vendorExtensions;
  }
  
  @Zv8
  public void setVendorExtension(String paramString, Object paramObject) {
    if (paramString.startsWith(a))
      this.vendorExtensions.put(paramString, paramObject); 
  }
  
  public void setVendorExtensions(Map<String, Object> paramMap) {
    this.vendorExtensions = paramMap;
  }
  
  public int hashCode() {
    byte b = 31;
    null = 1;
    null = 31 * null + ((this.contact == null) ? 0 : this.contact.hashCode());
    null = 31 * null + ((this.description == null) ? 0 : this.description.hashCode());
    null = 31 * null + ((this.license == null) ? 0 : this.license.hashCode());
    null = 31 * null + ((this.termsOfService == null) ? 0 : this.termsOfService.hashCode());
    null = 31 * null + ((this.title == null) ? 0 : this.title.hashCode());
    null = 31 * null + ((this.vendorExtensions == null) ? 0 : this.vendorExtensions.hashCode());
    return 31 * null + ((this.version == null) ? 0 : this.version.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    Info info = (Info)paramObject;
    if (this.contact == null) {
      if (info.contact != null)
        return false; 
    } else if (!this.contact.equals(info.contact)) {
      return false;
    } 
    if (this.description == null) {
      if (info.description != null)
        return false; 
    } else if (!this.description.equals(info.description)) {
      return false;
    } 
    if (this.license == null) {
      if (info.license != null)
        return false; 
    } else if (!this.license.equals(info.license)) {
      return false;
    } 
    if (this.termsOfService == null) {
      if (info.termsOfService != null)
        return false; 
    } else if (!this.termsOfService.equals(info.termsOfService)) {
      return false;
    } 
    if (this.title == null) {
      if (info.title != null)
        return false; 
    } else if (!this.title.equals(info.title)) {
      return false;
    } 
    if (this.vendorExtensions == null) {
      if (info.vendorExtensions != null)
        return false; 
    } else if (!this.vendorExtensions.equals(info.vendorExtensions)) {
      return false;
    } 
    if (this.version == null) {
      if (info.version != null)
        return false; 
    } else if (!this.version.equals(info.version)) {
      return false;
    } 
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: ldc 'yz'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/swagger/v1/models/Info.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #12
    //   82: goto -> 112
    //   85: bipush #90
    //   87: goto -> 112
    //   90: bipush #116
    //   92: goto -> 112
    //   95: bipush #62
    //   97: goto -> 112
    //   100: bipush #65
    //   102: goto -> 112
    //   105: bipush #51
    //   107: goto -> 112
    //   110: bipush #41
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\Info.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */