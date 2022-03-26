package com.tochukwu.rest.data.remote.dto



import com.google.gson.annotations.SerializedName

data class RestaurantDto(
    @SerializedName("Area")
    val area: String,
    @SerializedName("CuisineSets")
    val cuisineSets: List<CuisineSet>,
    @SerializedName("deliveryFees")
    val deliveryFees: DeliveryFees,
    @SerializedName("Dishes")
    val dishes: List<Any>,
    @SerializedName("MetaData")
    val metaData: MetaData,
    @SerializedName("promotedPlacement")
    val promotedPlacement: PromotedPlacement,
    @SerializedName("RestaurantSets")
    val restaurantSets: List<RestaurantSet>,
    @SerializedName("Restaurants")
    val restaurants: List<Restaurant>,
    @SerializedName("ShortResultText")
    val shortResultText: String,
    @SerializedName("Views")
    val views: List<View>
) {
    data class CuisineSet(
        @SerializedName("Cuisines")
        val cuisines: List<Cuisine>,
        @SerializedName("Id")
        val id: String,
        @SerializedName("Name")
        val name: String,
        @SerializedName("Type")
        val type: String
    ) {
        data class Cuisine(
            @SerializedName("Name")
            val name: String,
            @SerializedName("SeoName")
            val seoName: String
        )
    }

    data class DeliveryFees(
        @SerializedName("restaurants")
        val restaurants: Restaurants
    ) {
        data class Restaurants(
            @SerializedName("100224")
            val x100224: X100224,
            @SerializedName("100378")
            val x100378: X100378,
            @SerializedName("100442")
            val x100442: X100442,
            @SerializedName("101255")
            val x101255: X101255,
            @SerializedName("101386")
            val x101386: X101386,
            @SerializedName("101936")
            val x101936: X101936,
            @SerializedName("102182")
            val x102182: X102182,
            @SerializedName("102239")
            val x102239: X102239,
            @SerializedName("102469")
            val x102469: X102469,
            @SerializedName("102498")
            val x102498: X102498,
            @SerializedName("102571")
            val x102571: X102571,
            @SerializedName("102637")
            val x102637: X102637,
            @SerializedName("102731")
            val x102731: X102731,
            @SerializedName("102733")
            val x102733: X102733,
            @SerializedName("102744")
            val x102744: X102744,
            @SerializedName("102755")
            val x102755: X102755,
            @SerializedName("102936")
            val x102936: X102936,
            @SerializedName("102954")
            val x102954: X102954,
            @SerializedName("102975")
            val x102975: X102975,
            @SerializedName("103797")
            val x103797: X103797,
            @SerializedName("103814")
            val x103814: X103814,
            @SerializedName("104082")
            val x104082: X104082,
            @SerializedName("104099")
            val x104099: X104099,
            @SerializedName("104130")
            val x104130: X104130,
            @SerializedName("104187")
            val x104187: X104187,
            @SerializedName("104193")
            val x104193: X104193,
            @SerializedName("104254")
            val x104254: X104254,
            @SerializedName("104695")
            val x104695: X104695,
            @SerializedName("104822")
            val x104822: X104822,
            @SerializedName("104991")
            val x104991: X104991,
            @SerializedName("105078")
            val x105078: X105078,
            @SerializedName("105352")
            val x105352: X105352,
            @SerializedName("105480")
            val x105480: X105480,
            @SerializedName("105503")
            val x105503: X105503,
            @SerializedName("105709")
            val x105709: X105709,
            @SerializedName("106319")
            val x106319: X106319,
            @SerializedName("106402")
            val x106402: X106402,
            @SerializedName("106434")
            val x106434: X106434,
            @SerializedName("106472")
            val x106472: X106472,
            @SerializedName("106478")
            val x106478: X106478,
            @SerializedName("106839")
            val x106839: X106839,
            @SerializedName("106984")
            val x106984: X106984,
            @SerializedName("107061")
            val x107061: X107061,
            @SerializedName("108200")
            val x108200: X108200,
            @SerializedName("108627")
            val x108627: X108627,
            @SerializedName("108704")
            val x108704: X108704,
            @SerializedName("108899")
            val x108899: X108899,
            @SerializedName("109279")
            val x109279: X109279,
            @SerializedName("109349")
            val x109349: X109349,
            @SerializedName("109453")
            val x109453: X109453,
            @SerializedName("109610")
            val x109610: X109610,
            @SerializedName("109993")
            val x109993: X109993,
            @SerializedName("110384")
            val x110384: X110384,
            @SerializedName("110562")
            val x110562: X110562,
            @SerializedName("110821")
            val x110821: X110821,
            @SerializedName("110905")
            val x110905: X110905,
            @SerializedName("111224")
            val x111224: X111224,
            @SerializedName("111283")
            val x111283: X111283,
            @SerializedName("111911")
            val x111911: X111911,
            @SerializedName("111976")
            val x111976: X111976,
            @SerializedName("112402")
            val x112402: X112402,
            @SerializedName("112434")
            val x112434: X112434,
            @SerializedName("11245")
            val x11245: X11245,
            @SerializedName("112652")
            val x112652: X112652,
            @SerializedName("112803")
            val x112803: X112803,
            @SerializedName("113116")
            val x113116: X113116,
            @SerializedName("113207")
            val x113207: X113207,
            @SerializedName("113668")
            val x113668: X113668,
            @SerializedName("113708")
            val x113708: X113708,
            @SerializedName("113796")
            val x113796: X113796,
            @SerializedName("113811")
            val x113811: X113811,
            @SerializedName("113813")
            val x113813: X113813,
            @SerializedName("113869")
            val x113869: X113869,
            @SerializedName("113922")
            val x113922: X113922,
            @SerializedName("113925")
            val x113925: X113925,
            @SerializedName("114098")
            val x114098: X114098,
            @SerializedName("114111")
            val x114111: X114111,
            @SerializedName("114208")
            val x114208: X114208,
            @SerializedName("114272")
            val x114272: X114272,
            @SerializedName("114295")
            val x114295: X114295,
            @SerializedName("114335")
            val x114335: X114335,
            @SerializedName("114343")
            val x114343: X114343,
            @SerializedName("114347")
            val x114347: X114347,
            @SerializedName("114354")
            val x114354: X114354,
            @SerializedName("114469")
            val x114469: X114469,
            @SerializedName("114476")
            val x114476: X114476,
            @SerializedName("114482")
            val x114482: X114482,
            @SerializedName("114487")
            val x114487: X114487,
            @SerializedName("114489")
            val x114489: X114489,
            @SerializedName("114551")
            val x114551: X114551,
            @SerializedName("114605")
            val x114605: X114605,
            @SerializedName("114797")
            val x114797: X114797,
            @SerializedName("114929")
            val x114929: X114929,
            @SerializedName("114932")
            val x114932: X114932,
            @SerializedName("114934")
            val x114934: X114934,
            @SerializedName("114958")
            val x114958: X114958,
            @SerializedName("114975")
            val x114975: X114975,
            @SerializedName("114978")
            val x114978: X114978,
            @SerializedName("114984")
            val x114984: X114984,
            @SerializedName("114990")
            val x114990: X114990,
            @SerializedName("115121")
            val x115121: X115121,
            @SerializedName("115193")
            val x115193: X115193,
            @SerializedName("115223")
            val x115223: X115223,
            @SerializedName("115226")
            val x115226: X115226,
            @SerializedName("115670")
            val x115670: X115670,
            @SerializedName("115754")
            val x115754: X115754,
            @SerializedName("115757")
            val x115757: X115757,
            @SerializedName("115864")
            val x115864: X115864,
            @SerializedName("115945")
            val x115945: X115945,
            @SerializedName("116001")
            val x116001: X116001,
            @SerializedName("116089")
            val x116089: X116089,
            @SerializedName("116383")
            val x116383: X116383,
            @SerializedName("116707")
            val x116707: X116707,
            @SerializedName("116753")
            val x116753: X116753,
            @SerializedName("116760")
            val x116760: X116760,
            @SerializedName("116968")
            val x116968: X116968,
            @SerializedName("117112")
            val x117112: X117112,
            @SerializedName("117187")
            val x117187: X117187,
            @SerializedName("117195")
            val x117195: X117195,
            @SerializedName("117304")
            val x117304: X117304,
            @SerializedName("117314")
            val x117314: X117314,
            @SerializedName("117319")
            val x117319: X117319,
            @SerializedName("117482")
            val x117482: X117482,
            @SerializedName("117503")
            val x117503: X117503,
            @SerializedName("117534")
            val x117534: X117534,
            @SerializedName("117792")
            val x117792: X117792,
            @SerializedName("118217")
            val x118217: X118217,
            @SerializedName("118478")
            val x118478: X118478,
            @SerializedName("118564")
            val x118564: X118564,
            @SerializedName("118593")
            val x118593: X118593,
            @SerializedName("118598")
            val x118598: X118598,
            @SerializedName("118608")
            val x118608: X118608,
            @SerializedName("118636")
            val x118636: X118636,
            @SerializedName("118688")
            val x118688: X118688,
            @SerializedName("118730")
            val x118730: X118730,
            @SerializedName("118770")
            val x118770: X118770,
            @SerializedName("118861")
            val x118861: X118861,
            @SerializedName("118929")
            val x118929: X118929,
            @SerializedName("119025")
            val x119025: X119025,
            @SerializedName("119076")
            val x119076: X119076,
            @SerializedName("119234")
            val x119234: X119234,
            @SerializedName("119256")
            val x119256: X119256,
            @SerializedName("119287")
            val x119287: X119287,
            @SerializedName("119325")
            val x119325: X119325,
            @SerializedName("119336")
            val x119336: X119336,
            @SerializedName("119346")
            val x119346: X119346,
            @SerializedName("119431")
            val x119431: X119431,
            @SerializedName("119578")
            val x119578: X119578,
            @SerializedName("119616")
            val x119616: X119616,
            @SerializedName("119632")
            val x119632: X119632,
            @SerializedName("119645")
            val x119645: X119645,
            @SerializedName("119935")
            val x119935: X119935,
            @SerializedName("119937")
            val x119937: X119937,
            @SerializedName("120063")
            val x120063: X120063,
            @SerializedName("120099")
            val x120099: X120099,
            @SerializedName("120127")
            val x120127: X120127,
            @SerializedName("120143")
            val x120143: X120143,
            @SerializedName("120154")
            val x120154: X120154,
            @SerializedName("120171")
            val x120171: X120171,
            @SerializedName("120206")
            val x120206: X120206,
            @SerializedName("120236")
            val x120236: X120236,
            @SerializedName("120246")
            val x120246: X120246,
            @SerializedName("120248")
            val x120248: X120248,
            @SerializedName("120258")
            val x120258: X120258,
            @SerializedName("120262")
            val x120262: X120262,
            @SerializedName("120341")
            val x120341: X120341,
            @SerializedName("120513")
            val x120513: X120513,
            @SerializedName("120576")
            val x120576: X120576,
            @SerializedName("120611")
            val x120611: X120611,
            @SerializedName("120706")
            val x120706: X120706,
            @SerializedName("120820")
            val x120820: X120820,
            @SerializedName("120861")
            val x120861: X120861,
            @SerializedName("120874")
            val x120874: X120874,
            @SerializedName("120926")
            val x120926: X120926,
            @SerializedName("121088")
            val x121088: X121088,
            @SerializedName("121097")
            val x121097: X121097,
            @SerializedName("121104")
            val x121104: X121104,
            @SerializedName("121208")
            val x121208: X121208,
            @SerializedName("121213")
            val x121213: X121213,
            @SerializedName("121217")
            val x121217: X121217,
            @SerializedName("121322")
            val x121322: X121322,
            @SerializedName("121374")
            val x121374: X121374,
            @SerializedName("121698")
            val x121698: X121698,
            @SerializedName("12171")
            val x12171: X12171,
            @SerializedName("121714")
            val x121714: X121714,
            @SerializedName("121759")
            val x121759: X121759,
            @SerializedName("121862")
            val x121862: X121862,
            @SerializedName("122029")
            val x122029: X122029,
            @SerializedName("122065")
            val x122065: X122065,
            @SerializedName("122253")
            val x122253: X122253,
            @SerializedName("122271")
            val x122271: X122271,
            @SerializedName("122272")
            val x122272: X122272,
            @SerializedName("122375")
            val x122375: X122375,
            @SerializedName("122384")
            val x122384: X122384,
            @SerializedName("122476")
            val x122476: X122476,
            @SerializedName("122521")
            val x122521: X122521,
            @SerializedName("122698")
            val x122698: X122698,
            @SerializedName("122860")
            val x122860: X122860,
            @SerializedName("122865")
            val x122865: X122865,
            @SerializedName("123005")
            val x123005: X123005,
            @SerializedName("123049")
            val x123049: X123049,
            @SerializedName("123073")
            val x123073: X123073,
            @SerializedName("123086")
            val x123086: X123086,
            @SerializedName("123247")
            val x123247: X123247,
            @SerializedName("123515")
            val x123515: X123515,
            @SerializedName("123534")
            val x123534: X123534,
            @SerializedName("123604")
            val x123604: X123604,
            @SerializedName("123637")
            val x123637: X123637,
            @SerializedName("123746")
            val x123746: X123746,
            @SerializedName("123772")
            val x123772: X123772,
            @SerializedName("123891")
            val x123891: X123891,
            @SerializedName("123893")
            val x123893: X123893,
            @SerializedName("123919")
            val x123919: X123919,
            @SerializedName("123989")
            val x123989: X123989,
            @SerializedName("123996")
            val x123996: X123996,
            @SerializedName("124031")
            val x124031: X124031,
            @SerializedName("124389")
            val x124389: X124389,
            @SerializedName("124556")
            val x124556: X124556,
            @SerializedName("124661")
            val x124661: X124661,
            @SerializedName("124663")
            val x124663: X124663,
            @SerializedName("125246")
            val x125246: X125246,
            @SerializedName("125458")
            val x125458: X125458,
            @SerializedName("125505")
            val x125505: X125505,
            @SerializedName("125743")
            val x125743: X125743,
            @SerializedName("125768")
            val x125768: X125768,
            @SerializedName("125792")
            val x125792: X125792,
            @SerializedName("125983")
            val x125983: X125983,
            @SerializedName("12603")
            val x12603: X12603,
            @SerializedName("126122")
            val x126122: X126122,
            @SerializedName("126534")
            val x126534: X126534,
            @SerializedName("126538")
            val x126538: X126538,
            @SerializedName("126559")
            val x126559: X126559,
            @SerializedName("126699")
            val x126699: X126699,
            @SerializedName("126735")
            val x126735: X126735,
            @SerializedName("126793")
            val x126793: X126793,
            @SerializedName("126848")
            val x126848: X126848,
            @SerializedName("126861")
            val x126861: X126861,
            @SerializedName("127012")
            val x127012: X127012,
            @SerializedName("127244")
            val x127244: X127244,
            @SerializedName("127247")
            val x127247: X127247,
            @SerializedName("127258")
            val x127258: X127258,
            @SerializedName("127518")
            val x127518: X127518,
            @SerializedName("127538")
            val x127538: X127538,
            @SerializedName("127649")
            val x127649: X127649,
            @SerializedName("127683")
            val x127683: X127683,
            @SerializedName("127710")
            val x127710: X127710,
            @SerializedName("127779")
            val x127779: X127779,
            @SerializedName("127831")
            val x127831: X127831,
            @SerializedName("128091")
            val x128091: X128091,
            @SerializedName("128103")
            val x128103: X128103,
            @SerializedName("128108")
            val x128108: X128108,
            @SerializedName("128126")
            val x128126: X128126,
            @SerializedName("128164")
            val x128164: X128164,
            @SerializedName("128217")
            val x128217: X128217,
            @SerializedName("128248")
            val x128248: X128248,
            @SerializedName("128297")
            val x128297: X128297,
            @SerializedName("128361")
            val x128361: X128361,
            @SerializedName("128376")
            val x128376: X128376,
            @SerializedName("128416")
            val x128416: X128416,
            @SerializedName("128911")
            val x128911: X128911,
            @SerializedName("128929")
            val x128929: X128929,
            @SerializedName("128943")
            val x128943: X128943,
            @SerializedName("129517")
            val x129517: X129517,
            @SerializedName("129649")
            val x129649: X129649,
            @SerializedName("129757")
            val x129757: X129757,
            @SerializedName("129929")
            val x129929: X129929,
            @SerializedName("129948")
            val x129948: X129948,
            @SerializedName("129955")
            val x129955: X129955,
            @SerializedName("129960")
            val x129960: X129960,
            @SerializedName("129975")
            val x129975: X129975,
            @SerializedName("130181")
            val x130181: X130181,
            @SerializedName("130183")
            val x130183: X130183,
            @SerializedName("130188")
            val x130188: X130188,
            @SerializedName("130207")
            val x130207: X130207,
            @SerializedName("130216")
            val x130216: X130216,
            @SerializedName("130434")
            val x130434: X130434,
            @SerializedName("130446")
            val x130446: X130446,
            @SerializedName("130482")
            val x130482: X130482,
            @SerializedName("130542")
            val x130542: X130542,
            @SerializedName("130620")
            val x130620: X130620,
            @SerializedName("130624")
            val x130624: X130624,
            @SerializedName("130740")
            val x130740: X130740,
            @SerializedName("130793")
            val x130793: X130793,
            @SerializedName("130889")
            val x130889: X130889,
            @SerializedName("130895")
            val x130895: X130895,
            @SerializedName("130916")
            val x130916: X130916,
            @SerializedName("130937")
            val x130937: X130937,
            @SerializedName("130938")
            val x130938: X130938,
            @SerializedName("130948")
            val x130948: X130948,
            @SerializedName("130955")
            val x130955: X130955,
            @SerializedName("130989")
            val x130989: X130989,
            @SerializedName("131009")
            val x131009: X131009,
            @SerializedName("131041")
            val x131041: X131041,
            @SerializedName("131067")
            val x131067: X131067,
            @SerializedName("131084")
            val x131084: X131084,
            @SerializedName("131104")
            val x131104: X131104,
            @SerializedName("131251")
            val x131251: X131251,
            @SerializedName("131277")
            val x131277: X131277,
            @SerializedName("131293")
            val x131293: X131293,
            @SerializedName("131320")
            val x131320: X131320,
            @SerializedName("131333")
            val x131333: X131333,
            @SerializedName("131488")
            val x131488: X131488,
            @SerializedName("131516")
            val x131516: X131516,
            @SerializedName("131598")
            val x131598: X131598,
            @SerializedName("131713")
            val x131713: X131713,
            @SerializedName("131715")
            val x131715: X131715,
            @SerializedName("131720")
            val x131720: X131720,
            @SerializedName("131764")
            val x131764: X131764,
            @SerializedName("131869")
            val x131869: X131869,
            @SerializedName("131974")
            val x131974: X131974,
            @SerializedName("132250")
            val x132250: X132250,
            @SerializedName("132430")
            val x132430: X132430,
            @SerializedName("132452")
            val x132452: X132452,
            @SerializedName("132453")
            val x132453: X132453,
            @SerializedName("132455")
            val x132455: X132455,
            @SerializedName("132466")
            val x132466: X132466,
            @SerializedName("132468")
            val x132468: X132468,
            @SerializedName("132493")
            val x132493: X132493,
            @SerializedName("132562")
            val x132562: X132562,
            @SerializedName("132622")
            val x132622: X132622,
            @SerializedName("132652")
            val x132652: X132652,
            @SerializedName("132685")
            val x132685: X132685,
            @SerializedName("132736")
            val x132736: X132736,
            @SerializedName("132772")
            val x132772: X132772,
            @SerializedName("132790")
            val x132790: X132790,
            @SerializedName("132952")
            val x132952: X132952,
            @SerializedName("133030")
            val x133030: X133030,
            @SerializedName("133102")
            val x133102: X133102,
            @SerializedName("133109")
            val x133109: X133109,
            @SerializedName("133414")
            val x133414: X133414,
            @SerializedName("133418")
            val x133418: X133418,
            @SerializedName("133422")
            val x133422: X133422,
            @SerializedName("133426")
            val x133426: X133426,
            @SerializedName("133429")
            val x133429: X133429,
            @SerializedName("133440")
            val x133440: X133440,
            @SerializedName("133443")
            val x133443: X133443,
            @SerializedName("133444")
            val x133444: X133444,
            @SerializedName("133454")
            val x133454: X133454,
            @SerializedName("133456")
            val x133456: X133456,
            @SerializedName("133694")
            val x133694: X133694,
            @SerializedName("133740")
            val x133740: X133740,
            @SerializedName("133755")
            val x133755: X133755,
            @SerializedName("133812")
            val x133812: X133812,
            @SerializedName("133815")
            val x133815: X133815,
            @SerializedName("133899")
            val x133899: X133899,
            @SerializedName("134018")
            val x134018: X134018,
            @SerializedName("134042")
            val x134042: X134042,
            @SerializedName("134055")
            val x134055: X134055,
            @SerializedName("134063")
            val x134063: X134063,
            @SerializedName("134132")
            val x134132: X134132,
            @SerializedName("134252")
            val x134252: X134252,
            @SerializedName("134275")
            val x134275: X134275,
            @SerializedName("134317")
            val x134317: X134317,
            @SerializedName("134392")
            val x134392: X134392,
            @SerializedName("134625")
            val x134625: X134625,
            @SerializedName("134638")
            val x134638: X134638,
            @SerializedName("134643")
            val x134643: X134643,
            @SerializedName("134797")
            val x134797: X134797,
            @SerializedName("134809")
            val x134809: X134809,
            @SerializedName("134849")
            val x134849: X134849,
            @SerializedName("134915")
            val x134915: X134915,
            @SerializedName("134974")
            val x134974: X134974,
            @SerializedName("134992")
            val x134992: X134992,
            @SerializedName("135112")
            val x135112: X135112,
            @SerializedName("135244")
            val x135244: X135244,
            @SerializedName("135259")
            val x135259: X135259,
            @SerializedName("135304")
            val x135304: X135304,
            @SerializedName("135514")
            val x135514: X135514,
            @SerializedName("135619")
            val x135619: X135619,
            @SerializedName("135664")
            val x135664: X135664,
            @SerializedName("135721")
            val x135721: X135721,
            @SerializedName("135910")
            val x135910: X135910,
            @SerializedName("135917")
            val x135917: X135917,
            @SerializedName("135920")
            val x135920: X135920,
            @SerializedName("135940")
            val x135940: X135940,
            @SerializedName("135944")
            val x135944: X135944,
            @SerializedName("135945")
            val x135945: X135945,
            @SerializedName("135963")
            val x135963: X135963,
            @SerializedName("136158")
            val x136158: X136158,
            @SerializedName("136296")
            val x136296: X136296,
            @SerializedName("136573")
            val x136573: X136573,
            @SerializedName("136616")
            val x136616: X136616,
            @SerializedName("136659")
            val x136659: X136659,
            @SerializedName("136890")
            val x136890: X136890,
            @SerializedName("136930")
            val x136930: X136930,
            @SerializedName("136937")
            val x136937: X136937,
            @SerializedName("137033")
            val x137033: X137033,
            @SerializedName("137119")
            val x137119: X137119,
            @SerializedName("137123")
            val x137123: X137123,
            @SerializedName("137149")
            val x137149: X137149,
            @SerializedName("137214")
            val x137214: X137214,
            @SerializedName("137274")
            val x137274: X137274,
            @SerializedName("137357")
            val x137357: X137357,
            @SerializedName("137831")
            val x137831: X137831,
            @SerializedName("137873")
            val x137873: X137873,
            @SerializedName("138101")
            val x138101: X138101,
            @SerializedName("138143")
            val x138143: X138143,
            @SerializedName("138251")
            val x138251: X138251,
            @SerializedName("138465")
            val x138465: X138465,
            @SerializedName("138503")
            val x138503: X138503,
            @SerializedName("138584")
            val x138584: X138584,
            @SerializedName("138782")
            val x138782: X138782,
            @SerializedName("138960")
            val x138960: X138960,
            @SerializedName("139067")
            val x139067: X139067,
            @SerializedName("139076")
            val x139076: X139076,
            @SerializedName("139249")
            val x139249: X139249,
            @SerializedName("139304")
            val x139304: X139304,
            @SerializedName("139335")
            val x139335: X139335,
            @SerializedName("139479")
            val x139479: X139479,
            @SerializedName("139720")
            val x139720: X139720,
            @SerializedName("139736")
            val x139736: X139736,
            @SerializedName("139855")
            val x139855: X139855,
            @SerializedName("139905")
            val x139905: X139905,
            @SerializedName("139910")
            val x139910: X139910,
            @SerializedName("139930")
            val x139930: X139930,
            @SerializedName("140098")
            val x140098: X140098,
            @SerializedName("140322")
            val x140322: X140322,
            @SerializedName("140344")
            val x140344: X140344,
            @SerializedName("140391")
            val x140391: X140391,
            @SerializedName("14043")
            val x14043: X14043,
            @SerializedName("140780")
            val x140780: X140780,
            @SerializedName("140805")
            val x140805: X140805,
            @SerializedName("140871")
            val x140871: X140871,
            @SerializedName("140905")
            val x140905: X140905,
            @SerializedName("140936")
            val x140936: X140936,
            @SerializedName("141113")
            val x141113: X141113,
            @SerializedName("141237")
            val x141237: X141237,
            @SerializedName("141243")
            val x141243: X141243,
            @SerializedName("141337")
            val x141337: X141337,
            @SerializedName("141359")
            val x141359: X141359,
            @SerializedName("141477")
            val x141477: X141477,
            @SerializedName("141580")
            val x141580: X141580,
            @SerializedName("141663")
            val x141663: X141663,
            @SerializedName("141666")
            val x141666: X141666,
            @SerializedName("141674")
            val x141674: X141674,
            @SerializedName("141683")
            val x141683: X141683,
            @SerializedName("141684")
            val x141684: X141684,
            @SerializedName("141776")
            val x141776: X141776,
            @SerializedName("14273")
            val x14273: X14273,
            @SerializedName("143083")
            val x143083: X143083,
            @SerializedName("143156")
            val x143156: X143156,
            @SerializedName("143167")
            val x143167: X143167,
            @SerializedName("143225")
            val x143225: X143225,
            @SerializedName("143350")
            val x143350: X143350,
            @SerializedName("143424")
            val x143424: X143424,
            @SerializedName("143490")
            val x143490: X143490,
            @SerializedName("143534")
            val x143534: X143534,
            @SerializedName("143632")
            val x143632: X143632,
            @SerializedName("143700")
            val x143700: X143700,
            @SerializedName("143911")
            val x143911: X143911,
            @SerializedName("144001")
            val x144001: X144001,
            @SerializedName("144017")
            val x144017: X144017,
            @SerializedName("144050")
            val x144050: X144050,
            @SerializedName("144059")
            val x144059: X144059,
            @SerializedName("144111")
            val x144111: X144111,
            @SerializedName("144289")
            val x144289: X144289,
            @SerializedName("144291")
            val x144291: X144291,
            @SerializedName("144416")
            val x144416: X144416,
            @SerializedName("144434")
            val x144434: X144434,
            @SerializedName("144470")
            val x144470: X144470,
            @SerializedName("144550")
            val x144550: X144550,
            @SerializedName("144557")
            val x144557: X144557,
            @SerializedName("144742")
            val x144742: X144742,
            @SerializedName("144747")
            val x144747: X144747,
            @SerializedName("144764")
            val x144764: X144764,
            @SerializedName("144765")
            val x144765: X144765,
            @SerializedName("144769")
            val x144769: X144769,
            @SerializedName("144773")
            val x144773: X144773,
            @SerializedName("144983")
            val x144983: X144983,
            @SerializedName("145043")
            val x145043: X145043,
            @SerializedName("145044")
            val x145044: X145044,
            @SerializedName("145104")
            val x145104: X145104,
            @SerializedName("145203")
            val x145203: X145203,
            @SerializedName("145345")
            val x145345: X145345,
            @SerializedName("145352")
            val x145352: X145352,
            @SerializedName("145354")
            val x145354: X145354,
            @SerializedName("145359")
            val x145359: X145359,
            @SerializedName("145648")
            val x145648: X145648,
            @SerializedName("145653")
            val x145653: X145653,
            @SerializedName("145654")
            val x145654: X145654,
            @SerializedName("145656")
            val x145656: X145656,
            @SerializedName("145657")
            val x145657: X145657,
            @SerializedName("145761")
            val x145761: X145761,
            @SerializedName("145847")
            val x145847: X145847,
            @SerializedName("145928")
            val x145928: X145928,
            @SerializedName("146114")
            val x146114: X146114,
            @SerializedName("146281")
            val x146281: X146281,
            @SerializedName("146550")
            val x146550: X146550,
            @SerializedName("146686")
            val x146686: X146686,
            @SerializedName("146716")
            val x146716: X146716,
            @SerializedName("146759")
            val x146759: X146759,
            @SerializedName("146763")
            val x146763: X146763,
            @SerializedName("146766")
            val x146766: X146766,
            @SerializedName("146770")
            val x146770: X146770,
            @SerializedName("146794")
            val x146794: X146794,
            @SerializedName("146797")
            val x146797: X146797,
            @SerializedName("146804")
            val x146804: X146804,
            @SerializedName("146822")
            val x146822: X146822,
            @SerializedName("146894")
            val x146894: X146894,
            @SerializedName("147022")
            val x147022: X147022,
            @SerializedName("147043")
            val x147043: X147043,
            @SerializedName("147061")
            val x147061: X147061,
            @SerializedName("147177")
            val x147177: X147177,
            @SerializedName("147277")
            val x147277: X147277,
            @SerializedName("147405")
            val x147405: X147405,
            @SerializedName("147406")
            val x147406: X147406,
            @SerializedName("147440")
            val x147440: X147440,
            @SerializedName("147503")
            val x147503: X147503,
            @SerializedName("147518")
            val x147518: X147518,
            @SerializedName("147553")
            val x147553: X147553,
            @SerializedName("147560")
            val x147560: X147560,
            @SerializedName("147668")
            val x147668: X147668,
            @SerializedName("147769")
            val x147769: X147769,
            @SerializedName("147775")
            val x147775: X147775,
            @SerializedName("147782")
            val x147782: X147782,
            @SerializedName("147789")
            val x147789: X147789,
            @SerializedName("147800")
            val x147800: X147800,
            @SerializedName("147809")
            val x147809: X147809,
            @SerializedName("147820")
            val x147820: X147820,
            @SerializedName("147822")
            val x147822: X147822,
            @SerializedName("147826")
            val x147826: X147826,
            @SerializedName("147828")
            val x147828: X147828,
            @SerializedName("147838")
            val x147838: X147838,
            @SerializedName("147842")
            val x147842: X147842,
            @SerializedName("147844")
            val x147844: X147844,
            @SerializedName("147846")
            val x147846: X147846,
            @SerializedName("147848")
            val x147848: X147848,
            @SerializedName("147865")
            val x147865: X147865,
            @SerializedName("147911")
            val x147911: X147911,
            @SerializedName("147912")
            val x147912: X147912,
            @SerializedName("147919")
            val x147919: X147919,
            @SerializedName("147926")
            val x147926: X147926,
            @SerializedName("147934")
            val x147934: X147934,
            @SerializedName("147939")
            val x147939: X147939,
            @SerializedName("147941")
            val x147941: X147941,
            @SerializedName("147944")
            val x147944: X147944,
            @SerializedName("147979")
            val x147979: X147979,
            @SerializedName("147994")
            val x147994: X147994,
            @SerializedName("148215")
            val x148215: X148215,
            @SerializedName("148312")
            val x148312: X148312,
            @SerializedName("148317")
            val x148317: X148317,
            @SerializedName("148319")
            val x148319: X148319,
            @SerializedName("148418")
            val x148418: X148418,
            @SerializedName("148440")
            val x148440: X148440,
            @SerializedName("148483")
            val x148483: X148483,
            @SerializedName("148489")
            val x148489: X148489,
            @SerializedName("148499")
            val x148499: X148499,
            @SerializedName("148501")
            val x148501: X148501,
            @SerializedName("148509")
            val x148509: X148509,
            @SerializedName("148515")
            val x148515: X148515,
            @SerializedName("148524")
            val x148524: X148524,
            @SerializedName("148529")
            val x148529: X148529,
            @SerializedName("148541")
            val x148541: X148541,
            @SerializedName("148542")
            val x148542: X148542,
            @SerializedName("148553")
            val x148553: X148553,
            @SerializedName("148601")
            val x148601: X148601,
            @SerializedName("148622")
            val x148622: X148622,
            @SerializedName("148626")
            val x148626: X148626,
            @SerializedName("148879")
            val x148879: X148879,
            @SerializedName("148953")
            val x148953: X148953,
            @SerializedName("149119")
            val x149119: X149119,
            @SerializedName("149141")
            val x149141: X149141,
            @SerializedName("149145")
            val x149145: X149145,
            @SerializedName("149184")
            val x149184: X149184,
            @SerializedName("149186")
            val x149186: X149186,
            @SerializedName("149327")
            val x149327: X149327,
            @SerializedName("149330")
            val x149330: X149330,
            @SerializedName("149331")
            val x149331: X149331,
            @SerializedName("149346")
            val x149346: X149346,
            @SerializedName("149347")
            val x149347: X149347,
            @SerializedName("149403")
            val x149403: X149403,
            @SerializedName("149441")
            val x149441: X149441,
            @SerializedName("149443")
            val x149443: X149443,
            @SerializedName("149445")
            val x149445: X149445,
            @SerializedName("149447")
            val x149447: X149447,
            @SerializedName("149450")
            val x149450: X149450,
            @SerializedName("149459")
            val x149459: X149459,
            @SerializedName("149466")
            val x149466: X149466,
            @SerializedName("149478")
            val x149478: X149478,
            @SerializedName("149498")
            val x149498: X149498,
            @SerializedName("149501")
            val x149501: X149501,
            @SerializedName("149584")
            val x149584: X149584,
            @SerializedName("149623")
            val x149623: X149623,
            @SerializedName("149637")
            val x149637: X149637,
            @SerializedName("149714")
            val x149714: X149714,
            @SerializedName("149728")
            val x149728: X149728,
            @SerializedName("149788")
            val x149788: X149788,
            @SerializedName("14997")
            val x14997: X14997,
            @SerializedName("150102")
            val x150102: X150102,
            @SerializedName("150103")
            val x150103: X150103,
            @SerializedName("150107")
            val x150107: X150107,
            @SerializedName("150150")
            val x150150: X150150,
            @SerializedName("150152")
            val x150152: X150152,
            @SerializedName("150193")
            val x150193: X150193,
            @SerializedName("150223")
            val x150223: X150223,
            @SerializedName("150279")
            val x150279: X150279,
            @SerializedName("150341")
            val x150341: X150341,
            @SerializedName("150509")
            val x150509: X150509,
            @SerializedName("150513")
            val x150513: X150513,
            @SerializedName("150531")
            val x150531: X150531,
            @SerializedName("150589")
            val x150589: X150589,
            @SerializedName("150601")
            val x150601: X150601,
            @SerializedName("150720")
            val x150720: X150720,
            @SerializedName("150737")
            val x150737: X150737,
            @SerializedName("150740")
            val x150740: X150740,
            @SerializedName("150779")
            val x150779: X150779,
            @SerializedName("150837")
            val x150837: X150837,
            @SerializedName("150925")
            val x150925: X150925,
            @SerializedName("150927")
            val x150927: X150927,
            @SerializedName("151031")
            val x151031: X151031,
            @SerializedName("151065")
            val x151065: X151065,
            @SerializedName("151098")
            val x151098: X151098,
            @SerializedName("151099")
            val x151099: X151099,
            @SerializedName("151126")
            val x151126: X151126,
            @SerializedName("151150")
            val x151150: X151150,
            @SerializedName("151185")
            val x151185: X151185,
            @SerializedName("151187")
            val x151187: X151187,
            @SerializedName("151252")
            val x151252: X151252,
            @SerializedName("151327")
            val x151327: X151327,
            @SerializedName("151378")
            val x151378: X151378,
            @SerializedName("151407")
            val x151407: X151407,
            @SerializedName("151426")
            val x151426: X151426,
            @SerializedName("151462")
            val x151462: X151462,
            @SerializedName("151466")
            val x151466: X151466,
            @SerializedName("151553")
            val x151553: X151553,
            @SerializedName("151661")
            val x151661: X151661,
            @SerializedName("151756")
            val x151756: X151756,
            @SerializedName("151804")
            val x151804: X151804,
            @SerializedName("151820")
            val x151820: X151820,
            @SerializedName("151832")
            val x151832: X151832,
            @SerializedName("151843")
            val x151843: X151843,
            @SerializedName("151913")
            val x151913: X151913,
            @SerializedName("151947")
            val x151947: X151947,
            @SerializedName("151967")
            val x151967: X151967,
            @SerializedName("152026")
            val x152026: X152026,
            @SerializedName("152039")
            val x152039: X152039,
            @SerializedName("152087")
            val x152087: X152087,
            @SerializedName("152098")
            val x152098: X152098,
            @SerializedName("152123")
            val x152123: X152123,
            @SerializedName("152128")
            val x152128: X152128,
            @SerializedName("152258")
            val x152258: X152258,
            @SerializedName("152311")
            val x152311: X152311,
            @SerializedName("152415")
            val x152415: X152415,
            @SerializedName("152612")
            val x152612: X152612,
            @SerializedName("152781")
            val x152781: X152781,
            @SerializedName("152796")
            val x152796: X152796,
            @SerializedName("152823")
            val x152823: X152823,
            @SerializedName("153036")
            val x153036: X153036,
            @SerializedName("153041")
            val x153041: X153041,
            @SerializedName("153083")
            val x153083: X153083,
            @SerializedName("153142")
            val x153142: X153142,
            @SerializedName("153197")
            val x153197: X153197,
            @SerializedName("153299")
            val x153299: X153299,
            @SerializedName("153329")
            val x153329: X153329,
            @SerializedName("153335")
            val x153335: X153335,
            @SerializedName("153340")
            val x153340: X153340,
            @SerializedName("153357")
            val x153357: X153357,
            @SerializedName("153395")
            val x153395: X153395,
            @SerializedName("153420")
            val x153420: X153420,
            @SerializedName("153424")
            val x153424: X153424,
            @SerializedName("153426")
            val x153426: X153426,
            @SerializedName("153428")
            val x153428: X153428,
            @SerializedName("153438")
            val x153438: X153438,
            @SerializedName("153440")
            val x153440: X153440,
            @SerializedName("153470")
            val x153470: X153470,
            @SerializedName("153484")
            val x153484: X153484,
            @SerializedName("153639")
            val x153639: X153639,
            @SerializedName("153641")
            val x153641: X153641,
            @SerializedName("153725")
            val x153725: X153725,
            @SerializedName("153738")
            val x153738: X153738,
            @SerializedName("153755")
            val x153755: X153755,
            @SerializedName("153783")
            val x153783: X153783,
            @SerializedName("153802")
            val x153802: X153802,
            @SerializedName("153849")
            val x153849: X153849,
            @SerializedName("153928")
            val x153928: X153928,
            @SerializedName("153937")
            val x153937: X153937,
            @SerializedName("153940")
            val x153940: X153940,
            @SerializedName("153975")
            val x153975: X153975,
            @SerializedName("154092")
            val x154092: X154092,
            @SerializedName("154099")
            val x154099: X154099,
            @SerializedName("154113")
            val x154113: X154113,
            @SerializedName("154130")
            val x154130: X154130,
            @SerializedName("154150")
            val x154150: X154150,
            @SerializedName("154166")
            val x154166: X154166,
            @SerializedName("154184")
            val x154184: X154184,
            @SerializedName("154192")
            val x154192: X154192,
            @SerializedName("154202")
            val x154202: X154202,
            @SerializedName("154251")
            val x154251: X154251,
            @SerializedName("154262")
            val x154262: X154262,
            @SerializedName("154267")
            val x154267: X154267,
            @SerializedName("154345")
            val x154345: X154345,
            @SerializedName("154384")
            val x154384: X154384,
            @SerializedName("154421")
            val x154421: X154421,
            @SerializedName("154658")
            val x154658: X154658,
            @SerializedName("154686")
            val x154686: X154686,
            @SerializedName("154759")
            val x154759: X154759,
            @SerializedName("154794")
            val x154794: X154794,
            @SerializedName("154804")
            val x154804: X154804,
            @SerializedName("154818")
            val x154818: X154818,
            @SerializedName("154835")
            val x154835: X154835,
            @SerializedName("154837")
            val x154837: X154837,
            @SerializedName("154897")
            val x154897: X154897,
            @SerializedName("154904")
            val x154904: X154904,
            @SerializedName("154905")
            val x154905: X154905,
            @SerializedName("154910")
            val x154910: X154910,
            @SerializedName("154981")
            val x154981: X154981,
            @SerializedName("155091")
            val x155091: X155091,
            @SerializedName("155135")
            val x155135: X155135,
            @SerializedName("155162")
            val x155162: X155162,
            @SerializedName("155198")
            val x155198: X155198,
            @SerializedName("155290")
            val x155290: X155290,
            @SerializedName("155377")
            val x155377: X155377,
            @SerializedName("155403")
            val x155403: X155403,
            @SerializedName("155465")
            val x155465: X155465,
            @SerializedName("155469")
            val x155469: X155469,
            @SerializedName("155470")
            val x155470: X155470,
            @SerializedName("155491")
            val x155491: X155491,
            @SerializedName("155495")
            val x155495: X155495,
            @SerializedName("155504")
            val x155504: X155504,
            @SerializedName("155510")
            val x155510: X155510,
            @SerializedName("155526")
            val x155526: X155526,
            @SerializedName("155609")
            val x155609: X155609,
            @SerializedName("155633")
            val x155633: X155633,
            @SerializedName("155682")
            val x155682: X155682,
            @SerializedName("155769")
            val x155769: X155769,
            @SerializedName("155817")
            val x155817: X155817,
            @SerializedName("155826")
            val x155826: X155826,
            @SerializedName("155892")
            val x155892: X155892,
            @SerializedName("156049")
            val x156049: X156049,
            @SerializedName("156052")
            val x156052: X156052,
            @SerializedName("156166")
            val x156166: X156166,
            @SerializedName("156214")
            val x156214: X156214,
            @SerializedName("156222")
            val x156222: X156222,
            @SerializedName("156240")
            val x156240: X156240,
            @SerializedName("156271")
            val x156271: X156271,
            @SerializedName("156277")
            val x156277: X156277,
            @SerializedName("156285")
            val x156285: X156285,
            @SerializedName("156307")
            val x156307: X156307,
            @SerializedName("156370")
            val x156370: X156370,
            @SerializedName("156399")
            val x156399: X156399,
            @SerializedName("156430")
            val x156430: X156430,
            @SerializedName("156463")
            val x156463: X156463,
            @SerializedName("156465")
            val x156465: X156465,
            @SerializedName("156493")
            val x156493: X156493,
            @SerializedName("156541")
            val x156541: X156541,
            @SerializedName("156551")
            val x156551: X156551,
            @SerializedName("156669")
            val x156669: X156669,
            @SerializedName("156672")
            val x156672: X156672,
            @SerializedName("156674")
            val x156674: X156674,
            @SerializedName("156731")
            val x156731: X156731,
            @SerializedName("156732")
            val x156732: X156732,
            @SerializedName("156794")
            val x156794: X156794,
            @SerializedName("156848")
            val x156848: X156848,
            @SerializedName("156850")
            val x156850: X156850,
            @SerializedName("156881")
            val x156881: X156881,
            @SerializedName("156899")
            val x156899: X156899,
            @SerializedName("156902")
            val x156902: X156902,
            @SerializedName("156914")
            val x156914: X156914,
            @SerializedName("156957")
            val x156957: X156957,
            @SerializedName("156974")
            val x156974: X156974,
            @SerializedName("156975")
            val x156975: X156975,
            @SerializedName("157045")
            val x157045: X157045,
            @SerializedName("157047")
            val x157047: X157047,
            @SerializedName("157048")
            val x157048: X157048,
            @SerializedName("157065")
            val x157065: X157065,
            @SerializedName("157072")
            val x157072: X157072,
            @SerializedName("157075")
            val x157075: X157075,
            @SerializedName("157238")
            val x157238: X157238,
            @SerializedName("157252")
            val x157252: X157252,
            @SerializedName("157282")
            val x157282: X157282,
            @SerializedName("157373")
            val x157373: X157373,
            @SerializedName("157388")
            val x157388: X157388,
            @SerializedName("157399")
            val x157399: X157399,
            @SerializedName("157415")
            val x157415: X157415,
            @SerializedName("157432")
            val x157432: X157432,
            @SerializedName("157434")
            val x157434: X157434,
            @SerializedName("157490")
            val x157490: X157490,
            @SerializedName("157493")
            val x157493: X157493,
            @SerializedName("157497")
            val x157497: X157497,
            @SerializedName("157510")
            val x157510: X157510,
            @SerializedName("157519")
            val x157519: X157519,
            @SerializedName("157793")
            val x157793: X157793,
            @SerializedName("157846")
            val x157846: X157846,
            @SerializedName("157854")
            val x157854: X157854,
            @SerializedName("157859")
            val x157859: X157859,
            @SerializedName("157876")
            val x157876: X157876,
            @SerializedName("157944")
            val x157944: X157944,
            @SerializedName("157960")
            val x157960: X157960,
            @SerializedName("158035")
            val x158035: X158035,
            @SerializedName("158118")
            val x158118: X158118,
            @SerializedName("158162")
            val x158162: X158162,
            @SerializedName("158279")
            val x158279: X158279,
            @SerializedName("158355")
            val x158355: X158355,
            @SerializedName("158365")
            val x158365: X158365,
            @SerializedName("158414")
            val x158414: X158414,
            @SerializedName("158474")
            val x158474: X158474,
            @SerializedName("158541")
            val x158541: X158541,
            @SerializedName("158542")
            val x158542: X158542,
            @SerializedName("158619")
            val x158619: X158619,
            @SerializedName("158636")
            val x158636: X158636,
            @SerializedName("158784")
            val x158784: X158784,
            @SerializedName("158807")
            val x158807: X158807,
            @SerializedName("158808")
            val x158808: X158808,
            @SerializedName("158810")
            val x158810: X158810,
            @SerializedName("158812")
            val x158812: X158812,
            @SerializedName("158871")
            val x158871: X158871,
            @SerializedName("158877")
            val x158877: X158877,
            @SerializedName("158882")
            val x158882: X158882,
            @SerializedName("158888")
            val x158888: X158888,
            @SerializedName("158920")
            val x158920: X158920,
            @SerializedName("158940")
            val x158940: X158940,
            @SerializedName("158974")
            val x158974: X158974,
            @SerializedName("158980")
            val x158980: X158980,
            @SerializedName("159037")
            val x159037: X159037,
            @SerializedName("159080")
            val x159080: X159080,
            @SerializedName("15923")
            val x15923: X15923,
            @SerializedName("159232")
            val x159232: X159232,
            @SerializedName("159255")
            val x159255: X159255,
            @SerializedName("159260")
            val x159260: X159260,
            @SerializedName("159284")
            val x159284: X159284,
            @SerializedName("159322")
            val x159322: X159322,
            @SerializedName("159423")
            val x159423: X159423,
            @SerializedName("159477")
            val x159477: X159477,
            @SerializedName("159520")
            val x159520: X159520,
            @SerializedName("159531")
            val x159531: X159531,
            @SerializedName("159537")
            val x159537: X159537,
            @SerializedName("159612")
            val x159612: X159612,
            @SerializedName("159636")
            val x159636: X159636,
            @SerializedName("159676")
            val x159676: X159676,
            @SerializedName("159777")
            val x159777: X159777,
            @SerializedName("159787")
            val x159787: X159787,
            @SerializedName("159854")
            val x159854: X159854,
            @SerializedName("159975")
            val x159975: X159975,
            @SerializedName("160023")
            val x160023: X160023,
            @SerializedName("160220")
            val x160220: X160220,
            @SerializedName("160236")
            val x160236: X160236,
            @SerializedName("160338")
            val x160338: X160338,
            @SerializedName("160376")
            val x160376: X160376,
            @SerializedName("160439")
            val x160439: X160439,
            @SerializedName("160480")
            val x160480: X160480,
            @SerializedName("160488")
            val x160488: X160488,
            @SerializedName("160539")
            val x160539: X160539,
            @SerializedName("160548")
            val x160548: X160548,
            @SerializedName("160707")
            val x160707: X160707,
            @SerializedName("160715")
            val x160715: X160715,
            @SerializedName("160800")
            val x160800: X160800,
            @SerializedName("160846")
            val x160846: X160846,
            @SerializedName("160967")
            val x160967: X160967,
            @SerializedName("161011")
            val x161011: X161011,
            @SerializedName("161081")
            val x161081: X161081,
            @SerializedName("161101")
            val x161101: X161101,
            @SerializedName("161157")
            val x161157: X161157,
            @SerializedName("161161")
            val x161161: X161161,
            @SerializedName("161178")
            val x161178: X161178,
            @SerializedName("161188")
            val x161188: X161188,
            @SerializedName("161273")
            val x161273: X161273,
            @SerializedName("161321")
            val x161321: X161321,
            @SerializedName("161335")
            val x161335: X161335,
            @SerializedName("161357")
            val x161357: X161357,
            @SerializedName("161392")
            val x161392: X161392,
            @SerializedName("161472")
            val x161472: X161472,
            @SerializedName("161475")
            val x161475: X161475,
            @SerializedName("161506")
            val x161506: X161506,
            @SerializedName("161568")
            val x161568: X161568,
            @SerializedName("161613")
            val x161613: X161613,
            @SerializedName("161624")
            val x161624: X161624,
            @SerializedName("161674")
            val x161674: X161674,
            @SerializedName("161705")
            val x161705: X161705,
            @SerializedName("161750")
            val x161750: X161750,
            @SerializedName("161793")
            val x161793: X161793,
            @SerializedName("161823")
            val x161823: X161823,
            @SerializedName("161868")
            val x161868: X161868,
            @SerializedName("161990")
            val x161990: X161990,
            @SerializedName("161999")
            val x161999: X161999,
            @SerializedName("162015")
            val x162015: X162015,
            @SerializedName("162025")
            val x162025: X162025,
            @SerializedName("162033")
            val x162033: X162033,
            @SerializedName("162171")
            val x162171: X162171,
            @SerializedName("162178")
            val x162178: X162178,
            @SerializedName("162210")
            val x162210: X162210,
            @SerializedName("162236")
            val x162236: X162236,
            @SerializedName("162310")
            val x162310: X162310,
            @SerializedName("162440")
            val x162440: X162440,
            @SerializedName("162477")
            val x162477: X162477,
            @SerializedName("162539")
            val x162539: X162539,
            @SerializedName("162696")
            val x162696: X162696,
            @SerializedName("162699")
            val x162699: X162699,
            @SerializedName("162746")
            val x162746: X162746,
            @SerializedName("162748")
            val x162748: X162748,
            @SerializedName("162879")
            val x162879: X162879,
            @SerializedName("162881")
            val x162881: X162881,
            @SerializedName("162976")
            val x162976: X162976,
            @SerializedName("162988")
            val x162988: X162988,
            @SerializedName("163011")
            val x163011: X163011,
            @SerializedName("163013")
            val x163013: X163013,
            @SerializedName("163019")
            val x163019: X163019,
            @SerializedName("163021")
            val x163021: X163021,
            @SerializedName("163026")
            val x163026: X163026,
            @SerializedName("163209")
            val x163209: X163209,
            @SerializedName("163334")
            val x163334: X163334,
            @SerializedName("163402")
            val x163402: X163402,
            @SerializedName("163416")
            val x163416: X163416,
            @SerializedName("163560")
            val x163560: X163560,
            @SerializedName("163565")
            val x163565: X163565,
            @SerializedName("163575")
            val x163575: X163575,
            @SerializedName("163587")
            val x163587: X163587,
            @SerializedName("163622")
            val x163622: X163622,
            @SerializedName("163817")
            val x163817: X163817,
            @SerializedName("163916")
            val x163916: X163916,
            @SerializedName("163964")
            val x163964: X163964,
            @SerializedName("164085")
            val x164085: X164085,
            @SerializedName("164114")
            val x164114: X164114,
            @SerializedName("164128")
            val x164128: X164128,
            @SerializedName("164180")
            val x164180: X164180,
            @SerializedName("164197")
            val x164197: X164197,
            @SerializedName("164301")
            val x164301: X164301,
            @SerializedName("164320")
            val x164320: X164320,
            @SerializedName("164322")
            val x164322: X164322,
            @SerializedName("164334")
            val x164334: X164334,
            @SerializedName("164387")
            val x164387: X164387,
            @SerializedName("164444")
            val x164444: X164444,
            @SerializedName("164446")
            val x164446: X164446,
            @SerializedName("16445")
            val x16445: X16445,
            @SerializedName("164464")
            val x164464: X164464,
            @SerializedName("164487")
            val x164487: X164487,
            @SerializedName("164509")
            val x164509: X164509,
            @SerializedName("164713")
            val x164713: X164713,
            @SerializedName("164910")
            val x164910: X164910,
            @SerializedName("164961")
            val x164961: X164961,
            @SerializedName("164972")
            val x164972: X164972,
            @SerializedName("164986")
            val x164986: X164986,
            @SerializedName("164989")
            val x164989: X164989,
            @SerializedName("165023")
            val x165023: X165023,
            @SerializedName("165090")
            val x165090: X165090,
            @SerializedName("165161")
            val x165161: X165161,
            @SerializedName("165172")
            val x165172: X165172,
            @SerializedName("165193")
            val x165193: X165193,
            @SerializedName("165209")
            val x165209: X165209,
            @SerializedName("165263")
            val x165263: X165263,
            @SerializedName("165315")
            val x165315: X165315,
            @SerializedName("165318")
            val x165318: X165318,
            @SerializedName("165368")
            val x165368: X165368,
            @SerializedName("165389")
            val x165389: X165389,
            @SerializedName("165482")
            val x165482: X165482,
            @SerializedName("165526")
            val x165526: X165526,
            @SerializedName("165549")
            val x165549: X165549,
            @SerializedName("165554")
            val x165554: X165554,
            @SerializedName("165676")
            val x165676: X165676,
            @SerializedName("165704")
            val x165704: X165704,
            @SerializedName("165885")
            val x165885: X165885,
            @SerializedName("165910")
            val x165910: X165910,
            @SerializedName("165911")
            val x165911: X165911,
            @SerializedName("165920")
            val x165920: X165920,
            @SerializedName("165938")
            val x165938: X165938,
            @SerializedName("165967")
            val x165967: X165967,
            @SerializedName("166107")
            val x166107: X166107,
            @SerializedName("166117")
            val x166117: X166117,
            @SerializedName("166143")
            val x166143: X166143,
            @SerializedName("166144")
            val x166144: X166144,
            @SerializedName("166179")
            val x166179: X166179,
            @SerializedName("166322")
            val x166322: X166322,
            @SerializedName("166323")
            val x166323: X166323,
            @SerializedName("166447")
            val x166447: X166447,
            @SerializedName("166503")
            val x166503: X166503,
            @SerializedName("166504")
            val x166504: X166504,
            @SerializedName("166506")
            val x166506: X166506,
            @SerializedName("166507")
            val x166507: X166507,
            @SerializedName("166513")
            val x166513: X166513,
            @SerializedName("166514")
            val x166514: X166514,
            @SerializedName("166527")
            val x166527: X166527,
            @SerializedName("166542")
            val x166542: X166542,
            @SerializedName("166571")
            val x166571: X166571,
            @SerializedName("166574")
            val x166574: X166574,
            @SerializedName("166662")
            val x166662: X166662,
            @SerializedName("166719")
            val x166719: X166719,
            @SerializedName("166726")
            val x166726: X166726,
            @SerializedName("166784")
            val x166784: X166784,
            @SerializedName("166822")
            val x166822: X166822,
            @SerializedName("166826")
            val x166826: X166826,
            @SerializedName("166854")
            val x166854: X166854,
            @SerializedName("166856")
            val x166856: X166856,
            @SerializedName("166869")
            val x166869: X166869,
            @SerializedName("166891")
            val x166891: X166891,
            @SerializedName("166903")
            val x166903: X166903,
            @SerializedName("166932")
            val x166932: X166932,
            @SerializedName("166955")
            val x166955: X166955,
            @SerializedName("167003")
            val x167003: X167003,
            @SerializedName("167050")
            val x167050: X167050,
            @SerializedName("167081")
            val x167081: X167081,
            @SerializedName("167208")
            val x167208: X167208,
            @SerializedName("167242")
            val x167242: X167242,
            @SerializedName("167286")
            val x167286: X167286,
            @SerializedName("167476")
            val x167476: X167476,
            @SerializedName("167485")
            val x167485: X167485,
            @SerializedName("167570")
            val x167570: X167570,
            @SerializedName("167636")
            val x167636: X167636,
            @SerializedName("167745")
            val x167745: X167745,
            @SerializedName("167757")
            val x167757: X167757,
            @SerializedName("167764")
            val x167764: X167764,
            @SerializedName("167852")
            val x167852: X167852,
            @SerializedName("167863")
            val x167863: X167863,
            @SerializedName("167865")
            val x167865: X167865,
            @SerializedName("167920")
            val x167920: X167920,
            @SerializedName("167933")
            val x167933: X167933,
            @SerializedName("168178")
            val x168178: X168178,
            @SerializedName("168259")
            val x168259: X168259,
            @SerializedName("168263")
            val x168263: X168263,
            @SerializedName("168323")
            val x168323: X168323,
            @SerializedName("168343")
            val x168343: X168343,
            @SerializedName("168534")
            val x168534: X168534,
            @SerializedName("168610")
            val x168610: X168610,
            @SerializedName("168717")
            val x168717: X168717,
            @SerializedName("168724")
            val x168724: X168724,
            @SerializedName("168727")
            val x168727: X168727,
            @SerializedName("168731")
            val x168731: X168731,
            @SerializedName("168793")
            val x168793: X168793,
            @SerializedName("168824")
            val x168824: X168824,
            @SerializedName("168944")
            val x168944: X168944,
            @SerializedName("169045")
            val x169045: X169045,
            @SerializedName("169055")
            val x169055: X169055,
            @SerializedName("169076")
            val x169076: X169076,
            @SerializedName("169107")
            val x169107: X169107,
            @SerializedName("169150")
            val x169150: X169150,
            @SerializedName("169203")
            val x169203: X169203,
            @SerializedName("169206")
            val x169206: X169206,
            @SerializedName("169280")
            val x169280: X169280,
            @SerializedName("169326")
            val x169326: X169326,
            @SerializedName("169411")
            val x169411: X169411,
            @SerializedName("169428")
            val x169428: X169428,
            @SerializedName("169614")
            val x169614: X169614,
            @SerializedName("169618")
            val x169618: X169618,
            @SerializedName("169746")
            val x169746: X169746,
            @SerializedName("169759")
            val x169759: X169759,
            @SerializedName("169799")
            val x169799: X169799,
            @SerializedName("169924")
            val x169924: X169924,
            @SerializedName("170060")
            val x170060: X170060,
            @SerializedName("170102")
            val x170102: X170102,
            @SerializedName("170378")
            val x170378: X170378,
            @SerializedName("170386")
            val x170386: X170386,
            @SerializedName("170418")
            val x170418: X170418,
            @SerializedName("170429")
            val x170429: X170429,
            @SerializedName("170431")
            val x170431: X170431,
            @SerializedName("170432")
            val x170432: X170432,
            @SerializedName("170481")
            val x170481: X170481,
            @SerializedName("170488")
            val x170488: X170488,
            @SerializedName("17386")
            val x17386: X17386,
            @SerializedName("18576")
            val x18576: X18576,
            @SerializedName("20603")
            val x20603: X20603,
            @SerializedName("22548")
            val x22548: X22548,
            @SerializedName("22733")
            val x22733: X22733,
            @SerializedName("24957")
            val x24957: X24957,
            @SerializedName("25400")
            val x25400: X25400,
            @SerializedName("25726")
            val x25726: X25726,
            @SerializedName("27765")
            val x27765: X27765,
            @SerializedName("31659")
            val x31659: X31659,
            @SerializedName("34799")
            val x34799: X34799,
            @SerializedName("35567")
            val x35567: X35567,
            @SerializedName("38811")
            val x38811: X38811,
            @SerializedName("39247")
            val x39247: X39247,
            @SerializedName("39374")
            val x39374: X39374,
            @SerializedName("45412")
            val x45412: X45412,
            @SerializedName("525")
            val x525: X525,
            @SerializedName("530")
            val x530: X530,
            @SerializedName("5569")
            val x5569: X5569,
            @SerializedName("55970")
            val x55970: X55970,
            @SerializedName("59389")
            val x59389: X59389,
            @SerializedName("60622")
            val x60622: X60622,
            @SerializedName("634")
            val x634: X634,
            @SerializedName("65115")
            val x65115: X65115,
            @SerializedName("67108")
            val x67108: X67108,
            @SerializedName("68052")
            val x68052: X68052,
            @SerializedName("68081")
            val x68081: X68081,
            @SerializedName("68750")
            val x68750: X68750,
            @SerializedName("69178")
            val x69178: X69178,
            @SerializedName("70239")
            val x70239: X70239,
            @SerializedName("72668")
            val x72668: X72668,
            @SerializedName("73428")
            val x73428: X73428,
            @SerializedName("73853")
            val x73853: X73853,
            @SerializedName("76059")
            val x76059: X76059,
            @SerializedName("77001")
            val x77001: X77001,
            @SerializedName("77485")
            val x77485: X77485,
            @SerializedName("77507")
            val x77507: X77507,
            @SerializedName("77572")
            val x77572: X77572,
            @SerializedName("77574")
            val x77574: X77574,
            @SerializedName("77675")
            val x77675: X77675,
            @SerializedName("80086")
            val x80086: X80086,
            @SerializedName("80150")
            val x80150: X80150,
            @SerializedName("80695")
            val x80695: X80695,
            @SerializedName("80721")
            val x80721: X80721,
            @SerializedName("80838")
            val x80838: X80838,
            @SerializedName("80869")
            val x80869: X80869,
            @SerializedName("80878")
            val x80878: X80878,
            @SerializedName("80922")
            val x80922: X80922,
            @SerializedName("81079")
            val x81079: X81079,
            @SerializedName("81100")
            val x81100: X81100,
            @SerializedName("81101")
            val x81101: X81101,
            @SerializedName("81104")
            val x81104: X81104,
            @SerializedName("81114")
            val x81114: X81114,
            @SerializedName("81115")
            val x81115: X81115,
            @SerializedName("81125")
            val x81125: X81125,
            @SerializedName("81321")
            val x81321: X81321,
            @SerializedName("81738")
            val x81738: X81738,
            @SerializedName("81913")
            val x81913: X81913,
            @SerializedName("82218")
            val x82218: X82218,
            @SerializedName("82503")
            val x82503: X82503,
            @SerializedName("82591")
            val x82591: X82591,
            @SerializedName("82624")
            val x82624: X82624,
            @SerializedName("82712")
            val x82712: X82712,
            @SerializedName("82728")
            val x82728: X82728,
            @SerializedName("83295")
            val x83295: X83295,
            @SerializedName("83484")
            val x83484: X83484,
            @SerializedName("83707")
            val x83707: X83707,
            @SerializedName("83709")
            val x83709: X83709,
            @SerializedName("846")
            val x846: X846,
            @SerializedName("85058")
            val x85058: X85058,
            @SerializedName("85609")
            val x85609: X85609,
            @SerializedName("85699")
            val x85699: X85699,
            @SerializedName("85722")
            val x85722: X85722,
            @SerializedName("85762")
            val x85762: X85762,
            @SerializedName("85859")
            val x85859: X85859,
            @SerializedName("85872")
            val x85872: X85872,
            @SerializedName("86162")
            val x86162: X86162,
            @SerializedName("86241")
            val x86241: X86241,
            @SerializedName("86623")
            val x86623: X86623,
            @SerializedName("86946")
            val x86946: X86946,
            @SerializedName("87000")
            val x87000: X87000,
            @SerializedName("87006")
            val x87006: X87006,
            @SerializedName("87031")
            val x87031: X87031,
            @SerializedName("87202")
            val x87202: X87202,
            @SerializedName("87280")
            val x87280: X87280,
            @SerializedName("87297")
            val x87297: X87297,
            @SerializedName("87389")
            val x87389: X87389,
            @SerializedName("87494")
            val x87494: X87494,
            @SerializedName("87503")
            val x87503: X87503,
            @SerializedName("87634")
            val x87634: X87634,
            @SerializedName("87766")
            val x87766: X87766,
            @SerializedName("87880")
            val x87880: X87880,
            @SerializedName("87894")
            val x87894: X87894,
            @SerializedName("87994")
            val x87994: X87994,
            @SerializedName("88963")
            val x88963: X88963,
            @SerializedName("89049")
            val x89049: X89049,
            @SerializedName("89140")
            val x89140: X89140,
            @SerializedName("89245")
            val x89245: X89245,
            @SerializedName("89664")
            val x89664: X89664,
            @SerializedName("90100")
            val x90100: X90100,
            @SerializedName("90536")
            val x90536: X90536,
            @SerializedName("90961")
            val x90961: X90961,
            @SerializedName("91435")
            val x91435: X91435,
            @SerializedName("91788")
            val x91788: X91788,
            @SerializedName("91841")
            val x91841: X91841,
            @SerializedName("92519")
            val x92519: X92519,
            @SerializedName("93121")
            val x93121: X93121,
            @SerializedName("93741")
            val x93741: X93741,
            @SerializedName("93760")
            val x93760: X93760,
            @SerializedName("93787")
            val x93787: X93787,
            @SerializedName("93799")
            val x93799: X93799,
            @SerializedName("93801")
            val x93801: X93801,
            @SerializedName("93970")
            val x93970: X93970,
            @SerializedName("94086")
            val x94086: X94086,
            @SerializedName("94181")
            val x94181: X94181,
            @SerializedName("94187")
            val x94187: X94187,
            @SerializedName("94517")
            val x94517: X94517,
            @SerializedName("94678")
            val x94678: X94678,
            @SerializedName("94768")
            val x94768: X94768,
            @SerializedName("95180")
            val x95180: X95180,
            @SerializedName("95301")
            val x95301: X95301,
            @SerializedName("96059")
            val x96059: X96059,
            @SerializedName("97447")
            val x97447: X97447,
            @SerializedName("97680")
            val x97680: X97680,
            @SerializedName("97706")
            val x97706: X97706,
            @SerializedName("97711")
            val x97711: X97711,
            @SerializedName("98095")
            val x98095: X98095,
            @SerializedName("98098")
            val x98098: X98098,
            @SerializedName("98109")
            val x98109: X98109,
            @SerializedName("98263")
            val x98263: X98263,
            @SerializedName("98612")
            val x98612: X98612,
            @SerializedName("98688")
            val x98688: X98688,
            @SerializedName("98783")
            val x98783: X98783,
            @SerializedName("98932")
            val x98932: X98932,
            @SerializedName("99021")
            val x99021: X99021,
            @SerializedName("99196")
            val x99196: X99196,
            @SerializedName("99238")
            val x99238: X99238,
            @SerializedName("99460")
            val x99460: X99460,
            @SerializedName("99712")
            val x99712: X99712,
            @SerializedName("99745")
            val x99745: X99745
        ) {
            data class X100224(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X100378(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X100442(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X101255(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X101386(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X101936(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X102182(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X102239(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X102469(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X102498(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X102571(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X102637(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X102731(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X102733(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X102744(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X102755(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X102936(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X102954(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X102975(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X103797(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X103814(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X104082(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X104099(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X104130(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X104187(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X104193(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X104254(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X104695(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X104822(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X104991(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X105078(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X105352(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X105480(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X105503(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X105709(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X106319(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X106402(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X106434(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X106472(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X106478(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X106839(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X106984(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X107061(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X108200(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X108627(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X108704(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X108899(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X109279(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X109349(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X109453(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X109610(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X109993(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X110384(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X110562(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X110821(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X110905(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X111224(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X111283(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X111911(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X111976(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X112402(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X112434(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X11245(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X112652(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X112803(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X113116(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X113207(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X113668(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X113708(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X113796(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X113811(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X113813(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X113869(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X113922(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X113925(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114098(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114111(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114208(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114272(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114295(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114335(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114343(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114347(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114354(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114469(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114476(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114482(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114487(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114489(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114551(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114605(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114797(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114929(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114932(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114934(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114958(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114975(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114978(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114984(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X114990(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X115121(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X115193(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X115223(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X115226(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X115670(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X115754(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X115757(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X115864(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X115945(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X116001(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X116089(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X116383(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X116707(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X116753(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X116760(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X116968(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X117112(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X117187(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X117195(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X117304(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X117314(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X117319(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X117482(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X117503(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X117534(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X117792(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X118217(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X118478(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X118564(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X118593(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X118598(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X118608(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X118636(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X118688(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X118730(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X118770(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X118861(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X118929(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119025(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119076(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119234(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119256(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119287(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119325(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119336(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119346(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119431(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119578(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119616(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119632(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119645(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119935(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X119937(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120063(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120099(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120127(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120143(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120154(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120171(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120206(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120236(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120246(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120248(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120258(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120262(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120341(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120513(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120576(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120611(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120706(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120820(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120861(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120874(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X120926(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X121088(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X121097(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X121104(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X121208(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X121213(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X121217(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X121322(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X121374(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X121698(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X12171(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X121714(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X121759(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X121862(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X122029(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X122065(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X122253(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X122271(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X122272(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X122375(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X122384(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X122476(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X122521(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X122698(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X122860(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X122865(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123005(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123049(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123073(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123086(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123247(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123515(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123534(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123604(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123637(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123746(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123772(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123891(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123893(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123919(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123989(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X123996(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X124031(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X124389(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X124556(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X124661(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X124663(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X125246(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X125458(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X125505(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X125743(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X125768(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X125792(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X125983(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X12603(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X126122(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X126534(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X126538(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X126559(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X126699(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X126735(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X126793(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X126848(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X126861(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X127012(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X127244(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X127247(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X127258(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X127518(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X127538(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X127649(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X127683(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X127710(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X127779(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X127831(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X128091(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X128103(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X128108(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X128126(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X128164(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X128217(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X128248(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X128297(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X128361(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X128376(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X128416(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X128911(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X128929(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X128943(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X129517(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X129649(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X129757(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X129929(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X129948(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X129955(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X129960(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X129975(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130181(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130183(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130188(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130207(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130216(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130434(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130446(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130482(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130542(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130620(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130624(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130740(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130793(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130889(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130895(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130916(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130937(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130938(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130948(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130955(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X130989(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131009(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131041(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131067(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131084(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131104(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131251(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131277(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131293(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131320(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131333(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131488(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131516(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131598(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131713(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")

                    val minimumAmount: Int
                )
            }

            data class X131715(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131720(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131764(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131869(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X131974(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132250(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132430(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132452(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132453(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132455(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132466(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132468(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132493(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132562(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132622(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132652(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132685(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132736(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132772(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132790(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X132952(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133030(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133102(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133109(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133414(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133418(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133422(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133426(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133429(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133440(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133443(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133444(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133454(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133456(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133694(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133740(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133755(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133812(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133815(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X133899(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134018(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134042(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134055(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134063(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134132(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134252(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134275(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134317(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134392(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134625(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134638(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134643(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134797(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134809(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134849(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134915(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134974(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X134992(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135112(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135244(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135259(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135304(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135514(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135619(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135664(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135721(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135910(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135917(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135920(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135940(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135944(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135945(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X135963(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X136158(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X136296(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X136573(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X136616(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X136659(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X136890(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X136930(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X136937(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X137033(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X137119(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X137123(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X137149(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X137214(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X137274(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X137357(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X137831(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X137873(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X138101(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X138143(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X138251(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X138465(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X138503(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X138584(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X138782(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X138960(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X139067(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X139076(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X139249(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X139304(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X139335(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X139479(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X139720(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X139736(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X139855(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X139905(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X139910(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X139930(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X140098(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X140322(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X140344(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X140391(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X14043(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X140780(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X140805(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X140871(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X140905(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X140936(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X141113(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X141237(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X141243(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X141337(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X141359(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X141477(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X141580(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X141663(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X141666(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X141674(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X141683(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X141684(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X141776(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X14273(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X143083(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X143156(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X143167(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X143225(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X143350(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X143424(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X143490(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X143534(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X143632(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X143700(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X143911(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144001(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144017(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144050(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144059(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144111(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144289(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144291(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144416(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144434(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144470(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144550(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144557(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144742(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144747(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144764(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144765(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144769(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144773(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X144983(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145043(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145044(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145104(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145203(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145345(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145352(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145354(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145359(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145648(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145653(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145654(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145656(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145657(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145761(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145847(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X145928(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X146114(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X146281(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X146550(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X146686(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X146716(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X146759(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X146763(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X146766(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X146770(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X146794(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X146797(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X146804(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X146822(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X146894(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147022(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147043(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147061(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147177(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147277(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147405(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147406(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147440(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147503(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147518(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147553(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147560(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147668(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147769(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147775(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147782(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147789(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147800(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147809(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147820(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147822(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147826(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147828(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147838(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147842(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147844(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147846(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147848(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147865(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147911(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147912(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147919(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147926(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147934(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147939(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147941(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147944(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147979(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X147994(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148215(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148312(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148317(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148319(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148418(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148440(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148483(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148489(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148499(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148501(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148509(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148515(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148524(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148529(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148541(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148542(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148553(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148601(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148622(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148626(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148879(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X148953(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149119(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149141(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149145(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149184(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149186(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149327(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149330(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149331(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149346(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149347(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149403(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149441(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149443(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149445(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149447(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149450(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149459(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149466(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149478(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149498(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149501(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149584(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149623(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149637(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149714(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149728(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X149788(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X14997(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150102(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150103(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150107(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150150(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150152(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150193(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150223(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150279(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150341(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150509(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150513(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150531(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150589(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150601(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150720(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150737(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150740(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150779(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150837(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150925(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X150927(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151031(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151065(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151098(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151099(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151126(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151150(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151185(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151187(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151252(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151327(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151378(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151407(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151426(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151462(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151466(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151553(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151661(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151756(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151804(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151820(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151832(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151843(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151913(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151947(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X151967(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X152026(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X152039(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X152087(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X152098(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X152123(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X152128(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X152258(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X152311(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X152415(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X152612(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X152781(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X152796(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X152823(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153036(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153041(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153083(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153142(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153197(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153299(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153329(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153335(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153340(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153357(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153395(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153420(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153424(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153426(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153428(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153438(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153440(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153470(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153484(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153639(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153641(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153725(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153738(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153755(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153783(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153802(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153849(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153928(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153937(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153940(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X153975(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154092(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154099(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154113(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154130(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154150(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154166(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154184(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154192(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154202(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154251(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154262(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154267(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154345(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154384(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154421(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154658(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154686(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154759(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154794(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154804(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154818(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154835(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154837(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154897(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154904(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154905(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154910(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X154981(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155091(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155135(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155162(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155198(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155290(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155377(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155403(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155465(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155469(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155470(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155491(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155495(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155504(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155510(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155526(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155609(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155633(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155682(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155769(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155817(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155826(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X155892(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156049(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156052(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156166(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156214(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156222(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156240(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156271(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156277(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156285(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156307(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156370(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156399(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156430(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156463(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156465(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156493(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156541(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156551(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156669(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156672(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156674(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156731(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156732(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156794(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156848(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156850(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156881(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156899(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156902(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156914(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156957(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156974(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X156975(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157045(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157047(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157048(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157065(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157072(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {

                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157075(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157238(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157252(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157282(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157373(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157388(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157399(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157415(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157432(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157434(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157490(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157493(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157497(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157510(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157519(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157793(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157846(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157854(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157859(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157876(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157944(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X157960(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158035(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158118(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158162(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158279(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158355(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158365(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158414(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158474(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158541(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158542(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158619(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158636(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158784(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158807(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158808(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158810(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158812(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158871(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158877(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158882(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158888(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158920(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158940(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158974(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X158980(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159037(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159080(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X15923(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159232(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159255(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159260(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159284(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159322(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159423(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159477(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159520(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159531(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159537(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159612(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159636(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159676(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159777(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159787(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159854(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X159975(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160023(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160220(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160236(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160338(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160376(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160439(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160480(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160488(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160539(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160548(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160707(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160715(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160800(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160846(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X160967(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161011(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161081(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161101(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161157(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161161(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161178(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161188(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161273(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161321(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161335(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161357(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161392(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161472(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161475(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161506(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161568(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161613(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161624(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161674(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161705(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161750(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161793(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161823(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161868(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161990(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X161999(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162015(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162025(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162033(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162171(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162178(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162210(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162236(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162310(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162440(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162477(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162539(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162696(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162699(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162746(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162748(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162879(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162881(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162976(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X162988(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163011(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163013(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163019(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163021(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163026(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163209(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163334(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163402(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163416(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163560(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163565(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163575(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163587(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163622(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163817(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163916(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X163964(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164085(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164114(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164128(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164180(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164197(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164301(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164320(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164322(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164334(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164387(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164444(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164446(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X16445(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164464(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164487(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164509(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164713(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164910(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164961(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164972(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164986(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X164989(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165023(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165090(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165161(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165172(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165193(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165209(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165263(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165315(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165318(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165368(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165389(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165482(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165526(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165549(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165554(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165676(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165704(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165885(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165910(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165911(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165920(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165938(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X165967(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166107(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166117(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166143(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166144(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166179(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166322(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166323(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166447(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166503(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166504(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166506(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166507(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166513(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166514(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166527(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166542(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166571(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166574(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166662(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166719(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166726(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166784(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166822(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166826(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166854(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166856(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166869(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166891(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166903(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166932(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X166955(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167003(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167050(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167081(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167208(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167242(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167286(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167476(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167485(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167570(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167636(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167745(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167757(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167764(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167852(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167863(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167865(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167920(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X167933(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X168178(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X168259(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X168263(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X168323(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X168343(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X168534(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X168610(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X168717(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X168724(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X168727(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X168731(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X168793(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X168824(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X168944(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169045(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169055(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169076(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169107(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169150(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169203(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169206(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169280(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169326(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169411(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169428(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169614(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169618(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169746(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169759(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169799(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X169924(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X170060(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X170102(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X170378(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X170386(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X170418(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X170429(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X170431(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X170432(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X170481(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X170488(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X17386(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X18576(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X20603(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X22548(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X22733(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X24957(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X25400(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X25726(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X27765(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X31659(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X34799(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X35567(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X38811(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X39247(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X39374(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X45412(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X525(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X530(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X5569(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X55970(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X59389(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X60622(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X634(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X65115(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X67108(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X68052(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X68081(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X68750(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X69178(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X70239(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X72668(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X73428(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X73853(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X76059(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X77001(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X77485(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X77507(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X77572(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X77574(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X77675(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X80086(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X80150(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X80695(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X80721(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X80838(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X80869(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X80878(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X80922(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X81079(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X81100(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X81101(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X81104(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X81114(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X81115(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X81125(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X81321(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X81738(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X81913(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X82218(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X82503(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X82591(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X82624(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X82712(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X82728(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X83295(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X83484(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X83707(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X83709(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X846(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X85058(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X85609(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X85699(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X85722(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X85762(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X85859(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X85872(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X86162(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X86241(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X86623(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X86946(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X87000(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X87006(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X87031(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X87202(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X87280(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X87297(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X87389(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X87494(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X87503(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X87634(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X87766(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X87880(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X87894(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X87994(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X88963(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X89049(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X89140(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X89245(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X89664(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X90100(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X90536(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X90961(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X91435(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X91788(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X91841(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X92519(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X93121(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X93741(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X93760(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X93787(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X93799(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X93801(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X93970(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X94086(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X94181(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X94187(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X94517(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X94678(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X94768(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X95180(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X95301(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X96059(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X97447(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X97680(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X97706(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X97711(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X98095(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X98098(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X98109(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X98263(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X98612(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X98688(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X98783(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X98932(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X99021(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X99196(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X99238(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X99460(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X99712(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }

            data class X99745(
                @SerializedName("bands")
                val bands: List<Band>,
                @SerializedName("minimumOrderValue")
                val minimumOrderValue: Int,
                @SerializedName("restaurantId")
                val restaurantId: String
            ) {
                data class Band(
                    @SerializedName("fee")
                    val fee: Int,
                    @SerializedName("minimumAmount")
                    val minimumAmount: Int
                )
            }
        }
    }

    data class MetaData(
        @SerializedName("Area")
        val area: String,
        @SerializedName("CanonicalName")
        val canonicalName: String,
        @SerializedName("CollectionExperimentInjectedRestaurantIds")
        val collectionExperimentInjectedRestaurantIds: Any?,
        @SerializedName("CuisineDetails")
        val cuisineDetails: List<CuisineDetail>,
        @SerializedName("DeliveryArea")
        val deliveryArea: String,
        @SerializedName("District")
        val district: String,
        @SerializedName("Latitude")
        val latitude: Double,
        @SerializedName("Longitude")
        val longitude: Double,
        @SerializedName("Postcode")
        val postcode: String,
        @SerializedName("ResultCount")
        val resultCount: Int,
        @SerializedName("SearchedTerms")
        val searchedTerms: Any?,
        @SerializedName("TagDetails")
        val tagDetails: List<TagDetail>
    ) {
        data class CuisineDetail(
            @SerializedName("Name")
            val name: String,
            @SerializedName("SeoName")
            val seoName: String,
            @SerializedName("Total")
            val total: Int
        )

        data class TagDetail(
            @SerializedName("BackgroundColour")
            val backgroundColour: String,
            @SerializedName("Colour")
            val colour: String,
            @SerializedName("DisplayName")
            val displayName: String,
            @SerializedName("Key")
            val key: String,
            @SerializedName("Priority")
            val priority: Int
        )
    }

    data class PromotedPlacement(
        @SerializedName("filteredSearchPromotedLimit")
        val filteredSearchPromotedLimit: Int,
        @SerializedName("rankedIds")
        val rankedIds: List<Int>,
        @SerializedName("restaurants")
        val restaurants: Restaurants
    ) {
        data class Restaurants(
            @SerializedName("128376")
            val x128376: X128376,
            @SerializedName("129948")
            val x129948: X129948,
            @SerializedName("134974")
            val x134974: X134974,
            @SerializedName("154818")
            val x154818: X154818,
            @SerializedName("168724")
            val x168724: X168724,
            @SerializedName("169799")
            val x169799: X169799,
            @SerializedName("93741")
            val x93741: X93741
        ) {
            data class X128376(
                @SerializedName("defaultPromoted")
                val defaultPromoted: Boolean,
                @SerializedName("restaurantId")
                val restaurantId: String
            )

            data class X129948(
                @SerializedName("defaultPromoted")
                val defaultPromoted: Boolean,
                @SerializedName("restaurantId")
                val restaurantId: String
            )

            data class X134974(
                @SerializedName("defaultPromoted")
                val defaultPromoted: Boolean,
                @SerializedName("restaurantId")
                val restaurantId: String
            )

            data class X154818(
                @SerializedName("defaultPromoted")
                val defaultPromoted: Boolean,
                @SerializedName("restaurantId")
                val restaurantId: String
            )

            data class X168724(
                @SerializedName("defaultPromoted")
                val defaultPromoted: Boolean,
                @SerializedName("restaurantId")
                val restaurantId: String
            )

            data class X169799(
                @SerializedName("defaultPromoted")
                val defaultPromoted: Boolean,
                @SerializedName("restaurantId")
                val restaurantId: String
            )

            data class X93741(
                @SerializedName("defaultPromoted")
                val defaultPromoted: Boolean,
                @SerializedName("restaurantId")
                val restaurantId: String
            )
        }
    }

    data class RestaurantSet(
        @SerializedName("Id")
        val id: String,
        @SerializedName("Name")
        val name: String?,
        @SerializedName("Restaurants")
        val restaurants: List<Restaurant>,
        @SerializedName("Type")
        val type: String?
    ) {
        data class Restaurant(
            @SerializedName("Id")
            val id: Int,
            @SerializedName("Metadata")
            val metadata: Metadata
        ) {
            data class Metadata(
                @SerializedName("Rating")
                val rating: String
            )
        }
    }

    data class Restaurant(
        @SerializedName("Address")
        val address: Address,
        @SerializedName("Badges")
        val badges: List<Any>,
        @SerializedName("BrandName")
        val brandName: String,
        @SerializedName("City")
        val city: String,
        @SerializedName("CollectionMenuId")
        val collectionMenuId: Any?,
        @SerializedName("CuisineTypes")
        val cuisineTypes: List<CuisineType>,
        @SerializedName("Cuisines")
        val cuisines: List<Cuisine>,
        @SerializedName("Deals")
        val deals: List<Deal>,
        @SerializedName("DefaultDisplayRank")
        val defaultDisplayRank: Int,
        @SerializedName("DeliveryChargeBands")
        val deliveryChargeBands: List<Any>,
        @SerializedName("DeliveryCost")
        val deliveryCost: Double,
        @SerializedName("DeliveryEtaMinutes")
        val deliveryEtaMinutes: DeliveryEtaMinutes?,
        @SerializedName("DeliveryMenuId")
        val deliveryMenuId: Any?,
        @SerializedName("DeliveryOpeningTime")
        val deliveryOpeningTime: String?,
        @SerializedName("DeliveryOpeningTimeLocal")
        val deliveryOpeningTimeLocal: String,
        @SerializedName("DeliveryOpeningTimeUtc")
        val deliveryOpeningTimeUtc: Any?,
        @SerializedName("DeliveryStartTime")
        val deliveryStartTime: String,
        @SerializedName("DeliveryTime")
        val deliveryTime: Any?,
        @SerializedName("DeliveryTimeMinutes")
        val deliveryTimeMinutes: Any?,
        @SerializedName("DeliveryWorkingTimeMinutes")
        val deliveryWorkingTimeMinutes: Int?,
        @SerializedName("DeliveryZipcode")
        val deliveryZipcode: Any?,
        @SerializedName("Description")
        val description: String,
        @SerializedName("DriveDistance")
        val driveDistance: Double,
        @SerializedName("DriveInfoCalculated")
        val driveInfoCalculated: Boolean,
        @SerializedName("HygieneRating")
        val hygieneRating: Any?,
        @SerializedName("Id")
        val id: Int,
        @SerializedName("IsBrand")
        val isBrand: Boolean,
        @SerializedName("IsCloseBy")
        val isCloseBy: Boolean,
        @SerializedName("IsCollection")
        val isCollection: Boolean,
        @SerializedName("IsDelivery")
        val isDelivery: Boolean,
        @SerializedName("IsFreeDelivery")
        val isFreeDelivery: Boolean,
        @SerializedName("IsHalal")
        val isHalal: Boolean,
        @SerializedName("IsNew")
        val isNew: Boolean,
        @SerializedName("IsOpenNow")
        val isOpenNow: Boolean,
        @SerializedName("IsOpenNowForCollection")
        val isOpenNowForCollection: Boolean,
        @SerializedName("IsOpenNowForDelivery")
        val isOpenNowForDelivery: Boolean,
        @SerializedName("IsOpenNowForPreorder")
        val isOpenNowForPreorder: Boolean,
        @SerializedName("IsPremier")
        val isPremier: Boolean,
        @SerializedName("IsSponsored")
        val isSponsored: Boolean,
        @SerializedName("IsTemporarilyOffline")
        val isTemporarilyOffline: Boolean,
        @SerializedName("IsTemporaryBoost")
        val isTemporaryBoost: Boolean,
        @SerializedName("IsTestRestaurant")
        val isTestRestaurant: Boolean,
        @SerializedName("LastUpdated")
        val lastUpdated: String,
        @SerializedName("Latitude")
        val latitude: Double,
        @SerializedName("Logo")
        val logo: List<Logo>,
        @SerializedName("LogoUrl")
        val logoUrl: String,
        @SerializedName("Longitude")
        val longitude: Double,
        @SerializedName("MinimumDeliveryValue")
        val minimumDeliveryValue: Double,
        @SerializedName("Name")
        val name: String,
        @SerializedName("NewnessDate")
        val newnessDate: String,
        @SerializedName("NumberOfRatings")
        val numberOfRatings: Int,
        @SerializedName("OfferPercent")
        val offerPercent: Double,
        @SerializedName("Offers")
        val offers: List<Offer>,
        @SerializedName("OpeningTime")
        val openingTime: String?,
        @SerializedName("OpeningTimeIso")
        val openingTimeIso: String,
        @SerializedName("OpeningTimeLocal")
        val openingTimeLocal: String,
        @SerializedName("OpeningTimeUtc")
        val openingTimeUtc: Any?,
        @SerializedName("OpeningTimes")
        val openingTimes: List<Any>,
        @SerializedName("Postcode")
        val postcode: String,
        @SerializedName("Rating")
        val rating: Rating,
        @SerializedName("RatingAverage")
        val ratingAverage: Double,
        @SerializedName("RatingStars")
        val ratingStars: Double,
        @SerializedName("ReasonWhyTemporarilyOffline")
        val reasonWhyTemporarilyOffline: String,
        @SerializedName("Score")
        val score: Double,
        @SerializedName("ScoreMetaData")
        val scoreMetaData: List<ScoreMetaData>,
        @SerializedName("SecondDateRank")
        val secondDateRank: Double,
        @SerializedName("SecondDateRanking")
        val secondDateRanking: Double,
        @SerializedName("SendsOnItsWayNotifications")
        val sendsOnItsWayNotifications: Boolean,
        @SerializedName("ServiceableAreas")
        val serviceableAreas: List<Any>,
        @SerializedName("ShowSmiley")
        val showSmiley: Boolean,
        @SerializedName("SmileyDate")
        val smileyDate: Any?,
        @SerializedName("SmileyElite")
        val smileyElite: Boolean,
        @SerializedName("SmileyResult")
        val smileyResult: Any?,
        @SerializedName("SmileyUrl")
        val smileyUrl: Any?,
        @SerializedName("SponsoredPosition")
        val sponsoredPosition: Int,
        @SerializedName("Tags")
        val tags: List<String>,
        @SerializedName("UniqueName")
        val uniqueName: String,
        @SerializedName("Url")
        val url: String
    ) {
        data class Address(
            @SerializedName("City")
            val city: String,
            @SerializedName("FirstLine")
            val firstLine: String,
            @SerializedName("Latitude")
            val latitude: Double,
            @SerializedName("Longitude")
            val longitude: Double,
            @SerializedName("Postcode")
            val postcode: String
        )

        data class CuisineType(
            @SerializedName("Id")
            val id: Int,
            @SerializedName("IsTopCuisine")
            val isTopCuisine: Boolean,
            @SerializedName("Name")
            val name: String,
            @SerializedName("SeoName")
            val seoName: String
        )

        data class Cuisine(
            @SerializedName("Name")
            val name: String,
            @SerializedName("SeoName")
            val seoName: String
        )

        data class Deal(
            @SerializedName("CampaignId")
            val campaignId: Any?,
            @SerializedName("ConsumerSegment")
            val consumerSegment: String,
            @SerializedName("Description")
            val description: String,
            @SerializedName("DiscountPercent")
            val discountPercent: Double,
            @SerializedName("OfferId")
            val offerId: String,
            @SerializedName("OfferType")
            val offerType: String,
            @SerializedName("QualifyingPrice")
            val qualifyingPrice: Double
        )

        data class DeliveryEtaMinutes(
            @SerializedName("Approximate")
            val approximate: Any?,
            @SerializedName("RangeLower")
            val rangeLower: Int,
            @SerializedName("RangeUpper")
            val rangeUpper: Int
        )

        data class Logo(
            @SerializedName("StandardResolutionURL")
            val standardResolutionURL: String
        )

        data class Offer(
            @SerializedName("Amount")
            val amount: Double,
            @SerializedName("CampaignId")
            val campaignId: String,
            @SerializedName("ConsumerSegment")
            val consumerSegment: String,
            @SerializedName("Description")
            val description: String,
            @SerializedName("MaxQualifyingValue")
            val maxQualifyingValue: Double,
            @SerializedName("OfferId")
            val offerId: String,
            @SerializedName("QualifyingValue")
            val qualifyingValue: Double,
            @SerializedName("Type")
            val type: String
        )

        data class Rating(
            @SerializedName("Average")
            val average: Double,
            @SerializedName("Count")
            val count: Int,
            @SerializedName("StarRating")
            val starRating: Double
        )

        data class ScoreMetaData(
            @SerializedName("Key")
            val key: String,
            @SerializedName("Value")
            val value: String
        )
    }

    data class View(
        @SerializedName("Components")
        val components: List<Component>,
        @SerializedName("Target")
        val target: String
    ) {
        data class Component(
            @SerializedName("Id")
            val id: String,
            @SerializedName("TemplateName")
            val templateName: String,
            @SerializedName("TrackingId")
            val trackingId: String,
            val type: String,
            @SerializedName("ViewData")
            val viewData: ViewData
        ) {
            data class ViewData(
                @SerializedName("Dishes")
                val dishes: Any?,
                @SerializedName("FocusedProperties")
                val focusedProperties: List<String>,
                @SerializedName("SeeAllFilterId")
                val seeAllFilterId: String?,
                @SerializedName("SeeAllSearchTarget")
                val seeAllSearchTarget: Any?,
                @SerializedName("SubTitle")
                val subTitle: Any?,
                @SerializedName("Title")
                val title: String?
            )
        }
    }
}