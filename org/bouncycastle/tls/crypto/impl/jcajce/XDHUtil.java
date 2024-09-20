package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.interfaces.XDHPublicKey;
import org.bouncycastle.jcajce.spec.RawEncodedKeySpec;
import org.bouncycastle.tls.TlsFatalAlert;

class XDHUtil {
  static PublicKey decodePublicKey(JcaTlsCrypto paramJcaTlsCrypto, String paramString, ASN1ObjectIdentifier paramASN1ObjectIdentifier, byte[] paramArrayOfbyte) throws TlsFatalAlert {
    try {
      KeyFactory keyFactory = paramJcaTlsCrypto.getHelper().createKeyFactory(paramString);
      if (keyFactory.getProvider() instanceof org.bouncycastle.jce.provider.BouncyCastleProvider)
        try {
          RawEncodedKeySpec rawEncodedKeySpec = new RawEncodedKeySpec(paramArrayOfbyte);
          return keyFactory.generatePublic((KeySpec)rawEncodedKeySpec);
        } catch (Exception exception) {} 
      X509EncodedKeySpec x509EncodedKeySpec = createX509EncodedKeySpec(paramASN1ObjectIdentifier, paramArrayOfbyte);
      return keyFactory.generatePublic(x509EncodedKeySpec);
    } catch (Exception exception) {
      throw new TlsFatalAlert((short)47, exception);
    } 
  }
  
  static byte[] encodePublicKey(PublicKey paramPublicKey) throws TlsFatalAlert {
    if (paramPublicKey instanceof XDHPublicKey)
      return ((XDHPublicKey)paramPublicKey).getUEncoding(); 
    if (!"X.509".equals(paramPublicKey.getFormat()))
      throw new TlsFatalAlert((short)80, "Public key format unrecognized"); 
    try {
      SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded());
      return subjectPublicKeyInfo.getPublicKeyData().getOctets();
    } catch (Exception exception) {
      throw new TlsFatalAlert((short)80, exception);
    } 
  }
  
  private static X509EncodedKeySpec createX509EncodedKeySpec(ASN1ObjectIdentifier paramASN1ObjectIdentifier, byte[] paramArrayOfbyte) throws IOException {
    AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(paramASN1ObjectIdentifier);
    SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo(algorithmIdentifier, paramArrayOfbyte);
    return new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded("DER"));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\XDHUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */