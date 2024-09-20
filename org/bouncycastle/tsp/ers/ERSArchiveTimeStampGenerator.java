package org.bouncycastle.tsp.ers;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.tsp.ArchiveTimeStamp;
import org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence;
import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.asn1.tsp.TSTInfo;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TimeStampRequest;
import org.bouncycastle.tsp.TimeStampRequestGenerator;
import org.bouncycastle.tsp.TimeStampResponse;
import org.bouncycastle.util.Arrays;

public class ERSArchiveTimeStampGenerator {
  private final DigestCalculator digCalc;
  
  private List<ERSData> dataObjects = new ArrayList<>();
  
  private ERSRootNodeCalculator rootNodeCalculator = new BinaryTreeRootCalculator();
  
  private byte[] previousChainHash;
  
  public ERSArchiveTimeStampGenerator(DigestCalculator paramDigestCalculator) {
    this.digCalc = paramDigestCalculator;
  }
  
  public void addData(ERSData paramERSData) {
    this.dataObjects.add(paramERSData);
  }
  
  public void addAllData(List<ERSData> paramList) {
    this.dataObjects.addAll(paramList);
  }
  
  void addPreviousChains(ArchiveTimeStampSequence paramArchiveTimeStampSequence) throws IOException {
    OutputStream outputStream = this.digCalc.getOutputStream();
    outputStream.write(paramArchiveTimeStampSequence.getEncoded("DER"));
    outputStream.close();
    this.previousChainHash = this.digCalc.getDigest();
  }
  
  public TimeStampRequest generateTimeStampRequest(TimeStampRequestGenerator paramTimeStampRequestGenerator) throws TSPException, IOException {
    IndexedPartialHashtree[] arrayOfIndexedPartialHashtree = getPartialHashtrees();
    byte[] arrayOfByte = this.rootNodeCalculator.computeRootHash(this.digCalc, (PartialHashtree[])arrayOfIndexedPartialHashtree);
    return paramTimeStampRequestGenerator.generate(this.digCalc.getAlgorithmIdentifier(), arrayOfByte);
  }
  
  public TimeStampRequest generateTimeStampRequest(TimeStampRequestGenerator paramTimeStampRequestGenerator, BigInteger paramBigInteger) throws TSPException, IOException {
    IndexedPartialHashtree[] arrayOfIndexedPartialHashtree = getPartialHashtrees();
    byte[] arrayOfByte = this.rootNodeCalculator.computeRootHash(this.digCalc, (PartialHashtree[])arrayOfIndexedPartialHashtree);
    return paramTimeStampRequestGenerator.generate(this.digCalc.getAlgorithmIdentifier(), arrayOfByte, paramBigInteger);
  }
  
  public ERSArchiveTimeStamp generateArchiveTimeStamp(TimeStampResponse paramTimeStampResponse) throws TSPException, ERSException {
    IndexedPartialHashtree[] arrayOfIndexedPartialHashtree = getPartialHashtrees();
    if (arrayOfIndexedPartialHashtree.length != 1)
      throw new ERSException("multiple reduced hash trees found"); 
    byte[] arrayOfByte = this.rootNodeCalculator.computeRootHash(this.digCalc, (PartialHashtree[])arrayOfIndexedPartialHashtree);
    if (paramTimeStampResponse.getStatus() != 0)
      throw new TSPException("TSP response error status: " + paramTimeStampResponse.getStatusString()); 
    TSTInfo tSTInfo = paramTimeStampResponse.getTimeStampToken().getTimeStampInfo().toASN1Structure();
    if (!tSTInfo.getMessageImprint().getHashAlgorithm().equals(this.digCalc.getAlgorithmIdentifier()))
      throw new ERSException("time stamp imprint for wrong algorithm"); 
    if (!Arrays.areEqual(tSTInfo.getMessageImprint().getHashedMessage(), arrayOfByte))
      throw new ERSException("time stamp imprint for wrong root hash"); 
    return (arrayOfIndexedPartialHashtree[0].getValueCount() == 1) ? new ERSArchiveTimeStamp(new ArchiveTimeStamp(null, null, paramTimeStampResponse.getTimeStampToken().toCMSSignedData().toASN1Structure()), this.digCalc) : new ERSArchiveTimeStamp(new ArchiveTimeStamp(this.digCalc.getAlgorithmIdentifier(), (PartialHashtree[])arrayOfIndexedPartialHashtree, paramTimeStampResponse.getTimeStampToken().toCMSSignedData().toASN1Structure()), this.digCalc);
  }
  
  public List<ERSArchiveTimeStamp> generateArchiveTimeStamps(TimeStampResponse paramTimeStampResponse) throws TSPException, ERSException {
    IndexedPartialHashtree[] arrayOfIndexedPartialHashtree = getPartialHashtrees();
    byte[] arrayOfByte = this.rootNodeCalculator.computeRootHash(this.digCalc, (PartialHashtree[])arrayOfIndexedPartialHashtree);
    if (paramTimeStampResponse.getStatus() != 0)
      throw new TSPException("TSP response error status: " + paramTimeStampResponse.getStatusString()); 
    TSTInfo tSTInfo = paramTimeStampResponse.getTimeStampToken().getTimeStampInfo().toASN1Structure();
    if (!tSTInfo.getMessageImprint().getHashAlgorithm().equals(this.digCalc.getAlgorithmIdentifier()))
      throw new ERSException("time stamp imprint for wrong algorithm"); 
    if (!Arrays.areEqual(tSTInfo.getMessageImprint().getHashedMessage(), arrayOfByte))
      throw new ERSException("time stamp imprint for wrong root hash"); 
    ContentInfo contentInfo = paramTimeStampResponse.getTimeStampToken().toCMSSignedData().toASN1Structure();
    ArrayList<ERSArchiveTimeStamp> arrayList = new ArrayList();
    if (arrayOfIndexedPartialHashtree.length == 1 && arrayOfIndexedPartialHashtree[0].getValueCount() == 1) {
      arrayList.add(new ERSArchiveTimeStamp(new ArchiveTimeStamp(null, null, contentInfo), this.digCalc));
    } else {
      ERSArchiveTimeStamp[] arrayOfERSArchiveTimeStamp = new ERSArchiveTimeStamp[arrayOfIndexedPartialHashtree.length];
      byte b;
      for (b = 0; b != arrayOfIndexedPartialHashtree.length; b++) {
        PartialHashtree[] arrayOfPartialHashtree = this.rootNodeCalculator.computePathToRoot(this.digCalc, arrayOfIndexedPartialHashtree[b], b);
        arrayOfERSArchiveTimeStamp[(arrayOfIndexedPartialHashtree[b]).order] = new ERSArchiveTimeStamp(new ArchiveTimeStamp(this.digCalc.getAlgorithmIdentifier(), arrayOfPartialHashtree, contentInfo), this.digCalc);
      } 
      for (b = 0; b != arrayOfIndexedPartialHashtree.length; b++)
        arrayList.add(arrayOfERSArchiveTimeStamp[b]); 
    } 
    return arrayList;
  }
  
  private IndexedPartialHashtree[] getPartialHashtrees() {
    List<IndexedHash> list = ERSUtil.buildIndexedHashList(this.digCalc, this.dataObjects, this.previousChainHash);
    IndexedPartialHashtree[] arrayOfIndexedPartialHashtree = new IndexedPartialHashtree[list.size()];
    HashSet<ERSDataGroup> hashSet = new HashSet();
    byte b;
    for (b = 0; b != this.dataObjects.size(); b++) {
      if (this.dataObjects.get(b) instanceof ERSDataGroup)
        hashSet.add((ERSDataGroup)this.dataObjects.get(b)); 
    } 
    for (b = 0; b != list.size(); b++) {
      byte[] arrayOfByte = ((IndexedHash)list.get(b)).digest;
      ERSData eRSData = this.dataObjects.get(((IndexedHash)list.get(b)).order);
      if (eRSData instanceof ERSDataGroup) {
        ERSDataGroup eRSDataGroup = (ERSDataGroup)eRSData;
        List<byte[]> list1 = eRSDataGroup.getHashes(this.digCalc, this.previousChainHash);
        arrayOfIndexedPartialHashtree[b] = new IndexedPartialHashtree(((IndexedHash)list.get(b)).order, list1.<byte[]>toArray(new byte[list1.size()][]));
      } else {
        arrayOfIndexedPartialHashtree[b] = new IndexedPartialHashtree(((IndexedHash)list.get(b)).order, arrayOfByte);
      } 
    } 
    return arrayOfIndexedPartialHashtree;
  }
  
  private static class IndexedPartialHashtree extends PartialHashtree {
    final int order;
    
    private IndexedPartialHashtree(int param1Int, byte[] param1ArrayOfbyte) {
      super(param1ArrayOfbyte);
      this.order = param1Int;
    }
    
    private IndexedPartialHashtree(int param1Int, byte[][] param1ArrayOfbyte) {
      super(param1ArrayOfbyte);
      this.order = param1Int;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ERSArchiveTimeStampGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */