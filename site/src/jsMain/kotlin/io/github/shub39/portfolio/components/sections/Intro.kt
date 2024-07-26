package io.github.shub39.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaAndroid
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import io.github.shub39.portfolio.toSitePalette
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Img

val desktopCssStyle = CssStyle {
    base {
        Modifier
            .height(500.px)
            .width(250.px)
            .margin(topBottom = 8.cssRem)
    }
    hover {
        Modifier
            .height(550.px)
            .width(275.px)
            .margin(topBottom = 4.cssRem)
    }
}

@Composable
fun Intro() {
    val sitePalette = ColorMode.current.toSitePalette()

    // Mobile View
    Box(
        modifier = Modifier
            .displayUntil(Breakpoint.XL)
            .padding(topBottom = 5.cssRem)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 3.cssRem),
                horizontalArrangement = Arrangement.Center
            ) {
                Img(
                    src = "GritAnalytics.png",
                    attrs = Modifier
                        .height(300.px)
                        .width(150.px)
                        .margin(right = (-20).px)
                        .toAttrs()
                )

                Img(
                    src = "RushCard.png",
                    attrs = Modifier
                        .height(300.px)
                        .width(150.px)
                        .margin(right = (-20).px)
                        .toAttrs()
                )

                Img(
                    src = "RushLyrics.png",
                    attrs = Modifier
                        .height(300.px)
                        .width(150.px)
                        .toAttrs()
                )
            }

            Row(
                Modifier
                    .gap(1.5.cssRem)
                    .color(sitePalette.brand.brightGreen),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FaAndroid(size = IconSize.X10)
            }

            SpanText(
                text = "Hello! I'm Shubham",
                modifier = Modifier
                    .fontWeight(FontWeight.Bold)
                    .fontSize(FontSize.XXLarge)
                    .color(sitePalette.brand.light0Hard)
                    .textAlign(TextAlign.Center)
            )

            SpanText(
                text = "beginner Android developer and Linux nerd",
                modifier = Modifier
                    .fontSize(FontSize.Large)
                    .color(sitePalette.brand.light0Soft)
                    .textAlign(TextAlign.Center)
            )
        }
    }

    // Desktop View
    Box(
        modifier = Modifier
            .displayIfAtLeast(Breakpoint.XL)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.CenterStart),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                Modifier
                    .gap(1.5.cssRem)
                    .color(sitePalette.brand.brightGreen),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FaAndroid(size = IconSize.X10)
            }

            SpanText(
                text = "Hello! I'm Shubham",
                modifier = Modifier
                    .fontWeight(FontWeight.Bold)
                    .fontSize(FontSize.XXLarge)
                    .color(sitePalette.brand.light0Hard)
                    .textAlign(TextAlign.Center)
            )

            SpanText(
                text = "beginner Android developer and Linux nerd",
                modifier = Modifier
                    .fontSize(FontSize.Large)
                    .color(sitePalette.brand.light0Soft)
                    .textAlign(TextAlign.Center)
            )
        }

        Row(
            modifier = Modifier
                .align(Alignment.CenterEnd)
        ) {
            Img(
                src = "GritAnalytics.png",
                attrs = desktopCssStyle.toModifier()
                    .toAttrs()
            )

            Img(
                src = "RushCard.png",
                attrs = desktopCssStyle.toModifier()
                    .toAttrs()
            )

            Img(
                src = "RushLyrics.png",
                attrs = desktopCssStyle.toModifier()
                    .toAttrs()
            )
        }
    }

}