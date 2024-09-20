package META-INF.versions.9.org.bouncycastle.util.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.io.StreamOverflowException;

public final class Streams {
  private static int BUFFER_SIZE = 4096;
  
  public static void drain(InputStream paramInputStream) throws IOException {
    byte[] arrayOfByte = new byte[BUFFER_SIZE];
    while (paramInputStream.read(arrayOfByte, 0, arrayOfByte.length) >= 0);
  }
  
  public static void pipeAll(InputStream paramInputStream, OutputStream paramOutputStream) throws IOException {
    pipeAll(paramInputStream, paramOutputStream, BUFFER_SIZE);
  }
  
  public static void pipeAll(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt) throws IOException {
    byte[] arrayOfByte = new byte[paramInt];
    int i;
    while ((i = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length)) >= 0)
      paramOutputStream.write(arrayOfByte, 0, i); 
  }
  
  public static long pipeAllLimited(InputStream paramInputStream, long paramLong, OutputStream paramOutputStream) throws IOException {
    long l = 0L;
    byte[] arrayOfByte = new byte[BUFFER_SIZE];
    int i;
    while ((i = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length)) >= 0) {
      if (paramLong - l < i)
        throw new StreamOverflowException("Data Overflow"); 
      l += i;
      paramOutputStream.write(arrayOfByte, 0, i);
    } 
    return l;
  }
  
  public static byte[] readAll(InputStream paramInputStream) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    pipeAll(paramInputStream, byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  public static byte[] readAllLimited(InputStream paramInputStream, int paramInt) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    pipeAllLimited(paramInputStream, paramInt, byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  public static int readFully(InputStream paramInputStream, byte[] paramArrayOfbyte) throws IOException {
    return readFully(paramInputStream, paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static int readFully(InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    int i;
    for (i = 0; i < paramInt2; i += j) {
      int j = paramInputStream.read(paramArrayOfbyte, paramInt1 + i, paramInt2 - i);
      if (j < 0)
        break; 
    } 
    return i;
  }
  
  public static void validateBufferArguments(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramArrayOfbyte == null)
      throw new NullPointerException(); 
    int i = paramArrayOfbyte.length - paramInt1;
    int j = i - paramInt2;
    if ((paramInt1 | paramInt2 | i | j) < 0)
      throw new IndexOutOfBoundsException(); 
  }
  
  public static void writeBufTo(ByteArrayOutputStream paramByteArrayOutputStream, OutputStream paramOutputStream) throws IOException {
    paramByteArrayOutputStream.writeTo(paramOutputStream);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastl\\util\io\Streams.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */