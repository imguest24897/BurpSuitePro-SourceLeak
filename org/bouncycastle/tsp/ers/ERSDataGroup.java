package org.bouncycastle.tsp.ers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.operator.DigestCalculator;

public class ERSDataGroup extends ERSCachingData {
  protected List<ERSData> dataObjects;
  
  public ERSDataGroup(ERSData... paramVarArgs) {
    this.dataObjects = new ArrayList<>(paramVarArgs.length);
    this.dataObjects.addAll(Arrays.asList(paramVarArgs));
  }
  
  public ERSDataGroup(List<ERSData> paramList) {
    this.dataObjects = new ArrayList<>(paramList.size());
    this.dataObjects.addAll(paramList);
  }
  
  public ERSDataGroup(ERSData paramERSData) {
    this.dataObjects = Collections.singletonList(paramERSData);
  }
  
  public List<byte[]> getHashes(DigestCalculator paramDigestCalculator, byte[] paramArrayOfbyte) {
    return ERSUtil.buildHashList(paramDigestCalculator, this.dataObjects, paramArrayOfbyte);
  }
  
  public byte[] getHash(DigestCalculator paramDigestCalculator, byte[] paramArrayOfbyte) {
    List<byte[]> list = getHashes(paramDigestCalculator, paramArrayOfbyte);
    return (list.size() > 1) ? ERSUtil.calculateDigest(paramDigestCalculator, (Iterator)list.iterator()) : list.get(0);
  }
  
  protected byte[] calculateHash(DigestCalculator paramDigestCalculator, byte[] paramArrayOfbyte) {
    List<byte[]> list = getHashes(paramDigestCalculator, paramArrayOfbyte);
    if (list.size() > 1) {
      ArrayList<byte[]> arrayList = new ArrayList(list.size());
      for (byte b = 0; b != arrayList.size(); b++)
        arrayList.add(list.get(b)); 
      return ERSUtil.calculateDigest(paramDigestCalculator, (Iterator)arrayList.iterator());
    } 
    return list.get(0);
  }
  
  public int size() {
    return this.dataObjects.size();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ERSDataGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */