package springmvc.controllers;

import hibernate.entity.media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.services.ICategoryService;
import springmvc.services.IMediaService;
import springmvc.services.IMediaTypeService;

import java.util.List;


@Controller
public class MediaController {
    @Autowired
    private IMediaService mediaService;

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IMediaTypeService mediaTypeService;


    @RequestMapping("/Anime")
    public String showAnime(Model model) {
        List<media> mediaList = mediaService.GetMedia();
        model.addAttribute("mediaList", mediaList);
        return "Anime";
    }

    @RequestMapping("/Books")
    public String showBooks(Model model) {
        List<media> mediaList = mediaService.GetMedia();
        model.addAttribute("mediaList", mediaList);
        return "Books";
    }

    @RequestMapping("/addSuggestions")
    public String showSuggestions(Model model) {
        media theMedia = new media();
        model.addAttribute("pleaseMedia", theMedia);

        model.addAttribute("category", categoryService.getCategory());
        model.addAttribute("mediaType", mediaTypeService.getmediaType());
        return "addSuggestions";
    }

    @PostMapping("/save")
    public String saveDonut(@ModelAttribute(name = "pleaseMedia") media theMedia, Model model,
                            BindingResult bindingResult) {
        System.out.println(theMedia);
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult);
            return "addSuggestions";
        }

        mediaService.SaveMedia(theMedia);

        return "redirect:/Anime";
    }
    @RequestMapping("/updateMedia")
    public String updateMedia(@RequestParam("mediaID") int Id ,Model theModel){
        media updateMedia = mediaService.GetMedia(Id);
        theModel.addAttribute("pleaseMedia",updateMedia);

        theModel.addAttribute("category", categoryService.getCategory());
        theModel.addAttribute("mediaType", mediaTypeService.getmediaType());
        return "addSuggestions";
    }

    @RequestMapping("/deleteMedia")
    public String deleteMedia(@RequestParam("mediaID") int Id) {
        mediaService.deleteMedia(Id);
        return "redirect:/Anime";
    }

    @RequestMapping("/Details")
    public String showDetail(Model model, @RequestParam("mediaID") int mediaID) {
        media itemDetails = mediaService.GetMedia(mediaID);
        model.addAttribute("item", itemDetails);
        return "Details";
    }

    @RequestMapping("/search")
    public String search(@RequestParam("searchTerm") String theSearchTerm,
                         Model theModel) {
        List<media> list = mediaService.getMediaByName(theSearchTerm);

        theModel.addAttribute("mediaList", list);

        return "Anime";
    }


}
