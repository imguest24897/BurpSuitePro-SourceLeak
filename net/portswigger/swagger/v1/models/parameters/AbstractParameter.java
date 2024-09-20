package net.portswigger.swagger.v1.models.parameters;

import burp.Zbqc;
import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class AbstractParameter {
  private Map<String, Object> vendorExtensions = new LinkedHashMap<>();
  
  protected String in;
  
  protected String name;
  
  protected String description;
  
  protected boolean required = false;
  
  protected String access;
  
  protected String pattern;
  
  protected Boolean readOnly;
  
  private static Zbqc[] Zw;
  
  private static final String a;
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof AbstractParameter))
      return false; 
    AbstractParameter abstractParameter = (AbstractParameter)paramObject;
    return (this.required != abstractParameter.required) ? false : (((this.vendorExtensions != null) ? !this.vendorExtensions.equals(abstractParameter.vendorExtensions) : (abstractParameter.vendorExtensions != null)) ? false : (((this.in != null) ? !this.in.equals(abstractParameter.in) : (abstractParameter.in != null)) ? false : (((this.name != null) ? !this.name.equals(abstractParameter.name) : (abstractParameter.name != null)) ? false : (((this.description != null) ? !this.description.equals(abstractParameter.description) : (abstractParameter.description != null)) ? false : (((this.access != null) ? !this.access.equals(abstractParameter.access) : (abstractParameter.access != null)) ? false : (((this.pattern != null) ? !this.pattern.equals(abstractParameter.pattern) : (abstractParameter.pattern != null)) ? false : ((this.readOnly != null) ? this.readOnly.equals(abstractParameter.readOnly) : ((abstractParameter.readOnly == null)))))))));
  }
  
  public int hashCode() {
    Zbqc[] arrayOfZbqc = Zz();
    int i = (this.vendorExtensions != null) ? this.vendorExtensions.hashCode() : 0;
    i = 31 * i + ((this.in != null) ? this.in.hashCode() : 0);
    i = 31 * i + ((this.name != null) ? this.name.hashCode() : 0);
    i = 31 * i + ((this.description != null) ? this.description.hashCode() : 0);
    i = 31 * i + (this.required ? 1 : 0);
    i = 31 * i + ((this.access != null) ? this.access.hashCode() : 0);
    i = 31 * i + ((this.pattern != null) ? this.pattern.hashCode() : 0);
    i = 31 * i + ((this.readOnly != null) ? this.readOnly.hashCode() : 0);
    if (Zbqc.Zwu() == null)
      ZH(new Zbqc[1]); 
    return i;
  }
  
  public String getIn() {
    return this.in;
  }
  
  public void setIn(String paramString) {
    this.in = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public boolean getRequired() {
    return this.required;
  }
  
  public void setRequired(boolean paramBoolean) {
    this.required = paramBoolean;
  }
  
  public String getAccess() {
    return this.access;
  }
  
  public Boolean isReadOnly() {
    return this.readOnly;
  }
  
  public void setReadOnly(Boolean paramBoolean) {
    this.readOnly = paramBoolean;
  }
  
  public void setAccess(String paramString) {
    this.access = paramString;
  }
  
  public String getPattern() {
    return this.pattern;
  }
  
  public void setPattern(String paramString) {
    this.pattern = paramString;
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
  
  public static void ZH(Zbqc[] paramArrayOfZbqc) {
    Zw = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zz() {
    return Zw;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zz : ()[Lburp/Zbqc;
    //   3: ifnull -> 13
    //   6: iconst_4
    //   7: anewarray burp/Zbqc
    //   10: invokestatic ZH : ([Lburp/Zbqc;)V
    //   13: bipush #69
    //   15: ldc 'Q'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic net/portswigger/swagger/v1/models/parameters/AbstractParameter.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #42
    //   94: goto -> 124
    //   97: bipush #57
    //   99: goto -> 124
    //   102: bipush #104
    //   104: goto -> 124
    //   107: bipush #64
    //   109: goto -> 124
    //   112: bipush #74
    //   114: goto -> 124
    //   117: bipush #39
    //   119: goto -> 124
    //   122: bipush #47
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\parameters\AbstractParameter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */