package net.portswigger.swagger.v1.models;

import net.portswigger.swagger.v1.models.properties.Property;

public class ArrayModel extends AbstractModel {
  private String type = b;
  
  private String description;
  
  private Property items;
  
  private Boolean uniqueItems;
  
  private Object example;
  
  private Integer minItems;
  
  private Integer maxItems;
  
  private static final String b;
  
  public ArrayModel description(String paramString) {
    setDescription(paramString);
    return this;
  }
  
  public ArrayModel items(Property paramProperty) {
    setItems(paramProperty);
    return this;
  }
  
  public ArrayModel uniqueItems(Boolean paramBoolean) {
    setUniqueItems(paramBoolean);
    return this;
  }
  
  public ArrayModel minItems(int paramInt) {
    setMinItems(Integer.valueOf(paramInt));
    return this;
  }
  
  public ArrayModel maxItems(int paramInt) {
    setMaxItems(Integer.valueOf(paramInt));
    return this;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public Property getItems() {
    return this.items;
  }
  
  public Boolean getUniqueItems() {
    return this.uniqueItems;
  }
  
  public void setItems(Property paramProperty) {
    this.items = paramProperty;
  }
  
  public void setUniqueItems(Boolean paramBoolean) {
    this.uniqueItems = paramBoolean;
  }
  
  public Object getExample() {
    return this.example;
  }
  
  public void setExample(Object paramObject) {
    this.example = paramObject;
  }
  
  public Integer getMinItems() {
    return this.minItems;
  }
  
  public void setMinItems(Integer paramInteger) {
    this.minItems = paramInteger;
  }
  
  public Integer getMaxItems() {
    return this.maxItems;
  }
  
  public void setMaxItems(Integer paramInteger) {
    this.maxItems = paramInteger;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof ArrayModel))
      return false; 
    if (!super.equals(paramObject))
      return false; 
    ArrayModel arrayModel = (ArrayModel)paramObject;
    return ((this.properties != null) ? !this.properties.equals(arrayModel.properties) : (arrayModel.properties != null)) ? false : (((this.type != null) ? !this.type.equals(arrayModel.type) : (arrayModel.type != null)) ? false : (((this.description != null) ? !this.description.equals(arrayModel.description) : (arrayModel.description != null)) ? false : (((this.items != null) ? !this.items.equals(arrayModel.items) : (arrayModel.items != null)) ? false : (((this.uniqueItems != null) ? !this.uniqueItems.equals(arrayModel.uniqueItems) : (arrayModel.uniqueItems != null)) ? false : (((this.example != null) ? !this.example.equals(arrayModel.example) : (arrayModel.example != null)) ? false : (((this.minItems != null) ? !this.minItems.equals(arrayModel.minItems) : (arrayModel.minItems != null)) ? false : ((this.maxItems != null) ? this.maxItems.equals(arrayModel.maxItems) : ((arrayModel.maxItems == null)))))))));
  }
  
  public int hashCode() {
    null = super.hashCode();
    null = 31 * null + ((this.type != null) ? this.type.hashCode() : 0);
    null = 31 * null + ((this.description != null) ? this.description.hashCode() : 0);
    null = 31 * null + ((this.items != null) ? this.items.hashCode() : 0);
    null = 31 * null + ((this.uniqueItems != null) ? this.uniqueItems.hashCode() : 0);
    null = 31 * null + ((this.example != null) ? this.example.hashCode() : 0);
    null = 31 * null + ((this.minItems != null) ? this.minItems.hashCode() : 0);
    return 31 * null + ((this.maxItems != null) ? this.maxItems.hashCode() : 0);
  }
  
  public Object clone() {
    ArrayModel arrayModel = new ArrayModel();
    cloneTo(arrayModel);
    arrayModel.type = this.type;
    arrayModel.description = this.description;
    arrayModel.items = this.items;
    arrayModel.example = this.example;
    arrayModel.maxItems = this.maxItems;
    arrayModel.minItems = this.minItems;
    return arrayModel;
  }
  
  static {
    // Byte code:
    //   0: bipush #33
    //   2: ldc 'W:%z<'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/swagger/v1/models/ArrayModel.b : Ljava/lang/String;
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
    //   80: bipush #23
    //   82: goto -> 112
    //   85: bipush #105
    //   87: goto -> 112
    //   90: bipush #118
    //   92: goto -> 112
    //   95: bipush #58
    //   97: goto -> 112
    //   100: bipush #100
    //   102: goto -> 112
    //   105: bipush #92
    //   107: goto -> 112
    //   110: bipush #54
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\ArrayModel.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */