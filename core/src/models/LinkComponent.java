package com.bgm.core.models;

import java.util.List;

import com.bgm.core.models.impl.LinkComponentsimpl;



public interface LinkComponent {

        List<LinkComponentsimpl> getMultifeildlist();
        String getText();
        String getLink();
        String getTitle();
        String getSelect();
        String getDescription();
        String getUrlcheckbox();
       // String getUrl();
}
