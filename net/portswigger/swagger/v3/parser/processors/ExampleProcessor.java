package net.portswigger.swagger.v3.parser.processors;

import burp.Zbqc;
import java.util.Iterator;
import java.util.List;
import net.portswigger.swagger.v2.util.RefUtils;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.parser.ResolverCache;
import net.portswigger.swagger.v3.parser.models.RefFormat;

public class ExampleProcessor {
  private final ResolverCache cache;
  
  private final OpenAPI openAPI;
  
  private final ExternalRefProcessor externalRefProcessor;
  
  public ExampleProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI) {
    this.cache = paramResolverCache;
    this.openAPI = paramOpenAPI;
    this.externalRefProcessor = new ExternalRefProcessor(paramResolverCache, paramOpenAPI);
  }
  
  public void processExample(Example paramExample) {
    if (paramExample.get$ref() != null)
      processReferenceExample(paramExample); 
  }
  
  public void processExample(List<Example> paramList) {
    Iterator<Example> iterator = paramList.iterator();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    while (iterator.hasNext()) {
      Example example = iterator.next();
      if (example.get$ref() != null)
        processReferenceExample(example); 
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void processReferenceExample(Example paramExample) {
    RefFormat refFormat = RefUtils.computeRefFormat(paramExample.get$ref());
    String str = paramExample.get$ref();
    if (RefUtils.isAnExternalRefFormat(refFormat)) {
      String str1 = this.externalRefProcessor.processRefToExternalExample(str, refFormat);
      if (str1 != null)
        paramExample.set$ref(str1); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\processors\ExampleProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */