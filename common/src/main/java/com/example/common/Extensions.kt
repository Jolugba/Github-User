package com.example.common

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

fun ImageView.loadImage(imageUrl: String) {
    Glide.with(this)
        .load(imageUrl)
        .error(R.drawable.ic_launcher_background)
        .into(this)
}

fun <T> Single<T>.networkThreadWithMainThread(): Single<T> {
    return this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
}

inline fun <T> LifecycleOwner.ob(liveData: LiveData<T>, crossinline action: (t: T) -> Unit) {
    liveData.observe(this, Observer { it?.let { t -> action(t) } })
}

fun Fragment.showShortSnackbar(message: String) {
    val snackbar = Snackbar.make(requireView(), message, Snackbar.LENGTH_SHORT)
    val snackbarView: View = snackbar.view
    val snackTextView: TextView =
        snackbarView.findViewById(com.google.android.material.R.id.snackbar_text)
    snackTextView.maxLines = 3
    snackbar.show()
}

fun View.hide(onlyInvisible: Boolean = false) {
    this.visibility = if (onlyInvisible) View.INVISIBLE else View.GONE
}

fun View.show() {
    this.visibility = View.VISIBLE
}

fun getNameInitialsForSingle(name: String): String {
    return "${name.first()} ${name.last()}"
}

fun togglePictureVisibility(
    imageIsVisible: Boolean,
    placeHolder: TextView,
    picture: ImageView
) {
    if (imageIsVisible) {
        placeHolder.hide()
        picture.show()
    } else {
        placeHolder.show()
        picture.hide()
    }
}
