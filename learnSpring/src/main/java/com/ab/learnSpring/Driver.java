package com.ab.learnSpring;


import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Driver {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        Employee s=(Employee)factory.getBean("employee");  
        s.show();  
        System.out.println(s.getContact().get("phone"));
    }  
}  
