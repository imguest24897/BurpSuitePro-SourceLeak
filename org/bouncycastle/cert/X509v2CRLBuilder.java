package org.bouncycastle.cert;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.V2TBSCertListGenerator;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.util.Exceptions;

public class X509v2CRLBuilder {
  private V2TBSCertListGenerator tbsGen = new V2TBSCertListGenerator();
  
  private ExtensionsGenerator extGenerator;
  
  public X509v2CRLBuilder(X500Name paramX500Name, Date paramDate) {
    this.extGenerator = new ExtensionsGenerator();
    this.tbsGen.setIssuer(paramX500Name);
    this.tbsGen.setThisUpdate(new Time(paramDate));
  }
  
  public X509v2CRLBuilder(X500Name paramX500Name, Date paramDate, Locale paramLocale) {
    this.extGenerator = new ExtensionsGenerator();
    this.tbsGen.setIssuer(paramX500Name);
    this.tbsGen.setThisUpdate(new Time(paramDate, paramLocale));
  }
  
  public X509v2CRLBuilder(X500Name paramX500Name, Time paramTime) {
    this.extGenerator = new ExtensionsGenerator();
    this.tbsGen.setIssuer(paramX500Name);
    this.tbsGen.setThisUpdate(paramTime);
  }
  
  public X509v2CRLBuilder(X509CRLHolder paramX509CRLHolder) {
    this.tbsGen.setIssuer(paramX509CRLHolder.getIssuer());
    this.tbsGen.setThisUpdate(new Time(paramX509CRLHolder.getThisUpdate()));
    Date date = paramX509CRLHolder.getNextUpdate();
    if (date != null)
      this.tbsGen.setNextUpdate(new Time(date)); 
    addCRL(paramX509CRLHolder);
    this.extGenerator = new ExtensionsGenerator();
    Extensions extensions = paramX509CRLHolder.getExtensions();
    if (extensions != null) {
      Enumeration<ASN1ObjectIdentifier> enumeration = extensions.oids();
      while (enumeration.hasMoreElements()) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = enumeration.nextElement();
        if (Extension.altSignatureAlgorithm.equals((ASN1Primitive)aSN1ObjectIdentifier) || Extension.altSignatureValue.equals((ASN1Primitive)aSN1ObjectIdentifier))
          continue; 
        this.extGenerator.addExtension(extensions.getExtension(aSN1ObjectIdentifier));
      } 
    } 
  }
  
  public boolean hasExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return (doGetExtension(paramASN1ObjectIdentifier) != null);
  }
  
  public Extension getExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return doGetExtension(paramASN1ObjectIdentifier);
  }
  
  private Extension doGetExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    if (this.extGenerator.isEmpty())
      return null; 
    Extensions extensions = this.extGenerator.generate();
    return extensions.getExtension(paramASN1ObjectIdentifier);
  }
  
  public X509v2CRLBuilder setThisUpdate(Date paramDate) {
    return setThisUpdate(new Time(paramDate));
  }
  
  public X509v2CRLBuilder setThisUpdate(Date paramDate, Locale paramLocale) {
    return setThisUpdate(new Time(paramDate, paramLocale));
  }
  
  public X509v2CRLBuilder setThisUpdate(Time paramTime) {
    this.tbsGen.setThisUpdate(paramTime);
    return this;
  }
  
  public X509v2CRLBuilder setNextUpdate(Date paramDate) {
    return setNextUpdate(new Time(paramDate));
  }
  
  public X509v2CRLBuilder setNextUpdate(Date paramDate, Locale paramLocale) {
    return setNextUpdate(new Time(paramDate, paramLocale));
  }
  
  public X509v2CRLBuilder setNextUpdate(Time paramTime) {
    this.tbsGen.setNextUpdate(paramTime);
    return this;
  }
  
  public X509v2CRLBuilder addCRLEntry(BigInteger paramBigInteger, Date paramDate, int paramInt) {
    this.tbsGen.addCRLEntry(new ASN1Integer(paramBigInteger), new Time(paramDate), paramInt);
    return this;
  }
  
  public X509v2CRLBuilder addCRLEntry(BigInteger paramBigInteger, Date paramDate1, int paramInt, Date paramDate2) {
    this.tbsGen.addCRLEntry(new ASN1Integer(paramBigInteger), new Time(paramDate1), paramInt, new ASN1GeneralizedTime(paramDate2));
    return this;
  }
  
  public X509v2CRLBuilder addCRLEntry(BigInteger paramBigInteger, Date paramDate, Extensions paramExtensions) {
    this.tbsGen.addCRLEntry(new ASN1Integer(paramBigInteger), new Time(paramDate), paramExtensions);
    return this;
  }
  
  public X509v2CRLBuilder addCRL(X509CRLHolder paramX509CRLHolder) {
    TBSCertList tBSCertList = paramX509CRLHolder.toASN1Structure().getTBSCertList();
    if (tBSCertList != null) {
      Enumeration<ASN1Encodable> enumeration = tBSCertList.getRevokedCertificateEnumeration();
      while (enumeration.hasMoreElements())
        this.tbsGen.addCRLEntry(ASN1Sequence.getInstance(((ASN1Encodable)enumeration.nextElement()).toASN1Primitive())); 
    } 
    return this;
  }
  
  public X509v2CRLBuilder addExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier, boolean paramBoolean, ASN1Encodable paramASN1Encodable) throws CertIOException {
    CertUtils.addExtension(this.extGenerator, paramASN1ObjectIdentifier, paramBoolean, paramASN1Encodable);
    return this;
  }
  
  public X509v2CRLBuilder addExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier, boolean paramBoolean, byte[] paramArrayOfbyte) throws CertIOException {
    this.extGenerator.addExtension(paramASN1ObjectIdentifier, paramBoolean, paramArrayOfbyte);
    return this;
  }
  
  public X509v2CRLBuilder addExtension(Extension paramExtension) throws CertIOException {
    this.extGenerator.addExtension(paramExtension);
    return this;
  }
  
  public X509v2CRLBuilder replaceExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier, boolean paramBoolean, ASN1Encodable paramASN1Encodable) throws CertIOException {
    try {
      this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, new Extension(paramASN1ObjectIdentifier, paramBoolean, paramASN1Encodable.toASN1Primitive().getEncoded("DER")));
    } catch (IOException iOException) {
      throw new CertIOException("cannot encode extension: " + iOException.getMessage(), iOException);
    } 
    return this;
  }
  
  public X509v2CRLBuilder replaceExtension(Extension paramExtension) throws CertIOException {
    this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, paramExtension);
    return this;
  }
  
  public X509v2CRLBuilder replaceExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier, boolean paramBoolean, byte[] paramArrayOfbyte) throws CertIOException {
    this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, new Extension(paramASN1ObjectIdentifier, paramBoolean, paramArrayOfbyte));
    return this;
  }
  
  public X509v2CRLBuilder removeExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this.extGenerator = CertUtils.doRemoveExtension(this.extGenerator, paramASN1ObjectIdentifier);
    return this;
  }
  
  public X509CRLHolder build(ContentSigner paramContentSigner) {
    this.tbsGen.setSignature(paramContentSigner.getAlgorithmIdentifier());
    if (!this.extGenerator.isEmpty())
      this.tbsGen.setExtensions(this.extGenerator.generate()); 
    return generateFullCRL(paramContentSigner, this.tbsGen.generateTBSCertList());
  }
  
  public X509CRLHolder build(ContentSigner paramContentSigner1, boolean paramBoolean, ContentSigner paramContentSigner2) {
    this.tbsGen.setSignature(null);
    try {
      this.extGenerator.addExtension(Extension.altSignatureAlgorithm, paramBoolean, (ASN1Encodable)paramContentSigner2.getAlgorithmIdentifier());
    } catch (IOException iOException) {
      throw Exceptions.illegalStateException("cannot add altSignatureAlgorithm extension", iOException);
    } 
    this.tbsGen.setExtensions(this.extGenerator.generate());
    try {
      this.extGenerator.addExtension(Extension.altSignatureValue, paramBoolean, (ASN1Encodable)new DERBitString(generateSig(paramContentSigner2, (ASN1Object)this.tbsGen.generatePreTBSCertList())));
      this.tbsGen.setSignature(paramContentSigner1.getAlgorithmIdentifier());
      this.tbsGen.setExtensions(this.extGenerator.generate());
      TBSCertList tBSCertList = this.tbsGen.generateTBSCertList();
      return new X509CRLHolder(generateCRLStructure(tBSCertList, paramContentSigner1.getAlgorithmIdentifier(), generateSig(paramContentSigner1, (ASN1Object)tBSCertList)));
    } catch (IOException iOException) {
      throw Exceptions.illegalArgumentException("cannot produce certificate signature", iOException);
    } 
  }
  
  private static X509CRLHolder generateFullCRL(ContentSigner paramContentSigner, TBSCertList paramTBSCertList) {
    try {
      return new X509CRLHolder(generateCRLStructure(paramTBSCertList, paramContentSigner.getAlgorithmIdentifier(), generateSig(paramContentSigner, (ASN1Object)paramTBSCertList)));
    } catch (IOException iOException) {
      throw Exceptions.illegalStateException("cannot produce certificate signature", iOException);
    } 
  }
  
  private static CertificateList generateCRLStructure(TBSCertList paramTBSCertList, AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte) {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)paramTBSCertList);
    aSN1EncodableVector.add((ASN1Encodable)paramAlgorithmIdentifier);
    aSN1EncodableVector.add((ASN1Encodable)new DERBitString(paramArrayOfbyte));
    return CertificateList.getInstance(new DERSequence(aSN1EncodableVector));
  }
  
  private static byte[] generateSig(ContentSigner paramContentSigner, ASN1Object paramASN1Object) throws IOException {
    OutputStream outputStream = paramContentSigner.getOutputStream();
    paramASN1Object.encodeTo(outputStream, "DER");
    outputStream.close();
    return paramContentSigner.getSignature();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\X509v2CRLBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */