// Design Tokens - SwiftUI Constants
import SwiftUI

public enum DesignTokens {

    // MARK: - Colors
    static let PrimaryLight = Color(red: 1, green: 0.1450980392156863, blue: 0.38823529411764707)

    static let PrimaryDark = Color(red: 1, green: 0.23137254901960785, blue: 0.5098039215686274)

    static func Primary(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? PrimaryDark : PrimaryLight
    }

    static let PrimaryPressedLight = Color(red: 1, green: 0.11372549019607843, blue: 0.3058823529411765)

    static let PrimaryPressedDark = Color(red: 1, green: 0.1450980392156863, blue: 0.38823529411764707)

    static func PrimaryPressed(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? PrimaryPressedDark : PrimaryPressedLight
    }

    static let PrimaryActiveLight = Color(red: 1, green: 0.11764705882352941, blue: 0.25098039215686274)

    static let PrimaryActiveDark = Color(red: 1, green: 0.11372549019607843, blue: 0.3058823529411765)

    static func PrimaryActive(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? PrimaryActiveDark : PrimaryActiveLight
    }

    static let PrimaryDisabledLight = Color(red: 1, green: 0.5764705882352941, blue: 0.7725490196078432)

    static let PrimaryDisabledDark = Color(red: 1, green: 0.11764705882352941, blue: 0.22745098039215686)

    static func PrimaryDisabled(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? PrimaryDisabledDark : PrimaryDisabledLight
    }

    static let SecondaryLight = Color(red: 1, green: 0.9529411764705882, blue: 0.9568627450980393)

    static let SecondaryDark = Color(red: 1, green: 0.21568627450980393, blue: 0.2549019607843137)

    static func Secondary(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? SecondaryDark : SecondaryLight
    }

    static let SecondaryPressedLight = Color(red: 1, green: 0.8980392156862745, blue: 0.9058823529411765)

    static let SecondaryPressedDark = Color(red: 1, green: 0.29411764705882354, blue: 0.3333333333333333)

    static func SecondaryPressed(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? SecondaryPressedDark : SecondaryPressedLight
    }

    static let BgColorLight = Color(red: 1, green: 1, blue: 1)

    static let BgColorDark = Color(red: 1, green: 0.058823529411764705, blue: 0.09019607843137255)

    static func BgColor(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? BgColorDark : BgColorLight
    }

    static let SurfaceLight = Color(red: 1, green: 0.9764705882352941, blue: 0.9803921568627451)

    static let SurfaceDark = Color(red: 1, green: 0.11764705882352941, blue: 0.1607843137254902)

    static func Surface(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? SurfaceDark : SurfaceLight
    }

    static let PrimaryTextLight = Color(red: 1, green: 0.06666666666666667, blue: 0.09411764705882353)

    static let PrimaryTextDark = Color(red: 1, green: 0.9725490196078431, blue: 0.9803921568627451)

    static func PrimaryText(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? PrimaryTextDark : PrimaryTextLight
    }

    static let SecondaryTextLight = Color(red: 1, green: 0.4196078431372549, blue: 0.4470588235294118)

    static let SecondaryTextDark = Color(red: 1, green: 0.796078431372549, blue: 0.8352941176470589)

    static func SecondaryText(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? SecondaryTextDark : SecondaryTextLight
    }

    static let TextDisabledLight = Color(red: 1, green: 0.611764705882353, blue: 0.6392156862745098)

    static let TextDisabledDark = Color(red: 1, green: 0.39215686274509803, blue: 0.4549019607843137)

    static func TextDisabled(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? TextDisabledDark : TextDisabledLight
    }

    static let OnPrimaryTextLight = Color(red: 1, green: 1, blue: 1)

    static let OnPrimaryTextDark = Color(red: 1, green: 1, blue: 1)

    static func OnPrimaryText(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? OnPrimaryTextDark : OnPrimaryTextLight
    }

    static let CardLight = Color(red: 1, green: 1, blue: 1)

    static let CardDark = Color(red: 1, green: 0.11764705882352941, blue: 0.1607843137254902)

    static func Card(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? CardDark : CardLight
    }

    static let DividerLight = Color(red: 1, green: 0.8980392156862745, blue: 0.9058823529411765)

    static let DividerDark = Color(red: 1, green: 0.2, blue: 0.2549019607843137)

    static func Divider(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? DividerDark : DividerLight
    }

    static let ErrorLight = Color(red: 1, green: 0.8627450980392157, blue: 0.14901960784313725)

    static let ErrorDark = Color(red: 1, green: 0.9372549019607843, blue: 0.26666666666666666)

    static func Error(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? ErrorDark : ErrorLight
    }

    static let SuccessLight = Color(red: 1, green: 0.08627450980392157, blue: 0.6392156862745098)

    static let SuccessDark = Color(red: 1, green: 0.13333333333333333, blue: 0.7725490196078432)

    static func Success(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? SuccessDark : SuccessLight
    }

    static let WarningLight = Color(red: 1, green: 0.8509803921568627, blue: 0.4666666666666667)

    static let WarningDark = Color(red: 1, green: 0.9607843137254902, blue: 0.6196078431372549)

    static func Warning(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? WarningDark : WarningLight
    }

    static let InfoLight = Color(red: 1, green: 0.054901960784313725, blue: 0.6470588235294118)

    static let InfoDark = Color(red: 1, green: 0.023529411764705882, blue: 0.7137254901960784)

    static func Info(colorScheme: ColorScheme) -> Color {
        return colorScheme == .dark ? InfoDark : InfoLight
    }

    // MARK: - Typography
    // Font Families
    static let MainFont = "Inter"

    static let DisplayFont = "Poppins"

    // Font Weights
    static let FontWeightLight = Font.Weight.light

    static let FontWeightRegular = Font.Weight.regular

    static let FontWeightMedium = Font.Weight.medium

    static let FontWeightSemiBold = Font.Weight.semibold

    static let FontWeightBold = Font.Weight.bold

    // Font Sizes
    static let FontSizeXS = CGFloat(12)

    static let FontSizeS = CGFloat(14)

    static let FontSizeMD = CGFloat(16)

    static let FontSizeLG = CGFloat(18)

    static let FontSizeXL = CGFloat(20)

    static let FontSizeXXL = CGFloat(24)

    static let FontSizeXXXL = CGFloat(32)

    static let FontSizeDisplay = CGFloat(48)

    // Line Heights
    static let LineHeightTight = CGFloat(1.25)

    static let LineHeightNormal = CGFloat(1.5)

    static let LineHeightRelaxed = CGFloat(1.625)

    static let LineHeightLoose = CGFloat(2)

    // Letter Spacings
    static let LetterSpacingTight = CGFloat(-0.002)

    static let LetterSpacingNormal = CGFloat(0.000)

    static let LetterSpacingWide = CGFloat(0.002)

    static let LetterSpacingWider = CGFloat(0.003)

    // MARK: - Spacing
    static let SpacingXS = CGFloat(4)

    static let SpacingS = CGFloat(8)

    static let SpacingMD = CGFloat(16)

    static let SpacingLG = CGFloat(24)

    static let SpacingXL = CGFloat(32)

    static let SpacingXXL = CGFloat(40)

    static let SpacingXXXL = CGFloat(48)

    static let SpacingXXXXL = CGFloat(64)

    // MARK: - Sizing
    static let SizingXS = CGFloat(24)

    static let SizingS = CGFloat(32)

    static let SizingMD = CGFloat(40)

    static let SizingLG = CGFloat(48)

    static let SizingXL = CGFloat(56)

    static let SizingXXL = CGFloat(64)

    static let SizingXXXL = CGFloat(80)

    static let HeightButton = CGFloat(44)

    static let HeightInput = CGFloat(48)

    static let HeightCard = CGFloat(120)

    static let WidthSidebar = CGFloat(280)

    static let WidthModal = CGFloat(400)

    static let WidthContainer = CGFloat(1200)

    static let IconSizeXS = CGFloat(12)

    static let IconSizeS = CGFloat(16)

    static let IconSizeMD = CGFloat(20)

    static let IconSizeLG = CGFloat(24)

    static let IconSizeXL = CGFloat(32)

    // MARK: - Border Radius
    static let BorderRadiusXS = CGFloat(4)

    static let BorderRadiusS = CGFloat(8)

    static let BorderRadiusMD = CGFloat(12)

    static let BorderRadiusLG = CGFloat(16)

    static let BorderRadiusXL = CGFloat(20)

    static let BorderRadiusXXL = CGFloat(24)

    static let BorderRadiusFull = CGFloat(9999)

    // MARK: - Borders
    static let BorderThin = CGFloat(1)

    static let BorderMedium = CGFloat(1.5)

    static let BorderThick = CGFloat(2)

    static let BorderFocus = CGFloat(3)

    // MARK: - Shadows
    // Small Shadows
    static let BoxShadowS = Shadow(
        color: Color(red: 1, green: 0, blue: 0, opacity: 0.25),
        radius: 3,
        x: 0,
        y: 1
    )

    // Medium Shadows
    static let BoxShadowMD = Shadow(
        color: Color(red: 1, green: 0, blue: 0, opacity: 0.25),
        radius: 6,
        x: 0,
        y: 4
    )

    // Large Shadows
    static let BoxShadowLG = Shadow(
        color: Color(red: 1, green: 0, blue: 0, opacity: 0.25),
        radius: 15,
        x: 0,
        y: 10
    )

    // MARK: - Opacities
    static let ShadowOpacity = CGFloat(0.1)

    static let OverlayOpacity = CGFloat(0.6)

    static let DisabledOpacity = CGFloat(0.4)

    // MARK: - Z-Indices
    static let ZIndexDropdown = CGFloat(1000)

    static let ZIndexModal = CGFloat(1050)

    static let ZIndexTooltip = CGFloat(1100)

    // MARK: - Transitions
    static let TransitionFast = CGFloat(150)

    static let TransitionNormal = CGFloat(200)

    static let TransitionSlow = CGFloat(300)

    // MARK: - Utility Functions
    static func isDarkMode(colorScheme: ColorScheme) -> Bool {
        return colorScheme == .dark
    }

    static func getTextColor(colorScheme: ColorScheme) -> Color {
        return isDarkMode(colorScheme: colorScheme) ? .white : .black
    }
}

