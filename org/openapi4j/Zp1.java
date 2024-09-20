package org.openapi4j;

public class Zp1 extends Zc<Zp1> {
  private Zq contact;
  
  private String description;
  
  private Zpw license;
  
  private String termsOfService;
  
  private String title;
  
  private String version;
  
  public String getTitle() {
    return this.title;
  }
  
  public Zp1 setTitle(String paramString) {
    this.title = paramString;
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public Zp1 setDescription(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public String getTermsOfService() {
    return this.termsOfService;
  }
  
  public Zp1 setTermsOfService(String paramString) {
    this.termsOfService = paramString;
    return this;
  }
  
  public Zq getContact() {
    return this.contact;
  }
  
  public Zp1 setContact(Zq paramZq) {
    this.contact = paramZq;
    return this;
  }
  
  public Zpw getLicense() {
    return this.license;
  }
  
  public Zp1 setLicense(Zpw paramZpw) {
    this.license = paramZpw;
    return this;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public Zp1 setVersion(String paramString) {
    this.version = paramString;
    return this;
  }
  
  public Zp1 copy() {
    Zp1 zp1 = new Zp1();
    zp1.setTitle(getTitle());
    zp1.setDescription(getDescription());
    zp1.setTermsOfService(getTermsOfService());
    zp1.setContact((Zq)copyField(getContact()));
    zp1.setLicense((Zpw)copyField(getLicense()));
    zp1.setVersion(getVersion());
    zp1.setExtensions(copySimpleMap(getExtensions()));
    return zp1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zp1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */