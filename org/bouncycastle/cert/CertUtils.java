package org.bouncycastle.cert;

import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.AttributeCertificateInfo;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.util.Properties;

class CertUtils {
  private static Set EMPTY_SET = Collections.unmodifiableSet(new HashSet());
  
  private static List EMPTY_LIST = Collections.unmodifiableList(new ArrayList());
  
  static ASN1Primitive parseNonEmptyASN1(byte[] paramArrayOfbyte) throws IOException {
    ASN1Primitive aSN1Primitive = ASN1Primitive.fromByteArray(paramArrayOfbyte);
    if (aSN1Primitive == null)
      throw new IOException("no content found"); 
    return aSN1Primitive;
  }
  
  static X509CertificateHolder generateFullCert(ContentSigner paramContentSigner, TBSCertificate paramTBSCertificate) {
    try {
      return new X509CertificateHolder(generateStructure(paramTBSCertificate, paramContentSigner.getAlgorithmIdentifier(), generateSig(paramContentSigner, (ASN1Object)paramTBSCertificate)));
    } catch (IOException iOException) {
      throw new IllegalStateException("cannot produce certificate signature");
    } 
  }
  
  static X509AttributeCertificateHolder generateFullAttrCert(ContentSigner paramContentSigner, AttributeCertificateInfo paramAttributeCertificateInfo) {
    try {
      return new X509AttributeCertificateHolder(generateAttrStructure(paramAttributeCertificateInfo, paramContentSigner.getAlgorithmIdentifier(), generateSig(paramContentSigner, (ASN1Object)paramAttributeCertificateInfo)));
    } catch (IOException iOException) {
      throw new IllegalStateException("cannot produce attribute certificate signature");
    } 
  }
  
  private static Certificate generateStructure(TBSCertificate paramTBSCertificate, AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte) {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)paramTBSCertificate);
    aSN1EncodableVector.add((ASN1Encodable)paramAlgorithmIdentifier);
    aSN1EncodableVector.add((ASN1Encodable)new DERBitString(paramArrayOfbyte));
    return Certificate.getInstance(new DERSequence(aSN1EncodableVector));
  }
  
  private static AttributeCertificate generateAttrStructure(AttributeCertificateInfo paramAttributeCertificateInfo, AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte) {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)paramAttributeCertificateInfo);
    aSN1EncodableVector.add((ASN1Encodable)paramAlgorithmIdentifier);
    aSN1EncodableVector.add((ASN1Encodable)new DERBitString(paramArrayOfbyte));
    return AttributeCertificate.getInstance(new DERSequence(aSN1EncodableVector));
  }
  
  private static CertificateList generateCRLStructure(TBSCertList paramTBSCertList, AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte) {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)paramTBSCertList);
    aSN1EncodableVector.add((ASN1Encodable)paramAlgorithmIdentifier);
    aSN1EncodableVector.add((ASN1Encodable)new DERBitString(paramArrayOfbyte));
    return CertificateList.getInstance(new DERSequence(aSN1EncodableVector));
  }
  
  static Set getCriticalExtensionOIDs(Extensions paramExtensions) {
    return (paramExtensions == null) ? EMPTY_SET : Collections.unmodifiableSet(new HashSet(Arrays.asList((Object[])paramExtensions.getCriticalExtensionOIDs())));
  }
  
  static Set getNonCriticalExtensionOIDs(Extensions paramExtensions) {
    return (paramExtensions == null) ? EMPTY_SET : Collections.unmodifiableSet(new HashSet(Arrays.asList((Object[])paramExtensions.getNonCriticalExtensionOIDs())));
  }
  
  static List getExtensionOIDs(Extensions paramExtensions) {
    return (paramExtensions == null) ? EMPTY_LIST : Collections.unmodifiableList(Arrays.asList((Object[])paramExtensions.getExtensionOIDs()));
  }
  
  static void addExtension(ExtensionsGenerator paramExtensionsGenerator, ASN1ObjectIdentifier paramASN1ObjectIdentifier, boolean paramBoolean, ASN1Encodable paramASN1Encodable) throws CertIOException {
    try {
      paramExtensionsGenerator.addExtension(paramASN1ObjectIdentifier, paramBoolean, paramASN1Encodable);
    } catch (IOException iOException) {
      throw new CertIOException("cannot encode extension: " + iOException.getMessage(), iOException);
    } 
  }
  
  static DERBitString booleanToBitString(boolean[] paramArrayOfboolean) {
    byte[] arrayOfByte = new byte[(paramArrayOfboolean.length + 7) / 8];
    int i;
    for (i = 0; i != paramArrayOfboolean.length; i++)
      arrayOfByte[i / 8] = (byte)(arrayOfByte[i / 8] | (paramArrayOfboolean[i] ? (1 << 7 - i % 8) : 0)); 
    i = paramArrayOfboolean.length % 8;
    return (i == 0) ? new DERBitString(arrayOfByte) : new DERBitString(arrayOfByte, 8 - i);
  }
  
  static boolean[] bitStringToBoolean(ASN1BitString paramASN1BitString) {
    if (paramASN1BitString != null) {
      byte[] arrayOfByte = paramASN1BitString.getBytes();
      boolean[] arrayOfBoolean = new boolean[arrayOfByte.length * 8 - paramASN1BitString.getPadBits()];
      for (byte b = 0; b != arrayOfBoolean.length; b++)
        arrayOfBoolean[b] = ((arrayOfByte[b / 8] & 128 >>> b % 8) != 0); 
      return arrayOfBoolean;
    } 
    return null;
  }
  
  static Date recoverDate(ASN1GeneralizedTime paramASN1GeneralizedTime) {
    try {
      return paramASN1GeneralizedTime.getDate();
    } catch (ParseException parseException) {
      throw new IllegalStateException("unable to recover date: " + parseException.getMessage());
    } 
  }
  
  static boolean isAlgIdEqual(AlgorithmIdentifier paramAlgorithmIdentifier1, AlgorithmIdentifier paramAlgorithmIdentifier2) {
    if (!paramAlgorithmIdentifier1.getAlgorithm().equals((ASN1Primitive)paramAlgorithmIdentifier2.getAlgorithm()))
      return false; 
    if (Properties.isOverrideSet("org.bouncycastle.x509.allow_absent_equiv_NULL")) {
      if (paramAlgorithmIdentifier1.getParameters() == null)
        return !(paramAlgorithmIdentifier2.getParameters() != null && !paramAlgorithmIdentifier2.getParameters().equals(DERNull.INSTANCE)); 
      if (paramAlgorithmIdentifier2.getParameters() == null)
        return !(paramAlgorithmIdentifier1.getParameters() != null && !paramAlgorithmIdentifier1.getParameters().equals(DERNull.INSTANCE)); 
    } 
    return (paramAlgorithmIdentifier1.getParameters() != null) ? paramAlgorithmIdentifier1.getParameters().equals(paramAlgorithmIdentifier2.getParameters()) : ((paramAlgorithmIdentifier2.getParameters() != null) ? paramAlgorithmIdentifier2.getParameters().equals(paramAlgorithmIdentifier1.getParameters()) : true);
  }
  
  static ExtensionsGenerator doReplaceExtension(ExtensionsGenerator paramExtensionsGenerator, Extension paramExtension) {
    boolean bool = false;
    Extensions extensions = paramExtensionsGenerator.generate();
    paramExtensionsGenerator = new ExtensionsGenerator();
    Enumeration<ASN1ObjectIdentifier> enumeration = extensions.oids();
    while (enumeration.hasMoreElements()) {
      ASN1ObjectIdentifier aSN1ObjectIdentifier = enumeration.nextElement();
      if (aSN1ObjectIdentifier.equals((ASN1Primitive)paramExtension.getExtnId())) {
        bool = true;
        paramExtensionsGenerator.addExtension(paramExtension);
        continue;
      } 
      paramExtensionsGenerator.addExtension(extensions.getExtension(aSN1ObjectIdentifier));
    } 
    if (!bool)
      throw new IllegalArgumentException("replace - original extension (OID = " + paramExtension.getExtnId() + ") not found"); 
    return paramExtensionsGenerator;
  }
  
  static ExtensionsGenerator doRemoveExtension(ExtensionsGenerator paramExtensionsGenerator, ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    boolean bool = false;
    Extensions extensions = paramExtensionsGenerator.generate();
    paramExtensionsGenerator = new ExtensionsGenerator();
    Enumeration<ASN1ObjectIdentifier> enumeration = extensions.oids();
    while (enumeration.hasMoreElements()) {
      ASN1ObjectIdentifier aSN1ObjectIdentifier = enumeration.nextElement();
      if (aSN1ObjectIdentifier.equals((ASN1Primitive)paramASN1ObjectIdentifier)) {
        bool = true;
        continue;
      } 
      paramExtensionsGenerator.addExtension(extensions.getExtension(aSN1ObjectIdentifier));
    } 
    if (!bool)
      throw new IllegalArgumentException("remove - extension (OID = " + paramASN1ObjectIdentifier + ") not found"); 
    return paramExtensionsGenerator;
  }
  
  private static byte[] generateSig(ContentSigner paramContentSigner, ASN1Object paramASN1Object) throws IOException {
    OutputStream outputStream = paramContentSigner.getOutputStream();
    paramASN1Object.encodeTo(outputStream, "DER");
    outputStream.close();
    return paramContentSigner.getSignature();
  }
  
  static ASN1TaggedObject trimExtensions(int paramInt, Extensions paramExtensions) {
    ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(paramExtensions.toASN1Primitive());
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    for (byte b = 0; b != aSN1Sequence.size(); b++) {
      ASN1Sequence aSN1Sequence1 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(b));
      if (!Extension.altSignatureValue.equals(aSN1Sequence1.getObjectAt(0)))
        aSN1EncodableVector.add((ASN1Encodable)aSN1Sequence1); 
    } 
    return (ASN1TaggedObject)new DERTaggedObject(true, paramInt, (ASN1Encodable)new DERSequence(aSN1EncodableVector));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\CertUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */