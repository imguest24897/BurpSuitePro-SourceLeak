package org.bouncycastle.tsp.ers;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Arrays;

public class BinaryTreeRootCalculator implements ERSRootNodeCalculator {
  private List<List<byte[]>> tree;
  
  public byte[] computeRootHash(DigestCalculator paramDigestCalculator, PartialHashtree[] paramArrayOfPartialHashtree) {
    ArrayList<byte[]> arrayList;
    SortedHashList sortedHashList = new SortedHashList();
    for (byte b = 0; b < paramArrayOfPartialHashtree.length; b++) {
      byte[] arrayOfByte = ERSUtil.computeNodeHash(paramDigestCalculator, paramArrayOfPartialHashtree[b]);
      sortedHashList.add(arrayOfByte);
    } 
    List<byte[]> list = sortedHashList.toList();
    this.tree = new ArrayList<>();
    this.tree.add(list);
    if (list.size() > 1)
      do {
        ArrayList<byte[]> arrayList1 = new ArrayList(list.size() / 2 + 1);
        for (byte b1 = 0; b1 <= list.size() - 2; b1 += 2)
          arrayList1.add(ERSUtil.calculateBranchHash(paramDigestCalculator, list.get(b1), list.get(b1 + 1))); 
        if (list.size() % 2 == 1)
          arrayList1.add(list.get(list.size() - 1)); 
        this.tree.add(arrayList1);
        arrayList = arrayList1;
      } while (arrayList.size() > 1); 
    return arrayList.get(0);
  }
  
  public PartialHashtree[] computePathToRoot(DigestCalculator paramDigestCalculator, PartialHashtree paramPartialHashtree, int paramInt) {
    ArrayList<PartialHashtree> arrayList = new ArrayList();
    byte[] arrayOfByte = ERSUtil.computeNodeHash(paramDigestCalculator, paramPartialHashtree);
    arrayList.add(paramPartialHashtree);
    for (byte b = 0; b < this.tree.size() - 1; b++) {
      byte[] arrayOfByte1;
      if (paramInt == ((List)this.tree.get(b)).size() - 1)
        while (true) {
          List<byte[]> list = this.tree.get(b + 1);
          if (!Arrays.areEqual(arrayOfByte, list.get(list.size() - 1)))
            break; 
          paramInt = ((List)this.tree.get(++b)).size() - 1;
        }  
      if ((paramInt & 0x1) == 0) {
        arrayOfByte1 = ((List<byte[]>)this.tree.get(b)).get(paramInt + 1);
      } else {
        arrayOfByte1 = ((List<byte[]>)this.tree.get(b)).get(paramInt - 1);
      } 
      arrayList.add(new PartialHashtree(arrayOfByte1));
      arrayOfByte = ERSUtil.calculateBranchHash(paramDigestCalculator, arrayOfByte, arrayOfByte1);
      paramInt /= 2;
    } 
    return arrayList.<PartialHashtree>toArray(new PartialHashtree[0]);
  }
  
  public byte[] recoverRootHash(DigestCalculator paramDigestCalculator, PartialHashtree[] paramArrayOfPartialHashtree) {
    byte[] arrayOfByte = ERSUtil.computeNodeHash(paramDigestCalculator, paramArrayOfPartialHashtree[0]);
    for (byte b = 1; b < paramArrayOfPartialHashtree.length; b++)
      arrayOfByte = ERSUtil.calculateBranchHash(paramDigestCalculator, arrayOfByte, ERSUtil.computeNodeHash(paramDigestCalculator, paramArrayOfPartialHashtree[b])); 
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\BinaryTreeRootCalculator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */