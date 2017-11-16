package iliasavin.uitestplayground.presentation.screens.posts

import android.app.Activity
import iliasavin.uitestplayground.data.entities.Post
import iliasavin.uitestplayground.presentation.base.BaseLCEView

/**
 * Created by ilyasavin on 11/15/17.
 */
interface PostPresenter {
  fun getPosts()
  fun attachView(view: BaseLCEView)
  fun detachView()
  fun onItemClicked(screen: Activity, post: Post)
}
