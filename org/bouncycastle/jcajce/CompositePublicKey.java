package org.bouncycastle.jcajce;

import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeSignaturesConstants;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;

public class CompositePublicKey implements PublicKey {
  private final List<PublicKey> keys;
  
  private final ASN1ObjectIdentifier algorithmIdentifier;
  
  public CompositePublicKey(PublicKey... paramVarArgs) {
    this(MiscObjectIdentifiers.id_composite_key, paramVarArgs);
  }
  
  public CompositePublicKey(ASN1ObjectIdentifier paramASN1ObjectIdentifier, PublicKey... paramVarArgs) {
    this.algorithmIdentifier = paramASN1ObjectIdentifier;
    if (paramVarArgs == null || paramVarArgs.length == 0)
      throw new IllegalArgumentException("at least one public key must be provided for the composite public key"); 
    ArrayList<PublicKey> arrayList = new ArrayList(paramVarArgs.length);
    for (byte b = 0; b < paramVarArgs.length; b++)
      arrayList.add(paramVarArgs[b]); 
    this.keys = Collections.unmodifiableList(arrayList);
  }
  
  public CompositePublicKey(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramSubjectPublicKeyInfo.getAlgorithm().getAlgorithm();
    CompositePublicKey compositePublicKey = null;
    try {
      if (!Arrays.<ASN1ObjectIdentifier>asList(CompositeSignaturesConstants.supportedIdentifiers).contains(aSN1ObjectIdentifier))
        throw new IllegalStateException("unable to create CompositePublicKey from SubjectPublicKeyInfo"); 
      KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
      compositePublicKey = (CompositePublicKey)keyFactorySpi.generatePublic(paramSubjectPublicKeyInfo);
      if (compositePublicKey == null)
        throw new IllegalStateException("unable to create CompositePublicKey from SubjectPublicKeyInfo"); 
    } catch (IOException iOException) {
      throw new IllegalStateException(iOException.getMessage(), iOException);
    } 
    this.keys = compositePublicKey.getPublicKeys();
    this.algorithmIdentifier = compositePublicKey.getAlgorithmIdentifier();
  }
  
  public List<PublicKey> getPublicKeys() {
    return this.keys;
  }
  
  public String getAlgorithm() {
    return ((CompositeSignaturesConstants.CompositeName)CompositeSignaturesConstants.ASN1IdentifierAlgorithmNameMap.get(this.algorithmIdentifier)).getId();
  }
  
  public ASN1ObjectIdentifier getAlgorithmIdentifier() {
    return this.algorithmIdentifier;
  }
  
  public String getFormat() {
    return "X.509";
  }
  
  public byte[] getEncoded() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    for (byte b = 0; b < this.keys.size(); b++) {
      if (this.algorithmIdentifier.equals((ASN1Primitive)MiscObjectIdentifiers.id_composite_key)) {
        aSN1EncodableVector.add((ASN1Encodable)SubjectPublicKeyInfo.getInstance(((PublicKey)this.keys.get(b)).getEncoded()));
      } else {
        SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(((PublicKey)this.keys.get(b)).getEncoded());
        aSN1EncodableVector.add((ASN1Encodable)subjectPublicKeyInfo.getPublicKeyData());
      } 
    } 
    try {
      return (new SubjectPublicKeyInfo(new AlgorithmIdentifier(this.algorithmIdentifier), (ASN1Encodable)new DERSequence(aSN1EncodableVector))).getEncoded("DER");
    } catch (IOException iOException) {
      throw new IllegalStateException("unable to encode composite public key: " + iOException.getMessage());
    } 
  }
  
  public int hashCode() {
    return this.keys.hashCode();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof CompositePublicKey) {
      boolean bool = true;
      CompositePublicKey compositePublicKey = (CompositePublicKey)paramObject;
      if (!compositePublicKey.getAlgorithmIdentifier().equals((ASN1Primitive)this.algorithmIdentifier) || !this.keys.equals(compositePublicKey.keys))
        bool = false; 
      return bool;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\CompositePublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */