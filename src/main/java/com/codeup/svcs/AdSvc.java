//package com.codeup.svcs;
//
//import com.codeup.models.Ad;
//import org.springframework.stereotype.Service;
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Service("adSvc")
//public class AdSvc {
//    private List<Ad> ads = new ArrayList<Ad>();
//
//    public AdSvc() {
//        createAds();
//    }
//
//    public List<Ad> findAll() {
//        return ads;
//    }
//
//    public Ad save(Ad ad) {
//        ad.setId(ads.size() + 1);
//        ads.add(ad);
//        return ad;
//    }
//
//    public Ad findOne(long id) {
//        return ads.get((int) (id - 1));
//    }
//
//    private void createAds() {
//        // create some ad objects and add them to the ads list
//        Ad ad = new Ad("title", "another test post");
//        Ad ad2 = new Ad("title2", "another test post");
//        Ad ad3 = new Ad("title3", "another test post");
//        Ad ad4 = new Ad("title4", "another test post");
//
//        // with the save method
//        this.save(ad);
//        this.save(ad2);
//        this.save(ad3);
//        this.save(ad4);
//
//    }
//}
