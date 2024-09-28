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
import com.varabyte.kobweb.silk.components.icons.fa.FaFile
import com.varabyte.kobweb.silk.components.icons.fa.FaHammer
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import io.github.shub39.portfolio.components.widgets.LinkButton
import io.github.shub39.portfolio.toSitePalette
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun Intro() {
    val sitePalette = ColorMode.current.toSitePalette()

    // Mobile View
    Box(
        modifier = Modifier
            .displayUntil(Breakpoint.MD)
            .padding(topBottom = 5.cssRem)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Img(
                src = "me.jpg",
                attrs = Modifier
                    .size(200.px)
                    .margin(bottom = 1.5.cssRem)
                    .borderRadius(10.cssRem)
                    .toAttrs()
            )

            SpanText(
                text = "Hello! I'm Shubham",
                modifier = Modifier
                    .fontWeight(FontWeight.Bold)
                    .fontSize(FontSize.XXLarge)
                    .color(sitePalette.brand.light0Hard)
                    .textAlign(TextAlign.Center)
            )

            SpanText(
                text = "Beginner Android developer and Linux nerd",
                modifier = Modifier
                    .fontSize(FontSize.Large)
                    .color(sitePalette.brand.light0Soft)
                    .textAlign(TextAlign.Center)
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(0.5.cssRem),
                modifier = Modifier
                    .margin(top = 1.cssRem)
                    .fontFamily("Poppins")
            ) {
                LinkButton(
                    path = "/apps",
                    modifier = Modifier.fontFamily("Poppins")
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(0.5.cssRem)
                    ) {
                        FaAndroid()

                        Text("Apps")
                    }
                }

                LinkButton(
                    path = "/projects",
                    modifier = Modifier.fontFamily("Poppins")
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(0.5.cssRem)
                    ) {
                        FaHammer()

                        Text("Projects")
                    }
                }

                LinkButton(
                    path = "https://github.com/shub39/portfolio/blob/main/site/src/jsMain/resources/public/Resume.pdf",
                    primary = true,
                    modifier = Modifier.fontFamily("Poppins"),
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(0.5.cssRem)
                    ) {
                        FaFile()

                        Text("Resume")
                    }
                }
            }

        }
    }

    // Desktop View
    Column(
        modifier = Modifier
            .displayIfAtLeast(Breakpoint.MD)
            .fillMaxWidth()
            .padding(topBottom = 3.cssRem),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .borderRadius(0.cssRem),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Img(
                src = "me.jpg",
                attrs = Modifier
                    .size(200.px)
                    .margin(bottom = 1.5.cssRem)
                    .borderRadius(10.cssRem)
                    .toAttrs()
            )

            SpanText(
                text = "Hello! I'm Shubham",
                modifier = Modifier
                    .fontWeight(FontWeight.Bold)
                    .fontSize(FontSize.XXLarge)
                    .color(sitePalette.brand.light0Hard)
                    .textAlign(TextAlign.Center)
            )

            SpanText(
                text = "Beginner Android developer and Linux nerd",
                modifier = Modifier
                    .fontSize(FontSize.Large)
                    .color(sitePalette.brand.light0Soft)
                    .textAlign(TextAlign.Center)
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(0.5.cssRem),
                modifier = Modifier
                    .margin(top = 1.cssRem)
                    .fontFamily("Poppins")
            ) {
                LinkButton(
                    path = "/apps",
                    modifier = Modifier.fontFamily("Poppins")
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(0.5.cssRem)
                    ) {
                        FaAndroid()

                        Text("Apps")
                    }
                }

                LinkButton(
                    path = "/projects",
                    modifier = Modifier.fontFamily("Poppins")
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(0.5.cssRem)
                    ) {
                        FaHammer()

                        Text("Projects")
                    }
                }

                LinkButton(
                    path = "https://github.com/shub39/portfolio/blob/main/site/src/jsMain/resources/public/Resume.pdf",
                    primary = true,
                    modifier = Modifier.fontFamily("Poppins"),
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(0.5.cssRem)
                    ) {
                        FaFile()

                        Text("Resume")
                    }
                }
            }
        }
    }
}