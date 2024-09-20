package org.bouncycastle.its.jcajce;

import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.its.ETSIKeyWrapper;
import org.bouncycastle.jcajce.spec.IESKEMParameterSpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.oer.its.ieee1609dot2.EncryptedDataEncryptionKey;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP256CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EciesP256EncryptedKey;
import org.bouncycastle.util.Arrays;

public class JceETSIKeyWrapper implements ETSIKeyWrapper {
  private final ECPublicKey recipientKey;
  
  private final byte[] recipientHash;
  
  private final JcaJceHelper helper;
  
  private JceETSIKeyWrapper(ECPublicKey paramECPublicKey, byte[] paramArrayOfbyte, JcaJceHelper paramJcaJceHelper) {
    this.recipientKey = paramECPublicKey;
    this.recipientHash = paramArrayOfbyte;
    this.helper = paramJcaJceHelper;
  }
  
  public EncryptedDataEncryptionKey wrap(byte[] paramArrayOfbyte) {
    try {
      Cipher cipher = this.helper.createCipher("ETSIKEMwithSHA256");
      cipher.init(3, this.recipientKey, (AlgorithmParameterSpec)new IESKEMParameterSpec(this.recipientHash, true));
      byte[] arrayOfByte = cipher.wrap(new SecretKeySpec(paramArrayOfbyte, "AES"));
      int i = (this.recipientKey.getParams().getCurve().getField().getFieldSize() + 7) / 8;
      if (arrayOfByte[0] == 4) {
        i = 2 * i + 1;
      } else {
        i++;
      } 
      SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(this.recipientKey.getEncoded());
      ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
      EciesP256EncryptedKey eciesP256EncryptedKey = EciesP256EncryptedKey.builder().setV(EccP256CurvePoint.createEncodedPoint(Arrays.copyOfRange(arrayOfByte, 0, i))).setC(Arrays.copyOfRange(arrayOfByte, i, i + paramArrayOfbyte.length)).setT(Arrays.copyOfRange(arrayOfByte, i + paramArrayOfbyte.length, arrayOfByte.length)).createEciesP256EncryptedKey();
      if (aSN1ObjectIdentifier.equals((ASN1Primitive)SECObjectIdentifiers.secp256r1))
        return EncryptedDataEncryptionKey.eciesNistP256(eciesP256EncryptedKey); 
      if (aSN1ObjectIdentifier.equals((ASN1Primitive)TeleTrusTObjectIdentifiers.brainpoolP256r1))
        return EncryptedDataEncryptionKey.eciesBrainpoolP256r1(eciesP256EncryptedKey); 
      throw new IllegalStateException("recipient key curve is not P-256 or Brainpool P256r1");
    } catch (Exception exception) {
      throw new RuntimeException(exception.getMessage(), exception);
    } 
  }
  
  public static class Builder {
    private final ECPublicKey recipientKey;
    
    private final byte[] recipientHash;
    
    private JcaJceHelper helper = (JcaJceHelper)new DefaultJcaJceHelper();
    
    public Builder(ECPublicKey param1ECPublicKey, byte[] param1ArrayOfbyte) {
      this.recipientKey = param1ECPublicKey;
      this.recipientHash = param1ArrayOfbyte;
    }
    
    public Builder setProvider(Provider param1Provider) {
      this.helper = (JcaJceHelper)new ProviderJcaJceHelper(param1Provider);
      return this;
    }
    
    public Builder setProvider(String param1String) {
      this.helper = (JcaJceHelper)new NamedJcaJceHelper(param1String);
      return this;
    }
    
    public JceETSIKeyWrapper build() {
      return new JceETSIKeyWrapper(this.recipientKey, this.recipientHash, this.helper);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\jcajce\JceETSIKeyWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */