package org.bouncycastle.tsp.ers;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.tsp.ArchiveTimeStamp;
import org.bouncycastle.asn1.tsp.ArchiveTimeStampChain;
import org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence;
import org.bouncycastle.asn1.tsp.EvidenceRecord;
import org.bouncycastle.asn1.tsp.TSTInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.SignerInformationVerifier;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TimeStampRequest;
import org.bouncycastle.tsp.TimeStampRequestGenerator;
import org.bouncycastle.tsp.TimeStampResponse;
import org.bouncycastle.util.io.Streams;

public class ERSEvidenceRecord {
  private final EvidenceRecord evidenceRecord;
  
  private final DigestCalculatorProvider digestCalculatorProvider;
  
  private final ERSArchiveTimeStamp firstArchiveTimeStamp;
  
  private final ERSArchiveTimeStamp lastArchiveTimeStamp;
  
  private final byte[] previousChainsDigest;
  
  private final DigestCalculator digCalc;
  
  private final ArchiveTimeStamp primaryArchiveTimeStamp;
  
  public ERSEvidenceRecord(InputStream paramInputStream, DigestCalculatorProvider paramDigestCalculatorProvider) throws TSPException, ERSException, IOException {
    this(EvidenceRecord.getInstance(Streams.readAll(paramInputStream)), paramDigestCalculatorProvider);
  }
  
  public ERSEvidenceRecord(byte[] paramArrayOfbyte, DigestCalculatorProvider paramDigestCalculatorProvider) throws TSPException, ERSException {
    this(EvidenceRecord.getInstance(paramArrayOfbyte), paramDigestCalculatorProvider);
  }
  
  public ERSEvidenceRecord(EvidenceRecord paramEvidenceRecord, DigestCalculatorProvider paramDigestCalculatorProvider) throws TSPException, ERSException {
    this.evidenceRecord = paramEvidenceRecord;
    this.digestCalculatorProvider = paramDigestCalculatorProvider;
    ArchiveTimeStampSequence archiveTimeStampSequence = paramEvidenceRecord.getArchiveTimeStampSequence();
    ArchiveTimeStampChain[] arrayOfArchiveTimeStampChain = archiveTimeStampSequence.getArchiveTimeStampChains();
    this.primaryArchiveTimeStamp = arrayOfArchiveTimeStampChain[0].getArchiveTimestamps()[0];
    validateChains(arrayOfArchiveTimeStampChain);
    ArchiveTimeStampChain archiveTimeStampChain = arrayOfArchiveTimeStampChain[arrayOfArchiveTimeStampChain.length - 1];
    ArchiveTimeStamp[] arrayOfArchiveTimeStamp = archiveTimeStampChain.getArchiveTimestamps();
    this.lastArchiveTimeStamp = new ERSArchiveTimeStamp(arrayOfArchiveTimeStamp[arrayOfArchiveTimeStamp.length - 1], paramDigestCalculatorProvider);
    if (arrayOfArchiveTimeStampChain.length > 1) {
      try {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (byte b = 0; b != arrayOfArchiveTimeStampChain.length - 1; b++)
          aSN1EncodableVector.add((ASN1Encodable)arrayOfArchiveTimeStampChain[b]); 
        this.digCalc = paramDigestCalculatorProvider.get(this.lastArchiveTimeStamp.getDigestAlgorithmIdentifier());
        OutputStream outputStream = this.digCalc.getOutputStream();
        outputStream.write((new DERSequence(aSN1EncodableVector)).getEncoded("DER"));
        outputStream.close();
        this.previousChainsDigest = this.digCalc.getDigest();
      } catch (Exception exception) {
        throw new ERSException(exception.getMessage(), exception);
      } 
    } else {
      this.digCalc = null;
      this.previousChainsDigest = null;
    } 
    this.firstArchiveTimeStamp = new ERSArchiveTimeStamp(this.previousChainsDigest, arrayOfArchiveTimeStamp[0], paramDigestCalculatorProvider);
  }
  
  private void validateChains(ArchiveTimeStampChain[] paramArrayOfArchiveTimeStampChain) throws ERSException, TSPException {
    for (byte b = 0; b != paramArrayOfArchiveTimeStampChain.length; b++) {
      ArchiveTimeStamp[] arrayOfArchiveTimeStamp = paramArrayOfArchiveTimeStampChain[b].getArchiveTimestamps();
      ArchiveTimeStamp archiveTimeStamp = arrayOfArchiveTimeStamp[0];
      AlgorithmIdentifier algorithmIdentifier = arrayOfArchiveTimeStamp[0].getDigestAlgorithmIdentifier();
      for (byte b1 = 1; b1 != arrayOfArchiveTimeStamp.length; b1++) {
        TSTInfo tSTInfo;
        ArchiveTimeStamp archiveTimeStamp1 = arrayOfArchiveTimeStamp[b1];
        if (!algorithmIdentifier.equals(archiveTimeStamp1.getDigestAlgorithmIdentifier()))
          throw new ERSException("invalid digest algorithm in chain"); 
        ContentInfo contentInfo = archiveTimeStamp1.getTimeStamp();
        if (contentInfo.getContentType().equals((ASN1Primitive)CMSObjectIdentifiers.signedData)) {
          tSTInfo = extractTimeStamp(contentInfo);
        } else {
          throw new TSPException("cannot identify TSTInfo");
        } 
        try {
          DigestCalculator digestCalculator = this.digestCalculatorProvider.get(algorithmIdentifier);
          ERSArchiveTimeStamp eRSArchiveTimeStamp = new ERSArchiveTimeStamp(archiveTimeStamp1, digestCalculator);
          eRSArchiveTimeStamp.validatePresent(new ERSByteData(archiveTimeStamp.getTimeStamp().getEncoded("DER")), tSTInfo.getGenTime().getDate());
        } catch (Exception exception) {
          throw new ERSException("invalid timestamp renewal found: " + exception.getMessage(), exception);
        } 
        archiveTimeStamp = archiveTimeStamp1;
      } 
    } 
  }
  
  ArchiveTimeStamp[] getArchiveTimeStamps() {
    ArchiveTimeStampSequence archiveTimeStampSequence = this.evidenceRecord.getArchiveTimeStampSequence();
    ArchiveTimeStampChain[] arrayOfArchiveTimeStampChain = archiveTimeStampSequence.getArchiveTimeStampChains();
    ArchiveTimeStampChain archiveTimeStampChain = arrayOfArchiveTimeStampChain[arrayOfArchiveTimeStampChain.length - 1];
    return archiveTimeStampChain.getArchiveTimestamps();
  }
  
  public byte[] getPrimaryRootHash() throws TSPException, ERSException {
    ContentInfo contentInfo = this.primaryArchiveTimeStamp.getTimeStamp();
    if (contentInfo.getContentType().equals((ASN1Primitive)CMSObjectIdentifiers.signedData)) {
      TSTInfo tSTInfo = extractTimeStamp(contentInfo);
      return tSTInfo.getMessageImprint().getHashedMessage();
    } 
    throw new ERSException("cannot identify TSTInfo for digest");
  }
  
  private TSTInfo extractTimeStamp(ContentInfo paramContentInfo) throws TSPException {
    SignedData signedData = SignedData.getInstance(paramContentInfo.getContent());
    if (signedData.getEncapContentInfo().getContentType().equals((ASN1Primitive)PKCSObjectIdentifiers.id_ct_TSTInfo))
      return TSTInfo.getInstance(ASN1OctetString.getInstance(signedData.getEncapContentInfo().getContent()).getOctets()); 
    throw new TSPException("cannot parse time stamp");
  }
  
  public boolean isRelatedTo(ERSEvidenceRecord paramERSEvidenceRecord) {
    return this.primaryArchiveTimeStamp.getTimeStamp().equals(paramERSEvidenceRecord.primaryArchiveTimeStamp.getTimeStamp());
  }
  
  public boolean isContaining(ERSData paramERSData, Date paramDate) throws ERSException {
    return this.firstArchiveTimeStamp.isContaining(paramERSData, paramDate);
  }
  
  public void validatePresent(ERSData paramERSData, Date paramDate) throws ERSException {
    this.firstArchiveTimeStamp.validatePresent(paramERSData, paramDate);
  }
  
  public void validatePresent(boolean paramBoolean, byte[] paramArrayOfbyte, Date paramDate) throws ERSException {
    this.firstArchiveTimeStamp.validatePresent(paramBoolean, paramArrayOfbyte, paramDate);
  }
  
  public X509CertificateHolder getSigningCertificate() {
    return this.lastArchiveTimeStamp.getSigningCertificate();
  }
  
  public void validate(SignerInformationVerifier paramSignerInformationVerifier) throws TSPException {
    if (this.firstArchiveTimeStamp != this.lastArchiveTimeStamp) {
      ArchiveTimeStamp[] arrayOfArchiveTimeStamp = getArchiveTimeStamps();
      for (byte b = 0; b != arrayOfArchiveTimeStamp.length - 1; b++) {
        try {
          this.lastArchiveTimeStamp.validatePresent(new ERSByteData(arrayOfArchiveTimeStamp[b].getTimeStamp().getEncoded("DER")), this.lastArchiveTimeStamp.getGenTime());
        } catch (Exception exception) {
          throw new TSPException("unable to process previous ArchiveTimeStamps", exception);
        } 
      } 
    } 
    this.lastArchiveTimeStamp.validate(paramSignerInformationVerifier);
  }
  
  public EvidenceRecord toASN1Structure() {
    return this.evidenceRecord;
  }
  
  public byte[] getEncoded() throws IOException {
    return this.evidenceRecord.getEncoded();
  }
  
  public TimeStampRequest generateTimeStampRenewalRequest(TimeStampRequestGenerator paramTimeStampRequestGenerator) throws TSPException, ERSException {
    return generateTimeStampRenewalRequest(paramTimeStampRequestGenerator, null);
  }
  
  public TimeStampRequest generateTimeStampRenewalRequest(TimeStampRequestGenerator paramTimeStampRequestGenerator, BigInteger paramBigInteger) throws ERSException, TSPException {
    ERSArchiveTimeStampGenerator eRSArchiveTimeStampGenerator = buildTspRenewalGenerator();
    try {
      return eRSArchiveTimeStampGenerator.generateTimeStampRequest(paramTimeStampRequestGenerator, paramBigInteger);
    } catch (IOException iOException) {
      throw new ERSException(iOException.getMessage(), iOException);
    } 
  }
  
  public ERSEvidenceRecord renewTimeStamp(TimeStampResponse paramTimeStampResponse) throws ERSException, TSPException {
    ERSArchiveTimeStampGenerator eRSArchiveTimeStampGenerator = buildTspRenewalGenerator();
    ArchiveTimeStamp archiveTimeStamp = eRSArchiveTimeStampGenerator.generateArchiveTimeStamp(paramTimeStampResponse).toASN1Structure();
    try {
      return new ERSEvidenceRecord(this.evidenceRecord.addArchiveTimeStamp(archiveTimeStamp, false), this.digestCalculatorProvider);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new ERSException(illegalArgumentException.getMessage(), illegalArgumentException);
    } 
  }
  
  private ERSArchiveTimeStampGenerator buildTspRenewalGenerator() throws ERSException {
    DigestCalculator digestCalculator;
    try {
      digestCalculator = this.digestCalculatorProvider.get(this.lastArchiveTimeStamp.getDigestAlgorithmIdentifier());
    } catch (OperatorCreationException operatorCreationException) {
      throw new ERSException(operatorCreationException.getMessage(), operatorCreationException);
    } 
    ArchiveTimeStamp[] arrayOfArchiveTimeStamp = getArchiveTimeStamps();
    if (!digestCalculator.getAlgorithmIdentifier().equals(arrayOfArchiveTimeStamp[0].getDigestAlgorithmIdentifier()))
      throw new ERSException("digest mismatch for timestamp renewal"); 
    ERSArchiveTimeStampGenerator eRSArchiveTimeStampGenerator = new ERSArchiveTimeStampGenerator(digestCalculator);
    ArrayList<ERSByteData> arrayList = new ArrayList(arrayOfArchiveTimeStamp.length);
    for (byte b = 0; b != arrayOfArchiveTimeStamp.length; b++) {
      try {
        arrayList.add(new ERSByteData(arrayOfArchiveTimeStamp[b].getTimeStamp().getEncoded("DER")));
      } catch (IOException iOException) {
        throw new ERSException("unable to process previous ArchiveTimeStamps", iOException);
      } 
    } 
    ERSDataGroup eRSDataGroup = new ERSDataGroup((List)arrayList);
    eRSArchiveTimeStampGenerator.addData(eRSDataGroup);
    return eRSArchiveTimeStampGenerator;
  }
  
  public TimeStampRequest generateHashRenewalRequest(DigestCalculator paramDigestCalculator, ERSData paramERSData, TimeStampRequestGenerator paramTimeStampRequestGenerator) throws ERSException, TSPException, IOException {
    return generateHashRenewalRequest(paramDigestCalculator, paramERSData, paramTimeStampRequestGenerator, null);
  }
  
  public TimeStampRequest generateHashRenewalRequest(DigestCalculator paramDigestCalculator, ERSData paramERSData, TimeStampRequestGenerator paramTimeStampRequestGenerator, BigInteger paramBigInteger) throws ERSException, TSPException, IOException {
    try {
      this.firstArchiveTimeStamp.validatePresent(paramERSData, new Date());
    } catch (Exception exception) {
      throw new ERSException("attempt to hash renew on invalid data");
    } 
    ERSArchiveTimeStampGenerator eRSArchiveTimeStampGenerator = new ERSArchiveTimeStampGenerator(paramDigestCalculator);
    eRSArchiveTimeStampGenerator.addData(paramERSData);
    eRSArchiveTimeStampGenerator.addPreviousChains(this.evidenceRecord.getArchiveTimeStampSequence());
    return eRSArchiveTimeStampGenerator.generateTimeStampRequest(paramTimeStampRequestGenerator, paramBigInteger);
  }
  
  public ERSEvidenceRecord renewHash(DigestCalculator paramDigestCalculator, ERSData paramERSData, TimeStampResponse paramTimeStampResponse) throws ERSException, TSPException {
    try {
      this.firstArchiveTimeStamp.validatePresent(paramERSData, new Date());
    } catch (Exception exception) {
      throw new ERSException("attempt to hash renew on invalid data");
    } 
    try {
      ERSArchiveTimeStampGenerator eRSArchiveTimeStampGenerator = new ERSArchiveTimeStampGenerator(paramDigestCalculator);
      eRSArchiveTimeStampGenerator.addData(paramERSData);
      eRSArchiveTimeStampGenerator.addPreviousChains(this.evidenceRecord.getArchiveTimeStampSequence());
      ArchiveTimeStamp archiveTimeStamp = eRSArchiveTimeStampGenerator.generateArchiveTimeStamp(paramTimeStampResponse).toASN1Structure();
      return new ERSEvidenceRecord(this.evidenceRecord.addArchiveTimeStamp(archiveTimeStamp, true), this.digestCalculatorProvider);
    } catch (IOException iOException) {
      throw new ERSException(iOException.getMessage(), iOException);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new ERSException(illegalArgumentException.getMessage(), illegalArgumentException);
    } 
  }
  
  DigestCalculatorProvider getDigestAlgorithmProvider() {
    return this.digestCalculatorProvider;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ERSEvidenceRecord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */