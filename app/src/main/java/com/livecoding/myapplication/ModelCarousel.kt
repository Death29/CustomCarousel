package com.livecoding.myapplication

data class DummyClassInformationProduct(
    val title: String,
    val description: String,
    val listProfit: List<String>
)

fun getDummyClassInformation(): List<DummyClassInformationProduct>{
    return listOf(
        DummyClassInformationProduct(
            "Deposito BTN Ritel Rupiah",
            "Keuntungan yang tinggi bisa dengan mudah Anda dapatkan dengan Deposito BTN Ritel Rupiah yang diperuntukan bagi Anda yang gemar berinvestasi berjangka dengan keuntungan yang besar dan suku bunga yang juga menarik\n" +
                    "Memberikan kemudahan kepada Anda untuk investasi berjangka dengan benefit yang tinggi, yang penyetorannya maupun penarikannya hanya bisa dilakukan pada waktu tertentu saja. Investasi yang dilakukan dalam mata uang rupiah dengan suku bunga yang menarik dan bersaing.",
            listOf(
                "Bunga deposito dapat dikapitalisasikan ke dalam pokok",
                "Bunga deposito dapat dipindah bukukan untuk pembayaran angsuran rumah, tagihan rekening listrik dan telepon",
                "Dapat dijadikan sebagai jaminan kredit (Kredit Swadana)",
                "Terdapat bilyet deposito (sertifikat)",
                "Suku bunga bersaing",
                "Mendapatkan Cashback Istimewa"
            )
        ),
        DummyClassInformationProduct(
            "Deposito BTN Ritel Valas",
            "Nikmati keuntungan dan kemudahan bertransaksi berkali-kali lipat dengan Deposito BTN Ritel Valas yang dikhususkan bagi Anda yang gemar berinvestasi berjangka dengan mata uang asing\n" +
                    "Jika Anda gemar berinvestasi dengan mata uang asing maka produk dari Bank BTN ini kira-kira sangat cocok bagi Anda. Deposito BTN merupakan produk tabungan sebagai media investasi dengan penyimpanan dana dalam mata uang asing (USD) yang hanya bisa dilakukan pada waktu tertentu dengan suku bunga yang menarik",
            listOf(
                "Dapat dijadikan sebagai jaminan kredit (Kredit Swadana)",
                "Bunga deposito dapat dikapitalisasikan ke dalam pokok",
                "Bunga deposito dapat dipindah bukukan untuk pembayaran angsuran rumah, tagihan rekening listrik dan telepon"
            )
        ),
        DummyClassInformationProduct(
            "Deposito BTN Lembaga",
            "Investasi aman dengan keuntungan berlipat, Deposito BTN Lembaga adalah solusinya. Ditujukan untuk memberikan kenyamanan dan kemudahan bagi Anda dalam berinvestasi jangka panjang\n" +
                    "Simpanan berjangka untuk investasi perusahaan Anda yang aman dan terpercaya dalam jangka waktu tertentu, bunga yang menarik, dan dapat digunakan sebagai jaminan kredit.",
            listOf(
                "Dapat dijadikan sebagai jaminan kredit (Kredit Swadana)",
                "Bunga deposito dapat dikapitalisasikan ke dalam pokok",
                "Bunga menarik dan bersaing dengan Bank lain"
            )
        ),
        DummyClassInformationProduct(
            "Deposito BTN Lembaga Valas",
            "Nikmati keuntungan berlipat dan dijamin keamanannya dengan Deposito BTN Lembaga Valas yang dikhususkan bagi perusahaan yang gemar berinvestasi berjangka dengan mata uang asing\n" +
                    "Jika perusahaan Anda akan berinvestasi dengan mata uang asing maka produk dari Bank BTN ini sangat cocok bagi Anda. Deposito BTN Lembaga Valas merupakan media investasi simpanan berjangka dalam mata uang asing dengan suku bunga yang kompetitif.",
            listOf(
                "Bunga deposito dapat dikapitalisasikan ke dalam pokok",
                "Fleksibilitas dalam waktu penempatan 1, 3, 6, 12, dan 24 bulan",
                "Dapat dibuka di seluruh Kantor Cabang Devisa"
            )
        )
    )
}