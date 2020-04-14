package com.example.withstudy.main.chatting;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class ChattingViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ChattingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}