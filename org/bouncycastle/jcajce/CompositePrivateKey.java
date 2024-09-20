package org.bouncycastle.jcajce;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeSignaturesConstants;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;
import org.bouncycastle.util.Exceptions;

public class CompositePrivateKey implements PrivateKey {
  private final List<PrivateKey> keys;
  
  private ASN1ObjectIdentifier algorithmIdentifier;
  
  public CompositePrivateKey(PrivateKey... paramVarArgs) {
    this(MiscObjectIdentifiers.id_composite_key, paramVarArgs);
  }
  
  public CompositePrivateKey(ASN1ObjectIdentifier paramASN1ObjectIdentifier, PrivateKey... paramVarArgs) {
    this.algorithmIdentifier = paramASN1ObjectIdentifier;
    if (paramVarArgs == null || paramVarArgs.length == 0)
      throw new IllegalArgumentException("at least one private key must be provided for the composite private key"); 
    ArrayList<PrivateKey> arrayList = new ArrayList(paramVarArgs.length);
    for (byte b = 0; b < paramVarArgs.length; b++)
      arrayList.add(paramVarArgs[b]); 
    this.keys = Collections.unmodifiableList(arrayList);
  }
  
  public CompositePrivateKey(PrivateKeyInfo paramPrivateKeyInfo) {
    CompositePrivateKey compositePrivateKey = null;
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramPrivateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
    try {
      if (!Arrays.<ASN1ObjectIdentifier>asList(CompositeSignaturesConstants.supportedIdentifiers).contains(aSN1ObjectIdentifier))
        throw new IllegalStateException("Unable to create CompositePrivateKey from PrivateKeyInfo"); 
      KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
      compositePrivateKey = (CompositePrivateKey)keyFactorySpi.generatePrivate(paramPrivateKeyInfo);
      if (compositePrivateKey == null)
        throw new IllegalStateException("Unable to create CompositePrivateKey from PrivateKeyInfo"); 
    } catch (IOException iOException) {
      throw Exceptions.illegalStateException(iOException.getMessage(), iOException);
    } 
    this.keys = compositePrivateKey.getPrivateKeys();
    this.algorithmIdentifier = compositePrivateKey.getAlgorithmIdentifier();
  }
  
  public List<PrivateKey> getPrivateKeys() {
    return this.keys;
  }
  
  public String getAlgorithm() {
    return ((CompositeSignaturesConstants.CompositeName)CompositeSignaturesConstants.ASN1IdentifierAlgorithmNameMap.get(this.algorithmIdentifier)).getId();
  }
  
  public ASN1ObjectIdentifier getAlgorithmIdentifier() {
    return this.algorithmIdentifier;
  }
  
  public String getFormat() {
    return "PKCS#8";
  }
  
  public byte[] getEncoded() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    for (byte b = 0; b < this.keys.size(); b++)
      aSN1EncodableVector.add((ASN1Encodable)PrivateKeyInfo.getInstance(((PrivateKey)this.keys.get(b)).getEncoded())); 
    try {
      return (new PrivateKeyInfo(new AlgorithmIdentifier(this.algorithmIdentifier), (ASN1Encodable)new DERSequence(aSN1EncodableVector))).getEncoded("DER");
    } catch (IOException iOException) {
      throw new IllegalStateException("unable to encode composite private key: " + iOException.getMessage());
    } 
  }
  
  public int hashCode() {
    return this.keys.hashCode();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof CompositePrivateKey) {
      boolean bool = true;
      CompositePrivateKey compositePrivateKey = (CompositePrivateKey)paramObject;
      if (!compositePrivateKey.getAlgorithmIdentifier().equals((ASN1Primitive)this.algorithmIdentifier) || !this.keys.equals(compositePrivateKey.keys))
        bool = false; 
      return bool;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\CompositePrivateKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */