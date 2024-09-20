package org.bouncycastle.mime.smime;

import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.cms.CMSEnvelopedDataStreamGenerator;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.OriginatorInformation;
import org.bouncycastle.cms.RecipientInfoGenerator;
import org.bouncycastle.mime.Headers;
import org.bouncycastle.mime.MimeIOException;
import org.bouncycastle.mime.MimeWriter;
import org.bouncycastle.mime.encoding.Base64OutputStream;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.util.Strings;

public class SMIMEEnvelopedWriter extends MimeWriter {
  private final CMSEnvelopedDataStreamGenerator envGen;
  
  private final OutputEncryptor outEnc;
  
  private final OutputStream mimeOut;
  
  private final String contentTransferEncoding;
  
  private SMIMEEnvelopedWriter(Builder paramBuilder, OutputEncryptor paramOutputEncryptor, OutputStream paramOutputStream) {
    super(new Headers(mapToLines(paramBuilder.headers), paramBuilder.contentTransferEncoding));
    this.envGen = paramBuilder.envGen;
    this.contentTransferEncoding = paramBuilder.contentTransferEncoding;
    this.outEnc = paramOutputEncryptor;
    this.mimeOut = paramOutputStream;
  }
  
  public OutputStream getContentStream() throws IOException {
    this.headers.dumpHeaders(this.mimeOut);
    this.mimeOut.write(Strings.toByteArray("\r\n"));
    try {
      Base64OutputStream base64OutputStream;
      OutputStream outputStream1 = this.mimeOut;
      if ("base64".equals(this.contentTransferEncoding))
        base64OutputStream = new Base64OutputStream(outputStream1); 
      OutputStream outputStream2 = this.envGen.open(SMimeUtils.createUnclosable((OutputStream)base64OutputStream), this.outEnc);
      return new ContentOutputStream(outputStream2, (OutputStream)base64OutputStream);
    } catch (CMSException cMSException) {
      throw new MimeIOException(cMSException.getMessage(), cMSException);
    } 
  }
  
  public static class Builder {
    private static final String[] stdHeaders = new String[] { "Content-Type", "Content-Disposition", "Content-Transfer-Encoding", "Content-Description" };
    
    private static final String[] stdValues = new String[] { "application/pkcs7-mime; name=\"smime.p7m\"; smime-type=enveloped-data", "attachment; filename=\"smime.p7m\"", "base64", "S/MIME Encrypted Message" };
    
    private final CMSEnvelopedDataStreamGenerator envGen = new CMSEnvelopedDataStreamGenerator();
    
    private final Map<String, String> headers = new LinkedHashMap<>();
    
    String contentTransferEncoding = "base64";
    
    public Builder() {
      for (byte b = 0; b != stdHeaders.length; b++)
        this.headers.put(stdHeaders[b], stdValues[b]); 
    }
    
    public Builder setBufferSize(int param1Int) {
      this.envGen.setBufferSize(param1Int);
      return this;
    }
    
    public Builder setUnprotectedAttributeGenerator(CMSAttributeTableGenerator param1CMSAttributeTableGenerator) {
      this.envGen.setUnprotectedAttributeGenerator(param1CMSAttributeTableGenerator);
      return this;
    }
    
    public Builder setOriginatorInfo(OriginatorInformation param1OriginatorInformation) {
      this.envGen.setOriginatorInfo(param1OriginatorInformation);
      return this;
    }
    
    public Builder withHeader(String param1String1, String param1String2) {
      this.headers.put(param1String1, param1String2);
      return this;
    }
    
    public Builder addRecipientInfoGenerator(RecipientInfoGenerator param1RecipientInfoGenerator) {
      this.envGen.addRecipientInfoGenerator(param1RecipientInfoGenerator);
      return this;
    }
    
    public SMIMEEnvelopedWriter build(OutputStream param1OutputStream, OutputEncryptor param1OutputEncryptor) {
      return new SMIMEEnvelopedWriter(this, param1OutputEncryptor, SMimeUtils.autoBuffer(param1OutputStream));
    }
  }
  
  private static class ContentOutputStream extends OutputStream {
    private final OutputStream main;
    
    private final OutputStream backing;
    
    ContentOutputStream(OutputStream param1OutputStream1, OutputStream param1OutputStream2) {
      this.main = param1OutputStream1;
      this.backing = param1OutputStream2;
    }
    
    public void write(byte[] param1ArrayOfbyte) throws IOException {
      this.main.write(param1ArrayOfbyte);
    }
    
    public void write(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) throws IOException {
      this.main.write(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public void write(int param1Int) throws IOException {
      this.main.write(param1Int);
    }
    
    public void close() throws IOException {
      this.main.close();
      if (this.backing != null)
        this.backing.close(); 
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\smime\SMIMEEnvelopedWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */