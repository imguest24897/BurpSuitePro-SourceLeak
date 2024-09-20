package org.bouncycastle.cert;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AltSignatureAlgorithm;
import org.bouncycastle.asn1.x509.AltSignatureValue;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.util.Encodable;

public class X509CRLHolder implements Encodable, Serializable {
  private static final long serialVersionUID = 20170722001L;
  
  private transient CertificateList x509CRL;
  
  private transient boolean isIndirect;
  
  private transient Extensions extensions;
  
  private transient GeneralNames issuerName;
  
  private static CertificateList parseStream(InputStream paramInputStream) throws IOException {
    try {
      ASN1Primitive aSN1Primitive = (new ASN1InputStream(paramInputStream, true)).readObject();
      if (aSN1Primitive == null)
        throw new IOException("no content found"); 
      return CertificateList.getInstance(aSN1Primitive);
    } catch (ClassCastException classCastException) {
      throw new CertIOException("malformed data: " + classCastException.getMessage(), classCastException);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new CertIOException("malformed data: " + illegalArgumentException.getMessage(), illegalArgumentException);
    } 
  }
  
  private static boolean isIndirectCRL(Extensions paramExtensions) {
    if (paramExtensions == null)
      return false; 
    Extension extension = paramExtensions.getExtension(Extension.issuingDistributionPoint);
    return (extension != null && IssuingDistributionPoint.getInstance(extension.getParsedValue()).isIndirectCRL());
  }
  
  public X509CRLHolder(byte[] paramArrayOfbyte) throws IOException {
    this(parseStream(new ByteArrayInputStream(paramArrayOfbyte)));
  }
  
  public X509CRLHolder(InputStream paramInputStream) throws IOException {
    this(parseStream(paramInputStream));
  }
  
  public X509CRLHolder(CertificateList paramCertificateList) {
    init(paramCertificateList);
  }
  
  private void init(CertificateList paramCertificateList) {
    this.x509CRL = paramCertificateList;
    this.extensions = paramCertificateList.getTBSCertList().getExtensions();
    this.isIndirect = isIndirectCRL(this.extensions);
    this.issuerName = new GeneralNames(new GeneralName(paramCertificateList.getIssuer()));
  }
  
  public byte[] getEncoded() throws IOException {
    return this.x509CRL.getEncoded();
  }
  
  public X500Name getIssuer() {
    return X500Name.getInstance(this.x509CRL.getIssuer());
  }
  
  public Date getThisUpdate() {
    return this.x509CRL.getThisUpdate().getDate();
  }
  
  public Date getNextUpdate() {
    Time time = this.x509CRL.getNextUpdate();
    return (time != null) ? time.getDate() : null;
  }
  
  public X509CRLEntryHolder getRevokedCertificate(BigInteger paramBigInteger) {
    GeneralNames generalNames = this.issuerName;
    Enumeration<TBSCertList.CRLEntry> enumeration = this.x509CRL.getRevokedCertificateEnumeration();
    while (enumeration.hasMoreElements()) {
      TBSCertList.CRLEntry cRLEntry = enumeration.nextElement();
      if (cRLEntry.getUserCertificate().hasValue(paramBigInteger))
        return new X509CRLEntryHolder(cRLEntry, this.isIndirect, generalNames); 
      if (this.isIndirect && cRLEntry.hasExtensions()) {
        Extension extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer);
        if (extension != null)
          generalNames = GeneralNames.getInstance(extension.getParsedValue()); 
      } 
    } 
    return null;
  }
  
  public Collection getRevokedCertificates() {
    TBSCertList.CRLEntry[] arrayOfCRLEntry = this.x509CRL.getRevokedCertificates();
    ArrayList<X509CRLEntryHolder> arrayList = new ArrayList(arrayOfCRLEntry.length);
    GeneralNames generalNames = this.issuerName;
    Enumeration<TBSCertList.CRLEntry> enumeration = this.x509CRL.getRevokedCertificateEnumeration();
    while (enumeration.hasMoreElements()) {
      TBSCertList.CRLEntry cRLEntry = enumeration.nextElement();
      X509CRLEntryHolder x509CRLEntryHolder = new X509CRLEntryHolder(cRLEntry, this.isIndirect, generalNames);
      arrayList.add(x509CRLEntryHolder);
      generalNames = x509CRLEntryHolder.getCertificateIssuer();
    } 
    return arrayList;
  }
  
  public boolean hasExtensions() {
    return (this.extensions != null);
  }
  
  public Extension getExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return (this.extensions != null) ? this.extensions.getExtension(paramASN1ObjectIdentifier) : null;
  }
  
  public Extensions getExtensions() {
    return this.extensions;
  }
  
  public List getExtensionOIDs() {
    return CertUtils.getExtensionOIDs(this.extensions);
  }
  
  public Set getCriticalExtensionOIDs() {
    return CertUtils.getCriticalExtensionOIDs(this.extensions);
  }
  
  public Set getNonCriticalExtensionOIDs() {
    return CertUtils.getNonCriticalExtensionOIDs(this.extensions);
  }
  
  public CertificateList toASN1Structure() {
    return this.x509CRL;
  }
  
  public boolean isSignatureValid(ContentVerifierProvider paramContentVerifierProvider) throws CertException {
    ContentVerifier contentVerifier;
    TBSCertList tBSCertList = this.x509CRL.getTBSCertList();
    if (!CertUtils.isAlgIdEqual(tBSCertList.getSignature(), this.x509CRL.getSignatureAlgorithm()))
      throw new CertException("signature invalid - algorithm identifier mismatch"); 
    try {
      contentVerifier = paramContentVerifierProvider.get(tBSCertList.getSignature());
      OutputStream outputStream = contentVerifier.getOutputStream();
      tBSCertList.encodeTo(outputStream, "DER");
      outputStream.close();
    } catch (Exception exception) {
      throw new CertException("unable to process signature: " + exception.getMessage(), exception);
    } 
    return contentVerifier.verify(this.x509CRL.getSignature().getOctets());
  }
  
  public boolean isAlternativeSignatureValid(ContentVerifierProvider paramContentVerifierProvider) throws CertException {
    ContentVerifier contentVerifier;
    TBSCertList tBSCertList = this.x509CRL.getTBSCertList();
    AltSignatureAlgorithm altSignatureAlgorithm = AltSignatureAlgorithm.fromExtensions(tBSCertList.getExtensions());
    AltSignatureValue altSignatureValue = AltSignatureValue.fromExtensions(tBSCertList.getExtensions());
    try {
      contentVerifier = paramContentVerifierProvider.get(AlgorithmIdentifier.getInstance(altSignatureAlgorithm.toASN1Primitive()));
      OutputStream outputStream = contentVerifier.getOutputStream();
      ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(tBSCertList.toASN1Primitive());
      ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
      byte b1 = 1;
      if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1Integer) {
        aSN1EncodableVector.add(aSN1Sequence.getObjectAt(0));
        b1++;
      } 
      for (byte b2 = b1; b2 != aSN1Sequence.size() - 1; b2++)
        aSN1EncodableVector.add(aSN1Sequence.getObjectAt(b2)); 
      aSN1EncodableVector.add((ASN1Encodable)CertUtils.trimExtensions(0, tBSCertList.getExtensions()));
      (new DERSequence(aSN1EncodableVector)).encodeTo(outputStream, "DER");
      outputStream.close();
    } catch (Exception exception) {
      throw new CertException("unable to process signature: " + exception.getMessage(), exception);
    } 
    return contentVerifier.verify(altSignatureValue.getSignature().getOctets());
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof X509CRLHolder))
      return false; 
    X509CRLHolder x509CRLHolder = (X509CRLHolder)paramObject;
    return this.x509CRL.equals(x509CRLHolder.x509CRL);
  }
  
  public int hashCode() {
    return this.x509CRL.hashCode();
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws IOException, ClassNotFoundException {
    paramObjectInputStream.defaultReadObject();
    init(CertificateList.getInstance(paramObjectInputStream.readObject()));
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) throws IOException {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(getEncoded());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\X509CRLHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */