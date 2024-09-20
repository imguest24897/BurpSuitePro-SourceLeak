package org.bouncycastle.tsp.ers;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.io.Streams;

class ERSUtil {
  private static final Comparator<byte[]> hashComp = new ByteArrayComparator();
  
  static byte[] calculateDigest(DigestCalculator paramDigestCalculator, byte[] paramArrayOfbyte) {
    try {
      OutputStream outputStream = paramDigestCalculator.getOutputStream();
      outputStream.write(paramArrayOfbyte);
      outputStream.close();
      return paramDigestCalculator.getDigest();
    } catch (IOException iOException) {
      throw ExpUtil.createIllegalState("unable to calculate hash: " + iOException.getMessage(), iOException);
    } 
  }
  
  static byte[] calculateBranchHash(DigestCalculator paramDigestCalculator, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return (hashComp.compare(paramArrayOfbyte1, paramArrayOfbyte2) <= 0) ? calculateDigest(paramDigestCalculator, paramArrayOfbyte1, paramArrayOfbyte2) : calculateDigest(paramDigestCalculator, paramArrayOfbyte2, paramArrayOfbyte1);
  }
  
  static byte[] calculateBranchHash(DigestCalculator paramDigestCalculator, byte[][] paramArrayOfbyte) {
    return (paramArrayOfbyte.length == 2) ? calculateBranchHash(paramDigestCalculator, paramArrayOfbyte[0], paramArrayOfbyte[1]) : calculateDigest(paramDigestCalculator, (Iterator)buildIndexedHashList(paramArrayOfbyte).iterator());
  }
  
  static byte[] calculateDigest(DigestCalculator paramDigestCalculator, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    try {
      OutputStream outputStream = paramDigestCalculator.getOutputStream();
      outputStream.write(paramArrayOfbyte1);
      outputStream.write(paramArrayOfbyte2);
      outputStream.close();
      return paramDigestCalculator.getDigest();
    } catch (IOException iOException) {
      throw ExpUtil.createIllegalState("unable to calculate hash: " + iOException.getMessage(), iOException);
    } 
  }
  
  static byte[] calculateDigest(DigestCalculator paramDigestCalculator, Iterator<byte[]> paramIterator) {
    try {
      OutputStream outputStream = paramDigestCalculator.getOutputStream();
      while (paramIterator.hasNext())
        outputStream.write(paramIterator.next()); 
      outputStream.close();
      return paramDigestCalculator.getDigest();
    } catch (IOException iOException) {
      throw ExpUtil.createIllegalState("unable to calculate hash: " + iOException.getMessage(), iOException);
    } 
  }
  
  static byte[] calculateDigest(DigestCalculator paramDigestCalculator, InputStream paramInputStream) {
    try {
      OutputStream outputStream = paramDigestCalculator.getOutputStream();
      Streams.pipeAll(paramInputStream, outputStream);
      outputStream.close();
      return paramDigestCalculator.getDigest();
    } catch (IOException iOException) {
      throw ExpUtil.createIllegalState("unable to calculate hash: " + iOException.getMessage(), iOException);
    } 
  }
  
  static byte[] computeNodeHash(DigestCalculator paramDigestCalculator, PartialHashtree paramPartialHashtree) {
    byte[][] arrayOfByte = paramPartialHashtree.getValues();
    return (arrayOfByte.length > 1) ? calculateDigest(paramDigestCalculator, (Iterator)buildIndexedHashList(arrayOfByte).iterator()) : arrayOfByte[0];
  }
  
  static List<byte[]> buildIndexedHashList(byte[][] paramArrayOfbyte) {
    SortedHashList sortedHashList = new SortedHashList();
    for (byte b = 0; b != paramArrayOfbyte.length; b++)
      sortedHashList.add(paramArrayOfbyte[b]); 
    return sortedHashList.toList();
  }
  
  static List<byte[]> buildHashList(DigestCalculator paramDigestCalculator, List<ERSData> paramList, byte[] paramArrayOfbyte) {
    SortedHashList sortedHashList = new SortedHashList();
    for (byte b = 0; b != paramList.size(); b++)
      sortedHashList.add(((ERSData)paramList.get(b)).getHash(paramDigestCalculator, paramArrayOfbyte)); 
    return sortedHashList.toList();
  }
  
  static List<IndexedHash> buildIndexedHashList(DigestCalculator paramDigestCalculator, List<ERSData> paramList, byte[] paramArrayOfbyte) {
    SortedIndexedHashList sortedIndexedHashList = new SortedIndexedHashList();
    for (byte b = 0; b != paramList.size(); b++) {
      byte[] arrayOfByte = ((ERSData)paramList.get(b)).getHash(paramDigestCalculator, paramArrayOfbyte);
      sortedIndexedHashList.add(new IndexedHash(b, arrayOfByte));
    } 
    return sortedIndexedHashList.toList();
  }
  
  static byte[] concatPreviousHashes(DigestCalculator paramDigestCalculator, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte1 == null)
      return paramArrayOfbyte2; 
    try {
      OutputStream outputStream = paramDigestCalculator.getOutputStream();
      outputStream.write(paramArrayOfbyte2);
      outputStream.write(paramArrayOfbyte1);
      outputStream.close();
      return paramDigestCalculator.getDigest();
    } catch (IOException iOException) {
      throw new IllegalStateException("unable to hash data");
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ERSUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */