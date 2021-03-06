package org.vgr.ioc.core;

import java.util.List;

import org.vgr.ioc.annot.BeanScope;

/**
 * This class bean is  useful for holding bean defintion from Xml files 
 * @author venugopal
 *
 */
public class BeanDefinition {
	private String id;
	private String className;
	private BeanScope scope;
	private Object object;
	private Object proxy;
	private Class<?> objInterface=null;
	private boolean hasProxy=false;
	private List<BeanProperty> properties=null;
	
	public BeanDefinition(){}

	public BeanDefinition(String id,String className,BeanScope scope){
		this.id=id;
		this.className=className;
		this.scope=scope;
	}
	
	public boolean isObjPresent() {
		return object!=null?true:false;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	public BeanScope getScope() {
		return scope;
	}

	public void setScope(BeanScope scope) {
		this.scope = scope;
	}

	public List<BeanProperty> getProperties() {
		return properties;
	}

	public void setProperties(List<BeanProperty> properties) {
		this.properties = properties;
	}

	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public Object getProxy() {
		return proxy;
	}
	public void setProxy(Object proxy) {
		this.proxy = proxy;
	}
	
	public Class<?> getObjInterface() {
		return objInterface;
	}

	public void setObjInterface(Class<?> objInterface) {
		this.objInterface = objInterface;
	}
	
	public boolean isHasProxy() {
		return hasProxy;
	}

	public void setHasProxy(boolean hasProxy) {
		this.hasProxy = hasProxy;
	}

	@Override
	public String toString() {
		return "BeanDefinition [id=" + id + ", className=" + className
				+ ", scope=" + scope + ", object=" + object + ", proxy="
				+ proxy + ", properties=" + properties + "]";
	}
}
