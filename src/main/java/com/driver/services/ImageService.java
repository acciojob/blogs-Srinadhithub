package com.driver.services;

import com.driver.models.*;
import com.driver.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

    @Autowired
    BlogRepository blogRepository2;
    @Autowired
    ImageRepository imageRepository2;

    public Image addImage(Integer blogId, String description, String dimensions){
        //add an image to the blog
      Image image= Image.builder()
              .description(description)
              .dimensions(dimensions)
              .build();
      Blog blog=blogRepository2.findById(blogId).get();
      image.setBlog(blog);
      blog.getImageList().add(image);
      blogRepository2.save(blog);
      return image;
    }

    public void deleteImage(Integer id){
        Blog blog=imageRepository2.findById(id).get().getBlog();
        blog.getImageList().remove(imageRepository2.findById(id).get());
        imageRepository2.deleteById(id);
    }

    public int countImagesInScreen(Integer id, String screenDimensions) {
        //Find the number of images of given dimensions that can fit in a screen having `screenDimensions`
            return 0;
    }
}
