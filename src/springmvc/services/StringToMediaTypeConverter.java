package springmvc.services;

import hibernate.entity.mediatype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class StringToMediaTypeConverter implements Converter<String, mediatype> {
    @Autowired
    private IMediaTypeService mediaTypeService;

    @Override
    public mediatype convert(String s) {
        int mediaTypeid = Integer.parseInt(s);
        mediatype mediatype = mediaTypeService.getmediaType(mediaTypeid);

        return mediatype;
    }
}