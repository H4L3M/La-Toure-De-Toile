package com.latouredetoile.utils

import android.app.Activity
import android.widget.Toast
import com.latouredetoile.model.Review


const val LAT = 30.468385593680974
const val LNG = -9.061545958225967

val listPhotos = mutableListOf(
    "https://lh5.googleusercontent.com/p/AF1QipMQ82GhqncgaemjZkvcJ6r4YoRwcxSlI3XgjYYU",
    "https://lh5.googleusercontent.com/p/AF1QipONRkT7dMTlyXBlGX5dTawUDCLHmuhZNoqkAGDr",
    "https://lh5.googleusercontent.com/p/AF1QipOSpwLxkhz3xwh4yBKwaTYaHjdnAC_UNBfNzoKF",
    "https://lh5.googleusercontent.com/p/AF1QipPqA3HNIQ064g9fhW4IQmyFEDcJ-1CwtfuzciRg",
    "https://lh5.googleusercontent.com/p/AF1QipNEyXbsNX_pgMVO-9uyxb3yQSw3nM9u5rWG6OsJ",
    "https://lh5.googleusercontent.com/p/AF1QipMGqctvrwehDZ6GaNGicM8_IHYdHpQshFkDB_V6",
    "https://lh5.googleusercontent.com/p/AF1QipN3lgNb-hqfgLQX9old6tOHBosXWdBGkD1ve_3n",
    "https://lh5.googleusercontent.com/p/AF1QipO-POwkBrzW9-ytZnLVrEsDDAu-LRCk6h2NZxtq",
    "https://lh5.googleusercontent.com/p/AF1QipNNJDgUfgzU5vbnvYyXPmgWcCNZg3vXz99IPgqM",
    "https://lh5.googleusercontent.com/p/AF1QipOh59BDvT95_-k8FkBqMq8p1pOFqpbtM86a7U_V",
    "https://lh5.googleusercontent.com/p/AF1QipPsL3yRCFviB9ipbHmVTuSYH0mHXiID38VcrYbr",
    "https://lh5.googleusercontent.com/p/AF1QipOqlE3pTb1SFvqWwNfjmzqi6NGxNvWTTeSB0ejz",
    "https://lh5.googleusercontent.com/p/AF1QipPqm_dH-NHIp1AN0ubBEUYPYb5Ke5fsny6v1nmu",
    "https://lh5.googleusercontent.com/p/AF1QipN0Y-wfeQo21rl3SEHuByfpjLI7_nOeBCFudeY_",
    "https://lh6.googleusercontent.com/proxy/6oFuyUgljW9iYDVh677VE3lRFG2lvN9MjSInwH7eGiTEB8Zrmbm8C1cfpuFdC9D1zTM9dL19pHPKrU38aVEssdWtjQIxDWCzCr57M5JErko5V0jPhjCqWlepjbl7ZWvnsjHk1KeoSccaQRuo-KUZ-ODyY7MotQ",
    "https://lh6.googleusercontent.com/proxy/bJBLfTp-lqx-GeIQwKx2vZQ6mZcF5WN3LkZuK05D_vSksCamA0UvZcR9FQJ718U033WBi9io2INbraXn1gwx8caVD0txTyTtzdowBAs5_kziyyIzJryIYhwYGO_P602FsoIPkVOtM-eOQEYxKHgaYazqQcIOKAw",
    "https://lh5.googleusercontent.com/p/AF1QipOyvHx2eYLQ8r44J3bmtq4eZ_-nxM6ho4ODGTi8",
    "https://lh5.googleusercontent.com/p/AF1QipOz__N5MR3hALmFf6UIL9FM61On1IAC3E3xSp4X",
    "https://lh5.googleusercontent.com/p/AF1QipNy1aojv60od6z2isJtC7trEKGV1EsBWeyohnGQ",
    "https://lh5.googleusercontent.com/p/AF1QipOOVCSXN_pEoeW67K2pXz67nAOCikJIXMGJyVUN",
    "https://lh5.googleusercontent.com/p/AF1QipPFOQbF-fpwt174U0XOwHJTNI97s77InAckuv5h",
    "https://lh5.googleusercontent.com/p/AF1QipOn3GQkb6zF6PqYY517_SZR3z4FvoNpdU9b6PPb",
    "https://lh5.googleusercontent.com/p/AF1QipOHMTQttFtbMF3O5ONmztgMqtqaR6s4hmi3kdfy",
    "https://lh5.googleusercontent.com/p/AF1QipPXwrcs1rdZ7lxw6yIr-OWTPWE_OykVkZCO4tJN",
    "https://lh5.googleusercontent.com/p/AF1QipPtpELFzWvpwLoxfVzmapur-6shI4u5FlSI-I2a",
    "https://lh5.googleusercontent.com/p/AF1QipO2Fcq2_tzAX61cMXx5a3uZ40MZWflgJsjmdGB2",
    "https://lh5.googleusercontent.com/p/AF1QipNHG6529wqSJ4jJBnmyrkKlBkxY3MzGVqMM4Gl_",
    "https://lh5.googleusercontent.com/p/AF1QipMJvy5OZV9OviMeFwW4e8391EsEwJRMkRWUM76w",
    "https://lh5.googleusercontent.com/p/AF1QipP8kXCGEFBmco1CRzR6rnpQf7FvluISef6wgXvl",
    "https://lh5.googleusercontent.com/p/AF1QipNXSUzPJQI3q1svKFFz7UD5TGfjUq_1ft9I2XQ7",
    "https://lh5.googleusercontent.com/p/AF1QipMRgrPDvFmik5kNsnPN_e48tfsZqKXqpM_xrxSZ",
    "https://lh5.googleusercontent.com/p/AF1QipNiLTZLqlTjSsm-2m3CyaL0GR7OtO3WW5pEc1Cr",
    "https://lh5.googleusercontent.com/p/AF1QipPbQqiNAoAY7XXwUSUny3PFuCKwqpEWHpxtic9y",
    "https://lh5.googleusercontent.com/p/AF1QipP9hGTe6IgAObhV20_uqaXkxGg2tDswOiRp9mXz",
    "https://lh5.googleusercontent.com/p/AF1QipN0VmrHYpvlQ9w_JYWXUANaChFBDCVCOPF0Umak",
)
//
//val listPhotos = mutableListOf(
//    Photos(R.drawable.p_001),
//    Photos(R.drawable.p_002),
//    Photos(R.drawable.p_003),
//    Photos(R.drawable.p_004),
//    Photos(R.drawable.p_005),
//    Photos(R.drawable.p_006),
//    Photos(R.drawable.p_007)
//)

val listReviews = mutableListOf(
    Review(
        name = "Marblik",
        userImg = "https://lh3.googleusercontent.com/a/AATXAJxN4vdrEpgqzDIzJgUd8vSypJBtxh3A1beVjGCs",
        comment = "Absolutely fabulous place. A must. Good stop at the way to Taroudant. Great hospitality, food and other services. Calm and beautiful. Night heaven with stars at no light pollution"
    ),
    Review(
        name = "Ejaz Mansha",
        userImg = "https://lh3.googleusercontent.com/a/AATXAJwyM0-HN8ww5HtTuqVx8OrwyA9auJpp4iDw6AlX",
        comment = "Highly recommend, family business, excellent home cooked food."
    ),
    Review(
        name = "T.Zvicevicius",
        userImg = "https://lh3.googleusercontent.com/a/AATXAJw03o2nSdYD-1Mig66Z2Rchzs-86FlpNintMH93",
        comment = "Great quality/price ratio. Kind and helpful owner speaks English well."
    ),
    Review(
        name = "Daria Madaj",
        userImg = "https://lh3.googleusercontent.com/a-/AOh14GhYBBcErbbZAnYinOSaU_hIdJHc3HMDgRdw17Uh6g",
        comment = "It was hidden place in the middle of nowhere. The map brought us close but not to the exact sestination so dont be surprised. As soon as we got there we were totally impressed about the place in a ugly area. We loved this place and breakfast included. Hosts were very calm and friendly. :) Everything was super clean and kept in a great marroccan vibes! Pool with nice garden was other awesome surprise for us.."
    ),
    Review(
        name = "Jolanta",
        userImg = "https://lh3.googleusercontent.com/a-/AOh14GgCZGWuo6LIu46y7fCmURU7ykScCPYIRUhmV9uwPQ",
        comment = "This was the best quality/price riad on my trip in Morocco. We've paid 20 eur for 1 night. Though, we were in off season so the price could have been lower than on season.\n" +
                "The place was clean, open. Staff very helpfull.\n" +
                "The main minus was a a bit dirty pool. Not too dirty to swim, but not that pleasant.\n" +
                "TIP: to find it just go towards a big tower with neon sign.\n" +
                "P.S. best fresh orange juice I have tasted in Morocco. As administrator said, the region they are in is famous for oranges."
    ),
    Review(
        name = "Rachid ait benaim",
        userImg = "https://lh3.googleusercontent.com/a-/AOh14GjclEtoepvZzgIb0uYT3HxZDOzohZ8Kkg4gHKLsHg",
        comment = "Quiet place in a village, friendly service, delicious meals made with local meals..."
    )
)

val numbers = listOf(
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9
)


fun Activity.toast(msg: String): Toast =
    Toast.makeText(this, msg, Toast.LENGTH_LONG).apply { show() }