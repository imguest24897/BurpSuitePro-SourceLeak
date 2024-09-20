package META-INF.versions.9.org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.pqc.crypto.lms.Composer;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSSignature;
import org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Objects;
import org.bouncycastle.util.io.Streams;

class HSSSignature implements Encodable {
  private final int lMinus1;
  
  private final LMSSignedPubKey[] signedPubKey;
  
  private final LMSSignature signature;
  
  public HSSSignature(int paramInt, LMSSignedPubKey[] paramArrayOfLMSSignedPubKey, LMSSignature paramLMSSignature) {
    this.lMinus1 = paramInt;
    this.signedPubKey = paramArrayOfLMSSignedPubKey;
    this.signature = paramLMSSignature;
  }
  
  public static org.bouncycastle.pqc.crypto.lms.HSSSignature getInstance(Object paramObject, int paramInt) throws IOException {
    if (paramObject instanceof org.bouncycastle.pqc.crypto.lms.HSSSignature)
      return (org.bouncycastle.pqc.crypto.lms.HSSSignature)paramObject; 
    if (paramObject instanceof DataInputStream) {
      int i = ((DataInputStream)paramObject).readInt();
      if (i != paramInt - 1)
        throw new IllegalStateException("nspk exceeded maxNspk"); 
      LMSSignedPubKey[] arrayOfLMSSignedPubKey = new LMSSignedPubKey[i];
      if (i != 0)
        for (byte b = 0; b < arrayOfLMSSignedPubKey.length; b++)
          arrayOfLMSSignedPubKey[b] = new LMSSignedPubKey(LMSSignature.getInstance(paramObject), LMSPublicKeyParameters.getInstance(paramObject));  
      LMSSignature lMSSignature = LMSSignature.getInstance(paramObject);
      return new org.bouncycastle.pqc.crypto.lms.HSSSignature(i, arrayOfLMSSignedPubKey, lMSSignature);
    } 
    if (paramObject instanceof byte[]) {
      DataInputStream dataInputStream = null;
      try {
        dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
        return getInstance(dataInputStream, paramInt);
      } finally {
        if (dataInputStream != null)
          dataInputStream.close(); 
      } 
    } 
    if (paramObject instanceof InputStream)
      return getInstance(Streams.readAll((InputStream)paramObject), paramInt); 
    throw new IllegalArgumentException("cannot parse " + paramObject);
  }
  
  public int getlMinus1() {
    return this.lMinus1;
  }
  
  public LMSSignedPubKey[] getSignedPubKey() {
    return this.signedPubKey;
  }
  
  public LMSSignature getSignature() {
    return this.signature;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    org.bouncycastle.pqc.crypto.lms.HSSSignature hSSSignature = (org.bouncycastle.pqc.crypto.lms.HSSSignature)paramObject;
    return (this.lMinus1 == hSSSignature.lMinus1 && Arrays.areEqual((Object[])this.signedPubKey, (Object[])hSSSignature.signedPubKey) && Objects.areEqual(this.signature, hSSSignature.signature));
  }
  
  public int hashCode() {
    null = this.lMinus1;
    null = 31 * null + Arrays.hashCode((Object[])this.signedPubKey);
    return 31 * null + Objects.hashCode(this.signature);
  }
  
  public byte[] getEncoded() throws IOException {
    Composer composer = Composer.compose();
    composer.u32str(this.lMinus1);
    if (this.signedPubKey != null)
      for (LMSSignedPubKey lMSSignedPubKey : this.signedPubKey)
        composer.bytes((Encodable)lMSSignedPubKey);  
    composer.bytes((Encodable)this.signature);
    return composer.build();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\lms\HSSSignature.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */