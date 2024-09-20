package org.bouncycastle.tsp.ers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.tsp.ArchiveTimeStamp;
import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;

public class ERSEvidenceRecordStore implements Store<ERSEvidenceRecord> {
  private Map<HashNode, List<ERSEvidenceRecord>> recordMap = new HashMap<>();
  
  private DigestCalculator digCalc = null;
  
  public ERSEvidenceRecordStore(Collection<ERSEvidenceRecord> paramCollection) throws OperatorCreationException {
    for (ERSEvidenceRecord eRSEvidenceRecord : paramCollection) {
      ArchiveTimeStamp archiveTimeStamp = eRSEvidenceRecord.getArchiveTimeStamps()[0];
      if (this.digCalc == null) {
        DigestCalculatorProvider digestCalculatorProvider = eRSEvidenceRecord.getDigestAlgorithmProvider();
        this.digCalc = digestCalculatorProvider.get(archiveTimeStamp.getDigestAlgorithmIdentifier());
      } 
      PartialHashtree partialHashtree = archiveTimeStamp.getHashTreeLeaf();
      if (partialHashtree != null) {
        byte[][] arrayOfByte = partialHashtree.getValues();
        if (arrayOfByte.length > 1) {
          for (byte b = 0; b != arrayOfByte.length; b++)
            addRecord(new HashNode(arrayOfByte[b]), eRSEvidenceRecord); 
          addRecord(new HashNode(ERSUtil.computeNodeHash(this.digCalc, partialHashtree)), eRSEvidenceRecord);
          continue;
        } 
        addRecord(new HashNode(arrayOfByte[0]), eRSEvidenceRecord);
        continue;
      } 
      addRecord(new HashNode(archiveTimeStamp.getTimeStampDigestValue()), eRSEvidenceRecord);
    } 
  }
  
  private void addRecord(HashNode paramHashNode, ERSEvidenceRecord paramERSEvidenceRecord) {
    List list = this.recordMap.get(paramHashNode);
    if (list != null) {
      ArrayList<ERSEvidenceRecord> arrayList = new ArrayList(list.size() + 1);
      arrayList.addAll(list);
      arrayList.add(paramERSEvidenceRecord);
      this.recordMap.put(paramHashNode, arrayList);
    } else {
      this.recordMap.put(paramHashNode, Collections.singletonList(paramERSEvidenceRecord));
    } 
  }
  
  public Collection<ERSEvidenceRecord> getMatches(Selector<ERSEvidenceRecord> paramSelector) throws StoreException {
    if (paramSelector instanceof ERSEvidenceRecordSelector) {
      HashNode hashNode = new HashNode(((ERSEvidenceRecordSelector)paramSelector).getData().getHash(this.digCalc, null));
      List<ERSEvidenceRecord> list = this.recordMap.get(hashNode);
      if (list != null) {
        ArrayList<ERSEvidenceRecord> arrayList = new ArrayList(list.size());
        for (byte b = 0; b != list.size(); b++) {
          ERSEvidenceRecord eRSEvidenceRecord = list.get(b);
          if (paramSelector.match(eRSEvidenceRecord))
            arrayList.add(eRSEvidenceRecord); 
        } 
        return Collections.unmodifiableList(arrayList);
      } 
      return Collections.emptyList();
    } 
    if (paramSelector == null) {
      HashSet<? extends ERSEvidenceRecord> hashSet1 = new HashSet(this.recordMap.size());
      Iterator<List> iterator = this.recordMap.values().iterator();
      while (iterator.hasNext())
        hashSet1.addAll(iterator.next()); 
      return Collections.unmodifiableList(new ArrayList<>(hashSet1));
    } 
    HashSet<ERSEvidenceRecord> hashSet = new HashSet();
    for (List<ERSEvidenceRecord> list : this.recordMap.values()) {
      for (byte b = 0; b != list.size(); b++) {
        if (paramSelector.match(list.get(b)))
          hashSet.add(list.get(b)); 
      } 
    } 
    return Collections.unmodifiableList(new ArrayList<>(hashSet));
  }
  
  private static class HashNode {
    private final byte[] dataHash;
    
    private final int hashCode;
    
    public HashNode(byte[] param1ArrayOfbyte) {
      this.dataHash = param1ArrayOfbyte;
      this.hashCode = Arrays.hashCode(param1ArrayOfbyte);
    }
    
    public int hashCode() {
      return this.hashCode;
    }
    
    public boolean equals(Object param1Object) {
      return (param1Object instanceof HashNode) ? Arrays.areEqual(this.dataHash, ((HashNode)param1Object).dataHash) : false;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ERSEvidenceRecordStore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */