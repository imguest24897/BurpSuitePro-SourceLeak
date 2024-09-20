package org.bouncycastle.mime.smime;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.mime.CanonicalOutputStream;
import org.bouncycastle.mime.Headers;
import org.bouncycastle.mime.MimeContext;
import org.bouncycastle.mime.MimeMultipartContext;
import org.bouncycastle.mime.MimeParserContext;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.io.TeeInputStream;
import org.bouncycastle.util.io.TeeOutputStream;

public class SMimeMultipartContext implements MimeMultipartContext {
  private final SMimeParserContext parserContext;
  
  private DigestCalculator[] calculators;
  
  public SMimeMultipartContext(MimeParserContext paramMimeParserContext, Headers paramHeaders) {
    this.parserContext = (SMimeParserContext)paramMimeParserContext;
    this.calculators = createDigestCalculators(paramHeaders);
  }
  
  DigestCalculator[] getDigestCalculators() {
    return this.calculators;
  }
  
  OutputStream getDigestOutputStream() {
    TeeOutputStream teeOutputStream;
    if (this.calculators.length == 1)
      return this.calculators[0].getOutputStream(); 
    OutputStream outputStream = this.calculators[0].getOutputStream();
    for (byte b = 1; b < this.calculators.length; b++)
      teeOutputStream = new TeeOutputStream(this.calculators[b].getOutputStream(), outputStream); 
    return (OutputStream)teeOutputStream;
  }
  
  private DigestCalculator[] createDigestCalculators(Headers paramHeaders) {
    try {
      Map map = paramHeaders.getContentTypeAttributes();
      String str = (String)map.get("micalg");
      if (str == null)
        throw new IllegalStateException("No micalg field on content-type header"); 
      String[] arrayOfString = str.substring(str.indexOf('=') + 1).split(",");
      DigestCalculator[] arrayOfDigestCalculator = new DigestCalculator[arrayOfString.length];
      for (byte b = 0; b < arrayOfString.length; b++) {
        String str1 = SMimeUtils.lessQuotes(arrayOfString[b]).trim();
        arrayOfDigestCalculator[b] = this.parserContext.getDigestCalculatorProvider().get(new AlgorithmIdentifier(SMimeUtils.getDigestOID(str1)));
      } 
      return arrayOfDigestCalculator;
    } catch (OperatorCreationException operatorCreationException) {
      return null;
    } 
  }
  
  public MimeContext createContext(final int partNo) throws IOException {
    return new MimeContext() {
        public InputStream applyContext(Headers param1Headers, InputStream param1InputStream) throws IOException {
          if (partNo == 0) {
            OutputStream outputStream = SMimeMultipartContext.this.getDigestOutputStream();
            param1Headers.dumpHeaders(outputStream);
            outputStream.write(13);
            outputStream.write(10);
            return (InputStream)new TeeInputStream(param1InputStream, (OutputStream)new CanonicalOutputStream(SMimeMultipartContext.this.parserContext, param1Headers, outputStream));
          } 
          return param1InputStream;
        }
      };
  }
  
  public InputStream applyContext(Headers paramHeaders, InputStream paramInputStream) throws IOException {
    return paramInputStream;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\smime\SMimeMultipartContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */