package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BEROctetStringGenerator;
import org.bouncycastle.asn1.BERSequenceGenerator;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLSet;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.EncryptedContentInfo;
import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.asn1.cms.OtherRevocationInfoFormat;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.ocsp.OCSPResponse;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OutputAEADEncryptor;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.Streams;
import org.bouncycastle.util.io.TeeInputStream;
import org.bouncycastle.util.io.TeeOutputStream;

class CMSUtils {
  private static final Set<String> des = new HashSet<>();
  
  private static final Set mqvAlgs = new HashSet();
  
  private static final Set ecAlgs = new HashSet();
  
  private static final Set gostAlgs = new HashSet();
  
  static boolean isMQV(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return mqvAlgs.contains(paramASN1ObjectIdentifier);
  }
  
  static boolean isEC(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return ecAlgs.contains(paramASN1ObjectIdentifier);
  }
  
  static boolean isGOST(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return gostAlgs.contains(paramASN1ObjectIdentifier);
  }
  
  static boolean isRFC2631(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return (paramASN1ObjectIdentifier.equals((ASN1Primitive)PKCSObjectIdentifiers.id_alg_ESDH) || paramASN1ObjectIdentifier.equals((ASN1Primitive)PKCSObjectIdentifiers.id_alg_SSDH));
  }
  
  static boolean isDES(String paramString) {
    String str = Strings.toUpperCase(paramString);
    return des.contains(str);
  }
  
  static boolean isEquivalent(AlgorithmIdentifier paramAlgorithmIdentifier1, AlgorithmIdentifier paramAlgorithmIdentifier2) {
    if (paramAlgorithmIdentifier1 == null || paramAlgorithmIdentifier2 == null)
      return false; 
    if (!paramAlgorithmIdentifier1.getAlgorithm().equals((ASN1Primitive)paramAlgorithmIdentifier2.getAlgorithm()))
      return false; 
    ASN1Encodable aSN1Encodable1 = paramAlgorithmIdentifier1.getParameters();
    ASN1Encodable aSN1Encodable2 = paramAlgorithmIdentifier2.getParameters();
    return (aSN1Encodable1 != null) ? ((aSN1Encodable1.equals(aSN1Encodable2) || (aSN1Encodable1.equals(DERNull.INSTANCE) && aSN1Encodable2 == null))) : ((aSN1Encodable2 == null || aSN1Encodable2.equals(DERNull.INSTANCE)));
  }
  
  static ContentInfo readContentInfo(byte[] paramArrayOfbyte) throws CMSException {
    return readContentInfo(new ASN1InputStream(paramArrayOfbyte));
  }
  
  static ContentInfo readContentInfo(InputStream paramInputStream) throws CMSException {
    return readContentInfo(new ASN1InputStream(paramInputStream));
  }
  
  static ASN1Set convertToDlSet(Set<AlgorithmIdentifier> paramSet) {
    return (ASN1Set)new DLSet((ASN1Encodable[])paramSet.<AlgorithmIdentifier>toArray(new AlgorithmIdentifier[paramSet.size()]));
  }
  
  static void addDigestAlgs(Set<AlgorithmIdentifier> paramSet, SignerInformation paramSignerInformation, DigestAlgorithmIdentifierFinder paramDigestAlgorithmIdentifierFinder) {
    paramSet.add(CMSSignedHelper.INSTANCE.fixDigestAlgID(paramSignerInformation.getDigestAlgorithmID(), paramDigestAlgorithmIdentifierFinder));
    SignerInformationStore signerInformationStore = paramSignerInformation.getCounterSignatures();
    for (SignerInformation signerInformation : signerInformationStore)
      paramSet.add(CMSSignedHelper.INSTANCE.fixDigestAlgID(signerInformation.getDigestAlgorithmID(), paramDigestAlgorithmIdentifierFinder)); 
  }
  
  static List getCertificatesFromStore(Store paramStore) throws CMSException {
    ArrayList<Certificate> arrayList = new ArrayList();
    try {
      for (X509CertificateHolder x509CertificateHolder : paramStore.getMatches(null))
        arrayList.add(x509CertificateHolder.toASN1Structure()); 
      return arrayList;
    } catch (ClassCastException classCastException) {
      throw new CMSException("error processing certs", classCastException);
    } 
  }
  
  static List getAttributeCertificatesFromStore(Store paramStore) throws CMSException {
    ArrayList<DERTaggedObject> arrayList = new ArrayList();
    try {
      for (X509AttributeCertificateHolder x509AttributeCertificateHolder : paramStore.getMatches(null))
        arrayList.add(new DERTaggedObject(false, 2, (ASN1Encodable)x509AttributeCertificateHolder.toASN1Structure())); 
      return arrayList;
    } catch (ClassCastException classCastException) {
      throw new CMSException("error processing certs", classCastException);
    } 
  }
  
  static List getCRLsFromStore(Store paramStore) throws CMSException {
    ArrayList<CertificateList> arrayList = new ArrayList();
    try {
      for (X509CRLHolder x509CRLHolder : paramStore.getMatches(null)) {
        if (x509CRLHolder instanceof X509CRLHolder) {
          X509CRLHolder x509CRLHolder1 = x509CRLHolder;
          arrayList.add(x509CRLHolder1.toASN1Structure());
          continue;
        } 
        if (x509CRLHolder instanceof OtherRevocationInfoFormat) {
          OtherRevocationInfoFormat otherRevocationInfoFormat = OtherRevocationInfoFormat.getInstance(x509CRLHolder);
          validateInfoFormat(otherRevocationInfoFormat);
          arrayList.add(new DERTaggedObject(false, 1, (ASN1Encodable)otherRevocationInfoFormat));
          continue;
        } 
        if (x509CRLHolder instanceof org.bouncycastle.asn1.ASN1TaggedObject)
          arrayList.add(x509CRLHolder); 
      } 
      return arrayList;
    } catch (ClassCastException classCastException) {
      throw new CMSException("error processing certs", classCastException);
    } 
  }
  
  static void validateInfoFormat(OtherRevocationInfoFormat paramOtherRevocationInfoFormat) {
    if (CMSObjectIdentifiers.id_ri_ocsp_response.equals((ASN1Primitive)paramOtherRevocationInfoFormat.getInfoFormat())) {
      OCSPResponse oCSPResponse = OCSPResponse.getInstance(paramOtherRevocationInfoFormat.getInfo());
      if (0 != oCSPResponse.getResponseStatus().getIntValue())
        throw new IllegalArgumentException("cannot add unsuccessful OCSP response to CMS SignedData"); 
    } 
  }
  
  static Collection getOthersFromStore(ASN1ObjectIdentifier paramASN1ObjectIdentifier, Store paramStore) {
    ArrayList<DERTaggedObject> arrayList = new ArrayList();
    for (ASN1Encodable aSN1Encodable : paramStore.getMatches(null)) {
      OtherRevocationInfoFormat otherRevocationInfoFormat = new OtherRevocationInfoFormat(paramASN1ObjectIdentifier, aSN1Encodable);
      validateInfoFormat(otherRevocationInfoFormat);
      arrayList.add(new DERTaggedObject(false, 1, (ASN1Encodable)otherRevocationInfoFormat));
    } 
    return arrayList;
  }
  
  static ASN1Set createBerSetFromList(List paramList) {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    Iterator<ASN1Encodable> iterator = paramList.iterator();
    while (iterator.hasNext())
      aSN1EncodableVector.add(iterator.next()); 
    return (ASN1Set)new BERSet(aSN1EncodableVector);
  }
  
  static ASN1Set createDlSetFromList(List paramList) {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    Iterator<ASN1Encodable> iterator = paramList.iterator();
    while (iterator.hasNext())
      aSN1EncodableVector.add(iterator.next()); 
    return (ASN1Set)new DLSet(aSN1EncodableVector);
  }
  
  static ASN1Set createDerSetFromList(List paramList) {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    Iterator<ASN1Encodable> iterator = paramList.iterator();
    while (iterator.hasNext())
      aSN1EncodableVector.add(iterator.next()); 
    return (ASN1Set)new DERSet(aSN1EncodableVector);
  }
  
  static OutputStream createBEROctetOutputStream(OutputStream paramOutputStream, int paramInt1, boolean paramBoolean, int paramInt2) throws IOException {
    BEROctetStringGenerator bEROctetStringGenerator = new BEROctetStringGenerator(paramOutputStream, paramInt1, paramBoolean);
    return (paramInt2 != 0) ? bEROctetStringGenerator.getOctetOutputStream(new byte[paramInt2]) : bEROctetStringGenerator.getOctetOutputStream();
  }
  
  private static ContentInfo readContentInfo(ASN1InputStream paramASN1InputStream) throws CMSException {
    try {
      ContentInfo contentInfo = ContentInfo.getInstance(paramASN1InputStream.readObject());
      if (contentInfo == null)
        throw new CMSException("No content found."); 
      return contentInfo;
    } catch (IOException iOException) {
      throw new CMSException("IOException reading content.", iOException);
    } catch (ClassCastException classCastException) {
      throw new CMSException("Malformed content.", classCastException);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new CMSException("Malformed content.", illegalArgumentException);
    } 
  }
  
  public static byte[] streamToByteArray(InputStream paramInputStream) throws IOException {
    return Streams.readAll(paramInputStream);
  }
  
  public static byte[] streamToByteArray(InputStream paramInputStream, int paramInt) throws IOException {
    return Streams.readAllLimited(paramInputStream, paramInt);
  }
  
  static InputStream attachDigestsToInputStream(Collection paramCollection, InputStream paramInputStream) {
    TeeInputStream teeInputStream;
    InputStream inputStream = paramInputStream;
    for (DigestCalculator digestCalculator : paramCollection)
      teeInputStream = new TeeInputStream(inputStream, digestCalculator.getOutputStream()); 
    return (InputStream)teeInputStream;
  }
  
  static OutputStream attachSignersToOutputStream(Collection paramCollection, OutputStream paramOutputStream) {
    OutputStream outputStream = paramOutputStream;
    for (SignerInfoGenerator signerInfoGenerator : paramCollection)
      outputStream = getSafeTeeOutputStream(outputStream, signerInfoGenerator.getCalculatingOutputStream()); 
    return outputStream;
  }
  
  static OutputStream getSafeOutputStream(OutputStream paramOutputStream) {
    return (paramOutputStream == null) ? new NullOutputStream() : paramOutputStream;
  }
  
  static OutputStream getSafeTeeOutputStream(OutputStream paramOutputStream1, OutputStream paramOutputStream2) {
    return (paramOutputStream1 == null) ? getSafeOutputStream(paramOutputStream2) : ((paramOutputStream2 == null) ? getSafeOutputStream(paramOutputStream1) : (OutputStream)new TeeOutputStream(paramOutputStream1, paramOutputStream2));
  }
  
  static EncryptedContentInfo getEncryptedContentInfo(CMSTypedData paramCMSTypedData, OutputEncryptor paramOutputEncryptor, byte[] paramArrayOfbyte) {
    return getEncryptedContentInfo(paramCMSTypedData.getContentType(), paramOutputEncryptor.getAlgorithmIdentifier(), paramArrayOfbyte);
  }
  
  static EncryptedContentInfo getEncryptedContentInfo(ASN1ObjectIdentifier paramASN1ObjectIdentifier, AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte) {
    BEROctetString bEROctetString = new BEROctetString(paramArrayOfbyte);
    return new EncryptedContentInfo(paramASN1ObjectIdentifier, paramAlgorithmIdentifier, (ASN1OctetString)bEROctetString);
  }
  
  static ASN1EncodableVector getRecipentInfos(GenericKey paramGenericKey, List paramList) throws CMSException {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    for (RecipientInfoGenerator recipientInfoGenerator : paramList)
      aSN1EncodableVector.add((ASN1Encodable)recipientInfoGenerator.generate(paramGenericKey)); 
    return aSN1EncodableVector;
  }
  
  static void addRecipientInfosToGenerator(ASN1EncodableVector paramASN1EncodableVector, BERSequenceGenerator paramBERSequenceGenerator, boolean paramBoolean) throws IOException {
    if (paramBoolean) {
      paramBERSequenceGenerator.getRawOutputStream().write((new BERSet(paramASN1EncodableVector)).getEncoded());
    } else {
      paramBERSequenceGenerator.getRawOutputStream().write((new DERSet(paramASN1EncodableVector)).getEncoded());
    } 
  }
  
  static void addOriginatorInfoToGenerator(BERSequenceGenerator paramBERSequenceGenerator, OriginatorInfo paramOriginatorInfo) throws IOException {
    if (paramOriginatorInfo != null)
      paramBERSequenceGenerator.addObject((ASN1Primitive)new DERTaggedObject(false, 0, (ASN1Encodable)paramOriginatorInfo)); 
  }
  
  static void addAttriSetToGenerator(BERSequenceGenerator paramBERSequenceGenerator, CMSAttributeTableGenerator paramCMSAttributeTableGenerator, int paramInt, Map paramMap) throws IOException {
    if (paramCMSAttributeTableGenerator != null)
      paramBERSequenceGenerator.addObject((ASN1Primitive)new DERTaggedObject(false, paramInt, (ASN1Encodable)new BERSet(paramCMSAttributeTableGenerator.getAttributes(paramMap).toASN1EncodableVector()))); 
  }
  
  static ASN1Set processAuthAttrSet(CMSAttributeTableGenerator paramCMSAttributeTableGenerator, OutputAEADEncryptor paramOutputAEADEncryptor) throws IOException {
    DERSet dERSet = null;
    if (paramCMSAttributeTableGenerator != null) {
      AttributeTable attributeTable = paramCMSAttributeTableGenerator.getAttributes(Collections.EMPTY_MAP);
      dERSet = new DERSet(attributeTable.toASN1EncodableVector());
      paramOutputAEADEncryptor.getAADStream().write(dERSet.getEncoded("DER"));
    } 
    return (ASN1Set)dERSet;
  }
  
  static AttributeTable getAttributesTable(ASN1SetParser paramASN1SetParser) throws IOException {
    if (paramASN1SetParser != null) {
      ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
      ASN1Encodable aSN1Encodable;
      while ((aSN1Encodable = paramASN1SetParser.readObject()) != null) {
        ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser)aSN1Encodable;
        aSN1EncodableVector.add((ASN1Encodable)aSN1SequenceParser.toASN1Primitive());
      } 
      return new AttributeTable((ASN1Set)new DERSet(aSN1EncodableVector));
    } 
    return null;
  }
  
  static ASN1Set getAttrDLSet(CMSAttributeTableGenerator paramCMSAttributeTableGenerator) {
    return (paramCMSAttributeTableGenerator != null) ? (ASN1Set)new DLSet(paramCMSAttributeTableGenerator.getAttributes(Collections.EMPTY_MAP).toASN1EncodableVector()) : null;
  }
  
  static ASN1Set getAttrBERSet(CMSAttributeTableGenerator paramCMSAttributeTableGenerator) {
    return (paramCMSAttributeTableGenerator != null) ? (ASN1Set)new BERSet(paramCMSAttributeTableGenerator.getAttributes(Collections.EMPTY_MAP).toASN1EncodableVector()) : null;
  }
  
  static byte[] encodeObj(ASN1Encodable paramASN1Encodable) throws IOException {
    return (paramASN1Encodable != null) ? paramASN1Encodable.toASN1Primitive().getEncoded() : null;
  }
  
  static {
    des.add("DES");
    des.add("DESEDE");
    des.add(OIWObjectIdentifiers.desCBC.getId());
    des.add(PKCSObjectIdentifiers.des_EDE3_CBC.getId());
    des.add(PKCSObjectIdentifiers.id_alg_CMS3DESwrap.getId());
    mqvAlgs.add(X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme);
    mqvAlgs.add(SECObjectIdentifiers.mqvSinglePass_sha224kdf_scheme);
    mqvAlgs.add(SECObjectIdentifiers.mqvSinglePass_sha256kdf_scheme);
    mqvAlgs.add(SECObjectIdentifiers.mqvSinglePass_sha384kdf_scheme);
    mqvAlgs.add(SECObjectIdentifiers.mqvSinglePass_sha512kdf_scheme);
    ecAlgs.add(X9ObjectIdentifiers.dhSinglePass_cofactorDH_sha1kdf_scheme);
    ecAlgs.add(X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha224kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha224kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha256kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha256kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha384kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha384kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha512kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha512kdf_scheme);
    gostAlgs.add(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_ESDH);
    gostAlgs.add(RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_256);
    gostAlgs.add(RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_512);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */