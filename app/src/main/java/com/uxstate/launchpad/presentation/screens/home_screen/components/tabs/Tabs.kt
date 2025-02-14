package com.uxstate.launchpad.presentation.screens.home_screen.components.tabs

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.pager.*
import com.uxstate.launchpad.R
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Tabs(tabs: List<TabItem>, pagerState: PagerState) {

    val coroutineScope = rememberCoroutineScope()

    TabRow(
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.onSurface,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                color = MaterialTheme.colors.secondary,
                modifier = Modifier.pagerTabIndicatorOffset(
                    pagerState,
                    tabPositions
                )
            )
        }
    ) {

        tabs.forEachIndexed { i, tabItem ->
            // Tab
            LeadingIconTab(
                icon = {
                    Icon(
                        painter = painterResource(id = tabItem.icon),
                        contentDescription = stringResource(R.string.upcoming_label)
                    )
                },
                text = { Text(text = tabItem.title) },
                selected = pagerState.currentPage == i,
                onClick = { coroutineScope.launch { pagerState.animateScrollToPage(i) } }
            )
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Preview
@Composable
fun TabsPreviewLight() {

    /*    val tabs = listOf(TabItem.Previous(data = null ), TabItem.Upcoming)
        val pagerState = rememberPagerState()
        LaunchPadTheme() {
            Tabs(tabs = tabs, pagerState = pagerState)

    }*/
}

@OptIn(ExperimentalPagerApi::class)
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun TabsPreviewDark() {

    /*  val tabs = listOf(TabItem.Previous, TabItem.Upcoming)
      val pagerState = rememberPagerState()
      LaunchPadTheme() {
          Tabs(tabs = tabs, pagerState = pagerState)
      }*/
}
