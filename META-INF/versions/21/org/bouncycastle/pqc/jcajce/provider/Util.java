package META-INF.versions.21.org.bouncycastle.pqc.jcajce.provider;

import java.security.InvalidKeyException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;

public class Util {
  public static byte[] makeKeyBytes(KTSParameterSpec paramKTSParameterSpec, byte[] paramArrayOfbyte) throws InvalidKeyException {
    AlgorithmIdentifier algorithmIdentifier = paramKTSParameterSpec.getKdfAlgorithm();
    byte[] arrayOfByte1 = paramKTSParameterSpec.getOtherInfo();
    byte[] arrayOfByte2 = new byte[(paramKTSParameterSpec.getKeySize() + 7) / 8];
    if (X9ObjectIdentifiers.id_kdf_kdf2.equals((ASN1Primitive)algorithmIdentifier.getAlgorithm())) {
      AlgorithmIdentifier algorithmIdentifier1 = AlgorithmIdentifier.getInstance(algorithmIdentifier.getParameters());
      KDF2BytesGenerator kDF2BytesGenerator = new KDF2BytesGenerator(getDigest(algorithmIdentifier1.getAlgorithm()));
      kDF2BytesGenerator.init((DerivationParameters)new KDFParameters(paramArrayOfbyte, arrayOfByte1));
      kDF2BytesGenerator.generateBytes(arrayOfByte2, 0, arrayOfByte2.length);
    } else if (X9ObjectIdentifiers.id_kdf_kdf3.equals((ASN1Primitive)algorithmIdentifier.getAlgorithm())) {
      AlgorithmIdentifier algorithmIdentifier1 = AlgorithmIdentifier.getInstance(algorithmIdentifier.getParameters());
      ConcatenationKDFGenerator concatenationKDFGenerator = new ConcatenationKDFGenerator(getDigest(algorithmIdentifier1.getAlgorithm()));
      concatenationKDFGenerator.init((DerivationParameters)new KDFParameters(paramArrayOfbyte, arrayOfByte1));
      concatenationKDFGenerator.generateBytes(arrayOfByte2, 0, arrayOfByte2.length);
    } else if (NISTObjectIdentifiers.id_shake256.equals((ASN1Primitive)algorithmIdentifier.getAlgorithm())) {
      SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
      sHAKEDigest.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      sHAKEDigest.update(arrayOfByte1, 0, arrayOfByte1.length);
      sHAKEDigest.doFinal(arrayOfByte2, 0, arrayOfByte2.length);
    } else {
      throw new InvalidKeyException("Unrecognized KDF: " + String.valueOf(algorithmIdentifier.getAlgorithm()));
    } 
    return arrayOfByte2;
  }
  
  static Digest getDigest(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_sha256))
      return (Digest)new SHA256Digest(); 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_sha512))
      return (Digest)new SHA512Digest(); 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_shake128))
      return (Digest)new SHAKEDigest(128); 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_shake256))
      return (Digest)new SHAKEDigest(256); 
    throw new IllegalArgumentException("unrecognized digest OID: " + String.valueOf(paramASN1ObjectIdentifier));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\21\org\bouncycastle\pqc\jcajce\provider\Util.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */