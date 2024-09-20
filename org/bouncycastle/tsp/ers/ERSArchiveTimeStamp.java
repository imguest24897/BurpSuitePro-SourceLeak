package org.bouncycastle.tsp.ers;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import org.bouncycastle.asn1.tsp.ArchiveTimeStamp;
import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.SignerInformationVerifier;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TimeStampToken;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

public class ERSArchiveTimeStamp {
  private final ArchiveTimeStamp archiveTimeStamp;
  
  private final DigestCalculator digCalc;
  
  private final TimeStampToken timeStampToken;
  
  private final byte[] previousChainsDigest = null;
  
  private ERSRootNodeCalculator rootNodeCalculator = new BinaryTreeRootCalculator();
  
  public ERSArchiveTimeStamp(byte[] paramArrayOfbyte, DigestCalculatorProvider paramDigestCalculatorProvider) throws TSPException, ERSException {
    this(ArchiveTimeStamp.getInstance(paramArrayOfbyte), paramDigestCalculatorProvider);
  }
  
  public ERSArchiveTimeStamp(ArchiveTimeStamp paramArchiveTimeStamp, DigestCalculatorProvider paramDigestCalculatorProvider) throws TSPException, ERSException {
    try {
      this.archiveTimeStamp = paramArchiveTimeStamp;
      this.timeStampToken = new TimeStampToken(paramArchiveTimeStamp.getTimeStamp());
      this.digCalc = paramDigestCalculatorProvider.get(paramArchiveTimeStamp.getDigestAlgorithmIdentifier());
    } catch (IOException iOException) {
      throw new ERSException(iOException.getMessage(), iOException);
    } catch (OperatorCreationException operatorCreationException) {
      throw new ERSException(operatorCreationException.getMessage(), operatorCreationException);
    } 
  }
  
  ERSArchiveTimeStamp(ArchiveTimeStamp paramArchiveTimeStamp, DigestCalculator paramDigestCalculator) throws TSPException, ERSException {
    try {
      this.archiveTimeStamp = paramArchiveTimeStamp;
      this.timeStampToken = new TimeStampToken(paramArchiveTimeStamp.getTimeStamp());
      this.digCalc = paramDigestCalculator;
    } catch (IOException iOException) {
      throw new ERSException(iOException.getMessage(), iOException);
    } 
  }
  
  ERSArchiveTimeStamp(byte[] paramArrayOfbyte, ArchiveTimeStamp paramArchiveTimeStamp, DigestCalculatorProvider paramDigestCalculatorProvider) throws TSPException, ERSException {
    try {
      this.archiveTimeStamp = paramArchiveTimeStamp;
      this.timeStampToken = new TimeStampToken(paramArchiveTimeStamp.getTimeStamp());
      this.digCalc = paramDigestCalculatorProvider.get(paramArchiveTimeStamp.getDigestAlgorithmIdentifier());
    } catch (IOException iOException) {
      throw new ERSException(iOException.getMessage(), iOException);
    } catch (OperatorCreationException operatorCreationException) {
      throw new ERSException(operatorCreationException.getMessage(), operatorCreationException);
    } 
  }
  
  public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
    return this.archiveTimeStamp.getDigestAlgorithmIdentifier();
  }
  
  public void validatePresent(ERSData paramERSData, Date paramDate) throws ERSException {
    validatePresent(paramERSData instanceof ERSDataGroup, paramERSData.getHash(this.digCalc, this.previousChainsDigest), paramDate);
  }
  
  public boolean isContaining(ERSData paramERSData, Date paramDate) throws ERSException {
    if (this.timeStampToken.getTimeStampInfo().getGenTime().after(paramDate))
      throw new ArchiveTimeStampValidationException("timestamp generation time is in the future"); 
    try {
      validatePresent(paramERSData, paramDate);
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public void validatePresent(boolean paramBoolean, byte[] paramArrayOfbyte, Date paramDate) throws ERSException {
    byte[] arrayOfByte;
    if (this.timeStampToken.getTimeStampInfo().getGenTime().after(paramDate))
      throw new ArchiveTimeStampValidationException("timestamp generation time is in the future"); 
    checkContainsHashValue(paramBoolean, paramArrayOfbyte, this.digCalc);
    PartialHashtree[] arrayOfPartialHashtree = this.archiveTimeStamp.getReducedHashTree();
    if (arrayOfPartialHashtree != null) {
      arrayOfByte = this.rootNodeCalculator.recoverRootHash(this.digCalc, this.archiveTimeStamp.getReducedHashTree());
    } else {
      arrayOfByte = paramArrayOfbyte;
    } 
    checkTimeStampValid(this.timeStampToken, arrayOfByte);
  }
  
  public TimeStampToken getTimeStampToken() {
    return this.timeStampToken;
  }
  
  public X509CertificateHolder getSigningCertificate() {
    Store store = this.timeStampToken.getCertificates();
    if (store != null) {
      Collection<X509CertificateHolder> collection = store.getMatches((Selector)this.timeStampToken.getSID());
      if (!collection.isEmpty())
        return collection.iterator().next(); 
    } 
    return null;
  }
  
  public void validate(SignerInformationVerifier paramSignerInformationVerifier) throws TSPException {
    this.timeStampToken.validate(paramSignerInformationVerifier);
  }
  
  void checkContainsHashValue(boolean paramBoolean, byte[] paramArrayOfbyte, DigestCalculator paramDigestCalculator) throws ArchiveTimeStampValidationException {
    PartialHashtree[] arrayOfPartialHashtree = this.archiveTimeStamp.getReducedHashTree();
    if (arrayOfPartialHashtree != null) {
      PartialHashtree partialHashtree = arrayOfPartialHashtree[0];
      if (!paramBoolean && partialHashtree.containsHash(paramArrayOfbyte))
        return; 
      if (partialHashtree.getValueCount() > 1 && Arrays.areEqual(paramArrayOfbyte, ERSUtil.calculateBranchHash(paramDigestCalculator, partialHashtree.getValues())))
        return; 
      throw new ArchiveTimeStampValidationException("object hash not found");
    } 
    if (!Arrays.areEqual(paramArrayOfbyte, this.timeStampToken.getTimeStampInfo().getMessageImprintDigest()))
      throw new ArchiveTimeStampValidationException("object hash not found in wrapped timestamp"); 
  }
  
  void checkTimeStampValid(TimeStampToken paramTimeStampToken, byte[] paramArrayOfbyte) throws ArchiveTimeStampValidationException {
    if (paramArrayOfbyte != null && !Arrays.areEqual(paramArrayOfbyte, paramTimeStampToken.getTimeStampInfo().getMessageImprintDigest()))
      throw new ArchiveTimeStampValidationException("timestamp hash does not match root"); 
  }
  
  public Date getGenTime() {
    return this.timeStampToken.getTimeStampInfo().getGenTime();
  }
  
  public Date getExpiryTime() {
    X509CertificateHolder x509CertificateHolder = getSigningCertificate();
    return (x509CertificateHolder != null) ? x509CertificateHolder.getNotAfter() : null;
  }
  
  public ArchiveTimeStamp toASN1Structure() {
    return this.archiveTimeStamp;
  }
  
  public byte[] getEncoded() throws IOException {
    return this.archiveTimeStamp.getEncoded();
  }
  
  public static ERSArchiveTimeStamp fromTimeStampToken(TimeStampToken paramTimeStampToken, DigestCalculatorProvider paramDigestCalculatorProvider) throws TSPException, ERSException {
    return new ERSArchiveTimeStamp(new ArchiveTimeStamp(paramTimeStampToken.toCMSSignedData().toASN1Structure()), paramDigestCalculatorProvider);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ERSArchiveTimeStamp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */