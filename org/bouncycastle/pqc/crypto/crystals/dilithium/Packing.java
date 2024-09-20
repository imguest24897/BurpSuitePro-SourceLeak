package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.util.Arrays;

class Packing {
  static byte[] packPublicKey(PolyVecK paramPolyVecK, DilithiumEngine paramDilithiumEngine) {
    byte[] arrayOfByte = new byte[paramDilithiumEngine.getCryptoPublicKeyBytes() - 32];
    for (byte b = 0; b < paramDilithiumEngine.getDilithiumK(); b++)
      System.arraycopy(paramPolyVecK.getVectorIndex(b).polyt1Pack(), 0, arrayOfByte, b * 320, 320); 
    return arrayOfByte;
  }
  
  static PolyVecK unpackPublicKey(PolyVecK paramPolyVecK, byte[] paramArrayOfbyte, DilithiumEngine paramDilithiumEngine) {
    for (byte b = 0; b < paramDilithiumEngine.getDilithiumK(); b++)
      paramPolyVecK.getVectorIndex(b).polyt1Unpack(Arrays.copyOfRange(paramArrayOfbyte, b * 320, 32 + (b + 1) * 320)); 
    return paramPolyVecK;
  }
  
  static byte[][] packSecretKey(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, PolyVecK paramPolyVecK1, PolyVecL paramPolyVecL, PolyVecK paramPolyVecK2, DilithiumEngine paramDilithiumEngine) {
    byte[][] arrayOfByte = new byte[6][];
    arrayOfByte[0] = paramArrayOfbyte1;
    arrayOfByte[1] = paramArrayOfbyte3;
    arrayOfByte[2] = paramArrayOfbyte2;
    arrayOfByte[3] = new byte[paramDilithiumEngine.getDilithiumL() * paramDilithiumEngine.getDilithiumPolyEtaPackedBytes()];
    byte b;
    for (b = 0; b < paramDilithiumEngine.getDilithiumL(); b++)
      paramPolyVecL.getVectorIndex(b).polyEtaPack(arrayOfByte[3], b * paramDilithiumEngine.getDilithiumPolyEtaPackedBytes()); 
    arrayOfByte[4] = new byte[paramDilithiumEngine.getDilithiumK() * paramDilithiumEngine.getDilithiumPolyEtaPackedBytes()];
    for (b = 0; b < paramDilithiumEngine.getDilithiumK(); b++)
      paramPolyVecK2.getVectorIndex(b).polyEtaPack(arrayOfByte[4], b * paramDilithiumEngine.getDilithiumPolyEtaPackedBytes()); 
    arrayOfByte[5] = new byte[paramDilithiumEngine.getDilithiumK() * 416];
    for (b = 0; b < paramDilithiumEngine.getDilithiumK(); b++)
      paramPolyVecK1.getVectorIndex(b).polyt0Pack(arrayOfByte[5], b * 416); 
    return arrayOfByte;
  }
  
  static void unpackSecretKey(PolyVecK paramPolyVecK1, PolyVecL paramPolyVecL, PolyVecK paramPolyVecK2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, DilithiumEngine paramDilithiumEngine) {
    byte b;
    for (b = 0; b < paramDilithiumEngine.getDilithiumL(); b++)
      paramPolyVecL.getVectorIndex(b).polyEtaUnpack(paramArrayOfbyte2, b * paramDilithiumEngine.getDilithiumPolyEtaPackedBytes()); 
    for (b = 0; b < paramDilithiumEngine.getDilithiumK(); b++)
      paramPolyVecK2.getVectorIndex(b).polyEtaUnpack(paramArrayOfbyte3, b * paramDilithiumEngine.getDilithiumPolyEtaPackedBytes()); 
    for (b = 0; b < paramDilithiumEngine.getDilithiumK(); b++)
      paramPolyVecK1.getVectorIndex(b).polyt0Unpack(paramArrayOfbyte1, b * 416); 
  }
  
  static byte[] packSignature(byte[] paramArrayOfbyte, PolyVecL paramPolyVecL, PolyVecK paramPolyVecK, DilithiumEngine paramDilithiumEngine) {
    int i = 0;
    byte[] arrayOfByte = new byte[paramDilithiumEngine.getCryptoBytes()];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramDilithiumEngine.getDilithiumCTilde());
    i += paramDilithiumEngine.getDilithiumCTilde();
    byte b1;
    for (b1 = 0; b1 < paramDilithiumEngine.getDilithiumL(); b1++)
      System.arraycopy(paramPolyVecL.getVectorIndex(b1).zPack(), 0, arrayOfByte, i + b1 * paramDilithiumEngine.getDilithiumPolyZPackedBytes(), paramDilithiumEngine.getDilithiumPolyZPackedBytes()); 
    i += paramDilithiumEngine.getDilithiumL() * paramDilithiumEngine.getDilithiumPolyZPackedBytes();
    for (b1 = 0; b1 < paramDilithiumEngine.getDilithiumOmega() + paramDilithiumEngine.getDilithiumK(); b1++)
      arrayOfByte[i + b1] = 0; 
    byte b2 = 0;
    for (b1 = 0; b1 < paramDilithiumEngine.getDilithiumK(); b1++) {
      for (byte b = 0; b < 'Ā'; b++) {
        if (paramPolyVecK.getVectorIndex(b1).getCoeffIndex(b) != 0)
          arrayOfByte[i + b2++] = (byte)b; 
      } 
      arrayOfByte[i + paramDilithiumEngine.getDilithiumOmega() + b1] = (byte)b2;
    } 
    return arrayOfByte;
  }
  
  static boolean unpackSignature(PolyVecL paramPolyVecL, PolyVecK paramPolyVecK, byte[] paramArrayOfbyte, DilithiumEngine paramDilithiumEngine) {
    int i = paramDilithiumEngine.getDilithiumCTilde();
    byte b;
    for (b = 0; b < paramDilithiumEngine.getDilithiumL(); b++)
      paramPolyVecL.getVectorIndex(b).zUnpack(Arrays.copyOfRange(paramArrayOfbyte, i + b * paramDilithiumEngine.getDilithiumPolyZPackedBytes(), i + (b + 1) * paramDilithiumEngine.getDilithiumPolyZPackedBytes())); 
    i += paramDilithiumEngine.getDilithiumL() * paramDilithiumEngine.getDilithiumPolyZPackedBytes();
    byte b2 = 0;
    for (b = 0; b < paramDilithiumEngine.getDilithiumK(); b++) {
      byte b3;
      for (b3 = 0; b3 < 256; b3++)
        paramPolyVecK.getVectorIndex(b).setCoeffIndex(b3, 0); 
      if ((paramArrayOfbyte[i + paramDilithiumEngine.getDilithiumOmega() + b] & 0xFF) < b2 || (paramArrayOfbyte[i + paramDilithiumEngine.getDilithiumOmega() + b] & 0xFF) > paramDilithiumEngine.getDilithiumOmega())
        return false; 
      for (b3 = b2; b3 < (paramArrayOfbyte[i + paramDilithiumEngine.getDilithiumOmega() + b] & 0xFF); b3++) {
        if (b3 > b2 && (paramArrayOfbyte[i + b3] & 0xFF) <= (paramArrayOfbyte[i + b3 - 1] & 0xFF))
          return false; 
        paramPolyVecK.getVectorIndex(b).setCoeffIndex(paramArrayOfbyte[i + b3] & 0xFF, 1);
      } 
      b2 = paramArrayOfbyte[i + paramDilithiumEngine.getDilithiumOmega() + b];
    } 
    for (byte b1 = b2; b1 < paramDilithiumEngine.getDilithiumOmega(); b1++) {
      if ((paramArrayOfbyte[i + b1] & 0xFF) != 0)
        return false; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\dilithium\Packing.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */