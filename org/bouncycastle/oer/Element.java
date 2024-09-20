package org.bouncycastle.oer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;

public class Element {
  private final OERDefinition.BaseType baseType;
  
  private final List<Element> children;
  
  private final boolean explicit;
  
  private final String label;
  
  private final BigInteger lowerBound;
  
  private final BigInteger upperBound;
  
  private final boolean extensionsInDefinition;
  
  private final BigInteger enumValue;
  
  private final ASN1Encodable defaultValue;
  
  private final Switch aSwitch;
  
  private final boolean defaultValuesInChildren;
  
  private List<Element> optionalChildrenInOrder;
  
  private List<ASN1Encodable> validSwitchValues;
  
  private final ElementSupplier elementSupplier;
  
  private final boolean mayRecurse;
  
  private final String typeName;
  
  private final Map<String, ElementSupplier> supplierMap;
  
  private Element parent;
  
  private final int optionals;
  
  private final int block;
  
  public Element(OERDefinition.BaseType paramBaseType, List<Element> paramList, boolean paramBoolean1, String paramString1, BigInteger paramBigInteger1, BigInteger paramBigInteger2, boolean paramBoolean2, BigInteger paramBigInteger3, ASN1Encodable paramASN1Encodable, Switch paramSwitch, List<ASN1Encodable> paramList1, ElementSupplier paramElementSupplier, boolean paramBoolean3, String paramString2, Map<String, ElementSupplier> paramMap, int paramInt1, int paramInt2, boolean paramBoolean4) {
    this.baseType = paramBaseType;
    this.children = paramList;
    this.explicit = paramBoolean1;
    this.label = paramString1;
    this.lowerBound = paramBigInteger1;
    this.upperBound = paramBigInteger2;
    this.extensionsInDefinition = paramBoolean2;
    this.enumValue = paramBigInteger3;
    this.defaultValue = paramASN1Encodable;
    this.aSwitch = paramSwitch;
    this.validSwitchValues = (paramList1 != null) ? Collections.<ASN1Encodable>unmodifiableList(paramList1) : null;
    this.elementSupplier = paramElementSupplier;
    this.mayRecurse = paramBoolean3;
    this.typeName = paramString2;
    this.block = paramInt1;
    this.optionals = paramInt2;
    this.defaultValuesInChildren = paramBoolean4;
    if (paramMap == null) {
      this.supplierMap = Collections.emptyMap();
    } else {
      this.supplierMap = paramMap;
    } 
    for (Element element : paramList)
      element.parent = this; 
  }
  
  public Element(Element paramElement1, Element paramElement2) {
    this.baseType = paramElement1.baseType;
    this.children = new ArrayList<>(paramElement1.children);
    this.explicit = paramElement1.explicit;
    this.label = paramElement1.label;
    this.lowerBound = paramElement1.lowerBound;
    this.upperBound = paramElement1.upperBound;
    this.extensionsInDefinition = paramElement1.extensionsInDefinition;
    this.enumValue = paramElement1.enumValue;
    this.defaultValue = paramElement1.defaultValue;
    this.aSwitch = paramElement1.aSwitch;
    this.validSwitchValues = paramElement1.validSwitchValues;
    this.elementSupplier = paramElement1.elementSupplier;
    this.mayRecurse = paramElement1.mayRecurse;
    this.typeName = paramElement1.typeName;
    this.supplierMap = paramElement1.supplierMap;
    this.parent = paramElement2;
    this.block = paramElement1.block;
    this.optionals = paramElement1.optionals;
    this.defaultValuesInChildren = paramElement1.defaultValuesInChildren;
    for (Element element : this.children)
      element.parent = this; 
  }
  
  public static Element expandDeferredDefinition(Element paramElement1, Element paramElement2) {
    if (paramElement1.elementSupplier != null) {
      paramElement1 = paramElement1.elementSupplier.build();
      if (paramElement1.getParent() != paramElement2)
        paramElement1 = new Element(paramElement1, paramElement2); 
    } 
    return paramElement1;
  }
  
  public String rangeExpression() {
    return "(" + ((getLowerBound() != null) ? getLowerBound().toString() : "MIN") + " ... " + ((getUpperBound() != null) ? getUpperBound().toString() : "MAX") + ")";
  }
  
  public String appendLabel(String paramString) {
    return "[" + ((getLabel() == null) ? "" : getLabel()) + (isExplicit() ? " (E)" : "") + "] " + paramString;
  }
  
  public List<Element> optionalOrDefaultChildrenInOrder() {
    synchronized (this) {
      if (getOptionalChildrenInOrder() == null) {
        ArrayList<Element> arrayList = new ArrayList();
        for (Element element : getChildren()) {
          if (!element.isExplicit() || element.getDefaultValue() != null)
            arrayList.add(element); 
        } 
        this.optionalChildrenInOrder = Collections.unmodifiableList(arrayList);
      } 
      return getOptionalChildrenInOrder();
    } 
  }
  
  public boolean isUnbounded() {
    return (getUpperBound() == null && getLowerBound() == null);
  }
  
  public boolean isLowerRangeZero() {
    return BigInteger.ZERO.equals(getLowerBound());
  }
  
  public boolean isUnsignedWithRange() {
    return (isLowerRangeZero() && getUpperBound() != null && BigInteger.ZERO.compareTo(getUpperBound()) < 0);
  }
  
  public boolean canBeNegative() {
    return (getLowerBound() != null && BigInteger.ZERO.compareTo(getLowerBound()) > 0);
  }
  
  public int intBytesForRange() {
    if (getLowerBound() != null && getUpperBound() != null)
      if (BigInteger.ZERO.equals(getLowerBound())) {
        byte b = 0;
        for (int i = 1; b < OERDefinition.uIntMax.length; i *= 2) {
          if (getUpperBound().compareTo(OERDefinition.uIntMax[b]) < 0)
            return i; 
          b++;
        } 
      } else {
        byte b = 0;
        for (int i = 1; b < OERDefinition.sIntRange.length; i *= 2) {
          if (getLowerBound().compareTo(OERDefinition.sIntRange[b][0]) >= 0 && getUpperBound().compareTo(OERDefinition.sIntRange[b][1]) < 0)
            return -i; 
          b++;
        } 
      }  
    return 0;
  }
  
  public boolean hasPopulatedExtension() {
    return this.extensionsInDefinition;
  }
  
  public boolean hasDefaultChildren() {
    return this.defaultValuesInChildren;
  }
  
  public ASN1Encodable getDefaultValue() {
    return this.defaultValue;
  }
  
  public Element getFirstChid() {
    return getChildren().get(0);
  }
  
  public boolean isFixedLength() {
    return (getLowerBound() != null && getLowerBound().equals(getUpperBound()));
  }
  
  public String toString() {
    return "[" + this.typeName + " " + this.baseType.name() + " '" + getLabel() + "']";
  }
  
  public OERDefinition.BaseType getBaseType() {
    return this.baseType;
  }
  
  public List<Element> getChildren() {
    return this.children;
  }
  
  public boolean isExplicit() {
    return this.explicit;
  }
  
  public String getLabel() {
    return this.label;
  }
  
  public BigInteger getLowerBound() {
    return this.lowerBound;
  }
  
  public BigInteger getUpperBound() {
    return this.upperBound;
  }
  
  public boolean isExtensionsInDefinition() {
    return this.extensionsInDefinition;
  }
  
  public BigInteger getEnumValue() {
    return this.enumValue;
  }
  
  public Switch getaSwitch() {
    return this.aSwitch;
  }
  
  public List<Element> getOptionalChildrenInOrder() {
    return this.optionalChildrenInOrder;
  }
  
  public List<ASN1Encodable> getValidSwitchValues() {
    return this.validSwitchValues;
  }
  
  public ElementSupplier getElementSupplier() {
    return this.elementSupplier;
  }
  
  public boolean isMayRecurse() {
    return this.mayRecurse;
  }
  
  public String getTypeName() {
    return this.typeName;
  }
  
  public int getOptionals() {
    return this.optionals;
  }
  
  public int getBlock() {
    return this.block;
  }
  
  public String getDerivedTypeName() {
    return (this.typeName != null) ? this.typeName : this.baseType.name();
  }
  
  public ElementSupplier resolveSupplier() {
    if (this.supplierMap.containsKey(this.label))
      return this.supplierMap.get(this.label); 
    if (this.parent != null)
      return this.parent.resolveSupplier(this.label); 
    throw new IllegalStateException("unable to resolve: " + this.label);
  }
  
