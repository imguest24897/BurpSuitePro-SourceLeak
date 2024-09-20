package org.bouncycastle.jce;

import java.io.IOException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.MacData;
import org.bouncycastle.asn1.pkcs.Pfx;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;

public class PKCS12Util {
  public static byte[] convertToDefiniteLength(byte[] paramArrayOfbyte) throws IOException {
    Pfx pfx = Pfx.getInstance(paramArrayOfbyte);
    return pfx.getEncoded("DER");
  }
  
  public static byte[] convertToDefiniteLength(byte[] paramArrayOfbyte, char[] paramArrayOfchar, String paramString) throws IOException {
    Pfx pfx = Pfx.getInstance(paramArrayOfbyte);
    ContentInfo contentInfo = pfx.getAuthSafe();
    ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(contentInfo.getContent());
    ASN1Primitive aSN1Primitive = ASN1Primitive.fromByteArray(aSN1OctetString.getOctets());
    byte[] arrayOfByte = aSN1Primitive.getEncoded("DER");
    contentInfo = new ContentInfo(contentInfo.getContentType(), (ASN1Encodable)new DEROctetString(arrayOfByte));
    MacData macData = pfx.getMacData();
    try {
      int i = macData.getIterationCount().intValue();
      byte[] arrayOfByte1 = ASN1OctetString.getInstance(contentInfo.getContent()).getOctets();
      byte[] arrayOfByte2 = calculatePbeMac(macData.getMac().getAlgorithmId().getAlgorithm(), macData.getSalt(), i, paramArrayOfchar, arrayOfByte1, paramString);
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(macData.getMac().getAlgorithmId().getAlgorithm(), (ASN1Encodable)DERNull.INSTANCE);
      DigestInfo digestInfo = new DigestInfo(algorithmIdentifier, arrayOfByte2);
      macData = new MacData(digestInfo, macData.getSalt(), i);
    } catch (Exception exception) {
      throw new IOException("error constructing MAC: " + exception.toString());
    } 
    pfx = new Pfx(contentInfo, macData);
    return pfx.getEncoded("DER");
  }
  
  private static byte[] calculatePbeMac(ASN1ObjectIdentifier paramASN1ObjectIdentifier, byte[] paramArrayOfbyte1, int paramInt, char[] paramArrayOfchar, byte[] paramArrayOfbyte2, String paramString) throws Exception {
    SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(paramASN1ObjectIdentifier.getId(), paramString);
    PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(paramArrayOfbyte1, paramInt);
    PBEKeySpec pBEKeySpec = new PBEKeySpec(paramArrayOfchar);
    SecretKey secretKey = secretKeyFactory.generateSecret(pBEKeySpec);
    Mac mac = Mac.getInstance(paramASN1ObjectIdentifier.getId(), paramString);
    mac.init(secretKey, pBEParameterSpec);
    mac.update(paramArrayOfbyte2);
    return mac.doFinal();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jce\PKCS12Util.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */