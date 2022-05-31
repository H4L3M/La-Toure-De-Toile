package com.latouredetoile.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = Transformations.map(_index) {
        "\n" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum cursus leo magna, at egestas massa facilisis sit amet. Quisque arcu nunc, tempus quis sollicitudin vel, pellentesque vel ligula. Duis pharetra, eros quis posuere semper, sapien diam lobortis turpis, at convallis velit nisi quis metus. Fusce ornare, nisi vitae dapibus fermentum, ligula ligula hendrerit tellus, id sagittis tellus purus ut ipsum. Ut condimentum metus quis eros sagittis, vitae ullamcorper neque ullamcorper. Integer volutpat libero id enim vulputate dapibus. Quisque elementum neque lobortis leo dignissim rhoncus. Maecenas vestibulum orci in fermentum vulputate. Nunc volutpat interdum est, sit amet faucibus elit sodales sed. Nunc nec urna nisl. Morbi ut odio magna. Interdum et malesuada fames ac ante ipsum primis in faucibus. Aliquam interdum massa eget justo porttitor, eget consectetur enim ultrices. Suspendisse semper nulla sit amet urna tincidunt hendrerit.\n" +
                "\n" +
                "Donec sagittis in dolor in euismod. Curabitur in pellentesque erat. In feugiat arcu eu eros efficitur pretium. Duis eu metus viverra, porta magna et, laoreet diam. Quisque euismod et velit porttitor tincidunt. Phasellus efficitur eget neque et vehicula. Vivamus sed neque eleifend, volutpat justo sit amet, tempor diam.\n" +
                "\n" +
                "Quisque rhoncus egestas ipsum, a placerat lorem faucibus ut. Etiam mattis aliquam felis, vel faucibus libero ultrices id. Curabitur quis ante dolor. Sed euismod luctus arcu, sed semper turpis lacinia id. Nullam ultricies orci ac lacus imperdiet fringilla. Duis a auctor tortor, vitae vehicula metus. Phasellus eleifend facilisis lorem, id vestibulum eros condimentum non.\n" +
                "\n" +
                "Nam eu nibh vitae massa hendrerit mollis vitae tincidunt nisl. Donec convallis nisl sed augue tincidunt dictum. Nunc pharetra eros a lectus pharetra auctor. Cras sit amet nisl vitae sem rutrum feugiat id in tortor. Ut eu urna a lacus eleifend elementum. In auctor sagittis nulla quis pellentesque. Aliquam hendrerit turpis eget orci suscipit pharetra. Vestibulum nisi felis, euismod dapibus dictum at, tempus eget mauris. Vivamus dignissim id tortor vel egestas. Mauris venenatis varius nisi, quis imperdiet nunc imperdiet at. Morbi ullamcorper lorem lorem, mollis porttitor dolor condimentum vel. Sed quis risus non nisl scelerisque egestas. Morbi sit amet posuere nunc. Suspendisse dapibus a orci quis auctor.\n" +
                "\n" +
                "In justo est, gravida aliquet tincidunt id, finibus nec ligula. Nunc ac rutrum ex, ac fringilla risus. In hendrerit auctor ipsum, sed vestibulum quam efficitur in. In a ullamcorper purus. Proin finibus risus velit, sed aliquam mi hendrerit a. Integer fermentum tellus at massa mollis, condimentum sagittis nulla consequat. Duis varius urna ut risus facilisis, eu efficitur est lobortis. Proin mauris neque, tempor in turpis id, imperdiet cursus elit.\n" +
                "\n" +
                "Mauris lacinia quis leo quis gravida. Duis sodales augue et viverra tristique. Cras nec nibh nisi. Donec a justo nec augue tempus varius ut ac felis. Etiam aliquam aliquet pharetra. Proin at magna egestas massa scelerisque viverra. Nullam tristique semper libero. Phasellus eu dapibus libero, eget aliquam leo. In hac habitasse platea dictumst. Nullam dapibus sit amet nunc in scelerisque. Nam congue interdum odio, in viverra enim fermentum et. Quisque malesuada tincidunt eros, in ullamcorper nisi lobortis nec.\n" +
                "\n" +
                "Etiam in odio mattis, vestibulum lorem a, viverra est. Donec malesuada sed odio id euismod. Duis gravida porttitor tellus. Maecenas imperdiet neque non ex blandit, non laoreet mi condimentum. Nulla auctor suscipit lacus, nec gravida arcu bibendum nec. Nulla lacinia pulvinar sapien non dignissim. Integer gravida metus eu luctus suscipit. Donec aliquam quam sit amet sem suscipit, vel elementum libero venenatis. Duis tempor aliquet maximus. Maecenas consectetur nunc ac eros mattis lobortis.\n" +
                "\n" +
                "Quisque arcu elit, rutrum interdum nunc luctus, malesuada pharetra massa. Sed gravida leo et lectus viverra, vel tincidunt neque sodales. Proin nec orci finibus, dapibus turpis non, scelerisque enim. Nullam a congue magna. Morbi volutpat gravida erat, nec pretium tellus interdum eu. Maecenas tincidunt faucibus odio nec tincidunt. Vivamus eu neque lectus. Aliquam maximus neque sit amet condimentum consequat. Nullam bibendum gravida finibus. Nulla maximus scelerisque ligula vitae scelerisque. Nulla sagittis iaculis turpis nec facilisis. Praesent tempor viverra nisi. Aliquam erat volutpat. Ut pretium pretium ornare.\n" +
                "\n" +
                "Suspendisse scelerisque placerat diam, et mollis ipsum. Nullam at tellus massa. Nulla vel rutrum erat. Morbi posuere lectus id turpis commodo rhoncus. Proin placerat sapien ex, nec tincidunt dui efficitur vel. Suspendisse condimentum nulla quis massa scelerisque, vitae sodales eros rutrum. Nam ac dictum sapien, ut condimentum lectus. Cras porta ante in nunc consequat tempor.\n" +
                "\n" +
                "Sed vel ex ex. Cras vel fermentum arcu, nec finibus diam. Pellentesque aliquet condimentum ex at posuere. In sagittis nibh ut sodales gravida. Phasellus finibus neque sed tempus auctor. Proin sed purus hendrerit, feugiat sem vel, consectetur eros. Integer pharetra tincidunt nisl, vel mattis nisi consequat vitae. Aliquam ac nulla eget mauris consequat sagittis. Donec sed leo malesuada, dictum mi a, vehicula risus."
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}