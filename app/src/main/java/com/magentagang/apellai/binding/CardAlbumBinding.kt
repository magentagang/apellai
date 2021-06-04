package com.magentagang.apellai.binding

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.magentagang.apellai.model.Album
import com.magentagang.apellai.model.Track

@BindingAdapter("albumName")
fun TextView.setAlbumName(item: Album?) {
    item?.let {
        text = item.name
    }
}

@BindingAdapter("albumArtist")
fun TextView.setAlbumArtist(item: Album?) {
    item?.let {
        text = item.artist
    }
}

@BindingAdapter("albumYear")
fun TextView.setAlbumYear(item: Album?) {
    item?.let {
        text = item.year.toString()
    }
}

@BindingAdapter("trackName")
fun TextView.setTrackName(item: Track?) {
    item?.let {
        text = item.name
    }
}

@BindingAdapter("trackNumber")
fun TextView.setTrackNumber(item: Track?) {
    item?.let {
        text = item.number.toString().padStart(2, '0')
    }
}
@BindingAdapter("trackDuration")
fun TextView.setTrackDuration(item: Track?) {

    item?.let {
        val str = (item.duration / 60).toString() + ":" + (item.duration % 60).toString().padStart(2, '0')
        text = str
    }
}