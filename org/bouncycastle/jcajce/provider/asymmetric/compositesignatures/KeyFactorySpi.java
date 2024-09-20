package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.internal.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.util.Exceptions;

public class KeyFactorySpi extends BaseKeyFactorySpi {
  private static final AlgorithmIdentifier dilithium2Identifier = new AlgorithmIdentifier(BCObjectIdentifiers.dilithium2);
  
  private static final AlgorithmIdentifier dilithium3Identifier = new AlgorithmIdentifier(BCObjectIdentifiers.dilithium3);
  
  private static final AlgorithmIdentifier dilithium5Identifier = new AlgorithmIdentifier(BCObjectIdentifiers.dilithium5);
  
  private static final AlgorithmIdentifier falcon512Identifier = new AlgorithmIdentifier(BCObjectIdentifiers.falcon_512);
  
  private static final AlgorithmIdentifier ed25519Identifier = new AlgorithmIdentifier(EdECObjectIdentifiers.id_Ed25519);
  
  private static final AlgorithmIdentifier ecdsaP256Identifier = new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, (ASN1Encodable)new X962Parameters(SECObjectIdentifiers.secp256r1));
  
  private static final AlgorithmIdentifier ecdsaBrainpoolP256r1Identifier = new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, (ASN1Encodable)new X962Parameters(TeleTrusTObjectIdentifiers.brainpoolP256r1));
  
  private static final AlgorithmIdentifier rsaIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption);
  
  private static final AlgorithmIdentifier ed448Identifier = new AlgorithmIdentifier(EdECObjectIdentifiers.id_Ed448);
  
  private static final AlgorithmIdentifier ecdsaP384Identifier = new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, (ASN1Encodable)new X962Parameters(SECObjectIdentifiers.secp384r1));
  
  private static final AlgorithmIdentifier ecdsaBrainpoolP384r1Identifier = new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, (ASN1Encodable)new X962Parameters(TeleTrusTObjectIdentifiers.brainpoolP384r1));
  
  protected Key engineTranslateKey(Key paramKey) throws InvalidKeyException {
    try {
      if (paramKey instanceof PrivateKey)
        return generatePrivate(PrivateKeyInfo.getInstance(paramKey.getEncoded())); 
      if (paramKey instanceof PublicKey)
        return generatePublic(SubjectPublicKeyInfo.getInstance(paramKey.getEncoded())); 
    } catch (IOException iOException) {
      throw new InvalidKeyException("Key could not be parsed: " + iOException.getMessage());
    } 
    throw new InvalidKeyException("Key not recognized");
  }
  
  public PrivateKey generatePrivate(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    ASN1Sequence aSN1Sequence = DERSequence.getInstance(paramPrivateKeyInfo.parsePrivateKey());
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramPrivateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
    try {
      List<KeyFactory> list = getKeyFactoriesFromIdentifier(aSN1ObjectIdentifier);
      PrivateKey[] arrayOfPrivateKey = new PrivateKey[aSN1Sequence.size()];
      for (byte b = 0; b < aSN1Sequence.size(); b++) {
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(PrivateKeyInfo.getInstance(aSN1Sequence.getObjectAt(b)).getEncoded());
        arrayOfPrivateKey[b] = ((KeyFactory)list.get(b)).generatePrivate(pKCS8EncodedKeySpec);
      } 
      return (PrivateKey)new CompositePrivateKey(aSN1ObjectIdentifier, arrayOfPrivateKey);
    } catch (GeneralSecurityException generalSecurityException) {
      throw Exceptions.ioException(generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
  
  public PublicKey generatePublic(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws IOException {
    ASN1Sequence aSN1Sequence = DERSequence.getInstance(paramSubjectPublicKeyInfo.getPublicKeyData().getBytes());
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramSubjectPublicKeyInfo.getAlgorithm().getAlgorithm();
    try {
      List<KeyFactory> list = getKeyFactoriesFromIdentifier(aSN1ObjectIdentifier);
      ASN1BitString[] arrayOfASN1BitString = new ASN1BitString[aSN1Sequence.size()];
      for (byte b1 = 0; b1 < aSN1Sequence.size(); b1++) {
        if (aSN1Sequence.getObjectAt(b1) instanceof DEROctetString) {
          arrayOfASN1BitString[b1] = (ASN1BitString)new DERBitString(((DEROctetString)aSN1Sequence.getObjectAt(b1)).getOctets());
        } else {
          arrayOfASN1BitString[b1] = (ASN1BitString)aSN1Sequence.getObjectAt(b1);
        } 
      } 
      X509EncodedKeySpec[] arrayOfX509EncodedKeySpec = getKeysSpecs(aSN1ObjectIdentifier, arrayOfASN1BitString);
      PublicKey[] arrayOfPublicKey = new PublicKey[aSN1Sequence.size()];
      for (byte b2 = 0; b2 < aSN1Sequence.size(); b2++)
        arrayOfPublicKey[b2] = ((KeyFactory)list.get(b2)).generatePublic(arrayOfX509EncodedKeySpec[b2]); 
      return (PublicKey)new CompositePublicKey(aSN1ObjectIdentifier, arrayOfPublicKey);
    } catch (GeneralSecurityException generalSecurityException) {
      throw Exceptions.ioException(generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
  
  private List<KeyFactory> getKeyFactoriesFromIdentifier(ASN1ObjectIdentifier paramASN1ObjectIdentifier) throws NoSuchAlgorithmException, NoSuchProviderException {
    ArrayList<KeyFactory> arrayList = new ArrayList();
    ArrayList<String> arrayList1 = new ArrayList();
    switch ((CompositeSignaturesConstants.CompositeName)CompositeSignaturesConstants.ASN1IdentifierCompositeNameMap.get(paramASN1ObjectIdentifier)) {
      case MLDSA44_Ed25519_SHA512:
      case MLDSA65_Ed25519_SHA512:
        arrayList1.add("Dilithium");
        arrayList1.add("Ed25519");
        arrayList.add(KeyFactory.getInstance(arrayList1.get(0), "BC"));
        arrayList.add(KeyFactory.getInstance(arrayList1.get(1), "BC"));
        return Collections.unmodifiableList(arrayList);
      case MLDSA87_Ed448_SHA512:
        arrayList1.add("Dilithium");
        arrayList1.add("Ed448");
        arrayList.add(KeyFactory.getInstance(arrayList1.get(0), "BC"));
        arrayList.add(KeyFactory.getInstance(arrayList1.get(1), "BC"));
        return Collections.unmodifiableList(arrayList);
      case MLDSA44_RSA2048_PSS_SHA256:
      case MLDSA44_RSA2048_PKCS15_SHA256:
      case MLDSA65_RSA3072_PSS_SHA512:
      case MLDSA65_RSA3072_PKCS15_SHA512:
        arrayList1.add("Dilithium");
        arrayList1.add("RSA");
        arrayList.add(KeyFactory.getInstance(arrayList1.get(0), "BC"));
        arrayList.add(KeyFactory.getInstance(arrayList1.get(1), "BC"));
        return Collections.unmodifiableList(arrayList);
      case MLDSA44_ECDSA_P256_SHA256:
      case MLDSA44_ECDSA_brainpoolP256r1_SHA256:
      case MLDSA65_ECDSA_P256_SHA512:
      case MLDSA65_ECDSA_brainpoolP256r1_SHA512:
      case MLDSA87_ECDSA_P384_SHA512:
      case MLDSA87_ECDSA_brainpoolP384r1_SHA512:
        arrayList1.add("Dilithium");
        arrayList1.add("ECDSA");
        arrayList.add(KeyFactory.getInstance(arrayList1.get(0), "BC"));
        arrayList.add(KeyFactory.getInstance(arrayList1.get(1), "BC"));
        return Collections.unmodifiableList(arrayList);
      case Falcon512_Ed25519_SHA512:
        arrayList1.add("Falcon");
        arrayList1.add("Ed25519");
        arrayList.add(KeyFactory.getInstance(arrayList1.get(0), "BC"));
        arrayList.add(KeyFactory.getInstance(arrayList1.get(1), "BC"));
        return Collections.unmodifiableList(arrayList);
      case Falcon512_ECDSA_P256_SHA256:
      case Falcon512_ECDSA_brainpoolP256r1_SHA256:
        arrayList1.add("Falcon");
        arrayList1.add("ECDSA");
        arrayList.add(KeyFactory.getInstance(arrayList1.get(0), "BC"));
        arrayList.add(KeyFactory.getInstance(arrayList1.get(1), "BC"));
        return Collections.unmodifiableList(arrayList);
    } 
    throw new IllegalArgumentException("Cannot create KeyFactories. Unsupported algorithm identifier.");
  }
  
  private X509EncodedKeySpec[] getKeysSpecs(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1BitString[] paramArrayOfASN1BitString) throws IOException {
    X509EncodedKeySpec[] arrayOfX509EncodedKeySpec = new X509EncodedKeySpec[paramArrayOfASN1BitString.length];
    SubjectPublicKeyInfo[] arrayOfSubjectPublicKeyInfo = new SubjectPublicKeyInfo[paramArrayOfASN1BitString.length];
    switch ((CompositeSignaturesConstants.CompositeName)CompositeSignaturesConstants.ASN1IdentifierCompositeNameMap.get(paramASN1ObjectIdentifier)) {
      case MLDSA44_Ed25519_SHA512:
        arrayOfSubjectPublicKeyInfo[0] = new SubjectPublicKeyInfo(dilithium2Identifier, paramArrayOfASN1BitString[0]);
        arrayOfSubjectPublicKeyInfo[1] = new SubjectPublicKeyInfo(ed25519Identifier, paramArrayOfASN1BitString[1]);
        arrayOfX509EncodedKeySpec[0] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[0].getEncoded());
        arrayOfX509EncodedKeySpec[1] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[1].getEncoded());
        return arrayOfX509EncodedKeySpec;
      case MLDSA44_ECDSA_P256_SHA256:
        arrayOfSubjectPublicKeyInfo[0] = new SubjectPublicKeyInfo(dilithium2Identifier, paramArrayOfASN1BitString[0]);
        arrayOfSubjectPublicKeyInfo[1] = new SubjectPublicKeyInfo(ecdsaP256Identifier, paramArrayOfASN1BitString[1]);
        arrayOfX509EncodedKeySpec[0] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[0].getEncoded());
        arrayOfX509EncodedKeySpec[1] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[1].getEncoded());
        return arrayOfX509EncodedKeySpec;
      case MLDSA44_ECDSA_brainpoolP256r1_SHA256:
        arrayOfSubjectPublicKeyInfo[0] = new SubjectPublicKeyInfo(dilithium2Identifier, paramArrayOfASN1BitString[0]);
        arrayOfSubjectPublicKeyInfo[1] = new SubjectPublicKeyInfo(ecdsaBrainpoolP256r1Identifier, paramArrayOfASN1BitString[1]);
        arrayOfX509EncodedKeySpec[0] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[0].getEncoded());
        arrayOfX509EncodedKeySpec[1] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[1].getEncoded());
        return arrayOfX509EncodedKeySpec;
      case MLDSA44_RSA2048_PSS_SHA256:
      case MLDSA44_RSA2048_PKCS15_SHA256:
        arrayOfSubjectPublicKeyInfo[0] = new SubjectPublicKeyInfo(dilithium2Identifier, paramArrayOfASN1BitString[0]);
        arrayOfSubjectPublicKeyInfo[1] = new SubjectPublicKeyInfo(rsaIdentifier, paramArrayOfASN1BitString[1]);
        arrayOfX509EncodedKeySpec[0] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[0].getEncoded());
        arrayOfX509EncodedKeySpec[1] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[1].getEncoded());
        return arrayOfX509EncodedKeySpec;
      case MLDSA65_Ed25519_SHA512:
        arrayOfSubjectPublicKeyInfo[0] = new SubjectPublicKeyInfo(dilithium3Identifier, paramArrayOfASN1BitString[0]);
        arrayOfSubjectPublicKeyInfo[1] = new SubjectPublicKeyInfo(ed25519Identifier, paramArrayOfASN1BitString[1]);
        arrayOfX509EncodedKeySpec[0] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[0].getEncoded());
        arrayOfX509EncodedKeySpec[1] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[1].getEncoded());
        return arrayOfX509EncodedKeySpec;
      case MLDSA65_ECDSA_P256_SHA512:
        arrayOfSubjectPublicKeyInfo[0] = new SubjectPublicKeyInfo(dilithium3Identifier, paramArrayOfASN1BitString[0]);
        arrayOfSubjectPublicKeyInfo[1] = new SubjectPublicKeyInfo(ecdsaP256Identifier, paramArrayOfASN1BitString[1]);
        arrayOfX509EncodedKeySpec[0] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[0].getEncoded());
        arrayOfX509EncodedKeySpec[1] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[1].getEncoded());
        return arrayOfX509EncodedKeySpec;
      case MLDSA65_ECDSA_brainpoolP256r1_SHA512:
        arrayOfSubjectPublicKeyInfo[0] = new SubjectPublicKeyInfo(dilithium3Identifier, paramArrayOfASN1BitString[0]);
        arrayOfSubjectPublicKeyInfo[1] = new SubjectPublicKeyInfo(ecdsaBrainpoolP256r1Identifier, paramArrayOfASN1BitString[1]);
        arrayOfX509EncodedKeySpec[0] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[0].getEncoded());
        arrayOfX509EncodedKeySpec[1] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[1].getEncoded());
        return arrayOfX509EncodedKeySpec;
      case MLDSA65_RSA3072_PSS_SHA512:
      case MLDSA65_RSA3072_PKCS15_SHA512:
        arrayOfSubjectPublicKeyInfo[0] = new SubjectPublicKeyInfo(dilithium3Identifier, paramArrayOfASN1BitString[0]);
        arrayOfSubjectPublicKeyInfo[1] = new SubjectPublicKeyInfo(rsaIdentifier, paramArrayOfASN1BitString[1]);
        arrayOfX509EncodedKeySpec[0] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[0].getEncoded());
        arrayOfX509EncodedKeySpec[1] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[1].getEncoded());
        return arrayOfX509EncodedKeySpec;
      case MLDSA87_Ed448_SHA512:
        arrayOfSubjectPublicKeyInfo[0] = new SubjectPublicKeyInfo(dilithium5Identifier, paramArrayOfASN1BitString[0]);
        arrayOfSubjectPublicKeyInfo[1] = new SubjectPublicKeyInfo(ed448Identifier, paramArrayOfASN1BitString[1]);
        arrayOfX509EncodedKeySpec[0] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[0].getEncoded());
        arrayOfX509EncodedKeySpec[1] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[1].getEncoded());
        return arrayOfX509EncodedKeySpec;
      case MLDSA87_ECDSA_P384_SHA512:
        arrayOfSubjectPublicKeyInfo[0] = new SubjectPublicKeyInfo(dilithium5Identifier, paramArrayOfASN1BitString[0]);
        arrayOfSubjectPublicKeyInfo[1] = new SubjectPublicKeyInfo(ecdsaP384Identifier, paramArrayOfASN1BitString[1]);
        arrayOfX509EncodedKeySpec[0] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[0].getEncoded());
        arrayOfX509EncodedKeySpec[1] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[1].getEncoded());
        return arrayOfX509EncodedKeySpec;
      case MLDSA87_ECDSA_brainpoolP384r1_SHA512:
        arrayOfSubjectPublicKeyInfo[0] = new SubjectPublicKeyInfo(dilithium5Identifier, paramArrayOfASN1BitString[0]);
        arrayOfSubjectPublicKeyInfo[1] = new SubjectPublicKeyInfo(ecdsaBrainpoolP384r1Identifier, paramArrayOfASN1BitString[1]);
        arrayOfX509EncodedKeySpec[0] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[0].getEncoded());
        arrayOfX509EncodedKeySpec[1] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[1].getEncoded());
        return arrayOfX509EncodedKeySpec;
      case Falcon512_Ed25519_SHA512:
        arrayOfSubjectPublicKeyInfo[0] = new SubjectPublicKeyInfo(falcon512Identifier, paramArrayOfASN1BitString[0]);
        arrayOfSubjectPublicKeyInfo[1] = new SubjectPublicKeyInfo(ed25519Identifier, paramArrayOfASN1BitString[1]);
        arrayOfX509EncodedKeySpec[0] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[0].getEncoded());
        arrayOfX509EncodedKeySpec[1] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[1].getEncoded());
        return arrayOfX509EncodedKeySpec;
      case Falcon512_ECDSA_P256_SHA256:
        arrayOfSubjectPublicKeyInfo[0] = new SubjectPublicKeyInfo(falcon512Identifier, paramArrayOfASN1BitString[0]);
        arrayOfSubjectPublicKeyInfo[1] = new SubjectPublicKeyInfo(ecdsaP256Identifier, paramArrayOfASN1BitString[1]);
        arrayOfX509EncodedKeySpec[0] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[0].getEncoded());
        arrayOfX509EncodedKeySpec[1] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[1].getEncoded());
        return arrayOfX509EncodedKeySpec;
      case Falcon512_ECDSA_brainpoolP256r1_SHA256:
        arrayOfSubjectPublicKeyInfo[0] = new SubjectPublicKeyInfo(falcon512Identifier, paramArrayOfASN1BitString[0]);
        arrayOfSubjectPublicKeyInfo[1] = new SubjectPublicKeyInfo(ecdsaBrainpoolP256r1Identifier, paramArrayOfASN1BitString[1]);
        arrayOfX509EncodedKeySpec[0] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[0].getEncoded());
        arrayOfX509EncodedKeySpec[1] = new X509EncodedKeySpec(arrayOfSubjectPublicKeyInfo[1].getEncoded());
        return arrayOfX509EncodedKeySpec;
    } 
    throw new IllegalArgumentException("Cannot create key specs. Unsupported algorithm identifier.");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\compositesignatures\KeyFactorySpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */