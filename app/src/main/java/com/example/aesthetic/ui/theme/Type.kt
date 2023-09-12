package com.example.aesthetic.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.aesthetic.R

//region --- Font Families ---
val manropeFamily = FontFamily(
    Font(R.font.manrope_ExtraLight, FontWeight.ExtraLight),
    Font(R.font.manrope_Light, FontWeight.Light),
    Font(R.font.manrope_Regular, FontWeight.Normal),
    Font(R.font.manrope_Medium, FontWeight.Medium),
    Font(R.font.manrope_SemiBold, FontWeight.SemiBold),
    Font(R.font.manrope_Bold, FontWeight.Bold),
    Font(R.font.manrope_ExtraBold, FontWeight.ExtraBold)
)
//endregion

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = manropeFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = manropeFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = manropeFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)