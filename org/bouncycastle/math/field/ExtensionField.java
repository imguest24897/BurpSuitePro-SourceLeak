package org.bouncycastle.math.field;

public interface ExtensionField extends FiniteField {
  FiniteField getSubfield();
  
  int getDegree();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\field\ExtensionField.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */