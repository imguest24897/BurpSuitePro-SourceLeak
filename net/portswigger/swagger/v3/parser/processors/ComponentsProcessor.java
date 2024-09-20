package net.portswigger.swagger.v3.parser.processors;

import burp.Zbqc;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.callbacks.Callback;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.headers.Header;
import net.portswigger.swagger.v3.oas.models.links.Link;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.oas.models.parameters.RequestBody;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponse;
import net.portswigger.swagger.v3.oas.models.security.SecurityScheme;
import net.portswigger.swagger.v3.parser.ResolverCache;

public class ComponentsProcessor {
  private final ResolverCache cache;
  
  private final OpenAPI openApi;
  
  private final SchemaProcessor schemaProcessor;
  
  private final ResponseProcessor responseProcessor;
  
  private final RequestBodyProcessor requestBodyProcessor;
  
  private final ParameterProcessor parameterProcessor;
  
  private final HeaderProcessor headerProcessor;
  
  private final ExampleProcessor exampleProcessor;
  
  private final LinkProcessor linkProcessor;
  
  private final CallbackProcessor callbackProcessor;
  
  private final SecuritySchemeProcessor securitySchemeProcessor;
  
  public ComponentsProcessor(OpenAPI paramOpenAPI, ResolverCache paramResolverCache) {
    this(paramOpenAPI, paramResolverCache, false);
  }
  
  public ComponentsProcessor(OpenAPI paramOpenAPI, ResolverCache paramResolverCache, boolean paramBoolean) {
    this.cache = paramResolverCache;
    this.openApi = paramOpenAPI;
    this.schemaProcessor = new SchemaProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.responseProcessor = new ResponseProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.requestBodyProcessor = new RequestBodyProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.parameterProcessor = new ParameterProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.headerProcessor = new HeaderProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.exampleProcessor = new ExampleProcessor(paramResolverCache, paramOpenAPI);
    this.linkProcessor = new LinkProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.callbackProcessor = new CallbackProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.securitySchemeProcessor = new SecuritySchemeProcessor(paramResolverCache, paramOpenAPI);
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public void processComponents() {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (this.openApi.getComponents() == null)
      return; 
    Map<String, ApiResponse> map = this.openApi.getComponents().getResponses();
    Map<String, RequestBody> map1 = this.openApi.getComponents().getRequestBodies();
    Map<String, Parameter> map2 = this.openApi.getComponents().getParameters();
    Map<String, Header> map3 = this.openApi.getComponents().getHeaders();
    Map<String, Example> map4 = this.openApi.getComponents().getExamples();
    Map<String, Link> map5 = this.openApi.getComponents().getLinks();
    Map<String, Callback> map6 = this.openApi.getComponents().getCallbacks();
    Map<String, SecurityScheme> map7 = this.openApi.getComponents().getSecuritySchemes();
    if (map != null) {
      LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
      while (map.keySet().size() > linkedHashSet.size()) {
        processResponses(linkedHashSet, map);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    if (map1 != null) {
      LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
      while (map1.keySet().size() > linkedHashSet.size()) {
        processRequestBodies(linkedHashSet, map1);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    if (map2 != null) {
      LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
      while (map2.keySet().size() > linkedHashSet.size()) {
        processParameters(linkedHashSet, map2);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    if (map3 != null) {
      LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
      while (map3.keySet().size() > linkedHashSet.size()) {
        processHeaders(linkedHashSet, map3);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    if (map4 != null) {
      LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
      while (map4.keySet().size() > linkedHashSet.size()) {
        processExamples(linkedHashSet, map4);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    if (map5 != null) {
      LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
      while (map5.keySet().size() > linkedHashSet.size()) {
        processLinks(linkedHashSet, map5);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    if (map6 != null) {
      LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
      while (map6.keySet().size() > linkedHashSet.size()) {
        processCallbacks(linkedHashSet, map6);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    if (map7 != null) {
      LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
      while (map7.keySet().size() > linkedHashSet.size()) {
        processSecuritySchemes(linkedHashSet, map7);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    Map<String, Schema> map8 = this.openApi.getComponents().getSchemas();
    if (map8 != null) {
      LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
      while (map8.keySet().size() > linkedHashSet.size()) {
        processSchemas(linkedHashSet, map8);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
  }
  
  private void processSecuritySchemes(Set<String> paramSet, Map<String, SecurityScheme> paramMap) {
    paramSet.addAll(paramMap.keySet());
    Iterator<String> iterator = paramSet.iterator();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    while (iterator.hasNext()) {
      String str = iterator.next();
      SecurityScheme securityScheme1 = paramMap.get(str);
      SecurityScheme securityScheme2 = this.securitySchemeProcessor.processSecurityScheme(securityScheme1);
      paramMap.replace(str, securityScheme1, securityScheme2);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void processCallbacks(Set<String> paramSet, Map<String, Callback> paramMap) {
    paramSet.addAll(paramMap.keySet());
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    for (String str : paramSet) {
      Callback callback = paramMap.get(str);
      this.callbackProcessor.processCallback(callback);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void processLinks(Set<String> paramSet, Map<String, Link> paramMap) {
    paramSet.addAll(paramMap.keySet());
    Iterator<String> iterator = paramSet.iterator();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    while (iterator.hasNext()) {
      String str = iterator.next();
      Link link = paramMap.get(str);
      this.linkProcessor.processLink(link);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void processExamples(Set<String> paramSet, Map<String, Example> paramMap) {
    paramSet.addAll(paramMap.keySet());
    Iterator<String> iterator = paramSet.iterator();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    while (iterator.hasNext()) {
      String str = iterator.next();
      Example example = paramMap.get(str);
      this.exampleProcessor.processExample(example);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void processHeaders(Set<String> paramSet, Map<String, Header> paramMap) {
    paramSet.addAll(paramMap.keySet());
    Iterator<String> iterator = paramSet.iterator();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    while (iterator.hasNext()) {
      String str = iterator.next();
      Header header = paramMap.get(str);
      this.headerProcessor.processHeader(header);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void processParameters(Set<String> paramSet, Map<String, Parameter> paramMap) {
    paramSet.addAll(paramMap.keySet());
    Iterator<String> iterator = paramSet.iterator();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    while (iterator.hasNext()) {
      String str = iterator.next();
      Parameter parameter = paramMap.get(str);
      this.parameterProcessor.processParameter(parameter);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void processRequestBodies(Set<String> paramSet, Map<String, RequestBody> paramMap) {
    paramSet.addAll(paramMap.keySet());
    Iterator<String> iterator = paramSet.iterator();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    while (iterator.hasNext()) {
      String str = iterator.next();
      RequestBody requestBody = paramMap.get(str);
      this.requestBodyProcessor.processRequestBody(requestBody);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void processResponses(Set<String> paramSet, Map<String, ApiResponse> paramMap) {
    paramSet.addAll(paramMap.keySet());
    Iterator<String> iterator = paramSet.iterator();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    while (iterator.hasNext()) {
      String str = iterator.next();
      ApiResponse apiResponse = paramMap.get(str);
      this.responseProcessor.processResponse(apiResponse);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  public void processSchemas(Set<String> paramSet, Map<String, Schema> paramMap) {
    paramSet.addAll(paramMap.keySet());
    null = paramSet.iterator();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    while (null.hasNext()) {
      String str1 = null.next();
      Schema schema = paramMap.get(str1);
      String str2 = (schema.get$ref() != null) ? schema.get$ref() : null;
      this.schemaProcessor.processSchema(schema);
      if (schema.get$ref() != null) {
        String str = this.cache.getRenamedRef(str2);
        if (str != null) {
          Schema schema1 = paramMap.get(str);
          if (!this.cache.hasReferencedKey(str))
            paramMap.remove(str); 
          paramMap.put(str1, schema1);
        } 
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
    for (String str : paramSet) {
      Schema schema = paramMap.get(str);
      Map map = schema.getProperties();
      if (map != null)
        for (Map.Entry entry : map.entrySet()) {
          Schema schema1 = (Schema)entry.getValue();
          if (schema1.get$ref() != null)
            this.schemaProcessor.processSchema(schema); 
          if (arrayOfZbqc == null)
            break; 
        }  
      if (arrayOfZbqc == null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\processors\ComponentsProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */