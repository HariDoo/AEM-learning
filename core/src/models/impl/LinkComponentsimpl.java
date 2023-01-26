package com.bgm.core.models.impl;

import java.util.List;

import javax.annotation.PostConstruct;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bgm.core.models.LinkComponent;



@Model(adaptables = Resource.class,adapters = LinkComponent.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class LinkComponentsimpl implements LinkComponent {

	private static final Logger LOGGER = LoggerFactory.getLogger(LinkComponentsimpl.class);

    @ChildResource
    private List<LinkComponentsimpl> multifeild;
    @Override
    public List<LinkComponentsimpl> getMultifeildlist() {
        //if (multifeild != null) {
            return multifeild;
        // } else {
        //     return  null ; 
        // }
    }
    @ValueMapValue
    @Default(values="Enter the TEXT")
    private String text;
   
    @ValueMapValue
    private String link;
    
    @ValueMapValue
    @Default(values= "Enter the TITLE")
    private String title;
    
    @ValueMapValue
    private String selectopen;
   
    
    @ValueMapValue
    private String description;

    @ValueMapValue
    private String urlcheckbox;
       
    @Override
     public String getUrlcheckbox() {
            return urlcheckbox;  
     }
 
    @Override
    public String getText() {
        return text;
    }
    @Override
    public String getLink() {
        return link;
    }
    @Override
    public String getTitle() {
        return title;
    }
   
    @Override
    public String getSelect() {
        return selectopen;
    }
   
    @Override
    public String getDescription() {
        return description;
    }

    @PostConstruct
	public void init() {
		LOGGER.info("Property Injection done"  );
		LOGGER.info("ChildResource Injection : {}", multifeild);
	}

    public static Object GetMultifeildlist() {
        return null;
    }

}    
    // @PostConstruct
    // @Override
    // public String getUrlcheckbox() {
    //    if(urlcheckbox == "true"){
    //        return  getTextlink();
    //    }
    //    else {
    //        return null;
    //    }
    // }
    
