package org.bouncycastle.tsp.ers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortedHashList {
  private static final Comparator<byte[]> hashComp = new ByteArrayComparator();
  
  private final LinkedList<byte[]> baseList = (LinkedList)new LinkedList<>();
  
  public byte[] getFirst() {
    return this.baseList.getFirst();
  }
  
  public void add(byte[] paramArrayOfbyte) {
    if (this.baseList.size() == 0) {
      this.baseList.addFirst(paramArrayOfbyte);
    } else if (hashComp.compare(paramArrayOfbyte, this.baseList.get(0)) < 0) {
      this.baseList.addFirst(paramArrayOfbyte);
    } else {
      byte b;
      for (b = 1; b < this.baseList.size() && hashComp.compare(this.baseList.get(b), paramArrayOfbyte) <= 0; b++);
      if (b == this.baseList.size()) {
        this.baseList.add(paramArrayOfbyte);
      } else {
        this.baseList.add(b, paramArrayOfbyte);
      } 
    } 
  }
  
  public int size() {
    return this.baseList.size();
  }
  
  public List<byte[]> toList() {
    return (List)new ArrayList<>(this.baseList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\SortedHashList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */