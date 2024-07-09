package com.erif.easyversion

import android.os.Build
import androidx.annotation.ChecksSdkIntAtLeast

class AndroidVersion {
    private val sdk = Build.VERSION.SDK_INT

    companion object {
        private val sdk = Build.VERSION.SDK_INT
        // Vanilla
        //private const val VANILLA = Build.VERSION_CODES.VANILLA_ICE_CREAM
        // Upside Down
        private const val UPSIDE_DOWN = Build.VERSION_CODES.UPSIDE_DOWN_CAKE
        // Tiramisu
        private const val TIRAMISU = Build.VERSION_CODES.TIRAMISU
        // Snow Cone
        private const val SNOW_CONE = Build.VERSION_CODES.S
        private const val SNOW_CONE_L = Build.VERSION_CODES.S_V2
        // Red Velvet Cake
        private const val RED_VELVET = Build.VERSION_CODES.R
        // Quince Tart
        private const val QUINCE_TART = Build.VERSION_CODES.Q
        // Pie
        private const val PIE = Build.VERSION_CODES.P
        // Oreo
        private const val OREO = Build.VERSION_CODES.O
        private const val OREO_MR1 = Build.VERSION_CODES.O_MR1
        // Nougat
        private const val NOUGAT = Build.VERSION_CODES.N
        private const val NOUGAT_MR1 = Build.VERSION_CODES.N_MR1
        // Marshmallow
        private const val MARSHMALLOW = Build.VERSION_CODES.M
        // Lollipop
        private const val LOLLIPOP = Build.VERSION_CODES.LOLLIPOP
        private const val LOLLIPOP_MR1 = Build.VERSION_CODES.LOLLIPOP_MR1

        /*--------------------------------- Vanilla 15 -------------------------------------------*/
        /*val `vanilla-15`: Vanilla get() { return AndroidVersion().Vanilla() }
        /**
         * Read only version Vanilla Ice Cream (Api: 15) - (Code: 35)
         * */
        @ChecksSdkIntAtLeast(api = VANILLA, lambda = 0)
        fun <T> `vanilla-15`(execution: () -> T): T? {
            return if (sdk >= VANILLA) { execution() } else null
        }*/

        /*-------------------------------- Upside Down 14 ----------------------------------------*/
        val `UpsideDown-14`: UpsideDown get() { return AndroidVersion().UpsideDown() }
        /**
         * Read only version Upside Down Cake (Api: 14) - (Code: 34)
         * */
        @ChecksSdkIntAtLeast(api = UPSIDE_DOWN, lambda = 0)
        fun <T> `UpsideDown-14`(execution: () -> T): T? {
            return if (sdk >= UPSIDE_DOWN) { execution() } else null
        }

        /*---------------------------------- Tiramisu 13 -----------------------------------------*/
        val `Tiramisu-13`: Tiramisu get() { return AndroidVersion().Tiramisu() }
        /**
         * Read only version Tiramisu (Api: 13) - (Code: 33)
         * */
        @ChecksSdkIntAtLeast(api = TIRAMISU, lambda = 0)
        fun <T> `Tiramisu-13`(execution: () -> T): T? {
            return if (sdk >= TIRAMISU) { execution() } else null
        }

        /*----------------------------- Snow Cone 12 And 12L -------------------------------------*/
        val `Snow-12L`: SnowConeL get() { return AndroidVersion().SnowConeL() }
        /**
         * Read only version Snow Cone L (Api: 12L) - (Code: 32)
         * */
        @ChecksSdkIntAtLeast(api = SNOW_CONE_L, lambda = 0)
        fun <T> `Snow-12L`(execution: () -> T): T? {
            return if (sdk >= SNOW_CONE_L) { execution() } else null
        }

        val `Snow-12`: SnowCone get() { return AndroidVersion().SnowCone() }
        /**
         * Read only version Snow Cone (Api: 12) - (Code: 31)
         * */
        @ChecksSdkIntAtLeast(api = SNOW_CONE, lambda = 0)
        fun <T> `Snow-12`(execution: () -> T): T? {
            return if (sdk >= SNOW_CONE) { execution() } else null
        }

        /*--------------------------------- Red Velvet 11 ----------------------------------------*/
        val `RedVelvet-11`: RedVelvet get() { return AndroidVersion().RedVelvet() }
        /**
         * Read only version Red Velvet (Api: 11) - (Code: 30)
         * */
        @ChecksSdkIntAtLeast(api = RED_VELVET, lambda = 0)
        fun <T> `RedVelvet-11`(execution: () -> T): T? {
            return if (sdk >= RED_VELVET) { execution() } else null
        }

        /*------------------------------------ Pie 10 --------------------------------------------*/
        val `QuinceTart-10`: QuinceTart get() { return AndroidVersion().QuinceTart() }
        /**
         * Read only version Quince Tart (Api: 10) - (Code: 29)
         * */
        @ChecksSdkIntAtLeast(api = QUINCE_TART, lambda = 0)
        fun <T> `QuinceTart-10`(execution: () -> T): T? {
            return if (sdk >= QUINCE_TART) { execution() } else null
        }

        /*--------------------------------- Pie 9.0 ----------------------------------------------*/
        val `Pie-9`: Pie get() { return AndroidVersion().Pie() }
        /**
         * Read only version Pie (Api: 9.0) - (Code: 28)
         * */
        @ChecksSdkIntAtLeast(api = PIE, lambda = 0)
        fun <T> `Pie-9`(execution: () -> T): T? {
            return if (sdk >= PIE) { execution() } else null
        }

        /*-------------------------------- Oreo 8.0 And 8.1 --------------------------------------*/
        val `Oreo-8_1`: OreoMR1 get() { return AndroidVersion().OreoMR1() }
        /**
         * Read only version Oreo MR1 (Api: 8.1) - (Code: 27)
         * */
        @ChecksSdkIntAtLeast(api = OREO_MR1, lambda = 0)
        fun <T> `Oreo-8_1`(execution: () -> T): T? {
            return if (sdk >= OREO_MR1) { execution() } else null
        }

        val `Oreo-8`: Oreo get() { return AndroidVersion().Oreo() }
        /**
         * Read only version Oreo (Api: 8.0) - (Code: 26)
         * */
        @ChecksSdkIntAtLeast(api = OREO, lambda = 0)
        fun <T> `Oreo-8`(execution: () -> T): T? {
            return if (sdk >= OREO) { execution() } else null
        }

        /*-------------------------------- Nougat 7.0 And 7.1 ------------------------------------*/
        val `Nougat-7_1`: NougatMR1 get() { return AndroidVersion().NougatMR1() }
        /**
         * Read only version Nougat MR1 (Api: 7.1) - (Code: 25)
         * */
        @ChecksSdkIntAtLeast(api = NOUGAT_MR1, lambda = 0)
        fun <T> `Nougat-7_1`(execution: () -> T): T? {
            return if (sdk >= NOUGAT_MR1) { execution() } else null
        }

        val `Nougat-7`: Nougat get() { return AndroidVersion().Nougat() }
        /**
         * Read only version Nougat (Api: 7.0) - (Code: 24)
         * */
        @ChecksSdkIntAtLeast(api = NOUGAT, lambda = 0)
        fun <T> `Nougat-7`(execution: () -> T): T? {
            return if (sdk >= NOUGAT) { execution() } else null
        }

        /*--------------------------------- Marshmallow 6.0 --------------------------------------*/
        val `Marshmallow-6`: MarshMallow get() { return AndroidVersion().MarshMallow() }
        /**
         * Read only version Marshmallow (Api: 6.0) - (Code: 23)
         * */
        @ChecksSdkIntAtLeast(api = MARSHMALLOW, lambda = 0)
        fun <T> `Marshmallow-6`(execution: () -> T): T? {
            return if (sdk >= MARSHMALLOW) { execution() } else null
        }

        /*-------------------------------- Lollipop 5.0 And 5.1 ----------------------------------*/
        val `Lollipop-5_1`: LollipopMR1 get() { return AndroidVersion().LollipopMR1() }
        /**
         * Read only version Lollipop MR1 (Api: 5.1) - (Code: 22)
         * */
        @ChecksSdkIntAtLeast(api = LOLLIPOP_MR1, lambda = 0)
        fun <T> `Lollipop-5_1`(execution: () -> T): T? {
            return if (sdk >= LOLLIPOP_MR1) { execution() } else null
        }

        val `Lollipop-5`: Lollipop get() { return AndroidVersion().Lollipop() }
        /**
         * Read only version Lollipop (Api: 5.0) - (Code: 21)
         * */
        @ChecksSdkIntAtLeast(api = LOLLIPOP, lambda = 0)
        fun <T> `Lollipop-5`(execution: () -> T): T? {
            return if (sdk >= LOLLIPOP) { execution() } else null
        }
    }

    /*inner class Vanilla {
        /**
         * Read version Vanilla Ice Cream (Android: 15) - (Api: 35) and above
         * */
        @ChecksSdkIntAtLeast(api = VANILLA, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= VANILLA) { execution() } else null
        }

        /**
         * Read version Vanilla Ice Cream (Android: 15) - (Code: 35) and below
         * */
        @ChecksSdkIntAtLeast(api = VANILLA, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= VANILLA) { execution() } else null
        }
    }*/

    inner class UpsideDown {
        /**
         * Read version Upside Down Cake (Android: 14) - (Api: 34) and above
         * */
        @ChecksSdkIntAtLeast(api = UPSIDE_DOWN, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= UPSIDE_DOWN) { execution() } else null
        }

        /**
         * Read version Upside Down Cake (Android: 14) - (Code: 34) and below
         * */
        @ChecksSdkIntAtLeast(api = UPSIDE_DOWN, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= UPSIDE_DOWN) { execution() } else null
        }
    }

    inner class Tiramisu {
        /**
         * Read version Tiramisu (Android: 13) - (Api: 33) and above
         * */
        @ChecksSdkIntAtLeast(api = TIRAMISU, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= TIRAMISU) { execution() } else null
        }

        /**
         * Read version Tiramisu (Android: 13) - (Code: 33) and below
         * */
        @ChecksSdkIntAtLeast(api = TIRAMISU, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= TIRAMISU) { execution() } else null
        }
    }

    inner class SnowConeL {
        /**
         * Read version Snow Cone L (Android: 12L) - (Api: 32) and above
         * */
        @ChecksSdkIntAtLeast(api = SNOW_CONE_L, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= SNOW_CONE_L) { execution() } else null
        }

        /**
         * Read version Snow Cone L (Android: 12L) - (Api: 32) and below
         * */
        @ChecksSdkIntAtLeast(api = SNOW_CONE_L, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= SNOW_CONE_L) { execution() } else null
        }
    }

    inner class SnowCone {
        /**
         * Read version Snow Cone (Android: 12) - (Api: 31) and above
         * */
        @ChecksSdkIntAtLeast(api = SNOW_CONE, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= SNOW_CONE) { execution() } else null
        }

        /**
         * Read version Snow Cone (Android: 12) - (Api: 31) and below
         * */
        @ChecksSdkIntAtLeast(api = SNOW_CONE, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= SNOW_CONE) { execution() } else null
        }
    }

    inner class RedVelvet {
        /**
         * Read version Red Velvet (Android: 11) - (Api: 30) and above
         * */
        @ChecksSdkIntAtLeast(api = RED_VELVET, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= RED_VELVET) { execution() } else null
        }

        /**
         * Read version Red Velvet (Android: 11) - (Api: 30) and below
         * */
        @ChecksSdkIntAtLeast(api = RED_VELVET, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= RED_VELVET) { execution() } else null
        }
    }

    inner class QuinceTart {
        /**
         * Read version Quince Tart (Android: 10) - (Api: 29) and above
         * */
        @ChecksSdkIntAtLeast(api = QUINCE_TART, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= QUINCE_TART) { execution() } else null
        }

        /**
         * Read version Quince Tart (Android: 10) - (Api: 29) and below
         * */
        @ChecksSdkIntAtLeast(api = QUINCE_TART, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= QUINCE_TART) { execution() } else null
        }
    }

    inner class Pie {
        /**
         * Read version Pie (Android: 9.0) - (Api: 28) and above
         * */
        @ChecksSdkIntAtLeast(api = PIE, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= PIE) { execution() } else null
        }

        /**
         * Read version Pie (Android: 9.0) - (Api: 28) and below
         * */
        @ChecksSdkIntAtLeast(api = PIE, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= PIE) { execution() } else null
        }
    }

    inner class OreoMR1 {
        /**
         * Read version Oreo MR1 (Android: 8.1) - (Api: 25) and above
         * */
        @ChecksSdkIntAtLeast(api = OREO_MR1, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= OREO_MR1) { execution() } else null
        }

        /**
         * Read version Oreo MR1 (Android: 8.1) - (Api: 25) and below
         * */
        @ChecksSdkIntAtLeast(api = OREO_MR1, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= OREO_MR1) { execution() } else null
        }
    }

    inner class Oreo {
        /**
         * Read version Oreo (Android: 8.0) - (Api: 26) and above
         * */
        @ChecksSdkIntAtLeast(api = OREO, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= OREO) { execution() } else null
        }

        /**
         * Read version Oreo (Android: 8.0) - (Api: 26) and below
         * */
        @ChecksSdkIntAtLeast(api = OREO, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= OREO) { execution() } else null
        }
    }

    inner class NougatMR1 {
        /**
         * Read version NOUGAT MR1 (Android: 7.1) - (Api: 25) and above
         * */
        @ChecksSdkIntAtLeast(api = NOUGAT_MR1, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= NOUGAT_MR1) { execution() } else null
        }

        /**
         * Read version NOUGAT MR1 (Android: 7.1) - (Api: 25) and below
         * */
        @ChecksSdkIntAtLeast(api = NOUGAT_MR1, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= NOUGAT_MR1) { execution() } else null
        }
    }

    inner class Nougat {
        /**
         * Read version Nougat (Android: 7.0) - (Api: 24) and above
         * */
        @ChecksSdkIntAtLeast(api = NOUGAT, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= NOUGAT) { execution() } else null
        }

        /**
         * Read version Nougat (Android: 7.0) - (Api: 24) and below
         * */
        @ChecksSdkIntAtLeast(api = NOUGAT, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= NOUGAT) { execution() } else null
        }
    }

    inner class MarshMallow {
        /**
         * Read version Marshmallow (Android: 6.0) - (Api: 23) and above
         * */
        @ChecksSdkIntAtLeast(api = MARSHMALLOW, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= MARSHMALLOW) { execution() } else null
        }

        /**
         * Read version Marshmallow (Android: 6.0) - (Api: 23) and below
         * */
        @ChecksSdkIntAtLeast(api = MARSHMALLOW, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= MARSHMALLOW) { execution() } else null
        }
    }

    inner class LollipopMR1 {
        /**
         * Read version Lollipop MR1 (Android: 5.1) - (Api: 22) and above
         * */
        @ChecksSdkIntAtLeast(api = LOLLIPOP_MR1, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= LOLLIPOP_MR1) { execution() } else null
        }

        /**
         * Read version Lollipop MR1 (Android: 5.1) - (Api: 22) and below
         * */
        @ChecksSdkIntAtLeast(api = LOLLIPOP_MR1, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= LOLLIPOP_MR1) { execution() } else null
        }
    }

    inner class Lollipop {
        /**
         * Read version Lollipop (Android: 5.0) - (Api: 21) and above
         * */
        @ChecksSdkIntAtLeast(api = LOLLIPOP, lambda = 0)
        fun <T> andUp(execution: () -> T): T? {
            return if (sdk >= LOLLIPOP) { execution() } else null
        }

        /**
         * Read version Lollipop (Android: 5.0) - (Api: 21) and below
         * */
        @ChecksSdkIntAtLeast(api = LOLLIPOP, lambda = 0)
        fun <T> andDown(execution: () -> T): T? {
            return if (sdk <= LOLLIPOP) { execution() } else null
        }
    }
}