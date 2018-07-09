package com.oracle.peoplesoft.bass2.qe.utility;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesUtils {
	
	/**
	 * 配置文件对象
	 */
	
	private String src="";
	


	private FileInputStream inputStream=null;
	
	private FileOutputStream  outputStream=null;
	

	
	private Properties props=null;
	
	public PropertiesUtils() {
		
	}
	/**
	 * 
	 * 构造函数
	 * 
	 * @param src
	 * 
	 */
	
	public String getSrc() {
		return src;
	}
	
	public void setSrc(String src) {
		this.src = src;
	}
	
	public PropertiesUtils(String src) {
		
		this.src=src;
	}

	
	
	private Properties load() {
		
		if(src.trim().equals("")) {
			throw new RuntimeException("The path of Properties File is need");
		}
		try {
			
			inputStream=new FileInputStream(new File(src));
			props=new Properties();
			props.load(inputStream);
			
		} catch (IOException  e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
		return props;
	}
	
	private void write2File() throws Exception {
		
		outputStream=new FileOutputStream(new File(src));
		props.store(outputStream, "");
		close();
	}
	
	
	private void close() {
		try {
			if(inputStream!=null) {
				inputStream.close();
			}
			if(outputStream!=null) {
				outputStream.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	/**
	 * Return ke value by Key
	 * @param sKey
	 * @return
	 */
	
	public String getValueByKey(String sKey) {
		
		props=load();
		String sValue=props.getProperty(sKey.trim());
		close();
		return sValue;		
				
	}
	
	
	public String getValueByKey(String sKey,String defaultValue) {
		
		props=load();
		String sValue=props.getProperty(sKey.trim(),defaultValue.trim());
		return sValue;
	}
	/**
	 * get all properties values
	 * 
	 * @return
	 */
	public Map<String, String> getAllProperties(){
		
		props=load();
		
		Map<String, String> map=new HashMap<String,String>();
		
		Enumeration enumeration =props.propertyNames();
		while(enumeration.hasMoreElements()) {
			String sKey=(String)enumeration.nextElement();
			String sValue=getValueByKey(sKey);
			map.put(sKey, sValue);
		}
		return map;
		
	}
	/***
	 * Write new key to the properties file
	 * 
	 * @author xiaolson
	 * 
	 * @param sKey
	 * @param sValue
	 */
	public void addProperties(String sKey,String sValue) {
		props=load();
		props.put(sKey, sValue);
		try {
			write2File();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void addAllProperties(Map<String, String>map) {
		props=load();
		props.putAll(map);
		try {
			write2File();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param sKey
	 * @param sValue
	 */
	public void updateProperty(String sKey,String sValue) {
		props=load();
		if(!props.containsKey(sKey)) {
			throw new RuntimeException("Not such Key");
		}
		props.setProperty(sKey, sValue);
		try {
			write2File();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void deletePropertyByKey(String sKey) {
		props=load();
		
		if(!props.contains(sKey)) {
			throw new RuntimeException("Not such Key");
		}
		props.remove(sKey);
		try {
			write2File();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public String getProperty(String sKey) {
		
		String sValue="";
		sValue=props.getProperty(sKey);
		return sValue;
		
	}
	
	public void setProperty(String sKey,String sValue) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(getPath(PropertiesUtils.class));
		
		String filePath=System.getProperty("user.dir")+File.separator+"config"+File.separator+"config.properties";
		System.out.println(filePath);
		PropertiesUtils propertiesUtils= new PropertiesUtils(filePath);
		System.out.println(propertiesUtils.getValueByKey("ID"));
		propertiesUtils.addProperties("Name", "fdsa");
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("URL", "wwww");
		propertiesUtils.addAllProperties(map);
	}

}
