package org.bouncycastle.cert;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;

public class DeltaCertificateTool {
  public static Extension makeDeltaCertificateExtension(boolean paramBoolean, X509CertificateHolder paramX509CertificateHolder) throws IOException {
    ASN1EncodableVector aSN1EncodableVector1 = new ASN1EncodableVector();
    aSN1EncodableVector1.add((ASN1Encodable)new ASN1Integer(paramX509CertificateHolder.getSerialNumber()));
    aSN1EncodableVector1.add((ASN1Encodable)new DERTaggedObject(false, 0, (ASN1Encodable)paramX509CertificateHolder.getSignatureAlgorithm()));
    aSN1EncodableVector1.add((ASN1Encodable)new DERTaggedObject(false, 1, (ASN1Encodable)paramX509CertificateHolder.getIssuer()));
    ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(2);
    aSN1EncodableVector2.add((ASN1Encodable)paramX509CertificateHolder.toASN1Structure().getStartDate());
    aSN1EncodableVector2.add((ASN1Encodable)paramX509CertificateHolder.toASN1Structure().getEndDate());
    aSN1EncodableVector1.add((ASN1Encodable)new DERTaggedObject(false, 2, (ASN1Encodable)new DERSequence(aSN1EncodableVector2)));
    aSN1EncodableVector1.add((ASN1Encodable)new DERTaggedObject(false, 3, (ASN1Encodable)paramX509CertificateHolder.getSubject()));
    aSN1EncodableVector1.add((ASN1Encodable)paramX509CertificateHolder.getSubjectPublicKeyInfo());
    if (paramX509CertificateHolder.getExtensions() != null)
      aSN1EncodableVector1.add((ASN1Encodable)new DERTaggedObject(false, 4, (ASN1Encodable)paramX509CertificateHolder.getExtensions())); 
    aSN1EncodableVector1.add((ASN1Encodable)new DERBitString(paramX509CertificateHolder.getSignature()));
    return new Extension(Extension.deltaCertificateDescriptor, paramBoolean, (new DERSequence(aSN1EncodableVector1)).getEncoded("DER"));
  }
  
  public static X509CertificateHolder extractDeltaCertificate(X509CertificateHolder paramX509CertificateHolder) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.deltaCertificateDescriptor;
    Extension extension = paramX509CertificateHolder.getExtension(aSN1ObjectIdentifier);
    ASN1Sequence aSN1Sequence1 = ASN1Sequence.getInstance(extension.getParsedValue());
    ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(paramX509CertificateHolder.toASN1Structure().getTBSCertificate().toASN1Primitive());
    byte b1 = 0;
    ASN1Encodable[] arrayOfASN1Encodable = aSN1Sequence2.toArray();
    arrayOfASN1Encodable[0] = aSN1Sequence2.getObjectAt(0);
    arrayOfASN1Encodable[1] = (ASN1Encodable)ASN1Integer.getInstance(aSN1Sequence1.getObjectAt(b1++));
    ASN1Encodable aSN1Encodable;
    for (aSN1Encodable = aSN1Sequence1.getObjectAt(b1++); aSN1Encodable instanceof ASN1TaggedObject; aSN1Encodable = aSN1Sequence1.getObjectAt(b1++)) {
      ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Encodable);
      switch (aSN1TaggedObject.getTagNo()) {
        case 0:
          arrayOfASN1Encodable[2] = (ASN1Encodable)ASN1Sequence.getInstance(aSN1TaggedObject, false);
          break;
        case 1:
          arrayOfASN1Encodable[3] = (ASN1Encodable)ASN1Sequence.getInstance(aSN1TaggedObject, true);
          break;
        case 2:
          arrayOfASN1Encodable[4] = (ASN1Encodable)ASN1Sequence.getInstance(aSN1TaggedObject, false);
          break;
        case 3:
          arrayOfASN1Encodable[5] = (ASN1Encodable)ASN1Sequence.getInstance((ASN1TaggedObject)aSN1Encodable, true);
          break;
      } 
    } 
    arrayOfASN1Encodable[6] = aSN1Encodable;
    if (arrayOfASN1Encodable[2] == null)
      arrayOfASN1Encodable[2] = aSN1Sequence2.getObjectAt(2); 
    if (arrayOfASN1Encodable[3] == null)
      arrayOfASN1Encodable[3] = aSN1Sequence2.getObjectAt(3); 
    if (arrayOfASN1Encodable[4] == null)
      arrayOfASN1Encodable[4] = aSN1Sequence2.getObjectAt(4); 
    if (arrayOfASN1Encodable[5] == null)
      arrayOfASN1Encodable[5] = aSN1Sequence2.getObjectAt(5); 
    ExtensionsGenerator extensionsGenerator = extractExtensions(aSN1Sequence2);
    if (b1 < aSN1Sequence1.size() - 1) {
      aSN1Encodable = aSN1Sequence1.getObjectAt(b1++);
      ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Encodable);
      if (aSN1TaggedObject.getTagNo() != 4)
        throw new IllegalArgumentException("malformed delta extension"); 
      ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1TaggedObject, false);
      for (byte b = 0; b != aSN1Sequence.size(); b++) {
        Extension extension1 = Extension.getInstance(aSN1Sequence.getObjectAt(b));
        extensionsGenerator.replaceExtension(extension1);
      } 
      arrayOfASN1Encodable[7] = (ASN1Encodable)new DERTaggedObject(3, (ASN1Encodable)extensionsGenerator.generate());
    } else if (!extensionsGenerator.isEmpty()) {
      arrayOfASN1Encodable[7] = (ASN1Encodable)new DERTaggedObject(3, (ASN1Encodable)extensionsGenerator.generate());
    } else {
      arrayOfASN1Encodable[7] = null;
    } 
    ASN1EncodableVector aSN1EncodableVector1 = new ASN1EncodableVector(7);
    for (byte b2 = 0; b2 != arrayOfASN1Encodable.length; b2++) {
      if (arrayOfASN1Encodable[b2] != null)
        aSN1EncodableVector1.add(arrayOfASN1Encodable[b2]); 
    } 
    ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
    aSN1EncodableVector2.add((ASN1Encodable)new DERSequence(aSN1EncodableVector1));
    aSN1EncodableVector2.add((ASN1Encodable)ASN1Sequence.getInstance(arrayOfASN1Encodable[2]));
    aSN1EncodableVector2.add((ASN1Encodable)ASN1BitString.getInstance(aSN1Sequence1.getObjectAt(aSN1Sequence1.size() - 1)));
    return new X509CertificateHolder(Certificate.getInstance(new DERSequence(aSN1EncodableVector2)));
  }
  
  private static ExtensionsGenerator extractExtensions(ASN1Sequence paramASN1Sequence) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.deltaCertificateDescriptor;
    ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(ASN1TaggedObject.getInstance(paramASN1Sequence.getObjectAt(paramASN1Sequence.size() - 1)), true);
    ExtensionsGenerator extensionsGenerator = new ExtensionsGenerator();
    for (byte b = 0; b != aSN1Sequence.size(); b++) {
      Extension extension = Extension.getInstance(aSN1Sequence.getObjectAt(b));
      if (!aSN1ObjectIdentifier.equals((ASN1Primitive)extension.getExtnId()))
        extensionsGenerator.addExtension(extension); 
    } 
    return extensionsGenerator;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\DeltaCertificateTool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */