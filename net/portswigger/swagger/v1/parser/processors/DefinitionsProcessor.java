package net.portswigger.swagger.v1.parser.processors;

import burp.Zbqc;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.RefModel;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.parser.ResolverCache;

public class DefinitionsProcessor {
  private final ResolverCache cache;
  
  private final Swagger swagger;
  
  private final ModelProcessor modelProcessor;
  
  public DefinitionsProcessor(ResolverCache paramResolverCache, Swagger paramSwagger) {
    this.cache = paramResolverCache;
    this.swagger = paramSwagger;
    this.modelProcessor = new ModelProcessor(paramResolverCache, paramSwagger);
  }
  
  public void processDefinitions() {
    Map<String, Model> map = this.swagger.getDefinitions();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.ZI();
    if (map == null)
      return; 
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
    while (map.keySet().size() > linkedHashSet.size()) {
      processDefinitions(linkedHashSet, map);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  public void processDefinitions(Set<String> paramSet, Map<String, Model> paramMap) {
    paramSet.addAll(paramMap.keySet());
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.ZI();
    for (String str1 : paramSet) {
      Model model = paramMap.get(str1);
      String str2 = (model instanceof RefModel) ? ((RefModel)model).get$ref() : null;
      this.modelProcessor.processModel(model);
      if (model instanceof RefModel) {
        String str = this.cache.getRenamedRef(str2);
        if (str != null) {
          Model model1 = paramMap.get(str);
          if (!this.cache.hasReferencedKey(str))
            paramMap.remove(str); 
          paramMap.put(str1, model1);
        } 
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parser\processors\DefinitionsProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */