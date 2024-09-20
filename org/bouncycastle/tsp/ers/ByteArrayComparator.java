package org.bouncycastle.tsp.ers;

import java.util.Comparator;

class ByteArrayComparator implements Comparator {
  public int compare(Object paramObject1, Object paramObject2) {
    byte[] arrayOfByte1 = (byte[])paramObject1;
    byte[] arrayOfByte2 = (byte[])paramObject2;
    for (byte b = 0; b < arrayOfByte1.length && b < arrayOfByte2.length; b++) {
      int i = arrayOfByte1[b] & 0xFF;
      int j = arrayOfByte2[b] & 0xFF;
      if (i != j)
        return i - j; 
    } 
    return arrayOfByte1.length - arrayOfByte2.length;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ByteArrayComparator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */