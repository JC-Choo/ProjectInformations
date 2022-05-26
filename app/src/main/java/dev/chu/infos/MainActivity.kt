package dev.chu.infos

import android.os.Bundle
import android.util.Log
import dev.chu.infos.base.BaseActivity
import dev.chu.infos.databinding.ActivityMainBinding
import dev.chu.infos.model.getItems

class MainActivity : BaseActivity<ActivityMainBinding>(
    R.layout.activity_main
) {

    private val mainAdapter = MainAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(binding.list) {
            adapter = mainAdapter
            mainAdapter.items = getItems()
        }
        Log.i("Main", "test")
    }
}