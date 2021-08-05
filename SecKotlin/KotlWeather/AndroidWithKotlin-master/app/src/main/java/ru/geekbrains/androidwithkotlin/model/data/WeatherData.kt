package ru.geekbrains.androidwithkotlin.model.data

import ru.geekbrains.androidwithkotlin.R

fun getWorldCities(): List<Weather> {
    return listOf(
        Weather(
            City("Лондон", 51.5085300, -0.1257400),
            R.drawable.ic_baseline_wb_sunny_24,
            6,
            10,
            645
        ),
        Weather(City("Токио", 35.6895000, 139.6917100), R.drawable.ic_cloudy, 4),
        Weather(
            City("Париж", 48.8534100, 2.3488000),
            R.drawable.ic_baseline_wb_sunny_24,
            -2,
            -7,
            770
        ),
        Weather(
            City("Берлин", 52.52000659999999, 13.404953999999975),
            R.drawable.ic_cloudy,
            8,
            9,
            554
        ),
        Weather(
            City("Рим", 41.9027835, 12.496365500000024),
            R.drawable.ic_baseline_wb_sunny_24,
            10,
            14,
            1000
        ),
        /*  Weather(City("Минск", 53.90453979999999, 27.561524400000053), 11, 12),
          Weather(City("Стамбул", 41.0082376, 28.97835889999999), 13, 14),
          Weather(City("Вашингтон", 38.9071923, -77.03687070000001), 15, 16),
          Weather(City("Киев", 50.4501, 30.523400000000038), 17, 18),
          Weather(City("Пекин", 39.90419989999999, 116.40739630000007), 19, 20)*/
    )
}

fun getRussianCities(): List<Weather> {
    return listOf(
        Weather(
            City("Москва", 55.755826, 37.617299900000035),
            R.drawable.ic_baseline_wb_sunny_24,
            22,
            25,
            750
        ),
        Weather(
            City("Санкт-Петербург", 59.9342802, 30.335098600000038),
            R.drawable.cloudy,
            10,
            5,
            740
        ),
        Weather(
            City("Новосибирск", 55.00835259999999, 82.93573270000002),
            R.drawable.ic_brightness_medium,
            6,
            4,
            760
        ),
        Weather(
            City("Екатеринбург", 56.83892609999999, 60.60570250000001),
            R.drawable.ic_snow,
            -2,
            -4,
            854
        ),
        Weather(
            City("Нижний Новгород", 56.2965039, 43.936059),
            R.drawable.ic_brightness_medium,
            10,
            12,
            754
        ),
        Weather(
            City("Казань", 55.8304307, 49.06608060000008),
            R.drawable.ic_baseline_wb_sunny_24,
            12,
            15,
            766
        ),
//        Weather(City("Челябинск", 55.1644419, 61.4368432), 13, 14),
//        Weather(City("Омск", 54.9884804, 73.32423610000001), 15, 16),
//        Weather(City("Ростов-на-Дону", 47.2357137, 39.701505), 17, 18),
//        Weather(City("Уфа", 54.7387621, 55.972055400000045), 19, 20)
    )
}

