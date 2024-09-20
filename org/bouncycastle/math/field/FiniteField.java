package org.bouncycastle.math.field;

import java.math.BigInteger;

public interface FiniteField {
  BigInteger getCharacteristic();
  
  int getDimension();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\field\FiniteField.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */