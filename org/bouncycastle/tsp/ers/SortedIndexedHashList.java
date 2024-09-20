package org.bouncycastle.tsp.ers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortedIndexedHashList {
  private static final Comparator<byte[]> hashComp = new ByteArrayComparator();
  
  private final LinkedList<IndexedHash> baseList = new LinkedList<>();
  
  public IndexedHash getFirst() {
    return this.baseList.getFirst();
  }
  
  public void add(IndexedHash paramIndexedHash) {
    if (this.baseList.size() == 0) {
      this.baseList.addFirst(paramIndexedHash);
    } else if (hashComp.compare(paramIndexedHash.digest, ((IndexedHash)this.baseList.get(0)).digest) < 0) {
      this.baseList.addFirst(paramIndexedHash);
    } else {
      byte b;
      for (b = 1; b < this.baseList.size() && hashComp.compare(((IndexedHash)this.baseList.get(b)).digest, paramIndexedHash.digest) <= 0; b++);
      if (b == this.baseList.size()) {
        this.baseList.add(paramIndexedHash);
      } else {
        this.baseList.add(b, paramIndexedHash);
      } 
    } 
  }
  
  public int size() {
    return this.baseList.size();
  }
  
  public List<IndexedHash> toList() {
    return new ArrayList<>(this.baseList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\SortedIndexedHashList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */