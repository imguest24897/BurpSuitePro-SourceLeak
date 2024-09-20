/*     */ package javafx.beans.property.adapter;
/*     */ 
/*     */ import com.sun.javafx.property.adapter.JavaBeanPropertyBuilderHelper;
/*     */ import com.sun.javafx.property.adapter.PropertyDescriptor;
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
/*     */ 
/*     */ public final class JavaBeanFloatPropertyBuilder
/*     */ {
/*  62 */   private JavaBeanPropertyBuilderHelper<Number> helper = new JavaBeanPropertyBuilderHelper();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static JavaBeanFloatPropertyBuilder create() {
/*  72 */     return new JavaBeanFloatPropertyBuilder();
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
/*     */   public JavaBeanFloatProperty build() throws NoSuchMethodException {
/*  85 */     PropertyDescriptor<Number> propertyDescriptor = this.helper.getDescriptor();
/*  86 */     if (!float.class.equals(propertyDescriptor.getType()) && !Number.class.isAssignableFrom(propertyDescriptor.getType())) {
/*  87 */       throw new IllegalArgumentException("Not a float property");
/*     */     }
/*  89 */     return new JavaBeanFloatProperty(propertyDescriptor, this.helper.getBean());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaBeanFloatPropertyBuilder name(String paramString) {
/*  99 */     this.helper.name(paramString);
/* 100 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaBeanFloatPropertyBuilder bean(Object paramObject) {
/* 110 */     this.helper.bean(paramObject);
/* 111 */     return this;
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
/*     */   public JavaBeanFloatPropertyBuilder beanClass(Class<?> paramClass) {
/* 123 */     this.helper.beanClass(paramClass);
/* 124 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaBeanFloatPropertyBuilder getter(String paramString) {
/* 135 */     this.helper.getterName(paramString);
/* 136 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaBeanFloatPropertyBuilder setter(String paramString) {
/* 147 */     this.helper.setterName(paramString);
/* 148 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaBeanFloatPropertyBuilder getter(Method paramMethod) {
/* 159 */     this.helper.getter(paramMethod);
/* 160 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaBeanFloatPropertyBuilder setter(Method paramMethod) {
/* 171 */     this.helper.setter(paramMethod);
/* 172 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\adapter\JavaBeanFloatPropertyBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */