package org.bouncycastle.crypto.params;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.util.io.Streams;

public final class Ed448PublicKeyParameters extends AsymmetricKeyParameter {
  public static final int KEY_SIZE = 57;
  
  private final Ed448.PublicPoint publicPoint;
  
  public Ed448PublicKeyParameters(byte[] paramArrayOfbyte) {
    this(validate(paramArrayOfbyte), 0);
  }
  
  public Ed448PublicKeyParameters(byte[] paramArrayOfbyte, int paramInt) {
    super(false);
    this.publicPoint = parse(paramArrayOfbyte, paramInt);
  }
  
  public Ed448PublicKeyParameters(InputStream paramInputStream) throws IOException {
    super(false);
    byte[] arrayOfByte = new byte[57];
    if (57 != Streams.readFully(paramInputStream, arrayOfByte))
      throw new EOFException("EOF encountered in middle of Ed448 public key"); 
    this.publicPoint = parse(arrayOfByte, 0);
  }
  
  public Ed448PublicKeyParameters(Ed448.PublicPoint paramPublicPoint) {
    super(false);
    if (paramPublicPoint == null)
      throw new NullPointerException("'publicPoint' cannot be null"); 
    this.publicPoint = paramPublicPoint;
  }
  
  public void encode(byte[] paramArrayOfbyte, int paramInt) {
    Ed448.encodePublicPoint(this.publicPoint, paramArrayOfbyte, paramInt);
  }
  
  public byte[] getEncoded() {
    byte[] arrayOfByte = new byte[57];
    encode(arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public boolean verify(int paramInt1, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt2, int paramInt3, byte[] paramArrayOfbyte3, int paramInt4) {
    switch (paramInt1) {
      case 0:
        if (null == paramArrayOfbyte1)
          throw new NullPointerException("'ctx' cannot be null"); 
        if (paramArrayOfbyte1.length > 255)
          throw new IllegalArgumentException("ctx"); 
        return Ed448.verify(paramArrayOfbyte3, paramInt4, this.publicPoint, paramArrayOfbyte1, paramArrayOfbyte2, paramInt2, paramInt3);
      case 1:
        if (null == paramArrayOfbyte1)
          throw new NullPointerException("'ctx' cannot be null"); 
        if (paramArrayOfbyte1.length > 255)
          throw new IllegalArgumentException("ctx"); 
        if (64 != paramInt3)
          throw new IllegalArgumentException("msgLen"); 
        return Ed448.verifyPrehash(paramArrayOfbyte3, paramInt4, this.publicPoint, paramArrayOfbyte1, paramArrayOfbyte2, paramInt2);
    } 
    throw new IllegalArgumentException("algorithm");
  }
  
  private static Ed448.PublicPoint parse(byte[] paramArrayOfbyte, int paramInt) {
    Ed448.PublicPoint publicPoint = Ed448.validatePublicKeyPartialExport(paramArrayOfbyte, paramInt);
    if (publicPoint == null)
      throw new IllegalArgumentException("invalid public key"); 
    return publicPoint;
  }
  
  private static byte[] validate(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != 57)
      throw new IllegalArgumentException("'buf' must have length 57"); 
    return paramArrayOfbyte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\Ed448PublicKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */