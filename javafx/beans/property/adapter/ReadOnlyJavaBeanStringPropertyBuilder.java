/*     */ package javafx.beans.property.adapter;
/*     */ 
/*     */ import com.sun.javafx.property.adapter.ReadOnlyJavaBeanPropertyBuilderHelper;
/*     */ import com.sun.javafx.property.adapter.ReadOnlyPropertyDescriptor;
/*     */ import java.lang.reflect.Method;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ReadOnlyJavaBeanStringPropertyBuilder
/*     */ {
/*  61 */   private final ReadOnlyJavaBeanPropertyBuilderHelper<String> helper = new ReadOnlyJavaBeanPropertyBuilderHelper();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ReadOnlyJavaBeanStringPropertyBuilder create() {
/*  71 */     return new ReadOnlyJavaBeanStringPropertyBuilder();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanStringProperty build() throws NoSuchMethodException {
/*  84 */     ReadOnlyPropertyDescriptor<String> readOnlyPropertyDescriptor = this.helper.getDescriptor();
/*  85 */     if (!String.class.equals(readOnlyPropertyDescriptor.getType())) {
/*  86 */       throw new IllegalArgumentException("Not a String property");
/*     */     }
/*  88 */     return new ReadOnlyJavaBeanStringProperty(readOnlyPropertyDescriptor, this.helper.getBean());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanStringPropertyBuilder name(String paramString) {
/*  98 */     this.helper.name(paramString);
/*  99 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanStringPropertyBuilder bean(Object paramObject) {
/* 109 */     this.helper.bean(paramObject);
/* 110 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanStringPropertyBuilder beanClass(Class<?> paramClass) {
/* 122 */     this.helper.beanClass(paramClass);
/* 123 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanStringPropertyBuilder getter(String paramString) {
/* 134 */     this.helper.getterName(paramString);
/* 135 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanStringPropertyBuilder getter(Method paramMethod) {
/* 146 */     this.helper.getter(paramMethod);
/* 147 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\adapter\ReadOnlyJavaBeanStringPropertyBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */