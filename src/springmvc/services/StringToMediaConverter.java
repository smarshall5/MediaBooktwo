package springmvc.services;

import hibernate.entity.media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class StringToMediaConverter implements Converter<String, media> {
    @Autowired
    private IMediaService mediaService;

    @Override
    public media convert(String s) {
        int mediaId = Integer.parseInt(s);
        media media = mediaService.GetMedia(mediaId);

        return media;
    }
}
