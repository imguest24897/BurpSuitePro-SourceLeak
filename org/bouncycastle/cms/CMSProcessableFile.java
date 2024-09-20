package org.bouncycastle.cms;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.util.io.Streams;

public class CMSProcessableFile implements CMSTypedData, CMSReadable {
  private static final int DEFAULT_BUF_SIZE = 32768;
  
  private final ASN1ObjectIdentifier type;
  
  private final File file;
  
  private final int bufSize;
  
  public CMSProcessableFile(File paramFile) {
    this(paramFile, 32768);
  }
  
  public CMSProcessableFile(File paramFile, int paramInt) {
    this(CMSObjectIdentifiers.data, paramFile, paramInt);
  }
  
  public CMSProcessableFile(ASN1ObjectIdentifier paramASN1ObjectIdentifier, File paramFile, int paramInt) {
    this.type = paramASN1ObjectIdentifier;
    this.file = paramFile;
    this.bufSize = paramInt;
  }
  
  public InputStream getInputStream() throws IOException, CMSException {
    return new BufferedInputStream(new FileInputStream(this.file), this.bufSize);
  }
  
  public void write(OutputStream paramOutputStream) throws IOException, CMSException {
    FileInputStream fileInputStream = new FileInputStream(this.file);
    Streams.pipeAll(fileInputStream, paramOutputStream, this.bufSize);
    fileInputStream.close();
  }
  
  public Object getContent() {
    return this.file;
  }
  
  public ASN1ObjectIdentifier getContentType() {
    return this.type;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSProcessableFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */