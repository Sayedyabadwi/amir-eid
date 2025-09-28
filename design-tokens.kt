// Design Tokens - Kotlin Constants
object DesignTokens {

    // MARK: - Colors
    @JvmStatic
    val PrimaryLight = Color(0xFF2563EB)

    @JvmStatic
    val PrimaryDark = Color(0xFF3B82F6)

    @JvmStatic
    fun Primary(context: Context): Color {
        return if (isDarkMode(context)) PrimaryDark else PrimaryLight
    }

    @JvmStatic
    val PrimaryPressedLight = Color(0xFF1D4ED8)

    @JvmStatic
    val PrimaryPressedDark = Color(0xFF2563EB)

    @JvmStatic
    fun PrimaryPressed(context: Context): Color {
        return if (isDarkMode(context)) PrimaryPressedDark else PrimaryPressedLight
    }

    @JvmStatic
    val PrimaryActiveLight = Color(0xFF1E40AF)

    @JvmStatic
    val PrimaryActiveDark = Color(0xFF1D4ED8)

    @JvmStatic
    fun PrimaryActive(context: Context): Color {
        return if (isDarkMode(context)) PrimaryActiveDark else PrimaryActiveLight
    }

    @JvmStatic
    val PrimaryDisabledLight = Color(0xFF93C5FD)

    @JvmStatic
    val PrimaryDisabledDark = Color(0xFF1E3A8A)

    @JvmStatic
    fun PrimaryDisabled(context: Context): Color {
        return if (isDarkMode(context)) PrimaryDisabledDark else PrimaryDisabledLight
    }

    @JvmStatic
    val SecondaryLight = Color(0xFFF3F4F6)

    @JvmStatic
    val SecondaryDark = Color(0xFF374151)

    @JvmStatic
    fun Secondary(context: Context): Color {
        return if (isDarkMode(context)) SecondaryDark else SecondaryLight
    }

    @JvmStatic
    val SecondaryPressedLight = Color(0xFFE5E7EB)

    @JvmStatic
    val SecondaryPressedDark = Color(0xFF4B5563)

    @JvmStatic
    fun SecondaryPressed(context: Context): Color {
        return if (isDarkMode(context)) SecondaryPressedDark else SecondaryPressedLight
    }

    @JvmStatic
    val BgColorLight = Color(0xFFFFFFFF)

    @JvmStatic
    val BgColorDark = Color(0xFF0F172A)

    @JvmStatic
    fun BgColor(context: Context): Color {
        return if (isDarkMode(context)) BgColorDark else BgColorLight
    }

    @JvmStatic
    val SurfaceLight = Color(0xFFF9FAFB)

    @JvmStatic
    val SurfaceDark = Color(0xFF1E293B)

    @JvmStatic
    fun Surface(context: Context): Color {
        return if (isDarkMode(context)) SurfaceDark else SurfaceLight
    }

    @JvmStatic
    val PrimaryTextLight = Color(0xFF111827)

    @JvmStatic
    val PrimaryTextDark = Color(0xFFF8FAFC)

    @JvmStatic
    fun PrimaryText(context: Context): Color {
        return if (isDarkMode(context)) PrimaryTextDark else PrimaryTextLight
    }

    @JvmStatic
    val SecondaryTextLight = Color(0xFF6B7280)

    @JvmStatic
    val SecondaryTextDark = Color(0xFFCBD5E1)

    @JvmStatic
    fun SecondaryText(context: Context): Color {
        return if (isDarkMode(context)) SecondaryTextDark else SecondaryTextLight
    }

    @JvmStatic
    val TextDisabledLight = Color(0xFF9CA3AF)

    @JvmStatic
    val TextDisabledDark = Color(0xFF64748B)

    @JvmStatic
    fun TextDisabled(context: Context): Color {
        return if (isDarkMode(context)) TextDisabledDark else TextDisabledLight
    }

    @JvmStatic
    val OnPrimaryTextLight = Color(0xFFFFFFFF)

    @JvmStatic
    val OnPrimaryTextDark = Color(0xFFFFFFFF)

    @JvmStatic
    fun OnPrimaryText(context: Context): Color {
        return if (isDarkMode(context)) OnPrimaryTextDark else OnPrimaryTextLight
    }

    @JvmStatic
    val CardLight = Color(0xFFFFFFFF)

    @JvmStatic
    val CardDark = Color(0xFF1E293B)

    @JvmStatic
    fun Card(context: Context): Color {
        return if (isDarkMode(context)) CardDark else CardLight
    }

    @JvmStatic
    val DividerLight = Color(0xFFE5E7EB)

    @JvmStatic
    val DividerDark = Color(0xFF334155)

    @JvmStatic
    fun Divider(context: Context): Color {
        return if (isDarkMode(context)) DividerDark else DividerLight
    }

    @JvmStatic
    val ErrorLight = Color(0xFFDC2626)

    @JvmStatic
    val ErrorDark = Color(0xFFEF4444)

    @JvmStatic
    fun Error(context: Context): Color {
        return if (isDarkMode(context)) ErrorDark else ErrorLight
    }

    @JvmStatic
    val SuccessLight = Color(0xFF16A34A)

    @JvmStatic
    val SuccessDark = Color(0xFF22C55E)

    @JvmStatic
    fun Success(context: Context): Color {
        return if (isDarkMode(context)) SuccessDark else SuccessLight
    }

    @JvmStatic
    val WarningLight = Color(0xFFD97706)

    @JvmStatic
    val WarningDark = Color(0xFFF59E0B)

    @JvmStatic
    fun Warning(context: Context): Color {
        return if (isDarkMode(context)) WarningDark else WarningLight
    }

    @JvmStatic
    val InfoLight = Color(0xFF0EA5E9)

    @JvmStatic
    val InfoDark = Color(0xFF06B6D4)

    @JvmStatic
    fun Info(context: Context): Color {
        return if (isDarkMode(context)) InfoDark else InfoLight
    }

    // MARK: - Typography
    // Font Families
    @JvmStatic
    val MainFont = "Inter"

    @JvmStatic
    val DisplayFont = "Poppins"

    // Font Weights
    @JvmStatic
    val FontWeightLight = FontWeight.w300

    @JvmStatic
    val FontWeightRegular = FontWeight.w400

    @JvmStatic
    val FontWeightMedium = FontWeight.w500

    @JvmStatic
    val FontWeightSemiBold = FontWeight.w600

    @JvmStatic
    val FontWeightBold = FontWeight.w700

    // Font Sizes
    @JvmStatic
    val FontSizeXS = 12.sp

    @JvmStatic
    val FontSizeS = 14.sp

    @JvmStatic
    val FontSizeMD = 16.sp

    @JvmStatic
    val FontSizeLG = 18.sp

    @JvmStatic
    val FontSizeXL = 20.sp

    @JvmStatic
    val FontSizeXXL = 24.sp

    @JvmStatic
    val FontSizeXXXL = 32.sp

    @JvmStatic
    val FontSizeDisplay = 48.sp

    // Line Heights
    @JvmStatic
    val LineHeightTight = 1.25

    @JvmStatic
    val LineHeightNormal = 1.5

    @JvmStatic
    val LineHeightRelaxed = 1.625

    @JvmStatic
    val LineHeightLoose = 2

    // Letter Spacings
    @JvmStatic
    val LetterSpacingTight = -0.002.em

    @JvmStatic
    val LetterSpacingNormal = 0.000.em

    @JvmStatic
    val LetterSpacingWide = 0.002.em

    @JvmStatic
    val LetterSpacingWider = 0.003.em

    // MARK: - Spacing
    @JvmStatic
    val SpacingXS = 4.dp

    @JvmStatic
    val SpacingS = 8.dp

    @JvmStatic
    val SpacingMD = 16.dp

    @JvmStatic
    val SpacingLG = 24.dp

    @JvmStatic
    val SpacingXL = 32.dp

    @JvmStatic
    val SpacingXXL = 40.dp

    @JvmStatic
    val SpacingXXXL = 48.dp

    @JvmStatic
    val SpacingXXXXL = 64.dp

    // MARK: - Sizing
    @JvmStatic
    val SizingXS = 24.dp

    @JvmStatic
    val SizingS = 32.dp

    @JvmStatic
    val SizingMD = 40.dp

    @JvmStatic
    val SizingLG = 48.dp

    @JvmStatic
    val SizingXL = 56.dp

    @JvmStatic
    val SizingXXL = 64.dp

    @JvmStatic
    val SizingXXXL = 80.dp

    @JvmStatic
    val HeightButton = 44.dp

    @JvmStatic
    val HeightInput = 48.dp

    @JvmStatic
    val HeightCard = 120.dp

    @JvmStatic
    val WidthSidebar = 280.dp

    @JvmStatic
    val WidthModal = 400.dp

    @JvmStatic
    val WidthContainer = 1200.dp

    @JvmStatic
    val IconSizeXS = 12.dp

    @JvmStatic
    val IconSizeS = 16.dp

    @JvmStatic
    val IconSizeMD = 20.dp

    @JvmStatic
    val IconSizeLG = 24.dp

    @JvmStatic
    val IconSizeXL = 32.dp

    // MARK: - Border Radius
    @JvmStatic
    val BorderRadiusXS = 4.dp

    @JvmStatic
    val BorderRadiusS = 8.dp

    @JvmStatic
    val BorderRadiusMD = 12.dp

    @JvmStatic
    val BorderRadiusLG = 16.dp

    @JvmStatic
    val BorderRadiusXL = 20.dp

    @JvmStatic
    val BorderRadiusXXL = 24.dp

    @JvmStatic
    val BorderRadiusFull = 9999.dp

    // MARK: - Borders
    @JvmStatic
    val BorderThin = 1.dp

    @JvmStatic
    val BorderMedium = 1.5.dp

    @JvmStatic
    val BorderThick = 2.dp

    @JvmStatic
    val BorderFocus = 3.dp

    // MARK: - Shadows
    // Small Shadows
    @JvmStatic
    val BoxShadowS = Shadow(
        color = Color(0xFF000000).copy(alpha = 0.25f),
        offset = Offset(0.dp, 1.dp),
        blurRadius = 3.dp
    )

    // Medium Shadows
    @JvmStatic
    val BoxShadowMD = Shadow(
        color = Color(0xFF000000).copy(alpha = 0.25f),
        offset = Offset(0.dp, 4.dp),
        blurRadius = 6.dp
    )

    // Large Shadows
    @JvmStatic
    val BoxShadowLG = Shadow(
        color = Color(0xFF000000).copy(alpha = 0.25f),
        offset = Offset(0.dp, 10.dp),
        blurRadius = 15.dp
    )

    // MARK: - Opacities
    @JvmStatic
    val ShadowOpacity = 0.1.f

    @JvmStatic
    val OverlayOpacity = 0.6.f

    @JvmStatic
    val DisabledOpacity = 0.4.f

    // MARK: - Z-Indices
    @JvmStatic
    val ZIndexDropdown = 1000

    @JvmStatic
    val ZIndexModal = 1050

    @JvmStatic
    val ZIndexTooltip = 1100

    // MARK: - Transitions
    @JvmStatic
    val TransitionFast = 150

    @JvmStatic
    val TransitionNormal = 200

    @JvmStatic
    val TransitionSlow = 300

    // MARK: - Utility Functions
    @JvmStatic
    fun isDarkMode(context: Context): Boolean {
        val configuration = context.resources.configuration
        val currentNightMode = configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        return currentNightMode == Configuration.UI_MODE_NIGHT_YES
    }

    @JvmStatic
    fun getThemeColors(context: Context): Colors {
        return if (isDarkMode(context)) darkColors else lightColors
    }

    @JvmStatic
    fun getTextColor(context: Context): Color {
        return if (isDarkMode(context)) Color.White else Color.Black
    }
}

