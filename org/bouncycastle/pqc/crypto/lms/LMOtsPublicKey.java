package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Objects;
import org.bouncycastle.util.io.Streams;

class LMOtsPublicKey implements Encodable {
  private final LMOtsParameters parameter;
  
  private final byte[] I;
  
  private final int q;
  
  private final byte[] K;
  
  LMOtsPublicKey(LMOtsParameters paramLMOtsParameters, byte[] paramArrayOfbyte1, int paramInt, byte[] paramArrayOfbyte2) {
    this.parameter = paramLMOtsParameters;
    this.I = paramArrayOfbyte1;
    this.q = paramInt;
    this.K = paramArrayOfbyte2;
  }
  
  public static LMOtsPublicKey getInstance(Object paramObject) throws Exception {
    if (paramObject instanceof LMOtsPublicKey)
      return (LMOtsPublicKey)paramObject; 
    if (paramObject instanceof DataInputStream) {
      LMOtsParameters lMOtsParameters = LMOtsParameters.getParametersForType(((DataInputStream)paramObject).readInt());
      byte[] arrayOfByte1 = new byte[16];
      ((DataInputStream)paramObject).readFully(arrayOfByte1);
      int i = ((DataInputStream)paramObject).readInt();
      byte[] arrayOfByte2 = new byte[lMOtsParameters.getN()];
      ((DataInputStream)paramObject).readFully(arrayOfByte2);
      return new LMOtsPublicKey(lMOtsParameters, arrayOfByte1, i, arrayOfByte2);
    } 
    if (paramObject instanceof byte[]) {
      DataInputStream dataInputStream = null;
      try {
        dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
        return getInstance(dataInputStream);
      } finally {
        if (dataInputStream != null)
          dataInputStream.close(); 
      } 
    } 
    if (paramObject instanceof InputStream)
      return getInstance(Streams.readAll((InputStream)paramObject)); 
    throw new IllegalArgumentException("cannot parse " + paramObject);
  }
  
  public LMOtsParameters getParameter() {
    return this.parameter;
  }
  
  public byte[] getI() {
    return this.I;
  }
  
  public int getQ() {
    return this.q;
  }
  
  public byte[] getK() {
    return this.K;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    LMOtsPublicKey lMOtsPublicKey = (LMOtsPublicKey)paramObject;
    return (this.q == lMOtsPublicKey.q && Objects.areEqual(this.parameter, lMOtsPublicKey.parameter) && Arrays.areEqual(this.I, lMOtsPublicKey.I) && Arrays.areEqual(this.K, lMOtsPublicKey.K));
  }
  
  public int hashCode() {
    null = this.q;
    null = 31 * null + Objects.hashCode(this.parameter);
    null = 31 * null + Arrays.hashCode(this.I);
    return 31 * null + Arrays.hashCode(this.K);
  }
  
  public byte[] getEncoded() throws IOException {
    return Composer.compose().u32str(this.parameter.getType()).bytes(this.I).u32str(this.q).bytes(this.K).build();
  }
  
  LMSContext createOtsContext(LMOtsSignature paramLMOtsSignature) {
    Digest digest = DigestUtil.getDigest(this.parameter);
    LmsUtils.byteArray(this.I, digest);
    LmsUtils.u32str(this.q, digest);
    LmsUtils.u16str((short)-32383, digest);
    LmsUtils.byteArray(paramLMOtsSignature.getC(), digest);
    return new LMSContext(this, paramLMOtsSignature, digest);
  }
  
  LMSContext createOtsContext(LMSSignature paramLMSSignature) {
    Digest digest = DigestUtil.getDigest(this.parameter);
    LmsUtils.byteArray(this.I, digest);
    LmsUtils.u32str(this.q, digest);
    LmsUtils.u16str((short)-32383, digest);
    LmsUtils.byteArray(paramLMSSignature.getOtsSignature().getC(), digest);
    return new LMSContext(this, paramLMSSignature, digest);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\lms\LMOtsPublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */