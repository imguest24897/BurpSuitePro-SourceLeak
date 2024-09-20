/*     */ package com.install4j.runtime.installer.config;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ReplacementMode;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.installer.helper.Install4jClassLoader;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import java.beans.XMLDecoder;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.WeakHashMap;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.w3c.dom.Element;
/*     */ import org.w3c.dom.Node;
/*     */ 
/*     */ public abstract class AbstractBeanConfig extends AbstractConfig implements Cloneable {
/*     */   private static final String ELEMENT_STRING = "string";
/*     */   
/*     */   public static void finishBatch() {
/*  34 */     forceInternalSaxParserFactory();
/*     */     try {
/*  36 */       XMLDecoder xmlDecoder = createBatchXmlDecoder();
/*  37 */       if (xmlDecoder == null) {
/*     */         return;
/*     */       }
/*  40 */       xmlDecoder.setExceptionListener(e -> {
/*     */             if (!Util.isAix()) {
/*     */               Logger.getInstance().log(e);
/*     */             }
/*     */           });
/*     */       
/*  46 */       for (AbstractBeanConfig beanConfig : batch) {
/*     */         try {
/*  48 */           Bean bean = (Bean)GUIHelper.invokeOnEDT(() -> (Bean)xmlDecoder.readObject());
/*  49 */           registerBean(bean, beanConfig);
/*  50 */           beanConfig.setBean(bean);
/*  51 */         } catch (Throwable e) {
/*  52 */           Logger.getInstance().error(null, "Exception during instantiation of bean ID " + beanConfig.id);
/*  53 */           InstallerUtil.reportException(e);
/*  54 */           InstallerUtil.exit(1);
/*     */         } 
/*     */       } 
/*  57 */       batch.clear();
/*     */     } finally {
/*  59 */       resetSaxParserFactory();
/*     */     } 
/*     */   }
/*     */   private static final String PROPERTY_SAX_PARSER_FACTORY = "javax.xml.parsers.SAXParserFactory"; private static String oldSaxParserFactory;
/*     */   
/*     */   private static XMLDecoder createBatchXmlDecoder() {
/*  65 */     StringBuilder buffer = new StringBuilder();
/*  66 */     buffer.append("<java class=\"java.beans.XMLDecoder\">");
/*  67 */     for (Iterator<AbstractBeanConfig> it = batch.iterator(); it.hasNext(); ) {
/*  68 */       AbstractBeanConfig beanConfig = it.next();
/*  69 */       if (!beanConfig.isInstantiated()) {
/*     */         
/*     */         try {
/*  72 */           beanConfig.replaceRuntimeVariables();
/*  73 */           javaElementString = XmlHelper.getString(XmlHelper.findChild(beanConfig.javaElement, null));
/*  74 */         } catch (IOException e) {
/*  75 */           Logger.getInstance().error(null, "Exception during instantiation of bean ID " + beanConfig.id);
/*  76 */           InstallerUtil.reportException(e);
/*  77 */           InstallerUtil.exit(1);
/*  78 */           return null;
/*     */         } 
/*  80 */         String javaElementString = InstallerVariables.replaceVariables(javaElementString, ReplacementMode.I18N_ONLY);
/*     */         
/*  82 */         buffer.append(javaElementString); continue;
/*     */       } 
/*  84 */       it.remove();
/*     */     } 
/*     */     
/*  87 */     buffer.append("</java>");
/*     */     
/*  89 */     return createXMLDecoder(new ByteArrayInputStream(buffer.toString().getBytes(StandardCharsets.UTF_8)));
/*     */   }
/*     */   
/*     */   private static XMLDecoder createXMLDecoder(InputStream in) {
/*  93 */     return new XMLDecoder(in, null, null, (ClassLoader)Install4jClassLoader.getInstance());
/*     */   }
/*     */   
/*     */   public static void registerBean(@NotNull Bean bean, @NotNull AbstractBeanConfig beanConfig) {
/*  97 */     registerBeanSafeForElevatedHelper(bean, beanConfig.getDisplayedId(), beanConfig.getTextOverrides());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void registerBeanSafeForElevatedHelper(@NotNull Bean bean, String displayedId, Map<String, String> textOverrides) {
/* 102 */     beanToDisplayedId.put(bean, displayedId);
/* 103 */     beanToTextOverrides.put(bean, textOverrides);
/*     */   }
/*     */   
/*     */   public static void clearBeans() {
/* 107 */     batch.clear();
/* 108 */     beanToDisplayedId.clear();
/* 109 */     beanToTextOverrides.clear();
/*     */   }
/*     */   
/*     */   public static List<AbstractBeanConfig> getActionListBeans(String id) {
/* 113 */     return actionsLists.get(id);
/*     */   }
/*     */   
/*     */   public static AbstractBeanConfig readNestedBeanConfig(Element beanElement) {
/* 117 */     AbstractBeanConfig beanConfig = createNestedBeanConfig(beanElement);
/* 118 */     if (beanConfig != null) {
/* 119 */       beanConfig.read(beanElement);
/*     */     }
/* 121 */     return beanConfig;
/*     */   }
/*     */   
/*     */   private static AbstractBeanConfig createNestedBeanConfig(Element beanElement) {
/* 125 */     String beanElementName = beanElement.getTagName();
/* 126 */     if (beanElementName.equalsIgnoreCase("action"))
/* 127 */       return new ActionBeanConfig(); 
/* 128 */     if (beanElementName.equalsIgnoreCase("group"))
/* 129 */       return new GroupBeanConfig(false); 
/* 130 */     if (beanElementName.equalsIgnoreCase("overriddenBean"))
/* 131 */       return new WrapperBeanConfig(); 
/* 132 */     if (beanElementName.equalsIgnoreCase("link")) {
/* 133 */       if (readAttribute(beanElement, "group", false)) {
/* 134 */         return new LinkGroupBeanConfig(false);
/*     */       }
/* 136 */       return new LinkActionBeanConfig();
/*     */     } 
/*     */     
/* 139 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 144 */   private static List<AbstractBeanConfig> batch = new LinkedList<>();
/*     */   
/* 146 */   private static WeakHashMap<Bean, String> beanToDisplayedId = new WeakHashMap<>();
/* 147 */   private static WeakHashMap<Bean, Map<String, String>> beanToTextOverrides = new WeakHashMap<>();
/* 148 */   private static Map<String, List<AbstractBeanConfig>> actionsLists = new HashMap<>();
/*     */   
/*     */   public static String getDisplayedId(Bean bean) {
/* 151 */     return beanToDisplayedId.get(bean);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static Map<String, String> getTextOverrides(Bean bean) {
/* 156 */     return beanToTextOverrides.get(bean);
/*     */   }
/*     */   @NotNull
/* 159 */   protected String id = "";
/*     */   
/* 161 */   protected String name = "";
/* 162 */   protected String customizedId = "";
/* 163 */   protected String idNamespace = "";
/*     */   private Element javaElement;
/* 165 */   private String conditionClassName = "";
/*     */   
/*     */   private boolean rollbackBarrier = false;
/* 168 */   private int rollbackBarrierExitCode = 0;
/*     */   
/* 170 */   private Map<String, String> textOverrides = new HashMap<>();
/*     */   
/*     */   @NotNull
/*     */   public String getId() {
/* 174 */     return this.id;
/*     */   }
/*     */   
/*     */   public String getName() {
/* 178 */     return this.name;
/*     */   }
/*     */   
/*     */   public String getQualifiedId() {
/* 182 */     return getIdInNamespace(getId());
/*     */   }
/*     */   
/*     */   public String getCustomizedId() {
/* 186 */     return this.customizedId;
/*     */   }
/*     */   
/*     */   public String getDisplayedId() {
/* 190 */     return (this.customizedId.length() == 0) ? this.id : this.customizedId;
/*     */   }
/*     */   
/*     */   public String getQualifiedDisplayedId() {
/* 194 */     return getIdInNamespace(getDisplayedId());
/*     */   }
/*     */   
/*     */   public String getIdNamespace() {
/* 198 */     return this.idNamespace;
/*     */   }
/*     */   
/*     */   public String getConditionClassName() {
/* 202 */     return this.conditionClassName;
/*     */   }
/*     */   
/*     */   public boolean isRollbackBarrier() {
/* 206 */     return this.rollbackBarrier;
/*     */   }
/*     */   
/*     */   public int getRollbackBarrierExitCode() {
/* 210 */     return this.rollbackBarrierExitCode;
/*     */   }
/*     */   
/*     */   public Map<String, String> getTextOverrides() {
/* 214 */     return this.textOverrides;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setBean(Bean bean) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void batchInstantiate() {
/* 227 */     AbstractBeanConfig actualBeanConfig = null;
/* 228 */     if (this instanceof LinkBeanConfig) {
/* 229 */       actualBeanConfig = ((LinkBeanConfig)this).getDelegate();
/*     */     }
/* 231 */     else if (!isInstantiated()) {
/* 232 */       actualBeanConfig = this;
/*     */     } 
/*     */     
/* 235 */     if (actualBeanConfig != null) {
/* 236 */       batch.add(actualBeanConfig);
/*     */     }
/*     */   }
/*     */   
/*     */   public String getClassName() {
/* 241 */     Element objectElement = XmlHelper.findChild(this.javaElement, "object");
/* 242 */     if (objectElement != null) {
/* 243 */       return XmlHelper.readAttribute(objectElement, "class", "");
/*     */     }
/* 245 */     return "";
/*     */   }
/*     */ 
/*     */   
/*     */   public Bean instantiateBean(boolean suppressErrors) {
/* 250 */     forceInternalSaxParserFactory();
/*     */     try {
/* 252 */       replaceRuntimeVariables();
/* 253 */       String javaElementString = XmlHelper.getString(this.javaElement);
/* 254 */       XMLDecoder xmlDecoder = createXMLDecoder(new ByteArrayInputStream(javaElementString.getBytes(StandardCharsets.UTF_8)));
/* 255 */       Bean bean = (Bean)xmlDecoder.readObject();
/* 256 */       registerBean(bean, this);
/* 257 */       return bean;
/* 258 */     } catch (Throwable e) {
/* 259 */       if (!suppressErrors) {
/* 260 */         Logger.getInstance().error(null, "Exception during instantiation of bean ID " + getDisplayedId());
/* 261 */         InstallerUtil.reportException(e);
/* 262 */         InstallerUtil.exit(1);
/*     */       } 
/* 264 */       return null;
/*     */     } finally {
/* 266 */       resetSaxParserFactory();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void forceInternalSaxParserFactory() {
/* 271 */     oldSaxParserFactory = System.getProperty("javax.xml.parsers.SAXParserFactory");
/* 272 */     System.setProperty("javax.xml.parsers.SAXParserFactory", "com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl");
/*     */   }
/*     */   
/*     */   private static void resetSaxParserFactory() {
/* 276 */     if (oldSaxParserFactory == null) {
/* 277 */       System.getProperties().remove("javax.xml.parsers.SAXParserFactory");
/*     */     } else {
/* 279 */       System.setProperty("javax.xml.parsers.SAXParserFactory", oldSaxParserFactory);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void replaceRuntimeVariables() {
/* 284 */     replaceRuntimeVariables(this.javaElement);
/*     */   }
/*     */   
/*     */   private void replaceRuntimeVariables(Element javaElement) {
/* 288 */     if (Objects.equals(javaElement.getTagName(), "string")) {
/* 289 */       Node textNode = javaElement.getFirstChild();
/* 290 */       if (textNode != null) {
/* 291 */         String content = InstallerVariables.replaceVariables(textNode.getNodeValue(), ReplacementMode.I18N_ONLY);
/* 292 */         textNode.setNodeValue(content);
/*     */       } 
/*     */     } else {
/* 295 */       for (Element childElement : childElements(javaElement)) {
/* 296 */         replaceRuntimeVariables(childElement);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void read(Element element) {
/* 303 */     this.id = readAttribute(element, "id", this.id);
/* 304 */     this.customizedId = readAttribute(element, "customizedId", this.customizedId);
/* 305 */     this.name = readAttribute(element, "name", this.name);
/* 306 */     this.idNamespace = readAttribute(element, "idNamespace", this.idNamespace);
/* 307 */     this.rollbackBarrier = readAttribute(element, "rollbackBarrier", this.rollbackBarrier);
/* 308 */     this.rollbackBarrierExitCode = readAttribute(element, "rollbackBarrierExitCode", this.rollbackBarrierExitCode);
/* 309 */     this.conditionClassName = readAttribute(element, "conditionClass", this.conditionClassName);
/* 310 */     this.javaElement = findChild(element, "java");
/*     */     
/* 312 */     readTextOverrides(element);
/* 313 */     readActionLists(element);
/*     */   }
/*     */   
/*     */   private void readTextOverrides(Element element) {
/* 317 */     Element textOverridesElement = findChild(element, "textOverrides");
/* 318 */     if (textOverridesElement != null) {
/* 319 */       for (Element propertyElement : childElements(textOverridesElement)) {
/* 320 */         String propertyName = readAttribute(propertyElement, "name", "");
/* 321 */         String propertyValue = readAttribute(propertyElement, "value", "");
/* 322 */         if (!propertyName.isEmpty()) {
/* 323 */           this.textOverrides.put(propertyName, propertyValue);
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private void readActionLists(Element element) {
/* 330 */     Element actionListsElement = findChild(element, "actionLists");
/* 331 */     if (actionListsElement != null) {
/* 332 */       for (Element actionListElement : childElements(actionListsElement)) {
/* 333 */         String id = readAttribute(actionListElement, "id", "");
/* 334 */         List<AbstractBeanConfig> actionBeanConfigs = new ArrayList<>();
/* 335 */         for (Element actionElement : childElements(actionListElement)) {
/* 336 */           AbstractBeanConfig beanConfig = readNestedBeanConfig(actionElement);
/* 337 */           if (beanConfig != null) {
/* 338 */             actionBeanConfigs.add(beanConfig);
/*     */           }
/*     */         } 
/* 341 */         actionsLists.put(id, actionBeanConfigs);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public void addAllTo(Map<String, AbstractBeanConfig> id2BeanConfig) {
/* 347 */     String qualifiedId = getQualifiedId();
/* 348 */     String qualifiedDisplayedId = getQualifiedDisplayedId();
/* 349 */     id2BeanConfig.put(qualifiedId, this);
/* 350 */     if (!Objects.equals(qualifiedDisplayedId, qualifiedId)) {
/* 351 */       id2BeanConfig.put(qualifiedDisplayedId, this);
/*     */     }
/*     */   }
/*     */   
/*     */   protected String getIdInNamespace(String id) {
/* 356 */     if (this.idNamespace.length() > 0) {
/* 357 */       return this.idNamespace + ":" + id;
/*     */     }
/* 359 */     return id;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public AbstractBeanConfig clone() {
/*     */     try {
/* 366 */       AbstractBeanConfig clone = (AbstractBeanConfig)super.clone();
/* 367 */       clone.clearInstance();
/* 368 */       return clone;
/* 369 */     } catch (CloneNotSupportedException e) {
/* 370 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public abstract boolean isInstantiated();
/*     */   
/*     */   protected abstract void clearInstance();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\AbstractBeanConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */