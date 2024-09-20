package org.bouncycastle.pqc.crypto.picnic;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Properties;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Hex;

abstract class LowmcConstants {
  protected int[] linearMatrices;
  
  protected int[] roundConstants;
  
  protected int[] keyMatrices;
  
  protected KMatrices LMatrix;
  
  protected KMatrices KMatrix;
  
  protected KMatrices RConstants;
  
  protected int[] linearMatrices_full;
  
  protected int[] keyMatrices_full;
  
  protected int[] keyMatrices_inv;
  
  protected int[] linearMatrices_inv;
  
  protected int[] roundConstants_full;
  
  protected KMatrices LMatrix_full;
  
  protected KMatrices LMatrix_inv;
  
  protected KMatrices KMatrix_full;
  
  protected KMatrices KMatrix_inv;
  
  protected KMatrices RConstants_full;
  
  static int[] readArray(DataInputStream paramDataInputStream) throws IOException {
    int[] arrayOfInt = new int[paramDataInputStream.readInt()];
    for (byte b = 0; b != arrayOfInt.length; b++)
      arrayOfInt[b] = paramDataInputStream.readInt(); 
    return arrayOfInt;
  }
  
  static int[] ReadFromProperty(Properties paramProperties, String paramString, int paramInt) {
    String str = paramProperties.getProperty(paramString);
    byte[] arrayOfByte = Hex.decode(removeCommas(str));
    int[] arrayOfInt = new int[paramInt];
    for (byte b = 0; b < arrayOfByte.length / 4; b++)
      arrayOfInt[b] = Pack.littleEndianToInt(arrayOfByte, b * 4); 
    return arrayOfInt;
  }
  
  private static byte[] removeCommas(String paramString) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    for (byte b = 0; b != paramString.length(); b++) {
      if (paramString.charAt(b) != ',')
        byteArrayOutputStream.write(paramString.charAt(b)); 
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  private KMatricesWithPointer GET_MAT(KMatrices paramKMatrices, int paramInt) {
    KMatricesWithPointer kMatricesWithPointer = new KMatricesWithPointer(paramKMatrices);
    kMatricesWithPointer.setMatrixPointer(paramInt * kMatricesWithPointer.getSize());
    return kMatricesWithPointer;
  }
  
  protected KMatricesWithPointer LMatrix(PicnicEngine paramPicnicEngine, int paramInt) {
    return (paramPicnicEngine.stateSizeBits == 128) ? GET_MAT(this.LMatrix, paramInt) : ((paramPicnicEngine.stateSizeBits == 129) ? GET_MAT(this.LMatrix_full, paramInt) : ((paramPicnicEngine.stateSizeBits == 192) ? ((paramPicnicEngine.numRounds == 4) ? GET_MAT(this.LMatrix_full, paramInt) : GET_MAT(this.LMatrix, paramInt)) : ((paramPicnicEngine.stateSizeBits == 255) ? GET_MAT(this.LMatrix_full, paramInt) : ((paramPicnicEngine.stateSizeBits == 256) ? GET_MAT(this.LMatrix, paramInt) : null))));
  }
  
  protected KMatricesWithPointer LMatrixInv(PicnicEngine paramPicnicEngine, int paramInt) {
    return (paramPicnicEngine.stateSizeBits == 129) ? GET_MAT(this.LMatrix_inv, paramInt) : ((paramPicnicEngine.stateSizeBits == 192 && paramPicnicEngine.numRounds == 4) ? GET_MAT(this.LMatrix_inv, paramInt) : ((paramPicnicEngine.stateSizeBits == 255) ? GET_MAT(this.LMatrix_inv, paramInt) : null));
  }
  
  protected KMatricesWithPointer KMatrix(PicnicEngine paramPicnicEngine, int paramInt) {
    return (paramPicnicEngine.stateSizeBits == 128) ? GET_MAT(this.KMatrix, paramInt) : ((paramPicnicEngine.stateSizeBits == 129) ? GET_MAT(this.KMatrix_full, paramInt) : ((paramPicnicEngine.stateSizeBits == 192) ? ((paramPicnicEngine.numRounds == 4) ? GET_MAT(this.KMatrix_full, paramInt) : GET_MAT(this.KMatrix, paramInt)) : ((paramPicnicEngine.stateSizeBits == 255) ? GET_MAT(this.KMatrix_full, paramInt) : ((paramPicnicEngine.stateSizeBits == 256) ? GET_MAT(this.KMatrix, paramInt) : null))));
  }
  
  protected KMatricesWithPointer KMatrixInv(PicnicEngine paramPicnicEngine) {
    boolean bool = false;
    return (paramPicnicEngine.stateSizeBits == 129) ? GET_MAT(this.KMatrix_inv, bool) : ((paramPicnicEngine.stateSizeBits == 192 && paramPicnicEngine.numRounds == 4) ? GET_MAT(this.KMatrix_inv, bool) : ((paramPicnicEngine.stateSizeBits == 255) ? GET_MAT(this.KMatrix_inv, bool) : null));
  }
  
  protected KMatricesWithPointer RConstant(PicnicEngine paramPicnicEngine, int paramInt) {
    return (paramPicnicEngine.stateSizeBits == 128) ? GET_MAT(this.RConstants, paramInt) : ((paramPicnicEngine.stateSizeBits == 129) ? GET_MAT(this.RConstants_full, paramInt) : ((paramPicnicEngine.stateSizeBits == 192) ? ((paramPicnicEngine.numRounds == 4) ? GET_MAT(this.RConstants_full, paramInt) : GET_MAT(this.RConstants, paramInt)) : ((paramPicnicEngine.stateSizeBits == 255) ? GET_MAT(this.RConstants_full, paramInt) : ((paramPicnicEngine.stateSizeBits == 256) ? GET_MAT(this.RConstants, paramInt) : null))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\picnic\LowmcConstants.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */