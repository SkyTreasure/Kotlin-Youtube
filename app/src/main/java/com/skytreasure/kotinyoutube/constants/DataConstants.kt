package com.skytreasure.kotinyoutube.constants

import com.skytreasure.kotinyoutube.model.YoutubeModel


/**
 * Created by akash on 15/6/17.
 */

class DataConstants{

    companion object {
        val youtubeVideoList : List<YoutubeModel> = listOf(
                getOverviewModel("https://youtu.be/5nyFfZnsyNY","Kuttanadan Punjayile - Kerala Boat Song (Vidya Vox English Remix) "),
                getOverviewModel("https://youtu.be/pha37bMwWR0","Ed Sheeran - Shape Of You | Cheez Badi Hai (Vidya Vox Mashup Cover) "),
                getOverviewModel("https://youtu.be/AOfMnx6fc6A","The Chainsmokers & Coldplay - Something Just Like This | Channa Mereya (Vidya Vox Mashup Cover)"),
                getOverviewModel("https://youtu.be/AExTAC1d1zA","Nico & Vinz - Am I Wrong | Yeh Duriya (Vidya Vox Mashup Cover) (ft. Rohan Kymal)"),
                getOverviewModel("https://youtu.be/Spfaub0sVk0","The Chainsmokers - Closer | Kabira (Vidya Vox Mashup Cover) (ft. Casey Breves)"),
                getOverviewModel("https://youtu.be/lGkqNVrgFWE","Selena Gomez - Same Old Love | Mere Sapno Ki Rani Remix (Vidya Vox Mashup Cover)"),
                getOverviewModel("https://youtu.be/pMmCvixJS8c","Justin Bieber - Sorry | Kandukondain Kandukondain (Vidya Vox Mashup Cover)"),
                getOverviewModel("https://youtu.be/kN1D8p2Fc6U","Sia - Cheap Thrills (Vidya Vox Cover) (ft. Shankar Tucker & Akshaya Tucker) "),
                getOverviewModel("https://youtu.be/Rw9EiwUn4Yg","Ellie Goulding - Love Me Like You Do | Hosanna (Vidya Vox Mashup Cover)"),

                getOverviewModel("https://youtu.be/jK0K-2Gz780","Major Lazer - Lean On | Jind Mahi (Vidya Mashup Cover ft Ricky Jatt, Raashi Kulkarni, Raginder Momi)"),
                getOverviewModel("https://youtu.be/qPweDwkDw6w","Calvin Harris - How Deep Is Your Love | Balam Pichkari (Vidya Vox Mashup Cover) "),
                getOverviewModel("https://youtu.be/9ZsRQNUQ8Vo","Taylor Swift - Blank Space | Mental Manadhil (Vidya Vox Mashup Cover) "),
                getOverviewModel("https://youtu.be/UMsA3T4xsU8","John Legend - All Of Me | Main Hoon Hero Tera (Vidya Vox Mashup Cover)")
                )


        fun getOverviewModel(url: String, title:String) : YoutubeModel {
            var id= url.replace("https://youtu.be/","")
           return YoutubeModel("http://img.youtube.com/vi/$id/maxresdefault.jpg",title,url,id )
        }
    }
}