  protected ElementSupplier resolveSupplier(String paramString) {
    paramString = this.label + "." + paramString;
    if (this.supplierMap.containsKey(paramString))
      return this.supplierMap.get(paramString); 
    if (this.parent != null)
      return this.parent.resolveSupplier(paramString); 
    throw new IllegalStateException("unable to resolve: " + paramString);
  }
  
  public Element getParent() {
    return this.parent;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Element element = (Element)paramObject;
    return (this.explicit != element.explicit) ? false : ((this.extensionsInDefinition != element.extensionsInDefinition) ? false : ((this.defaultValuesInChildren != element.defaultValuesInChildren) ? false : ((this.mayRecurse != element.mayRecurse) ? false : ((this.optionals != element.optionals) ? false : ((this.block != element.block) ? false : ((this.baseType != element.baseType) ? false : (((this.children != null) ? !this.children.equals(element.children) : (element.children != null)) ? false : (((this.label != null) ? !this.label.equals(element.label) : (element.label != null)) ? false : (((this.lowerBound != null) ? !this.lowerBound.equals(element.lowerBound) : (element.lowerBound != null)) ? false : (((this.upperBound != null) ? !this.upperBound.equals(element.upperBound) : (element.upperBound != null)) ? false : (((this.enumValue != null) ? !this.enumValue.equals(element.enumValue) : (element.enumValue != null)) ? false : (((this.defaultValue != null) ? !this.defaultValue.equals(element.defaultValue) : (element.defaultValue != null)) ? false : (((this.aSwitch != null) ? !this.aSwitch.equals(element.aSwitch) : (element.aSwitch != null)) ? false : (((this.optionalChildrenInOrder != null) ? !this.optionalChildrenInOrder.equals(element.optionalChildrenInOrder) : (element.optionalChildrenInOrder != null)) ? false : (((this.validSwitchValues != null) ? !this.validSwitchValues.equals(element.validSwitchValues) : (element.validSwitchValues != null)) ? false : (((this.elementSupplier != null) ? !this.elementSupplier.equals(element.elementSupplier) : (element.elementSupplier != null)) ? false : (((this.typeName != null) ? !this.typeName.equals(element.typeName) : (element.typeName != null)) ? false : ((this.supplierMap != null) ? (!this.supplierMap.equals(element.supplierMap)) : ((element.supplierMap != null))))))))))))))))))));
  }
  
  public int hashCode() {
    null = (this.baseType != null) ? this.baseType.hashCode() : 0;
    null = 31 * null + ((this.children != null) ? this.children.hashCode() : 0);
    null = 31 * null + (this.explicit ? 1 : 0);
    null = 31 * null + ((this.label != null) ? this.label.hashCode() : 0);
    null = 31 * null + ((this.lowerBound != null) ? this.lowerBound.hashCode() : 0);
    null = 31 * null + ((this.upperBound != null) ? this.upperBound.hashCode() : 0);
    null = 31 * null + (this.extensionsInDefinition ? 1 : 0);
    null = 31 * null + ((this.enumValue != null) ? this.enumValue.hashCode() : 0);
    null = 31 * null + ((this.defaultValue != null) ? this.defaultValue.hashCode() : 0);
    null = 31 * null + ((this.aSwitch != null) ? this.aSwitch.hashCode() : 0);
    null = 31 * null + (this.defaultValuesInChildren ? 1 : 0);
    null = 31 * null + ((this.optionalChildrenInOrder != null) ? this.optionalChildrenInOrder.hashCode() : 0);
    null = 31 * null + ((this.validSwitchValues != null) ? this.validSwitchValues.hashCode() : 0);
    null = 31 * null + ((this.elementSupplier != null) ? this.elementSupplier.hashCode() : 0);
    null = 31 * null + (this.mayRecurse ? 1 : 0);
    null = 31 * null + ((this.typeName != null) ? this.typeName.hashCode() : 0);
    null = 31 * null + ((this.supplierMap != null) ? this.supplierMap.hashCode() : 0);
    null = 31 * null + this.optionals;
    return 31 * null + this.block;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\Element.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */