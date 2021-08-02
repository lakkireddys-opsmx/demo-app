package com.opsmx.sampleapp.service;

import com.opsmx.sampleapp.controller.MainController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Service
public class MainService {
    private static final Logger LOG = LoggerFactory.getLogger(MainController.class);

    @Autowired
    ResourceLoader resourceLoader;

    public Object getIndex(){
        String data = "";
        Resource resource = resourceLoader.getResource("classpath:static/index.html");
        try
        {
            InputStream inputStream = resource.getInputStream();
            byte[] bdata = FileCopyUtils.copyToByteArray(inputStream);
            data = new String(bdata, StandardCharsets.UTF_8);
        } catch (IOException e) {
            LOG.error("IOException", e);
        }
        return data;
    }
}
