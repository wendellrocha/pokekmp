package br.dev.wendellrocha.pokekmp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import br.dev.wendellrocha.pokekmp.model.PokemonList
import br.dev.wendellrocha.pokekmp.state.AbstractState
import br.dev.wendellrocha.pokekmp.state.ErrorState
import br.dev.wendellrocha.pokekmp.state.InitialState
import br.dev.wendellrocha.pokekmp.state.LoadedState
import br.dev.wendellrocha.pokekmp.state.LoadingState
import coil3.ImageLoader
import coil3.compose.AsyncImage
import coil3.compose.LocalPlatformContext
import coil3.request.ImageRequest
import coil3.request.crossfade
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val controller = AppController()
        val state: AbstractState by controller.state.collectAsState()
        val imageUrl: String =
            "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/{index}.png"
        val context = LocalPlatformContext.current

        LaunchedEffect(Unit) {
            if (state is InitialState) {
                controller.fetchPokemons()
            }
        }


        Scaffold {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                when (state) {
                    is InitialState -> {
                        CircularProgressIndicator()
                    }

                    is LoadingState -> {
                        CircularProgressIndicator()
                    }

                    is ErrorState -> {
                        Text(text = (state as ErrorState).getMessage())
                    }

                    is LoadedState<*> -> {
                        LazyVerticalGrid(
                            modifier = Modifier.fillMaxSize().padding(8.dp),
                            columns = GridCells.Adaptive(minSize = 128.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            items((((state as LoadedState<*>).getContent()) as List<*>).size) { index ->
                                val lenght =
                                    (((state as LoadedState<*>).getContent()) as List<*>).size
                                val current =
                                    (((state as LoadedState<*>).getContent()) as List<PokemonList>)
                                val pokemon = current[index]
                                val url = if (index + 1 > lenght) imageUrl.replace(
                                    "{index}", index.toString()
                                )
                                else imageUrl.replace("{index}", (index + 1).toString())
                                Card {
                                    Column(
                                        modifier = Modifier.fillMaxSize(),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        AsyncImage(
                                            model = ImageRequest.Builder(context)
                                                .data(url)
                                                .build(),
                                            onError = { error ->
                                                println("error ${error}")
                                            },
                                            contentDescription = null,
                                            modifier = Modifier.size(150.dp),
                                            imageLoader = ImageLoader.Builder(context)
                                                .crossfade(true).build(),
                                            contentScale = ContentScale.FillHeight,
                                        )
                                        Text(text = pokemon.name)

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}



