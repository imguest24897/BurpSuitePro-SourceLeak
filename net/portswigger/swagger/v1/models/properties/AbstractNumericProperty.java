package net.portswigger.swagger.v1.models.properties;

import java.math.BigDecimal;

public abstract class AbstractNumericProperty extends AbstractProperty implements Property {
  protected BigDecimal minimum;
  
  protected BigDecimal maximum;
  
  protected BigDecimal multipleOf;
  
  protected Boolean exclusiveMinimum;
  
  protected Boolean exclusiveMaximum;
  
  public AbstractNumericProperty minimum(BigDecimal paramBigDecimal) {
    setMinimum(paramBigDecimal);
    return this;
  }
  
  public AbstractNumericProperty maximum(BigDecimal paramBigDecimal) {
    setMaximum(paramBigDecimal);
    return this;
  }
  
  public AbstractNumericProperty exclusiveMinimum(Boolean paramBoolean) {
    setExclusiveMinimum(paramBoolean);
    return this;
  }
  
  public AbstractNumericProperty exclusiveMaximum(Boolean paramBoolean) {
    setExclusiveMaximum(paramBoolean);
    return this;
  }
  
  public AbstractNumericProperty multipleOf(BigDecimal paramBigDecimal) {
    setMultipleOf(paramBigDecimal);
    return this;
  }
  
  public BigDecimal getMinimum() {
    return this.minimum;
  }
  
  public void setMinimum(BigDecimal paramBigDecimal) {
    this.minimum = paramBigDecimal;
  }
  
  public BigDecimal getMaximum() {
    return this.maximum;
  }
  
  public void setMaximum(BigDecimal paramBigDecimal) {
    this.maximum = paramBigDecimal;
  }
  
  public Boolean getExclusiveMinimum() {
    return this.exclusiveMinimum;
  }
  
  public void setExclusiveMinimum(Boolean paramBoolean) {
    this.exclusiveMinimum = paramBoolean;
  }
  
  public Boolean getExclusiveMaximum() {
    return this.exclusiveMaximum;
  }
  
  public void setExclusiveMaximum(Boolean paramBoolean) {
    this.exclusiveMaximum = paramBoolean;
  }
  
  public BigDecimal getMultipleOf() {
    return this.multipleOf;
  }
  
  public void setMultipleOf(BigDecimal paramBigDecimal) {
    this.multipleOf = paramBigDecimal;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof AbstractNumericProperty))
      return false; 
    if (!super.equals(paramObject))
      return false; 
    AbstractNumericProperty abstractNumericProperty = (AbstractNumericProperty)paramObject;
    return ((this.minimum != null) ? !this.minimum.equals(abstractNumericProperty.minimum) : (abstractNumericProperty.minimum != null)) ? false : (((this.maximum != null) ? !this.maximum.equals(abstractNumericProperty.maximum) : (abstractNumericProperty.maximum != null)) ? false : (((this.multipleOf != null) ? !this.multipleOf.equals(abstractNumericProperty.multipleOf) : (abstractNumericProperty.multipleOf != null)) ? false : (((this.exclusiveMinimum != null) ? !this.exclusiveMinimum.equals(abstractNumericProperty.exclusiveMinimum) : (abstractNumericProperty.exclusiveMinimum != null)) ? false : ((this.exclusiveMaximum != null) ? this.exclusiveMaximum.equals(abstractNumericProperty.exclusiveMaximum) : ((abstractNumericProperty.exclusiveMaximum == null))))));
  }
  
  public int hashCode() {
    null = super.hashCode();
    null = 31 * null + ((this.minimum != null) ? this.minimum.hashCode() : 0);
    null = 31 * null + ((this.maximum != null) ? this.maximum.hashCode() : 0);
    null = 31 * null + ((this.multipleOf != null) ? this.multipleOf.hashCode() : 0);
    null = 31 * null + ((this.exclusiveMinimum != null) ? this.exclusiveMinimum.hashCode() : 0);
    return 31 * null + ((this.exclusiveMaximum != null) ? this.exclusiveMaximum.hashCode() : 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\AbstractNumericProperty.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */